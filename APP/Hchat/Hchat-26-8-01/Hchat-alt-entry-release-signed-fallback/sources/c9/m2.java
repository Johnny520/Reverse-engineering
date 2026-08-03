package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m2 extends gg.j implements fg.l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c9.m2 f1276n = null;

    static {
            c9.m2 r0 = new c9.m2
            java.lang.Class<og.m> r1 = og.m.class
            java.lang.Class r2 = eh.a.i(r1)
            java.lang.String r4 = "isNotEmpty(Ljava/lang/CharSequence;)Z"
            r5 = 1
            r1 = 1
            java.lang.String r3 = "isNotEmpty"
            r0.<init>(r1, r2, r3, r4, r5)
            c9.m2.f1276n = r0
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            int r1 = r1.length()
            if (r1 <= 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }
}
