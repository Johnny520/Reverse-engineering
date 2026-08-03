package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5777 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f21250 = 1;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f21251 = 2;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f21252 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f21253 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC6959
    public static final java.lang.String f21254 = "com.android.launcher.action.INSTALL_SHORTCUT";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC6959
    public static final java.lang.String f21255 = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f21256 = 96;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f21257 = 48;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f21258 = "android.intent.extra.shortcut.ID";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile Yue.AbstractC5772<?> f21259 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile java.util.List<Yue.AbstractC5761> f21260 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.String f21261 = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final java.lang.String f21262 = "androidx.core.content.pm.shortcut_listener_impl";

    /* JADX INFO: renamed from: Yue.ۥۢ۟۠ۢ$ۥ, reason: contains not printable characters */
    public class C5778 extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.content.IntentSender f21263;

        public C5778(android.content.IntentSender r1) {
                r0 = this;
                r0.f21263 = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r7, android.content.Intent r8) {
                r6 = this;
                android.content.IntentSender r0 = r6.f21263     // Catch: android.content.IntentSender.SendIntentException -> La
                r4 = 0
                r5 = 0
                r2 = 0
                r3 = 0
                r1 = r7
                r0.sendIntent(r1, r2, r3, r4, r5)     // Catch: android.content.IntentSender.SendIntentException -> La
            La:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟۠ۢ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(25)
    public static class C5779 {
        public C5779() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.String m21611(@Yue.InterfaceC4410 java.util.List<android.content.pm.ShortcutInfo> r5) {
                java.util.Iterator r5 = r5.iterator()
                r0 = -1
                r1 = 0
            L6:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L24
                java.lang.Object r2 = r5.next()
                android.content.pm.ShortcutInfo r2 = (android.content.pm.ShortcutInfo) r2
                int r3 = r2.getRank()
                if (r3 <= r0) goto L6
                java.lang.String r0 = r2.getId()
                int r1 = r2.getRank()
                r4 = r1
                r1 = r0
                r0 = r4
                goto L6
            L24:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟۠ۢ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC5780 {
    }

    static {
            return
    }

    public C5777() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m21582(@Yue.InterfaceC4410 android.content.Context r5, @Yue.InterfaceC4410 java.util.List<Yue.C5766> r6) {
            r0 = 1
            java.util.List r1 = m21604(r6, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 > r3) goto Le
            m21584(r5, r1)
        Le:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L17:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r3.next()
            Yue.ۥۢ۟۟ۦ r4 = (Yue.C5766) r4
            android.content.pm.ShortcutInfo r4 = r4.m21545()
            r2.add(r4)
            goto L17
        L2b:
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r5.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r2 = r3.addDynamicShortcuts(r2)
            if (r2 != 0) goto L3b
            r5 = 0
            return r5
        L3b:
            Yue.ۥۢ۟۠ r2 = m21596(r5)
            r2.mo21572(r1)
            java.util.List r5 = m21595(r5)
            java.util.Iterator r5 = r5.iterator()
        L4a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r5.next()
            Yue.ۥۢ۟۟ۡ r1 = (Yue.AbstractC5761) r1
            r1.m21504(r6)
            goto L4a
        L5a:
            return r0
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m21583(@Yue.InterfaceC4410 android.content.Context r6, @Yue.InterfaceC4410 Yue.C5766 r7) {
            androidx.core.graphics.drawable.IconCompat r0 = r7.f21225
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r0.f28993
            r3 = 1
            r4 = 6
            if (r2 == r4) goto L10
            r5 = 4
            if (r2 == r5) goto L10
            return r3
        L10:
            java.io.InputStream r6 = r0.m28856(r6)
            if (r6 != 0) goto L17
            return r1
        L17:
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)
            if (r6 != 0) goto L1e
            return r1
        L1e:
            if (r2 != r4) goto L25
            androidx.core.graphics.drawable.IconCompat r6 = androidx.core.graphics.drawable.IconCompat.m28836(r6)
            goto L29
        L25:
            androidx.core.graphics.drawable.IconCompat r6 = androidx.core.graphics.drawable.IconCompat.m28839(r6)
        L29:
            r7.f21225 = r6
            return r3
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m21584(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 java.util.List<Yue.C5766> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            Yue.ۥۢ۟۟ۦ r1 = (Yue.C5766) r1
            boolean r2 = m21583(r3, r1)
            if (r2 != 0) goto L9
            r4.remove(r1)
            goto L9
        L1f:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static android.content.Intent m21585(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 Yue.C5766 r2) {
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            android.content.pm.ShortcutInfo r0 = r2.m21545()
            android.content.Intent r1 = r1.createShortcutResultIntent(r0)
            if (r1 != 0) goto L17
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
        L17:
            android.content.Intent r1 = r2.m21517(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m21586(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 java.util.List<java.lang.String> r2, @Yue.InterfaceC4544 java.lang.CharSequence r3) {
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.disableShortcuts(r2, r3)
            Yue.ۥۢ۟۠ r3 = m21596(r1)
            r3.mo21575(r2)
            java.util.List r1 = m21595(r1)
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()
            Yue.ۥۢ۟۟ۡ r3 = (Yue.AbstractC5761) r3
            r3.m21505(r2)
            goto L1a
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m21587(@Yue.InterfaceC4410 android.content.Context r4, @Yue.InterfaceC4410 java.util.List<Yue.C5766> r5) {
            r0 = 1
            java.util.List r0 = m21604(r5, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r5.size()
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()
            Yue.ۥۢ۟۟ۦ r3 = (Yue.C5766) r3
            java.lang.String r3 = r3.f21218
            r1.add(r3)
            goto L12
        L24:
            java.lang.Class<android.content.pm.ShortcutManager> r2 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r4.getSystemService(r2)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            r2.enableShortcuts(r1)
            Yue.ۥۢ۟۠ r1 = m21596(r4)
            r1.mo21572(r0)
            java.util.List r4 = m21595(r4)
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r4.next()
            Yue.ۥۢ۟۟ۡ r0 = (Yue.AbstractC5761) r0
            r0.m21504(r5)
            goto L3e
        L4e:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.util.List<Yue.C5766> m21588(@Yue.InterfaceC4410 android.content.Context r4) {
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r4.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.List r0 = r0.getDynamicShortcuts()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            android.content.pm.ShortcutInfo r2 = (android.content.pm.ShortcutInfo) r2
            Yue.ۥۢ۟۟ۦ$ۥ۟ r3 = new Yue.ۥۢ۟۟ۦ$ۥ۟
            r3.<init>(r4, r2)
            Yue.ۥۢ۟۟ۦ r2 = r3.m21549()
            r1.add(r2)
            goto L19
        L32:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int m21589(@Yue.InterfaceC4410 android.content.Context r2, boolean r3) {
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r1 = 1
            if (r0 == 0) goto L14
            boolean r0 = r0.isLowRamDevice()
            if (r0 == 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L1a
            r0 = 48
            goto L1c
        L1a:
            r0 = 96
        L1c:
            int r0 = java.lang.Math.max(r1, r0)
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            if (r3 == 0) goto L2d
            float r2 = r2.xdpi
            goto L2f
        L2d:
            float r2 = r2.ydpi
        L2f:
            r3 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 / r3
            float r3 = (float) r0
            float r3 = r3 * r2
            int r2 = (int) r3
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static int m21590(@Yue.InterfaceC4410 android.content.Context r1) {
            Yue.C4868.m19181(r1)
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            int r1 = r1.getIconMaxHeight()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m21591(@Yue.InterfaceC4410 android.content.Context r1) {
            Yue.C4868.m19181(r1)
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            int r1 = r1.getIconMaxWidth()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m21592(@Yue.InterfaceC4410 android.content.Context r1) {
            Yue.C4868.m19181(r1)
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            int r1 = r1.getMaxShortcutCountPerActivity()
            return r1
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static java.util.List<Yue.AbstractC5761> m21593() {
            java.util.List<Yue.ۥۢ۟۟ۡ> r0 = Yue.C5777.f21260
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static java.lang.String m21594(@Yue.InterfaceC4410 java.util.List<Yue.C5766> r5) {
            java.util.Iterator r5 = r5.iterator()
            r0 = -1
            r1 = 0
        L6:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r5.next()
            Yue.ۥۢ۟۟ۦ r2 = (Yue.C5766) r2
            int r3 = r2.m21533()
            if (r3 <= r0) goto L6
            java.lang.String r0 = r2.m21526()
            int r1 = r2.m21533()
            r4 = r1
            r1 = r0
            r0 = r4
            goto L6
        L24:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static java.util.List<Yue.AbstractC5761> m21595(android.content.Context r5) {
            java.util.List<Yue.ۥۢ۟۟ۡ> r0 = Yue.C5777.f21260
            if (r0 != 0) goto L70
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.core.content.pm.SHORTCUT_LISTENER"
            r2.<init>(r3)
            java.lang.String r3 = r5.getPackageName()
            r2.setPackage(r3)
            r3 = 128(0x80, float:1.8E-43)
            java.util.List r1 = r1.queryIntentActivities(r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r1.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            if (r2 != 0) goto L36
            goto L25
        L36:
            android.os.Bundle r2 = r2.metaData
            if (r2 != 0) goto L3b
            goto L25
        L3b:
            java.lang.String r3 = "androidx.core.content.pm.shortcut_listener_impl"
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L44
            goto L25
        L44:
            java.lang.Class<Yue.ۥۢ۟۠ۢ> r3 = Yue.C5777.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L25
            r4 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch: java.lang.Exception -> L25
            java.lang.String r3 = "getInstance"
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Exception -> L25
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.Exception -> L25
            java.lang.Object[] r3 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L25
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L25
            Yue.ۥۢ۟۟ۡ r2 = (Yue.AbstractC5761) r2     // Catch: java.lang.Exception -> L25
            r0.add(r2)     // Catch: java.lang.Exception -> L25
            goto L25
        L6a:
            java.util.List<Yue.ۥۢ۟۟ۡ> r5 = Yue.C5777.f21260
            if (r5 != 0) goto L70
            Yue.C5777.f21260 = r0
        L70:
            java.util.List<Yue.ۥۢ۟۟ۡ> r5 = Yue.C5777.f21260
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static Yue.AbstractC5772<?> m21596(android.content.Context r3) {
            Yue.ۥۢ۟۠<?> r0 = Yue.C5777.f21259
            if (r0 != 0) goto L35
            java.lang.Class<Yue.ۥۢ۟۠ۢ> r0 = Yue.C5777.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = "androidx.sharetarget.ShortcutInfoCompatSaverImpl"
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r2, r0)     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = "getInstance"
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L2a
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L2a
            r1 = 0
            java.lang.Object r3 = r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L2a
            Yue.ۥۢ۟۠ r3 = (Yue.AbstractC5772) r3     // Catch: java.lang.Exception -> L2a
            Yue.C5777.f21259 = r3     // Catch: java.lang.Exception -> L2a
        L2a:
            Yue.ۥۢ۟۠<?> r3 = Yue.C5777.f21259
            if (r3 != 0) goto L35
            Yue.ۥۢ۟۠$ۥ r3 = new Yue.ۥۢ۟۠$ۥ
            r3.<init>()
            Yue.C5777.f21259 = r3
        L35:
            Yue.ۥۢ۟۠<?> r3 = Yue.C5777.f21259
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static java.util.List<Yue.C5766> m21597(@Yue.InterfaceC4410 android.content.Context r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            java.lang.Class<android.content.pm.ShortcutManager> r2 = android.content.pm.ShortcutManager.class
            if (r0 < r1) goto L17
            java.lang.Object r0 = r3.getSystemService(r2)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.List r4 = Yue.C5776.m21581(r0, r4)
            java.util.List r3 = Yue.C5766.m21512(r3, r4)
            return r3
        L17:
            java.lang.Object r0 = r3.getSystemService(r2)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r4 & 1
            if (r2 == 0) goto L2d
            java.util.List r2 = r0.getManifestShortcuts()
            r1.addAll(r2)
        L2d:
            r2 = r4 & 2
            if (r2 == 0) goto L38
            java.util.List r2 = r0.getDynamicShortcuts()
            r1.addAll(r2)
        L38:
            r4 = r4 & 4
            if (r4 == 0) goto L43
            java.util.List r4 = r0.getPinnedShortcuts()
            r1.addAll(r4)
        L43:
            java.util.List r3 = Yue.C5766.m21512(r3, r1)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static boolean m21598(@Yue.InterfaceC4410 android.content.Context r1) {
            Yue.C4868.m19181(r1)
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            boolean r1 = r1.isRateLimitingActive()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m21599(@Yue.InterfaceC4410 android.content.Context r1) {
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            boolean r1 = r1.isRequestPinShortcutSupported()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static boolean m21600(@Yue.InterfaceC4410 android.content.Context r6, @Yue.InterfaceC4410 Yue.C5766 r7) {
            Yue.C4868.m19181(r6)
            Yue.C4868.m19181(r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            r2 = 1
            if (r0 > r1) goto L30
            boolean r1 = r7.m21542(r2)
            if (r1 == 0) goto L30
            java.util.List r6 = m21595(r6)
            java.util.Iterator r6 = r6.iterator()
        L1b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r6.next()
            Yue.ۥۢ۟۟ۡ r0 = (Yue.AbstractC5761) r0
            java.util.List r1 = java.util.Collections.singletonList(r7)
            r0.m21504(r1)
            goto L1b
        L2f:
            return r2
        L30:
            int r1 = m21592(r6)
            r3 = 0
            if (r1 != 0) goto L38
            return r3
        L38:
            r4 = 29
            if (r0 > r4) goto L3f
            m21583(r6, r7)
        L3f:
            r4 = 30
            java.lang.Class<android.content.pm.ShortcutManager> r5 = android.content.pm.ShortcutManager.class
            if (r0 < r4) goto L53
            java.lang.Object r0 = r6.getSystemService(r5)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            android.content.pm.ShortcutInfo r4 = r7.m21545()
            Yue.C5775.m21580(r0, r4)
            goto L88
        L53:
            java.lang.Object r0 = r6.getSystemService(r5)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r4 = r0.isRateLimitingActive()
            if (r4 == 0) goto L60
            return r3
        L60:
            java.util.List r4 = r0.getDynamicShortcuts()
            int r5 = r4.size()
            if (r5 < r1) goto L79
            java.lang.String r4 = Yue.C5777.C5779.m21611(r4)
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.removeDynamicShortcuts(r4)
        L79:
            android.content.pm.ShortcutInfo r4 = r7.m21545()
            android.content.pm.ShortcutInfo[] r4 = new android.content.pm.ShortcutInfo[]{r4}
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.addDynamicShortcuts(r4)
        L88:
            Yue.ۥۢ۟۠ r0 = m21596(r6)
            java.util.List r4 = r0.m21573()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lfb
            int r5 = r4.size()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lfb
            if (r5 < r1) goto La8
            java.lang.String r1 = m21594(r4)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lfb
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lfb
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lfb
            r0.mo21575(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lfb
            goto La8
        La6:
            r0 = move-exception
            goto Ld7
        La8:
            Yue.ۥۢ۟۟ۦ[] r1 = new Yue.C5766[]{r7}     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lfb
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lfb
            r0.mo21572(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lfb
            java.util.List r0 = m21595(r6)
            java.util.Iterator r0 = r0.iterator()
        Lbb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lcf
            java.lang.Object r1 = r0.next()
            Yue.ۥۢ۟۟ۡ r1 = (Yue.AbstractC5761) r1
            java.util.List r3 = java.util.Collections.singletonList(r7)
            r1.m21504(r3)
            goto Lbb
        Lcf:
            java.lang.String r7 = r7.m21526()
            m21605(r6, r7)
            return r2
        Ld7:
            java.util.List r1 = m21595(r6)
            java.util.Iterator r1 = r1.iterator()
        Ldf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf3
            java.lang.Object r2 = r1.next()
            Yue.ۥۢ۟۟ۡ r2 = (Yue.AbstractC5761) r2
            java.util.List r3 = java.util.Collections.singletonList(r7)
            r2.m21504(r3)
            goto Ldf
        Lf3:
            java.lang.String r7 = r7.m21526()
            m21605(r6, r7)
            throw r0
        Lfb:
            java.util.List r0 = m21595(r6)
            java.util.Iterator r0 = r0.iterator()
        L103:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L117
            java.lang.Object r1 = r0.next()
            Yue.ۥۢ۟۟ۡ r1 = (Yue.AbstractC5761) r1
            java.util.List r2 = java.util.Collections.singletonList(r7)
            r1.m21504(r2)
            goto L103
        L117:
            java.lang.String r7 = r7.m21526()
            m21605(r6, r7)
            return r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m21601(@Yue.InterfaceC4410 android.content.Context r1) {
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeAllDynamicShortcuts()
            Yue.ۥۢ۟۠ r0 = m21596(r1)
            r0.mo21574()
            java.util.List r1 = m21595(r1)
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r1.next()
            Yue.ۥۢ۟۟ۡ r0 = (Yue.AbstractC5761) r0
            r0.m21503()
            goto L1a
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static void m21602(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 java.util.List<java.lang.String> r2) {
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeDynamicShortcuts(r2)
            Yue.ۥۢ۟۠ r0 = m21596(r1)
            r0.mo21575(r2)
            java.util.List r1 = m21595(r1)
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r1.next()
            Yue.ۥۢ۟۟ۡ r0 = (Yue.AbstractC5761) r0
            r0.m21505(r2)
            goto L1a
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static void m21603(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 java.util.List<java.lang.String> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto La
            m21602(r2, r3)
            return
        La:
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            Yue.C5774.m21579(r0, r3)
            Yue.ۥۢ۟۠ r0 = m21596(r2)
            r0.mo21575(r3)
            java.util.List r2 = m21595(r2)
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.next()
            Yue.ۥۢ۟۟ۡ r0 = (Yue.AbstractC5761) r0
            r0.m21505(r3)
            goto L24
        L34:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static java.util.List<Yue.C5766> m21604(@Yue.InterfaceC4410 java.util.List<Yue.C5766> r3, int r4) {
            java.util.Objects.requireNonNull(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 <= r1) goto La
            return r3
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            Yue.ۥۢ۟۟ۦ r1 = (Yue.C5766) r1
            boolean r2 = r1.m21542(r4)
            if (r2 == 0) goto L13
            r0.remove(r1)
            goto L13
        L29:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static void m21605(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 java.lang.String r3) {
            Yue.C4868.m19181(r2)
            Yue.C4868.m19181(r3)
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.reportShortcutUsed(r3)
            java.util.List r2 = m21595(r2)
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.next()
            Yue.ۥۢ۟۟ۡ r0 = (Yue.AbstractC5761) r0
            java.util.List r1 = java.util.Collections.singletonList(r3)
            r0.m21507(r1)
            goto L19
        L2d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static boolean m21606(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 Yue.C5766 r3, @Yue.InterfaceC4544 android.content.IntentSender r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 > r1) goto Lf
            r0 = 1
            boolean r0 = r3.m21542(r0)
            if (r0 == 0) goto Lf
            r2 = 0
            return r2
        Lf:
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            android.content.pm.ShortcutInfo r3 = r3.m21545()
            boolean r2 = r2.requestPinShortcut(r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static boolean m21607(@Yue.InterfaceC4410 android.content.Context r5, @Yue.InterfaceC4410 java.util.List<Yue.C5766> r6) {
            Yue.C4868.m19181(r5)
            Yue.C4868.m19181(r6)
            r0 = 1
            java.util.List r1 = m21604(r6, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L18:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r3.next()
            Yue.ۥۢ۟۟ۦ r4 = (Yue.C5766) r4
            android.content.pm.ShortcutInfo r4 = r4.m21545()
            r2.add(r4)
            goto L18
        L2c:
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r5.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r2 = r3.setDynamicShortcuts(r2)
            if (r2 != 0) goto L3c
            r5 = 0
            return r5
        L3c:
            Yue.ۥۢ۟۠ r2 = m21596(r5)
            r2.mo21574()
            Yue.ۥۢ۟۠ r2 = m21596(r5)
            r2.mo21572(r1)
            java.util.List r5 = m21595(r5)
            java.util.Iterator r5 = r5.iterator()
        L52:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r5.next()
            Yue.ۥۢ۟۟ۡ r1 = (Yue.AbstractC5761) r1
            r1.m21503()
            r1.m21504(r6)
            goto L52
        L65:
            return r0
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static void m21608(java.util.List<Yue.AbstractC5761> r0) {
            Yue.C5777.f21260 = r0
            return
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static void m21609(Yue.AbstractC5772<java.lang.Void> r0) {
            Yue.C5777.f21259 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static boolean m21610(@Yue.InterfaceC4410 android.content.Context r5, @Yue.InterfaceC4410 java.util.List<Yue.C5766> r6) {
            r0 = 1
            java.util.List r1 = m21604(r6, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 > r3) goto Le
            m21584(r5, r1)
        Le:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L17:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r3.next()
            Yue.ۥۢ۟۟ۦ r4 = (Yue.C5766) r4
            android.content.pm.ShortcutInfo r4 = r4.m21545()
            r2.add(r4)
            goto L17
        L2b:
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r5.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r2 = r3.updateShortcuts(r2)
            if (r2 != 0) goto L3b
            r5 = 0
            return r5
        L3b:
            Yue.ۥۢ۟۠ r2 = m21596(r5)
            r2.mo21572(r1)
            java.util.List r5 = m21595(r5)
            java.util.Iterator r5 = r5.iterator()
        L4a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r5.next()
            Yue.ۥۢ۟۟ۡ r1 = (Yue.AbstractC5761) r1
            r1.m21506(r6)
            goto L4a
        L5a:
            return r0
    }
}
