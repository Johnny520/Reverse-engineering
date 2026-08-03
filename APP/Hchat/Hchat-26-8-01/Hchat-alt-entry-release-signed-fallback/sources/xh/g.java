package xh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.compose.ui.input.pointer.PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f21691b;

    public /* synthetic */ g(i0.a1 r1, int r2) {
            r0 = this;
            r0.f21690a = r2
            r0.f21691b = r1
            r0.<init>()
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(s1.x r4, wf.c r5) {
            r3 = this;
            int r0 = r3.f21690a
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            xh.n r0 = new xh.n
            r1 = 1
            i0.a1 r2 = r3.f21691b
            r0.<init>(r2, r1)
            r1 = 7
            r2 = 0
            java.lang.Object r4 = m.y2.d(r4, r2, r0, r5, r1)
            xf.a r5 = xf.a.f21579g
            if (r4 != r5) goto L18
            goto L1a
        L18:
            sf.n r4 = sf.n.f12433a
        L1a:
            return r4
        L1b:
            wb.lp r0 = new wb.lp
            r1 = 27
            i0.a1 r2 = r3.f21691b
            r0.<init>(r2, r1)
            r1 = 7
            r2 = 0
            java.lang.Object r4 = m.y2.d(r4, r2, r0, r5, r1)
            xf.a r5 = xf.a.f21579g
            if (r4 != r5) goto L2f
            goto L31
        L2f:
            sf.n r4 = sf.n.f12433a
        L31:
            return r4
    }
}
