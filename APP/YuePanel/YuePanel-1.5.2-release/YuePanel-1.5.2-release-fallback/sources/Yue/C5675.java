package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5675 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f20873 = 1;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f20874 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f20875 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f20876 = 255;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f20877 = 1073745919;

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C5676 {
        public C5676() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m21239(android.app.Service r0, int r1) {
                r0.stopForeground(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۥ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C5677 {
        public C5677() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m21240(android.app.Service r1, int r2, android.app.Notification r3, int r4) {
                if (r4 == 0) goto Lc
                r0 = -1
                if (r4 != r0) goto L6
                goto Lc
            L6:
                r4 = r4 & 255(0xff, float:3.57E-43)
                r1.startForeground(r2, r3, r4)
                goto Lf
            Lc:
                r1.startForeground(r2, r3, r4)
            Lf:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۥ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public static class C5678 {
        public C5678() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m21241(android.app.Service r1, int r2, android.app.Notification r3, int r4) {
                if (r4 == 0) goto Le
                r0 = -1
                if (r4 != r0) goto L6
                goto Le
            L6:
                r0 = 1073745919(0x40000fff, float:2.0009763)
                r4 = r4 & r0
                r1.startForeground(r2, r3, r4)
                goto L11
            Le:
                r1.startForeground(r2, r3, r4)
            L11:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۥ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC5679 {
    }

    public C5675() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m21237(@Yue.InterfaceC4410 android.app.Service r2, int r3, @Yue.InterfaceC4410 android.app.Notification r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            Yue.C5675.C5678.m21241(r2, r3, r4, r5)
            goto L15
        La:
            r1 = 29
            if (r0 < r1) goto L12
            Yue.C5675.C5677.m21240(r2, r3, r4, r5)
            goto L15
        L12:
            r2.startForeground(r3, r4)
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m21238(@Yue.InterfaceC4410 android.app.Service r0, int r1) {
            Yue.C5675.C5676.m21239(r0, r1)
            return
    }
}
