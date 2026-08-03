package androidx.appcompat.view.menu;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC7333 extends Yue.AbstractC4138 implements androidx.appcompat.view.menu.InterfaceC7352, android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final int f25379 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final int f25380 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f25381 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f25382 = 200;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final android.content.Context f25383;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f25384;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f25385;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int f25386;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean f25387;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final android.os.Handler f25388;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final java.util.List<androidx.appcompat.view.menu.C7343> f25389;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final java.util.List<androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338> f25390;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f25391;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final android.view.View.OnAttachStateChangeListener f25392;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final Yue.InterfaceC4129 f25393;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int f25394;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public int f25395;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public android.view.View f25396;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public android.view.View f25397;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int f25398;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean f25399;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean f25400;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public int f25401;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int f25402;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public boolean f25403;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public boolean f25404;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 f25405;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public android.view.ViewTreeObserver f25406;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public android.widget.PopupWindow.OnDismissListener f25407;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public boolean f25408;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟$ۥ, reason: contains not printable characters */
    public class ViewTreeObserverOnGlobalLayoutListenerC7334 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC7333 f25409;

        public ViewTreeObserverOnGlobalLayoutListenerC7334(androidx.appcompat.view.menu.ViewOnKeyListenerC7333 r1) {
                r0 = this;
                r0.f25409 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r2 = this;
                androidx.appcompat.view.menu.ۥ۟ r0 = r2.f25409
                boolean r0 = r0.mo14691()
                if (r0 == 0) goto L51
                androidx.appcompat.view.menu.ۥ۟ r0 = r2.f25409
                java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r0.f25390
                int r0 = r0.size()
                if (r0 <= 0) goto L51
                androidx.appcompat.view.menu.ۥ۟ r0 = r2.f25409
                java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r0.f25390
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r0 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r0
                Yue.ۥۡ۠ۦۨ r0 = r0.f25416
                boolean r0 = r0.m14717()
                if (r0 != 0) goto L51
                androidx.appcompat.view.menu.ۥ۟ r0 = r2.f25409
                android.view.View r0 = r0.f25397
                if (r0 == 0) goto L4c
                boolean r0 = r0.isShown()
                if (r0 != 0) goto L32
                goto L4c
            L32:
                androidx.appcompat.view.menu.ۥ۟ r0 = r2.f25409
                java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r0.f25390
                java.util.Iterator r0 = r0.iterator()
            L3a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L51
                java.lang.Object r1 = r0.next()
                androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r1 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r1
                Yue.ۥۡ۠ۦۨ r1 = r1.f25416
                r1.show()
                goto L3a
            L4c:
                androidx.appcompat.view.menu.ۥ۟ r0 = r2.f25409
                r0.dismiss()
            L51:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟$ۥ۟, reason: contains not printable characters */
    public class ViewOnAttachStateChangeListenerC7335 implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC7333 f25410;

        public ViewOnAttachStateChangeListenerC7335(androidx.appcompat.view.menu.ViewOnKeyListenerC7333 r1) {
                r0 = this;
                r0.f25410 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r3) {
                r2 = this;
                androidx.appcompat.view.menu.ۥ۟ r0 = r2.f25410
                android.view.ViewTreeObserver r0 = r0.f25406
                if (r0 == 0) goto L1d
                boolean r0 = r0.isAlive()
                if (r0 != 0) goto L14
                androidx.appcompat.view.menu.ۥ۟ r0 = r2.f25410
                android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
                r0.f25406 = r1
            L14:
                androidx.appcompat.view.menu.ۥ۟ r0 = r2.f25410
                android.view.ViewTreeObserver r1 = r0.f25406
                android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r0.f25391
                r1.removeGlobalOnLayoutListener(r0)
            L1d:
                r3.removeOnAttachStateChangeListener(r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟$ۥ۟۟, reason: contains not printable characters */
    public class C7336 implements Yue.InterfaceC4129 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC7333 f25411;

        /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟$ۥ۟۟$ۥ, reason: contains not printable characters */
        public class RunnableC7337 implements java.lang.Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338 f25412;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ android.view.MenuItem f25413;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ androidx.appcompat.view.menu.C7343 f25414;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7336 f25415;

            public RunnableC7337(androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7336 r1, androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338 r2, android.view.MenuItem r3, androidx.appcompat.view.menu.C7343 r4) {
                    r0 = this;
                    r0.f25415 = r1
                    r0.f25412 = r2
                    r0.f25413 = r3
                    r0.f25414 = r4
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r0 = r3.f25412
                    if (r0 == 0) goto L17
                    androidx.appcompat.view.menu.ۥ۟$ۥ۟۟ r1 = r3.f25415
                    androidx.appcompat.view.menu.ۥ۟ r1 = r1.f25411
                    r2 = 1
                    r1.f25408 = r2
                    androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r0.f25417
                    r1 = 0
                    r0.close(r1)
                    androidx.appcompat.view.menu.ۥ۟$ۥ۟۟ r0 = r3.f25415
                    androidx.appcompat.view.menu.ۥ۟ r0 = r0.f25411
                    r0.f25408 = r1
                L17:
                    android.view.MenuItem r0 = r3.f25413
                    boolean r0 = r0.isEnabled()
                    if (r0 == 0) goto L2f
                    android.view.MenuItem r0 = r3.f25413
                    boolean r0 = r0.hasSubMenu()
                    if (r0 == 0) goto L2f
                    androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r3.f25414
                    android.view.MenuItem r1 = r3.f25413
                    r2 = 4
                    r0.performItemAction(r1, r2)
                L2f:
                    return
            }
        }

        public C7336(androidx.appcompat.view.menu.ViewOnKeyListenerC7333 r1) {
                r0 = this;
                r0.f25411 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC4129
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo16206(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r6, @Yue.InterfaceC4410 android.view.MenuItem r7) {
                r5 = this;
                androidx.appcompat.view.menu.ۥ۟ r0 = r5.f25411
                android.os.Handler r0 = r0.f25388
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.ۥ۟ r0 = r5.f25411
                java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r0.f25390
                int r0 = r0.size()
                r2 = 0
            L11:
                r3 = -1
                if (r2 >= r0) goto L26
                androidx.appcompat.view.menu.ۥ۟ r4 = r5.f25411
                java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r4 = r4.f25390
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r4 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r4
                androidx.appcompat.view.menu.ۥ۟۟۟۟ r4 = r4.f25417
                if (r6 != r4) goto L23
                goto L27
            L23:
                int r2 = r2 + 1
                goto L11
            L26:
                r2 = r3
            L27:
                if (r2 != r3) goto L2a
                return
            L2a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.ۥ۟ r0 = r5.f25411
                java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r0.f25390
                int r0 = r0.size()
                if (r2 >= r0) goto L41
                androidx.appcompat.view.menu.ۥ۟ r0 = r5.f25411
                java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r0.f25390
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r1 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r1
            L41:
                androidx.appcompat.view.menu.ۥ۟$ۥ۟۟$ۥ r0 = new androidx.appcompat.view.menu.ۥ۟$ۥ۟۟$ۥ
                r0.<init>(r5, r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.ۥ۟ r7 = r5.f25411
                android.os.Handler r7 = r7.f25388
                r7.postAtTime(r0, r6, r1)
                return
        }

        @Override // Yue.InterfaceC4129
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo16207(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r1, @Yue.InterfaceC4410 android.view.MenuItem r2) {
                r0 = this;
                androidx.appcompat.view.menu.ۥ۟ r2 = r0.f25411
                android.os.Handler r2 = r2.f25388
                r2.removeCallbacksAndMessages(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class C7338 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C4139 f25416;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final androidx.appcompat.view.menu.C7343 f25417;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f25418;

        public C7338(@Yue.InterfaceC4410 Yue.C4139 r1, @Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f25416 = r1
                r0.f25417 = r2
                r0.f25418 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.widget.ListView m28188() {
                r1 = this;
                Yue.ۥۡ۠ۦۨ r0 = r1.f25416
                android.widget.ListView r0 = r0.mo14695()
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC7339 {
    }

    static {
            int r0 = Yue.C5058.C5068.f17197
            androidx.appcompat.view.menu.ViewOnKeyListenerC7333.f25379 = r0
            return
    }

    public ViewOnKeyListenerC7333(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC0642 int r4, @Yue.InterfaceC6018 int r5, boolean r6) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f25389 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f25390 = r0
            androidx.appcompat.view.menu.ۥ۟$ۥ r0 = new androidx.appcompat.view.menu.ۥ۟$ۥ
            r0.<init>(r1)
            r1.f25391 = r0
            androidx.appcompat.view.menu.ۥ۟$ۥ۟ r0 = new androidx.appcompat.view.menu.ۥ۟$ۥ۟
            r0.<init>(r1)
            r1.f25392 = r0
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟ r0 = new androidx.appcompat.view.menu.ۥ۟$ۥ۟۟
            r0.<init>(r1)
            r1.f25393 = r0
            r0 = 0
            r1.f25394 = r0
            r1.f25395 = r0
            r1.f25383 = r2
            r1.f25396 = r3
            r1.f25385 = r4
            r1.f25386 = r5
            r1.f25387 = r6
            r1.f25403 = r0
            int r3 = r1.m28185()
            r1.f25398 = r3
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r3 = r2.getDisplayMetrics()
            int r3 = r3.widthPixels
            int r3 = r3 / 2
            int r4 = Yue.C5058.C5063.f16933
            int r2 = r2.getDimensionPixelSize(r4)
            int r2 = java.lang.Math.max(r3, r2)
            r1.f25384 = r2
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r1.f25388 = r2
            return
    }

    @Override // Yue.InterfaceC5782
    public void dismiss() {
            r4 = this;
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r4.f25390
            int r0 = r0.size()
            if (r0 <= 0) goto L28
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r1 = r4.f25390
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟[] r2 = new androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338[r0]
            java.lang.Object[] r1 = r1.toArray(r2)
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟[] r1 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338[]) r1
            int r0 = r0 + (-1)
        L14:
            if (r0 < 0) goto L28
            r2 = r1[r0]
            Yue.ۥۡ۠ۦۨ r3 = r2.f25416
            boolean r3 = r3.mo14691()
            if (r3 == 0) goto L25
            Yue.ۥۡ۠ۦۨ r2 = r2.f25416
            r2.dismiss()
        L25:
            int r0 = r0 + (-1)
            goto L14
        L28:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean flagActionItems() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void onCloseMenu(androidx.appcompat.view.menu.C7343 r6, boolean r7) {
            r5 = this;
            int r0 = r5.m28182(r6)
            if (r0 >= 0) goto L7
            return
        L7:
            int r1 = r0 + 1
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r2 = r5.f25390
            int r2 = r2.size()
            r3 = 0
            if (r1 >= r2) goto L1f
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r2 = r5.f25390
            java.lang.Object r1 = r2.get(r1)
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r1 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r1
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = r1.f25417
            r1.close(r3)
        L1f:
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r1 = r5.f25390
            java.lang.Object r0 = r1.remove(r0)
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r0 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r0
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = r0.f25417
            r1.removeMenuPresenter(r5)
            boolean r1 = r5.f25408
            r2 = 0
            if (r1 == 0) goto L3b
            Yue.ۥۡ۠ۦۨ r1 = r0.f25416
            r1.m16238(r2)
            Yue.ۥۡ۠ۦۨ r1 = r0.f25416
            r1.m14725(r3)
        L3b:
            Yue.ۥۡ۠ۦۨ r0 = r0.f25416
            r0.dismiss()
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r5.f25390
            int r0 = r0.size()
            if (r0 <= 0) goto L57
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r1 = r5.f25390
            int r4 = r0 + (-1)
            java.lang.Object r1 = r1.get(r4)
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r1 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r1
            int r1 = r1.f25418
            r5.f25398 = r1
            goto L5d
        L57:
            int r1 = r5.m28185()
            r5.f25398 = r1
        L5d:
            if (r0 != 0) goto L8a
            r5.dismiss()
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r7 = r5.f25405
            if (r7 == 0) goto L6a
            r0 = 1
            r7.onCloseMenu(r6, r0)
        L6a:
            android.view.ViewTreeObserver r6 = r5.f25406
            if (r6 == 0) goto L7d
            boolean r6 = r6.isAlive()
            if (r6 == 0) goto L7b
            android.view.ViewTreeObserver r6 = r5.f25406
            android.view.ViewTreeObserver$OnGlobalLayoutListener r7 = r5.f25391
            r6.removeGlobalOnLayoutListener(r7)
        L7b:
            r5.f25406 = r2
        L7d:
            android.view.View r6 = r5.f25397
            android.view.View$OnAttachStateChangeListener r7 = r5.f25392
            r6.removeOnAttachStateChangeListener(r7)
            android.widget.PopupWindow$OnDismissListener r6 = r5.f25407
            r6.onDismiss()
            goto L99
        L8a:
            if (r7 == 0) goto L99
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r6 = r5.f25390
            java.lang.Object r6 = r6.get(r3)
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r6 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r6
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r6 = r6.f25417
            r6.close(r3)
        L99:
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
            r5 = this;
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r5.f25390
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1e
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r3 = r5.f25390
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r3 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r3
            Yue.ۥۡ۠ۦۨ r4 = r3.f25416
            boolean r4 = r4.mo14691()
            if (r4 != 0) goto L1b
            goto L1f
        L1b:
            int r2 = r2 + 1
            goto L8
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L26
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r3.f25417
            r0.close(r1)
        L26:
            return
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            r3 = 1
            if (r1 != r3) goto Lf
            r1 = 82
            if (r2 != r1) goto Lf
            r0.dismiss()
            return r3
        Lf:
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void onRestoreInstanceState(android.os.Parcelable r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public android.os.Parcelable onSaveInstanceState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuC7359 r5) {
            r4 = this;
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r4.f25390
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r1 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r1
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r3 = r1.f25417
            if (r5 != r3) goto L6
            android.widget.ListView r5 = r1.m28188()
            r5.requestFocus()
            return r2
        L1f:
            boolean r0 = r5.hasVisibleItems()
            if (r0 == 0) goto L30
            r4.mo16226(r5)
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r0 = r4.f25405
            if (r0 == 0) goto L2f
            r0.mo28095(r5)
        L2f:
            return r2
        L30:
            r5 = 0
            return r5
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void setCallback(androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 r1) {
            r0 = this;
            r0.f25405 = r1
            return
    }

    @Override // Yue.InterfaceC5782
    public void show() {
            r2 = this;
            boolean r0 = r2.mo14691()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.List<androidx.appcompat.view.menu.ۥ۟۟۟۟> r0 = r2.f25389
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = (androidx.appcompat.view.menu.C7343) r1
            r2.m28187(r1)
            goto Ld
        L1d:
            java.util.List<androidx.appcompat.view.menu.ۥ۟۟۟۟> r0 = r2.f25389
            r0.clear()
            android.view.View r0 = r2.f25396
            r2.f25397 = r0
            if (r0 == 0) goto L43
            android.view.ViewTreeObserver r1 = r2.f25406
            if (r1 != 0) goto L2e
            r1 = 1
            goto L2f
        L2e:
            r1 = 0
        L2f:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.f25406 = r0
            if (r1 == 0) goto L3c
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.f25391
            r0.addOnGlobalLayoutListener(r1)
        L3c:
            android.view.View r0 = r2.f25397
            android.view.View$OnAttachStateChangeListener r1 = r2.f25392
            r0.addOnAttachStateChangeListener(r1)
        L43:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void updateMenuView(boolean r2) {
            r1 = this;
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r2 = r1.f25390
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r0 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r0
            android.widget.ListView r0 = r0.m28188()
            android.widget.ListAdapter r0 = r0.getAdapter()
            androidx.appcompat.view.menu.ۥ۟۟۟ r0 = Yue.AbstractC4138.m16225(r0)
            r0.notifyDataSetChanged()
            goto L6
        L22:
            return
    }

    @Override // Yue.InterfaceC5782
    /* JADX INFO: renamed from: ۥ */
    public boolean mo14691() {
            r2 = this;
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r2.f25390
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto L1a
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r2.f25390
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r0 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r0
            Yue.ۥۡ۠ۦۨ r0 = r0.f25416
            boolean r0 = r0.mo14691()
            if (r0 == 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo16226(androidx.appcompat.view.menu.C7343 r2) {
            r1 = this;
            android.content.Context r0 = r1.f25383
            r2.addMenuPresenter(r1, r0)
            boolean r0 = r1.mo14691()
            if (r0 == 0) goto Lf
            r1.m28187(r2)
            goto L14
        Lf:
            java.util.List<androidx.appcompat.view.menu.ۥ۟۟۟۟> r0 = r1.f25389
            r0.add(r2)
        L14:
            return
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo16227() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo16229(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.f25396
            if (r0 == r2) goto L12
            r1.f25396 = r2
            int r0 = r1.f25394
            int r2 = r2.getLayoutDirection()
            int r2 = Yue.C2911.m12423(r0, r2)
            r1.f25395 = r2
        L12:
            return
    }

    @Override // Yue.InterfaceC5782
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public android.widget.ListView mo14695() {
            r2 = this;
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r2.f25390
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            goto L1c
        La:
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r2.f25390
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r0 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r0
            android.widget.ListView r0 = r0.m28188()
        L1c:
            return r0
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo16231(boolean r1) {
            r0 = this;
            r0.f25403 = r1
            return
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo16232(int r2) {
            r1 = this;
            int r0 = r1.f25394
            if (r0 == r2) goto L12
            r1.f25394 = r2
            android.view.View r0 = r1.f25396
            int r0 = r0.getLayoutDirection()
            int r2 = Yue.C2911.m12423(r2, r0)
            r1.f25395 = r2
        L12:
            return
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo16233(int r2) {
            r1 = this;
            r0 = 1
            r1.f25399 = r0
            r1.f25401 = r2
            return
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo16234(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f25407 = r1
            return
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo16235(boolean r1) {
            r0 = this;
            r0.f25404 = r1
            return
    }

    @Override // Yue.AbstractC4138
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo16236(int r2) {
            r1 = this;
            r0 = 1
            r1.f25400 = r0
            r1.f25402 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final Yue.C4139 m28181() {
            r5 = this;
            Yue.ۥۡ۠ۦۨ r0 = new Yue.ۥۡ۠ۦۨ
            android.content.Context r1 = r5.f25383
            int r2 = r5.f25385
            int r3 = r5.f25386
            r4 = 0
            r0.<init>(r1, r4, r2, r3)
            Yue.ۥۡ۠ۦۤ r1 = r5.f25393
            r0.m16239(r1)
            r0.m14737(r5)
            r0.m14736(r5)
            android.view.View r1 = r5.f25396
            r0.m14724(r1)
            int r1 = r5.f25395
            r0.m14728(r1)
            r1 = 1
            r0.m14735(r1)
            r1 = 2
            r0.m14732(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final int m28182(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r4) {
            r3 = this;
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r3.f25390
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r2 = r3.f25390
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r2 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r2
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r2 = r2.f25417
            if (r4 != r2) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            r4 = -1
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final android.view.MenuItem m28183(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r5, @Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r6) {
            r4 = this;
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            android.view.MenuItem r2 = r5.getItem(r1)
            boolean r3 = r2.hasSubMenu()
            if (r3 == 0) goto L18
            android.view.SubMenu r3 = r2.getSubMenu()
            if (r6 != r3) goto L18
            return r2
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            r5 = 0
            return r5
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final android.view.View m28184(@Yue.InterfaceC4410 androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338 r8, @Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r9) {
            r7 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r8.f25417
            android.view.MenuItem r9 = r7.m28183(r0, r9)
            r0 = 0
            if (r9 != 0) goto La
            return r0
        La:
            android.widget.ListView r8 = r8.m28188()
            android.widget.ListAdapter r1 = r8.getAdapter()
            boolean r2 = r1 instanceof android.widget.HeaderViewListAdapter
            r3 = 0
            if (r2 == 0) goto L24
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            int r2 = r1.getHeadersCount()
            android.widget.ListAdapter r1 = r1.getWrappedAdapter()
            androidx.appcompat.view.menu.ۥ۟۟۟ r1 = (androidx.appcompat.view.menu.C7342) r1
            goto L27
        L24:
            androidx.appcompat.view.menu.ۥ۟۟۟ r1 = (androidx.appcompat.view.menu.C7342) r1
            r2 = r3
        L27:
            int r4 = r1.getCount()
        L2b:
            r5 = -1
            if (r3 >= r4) goto L38
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r6 = r1.m28200(r3)
            if (r9 != r6) goto L35
            goto L39
        L35:
            int r3 = r3 + 1
            goto L2b
        L38:
            r3 = r5
        L39:
            if (r3 != r5) goto L3c
            return r0
        L3c:
            int r3 = r3 + r2
            int r9 = r8.getFirstVisiblePosition()
            int r3 = r3 - r9
            if (r3 < 0) goto L50
            int r9 = r8.getChildCount()
            if (r3 < r9) goto L4b
            goto L50
        L4b:
            android.view.View r8 = r8.getChildAt(r3)
            return r8
        L50:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int m28185() {
            r2 = this;
            android.view.View r0 = r2.f25396
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto La
            r1 = 0
        La:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int m28186(int r7) {
            r6 = this;
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r0 = r6.f25390
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r0 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r0
            android.widget.ListView r0 = r0.m28188()
            r1 = 2
            int[] r1 = new int[r1]
            r0.getLocationOnScreen(r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.view.View r4 = r6.f25397
            r4.getWindowVisibleDisplayFrame(r3)
            int r4 = r6.f25398
            r5 = 0
            if (r4 != r2) goto L35
            r1 = r1[r5]
            int r0 = r0.getWidth()
            int r1 = r1 + r0
            int r1 = r1 + r7
            int r7 = r3.right
            if (r1 <= r7) goto L34
            return r5
        L34:
            return r2
        L35:
            r0 = r1[r5]
            int r0 = r0 - r7
            if (r0 >= 0) goto L3b
            return r2
        L3b:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m28187(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r12) {
            r11 = this;
            android.content.Context r0 = r11.f25383
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            androidx.appcompat.view.menu.ۥ۟۟۟ r1 = new androidx.appcompat.view.menu.ۥ۟۟۟
            boolean r2 = r11.f25387
            int r3 = androidx.appcompat.view.menu.ViewOnKeyListenerC7333.f25379
            r1.<init>(r12, r0, r2, r3)
            boolean r2 = r11.mo14691()
            r3 = 1
            if (r2 != 0) goto L1e
            boolean r2 = r11.f25403
            if (r2 == 0) goto L1e
            r1.m28201(r3)
            goto L2b
        L1e:
            boolean r2 = r11.mo14691()
            if (r2 == 0) goto L2b
            boolean r2 = Yue.AbstractC4138.m16224(r12)
            r1.m28201(r2)
        L2b:
            android.content.Context r2 = r11.f25383
            int r4 = r11.f25384
            r5 = 0
            int r2 = Yue.AbstractC4138.m16223(r1, r5, r2, r4)
            Yue.ۥۡ۠ۦۨ r4 = r11.m28181()
            r4.mo1764(r1)
            r4.m14726(r2)
            int r1 = r11.f25395
            r4.m14728(r1)
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r1 = r11.f25390
            int r1 = r1.size()
            if (r1 <= 0) goto L5d
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r1 = r11.f25390
            int r6 = r1.size()
            int r6 = r6 - r3
            java.lang.Object r1 = r1.get(r6)
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r1 = (androidx.appcompat.view.menu.ViewOnKeyListenerC7333.C7338) r1
            android.view.View r6 = r11.m28184(r1, r12)
            goto L5f
        L5d:
            r1 = r5
            r6 = r1
        L5f:
            r7 = 0
            if (r6 == 0) goto L99
            r4.m16240(r7)
            r4.m16237(r5)
            int r8 = r11.m28186(r2)
            if (r8 != r3) goto L70
            r9 = r3
            goto L71
        L70:
            r9 = r7
        L71:
            r11.f25398 = r8
            r4.m14724(r6)
            int r8 = r11.f25395
            r10 = 5
            r8 = r8 & r10
            if (r8 != r10) goto L86
            if (r9 == 0) goto L7f
            goto L8f
        L7f:
            int r2 = r6.getWidth()
            int r2 = 0 - r2
            goto L8f
        L86:
            if (r9 == 0) goto L8d
            int r2 = r6.getWidth()
            goto L8f
        L8d:
            int r2 = 0 - r2
        L8f:
            r4.m14693(r2)
            r4.m14739(r3)
            r4.m14696(r7)
            goto Lb2
        L99:
            boolean r2 = r11.f25399
            if (r2 == 0) goto La2
            int r2 = r11.f25401
            r4.m14693(r2)
        La2:
            boolean r2 = r11.f25400
            if (r2 == 0) goto Lab
            int r2 = r11.f25402
            r4.m14696(r2)
        Lab:
            android.graphics.Rect r2 = r11.m16228()
            r4.m14729(r2)
        Lb2:
            androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟ r2 = new androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟
            int r3 = r11.f25398
            r2.<init>(r4, r12, r3)
            java.util.List<androidx.appcompat.view.menu.ۥ۟$ۥ۟۟۟> r3 = r11.f25390
            r3.add(r2)
            r4.show()
            android.widget.ListView r2 = r4.mo14695()
            r2.setOnKeyListener(r11)
            if (r1 != 0) goto Lf5
            boolean r1 = r11.f25404
            if (r1 == 0) goto Lf5
            java.lang.CharSequence r1 = r12.getHeaderTitle()
            if (r1 == 0) goto Lf5
            int r1 = Yue.C5058.C5068.f17204
            android.view.View r0 = r0.inflate(r1, r2, r7)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.setEnabled(r7)
            java.lang.CharSequence r12 = r12.getHeaderTitle()
            r1.setText(r12)
            r2.addHeaderView(r0, r5, r7)
            r4.show()
        Lf5:
            return
    }
}
