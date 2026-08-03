package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۣۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7021 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f24549 = 8;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f24550 = 9;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f24551 = 10;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۣ$ۥ, reason: contains not printable characters */
    public static class C7022 {
        public C7022() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m27185(@Yue.InterfaceC4410 android.view.Window r1, boolean r2) {
                android.view.View r1 = r1.getDecorView()
                int r0 = r1.getSystemUiVisibility()
                if (r2 == 0) goto Ld
                r2 = r0 & (-1793(0xfffffffffffff8ff, float:NaN))
                goto Lf
            Ld:
                r2 = r0 | 1792(0x700, float:2.511E-42)
            Lf:
                r1.setSystemUiVisibility(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۣ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C7023 {
        public C7023() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static <T> T m27186(android.view.Window r0, int r1) {
                android.view.View r0 = r0.requireViewById(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۣ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C7024 {
        public C7024() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m27187(@Yue.InterfaceC4410 android.view.Window r0, boolean r1) {
                r0.setDecorFitsSystemWindows(r1)
                return
        }
    }

    public C7021() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C7110 m27182(@Yue.InterfaceC4410 android.view.Window r1, @Yue.InterfaceC4410 android.view.View r2) {
            Yue.ۥۢۥۨۦ r0 = new Yue.ۥۢۥۨۦ
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static <T extends android.view.View> T m27183(@Yue.InterfaceC4410 android.view.Window r2, @Yue.InterfaceC3214 int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            java.lang.Object r2 = Yue.C7021.C7023.m27186(r2, r3)
            android.view.View r2 = (android.view.View) r2
            return r2
        Ld:
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L14
            return r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ID does not reference a View inside this Window"
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m27184(@Yue.InterfaceC4410 android.view.Window r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            Yue.C7021.C7024.m27187(r2, r3)
            goto Ld
        La:
            Yue.C7021.C7022.m27185(r2, r3)
        Ld:
            return
    }
}
