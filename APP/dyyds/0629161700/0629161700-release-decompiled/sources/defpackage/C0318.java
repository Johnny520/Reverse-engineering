package defpackage;

/* JADX INFO: renamed from: ᛲᛷᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0318 implements java.lang.reflect.GenericArrayType {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Type f1651;

    public C0318(java.lang.reflect.Type r1) {
            r0 = this;
            r0.<init>()
            java.lang.reflect.Type r1 = defpackage.AbstractC0209.m773(r1)
            r0.f1651 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto Le
            java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
            boolean r1 = defpackage.AbstractC0209.m779(r1, r2)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    @Override // java.lang.reflect.GenericArrayType
    public final java.lang.reflect.Type getGenericComponentType() {
            r0 = this;
            java.lang.reflect.Type r0 = r0.f1651
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.reflect.Type r0 = r0.f1651
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.reflect.Type r1 = r1.f1651
            java.lang.String r1 = defpackage.AbstractC0209.m771(r1)
            r0.append(r1)
            java.lang.String r1 = "[]"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
