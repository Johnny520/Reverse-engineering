package defpackage;

/* JADX INFO: renamed from: ᛱᲁᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0173 extends defpackage.AbstractC0330 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1149;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.reflect.Method f1150;

    public C0173(java.lang.reflect.Method r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f1150 = r1
            r0.f1149 = r2
            return
    }

    @Override // defpackage.AbstractC0330
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object mo707(java.lang.Class r2) {
            r1 = this;
            java.lang.String r0 = defpackage.C0682.m1536(r2)
            if (r0 != 0) goto L13
            java.lang.Object r0 = r1.f1149
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.reflect.Method r1 = r1.f1150
            java.lang.Object r1 = r1.invoke(r0, r2)
            return r1
        L13:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "UnsafeAllocator is used for non-instantiable type: "
            java.lang.String r2 = r2.concat(r0)
            r1.<init>(r2)
            throw r1
    }
}
