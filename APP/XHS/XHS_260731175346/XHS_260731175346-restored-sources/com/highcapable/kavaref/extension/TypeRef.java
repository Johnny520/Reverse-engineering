package com.highcapable.kavaref.extension;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class TypeRef<T> {
    private final xhss.InterfaceC0497 rawType$delegate;
    private final xhss.InterfaceC0497 type$delegate;

    public TypeRef() {
            r2 = this;
            r2.<init>()
            xhss.ᲁᛴᛴᛳ r0 = new xhss.ᲁᛴᛴᛳ
            r1 = 0
            r0.<init>(r2, r1)
            xhss.ᛴᛷᛱ r1 = new xhss.ᛴᛷᛱ
            r1.<init>(r0)
            r2.type$delegate = r1
            xhss.ᲁᛴᛴᛳ r0 = new xhss.ᲁᛴᛴᛳ
            r1 = 1
            r0.<init>(r2, r1)
            xhss.ᛴᛷᛱ r1 = new xhss.ᛴᛷᛱ
            r1.<init>(r0)
            r2.rawType$delegate = r1
            return
    }

    private static final java.lang.Class rawType_delegate$lambda$0(com.highcapable.kavaref.extension.TypeRef r0) {
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.Class r0 = xhss.AbstractC0485.m887(r0)
            return r0
    }

    private static final java.lang.reflect.Type type_delegate$lambda$0(com.highcapable.kavaref.extension.TypeRef r5) {
            java.lang.Class r5 = r5.getClass()
            java.lang.reflect.Type r5 = r5.getGenericSuperclass()
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            r1 = 0
            java.lang.String r2 = "Must only create direct subclasses of TypeRef."
            java.lang.Class<com.highcapable.kavaref.extension.TypeRef> r3 = com.highcapable.kavaref.extension.TypeRef.class
            if (r0 == 0) goto L42
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r0 = r5.getRawType()
            xhss.ᛱᛸᛷᛸ r4 = xhss.AbstractC0256.m565(r3)
            java.lang.Class r4 = xhss.C0614.m1075(r4)
            if (r4 != 0) goto L22
            goto L23
        L22:
            r3 = r4
        L23:
            boolean r0 = xhss.AbstractC0007.m97(r0, r3)
            if (r0 == 0) goto L3e
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            int r0 = r5.length
            if (r0 != 0) goto L32
            r5 = r1
            goto L35
        L32:
            r0 = 0
            r5 = r5[r0]
        L35:
            if (r5 == 0) goto L38
            return r5
        L38:
            java.lang.String r5 = "Type argument cannot be null."
            xhss.C0532.m950(r5)
            return r1
        L3e:
            xhss.C0532.m950(r2)
            return r1
        L42:
            xhss.ᛱᛸᛷᛸ r0 = xhss.AbstractC0256.m565(r3)
            java.lang.Class r0 = xhss.C0614.m1075(r0)
            if (r0 != 0) goto L4d
            goto L4e
        L4d:
            r3 = r0
        L4e:
            boolean r5 = xhss.AbstractC0007.m97(r5, r3)
            if (r5 == 0) goto L5a
            java.lang.String r5 = "TypeRef must be created with a type argument: object : TypeRef<...>() {}."
            xhss.C0532.m950(r5)
            return r1
        L5a:
            xhss.C0532.m950(r2)
            return r1
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Class m30(com.highcapable.kavaref.extension.TypeRef r0) {
            java.lang.Class r0 = rawType_delegate$lambda$0(r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.reflect.Type m31(com.highcapable.kavaref.extension.TypeRef r0) {
            java.lang.reflect.Type r0 = type_delegate$lambda$0(r0)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.highcapable.kavaref.extension.TypeRef
            if (r0 == 0) goto L16
            java.lang.reflect.Type r1 = r1.getType()
            com.highcapable.kavaref.extension.TypeRef r2 = (com.highcapable.kavaref.extension.TypeRef) r2
            java.lang.reflect.Type r2 = r2.getType()
            boolean r1 = xhss.AbstractC0007.m97(r1, r2)
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public final java.lang.Class<T> getRawType() {
            r0 = this;
            xhss.ᛵᛷᲀᛵ r0 = r0.rawType$delegate
            xhss.ᛴᛷᛱ r0 = (xhss.C0380) r0
            java.lang.Object r0 = r0.m734()
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    public final java.lang.reflect.Type getType() {
            r0 = this;
            xhss.ᛵᛷᲀᛵ r0 = r0.type$delegate
            xhss.ᛴᛷᛱ r0 = (xhss.C0380) r0
            java.lang.Object r0 = r0.m734()
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            return r0
    }

    public int hashCode() {
            r0 = this;
            java.lang.reflect.Type r0 = r0.getType()
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r0 = this;
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
