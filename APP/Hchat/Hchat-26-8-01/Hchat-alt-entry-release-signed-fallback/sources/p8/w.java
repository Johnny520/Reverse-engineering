package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p8.x f10431h;

    public /* synthetic */ w(p8.x r1, int r2) {
            r0 = this;
            r0.f10430g = r2
            r0.f10431h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f10430g
            hh.i r2 = (hh.i) r2
            switch(r0) {
                case 0: goto L2b;
                case 1: goto L19;
                default: goto L7;
            }
        L7:
            r2.getClass()
            lh.a r2 = r2.p()
            java.lang.String r2 = r2.f8057g
            p8.x r0 = r1.f10431h
            java.lang.ClassLoader r0 = r0.f10433b
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r0)
            return r2
        L19:
            r2.getClass()
            lh.a r2 = r2.p()
            java.lang.String r2 = r2.f8057g
            p8.x r0 = r1.f10431h
            java.lang.ClassLoader r0 = r0.f10433b
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r0)
            return r2
        L2b:
            r2.getClass()
            lh.a r2 = r2.p()
            java.lang.String r2 = r2.f8057g
            p8.x r0 = r1.f10431h
            java.lang.ClassLoader r0 = r0.f10433b
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r0)
            return r2
    }
}
