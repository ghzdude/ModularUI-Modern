package brachy.modularui.widget.components;

import net.minecraft.resources.ResourceLocation;

import java.util.Objects;

@SuppressWarnings("unused")
public class ComponentType<T> {

    ResourceLocation location;

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
        return new ComponentType<>(new ResourceLocation(namespace, path));
    }
}
