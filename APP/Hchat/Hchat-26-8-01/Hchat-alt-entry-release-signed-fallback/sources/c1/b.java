package c1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f975i;

    public /* synthetic */ b(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f973g = r2
            r0.f974h = r1
            r0.f975i = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r9 = this;
            int r0 = r9.f973g
            switch(r0) {
                case 0: goto L237;
                case 1: goto L209;
                case 2: goto L1f8;
                case 3: goto L1ea;
                case 4: goto L15c;
                case 5: goto L111;
                case 6: goto Lfe;
                case 7: goto Led;
                case 8: goto Ldc;
                case 9: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f974h
            y1.a r0 = (y1.a) r0
            java.lang.Object r1 = r9.f975i
            y1.i2 r1 = (y1.i2) r1
            r0.removeOnAttachStateChangeListener(r1)
            sf.n r0 = sf.n.f12433a
            return r0
        L13:
            java.lang.Object r0 = r9.f975i
            y1.z r0 = (y1.z) r0
            java.lang.Object r1 = r9.f974h
            y1.e2 r1 = (y1.e2) r1
            f2.j r2 = r1.f21885k
            f2.j r3 = r1.f21886l
            java.lang.Float r4 = r1.f21883i
            java.lang.Float r5 = r1.f21884j
            r6 = 0
            if (r2 == 0) goto L3a
            if (r4 == 0) goto L3a
            fg.a r7 = r2.f3156a
            java.lang.Object r7 = r7.invoke()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r4 = r4.floatValue()
            float r7 = r7 - r4
            goto L3b
        L3a:
            r7 = r6
        L3b:
            if (r3 == 0) goto L51
            if (r5 == 0) goto L51
            fg.a r4 = r3.f3156a
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r5 = r5.floatValue()
            float r4 = r4 - r5
            goto L52
        L51:
            r4 = r6
        L52:
            int r5 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r5 != 0) goto L5b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L5b
            goto Lc1
        L5b:
            int r4 = r1.f21881g
            int r4 = r0.t(r4)
            f.k r5 = r0.l()
            int r6 = r0.f22173q
            java.lang.Object r5 = r5.b(r6)
            f2.r r5 = (f2.r) r5
            if (r5 == 0) goto L7c
            h3.g r6 = r0.f22175s     // Catch: java.lang.IllegalStateException -> L7c
            if (r6 == 0) goto L7c
            android.graphics.Rect r5 = r0.d(r5)     // Catch: java.lang.IllegalStateException -> L7c
            android.view.accessibility.AccessibilityNodeInfo r6 = r6.f5066a     // Catch: java.lang.IllegalStateException -> L7c
            r6.setBoundsInScreen(r5)     // Catch: java.lang.IllegalStateException -> L7c
        L7c:
            f.k r5 = r0.l()
            int r6 = r0.f22174r
            java.lang.Object r5 = r5.b(r6)
            f2.r r5 = (f2.r) r5
            if (r5 == 0) goto L97
            h3.g r6 = r0.f22176t     // Catch: java.lang.IllegalStateException -> L97
            if (r6 == 0) goto L97
            android.graphics.Rect r5 = r0.d(r5)     // Catch: java.lang.IllegalStateException -> L97
            android.view.accessibility.AccessibilityNodeInfo r6 = r6.f5066a     // Catch: java.lang.IllegalStateException -> L97
            r6.setBoundsInScreen(r5)     // Catch: java.lang.IllegalStateException -> L97
        L97:
            y1.t r5 = r0.f22166j
            r5.invalidate()
            f.k r5 = r0.l()
            java.lang.Object r5 = r5.b(r4)
            f2.r r5 = (f2.r) r5
            if (r5 == 0) goto Lc1
            f2.q r5 = r5.f3216a
            if (r5 == 0) goto Lc1
            x1.f0 r5 = r5.f3212c
            if (r5 == 0) goto Lc1
            if (r2 == 0) goto Lb7
            f.w r6 = r0.f22178v
            r6.h(r4, r2)
        Lb7:
            if (r3 == 0) goto Lbe
            f.w r6 = r0.f22179w
            r6.h(r4, r3)
        Lbe:
            r0.p(r5)
        Lc1:
            if (r2 == 0) goto Lcd
            fg.a r0 = r2.f3156a
            java.lang.Object r0 = r0.invoke()
            java.lang.Float r0 = (java.lang.Float) r0
            r1.f21883i = r0
        Lcd:
            if (r3 == 0) goto Ld9
            fg.a r0 = r3.f3156a
            java.lang.Object r0 = r0.invoke()
            java.lang.Float r0 = (java.lang.Float) r0
            r1.f21884j = r0
        Ld9:
            sf.n r0 = sf.n.f12433a
            return r0
        Ldc:
            java.lang.Object r0 = r9.f974h
            y1.t r0 = (y1.t) r0
            java.lang.Object r1 = r9.f975i
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r0 = y1.t.g(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        Led:
            java.lang.Object r0 = r9.f974h
            y1.t r0 = (y1.t) r0
            java.lang.Object r1 = r9.f975i
            android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            boolean r0 = y1.t.h(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        Lfe:
            java.lang.Object r0 = r9.f974h
            gg.u r0 = (gg.u) r0
            java.lang.Object r1 = r9.f975i
            x2.s r1 = (x2.s) r1
            i0.u r2 = v1.z0.f14057a
            java.lang.Object r1 = x1.k.h(r1, r2)
            r0.f4564g = r1
            sf.n r0 = sf.n.f12433a
            return r0
        L111:
            java.lang.Object r0 = r9.f974h
            fg.l r0 = (fg.l) r0
            f1.o0 r1 = x1.i1.T
            r0.invoke(r1)
            java.lang.Object r0 = r9.f975i
            x1.i1 r0 = (x1.i1) r0
            f1.r0 r2 = r0.J
            f1.r0 r3 = r1.f3094s
            boolean r2 = gg.l.a(r2, r3)
            boolean r3 = r0.K
            boolean r4 = r1.f3095t
            r5 = 1
            if (r3 == r4) goto L12f
            r3 = r5
            goto L130
        L12f:
            r3 = 0
        L130:
            if (r2 == 0) goto L134
            if (r3 == 0) goto L149
        L134:
            f1.r0 r6 = r1.f3094s
            r0.J = r6
            r0.K = r4
            boolean r6 = r0.L
            if (r6 == 0) goto L149
            if (r3 != 0) goto L144
            if (r4 == 0) goto L149
            if (r2 != 0) goto L149
        L144:
            x1.f0 r2 = r0.f20943u
            r2.E()
        L149:
            r0.L = r5
            f1.r0 r0 = r1.f3094s
            long r2 = r1.f3097v
            u2.m r4 = r1.f3099x
            u2.c r5 = r1.f3098w
            f1.c0 r0 = r0.a(r2, r4, r5)
            r1.A = r0
            sf.n r0 = sf.n.f12433a
            return r0
        L15c:
            java.lang.Object r0 = r9.f974h
            x1.f0 r0 = (x1.f0) r0
            x1.b1 r0 = r0.L
            java.lang.Object r1 = r9.f975i
            gg.u r1 = (gg.u) r1
            y0.n r2 = r0.f20844f
            int r2 = r2.f21822j
            r2 = r2 & 8
            if (r2 == 0) goto L1e7
            x1.b2 r0 = r0.f20843e
        L170:
            if (r0 == 0) goto L1e7
            int r2 = r0.f21821i
            r2 = r2 & 8
            if (r2 == 0) goto L1e4
            r2 = 0
            r3 = r0
            r4 = r2
        L17b:
            if (r3 == 0) goto L1e4
            boolean r5 = r3 instanceof x1.z1
            r6 = 1
            if (r5 == 0) goto L1a7
            x1.z1 r3 = (x1.z1) r3
            boolean r5 = r3.c0()
            if (r5 == 0) goto L193
            f2.m r5 = new f2.m
            r5.<init>()
            r1.f4564g = r5
            r5.f3207j = r6
        L193:
            boolean r5 = r3.S0()
            if (r5 == 0) goto L19f
            java.lang.Object r5 = r1.f4564g
            f2.m r5 = (f2.m) r5
            r5.f3206i = r6
        L19f:
            java.lang.Object r5 = r1.f4564g
            f2.y r5 = (f2.y) r5
            r3.X0(r5)
            goto L1df
        L1a7:
            int r5 = r3.f21821i
            r5 = r5 & 8
            if (r5 == 0) goto L1df
            boolean r5 = r3 instanceof x1.j
            if (r5 == 0) goto L1df
            r5 = r3
            x1.j r5 = (x1.j) r5
            y0.n r5 = r5.f20950v
            r7 = 0
        L1b7:
            if (r5 == 0) goto L1dc
            int r8 = r5.f21821i
            r8 = r8 & 8
            if (r8 == 0) goto L1d9
            int r7 = r7 + 1
            if (r7 != r6) goto L1c5
            r3 = r5
            goto L1d9
        L1c5:
            if (r4 != 0) goto L1d0
            j0.b r4 = new j0.b
            r8 = 16
            y0.n[] r8 = new y0.n[r8]
            r4.<init>(r8)
        L1d0:
            if (r3 == 0) goto L1d6
            r4.b(r3)
            r3 = r2
        L1d6:
            r4.b(r5)
        L1d9:
            y0.n r5 = r5.f21824l
            goto L1b7
        L1dc:
            if (r7 != r6) goto L1df
            goto L17b
        L1df:
            y0.n r3 = x1.k.e(r4)
            goto L17b
        L1e4:
            y0.n r0 = r0.f21823k
            goto L170
        L1e7:
            sf.n r0 = sf.n.f12433a
            return r0
        L1ea:
            java.lang.Object r0 = r9.f974h
            s1.d r0 = (s1.d) r0
            java.lang.Object r1 = r9.f975i
            y0.n r1 = (y0.n) r1
            r0.d(r1)
            sf.n r0 = sf.n.f12433a
            return r0
        L1f8:
            java.lang.Object r0 = r9.f974h
            gg.u r0 = (gg.u) r0
            java.lang.Object r1 = r9.f975i
            d1.b0 r1 = (d1.b0) r1
            d1.t r1 = r1.m1()
            r0.f4564g = r1
            sf.n r0 = sf.n.f12433a
            return r0
        L209:
            java.lang.Object r0 = r9.f974h
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L217
            java.lang.Object r0 = r0.invoke()
            e1.c r0 = (e1.c) r0
            if (r0 != 0) goto L236
        L217:
            java.lang.Object r0 = r9.f975i
            x1.i1 r0 = (x1.i1) r0
            y0.n r1 = r0.r1()
            boolean r1 = r1.f21832t
            r2 = 0
            if (r1 == 0) goto L225
            goto L226
        L225:
            r0 = r2
        L226:
            if (r0 == 0) goto L235
            long r0 = r0.f13902i
            long r0 = r9.e0.q0(r0)
            r2 = 0
            e1.c r0 = ac.p.a(r2, r0)
            goto L236
        L235:
            r0 = r2
        L236:
            return r0
        L237:
            java.lang.Object r0 = r9.f974h
            c1.c r0 = (c1.c) r0
            fg.l r0 = r0.f978w
            java.lang.Object r1 = r9.f975i
            c1.d r1 = (c1.d) r1
            r0.invoke(r1)
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
