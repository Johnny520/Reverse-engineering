package e1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f2306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2307h;

    static {
            r3 = 0
            r4 = 0
            r0 = 0
            r1 = 0
            r2 = 0
            be.h.b(r0, r1, r2, r3, r4)
            return
    }

    public d(float r1, float r2, float r3, float r4, long r5, long r7, long r9, long r11) {
            r0 = this;
            r0.<init>()
            r0.f2300a = r1
            r0.f2301b = r2
            r0.f2302c = r3
            r0.f2303d = r4
            r0.f2304e = r5
            r0.f2305f = r7
            r0.f2306g = r9
            r0.f2307h = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L63
        L3:
            boolean r0 = r5 instanceof e1.d
            if (r0 != 0) goto L8
            goto L61
        L8:
            e1.d r5 = (e1.d) r5
            float r0 = r4.f2300a
            float r1 = r5.f2300a
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L15
            goto L61
        L15:
            float r0 = r4.f2301b
            float r1 = r5.f2301b
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L20
            goto L61
        L20:
            float r0 = r4.f2302c
            float r1 = r5.f2302c
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L2b
            goto L61
        L2b:
            float r0 = r4.f2303d
            float r1 = r5.f2303d
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L36
            goto L61
        L36:
            long r0 = r4.f2304e
            long r2 = r5.f2304e
            boolean r0 = a.a.J(r0, r2)
            if (r0 != 0) goto L41
            goto L61
        L41:
            long r0 = r4.f2305f
            long r2 = r5.f2305f
            boolean r0 = a.a.J(r0, r2)
            if (r0 != 0) goto L4c
            goto L61
        L4c:
            long r0 = r4.f2306g
            long r2 = r5.f2306g
            boolean r0 = a.a.J(r0, r2)
            if (r0 != 0) goto L57
            goto L61
        L57:
            long r0 = r4.f2307h
            long r2 = r5.f2307h
            boolean r5 = a.a.J(r0, r2)
            if (r5 != 0) goto L63
        L61:
            r5 = 0
            return r5
        L63:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            float r0 = r4.f2300a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r4.f2301b
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r4.f2302c
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r4.f2303d
            int r0 = eh.a.d(r2, r0, r1)
            long r2 = r4.f2304e
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f2305f
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f2306g
            int r0 = eh.a.f(r0, r1, r2)
            long r1 = r4.f2307h
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r12.f2300a
            java.lang.String r1 = a7.a.V(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r2 = r12.f2301b
            java.lang.String r2 = a7.a.V(r2)
            r0.append(r2)
            r0.append(r1)
            float r2 = r12.f2302c
            java.lang.String r2 = a7.a.V(r2)
            r0.append(r2)
            r0.append(r1)
            float r1 = r12.f2303d
            java.lang.String r1 = a7.a.V(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            long r1 = r12.f2304e
            long r3 = r12.f2305f
            boolean r5 = a.a.J(r1, r3)
            r6 = 41
            java.lang.String r7 = "RoundRect(rect="
            long r8 = r12.f2306g
            long r10 = r12.f2307h
            if (r5 == 0) goto Lb0
            boolean r5 = a.a.J(r3, r8)
            if (r5 == 0) goto Lb0
            boolean r5 = a.a.J(r8, r10)
            if (r5 == 0) goto Lb0
            r3 = 32
            long r3 = r1 >> r3
            int r3 = (int) r3
            float r4 = java.lang.Float.intBitsToFloat(r3)
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r8
            int r1 = (int) r1
            float r2 = java.lang.Float.intBitsToFloat(r1)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L87
            java.lang.String r1 = ", radius="
            java.lang.StringBuilder r0 = bc.e.o(r7, r0, r1)
            float r1 = java.lang.Float.intBitsToFloat(r3)
            java.lang.String r1 = a7.a.V(r1)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
        L87:
            java.lang.String r2 = ", x="
            java.lang.StringBuilder r0 = bc.e.o(r7, r0, r2)
            float r2 = java.lang.Float.intBitsToFloat(r3)
            java.lang.String r2 = a7.a.V(r2)
            r0.append(r2)
            java.lang.String r2 = ", y="
            r0.append(r2)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r1 = a7.a.V(r1)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
        Lb0:
            java.lang.String r5 = ", topLeft="
            java.lang.StringBuilder r0 = bc.e.o(r7, r0, r5)
            java.lang.String r1 = a.a.R0(r1)
            r0.append(r1)
            java.lang.String r1 = ", topRight="
            r0.append(r1)
            java.lang.String r1 = a.a.R0(r3)
            r0.append(r1)
            java.lang.String r1 = ", bottomRight="
            r0.append(r1)
            java.lang.String r1 = a.a.R0(r8)
            r0.append(r1)
            java.lang.String r1 = ", bottomLeft="
            r0.append(r1)
            java.lang.String r1 = a.a.R0(r10)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
