package com.highcapable.kavaref.extension;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TypeRef<T> {
    private final sf.c rawType$delegate;
    private final sf.c type$delegate;

    public TypeRef() {
            r2 = this;
            r2.<init>()
            t6.b r0 = new t6.b
            r1 = 0
            r0.<init>(r2, r1)
            sf.i r1 = new sf.i
            r1.<init>(r0)
            r2.type$delegate = r1
            t6.b r0 = new t6.b
            r1 = 1
            r0.<init>(r2, r1)
            sf.i r1 = new sf.i
            r1.<init>(r0)
            r2.rawType$delegate = r1
            return
    }

    public static /* synthetic */ java.lang.reflect.Type a(com.highcapable.kavaref.extension.TypeRef r0) {
            java.lang.reflect.Type r0 = type_delegate$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Class b(com.highcapable.kavaref.extension.TypeRef r0) {
            java.lang.Class r0 = rawType_delegate$lambda$0(r0)
            return r0
    }

    private static final java.lang.Class rawType_delegate$lambda$0(com.highcapable.kavaref.extension.TypeRef r3) {
            java.lang.reflect.Type r3 = r3.getType()
        L4:
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        Lb:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L16
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = r3.getRawType()
            goto L4
        L16:
            sf.k r0 = new sf.k
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot cast type "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " to java.lang.Class object."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static final java.lang.reflect.Type type_delegate$lambda$0(com.highcapable.kavaref.extension.TypeRef r4) {
            java.lang.Class r4 = r4.getClass()
            java.lang.reflect.Type r4 = r4.getGenericSuperclass()
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            java.lang.String r1 = "Must only create direct subclasses of TypeRef."
            java.lang.Class<com.highcapable.kavaref.extension.TypeRef> r2 = com.highcapable.kavaref.extension.TypeRef.class
            if (r0 == 0) goto L40
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r0 = r4.getRawType()
            gg.f r3 = gg.v.a(r2)
            java.lang.Class r3 = a.a.a0(r3)
            if (r3 != 0) goto L21
            goto L22
        L21:
            r2 = r3
        L22:
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L3c
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            java.lang.Object r4 = tf.l.z0(r4)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            if (r4 == 0) goto L35
            return r4
        L35:
            java.lang.String r4 = "Type argument cannot be null."
            j8.o.A(r4)
        L3a:
            r4 = 0
            return r4
        L3c:
            j8.o.A(r1)
            goto L3a
        L40:
            gg.f r0 = gg.v.a(r2)
            java.lang.Class r0 = a.a.a0(r0)
            if (r0 != 0) goto L4b
            goto L4c
        L4b:
            r2 = r0
        L4c:
            boolean r4 = gg.l.a(r4, r2)
            if (r4 == 0) goto L58
            java.lang.String r4 = "TypeRef must be created with a type argument: object : TypeRef<...>() {}."
            j8.o.A(r4)
            goto L3a
        L58:
            j8.o.A(r1)
            goto L3a
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.highcapable.kavaref.extension.TypeRef
            if (r0 == 0) goto L16
            java.lang.reflect.Type r0 = r1.getType()
            com.highcapable.kavaref.extension.TypeRef r2 = (com.highcapable.kavaref.extension.TypeRef) r2
            java.lang.reflect.Type r2 = r2.getType()
            boolean r2 = gg.l.a(r0, r2)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public final java.lang.Class<T> getRawType() {
            r1 = this;
            sf.c r0 = r1.rawType$delegate
            java.lang.Object r0 = r0.getValue()
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    public final java.lang.reflect.Type getType() {
            r1 = this;
            sf.c r0 = r1.type$delegate
            java.lang.Object r0 = r0.getValue()
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.getType()
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.getType()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
