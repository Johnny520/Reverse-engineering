package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7065 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f24589 = "WindowInsetsCompat";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public static final Yue.C7065 f24590 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C7065.C7077 f24591;

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    public static class C7066 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.reflect.Field f24592;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.lang.reflect.Field f24593;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static java.lang.reflect.Field f24594;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean f24595;

        static {
                java.lang.Class<android.view.View> r0 = android.view.View.class
                java.lang.String r1 = "mAttachInfo"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                Yue.C7065.C7066.f24592 = r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r0 = "android.view.View$AttachInfo"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r2 = "mStableInsets"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L2d
                Yue.C7065.C7066.f24593 = r2     // Catch: java.lang.ReflectiveOperationException -> L2d
                r2.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r2 = "mContentInsets"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L2d
                Yue.C7065.C7066.f24594 = r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                r0.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                Yue.C7065.C7066.f24595 = r1     // Catch: java.lang.ReflectiveOperationException -> L2d
                goto L48
            L2d:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to get visible insets from AttachInfo "
                r1.append(r2)
                java.lang.String r2 = r0.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "WindowInsetsCompat"
                android.util.Log.w(r2, r1, r0)
            L48:
                return
        }

        public C7066() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static Yue.C7065 m27313(@Yue.InterfaceC4410 android.view.View r4) {
                boolean r0 = Yue.C7065.C7066.f24595
                r1 = 0
                if (r0 == 0) goto L6b
                boolean r0 = r4.isAttachedToWindow()
                if (r0 != 0) goto Lc
                goto L6b
            Lc:
                android.view.View r0 = r4.getRootView()
                java.lang.reflect.Field r2 = Yue.C7065.C7066.f24592     // Catch: java.lang.IllegalAccessException -> L50
                java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L50
                if (r0 == 0) goto L6b
                java.lang.reflect.Field r2 = Yue.C7065.C7066.f24593     // Catch: java.lang.IllegalAccessException -> L50
                java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L50
                android.graphics.Rect r2 = (android.graphics.Rect) r2     // Catch: java.lang.IllegalAccessException -> L50
                java.lang.reflect.Field r3 = Yue.C7065.C7066.f24594     // Catch: java.lang.IllegalAccessException -> L50
                java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.IllegalAccessException -> L50
                android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch: java.lang.IllegalAccessException -> L50
                if (r2 == 0) goto L6b
                if (r0 == 0) goto L6b
                Yue.ۥۢۥۦ$ۥ۟ r3 = new Yue.ۥۢۥۦ$ۥ۟     // Catch: java.lang.IllegalAccessException -> L50
                r3.<init>()     // Catch: java.lang.IllegalAccessException -> L50
                Yue.ۥ۠ۥۣۡ r2 = Yue.C3267.m13727(r2)     // Catch: java.lang.IllegalAccessException -> L50
                Yue.ۥۢۥۦ$ۥ۟ r2 = r3.m27319(r2)     // Catch: java.lang.IllegalAccessException -> L50
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.m13727(r0)     // Catch: java.lang.IllegalAccessException -> L50
                Yue.ۥۢۥۦ$ۥ۟ r0 = r2.m27321(r0)     // Catch: java.lang.IllegalAccessException -> L50
                Yue.ۥۢۥۦ r0 = r0.m27314()     // Catch: java.lang.IllegalAccessException -> L50
                r0.m27310(r0)     // Catch: java.lang.IllegalAccessException -> L50
                android.view.View r4 = r4.getRootView()     // Catch: java.lang.IllegalAccessException -> L50
                r0.m27281(r4)     // Catch: java.lang.IllegalAccessException -> L50
                return r0
            L50:
                r4 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Failed to get insets from AttachInfo. "
                r0.append(r2)
                java.lang.String r2 = r4.getMessage()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "WindowInsetsCompat"
                android.util.Log.w(r2, r0, r4)
            L6b:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟, reason: contains not printable characters */
    public static final class C7067 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C7065.C7071 f24596;

        public C7067() {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto L11
                Yue.ۥۢۥۦ$ۥ۟۟۟۟ r0 = new Yue.ۥۢۥۦ$ۥ۟۟۟۟
                r0.<init>()
                r2.f24596 = r0
                goto L24
            L11:
                r1 = 29
                if (r0 < r1) goto L1d
                Yue.ۥۢۥۦ$ۥ۟۟۟ r0 = new Yue.ۥۢۥۦ$ۥ۟۟۟
                r0.<init>()
                r2.f24596 = r0
                goto L24
            L1d:
                Yue.ۥۢۥۦ$ۥ۟۟ r0 = new Yue.ۥۢۥۦ$ۥ۟۟
                r0.<init>()
                r2.f24596 = r0
            L24:
                return
        }

        public C7067(@Yue.InterfaceC4410 Yue.C7065 r3) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto L11
                Yue.ۥۢۥۦ$ۥ۟۟۟۟ r0 = new Yue.ۥۢۥۦ$ۥ۟۟۟۟
                r0.<init>(r3)
                r2.f24596 = r0
                goto L24
            L11:
                r1 = 29
                if (r0 < r1) goto L1d
                Yue.ۥۢۥۦ$ۥ۟۟۟ r0 = new Yue.ۥۢۥۦ$ۥ۟۟۟
                r0.<init>(r3)
                r2.f24596 = r0
                goto L24
            L1d:
                Yue.ۥۢۥۦ$ۥ۟۟ r0 = new Yue.ۥۢۥۦ$ۥ۟۟
                r0.<init>(r3)
                r2.f24596 = r0
            L24:
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C7065 m27314() {
                r1 = this;
                Yue.ۥۢۥۦ$ۥ۟۟۟۠ r0 = r1.f24596
                Yue.ۥۢۥۦ r0 = r0.mo27325()
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C7065.C7067 m27315(@Yue.InterfaceC4544 Yue.C1886 r2) {
                r1 = this;
                Yue.ۥۢۥۦ$ۥ۟۟۟۠ r0 = r1.f24596
                r0.mo27328(r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C7065.C7067 m27316(int r2, @Yue.InterfaceC4410 Yue.C3267 r3) {
                r1 = this;
                Yue.ۥۢۥۦ$ۥ۟۟۟۠ r0 = r1.f24596
                r0.mo27332(r2, r3)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.C7065.C7067 m27317(int r2, @Yue.InterfaceC4410 Yue.C3267 r3) {
                r1 = this;
                Yue.ۥۢۥۦ$ۥ۟۟۟۠ r0 = r1.f24596
                r0.mo27333(r2, r3)
                return r1
        }

        @Yue.InterfaceC4410
        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Yue.C7065.C7067 m27318(@Yue.InterfaceC4410 Yue.C3267 r2) {
                r1 = this;
                Yue.ۥۢۥۦ$ۥ۟۟۟۠ r0 = r1.f24596
                r0.mo27329(r2)
                return r1
        }

        @Yue.InterfaceC4410
        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Yue.C7065.C7067 m27319(@Yue.InterfaceC4410 Yue.C3267 r2) {
                r1 = this;
                Yue.ۥۢۥۦ$ۥ۟۟۟۠ r0 = r1.f24596
                r0.mo27326(r2)
                return r1
        }

        @Yue.InterfaceC4410
        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Yue.C7065.C7067 m27320(@Yue.InterfaceC4410 Yue.C3267 r2) {
                r1 = this;
                Yue.ۥۢۥۦ$ۥ۟۟۟۠ r0 = r1.f24596
                r0.mo27330(r2)
                return r1
        }

        @Yue.InterfaceC4410
        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public Yue.C7065.C7067 m27321(@Yue.InterfaceC4410 Yue.C3267 r2) {
                r1 = this;
                Yue.ۥۢۥۦ$ۥ۟۟۟۠ r0 = r1.f24596
                r0.mo27327(r2)
                return r1
        }

        @Yue.InterfaceC4410
        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public Yue.C7065.C7067 m27322(@Yue.InterfaceC4410 Yue.C3267 r2) {
                r1 = this;
                Yue.ۥۢۥۦ$ۥ۟۟۟۠ r0 = r1.f24596
                r0.mo27331(r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public Yue.C7065.C7067 m27323(int r2, boolean r3) {
                r1 = this;
                Yue.ۥۢۥۦ$ۥ۟۟۟۠ r0 = r1.f24596
                r0.mo27334(r2, r3)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(api = 20)
    public static class C7068 extends Yue.C7065.C7071 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static java.lang.reflect.Field f24597;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean f24598;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static java.lang.reflect.Constructor<android.view.WindowInsets> f24599;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static boolean f24600;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.view.WindowInsets f24601;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.C3267 f24602;

        static {
                return
        }

        public C7068() {
                r1 = this;
                r1.<init>()
                android.view.WindowInsets r0 = m27324()
                r1.f24601 = r0
                return
        }

        public C7068(@Yue.InterfaceC4410 Yue.C7065 r1) {
                r0 = this;
                r0.<init>(r1)
                android.view.WindowInsets r1 = r1.m27312()
                r0.f24601 = r1
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        private static android.view.WindowInsets m27324() {
                boolean r0 = Yue.C7065.C7068.f24598
                r1 = 1
                java.lang.Class<android.view.WindowInsets> r2 = android.view.WindowInsets.class
                java.lang.String r3 = "WindowInsetsCompat"
                if (r0 != 0) goto L1a
                java.lang.String r0 = "CONSUMED"
                java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.ReflectiveOperationException -> L12
                Yue.C7065.C7068.f24597 = r0     // Catch: java.lang.ReflectiveOperationException -> L12
                goto L18
            L12:
                r0 = move-exception
                java.lang.String r4 = "Could not retrieve WindowInsets.CONSUMED field"
                android.util.Log.i(r3, r4, r0)
            L18:
                Yue.C7065.C7068.f24598 = r1
            L1a:
                java.lang.reflect.Field r0 = Yue.C7065.C7068.f24597
                r4 = 0
                if (r0 == 0) goto L33
                java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.ReflectiveOperationException -> L2d
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                if (r0 == 0) goto L33
                android.view.WindowInsets r5 = new android.view.WindowInsets     // Catch: java.lang.ReflectiveOperationException -> L2d
                r5.<init>(r0)     // Catch: java.lang.ReflectiveOperationException -> L2d
                return r5
            L2d:
                r0 = move-exception
                java.lang.String r5 = "Could not get value from WindowInsets.CONSUMED field"
                android.util.Log.i(r3, r5, r0)
            L33:
                boolean r0 = Yue.C7065.C7068.f24600
                if (r0 != 0) goto L4c
                java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
                java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.ReflectiveOperationException -> L44
                java.lang.reflect.Constructor r0 = r2.getConstructor(r0)     // Catch: java.lang.ReflectiveOperationException -> L44
                Yue.C7065.C7068.f24599 = r0     // Catch: java.lang.ReflectiveOperationException -> L44
                goto L4a
            L44:
                r0 = move-exception
                java.lang.String r2 = "Could not retrieve WindowInsets(Rect) constructor"
                android.util.Log.i(r3, r2, r0)
            L4a:
                Yue.C7065.C7068.f24600 = r1
            L4c:
                java.lang.reflect.Constructor<android.view.WindowInsets> r0 = Yue.C7065.C7068.f24599
                if (r0 == 0) goto L66
                android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.ReflectiveOperationException -> L60
                r1.<init>()     // Catch: java.lang.ReflectiveOperationException -> L60
                java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.ReflectiveOperationException -> L60
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.ReflectiveOperationException -> L60
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L60
                return r0
            L60:
                r0 = move-exception
                java.lang.String r1 = "Could not invoke WindowInsets(Rect) constructor"
                android.util.Log.i(r3, r1, r0)
            L66:
                return r4
        }

        @Override // Yue.C7065.C7071
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C7065 mo27325() {
                r2 = this;
                r2.m27335()
                android.view.WindowInsets r0 = r2.f24601
                Yue.ۥۢۥۦ r0 = Yue.C7065.m27276(r0)
                Yue.ۥ۠ۥۣۡ[] r1 = r2.f24605
                r0.m27308(r1)
                Yue.ۥ۠ۥۣۡ r1 = r2.f24602
                r0.m27311(r1)
                return r0
        }

        @Override // Yue.C7065.C7071
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void mo27326(@Yue.InterfaceC4544 Yue.C3267 r1) {
                r0 = this;
                r0.f24602 = r1
                return
        }

        @Override // Yue.C7065.C7071
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void mo27327(@Yue.InterfaceC4410 Yue.C3267 r5) {
                r4 = this;
                android.view.WindowInsets r0 = r4.f24601
                if (r0 == 0) goto L12
                int r1 = r5.f10681
                int r2 = r5.f10682
                int r3 = r5.f10683
                int r5 = r5.f10684
                android.view.WindowInsets r5 = r0.replaceSystemWindowInsets(r1, r2, r3, r5)
                r4.f24601 = r5
            L12:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(api = 29)
    public static class C7069 extends Yue.C7065.C7071 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.view.WindowInsets.Builder f24603;

        public C7069() {
                r1 = this;
                r1.<init>()
                android.view.WindowInsets$Builder r0 = Yue.C7089.m27383()
                r1.f24603 = r0
                return
        }

        public C7069(@Yue.InterfaceC4410 Yue.C7065 r1) {
                r0 = this;
                r0.<init>(r1)
                android.view.WindowInsets r1 = r1.m27312()
                if (r1 == 0) goto Le
                android.view.WindowInsets$Builder r1 = Yue.C7088.m27382(r1)
                goto L12
            Le:
                android.view.WindowInsets$Builder r1 = Yue.C7089.m27383()
            L12:
                r0.f24603 = r1
                return
        }

        @Override // Yue.C7065.C7071
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟ */
        public Yue.C7065 mo27325() {
                r2 = this;
                r2.m27335()
                android.view.WindowInsets$Builder r0 = r2.f24603
                android.view.WindowInsets r0 = Yue.C7084.m27378(r0)
                Yue.ۥۢۥۦ r0 = Yue.C7065.m27276(r0)
                Yue.ۥ۠ۥۣۡ[] r1 = r2.f24605
                r0.m27308(r1)
                return r0
        }

        @Override // Yue.C7065.C7071
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo27328(@Yue.InterfaceC4544 Yue.C1886 r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.f24603
                if (r2 == 0) goto L9
                android.view.DisplayCutout r2 = r2.m8828()
                goto La
            L9:
                r2 = 0
            La:
                Yue.C7087.m27381(r0, r2)
                return
        }

        @Override // Yue.C7065.C7071
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void mo27329(@Yue.InterfaceC4410 Yue.C3267 r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.f24603
                android.graphics.Insets r2 = r2.m13731()
                Yue.C7085.m27379(r0, r2)
                return
        }

        @Override // Yue.C7065.C7071
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo27326(@Yue.InterfaceC4410 Yue.C3267 r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.f24603
                android.graphics.Insets r2 = r2.m13731()
                Yue.C7082.m27376(r0, r2)
                return
        }

        @Override // Yue.C7065.C7071
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo27330(@Yue.InterfaceC4410 Yue.C3267 r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.f24603
                android.graphics.Insets r2 = r2.m13731()
                Yue.C7083.m27377(r0, r2)
                return
        }

        @Override // Yue.C7065.C7071
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo27327(@Yue.InterfaceC4410 Yue.C3267 r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.f24603
                android.graphics.Insets r2 = r2.m13731()
                Yue.C7081.m27375(r0, r2)
                return
        }

        @Override // Yue.C7065.C7071
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void mo27331(@Yue.InterfaceC4410 Yue.C3267 r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.f24603
                android.graphics.Insets r2 = r2.m13731()
                Yue.C7086.m27380(r0, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C7070 extends Yue.C7065.C7069 {
        public C7070() {
                r0 = this;
                r0.<init>()
                return
        }

        public C7070(@Yue.InterfaceC4410 Yue.C7065 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.C7065.C7071
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo27332(int r2, @Yue.InterfaceC4410 Yue.C3267 r3) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.f24603
                int r2 = Yue.C7065.C7080.m27374(r2)
                android.graphics.Insets r3 = r3.m13731()
                Yue.C7090.m27384(r0, r2, r3)
                return
        }

        @Override // Yue.C7065.C7071
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo27333(int r2, @Yue.InterfaceC4410 Yue.C3267 r3) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.f24603
                int r2 = Yue.C7065.C7080.m27374(r2)
                android.graphics.Insets r3 = r3.m13731()
                Yue.C7092.m27386(r0, r2, r3)
                return
        }

        @Override // Yue.C7065.C7071
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void mo27334(int r2, boolean r3) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.f24603
                int r2 = Yue.C7065.C7080.m27374(r2)
                Yue.C7091.m27385(r0, r2, r3)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C7071 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C7065 f24604;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C3267[] f24605;

        public C7071() {
                r2 = this;
                Yue.ۥۢۥۦ r0 = new Yue.ۥۢۥۦ
                r1 = 0
                r0.<init>(r1)
                r2.<init>(r0)
                return
        }

        public C7071(@Yue.InterfaceC4410 Yue.C7065 r1) {
                r0 = this;
                r0.<init>()
                r0.f24604 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m27335() {
                r5 = this;
                Yue.ۥ۠ۥۣۡ[] r0 = r5.f24605
                if (r0 == 0) goto L58
                r1 = 1
                int r2 = Yue.C7065.C7078.m27367(r1)
                r0 = r0[r2]
                Yue.ۥ۠ۥۣۡ[] r2 = r5.f24605
                r3 = 2
                int r4 = Yue.C7065.C7078.m27367(r3)
                r2 = r2[r4]
                if (r2 != 0) goto L1c
                Yue.ۥۢۥۦ r2 = r5.f24604
                Yue.ۥ۠ۥۣۡ r2 = r2.m27283(r3)
            L1c:
                if (r0 != 0) goto L24
                Yue.ۥۢۥۦ r0 = r5.f24604
                Yue.ۥ۠ۥۣۡ r0 = r0.m27283(r1)
            L24:
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.m13724(r0, r2)
                r5.mo27327(r0)
                Yue.ۥ۠ۥۣۡ[] r0 = r5.f24605
                r1 = 16
                int r1 = Yue.C7065.C7078.m27367(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L3a
                r5.mo27330(r0)
            L3a:
                Yue.ۥ۠ۥۣۡ[] r0 = r5.f24605
                r1 = 32
                int r1 = Yue.C7065.C7078.m27367(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L49
                r5.mo27329(r0)
            L49:
                Yue.ۥ۠ۥۣۡ[] r0 = r5.f24605
                r1 = 64
                int r1 = Yue.C7065.C7078.m27367(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L58
                r5.mo27331(r0)
            L58:
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟ */
        public Yue.C7065 mo27325() {
                r1 = this;
                r1.m27335()
                Yue.ۥۢۥۦ r0 = r1.f24604
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo27328(@Yue.InterfaceC4544 Yue.C1886 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo27332(int r4, @Yue.InterfaceC4410 Yue.C3267 r5) {
                r3 = this;
                Yue.ۥ۠ۥۣۡ[] r0 = r3.f24605
                if (r0 != 0) goto La
                r0 = 9
                Yue.ۥ۠ۥۣۡ[] r0 = new Yue.C3267[r0]
                r3.f24605 = r0
            La:
                r0 = 1
            Lb:
                r1 = 256(0x100, float:3.59E-43)
                if (r0 > r1) goto L1f
                r1 = r4 & r0
                if (r1 != 0) goto L14
                goto L1c
            L14:
                Yue.ۥ۠ۥۣۡ[] r1 = r3.f24605
                int r2 = Yue.C7065.C7078.m27367(r0)
                r1[r2] = r5
            L1c:
                int r0 = r0 << 1
                goto Lb
            L1f:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo27333(int r1, @Yue.InterfaceC4410 Yue.C3267 r2) {
                r0 = this;
                r2 = 8
                if (r1 == r2) goto L5
                return
            L5:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Ignoring visibility inset not available for IME"
                r1.<init>(r2)
                throw r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo27329(@Yue.InterfaceC4410 Yue.C3267 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo27326(@Yue.InterfaceC4410 Yue.C3267 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public void mo27330(@Yue.InterfaceC4410 Yue.C3267 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo27327(@Yue.InterfaceC4410 Yue.C3267 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo27331(@Yue.InterfaceC4410 Yue.C3267 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public void mo27334(int r1, boolean r2) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC5336(20)
    public static class C7072 extends Yue.C7065.C7077 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static boolean f24606;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static java.lang.reflect.Method f24607;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static java.lang.Class<?> f24608;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static java.lang.reflect.Field f24609;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static java.lang.reflect.Field f24610;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.view.WindowInsets f24611;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.C3267[] f24612;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Yue.C3267 f24613;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Yue.C7065 f24614;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Yue.C3267 f24615;

        static {
                return
        }

        public C7072(@Yue.InterfaceC4410 Yue.C7065 r2, @Yue.InterfaceC4410 Yue.C7065.C7072 r3) {
                r1 = this;
                android.view.WindowInsets r0 = new android.view.WindowInsets
                android.view.WindowInsets r3 = r3.f24611
                r0.<init>(r3)
                r1.<init>(r2, r0)
                return
        }

        public C7072(@Yue.InterfaceC4410 Yue.C7065 r1, @Yue.InterfaceC4410 android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f24613 = r1
                r0.f24611 = r2
                return
        }

        @Yue.InterfaceC4410
        @android.annotation.SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        private Yue.C3267 m27336(int r4, boolean r5) {
                r3 = this;
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.f10680
                r1 = 1
            L3:
                r2 = 256(0x100, float:3.59E-43)
                if (r1 > r2) goto L17
                r2 = r4 & r1
                if (r2 != 0) goto Lc
                goto L14
            Lc:
                Yue.ۥ۠ۥۣۡ r2 = r3.m27351(r1, r5)
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.m13724(r0, r2)
            L14:
                int r1 = r1 << 1
                goto L3
            L17:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        private Yue.C3267 m27337() {
                r1 = this;
                Yue.ۥۢۥۦ r0 = r1.f24614
                if (r0 == 0) goto L9
                Yue.ۥ۠ۥۣۡ r0 = r0.m27290()
                return r0
            L9:
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.f10680
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        private Yue.C3267 m27338(@Yue.InterfaceC4410 android.view.View r5) {
                r4 = this;
                java.lang.String r0 = "WindowInsetsCompat"
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 >= r2) goto L5e
                boolean r1 = Yue.C7065.C7072.f24606
                if (r1 != 0) goto Lf
                m27339()
            Lf:
                java.lang.reflect.Method r1 = Yue.C7065.C7072.f24607
                r2 = 0
                if (r1 == 0) goto L5d
                java.lang.Class<?> r3 = Yue.C7065.C7072.f24608
                if (r3 == 0) goto L5d
                java.lang.reflect.Field r3 = Yue.C7065.C7072.f24609
                if (r3 != 0) goto L1d
                goto L5d
            L1d:
                java.lang.Object r5 = r1.invoke(r5, r2)     // Catch: java.lang.ReflectiveOperationException -> L2e
                if (r5 != 0) goto L30
                java.lang.String r5 = "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden"
                java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.ReflectiveOperationException -> L2e
                r1.<init>()     // Catch: java.lang.ReflectiveOperationException -> L2e
                android.util.Log.w(r0, r5, r1)     // Catch: java.lang.ReflectiveOperationException -> L2e
                return r2
            L2e:
                r5 = move-exception
                goto L45
            L30:
                java.lang.reflect.Field r1 = Yue.C7065.C7072.f24610     // Catch: java.lang.ReflectiveOperationException -> L2e
                java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.ReflectiveOperationException -> L2e
                java.lang.reflect.Field r1 = Yue.C7065.C7072.f24609     // Catch: java.lang.ReflectiveOperationException -> L2e
                java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.ReflectiveOperationException -> L2e
                android.graphics.Rect r5 = (android.graphics.Rect) r5     // Catch: java.lang.ReflectiveOperationException -> L2e
                if (r5 == 0) goto L44
                Yue.ۥ۠ۥۣۡ r2 = Yue.C3267.m13727(r5)     // Catch: java.lang.ReflectiveOperationException -> L2e
            L44:
                return r2
            L45:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Failed to get visible insets. (Reflection error). "
                r1.append(r3)
                java.lang.String r3 = r5.getMessage()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.e(r0, r1, r5)
            L5d:
                return r2
            L5e:
                java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
                r5.<init>(r0)
                throw r5
        }

        @android.annotation.SuppressLint({"PrivateApi"})
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        private static void m27339() {
                r0 = 1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                java.lang.String r2 = "getViewRootImpl"
                r3 = 0
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.ReflectiveOperationException -> L35
                Yue.C7065.C7072.f24607 = r1     // Catch: java.lang.ReflectiveOperationException -> L35
                java.lang.String r1 = "android.view.View$AttachInfo"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L35
                Yue.C7065.C7072.f24608 = r1     // Catch: java.lang.ReflectiveOperationException -> L35
                java.lang.String r2 = "mVisibleInsets"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L35
                Yue.C7065.C7072.f24609 = r1     // Catch: java.lang.ReflectiveOperationException -> L35
                java.lang.String r1 = "android.view.ViewRootImpl"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L35
                java.lang.String r2 = "mAttachInfo"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L35
                Yue.C7065.C7072.f24610 = r1     // Catch: java.lang.ReflectiveOperationException -> L35
                java.lang.reflect.Field r1 = Yue.C7065.C7072.f24609     // Catch: java.lang.ReflectiveOperationException -> L35
                r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L35
                java.lang.reflect.Field r1 = Yue.C7065.C7072.f24610     // Catch: java.lang.ReflectiveOperationException -> L35
                r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L35
                goto L50
            L35:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to get visible insets. (Reflection error). "
                r2.append(r3)
                java.lang.String r3 = r1.getMessage()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "WindowInsetsCompat"
                android.util.Log.e(r3, r2, r1)
            L50:
                Yue.C7065.C7072.f24606 = r0
                return
        }

        @Override // Yue.C7065.C7077
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = super.equals(r2)
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                Yue.ۥۢۥۦ$ۥ۟۟۟ۡ r2 = (Yue.C7065.C7072) r2
                Yue.ۥ۠ۥۣۡ r0 = r1.f24615
                Yue.ۥ۠ۥۣۡ r2 = r2.f24615
                boolean r2 = java.util.Objects.equals(r0, r2)
                return r2
        }

        @Override // Yue.C7065.C7077
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo27340(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                Yue.ۥ۠ۥۣۡ r1 = r0.m27338(r1)
                if (r1 != 0) goto L8
                Yue.ۥ۠ۥۣۡ r1 = Yue.C3267.f10680
            L8:
                r0.mo27349(r1)
                return
        }

        @Override // Yue.C7065.C7077
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo27341(@Yue.InterfaceC4410 Yue.C7065 r2) {
                r1 = this;
                Yue.ۥۢۥۦ r0 = r1.f24614
                r2.m27310(r0)
                Yue.ۥ۠ۥۣۡ r0 = r1.f24615
                r2.m27309(r0)
                return
        }

        @Override // Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Yue.C3267 mo27342(int r2) {
                r1 = this;
                r0 = 0
                Yue.ۥ۠ۥۣۡ r2 = r1.m27336(r2, r0)
                return r2
        }

        @Override // Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public Yue.C3267 mo27343(int r2) {
                r1 = this;
                r0 = 1
                Yue.ۥ۠ۥۣۡ r2 = r1.m27336(r2, r0)
                return r2
        }

        @Override // Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final Yue.C3267 mo27344() {
                r4 = this;
                Yue.ۥ۠ۥۣۡ r0 = r4.f24613
                if (r0 != 0) goto L22
                android.view.WindowInsets r0 = r4.f24611
                int r0 = r0.getSystemWindowInsetLeft()
                android.view.WindowInsets r1 = r4.f24611
                int r1 = r1.getSystemWindowInsetTop()
                android.view.WindowInsets r2 = r4.f24611
                int r2 = r2.getSystemWindowInsetRight()
                android.view.WindowInsets r3 = r4.f24611
                int r3 = r3.getSystemWindowInsetBottom()
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.m13726(r0, r1, r2, r3)
                r4.f24613 = r0
            L22:
                Yue.ۥ۠ۥۣۡ r0 = r4.f24613
                return r0
        }

        @Override // Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public Yue.C7065 mo27345(int r3, int r4, int r5, int r6) {
                r2 = this;
                Yue.ۥۢۥۦ$ۥ۟ r0 = new Yue.ۥۢۥۦ$ۥ۟
                android.view.WindowInsets r1 = r2.f24611
                Yue.ۥۢۥۦ r1 = Yue.C7065.m27276(r1)
                r0.<init>(r1)
                Yue.ۥ۠ۥۣۡ r1 = r2.mo27344()
                Yue.ۥ۠ۥۣۡ r1 = Yue.C7065.m27275(r1, r3, r4, r5, r6)
                r0.m27321(r1)
                Yue.ۥ۠ۥۣۡ r1 = r2.mo27355()
                Yue.ۥ۠ۥۣۡ r3 = Yue.C7065.m27275(r1, r3, r4, r5, r6)
                r0.m27319(r3)
                Yue.ۥۢۥۦ r3 = r0.m27314()
                return r3
        }

        @Override // Yue.C7065.C7077
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean mo27346() {
                r1 = this;
                android.view.WindowInsets r0 = r1.f24611
                boolean r0 = r0.isRound()
                return r0
        }

        @Override // Yue.C7065.C7077
        @android.annotation.SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public boolean mo27347(int r4) {
                r3 = this;
                r0 = 1
                r1 = r0
            L2:
                r2 = 256(0x100, float:3.59E-43)
                if (r1 > r2) goto L16
                r2 = r4 & r1
                if (r2 != 0) goto Lb
                goto L13
            Lb:
                boolean r2 = r3.m27352(r1)
                if (r2 != 0) goto L13
                r4 = 0
                return r4
            L13:
                int r1 = r1 << 1
                goto L2
            L16:
                return r0
        }

        @Override // Yue.C7065.C7077
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public void mo27348(Yue.C3267[] r1) {
                r0 = this;
                r0.f24612 = r1
                return
        }

        @Override // Yue.C7065.C7077
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public void mo27349(@Yue.InterfaceC4410 Yue.C3267 r1) {
                r0 = this;
                r0.f24615 = r1
                return
        }

        @Override // Yue.C7065.C7077
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public void mo27350(@Yue.InterfaceC4544 Yue.C7065 r1) {
                r0 = this;
                r0.f24614 = r1
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Yue.C3267 m27351(int r5, boolean r6) {
                r4 = this;
                r0 = 1
                r1 = 0
                if (r5 == r0) goto Ld7
                r0 = 2
                r2 = 0
                if (r5 == r0) goto L91
                r6 = 8
                if (r5 == r6) goto L55
                r6 = 16
                if (r5 == r6) goto L50
                r6 = 32
                if (r5 == r6) goto L4b
                r6 = 64
                if (r5 == r6) goto L46
                r6 = 128(0x80, float:1.8E-43)
                if (r5 == r6) goto L1f
                Yue.ۥ۠ۥۣۡ r5 = Yue.C3267.f10680
                return r5
            L1f:
                Yue.ۥۢۥۦ r5 = r4.f24614
                if (r5 == 0) goto L28
                Yue.ۥۣ۠۟۠ r5 = r5.m27282()
                goto L2c
            L28:
                Yue.ۥۣ۠۟۠ r5 = r4.mo27359()
            L2c:
                if (r5 == 0) goto L43
                int r6 = r5.m8824()
                int r0 = r5.m8826()
                int r1 = r5.m8825()
                int r5 = r5.m8823()
                Yue.ۥ۠ۥۣۡ r5 = Yue.C3267.m13726(r6, r0, r1, r5)
                return r5
            L43:
                Yue.ۥ۠ۥۣۡ r5 = Yue.C3267.f10680
                return r5
            L46:
                Yue.ۥ۠ۥۣۡ r5 = r4.mo27362()
                return r5
            L4b:
                Yue.ۥ۠ۥۣۡ r5 = r4.mo27360()
                return r5
            L50:
                Yue.ۥ۠ۥۣۡ r5 = r4.mo27361()
                return r5
            L55:
                Yue.ۥ۠ۥۣۡ[] r5 = r4.f24612
                if (r5 == 0) goto L5f
                int r6 = Yue.C7065.C7078.m27367(r6)
                r2 = r5[r6]
            L5f:
                if (r2 == 0) goto L62
                return r2
            L62:
                Yue.ۥ۠ۥۣۡ r5 = r4.mo27344()
                Yue.ۥ۠ۥۣۡ r6 = r4.m27337()
                int r5 = r5.f10684
                int r0 = r6.f10684
                if (r5 <= r0) goto L75
                Yue.ۥ۠ۥۣۡ r5 = Yue.C3267.m13726(r1, r1, r1, r5)
                return r5
            L75:
                Yue.ۥ۠ۥۣۡ r5 = r4.f24615
                if (r5 == 0) goto L8e
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.f10680
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L8e
                Yue.ۥ۠ۥۣۡ r5 = r4.f24615
                int r5 = r5.f10684
                int r6 = r6.f10684
                if (r5 <= r6) goto L8e
                Yue.ۥ۠ۥۣۡ r5 = Yue.C3267.m13726(r1, r1, r1, r5)
                return r5
            L8e:
                Yue.ۥ۠ۥۣۡ r5 = Yue.C3267.f10680
                return r5
            L91:
                if (r6 == 0) goto Lb8
                Yue.ۥ۠ۥۣۡ r5 = r4.m27337()
                Yue.ۥ۠ۥۣۡ r6 = r4.mo27355()
                int r0 = r5.f10681
                int r2 = r6.f10681
                int r0 = java.lang.Math.max(r0, r2)
                int r2 = r5.f10683
                int r3 = r6.f10683
                int r2 = java.lang.Math.max(r2, r3)
                int r5 = r5.f10684
                int r6 = r6.f10684
                int r5 = java.lang.Math.max(r5, r6)
                Yue.ۥ۠ۥۣۡ r5 = Yue.C3267.m13726(r0, r1, r2, r5)
                return r5
            Lb8:
                Yue.ۥ۠ۥۣۡ r5 = r4.mo27344()
                Yue.ۥۢۥۦ r6 = r4.f24614
                if (r6 == 0) goto Lc4
                Yue.ۥ۠ۥۣۡ r2 = r6.m27290()
            Lc4:
                int r6 = r5.f10684
                if (r2 == 0) goto Lce
                int r0 = r2.f10684
                int r6 = java.lang.Math.min(r6, r0)
            Lce:
                int r0 = r5.f10681
                int r5 = r5.f10683
                Yue.ۥ۠ۥۣۡ r5 = Yue.C3267.m13726(r0, r1, r5, r6)
                return r5
            Ld7:
                if (r6 == 0) goto Lee
                Yue.ۥ۠ۥۣۡ r5 = r4.m27337()
                int r5 = r5.f10682
                Yue.ۥ۠ۥۣۡ r6 = r4.mo27344()
                int r6 = r6.f10682
                int r5 = java.lang.Math.max(r5, r6)
                Yue.ۥ۠ۥۣۡ r5 = Yue.C3267.m13726(r1, r5, r1, r1)
                return r5
            Lee:
                Yue.ۥ۠ۥۣۡ r5 = r4.mo27344()
                int r5 = r5.f10682
                Yue.ۥ۠ۥۣۡ r5 = Yue.C3267.m13726(r1, r5, r1, r1)
                return r5
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public boolean m27352(int r4) {
                r3 = this;
                r0 = 0
                r1 = 1
                if (r4 == r1) goto L14
                r2 = 2
                if (r4 == r2) goto L14
                r2 = 4
                if (r4 == r2) goto L13
                r2 = 8
                if (r4 == r2) goto L14
                r2 = 128(0x80, float:1.8E-43)
                if (r4 == r2) goto L14
                return r1
            L13:
                return r0
            L14:
                Yue.ۥ۠ۥۣۡ r4 = r3.m27351(r4, r0)
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.f10680
                boolean r4 = r4.equals(r0)
                r4 = r4 ^ r1
                return r4
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C7073 extends Yue.C7065.C7072 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public Yue.C3267 f24616;

        public C7073(@Yue.InterfaceC4410 Yue.C7065 r1, @Yue.InterfaceC4410 Yue.C7065.C7073 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f24616 = r1
                Yue.ۥ۠ۥۣۡ r1 = r2.f24616
                r0.f24616 = r1
                return
        }

        public C7073(@Yue.InterfaceC4410 Yue.C7065 r1, @Yue.InterfaceC4410 android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f24616 = r1
                return
        }

        @Override // Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C7065 mo27353() {
                r1 = this;
                android.view.WindowInsets r0 = r1.f24611
                android.view.WindowInsets r0 = r0.consumeStableInsets()
                Yue.ۥۢۥۦ r0 = Yue.C7065.m27276(r0)
                return r0
        }

        @Override // Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C7065 mo27354() {
                r1 = this;
                android.view.WindowInsets r0 = r1.f24611
                android.view.WindowInsets r0 = r0.consumeSystemWindowInsets()
                Yue.ۥۢۥۦ r0 = Yue.C7065.m27276(r0)
                return r0
        }

        @Override // Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final Yue.C3267 mo27355() {
                r4 = this;
                Yue.ۥ۠ۥۣۡ r0 = r4.f24616
                if (r0 != 0) goto L22
                android.view.WindowInsets r0 = r4.f24611
                int r0 = r0.getStableInsetLeft()
                android.view.WindowInsets r1 = r4.f24611
                int r1 = r1.getStableInsetTop()
                android.view.WindowInsets r2 = r4.f24611
                int r2 = r2.getStableInsetRight()
                android.view.WindowInsets r3 = r4.f24611
                int r3 = r3.getStableInsetBottom()
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.m13726(r0, r1, r2, r3)
                r4.f24616 = r0
            L22:
                Yue.ۥ۠ۥۣۡ r0 = r4.f24616
                return r0
        }

        @Override // Yue.C7065.C7077
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean mo27356() {
                r1 = this;
                android.view.WindowInsets r0 = r1.f24611
                boolean r0 = r0.isConsumed()
                return r0
        }

        @Override // Yue.C7065.C7077
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public void mo27357(@Yue.InterfaceC4544 Yue.C3267 r1) {
                r0 = this;
                r0.f24616 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C7074 extends Yue.C7065.C7073 {
        public C7074(@Yue.InterfaceC4410 Yue.C7065 r1, @Yue.InterfaceC4410 Yue.C7065.C7074 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C7074(@Yue.InterfaceC4410 Yue.C7065 r1, @Yue.InterfaceC4410 android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.C7065.C7072, Yue.C7065.C7077
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof Yue.C7065.C7074
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                Yue.ۥۢۥۦ$ۥۣ۟۟۟ r5 = (Yue.C7065.C7074) r5
                android.view.WindowInsets r1 = r4.f24611
                android.view.WindowInsets r3 = r5.f24611
                boolean r1 = java.util.Objects.equals(r1, r3)
                if (r1 == 0) goto L21
                Yue.ۥ۠ۥۣۡ r1 = r4.f24615
                Yue.ۥ۠ۥۣۡ r5 = r5.f24615
                boolean r5 = java.util.Objects.equals(r1, r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = r2
            L22:
                return r0
        }

        @Override // Yue.C7065.C7077
        public int hashCode() {
                r1 = this;
                android.view.WindowInsets r0 = r1.f24611
                int r0 = r0.hashCode()
                return r0
        }

        @Override // Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C7065 mo27358() {
                r1 = this;
                android.view.WindowInsets r0 = r1.f24611
                android.view.WindowInsets r0 = Yue.C7094.m27388(r0)
                Yue.ۥۢۥۦ r0 = Yue.C7065.m27276(r0)
                return r0
        }

        @Override // Yue.C7065.C7077
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Yue.C1886 mo27359() {
                r1 = this;
                android.view.WindowInsets r0 = r1.f24611
                android.view.DisplayCutout r0 = Yue.C7093.m27387(r0)
                Yue.ۥۣ۠۟۠ r0 = Yue.C1886.m8821(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C7075 extends Yue.C7065.C7074 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public Yue.C3267 f24617;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public Yue.C3267 f24618;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public Yue.C3267 f24619;

        public C7075(@Yue.InterfaceC4410 Yue.C7065 r1, @Yue.InterfaceC4410 Yue.C7065.C7075 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f24617 = r1
                r0.f24618 = r1
                r0.f24619 = r1
                return
        }

        public C7075(@Yue.InterfaceC4410 Yue.C7065 r1, @Yue.InterfaceC4410 android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f24617 = r1
                r0.f24618 = r1
                r0.f24619 = r1
                return
        }

        @Override // Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public Yue.C3267 mo27360() {
                r1 = this;
                Yue.ۥ۠ۥۣۡ r0 = r1.f24618
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.f24611
                android.graphics.Insets r0 = Yue.C7097.m27391(r0)
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.m13729(r0)
                r1.f24618 = r0
            L10:
                Yue.ۥ۠ۥۣۡ r0 = r1.f24618
                return r0
        }

        @Override // Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public Yue.C3267 mo27361() {
                r1 = this;
                Yue.ۥ۠ۥۣۡ r0 = r1.f24617
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.f24611
                android.graphics.Insets r0 = Yue.C7098.m27392(r0)
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.m13729(r0)
                r1.f24617 = r0
            L10:
                Yue.ۥ۠ۥۣۡ r0 = r1.f24617
                return r0
        }

        @Override // Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public Yue.C3267 mo27362() {
                r1 = this;
                Yue.ۥ۠ۥۣۡ r0 = r1.f24619
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.f24611
                android.graphics.Insets r0 = Yue.C7095.m27389(r0)
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.m13729(r0)
                r1.f24619 = r0
            L10:
                Yue.ۥ۠ۥۣۡ r0 = r1.f24619
                return r0
        }

        @Override // Yue.C7065.C7072, Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public Yue.C7065 mo27345(int r2, int r3, int r4, int r5) {
                r1 = this;
                android.view.WindowInsets r0 = r1.f24611
                android.view.WindowInsets r2 = Yue.C7096.m27390(r0, r2, r3, r4, r5)
                Yue.ۥۢۥۦ r2 = Yue.C7065.m27276(r2)
                return r2
        }

        @Override // Yue.C7065.C7073, Yue.C7065.C7077
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
        public void mo27357(@Yue.InterfaceC4544 Yue.C3267 r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C7076 extends Yue.C7065.C7075 {

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public static final Yue.C7065 f24620 = null;

        static {
                android.view.WindowInsets r0 = Yue.C7101.m27395()
                Yue.ۥۢۥۦ r0 = Yue.C7065.m27276(r0)
                Yue.C7065.C7076.f24620 = r0
                return
        }

        public C7076(@Yue.InterfaceC4410 Yue.C7065 r1, @Yue.InterfaceC4410 Yue.C7065.C7076 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C7076(@Yue.InterfaceC4410 Yue.C7065 r1, @Yue.InterfaceC4410 android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.C7065.C7072, Yue.C7065.C7077
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public final void mo27340(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                return
        }

        @Override // Yue.C7065.C7072, Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public Yue.C3267 mo27342(int r2) {
                r1 = this;
                android.view.WindowInsets r0 = r1.f24611
                int r2 = Yue.C7065.C7080.m27374(r2)
                android.graphics.Insets r2 = Yue.C7100.m27394(r0, r2)
                Yue.ۥ۠ۥۣۡ r2 = Yue.C3267.m13729(r2)
                return r2
        }

        @Override // Yue.C7065.C7072, Yue.C7065.C7077
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public Yue.C3267 mo27343(int r2) {
                r1 = this;
                android.view.WindowInsets r0 = r1.f24611
                int r2 = Yue.C7065.C7080.m27374(r2)
                android.graphics.Insets r2 = Yue.C7099.m27393(r0, r2)
                Yue.ۥ۠ۥۣۡ r2 = Yue.C3267.m13729(r2)
                return r2
        }

        @Override // Yue.C7065.C7072, Yue.C7065.C7077
        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        public boolean mo27347(int r2) {
                r1 = this;
                android.view.WindowInsets r0 = r1.f24611
                int r2 = Yue.C7065.C7080.m27374(r2)
                boolean r2 = Yue.C7102.m27396(r0, r2)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C7077 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public static final Yue.C7065 f24621 = null;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C7065 f24622;

        static {
                Yue.ۥۢۥۦ$ۥ۟ r0 = new Yue.ۥۢۥۦ$ۥ۟
                r0.<init>()
                Yue.ۥۢۥۦ r0 = r0.m27314()
                Yue.ۥۢۥۦ r0 = r0.m27278()
                Yue.ۥۢۥۦ r0 = r0.m27279()
                Yue.ۥۢۥۦ r0 = r0.m27280()
                Yue.C7065.C7077.f24621 = r0
                return
        }

        public C7077(@Yue.InterfaceC4410 Yue.C7065 r1) {
                r0 = this;
                r0.<init>()
                r0.f24622 = r1
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof Yue.C7065.C7077
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r5 = (Yue.C7065.C7077) r5
                boolean r1 = r4.mo27346()
                boolean r3 = r5.mo27346()
                if (r1 != r3) goto L4b
                boolean r1 = r4.mo27356()
                boolean r3 = r5.mo27356()
                if (r1 != r3) goto L4b
                Yue.ۥ۠ۥۣۡ r1 = r4.mo27344()
                Yue.ۥ۠ۥۣۡ r3 = r5.mo27344()
                boolean r1 = Yue.C4554.m18124(r1, r3)
                if (r1 == 0) goto L4b
                Yue.ۥ۠ۥۣۡ r1 = r4.mo27355()
                Yue.ۥ۠ۥۣۡ r3 = r5.mo27355()
                boolean r1 = Yue.C4554.m18124(r1, r3)
                if (r1 == 0) goto L4b
                Yue.ۥۣ۠۟۠ r1 = r4.mo27359()
                Yue.ۥۣ۠۟۠ r5 = r5.mo27359()
                boolean r5 = Yue.C4554.m18124(r1, r5)
                if (r5 == 0) goto L4b
                goto L4c
            L4b:
                r0 = r2
            L4c:
                return r0
        }

        public int hashCode() {
                r5 = this;
                boolean r0 = r5.mo27346()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                boolean r1 = r5.mo27356()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                Yue.ۥ۠ۥۣۡ r2 = r5.mo27344()
                Yue.ۥ۠ۥۣۡ r3 = r5.mo27355()
                Yue.ۥۣ۠۟۠ r4 = r5.mo27359()
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3, r4}
                int r0 = Yue.C4554.m18125(r0)
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ */
        public Yue.C7065 mo27358() {
                r1 = this;
                Yue.ۥۢۥۦ r0 = r1.f24622
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟ */
        public Yue.C7065 mo27353() {
                r1 = this;
                Yue.ۥۢۥۦ r0 = r1.f24622
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟ */
        public Yue.C7065 mo27354() {
                r1 = this;
                Yue.ۥۢۥۦ r0 = r1.f24622
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo27340(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo27341(@Yue.InterfaceC4410 Yue.C7065 r1) {
                r0 = this;
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public Yue.C1886 mo27359() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public Yue.C3267 mo27342(int r1) {
                r0 = this;
                Yue.ۥ۠ۥۣۡ r1 = Yue.C3267.f10680
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public Yue.C3267 mo27343(int r2) {
                r1 = this;
                r2 = r2 & 8
                if (r2 != 0) goto L7
                Yue.ۥ۠ۥۣۡ r2 = Yue.C3267.f10680
                return r2
            L7:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Unable to query the maximum insets for IME"
                r2.<init>(r0)
                throw r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public Yue.C3267 mo27360() {
                r1 = this;
                Yue.ۥ۠ۥۣۡ r0 = r1.mo27344()
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public Yue.C3267 mo27355() {
                r1 = this;
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.f10680
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public Yue.C3267 mo27361() {
                r1 = this;
                Yue.ۥ۠ۥۣۡ r0 = r1.mo27344()
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public Yue.C3267 mo27344() {
                r1 = this;
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.f10680
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public Yue.C3267 mo27362() {
                r1 = this;
                Yue.ۥ۠ۥۣۡ r0 = r1.mo27344()
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public Yue.C7065 mo27345(int r1, int r2, int r3, int r4) {
                r0 = this;
                Yue.ۥۢۥۦ r1 = Yue.C7065.C7077.f24621
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public boolean mo27356() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟ */
        public boolean mo27346() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        public boolean mo27347(int r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public void mo27348(Yue.C3267[] r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public void mo27349(@Yue.InterfaceC4410 Yue.C3267 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public void mo27350(@Yue.InterfaceC4544 Yue.C7065 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
        public void mo27357(Yue.C3267 r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final class C7078 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final int f24623 = 1;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final int f24624 = 1;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f24625 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f24626 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f24627 = 8;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f24628 = 16;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f24629 = 32;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f24630 = 64;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f24631 = 128;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f24632 = 256;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f24633 = 9;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final int f24634 = 256;

        /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۧ$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InterfaceC7079 {
        }

        public C7078() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
        @android.annotation.SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m27363() {
                r0 = -1
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static int m27364() {
                r0 = 4
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m27365() {
                r0 = 128(0x80, float:1.8E-43)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static int m27366() {
                r0 = 8
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static int m27367(int r3) {
                r0 = 1
                if (r3 == r0) goto L44
                r1 = 2
                if (r3 == r1) goto L43
                r0 = 4
                if (r3 == r0) goto L42
                r1 = 8
                if (r3 == r1) goto L40
                r2 = 16
                if (r3 == r2) goto L3f
                r0 = 32
                if (r3 == r0) goto L3d
                r0 = 64
                if (r3 == r0) goto L3b
                r0 = 128(0x80, float:1.8E-43)
                if (r3 == r0) goto L39
                r0 = 256(0x100, float:3.59E-43)
                if (r3 != r0) goto L22
                return r1
            L22:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "type needs to be >= FIRST and <= LAST, type="
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L39:
                r3 = 7
                return r3
            L3b:
                r3 = 6
                return r3
            L3d:
                r3 = 5
                return r3
            L3f:
                return r0
            L40:
                r3 = 3
                return r3
            L42:
                return r1
            L43:
                return r0
            L44:
                r3 = 0
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static int m27368() {
                r0 = 32
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static int m27369() {
                r0 = 2
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static int m27370() {
                r0 = 1
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static int m27371() {
                r0 = 7
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static int m27372() {
                r0 = 16
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static int m27373() {
                r0 = 64
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۦ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static final class C7080 {
        private C7080() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m27374(int r4) {
                r0 = 0
                r1 = 1
                r2 = r1
            L3:
                r3 = 256(0x100, float:3.59E-43)
                if (r2 > r3) goto L54
                r3 = r4 & r2
                if (r3 == 0) goto L51
                if (r2 == r1) goto L4c
                r3 = 2
                if (r2 == r3) goto L47
                r3 = 4
                if (r2 == r3) goto L42
                r3 = 8
                if (r2 == r3) goto L3d
                r3 = 16
                if (r2 == r3) goto L38
                r3 = 32
                if (r2 == r3) goto L33
                r3 = 64
                if (r2 == r3) goto L2e
                r3 = 128(0x80, float:1.8E-43)
                if (r2 == r3) goto L28
                goto L51
            L28:
                int r3 = Yue.C7109.m27403()
            L2c:
                r0 = r0 | r3
                goto L51
            L2e:
                int r3 = Yue.C7108.m27402()
                goto L2c
            L33:
                int r3 = Yue.C7107.m27401()
                goto L2c
            L38:
                int r3 = Yue.C7106.m27400()
                goto L2c
            L3d:
                int r3 = Yue.C5828.m21678()
                goto L2c
            L42:
                int r3 = Yue.C7105.m27399()
                goto L2c
            L47:
                int r3 = Yue.C7104.m27398()
                goto L2c
            L4c:
                int r3 = Yue.C7103.m27397()
                goto L2c
            L51:
                int r2 = r2 << 1
                goto L3
            L54:
                return r0
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            Yue.ۥۢۥۦ r0 = Yue.C7065.C7076.f24620
            Yue.C7065.f24590 = r0
            goto Lf
        Lb:
            Yue.ۥۢۥۦ r0 = Yue.C7065.C7077.f24621
            Yue.C7065.f24590 = r0
        Lf:
            return
    }

    public C7065(@Yue.InterfaceC4544 Yue.C7065 r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L6b
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r3 = r3.f24591
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            boolean r1 = r3 instanceof Yue.C7065.C7076
            if (r1 == 0) goto L1c
            Yue.ۥۢۥۦ$ۥ۟۟۟ۥ r0 = new Yue.ۥۢۥۦ$ۥ۟۟۟ۥ
            r1 = r3
            Yue.ۥۢۥۦ$ۥ۟۟۟ۥ r1 = (Yue.C7065.C7076) r1
            r0.<init>(r2, r1)
            r2.f24591 = r0
            goto L67
        L1c:
            r1 = 29
            if (r0 < r1) goto L2f
            boolean r1 = r3 instanceof Yue.C7065.C7075
            if (r1 == 0) goto L2f
            Yue.ۥۢۥۦ$ۥ۟۟۟ۤ r0 = new Yue.ۥۢۥۦ$ۥ۟۟۟ۤ
            r1 = r3
            Yue.ۥۢۥۦ$ۥ۟۟۟ۤ r1 = (Yue.C7065.C7075) r1
            r0.<init>(r2, r1)
            r2.f24591 = r0
            goto L67
        L2f:
            r1 = 28
            if (r0 < r1) goto L42
            boolean r0 = r3 instanceof Yue.C7065.C7074
            if (r0 == 0) goto L42
            Yue.ۥۢۥۦ$ۥۣ۟۟۟ r0 = new Yue.ۥۢۥۦ$ۥۣ۟۟۟
            r1 = r3
            Yue.ۥۢۥۦ$ۥۣ۟۟۟ r1 = (Yue.C7065.C7074) r1
            r0.<init>(r2, r1)
            r2.f24591 = r0
            goto L67
        L42:
            boolean r0 = r3 instanceof Yue.C7065.C7073
            if (r0 == 0) goto L51
            Yue.ۥۢۥۦ$ۥ۟۟۟ۢ r0 = new Yue.ۥۢۥۦ$ۥ۟۟۟ۢ
            r1 = r3
            Yue.ۥۢۥۦ$ۥ۟۟۟ۢ r1 = (Yue.C7065.C7073) r1
            r0.<init>(r2, r1)
            r2.f24591 = r0
            goto L67
        L51:
            boolean r0 = r3 instanceof Yue.C7065.C7072
            if (r0 == 0) goto L60
            Yue.ۥۢۥۦ$ۥ۟۟۟ۡ r0 = new Yue.ۥۢۥۦ$ۥ۟۟۟ۡ
            r1 = r3
            Yue.ۥۢۥۦ$ۥ۟۟۟ۡ r1 = (Yue.C7065.C7072) r1
            r0.<init>(r2, r1)
            r2.f24591 = r0
            goto L67
        L60:
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = new Yue.ۥۢۥۦ$ۥ۟۟۟ۦ
            r0.<init>(r2)
            r2.f24591 = r0
        L67:
            r3.mo27341(r2)
            goto L72
        L6b:
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r3 = new Yue.ۥۢۥۦ$ۥ۟۟۟ۦ
            r3.<init>(r2)
            r2.f24591 = r3
        L72:
            return
    }

    @Yue.InterfaceC5336(20)
    public C7065(@Yue.InterfaceC4410 android.view.WindowInsets r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            Yue.ۥۢۥۦ$ۥ۟۟۟ۥ r0 = new Yue.ۥۢۥۦ$ۥ۟۟۟ۥ
            r0.<init>(r2, r3)
            r2.f24591 = r0
            goto L30
        L11:
            r1 = 29
            if (r0 < r1) goto L1d
            Yue.ۥۢۥۦ$ۥ۟۟۟ۤ r0 = new Yue.ۥۢۥۦ$ۥ۟۟۟ۤ
            r0.<init>(r2, r3)
            r2.f24591 = r0
            goto L30
        L1d:
            r1 = 28
            if (r0 < r1) goto L29
            Yue.ۥۢۥۦ$ۥۣ۟۟۟ r0 = new Yue.ۥۢۥۦ$ۥۣ۟۟۟
            r0.<init>(r2, r3)
            r2.f24591 = r0
            goto L30
        L29:
            Yue.ۥۢۥۦ$ۥ۟۟۟ۢ r0 = new Yue.ۥۢۥۦ$ۥ۟۟۟ۢ
            r0.<init>(r2, r3)
            r2.f24591 = r0
        L30:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static Yue.C3267 m27275(@Yue.InterfaceC4410 Yue.C3267 r5, int r6, int r7, int r8, int r9) {
            int r0 = r5.f10681
            int r0 = r0 - r6
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r5.f10682
            int r2 = r2 - r7
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = r5.f10683
            int r3 = r3 - r8
            int r3 = java.lang.Math.max(r1, r3)
            int r4 = r5.f10684
            int r4 = r4 - r9
            int r1 = java.lang.Math.max(r1, r4)
            if (r0 != r6) goto L26
            if (r2 != r7) goto L26
            if (r3 != r8) goto L26
            if (r1 != r9) goto L26
            return r5
        L26:
            Yue.ۥ۠ۥۣۡ r5 = Yue.C3267.m13726(r0, r2, r3, r1)
            return r5
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(20)
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static Yue.C7065 m27276(@Yue.InterfaceC4410 android.view.WindowInsets r1) {
            r0 = 0
            Yue.ۥۢۥۦ r1 = m27277(r1, r0)
            return r1
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(20)
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static Yue.C7065 m27277(@Yue.InterfaceC4410 android.view.WindowInsets r1, @Yue.InterfaceC4544 android.view.View r2) {
            Yue.ۥۢۥۦ r0 = new Yue.ۥۢۥۦ
            java.lang.Object r1 = Yue.C4868.m19181(r1)
            android.view.WindowInsets r1 = (android.view.WindowInsets) r1
            r0.<init>(r1)
            if (r2 == 0) goto L21
            boolean r1 = r2.isAttachedToWindow()
            if (r1 == 0) goto L21
            Yue.ۥۢۥۦ r1 = Yue.C6794.m26155(r2)
            r0.m27310(r1)
            android.view.View r1 = r2.getRootView()
            r0.m27281(r1)
        L21:
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof Yue.C7065
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            Yue.ۥۢۥۦ r2 = (Yue.C7065) r2
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r2 = r2.f24591
            boolean r2 = Yue.C4554.m18124(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C7065 m27278() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥۢۥۦ r0 = r0.mo27358()
            return r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C7065 m27279() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥۢۥۦ r0 = r0.mo27353()
            return r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C7065 m27280() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥۢۥۦ r0 = r0.mo27354()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m27281(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            r0.mo27340(r2)
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C1886 m27282() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥۣ۠۟۠ r0 = r0.mo27359()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Yue.C3267 m27283(int r2) {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r2 = r0.mo27342(r2)
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.C3267 m27284(int r2) {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r2 = r0.mo27343(r2)
            return r2
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.C3267 m27285() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27360()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m27286() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27355()
            int r0 = r0.f10684
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m27287() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27355()
            int r0 = r0.f10681
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m27288() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27355()
            int r0 = r0.f10683
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m27289() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27355()
            int r0 = r0.f10682
            return r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Yue.C3267 m27290() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27355()
            return r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public Yue.C3267 m27291() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27361()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m27292() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27344()
            int r0 = r0.f10684
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m27293() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27344()
            int r0 = r0.f10681
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int m27294() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27344()
            int r0 = r0.f10683
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int m27295() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27344()
            int r0 = r0.f10682
            return r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public Yue.C3267 m27296() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27344()
            return r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.C3267 m27297() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27362()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m27298() {
            r3 = this;
            int r0 = Yue.C7065.C7078.m27363()
            Yue.ۥ۠ۥۣۡ r0 = r3.m27283(r0)
            Yue.ۥ۠ۥۣۡ r1 = Yue.C3267.f10680
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c
            int r0 = Yue.C7065.C7078.m27363()
            int r2 = Yue.C7065.C7078.m27366()
            r0 = r0 ^ r2
            Yue.ۥ۠ۥۣۡ r0 = r3.m27284(r0)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c
            Yue.ۥۣ۠۟۠ r0 = r3.m27282()
            if (r0 == 0) goto L2a
            goto L2c
        L2a:
            r0 = 0
            goto L2d
        L2c:
            r0 = 1
        L2d:
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m27299() {
            r2 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r2.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27355()
            Yue.ۥ۠ۥۣۡ r1 = Yue.C3267.f10680
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m27300() {
            r2 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r2.f24591
            Yue.ۥ۠ۥۣۡ r0 = r0.mo27344()
            Yue.ۥ۠ۥۣۡ r1 = Yue.C3267.f10680
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Yue.C7065 m27301(@Yue.InterfaceC3281(from = 0) int r2, @Yue.InterfaceC3281(from = 0) int r3, @Yue.InterfaceC3281(from = 0) int r4, @Yue.InterfaceC3281(from = 0) int r5) {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            Yue.ۥۢۥۦ r2 = r0.mo27345(r2, r3, r4, r5)
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Yue.C7065 m27302(@Yue.InterfaceC4410 Yue.C3267 r4) {
            r3 = this;
            int r0 = r4.f10681
            int r1 = r4.f10682
            int r2 = r4.f10683
            int r4 = r4.f10684
            Yue.ۥۢۥۦ r4 = r3.m27301(r0, r1, r2, r4)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m27303() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            boolean r0 = r0.mo27356()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean m27304() {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            boolean r0 = r0.mo27346()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean m27305(int r2) {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            boolean r2 = r0.mo27347(r2)
            return r2
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public Yue.C7065 m27306(int r2, int r3, int r4, int r5) {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟ r0 = new Yue.ۥۢۥۦ$ۥ۟
            r0.<init>(r1)
            Yue.ۥ۠ۥۣۡ r2 = Yue.C3267.m13726(r2, r3, r4, r5)
            Yue.ۥۢۥۦ$ۥ۟ r2 = r0.m27321(r2)
            Yue.ۥۢۥۦ r2 = r2.m27314()
            return r2
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Yue.C7065 m27307(@Yue.InterfaceC4410 android.graphics.Rect r2) {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟ r0 = new Yue.ۥۢۥۦ$ۥ۟
            r0.<init>(r1)
            Yue.ۥ۠ۥۣۡ r2 = Yue.C3267.m13727(r2)
            Yue.ۥۢۥۦ$ۥ۟ r2 = r0.m27321(r2)
            Yue.ۥۢۥۦ r2 = r2.m27314()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m27308(Yue.C3267[] r2) {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            r0.mo27348(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m27309(@Yue.InterfaceC4410 Yue.C3267 r2) {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            r0.mo27349(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m27310(@Yue.InterfaceC4544 Yue.C7065 r2) {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            r0.mo27350(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m27311(@Yue.InterfaceC4544 Yue.C3267 r2) {
            r1 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r1.f24591
            r0.mo27357(r2)
            return
    }

    @Yue.InterfaceC4544
    @Yue.InterfaceC5336(20)
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public android.view.WindowInsets m27312() {
            r2 = this;
            Yue.ۥۢۥۦ$ۥ۟۟۟ۦ r0 = r2.f24591
            boolean r1 = r0 instanceof Yue.C7065.C7072
            if (r1 == 0) goto Lb
            Yue.ۥۢۥۦ$ۥ۟۟۟ۡ r0 = (Yue.C7065.C7072) r0
            android.view.WindowInsets r0 = r0.f24611
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }
}
