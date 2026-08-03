package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f413h;

    public /* synthetic */ u(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f412g = r2
            r0.f413h = r1
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r0 = r3.f412g
            switch(r0) {
                case 0: goto L67;
                case 1: goto L38;
                default: goto L5;
            }
        L5:
            f1.w r4 = (f1.w) r4
            long r0 = r4.f3133a
            i0.h0 r5 = (i0.h0) r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r6.intValue()
            r6 = r4 & 17
            r0 = 16
            r1 = 1
            if (r6 == r0) goto L1a
            r6 = r1
            goto L1b
        L1a:
            r6 = 0
        L1b:
            r4 = r4 & r1
            boolean r4 = r5.S(r4, r6)
            if (r4 == 0) goto L32
            java.lang.Object r4 = r3.f413h
            android.app.RemoteAction r4 = (android.app.RemoteAction) r4
            android.graphics.drawable.Icon r4 = r4.getIcon()
            r6 = 48
            b0.e0 r0 = b0.e0.f360a
            r0.b(r4, r5, r6)
            goto L35
        L32:
            r5.V()
        L35:
            sf.n r4 = sf.n.f12433a
            return r4
        L38:
            f1.w r4 = (f1.w) r4
            long r0 = r4.f3133a
            i0.h0 r5 = (i0.h0) r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r6.intValue()
            r6 = r4 & 17
            r0 = 16
            r1 = 1
            if (r6 == r0) goto L4d
            r6 = r1
            goto L4e
        L4d:
            r6 = 0
        L4e:
            r4 = r4 & r1
            boolean r4 = r5.S(r4, r6)
            if (r4 == 0) goto L61
            java.lang.Object r4 = r3.f413h
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            r6 = 48
            b0.e0 r0 = b0.e0.f360a
            r0.a(r4, r5, r6)
            goto L64
        L61:
            r5.V()
        L64:
            sf.n r4 = sf.n.f12433a
            return r4
        L67:
            f1.w r4 = (f1.w) r4
            long r0 = r4.f3133a
            i0.h0 r5 = (i0.h0) r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r6.intValue()
            r6 = r4 & 6
            if (r6 != 0) goto L81
            boolean r6 = r5.e(r0)
            if (r6 == 0) goto L7f
            r6 = 4
            goto L80
        L7f:
            r6 = 2
        L80:
            r4 = r4 | r6
        L81:
            r6 = r4 & 19
            r2 = 18
            if (r6 == r2) goto L89
            r6 = 1
            goto L8a
        L89:
            r6 = 0
        L8a:
            r2 = r4 & 1
            boolean r6 = r5.S(r2, r6)
            if (r6 == 0) goto La0
            java.lang.Object r6 = r3.f413h
            z.d r6 = (z.d) r6
            int r6 = r6.f22464c
            int r4 = r4 << 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            b0.w.b(r6, r0, r5, r4)
            goto La3
        La0:
            r5.V()
        La3:
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
