package s0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f12199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f12200c;

    public j(int r1, long[] r2, java.lang.Object[] r3) {
            r0 = this;
            r0.<init>()
            r0.f12198a = r1
            r0.f12199b = r2
            r0.f12200c = r3
            return
    }

    public final int a(long r9) {
            r8 = this;
            int r0 = r8.f12198a
            int r0 = r0 + (-1)
            r1 = -1
            if (r0 == r1) goto L33
            long[] r2 = r8.f12199b
            r3 = 0
            if (r0 == 0) goto L28
        Lc:
            if (r3 > r0) goto L24
            int r1 = r3 + r0
            int r1 = r1 >>> 1
            r4 = r2[r1]
            long r4 = r4 - r9
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L1e
            int r3 = r1 + 1
            goto Lc
        L1e:
            if (r4 <= 0) goto L23
            int r0 = r1 + (-1)
            goto Lc
        L23:
            return r1
        L24:
            int r3 = r3 + 1
            int r9 = -r3
            return r9
        L28:
            r4 = r2[r3]
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 != 0) goto L2f
            return r3
        L2f:
            if (r9 <= 0) goto L33
            r9 = -2
            return r9
        L33:
            return r1
    }

    public final s0.j b(java.lang.Object r14, long r15) {
            r13 = this;
            java.lang.Object[] r0 = r13.f12200c
            int r1 = r0.length
            r2 = 0
            r3 = r2
            r4 = r3
        L6:
            if (r3 >= r1) goto L11
            r5 = r0[r3]
            if (r5 == 0) goto Le
            int r4 = r4 + 1
        Le:
            int r3 = r3 + 1
            goto L6
        L11:
            int r1 = r4 + 1
            long[] r3 = new long[r1]
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r6 = 1
            if (r1 <= r6) goto L55
            r6 = r2
        L1b:
            long[] r7 = r13.f12199b
            int r8 = r13.f12198a
            if (r2 >= r1) goto L3d
            if (r6 >= r8) goto L3d
            r9 = r7[r6]
            r11 = r0[r6]
            int r12 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r12 <= 0) goto L32
            r3[r2] = r15
            r5[r2] = r14
            int r2 = r2 + 1
            goto L3d
        L32:
            if (r11 == 0) goto L3a
            r3[r2] = r9
            r5[r2] = r11
            int r2 = r2 + 1
        L3a:
            int r6 = r6 + 1
            goto L1b
        L3d:
            if (r6 != r8) goto L44
            r3[r4] = r15
            r5[r4] = r14
            goto L59
        L44:
            if (r2 >= r1) goto L59
            r8 = r7[r6]
            r14 = r0[r6]
            if (r14 == 0) goto L52
            r3[r2] = r8
            r5[r2] = r14
            int r2 = r2 + 1
        L52:
            int r6 = r6 + 1
            goto L44
        L55:
            r3[r2] = r15
            r5[r2] = r14
        L59:
            s0.j r14 = new s0.j
            r14.<init>(r1, r3, r5)
            return r14
    }
}
