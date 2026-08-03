package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1700 implements Yue.InterfaceC1716 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Yue.C1700 f5339 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Yue.C1700 f5340 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Yue.C1700 f5341 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Yue.C1700 f5342 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f5343;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String f5344;

    static {
            Yue.ۥ۟ۨ۠ۢ r0 = new Yue.ۥ۟ۨ۠ۢ
            r1 = 0
            java.lang.String r2 = "NONE"
            r0.<init>(r1, r2)
            Yue.C1700.f5339 = r0
            Yue.ۥ۟ۨ۠ۢ r0 = new Yue.ۥ۟ۨ۠ۢ
            r1 = 1
            java.lang.String r2 = "OPTIONAL"
            r0.<init>(r1, r2)
            Yue.C1700.f5340 = r0
            Yue.ۥ۟ۨ۠ۢ r0 = new Yue.ۥ۟ۨ۠ۢ
            r1 = 2
            java.lang.String r2 = "ZEROMANY"
            r0.<init>(r1, r2)
            Yue.C1700.f5341 = r0
            Yue.ۥ۟ۨ۠ۢ r0 = new Yue.ۥ۟ۨ۠ۢ
            r1 = 3
            java.lang.String r2 = "ONEMANY"
            r0.<init>(r1, r2)
            Yue.C1700.f5342 = r0
            return
    }

    public C1700(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f5343 = r1
            r0.f5344 = r2
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof Yue.C1700
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟ۨ۠ۢ r4 = (Yue.C1700) r4
            int r4 = r4.f5343
            int r1 = r3.f5343
            if (r4 != r1) goto L13
            return r0
        L13:
            return r2
    }

    @Override // Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r2) throws java.io.IOException {
            r1 = this;
            Yue.ۥ۟ۨ۠ۢ r0 = Yue.C1700.f5339
            if (r1 != r0) goto L5
            return
        L5:
            Yue.ۥ۟ۨ۠ۢ r0 = Yue.C1700.f5340
            if (r1 != r0) goto Lf
            java.lang.String r0 = "?"
            r2.print(r0)
            goto L22
        Lf:
            Yue.ۥ۟ۨ۠ۢ r0 = Yue.C1700.f5341
            if (r1 != r0) goto L19
            java.lang.String r0 = "*"
            r2.print(r0)
            goto L22
        L19:
            Yue.ۥ۟ۨ۠ۢ r0 = Yue.C1700.f5342
            if (r1 != r0) goto L22
            java.lang.String r0 = "+"
            r2.print(r0)
        L22:
            return
    }
}
