package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteActionCompat implements Yue.InterfaceC6687 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public androidx.core.graphics.drawable.IconCompat f28964;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public java.lang.CharSequence f28965;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public java.lang.CharSequence f28966;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public android.app.PendingIntent f28967;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public boolean f28968;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public boolean f28969;

    /* JADX INFO: renamed from: androidx.core.app.RemoteActionCompat$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C7504 {
        public C7504() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.RemoteAction m28822(android.graphics.drawable.Icon r1, java.lang.CharSequence r2, java.lang.CharSequence r3, android.app.PendingIntent r4) {
                android.app.RemoteAction r0 = new android.app.RemoteAction
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.PendingIntent m28823(android.app.RemoteAction r0) {
                android.app.PendingIntent r0 = r0.getActionIntent()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static java.lang.CharSequence m28824(android.app.RemoteAction r0) {
                java.lang.CharSequence r0 = r0.getContentDescription()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static android.graphics.drawable.Icon m28825(android.app.RemoteAction r0) {
                android.graphics.drawable.Icon r0 = r0.getIcon()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static java.lang.CharSequence m28826(android.app.RemoteAction r0) {
                java.lang.CharSequence r0 = r0.getTitle()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean m28827(android.app.RemoteAction r0) {
                boolean r0 = r0.isEnabled()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m28828(android.app.RemoteAction r0, boolean r1) {
                r0.setEnabled(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.RemoteActionCompat$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C7505 {
        public C7505() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m28829(android.app.RemoteAction r0, boolean r1) {
                r0.setShouldShowIcon(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m28830(android.app.RemoteAction r0) {
                boolean r0 = r0.shouldShowIcon()
                return r0
        }
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public RemoteActionCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public RemoteActionCompat(@Yue.InterfaceC4410 androidx.core.app.RemoteActionCompat r2) {
            r1 = this;
            r1.<init>()
            Yue.C4868.m19181(r2)
            androidx.core.graphics.drawable.IconCompat r0 = r2.f28964
            r1.f28964 = r0
            java.lang.CharSequence r0 = r2.f28965
            r1.f28965 = r0
            java.lang.CharSequence r0 = r2.f28966
            r1.f28966 = r0
            android.app.PendingIntent r0 = r2.f28967
            r1.f28967 = r0
            boolean r0 = r2.f28968
            r1.f28968 = r0
            boolean r2 = r2.f28969
            r1.f28969 = r2
            return
    }

    public RemoteActionCompat(@Yue.InterfaceC4410 androidx.core.graphics.drawable.IconCompat r1, @Yue.InterfaceC4410 java.lang.CharSequence r2, @Yue.InterfaceC4410 java.lang.CharSequence r3, @Yue.InterfaceC4410 android.app.PendingIntent r4) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = Yue.C4868.m19181(r1)
            androidx.core.graphics.drawable.IconCompat r1 = (androidx.core.graphics.drawable.IconCompat) r1
            r0.f28964 = r1
            java.lang.Object r1 = Yue.C4868.m19181(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.f28965 = r1
            java.lang.Object r1 = Yue.C4868.m19181(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.f28966 = r1
            java.lang.Object r1 = Yue.C4868.m19181(r4)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r0.f28967 = r1
            r1 = 1
            r0.f28968 = r1
            r0.f28969 = r1
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(26)
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static androidx.core.app.RemoteActionCompat m28812(@Yue.InterfaceC4410 android.app.RemoteAction r5) {
            Yue.C4868.m19181(r5)
            androidx.core.app.RemoteActionCompat r0 = new androidx.core.app.RemoteActionCompat
            android.graphics.drawable.Icon r1 = androidx.core.app.RemoteActionCompat.C7504.m28825(r5)
            androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.m28833(r1)
            java.lang.CharSequence r2 = androidx.core.app.RemoteActionCompat.C7504.m28826(r5)
            java.lang.CharSequence r3 = androidx.core.app.RemoteActionCompat.C7504.m28824(r5)
            android.app.PendingIntent r4 = androidx.core.app.RemoteActionCompat.C7504.m28823(r5)
            r0.<init>(r1, r2, r3, r4)
            boolean r1 = androidx.core.app.RemoteActionCompat.C7504.m28827(r5)
            r0.m28818(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L30
            boolean r5 = androidx.core.app.RemoteActionCompat.C7505.m28830(r5)
            r0.m28819(r5)
        L30:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.app.PendingIntent m28813() {
            r1 = this;
            android.app.PendingIntent r0 = r1.f28967
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.CharSequence m28814() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f28966
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public androidx.core.graphics.drawable.IconCompat m28815() {
            r1 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r1.f28964
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.CharSequence m28816() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f28965
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m28817() {
            r1 = this;
            boolean r0 = r1.f28968
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m28818(boolean r1) {
            r0 = this;
            r0.f28968 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m28819(boolean r1) {
            r0 = this;
            r0.f28969 = r1
            return
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m28820() {
            r1 = this;
            boolean r0 = r1.f28969
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(26)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public android.app.RemoteAction m28821() {
            r4 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r4.f28964
            android.graphics.drawable.Icon r0 = r0.m28863()
            java.lang.CharSequence r1 = r4.f28965
            java.lang.CharSequence r2 = r4.f28966
            android.app.PendingIntent r3 = r4.f28967
            android.app.RemoteAction r0 = androidx.core.app.RemoteActionCompat.C7504.m28822(r0, r1, r2, r3)
            boolean r1 = r4.m28817()
            androidx.core.app.RemoteActionCompat.C7504.m28828(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L24
            boolean r1 = r4.m28820()
            androidx.core.app.RemoteActionCompat.C7505.m28829(r0, r1)
        L24:
            return r0
    }
}
