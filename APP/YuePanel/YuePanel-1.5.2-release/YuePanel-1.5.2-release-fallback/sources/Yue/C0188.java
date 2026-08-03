package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0188 extends Yue.C1584 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C0188.InterfaceC0198 f441;

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ, reason: contains not printable characters */
    public class RunnableC0189 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.String[] f442;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.app.Activity f443;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ int f444;

        public RunnableC0189(java.lang.String[] r1, android.app.Activity r2, int r3) {
                r0 = this;
                r0.f442 = r1
                r0.f443 = r2
                r0.f444 = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.lang.String[] r0 = r6.f442
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.app.Activity r1 = r6.f443
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                android.app.Activity r2 = r6.f443
                java.lang.String r2 = r2.getPackageName()
                java.lang.String[] r3 = r6.f442
                int r3 = r3.length
                r4 = 0
            L15:
                if (r4 >= r3) goto L24
                java.lang.String[] r5 = r6.f442
                r5 = r5[r4]
                int r5 = r1.checkPermission(r5, r2)
                r0[r4] = r5
                int r4 = r4 + 1
                goto L15
            L24:
                android.app.Activity r1 = r6.f443
                Yue.ۥۣ۟۟ۧ$ۥۣ۟۟۟ r1 = (Yue.C0188.InterfaceC0197) r1
                int r2 = r6.f444
                java.lang.String[] r3 = r6.f442
                r1.onRequestPermissionsResult(r2, r3, r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C0190 {
        public C0190() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m1058(android.app.Activity r0) {
                r0.finishAfterTransition()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m1059(android.app.Activity r0) {
                r0.postponeEnterTransition()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m1060(android.app.Activity r0, android.app.SharedElementCallback r1) {
                r0.setEnterSharedElementCallback(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m1061(android.app.Activity r0, android.app.SharedElementCallback r1) {
                r0.setExitSharedElementCallback(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m1062(android.app.Activity r0) {
                r0.startPostponedEnterTransition()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(22)
    public static class C0191 {
        public C0191() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.net.Uri m1063(android.app.Activity r0) {
                android.net.Uri r0 = r0.getReferrer()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C0192 {
        public C0192() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m1064(java.lang.Object r0) {
                android.app.SharedElementCallback$OnSharedElementsReadyListener r0 = (android.app.SharedElementCallback.OnSharedElementsReadyListener) r0
                r0.onSharedElementsReady()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m1065(android.app.Activity r0, java.lang.String[] r1, int r2) {
                r0.requestPermissions(r1, r2)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m1066(android.app.Activity r0, java.lang.String r1) {
                boolean r0 = r0.shouldShowRequestPermissionRationale(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C0193 {
        public C0193() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static <T> T m1067(android.app.Activity r0, int r1) {
                android.view.View r0 = r0.requireViewById(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C0194 {
        public C0194() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.view.Display m1068(android.content.ContextWrapper r0) {
                android.view.Display r0 = r0.getDisplay()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m1069(@Yue.InterfaceC4410 android.app.Activity r0, @Yue.InterfaceC4544 Yue.C3798 r1, @Yue.InterfaceC4544 android.os.Bundle r2) {
                if (r1 != 0) goto L4
                r1 = 0
                goto L8
            L4:
                android.content.LocusId r1 = r1.m15226()
            L8:
                r0.setLocusContext(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC5336(31)
    public static class C0195 {
        public C0195() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m1070(@Yue.InterfaceC4410 android.app.Activity r0) {
                boolean r0 = r0.isLaunchedFromBubble()
                return r0
        }

        @Yue.InterfaceC1947
        @android.annotation.SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m1071(android.app.Activity r4, java.lang.String r5) {
                android.app.Application r0 = r4.getApplication()     // Catch: java.lang.Throwable -> L25
                android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L25
                java.lang.Class<android.content.pm.PackageManager> r1 = android.content.pm.PackageManager.class
                java.lang.String r2 = "shouldShowRequestPermissionRationale"
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L25
                java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L25
                java.lang.Object[] r2 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L25
                java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L25
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L25
                boolean r4 = r0.booleanValue()     // Catch: java.lang.Throwable -> L25
                return r4
            L25:
                boolean r4 = r4.shouldShowRequestPermissionRationale(r5)
                return r4
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC5336(32)
    public static class C0196 {
        public C0196() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m1072(android.app.Activity r0, java.lang.String r1) {
                boolean r0 = r0.shouldShowRequestPermissionRationale(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥۣ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC0197 {
        void onRequestPermissionsResult(int r1, @Yue.InterfaceC4410 java.lang.String[] r2, @Yue.InterfaceC4410 int[] r3);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public interface InterfaceC0198 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        boolean m1073(@Yue.InterfaceC4410 android.app.Activity r1, @Yue.InterfaceC3281(from = 0) int r2, int r3, @Yue.InterfaceC4544 android.content.Intent r4);

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        boolean m1074(@Yue.InterfaceC4410 android.app.Activity r1, @Yue.InterfaceC4410 java.lang.String[] r2, @Yue.InterfaceC3281(from = 0) int r3);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public interface InterfaceC0199 {
        void validateRequestPermissionsRequestCode(int r1);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class SharedElementCallbackC0200 extends android.app.SharedElementCallback {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.AbstractC5739 f445;

        public SharedElementCallbackC0200(Yue.AbstractC5739 r1) {
                r0 = this;
                r0.<init>()
                r0.f445 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m1075(android.app.SharedElementCallback.OnSharedElementsReadyListener r0) {
                m1076(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m1076(android.app.SharedElementCallback.OnSharedElementsReadyListener r0) {
                Yue.C0188.C0192.m1064(r0)
                return
        }

        @Override // android.app.SharedElementCallback
        public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View r2, android.graphics.Matrix r3, android.graphics.RectF r4) {
                r1 = this;
                Yue.ۥۡۨۨ۟ r0 = r1.f445
                android.os.Parcelable r2 = r0.m21424(r2, r3, r4)
                return r2
        }

        @Override // android.app.SharedElementCallback
        public android.view.View onCreateSnapshotView(android.content.Context r2, android.os.Parcelable r3) {
                r1 = this;
                Yue.ۥۡۨۨ۟ r0 = r1.f445
                android.view.View r2 = r0.m21425(r2, r3)
                return r2
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(java.util.List<java.lang.String> r2, java.util.Map<java.lang.String, android.view.View> r3) {
                r1 = this;
                Yue.ۥۡۨۨ۟ r0 = r1.f445
                r0.m21426(r2, r3)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(java.util.List<android.view.View> r2) {
                r1 = this;
                Yue.ۥۡۨۨ۟ r0 = r1.f445
                r0.m21427(r2)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(java.util.List<java.lang.String> r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4) {
                r1 = this;
                Yue.ۥۡۨۨ۟ r0 = r1.f445
                r0.m21428(r2, r3, r4)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(java.util.List<java.lang.String> r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4) {
                r1 = this;
                Yue.ۥۡۨۨ۟ r0 = r1.f445
                r0.m21429(r2, r3, r4)
                return
        }

        @Override // android.app.SharedElementCallback
        @Yue.InterfaceC5336(23)
        public void onSharedElementsArrived(java.util.List<java.lang.String> r3, java.util.List<android.view.View> r4, android.app.SharedElementCallback.OnSharedElementsReadyListener r5) {
                r2 = this;
                Yue.ۥۡۨۨ۟ r0 = r2.f445
                Yue.ۥ۟۟ۧۤ r1 = new Yue.ۥ۟۟ۧۤ
                r1.<init>(r5)
                r0.m21430(r3, r4, r1)
                return
        }
    }

    public C0188() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ void m1037(android.app.Activity r0) {
            m1044(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static void m1038(@Yue.InterfaceC4410 android.app.Activity r0) {
            r0.finishAffinity()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m1039(@Yue.InterfaceC4410 android.app.Activity r0) {
            Yue.C0188.C0190.m1058(r0)
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static Yue.C0188.InterfaceC0198 m1040() {
            Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۤ r0 = Yue.C0188.f441
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static android.net.Uri m1041(@Yue.InterfaceC4410 android.app.Activity r0) {
            android.net.Uri r0 = Yue.C0188.C0191.m1063(r0)
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static boolean m1042(android.app.Activity r0) {
            r0.invalidateOptionsMenu()
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static boolean m1043(@Yue.InterfaceC4410 android.app.Activity r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r4 = Yue.C0188.C0195.m1070(r4)
            return r4
        Lb:
            r1 = 30
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L24
            android.view.Display r0 = Yue.C0188.C0194.m1068(r4)
            if (r0 == 0) goto L22
            android.view.Display r4 = Yue.C0188.C0194.m1068(r4)
            int r4 = r4.getDisplayId()
            if (r4 == 0) goto L22
            goto L23
        L22:
            r2 = r3
        L23:
            return r2
        L24:
            r1 = 29
            if (r0 != r1) goto L43
            android.view.WindowManager r0 = r4.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            if (r0 == 0) goto L41
            android.view.WindowManager r4 = r4.getWindowManager()
            android.view.Display r4 = r4.getDefaultDisplay()
            int r4 = r4.getDisplayId()
            if (r4 == 0) goto L41
            goto L42
        L41:
            r2 = r3
        L42:
            return r2
        L43:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ void m1044(android.app.Activity r1) {
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto Lf
            boolean r0 = Yue.C0212.m1116(r1)
            if (r0 != 0) goto Lf
            r1.recreate()
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static void m1045(@Yue.InterfaceC4410 android.app.Activity r0) {
            Yue.C0188.C0190.m1059(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static void m1046(@Yue.InterfaceC4410 android.app.Activity r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            r2.recreate()
            goto L1b
        La:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = r2.getMainLooper()
            r0.<init>(r1)
            Yue.ۥ۟۟ۧۢ r1 = new Yue.ۥ۟۟ۧۢ
            r1.<init>(r2)
            r0.post(r1)
        L1b:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static Yue.C1989 m1047(@Yue.InterfaceC4410 android.app.Activity r0, @Yue.InterfaceC4410 android.view.DragEvent r1) {
            Yue.ۥ۠۠۠ۡ r0 = Yue.C1989.m9208(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static void m1048(@Yue.InterfaceC4410 android.app.Activity r6, @Yue.InterfaceC4410 java.lang.String[] r7, @Yue.InterfaceC3281(from = 0) int r8) {
            Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۤ r0 = Yue.C0188.f441
            if (r0 == 0) goto Lb
            boolean r0 = r0.m1074(r6, r7, r8)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
            r2 = r1
        L12:
            int r3 = r7.length
            if (r2 >= r3) goto L57
            r3 = r7[r2]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L37
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 >= r4) goto L34
            r3 = r7[r2]
            java.lang.String r4 = "android.permission.POST_NOTIFICATIONS"
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L34
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
        L34:
            int r2 = r2 + 1
            goto L12
        L37:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Permission request for permissions "
            r8.append(r0)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r8.append(r7)
            java.lang.String r7 = " must not contain null or empty values"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L57:
            int r2 = r0.size()
            if (r2 <= 0) goto L62
            int r3 = r7.length
            int r3 = r3 - r2
            java.lang.String[] r3 = new java.lang.String[r3]
            goto L63
        L62:
            r3 = r7
        L63:
            if (r2 <= 0) goto L81
            int r4 = r7.length
            if (r2 != r4) goto L69
            return
        L69:
            r2 = r1
        L6a:
            int r4 = r7.length
            if (r1 >= r4) goto L81
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            boolean r4 = r0.contains(r4)
            if (r4 != 0) goto L7e
            int r4 = r2 + 1
            r5 = r7[r1]
            r3[r2] = r5
            r2 = r4
        L7e:
            int r1 = r1 + 1
            goto L6a
        L81:
            boolean r0 = r6 instanceof Yue.C0188.InterfaceC0199
            if (r0 == 0) goto L8b
            r0 = r6
            Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۥ r0 = (Yue.C0188.InterfaceC0199) r0
            r0.validateRequestPermissionsRequestCode(r8)
        L8b:
            Yue.C0188.C0192.m1065(r6, r7, r8)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static <T extends android.view.View> T m1049(@Yue.InterfaceC4410 android.app.Activity r2, @Yue.InterfaceC3214 int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            java.lang.Object r2 = Yue.C0188.C0193.m1067(r2, r3)
            android.view.View r2 = (android.view.View) r2
            return r2
        Ld:
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L14
            return r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ID does not reference a View inside this Activity"
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static void m1050(@Yue.InterfaceC4410 android.app.Activity r1, @Yue.InterfaceC4544 Yue.AbstractC5739 r2) {
            if (r2 == 0) goto L8
            Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۦ r0 = new Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۦ
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            Yue.C0188.C0190.m1060(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static void m1051(@Yue.InterfaceC4410 android.app.Activity r1, @Yue.InterfaceC4544 Yue.AbstractC5739 r2) {
            if (r2 == 0) goto L8
            Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۦ r0 = new Yue.ۥۣ۟۟ۧ$ۥ۟۟۟ۦ
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            Yue.C0188.C0190.m1061(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static void m1052(@Yue.InterfaceC4410 android.app.Activity r2, @Yue.InterfaceC4544 Yue.C3798 r3, @Yue.InterfaceC4544 android.os.Bundle r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L9
            Yue.C0188.C0194.m1069(r2, r3, r4)
        L9:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static void m1053(@Yue.InterfaceC4544 Yue.C0188.InterfaceC0198 r0) {
            Yue.C0188.f441 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static boolean m1054(@Yue.InterfaceC4410 android.app.Activity r2, @Yue.InterfaceC4410 java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L10
            java.lang.String r1 = "android.permission.POST_NOTIFICATIONS"
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L10
            r2 = 0
            return r2
        L10:
            r1 = 32
            if (r0 < r1) goto L19
            boolean r2 = Yue.C0188.C0196.m1072(r2, r3)
            return r2
        L19:
            r1 = 31
            if (r0 != r1) goto L22
            boolean r2 = Yue.C0188.C0195.m1071(r2, r3)
            return r2
        L22:
            boolean r2 = Yue.C0188.C0192.m1066(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static void m1055(@Yue.InterfaceC4410 android.app.Activity r0, @Yue.InterfaceC4410 android.content.Intent r1, int r2, @Yue.InterfaceC4544 android.os.Bundle r3) {
            r0.startActivityForResult(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static void m1056(@Yue.InterfaceC4410 android.app.Activity r0, @Yue.InterfaceC4410 android.content.IntentSender r1, int r2, @Yue.InterfaceC4544 android.content.Intent r3, int r4, int r5, int r6, @Yue.InterfaceC4544 android.os.Bundle r7) throws android.content.IntentSender.SendIntentException {
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m1057(@Yue.InterfaceC4410 android.app.Activity r0) {
            Yue.C0188.C0190.m1062(r0)
            return
    }
}
