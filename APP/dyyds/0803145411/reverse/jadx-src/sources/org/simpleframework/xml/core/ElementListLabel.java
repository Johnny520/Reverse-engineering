package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.Style;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class ElementListLabel extends TemplateLabel {
    private Expression cache;
    private boolean data;
    private Decorator decorator;
    private Introspector detail;
    private String entry;
    private Format format;
    private boolean inline;
    private Class item;
    private ElementList label;
    private String name;
    private String override;
    private String path;
    private boolean required;
    private Class type;

    public ElementListLabel(Contact contact, ElementList elementList, Format format) {
        this.detail = new Introspector(contact, this, format);
        this.decorator = new Qualifier(contact);
        this.required = elementList.required();
        this.type = contact.getType();
        this.override = elementList.name();
        this.inline = elementList.inline();
        this.entry = elementList.entry();
        this.data = elementList.data();
        this.item = elementList.type();
        this.format = format;
        this.label = elementList;
    }

    private Converter getConverter(Context context, String str) throws ElementException {
        Type dependent = getDependent();
        Contact contact = getContact();
        return !context.isPrimitive(dependent) ? new CompositeList(context, contact, dependent, str) : new PrimitiveList(context, contact, dependent, str);
    }

    private Converter getInlineConverter(Context context, String str) throws ElementException {
        Type dependent = getDependent();
        Contact contact = getContact();
        return !context.isPrimitive(dependent) ? new CompositeInlineList(context, contact, dependent, str) : new PrimitiveInlineList(context, contact, dependent, str);
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
    public Decorator getDecorator() {
        return this.decorator;
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public Type getDependent() throws ElementException {
        Contact contact = getContact();
        Class dependent = this.item;
        if (dependent == Void.TYPE) {
            dependent = contact.getDependent();
            this.item = dependent;
        }
        if (dependent != null) {
            return new ClassType(dependent);
        }
        throw new ElementException("Unable to determine generic type for %s", contact);
    }

    @Override // org.simpleframework.xml.core.Label
    public Object getEmpty(Context context) {
        CollectionFactory collectionFactory = new CollectionFactory(context, new ClassType(this.type));
        if (this.label.empty()) {
            return null;
        }
        return collectionFactory.getInstance();
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public String getEntry() {
        Style style = this.format.getStyle();
        if (this.detail.isEmpty(this.entry)) {
            this.entry = this.detail.getEntry();
        }
        return style.getElement(this.entry);
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
        String element = this.format.getStyle().getElement(this.detail.getName());
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

    @Override // org.simpleframework.xml.core.Label
    public Converter getConverter(Context context) {
        String entry = getEntry();
        if (!this.label.inline()) {
            return getConverter(context, entry);
        }
        return getInlineConverter(context, entry);
    }
}
