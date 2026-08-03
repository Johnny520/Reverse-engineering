package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements java.lang.Iterable, hg.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final w0.j f14775k = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f14778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long[] f14779j;

    static {
            w0.j r0 = new w0.j
            r5 = 0
            r7 = 0
            r1 = 0
            r3 = 0
            r0.<init>(r1, r3, r5, r7)
            w0.j.f14775k = r0
            return
    }

    public j(long r1, long r3, long r5, long[] r7) {
            r0 = this;
            r0.<init>()
            r0.f14776g = r1
            r0.f14777h = r3
            r0.f14778i = r5
            r0.f14779j = r7
            return
    }

    public final w0.j a(w0.j r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            w0.j r2 = w0.j.f14775k
            if (r1 != r2) goto L9
            return r0
        L9:
            if (r0 != r2) goto Lc
            return r2
        Lc:
            long r2 = r1.f14778i
            long r4 = r1.f14778i
            long[] r6 = r1.f14779j
            long r7 = r1.f14777h
            long r9 = r1.f14776g
            long r11 = r0.f14778i
            int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r1 != 0) goto L34
            long[] r1 = r0.f14779j
            if (r6 != r1) goto L34
            r16 = r11
            w0.j r11 = new w0.j
            long r2 = r0.f14776g
            long r4 = ~r9
            long r12 = r2 & r4
            long r2 = r0.f14777h
            long r4 = ~r7
            long r14 = r2 & r4
            r18 = r1
            r11.<init>(r12, r14, r16, r18)
            return r11
        L34:
            if (r6 == 0) goto L44
            int r2 = r6.length
            r11 = r0
            r3 = 0
        L39:
            if (r3 >= r2) goto L45
            r12 = r6[r3]
            w0.j r11 = r11.c(r12)
            int r3 = r3 + 1
            goto L39
        L44:
            r11 = r0
        L45:
            r2 = 0
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r12 = 1
            r14 = 64
            if (r6 == 0) goto L67
            r6 = 0
        L50:
            if (r6 >= r14) goto L67
            long r15 = r12 << r6
            long r15 = r15 & r7
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 == 0) goto L62
            r15 = r2
            long r1 = (long) r6
            long r1 = r1 + r4
            w0.j r1 = r11.c(r1)
            r11 = r1
            goto L63
        L62:
            r15 = r2
        L63:
            int r6 = r6 + 1
            r2 = r15
            goto L50
        L67:
            r15 = r2
            int r1 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r1 == 0) goto L82
            r1 = 0
        L6d:
            if (r1 >= r14) goto L82
            long r2 = r12 << r1
            long r2 = r2 & r9
            int r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r2 == 0) goto L7f
            long r2 = (long) r1
            long r2 = r2 + r4
            long r6 = (long) r14
            long r2 = r2 + r6
            w0.j r2 = r11.c(r2)
            r11 = r2
        L7f:
            int r1 = r1 + 1
            goto L6d
        L82:
            return r11
    }

    public final w0.j c(long r14) {
            r13 = this;
            long r0 = r13.f14778i
            long r0 = r14 - r0
            r2 = 0
            long r3 = (long) r2
            int r5 = gg.l.d(r0, r3)
            r6 = 0
            r8 = 1
            r10 = 64
            if (r5 < 0) goto L33
            long r11 = (long) r10
            int r5 = gg.l.d(r0, r11)
            if (r5 >= 0) goto L33
            int r14 = (int) r0
            long r14 = r8 << r14
            long r0 = r13.f14777h
            long r2 = r0 & r14
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L91
            w0.j r3 = new w0.j
            long r14 = ~r14
            long r6 = r0 & r14
            long r8 = r13.f14778i
            long[] r10 = r13.f14779j
            long r4 = r13.f14776g
            r3.<init>(r4, r6, r8, r10)
            return r3
        L33:
            long r11 = (long) r10
            int r5 = gg.l.d(r0, r11)
            if (r5 < 0) goto L5e
            r5 = 128(0x80, float:1.8E-43)
            long r11 = (long) r5
            int r5 = gg.l.d(r0, r11)
            if (r5 >= 0) goto L5e
            int r14 = (int) r0
            int r14 = r14 - r10
            long r14 = r8 << r14
            long r0 = r13.f14776g
            long r2 = r0 & r14
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L91
            w0.j r3 = new w0.j
            long r14 = ~r14
            long r4 = r0 & r14
            long r8 = r13.f14778i
            long[] r10 = r13.f14779j
            long r6 = r13.f14777h
            r3.<init>(r4, r6, r8, r10)
            return r3
        L5e:
            int r0 = gg.l.d(r0, r3)
            if (r0 >= 0) goto L91
            long[] r0 = r13.f14779j
            if (r0 == 0) goto L91
            int r14 = w0.q.c(r14, r0)
            if (r14 < 0) goto L91
            w0.j r3 = new w0.j
            int r15 = r0.length
            int r1 = r15 + (-1)
            if (r1 != 0) goto L78
            r14 = 0
            r10 = r14
            goto L87
        L78:
            long[] r4 = new long[r1]
            if (r14 <= 0) goto L7f
            tf.l.q0(r0, r4, r2, r2, r14)
        L7f:
            if (r14 >= r1) goto L86
            int r1 = r14 + 1
            tf.l.q0(r0, r4, r14, r1, r15)
        L86:
            r10 = r4
        L87:
            long r4 = r13.f14776g
            long r6 = r13.f14777h
            long r8 = r13.f14778i
            r3.<init>(r4, r6, r8, r10)
            return r3
        L91:
            return r13
    }

    public final boolean d(long r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            long r3 = r0.f14778i
            long r3 = r1 - r3
            r5 = 0
            long r6 = (long) r5
            int r8 = gg.l.d(r3, r6)
            r11 = 1
            r13 = 1
            r14 = 64
            r15 = 0
            if (r8 < 0) goto L2a
            long r9 = (long) r14
            int r8 = gg.l.d(r3, r9)
            if (r8 >= 0) goto L2a
            int r1 = (int) r3
            long r1 = r11 << r1
            long r3 = r0.f14777h
            long r1 = r1 & r3
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 == 0) goto L29
            return r13
        L29:
            return r5
        L2a:
            long r8 = (long) r14
            int r8 = gg.l.d(r3, r8)
            if (r8 < 0) goto L47
            r8 = 128(0x80, float:1.8E-43)
            long r8 = (long) r8
            int r8 = gg.l.d(r3, r8)
            if (r8 >= 0) goto L47
            int r1 = (int) r3
            int r1 = r1 - r14
            long r1 = r11 << r1
            long r3 = r0.f14776g
            long r1 = r1 & r3
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 == 0) goto L46
            return r13
        L46:
            return r5
        L47:
            int r3 = gg.l.d(r3, r6)
            if (r3 <= 0) goto L4e
            return r5
        L4e:
            long[] r3 = r0.f14779j
            if (r3 == 0) goto L59
            int r1 = w0.q.c(r1, r3)
            if (r1 < 0) goto L59
            return r13
        L59:
            return r5
    }

    public final w0.j e(w0.j r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            w0.j r2 = w0.j.f14775k
            if (r1 != r2) goto L9
            return r0
        L9:
            if (r0 != r2) goto Lc
            return r1
        Lc:
            long r2 = r1.f14778i
            long r4 = r1.f14778i
            long[] r6 = r1.f14779j
            long r7 = r1.f14777h
            long r9 = r1.f14776g
            long r11 = r0.f14778i
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            long r13 = r0.f14777h
            r3 = r2
            long r1 = r0.f14776g
            if (r3 != 0) goto L33
            long[] r3 = r0.f14779j
            if (r6 != r3) goto L33
            r16 = r11
            w0.j r11 = new w0.j
            r14 = r13
            long r12 = r1 | r9
            long r14 = r14 | r7
            r18 = r3
            r11.<init>(r12, r14, r16, r18)
            return r11
        L33:
            r14 = r13
            r3 = 64
            r13 = 0
            r16 = 0
            r18 = 1
            long[] r11 = r0.f14779j
            if (r11 != 0) goto L85
            if (r11 == 0) goto L50
            int r4 = r11.length
            r5 = r21
            r6 = r13
        L45:
            if (r6 >= r4) goto L52
            r7 = r11[r6]
            w0.j r5 = r5.f(r7)
            int r6 = r6 + 1
            goto L45
        L50:
            r5 = r21
        L52:
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            long r6 = r0.f14778i
            if (r4 == 0) goto L6b
            r4 = r13
        L59:
            if (r4 >= r3) goto L6b
            long r8 = r18 << r4
            long r8 = r8 & r14
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 == 0) goto L68
            long r8 = (long) r4
            long r8 = r8 + r6
            w0.j r5 = r5.f(r8)
        L68:
            int r4 = r4 + 1
            goto L59
        L6b:
            int r4 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r4 == 0) goto L84
        L6f:
            if (r13 >= r3) goto L84
            long r8 = r18 << r13
            long r8 = r8 & r1
            int r4 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r4 == 0) goto L81
            long r8 = (long) r13
            long r8 = r8 + r6
            long r10 = (long) r3
            long r8 = r8 + r10
            w0.j r4 = r5.f(r8)
            r5 = r4
        L81:
            int r13 = r13 + 1
            goto L6f
        L84:
            return r5
        L85:
            if (r6 == 0) goto L95
            int r1 = r6.length
            r11 = r0
            r2 = r13
        L8a:
            if (r2 >= r1) goto L96
            r14 = r6[r2]
            w0.j r11 = r11.f(r14)
            int r2 = r2 + 1
            goto L8a
        L95:
            r11 = r0
        L96:
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lae
            r1 = r13
        L9b:
            if (r1 >= r3) goto Lae
            long r14 = r18 << r1
            long r14 = r14 & r7
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 == 0) goto Lab
            long r14 = (long) r1
            long r14 = r14 + r4
            w0.j r2 = r11.f(r14)
            r11 = r2
        Lab:
            int r1 = r1 + 1
            goto L9b
        Lae:
            int r1 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc7
        Lb2:
            if (r13 >= r3) goto Lc7
            long r1 = r18 << r13
            long r1 = r1 & r9
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc4
            long r1 = (long) r13
            long r1 = r1 + r4
            long r6 = (long) r3
            long r1 = r1 + r6
            w0.j r1 = r11.f(r1)
            r11 = r1
        Lc4:
            int r13 = r13 + 1
            goto Lb2
        Lc7:
            return r11
    }

    public final w0.j f(long r30) {
            r29 = this;
            r0 = r29
            r1 = r30
            long r3 = r0.f14778i
            long r5 = r1 - r3
            r7 = 0
            long r8 = (long) r7
            int r10 = gg.l.d(r5, r8)
            long r11 = r0.f14777h
            r15 = 64
            r16 = 0
            r18 = 1
            if (r10 < 0) goto L3a
            long r13 = (long) r15
            int r10 = gg.l.d(r5, r13)
            if (r10 >= 0) goto L3a
            int r1 = (int) r5
            long r1 = r18 << r1
            long r3 = r11 & r1
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 != 0) goto L154
            w0.j r13 = new w0.j
            long r16 = r11 | r1
            long r1 = r0.f14778i
            long[] r3 = r0.f14779j
            long r14 = r0.f14776g
            r18 = r1
            r20 = r3
            r13.<init>(r14, r16, r18, r20)
            return r13
        L3a:
            long r13 = (long) r15
            int r10 = gg.l.d(r5, r13)
            r20 = r7
            r21 = r8
            long r7 = r0.f14776g
            r9 = 128(0x80, float:1.8E-43)
            r23 = r3
            if (r10 < 0) goto L6c
            long r3 = (long) r9
            int r3 = gg.l.d(r5, r3)
            if (r3 >= 0) goto L6c
            int r1 = (int) r5
            int r1 = r1 - r15
            long r1 = r18 << r1
            long r3 = r7 & r1
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 != 0) goto L154
            w0.j r9 = new w0.j
            long r10 = r7 | r1
            long r14 = r0.f14778i
            long[] r1 = r0.f14779j
            long r12 = r0.f14777h
            r16 = r1
            r9.<init>(r10, r12, r14, r16)
            return r9
        L6c:
            long r3 = (long) r9
            int r5 = gg.l.d(r5, r3)
            long[] r6 = r0.f14779j
            r9 = 1
            if (r5 < 0) goto L11b
            boolean r5 = r29.d(r30)
            if (r5 != 0) goto L154
            long r9 = (long) r9
            long r25 = r1 + r9
            long r25 = r25 / r13
            r27 = r3
            long r3 = r25 * r13
            r25 = r7
            r7 = r21
            int r5 = gg.l.d(r3, r7)
            if (r5 >= 0) goto L97
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r3 = r3 - r27
            long r3 = r3 + r9
        L97:
            r7 = r23
            r22 = r25
            r9 = 0
        L9c:
            int r10 = gg.l.d(r7, r3)
            if (r10 >= 0) goto Le3
            int r10 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r10 == 0) goto Lce
            if (r9 != 0) goto Lad
            m.a r9 = new m.a
            r9.<init>(r6)
        Lad:
            r10 = r20
        Laf:
            if (r10 >= r15) goto Lce
            long r24 = r18 << r10
            long r24 = r11 & r24
            int r21 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r21 == 0) goto Lc5
            r21 = r6
            long r5 = (long) r10
            long r5 = r5 + r7
            java.lang.Object r15 = r9.f8069h
            f.y r15 = (f.y) r15
            r15.a(r5)
            goto Lc7
        Lc5:
            r21 = r6
        Lc7:
            int r10 = r10 + 1
            r6 = r21
            r15 = 64
            goto Laf
        Lce:
            r21 = r6
            int r5 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r5 != 0) goto Ld9
            r26 = r3
            r3 = r21
            goto Le8
        Ld9:
            long r7 = r7 + r13
            r6 = r21
            r11 = r22
            r15 = 64
            r22 = r16
            goto L9c
        Le3:
            r3 = r6
            r26 = r7
            r16 = r11
        Le8:
            w0.j r21 = new w0.j
            if (r9 == 0) goto L10e
            java.lang.Object r4 = r9.f8069h
            f.y r4 = (f.y) r4
            int r5 = r4.f2924b
            if (r5 != 0) goto Lf6
            r5 = 0
            goto L106
        Lf6:
            long[] r6 = new long[r5]
            long[] r4 = r4.f2923a
            r7 = r20
        Lfc:
            if (r7 >= r5) goto L105
            r8 = r4[r7]
            r6[r7] = r8
            int r7 = r7 + 1
            goto Lfc
        L105:
            r5 = r6
        L106:
            if (r5 != 0) goto L109
            goto L10e
        L109:
            r28 = r5
        L10b:
            r24 = r16
            goto L111
        L10e:
            r28 = r3
            goto L10b
        L111:
            r21.<init>(r22, r24, r26, r28)
            r3 = r21
            w0.j r1 = r3.f(r1)
            return r1
        L11b:
            r3 = r6
            if (r3 != 0) goto L12f
            w0.j r3 = new w0.j
            long[] r9 = new long[r9]
            r9[r20] = r1
            r2 = r3
            long r3 = r0.f14776g
            long r5 = r0.f14777h
            long r7 = r0.f14778i
            r2.<init>(r3, r5, r7, r9)
            return r2
        L12f:
            int r4 = w0.q.c(r1, r3)
            if (r4 >= 0) goto L154
            int r4 = r4 + r9
            int r4 = -r4
            int r5 = r3.length
            int r6 = r5 + 1
            long[] r14 = new long[r6]
            r6 = r20
            tf.l.q0(r3, r14, r6, r6, r4)
            int r6 = r4 + 1
            tf.l.q0(r3, r14, r6, r4, r5)
            r14[r4] = r1
            w0.j r7 = new w0.j
            long r10 = r0.f14777h
            long r12 = r0.f14778i
            long r8 = r0.f14776g
            r7.<init>(r8, r10, r12, r14)
            return r7
        L154:
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            w0.i r0 = new w0.i
            r1 = 0
            r0.<init>(r2, r1)
            ng.k r0 = fb.v0.B(r0)
            return r0
    }

    public final java.lang.String toString() {
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = " ["
            r0.append(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r10)
            r1.<init>(r2)
            java.util.Iterator r2 = r10.iterator()
        L1e:
            r3 = r2
            ng.k r3 = (ng.k) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r3 = r3.next()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.add(r3)
            goto L1e
        L39:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            int r4 = r1.size()
            r5 = 0
            r6 = r5
        L49:
            if (r5 >= r4) goto L7d
            java.lang.Object r7 = r1.get(r5)
            r8 = 1
            int r6 = r6 + r8
            if (r6 <= r8) goto L58
            java.lang.String r9 = ", "
            r2.append(r9)
        L58:
            if (r7 != 0) goto L5b
            goto L5d
        L5b:
            boolean r8 = r7 instanceof java.lang.CharSequence
        L5d:
            if (r8 == 0) goto L65
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r2.append(r7)
            goto L7a
        L65:
            boolean r8 = r7 instanceof java.lang.Character
            if (r8 == 0) goto L73
            java.lang.Character r7 = (java.lang.Character) r7
            char r7 = r7.charValue()
            r2.append(r7)
            goto L7a
        L73:
            java.lang.String r7 = r7.toString()
            r2.append(r7)
        L7a:
            int r5 = r5 + 1
            goto L49
        L7d:
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
