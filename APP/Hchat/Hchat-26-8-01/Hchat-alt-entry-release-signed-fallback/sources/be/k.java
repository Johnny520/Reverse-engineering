package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements i2.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object f812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f816e;

    public k(int r2) {
            r1 = this;
            switch(r2) {
                case 4: goto L2a;
                default: goto L3;
            }
        L3:
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f813b = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f812a = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f814c = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f815d = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f816e = r2
            return
        L2a:
            r1.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f813b = r2
            s0.a r2 = new s0.a
            r0 = 0
            r2.<init>(r0)
            r1.f814c = r2
            f.f0 r2 = new f.f0
            r2.<init>()
            r1.f815d = r2
            f.f0 r2 = new f.f0
            r2.<init>()
            r1.f816e = r2
            return
    }

    public k(android.text.Layout r6) {
            r5 = this;
            r5.<init>()
            r5.f813b = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 0
            r1 = r0
        Lc:
            java.lang.Object r2 = r5.f813b
            android.text.Layout r2 = (android.text.Layout) r2
            java.lang.CharSequence r2 = r2.getText()
            r3 = 10
            r4 = 4
            int r1 = og.m.q0(r2, r3, r1, r4)
            if (r1 >= 0) goto L2a
            java.lang.Object r1 = r5.f813b
            android.text.Layout r1 = (android.text.Layout) r1
            java.lang.CharSequence r1 = r1.getText()
            int r1 = r1.length()
            goto L2c
        L2a:
            int r1 = r1 + 1
        L2c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r6.add(r2)
            java.lang.Object r2 = r5.f813b
            android.text.Layout r2 = (android.text.Layout) r2
            java.lang.CharSequence r2 = r2.getText()
            int r2 = r2.length()
            if (r1 < r2) goto Lc
            r5.f812a = r6
            int r6 = r6.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
        L4c:
            if (r0 >= r6) goto L55
            r2 = 0
            r1.add(r2)
            int r0 = r0 + 1
            goto L4c
        L55:
            r5.f814c = r1
            java.lang.Object r6 = r5.f812a
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            boolean[] r6 = new boolean[r6]
            r5.f815d = r6
            java.lang.Object r6 = r5.f812a
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.size()
            return
    }

    public k(i2.g r31, i2.n0 r32, java.util.List r33, u2.c r34, m2.d r35) {
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r0.<init>()
            r0.f813b = r1
            r3 = r33
            r0.f814c = r3
            i2.p r3 = new i2.p
            r4 = 0
            r3.<init>(r0, r4)
            sf.d r5 = sf.d.f12416h
            sf.c r3 = be.h.G(r5, r3)
            r0.f815d = r3
            i2.p r3 = new i2.p
            r6 = 1
            r3.<init>(r0, r6)
            sf.c r3 = be.h.G(r5, r3)
            r0.f816e = r3
            i2.u r3 = r2.f6366b
            i2.g r5 = i2.h.f6321a
            java.util.ArrayList r5 = r1.f6316j
            java.lang.String r7 = r1.f6314h
            tf.t r8 = tf.t.f13167g
            if (r5 == 0) goto L3f
            i2.f r9 = new i2.f
            r9.<init>(r6)
            java.util.List r5 = tf.m.K1(r5, r9)
            goto L40
        L3f:
            r5 = r8
        L40:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            tf.k r9 = new tf.k
            r9.<init>()
            int r10 = r5.size()
            r11 = r4
            r12 = r11
        L50:
            if (r11 >= r10) goto L134
            java.lang.Object r13 = r5.get(r11)
            i2.e r13 = (i2.e) r13
            java.lang.Object r14 = r13.f6288a
            i2.u r14 = (i2.u) r14
            i2.u r14 = r3.a(r14)
            r15 = 14
            i2.e r13 = i2.e.a(r13, r14, r4, r15)
            java.lang.Object r14 = r13.f6288a
            int r15 = r13.f6290c
            int r13 = r13.f6289b
        L6c:
            if (r12 >= r13) goto Lbc
            boolean r16 = r9.isEmpty()
            if (r16 != 0) goto Lbc
            java.lang.Object r16 = r9.last()
            r4 = r16
            i2.e r4 = (i2.e) r4
            r16 = r5
            int r5 = r4.f6290c
            r17 = r8
            java.lang.Object r8 = r4.f6288a
            if (r13 >= r5) goto L95
            i2.e r4 = new i2.e
            r4.<init>(r12, r13, r8)
            r6.add(r4)
            r12 = r13
            r5 = r16
            r8 = r17
        L93:
            r4 = 0
            goto L6c
        L95:
            r18 = r10
            i2.e r10 = new i2.e
            r10.<init>(r12, r5, r8)
            r6.add(r10)
            int r12 = r4.f6290c
        La1:
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto Lb5
            java.lang.Object r4 = r9.last()
            i2.e r4 = (i2.e) r4
            int r4 = r4.f6290c
            if (r12 != r4) goto Lb5
            r9.removeLast()
            goto La1
        Lb5:
            r5 = r16
            r8 = r17
            r10 = r18
            goto L93
        Lbc:
            r16 = r5
            r17 = r8
            r18 = r10
            if (r12 >= r13) goto Lcd
            i2.e r4 = new i2.e
            r4.<init>(r12, r13, r3)
            r6.add(r4)
            r12 = r13
        Lcd:
            java.lang.Object r4 = r9.g()
            i2.e r4 = (i2.e) r4
            if (r4 == 0) goto L121
            int r5 = r4.f6290c
            java.lang.Object r8 = r4.f6288a
            int r4 = r4.f6289b
            if (r4 != r13) goto Lf3
            if (r5 != r15) goto Lf3
            r9.removeLast()
            i2.e r4 = new i2.e
            i2.u r8 = (i2.u) r8
            i2.u r14 = (i2.u) r14
            i2.u r5 = r8.a(r14)
            r4.<init>(r13, r15, r5)
            r9.addLast(r4)
            goto L129
        Lf3:
            if (r4 != r5) goto L109
            i2.e r10 = new i2.e
            r10.<init>(r4, r5, r8)
            r6.add(r10)
            r9.removeLast()
            i2.e r4 = new i2.e
            r4.<init>(r13, r15, r14)
            r9.addLast(r4)
            goto L129
        L109:
            if (r5 < r15) goto L11c
            i2.e r4 = new i2.e
            i2.u r8 = (i2.u) r8
            i2.u r14 = (i2.u) r14
            i2.u r5 = r8.a(r14)
            r4.<init>(r13, r15, r5)
            r9.addLast(r4)
            goto L129
        L11c:
            j8.o.o()
            r1 = 0
            throw r1
        L121:
            i2.e r4 = new i2.e
            r4.<init>(r13, r15, r14)
            r9.addLast(r4)
        L129:
            int r11 = r11 + 1
            r5 = r16
            r8 = r17
            r10 = r18
            r4 = 0
            goto L50
        L134:
            r17 = r8
        L136:
            int r4 = r7.length()
            if (r12 > r4) goto L16a
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L16a
            java.lang.Object r4 = r9.last()
            i2.e r4 = (i2.e) r4
            i2.e r5 = new i2.e
            java.lang.Object r8 = r4.f6288a
            int r4 = r4.f6290c
            r5.<init>(r12, r4, r8)
            r6.add(r5)
        L154:
            boolean r5 = r9.isEmpty()
            if (r5 != 0) goto L168
            java.lang.Object r5 = r9.last()
            i2.e r5 = (i2.e) r5
            int r5 = r5.f6290c
            if (r4 != r5) goto L168
            r9.removeLast()
            goto L154
        L168:
            r12 = r4
            goto L136
        L16a:
            int r4 = r7.length()
            if (r12 >= r4) goto L17c
            i2.e r4 = new i2.e
            int r5 = r7.length()
            r4.<init>(r12, r5, r3)
            r6.add(r4)
        L17c:
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L18c
            i2.e r4 = new i2.e
            r5 = 0
            r4.<init>(r5, r5, r3)
            r6.add(r4)
            goto L18d
        L18c:
            r5 = 0
        L18d:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r8 = r6.size()
            r4.<init>(r8)
            int r8 = r6.size()
            r9 = r5
        L19b:
            if (r9 >= r8) goto L28d
            java.lang.Object r10 = r6.get(r9)
            i2.e r10 = (i2.e) r10
            int r11 = r10.f6289b
            int r12 = r10.f6290c
            i2.g r13 = new i2.g
            if (r11 == r12) goto L1b0
            java.lang.String r14 = r7.substring(r11, r12)
            goto L1b2
        L1b0:
            java.lang.String r14 = ""
        L1b2:
            g0.o r15 = new g0.o
            r5 = 29
            r15.<init>(r5)
            java.util.List r5 = i2.h.a(r1, r11, r12, r15)
            if (r5 != 0) goto L1c1
            r5 = r17
        L1c1:
            r13.<init>(r14, r5)
            java.lang.Object r5 = r10.f6288a
            i2.u r5 = (i2.u) r5
            int r10 = r5.f6392b
            if (r10 != 0) goto L1fc
            int r10 = r3.f6392b
            int r15 = r5.f6391a
            r29 = r6
            r16 = r7
            long r6 = r5.f6393c
            t2.q r1 = r5.f6394d
            r23 = r1
            i2.w r1 = r5.f6395e
            r24 = r1
            t2.i r1 = r5.f6396f
            r25 = r1
            int r1 = r5.f6397g
            r26 = r1
            int r1 = r5.f6398h
            t2.s r5 = r5.f6399i
            i2.u r18 = new i2.u
            r27 = r1
            r28 = r5
            r21 = r6
            r20 = r10
            r19 = r15
            r18.<init>(r19, r20, r21, r23, r24, r25, r26, r27, r28)
            r5 = r18
            goto L200
        L1fc:
            r29 = r6
            r16 = r7
        L200:
            i2.s r1 = new i2.s
            i2.n0 r6 = new i2.n0
            i2.f0 r7 = r2.f6365a
            i2.u r5 = r3.a(r5)
            r6.<init>(r7, r5)
            java.util.List r5 = r13.f6313g
            if (r5 != 0) goto L214
            r21 = r17
            goto L216
        L214:
            r21 = r5
        L216:
            java.lang.Object r5 = r0.f814c
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            int r10 = r5.size()
            r7.<init>(r10)
            int r10 = r5.size()
            r13 = 0
        L228:
            if (r13 >= r10) goto L267
            java.lang.Object r15 = r5.get(r13)
            i2.e r15 = (i2.e) r15
            int r2 = r15.f6289b
            r25 = r3
            int r3 = r15.f6290c
            boolean r18 = i2.h.b(r11, r12, r2, r3)
            if (r18 == 0) goto L25c
            if (r11 > r2) goto L243
            if (r3 > r12) goto L243
        L240:
            r18 = r2
            goto L249
        L243:
            java.lang.String r18 = "placeholder can not overlap with paragraph."
            o2.a.a(r18)
            goto L240
        L249:
            i2.e r2 = new i2.e
            java.lang.Object r15 = r15.f6288a
            r19 = r3
            int r3 = r18 - r11
            r18 = r5
            int r5 = r19 - r11
            r2.<init>(r3, r5, r15)
            r7.add(r2)
            goto L25e
        L25c:
            r18 = r5
        L25e:
            int r13 = r13 + 1
            r2 = r32
            r5 = r18
            r3 = r25
            goto L228
        L267:
            r25 = r3
            q2.d r18 = new q2.d
            r24 = r34
            r23 = r35
            r20 = r6
            r22 = r7
            r19 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r2 = r18
            r1.<init>(r2, r11, r12)
            r4.add(r1)
            int r9 = r9 + 1
            r1 = r31
            r2 = r32
            r7 = r16
            r6 = r29
            r5 = 0
            goto L19b
        L28d:
            r0.f812a = r4
            return
    }

    public k(l3.l r1, na.k r2, b5.c r3, sa.c r4, b5.c r5) {
            r0 = this;
            r0.<init>()
            r0.f813b = r1
            r0.f812a = r2
            r0.f814c = r3
            r0.f815d = r4
            r0.f816e = r5
            return
    }

    public k(ud.e r2, java.util.ArrayList r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f814c = r0
            r1.f813b = r2
            r1.f812a = r3
            return
    }

    @Override // i2.t
    public boolean a() {
            r5 = this;
            java.lang.Object r0 = r5.f812a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L1f
            java.lang.Object r4 = r0.get(r3)
            i2.s r4 = (i2.s) r4
            q2.d r4 = r4.f6388a
            boolean r4 = r4.a()
            if (r4 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            int r3 = r3 + 1
            goto La
        L1f:
            return r2
    }

    @Override // i2.t
    public float b() {
            r1 = this;
            java.lang.Object r0 = r1.f815d
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            return r0
    }

    @Override // i2.t
    public float c() {
            r1 = this;
            java.lang.Object r0 = r1.f816e
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            return r0
    }

    public i0.f d(s0.b r8, fg.a r9) {
            r7 = this;
            gg.s r0 = new gg.s
            r0.<init>()
            r1 = -1
            r0.f4562g = r1
            java.lang.Object r1 = r7.f813b
            monitor-enter(r1)
            java.lang.Object r2 = r7.f812a     // Catch: java.lang.Throwable -> L18
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1b
            r8.b(r2)     // Catch: java.lang.Throwable -> L18
            g1.d r8 = i0.e.f5865h     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)
            return r8
        L18:
            r8 = move-exception
            goto L9e
        L1b:
            java.lang.Object r2 = r7.f814c     // Catch: java.lang.Throwable -> L18
            s0.a r2 = (s0.a) r2     // Catch: java.lang.Throwable -> L18
        L1f:
            int r3 = r2.get()     // Catch: java.lang.Throwable -> L18
            int r4 = r3 + 1
            boolean r3 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1f
            r2 = 134217727(0x7ffffff, float:3.8518597E-34)
            r2 = r2 & r4
            r3 = 1
            r5 = 0
            if (r2 != r3) goto L35
            r2 = r3
            goto L36
        L35:
            r2 = r5
        L36:
            int r4 = r4 >>> 27
            r4 = r4 & 15
            r0.f4562g = r4     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r7.f815d     // Catch: java.lang.Throwable -> L18
            f.f0 r4 = (f.f0) r4     // Catch: java.lang.Throwable -> L18
            r4.a(r8)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)
            if (r2 == 0) goto L91
            if (r9 == 0) goto L91
            r9.invoke()     // Catch: java.lang.Throwable -> L4c
            goto L91
        L4c:
            r9 = move-exception
            java.lang.Object r1 = r7.f813b
            monitor-enter(r1)
            java.lang.Object r2 = r7.f812a     // Catch: java.lang.Throwable -> L6e
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L58
        L56:
            monitor-exit(r1)
            goto L91
        L58:
            r7.f812a = r9     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = r7.f815d     // Catch: java.lang.Throwable -> L6e
            f.f0 r2 = (f.f0) r2     // Catch: java.lang.Throwable -> L6e
            java.lang.Object[] r4 = r2.f2803a     // Catch: java.lang.Throwable -> L6e
            int r2 = r2.f2804b     // Catch: java.lang.Throwable -> L6e
        L62:
            if (r5 >= r2) goto L70
            r6 = r4[r5]     // Catch: java.lang.Throwable -> L6e
            s0.b r6 = (s0.b) r6     // Catch: java.lang.Throwable -> L6e
            r6.b(r9)     // Catch: java.lang.Throwable -> L6e
            int r5 = r5 + 1
            goto L62
        L6e:
            r8 = move-exception
            goto L8f
        L70:
            java.lang.Object r9 = r7.f815d     // Catch: java.lang.Throwable -> L6e
            f.f0 r9 = (f.f0) r9     // Catch: java.lang.Throwable -> L6e
            r9.d()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r9 = r7.f814c     // Catch: java.lang.Throwable -> L6e
            s0.a r9 = (s0.a) r9     // Catch: java.lang.Throwable -> L6e
        L7b:
            int r2 = r9.get()     // Catch: java.lang.Throwable -> L6e
            int r4 = r2 >>> 27
            r4 = r4 & 15
            int r4 = r4 + r3
            r4 = r4 & 15
            int r4 = r4 << 27
            boolean r2 = r9.compareAndSet(r2, r4)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L7b
            goto L56
        L8f:
            monitor-exit(r1)
            throw r8
        L91:
            b.e r9 = new b.e
            ab.e r1 = new ab.e
            r2 = 12
            r1.<init>(r8, r7, r0, r2)
            r9.<init>(r1)
            return r9
        L9e:
            monitor-exit(r1)
            throw r8
    }

    public java.text.Bidi e(int r15) {
            r14 = this;
            java.lang.Object r0 = r14.f813b
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.f812a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.f814c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.f815d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.f816e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.k(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.f816e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.f816e = r7
            return r6
    }

    public void f(fg.l r6) {
            r5 = this;
            java.lang.Object r0 = r5.f813b
            monitor-enter(r0)
            java.lang.Object r1 = r5.f815d     // Catch: java.lang.Throwable -> L36
            f.f0 r1 = (f.f0) r1     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r5.f816e     // Catch: java.lang.Throwable -> L36
            f.f0 r2 = (f.f0) r2     // Catch: java.lang.Throwable -> L36
            r5.f815d = r2     // Catch: java.lang.Throwable -> L36
            r5.f816e = r1     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r5.f814c     // Catch: java.lang.Throwable -> L36
            s0.a r2 = (s0.a) r2     // Catch: java.lang.Throwable -> L36
        L13:
            int r3 = r2.get()     // Catch: java.lang.Throwable -> L36
            int r4 = r3 >>> 27
            r4 = r4 & 15
            int r4 = r4 + 1
            r4 = r4 & 15
            int r4 = r4 << 27
            boolean r3 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L13
            int r2 = r1.f2804b     // Catch: java.lang.Throwable -> L36
            r3 = 0
        L2a:
            if (r3 >= r2) goto L38
            java.lang.Object r4 = r1.f(r3)     // Catch: java.lang.Throwable -> L36
            r6.invoke(r4)     // Catch: java.lang.Throwable -> L36
            int r3 = r3 + 1
            goto L2a
        L36:
            r6 = move-exception
            goto L3d
        L38:
            r1.d()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)
            return
        L3d:
            monitor-exit(r0)
            throw r6
    }

    public float g(int r3, boolean r4) {
            r2 = this;
            java.lang.Object r0 = r2.f813b
            android.text.Layout r0 = (android.text.Layout) r0
            int r1 = r0.getLineForOffset(r3)
            int r1 = r0.getLineEnd(r1)
            if (r3 <= r1) goto Lf
            r3 = r1
        Lf:
            if (r4 == 0) goto L16
            float r3 = r0.getPrimaryHorizontal(r3)
            return r3
        L16:
            float r3 = r0.getSecondaryHorizontal(r3)
            return r3
    }

    public od.c h(od.c r3) {
            r2 = this;
            java.lang.Object r0 = r2.f812a
            java.util.HashMap r0 = (java.util.HashMap) r0
            monitor-enter(r0)
            java.lang.Object r1 = r2.f812a     // Catch: java.lang.Throwable -> L13
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L13
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L13
            od.c r1 = (od.c) r1     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r3 = move-exception
            goto L1e
        L15:
            java.lang.Object r1 = r2.f812a     // Catch: java.lang.Throwable -> L13
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L13
            r1.put(r3, r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r3
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    public float i(int r18, boolean r19, boolean r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            java.lang.Object r3 = r0.f813b
            android.text.Layout r3 = (android.text.Layout) r3
            if (r2 != 0) goto L11
            float r1 = r17.g(r18, r19)
            return r1
        L11:
            int r4 = j2.g.d(r3, r1, r2)
            int r5 = r3.getLineStart(r4)
            int r6 = r3.getLineEnd(r4)
            if (r1 == r5) goto L26
            if (r1 == r6) goto L26
            float r1 = r17.g(r18, r19)
            return r1
        L26:
            if (r1 == 0) goto L169
            java.lang.CharSequence r7 = r3.getText()
            int r7 = r7.length()
            if (r1 != r7) goto L34
            goto L169
        L34:
            int r2 = r0.j(r1, r2)
            int r7 = r0.k(r2)
            int r7 = r3.getLineForOffset(r7)
            int r7 = r3.getParagraphDirection(r7)
            r8 = -1
            r10 = 1
            if (r7 != r8) goto L4a
            r7 = r10
            goto L4b
        L4a:
            r7 = 0
        L4b:
            int r6 = r0.l(r6, r5)
            int r11 = r0.k(r2)
            int r12 = r5 - r11
            int r11 = r6 - r11
            java.text.Bidi r2 = r0.e(r2)
            if (r2 == 0) goto L62
            java.text.Bidi r2 = r2.createLineBidi(r12, r11)
            goto L63
        L62:
            r2 = 0
        L63:
            if (r2 == 0) goto L6b
            int r11 = r2.getRunCount()
            if (r11 != r10) goto L6e
        L6b:
            r13 = 0
            goto L147
        L6e:
            int r11 = r2.getRunCount()
            j2.e[] r12 = new j2.e[r11]
            r13 = 0
        L75:
            if (r13 >= r11) goto L98
            j2.e r14 = new j2.e
            int r15 = r2.getRunStart(r13)
            int r15 = r15 + r5
            int r16 = r2.getRunLimit(r13)
            int r8 = r16 + r5
            int r16 = r2.getRunLevel(r13)
            int r9 = r16 % 2
            if (r9 != r10) goto L8e
            r9 = r10
            goto L8f
        L8e:
            r9 = 0
        L8f:
            r14.<init>(r15, r8, r9)
            r12[r13] = r14
            int r13 = r13 + 1
            r8 = -1
            goto L75
        L98:
            int r8 = r2.getRunCount()
            byte[] r9 = new byte[r8]
            r13 = 0
        L9f:
            if (r13 >= r8) goto Lab
            int r14 = r2.getRunLevel(r13)
            byte r14 = (byte) r14
            r9[r13] = r14
            int r13 = r13 + 1
            goto L9f
        Lab:
            r13 = 0
            java.text.Bidi.reorderVisually(r9, r13, r12, r13, r11)
            if (r1 != r5) goto Lf9
            r2 = r13
        Lb2:
            if (r2 >= r11) goto Lbf
            r5 = r12[r2]
            int r5 = r5.f6680a
            if (r5 != r1) goto Lbc
            r8 = r2
            goto Lc0
        Lbc:
            int r2 = r2 + 1
            goto Lb2
        Lbf:
            r8 = -1
        Lc0:
            r1 = r12[r8]
            if (r19 != 0) goto Lcb
            boolean r1 = r1.f6682c
            if (r7 != r1) goto Lc9
            goto Lcb
        Lc9:
            r9 = r7
            goto Ld0
        Lcb:
            if (r7 != 0) goto Lcf
            r9 = r10
            goto Ld0
        Lcf:
            r9 = r13
        Ld0:
            if (r8 != 0) goto Ld9
            if (r9 == 0) goto Ld9
            float r1 = r3.getLineLeft(r4)
            return r1
        Ld9:
            int r11 = r11 - r10
            if (r8 != r11) goto Le3
            if (r9 != 0) goto Le3
            float r1 = r3.getLineRight(r4)
            return r1
        Le3:
            if (r9 == 0) goto Lef
            int r8 = r8 - r10
            r1 = r12[r8]
            int r1 = r1.f6680a
            float r1 = r3.getPrimaryHorizontal(r1)
            return r1
        Lef:
            int r8 = r8 + r10
            r1 = r12[r8]
            int r1 = r1.f6680a
            float r1 = r3.getPrimaryHorizontal(r1)
            return r1
        Lf9:
            if (r1 <= r6) goto Lff
            int r1 = r0.l(r1, r5)
        Lff:
            r2 = r13
        L100:
            if (r2 >= r11) goto L10d
            r5 = r12[r2]
            int r5 = r5.f6681b
            if (r5 != r1) goto L10a
            r8 = r2
            goto L10e
        L10a:
            int r2 = r2 + 1
            goto L100
        L10d:
            r8 = -1
        L10e:
            r1 = r12[r8]
            if (r19 != 0) goto L11d
            boolean r1 = r1.f6682c
            if (r7 != r1) goto L117
            goto L11d
        L117:
            if (r7 != 0) goto L11b
            r9 = r10
            goto L11e
        L11b:
            r9 = r13
            goto L11e
        L11d:
            r9 = r7
        L11e:
            if (r8 != 0) goto L127
            if (r9 == 0) goto L127
            float r1 = r3.getLineLeft(r4)
            return r1
        L127:
            int r11 = r11 - r10
            if (r8 != r11) goto L131
            if (r9 != 0) goto L131
            float r1 = r3.getLineRight(r4)
            return r1
        L131:
            if (r9 == 0) goto L13d
            int r8 = r8 - r10
            r1 = r12[r8]
            int r1 = r1.f6681b
            float r1 = r3.getPrimaryHorizontal(r1)
            return r1
        L13d:
            int r8 = r8 + r10
            r1 = r12[r8]
            int r1 = r1.f6681b
            float r1 = r3.getPrimaryHorizontal(r1)
            return r1
        L147:
            boolean r2 = r3.isRtlCharAt(r5)
            if (r19 != 0) goto L14f
            if (r7 != r2) goto L154
        L14f:
            if (r7 != 0) goto L153
            r7 = r10
            goto L154
        L153:
            r7 = r13
        L154:
            if (r1 != r5) goto L158
            r9 = r7
            goto L15d
        L158:
            if (r7 != 0) goto L15c
            r9 = r10
            goto L15d
        L15c:
            r9 = r13
        L15d:
            if (r9 == 0) goto L164
            float r1 = r3.getLineLeft(r4)
            return r1
        L164:
            float r1 = r3.getLineRight(r4)
            return r1
        L169:
            float r1 = r17.g(r18, r19)
            return r1
    }

    public int j(int r3, boolean r4) {
            r2 = this;
            java.lang.Object r0 = r2.f812a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            int r1 = a.a.p(r0, r1)
            if (r1 >= 0) goto L12
            int r1 = r1 + 1
            int r1 = -r1
            goto L14
        L12:
            int r1 = r1 + 1
        L14:
            if (r4 == 0) goto L27
            if (r1 <= 0) goto L27
            int r4 = r1 + (-1)
            java.lang.Object r0 = r0.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r3 != r0) goto L27
            return r4
        L27:
            return r1
    }

    public int k(int r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.Object r0 = r1.f812a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r2 + (-1)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            return r2
    }

    public int l(int r3, int r4) {
            r2 = this;
        L0:
            if (r3 <= r4) goto L3d
            java.lang.Object r0 = r2.f813b
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.CharSequence r0 = r0.getText()
            int r1 = r3 + (-1)
            char r0 = r0.charAt(r1)
            r1 = 32
            if (r0 == r1) goto L3a
            r1 = 10
            if (r0 == r1) goto L3a
            r1 = 5760(0x1680, float:8.071E-42)
            if (r0 == r1) goto L3a
            r1 = 8192(0x2000, float:1.148E-41)
            int r1 = gg.l.c(r0, r1)
            if (r1 < 0) goto L30
            r1 = 8202(0x200a, float:1.1493E-41)
            int r1 = gg.l.c(r0, r1)
            if (r1 > 0) goto L30
            r1 = 8199(0x2007, float:1.1489E-41)
            if (r0 != r1) goto L3a
        L30:
            r1 = 8287(0x205f, float:1.1613E-41)
            if (r0 == r1) goto L3a
            r1 = 12288(0x3000, float:1.7219E-41)
            if (r0 != r1) goto L39
            goto L3a
        L39:
            return r3
        L3a:
            int r3 = r3 + (-1)
            goto L0
        L3d:
            return r3
    }

    public void m(java.lang.String r17, java.lang.String r18, java.lang.String r19, na.a r20) {
            r16 = this;
            r0 = r16
            r6 = r18
            r1 = r20
            java.lang.Object r2 = r0.f816e
            b5.c r2 = (b5.c) r2
            java.lang.String r5 = r16.p(r17, r18)
            java.lang.Object r3 = r0.f814c
            b5.c r3 = (b5.c) r3
            java.lang.Object r4 = r3.f469a
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r3.f470b
            na.k r3 = (na.k) r3
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r8 = "Hchat_redpacket_config"
            java.lang.String r9 = ""
            r10 = 1
            r11 = 0
            if (r7 == 0) goto L28
        L26:
            r7 = r11
            goto L7f
        L28:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L2f
            goto L4d
        L2f:
            if (r6 == 0) goto L4d
            java.util.Set r7 = r3.f9176a
            boolean r7 = r7.contains(r6)
            if (r7 == 0) goto L3a
            goto L71
        L3a:
            java.lang.String r7 = f8.i.s0(r6)
            boolean r12 = android.text.TextUtils.isEmpty(r7)
            if (r12 != 0) goto L4d
            java.util.Set r12 = r3.f9177b
            boolean r7 = r12.contains(r7)
            if (r7 == 0) goto L4d
            goto L71
        L4d:
            java.lang.String r7 = f8.i.s0(r6)
            boolean r12 = android.text.TextUtils.isEmpty(r7)
            if (r12 != 0) goto L5e
            java.lang.String r12 = "sendid:"
            java.lang.String r7 = r12.concat(r7)
            goto L63
        L5e:
            if (r6 == 0) goto L62
            r7 = r6
            goto L63
        L62:
            r7 = r9
        L63:
            boolean r12 = android.text.TextUtils.isEmpty(r7)
            if (r12 != 0) goto L73
            java.util.Set r12 = r3.f9178c
            boolean r7 = r12.contains(r7)
            if (r7 == 0) goto L73
        L71:
            r7 = r10
            goto L7f
        L73:
            android.content.SharedPreferences r7 = ub.b.c(r4, r8)     // Catch: java.lang.Throwable -> L26
            java.lang.String r12 = b5.c.e(r6)     // Catch: java.lang.Throwable -> L26
            boolean r7 = r7.getBoolean(r12, r11)     // Catch: java.lang.Throwable -> L26
        L7f:
            if (r7 == 0) goto L83
            goto L101
        L83:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L94
            java.lang.String r7 = "f_"
            java.lang.String r12 = "_"
            r13 = r19
            java.lang.String r7 = bc.e.j(r7, r5, r12, r13)
            goto L95
        L94:
            r7 = r6
        L95:
            java.lang.String r12 = "hb_stats_failed"
            boolean r13 = android.text.TextUtils.isEmpty(r6)
            if (r13 != 0) goto L9f
            r13 = r6
            goto La0
        L9f:
            r13 = r7
        La0:
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 != 0) goto Lc0
            java.lang.String r14 = "stat:"
            java.lang.String r13 = wb.en.g(r14, r13)
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 != 0) goto Lbc
            java.util.Set r3 = r3.f9180e
            boolean r3 = r3.add(r13)
            if (r3 == 0) goto Lbc
            r3 = r10
            goto Lbd
        Lbc:
            r3 = r11
        Lbd:
            if (r3 != 0) goto Lc0
            goto Ld4
        Lc0:
            android.content.SharedPreferences r3 = ub.b.c(r4, r8)     // Catch: java.lang.Throwable -> Ld4
            android.content.SharedPreferences$Editor r4 = r3.edit()     // Catch: java.lang.Throwable -> Ld4
            int r3 = r3.getInt(r12, r11)     // Catch: java.lang.Throwable -> Ld4
            int r3 = r3 + r10
            android.content.SharedPreferences$Editor r3 = r4.putInt(r12, r3)     // Catch: java.lang.Throwable -> Ld4
            r3.apply()     // Catch: java.lang.Throwable -> Ld4
        Ld4:
            boolean r8 = r1.E
            boolean r3 = r1.F
            if (r8 != 0) goto Ldd
            if (r3 != 0) goto Ldd
            goto L101
        Ldd:
            r4 = r10
            boolean r10 = r1.f9096y
            r12 = r11
            boolean r11 = r1.A
            r13 = r12
            java.lang.String r12 = r1.B
            java.lang.Object r14 = r0.f812a
            na.k r14 = (na.k) r14
            java.lang.String r15 = "notify:"
            java.lang.String r7 = wb.en.g(r15, r7)
            boolean r15 = android.text.TextUtils.isEmpty(r7)
            if (r15 != 0) goto Lff
            java.util.Set r14 = r14.f9180e
            boolean r7 = r14.add(r7)
            if (r7 == 0) goto Lff
            r13 = r4
        Lff:
            if (r13 != 0) goto L102
        L101:
            return
        L102:
            java.lang.Object r4 = r0.f815d
            sa.c r4 = (sa.c) r4
            java.lang.Object r7 = r0.f813b
            l3.l r7 = (l3.l) r7
            java.lang.String r13 = "hb_notify_failed_title"
            java.lang.String r14 = "未抢到红包"
            java.lang.String r7 = r7.d(r13, r14)
            java.lang.String r7 = r2.n(r7, r9, r5, r6)
            java.lang.String r13 = r1.G
            boolean r15 = android.text.TextUtils.isEmpty(r13)
            if (r15 == 0) goto L11f
            r13 = r14
        L11f:
            java.lang.String r13 = r2.n(r13, r9, r5, r6)
            java.lang.String r1 = r1.H
            boolean r15 = android.text.TextUtils.isEmpty(r1)
            if (r15 == 0) goto L12c
            goto L12d
        L12c:
            r14 = r1
        L12d:
            java.lang.String r1 = r2.n(r14, r9, r5, r6)
            r2 = r7
            r7 = 100000(0x186a0, float:1.4013E-40)
            r9 = r4
            r4 = r1
            r1 = r9
            r9 = r3
            r3 = r13
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public void n(java.lang.String r20, java.lang.String r21, java.lang.String r22, na.a r23) {
            r19 = this;
            r0 = r19
            r1 = r20
            r6 = r22
            r2 = r23
            java.lang.Object r3 = r0.f816e
            b5.c r3 = (b5.c) r3
            r4 = r21
            java.lang.String r5 = r0.p(r4, r6)
            java.lang.Object r4 = r0.f814c
            b5.c r4 = (b5.c) r4
            java.lang.String r7 = "hb_stats_amount"
            java.lang.Object r8 = r4.f470b
            na.k r8 = (na.k) r8
            java.util.Set r8 = r8.f9178c
            java.lang.String r9 = "记录本人实收金额: "
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r11 = "元"
            java.lang.String r12 = ""
            if (r10 != 0) goto L30
            boolean r10 = android.text.TextUtils.isEmpty(r1)
            if (r10 == 0) goto L34
        L30:
            r18 = r3
            goto Le9
        L34:
            boolean r10 = android.text.TextUtils.isEmpty(r1)
            r13 = 0
            if (r10 == 0) goto L3d
        L3b:
            r10 = r13
            goto L57
        L3d:
            java.lang.String r10 = "[^0-9.\\-]"
            java.lang.String r10 = r1.replaceAll(r10, r12)     // Catch: java.lang.Throwable -> L3b
            boolean r14 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L3b
            if (r14 == 0) goto L4a
            goto L3b
        L4a:
            double r14 = java.lang.Double.parseDouble(r10)     // Catch: java.lang.Throwable -> L3b
            r16 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r14 = r14 * r16
            long r14 = java.lang.Math.round(r14)     // Catch: java.lang.Throwable -> L3b
            int r10 = (int) r14
        L57:
            if (r10 > 0) goto L5a
            goto L30
        L5a:
            java.lang.Object r14 = r4.f469a     // Catch: java.lang.Throwable -> L30
            android.content.Context r14 = (android.content.Context) r14     // Catch: java.lang.Throwable -> L30
            java.lang.String r15 = "Hchat_redpacket_config"
            android.content.SharedPreferences r14 = ub.b.c(r14, r15)     // Catch: java.lang.Throwable -> L30
            java.lang.String r15 = b5.c.e(r6)     // Catch: java.lang.Throwable -> L30
            boolean r16 = r14.getBoolean(r15, r13)     // Catch: java.lang.Throwable -> L30
            if (r16 != 0) goto L30
            java.lang.String r13 = f8.i.s0(r6)     // Catch: java.lang.Throwable -> L30
            boolean r16 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L30
            r17 = r10
            java.lang.String r10 = "sendid:"
            if (r16 != 0) goto L81
            java.lang.String r13 = r10.concat(r13)     // Catch: java.lang.Throwable -> L30
            goto L86
        L81:
            if (r6 == 0) goto L85
            r13 = r6
            goto L86
        L85:
            r13 = r12
        L86:
            boolean r16 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L30
            r18 = r3
            r3 = 1
            if (r16 != 0) goto L97
            boolean r13 = r8.contains(r13)     // Catch: java.lang.Throwable -> Le9
            if (r13 == 0) goto L97
            r13 = r3
            goto L98
        L97:
            r13 = 0
        L98:
            if (r13 == 0) goto L9b
            goto Le9
        L9b:
            java.lang.String r13 = f8.i.s0(r6)     // Catch: java.lang.Throwable -> Le9
            boolean r16 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> Le9
            if (r16 != 0) goto Laa
            java.lang.String r10 = r10.concat(r13)     // Catch: java.lang.Throwable -> Le9
            goto Laf
        Laa:
            if (r6 == 0) goto Lae
            r10 = r6
            goto Laf
        Lae:
            r10 = r12
        Laf:
            boolean r13 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Le9
            if (r13 != 0) goto Le9
            boolean r8 = r8.add(r10)     // Catch: java.lang.Throwable -> Le9
            if (r8 == 0) goto Le9
            android.content.SharedPreferences$Editor r8 = r14.edit()     // Catch: java.lang.Throwable -> Le9
            r10 = 0
            int r10 = r14.getInt(r7, r10)     // Catch: java.lang.Throwable -> Le9
            int r10 = r10 + r17
            android.content.SharedPreferences$Editor r7 = r8.putInt(r7, r10)     // Catch: java.lang.Throwable -> Le9
            android.content.SharedPreferences$Editor r3 = r7.putBoolean(r15, r3)     // Catch: java.lang.Throwable -> Le9
            r3.apply()     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le9
            r3.<init>(r9)     // Catch: java.lang.Throwable -> Le9
            r3.append(r1)     // Catch: java.lang.Throwable -> Le9
            r3.append(r11)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Le9
            java.lang.Object r4 = r4.f471c     // Catch: java.lang.Throwable -> Le9
            na.b r4 = (na.b) r4     // Catch: java.lang.Throwable -> Le9
            na.e r4 = r4.f9099h     // Catch: java.lang.Throwable -> Le9
            r4.d(r3)     // Catch: java.lang.Throwable -> Le9
        Le9:
            boolean r8 = r2.f9094w
            boolean r9 = r2.f9095x
            if (r8 != 0) goto Lf3
            if (r9 != 0) goto Lf3
            goto L169
        Lf3:
            boolean r10 = r2.f9096y
            boolean r3 = r2.A
            java.lang.String r4 = r2.B
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L108
            java.lang.String r7 = "t_"
            java.lang.String r13 = "_"
            java.lang.String r7 = bc.e.j(r7, r5, r13, r1)
            goto L109
        L108:
            r7 = r6
        L109:
            java.lang.Object r13 = r0.f812a
            na.k r13 = (na.k) r13
            boolean r14 = android.text.TextUtils.isEmpty(r7)
            if (r14 != 0) goto L169
            java.util.Set r13 = r13.f9179d
            if (r7 == 0) goto L118
            goto L119
        L118:
            r7 = r12
        L119:
            boolean r7 = r13.add(r7)
            if (r7 == 0) goto L169
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 == 0) goto L128
            java.lang.String r1 = "未知"
            goto L12c
        L128:
            java.lang.String r1 = r1.replace(r11, r12)
        L12c:
            java.lang.Object r7 = r0.f815d
            sa.c r7 = (sa.c) r7
            java.lang.Object r11 = r0.f813b
            l3.l r11 = (l3.l) r11
            java.lang.String r12 = "hb_notify_title"
            java.lang.String r13 = "自动抢红包"
            java.lang.String r11 = r11.d(r12, r13)
            r12 = r18
            java.lang.String r11 = r12.n(r11, r1, r5, r6)
            java.lang.String r13 = r2.C
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            java.lang.String r15 = "抢到红包 {amount} 元"
            if (r14 == 0) goto L14d
            r13 = r15
        L14d:
            java.lang.String r13 = r12.n(r13, r1, r5, r6)
            java.lang.String r2 = r2.D
            boolean r14 = android.text.TextUtils.isEmpty(r2)
            if (r14 == 0) goto L15a
            goto L15b
        L15a:
            r15 = r2
        L15b:
            java.lang.String r1 = r12.n(r15, r1, r5, r6)
            r12 = r4
            r4 = r1
            r1 = r7
            r7 = 0
            r2 = r11
            r11 = r3
            r3 = r13
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L169:
            return
    }

    public od.d o(od.d r3) {
            r2 = this;
            java.lang.Object r0 = r2.f814c
            java.util.HashMap r0 = (java.util.HashMap) r0
            monitor-enter(r0)
            java.lang.Object r1 = r2.f814c     // Catch: java.lang.Throwable -> L13
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L13
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L13
            od.d r1 = (od.d) r1     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r3 = move-exception
            goto L1e
        L15:
            java.lang.Object r1 = r2.f814c     // Catch: java.lang.Throwable -> L13
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L13
            r1.put(r3, r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r3
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    public java.lang.String p(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L7
            goto L19
        L7:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L19
            java.lang.Object r2 = r1.f812a
            na.k r2 = (na.k) r2
            java.util.concurrent.ConcurrentHashMap r2 = r2.f9183h
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
        L19:
            return r2
    }
}
