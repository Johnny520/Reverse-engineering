package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements androidx.compose.ui.input.pointer.PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14599c;

    public q(fg.l r2, fg.a r3) {
            r1 = this;
            r0 = 3
            r1.f14597a = r0
            r1.<init>()
            r1.f14599c = r2
            r1.f14598b = r3
            return
    }

    public /* synthetic */ q(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f14597a = r2
            r0.f14598b = r1
            r0.f14599c = r3
            r0.<init>()
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(s1.x r7, wf.c r8) {
            r6 = this;
            int r0 = r6.f14597a
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L2c;
                case 2: goto L19;
                default: goto L5;
            }
        L5:
            d9.k r0 = new d9.k
            java.lang.Object r1 = r6.f14599c
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r6.f14598b
            fg.a r2 = (fg.a) r2
            r3 = 0
            r4 = 5
            r0.<init>(r1, r2, r3, r4)
            java.lang.Object r7 = a.a.n(r7, r0, r8)
            return r7
        L19:
            wb.go r0 = new wb.go
            java.lang.Object r1 = r6.f14598b
            wb.t4 r1 = (wb.t4) r1
            java.lang.Object r2 = r6.f14599c
            fg.l r2 = (fg.l) r2
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.lang.Object r7 = a.a.n(r7, r0, r8)
            return r7
        L2c:
            w.e0 r0 = new w.e0
            java.lang.Object r1 = r6.f14598b
            r2 = r1
            w.y0 r2 = (w.y0) r2
            java.lang.Object r1 = r6.f14599c
            r3 = r1
            h0.d1 r3 = (h0.d1) r3
            r4 = 0
            r5 = 0
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r7 = qg.v.e(r0, r8)
            xf.a r8 = xf.a.f21579g
            if (r7 != r8) goto L47
            goto L49
        L47:
            sf.n r7 = sf.n.f12433a
        L49:
            return r7
        L4a:
            r1 = r7
            java.lang.Object r7 = r6.f14598b
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r0 = r6.f14599c
            fg.l r0 = (fg.l) r0
            w.o r2 = new w.o
            r3 = 1
            r2.<init>(r7, r0, r3)
            r7 = 7
            r0 = 0
            java.lang.Object r7 = m.y2.d(r1, r0, r2, r8, r7)
            xf.a r8 = xf.a.f21579g
            if (r7 != r8) goto L64
            goto L66
        L64:
            sf.n r7 = sf.n.f12433a
        L66:
            return r7
    }
}
