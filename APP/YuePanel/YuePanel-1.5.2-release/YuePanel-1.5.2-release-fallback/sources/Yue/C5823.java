package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5823 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C5823.C5826 f21346;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(20)
    public static class C5824 extends Yue.C5823.C5826 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public final android.view.View f21347;

        public C5824(@Yue.InterfaceC4544 android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.f21347 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m21671(android.view.View r0) {
                m21672(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m21672(android.view.View r2) {
                android.content.Context r0 = r2.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                r0.showSoftInput(r2, r1)
                return
        }

        @Override // Yue.C5823.C5826
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo21673() {
                r3 = this;
                android.view.View r0 = r3.f21347
                if (r0 == 0) goto L1a
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                android.view.View r1 = r3.f21347
                android.os.IBinder r1 = r1.getWindowToken()
                r2 = 0
                r0.hideSoftInputFromWindow(r1, r2)
            L1a:
                return
        }

        @Override // Yue.C5823.C5826
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void mo21674() {
                r2 = this;
                android.view.View r0 = r2.f21347
                if (r0 != 0) goto L5
                return
            L5:
                boolean r1 = r0.isInEditMode()
                if (r1 != 0) goto L1b
                boolean r1 = r0.onCheckIsTextEditor()
                if (r1 == 0) goto L12
                goto L1b
            L12:
                android.view.View r0 = r0.getRootView()
                android.view.View r0 = r0.findFocus()
                goto L1e
            L1b:
                r0.requestFocus()
            L1e:
                if (r0 != 0) goto L2d
                android.view.View r0 = r2.f21347
                android.view.View r0 = r0.getRootView()
                r1 = 16908290(0x1020002, float:2.3877235E-38)
                android.view.View r0 = r0.findViewById(r1)
            L2d:
                if (r0 == 0) goto L3d
                boolean r1 = r0.hasWindowFocus()
                if (r1 == 0) goto L3d
                Yue.ۥۢ۟ۢۥ r1 = new Yue.ۥۢ۟ۢۥ
                r1.<init>(r0)
                r0.post(r1)
            L3d:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢۦ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C5825 extends Yue.C5823.C5824 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public android.view.View f21348;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public android.view.WindowInsetsController f21349;

        public C5825(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                r0.f21348 = r1
                return
        }

        public C5825(@Yue.InterfaceC4544 android.view.WindowInsetsController r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f21349 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m21675(java.util.concurrent.atomic.AtomicBoolean r0, android.view.WindowInsetsController r1, int r2) {
                m21676(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ void m21676(java.util.concurrent.atomic.AtomicBoolean r0, android.view.WindowInsetsController r1, int r2) {
                r1 = r2 & 8
                if (r1 == 0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                r0.set(r1)
                return
        }

        @Override // Yue.C5823.C5824, Yue.C5823.C5826
        /* JADX INFO: renamed from: ۥ */
        public void mo21673() {
                r5 = this;
                android.view.WindowInsetsController r0 = r5.f21349
                if (r0 == 0) goto L5
                goto Lf
            L5:
                android.view.View r0 = r5.f21348
                if (r0 == 0) goto Le
                android.view.WindowInsetsController r0 = Yue.C5827.m21677(r0)
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto L49
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r2 = 0
                r1.<init>(r2)
                Yue.ۥۣۢ۟ۢ r3 = new Yue.ۥۣۢ۟ۢ
                r3.<init>(r1)
                Yue.C5830.m21680(r0, r3)
                boolean r1 = r1.get()
                if (r1 != 0) goto L3e
                android.view.View r1 = r5.f21348
                if (r1 == 0) goto L3e
                android.content.Context r1 = r1.getContext()
                java.lang.String r4 = "input_method"
                java.lang.Object r1 = r1.getSystemService(r4)
                android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
                android.view.View r4 = r5.f21348
                android.os.IBinder r4 = r4.getWindowToken()
                r1.hideSoftInputFromWindow(r4, r2)
            L3e:
                Yue.C5831.m21681(r0, r3)
                int r1 = Yue.C5828.m21678()
                Yue.C5832.m21682(r0, r1)
                goto L4c
            L49:
                super.mo21673()
            L4c:
                return
        }

        @Override // Yue.C5823.C5824, Yue.C5823.C5826
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo21674() {
                r3 = this;
                android.view.View r0 = r3.f21348
                if (r0 == 0) goto L19
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 33
                if (r1 >= r2) goto L19
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r0.isActive()
            L19:
                android.view.WindowInsetsController r0 = r3.f21349
                if (r0 == 0) goto L1e
                goto L28
            L1e:
                android.view.View r0 = r3.f21348
                if (r0 == 0) goto L27
                android.view.WindowInsetsController r0 = Yue.C5827.m21677(r0)
                goto L28
            L27:
                r0 = 0
            L28:
                if (r0 == 0) goto L32
                int r1 = Yue.C5828.m21678()
                Yue.C5829.m21679(r0, r1)
                goto L35
            L32:
                super.mo21674()
            L35:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢۦ$ۥ۟۟, reason: contains not printable characters */
    public static class C5826 {
        public C5826() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public void mo21673() {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void mo21674() {
                r0 = this;
                return
        }
    }

    public C5823(@Yue.InterfaceC4410 android.view.View r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            Yue.ۥۢ۟ۢۦ$ۥ۟ r0 = new Yue.ۥۢ۟ۢۦ$ۥ۟
            r0.<init>(r3)
            r2.f21346 = r0
            goto L18
        L11:
            Yue.ۥۢ۟ۢۦ$ۥ r0 = new Yue.ۥۢ۟ۢۦ$ۥ
            r0.<init>(r3)
            r2.f21346 = r0
        L18:
            return
    }

    @Yue.InterfaceC5336(30)
    @java.lang.Deprecated
    public C5823(@Yue.InterfaceC4410 android.view.WindowInsetsController r2) {
            r1 = this;
            r1.<init>()
            Yue.ۥۢ۟ۢۦ$ۥ۟ r0 = new Yue.ۥۢ۟ۢۦ$ۥ۟
            r0.<init>(r2)
            r1.f21346 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m21669() {
            r1 = this;
            Yue.ۥۢ۟ۢۦ$ۥ۟۟ r0 = r1.f21346
            r0.mo21673()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m21670() {
            r1 = this;
            Yue.ۥۢ۟ۢۦ$ۥ۟۟ r0 = r1.f21346
            r0.mo21674()
            return
    }
}
