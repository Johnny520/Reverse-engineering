package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4429 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.String f14006;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.CharSequence f14007;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String f14008;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f14009;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.util.List<Yue.C4424> f14010;

    /* JADX INFO: renamed from: Yue.ۥۡۢۥۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C4430 {
        public C4430() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.NotificationChannelGroup m17402(java.lang.String r1, java.lang.CharSequence r2) {
                android.app.NotificationChannelGroup r0 = new android.app.NotificationChannelGroup
                r0.<init>(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.util.List<android.app.NotificationChannel> m17403(android.app.NotificationChannelGroup r0) {
                java.util.List r0 = r0.getChannels()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static java.lang.String m17404(android.app.NotificationChannel r0) {
                java.lang.String r0 = r0.getGroup()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static java.lang.String m17405(android.app.NotificationChannelGroup r0) {
                java.lang.String r0 = r0.getId()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static java.lang.CharSequence m17406(android.app.NotificationChannelGroup r0) {
                java.lang.CharSequence r0 = r0.getName()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۥۧ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C4431 {
        public C4431() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.String m17407(android.app.NotificationChannelGroup r0) {
                java.lang.String r0 = r0.getDescription()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m17408(android.app.NotificationChannelGroup r0) {
                boolean r0 = r0.isBlocked()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m17409(android.app.NotificationChannelGroup r0, java.lang.String r1) {
                r0.setDescription(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۥۧ$ۥ۟۟, reason: contains not printable characters */
    public static class C4432 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C4429 f14011;

        public C4432(@Yue.InterfaceC4410 java.lang.String r2) {
                r1 = this;
                r1.<init>()
                Yue.ۥۡۢۥۧ r0 = new Yue.ۥۡۢۥۧ
                r0.<init>(r2)
                r1.f14011 = r0
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C4429 m17410() {
                r1 = this;
                Yue.ۥۡۢۥۧ r0 = r1.f14011
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C4429.C4432 m17411(@Yue.InterfaceC4544 java.lang.String r2) {
                r1 = this;
                Yue.ۥۡۢۥۧ r0 = r1.f14011
                r0.f14008 = r2
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C4429.C4432 m17412(@Yue.InterfaceC4544 java.lang.CharSequence r2) {
                r1 = this;
                Yue.ۥۡۢۥۧ r0 = r1.f14011
                r0.f14007 = r2
                return r1
        }
    }

    @Yue.InterfaceC5336(28)
    public C4429(@Yue.InterfaceC4410 android.app.NotificationChannelGroup r2) {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            r1.<init>(r2, r0)
            return
    }

    @Yue.InterfaceC5336(26)
    public C4429(@Yue.InterfaceC4410 android.app.NotificationChannelGroup r4, @Yue.InterfaceC4410 java.util.List<android.app.NotificationChannel> r5) {
            r3 = this;
            java.lang.String r0 = Yue.C4429.C4430.m17405(r4)
            r3.<init>(r0)
            java.lang.CharSequence r0 = Yue.C4429.C4430.m17406(r4)
            r3.f14007 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L19
            java.lang.String r2 = Yue.C4429.C4431.m17407(r4)
            r3.f14008 = r2
        L19:
            if (r0 < r1) goto L2c
            boolean r5 = Yue.C4429.C4431.m17408(r4)
            r3.f14009 = r5
            java.util.List r4 = Yue.C4429.C4430.m17403(r4)
            java.util.List r4 = r3.m17395(r4)
            r3.f14010 = r4
            goto L32
        L2c:
            java.util.List r4 = r3.m17395(r5)
            r3.f14010 = r4
        L32:
            return
    }

    public C4429(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.emptyList()
            r1.f14010 = r0
            java.lang.Object r2 = Yue.C4868.m19181(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f14006 = r2
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.List<Yue.C4424> m17394() {
            r1 = this;
            java.util.List<Yue.ۥۡۢۥۦ> r0 = r1.f14010
            return r0
    }

    @Yue.InterfaceC5336(26)
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.List<Yue.C4424> m17395(java.util.List<android.app.NotificationChannel> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r5.next()
            android.app.NotificationChannel r1 = (android.app.NotificationChannel) r1
            java.lang.String r2 = r4.f14006
            java.lang.String r3 = Yue.C4429.C4430.m17404(r1)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L9
            Yue.ۥۡۢۥۦ r2 = new Yue.ۥۡۢۥۦ
            r2.<init>(r1)
            r0.add(r2)
            goto L9
        L2a:
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String m17396() {
            r1 = this;
            java.lang.String r0 = r1.f14008
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String m17397() {
            r1 = this;
            java.lang.String r0 = r1.f14006
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.CharSequence m17398() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f14007
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.app.NotificationChannelGroup m17399() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = r3.f14006
            java.lang.CharSequence r2 = r3.f14007
            android.app.NotificationChannelGroup r1 = Yue.C4429.C4430.m17402(r1, r2)
            r2 = 28
            if (r0 < r2) goto L13
            java.lang.String r0 = r3.f14008
            Yue.C4429.C4431.m17409(r1, r0)
        L13:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m17400() {
            r1 = this;
            boolean r0 = r1.f14009
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.C4429.C4432 m17401() {
            r2 = this;
            Yue.ۥۡۢۥۧ$ۥ۟۟ r0 = new Yue.ۥۡۢۥۧ$ۥ۟۟
            java.lang.String r1 = r2.f14006
            r0.<init>(r1)
            java.lang.CharSequence r1 = r2.f14007
            Yue.ۥۡۢۥۧ$ۥ۟۟ r0 = r0.m17412(r1)
            java.lang.String r1 = r2.f14008
            Yue.ۥۡۢۥۧ$ۥ۟۟ r0 = r0.m17411(r1)
            return r0
    }
}
