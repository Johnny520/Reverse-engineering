package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"InlinedApi"})
public final class C3084 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f10077 = 0;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f10078 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f10079 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f10080 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f10081 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f10082 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f10083 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f10084 = 32;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f10085 = 256;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f10086 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f10087 = 63;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C3085 {
        public C3085() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.text.Spanned m12999(java.lang.String r0, int r1) {
                android.text.Spanned r0 = android.text.Html.fromHtml(r0, r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.text.Spanned m13000(java.lang.String r0, int r1, android.text.Html.ImageGetter r2, android.text.Html.TagHandler r3) {
                android.text.Spanned r0 = android.text.Html.fromHtml(r0, r1, r2, r3)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static java.lang.String m13001(android.text.Spanned r0, int r1) {
                java.lang.String r0 = android.text.Html.toHtml(r0, r1)
                return r0
        }
    }

    public C3084() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.text.Spanned m12996(@Yue.InterfaceC4410 java.lang.String r0, int r1) {
            android.text.Spanned r0 = Yue.C3084.C3085.m12999(r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.text.Spanned m12997(@Yue.InterfaceC4410 java.lang.String r0, int r1, @Yue.InterfaceC4544 android.text.Html.ImageGetter r2, @Yue.InterfaceC4544 android.text.Html.TagHandler r3) {
            android.text.Spanned r0 = Yue.C3084.C3085.m13000(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.String m12998(@Yue.InterfaceC4410 android.text.Spanned r0, int r1) {
            java.lang.String r0 = Yue.C3084.C3085.m13001(r0, r1)
            return r0
    }
}
