package brachy.modularui.widget.components;

import brachy.modularui.ModularUI;

import net.minecraft.resources.ResourceLocation;

import org.jetbrains.annotations.ApiStatus;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@SuppressWarnings("unused")
public class ComponentType<T> {

    private static final Set<ResourceLocation> generated = new HashSet<>();

    private final ResourceLocation location;

    private ComponentType(ResourceLocation location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ComponentType<?> other)) return false;
        return Objects.equals(this.location, other.location);
    }

    @Override
    public int hashCode() {
        return location.hashCode();
    }

    public static <T> ComponentType<T> named(String namespace, String path) {
        ResourceLocation loc = new ResourceLocation(namespace, path);
        if (generated.add(loc)) {
            return new ComponentType<>(loc);
        }
        throw new IllegalStateException("Component type \"" + loc + "\" has already been generated");
    }

    @ApiStatus.Internal
    public static <T> ComponentType<T> named(String path) {
        return named(ModularUI.MOD_ID, path);
    }
}
