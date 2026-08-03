package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class CacheLabel implements org.simpleframework.xml.core.Label {
    private final java.lang.annotation.Annotation annotation;
    private final boolean attribute;
    private final boolean collection;
    private final org.simpleframework.xml.core.Contact contact;
    private final boolean data;
    private final org.simpleframework.xml.core.Decorator decorator;
    private final org.simpleframework.xml.strategy.Type depend;
    private final java.lang.String entry;
    private final org.simpleframework.xml.core.Expression expression;
    private final boolean inline;
    private final java.lang.Object key;
    private final org.simpleframework.xml.core.Label label;
    private final boolean list;
    private final java.lang.String name;
    private final java.lang.String[] names;
    private final java.lang.String override;
    private final java.lang.String path;
    private final java.lang.String[] paths;
    private final boolean required;
    private final boolean text;
    private final java.lang.Class type;
    private final boolean union;

    public CacheLabel(org.simpleframework.xml.core.Label r2) throws java.lang.Exception {
            r1 = this;
            r1.<init>()
            java.lang.annotation.Annotation r0 = r2.getAnnotation()
            r1.annotation = r0
            org.simpleframework.xml.core.Expression r0 = r2.getExpression()
            r1.expression = r0
            org.simpleframework.xml.core.Decorator r0 = r2.getDecorator()
            r1.decorator = r0
            boolean r0 = r2.isAttribute()
            r1.attribute = r0
            boolean r0 = r2.isCollection()
            r1.collection = r0
            org.simpleframework.xml.core.Contact r0 = r2.getContact()
            r1.contact = r0
            org.simpleframework.xml.strategy.Type r0 = r2.getDependent()
            r1.depend = r0
            boolean r0 = r2.isRequired()
            r1.required = r0
            java.lang.String r0 = r2.getOverride()
            r1.override = r0
            boolean r0 = r2.isTextList()
            r1.list = r0
            boolean r0 = r2.isInline()
            r1.inline = r0
            boolean r0 = r2.isUnion()
            r1.union = r0
            java.lang.String[] r0 = r2.getNames()
            r1.names = r0
            java.lang.String[] r0 = r2.getPaths()
            r1.paths = r0
            java.lang.String r0 = r2.getPath()
            r1.path = r0
            java.lang.Class r0 = r2.getType()
            r1.type = r0
            java.lang.String r0 = r2.getName()
            r1.name = r0
            java.lang.String r0 = r2.getEntry()
            r1.entry = r0
            boolean r0 = r2.isData()
            r1.data = r0
            boolean r0 = r2.isText()
            r1.text = r0
            java.lang.Object r0 = r2.getKey()
            r1.key = r0
            r1.label = r2
            return
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.annotation.Annotation getAnnotation() {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.annotation
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Contact getContact() {
            r1 = this;
            org.simpleframework.xml.core.Contact r0 = r1.contact
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            org.simpleframework.xml.core.Converter r2 = r0.getConverter(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Decorator getDecorator() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Decorator r0 = r1.decorator
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getDependent() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.strategy.Type r0 = r1.depend
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Object getEmpty(org.simpleframework.xml.core.Context r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            java.lang.Object r2 = r0.getEmpty(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getEntry() throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = r1.entry
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Expression getExpression() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Expression r0 = r1.expression
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Object getKey() throws java.lang.Exception {
            r1 = this;
            java.lang.Object r0 = r1.key
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Label getLabel(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            org.simpleframework.xml.core.Label r2 = r0.getLabel(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getName() throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String[] getNames() throws java.lang.Exception {
            r1 = this;
            java.lang.String[] r0 = r1.names
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getOverride() {
            r1 = this;
            java.lang.String r0 = r1.override
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getPath() throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String[] getPaths() throws java.lang.Exception {
            r1 = this;
            java.lang.String[] r0 = r1.paths
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Class getType() {
            r1 = this;
            java.lang.Class r0 = r1.type
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getType(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            org.simpleframework.xml.strategy.Type r2 = r0.getType(r2)
            return r2
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isAttribute() {
            r1 = this;
            boolean r0 = r1.attribute
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isCollection() {
            r1 = this;
            boolean r0 = r1.collection
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
            r1 = this;
            boolean r0 = r1.data
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isInline() {
            r1 = this;
            boolean r0 = r1.inline
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isRequired() {
            r1 = this;
            boolean r0 = r1.required
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isText() {
            r1 = this;
            boolean r0 = r1.text
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isTextList() {
            r1 = this;
            boolean r0 = r1.list
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isUnion() {
            r1 = this;
            boolean r0 = r1.union
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String toString() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            java.lang.String r0 = r0.toString()
            return r0
    }
}
