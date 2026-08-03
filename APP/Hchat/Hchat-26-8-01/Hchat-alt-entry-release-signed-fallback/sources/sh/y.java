package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final long a(u2.k r17, u2.k r18, u2.m r19, long r20, u2.k r22, sh.g0 r23) {
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r22
            r0.getClass()
            r1.getClass()
            int r3 = r1.f13350b
            int r4 = r1.f13352d
            r19.getClass()
            r2.getClass()
            int r5 = r2.f13350b
            int r6 = r2.f13352d
            int r7 = r2.f13351c
            r8 = r19
            r9 = r23
            sh.g0 r8 = sh.s.s(r9, r8)
            sh.g0 r9 = sh.g0.f12583h
            r10 = 32
            if (r8 != r9) goto L32
            int r2 = r0.f13351c
            long r8 = r20 >> r10
            int r8 = (int) r8
            int r2 = r2 - r8
            int r2 = r2 - r7
            goto L37
        L32:
            int r8 = r0.f13349a
            int r2 = r2.f13349a
            int r2 = r2 + r8
        L37:
            int r8 = r0.f13352d
            int r9 = r4 - r8
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r20 & r11
            int r13 = (int) r13
            if (r9 <= r13) goto L47
            int r8 = r8 + r6
            goto L5b
        L47:
            int r8 = r0.f13350b
            int r9 = r8 - r3
            if (r9 <= r13) goto L50
            int r8 = r8 - r13
            int r8 = r8 - r5
            goto L5b
        L50:
            int r0 = r0.a()
            int r0 = r0 / 2
            int r0 = r0 + r8
            int r8 = r13 / 2
            int r8 = r0 - r8
        L5b:
            int r0 = r1.f13349a
            int r1 = r1.f13351c
            long r14 = r20 >> r10
            int r9 = (int) r14
            int r1 = r1 - r9
            int r1 = r1 - r7
            if (r1 >= r0) goto L67
            r1 = r0
        L67:
            int r0 = r9.e0.r(r2, r0, r1)
            int r3 = r3 + r5
            int r4 = r4 - r13
            int r4 = r4 - r6
            if (r3 <= r4) goto L71
            r3 = r4
        L71:
            int r1 = r9.e0.r(r8, r3, r4)
            long r2 = (long) r0
            long r2 = r2 << r10
            long r0 = (long) r1
            long r0 = r0 & r11
            long r0 = r0 | r2
            return r0
    }

    public final p.z0 b() {
            r3 = this;
            r0 = 0
            float r0 = (float) r0
            r1 = 8
            float r1 = (float) r1
            p.z0 r2 = new p.z0
            r2.<init>(r0, r1, r0, r1)
            return r2
    }
}
