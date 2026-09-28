package brachy.modularui.widget.components;

import brachy.modularui.api.drawable.IDrawable;

public class LayeredDrawable extends AbstractComponent {

    public static final ComponentType<LayeredDrawable> TYPE = new ComponentType<>();
    IDrawable[] drawables;

    @Override
    public ComponentType<?> getComponentType() {
        return TYPE;
    }
}
