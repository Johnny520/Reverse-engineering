package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x2.q f21168h;

    public /* synthetic */ p(x2.q r1, int r2) {
            r0 = this;
            r0.f21167g = r2
            r0.f21168h = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f21167g
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            d1.a r13 = (d1.a) r13
            x2.q r13 = r12.f21168h
            x2.i.c(r13)
            sf.n r13 = sf.n.f12433a
            return r13
        Lf:
            d1.a r13 = (d1.a) r13
            x2.q r0 = r12.f21168h
            android.view.View r1 = x2.i.c(r0)
            boolean r2 = r1.isFocused()
            if (r2 != 0) goto L81
            boolean r2 = r1.hasFocus()
            if (r2 != 0) goto L81
            x1.r1 r2 = x1.k.x(r0)
            y1.t r2 = (y1.t) r2
            d1.l r2 = r2.getFocusOwner()
            android.view.View r0 = x1.k.y(r0)
            int r3 = r13.f1896a
            java.lang.Integer r3 = d1.h.c(r3)
            r4 = 2
            int[] r5 = new int[r4]
            r0.getLocationOnScreen(r5)
            int[] r0 = new int[r4]
            r1.getLocationOnScreen(r0)
            d1.p r2 = (d1.p) r2
            d1.b0 r2 = r2.f1936c
            d1.b0 r2 = d1.d.f(r2)
            r4 = 0
            if (r2 == 0) goto L52
            e1.c r2 = d1.d.i(r2)
            goto L53
        L52:
            r2 = r4
        L53:
            r6 = 1
            if (r2 != 0) goto L57
            goto L79
        L57:
            android.graphics.Rect r4 = new android.graphics.Rect
            float r7 = r2.f2296a
            int r7 = (int) r7
            r8 = 0
            r9 = r5[r8]
            int r7 = r7 + r9
            r8 = r0[r8]
            int r7 = r7 - r8
            float r10 = r2.f2297b
            int r10 = (int) r10
            r5 = r5[r6]
            int r10 = r10 + r5
            r0 = r0[r6]
            int r10 = r10 - r0
            float r11 = r2.f2298c
            int r11 = (int) r11
            int r11 = r11 + r9
            int r11 = r11 - r8
            float r2 = r2.f2299d
            int r2 = (int) r2
            int r2 = r2 + r5
            int r2 = r2 - r0
            r4.<init>(r7, r10, r11, r2)
        L79:
            boolean r0 = d1.h.b(r1, r3, r4)
            if (r0 != 0) goto L81
            r13.f1897b = r6
        L81:
            sf.n r13 = sf.n.f12433a
            return r13
    }
}
