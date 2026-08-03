package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends d7.s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte[] f2054m = null;

    static {
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [65, 80, 75, 32, 83, 105, 103, 32, 66, 108, 111, 99, 107, 32, 52, 50} // fill-array
            d7.n.f2054m = r0
            return
    }

    @Override // d7.s
    public final int S(java.io.InputStream r4) {
            r3 = this;
            r0 = 24
            r1 = 0
            r3.M(r0, r1)
            byte[] r0 = r3.f11553k
            int r2 = r0.length
            int r4 = r4.read(r0, r1, r2)
            return r4
    }

    public final java.lang.String toString() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte[] r1 = r7.f11553k
            r2 = 0
            long r3 = k7.a.t(r1, r2)
            r0.append(r3)
            java.lang.String r1 = " ["
            r0.append(r1)
            java.lang.String r1 = new java.lang.String
            byte[] r3 = r7.f11553k
            int r4 = r3.length
            r5 = 8
            int r4 = r4 - r5
            if (r4 > 0) goto L21
            byte[] r2 = new byte[r2]
            goto L2d
        L21:
            r6 = 16
            if (r6 <= r4) goto L26
            goto L27
        L26:
            r4 = r6
        L27:
            byte[] r6 = new byte[r4]
            java.lang.System.arraycopy(r3, r5, r6, r2, r4)
            r2 = r6
        L2d:
            r1.<init>(r2)
            java.lang.String r2 = "]"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
    }
}
