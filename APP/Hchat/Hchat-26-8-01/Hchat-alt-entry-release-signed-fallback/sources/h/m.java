package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements v1.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.t f4716a;

    public m(h.t r1) {
            r0 = this;
            r0.<init>()
            r0.f4716a = r1
            return
    }

    @Override // v1.n0
    public final int a(v1.o r6, java.util.List r7, int r8) {
            r5 = this;
            boolean r6 = r7.isEmpty()
            r0 = 0
            if (r6 == 0) goto L9
            r6 = 0
            goto L39
        L9:
            java.lang.Object r6 = r7.get(r0)
            v1.m0 r6 = (v1.m0) r6
            int r6 = r6.M(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r1 = r7.size()
            r2 = 1
            int r1 = r1 - r2
            if (r2 > r1) goto L39
        L1f:
            java.lang.Object r3 = r7.get(r2)
            v1.m0 r3 = (v1.m0) r3
            int r3 = r3.M(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r3.compareTo(r6)
            if (r4 <= 0) goto L34
            r6 = r3
        L34:
            if (r2 == r1) goto L39
            int r2 = r2 + 1
            goto L1f
        L39:
            if (r6 == 0) goto L40
            int r6 = r6.intValue()
            return r6
        L40:
            return r0
    }

    @Override // v1.n0
    public final int c(v1.o r6, java.util.List r7, int r8) {
            r5 = this;
            boolean r6 = r7.isEmpty()
            r0 = 0
            if (r6 == 0) goto L9
            r6 = 0
            goto L39
        L9:
            java.lang.Object r6 = r7.get(r0)
            v1.m0 r6 = (v1.m0) r6
            int r6 = r6.G(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r1 = r7.size()
            r2 = 1
            int r1 = r1 - r2
            if (r2 > r1) goto L39
        L1f:
            java.lang.Object r3 = r7.get(r2)
            v1.m0 r3 = (v1.m0) r3
            int r3 = r3.G(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r3.compareTo(r6)
            if (r4 <= 0) goto L34
            r6 = r3
        L34:
            if (r2 == r1) goto L39
            int r2 = r2 + 1
            goto L1f
        L39:
            if (r6 == 0) goto L40
            int r6 = r6.intValue()
            return r6
        L40:
            return r0
    }

    @Override // v1.n0
    public final int g(v1.o r6, java.util.List r7, int r8) {
            r5 = this;
            boolean r6 = r7.isEmpty()
            r0 = 0
            if (r6 == 0) goto L9
            r6 = 0
            goto L39
        L9:
            java.lang.Object r6 = r7.get(r0)
            v1.m0 r6 = (v1.m0) r6
            int r6 = r6.j(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r1 = r7.size()
            r2 = 1
            int r1 = r1 - r2
            if (r2 > r1) goto L39
        L1f:
            java.lang.Object r3 = r7.get(r2)
            v1.m0 r3 = (v1.m0) r3
            int r3 = r3.j(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r3.compareTo(r6)
            if (r4 <= 0) goto L34
            r6 = r3
        L34:
            if (r2 == r1) goto L39
            int r2 = r2 + 1
            goto L1f
        L39:
            if (r6 == 0) goto L40
            int r6 = r6.intValue()
            return r6
        L40:
            return r0
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r21, java.util.List r22, long r23) {
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r23
            int r4 = r1.size()
            v1.b1[] r5 = new v1.b1[r4]
            int r6 = r1.size()
            r7 = 0
            r10 = 0
        L13:
            r13 = 32
            r14 = 0
            r15 = 1
            if (r10 >= r6) goto L57
            java.lang.Object r16 = r1.get(r10)
            r17 = 0
            r9 = r16
            v1.m0 r9 = (v1.m0) r9
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            java.lang.Object r11 = r9.X()
            boolean r12 = r11 instanceof h.o
            if (r12 == 0) goto L33
            r14 = r11
            h.o r14 = (h.o) r14
        L33:
            if (r14 == 0) goto L54
            i0.j1 r11 = r14.f4725a
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != r15) goto L54
            v1.b1 r7 = r9.Q(r2)
            int r8 = r7.f13900g
            int r9 = r7.f13901h
            long r11 = (long) r8
            long r11 = r11 << r13
            long r8 = (long) r9
            long r8 = r8 & r18
            long r8 = r8 | r11
            r5[r10] = r7
            r7 = r8
        L54:
            int r10 = r10 + 1
            goto L13
        L57:
            r17 = 0
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r6 = r1.size()
            r9 = r17
        L64:
            if (r9 >= r6) goto L79
            java.lang.Object r10 = r1.get(r9)
            v1.m0 r10 = (v1.m0) r10
            r11 = r5[r9]
            if (r11 != 0) goto L76
            v1.b1 r10 = r10.Q(r2)
            r5[r9] = r10
        L76:
            int r9 = r9 + 1
            goto L64
        L79:
            boolean r1 = r21.u0()
            if (r1 == 0) goto L83
            long r1 = r7 >> r13
            int r1 = (int) r1
            goto Lb1
        L83:
            if (r4 != 0) goto L87
            r1 = r14
            goto Laa
        L87:
            r1 = r5[r17]
            int r2 = r4 + (-1)
            if (r2 != 0) goto L8e
            goto Laa
        L8e:
            if (r1 == 0) goto L93
            int r3 = r1.f13900g
            goto L95
        L93:
            r3 = r17
        L95:
            if (r15 > r2) goto Laa
            r6 = r15
        L98:
            r9 = r5[r6]
            if (r9 == 0) goto L9f
            int r10 = r9.f13900g
            goto La1
        L9f:
            r10 = r17
        La1:
            if (r3 >= r10) goto La5
            r1 = r9
            r3 = r10
        La5:
            if (r6 == r2) goto Laa
            int r6 = r6 + 1
            goto L98
        Laa:
            if (r1 == 0) goto Laf
            int r1 = r1.f13900g
            goto Lb1
        Laf:
            r1 = r17
        Lb1:
            boolean r2 = r21.u0()
            if (r2 == 0) goto Lbb
            long r2 = r7 & r18
            int r9 = (int) r2
            goto Le6
        Lbb:
            if (r4 != 0) goto Lbe
            goto Ldf
        Lbe:
            r14 = r5[r17]
            int r4 = r4 - r15
            if (r4 != 0) goto Lc4
            goto Ldf
        Lc4:
            if (r14 == 0) goto Lc9
            int r2 = r14.f13901h
            goto Lcb
        Lc9:
            r2 = r17
        Lcb:
            if (r15 > r4) goto Ldf
        Lcd:
            r3 = r5[r15]
            if (r3 == 0) goto Ld4
            int r6 = r3.f13901h
            goto Ld6
        Ld4:
            r6 = r17
        Ld6:
            if (r2 >= r6) goto Lda
            r14 = r3
            r2 = r6
        Lda:
            if (r15 == r4) goto Ldf
            int r15 = r15 + 1
            goto Lcd
        Ldf:
            if (r14 == 0) goto Le4
            int r9 = r14.f13901h
            goto Le6
        Le4:
            r9 = r17
        Le6:
            boolean r2 = r21.u0()
            if (r2 != 0) goto Lfe
            long r2 = (long) r1
            long r2 = r2 << r13
            long r6 = (long) r9
            long r6 = r6 & r18
            long r2 = r2 | r6
            h.t r4 = r0.f4716a
            i0.j1 r4 = r4.f4755b
            u2.l r6 = new u2.l
            r6.<init>(r2)
            r4.setValue(r6)
        Lfe:
            h.l r2 = new h.l
            r2.<init>(r5, r0, r1, r9)
            tf.u r3 = tf.u.f13168g
            r4 = r21
            v1.o0 r1 = r4.z(r1, r9, r3, r2)
            return r1
    }

    @Override // v1.n0
    public final int i(v1.o r6, java.util.List r7, int r8) {
            r5 = this;
            boolean r6 = r7.isEmpty()
            r0 = 0
            if (r6 == 0) goto L9
            r6 = 0
            goto L39
        L9:
            java.lang.Object r6 = r7.get(r0)
            v1.m0 r6 = (v1.m0) r6
            int r6 = r6.p0(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r1 = r7.size()
            r2 = 1
            int r1 = r1 - r2
            if (r2 > r1) goto L39
        L1f:
            java.lang.Object r3 = r7.get(r2)
            v1.m0 r3 = (v1.m0) r3
            int r3 = r3.p0(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r3.compareTo(r6)
            if (r4 <= 0) goto L34
            r6 = r3
        L34:
            if (r2 == r1) goto L39
            int r2 = r2 + 1
            goto L1f
        L39:
            if (r6 == 0) goto L40
            int r6 = r6.intValue()
            return r6
        L40:
            return r0
    }
}
