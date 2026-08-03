package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3798 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.String f12034;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.content.LocusId f12035;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۡ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C3799 {
        public C3799() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.content.LocusId m15227(@Yue.InterfaceC4410 java.lang.String r1) {
                android.content.LocusId r0 = new android.content.LocusId
                r0.<init>(r1)
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.lang.String m15228(@Yue.InterfaceC4410 android.content.LocusId r0) {
                java.lang.String r0 = r0.getId()
                return r0
        }
    }

    public C3798(@Yue.InterfaceC4410 java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "id cannot be empty"
            java.lang.CharSequence r0 = Yue.C4868.m19186(r3, r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.f12034 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1a
            android.content.LocusId r3 = Yue.C3798.C3799.m15227(r3)
            r2.f12035 = r3
            goto L1d
        L1a:
            r3 = 0
            r2.f12035 = r3
        L1d:
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(29)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C3798 m15223(@Yue.InterfaceC4410 android.content.LocusId r2) {
            java.lang.String r0 = "locusId cannot be null"
            Yue.C4868.m19182(r2, r0)
            Yue.ۥ۠ۨۡ۠ r0 = new Yue.ۥ۠ۨۡ۠
            java.lang.String r2 = Yue.C3798.C3799.m15228(r2)
            java.lang.String r1 = "id cannot be empty"
            java.lang.CharSequence r2 = Yue.C4868.m19186(r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.<init>(r2)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4544 java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<Yue.ۥ۠ۨۡ۠> r3 = Yue.C3798.class
            if (r3 == r2) goto L11
            return r1
        L11:
            Yue.ۥ۠ۨۡ۠ r5 = (Yue.C3798) r5
            java.lang.String r2 = r4.f12034
            if (r2 != 0) goto L1e
            java.lang.String r5 = r5.f12034
            if (r5 != 0) goto L1c
            goto L1d
        L1c:
            r0 = r1
        L1d:
            return r0
        L1e:
            java.lang.String r5 = r5.f12034
            boolean r5 = r2.equals(r5)
            return r5
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f12034
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r1 = r1 + r0
            return r1
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LocusIdCompat["
            r0.append(r1)
            java.lang.String r1 = r2.m15225()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String m15224() {
            r1 = this;
            java.lang.String r0 = r1.f12034
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String m15225() {
            r2 = this;
            java.lang.String r0 = r2.f12034
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "_chars"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(29)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.content.LocusId m15226() {
            r1 = this;
            android.content.LocusId r0 = r1.f12035
            return r0
    }
}
