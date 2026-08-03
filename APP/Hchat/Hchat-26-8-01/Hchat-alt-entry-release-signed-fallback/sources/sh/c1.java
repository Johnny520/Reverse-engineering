package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0.l2 f12534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lg.a f12535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12539f;

    public c1(i0.l2 r1, lg.a r2, boolean r3, i0.a1 r4, i0.a1 r5, i0.a1 r6) {
            r0 = this;
            r0.<init>()
            r0.f12534a = r1
            r0.f12535b = r2
            r0.f12536c = r3
            r0.f12537d = r4
            r0.f12538e = r5
            r0.f12539f = r6
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(s1.x r9, wf.c r10) {
            r8 = this;
            sh.b1 r0 = new sh.b1
            i0.a1 r6 = r8.f12539f
            r7 = 0
            i0.l2 r1 = r8.f12534a
            lg.a r2 = r8.f12535b
            boolean r3 = r8.f12536c
            i0.a1 r4 = r8.f12537d
            i0.a1 r5 = r8.f12538e
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            s1.l0 r9 = (s1.l0) r9
            java.lang.Object r9 = r9.k1(r0, r10)
            xf.a r10 = xf.a.f21579g
            if (r9 != r10) goto L1d
            return r9
        L1d:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
