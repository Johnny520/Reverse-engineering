package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class Entry {
    private static final java.lang.String DEFAULT_NAME = "entry";
    private boolean attribute;
    private org.simpleframework.xml.core.Contact contact;
    private java.lang.String entry;
    private java.lang.String key;
    private java.lang.Class keyType;
    private org.simpleframework.xml.ElementMap label;
    private java.lang.String value;
    private java.lang.Class valueType;

    public Entry(org.simpleframework.xml.core.Contact r2, org.simpleframework.xml.ElementMap r3) {
            r1 = this;
            r1.<init>()
            boolean r0 = r3.attribute()
            r1.attribute = r0
            java.lang.String r0 = r3.entry()
            r1.entry = r0
            java.lang.String r0 = r3.value()
            r1.value = r0
            java.lang.String r0 = r3.key()
            r1.key = r0
            r1.contact = r2
            r1.label = r3
            return
    }

    private java.lang.Class getDependent(int r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Contact r0 = r3.contact
            java.lang.Class[] r0 = r0.getDependents()
            int r1 = r0.length
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 >= r4) goto Lc
            return r2
        Lc:
            int r1 = r0.length
            if (r1 != 0) goto L10
            return r2
        L10:
            r4 = r0[r4]
            return r4
    }

    private boolean isEmpty(java.lang.String r1) {
            r0 = this;
            int r1 = r1.length()
            if (r1 != 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public org.simpleframework.xml.core.Contact getContact() {
            r1 = this;
            org.simpleframework.xml.core.Contact r0 = r1.contact
            return r0
    }

    public java.lang.String getEntry() throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = r1.entry
            if (r0 != 0) goto L5
            return r0
        L5:
            boolean r0 = r1.isEmpty(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "entry"
            r1.entry = r0
        Lf:
            java.lang.String r0 = r1.entry
            return r0
    }

    public java.lang.String getKey() throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = r1.key
            if (r0 != 0) goto L5
            return r0
        L5:
            boolean r0 = r1.isEmpty(r0)
            if (r0 == 0) goto Le
            r0 = 0
            r1.key = r0
        Le:
            java.lang.String r0 = r1.key
            return r0
    }

    public org.simpleframework.xml.core.Converter getKey(org.simpleframework.xml.core.Context r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.strategy.Type r0 = r2.getKeyType()
            boolean r1 = r3.isPrimitive(r0)
            if (r1 == 0) goto L10
            org.simpleframework.xml.core.PrimitiveKey r1 = new org.simpleframework.xml.core.PrimitiveKey
            r1.<init>(r3, r2, r0)
            return r1
        L10:
            org.simpleframework.xml.core.CompositeKey r1 = new org.simpleframework.xml.core.CompositeKey
            r1.<init>(r3, r2, r0)
            return r1
    }

    public org.simpleframework.xml.strategy.Type getKeyType() throws java.lang.Exception {
            r2 = this;
            java.lang.Class r0 = r2.keyType
            if (r0 != 0) goto L17
            org.simpleframework.xml.ElementMap r0 = r2.label
            java.lang.Class r0 = r0.keyType()
            r2.keyType = r0
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto L17
            r0 = 0
            java.lang.Class r0 = r2.getDependent(r0)
            r2.keyType = r0
        L17:
            org.simpleframework.xml.core.ClassType r0 = new org.simpleframework.xml.core.ClassType
            java.lang.Class r1 = r2.keyType
            r0.<init>(r1)
            return r0
    }

    public java.lang.String getValue() throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = r1.value
            if (r0 != 0) goto L5
            return r0
        L5:
            boolean r0 = r1.isEmpty(r0)
            if (r0 == 0) goto Le
            r0 = 0
            r1.value = r0
        Le:
            java.lang.String r0 = r1.value
            return r0
    }

    public org.simpleframework.xml.core.Converter getValue(org.simpleframework.xml.core.Context r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.strategy.Type r0 = r2.getValueType()
            boolean r1 = r3.isPrimitive(r0)
            if (r1 == 0) goto L10
            org.simpleframework.xml.core.PrimitiveValue r1 = new org.simpleframework.xml.core.PrimitiveValue
            r1.<init>(r3, r2, r0)
            return r1
        L10:
            org.simpleframework.xml.core.CompositeValue r1 = new org.simpleframework.xml.core.CompositeValue
            r1.<init>(r3, r2, r0)
            return r1
    }

    public org.simpleframework.xml.strategy.Type getValueType() throws java.lang.Exception {
            r2 = this;
            java.lang.Class r0 = r2.valueType
            if (r0 != 0) goto L17
            org.simpleframework.xml.ElementMap r0 = r2.label
            java.lang.Class r0 = r0.valueType()
            r2.valueType = r0
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto L17
            r0 = 1
            java.lang.Class r0 = r2.getDependent(r0)
            r2.valueType = r0
        L17:
            org.simpleframework.xml.core.ClassType r0 = new org.simpleframework.xml.core.ClassType
            java.lang.Class r1 = r2.valueType
            r0.<init>(r1)
            return r0
    }

    public boolean isAttribute() {
            r1 = this;
            boolean r0 = r1.attribute
            return r0
    }

    public boolean isInline() throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.isAttribute()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            org.simpleframework.xml.ElementMap r0 = r2.label
            org.simpleframework.xml.core.Contact r1 = r2.contact
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "%s on %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
