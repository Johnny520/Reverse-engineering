package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class bu implements androidx.compose.ui.input.pointer.PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf.b f15320c;

    public /* synthetic */ bu(int r1, sf.b r2, boolean r3) {
            r0 = this;
            r0.f15318a = r1
            r0.f15319b = r3
            r0.f15320c = r2
            r0.<init>()
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(s1.x r5, wf.c r6) {
            r4 = this;
            int r0 = r4.f15318a
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            boolean r0 = r4.f15319b
            if (r0 != 0) goto Lc
            sf.n r5 = sf.n.f12433a
            goto L1b
        Lc:
            sf.b r0 = r4.f15320c
            fg.l r0 = (fg.l) r0
            wb.l7 r1 = new wb.l7
            r1.<init>(r0, r5)
            r0 = 7
            r2 = 0
            java.lang.Object r5 = m.y2.d(r5, r2, r1, r6, r0)
        L1b:
            return r5
        L1c:
            boolean r0 = r4.f15319b
            if (r0 != 0) goto L23
            sf.n r5 = sf.n.f12433a
            goto L32
        L23:
            d9.k r0 = new d9.k
            sf.b r1 = r4.f15320c
            fg.a r1 = (fg.a) r1
            r2 = 0
            r3 = 6
            r0.<init>(r1, r2, r3)
            java.lang.Object r5 = a.a.n(r5, r0, r6)
        L32:
            return r5
    }
}
