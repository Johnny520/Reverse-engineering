package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4517 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f14422 = "NotifManCompat";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f14423 = "checkOpNoThrow";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f14424 = "OP_POST_NOTIFICATION";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f14425 = "android.support.useSideChannel";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f14426 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f14427 = 19;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f14428 = 1000;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f14429 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.String f14430 = "enabled_notification_listeners";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.Object f14431 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @Yue.InterfaceC2947("sEnabledNotificationListenersLock")
    public static java.lang.String f14432 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @Yue.InterfaceC2947("sEnabledNotificationListenersLock")
    public static java.util.Set<java.lang.String> f14433 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final java.lang.Object f14434 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    @Yue.InterfaceC2947("sLock")
    public static Yue.C4517.ServiceConnectionC4529 f14435 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f14436 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f14437 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f14438 = 3;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f14439 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f14440 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f14441 = -1000;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f14442 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f14443 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f14444 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f14445 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f14446 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f14447 = 5;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f14448;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.app.NotificationManager f14449;

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C4518 {
        public C4518() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.util.List<android.service.notification.StatusBarNotification> m17968(android.app.NotificationManager r0) {
                android.service.notification.StatusBarNotification[] r0 = r0.getActiveNotifications()
                if (r0 != 0) goto Lc
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                return r0
            Lc:
                java.util.List r0 = java.util.Arrays.asList(r0)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static int m17969(android.app.NotificationManager r0) {
                int r0 = r0.getCurrentInterruptionFilter()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C4519 {
        public C4519() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m17970(android.app.NotificationManager r0) {
                boolean r0 = r0.areNotificationsEnabled()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static int m17971(android.app.NotificationManager r0) {
                int r0 = r0.getImportance()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C4520 {
        public C4520() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m17972(android.app.NotificationManager r0, android.app.NotificationChannel r1) {
                r0.createNotificationChannel(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m17973(android.app.NotificationManager r0, android.app.NotificationChannelGroup r1) {
                r0.createNotificationChannelGroup(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m17974(android.app.NotificationManager r0, java.util.List<android.app.NotificationChannelGroup> r1) {
                r0.createNotificationChannelGroups(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m17975(android.app.NotificationManager r0, java.util.List<android.app.NotificationChannel> r1) {
                r0.createNotificationChannels(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m17976(android.app.NotificationManager r0, java.lang.String r1) {
                r0.deleteNotificationChannel(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m17977(android.app.NotificationManager r0, java.lang.String r1) {
                r0.deleteNotificationChannelGroup(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static java.lang.String m17978(android.app.NotificationChannel r0) {
                java.lang.String r0 = r0.getId()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static java.lang.String m17979(android.app.NotificationChannelGroup r0) {
                java.lang.String r0 = r0.getId()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static android.app.NotificationChannel m17980(android.app.NotificationManager r0, java.lang.String r1) {
                android.app.NotificationChannel r0 = r0.getNotificationChannel(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static java.util.List<android.app.NotificationChannelGroup> m17981(android.app.NotificationManager r0) {
                java.util.List r0 = r0.getNotificationChannelGroups()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static java.util.List<android.app.NotificationChannel> m17982(android.app.NotificationManager r0) {
                java.util.List r0 = r0.getNotificationChannels()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C4521 {
        public C4521() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.NotificationChannelGroup m17983(android.app.NotificationManager r0, java.lang.String r1) {
                android.app.NotificationChannelGroup r0 = r0.getNotificationChannelGroup(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C4522 {
        public C4522() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.NotificationChannel m17984(android.app.NotificationManager r0, java.lang.String r1, java.lang.String r2) {
                android.app.NotificationChannel r0 = r0.getNotificationChannel(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.lang.String m17985(android.app.NotificationChannel r0) {
                java.lang.String r0 = r0.getParentChannelId()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public static class C4523 {
        public C4523() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m17986(android.app.NotificationManager r0) {
                boolean r0 = r0.canUseFullScreenIntent()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C4524 implements Yue.C4517.InterfaceC4531 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f14450;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int f14451;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.String f14452;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean f14453;

        public C4524(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.f14450 = r1
                r1 = 0
                r0.f14451 = r1
                r1 = 0
                r0.f14452 = r1
                r1 = 1
                r0.f14453 = r1
                return
        }

        public C4524(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.f14450 = r1
                r0.f14451 = r2
                r0.f14452 = r3
                r1 = 0
                r0.f14453 = r1
                return
        }

        @Yue.InterfaceC4410
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CancelTask["
                r0.<init>(r1)
                java.lang.String r1 = "packageName:"
                r0.append(r1)
                java.lang.String r1 = r2.f14450
                r0.append(r1)
                java.lang.String r1 = ", id:"
                r0.append(r1)
                int r1 = r2.f14451
                r0.append(r1)
                java.lang.String r1 = ", tag:"
                r0.append(r1)
                java.lang.String r1 = r2.f14452
                r0.append(r1)
                java.lang.String r1 = ", all:"
                r0.append(r1)
                boolean r1 = r2.f14453
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.C4517.InterfaceC4531
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo17987(Yue.InterfaceC3188 r4) throws android.os.RemoteException {
                r3 = this;
                boolean r0 = r3.f14453
                if (r0 == 0) goto La
                java.lang.String r0 = r3.f14450
                r4.mo13592(r0)
                goto L13
            La:
                java.lang.String r0 = r3.f14450
                int r1 = r3.f14451
                java.lang.String r2 = r3.f14452
                r4.mo13593(r0, r1, r2)
            L13:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC4525 {
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C4526 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f14454;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int f14455;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.app.Notification f14456;

        public C4526(int r2, @Yue.InterfaceC4410 android.app.Notification r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r2, r3)
                return
        }

        public C4526(@Yue.InterfaceC4544 java.lang.String r1, int r2, @Yue.InterfaceC4410 android.app.Notification r3) {
                r0 = this;
                r0.<init>()
                r0.f14454 = r1
                r0.f14455 = r2
                r0.f14456 = r3
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C4527 implements Yue.C4517.InterfaceC4531 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f14457;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int f14458;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.String f14459;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final android.app.Notification f14460;

        public C4527(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4) {
                r0 = this;
                r0.<init>()
                r0.f14457 = r1
                r0.f14458 = r2
                r0.f14459 = r3
                r0.f14460 = r4
                return
        }

        @Yue.InterfaceC4410
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "NotifyTask["
                r0.<init>(r1)
                java.lang.String r1 = "packageName:"
                r0.append(r1)
                java.lang.String r1 = r2.f14457
                r0.append(r1)
                java.lang.String r1 = ", id:"
                r0.append(r1)
                int r1 = r2.f14458
                r0.append(r1)
                java.lang.String r1 = ", tag:"
                r0.append(r1)
                java.lang.String r1 = r2.f14459
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.C4517.InterfaceC4531
        /* JADX INFO: renamed from: ۥ */
        public void mo17987(Yue.InterfaceC3188 r5) throws android.os.RemoteException {
                r4 = this;
                java.lang.String r0 = r4.f14457
                int r1 = r4.f14458
                java.lang.String r2 = r4.f14459
                android.app.Notification r3 = r4.f14460
                r5.mo13594(r0, r1, r2, r3)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static class C4528 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.ComponentName f14461;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.os.IBinder f14462;

        public C4528(android.content.ComponentName r1, android.os.IBinder r2) {
                r0 = this;
                r0.<init>()
                r0.f14461 = r1
                r0.f14462 = r2
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class ServiceConnectionC4529 implements android.os.Handler.Callback, android.content.ServiceConnection {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f14463 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f14464 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f14465 = 2;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f14466 = 3;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.Context f14467;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.os.HandlerThread f14468;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.os.Handler f14469;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final java.util.Map<android.content.ComponentName, Yue.C4517.ServiceConnectionC4529.C4530> f14470;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public java.util.Set<java.lang.String> f14471;

        /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ, reason: contains not printable characters */
        public static class C4530 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final android.content.ComponentName f14472;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public boolean f14473;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public Yue.InterfaceC3188 f14474;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public java.util.ArrayDeque<Yue.C4517.InterfaceC4531> f14475;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public int f14476;

            public C4530(android.content.ComponentName r3) {
                    r2 = this;
                    r2.<init>()
                    r0 = 0
                    r2.f14473 = r0
                    java.util.ArrayDeque r1 = new java.util.ArrayDeque
                    r1.<init>()
                    r2.f14475 = r1
                    r2.f14476 = r0
                    r2.f14472 = r3
                    return
            }
        }

        public ServiceConnectionC4529(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f14470 = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.f14471 = r0
                r1.f14467 = r2
                android.os.HandlerThread r2 = new android.os.HandlerThread
                java.lang.String r0 = "NotificationManagerCompat"
                r2.<init>(r0)
                r1.f14468 = r2
                r2.start()
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r2 = r2.getLooper()
                r0.<init>(r2, r1)
                r1.f14469 = r0
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 1
                if (r0 == 0) goto L2b
                if (r0 == r1) goto L1f
                r2 = 2
                if (r0 == r2) goto L17
                r2 = 3
                if (r0 == r2) goto Lf
                r4 = 0
                return r4
            Lf:
                java.lang.Object r4 = r4.obj
                android.content.ComponentName r4 = (android.content.ComponentName) r4
                r3.m17991(r4)
                return r1
            L17:
                java.lang.Object r4 = r4.obj
                android.content.ComponentName r4 = (android.content.ComponentName) r4
                r3.m17993(r4)
                return r1
            L1f:
                java.lang.Object r4 = r4.obj
                Yue.ۥۡۢۦۤ$ۥ۟۟۟ۥ r4 = (Yue.C4517.C4528) r4
                android.content.ComponentName r0 = r4.f14461
                android.os.IBinder r4 = r4.f14462
                r3.m17992(r0, r4)
                return r1
            L2b:
                java.lang.Object r4 = r4.obj
                Yue.ۥۡۢۦۤ$ۥ۟۟۟ۧ r4 = (Yue.C4517.InterfaceC4531) r4
                r3.m17990(r4)
                return r1
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
                r3 = this;
                r0 = 3
                java.lang.String r1 = "NotifManCompat"
                boolean r0 = android.util.Log.isLoggable(r1, r0)
                if (r0 == 0) goto L1d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Connected to service "
                r0.append(r2)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r1, r0)
            L1d:
                android.os.Handler r0 = r3.f14469
                Yue.ۥۡۢۦۤ$ۥ۟۟۟ۥ r1 = new Yue.ۥۡۢۦۤ$ۥ۟۟۟ۥ
                r1.<init>(r4, r5)
                r4 = 1
                android.os.Message r4 = r0.obtainMessage(r4, r1)
                r4.sendToTarget()
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r4) {
                r3 = this;
                r0 = 3
                java.lang.String r1 = "NotifManCompat"
                boolean r0 = android.util.Log.isLoggable(r1, r0)
                if (r0 == 0) goto L1d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Disconnected from service "
                r0.append(r2)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r1, r0)
            L1d:
                android.os.Handler r0 = r3.f14469
                r1 = 2
                android.os.Message r4 = r0.obtainMessage(r1, r4)
                r4.sendToTarget()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final boolean m17988(Yue.C4517.ServiceConnectionC4529.C4530 r4) {
                r3 = this;
                boolean r0 = r4.f14473
                if (r0 == 0) goto L6
                r4 = 1
                return r4
            L6:
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
                r0.<init>(r1)
                android.content.ComponentName r1 = r4.f14472
                android.content.Intent r0 = r0.setComponent(r1)
                android.content.Context r1 = r3.f14467
                r2 = 33
                boolean r0 = r1.bindService(r0, r3, r2)
                r4.f14473 = r0
                if (r0 == 0) goto L23
                r0 = 0
                r4.f14476 = r0
                goto L40
            L23:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unable to bind to listener "
                r0.append(r1)
                android.content.ComponentName r1 = r4.f14472
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "NotifManCompat"
                android.util.Log.w(r1, r0)
                android.content.Context r0 = r3.f14467
                r0.unbindService(r3)
            L40:
                boolean r4 = r4.f14473
                return r4
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m17989(Yue.C4517.ServiceConnectionC4529.C4530 r2) {
                r1 = this;
                boolean r0 = r2.f14473
                if (r0 == 0) goto Lc
                android.content.Context r0 = r1.f14467
                r0.unbindService(r1)
                r0 = 0
                r2.f14473 = r0
            Lc:
                r0 = 0
                r2.f14474 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m17990(Yue.C4517.InterfaceC4531 r4) {
                r3 = this;
                r3.m17997()
                java.util.Map<android.content.ComponentName, Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ> r0 = r3.f14470
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            Ld:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r0.next()
                Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ r1 = (Yue.C4517.ServiceConnectionC4529.C4530) r1
                java.util.ArrayDeque<Yue.ۥۡۢۦۤ$ۥ۟۟۟ۧ> r2 = r1.f14475
                r2.add(r4)
                r3.m17994(r1)
                goto Ld
            L22:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m17991(android.content.ComponentName r2) {
                r1 = this;
                java.util.Map<android.content.ComponentName, Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ> r0 = r1.f14470
                java.lang.Object r2 = r0.get(r2)
                Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ r2 = (Yue.C4517.ServiceConnectionC4529.C4530) r2
                if (r2 == 0) goto Ld
                r1.m17994(r2)
            Ld:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m17992(android.content.ComponentName r2, android.os.IBinder r3) {
                r1 = this;
                java.util.Map<android.content.ComponentName, Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ> r0 = r1.f14470
                java.lang.Object r2 = r0.get(r2)
                Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ r2 = (Yue.C4517.ServiceConnectionC4529.C4530) r2
                if (r2 == 0) goto L16
                Yue.ۥ۠ۥ۟ۢ r3 = Yue.InterfaceC3188.AbstractBinderC3190.m13595(r3)
                r2.f14474 = r3
                r3 = 0
                r2.f14476 = r3
                r1.m17994(r2)
            L16:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m17993(android.content.ComponentName r2) {
                r1 = this;
                java.util.Map<android.content.ComponentName, Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ> r0 = r1.f14470
                java.lang.Object r2 = r0.get(r2)
                Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ r2 = (Yue.C4517.ServiceConnectionC4529.C4530) r2
                if (r2 == 0) goto Ld
                r1.m17989(r2)
            Ld:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m17994(Yue.C4517.ServiceConnectionC4529.C4530 r6) {
                r5 = this;
                java.lang.String r0 = "NotifManCompat"
                r1 = 3
                boolean r2 = android.util.Log.isLoggable(r0, r1)
                if (r2 == 0) goto L32
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Processing component "
                r2.append(r3)
                android.content.ComponentName r3 = r6.f14472
                r2.append(r3)
                java.lang.String r3 = ", "
                r2.append(r3)
                java.util.ArrayDeque<Yue.ۥۡۢۦۤ$ۥ۟۟۟ۧ> r3 = r6.f14475
                int r3 = r3.size()
                r2.append(r3)
                java.lang.String r3 = " queued tasks"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.d(r0, r2)
            L32:
                java.util.ArrayDeque<Yue.ۥۡۢۦۤ$ۥ۟۟۟ۧ> r2 = r6.f14475
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L3b
                return
            L3b:
                boolean r2 = r5.m17988(r6)
                if (r2 == 0) goto Lb9
                Yue.ۥ۠ۥ۟ۢ r2 = r6.f14474
                if (r2 != 0) goto L47
                goto Lb9
            L47:
                java.util.ArrayDeque<Yue.ۥۡۢۦۤ$ۥ۟۟۟ۧ> r2 = r6.f14475
                java.lang.Object r2 = r2.peek()
                Yue.ۥۡۢۦۤ$ۥ۟۟۟ۧ r2 = (Yue.C4517.InterfaceC4531) r2
                if (r2 != 0) goto L52
                goto Lad
            L52:
                boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch: android.os.RemoteException -> L6d android.os.DeadObjectException -> L91
                if (r3 == 0) goto L6f
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L6d android.os.DeadObjectException -> L91
                r3.<init>()     // Catch: android.os.RemoteException -> L6d android.os.DeadObjectException -> L91
                java.lang.String r4 = "Sending task "
                r3.append(r4)     // Catch: android.os.RemoteException -> L6d android.os.DeadObjectException -> L91
                r3.append(r2)     // Catch: android.os.RemoteException -> L6d android.os.DeadObjectException -> L91
                java.lang.String r3 = r3.toString()     // Catch: android.os.RemoteException -> L6d android.os.DeadObjectException -> L91
                android.util.Log.d(r0, r3)     // Catch: android.os.RemoteException -> L6d android.os.DeadObjectException -> L91
                goto L6f
            L6d:
                r1 = move-exception
                goto L7a
            L6f:
                Yue.ۥ۠ۥ۟ۢ r3 = r6.f14474     // Catch: android.os.RemoteException -> L6d android.os.DeadObjectException -> L91
                r2.mo17987(r3)     // Catch: android.os.RemoteException -> L6d android.os.DeadObjectException -> L91
                java.util.ArrayDeque<Yue.ۥۡۢۦۤ$ۥ۟۟۟ۧ> r2 = r6.f14475     // Catch: android.os.RemoteException -> L6d android.os.DeadObjectException -> L91
                r2.remove()     // Catch: android.os.RemoteException -> L6d android.os.DeadObjectException -> L91
                goto L47
            L7a:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "RemoteException communicating with "
                r2.append(r3)
                android.content.ComponentName r3 = r6.f14472
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.w(r0, r2, r1)
                goto Lad
            L91:
                boolean r1 = android.util.Log.isLoggable(r0, r1)
                if (r1 == 0) goto Lad
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Remote service has died: "
                r1.append(r2)
                android.content.ComponentName r2 = r6.f14472
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
            Lad:
                java.util.ArrayDeque<Yue.ۥۡۢۦۤ$ۥ۟۟۟ۧ> r0 = r6.f14475
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto Lb8
                r5.m17996(r6)
            Lb8:
                return
            Lb9:
                r5.m17996(r6)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m17995(Yue.C4517.InterfaceC4531 r3) {
                r2 = this;
                android.os.Handler r0 = r2.f14469
                r1 = 0
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m17996(Yue.C4517.ServiceConnectionC4529.C4530 r6) {
                r5 = this;
                android.os.Handler r0 = r5.f14469
                android.content.ComponentName r1 = r6.f14472
                r2 = 3
                boolean r0 = r0.hasMessages(r2, r1)
                if (r0 == 0) goto Lc
                return
            Lc:
                int r0 = r6.f14476
                int r1 = r0 + 1
                r6.f14476 = r1
                r3 = 6
                java.lang.String r4 = "NotifManCompat"
                if (r1 <= r3) goto L50
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Giving up on delivering "
                r0.append(r1)
                java.util.ArrayDeque<Yue.ۥۡۢۦۤ$ۥ۟۟۟ۧ> r1 = r6.f14475
                int r1 = r1.size()
                r0.append(r1)
                java.lang.String r1 = " tasks to "
                r0.append(r1)
                android.content.ComponentName r1 = r6.f14472
                r0.append(r1)
                java.lang.String r1 = " after "
                r0.append(r1)
                int r1 = r6.f14476
                r0.append(r1)
                java.lang.String r1 = " retries"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.w(r4, r0)
                java.util.ArrayDeque<Yue.ۥۡۢۦۤ$ۥ۟۟۟ۧ> r6 = r6.f14475
                r6.clear()
                return
            L50:
                r1 = 1
                int r0 = r1 << r0
                int r0 = r0 * 1000
                boolean r1 = android.util.Log.isLoggable(r4, r2)
                if (r1 == 0) goto L74
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Scheduling retry for "
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " ms"
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r4, r1)
            L74:
                android.os.Handler r1 = r5.f14469
                android.content.ComponentName r6 = r6.f14472
                android.os.Message r6 = r1.obtainMessage(r2, r6)
                android.os.Handler r1 = r5.f14469
                long r2 = (long) r0
                r1.sendMessageDelayed(r6, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m17997() {
                r8 = this;
                android.content.Context r0 = r8.f14467
                java.util.Set r0 = Yue.C4517.m17933(r0)
                java.util.Set<java.lang.String> r1 = r8.f14471
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto Lf
                return
            Lf:
                r8.f14471 = r0
                android.content.Context r1 = r8.f14467
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                java.lang.String r3 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
                android.content.Intent r2 = r2.setAction(r3)
                r3 = 0
                java.util.List r1 = r1.queryIntentServices(r2, r3)
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                java.util.Iterator r1 = r1.iterator()
            L30:
                boolean r3 = r1.hasNext()
                java.lang.String r4 = "NotifManCompat"
                if (r3 == 0) goto L78
                java.lang.Object r3 = r1.next()
                android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
                android.content.pm.ServiceInfo r5 = r3.serviceInfo
                java.lang.String r5 = r5.packageName
                boolean r5 = r0.contains(r5)
                if (r5 != 0) goto L49
                goto L30
            L49:
                android.content.ComponentName r5 = new android.content.ComponentName
                android.content.pm.ServiceInfo r6 = r3.serviceInfo
                java.lang.String r7 = r6.packageName
                java.lang.String r6 = r6.name
                r5.<init>(r7, r6)
                android.content.pm.ServiceInfo r3 = r3.serviceInfo
                java.lang.String r3 = r3.permission
                if (r3 == 0) goto L74
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r6 = "Permission present on component "
                r3.append(r6)
                r3.append(r5)
                java.lang.String r5 = ", not adding listener record."
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                android.util.Log.w(r4, r3)
                goto L30
            L74:
                r2.add(r5)
                goto L30
            L78:
                java.util.Iterator r0 = r2.iterator()
            L7c:
                boolean r1 = r0.hasNext()
                r3 = 3
                if (r1 == 0) goto Lb6
                java.lang.Object r1 = r0.next()
                android.content.ComponentName r1 = (android.content.ComponentName) r1
                java.util.Map<android.content.ComponentName, Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ> r5 = r8.f14470
                boolean r5 = r5.containsKey(r1)
                if (r5 != 0) goto L7c
                boolean r3 = android.util.Log.isLoggable(r4, r3)
                if (r3 == 0) goto Lab
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "Adding listener record for "
                r3.append(r5)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                android.util.Log.d(r4, r3)
            Lab:
                java.util.Map<android.content.ComponentName, Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ> r3 = r8.f14470
                Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ r5 = new Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ
                r5.<init>(r1)
                r3.put(r1, r5)
                goto L7c
            Lb6:
                java.util.Map<android.content.ComponentName, Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ> r0 = r8.f14470
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            Lc0:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L101
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r5 = r1.getKey()
                boolean r5 = r2.contains(r5)
                if (r5 != 0) goto Lc0
                boolean r5 = android.util.Log.isLoggable(r4, r3)
                if (r5 == 0) goto Lf4
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Removing listener record for "
                r5.append(r6)
                java.lang.Object r6 = r1.getKey()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                android.util.Log.d(r4, r5)
            Lf4:
                java.lang.Object r1 = r1.getValue()
                Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ r1 = (Yue.C4517.ServiceConnectionC4529.C4530) r1
                r8.m17989(r1)
                r0.remove()
                goto Lc0
            L101:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public interface InterfaceC4531 {
        /* JADX INFO: renamed from: ۥ */
        void mo17987(Yue.InterfaceC3188 r1) throws android.os.RemoteException;
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C4517.f14431 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            Yue.C4517.f14433 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C4517.f14434 = r0
            return
    }

    @Yue.InterfaceC6959
    public C4517(@Yue.InterfaceC4410 android.app.NotificationManager r1, @Yue.InterfaceC4410 android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.f14448 = r2
            r0.f14449 = r1
            return
    }

    public C4517(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.f14448 = r2
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            r1.f14449 = r2
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static Yue.C4517 m17932(@Yue.InterfaceC4410 android.content.Context r1) {
            Yue.ۥۡۢۦۤ r0 = new Yue.ۥۡۢۦۤ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static java.util.Set<java.lang.String> m17933(@Yue.InterfaceC4410 android.content.Context r6) {
            android.content.ContentResolver r6 = r6.getContentResolver()
            java.lang.String r0 = "enabled_notification_listeners"
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r0)
            java.lang.Object r0 = Yue.C4517.f14431
            monitor-enter(r0)
            if (r6 == 0) goto L41
            java.lang.String r1 = Yue.C4517.f14432     // Catch: java.lang.Throwable -> L38
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L41
            java.lang.String r1 = ":"
            r2 = -1
            java.lang.String[] r1 = r6.split(r1, r2)     // Catch: java.lang.Throwable -> L38
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L38
            int r3 = r1.length     // Catch: java.lang.Throwable -> L38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L38
            int r3 = r1.length     // Catch: java.lang.Throwable -> L38
            r4 = 0
        L26:
            if (r4 >= r3) goto L3d
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L38
            android.content.ComponentName r5 = android.content.ComponentName.unflattenFromString(r5)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L3a
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L38
            r2.add(r5)     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r6 = move-exception
            goto L45
        L3a:
            int r4 = r4 + 1
            goto L26
        L3d:
            Yue.C4517.f14433 = r2     // Catch: java.lang.Throwable -> L38
            Yue.C4517.f14432 = r6     // Catch: java.lang.Throwable -> L38
        L41:
            java.util.Set<java.lang.String> r6 = Yue.C4517.f14433     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return r6
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static boolean m17934(android.app.Notification r1) {
            android.os.Bundle r1 = Yue.C4434.m17427(r1)
            if (r1 == 0) goto L10
            java.lang.String r0 = "android.support.useSideChannel"
            boolean r1 = r1.getBoolean(r0)
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m17935() {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            boolean r0 = Yue.C4517.C4519.m17970(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m17936() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            if (r0 >= r1) goto L8
            return r2
        L8:
            r1 = 34
            if (r0 >= r1) goto L19
            android.content.Context r0 = r3.f14448
            java.lang.String r1 = "android.permission.USE_FULL_SCREEN_INTENT"
            int r0 = r0.checkSelfPermission(r1)
            if (r0 != 0) goto L17
            goto L18
        L17:
            r2 = 0
        L18:
            return r2
        L19:
            android.app.NotificationManager r0 = r3.f14449
            boolean r0 = Yue.C4517.C4523.m17986(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m17937(int r2) {
            r1 = this;
            r0 = 0
            r1.m17938(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m17938(@Yue.InterfaceC4544 java.lang.String r2, int r3) {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            r0.cancel(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m17939() {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            r0.cancelAll()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m17940(@Yue.InterfaceC4410 Yue.C4424 r1) {
            r0 = this;
            android.app.NotificationChannel r1 = r1.m17346()
            r0.m17941(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m17941(@Yue.InterfaceC4410 android.app.NotificationChannel r2) {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            Yue.C4517.C4520.m17972(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m17942(@Yue.InterfaceC4410 Yue.C4429 r1) {
            r0 = this;
            android.app.NotificationChannelGroup r1 = r1.m17399()
            r0.m17943(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m17943(@Yue.InterfaceC4410 android.app.NotificationChannelGroup r2) {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            Yue.C4517.C4520.m17973(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m17944(@Yue.InterfaceC4410 java.util.List<android.app.NotificationChannelGroup> r2) {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            Yue.C4517.C4520.m17974(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m17945(@Yue.InterfaceC4410 java.util.List<Yue.C4429> r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2c
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r3.next()
            Yue.ۥۡۢۥۧ r1 = (Yue.C4429) r1
            android.app.NotificationChannelGroup r1 = r1.m17399()
            r0.add(r1)
            goto L13
        L27:
            android.app.NotificationManager r3 = r2.f14449
            Yue.C4517.C4520.m17974(r3, r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m17946(@Yue.InterfaceC4410 java.util.List<android.app.NotificationChannel> r2) {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            Yue.C4517.C4520.m17975(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m17947(@Yue.InterfaceC4410 java.util.List<Yue.C4424> r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2c
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r3.next()
            Yue.ۥۡۢۥۦ r1 = (Yue.C4424) r1
            android.app.NotificationChannel r1 = r1.m17346()
            r0.add(r1)
            goto L13
        L27:
            android.app.NotificationManager r3 = r2.f14449
            Yue.C4517.C4520.m17975(r3, r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m17948(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            Yue.C4517.C4520.m17976(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m17949(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            Yue.C4517.C4520.m17977(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m17950(@Yue.InterfaceC4410 java.util.Collection<java.lang.String> r5) {
            r4 = this;
            android.app.NotificationManager r0 = r4.f14449
            java.util.List r0 = Yue.C4517.C4520.m17982(r0)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            android.app.NotificationChannel r1 = (android.app.NotificationChannel) r1
            java.lang.String r2 = Yue.C4517.C4520.m17978(r1)
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L21
            goto La
        L21:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 < r3) goto L32
            java.lang.String r2 = Yue.C4517.C4522.m17985(r1)
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L32
            goto La
        L32:
            android.app.NotificationManager r2 = r4.f14449
            java.lang.String r1 = Yue.C4517.C4520.m17978(r1)
            Yue.C4517.C4520.m17976(r2, r1)
            goto La
        L3c:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public java.util.List<android.service.notification.StatusBarNotification> m17951() {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            java.util.List r0 = Yue.C4517.C4518.m17968(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int m17952() {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            int r0 = Yue.C4517.C4518.m17969(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int m17953() {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            int r0 = Yue.C4517.C4519.m17971(r0)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.app.NotificationChannel m17954(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            android.app.NotificationChannel r2 = Yue.C4517.C4520.m17980(r0, r2)
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.app.NotificationChannel m17955(@Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4410 java.lang.String r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.f14449
            android.app.NotificationChannel r3 = Yue.C4517.C4522.m17984(r0, r3, r4)
            return r3
        Ld:
            android.app.NotificationChannel r3 = r2.m17954(r3)
            return r3
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Yue.C4424 m17956(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            android.app.NotificationChannel r2 = r1.m17954(r2)
            if (r2 == 0) goto Lc
            Yue.ۥۡۢۥۦ r0 = new Yue.ۥۡۢۥۦ
            r0.<init>(r2)
            return r0
        Lc:
            r2 = 0
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Yue.C4424 m17957(@Yue.InterfaceC4410 java.lang.String r1, @Yue.InterfaceC4410 java.lang.String r2) {
            r0 = this;
            android.app.NotificationChannel r1 = r0.m17955(r1, r2)
            if (r1 == 0) goto Lc
            Yue.ۥۡۢۥۦ r2 = new Yue.ۥۡۢۥۦ
            r2.<init>(r1)
            return r2
        Lc:
            r1 = 0
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public android.app.NotificationChannelGroup m17958(@Yue.InterfaceC4410 java.lang.String r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r3.f14449
            android.app.NotificationChannelGroup r4 = Yue.C4517.C4521.m17983(r0, r4)
            return r4
        Ld:
            java.util.List r0 = r3.m17960()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            android.app.NotificationChannelGroup r1 = (android.app.NotificationChannelGroup) r1
            java.lang.String r2 = Yue.C4517.C4520.m17979(r1)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L15
            return r1
        L2c:
            r4 = 0
            return r4
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Yue.C4429 m17959(@Yue.InterfaceC4410 java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L12
            android.app.NotificationChannelGroup r3 = r2.m17958(r3)
            if (r3 == 0) goto L22
            Yue.ۥۡۢۥۧ r0 = new Yue.ۥۡۢۥۧ
            r0.<init>(r3)
            return r0
        L12:
            android.app.NotificationChannelGroup r3 = r2.m17958(r3)
            if (r3 == 0) goto L22
            Yue.ۥۡۢۥۧ r0 = new Yue.ۥۡۢۥۧ
            java.util.List r1 = r2.m17962()
            r0.<init>(r3, r1)
            return r0
        L22:
            r3 = 0
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public java.util.List<android.app.NotificationChannelGroup> m17960() {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            java.util.List r0 = Yue.C4517.C4520.m17981(r0)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public java.util.List<Yue.C4429> m17961() {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            java.util.List r1 = r6.m17960()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L49
            r2 = 28
            if (r0 < r2) goto L15
            java.util.List r0 = java.util.Collections.emptyList()
            goto L19
        L15:
            java.util.List r0 = r6.m17962()
        L19:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.size()
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r1.next()
            android.app.NotificationChannelGroup r4 = (android.app.NotificationChannelGroup) r4
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L3f
            Yue.ۥۡۢۥۧ r5 = new Yue.ۥۡۢۥۧ
            r5.<init>(r4)
            r3.add(r5)
            goto L26
        L3f:
            Yue.ۥۡۢۥۧ r5 = new Yue.ۥۡۢۥۧ
            r5.<init>(r4, r0)
            r3.add(r5)
            goto L26
        L48:
            return r3
        L49:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public java.util.List<android.app.NotificationChannel> m17962() {
            r1 = this;
            android.app.NotificationManager r0 = r1.f14449
            java.util.List r0 = Yue.C4517.C4520.m17982(r0)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public java.util.List<Yue.C4424> m17963() {
            r4 = this;
            java.util.List r0 = r4.m17962()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r0.next()
            android.app.NotificationChannel r2 = (android.app.NotificationChannel) r2
            Yue.ۥۡۢۥۦ r3 = new Yue.ۥۡۢۥۦ
            r3.<init>(r2)
            r1.add(r3)
            goto L17
        L2c:
            return r1
        L2d:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    @Yue.InterfaceC5344("android.permission.POST_NOTIFICATIONS")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m17964(int r2, @Yue.InterfaceC4410 android.app.Notification r3) {
            r1 = this;
            r0 = 0
            r1.m17965(r0, r2, r3)
            return
    }

    @Yue.InterfaceC5344("android.permission.POST_NOTIFICATIONS")
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m17965(@Yue.InterfaceC4544 java.lang.String r3, int r4, @Yue.InterfaceC4410 android.app.Notification r5) {
            r2 = this;
            boolean r0 = m17934(r5)
            if (r0 == 0) goto L1a
            Yue.ۥۡۢۦۤ$ۥ۟۟۟ۤ r0 = new Yue.ۥۡۢۦۤ$ۥ۟۟۟ۤ
            android.content.Context r1 = r2.f14448
            java.lang.String r1 = r1.getPackageName()
            r0.<init>(r1, r4, r3, r5)
            r2.m17967(r0)
            android.app.NotificationManager r5 = r2.f14449
            r5.cancel(r3, r4)
            goto L1f
        L1a:
            android.app.NotificationManager r0 = r2.f14449
            r0.notify(r3, r4, r5)
        L1f:
            return
    }

    @Yue.InterfaceC5344("android.permission.POST_NOTIFICATIONS")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m17966(@Yue.InterfaceC4410 java.util.List<Yue.C4517.C4526> r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            java.lang.Object r2 = r6.get(r1)
            Yue.ۥۡۢۦۤ$ۥۣ۟۟۟ r2 = (Yue.C4517.C4526) r2
            java.lang.String r3 = r2.f14454
            int r4 = r2.f14455
            android.app.Notification r2 = r2.f14456
            r5.m17965(r3, r4, r2)
            int r1 = r1 + 1
            goto L5
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m17967(Yue.C4517.InterfaceC4531 r4) {
            r3 = this;
            java.lang.Object r0 = Yue.C4517.f14434
            monitor-enter(r0)
            Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ r1 = Yue.C4517.f14435     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ r1 = new Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ     // Catch: java.lang.Throwable -> L15
            android.content.Context r2 = r3.f14448     // Catch: java.lang.Throwable -> L15
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            Yue.C4517.f14435 = r1     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r4 = move-exception
            goto L1e
        L17:
            Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ r1 = Yue.C4517.f14435     // Catch: java.lang.Throwable -> L15
            r1.m17995(r4)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r4
    }
}
