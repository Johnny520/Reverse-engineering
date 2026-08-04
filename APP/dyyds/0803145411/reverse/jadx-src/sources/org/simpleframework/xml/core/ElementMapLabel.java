package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.Style;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class ElementMapLabel extends TemplateLabel {
    private Expression cache;
    private boolean data;
    private Decorator decorator;
    private Introspector detail;
    private Entry entry;
    private Format format;
    private boolean inline;
    private Class[] items;
    private ElementMap label;
    private String name;
    private String override;
    private String parent;
    private String path;
    private boolean required;
    private Class type;

    public ElementMapLabel(Contact contact, ElementMap elementMap, Format format) {
        this.detail = new Introspector(contact, this, format);
        this.decorator = new Qualifier(contact);
        this.entry = new Entry(contact, elementMap);
        this.required = elementMap.required();
        this.type = contact.getType();
        this.inline = elementMap.inline();
        this.override = elementMap.name();
        this.data = elementMap.data();
        this.format = format;
        this.label = elementMap;
    }

    private Type getMap() {
        return new ClassType(this.type);
    }

    @Override // org.simpleframework.xml.core.Label
    public Annotation getAnnotation() {
        return this.label;
    }

    @Override // org.simpleframework.xml.core.Label
    public Contact getContact() {
        return this.detail.getContact();
    }

    @Override // org.simpleframework.xml.core.Label
    public Converter getConverter(Context context) {
        Type map = getMap();
        boolean zInline = this.label.inline();
        Entry entry = this.entry;
        return !zInline ? new CompositeMap(context, entry, map) : new CompositeInlineMap(context, entry, map);
    }

    @Override // org.simpleframework.xml.core.Label
    public Decorator getDecorator() {
        return this.decorator;
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public Type getDependent() throws ElementException {
        Contact contact = getContact();
        Class[] dependents = this.items;
        if (dependents == null) {
            dependents = contact.getDependents();
            this.items = dependents;
        }
        if (dependents != null) {
            return dependents.length == 0 ? new ClassType(Object.class) : new ClassType(dependents[0]);
        }
        throw new ElementException("Unable to determine type for %s", contact);
    }

    @Override // org.simpleframework.xml.core.Label
    public Object getEmpty(Context context) {
        MapFactory mapFactory = new MapFactory(context, new ClassType(this.type));
        if (this.label.empty()) {
            return null;
        }
        return mapFactory.getInstance();
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public String getEntry() {
        Style style = this.format.getStyle();
        if (this.detail.isEmpty(this.parent)) {
            this.parent = this.detail.getEntry();
        }
        return style.getElement(this.parent);
    }

    @Override // org.simpleframework.xml.core.Label
    public Expression getExpression() {
        Expression expression = this.cache;
        if (expression != null) {
            return expression;
        }
        Expression expression2 = this.detail.getExpression();
        this.cache = expression2;
        return expression2;
    }

    @Override // org.simpleframework.xml.core.Label
    public String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        Style style = this.format.getStyle();
        String entry = this.entry.getEntry();
        if (!this.label.inline()) {
            entry = this.detail.getName();
        }
        String element = style.getElement(entry);
        this.name = element;
        return element;
    }

    @Override // org.simpleframework.xml.core.Label
    public String getOverride() {
        return this.override;
    }

    @Override // org.simpleframework.xml.core.Label
    public String getPath() {
        String str = this.path;
        if (str != null) {
            return str;
        }
        String element = getExpression().getElement(getName());
        this.path = element;
        return element;
    }

    @Override // org.simpleframework.xml.core.Label
    public Class getType() {
        return this.type;
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isCollection() {
        return true;
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
        return this.data;
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isInline() {
        return this.inline;
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isRequired() {
        return this.required;
    }

    @Override // org.simpleframework.xml.core.Label
    public String toString() {
        return this.detail.toString();
    }
}
