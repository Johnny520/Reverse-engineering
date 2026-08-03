package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.View f2999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.n f3000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fg.l f3001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fg.l f3002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w.q0 f3003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0.d1 f3004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y1.l2 f3005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n2.s f3006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n2.j f3007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f3008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f3009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public android.graphics.Rect f3010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f0.r f3011m;

    public u(android.view.View r5, f0.a r6, f0.n r7) {
            r4 = this;
            r4.<init>()
            r4.f2999a = r5
            r4.f3000b = r7
            e9.h r5 = new e9.h
            r0 = 21
            r5.<init>(r0)
            r4.f3001c = r5
            e9.h r5 = new e9.h
            r0 = 22
            r5.<init>(r0)
            r4.f3002d = r5
            n2.s r5 = new n2.s
            long r0 = i2.m0.f6358b
            r2 = 4
            java.lang.String r3 = ""
            r5.<init>(r2, r3, r0)
            r4.f3006h = r5
            n2.j r5 = n2.j.f8952g
            r4.f3007i = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f3008j = r5
            ab.a r5 = new ab.a
            r0 = 18
            r5.<init>(r4, r0)
            sf.d r0 = sf.d.f12416h
            sf.c r5 = be.h.G(r0, r5)
            r4.f3009k = r5
            f0.r r5 = new f0.r
            r5.<init>(r6, r7)
            r4.f3011m = r5
            return
    }

    public final f0.v a(android.view.inputmethod.EditorInfo r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            n2.s r2 = r0.f3006h
            i2.g r3 = r2.f8976a
            java.lang.String r3 = r3.f6314h
            long r4 = r2.f8977b
            n2.j r2 = r0.f3007i
            int r6 = r2.f8957e
            int r7 = r2.f8956d
            boolean r8 = r2.f8953a
            r10 = 4
            r11 = 5
            r13 = 7
            r14 = 6
            r15 = 3
            r12 = 2
            r9 = 1
            if (r6 != r9) goto L23
            if (r8 == 0) goto L21
        L1f:
            r6 = r14
            goto L3e
        L21:
            r6 = 0
            goto L3e
        L23:
            if (r6 != 0) goto L27
            r6 = r9
            goto L3e
        L27:
            if (r6 != r12) goto L2b
            r6 = r12
            goto L3e
        L2b:
            if (r6 != r14) goto L2f
            r6 = r11
            goto L3e
        L2f:
            if (r6 != r11) goto L33
            r6 = r13
            goto L3e
        L33:
            if (r6 != r15) goto L37
            r6 = r15
            goto L3e
        L37:
            if (r6 != r10) goto L3b
            r6 = r10
            goto L3e
        L3b:
            if (r6 != r13) goto L1a4
            goto L1f
        L3e:
            r1.imeOptions = r6
            p2.b r6 = r2.f8958f
            p2.b r13 = p2.b.f10086i
            boolean r13 = gg.l.a(r6, r13)
            if (r13 == 0) goto L4e
            r13 = 0
            r1.hintLocales = r13
            goto L86
        L4e:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = tf.n.e1(r6)
            r13.<init>(r14)
            java.lang.Object r6 = r6.f10087g
            java.util.Iterator r6 = r6.iterator()
        L5d:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L6f
            java.lang.Object r14 = r6.next()
            p2.a r14 = (p2.a) r14
            java.util.Locale r14 = r14.f10085a
            r13.add(r14)
            goto L5d
        L6f:
            r14 = 0
            java.util.Locale[] r6 = new java.util.Locale[r14]
            java.lang.Object[] r6 = r13.toArray(r6)
            java.util.Locale[] r6 = (java.util.Locale[]) r6
            int r13 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r13)
            java.util.Locale[] r6 = (java.util.Locale[]) r6
            android.os.LocaleList r13 = new android.os.LocaleList
            r13.<init>(r6)
            r1.hintLocales = r13
        L86:
            r6 = 9
            r13 = 8
            if (r7 != r9) goto L8e
        L8c:
            r10 = r9
            goto Lba
        L8e:
            if (r7 != r12) goto L98
            int r10 = r1.imeOptions
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r11
            r1.imeOptions = r10
            goto L8c
        L98:
            if (r7 != r15) goto L9c
            r10 = r12
            goto Lba
        L9c:
            if (r7 != r10) goto La0
            r10 = r15
            goto Lba
        La0:
            if (r7 != r11) goto La5
            r10 = 17
            goto Lba
        La5:
            r10 = 6
            if (r7 != r10) goto Lab
            r10 = 33
            goto Lba
        Lab:
            r10 = 7
            if (r7 != r10) goto Lb1
            r10 = 129(0x81, float:1.81E-43)
            goto Lba
        Lb1:
            if (r7 != r13) goto Lb6
            r10 = 18
            goto Lba
        Lb6:
            if (r7 != r6) goto L19c
            r10 = 8194(0x2002, float:1.1482E-41)
        Lba:
            r1.inputType = r10
            if (r8 != 0) goto Ld2
            r8 = r10 & 1
            if (r8 != r9) goto Ld2
            r8 = 131072(0x20000, float:1.83671E-40)
            r8 = r8 | r10
            r1.inputType = r8
            int r8 = r2.f8957e
            if (r8 != r9) goto Ld2
            int r8 = r1.imeOptions
            r10 = 1073741824(0x40000000, float:2.0)
            r8 = r8 | r10
            r1.imeOptions = r8
        Ld2:
            int r8 = r1.inputType
            r10 = r8 & 1
            if (r10 != r9) goto Lfa
            int r10 = r2.f8954b
            if (r10 != r9) goto Le1
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r1.inputType = r8
            goto Lee
        Le1:
            if (r10 != r12) goto Le8
            r8 = r8 | 8192(0x2000, float:1.148E-41)
            r1.inputType = r8
            goto Lee
        Le8:
            if (r10 != r15) goto Lee
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            r1.inputType = r8
        Lee:
            boolean r2 = r2.f8955c
            if (r2 == 0) goto Lfa
            int r2 = r1.inputType
            r8 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r8
            r1.inputType = r2
        Lfa:
            int r2 = i2.m0.f6359c
            r2 = 32
            long r10 = r4 >> r2
            int r2 = (int) r10
            r1.initialSelStart = r2
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r10
            int r2 = (int) r4
            r1.initialSelEnd = r2
            r9.e0.k0(r1, r3)
            int r2 = r1.imeOptions
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 | r3
            r1.imeOptions = r2
            boolean r2 = e0.e.f2289a
            if (r2 == 0) goto L11d
            r10 = 7
            if (r7 != r10) goto L11f
        L11d:
            r14 = 0
            goto L168
        L11f:
            if (r7 != r13) goto L122
            goto L11d
        L122:
            r9.e0.l0(r1, r9)
            java.lang.Class r16 = b0.a0.l()
            java.lang.Class r17 = b0.a0.w()
            java.lang.Class r18 = b0.a0.s()
            java.lang.Class r19 = b0.a0.u()
            java.lang.Class r20 = b0.a0.y()
            java.lang.Class r21 = b0.a0.A()
            java.lang.Class r22 = b0.a0.C()
            java.lang.Class[] r2 = new java.lang.Class[]{r16, r17, r18, r19, r20, r21, r22}
            java.util.List r2 = a.a.y0(r2)
            b0.a0.o(r1, r2)
            java.lang.Class r2 = b0.a0.l()
            java.lang.Class r3 = b0.a0.w()
            java.lang.Class r4 = b0.a0.s()
            java.lang.Class r5 = b0.a0.u()
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r4, r5}
            java.util.Set r2 = tf.d0.W(r2)
            b0.a0.p(r1, r2)
            goto L16b
        L168:
            r9.e0.l0(r1, r14)
        L16b:
            f0.s r2 = f0.t.f2998a
            boolean r2 = l3.i.d()
            if (r2 != 0) goto L174
            goto L17b
        L174:
            l3.i r2 = l3.i.a()
            r2.g(r1)
        L17b:
            n2.s r8 = r0.f3006h
            n2.j r1 = r0.f3007i
            boolean r10 = r1.f8955c
            androidx.lifecycle.x r9 = new androidx.lifecycle.x
            r9.<init>(r0, r6)
            w.q0 r11 = r0.f3003e
            h0.d1 r12 = r0.f3004f
            y1.l2 r13 = r0.f3005g
            f0.v r7 = new f0.v
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r7)
            java.util.ArrayList r2 = r0.f3008j
            r2.add(r1)
            return r7
        L19c:
            java.lang.String r1 = "Invalid Keyboard Type"
            j8.o.A(r1)
            r16 = 0
            return r16
        L1a4:
            r16 = 0
            java.lang.String r1 = "invalid ImeAction"
            j8.o.A(r1)
            return r16
    }
}
