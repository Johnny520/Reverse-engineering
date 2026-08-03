package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.BitSet f21557b;

    public /* synthetic */ d(int r1, java.util.BitSet r2) {
            r0 = this;
            r0.f21556a = r1
            r0.f21557b = r2
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f21556a
            switch(r0) {
                case 0: goto L32;
                case 1: goto L22;
                case 2: goto L18;
                default: goto L5;
            }
        L5:
            ud.a r3 = (ud.a) r3
            ud.a r3 = r3.f13681s
            if (r3 == 0) goto L17
            java.util.BitSet r0 = r3.f13678p
            java.util.BitSet r1 = r2.f21557b
            r1.andNot(r0)
            int r3 = r3.f13672j
            r1.clear(r3)
        L17:
            return
        L18:
            ud.a r3 = (ud.a) r3
            java.util.BitSet r3 = r3.f13678p
            java.util.BitSet r0 = r2.f21557b
            r0.and(r3)
            return
        L22:
            ud.a r3 = (ud.a) r3
            java.util.BitSet r3 = r3.f13680r
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L31
            java.util.BitSet r0 = r2.f21557b
            r0.or(r3)
        L31:
            return
        L32:
            nd.t r3 = (nd.t) r3
            ud.a r3 = r3.f9392a
            int r3 = r3.f13672j
            java.util.BitSet r0 = r2.f21557b
            r0.set(r3)
            return
    }
}
