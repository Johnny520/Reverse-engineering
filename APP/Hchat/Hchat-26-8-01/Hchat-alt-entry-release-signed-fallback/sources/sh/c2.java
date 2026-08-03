package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements v1.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f12540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sh.w1 f12541b;

    public c2(float r1, sh.w1 r2) {
            r0 = this;
            r0.<init>()
            r0.f12540a = r1
            r0.f12541b = r2
            return
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r22, java.util.List r23, long r24) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = r2.size()
            r4 = 0
            r5 = r4
        Lc:
            java.lang.String r6 = "Collection contains no element matching the predicate."
            if (r5 >= r3) goto L181
            java.lang.Object r7 = r2.get(r5)
            v1.m0 r7 = (v1.m0) r7
            java.lang.Object r8 = v1.w.i(r7)
            java.lang.String r9 = "navigationIcon"
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L17d
            r14 = 0
            r15 = 10
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = r24
            long r11 = u2.a.a(r9, r11, r12, r13, r14, r15)
            v1.b1 r3 = r7.Q(r11)
            int r5 = r2.size()
            r7 = r4
        L37:
            if (r7 >= r5) goto L175
            java.lang.Object r8 = r2.get(r7)
            v1.m0 r8 = (v1.m0) r8
            java.lang.Object r9 = v1.w.i(r8)
            java.lang.String r10 = "actionIcons"
            boolean r9 = gg.l.a(r9, r10)
            if (r9 == 0) goto L170
            r18 = 0
            r19 = 10
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r24
            long r9 = u2.a.a(r13, r15, r16, r17, r18, r19)
            v1.b1 r5 = r8.Q(r9)
            int r7 = u2.a.h(r24)
            int r8 = r3.f13900g
            int r7 = r7 - r8
            int r8 = r5.f13900g
            int r7 = r7 - r8
            int r8 = r2.size()
            r9 = r4
        L6d:
            if (r9 >= r8) goto L168
            java.lang.Object r10 = r2.get(r9)
            v1.m0 r10 = (v1.m0) r10
            java.lang.Object r11 = v1.w.i(r10)
            java.lang.String r12 = "title"
            boolean r11 = gg.l.a(r11, r12)
            if (r11 == 0) goto L161
            double r7 = (double) r7
            r11 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r7 = r7 * r11
            boolean r9 = java.lang.Double.isNaN(r7)
            if (r9 != 0) goto L15a
            r11 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 <= 0) goto L9d
            r7 = 2147483647(0x7fffffff, float:NaN)
        L9a:
            r16 = r7
            goto Lac
        L9d:
            r11 = -4476578029606273024(0xc1e0000000000000, double:-2.147483648E9)
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 >= 0) goto La6
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L9a
        La6:
            long r7 = java.lang.Math.round(r7)
            int r7 = (int) r7
            goto L9a
        Lac:
            r18 = 0
            r19 = 8
            r15 = 0
            r17 = 0
            r13 = r24
            long r7 = u2.a.a(r13, r15, r16, r17, r18, r19)
            v1.b1 r7 = r10.Q(r7)
            int r8 = r2.size()
        Lc1:
            if (r4 >= r8) goto L152
            java.lang.Object r9 = r2.get(r4)
            v1.m0 r9 = (v1.m0) r9
            java.lang.Object r10 = v1.w.i(r9)
            java.lang.String r11 = "largeTitle"
            boolean r10 = gg.l.a(r10, r11)
            if (r10 == 0) goto L149
            r18 = 2147483647(0x7fffffff, float:NaN)
            r19 = 2
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r24
            long r10 = u2.a.a(r13, r15, r16, r17, r18, r19)
            v1.b1 r2 = r9.Q(r10)
            float r4 = sh.s1.f12832b
            int r14 = r1.G0(r4)
            int r4 = r2.f13901h
            int r4 = java.lang.Math.max(r14, r4)
            float r6 = r0.f12540a
            r8 = 0
            int r9 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r9 <= 0) goto L121
            sh.w1 r9 = r0.f12541b
            sh.x r9 = r9.f12892a
            if (r9 == 0) goto L10f
            sh.e2 r9 = r9.f12893a
            if (r9 == 0) goto L10f
            i0.f1 r9 = r9.f12574c
            float r9 = r9.g()
            goto L110
        L10f:
            r9 = r8
        L110:
            boolean r11 = java.lang.Float.isNaN(r9)
            if (r11 == 0) goto L117
            goto L121
        L117:
            float r9 = java.lang.Math.abs(r9)
            float r9 = r9 / r6
            float r6 = r9.e0.q(r9, r8, r10)
            float r10 = r10 - r6
        L121:
            int r4 = r4 - r14
            double r8 = (double) r4
            double r10 = (double) r10
            double r8 = r8 * r10
            long r8 = java.lang.Math.round(r8)
            int r4 = (int) r8
            int r4 = r4 + r14
            float r4 = (float) r4
            int r4 = ig.a.X(r4)
            int r6 = u2.a.h(r24)
            sh.b2 r13 = new sh.b2
            r16 = r24
            r20 = r2
            r15 = r3
            r19 = r5
            r18 = r7
            r13.<init>(r14, r15, r16, r18, r19, r20)
            tf.u r2 = tf.u.f13168g
            v1.o0 r1 = r1.z(r6, r4, r2, r13)
            return r1
        L149:
            r15 = r3
            r19 = r5
            r18 = r7
            int r4 = r4 + 1
            goto Lc1
        L152:
            w2.a.b(r6)
            okio.a.c()
            r1 = 0
            return r1
        L15a:
            java.lang.String r1 = "Cannot round NaN value."
            j8.o.t(r1)
            r1 = 0
            return r1
        L161:
            r15 = r3
            r19 = r5
            int r9 = r9 + 1
            goto L6d
        L168:
            w2.a.b(r6)
            okio.a.c()
            r1 = 0
            return r1
        L170:
            r15 = r3
            int r7 = r7 + 1
            goto L37
        L175:
            w2.a.b(r6)
            okio.a.c()
            r1 = 0
            return r1
        L17d:
            int r5 = r5 + 1
            goto Lc
        L181:
            w2.a.b(r6)
            okio.a.c()
            r1 = 0
            return r1
    }
}
