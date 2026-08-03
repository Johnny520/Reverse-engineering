package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements v1.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.g f9975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9976b;

    public q(y0.g r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f9975a = r1
            r0.f9976b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof p.q
            if (r0 != 0) goto L8
            goto L1b
        L8:
            p.q r3 = (p.q) r3
            y0.g r0 = r2.f9975a
            y0.g r1 = r3.f9975a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            boolean r0 = r2.f9976b
            boolean r3 = r3.f9976b
            if (r0 == r3) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r17, java.util.List r18, long r19) {
            r16 = this;
            r3 = r17
            r2 = r18
            boolean r0 = r2.isEmpty()
            tf.u r8 = tf.u.f13168g
            if (r0 == 0) goto L20
            int r0 = u2.a.j(r19)
            int r1 = u2.a.i(r19)
            i2.z r2 = new i2.z
            r4 = 14
            r2.<init>(r4)
            v1.o0 r0 = r3.z(r0, r1, r8, r2)
            return r0
        L20:
            r6 = r16
            boolean r0 = r6.f9976b
            if (r0 == 0) goto L29
            r0 = r19
            goto L30
        L29:
            r0 = -8589934589(0xfffffffe00000003, double:NaN)
            long r0 = r19 & r0
        L30:
            int r4 = r2.size()
            r5 = 0
            r7 = 1
            r9 = 0
            if (r4 != r7) goto La2
            java.lang.Object r2 = r2.get(r9)
            v1.m0 r2 = (v1.m0) r2
            java.lang.Object r4 = r2.X()
            boolean r10 = r4 instanceof p.l
            if (r10 == 0) goto L4a
            r5 = r4
            p.l r5 = (p.l) r5
        L4a:
            if (r5 == 0) goto L4f
            boolean r4 = r5.f9942v
            goto L50
        L4f:
            r4 = r9
        L50:
            if (r4 != 0) goto L6e
            v1.b1 r0 = r2.Q(r0)
            int r1 = u2.a.j(r19)
            int r4 = r0.f13900g
            int r1 = java.lang.Math.max(r1, r4)
            int r4 = u2.a.i(r19)
            int r5 = r0.f13901h
            int r4 = java.lang.Math.max(r4, r5)
        L6a:
            r5 = r4
            r4 = r1
            r1 = r0
            goto L98
        L6e:
            int r1 = u2.a.j(r19)
            int r4 = u2.a.i(r19)
            int r0 = u2.a.j(r19)
            int r5 = u2.a.i(r19)
            if (r0 < 0) goto L82
            r10 = r7
            goto L83
        L82:
            r10 = r9
        L83:
            if (r5 < 0) goto L86
            goto L87
        L86:
            r7 = r9
        L87:
            r7 = r7 & r10
            if (r7 != 0) goto L8f
            java.lang.String r7 = "width and height must be >= 0"
            u2.i.a(r7)
        L8f:
            long r9 = u2.b.h(r0, r0, r5, r5)
            v1.b1 r0 = r2.Q(r9)
            goto L6a
        L98:
            p.p r0 = new p.p
            r0.<init>(r1, r2, r3, r4, r5, r6)
            v1.o0 r0 = r3.z(r4, r5, r8, r0)
            return r0
        La2:
            int r4 = r2.size()
            v1.b1[] r4 = new v1.b1[r4]
            r6 = r4
            gg.s r4 = new gg.s
            r4.<init>()
            int r10 = u2.a.j(r19)
            r4.f4562g = r10
            r10 = r5
            gg.s r5 = new gg.s
            r5.<init>()
            int r11 = u2.a.i(r19)
            r5.f4562g = r11
            int r11 = r2.size()
            r12 = r9
            r13 = r12
        Lc6:
            if (r12 >= r11) goto L102
            java.lang.Object r14 = r2.get(r12)
            v1.m0 r14 = (v1.m0) r14
            java.lang.Object r15 = r14.X()
            boolean r7 = r15 instanceof p.l
            if (r7 == 0) goto Ld9
            p.l r15 = (p.l) r15
            goto Lda
        Ld9:
            r15 = r10
        Lda:
            if (r15 == 0) goto Ldf
            boolean r7 = r15.f9942v
            goto Le0
        Ldf:
            r7 = r9
        Le0:
            if (r7 != 0) goto Lfd
            v1.b1 r7 = r14.Q(r0)
            r6[r12] = r7
            int r14 = r4.f4562g
            int r15 = r7.f13900g
            int r14 = java.lang.Math.max(r14, r15)
            r4.f4562g = r14
            int r14 = r5.f4562g
            int r7 = r7.f13901h
            int r7 = java.lang.Math.max(r14, r7)
            r5.f4562g = r7
            goto Lfe
        Lfd:
            r13 = 1
        Lfe:
            int r12 = r12 + 1
            r7 = 1
            goto Lc6
        L102:
            if (r13 == 0) goto L143
            int r0 = r4.f4562g
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L10d
            r7 = r0
            goto L10e
        L10d:
            r7 = r9
        L10e:
            int r11 = r5.f4562g
            if (r11 == r1) goto L114
            r1 = r11
            goto L115
        L114:
            r1 = r9
        L115:
            long r0 = u2.b.a(r7, r0, r1, r11)
            int r7 = r2.size()
            r11 = r9
        L11e:
            if (r11 >= r7) goto L143
            java.lang.Object r12 = r2.get(r11)
            v1.m0 r12 = (v1.m0) r12
            java.lang.Object r13 = r12.X()
            boolean r14 = r13 instanceof p.l
            if (r14 == 0) goto L131
            p.l r13 = (p.l) r13
            goto L132
        L131:
            r13 = r10
        L132:
            if (r13 == 0) goto L137
            boolean r13 = r13.f9942v
            goto L138
        L137:
            r13 = r9
        L138:
            if (r13 == 0) goto L140
            v1.b1 r12 = r12.Q(r0)
            r6[r11] = r12
        L140:
            int r11 = r11 + 1
            goto L11e
        L143:
            int r9 = r4.f4562g
            int r10 = r5.f4562g
            eb.p r0 = new eb.p
            r7 = 2
            r1 = r6
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            v1.o0 r0 = r3.z(r9, r10, r8, r0)
            return r0
    }

    public final int hashCode() {
            r2 = this;
            y0.g r0 = r2.f9975a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.f9976b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BoxMeasurePolicy(alignment="
            r0.<init>(r1)
            y0.g r1 = r2.f9975a
            r0.append(r1)
            java.lang.String r1 = ", propagateMinConstraints="
            r0.append(r1)
            boolean r1 = r2.f9976b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
