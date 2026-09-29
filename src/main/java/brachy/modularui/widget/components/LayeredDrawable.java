package brachy.modularui.widget.components;

import brachy.modularui.api.drawable.IDrawable;
import brachy.modularui.drawable.DrawableStack;
import brachy.modularui.screen.viewport.GuiContext;
import brachy.modularui.theme.WidgetTheme;

public record LayeredDrawable(DrawableStack stack) implements WidgetComponent, IDrawable {

    @Override
    public void draw(GuiContext context, int x, int y, int width, int height, WidgetTheme widgetTheme) {
        this.stack.draw(context, x, y, width, height, widgetTheme);
    }
}
