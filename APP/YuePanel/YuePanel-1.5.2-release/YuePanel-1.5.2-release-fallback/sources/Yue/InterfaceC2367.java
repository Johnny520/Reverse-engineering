package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2367 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.InterfaceC2367.C2368 f7757 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.InterfaceC2367 f7758 = null;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۨ$ۥ, reason: contains not printable characters */
    public static final class C2368 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.InterfaceC2367.C2368 f7759 = null;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۨ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C2369 implements Yue.InterfaceC2367 {
            public C2369() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Yue.InterfaceC4418
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "FileSystem.SYSTEM"
                    return r0
            }

            @Override // Yue.InterfaceC2367
            @Yue.InterfaceC4418
            /* JADX INFO: renamed from: ۥ */
            public Yue.InterfaceC5839 mo10898(@Yue.InterfaceC4418 java.io.File r2) throws java.io.FileNotFoundException {
                    r1 = this;
                    java.lang.String r0 = "file"
                    Yue.C3329.m13906(r2, r0)
                    Yue.ۥۣۢ۟ۦ r2 = Yue.C4603.m18395(r2)
                    return r2
            }

            @Override // Yue.InterfaceC2367
            @Yue.InterfaceC4418
            /* JADX INFO: renamed from: ۥ۟ */
            public Yue.InterfaceC5794 mo10899(@Yue.InterfaceC4418 java.io.File r5) throws java.io.FileNotFoundException {
                    r4 = this;
                    java.lang.String r0 = "file"
                    Yue.C3329.m13906(r5, r0)
                    r0 = 0
                    r1 = 1
                    r2 = 0
                    Yue.ۥۣۢ۟ۡ r5 = Yue.C4603.m18394(r5, r2, r1, r0)     // Catch: java.io.FileNotFoundException -> Ld
                    goto L18
                Ld:
                    java.io.File r3 = r5.getParentFile()
                    r3.mkdirs()
                    Yue.ۥۣۢ۟ۡ r5 = Yue.C4603.m18394(r5, r2, r1, r0)
                L18:
                    return r5
            }

            @Override // Yue.InterfaceC2367
            /* JADX INFO: renamed from: ۥ۟۟ */
            public void mo10900(@Yue.InterfaceC4418 java.io.File r5) throws java.io.IOException {
                    r4 = this;
                    java.lang.String r0 = "directory"
                    Yue.C3329.m13906(r5, r0)
                    java.io.File[] r0 = r5.listFiles()
                    if (r0 == 0) goto L40
                    int r5 = r0.length
                    r1 = 0
                Ld:
                    if (r1 >= r5) goto L3f
                    r2 = r0[r1]
                    boolean r3 = r2.isDirectory()
                    if (r3 == 0) goto L1f
                    java.lang.String r3 = "file"
                    Yue.C3329.m13905(r2, r3)
                    r4.mo10900(r2)
                L1f:
                    boolean r3 = r2.delete()
                    if (r3 == 0) goto L28
                    int r1 = r1 + 1
                    goto Ld
                L28:
                    java.io.IOException r5 = new java.io.IOException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "failed to delete "
                    r0.append(r1)
                    r0.append(r2)
                    java.lang.String r0 = r0.toString()
                    r5.<init>(r0)
                    throw r5
                L3f:
                    return
                L40:
                    java.io.IOException r0 = new java.io.IOException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "not a readable directory: "
                    r1.append(r2)
                    r1.append(r5)
                    java.lang.String r5 = r1.toString()
                    r0.<init>(r5)
                    throw r0
            }

            @Override // Yue.InterfaceC2367
            /* JADX INFO: renamed from: ۥ۟۟۟ */
            public boolean mo10901(@Yue.InterfaceC4418 java.io.File r2) {
                    r1 = this;
                    java.lang.String r0 = "file"
                    Yue.C3329.m13906(r2, r0)
                    boolean r2 = r2.exists()
                    return r2
            }

            @Override // Yue.InterfaceC2367
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            public void mo10902(@Yue.InterfaceC4418 java.io.File r4, @Yue.InterfaceC4418 java.io.File r5) throws java.io.IOException {
                    r3 = this;
                    java.lang.String r0 = "from"
                    Yue.C3329.m13906(r4, r0)
                    java.lang.String r0 = "to"
                    Yue.C3329.m13906(r5, r0)
                    r3.mo10903(r5)
                    boolean r0 = r4.renameTo(r5)
                    if (r0 == 0) goto L14
                    return
                L14:
                    java.io.IOException r0 = new java.io.IOException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "failed to rename "
                    r1.append(r2)
                    r1.append(r4)
                    java.lang.String r4 = " to "
                    r1.append(r4)
                    r1.append(r5)
                    java.lang.String r4 = r1.toString()
                    r0.<init>(r4)
                    throw r0
            }

            @Override // Yue.InterfaceC2367
            /* JADX INFO: renamed from: ۥ۟۟۟۠ */
            public void mo10903(@Yue.InterfaceC4418 java.io.File r4) throws java.io.IOException {
                    r3 = this;
                    java.lang.String r0 = "file"
                    Yue.C3329.m13906(r4, r0)
                    boolean r0 = r4.delete()
                    if (r0 != 0) goto L29
                    boolean r0 = r4.exists()
                    if (r0 != 0) goto L12
                    goto L29
                L12:
                    java.io.IOException r0 = new java.io.IOException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "failed to delete "
                    r1.append(r2)
                    r1.append(r4)
                    java.lang.String r4 = r1.toString()
                    r0.<init>(r4)
                    throw r0
                L29:
                    return
            }

            @Override // Yue.InterfaceC2367
            @Yue.InterfaceC4418
            /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
            public Yue.InterfaceC5794 mo10904(@Yue.InterfaceC4418 java.io.File r2) throws java.io.FileNotFoundException {
                    r1 = this;
                    java.lang.String r0 = "file"
                    Yue.C3329.m13906(r2, r0)
                    Yue.ۥۣۢ۟ۡ r2 = Yue.C4603.m18376(r2)     // Catch: java.io.FileNotFoundException -> La
                    goto L15
                La:
                    java.io.File r0 = r2.getParentFile()
                    r0.mkdirs()
                    Yue.ۥۣۢ۟ۡ r2 = Yue.C4603.m18376(r2)
                L15:
                    return r2
            }

            @Override // Yue.InterfaceC2367
            /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
            public long mo10905(@Yue.InterfaceC4418 java.io.File r3) {
                    r2 = this;
                    java.lang.String r0 = "file"
                    Yue.C3329.m13906(r3, r0)
                    long r0 = r3.length()
                    return r0
            }
        }

        static {
                Yue.ۥۣ۠ۡۨ$ۥ r0 = new Yue.ۥۣ۠ۡۨ$ۥ
                r0.<init>()
                Yue.InterfaceC2367.C2368.f7759 = r0
                return
        }

        public C2368() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥۣ۠ۡۨ$ۥ r0 = Yue.InterfaceC2367.C2368.f7759
            Yue.InterfaceC2367.f7757 = r0
            Yue.ۥۣ۠ۡۨ$ۥ$ۥ r0 = new Yue.ۥۣ۠ۡۨ$ۥ$ۥ
            r0.<init>()
            Yue.InterfaceC2367.f7758 = r0
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    Yue.InterfaceC5839 mo10898(@Yue.InterfaceC4418 java.io.File r1) throws java.io.FileNotFoundException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    Yue.InterfaceC5794 mo10899(@Yue.InterfaceC4418 java.io.File r1) throws java.io.FileNotFoundException;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    void mo10900(@Yue.InterfaceC4418 java.io.File r1) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    boolean mo10901(@Yue.InterfaceC4418 java.io.File r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    void mo10902(@Yue.InterfaceC4418 java.io.File r1, @Yue.InterfaceC4418 java.io.File r2) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    void mo10903(@Yue.InterfaceC4418 java.io.File r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    Yue.InterfaceC5794 mo10904(@Yue.InterfaceC4418 java.io.File r1) throws java.io.FileNotFoundException;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    long mo10905(@Yue.InterfaceC4418 java.io.File r1);
}
