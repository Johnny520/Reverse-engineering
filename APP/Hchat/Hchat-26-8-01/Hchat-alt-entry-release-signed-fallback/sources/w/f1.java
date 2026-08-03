package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14455d;

    public /* synthetic */ f1(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f14452a = r4
            r0.f14453b = r1
            r0.f14454c = r2
            r0.f14455d = r3
            r0.<init>()
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(s1.x r8, wf.c r9) {
            r7 = this;
            int r0 = r7.f14452a
            java.lang.Object r1 = r7.f14455d
            java.lang.Object r2 = r7.f14454c
            java.lang.Object r3 = r7.f14453b
            switch(r0) {
                case 0: goto L24;
                default: goto Lb;
            }
        Lb:
            u2.c r3 = (u2.c) r3
            fg.a r2 = (fg.a) r2
            wb.l7 r0 = new wb.l7
            r4 = 18
            r0.<init>(r3, r4, r2)
            fg.a r1 = (fg.a) r1
            h0.g1 r2 = new h0.g1
            r3 = 2
            r2.<init>(r1, r3)
            r1 = 5
            java.lang.Object r8 = m.y2.d(r8, r0, r2, r9, r1)
            return r8
        L24:
            r0 = r2
            w.e1 r2 = new w.e1
            qg.t r3 = (qg.t) r3
            i0.a1 r0 = (i0.a1) r0
            r4 = 0
            r2.<init>(r3, r0, r4)
            i0.a1 r1 = (i0.a1) r1
            b0.l r3 = new b0.l
            r0 = 15
            r3.<init>(r1, r0)
            m.r0 r0 = m.y2.f8429a
            m.t1 r4 = new m.t1
            r4.<init>(r8)
            f0.b r0 = new f0.b
            r5 = 0
            r6 = 3
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.Object r8 = qg.v.e(r0, r9)
            sf.n r9 = sf.n.f12433a
            xf.a r0 = xf.a.f21579g
            if (r8 != r0) goto L52
            goto L53
        L52:
            r8 = r9
        L53:
            if (r8 != r0) goto L56
            r9 = r8
        L56:
            return r9
    }
}
