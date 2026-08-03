package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ot implements androidx.compose.ui.input.pointer.PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u2.c f18189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18191f;

    public ot(i0.a1 r1, i0.a1 r2, i0.a1 r3, u2.c r4, i0.a1 r5, i0.a1 r6) {
            r0 = this;
            r0.<init>()
            r0.f18186a = r1
            r0.f18187b = r2
            r0.f18188c = r3
            r0.f18189d = r4
            r0.f18190e = r5
            r0.f18191f = r6
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(s1.x r10, wf.c r11) {
            r9 = this;
            wb.ad r1 = new wb.ad
            r0 = 9
            i0.a1 r4 = r9.f18186a
            i0.a1 r2 = r9.f18187b
            i0.a1 r3 = r9.f18188c
            r1.<init>(r4, r2, r3, r0)
            c9.w0 r0 = new c9.w0
            r5 = 4
            r0.<init>(r2, r4, r3, r5)
            c9.w0 r8 = new c9.w0
            r5 = 5
            r8.<init>(r2, r4, r3, r5)
            c9.q0 r2 = new c9.q0
            r7 = 28
            u2.c r3 = r9.f18189d
            i0.a1 r5 = r9.f18190e
            i0.a1 r6 = r9.f18191f
            r2.<init>(r3, r4, r5, r6, r7)
            float r3 = m.j0.f8216a
            r4 = r2
            r2 = r0
            m.g0 r0 = new m.g0
            r5 = 0
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r10 = a.a.n(r10, r0, r11)
            xf.a r11 = xf.a.f21579g
            if (r10 != r11) goto L3a
            return r10
        L3a:
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
