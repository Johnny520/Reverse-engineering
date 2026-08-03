package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3705 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C3706 {
        public C3706() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.String m14932(java.util.Locale r0) {
                java.lang.String r0 = r0.toLanguageTag()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C3707 {
        public C3707() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static Yue.C3698 m14933(android.content.res.Configuration r0) {
                android.os.LocaleList r0 = r0.getLocales()
                java.lang.String r0 = r0.toLanguageTags()
                Yue.ۥ۠ۧۦۥ r0 = Yue.C3698.m14896(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(33)
    public static class C3708 {
        public C3708() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.os.LocaleList m14934(java.lang.Object r0) {
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                android.os.LocaleList r0 = r0.getApplicationLocales()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.os.LocaleList m14935(java.lang.Object r0) {
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                android.os.LocaleList r0 = r0.getSystemLocales()
                return r0
        }
    }

    public C3705() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC0412
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C3698 m14928(@Yue.InterfaceC4410 android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1a
            java.lang.Object r2 = m14930(r2)
            if (r2 == 0) goto L15
            android.os.LocaleList r2 = Yue.C3705.C3708.m14934(r2)
            Yue.ۥ۠ۧۦۥ r2 = Yue.C3698.m14901(r2)
            return r2
        L15:
            Yue.ۥ۠ۧۦۥ r2 = Yue.C3698.m14899()
            return r2
        L1a:
            java.lang.String r2 = Yue.C0536.m1894(r2)
            Yue.ۥ۠ۧۦۥ r2 = Yue.C3698.m14896(r2)
            return r2
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C3698 m14929(android.content.res.Configuration r0) {
            Yue.ۥ۠ۧۦۥ r0 = Yue.C3705.C3707.m14933(r0)
            return r0
    }

    @Yue.InterfaceC5336(33)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.Object m14930(android.content.Context r1) {
            java.lang.String r0 = "locale"
            java.lang.Object r1 = r1.getSystemService(r0)
            return r1
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC0412
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C3698 m14931(@Yue.InterfaceC4410 android.content.Context r3) {
            Yue.ۥ۠ۧۦۥ r0 = Yue.C3698.m14899()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L19
            java.lang.Object r3 = m14930(r3)
            if (r3 == 0) goto L25
            android.os.LocaleList r3 = Yue.C3705.C3708.m14935(r3)
            Yue.ۥ۠ۧۦۥ r0 = Yue.C3698.m14901(r3)
            goto L25
        L19:
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r3 = r3.getConfiguration()
            Yue.ۥ۠ۧۦۥ r0 = m14929(r3)
        L25:
            return r0
    }
}
