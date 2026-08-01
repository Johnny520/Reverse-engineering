package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Variable implements org.simpleframework.xml.core.Label {
    private final org.simpleframework.xml.core.Label label;
    private final java.lang.Object value;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class Adapter implements org.simpleframework.xml.core.Repeater {
        private final org.simpleframework.xml.core.Label label;
        private final org.simpleframework.xml.core.Converter reader;
        private final java.lang.Object value;

        public Adapter(org.simpleframework.xml.core.Converter r1, org.simpleframework.xml.core.Label r2, java.lang.Object r3) {
                r0 = this;
                r0.<init>()
                r0.reader = r1
                r0.value = r3
                r0.label = r2
                return
        }

        @Override // org.simpleframework.xml.core.Converter
        public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2) {
                r1 = this;
                java.lang.Object r0 = r1.value
                java.lang.Object r1 = r1.read(r2, r0)
                return r1
        }

        @Override // org.simpleframework.xml.core.Repeater, org.simpleframework.xml.core.Converter
        public java.lang.Object read(org.simpleframework.xml.stream.InputNode r5, java.lang.Object r6) {
                r4 = this;
                org.simpleframework.xml.stream.Position r0 = r5.getPosition()
                java.lang.String r1 = r5.getName()
                org.simpleframework.xml.core.Converter r2 = r4.reader
                boolean r3 = r2 instanceof org.simpleframework.xml.core.Repeater
                if (r3 == 0) goto L15
                org.simpleframework.xml.core.Repeater r2 = (org.simpleframework.xml.core.Repeater) r2
                java.lang.Object r4 = r2.read(r5, r6)
                return r4
            L15:
                org.simpleframework.xml.core.PersistenceException r5 = new org.simpleframework.xml.core.PersistenceException
                org.simpleframework.xml.core.Label r4 = r4.label
                java.lang.Object[] r4 = new java.lang.Object[]{r1, r4, r0}
                java.lang.String r6 = "Element '%s' is already used with %s at %s"
                r5.<init>(r6, r4)
                throw r5
        }

        @Override // org.simpleframework.xml.core.Converter
        public boolean validate(org.simpleframework.xml.stream.InputNode r4) {
                r3 = this;
                org.simpleframework.xml.stream.Position r0 = r4.getPosition()
                java.lang.String r1 = r4.getName()
                org.simpleframework.xml.core.Converter r3 = r3.reader
                boolean r2 = r3 instanceof org.simpleframework.xml.core.Repeater
                if (r2 == 0) goto L15
                org.simpleframework.xml.core.Repeater r3 = (org.simpleframework.xml.core.Repeater) r3
                boolean r3 = r3.validate(r4)
                return r3
            L15:
                org.simpleframework.xml.core.PersistenceException r3 = new org.simpleframework.xml.core.PersistenceException
                java.lang.String r4 = "Element '%s' declared twice at %s"
                java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
                r3.<init>(r4, r0)
                throw r3
        }

        @Override // org.simpleframework.xml.core.Converter
        public void write(org.simpleframework.xml.stream.OutputNode r1, java.lang.Object r2) {
                r0 = this;
                r0.write(r1, r2)
                return
        }
    }

    public Variable(org.simpleframework.xml.core.Label r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.label = r1
            r0.value = r2
            return
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.annotation.Annotation getAnnotation() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.annotation.Annotation r0 = r0.getAnnotation()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Contact getContact() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            org.simpleframework.xml.core.Contact r0 = r0.getContact()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Converter getConverter(org.simpleframework.xml.core.Context r3) {
            r2 = this;
            org.simpleframework.xml.core.Label r0 = r2.label
            org.simpleframework.xml.core.Converter r3 = r0.getConverter(r3)
            boolean r0 = r3 instanceof org.simpleframework.xml.core.Variable.Adapter
            if (r0 == 0) goto Lb
            return r3
        Lb:
            org.simpleframework.xml.core.Variable$Adapter r0 = new org.simpleframework.xml.core.Variable$Adapter
            org.simpleframework.xml.core.Label r1 = r2.label
            java.lang.Object r2 = r2.value
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Decorator getDecorator() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            org.simpleframework.xml.core.Decorator r0 = r0.getDecorator()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getDependent() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            org.simpleframework.xml.strategy.Type r0 = r0.getDependent()
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
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.String r0 = r0.getEntry()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Expression getExpression() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            org.simpleframework.xml.core.Expression r0 = r0.getExpression()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Object getKey() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.Object r0 = r0.getKey()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.core.Label getLabel(java.lang.Class r1) {
            r0 = this;
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getName() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String[] getNames() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.String[] r0 = r0.getNames()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getOverride() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.String r0 = r0.getOverride()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String getPath() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.String r0 = r0.getPath()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.String[] getPaths() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.String[] r0 = r0.getPaths()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public java.lang.Class getType() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            java.lang.Class r0 = r0.getType()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public org.simpleframework.xml.strategy.Type getType(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            org.simpleframework.xml.strategy.Type r0 = r0.getType(r1)
            return r0
    }

    public java.lang.Object getValue() {
            r0 = this;
            java.lang.Object r0 = r0.value
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isAttribute() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            boolean r0 = r0.isAttribute()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isCollection() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            boolean r0 = r0.isCollection()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            boolean r0 = r0.isData()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isInline() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            boolean r0 = r0.isInline()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isRequired() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            boolean r0 = r0.isRequired()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isText() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            boolean r0 = r0.isText()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isTextList() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            boolean r0 = r0.isTextList()
            return r0
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isUnion() {
            r0 = this;
            org.simpleframework.xml.core.Label r0 = r0.label
            boolean r0 = r0.isUnion()
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
