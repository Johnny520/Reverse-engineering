package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛸᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0297 extends xhss.AbstractC1029 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.reflect.Method f1137;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ int f1138;

    public C0297(int r1, java.lang.reflect.Method r2) {
            r0 = this;
            r0.<init>()
            r0.f1137 = r2
            r0.f1138 = r1
            return
    }

    @Override // xhss.AbstractC1029
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Object mo621(java.lang.Class r2) {
            r1 = this;
            java.lang.String r0 = xhss.C0230.m521(r2)
            if (r0 != 0) goto L18
            int r0 = r1.f1138
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
            java.lang.reflect.Method r1 = r1.f1137
            r0 = 0
            java.lang.Object r1 = r1.invoke(r0, r2)
            return r1
        L18:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "UnsafeAllocator is used for non-instantiable type: "
            java.lang.String r2 = r2.concat(r0)
            r1.<init>(r2)
            throw r1
    }
}
