package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends r7.s {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f11555t;

    public d(int r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.f11555t = r2
            r1.M(r2, r0)
            return
    }

    @Override // r7.s, r7.r
    public final java.lang.String N(byte[] r10) {
            r9 = this;
            if (r10 != 0) goto L3
            goto L3b
        L3:
            int r0 = r10.length
            r1 = 2
            if (r0 >= r1) goto L8
            goto L3b
        L8:
            if (r1 >= r0) goto L3b
            r2 = r10[r1]
            if (r2 == 0) goto L38
            int r0 = r10.length
            r1 = 0
            r2 = 1
            r4 = r1
            r5 = r4
            r3 = r2
        L14:
            if (r3 >= r0) goto L2c
            int r6 = r3 + (-1)
            r7 = r10[r6]
            r8 = r10[r3]
            if (r7 != 0) goto L28
            if (r8 != 0) goto L28
            if (r4 != 0) goto L25
            r4 = r2
            r5 = r3
            goto L29
        L25:
            if (r5 >= r6) goto L29
            goto L2f
        L28:
            r4 = r1
        L29:
            int r3 = r3 + 1
            goto L14
        L2c:
            if (r4 != 0) goto L2f
            goto L30
        L2f:
            r0 = r5
        L30:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_16LE
            r2.<init>(r10, r1, r0, r3)
            return r2
        L38:
            int r1 = r1 + 1
            goto L8
        L3b:
            r10 = 0
            return r10
    }

    @Override // r7.s
    public final int Q(q7.b r1) {
            r0 = this;
            int r1 = r0.f11555t
            return r1
    }

    @Override // r7.s
    public final int S(r7.s r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = -1
            return r2
        L4:
            java.lang.String r0 = r1.f11578m
            java.lang.String r2 = r2.f11578m
            int r2 = y7.a.c(r0, r2)
            return r2
    }

    @Override // r7.s
    public final byte[] V(java.lang.String r4) {
            r3 = this;
            int r0 = r3.f11555t
            if (r4 != 0) goto L7
            byte[] r4 = new byte[r0]
            return r4
        L7:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            byte[] r4 = r4.getBytes(r1)
            byte[] r1 = new byte[r0]
            int r2 = r4.length
            if (r2 <= r0) goto L13
            goto L14
        L13:
            r0 = r2
        L14:
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r1, r2, r0)
            return r1
    }

    @Override // r7.s
    public final void Z(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // r7.s, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            r7.s r1 = (r7.s) r1
            int r1 = r0.S(r1)
            return r1
    }

    @Override // r7.s
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FIXED-"
            r0.<init>(r1)
            int r1 = r3.f11555t
            r0.append(r1)
            java.lang.String r1 = " {"
            r0.append(r1)
            java.lang.String r1 = r3.f11578m
            java.lang.String r2 = "}"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
    }
}
