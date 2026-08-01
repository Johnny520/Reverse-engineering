package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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

    public CacheLabel(org.simpleframework.xml.core.Label r2) {
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
            r0 = this;
            java.lang.annotation.Annotation r0 = r0.annotation
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Contact getContact() {
            r0 = this;
            org.simpleframework.xml.core.Contact r0 = r0.contact
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r1) {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            org.simpleframework.xml.core.Converter r0 = r0.getConverter(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Decorator getDecorator() {
            r0 = this;
            org.simpleframework.xml.core.Decorator r0 = r0.decorator
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getDependent() {
            r0 = this;
            org.simpleframework.xml.strategy.Type r0 = r0.depend
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Object getEmpty(org.simpleframework.xml.core.Context r1) {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.Object r0 = r0.getEmpty(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getEntry() {
            r0 = this;
            java.lang.String r0 = r0.entry
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Expression getExpression() {
            r0 = this;
            org.simpleframework.xml.core.Expression r0 = r0.expression
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Object getKey() {
            r0 = this;
            java.lang.Object r0 = r0.key
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Label getLabel(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            org.simpleframework.xml.core.Label r0 = r0.getLabel(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String[] getNames() {
            r0 = this;
            java.lang.String[] r0 = r0.names
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getOverride() {
            r0 = this;
            java.lang.String r0 = r0.override
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getPath() {
            r0 = this;
            java.lang.String r0 = r0.path
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String[] getPaths() {
            r0 = this;
            java.lang.String[] r0 = r0.paths
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Class getType() {
            r0 = this;
            java.lang.Class r0 = r0.type
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getType(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            org.simpleframework.xml.strategy.Type r0 = r0.getType(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isAttribute() {
            r0 = this;
            boolean r0 = r0.attribute
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isCollection() {
            r0 = this;
            boolean r0 = r0.collection
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
            r0 = this;
            boolean r0 = r0.data
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isInline() {
            r0 = this;
            boolean r0 = r0.inline
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isRequired() {
            r0 = this;
            boolean r0 = r0.required
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isText() {
            r0 = this;
            boolean r0 = r0.text
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isTextList() {
            r0 = this;
            boolean r0 = r0.list
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isUnion() {
            r0 = this;
            boolean r0 = r0.union
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String toString() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.String r0 = r0.toString()
            return r0
    }
}
