package b1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f440j;

    public g(d1.b0 r2, d1.p r3, fg.l r4) {
            r1 = this;
            r0 = 1
            r1.f437g = r0
            r1.f438h = r2
            r1.f439i = r3
            gg.m r4 = (gg.m) r4
            r1.f440j = r4
            r2 = 1
            r1.<init>(r2)
            return
    }

    public /* synthetic */ g(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f437g = r4
            r0.f438h = r1
            r0.f439i = r2
            r0.f440j = r3
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r17) {
            r16 = this;
            r1 = r16
            int r0 = r1.f437g
            switch(r0) {
                case 0: goto L1d1;
                case 1: goto L19b;
                case 2: goto L186;
                case 3: goto L130;
                case 4: goto Lfc;
                case 5: goto L4e;
                default: goto L7;
            }
        L7:
            r0 = r17
            h1.d r0 = (h1.d) r0
            java.lang.Object r2 = r1.f438h
            x2.v r2 = (x2.v) r2
            java.lang.Object r3 = r1.f439i
            x1.f0 r3 = (x1.f0) r3
            java.lang.Object r4 = r1.f440j
            x2.v r4 = (x2.v) r4
            b5.c r0 = r0.z0()
            f1.u r0 = r0.p()
            android.view.View r5 = r2.getView()
            int r5 = r5.getVisibility()
            r6 = 8
            if (r5 == r6) goto L4b
            r5 = 1
            r2.E = r5
            x1.r1 r3 = r3.f20902t
            boolean r5 = r3 instanceof y1.t
            if (r5 == 0) goto L37
            y1.t r3 = (y1.t) r3
            goto L38
        L37:
            r3 = 0
        L38:
            if (r3 == 0) goto L48
            android.graphics.Canvas r0 = f1.c.a(r0)
            y1.r0 r3 = r3.getAndroidViewsHandler$ui()
            r3.getClass()
            r4.draw(r0)
        L48:
            r0 = 0
            r2.E = r0
        L4b:
            sf.n r0 = sf.n.f12433a
            return r0
        L4e:
            r0 = r17
            h1.d r0 = (h1.d) r0
            java.lang.Object r2 = r1.f438h
            x1.h0 r2 = (x1.h0) r2
            h1.b r3 = r2.f20932g
            x1.m r4 = r2.f20933h
            java.lang.Object r5 = r1.f439i
            x1.m r5 = (x1.m) r5
            r2.f20933h = r5
            b5.c r5 = r0.z0()     // Catch: java.lang.Throwable -> Lf7
            u2.c r5 = r5.s()     // Catch: java.lang.Throwable -> Lf7
            b5.c r6 = r0.z0()     // Catch: java.lang.Throwable -> Lf7
            u2.m r6 = r6.u()     // Catch: java.lang.Throwable -> Lf7
            b5.c r7 = r0.z0()     // Catch: java.lang.Throwable -> Lf7
            f1.u r7 = r7.p()     // Catch: java.lang.Throwable -> Lf7
            b5.c r8 = r0.z0()     // Catch: java.lang.Throwable -> Lf7
            long r8 = r8.v()     // Catch: java.lang.Throwable -> Lf7
            b5.c r0 = r0.z0()     // Catch: java.lang.Throwable -> Lf7
            java.lang.Object r0 = r0.f470b     // Catch: java.lang.Throwable -> Lf7
            i1.b r0 = (i1.b) r0     // Catch: java.lang.Throwable -> Lf7
            java.lang.Object r10 = r1.f440j     // Catch: java.lang.Throwable -> Lf7
            fg.l r10 = (fg.l) r10     // Catch: java.lang.Throwable -> Lf7
            b5.c r11 = r3.f5038h     // Catch: java.lang.Throwable -> Lf7
            u2.c r11 = r11.s()     // Catch: java.lang.Throwable -> Lf7
            b5.c r12 = r3.f5038h     // Catch: java.lang.Throwable -> Lf7
            u2.m r12 = r12.u()     // Catch: java.lang.Throwable -> Lf7
            b5.c r13 = r3.f5038h     // Catch: java.lang.Throwable -> Lf7
            f1.u r13 = r13.p()     // Catch: java.lang.Throwable -> Lf7
            b5.c r14 = r3.f5038h     // Catch: java.lang.Throwable -> Lf7
            long r14 = r14.v()     // Catch: java.lang.Throwable -> Lf7
            b5.c r1 = r3.f5038h     // Catch: java.lang.Throwable -> Lf7
            r17 = r4
            java.lang.Object r4 = r1.f470b     // Catch: java.lang.Throwable -> Lda
            i1.b r4 = (i1.b) r4     // Catch: java.lang.Throwable -> Lda
            r1.R(r5)     // Catch: java.lang.Throwable -> Lda
            r1.S(r6)     // Catch: java.lang.Throwable -> Lda
            r1.P(r7)     // Catch: java.lang.Throwable -> Lda
            r1.U(r8)     // Catch: java.lang.Throwable -> Lda
            r1.f470b = r0     // Catch: java.lang.Throwable -> Lda
            r7.e()     // Catch: java.lang.Throwable -> Lda
            r10.invoke(r2)     // Catch: java.lang.Throwable -> Lde
            r7.p()     // Catch: java.lang.Throwable -> Lda
            b5.c r0 = r3.f5038h     // Catch: java.lang.Throwable -> Lda
            r0.R(r11)     // Catch: java.lang.Throwable -> Lda
            r0.S(r12)     // Catch: java.lang.Throwable -> Lda
            r0.P(r13)     // Catch: java.lang.Throwable -> Lda
            r0.U(r14)     // Catch: java.lang.Throwable -> Lda
            r0.f470b = r4     // Catch: java.lang.Throwable -> Lda
            r1 = r17
            r2.f20933h = r1
            sf.n r0 = sf.n.f12433a
            return r0
        Lda:
            r0 = move-exception
            r1 = r17
            goto Lf9
        Lde:
            r0 = move-exception
            r1 = r17
            r7.p()     // Catch: java.lang.Throwable -> Lf5
            b5.c r3 = r3.f5038h     // Catch: java.lang.Throwable -> Lf5
            r3.R(r11)     // Catch: java.lang.Throwable -> Lf5
            r3.S(r12)     // Catch: java.lang.Throwable -> Lf5
            r3.P(r13)     // Catch: java.lang.Throwable -> Lf5
            r3.U(r14)     // Catch: java.lang.Throwable -> Lf5
            r3.f470b = r4     // Catch: java.lang.Throwable -> Lf5
            throw r0     // Catch: java.lang.Throwable -> Lf5
        Lf5:
            r0 = move-exception
            goto Lf9
        Lf7:
            r0 = move-exception
            r1 = r4
        Lf9:
            r2.f20933h = r1
            throw r0
        Lfc:
            r0 = r17
            h.f0 r0 = (h.f0) r0
            r1 = r16
            java.lang.Object r2 = r1.f440j
            h.s0 r2 = (h.s0) r2
            int r0 = r0.ordinal()
            r3 = 0
            if (r0 == 0) goto L121
            r4 = 1
            if (r0 == r4) goto L11b
            r4 = 2
            if (r0 != r4) goto L116
            h.h1 r0 = r2.f4753a
            goto L123
        L116:
            okio.a.k()
            r0 = 0
            goto L12f
        L11b:
            java.lang.Object r0 = r1.f438h
            r3 = r0
            f1.u0 r3 = (f1.u0) r3
            goto L123
        L121:
            h.h1 r0 = r2.f4753a
        L123:
            if (r3 == 0) goto L128
            long r2 = r3.f3124a
            goto L12a
        L128:
            long r2 = f1.u0.f3122b
        L12a:
            f1.u0 r0 = new f1.u0
            r0.<init>(r2)
        L12f:
            return r0
        L130:
            r0 = r17
            f1.d0 r0 = (f1.d0) r0
            java.lang.Object r2 = r1.f439i
            i0.l2 r2 = (i0.l2) r2
            java.lang.Object r3 = r1.f438h
            i0.l2 r3 = (i0.l2) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L14b
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            goto L14c
        L14b:
            r3 = r4
        L14c:
            r0.n(r3)
            if (r2 == 0) goto L15c
            java.lang.Object r3 = r2.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            goto L15d
        L15c:
            r3 = r4
        L15d:
            r0.q(r3)
            if (r2 == 0) goto L16c
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r4 = r2.floatValue()
        L16c:
            r0.i(r4)
            java.lang.Object r2 = r1.f440j
            i0.l2 r2 = (i0.l2) r2
            if (r2 == 0) goto L17e
            java.lang.Object r2 = r2.getValue()
            f1.u0 r2 = (f1.u0) r2
            long r2 = r2.f3124a
            goto L180
        L17e:
            long r2 = f1.u0.f3122b
        L180:
            r0.H0(r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L186:
            r0 = r17
            i0.a0 r0 = (i0.a0) r0
            java.lang.Object r0 = r1.f438h
            w0.p r0 = (w0.p) r0
            java.lang.Object r2 = r1.f440j
            h.t r2 = (h.t) r2
            h.f r3 = new h.f
            r4 = 0
            java.lang.Object r5 = r1.f439i
            r3.<init>(r0, r5, r2, r4)
            return r3
        L19b:
            r0 = r17
            d1.b0 r0 = (d1.b0) r0
            java.lang.Object r2 = r1.f438h
            d1.b0 r2 = (d1.b0) r2
            boolean r2 = gg.l.a(r0, r2)
            if (r2 == 0) goto L1ab
            r0 = 0
            goto L1c5
        L1ab:
            java.lang.Object r2 = r1.f439i
            d1.p r2 = (d1.p) r2
            d1.b0 r2 = r2.f1936c
            boolean r2 = gg.l.a(r0, r2)
            if (r2 != 0) goto L1ca
            java.lang.Object r2 = r1.f440j
            gg.m r2 = (gg.m) r2
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L1c5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L1d0
        L1ca:
            java.lang.String r0 = "Focus search landed at the root."
            j8.o.A(r0)
            r0 = 0
        L1d0:
            return r0
        L1d1:
            r0 = r17
            x1.e2 r0 = (x1.e2) r0
            r2 = r0
            b1.h r2 = (b1.h) r2
            java.lang.Object r3 = r1.f439i
            b1.h r3 = (b1.h) r3
            x1.r1 r3 = x1.k.x(r3)
            y1.t r3 = (y1.t) r3
            b1.c r3 = r3.m183getDragAndDropManager()
            b1.b r3 = (b1.b) r3
            f.f r3 = r3.f430b
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L207
            java.lang.Object r3 = r1.f440j
            androidx.lifecycle.x r3 = (androidx.lifecycle.x) r3
            long r3 = x6.d.C(r3)
            boolean r2 = r9.e0.h(r2, r3)
            if (r2 == 0) goto L207
            java.lang.Object r2 = r1.f438h
            gg.u r2 = (gg.u) r2
            r2.f4564g = r0
            x1.d2 r0 = x1.d2.f20874i
            goto L209
        L207:
            x1.d2 r0 = x1.d2.f20872g
        L209:
            return r0
    }
}
