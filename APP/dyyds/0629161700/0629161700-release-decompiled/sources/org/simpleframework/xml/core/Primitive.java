package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Primitive implements org.simpleframework.xml.core.Converter {
    private final org.simpleframework.xml.core.Context context;
    private final java.lang.String empty;
    private final java.lang.Class expect;
    private final org.simpleframework.xml.core.PrimitiveFactory factory;
    private final org.simpleframework.xml.strategy.Type type;

    public Primitive(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.strategy.Type r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public Primitive(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.strategy.Type r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.PrimitiveFactory r0 = new org.simpleframework.xml.core.PrimitiveFactory
            r0.<init>(r2, r3)
            r1.factory = r0
            java.lang.Class r0 = r3.getType()
            r1.expect = r0
            r1.context = r2
            r1.empty = r4
            r1.type = r3
            return
    }

    private java.lang.Object readElement(org.simpleframework.xml.stream.InputNode r3) {
            r2 = this;
            org.simpleframework.xml.core.PrimitiveFactory r0 = r2.factory
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r3)
            boolean r1 = r0.isReference()
            if (r1 != 0) goto L11
            java.lang.Object r2 = r2.readElement(r3, r0)
            return r2
        L11:
            java.lang.Object r2 = r0.getInstance()
            return r2
    }

    private java.lang.Object readElement(org.simpleframework.xml.stream.InputNode r2, org.simpleframework.xml.core.Instance r3) {
            r1 = this;
            java.lang.Class r0 = r1.expect
            java.lang.Object r1 = r1.read(r2, r0)
            if (r3 == 0) goto Lb
            r3.setInstance(r1)
        Lb:
            return r1
    }

    private java.lang.Object readTemplate(java.lang.String r2, java.lang.Class r3) {
            r1 = this;
            org.simpleframework.xml.core.Context r0 = r1.context
            java.lang.String r2 = r0.getProperty(r2)
            if (r2 == 0) goto Lf
            org.simpleframework.xml.core.PrimitiveFactory r1 = r1.factory
            java.lang.Object r1 = r1.getInstance(r2, r3)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    private boolean validateElement(org.simpleframework.xml.stream.InputNode r1) {
            r0 = this;
            org.simpleframework.xml.core.PrimitiveFactory r0 = r0.factory
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r1)
            boolean r1 = r0.isReference()
            if (r1 != 0) goto L10
            r1 = 0
            r0.setInstance(r1)
        L10:
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
            boolean r0 = r2.isElement()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r1.readElement(r2)
            return r1
        Lb:
            java.lang.Class r0 = r1.expect
            java.lang.Object r1 = r1.read(r2, r0)
            return r1
    }

    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2, java.lang.Class r3) {
            r1 = this;
            java.lang.String r2 = r2.getValue()
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = r1.empty
            if (r0 == 0) goto L15
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L15
            java.lang.String r1 = r1.empty
            return r1
        L15:
            java.lang.Object r1 = r1.readTemplate(r2, r3)
            return r1
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r1, java.lang.Object r2) {
            r0 = this;
            if (r2 != 0) goto L7
            java.lang.Object r0 = r0.read(r1)
            return r0
        L7:
            org.simpleframework.xml.core.PersistenceException r1 = new org.simpleframework.xml.core.PersistenceException
            java.lang.Class r2 = r0.expect
            org.simpleframework.xml.strategy.Type r0 = r0.type
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r2 = "Can not read existing %s for %s"
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
            boolean r0 = r2.isElement()
            if (r0 == 0) goto La
            r1.validateElement(r2)
            goto Ld
        La:
            r2.getValue()
        Ld:
            r1 = 1
            return r1
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(org.simpleframework.xml.stream.OutputNode r1, java.lang.Object r2) {
            r0 = this;
            org.simpleframework.xml.core.PrimitiveFactory r0 = r0.factory
            java.lang.String r0 = r0.getText(r2)
            if (r0 == 0) goto Lb
            r1.setValue(r0)
        Lb:
            return
    }
}
