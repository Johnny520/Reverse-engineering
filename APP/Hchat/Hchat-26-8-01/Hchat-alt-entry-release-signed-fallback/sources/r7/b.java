package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends k7.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f11552l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f11553k;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            r7.b.f11552l = r0
            return
    }

    public b(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto La
            byte[] r1 = r7.b.f11552l
            r0.f11553k = r1
            return
        La:
            byte[] r1 = new byte[r1]
            r0.f11553k = r1
            return
    }

    @Override // k7.a
    public void B(q7.b r3) {
            r2 = this;
            byte[] r0 = r2.f11553k
            int r1 = r0.length
            if (r1 != 0) goto L6
            return
        L6:
            r3.getClass()
            int r1 = r0.length
            r3.e(r0, r1)
            r2.L()
            return
    }

    @Override // k7.a
    public final int C(java.io.ByteArrayOutputStream r4) {
            r3 = this;
            boolean r0 = r3.f7390i
            r1 = 0
            if (r0 == 0) goto L6
            goto Lb
        L6:
            byte[] r0 = r3.f11553k
            int r2 = r0.length
            if (r2 != 0) goto Lc
        Lb:
            return r1
        Lc:
            r4.write(r0, r1, r2)
            return r2
    }

    public void L() {
            r0 = this;
            return
    }

    public final void M(int r5, boolean r6) {
            r4 = this;
            r0 = 0
            if (r5 >= 0) goto L4
            r5 = r0
        L4:
            if (r5 != 0) goto L10
            byte[] r5 = r7.b.f11552l
            r4.f11553k = r5
            if (r6 == 0) goto L26
            r4.L()
            return
        L10:
            byte[] r1 = r4.f11553k
            int r2 = r1.length
            if (r5 != r2) goto L16
            goto L26
        L16:
            byte[] r3 = new byte[r5]
            if (r5 >= r2) goto L1b
            goto L1c
        L1b:
            r5 = r2
        L1c:
            java.lang.System.arraycopy(r1, r0, r3, r0, r5)
            r4.f11553k = r3
            if (r6 == 0) goto L26
            r4.L()
        L26:
            return
    }

    @Override // k7.a
    public final int p() {
            r1 = this;
            boolean r0 = r1.f7390i
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            byte[] r0 = r1.f11553k
            int r0 = r0.length
            return r0
    }

    @Override // k7.a
    public byte[] r() {
            r1 = this;
            boolean r0 = r1.f7390i
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            byte[] r0 = r1.f11553k
            return r0
    }

    @Override // k7.a
    public final void z(f6.b r3) {
            r2 = this;
            boolean r0 = r3.f3306b
            if (r0 == 0) goto L5
            goto L1f
        L5:
            java.lang.Object r0 = r3.f3308d
            k7.a r0 = (k7.a) r0
            if (r0 != r2) goto Lf
            r0 = 1
            r3.f3306b = r0
            return
        Lf:
            int r0 = r2.p()
            boolean r1 = r3.f3306b
            if (r1 != 0) goto L1f
            if (r0 != 0) goto L1a
            goto L1f
        L1a:
            int r1 = r3.f3307c
            int r1 = r1 + r0
            r3.f3307c = r1
        L1f:
            return
    }
}
