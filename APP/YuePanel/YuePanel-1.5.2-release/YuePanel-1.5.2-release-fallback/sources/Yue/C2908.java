package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2908 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f9380 = 0;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f9381 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f9382 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f9383 = 3;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۢ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public static class C2909 {
        public C2909() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m12417(android.content.Context r0) {
                android.app.GrammaticalInflectionManager r0 = m12418(r0)
                int r0 = r0.getApplicationGrammaticalGender()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.GrammaticalInflectionManager m12418(android.content.Context r1) {
                java.lang.Class<android.app.GrammaticalInflectionManager> r0 = android.app.GrammaticalInflectionManager.class
                java.lang.Object r1 = r1.getSystemService(r0)
                android.app.GrammaticalInflectionManager r1 = (android.app.GrammaticalInflectionManager) r1
                return r1
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m12419(android.content.Context r0, int r1) {
                android.app.GrammaticalInflectionManager r0 = m12418(r0)
                r0.setRequestedApplicationGrammaticalGender(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۢ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC2910 {
    }

    public C2908() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4646(markerClass = {Yue.C0850.InterfaceC0852.class})
    @Yue.InterfaceC0412
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m12415(@Yue.InterfaceC4410 android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            int r2 = Yue.C2908.C2909.m12417(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @Yue.InterfaceC4646(markerClass = {Yue.C0850.InterfaceC0852.class})
    @Yue.InterfaceC0412
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m12416(@Yue.InterfaceC4410 android.content.Context r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L9
            Yue.C2908.C2909.m12419(r2, r3)
        L9:
            return
    }
}
