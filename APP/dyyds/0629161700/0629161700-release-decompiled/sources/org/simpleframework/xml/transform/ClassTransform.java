package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ClassTransform implements org.simpleframework.xml.transform.Transform<java.lang.Class> {
    private static final java.lang.String BOOLEAN = "boolean";
    private static final java.lang.String BYTE = "byte";
    private static final java.lang.String CHARACTER = "char";
    private static final java.lang.String DOUBLE = "double";
    private static final java.lang.String FLOAT = "float";
    private static final java.lang.String INTEGER = "int";
    private static final java.lang.String LONG = "long";
    private static final java.lang.String SHORT = "short";
    private static final java.lang.String VOID = "void";

    public ClassTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.ClassLoader getCallerClassLoader() {
            r0 = this;
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            return r0
    }

    private static java.lang.ClassLoader getClassLoader() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            return r0
    }

    private java.lang.Class readPrimitive(java.lang.String r1) {
            r0 = this;
            java.lang.String r0 = "byte"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.Class r0 = java.lang.Byte.TYPE
            return r0
        Lb:
            java.lang.String r0 = "short"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L16
            java.lang.Class r0 = java.lang.Short.TYPE
            return r0
        L16:
            java.lang.String r0 = "int"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L21
            java.lang.Class r0 = java.lang.Integer.TYPE
            return r0
        L21:
            java.lang.String r0 = "long"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            java.lang.Class r0 = java.lang.Long.TYPE
            return r0
        L2c:
            java.lang.String r0 = "char"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L37
            java.lang.Class r0 = java.lang.Character.TYPE
            return r0
        L37:
            java.lang.String r0 = "float"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L42
            java.lang.Class r0 = java.lang.Float.TYPE
            return r0
        L42:
            java.lang.String r0 = "double"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4d
            java.lang.Class r0 = java.lang.Double.TYPE
            return r0
        L4d:
            java.lang.String r0 = "boolean"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L58
            java.lang.Class r0 = java.lang.Boolean.TYPE
            return r0
        L58:
            java.lang.String r0 = "void"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L63
            java.lang.Class r0 = java.lang.Void.TYPE
            return r0
        L63:
            r0 = 0
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public java.lang.Class read(java.lang.String r2) {
            r1 = this;
            java.lang.Class r0 = r1.readPrimitive(r2)
            if (r0 != 0) goto L15
            java.lang.ClassLoader r0 = getClassLoader()
            if (r0 != 0) goto L10
            java.lang.ClassLoader r0 = r1.getCallerClassLoader()
        L10:
            java.lang.Class r1 = r0.loadClass(r2)
            return r1
        L15:
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.Class read(java.lang.String r1) {
            r0 = this;
            java.lang.Class r0 = r0.read(r1)
            return r0
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.lang.Class r1) {
            r0 = this;
            java.lang.String r0 = r1.getName()
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.lang.Class r1) {
            r0 = this;
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r0 = r0.write2(r1)
            return r0
    }
}
