package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛷᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0062 implements java.lang.reflect.GenericArrayType {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Type f349;

    public C0062(java.lang.reflect.Type r1) {
            r0 = this;
            r0.<init>()
            java.lang.reflect.Type r1 = xhss.C0915.m1485(r1)
            r0.f349 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto Le
            java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
            boolean r1 = xhss.C0915.m1507(r1, r2)
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
            java.lang.reflect.Type r0 = r0.f349
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.reflect.Type r0 = r0.f349
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.reflect.Type r1 = r1.f349
            java.lang.String r1 = xhss.C0915.m1487(r1)
            r0.append(r1)
            java.lang.String r1 = "[]"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
