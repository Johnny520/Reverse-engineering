package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛶᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0288 extends xhss.AbstractC0352 implements xhss.InterfaceC0030 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f1115;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.ClassLoader f1116;

    public C0288(java.lang.ClassLoader r1, java.lang.String r2) {
            r0 = this;
            r0.f1115 = r2
            r0.f1116 = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // xhss.InterfaceC0030
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.lang.Object mo136() {
            r4 = this;
            java.lang.String r0 = r4.f1115
            r1 = 0
            r2 = r1
        L4:
            java.lang.String r3 = "[]"
            boolean r3 = r0.endsWith(r3)
            if (r3 == 0) goto L19
            int r2 = r2 + 1
            int r3 = r0.length()
            int r3 = r3 + (-2)
            java.lang.String r0 = r0.substring(r1, r3)
            goto L4
        L19:
            java.util.Map r3 = xhss.AbstractC0545.f1964
            java.lang.Object r3 = r3.get(r0)
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 != 0) goto L29
            java.lang.ClassLoader r4 = r4.f1116
            java.lang.Class r3 = r4.loadClass(r0)
        L29:
            r4 = r1
        L2a:
            if (r4 >= r2) goto L37
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r1)
            java.lang.Class r3 = r0.getClass()
            int r4 = r4 + 1
            goto L2a
        L37:
            return r3
    }
}
