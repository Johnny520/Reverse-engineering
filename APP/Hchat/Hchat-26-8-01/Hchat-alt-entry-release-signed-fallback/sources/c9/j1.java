package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c9.j1 f1228a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Map f1229b = null;

    static {
            c9.j1 r0 = new c9.j1
            r0.<init>()
            c9.j1.f1228a = r0
            java.util.Map r0 = p.a.p()
            c9.j1.f1229b = r0
            return
    }

    public static final void m(c9.o2 r2, android.app.Activity r3, fg.a r4, fg.a r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, java.util.Set r10) {
            boolean r0 = r2 instanceof c9.g1
            if (r0 == 0) goto L11
            r0 = r2
            c9.g1 r0 = (c9.g1) r0
            java.lang.String r0 = r0.f1198b
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = c9.o2.e(r3, r10)
            if (r10 == 0) goto L1d
            java.lang.String r1 = "聊天分组已删除"
            goto L1f
        L1d:
            java.lang.String r1 = "删除聊天分组失败"
        L1f:
            p(r3, r1)
            if (r10 != 0) goto L25
            return
        L25:
            n(r5)
            if (r0 == 0) goto L2e
            r4.invoke()
            return
        L2e:
            o(r3, r2, r6, r7, r8)
            c9.e1 r2 = c9.e1.f1171h
            r9.setValue(r2)
            return
    }

    public static final void n(fg.a r2) {
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L5
            goto Lc
        L5:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        Lc:
            java.lang.Throwable r2 = sf.g.b(r2)
            if (r2 == 0) goto L1b
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = "[Hchat:ConversationGroup] 刷新聊天分组失败: "
            eh.a.x(r1, r0, r2)
        L1b:
            return
    }

    public static final void o(android.app.Activity r4, c9.o2 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8) {
            java.util.List r4 = c9.o2.i(r4)
            r6.setValue(r4)
            java.lang.Object r4 = r6.getValue()
            java.util.List r4 = (java.util.List) r4
            java.lang.String r4 = s(r5, r4)
            r7.setValue(r4)
            java.lang.Object r4 = r8.getValue()
            java.util.Set r4 = (java.util.Set) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L25:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L61
            java.lang.Object r7 = r4.next()
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r6.getValue()
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            if (r1 == 0) goto L42
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L42
            goto L5b
        L42:
            java.util.Iterator r1 = r1.iterator()
        L46:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r1.next()
            c9.a r3 = (c9.a) r3
            java.lang.String r3 = r3.f1081a
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L46
            r2 = 1
        L5b:
            if (r2 == 0) goto L25
            r5.add(r7)
            goto L25
        L61:
            r8.setValue(r5)
            return
    }

    public static final void p(android.app.Activity r1, java.lang.String r2) {
            r0 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r0)
            r1.show()
            return
    }

    public static java.lang.String s(c9.o2 r4, java.util.List r5) {
            boolean r0 = r4 instanceof c9.f1
            if (r0 == 0) goto Ld
            c9.f1 r4 = (c9.f1) r4
            java.lang.String r4 = r4.f1190b
            java.lang.String r4 = c9.o2.d(r4, r5)
            return r4
        Ld:
            boolean r0 = r4 instanceof c9.g1
            if (r0 == 0) goto L3a
            java.util.Iterator r5 = r5.iterator()
        L15:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L31
            java.lang.Object r0 = r5.next()
            r2 = r0
            c9.a r2 = (c9.a) r2
            java.lang.String r2 = r2.f1081a
            r3 = r4
            c9.g1 r3 = (c9.g1) r3
            java.lang.String r3 = r3.f1198b
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L15
            goto L32
        L31:
            r0 = r1
        L32:
            c9.a r0 = (c9.a) r0
            if (r0 == 0) goto L39
            java.lang.String r4 = r0.f1083c
            return r4
        L39:
            return r1
        L3a:
            okio.a.k()
            r4 = 0
            return r4
    }

    public static java.util.ArrayList t(java.util.List r6) {
            java.util.ArrayList r6 = c9.o2.l(r6)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        Ld:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r6.next()
            r2 = r1
            c9.a r2 = (c9.a) r2
            java.lang.String r2 = r2.f1083c
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L2a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r2, r3)
        L2a:
            java.util.List r3 = (java.util.List) r3
            r3.add(r1)
            goto Ld
        L30:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r4 = 0
            tf.t r5 = tf.t.f13167g
            r3 = 0
            u(r0, r1, r2, r3, r4, r5)
            return r2
    }

    public static final void u(java.util.LinkedHashMap r10, java.util.HashSet r11, java.util.ArrayList r12, java.lang.String r13, int r14, java.util.List r15) {
            java.lang.Object r13 = r10.get(r13)
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto La
            tf.t r13 = tf.t.f13167g
        La:
            c9.h1 r0 = new c9.h1
            r1 = 0
            r0.<init>(r1)
            java.util.List r13 = tf.m.K1(r13, r0)
            java.util.Iterator r13 = r13.iterator()
        L18:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r13.next()
            c9.a r0 = (c9.a) r0
            java.lang.String r1 = r0.f1081a
            java.lang.String r2 = r0.f1082b
            boolean r1 = r11.add(r1)
            if (r1 != 0) goto L32
            r3 = r10
            r4 = r11
            r5 = r12
            goto L56
        L32:
            java.util.ArrayList r3 = tf.m.G1(r15, r2)
            c9.c1 r1 = new c9.c1
            java.lang.String r9 = r0.f1081a
            r7 = 0
            r8 = 62
            java.lang.String r4 = " / "
            r5 = 0
            r6 = 0
            java.lang.String r4 = tf.m.A1(r3, r4, r5, r6, r7, r8)
            r1.<init>(r14, r9, r2, r4)
            r12.add(r1)
            java.lang.String r6 = r0.f1081a
            int r7 = r14 + 1
            r4 = r11
            r5 = r12
            r8 = r3
            r3 = r10
            u(r3, r4, r5, r6, r7, r8)
        L56:
            r10 = r3
            r11 = r4
            r12 = r5
            goto L18
        L5a:
            return
    }

    public static void v(android.app.Activity r15, java.lang.String r16, fg.a r17) {
            r15.getClass()
            r16.getClass()
            java.lang.CharSequence r0 = og.m.R0(r16)
            java.lang.String r0 = r0.toString()
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L169
            boolean r1 = r15.isFinishing()
            if (r1 != 0) goto L169
            boolean r1 = r15.isDestroyed()
            if (r1 == 0) goto L22
            goto L169
        L22:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L3c
            ac.l r1 = new ac.l
            r3 = 5
            r4 = r17
            r1.<init>(r3, r15, r4, r0)
            r15.runOnUiThread(r1)
            return
        L3c:
            r4 = r17
            boolean r1 = c9.d2.q(r0)
            r6 = 0
            r7 = 0
            if (r1 != 0) goto L4d
            c9.f1 r1 = new c9.f1
            r1.<init>(r0)
        L4b:
            r3 = r1
            goto L87
        L4d:
            java.util.List r1 = c9.o2.i(r15)
            java.util.Iterator r1 = r1.iterator()
        L55:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r1.next()
            r5 = r3
            c9.a r5 = (c9.a) r5
            java.lang.String r5 = r5.f1081a
            java.lang.String r5 = c9.d2.F(r5)
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L55
            goto L70
        L6f:
            r3 = r7
        L70:
            c9.a r3 = (c9.a) r3
            if (r3 != 0) goto L7f
            java.lang.String r1 = "聊天分组不存在"
            android.widget.Toast r1 = android.widget.Toast.makeText(r15, r1, r6)
            r1.show()
            r3 = r7
            goto L87
        L7f:
            c9.g1 r1 = new c9.g1
            java.lang.String r3 = r3.f1081a
            r1.<init>(r3)
            goto L4b
        L87:
            if (r3 == 0) goto L169
            java.util.Map r8 = c9.j1.f1229b
            java.lang.Object r1 = r8.remove(r15)
            c9.d1 r1 = (c9.d1) r1
            if (r1 == 0) goto L96
            r1.close()
        L96:
            r2 = r0
            c9.k0 r0 = new c9.k0
            r5 = 1
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            s0.d r9 = new s0.d
            r1 = 1358702910(0x50fc293e, float:3.384449E10)
            r10 = 1
            r9.<init>(r1, r0, r10)
            android.view.Window r0 = r15.getWindow()
            if (r0 == 0) goto Lb2
            android.view.View r0 = r0.getDecorView()
            goto Lb3
        Lb2:
            r0 = r7
        Lb3:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto Lba
            r7 = r0
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
        Lba:
            r5 = r7
            if (r5 == 0) goto L15c
            c9.a1 r1 = new c9.a1
            r0 = 0
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r6)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r15)
            r4.setBackgroundColor(r6)
            r4.setClickable(r10)
            r4.setFocusable(r10)
            r4.setFocusableInTouchMode(r10)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r11 = -1
            r3.<init>(r11, r11)
            r4.setLayoutParams(r3)
            x6.d.H(r5, r1, r1, r1, r1)
            x6.d.H(r4, r1, r1, r1, r1)
            boolean r3 = r1.f1100l
            if (r3 != 0) goto Lf5
            p4.t r3 = r1.f1097i
            android.os.Bundle r6 = android.os.Bundle.EMPTY
            r3.F(r6)
            r1.f1100l = r10
        Lf5:
            androidx.lifecycle.s r3 = r1.f1096h
            java.lang.String r6 = "setCurrentState"
            r3.c(r6)
            androidx.lifecycle.l r7 = androidx.lifecycle.l.f291i
            r3.e(r7)
            r3.c(r6)
            androidx.lifecycle.l r7 = androidx.lifecycle.l.f292j
            r3.e(r7)
            r3.c(r6)
            androidx.lifecycle.l r6 = androidx.lifecycle.l.f293k
            r3.e(r6)
            gg.u r6 = new gg.u
            r6.<init>()
            r3 = r1
            r1 = r0
            c9.p0 r0 = new c9.p0
            r7 = 0
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r12 = r4
            r7 = r5
            r13 = r6
            r6 = r1
            y1.c1 r14 = new y1.c1
            r14.<init>(r15)
            x6.d.H(r14, r3, r3, r3, r3)
            y1.r1 r1 = y1.r1.f22061h
            r14.setViewCompositionStrategy(r1)
            r4 = r0
            c9.q0 r0 = new c9.q0
            r5 = 0
            r1 = r3
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            r0 = r4
            s0.d r3 = new s0.d
            r4 = 340971526(0x1452d006, float:1.0643316E-26)
            r3.<init>(r4, r1, r10)
            r14.setContent(r3)
            r13.f4564g = r14
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r11, r11)
            r12.addView(r14, r1)
            r7.addView(r12)
            r12.requestFocus()
            c9.i1 r1 = new c9.i1
            r1.<init>(r0, r6)
            goto L15e
        L15c:
            c9.b1 r1 = c9.b1.f1106a
        L15e:
            boolean r0 = r1.a()
            if (r0 == 0) goto L169
            java.util.Map r8 = (java.util.Map) r8
            r8.put(r15, r1)
        L169:
            return
    }

    public final void a(int r32, int r33, fg.a r34, i0.h0 r35, java.lang.String r36, java.lang.String r37, boolean r38) {
            r31 = this;
            r6 = r32
            r0 = r35
            r1 = 838758014(0x31fe6e7e, float:7.4049344E-9)
            r0.b0(r1)
            r1 = r6 & 6
            if (r1 != 0) goto L19
            boolean r1 = r35.f(r36)
            if (r1 == 0) goto L16
            r1 = 4
            goto L17
        L16:
            r1 = 2
        L17:
            r1 = r1 | r6
            goto L1a
        L19:
            r1 = r6
        L1a:
            r3 = r6 & 48
            if (r3 != 0) goto L2d
            r3 = r37
            boolean r4 = r0.f(r3)
            if (r4 == 0) goto L29
            r4 = 32
            goto L2b
        L29:
            r4 = 16
        L2b:
            r1 = r1 | r4
            goto L2f
        L2d:
            r3 = r37
        L2f:
            r4 = r6 & 384(0x180, float:5.38E-43)
            r11 = r34
            if (r4 != 0) goto L41
            boolean r4 = r0.h(r11)
            if (r4 == 0) goto L3e
            r4 = 256(0x100, float:3.59E-43)
            goto L40
        L3e:
            r4 = 128(0x80, float:1.8E-43)
        L40:
            r1 = r1 | r4
        L41:
            r4 = r33 & 8
            if (r4 == 0) goto L4a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L47:
            r5 = r38
            goto L5c
        L4a:
            r5 = r6 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L47
            r5 = r38
            boolean r7 = r0.g(r5)
            if (r7 == 0) goto L59
            r7 = 2048(0x800, float:2.87E-42)
            goto L5b
        L59:
            r7 = 1024(0x400, float:1.435E-42)
        L5b:
            r1 = r1 | r7
        L5c:
            r7 = r1 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            r13 = 0
            r14 = 1
            if (r7 == r8) goto L66
            r7 = r14
            goto L67
        L66:
            r7 = r13
        L67:
            r8 = r1 & 1
            boolean r7 = r0.S(r8, r7)
            if (r7 == 0) goto L1ea
            if (r4 == 0) goto L73
            r8 = r14
            goto L74
        L73:
            r8 = r5
        L74:
            y0.l r4 = y0.l.f21818a
            r5 = 1065353216(0x3f800000, float:1.0)
            y0.o r7 = p.h1.d(r4, r5)
            r9 = 10
            float r15 = (float) r9
            v.d r9 = v.e.a(r15)
            y0.o r7 = c1.h.b(r7, r9)
            r10 = 0
            r12 = 14
            r9 = 0
            y0.o r7 = k.n.j(r7, r8, r9, r10, r11, r12)
            r30 = r8
            r8 = 11
            float r8 = (float) r8
            y0.o r7 = p.d.m(r7, r15, r8)
            y0.f r8 = y0.b.f21802q
            p.c r9 = p.j.f9924a
            r10 = 48
            p.e1 r8 = p.d1.a(r9, r8, r0, r10)
            long r9 = r0.T
            int r9 = java.lang.Long.hashCode(r9)
            s0.h r10 = r0.l()
            y0.o r7 = y0.a.c(r0, r7)
            x1.f r11 = x1.g.f20914f
            r11.getClass()
            x1.y r11 = x1.f.f20883b
            r0.d0()
            boolean r12 = r0.S
            if (r12 == 0) goto Lc2
            r0.k(r11)
            goto Lc5
        Lc2:
            r0.n0()
        Lc5:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r0, r8)
            x1.e r8 = x1.f.f20885d
            i0.r.A(r8, r0, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            x1.e r10 = x1.f.f20887f
            i0.r.A(r10, r0, r9)
            x1.d r9 = x1.f.f20888g
            i0.r.w(r9, r0)
            x1.e r15 = x1.f.f20884c
            i0.r.A(r15, r0, r7)
            double r2 = (double) r5
            r16 = 0
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto Lea
            goto Lef
        Lea:
            java.lang.String r2 = "invalid weight; must be greater than zero"
            q.a.a(r2)
        Lef:
            p.q0 r2 = new p.q0
            r2.<init>(r5, r14)
            p.e r3 = p.j.f9926c
            y0.e r7 = y0.b.f21804s
            p.t r3 = p.s.a(r3, r7, r0, r13)
            long r5 = r0.T
            int r5 = java.lang.Long.hashCode(r5)
            s0.h r6 = r0.l()
            y0.o r2 = y0.a.c(r0, r2)
            r0.d0()
            boolean r7 = r0.S
            if (r7 == 0) goto L115
            r0.k(r11)
            goto L118
        L115:
            r0.n0()
        L118:
            i0.r.A(r12, r0, r3)
            i0.r.A(r8, r0, r6)
            j8.b.p(r5, r0, r10, r0, r9)
            i0.r.A(r15, r0, r2)
            if (r30 == 0) goto L13d
            r2 = -83009554(0xfffffffffb0d5fee, float:-7.3405954E35)
            r0.a0(r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r0.j(r2)
            bi.b r2 = (bi.b) r2
            long r2 = r2.g()
            r0.p(r13)
        L13b:
            r9 = r2
            goto L15a
        L13d:
            r2 = -82923622(0xfffffffffb0eaf9a, float:-7.408678E35)
            r0.a0(r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r0.j(r2)
            bi.b r2 = (bi.b) r2
            long r2 = r2.g()
            r5 = 1052938076(0x3ec28f5c, float:0.38)
            long r2 = f1.w.b(r2, r5)
            r0.p(r13)
            goto L13b
        L15a:
            r2 = 15
            long r11 = x6.d.D(r2)
            m2.k r13 = m2.k.f8698j
            r2 = r1 & 14
            r3 = 1597440(0x186000, float:2.23849E-39)
            r27 = r2 | r3
            r28 = 0
            r29 = 262058(0x3ffaa, float:3.67221E-40)
            r8 = 0
            r2 = r14
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r7 = r36
            r26 = r0
            sh.s.n(r7, r8, r9, r11, r13, r14, r15, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r3 = r0.j(r3)
            bi.b r3 = (bi.b) r3
            long r5 = r3.h()
            if (r30 == 0) goto L19b
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L19e
        L19b:
            r3 = 1055286886(0x3ee66666, float:0.45)
        L19e:
            long r9 = f1.w.b(r5, r3)
            r3 = 12
            long r11 = x6.d.D(r3)
            r3 = 2
            float r3 = (float) r3
            r19 = 0
            r20 = 13
            r16 = 0
            r18 = 0
            r17 = r3
            r15 = r4
            y0.o r8 = p.d.p(r15, r16, r17, r18, r19, r20)
            int r1 = r1 >> 3
            r1 = r1 & 14
            r1 = r1 | 24624(0x6030, float:3.4506E-41)
            r28 = 0
            r29 = 262120(0x3ffe8, float:3.67308E-40)
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r7 = r37
            r26 = r0
            r27 = r1
            sh.s.n(r7, r8, r9, r11, r13, r14, r15, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0.p(r2)
            r0.p(r2)
            r5 = r30
            goto L1ed
        L1ea:
            r0.V()
        L1ed:
            i0.r1 r8 = r0.t()
            if (r8 == 0) goto L206
            c9.l0 r0 = new c9.l0
            r1 = r31
            r6 = r32
            r7 = r33
            r4 = r34
            r2 = r36
            r3 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        L206:
            return
    }

    public final void b(java.util.List r36, java.lang.String r37, java.lang.String r38, fg.l r39, fg.l r40, fg.a r41, fg.a r42, i0.h0 r43, int r44) {
            r35 = this;
            r4 = r38
            r6 = r40
            r11 = r43
            r0 = 820144010(0x30e2678a, float:1.6473092E-9)
            r11.b0(r0)
            r2 = r36
            boolean r0 = r11.f(r2)
            r1 = 4
            if (r0 == 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = 2
        L18:
            r0 = r44 | r0
            r12 = r37
            boolean r3 = r11.f(r12)
            if (r3 == 0) goto L25
            r3 = 32
            goto L27
        L25:
            r3 = 16
        L27:
            r0 = r0 | r3
            boolean r3 = r11.f(r4)
            if (r3 == 0) goto L31
            r3 = 256(0x100, float:3.59E-43)
            goto L33
        L31:
            r3 = 128(0x80, float:1.8E-43)
        L33:
            r0 = r0 | r3
            r10 = r39
            boolean r3 = r11.h(r10)
            if (r3 == 0) goto L3f
            r3 = 2048(0x800, float:2.87E-42)
            goto L41
        L3f:
            r3 = 1024(0x400, float:1.435E-42)
        L41:
            r0 = r0 | r3
            boolean r3 = r11.h(r6)
            if (r3 == 0) goto L4b
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L4d
        L4b:
            r3 = 8192(0x2000, float:1.148E-41)
        L4d:
            r0 = r0 | r3
            r3 = r41
            boolean r7 = r11.h(r3)
            if (r7 == 0) goto L59
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L5b
        L59:
            r7 = 65536(0x10000, float:9.1835E-41)
        L5b:
            r0 = r0 | r7
            r7 = r42
            boolean r8 = r11.h(r7)
            if (r8 == 0) goto L67
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L69
        L67:
            r8 = 524288(0x80000, float:7.34684E-40)
        L69:
            r0 = r0 | r8
            r8 = 599187(0x92493, float:8.3964E-40)
            r8 = r8 & r0
            r9 = 599186(0x92492, float:8.39638E-40)
            r13 = 0
            r14 = 1
            if (r8 == r9) goto L77
            r8 = r14
            goto L78
        L77:
            r8 = r13
        L78:
            r9 = r0 & 1
            boolean r8 = r11.S(r9, r8)
            if (r8 == 0) goto L204
            r8 = r0 & 14
            if (r8 == r1) goto L86
            r8 = r13
            goto L87
        L86:
            r8 = r14
        L87:
            java.lang.Object r9 = r11.P()
            i0.e r5 = i0.l.f5952a
            if (r8 != 0) goto L91
            if (r9 != r5) goto L98
        L91:
            java.util.ArrayList r9 = t(r2)
            r11.k0(r9)
        L98:
            java.util.List r9 = (java.util.List) r9
            y0.l r8 = y0.l.f21818a
            r15 = 1065353216(0x3f800000, float:1.0)
            y0.o r1 = p.h1.d(r8, r15)
            r15 = 580(0x244, float:8.13E-43)
            float r15 = (float) r15
            r17 = r9
            r9 = 0
            y0.o r1 = p.h1.g(r1, r9, r15, r14)
            p.e r15 = p.j.f9926c
            y0.e r9 = y0.b.f21804s
            p.t r9 = p.s.a(r15, r9, r11, r13)
            long r13 = r11.T
            int r13 = java.lang.Long.hashCode(r13)
            s0.h r14 = r11.l()
            y0.o r1 = y0.a.c(r11, r1)
            x1.f r20 = x1.g.f20914f
            r20.getClass()
            x1.y r15 = x1.f.f20883b
            r11.d0()
            boolean r2 = r11.S
            if (r2 == 0) goto Ld4
            r11.k(r15)
            goto Ld7
        Ld4:
            r11.n0()
        Ld7:
            x1.e r2 = x1.f.f20886e
            i0.r.A(r2, r11, r9)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r11, r14)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            x1.e r9 = x1.f.f20887f
            i0.r.A(r9, r11, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r11)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r11, r1)
            java.lang.String r1 = "添加聊天分组"
            r2 = 54
            c9.j1 r7 = c9.j1.f1228a
            r7.r(r1, r11, r2)
            int r1 = r0 >> 3
            r2 = r1 & 14
            r2 = r2 | 24624(0x6030, float:3.4506E-41)
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r9 = 8
            java.lang.String r13 = "分组名称"
            r14 = 0
            r16 = r8
            r2 = r17
            r15 = 0
            r17 = 4
            r8 = r1
            r1 = 0
            r7.g(r8, r9, r10, r11, r12, r13, r14)
            r31 = r7
            i0.m2 r7 = bi.d.f892a
            java.lang.Object r7 = r11.j(r7)
            bi.b r7 = (bi.b) r7
            long r9 = r7.h()
            r7 = 12
            long r11 = x6.d.D(r7)
            r8 = r17
            float r8 = (float) r8
            float r7 = (float) r7
            r19 = 0
            r21 = 4
            r20 = r8
            r18 = r7
            r17 = r8
            y0.o r8 = p.d.p(r16, r17, r18, r19, r20, r21)
            r28 = 0
            r29 = 262120(0x3ffe8, float:3.67308E-40)
            java.lang.String r7 = "上级分组"
            r13 = 0
            r18 = r15
            r17 = r16
            r15 = 0
            r19 = r17
            r17 = 0
            r20 = r18
            r21 = r19
            r18 = 0
            r24 = r20
            r20 = 0
            r25 = r21
            r21 = 0
            r26 = 16384(0x4000, float:2.2959E-41)
            r22 = 0
            r27 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r32 = r24
            r24 = 0
            r33 = r25
            r25 = 0
            r34 = r27
            r27 = 24630(0x6036, float:3.4514E-41)
            r26 = r43
            r3 = r33
            r1 = r34
            sh.s.n(r7, r8, r9, r11, r13, r14, r15, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r11 = r26
            y0.o r3 = p.h1.d(r3, r1)
            double r7 = (double) r1
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L188
            goto L18d
        L188:
            java.lang.String r7 = "invalid weight; must be greater than zero"
            q.a.a(r7)
        L18d:
            p.q0 r7 = new p.q0
            r15 = 0
            r7.<init>(r1, r15)
            y0.o r1 = r3.d(r7)
            r3 = 280(0x118, float:3.92E-43)
            float r3 = (float) r3
            r7 = 0
            r8 = 1
            y0.o r7 = p.h1.g(r1, r7, r3, r8)
            r1 = r0 & 896(0x380, float:1.256E-42)
            r3 = 256(0x100, float:3.59E-43)
            if (r1 != r3) goto L1a8
            r13 = r8
            goto L1a9
        L1a8:
            r13 = r15
        L1a9:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r0
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r1 != r3) goto L1b2
            r15 = r8
        L1b2:
            r1 = r13 | r15
            boolean r3 = r11.h(r2)
            r1 = r1 | r3
            java.lang.Object r3 = r11.P()
            if (r1 != 0) goto L1c1
            if (r3 != r5) goto L1ca
        L1c1:
            c9.y0 r3 = new c9.y0
            r1 = 0
            r3.<init>(r2, r4, r6, r1)
            r11.k0(r3)
        L1ca:
            r15 = r3
            fg.l r15 = (fg.l) r15
            r17 = 0
            r18 = 510(0x1fe, float:7.15E-43)
            r30 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = r43
            r1 = r30
            a.a.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            int r2 = r0 >> 12
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 196998(0x30186, float:2.76053E-40)
            r2 = r2 | r3
            int r0 = r0 >> 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r13 = r2 | r0
            r14 = 16
            java.lang.String r9 = "添加"
            r11 = 0
            r8 = r41
            r10 = r42
            r12 = r43
            r7 = r31
            r7.f(r8, r9, r10, r11, r12, r13, r14)
            r11 = r12
            r11.p(r1)
            goto L207
        L204:
            r11.V()
        L207:
            i0.r1 r10 = r11.t()
            if (r10 == 0) goto L222
            c9.d0 r0 = new c9.d0
            r1 = r35
            r2 = r36
            r3 = r37
            r5 = r39
            r7 = r41
            r8 = r42
            r9 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f6035d = r0
        L222:
            return
    }

    public final void c(java.lang.String r26, java.lang.String r27, fg.a r28, fg.a r29, i0.h0 r30, int r31) {
            r25 = this;
            r5 = r30
            r0 = 1143552259(0x44293903, float:676.8908)
            r5.b0(r0)
            r0 = r31 & 6
            if (r0 != 0) goto L1c
            r0 = r26
            boolean r1 = r5.f(r0)
            if (r1 == 0) goto L16
            r1 = 4
            goto L17
        L16:
            r1 = 2
        L17:
            r1 = r31 | r1
        L19:
            r2 = r28
            goto L21
        L1c:
            r0 = r26
            r1 = r31
            goto L19
        L21:
            boolean r3 = r5.h(r2)
            if (r3 == 0) goto L2a
            r3 = 256(0x100, float:3.59E-43)
            goto L2c
        L2a:
            r3 = 128(0x80, float:1.8E-43)
        L2c:
            r1 = r1 | r3
            r3 = r29
            boolean r4 = r5.h(r3)
            if (r4 == 0) goto L38
            r4 = 2048(0x800, float:2.87E-42)
            goto L3a
        L38:
            r4 = 1024(0x400, float:1.435E-42)
        L3a:
            r1 = r1 | r4
            r4 = r1 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            r7 = 0
            r8 = 1
            if (r4 == r6) goto L45
            r4 = r8
            goto L46
        L45:
            r4 = r7
        L46:
            r6 = r1 & 1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L112
            y0.l r4 = y0.l.f21818a
            r6 = 1065353216(0x3f800000, float:1.0)
            y0.o r9 = p.h1.d(r4, r6)
            p.e r10 = p.j.f9926c
            y0.e r11 = y0.b.f21804s
            p.t r7 = p.s.a(r10, r11, r5, r7)
            long r10 = r5.T
            int r10 = java.lang.Long.hashCode(r10)
            s0.h r11 = r5.l()
            y0.o r9 = y0.a.c(r5, r9)
            x1.f r12 = x1.g.f20914f
            r12.getClass()
            x1.y r12 = x1.f.f20883b
            r5.d0()
            boolean r13 = r5.S
            if (r13 == 0) goto L7e
            r5.k(r12)
            goto L81
        L7e:
            r5.n0()
        L81:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r5, r7)
            x1.e r7 = x1.f.f20885d
            i0.r.A(r7, r5, r11)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            x1.e r10 = x1.f.f20887f
            i0.r.A(r10, r5, r7)
            x1.d r7 = x1.f.f20888g
            i0.r.w(r7, r5)
            x1.e r7 = x1.f.f20884c
            i0.r.A(r7, r5, r9)
            i0.m2 r7 = bi.d.f892a
            java.lang.Object r7 = r5.j(r7)
            bi.b r7 = (bi.b) r7
            long r9 = r7.h()
            r7 = 14
            long r11 = x6.d.D(r7)
            y0.o r4 = p.h1.d(r4, r6)
            r6 = 8
            float r6 = (float) r6
            r7 = 0
            y0.o r4 = p.d.n(r4, r7, r6, r8)
            r6 = r1 & 14
            r6 = r6 | 24624(0x6030, float:3.4506E-41)
            r21 = 0
            r22 = 262120(0x3ffe8, float:3.67308E-40)
            r20 = r6
            r6 = 0
            r7 = 0
            r2 = r9
            r10 = r8
            r8 = 0
            r13 = r10
            r10 = 0
            r14 = r1
            r1 = r4
            r4 = r11
            r11 = 0
            r15 = r13
            r13 = 0
            r16 = r14
            r14 = 0
            r17 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r17
            r17 = 0
            r23 = r18
            r18 = 0
            r19 = r30
            r24 = r23
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r14 = r24
            int r0 = r14 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 196998(0x30186, float:2.76053E-40)
            r0 = r0 | r1
            r1 = r14 & 7168(0x1c00, float:1.0045E-41)
            r6 = r0 | r1
            r7 = 16
            c9.j1 r0 = c9.j1.f1228a
            r4 = 0
            r2 = r27
            r1 = r28
            r3 = r29
            r5 = r30
            r0.f(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            r5.p(r10)
            goto L115
        L112:
            r5.V()
        L115:
            i0.r1 r0 = r5.t()
            if (r0 == 0) goto L12f
            c9.c0 r1 = new c9.c0
            r8 = 0
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.f6035d = r1
        L12f:
            return
    }

    public final void d(java.util.List r37, java.util.Set r38, fg.l r39, fg.a r40, fg.a r41, i0.h0 r42, int r43) {
            r36 = this;
            r3 = r38
            r4 = r39
            r10 = r42
            r0 = 571194583(0x220bbcd7, float:1.8937984E-18)
            r10.b0(r0)
            r2 = r37
            boolean r0 = r10.f(r2)
            r1 = 4
            if (r0 == 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = 2
        L18:
            r0 = r43 | r0
            boolean r5 = r10.f(r3)
            if (r5 == 0) goto L23
            r5 = 32
            goto L25
        L23:
            r5 = 16
        L25:
            r0 = r0 | r5
            boolean r5 = r10.h(r4)
            if (r5 == 0) goto L2f
            r5 = 256(0x100, float:3.59E-43)
            goto L31
        L2f:
            r5 = 128(0x80, float:1.8E-43)
        L31:
            r0 = r0 | r5
            r5 = r40
            boolean r8 = r10.h(r5)
            if (r8 == 0) goto L3d
            r8 = 2048(0x800, float:2.87E-42)
            goto L3f
        L3d:
            r8 = 1024(0x400, float:1.435E-42)
        L3f:
            r0 = r0 | r8
            r8 = r41
            boolean r9 = r10.h(r8)
            if (r9 == 0) goto L4b
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L4d
        L4b:
            r9 = 8192(0x2000, float:1.148E-41)
        L4d:
            r0 = r0 | r9
            r9 = r0 & 9363(0x2493, float:1.312E-41)
            r11 = 9362(0x2492, float:1.3119E-41)
            r12 = 0
            r13 = 1
            if (r9 == r11) goto L58
            r9 = r13
            goto L59
        L58:
            r9 = r12
        L59:
            r11 = r0 & 1
            boolean r9 = r10.S(r11, r9)
            if (r9 == 0) goto L1de
            r9 = r0 & 14
            if (r9 == r1) goto L67
            r1 = r12
            goto L68
        L67:
            r1 = r13
        L68:
            java.lang.Object r9 = r10.P()
            i0.e r11 = i0.l.f5952a
            if (r1 != 0) goto L72
            if (r9 != r11) goto L79
        L72:
            java.util.ArrayList r9 = t(r2)
            r10.k0(r9)
        L79:
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            y0.l r14 = y0.l.f21818a
            r9 = 1065353216(0x3f800000, float:1.0)
            y0.o r15 = p.h1.d(r14, r9)
            r6 = 580(0x244, float:8.13E-43)
            float r6 = (float) r6
            r21 = r11
            r11 = 0
            y0.o r6 = p.h1.g(r15, r11, r6, r13)
            p.e r15 = p.j.f9926c
            y0.e r7 = y0.b.f21804s
            p.t r7 = p.s.a(r15, r7, r10, r12)
            long r11 = r10.T
            int r11 = java.lang.Long.hashCode(r11)
            s0.h r12 = r10.l()
            y0.o r6 = y0.a.c(r10, r6)
            x1.f r15 = x1.g.f20914f
            r15.getClass()
            x1.y r15 = x1.f.f20883b
            r10.d0()
            boolean r9 = r10.S
            if (r9 == 0) goto Lb6
            r10.k(r15)
            goto Lb9
        Lb6:
            r10.n0()
        Lb9:
            x1.e r9 = x1.f.f20886e
            i0.r.A(r9, r10, r7)
            x1.e r7 = x1.f.f20885d
            i0.r.A(r7, r10, r12)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            x1.e r9 = x1.f.f20887f
            i0.r.A(r9, r10, r7)
            x1.d r7 = x1.f.f20888g
            i0.r.w(r7, r10)
            x1.e r7 = x1.f.f20884c
            i0.r.A(r7, r10, r6)
            java.lang.String r6 = "删除多个"
            r7 = 54
            c9.j1 r9 = c9.j1.f1228a
            r9.r(r6, r10, r7)
            int r6 = r3.size()
            java.lang.String r7 = "已选择 "
            java.lang.String r11 = " 个分组"
            java.lang.String r6 = eh.a.m(r6, r7, r11)
            i0.m2 r7 = bi.d.f892a
            java.lang.Object r7 = r10.j(r7)
            bi.b r7 = (bi.b) r7
            long r11 = r7.h()
            r7 = 13
            long r26 = x6.d.D(r7)
            r7 = 6
            float r7 = (float) r7
            r19 = 7
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = r7
            y0.o r7 = p.d.p(r14, r15, r16, r17, r18, r19)
            r15 = r9
            r9 = r26
            r26 = 0
            r27 = 262120(0x3ffe8, float:3.67308E-40)
            r5 = r6
            r6 = r7
            r7 = r11
            r11 = 0
            r12 = 0
            r16 = r13
            r17 = r14
            r13 = 0
            r18 = r15
            r15 = 0
            r19 = r16
            r28 = r17
            r16 = 0
            r29 = r18
            r18 = 0
            r30 = r19
            r19 = 0
            r31 = 32
            r20 = 0
            r32 = r21
            r21 = 0
            r33 = 256(0x100, float:3.59E-43)
            r22 = 0
            r34 = 0
            r23 = 0
            r35 = 1065353216(0x3f800000, float:1.0)
            r25 = 24624(0x6030, float:3.4506E-41)
            r24 = r42
            r3 = r28
            r2 = r35
            r4 = 0
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r10 = r24
            y0.o r3 = p.h1.d(r3, r2)
            double r5 = (double) r2
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L15c
            goto L161
        L15c:
            java.lang.String r5 = "invalid weight; must be greater than zero"
            q.a.a(r5)
        L161:
            p.q0 r5 = new p.q0
            r6 = 0
            r5.<init>(r2, r6)
            y0.o r2 = r3.d(r5)
            r3 = 380(0x17c, float:5.32E-43)
            float r3 = (float) r3
            r5 = 1
            y0.o r2 = p.h1.g(r2, r4, r3, r5)
            boolean r3 = r10.h(r1)
            r4 = r0 & 112(0x70, float:1.57E-43)
            r5 = 32
            if (r4 == r5) goto L17f
            r12 = r6
            goto L180
        L17f:
            r12 = 1
        L180:
            r3 = r3 | r12
            r4 = r0 & 896(0x380, float:1.256E-42)
            r5 = 256(0x100, float:3.59E-43)
            if (r4 != r5) goto L189
            r12 = 1
            goto L18a
        L189:
            r12 = r6
        L18a:
            r3 = r3 | r12
            java.lang.Object r4 = r10.P()
            if (r3 != 0) goto L19b
            r3 = r32
            if (r4 != r3) goto L196
            goto L19b
        L196:
            r5 = r38
            r6 = r39
            goto L1a8
        L19b:
            b0.s r4 = new b0.s
            r3 = 4
            r5 = r38
            r6 = r39
            r4.<init>(r1, r5, r6, r3)
            r10.k0(r4)
        L1a8:
            r13 = r4
            fg.l r13 = (fg.l) r13
            r15 = 0
            r16 = 510(0x1fe, float:7.15E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = r42
            r5 = r2
            a.a.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            int r1 = r0 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 196998(0x30186, float:2.76053E-40)
            r1 = r1 | r2
            int r0 = r0 >> 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r11 = r1 | r0
            r12 = 16
            java.lang.String r7 = "继续"
            r9 = 0
            r6 = r40
            r8 = r41
            r10 = r42
            r5 = r29
            r5.f(r6, r7, r8, r9, r10, r11, r12)
            r5 = 1
            r10.p(r5)
            goto L1e1
        L1de:
            r10.V()
        L1e1:
            i0.r1 r9 = r10.t()
            if (r9 == 0) goto L1fd
            c9.z0 r0 = new c9.z0
            r8 = 0
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f6035d = r0
        L1fd:
            return
    }

    public final void e(java.lang.String r30, fg.a r31, y0.o r32, boolean r33, i0.h0 r34, int r35, int r36) {
            r29 = this;
            r4 = r32
            r0 = r34
            r1 = r35
            r2 = -29943864(0xfffffffffe3717c8, float:-6.084305E37)
            r0.b0(r2)
            r2 = r1 & 6
            r3 = 2
            if (r2 != 0) goto L1e
            r2 = r30
            boolean r5 = r0.f(r2)
            if (r5 == 0) goto L1b
            r5 = 4
            goto L1c
        L1b:
            r5 = r3
        L1c:
            r5 = r5 | r1
            goto L21
        L1e:
            r2 = r30
            r5 = r1
        L21:
            r6 = r1 & 48
            r11 = r31
            if (r6 != 0) goto L33
            boolean r6 = r0.h(r11)
            if (r6 == 0) goto L30
            r6 = 32
            goto L32
        L30:
            r6 = 16
        L32:
            r5 = r5 | r6
        L33:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L43
            boolean r6 = r0.f(r4)
            if (r6 == 0) goto L40
            r6 = 256(0x100, float:3.59E-43)
            goto L42
        L40:
            r6 = 128(0x80, float:1.8E-43)
        L42:
            r5 = r5 | r6
        L43:
            r6 = r36 & 8
            if (r6 == 0) goto L4c
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L49:
            r7 = r33
            goto L5e
        L4c:
            r7 = r1 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L49
            r7 = r33
            boolean r8 = r0.g(r7)
            if (r8 == 0) goto L5b
            r8 = 2048(0x800, float:2.87E-42)
            goto L5d
        L5b:
            r8 = 1024(0x400, float:1.435E-42)
        L5d:
            r5 = r5 | r8
        L5e:
            r8 = r5 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            r13 = 1
            r14 = 0
            if (r8 == r9) goto L68
            r8 = r13
            goto L69
        L68:
            r8 = r14
        L69:
            r9 = r5 & 1
            boolean r8 = r0.S(r9, r8)
            if (r8 == 0) goto L174
            if (r6 == 0) goto L76
            r28 = r14
            goto L78
        L76:
            r28 = r7
        L78:
            r6 = 44
            float r6 = (float) r6
            r7 = 0
            y0.o r3 = p.h1.g(r4, r6, r7, r3)
            r6 = 10
            float r6 = (float) r6
            v.d r6 = v.e.a(r6)
            y0.o r3 = c1.h.b(r3, r6)
            if (r28 == 0) goto La3
            r6 = 1295894764(0x4d3dc8ec, float:1.9900384E8)
            r0.a0(r6)
            i0.m2 r6 = bi.d.f892a
            java.lang.Object r6 = r0.j(r6)
            bi.b r6 = (bi.b) r6
            long r6 = r6.j()
            r0.p(r14)
            goto Lb8
        La3:
            r6 = 1295978371(0x4d3f0f83, float:2.0034155E8)
            r0.a0(r6)
            i0.m2 r6 = bi.d.f892a
            java.lang.Object r6 = r0.j(r6)
            bi.b r6 = (bi.b) r6
            long r6 = r6.k()
            r0.p(r14)
        Lb8:
            f1.m0 r8 = f1.c0.f3038b
            y0.o r7 = k.n.g(r3, r6, r8)
            r10 = 0
            r12 = 15
            r8 = 0
            r9 = 0
            y0.o r3 = k.n.j(r7, r8, r9, r10, r11, r12)
            r6 = 6
            float r6 = (float) r6
            r7 = 8
            float r7 = (float) r7
            y0.o r3 = p.d.m(r3, r6, r7)
            y0.g r6 = y0.b.f21796k
            v1.n0 r6 = p.o.d(r6, r14)
            long r7 = r0.T
            int r7 = java.lang.Long.hashCode(r7)
            s0.h r8 = r0.l()
            y0.o r3 = y0.a.c(r0, r3)
            x1.f r9 = x1.g.f20914f
            r9.getClass()
            x1.y r9 = x1.f.f20883b
            r0.d0()
            boolean r10 = r0.S
            if (r10 == 0) goto Lf6
            r0.k(r9)
            goto Lf9
        Lf6:
            r0.n0()
        Lf9:
            x1.e r9 = x1.f.f20886e
            i0.r.A(r9, r0, r6)
            x1.e r6 = x1.f.f20885d
            i0.r.A(r6, r0, r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r0, r6)
            x1.d r6 = x1.f.f20888g
            i0.r.w(r6, r0)
            x1.e r6 = x1.f.f20884c
            i0.r.A(r6, r0, r3)
            if (r28 == 0) goto L125
            r3 = 457117668(0x1b3f0fe4, float:1.5804284E-22)
            r0.a0(r3)
            r0.p(r14)
            long r6 = f1.w.f3127c
        L123:
            r7 = r6
            goto L13b
        L125:
            r3 = 457202732(0x1b405c2c, float:1.591165E-22)
            r0.a0(r3)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r3 = r0.j(r3)
            bi.b r3 = (bi.b) r3
            long r6 = r3.g()
            r0.p(r14)
            goto L123
        L13b:
            r3 = 13
            long r9 = x6.d.D(r3)
            m2.k r11 = m2.k.f8698j
            t2.k r15 = new t2.k
            r3 = 3
            r15.<init>(r3)
            r3 = r5 & 14
            r5 = 1597440(0x186000, float:2.23849E-39)
            r25 = r3 | r5
            r26 = 0
            r27 = 261034(0x3fbaa, float:3.65787E-40)
            r6 = 0
            r12 = 0
            r3 = r13
            r13 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = r0
            r5 = r2
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0.p(r3)
            r5 = r28
            goto L178
        L174:
            r0.V()
            r5 = r7
        L178:
            i0.r1 r9 = r0.t()
            if (r9 == 0) goto L18f
            c9.f0 r0 = new c9.f0
            r8 = 1
            r2 = r30
            r3 = r31
            r7 = r36
            r6 = r1
            r1 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f6035d = r0
        L18f:
            return
    }

    public final void f(fg.a r22, java.lang.String r23, fg.a r24, boolean r25, i0.h0 r26, int r27, int r28) {
            r21 = this;
            r5 = r26
            r8 = r27
            r0 = -92809835(0xfffffffffa77d595, float:-3.2170732E35)
            r5.b0(r0)
            r0 = r8 & 6
            java.lang.String r1 = "取消"
            r2 = 4
            if (r0 != 0) goto L1c
            boolean r0 = r5.f(r1)
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = 2
        L1a:
            r0 = r0 | r8
            goto L1d
        L1c:
            r0 = r8
        L1d:
            r3 = r8 & 48
            if (r3 != 0) goto L30
            r3 = r22
            boolean r4 = r5.h(r3)
            if (r4 == 0) goto L2c
            r4 = 32
            goto L2e
        L2c:
            r4 = 16
        L2e:
            r0 = r0 | r4
            goto L32
        L30:
            r3 = r22
        L32:
            r4 = r8 & 384(0x180, float:5.38E-43)
            r9 = r23
            if (r4 != 0) goto L44
            boolean r4 = r5.f(r9)
            if (r4 == 0) goto L41
            r4 = 256(0x100, float:3.59E-43)
            goto L43
        L41:
            r4 = 128(0x80, float:1.8E-43)
        L43:
            r0 = r0 | r4
        L44:
            r4 = r8 & 3072(0xc00, float:4.305E-42)
            r10 = r24
            if (r4 != 0) goto L56
            boolean r4 = r5.h(r10)
            if (r4 == 0) goto L53
            r4 = 2048(0x800, float:2.87E-42)
            goto L55
        L53:
            r4 = 1024(0x400, float:1.435E-42)
        L55:
            r0 = r0 | r4
        L56:
            r4 = r28 & 16
            if (r4 == 0) goto L60
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L5c:
            r6 = r25
        L5e:
            r11 = r0
            goto L73
        L60:
            r6 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L5c
            r6 = r25
            boolean r7 = r5.g(r6)
            if (r7 == 0) goto L6f
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L71
        L6f:
            r7 = 8192(0x2000, float:1.148E-41)
        L71:
            r0 = r0 | r7
            goto L5e
        L73:
            r0 = r11 & 9363(0x2493, float:1.312E-41)
            r7 = 9362(0x2492, float:1.3119E-41)
            r12 = 1
            if (r0 == r7) goto L7c
            r0 = r12
            goto L7d
        L7c:
            r0 = 0
        L7d:
            r7 = r11 & 1
            boolean r0 = r5.S(r7, r0)
            if (r0 == 0) goto L140
            if (r4 == 0) goto L89
            r13 = r12
            goto L8a
        L89:
            r13 = r6
        L8a:
            y0.l r0 = y0.l.f21818a
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r15 = p.h1.d(r0, r14)
            r0 = 10
            float r0 = (float) r0
            float r2 = (float) r2
            r20 = 5
            r16 = 0
            r18 = 0
            r17 = r0
            r19 = r2
            y0.o r0 = p.d.p(r15, r16, r17, r18, r19, r20)
            r2 = 8
            float r2 = (float) r2
            p.h r2 = p.j.g(r2)
            y0.f r4 = y0.b.f21801p
            r6 = 6
            p.e1 r2 = p.d1.a(r2, r4, r5, r6)
            long r6 = r5.T
            int r4 = java.lang.Long.hashCode(r6)
            s0.h r6 = r5.l()
            y0.o r0 = y0.a.c(r5, r0)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r5.d0()
            boolean r15 = r5.S
            if (r15 == 0) goto Ld2
            r5.k(r7)
            goto Ld5
        Ld2:
            r5.n0()
        Ld5:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r5, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r5, r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            x1.e r4 = x1.f.f20887f
            i0.r.A(r4, r5, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r5)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r5, r0)
            double r6 = (double) r14
            r15 = 0
            int r0 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            java.lang.String r17 = "invalid weight; must be greater than zero"
            if (r0 <= 0) goto Lfc
            goto Lff
        Lfc:
            q.a.a(r17)
        Lff:
            p.q0 r3 = new p.q0
            r3.<init>(r14, r12)
            r0 = r11 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r11 & 112(0x70, float:1.57E-43)
            r6 = r0 | r2
            r7 = 8
            c9.j1 r0 = c9.j1.f1228a
            r4 = 0
            r2 = r22
            r0.e(r1, r2, r3, r4, r5, r6, r7)
            double r1 = (double) r14
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 <= 0) goto L11c
            goto L11f
        L11c:
            q.a.a(r17)
        L11f:
            p.q0 r3 = new p.q0
            r3.<init>(r14, r12)
            int r1 = r11 >> 6
            r2 = r1 & 14
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r11 >> 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r6 = r1 | r2
            r7 = 0
            r5 = r26
            r1 = r9
            r2 = r10
            r4 = r13
            r0.e(r1, r2, r3, r4, r5, r6, r7)
            r5.p(r12)
            goto L144
        L140:
            r5.V()
            r4 = r6
        L144:
            i0.r1 r9 = r5.t()
            if (r9 == 0) goto L15d
            c9.f0 r0 = new c9.f0
            r1 = r21
            r2 = r22
            r3 = r23
            r7 = r28
            r5 = r4
            r6 = r8
            r4 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.f6035d = r0
        L15d:
            return
    }

    public final void g(int r26, int r27, fg.l r28, i0.h0 r29, java.lang.String r30, java.lang.String r31, y0.o r32) {
            r25 = this;
            r6 = r26
            r0 = r29
            r3 = r31
            r1 = 85511746(0x518ce42, float:7.184889E-36)
            r0.b0(r1)
            r1 = r6 & 6
            if (r1 != 0) goto L1b
            boolean r1 = r29.f(r30)
            if (r1 == 0) goto L18
            r1 = 4
            goto L19
        L18:
            r1 = 2
        L19:
            r1 = r1 | r6
            goto L1c
        L1b:
            r1 = r6
        L1c:
            r2 = r6 & 48
            if (r2 != 0) goto L2c
            boolean r2 = r0.f(r3)
            if (r2 == 0) goto L29
            r2 = 32
            goto L2b
        L29:
            r2 = 16
        L2b:
            r1 = r1 | r2
        L2c:
            r2 = r6 & 384(0x180, float:5.38E-43)
            r8 = r28
            if (r2 != 0) goto L3e
            boolean r2 = r0.h(r8)
            if (r2 == 0) goto L3b
            r2 = 256(0x100, float:3.59E-43)
            goto L3d
        L3b:
            r2 = 128(0x80, float:1.8E-43)
        L3d:
            r1 = r1 | r2
        L3e:
            r2 = r27 & 8
            if (r2 == 0) goto L47
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L44:
            r4 = r32
            goto L59
        L47:
            r4 = r6 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L44
            r4 = r32
            boolean r5 = r0.f(r4)
            if (r5 == 0) goto L56
            r5 = 2048(0x800, float:2.87E-42)
            goto L58
        L56:
            r5 = 1024(0x400, float:1.435E-42)
        L58:
            r1 = r1 | r5
        L59:
            r5 = r1 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r5 == r7) goto L61
            r5 = 1
            goto L62
        L61:
            r5 = 0
        L62:
            r7 = r1 & 1
            boolean r5 = r0.S(r7, r5)
            if (r5 == 0) goto L100
            if (r2 == 0) goto L6f
            y0.l r2 = y0.l.f21818a
            goto L70
        L6f:
            r2 = r4
        L70:
            i2.n0 r9 = new i2.n0
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r5 = r0.j(r4)
            bi.b r5 = (bi.b) r5
            long r10 = r5.g()
            r5 = 15
            long r12 = x6.d.D(r5)
            r18 = 0
            r20 = 16777212(0xfffffc, float:2.3509881E-38)
            r14 = 0
            r15 = 0
            r17 = 0
            r9.<init>(r10, r12, r14, r15, r17, r18, r20)
            f1.t0 r5 = new f1.t0
            java.lang.Object r7 = r0.j(r4)
            bi.b r7 = (bi.b) r7
            long r10 = r7.j()
            r5.<init>(r10)
            r7 = 1065353216(0x3f800000, float:1.0)
            y0.o r7 = p.h1.d(r2, r7)
            r10 = 10
            float r10 = (float) r10
            v.d r10 = v.e.a(r10)
            y0.o r7 = c1.h.b(r7, r10)
            java.lang.Object r4 = r0.j(r4)
            bi.b r4 = (bi.b) r4
            long r10 = r4.k()
            f1.m0 r4 = f1.c0.f3038b
            y0.o r4 = k.n.g(r7, r10, r4)
            r7 = 12
            float r7 = (float) r7
            r10 = 11
            float r10 = (float) r10
            y0.o r4 = p.d.m(r4, r7, r10)
            c9.i0 r7 = new c9.i0
            r10 = 0
            r11 = r30
            r7.<init>(r10, r11, r3)
            r10 = 519108863(0x1ef0f8ff, float:2.551397E-20)
            s0.d r20 = s0.i.e(r10, r7, r0)
            r7 = r1 & 14
            r10 = 100663296(0x6000000, float:2.4074124E-35)
            r7 = r7 | r10
            int r1 = r1 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r22 = r7 | r1
            r23 = 196608(0x30000, float:2.75506E-40)
            r24 = 16088(0x3ed8, float:2.2544E-41)
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = r0
            r19 = r5
            r7 = r11
            r11 = r9
            r9 = r4
            w.i.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5 = r2
            goto L104
        L100:
            r29.V()
            r5 = r4
        L104:
            i0.r1 r8 = r29.t()
            if (r8 == 0) goto L119
            c9.j0 r0 = new c9.j0
            r1 = r25
            r7 = r27
            r4 = r28
            r2 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        L119:
            return
    }

    public final void h(android.content.Context r8, s0.d r9, i0.h0 r10, int r11) {
            r7 = this;
            r0 = -1424091417(0xffffffffab1e16e7, float:-5.616466E-13)
            r10.b0(r0)
            boolean r0 = r10.h(r8)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r11
            r1 = r0 & 19
            r2 = 18
            r3 = 1
            if (r1 == r2) goto L19
            r1 = r3
            goto L1a
        L19:
            r1 = 0
        L1a:
            r0 = r0 & r3
            boolean r0 = r10.S(r0, r1)
            if (r0 == 0) goto L44
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L36
            bi.b r0 = bi.d.a()
            goto L3a
        L36:
            bi.b r0 = bi.d.b()
        L3a:
            r2 = 0
            r5 = 3072(0xc00, float:4.305E-42)
            r1 = 0
            r3 = r9
            r4 = r10
            ig.a.b(r0, r1, r2, r3, r4, r5)
            goto L47
        L44:
            r10.V()
        L47:
            i0.r1 r0 = r10.t()
            if (r0 == 0) goto L59
            b0.k r1 = new b0.k
            r6 = 2
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.f6035d = r1
        L59:
            return
    }

    public final void i(int r35, int r36, fg.a r37, i0.h0 r38, java.lang.String r39, java.lang.String r40, boolean r41) {
            r34 = this;
            r4 = r35
            r7 = r36
            r12 = r38
            r3 = r40
            r5 = r41
            r0 = 96628841(0x5c27069, float:1.8284965E-35)
            r12.b0(r0)
            r0 = r7 & 6
            if (r0 != 0) goto L1f
            boolean r0 = r38.f(r39)
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r0 | r7
            goto L20
        L1f:
            r0 = r7
        L20:
            r1 = r7 & 48
            if (r1 != 0) goto L30
            boolean r1 = r12.f(r3)
            if (r1 == 0) goto L2d
            r1 = 32
            goto L2f
        L2d:
            r1 = 16
        L2f:
            r0 = r0 | r1
        L30:
            r1 = r7 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L40
            boolean r1 = r12.d(r4)
            if (r1 == 0) goto L3d
            r1 = 256(0x100, float:3.59E-43)
            goto L3f
        L3d:
            r1 = 128(0x80, float:1.8E-43)
        L3f:
            r0 = r0 | r1
        L40:
            boolean r1 = r12.g(r5)
            if (r1 == 0) goto L49
            r1 = 2048(0x800, float:2.87E-42)
            goto L4b
        L49:
            r1 = 1024(0x400, float:1.435E-42)
        L4b:
            r0 = r0 | r1
            r6 = r37
            boolean r1 = r12.h(r6)
            if (r1 == 0) goto L57
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L59
        L57:
            r1 = 8192(0x2000, float:1.148E-41)
        L59:
            r0 = r0 | r1
            r1 = r0 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r1 == r2) goto L62
            r1 = 1
            goto L63
        L62:
            r1 = 0
        L63:
            r2 = r0 & 1
            boolean r1 = r12.S(r2, r1)
            if (r1 == 0) goto L1ed
            y0.l r1 = y0.l.f21818a
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r10 = p.h1.d(r1, r2)
            r11 = 10
            float r13 = (float) r11
            v.d r14 = v.e.a(r13)
            y0.o r10 = c1.h.b(r10, r14)
            r16 = 0
            r18 = 15
            r14 = 0
            r15 = 0
            r17 = r6
            r6 = r13
            r13 = r10
            y0.o r10 = k.n.j(r13, r14, r15, r16, r17, r18)
            r13 = 6
            if (r4 <= r13) goto L90
            goto L91
        L90:
            r13 = r4
        L91:
            int r13 = r13 * 14
            int r13 = r13 + r11
            float r11 = (float) r13
            y0.o r6 = p.d.o(r10, r11, r6, r6, r6)
            y0.f r10 = y0.b.f21802q
            p.c r11 = p.j.f9924a
            r13 = 48
            p.e1 r10 = p.d1.a(r11, r10, r12, r13)
            long r13 = r12.T
            int r11 = java.lang.Long.hashCode(r13)
            s0.h r13 = r12.l()
            y0.o r6 = y0.a.c(r12, r6)
            x1.f r14 = x1.g.f20914f
            r14.getClass()
            x1.y r14 = x1.f.f20883b
            r12.d0()
            boolean r15 = r12.S
            if (r15 == 0) goto Lc3
            r12.k(r14)
            goto Lc6
        Lc3:
            r12.n0()
        Lc6:
            x1.e r15 = x1.f.f20886e
            i0.r.A(r15, r12, r10)
            x1.e r10 = x1.f.f20885d
            i0.r.A(r10, r12, r13)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            x1.e r13 = x1.f.f20887f
            i0.r.A(r13, r12, r11)
            x1.d r11 = x1.f.f20888g
            i0.r.w(r11, r12)
            x1.e r8 = x1.f.f20884c
            i0.r.A(r8, r12, r6)
            r17 = r10
            double r9 = (double) r2
            r18 = 0
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 <= 0) goto Led
            goto Lf2
        Led:
            java.lang.String r9 = "invalid weight; must be greater than zero"
            q.a.a(r9)
        Lf2:
            p.q0 r9 = new p.q0
            r6 = 1
            r9.<init>(r2, r6)
            p.e r2 = p.j.f9926c
            y0.e r10 = y0.b.f21804s
            r6 = 0
            p.t r2 = p.s.a(r2, r10, r12, r6)
            long r6 = r12.T
            int r6 = java.lang.Long.hashCode(r6)
            s0.h r7 = r12.l()
            y0.o r9 = y0.a.c(r12, r9)
            r12.d0()
            boolean r10 = r12.S
            if (r10 == 0) goto L11a
            r12.k(r14)
            goto L11d
        L11a:
            r12.n0()
        L11d:
            i0.r.A(r15, r12, r2)
            r2 = r17
            i0.r.A(r2, r12, r7)
            j8.b.p(r6, r12, r13, r12, r11)
            i0.r.A(r8, r12, r9)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r6 = r12.j(r2)
            bi.b r6 = (bi.b) r6
            long r10 = r6.g()
            r6 = 15
            long r6 = x6.d.D(r6)
            m2.k r14 = m2.k.f8698j
            r8 = r0 & 14
            r9 = 1597440(0x186000, float:2.23849E-39)
            r28 = r8 | r9
            r29 = 0
            r30 = 262058(0x3ffaa, float:3.67221E-40)
            r9 = 0
            r15 = 0
            r8 = 0
            r16 = 0
            r13 = 1
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = r12
            r31 = r8
            r8 = r39
            r32 = r6
            r6 = r31
            r7 = r13
            r12 = r32
            sh.s.n(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r12 = r27
            boolean r8 = og.m.t0(r3)
            if (r8 != 0) goto L1c6
            r8 = r39
            boolean r9 = r3.equals(r8)
            if (r9 != 0) goto L1c6
            r9 = -361038373(0xffffffffea7afddb, float:-7.5857563E25)
            r12.a0(r9)
            java.lang.Object r2 = r12.j(r2)
            bi.b r2 = (bi.b) r2
            long r10 = r2.h()
            r2 = 12
            long r13 = x6.d.D(r2)
            int r0 = r0 >> 3
            r0 = r0 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r29 = 0
            r30 = 262122(0x3ffea, float:3.67311E-40)
            r9 = 0
            r12 = r13
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = r38
            r28 = r0
            r8 = r3
            sh.s.n(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r12 = r27
            r12.p(r6)
            goto L1cf
        L1c6:
            r0 = -360819265(0xffffffffea7e55bf, float:-7.686802E25)
            r12.a0(r0)
            r12.p(r6)
        L1cf:
            r12.p(r7)
            r0 = 22
            float r0 = (float) r0
            y0.o r9 = p.h1.j(r1, r0)
            if (r5 == 0) goto L1df
            h2.a r0 = h2.a.f5048g
        L1dd:
            r8 = r0
            goto L1e2
        L1df:
            h2.a r0 = h2.a.f5049h
            goto L1dd
        L1e2:
            r11 = 0
            r13 = 432(0x1b0, float:6.05E-43)
            r10 = 0
            sh.s.d(r8, r9, r10, r11, r12, r13)
            r12.p(r7)
            goto L1f0
        L1ed:
            r12.V()
        L1f0:
            i0.r1 r8 = r12.t()
            if (r8 == 0) goto L207
            c9.l0 r0 = new c9.l0
            r1 = r34
            r7 = r36
            r6 = r37
            r2 = r39
            r3 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        L207:
            return
    }

    public final void j(java.util.List r43, c9.o2 r44, java.lang.String r45, java.lang.String r46, fg.l r47, fg.l r48, fg.a r49, fg.a r50, fg.a r51, i0.h0 r52, int r53) {
            r42 = this;
            r2 = r43
            r3 = r44
            r4 = r45
            r5 = r46
            r6 = r47
            r7 = r48
            r12 = r52
            r0 = 1160933333(0x45326fd5, float:2854.9895)
            r12.b0(r0)
            boolean r0 = r12.f(r2)
            r1 = 4
            if (r0 == 0) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = 2
        L1e:
            r0 = r53 | r0
            boolean r8 = r12.f(r3)
            r9 = 32
            if (r8 == 0) goto L2a
            r8 = r9
            goto L2c
        L2a:
            r8 = 16
        L2c:
            r0 = r0 | r8
            boolean r8 = r12.f(r4)
            if (r8 == 0) goto L36
            r8 = 256(0x100, float:3.59E-43)
            goto L38
        L36:
            r8 = 128(0x80, float:1.8E-43)
        L38:
            r0 = r0 | r8
            boolean r8 = r12.f(r5)
            if (r8 == 0) goto L42
            r8 = 2048(0x800, float:2.87E-42)
            goto L44
        L42:
            r8 = 1024(0x400, float:1.435E-42)
        L44:
            r0 = r0 | r8
            boolean r8 = r12.h(r6)
            if (r8 == 0) goto L4e
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L50
        L4e:
            r8 = 8192(0x2000, float:1.148E-41)
        L50:
            r0 = r0 | r8
            boolean r8 = r12.h(r7)
            if (r8 == 0) goto L5a
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L5c
        L5a:
            r8 = 65536(0x10000, float:9.1835E-41)
        L5c:
            r0 = r0 | r8
            r8 = r49
            boolean r13 = r12.h(r8)
            if (r13 == 0) goto L68
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L6a
        L68:
            r13 = 524288(0x80000, float:7.34684E-40)
        L6a:
            r0 = r0 | r13
            r13 = r50
            boolean r14 = r12.h(r13)
            if (r14 == 0) goto L76
            r14 = 8388608(0x800000, float:1.1754944E-38)
            goto L78
        L76:
            r14 = 4194304(0x400000, float:5.877472E-39)
        L78:
            r0 = r0 | r14
            r14 = r51
            boolean r15 = r12.h(r14)
            if (r15 == 0) goto L84
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            goto L86
        L84:
            r15 = 33554432(0x2000000, float:9.403955E-38)
        L86:
            r0 = r0 | r15
            r15 = 38347923(0x2492493, float:1.4777644E-37)
            r15 = r15 & r0
            r10 = 38347922(0x2492492, float:1.4777643E-37)
            if (r15 == r10) goto L92
            r10 = 1
            goto L93
        L92:
            r10 = 0
        L93:
            r15 = r0 & 1
            boolean r10 = r12.S(r15, r10)
            if (r10 == 0) goto L3a0
            r10 = r0 & 14
            if (r10 == r1) goto La1
            r10 = 0
            goto La2
        La1:
            r10 = 1
        La2:
            r15 = r0 & 112(0x70, float:1.57E-43)
            if (r15 == r9) goto La9
            r18 = 0
            goto Lab
        La9:
            r18 = 1
        Lab:
            r10 = r10 | r18
            java.lang.Object r9 = r12.P()
            r19 = r15
            i0.e r15 = i0.l.f5952a
            r11 = 0
            if (r10 != 0) goto Lba
            if (r9 != r15) goto L10b
        Lba:
            java.util.ArrayList r9 = t(r2)
            boolean r10 = r3 instanceof c9.f1
            if (r10 == 0) goto Lc3
            goto L108
        Lc3:
            r10 = r3
            c9.g1 r10 = (c9.g1) r10
            java.lang.String r10 = r10.f1198b
            java.util.Set r1 = c9.o2.f(r10, r2)
            java.util.LinkedHashSet r1 = tf.d0.V(r1, r10)
            c9.c1 r10 = new c9.c1
            java.lang.String r14 = "微信首页"
            java.lang.String r2 = "作为一级分组"
            r8 = 0
            r10.<init>(r8, r11, r14, r2)
            java.util.List r2 = a.a.x0(r10)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        Le7:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L103
            java.lang.Object r10 = r9.next()
            r14 = r10
            c9.c1 r14 = (c9.c1) r14
            java.lang.String r14 = r14.f1118a
            if (r14 == 0) goto Lff
            boolean r14 = r1.contains(r14)
            if (r14 == 0) goto Lff
            goto Le7
        Lff:
            r8.add(r10)
            goto Le7
        L103:
            java.util.ArrayList r1 = tf.m.F1(r2, r8)
            r9 = r1
        L108:
            r12.k0(r9)
        L10b:
            java.util.List r9 = (java.util.List) r9
            java.lang.CharSequence r1 = og.m.R0(r4)
            java.lang.String r1 = r1.toString()
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = j8.b.l(r2, r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r9.iterator()
        L124:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L158
            java.lang.Object r9 = r8.next()
            r10 = r9
            c9.c1 r10 = (c9.c1) r10
            int r14 = r1.length()
            if (r14 != 0) goto L13a
            r24 = r8
            goto L154
        L13a:
            java.lang.String r14 = r10.f1119b
            java.util.Locale r11 = java.util.Locale.US
            r24 = r8
            r8 = 0
            boolean r14 = bc.e.u(r11, r14, r11, r1, r8)
            if (r14 != 0) goto L154
            java.lang.String r10 = r10.f1120c
            boolean r10 = bc.e.t(r10, r11, r1, r8)
            if (r10 == 0) goto L150
            goto L154
        L150:
            r8 = r24
            r11 = 0
            goto L124
        L154:
            r2.add(r9)
            goto L150
        L158:
            i0.u r1 = y1.i0.f21965a
            java.lang.Object r1 = r12.j(r1)
            android.content.res.Configuration r1 = (android.content.res.Configuration) r1
            int r1 = r1.screenHeightDp
            float r1 = (float) r1
            y0.l r8 = y0.l.f21818a
            r9 = 1065353216(0x3f800000, float:1.0)
            y0.o r10 = p.h1.d(r8, r9)
            r11 = 1061662228(0x3f47ae14, float:0.78)
            float r1 = r1 * r11
            r11 = 0
            r14 = 1
            y0.o r1 = p.h1.g(r10, r11, r1, r14)
            p.e r10 = p.j.f9926c
            y0.e r11 = y0.b.f21804s
            r14 = 0
            p.t r10 = p.s.a(r10, r11, r12, r14)
            r11 = r15
            long r14 = r12.T
            int r14 = java.lang.Long.hashCode(r14)
            s0.h r15 = r12.l()
            y0.o r1 = y0.a.c(r12, r1)
            x1.f r25 = x1.g.f20914f
            r25.getClass()
            x1.y r9 = x1.f.f20883b
            r12.d0()
            r26 = r11
            boolean r11 = r12.S
            if (r11 == 0) goto L1a1
            r12.k(r9)
            goto L1a4
        L1a1:
            r12.n0()
        L1a4:
            x1.e r9 = x1.f.f20886e
            i0.r.A(r9, r12, r10)
            x1.e r9 = x1.f.f20885d
            i0.r.A(r9, r12, r15)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            x1.e r10 = x1.f.f20887f
            i0.r.A(r10, r12, r9)
            x1.d r9 = x1.f.f20888g
            i0.r.w(r9, r12)
            x1.e r9 = x1.f.f20884c
            i0.r.A(r9, r12, r1)
            boolean r1 = r3 instanceof c9.f1
            if (r1 == 0) goto L1c8
            java.lang.String r1 = "选择当前会话所属分组"
            goto L1fe
        L1c8:
            boolean r1 = r3 instanceof c9.g1
            if (r1 == 0) goto L39c
            java.util.Iterator r1 = r43.iterator()
        L1d0:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L1eb
            java.lang.Object r9 = r1.next()
            r10 = r9
            c9.a r10 = (c9.a) r10
            java.lang.String r10 = r10.f1081a
            r11 = r3
            c9.g1 r11 = (c9.g1) r11
            java.lang.String r11 = r11.f1198b
            boolean r10 = gg.l.a(r10, r11)
            if (r10 == 0) goto L1d0
            goto L1ec
        L1eb:
            r9 = 0
        L1ec:
            c9.a r9 = (c9.a) r9
            if (r9 == 0) goto L1f3
            java.lang.String r11 = r9.f1082b
            goto L1f4
        L1f3:
            r11 = 0
        L1f4:
            if (r11 != 0) goto L1f8
            java.lang.String r11 = ""
        L1f8:
            java.lang.String r1 = "移动分组："
            java.lang.String r1 = r1.concat(r11)
        L1fe:
            i0.m2 r9 = bi.d.f892a
            java.lang.Object r10 = r12.j(r9)
            bi.b r10 = (bi.b) r10
            long r10 = r10.h()
            r14 = 13
            long r14 = x6.d.D(r14)
            r23 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            y0.o r27 = p.h1.d(r8, r1)
            r1 = 4
            float r1 = (float) r1
            r32 = 7
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = r1
            y0.o r1 = p.d.p(r27, r28, r29, r30, r31, r32)
            r29 = 0
            r30 = 262120(0x3ffe8, float:3.67308E-40)
            r12 = r14
            r14 = 0
            r15 = 0
            r21 = 2048(0x800, float:2.87E-42)
            r27 = 0
            r16 = 0
            r28 = 32
            r18 = 0
            r31 = r19
            r32 = 131072(0x20000, float:1.83671E-40)
            r19 = 0
            r33 = r21
            r21 = 0
            r34 = 0
            r22 = 0
            r35 = r8
            r8 = r23
            r23 = 0
            r36 = 1
            r24 = 0
            r37 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r38 = r26
            r26 = 0
            r39 = r28
            r28 = 24624(0x6030, float:3.4506E-41)
            r3 = r9
            r9 = r1
            r1 = r3
            r27 = r52
            r40 = r31
            r3 = r35
            r5 = r37
            r41 = r38
            sh.s.n(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            int r8 = r0 >> 12
            r8 = r8 & 896(0x380, float:1.256E-42)
            r9 = r8 | 24630(0x6036, float:3.4514E-41)
            r10 = 8
            c9.j1 r8 = c9.j1.f1228a
            java.lang.String r13 = "管理聊天分组"
            java.lang.String r14 = "新建、删除、导入与导出"
            r15 = 0
            r11 = r49
            r12 = r52
            r8.a(r9, r10, r11, r12, r13, r14, r15)
            int r9 = r0 >> 6
            r9 = r9 & 14
            r9 = r9 | 384(0x180, float:5.38E-43)
            int r10 = r0 >> 9
            r10 = r10 & 112(0x70, float:1.57E-43)
            r9 = r9 | r10
            r8.q(r4, r6, r12, r9)
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L2f5
            r2 = -2136310139(0xffffffff80aa7e85, float:-1.5657421E-38)
            r12.a0(r2)
            boolean r2 = r43.isEmpty()
            if (r2 == 0) goto L2a7
            java.lang.String r2 = "暂无聊天分组"
            goto L2a9
        L2a7:
            java.lang.String r2 = "没有匹配的聊天分组"
        L2a9:
            java.lang.Object r1 = r12.j(r1)
            bi.b r1 = (bi.b) r1
            long r10 = r1.h()
            y0.o r1 = p.h1.d(r3, r5)
            r3 = 28
            float r3 = (float) r3
            r5 = 1
            r9 = 0
            y0.o r9 = p.d.n(r1, r9, r3, r5)
            t2.k r1 = new t2.k
            r3 = 3
            r1.<init>(r3)
            r29 = 0
            r30 = 261112(0x3fbf8, float:3.65896E-40)
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r27 = r52
            r18 = r1
            r1 = r8
            r8 = r2
            sh.s.n(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r12 = r27
            r8 = 0
            r12.p(r8)
            r2 = r5
            r5 = r44
            goto L37b
        L2f5:
            r1 = r8
            r8 = 1
            r9 = 0
            r10 = -2135966876(0xffffffff80afbb64, float:-1.6138435E-38)
            r12.a0(r10)
            y0.o r3 = p.h1.d(r3, r5)
            double r10 = (double) r5
            r13 = 0
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 <= 0) goto L30a
            goto L30f
        L30a:
            java.lang.String r10 = "invalid weight; must be greater than zero"
            q.a.a(r10)
        L30f:
            p.q0 r10 = new p.q0
            r14 = 0
            r10.<init>(r5, r14)
            y0.o r3 = r3.d(r10)
            r5 = 360(0x168, float:5.04E-43)
            float r5 = (float) r5
            y0.o r3 = p.h1.g(r3, r9, r5, r8)
            boolean r5 = r12.h(r2)
            r9 = r0 & 7168(0x1c00, float:1.0045E-41)
            r10 = 2048(0x800, float:2.87E-42)
            if (r9 != r10) goto L32c
            r14 = r8
            goto L32d
        L32c:
            r14 = 0
        L32d:
            r5 = r5 | r14
            r9 = r40
            r10 = 32
            if (r9 == r10) goto L336
            r14 = 0
            goto L337
        L336:
            r14 = r8
        L337:
            r5 = r5 | r14
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r0
            r10 = 131072(0x20000, float:1.83671E-40)
            if (r9 != r10) goto L341
            r14 = r8
            goto L342
        L341:
            r14 = 0
        L342:
            r5 = r5 | r14
            java.lang.Object r9 = r12.P()
            if (r5 != 0) goto L353
            r11 = r41
            if (r9 != r11) goto L34e
            goto L353
        L34e:
            r5 = r44
            r10 = r46
            goto L35f
        L353:
            c9.k r9 = new c9.k
            r5 = r44
            r10 = r46
            r9.<init>(r2, r10, r5, r7)
            r12.k0(r9)
        L35f:
            r16 = r9
            fg.l r16 = (fg.l) r16
            r18 = 0
            r19 = 510(0x1fe, float:7.15E-43)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = r52
            r2 = r8
            r8 = r3
            a.a.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r12 = r17
            r8 = 0
            r12.p(r8)
        L37b:
            int r3 = r0 >> 18
            r3 = r3 & 112(0x70, float:1.57E-43)
            r8 = 221574(0x36186, float:3.10491E-40)
            r3 = r3 | r8
            int r0 = r0 >> 15
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r14 = r3 | r0
            r15 = 0
            java.lang.String r10 = "确定"
            r12 = 1
            r9 = r50
            r11 = r51
            r13 = r52
            r8 = r1
            r8.f(r9, r10, r11, r12, r13, r14, r15)
            r12 = r13
            r12.p(r2)
            goto L3a4
        L39c:
            okio.a.k()
            return
        L3a0:
            r5 = r3
            r12.V()
        L3a4:
            i0.r1 r12 = r12.t()
            if (r12 == 0) goto L3c0
            c9.e0 r0 = new c9.e0
            r1 = r42
            r2 = r43
            r8 = r49
            r9 = r50
            r10 = r51
            r11 = r53
            r3 = r5
            r5 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f6035d = r0
        L3c0:
            return
    }

    public final void k(java.util.List r19, fg.a r20, fg.a r21, fg.a r22, fg.a r23, fg.a r24, fg.a r25, i0.h0 r26, int r27) {
            r18 = this;
            r4 = r26
            r0 = -366518988(0xffffffffea275d34, float:-5.058269E25)
            r4.b0(r0)
            r12 = r19
            boolean r0 = r4.f(r12)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r27 | r0
            r3 = r20
            boolean r1 = r4.h(r3)
            if (r1 == 0) goto L20
            r1 = 32
            goto L22
        L20:
            r1 = 16
        L22:
            r0 = r0 | r1
            r8 = r21
            boolean r1 = r4.h(r8)
            if (r1 == 0) goto L2e
            r1 = 256(0x100, float:3.59E-43)
            goto L30
        L2e:
            r1 = 128(0x80, float:1.8E-43)
        L30:
            r0 = r0 | r1
            r9 = r22
            boolean r1 = r4.h(r9)
            if (r1 == 0) goto L3c
            r1 = 2048(0x800, float:2.87E-42)
            goto L3e
        L3c:
            r1 = 1024(0x400, float:1.435E-42)
        L3e:
            r0 = r0 | r1
            r10 = r23
            boolean r1 = r4.h(r10)
            if (r1 == 0) goto L4a
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L4c
        L4a:
            r1 = 8192(0x2000, float:1.148E-41)
        L4c:
            r0 = r0 | r1
            r11 = r24
            boolean r1 = r4.h(r11)
            if (r1 == 0) goto L58
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L5a
        L58:
            r1 = 65536(0x10000, float:9.1835E-41)
        L5a:
            r0 = r0 | r1
            r13 = r25
            boolean r1 = r4.h(r13)
            if (r1 == 0) goto L66
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L68
        L66:
            r1 = 524288(0x80000, float:7.34684E-40)
        L68:
            r14 = r0 | r1
            r0 = 599187(0x92493, float:8.3964E-40)
            r0 = r0 & r14
            r1 = 599186(0x92492, float:8.39638E-40)
            r2 = 0
            r15 = 1
            if (r0 == r1) goto L77
            r0 = r15
            goto L78
        L77:
            r0 = r2
        L78:
            r1 = r14 & 1
            boolean r0 = r4.S(r1, r0)
            if (r0 == 0) goto L170
            y0.l r0 = y0.l.f21818a
            r1 = 1065353216(0x3f800000, float:1.0)
            y0.o r5 = p.h1.d(r0, r1)
            r6 = 560(0x230, float:7.85E-43)
            float r6 = (float) r6
            r7 = 0
            y0.o r5 = p.h1.g(r5, r7, r6, r15)
            p.e r6 = p.j.f9926c
            y0.e r7 = y0.b.f21804s
            p.t r2 = p.s.a(r6, r7, r4, r2)
            long r6 = r4.T
            int r6 = java.lang.Long.hashCode(r6)
            s0.h r7 = r4.l()
            y0.o r5 = y0.a.c(r4, r5)
            x1.f r16 = x1.g.f20914f
            r16.getClass()
            x1.y r1 = x1.f.f20883b
            r4.d0()
            r17 = r15
            boolean r15 = r4.S
            if (r15 == 0) goto Lba
            r4.k(r1)
            goto Lbd
        Lba:
            r4.n0()
        Lbd:
            x1.e r1 = x1.f.f20886e
            i0.r.A(r1, r4, r2)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r4, r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            x1.e r2 = x1.f.f20887f
            i0.r.A(r2, r4, r1)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r4)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r4, r5)
            java.lang.String r1 = "管理聊天分组"
            r2 = 54
            r5 = r0
            c9.j1 r0 = c9.j1.f1228a
            r0.r(r1, r4, r2)
            int r1 = r14 << 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | 24630(0x6036, float:3.4514E-41)
            r2 = 8
            r6 = r5
            java.lang.String r5 = "新建分组"
            r7 = r6
            java.lang.String r6 = "创建一级或多级聊天分组"
            r15 = r7
            r7 = 0
            r8 = r15
            r15 = 1065353216(0x3f800000, float:1.0)
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r12.isEmpty()
            r7 = r1 ^ 1
            int r1 = r14 >> 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | 24630(0x6036, float:3.4514E-41)
            r2 = 0
            java.lang.String r5 = "删除多个"
            java.lang.String r6 = "选择一个或多个聊天分组删除"
            r4 = r26
            r3 = r9
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            int r1 = r14 >> 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | 24630(0x6036, float:3.4514E-41)
            r2 = 8
            java.lang.String r5 = "导入"
            java.lang.String r6 = "从聊天分组文件恢复配置"
            r7 = 0
            r3 = r10
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            int r1 = r14 >> 9
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | 24630(0x6036, float:3.4514E-41)
            java.lang.String r5 = "导出"
            java.lang.String r6 = "将当前账号的聊天分组保存到文件"
            r3 = r11
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r12.isEmpty()
            r7 = r1 ^ 1
            r1 = r14 & 896(0x380, float:1.256E-42)
            r1 = r1 | 24630(0x6036, float:3.4514E-41)
            r2 = 0
            java.lang.String r5 = "全部删除"
            java.lang.String r6 = "删除当前账号的全部聊天分组"
            r3 = r21
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            y0.o r0 = p.h1.d(r8, r15)
            r1 = 8
            float r2 = (float) r1
            r4 = 0
            r5 = 13
            r1 = 0
            r3 = 0
            y0.o r2 = p.d.p(r0, r1, r2, r3, r4, r5)
            int r0 = r14 >> 15
            r0 = r0 & 112(0x70, float:1.57E-43)
            r10 = r0 | 390(0x186, float:5.47E-43)
            r11 = 2040(0x7f8, float:2.859E-42)
            java.lang.String r0 = "返回"
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = r26
            r1 = r13
            sh.s.o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r4 = r9
            r0 = r17
            r4.p(r0)
            goto L173
        L170:
            r4.V()
        L173:
            i0.r1 r0 = r4.t()
            if (r0 == 0) goto L192
            c9.d0 r1 = new c9.d0
            r11 = 0
            r2 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r27
            r3 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f6035d = r1
        L192:
            return
    }

    public final void l(android.app.Activity r20, c9.o2 r21, fg.a r22, fg.a r23, fg.a r24, i0.h0 r25, int r26) {
            r19 = this;
            r1 = r21
            r13 = r25
            r14 = r26
            r0 = -1417977276(0xffffffffab7b6244, float:-8.9309484E-13)
            r13.b0(r0)
            r0 = r14 & 6
            r2 = r20
            if (r0 != 0) goto L1d
            boolean r0 = r13.h(r2)
            if (r0 == 0) goto L1a
            r0 = 4
            goto L1b
        L1a:
            r0 = 2
        L1b:
            r0 = r0 | r14
            goto L1e
        L1d:
            r0 = r14
        L1e:
            r3 = r14 & 48
            r4 = 32
            if (r3 != 0) goto L38
            r3 = r14 & 64
            if (r3 != 0) goto L2d
            boolean r3 = r13.f(r1)
            goto L31
        L2d:
            boolean r3 = r13.h(r1)
        L31:
            if (r3 == 0) goto L35
            r3 = r4
            goto L37
        L35:
            r3 = 16
        L37:
            r0 = r0 | r3
        L38:
            r3 = r14 & 384(0x180, float:5.38E-43)
            r9 = r22
            if (r3 != 0) goto L4a
            boolean r3 = r13.h(r9)
            if (r3 == 0) goto L47
            r3 = 256(0x100, float:3.59E-43)
            goto L49
        L47:
            r3 = 128(0x80, float:1.8E-43)
        L49:
            r0 = r0 | r3
        L4a:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            r5 = r23
            if (r3 != 0) goto L5c
            boolean r3 = r13.h(r5)
            if (r3 == 0) goto L59
            r3 = 2048(0x800, float:2.87E-42)
            goto L5b
        L59:
            r3 = 1024(0x400, float:1.435E-42)
        L5b:
            r0 = r0 | r3
        L5c:
            r3 = r14 & 24576(0x6000, float:3.4438E-41)
            r12 = r24
            if (r3 != 0) goto L6e
            boolean r3 = r13.h(r12)
            if (r3 == 0) goto L6b
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L6d
        L6b:
            r3 = 8192(0x2000, float:1.148E-41)
        L6d:
            r0 = r0 | r3
        L6e:
            r15 = r0
            r0 = r15 & 9363(0x2493, float:1.312E-41)
            r3 = 9362(0x2492, float:1.3119E-41)
            if (r0 == r3) goto L77
            r0 = 1
            goto L78
        L77:
            r0 = 0
        L78:
            r3 = r15 & 1
            boolean r0 = r13.S(r3, r0)
            if (r0 == 0) goto L1ce
            r0 = r15 & 112(0x70, float:1.57E-43)
            if (r0 == r4) goto L91
            r3 = r15 & 64
            if (r3 == 0) goto L8f
            boolean r3 = r13.f(r1)
            if (r3 == 0) goto L8f
            goto L91
        L8f:
            r3 = 0
            goto L92
        L91:
            r3 = 1
        L92:
            java.lang.Object r8 = r13.P()
            i0.e r10 = i0.l.f5952a
            if (r3 != 0) goto L9c
            if (r8 != r10) goto La7
        L9c:
            java.util.List r3 = c9.o2.i(r2)
            i0.j1 r8 = i0.r.u(r3)
            r13.k0(r8)
        La7:
            i0.a1 r8 = (i0.a1) r8
            if (r0 == r4) goto Lb8
            r3 = r15 & 64
            if (r3 == 0) goto Lb6
            boolean r3 = r13.f(r1)
            if (r3 == 0) goto Lb6
            goto Lb8
        Lb6:
            r3 = 0
            goto Lb9
        Lb8:
            r3 = 1
        Lb9:
            java.lang.Object r11 = r13.P()
            if (r3 != 0) goto Lc1
            if (r11 != r10) goto Lca
        Lc1:
            c9.e1 r3 = c9.e1.f1170g
            i0.j1 r11 = i0.r.u(r3)
            r13.k0(r11)
        Lca:
            i0.a1 r11 = (i0.a1) r11
            if (r0 == r4) goto Ldb
            r3 = r15 & 64
            if (r3 == 0) goto Ld9
            boolean r3 = r13.f(r1)
            if (r3 == 0) goto Ld9
            goto Ldb
        Ld9:
            r3 = 0
            goto Ldc
        Ldb:
            r3 = 1
        Ldc:
            java.lang.Object r6 = r13.P()
            java.lang.String r17 = ""
            if (r3 != 0) goto Le6
            if (r6 != r10) goto Led
        Le6:
            i0.j1 r6 = i0.r.u(r17)
            r13.k0(r6)
        Led:
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r3 = r8.getValue()
            java.util.List r3 = (java.util.List) r3
            if (r0 == r4) goto L105
            r18 = r15 & 64
            if (r18 == 0) goto L102
            boolean r18 = r13.f(r1)
            if (r18 == 0) goto L102
            goto L105
        L102:
            r18 = 0
            goto L107
        L105:
            r18 = 1
        L107:
            boolean r3 = r13.f(r3)
            r3 = r18 | r3
            java.lang.Object r7 = r13.P()
            if (r3 != 0) goto L115
            if (r7 != r10) goto L126
        L115:
            java.lang.Object r3 = r8.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.String r3 = s(r1, r3)
            i0.j1 r7 = i0.r.u(r3)
            r13.k0(r7)
        L126:
            r3 = r7
            i0.a1 r3 = (i0.a1) r3
            if (r0 == r4) goto L138
            r7 = r15 & 64
            if (r7 == 0) goto L136
            boolean r7 = r13.f(r1)
            if (r7 == 0) goto L136
            goto L138
        L136:
            r7 = 0
            goto L139
        L138:
            r7 = 1
        L139:
            java.lang.Object r4 = r13.P()
            if (r7 != 0) goto L141
            if (r4 != r10) goto L148
        L141:
            i0.j1 r4 = i0.r.u(r17)
            r13.k0(r4)
        L148:
            i0.a1 r4 = (i0.a1) r4
            r7 = 32
            if (r0 == r7) goto L15b
            r7 = r15 & 64
            if (r7 == 0) goto L159
            boolean r7 = r13.f(r1)
            if (r7 == 0) goto L159
            goto L15b
        L159:
            r7 = 0
            goto L15c
        L15b:
            r7 = 1
        L15c:
            java.lang.Object r2 = r13.P()
            if (r7 != 0) goto L164
            if (r2 != r10) goto L16c
        L164:
            r2 = 0
            i0.j1 r2 = i0.r.u(r2)
            r13.k0(r2)
        L16c:
            i0.a1 r2 = (i0.a1) r2
            r7 = 32
            if (r0 == r7) goto L180
            r0 = r15 & 64
            if (r0 == 0) goto L17d
            boolean r0 = r13.f(r1)
            if (r0 == 0) goto L17d
            goto L180
        L17d:
            r16 = 0
            goto L182
        L180:
            r16 = 1
        L182:
            java.lang.Object r0 = r13.P()
            if (r16 != 0) goto L18a
            if (r0 != r10) goto L193
        L18a:
            tf.v r0 = tf.v.f13169g
            i0.j1 r0 = i0.r.u(r0)
            r13.k0(r0)
        L193:
            i0.a1 r0 = (i0.a1) r0
            r10 = r8
            r8 = r4
            r4 = r11
            r11 = r0
            c9.s0 r0 = new c9.s0
            r7 = r5
            r5 = r9
            r9 = r2
            r2 = r6
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 1965846147(0x752c6e83, float:2.1858313E32)
            s0.d r0 = s0.i.e(r1, r0, r13)
            int r1 = r15 << 18
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r1 = r1 | 390(0x186, float:5.47E-43)
            r18 = 3072(0xc00, float:4.305E-42)
            r15 = r0
            r0 = 0
            r17 = r1
            java.lang.String r1 = "聊天分组"
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r9 = r22
            r16 = r25
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            goto L1d1
        L1ce:
            r25.V()
        L1d1:
            i0.r1 r8 = r25.t()
            if (r8 == 0) goto L1ec
            c9.t0 r0 = new c9.t0
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        L1ec:
            return
    }

    public final void q(java.lang.String r10, fg.l r11, i0.h0 r12, int r13) {
            r9 = this;
            r0 = -700545265(0xffffffffd63e870f, float:-5.237182E13)
            r12.b0(r0)
            r0 = r13 & 6
            if (r0 != 0) goto L15
            boolean r0 = r12.f(r10)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r13
            goto L16
        L15:
            r0 = r13
        L16:
            r1 = r13 & 48
            if (r1 != 0) goto L26
            boolean r1 = r12.h(r11)
            if (r1 == 0) goto L23
            r1 = 32
            goto L25
        L23:
            r1 = 16
        L25:
            r0 = r0 | r1
        L26:
            r1 = r13 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L36
            boolean r5 = r12.f(r9)
            if (r5 == 0) goto L33
            r5 = 256(0x100, float:3.59E-43)
            goto L35
        L33:
            r5 = 128(0x80, float:1.8E-43)
        L35:
            r0 = r0 | r5
        L36:
            r5 = r0 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            r7 = 1
            if (r5 == r6) goto L3f
            r5 = r7
            goto L40
        L3f:
            r5 = 0
        L40:
            r6 = r0 & 1
            boolean r5 = r12.S(r6, r5)
            if (r5 == 0) goto L6e
            r5 = 8
            float r5 = (float) r5
            y0.l r6 = y0.l.f21818a
            r8 = 0
            y0.o r7 = p.d.n(r6, r8, r5, r7)
            r5 = r0 & 14
            r5 = r5 | 3120(0xc30, float:4.372E-42)
            int r6 = r0 << 3
            r6 = r6 & 896(0x380, float:1.256E-42)
            r5 = r5 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            int r0 = r0 << 6
            r0 = r0 & r6
            r0 = r0 | r5
            r2 = 0
            java.lang.String r6 = "搜索聊天分组"
            r5 = r10
            r3 = r11
            r4 = r12
            r1 = r0
            r0 = r9
            r0.g(r1, r2, r3, r4, r5, r6, r7)
            goto L71
        L6e:
            r12.V()
        L71:
            i0.r1 r6 = r12.t()
            if (r6 == 0) goto L83
            b0.r r0 = new b0.r
            r5 = 1
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L83:
            return
    }

    public final void r(java.lang.String r24, i0.h0 r25, int r26) {
            r23 = this;
            r0 = r25
            r1 = -1909802936(0xffffffff8e2ab848, float:-2.1042846E-30)
            r0.b0(r1)
            r1 = r26 & 3
            r2 = 2
            if (r1 == r2) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            r2 = r26 & 1
            boolean r1 = r0.S(r2, r1)
            if (r1 == 0) goto L5e
            i0.m2 r1 = bi.d.f892a
            java.lang.Object r1 = r0.j(r1)
            bi.b r1 = (bi.b) r1
            long r2 = r1.g()
            r1 = 16
            long r4 = x6.d.D(r1)
            m2.k r6 = m2.k.f8698j
            y0.l r1 = y0.l.f21818a
            r7 = 1065353216(0x3f800000, float:1.0)
            y0.o r8 = p.h1.d(r1, r7)
            r1 = 10
            float r12 = (float) r1
            r13 = 7
            r9 = 0
            r10 = 0
            r11 = 0
            y0.o r1 = p.d.p(r8, r9, r10, r11, r12, r13)
            r21 = 0
            r22 = 262056(0x3ffa8, float:3.67219E-40)
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 1597494(0x186036, float:2.238566E-39)
            r19 = r0
            r0 = r24
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L61
        L5e:
            r25.V()
        L61:
            i0.r1 r0 = r25.t()
            if (r0 == 0) goto L76
            b0.q r1 = new b0.q
            r2 = 3
            r3 = r23
            r4 = r24
            r5 = r26
            r1.<init>(r3, r4, r5, r2)
            r0.f6035d = r1
            return
        L76:
            r3 = r23
            return
    }
}
