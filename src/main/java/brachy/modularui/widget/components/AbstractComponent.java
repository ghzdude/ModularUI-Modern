package brachy.modularui.widget.components;

import brachy.modularui.widget.AbstractWidget;

import java.util.Optional;
import java.util.function.Function;

public abstract class AbstractComponent {

    private AbstractWidget holder;

    public abstract ComponentType<?> getComponentType();

    public <T> Optional<T> getWidgetHolder(Function<AbstractWidget, T> castFunction) {
        T holder;
        try {
            holder = castFunction.apply(getWidgetHolder());
        } catch (ClassCastException e) {
            return Optional.empty();
        }
        return Optional.of(holder);
    }

    public AbstractWidget getWidgetHolder() {
        return this.holder;
    }

    public void setWidgetHolder(AbstractWidget widgetHolder) {
        this.holder = widgetHolder;
    }

    public void onWidgetSet(AbstractWidget widget) {}
}
