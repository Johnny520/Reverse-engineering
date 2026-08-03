package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
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

    private java.lang.Object readElement(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.PrimitiveFactory r0 = r2.factory
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r3)
            boolean r1 = r0.isReference()
            if (r1 != 0) goto L11
            java.lang.Object r3 = r2.readElement(r3, r0)
            return r3
        L11:
            java.lang.Object r3 = r0.getInstance()
            return r3
    }

    private java.lang.Object readElement(org.simpleframework.xml.stream.InputNode r2, org.simpleframework.xml.core.Instance r3) throws java.lang.Exception {
            r1 = this;
            java.lang.Class r0 = r1.expect
            java.lang.Object r2 = r1.read(r2, r0)
            if (r3 == 0) goto Lb
            r3.setInstance(r2)
        Lb:
            return r2
    }

    private java.lang.Object readTemplate(java.lang.String r2, java.lang.Class r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Context r0 = r1.context
            java.lang.String r2 = r0.getProperty(r2)
            if (r2 == 0) goto Lf
            org.simpleframework.xml.core.PrimitiveFactory r0 = r1.factory
            java.lang.Object r2 = r0.getInstance(r2, r3)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    private boolean validateElement(org.simpleframework.xml.stream.InputNode r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.PrimitiveFactory r0 = r1.factory
            org.simpleframework.xml.core.Instance r2 = r0.getInstance(r2)
            boolean r0 = r2.isReference()
            if (r0 != 0) goto L10
            r0 = 0
            r2.setInstance(r0)
        L10:
            r2 = 1
            return r2
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2.isElement()
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r1.readElement(r2)
            return r2
        Lb:
            java.lang.Class r0 = r1.expect
            java.lang.Object r2 = r1.read(r2, r0)
            return r2
    }

    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2, java.lang.Class r3) throws java.lang.Exception {
            r1 = this;
            java.lang.String r2 = r2.getValue()
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r0 = r1.empty
            if (r0 == 0) goto L15
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L15
            java.lang.String r2 = r1.empty
            return r2
        L15:
            java.lang.Object r2 = r1.readTemplate(r2, r3)
            return r2
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            if (r3 != 0) goto L7
            java.lang.Object r2 = r1.read(r2)
            return r2
        L7:
            org.simpleframework.xml.core.PersistenceException r2 = new org.simpleframework.xml.core.PersistenceException
            java.lang.Class r3 = r1.expect
            org.simpleframework.xml.strategy.Type r0 = r1.type
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "Can not read existing %s for %s"
            r2.<init>(r0, r3)
            throw r2
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(org.simpleframework.xml.stream.InputNode r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2.isElement()
            if (r0 == 0) goto La
            r1.validateElement(r2)
            goto Ld
        La:
            r2.getValue()
        Ld:
            r2 = 1
            return r2
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.PrimitiveFactory r0 = r1.factory
            java.lang.String r3 = r0.getText(r3)
            if (r3 == 0) goto Lb
            r2.setValue(r3)
        Lb:
            return
    }
}
