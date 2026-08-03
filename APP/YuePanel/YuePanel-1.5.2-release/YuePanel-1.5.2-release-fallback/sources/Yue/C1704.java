package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1704 implements Yue.InterfaceC1716 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Yue.C1704 f5347 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Yue.C1704 f5348 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Yue.C1704 f5349 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Yue.C1704 f5350 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f5351;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String f5352;

    static {
            Yue.ۥ۟ۨ۠ۦ r0 = new Yue.ۥ۟ۨ۠ۦ
            r1 = 0
            java.lang.String r2 = "FIXED"
            r0.<init>(r1, r2)
            Yue.C1704.f5347 = r0
            Yue.ۥ۟ۨ۠ۦ r0 = new Yue.ۥ۟ۨ۠ۦ
            r1 = 1
            java.lang.String r2 = "REQUIRED"
            r0.<init>(r1, r2)
            Yue.C1704.f5348 = r0
            Yue.ۥ۟ۨ۠ۦ r0 = new Yue.ۥ۟ۨ۠ۦ
            r1 = 2
            java.lang.String r2 = "IMPLIED"
            r0.<init>(r1, r2)
            Yue.C1704.f5349 = r0
            Yue.ۥ۟ۨ۠ۦ r0 = new Yue.ۥ۟ۨ۠ۦ
            r1 = 3
            java.lang.String r2 = "VALUE"
            r0.<init>(r1, r2)
            Yue.C1704.f5350 = r0
            return
    }

    public C1704(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f5351 = r1
            r0.f5352 = r2
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof Yue.C1704
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟ۨ۠ۦ r4 = (Yue.C1704) r4
            int r4 = r4.f5351
            int r1 = r3.f5351
            if (r4 != r1) goto L13
            return r0
        L13:
            return r2
    }

    @Override // Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r2) throws java.io.IOException {
            r1 = this;
            Yue.ۥ۟ۨ۠ۦ r0 = Yue.C1704.f5347
            if (r1 != r0) goto La
            java.lang.String r0 = " #FIXED"
            r2.print(r0)
            goto L1d
        La:
            Yue.ۥ۟ۨ۠ۦ r0 = Yue.C1704.f5348
            if (r1 != r0) goto L14
            java.lang.String r0 = " #REQUIRED"
            r2.print(r0)
            goto L1d
        L14:
            Yue.ۥ۟ۨ۠ۦ r0 = Yue.C1704.f5349
            if (r1 != r0) goto L1d
            java.lang.String r0 = " #IMPLIED"
            r2.print(r0)
        L1d:
            return
    }
}
