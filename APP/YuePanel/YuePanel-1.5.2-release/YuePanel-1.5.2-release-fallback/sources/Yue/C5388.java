package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3419
@Yue.InterfaceC5792(version = "1.3")
public final class C5388<T> implements java.io.Serializable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5388.C5389 f20029 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.Object f20030;

    /* JADX INFO: renamed from: Yue.ۥۡۦۧۤ$ۥ, reason: contains not printable characters */
    public static final class C5389 {
        public C5389() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5389(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC3250
        @Yue.InterfaceC3421(name = "failure")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final <T> java.lang.Object m20388(java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "exception"
                Yue.C3329.m13906(r2, r0)
                java.lang.Object r2 = Yue.C5391.m20390(r2)
                java.lang.Object r2 = Yue.C5388.m20377(r2)
                return r2
        }

        @Yue.InterfaceC3250
        @Yue.InterfaceC3421(name = "success")
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final <T> java.lang.Object m20389(T r1) {
                r0 = this;
                java.lang.Object r1 = Yue.C5388.m20377(r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۧۤ$ۥ۟, reason: contains not printable characters */
    public static final class C5390 implements java.io.Serializable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final java.lang.Throwable f20031;

        public C5390(@Yue.InterfaceC4418 java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "exception"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f20031 = r2
                return
        }

        public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof Yue.C5388.C5390
                if (r0 == 0) goto L12
                java.lang.Throwable r0 = r1.f20031
                Yue.ۥۡۦۧۤ$ۥ۟ r2 = (Yue.C5388.C5390) r2
                java.lang.Throwable r2 = r2.f20031
                boolean r2 = Yue.C3329.m13897(r0, r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.Throwable r0 = r1.f20031
                int r0 = r0.hashCode()
                return r0
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failure("
                r0.append(r1)
                java.lang.Throwable r1 = r2.f20031
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            Yue.ۥۡۦۧۤ$ۥ r0 = new Yue.ۥۡۦۧۤ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5388.f20029 = r0
            return
    }

    @Yue.InterfaceC4986
    public /* synthetic */ C5388(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f20030 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C5388 m20376(java.lang.Object r1) {
            Yue.ۥۡۦۧۤ r0 = new Yue.ۥۡۦۧۤ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static <T> java.lang.Object m20377(@Yue.InterfaceC4543 java.lang.Object r0) {
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m20378(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof Yue.C5388
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            Yue.ۥۡۦۧۤ r3 = (Yue.C5388) r3
            java.lang.Object r3 = r3.m20387()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m20379(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = Yue.C3329.m13897(r0, r1)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.Throwable m20380(java.lang.Object r1) {
            boolean r0 = r1 instanceof Yue.C5388.C5390
            if (r0 == 0) goto L9
            Yue.ۥۡۦۧۤ$ۥ۟ r1 = (Yue.C5388.C5390) r1
            java.lang.Throwable r1 = r1.f20031
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final T m20381(java.lang.Object r1) {
            boolean r0 = m20384(r1)
            if (r0 == 0) goto L7
            r1 = 0
        L7:
            return r1
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m20382() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int m20383(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.hashCode()
        L8:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m20384(java.lang.Object r0) {
            boolean r0 = r0 instanceof Yue.C5388.C5390
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m20385(java.lang.Object r0) {
            boolean r0 = r0 instanceof Yue.C5388.C5390
            r0 = r0 ^ 1
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static java.lang.String m20386(java.lang.Object r2) {
            boolean r0 = r2 instanceof Yue.C5388.C5390
            if (r0 == 0) goto Lb
            Yue.ۥۡۦۧۤ$ۥ۟ r2 = (Yue.C5388.C5390) r2
            java.lang.String r2 = r2.toString()
            goto L21
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Success("
            r0.append(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L21:
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.f20030
            boolean r2 = m20378(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f20030
            int r0 = m20383(r0)
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.f20030
            java.lang.String r0 = m20386(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object m20387() {
            r1 = this;
            java.lang.Object r0 = r1.f20030
            return r0
    }
}
