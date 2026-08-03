package f5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f3299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f3300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Object f3301f;

    public /* synthetic */ g() {
            r1 = this;
            r0 = 2
            r1.f3296a = r0
            r1.<init>()
            return
    }

    public g(int r15) {
            r14 = this;
            r0 = 0
            r14.f3296a = r0
            r14.<init>()
            r0 = 256(0x100, float:3.59E-43)
            f5.f[] r0 = new f5.f[r0]
            r14.f3299d = r0
            r0 = 21
            r1 = -1
            if (r15 < r0) goto L3b
            r14.f3297b = r15
            r0 = 19
            if (r15 >= r0) goto L19
            r15 = r1
            goto L38
        L19:
            switch(r15) {
                case 19: goto L37;
                case 20: goto L37;
                case 21: goto L34;
                case 22: goto L31;
                case 23: goto L2e;
                case 24: goto L2b;
                case 25: goto L2b;
                case 26: goto L28;
                case 27: goto L25;
                case 28: goto L22;
                case 29: goto L1f;
                default: goto L1c;
            }
        L1c:
            r15 = 178(0xb2, float:2.5E-43)
            goto L38
        L1f:
            r15 = 170(0xaa, float:2.38E-43)
            goto L38
        L22:
            r15 = 138(0x8a, float:1.93E-43)
            goto L38
        L25:
            r15 = 131(0x83, float:1.84E-43)
            goto L38
        L28:
            r15 = 124(0x7c, float:1.74E-43)
            goto L38
        L2b:
            r15 = 79
            goto L38
        L2e:
            r15 = 64
            goto L38
        L31:
            r15 = 45
            goto L38
        L34:
            r15 = 39
            goto L38
        L37:
            r15 = 7
        L38:
            r14.f3298c = r15
            goto L3f
        L3b:
            r14.f3297b = r15
            r14.f3298c = r1
        L3f:
            java.util.EnumMap r15 = new java.util.EnumMap
            java.lang.Class<f5.f> r0 = f5.f.class
            r15.<init>(r0)
            r14.f3300e = r15
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            r14.f3301f = r15
            int r15 = r14.f3298c
            if (r15 == r1) goto L54
            goto L56
        L54:
            int r15 = r14.f3297b
        L56:
            f5.f[] r0 = f5.f.values()
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L5d:
            if (r4 >= r2) goto Lf1
            r5 = r0[r4]
            int r6 = r14.f3298c
            if (r6 == r1) goto L68
            d6.l r6 = r5.f3290h
            goto L6a
        L68:
            d6.l r6 = r5.f3289g
        L6a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            java.util.List r8 = r6.f2031a
            int r9 = r8.size()
            int r9 = r9 + (-1)
            r10 = r3
        L77:
            if (r10 > r9) goto La8
            int r11 = r10 + r9
            int r11 = r11 >>> 1
            java.lang.Object r12 = r8.get(r11)
            d6.i r12 = (d6.i) r12
            boolean r13 = r12.b(r7)
            if (r13 == 0) goto L8a
            goto La9
        L8a:
            boolean r13 = r12.c()
            if (r13 == 0) goto L97
            java.lang.Comparable r12 = r12.f2023a
            int r12 = r7.compareTo(r12)
            goto L9d
        L97:
            java.lang.Comparable r12 = r12.f2024b
            int r12 = r7.compareTo(r12)
        L9d:
            if (r12 <= 0) goto La2
            int r10 = r11 + 1
            goto L77
        La2:
            if (r12 >= 0) goto La9
            int r11 = r11 + (-1)
            r9 = r11
            goto L77
        La8:
            r11 = r1
        La9:
            r9 = 0
            if (r11 != r1) goto Lad
            goto Lbf
        Lad:
            java.lang.Object r8 = r8.get(r11)
            d6.i r8 = (d6.i) r8
            boolean r7 = r8.b(r7)
            if (r7 == 0) goto Lbf
            java.util.List r6 = r6.f2032b
            java.lang.Object r9 = r6.get(r11)
        Lbf:
            java.lang.Short r9 = (java.lang.Short) r9
            if (r9 == 0) goto Led
            int r6 = r5.f3295m
            r7 = 1
            r8 = 0
            switch(r6) {
                case 1: goto Lcc;
                case 2: goto Lcc;
                case 3: goto Lcc;
                case 4: goto Lcc;
                case 5: goto Lcc;
                case 6: goto Lcc;
                case 7: goto Lcc;
                case 8: goto Lcc;
                case 9: goto Lcc;
                case 10: goto Lcc;
                case 11: goto Lcc;
                case 12: goto Lcc;
                case 13: goto Lcc;
                case 14: goto Lcc;
                case 15: goto Lcc;
                case 16: goto Lcc;
                case 17: goto Lcc;
                case 18: goto Lcc;
                case 19: goto Lcc;
                case 20: goto Lcc;
                case 21: goto Lcc;
                case 22: goto Lcc;
                case 23: goto Lcc;
                case 24: goto Lcc;
                case 25: goto Lcc;
                case 26: goto Lcc;
                case 27: goto Lcc;
                case 28: goto Lcc;
                case 29: goto Lcc;
                case 30: goto Lcc;
                case 31: goto Lcc;
                case 32: goto Lcc;
                case 33: goto Lcc;
                case 34: goto Lcd;
                case 35: goto Lcd;
                case 36: goto Lcd;
                case 37: goto Lcc;
                default: goto Lca;
            }
        Lca:
            r15 = 0
            throw r15
        Lcc:
            r7 = r8
        Lcd:
            if (r7 != 0) goto Ld9
            java.lang.Object r6 = r14.f3299d
            f5.f[] r6 = (f5.f[]) r6
            short r7 = r9.shortValue()
            r6[r7] = r5
        Ld9:
            java.lang.Object r6 = r14.f3300e
            java.util.EnumMap r6 = (java.util.EnumMap) r6
            r6.put(r5, r9)
            java.lang.Object r6 = r14.f3301f
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.String r7 = r5.f3291i
            java.lang.String r7 = r7.toLowerCase()
            r6.put(r7, r5)
        Led:
            int r4 = r4 + 1
            goto L5d
        Lf1:
            return
    }

    public g(ud.r r2, qe.a0 r3, bc.g r4) {
            r1 = this;
            r0 = 1
            r1.f3296a = r0
            r1.<init>()
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r1.f3301f = r0
            r0 = 0
            r1.f3298c = r0
            r1.f3299d = r2
            r1.f3300e = r3
            int r2 = r2.f13721o
            int r3 = r4.I
            int r2 = r2 * r3
            r1.f3297b = r2
            return
    }

    public int a(long r8) {
            r7 = this;
            int r0 = r7.f3297b
            int r0 = r0 + 1
            java.lang.Object r1 = r7.f3299d
            long[] r1 = (long[]) r1
            int r2 = r1.length
            r3 = 14
            r4 = 0
            if (r0 > r2) goto Lf
            goto L24
        Lf:
            int r2 = r2 * 2
            long[] r0 = new long[r2]
            int[] r2 = new int[r2]
            int r5 = r1.length
            tf.l.q0(r1, r0, r4, r4, r5)
            java.lang.Object r1 = r7.f3300e
            int[] r1 = (int[]) r1
            tf.l.s0(r1, r2, r4, r4, r3)
            r7.f3299d = r0
            r7.f3300e = r2
        L24:
            int r0 = r7.f3297b
            int r1 = r0 + 1
            r7.f3297b = r1
            java.lang.Object r1 = r7.f3301f
            int[] r1 = (int[]) r1
            int r1 = r1.length
            int r2 = r7.f3298c
            if (r2 < r1) goto L49
            int r1 = r1 * 2
            int[] r2 = new int[r1]
            r5 = r4
        L38:
            if (r5 >= r1) goto L40
            int r6 = r5 + 1
            r2[r5] = r6
            r5 = r6
            goto L38
        L40:
            java.lang.Object r1 = r7.f3301f
            int[] r1 = (int[]) r1
            tf.l.s0(r1, r2, r4, r4, r3)
            r7.f3301f = r2
        L49:
            int r1 = r7.f3298c
            java.lang.Object r2 = r7.f3301f
            int[] r2 = (int[]) r2
            r3 = r2[r1]
            r7.f3298c = r3
            java.lang.Object r3 = r7.f3299d
            long[] r3 = (long[]) r3
            r3[r0] = r8
            java.lang.Object r4 = r7.f3300e
            int[] r4 = (int[]) r4
            r4[r0] = r1
            r2[r1] = r0
        L61:
            if (r0 <= 0) goto L76
            int r2 = r0 + 1
            int r2 = r2 >> 1
            int r2 = r2 + (-1)
            r4 = r3[r2]
            int r4 = gg.l.d(r4, r8)
            if (r4 <= 0) goto L76
            r7.d(r2, r0)
            r0 = r2
            goto L61
        L76:
            return r1
    }

    public qd.j b(qd.l r2) {
            r1 = this;
            java.lang.Object r0 = r1.f3301f
            java.util.IdentityHashMap r0 = (java.util.IdentityHashMap) r0
            java.lang.Object r0 = r0.get(r2)
            qe.y r0 = (qe.y) r0
            if (r0 == 0) goto Lf
            qd.j r2 = r0.f11006i
            return r2
        Lf:
            qd.j r2 = r2.I()
            return r2
    }

    public void c(qd.l r3) {
            r2 = this;
            java.lang.Object r0 = r2.f3301f
            java.util.IdentityHashMap r0 = (java.util.IdentityHashMap) r0
            java.lang.Object r3 = r0.remove(r3)
            qe.y r3 = (qe.y) r3
            if (r3 == 0) goto L1a
            int r3 = r3.f11004g
            java.util.Collection r0 = r0.values()
            qe.b0 r1 = new qe.b0
            r1.<init>(r3)
            r0.removeIf(r1)
        L1a:
            return
    }

    public void d(int r8, int r9) {
            r7 = this;
            java.lang.Object r0 = r7.f3299d
            long[] r0 = (long[]) r0
            java.lang.Object r1 = r7.f3300e
            int[] r1 = (int[]) r1
            java.lang.Object r2 = r7.f3301f
            int[] r2 = (int[]) r2
            r3 = r0[r8]
            r5 = r0[r9]
            r0[r8] = r5
            r0[r9] = r3
            r0 = r1[r8]
            r3 = r1[r9]
            r1[r8] = r3
            r1[r9] = r0
            r2[r3] = r8
            r2[r0] = r9
            return
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.f3296a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r5.f3300e
            qe.a0 r0 = (qe.a0) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r5.f3301f
            java.util.IdentityHashMap r1 = (java.util.IdentityHashMap) r1
            java.util.Collection r1 = r1.values()
            java.util.stream.Stream r1 = r1.stream()
            java.util.stream.Stream r1 = r1.sorted()
            java.util.stream.Collector r2 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r2)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " "
            java.lang.String r3 = "}"
            java.lang.String r4 = "TypeUpdateInfo{"
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
    }
}
