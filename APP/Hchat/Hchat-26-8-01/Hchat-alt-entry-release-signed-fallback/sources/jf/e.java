package jf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6885i;

    public e(ac.k r7) {
            r6 = this;
            r6.<init>()
            r0 = 4
            byte[] r0 = new byte[r0]
            java.lang.Object r1 = r7.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r1.get(r0)
            java.lang.String r0 = new java.lang.String
            r2 = 3
            byte[] r2 = new byte[r2]
            r1.get(r2)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.US_ASCII
            r0.<init>(r2, r3)
            r0 = 1
            r7.M(r0)
            r7.H()
            r0 = 20
            byte[] r0 = new byte[r0]
            r1.get(r0)
            r7.H()
            r7.H()
            int r0 = r1.getInt()
            r2 = 305419896(0x12345678, float:5.6904566E-28)
            if (r0 != r2) goto La7
            r7.H()
            r7.H()
            int r0 = r1.getInt()
            r7.H()
            int r2 = r1.getInt()
            r6.f6879c = r2
            r7.H()
            int r2 = r1.getInt()
            r6.f6880d = r2
            r7.H()
            int r2 = r1.getInt()
            r6.f6882f = r2
            r7.H()
            int r2 = r1.getInt()
            r6.f6881e = r2
            r7.H()
            int r2 = r1.getInt()
            r6.f6883g = r2
            int r2 = r1.getInt()
            r6.f6877a = r2
            int r2 = r1.getInt()
            r6.f6878b = r2
            r7.H()
            r7.H()
            r7.a(r0)
            int r0 = r1.getInt()
            r2 = 0
        L88:
            if (r2 >= r0) goto La6
            int r3 = r7.L()
            r4 = 6
            r7.M(r4)
            int r4 = r1.getInt()
            r5 = 7
            if (r3 == r5) goto La1
            r5 = 8
            if (r3 == r5) goto L9e
            goto La3
        L9e:
            r6.f6885i = r4
            goto La3
        La1:
            r6.f6884h = r4
        La3:
            int r2 = r2 + 1
            goto L88
        La6:
            return
        La7:
            af.d r7 = new af.d
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = "Unexpected endian tag: 0x"
            java.lang.String r0 = wb.en.g(r1, r0)
            r7.<init>(r0)
            throw r7
    }
}
