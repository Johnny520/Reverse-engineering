package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements v1.n0 {
    @Override // v1.n0
    public final v1.o0 h(v1.p0 r12, java.util.List r13, long r14) {
            r11 = this;
            r0 = 8
            int r1 = r13.size()
            int r0 = java.lang.Math.min(r0, r1)
            java.util.List r0 = tf.m.L1(r0, r13)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L14:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r0.next()
            v1.m0 r3 = (v1.m0) r3
            int r4 = u2.a.g(r14)
            int r3 = r3.M(r4)
            if (r3 <= r2) goto L14
            r2 = r3
            goto L14
        L2c:
            r0 = 200(0xc8, float:2.8E-43)
            float r0 = (float) r0
            int r0 = r12.G0(r0)
            r3 = 288(0x120, float:4.04E-43)
            float r3 = (float) r3
            int r3 = r12.G0(r3)
            int r6 = r9.e0.r(r2, r0, r3)
            r9 = 0
            r10 = 8
            r8 = 0
            r7 = r6
            r4 = r14
            long r14 = u2.a.a(r4, r6, r7, r8, r9, r10)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r13.size()
            r0.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
        L55:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r13.next()
            v1.m0 r2 = (v1.m0) r2
            v1.b1 r2 = r2.Q(r14)
            r0.add(r2)
            goto L55
        L69:
            java.util.Iterator r13 = r0.iterator()
        L6d:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L7d
            java.lang.Object r14 = r13.next()
            v1.b1 r14 = (v1.b1) r14
            int r14 = r14.f13901h
            int r1 = r1 + r14
            goto L6d
        L7d:
            h0.o0 r13 = new h0.o0
            r14 = 1
            r13.<init>(r14, r0)
            tf.u r14 = tf.u.f13168g
            v1.o0 r12 = r12.z(r6, r1, r14, r13)
            return r12
    }

    @Override // v1.n0
    public final int i(v1.o r6, java.util.List r7, int r8) {
            r5 = this;
            r6.getClass()
            int r8 = r7.size()
            r0 = 8
            int r8 = java.lang.Math.min(r0, r8)
            java.util.List r8 = tf.m.L1(r8, r7)
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
            r2 = r1
        L17:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r8.next()
            v1.m0 r3 = (v1.m0) r3
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3.M(r4)
            if (r3 <= r2) goto L17
            r2 = r3
            goto L17
        L2e:
            r8 = 200(0xc8, float:2.8E-43)
            float r8 = (float) r8
            int r8 = r6.G0(r8)
            r3 = 288(0x120, float:4.04E-43)
            float r3 = (float) r3
            int r6 = r6.G0(r3)
            int r6 = r9.e0.r(r2, r8, r6)
            int r8 = r7.size()
            int r8 = java.lang.Math.min(r0, r8)
            java.util.List r7 = tf.m.L1(r8, r7)
            java.util.Iterator r7 = r7.iterator()
        L50:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L62
            java.lang.Object r8 = r7.next()
            v1.m0 r8 = (v1.m0) r8
            int r8 = r8.p0(r6)
            int r1 = r1 + r8
            goto L50
        L62:
            return r1
    }
}
