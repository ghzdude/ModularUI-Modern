package brachy.modularui.widget.components;

import brachy.modularui.screen.RichTooltip;

public class TooltipComponent extends AbstractComponent {

    static final ComponentType<TooltipComponent> TYPE = new ComponentType<>();

    RichTooltip tooltip;

    @Override
    public ComponentType<?> getComponentType() {
        return TYPE;
    }
}
