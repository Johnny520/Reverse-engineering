package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class ViewOnLongClickListenerC6378 implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final java.lang.String f22529 = "TooltipCompatHandler";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final long f22530 = 2500;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final long f22531 = 15000;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final long f22532 = 3000;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static Yue.ViewOnLongClickListenerC6378 f22533;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static Yue.ViewOnLongClickListenerC6378 f22534;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final android.view.View f22535;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.lang.CharSequence f22536;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f22537;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final java.lang.Runnable f22538;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final java.lang.Runnable f22539;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f22540;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f22541;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Yue.C6379 f22542;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f22543;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f22544;

    public ViewOnLongClickListenerC6378(android.view.View r2, java.lang.CharSequence r3) {
            r1 = this;
            r1.<init>()
            Yue.ۥۣۢۡۨ r0 = new Yue.ۥۣۢۡۨ
            r0.<init>(r1)
            r1.f22538 = r0
            Yue.ۥۢۡۨۤ r0 = new Yue.ۥۢۡۨۤ
            r0.<init>(r1)
            r1.f22539 = r0
            r1.f22535 = r2
            r1.f22536 = r3
            android.content.Context r3 = r2.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = Yue.C6823.m26406(r3)
            r1.f22537 = r3
            r1.m23537()
            r2.setOnLongClickListener(r1)
            r2.setOnHoverListener(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m23533(Yue.ViewOnLongClickListenerC6378 r0) {
            r0.m23539()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m23534(Yue.ViewOnLongClickListenerC6378 r1) {
            Yue.ۥۢۡۨۥ r0 = Yue.ViewOnLongClickListenerC6378.f22533
            if (r0 == 0) goto L7
            r0.m23536()
        L7:
            Yue.ViewOnLongClickListenerC6378.f22533 = r1
            if (r1 == 0) goto Le
            r1.m23540()
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m23535(android.view.View r2, java.lang.CharSequence r3) {
            Yue.ۥۢۡۨۥ r0 = Yue.ViewOnLongClickListenerC6378.f22533
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.View r0 = r0.f22535
            if (r0 != r2) goto Lc
            m23534(r1)
        Lc:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L28
            Yue.ۥۢۡۨۥ r3 = Yue.ViewOnLongClickListenerC6378.f22534
            if (r3 == 0) goto L1d
            android.view.View r0 = r3.f22535
            if (r0 != r2) goto L1d
            r3.m23538()
        L1d:
            r2.setOnLongClickListener(r1)
            r3 = 0
            r2.setLongClickable(r3)
            r2.setOnHoverListener(r1)
            goto L2d
        L28:
            Yue.ۥۢۡۨۥ r0 = new Yue.ۥۢۡۨۥ
            r0.<init>(r2, r3)
        L2d:
            return
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            Yue.ۥۢۡۨۦ r3 = r2.f22542
            r0 = 0
            if (r3 == 0) goto La
            boolean r3 = r2.f22543
            if (r3 == 0) goto La
            return r0
        La:
            android.view.View r3 = r2.f22535
            android.content.Context r3 = r3.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            boolean r1 = r3.isEnabled()
            if (r1 == 0) goto L25
            boolean r3 = r3.isTouchExplorationEnabled()
            if (r3 == 0) goto L25
            return r0
        L25:
            int r3 = r4.getAction()
            r1 = 7
            if (r3 == r1) goto L38
            r4 = 10
            if (r3 == r4) goto L31
            goto L4d
        L31:
            r2.m23537()
            r2.m23538()
            goto L4d
        L38:
            android.view.View r3 = r2.f22535
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto L4d
            Yue.ۥۢۡۨۦ r3 = r2.f22542
            if (r3 != 0) goto L4d
            boolean r3 = r2.m23542(r4)
            if (r3 == 0) goto L4d
            m23534(r2)
        L4d:
            return r0
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View r2) {
            r1 = this;
            int r0 = r2.getWidth()
            int r0 = r0 / 2
            r1.f22540 = r0
            int r2 = r2.getHeight()
            int r2 = r2 / 2
            r1.f22541 = r2
            r2 = 1
            r1.m23541(r2)
            return r2
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r0.m23538()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m23536() {
            r2 = this;
            android.view.View r0 = r2.f22535
            java.lang.Runnable r1 = r2.f22538
            r0.removeCallbacks(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m23537() {
            r1 = this;
            r0 = 1
            r1.f22544 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m23538() {
            r3 = this;
            Yue.ۥۢۡۨۥ r0 = Yue.ViewOnLongClickListenerC6378.f22534
            r1 = 0
            if (r0 != r3) goto L20
            Yue.ViewOnLongClickListenerC6378.f22534 = r1
            Yue.ۥۢۡۨۦ r0 = r3.f22542
            if (r0 == 0) goto L19
            r0.m23545()
            r3.f22542 = r1
            r3.m23537()
            android.view.View r0 = r3.f22535
            r0.removeOnAttachStateChangeListener(r3)
            goto L20
        L19:
            java.lang.String r0 = "TooltipCompatHandler"
            java.lang.String r2 = "sActiveHandler.mPopup == null"
            android.util.Log.e(r0, r2)
        L20:
            Yue.ۥۢۡۨۥ r0 = Yue.ViewOnLongClickListenerC6378.f22533
            if (r0 != r3) goto L27
            m23534(r1)
        L27:
            android.view.View r0 = r3.f22535
            java.lang.Runnable r1 = r3.f22539
            r0.removeCallbacks(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final /* synthetic */ void m23539() {
            r1 = this;
            r0 = 0
            r1.m23541(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m23540() {
            r4 = this;
            android.view.View r0 = r4.f22535
            java.lang.Runnable r1 = r4.f22538
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m23541(boolean r8) {
            r7 = this;
            android.view.View r0 = r7.f22535
            boolean r0 = r0.isAttachedToWindow()
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 0
            m23534(r0)
            Yue.ۥۢۡۨۥ r0 = Yue.ViewOnLongClickListenerC6378.f22534
            if (r0 == 0) goto L14
            r0.m23538()
        L14:
            Yue.ViewOnLongClickListenerC6378.f22534 = r7
            r7.f22543 = r8
            Yue.ۥۢۡۨۦ r1 = new Yue.ۥۢۡۨۦ
            android.view.View r8 = r7.f22535
            android.content.Context r8 = r8.getContext()
            r1.<init>(r8)
            r7.f22542 = r1
            android.view.View r2 = r7.f22535
            int r3 = r7.f22540
            int r4 = r7.f22541
            boolean r5 = r7.f22543
            java.lang.CharSequence r6 = r7.f22536
            r1.m23547(r2, r3, r4, r5, r6)
            android.view.View r8 = r7.f22535
            r8.addOnAttachStateChangeListener(r7)
            boolean r8 = r7.f22543
            if (r8 == 0) goto L3e
            r0 = 2500(0x9c4, double:1.235E-320)
            goto L5a
        L3e:
            android.view.View r8 = r7.f22535
            int r8 = Yue.C6794.m26169(r8)
            r0 = 1
            r8 = r8 & r0
            if (r8 != r0) goto L52
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r0 = (long) r8
            r2 = 3000(0xbb8, double:1.482E-320)
        L4f:
            long r0 = r2 - r0
            goto L5a
        L52:
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r0 = (long) r8
            r2 = 15000(0x3a98, double:7.411E-320)
            goto L4f
        L5a:
            android.view.View r8 = r7.f22535
            java.lang.Runnable r2 = r7.f22539
            r8.removeCallbacks(r2)
            android.view.View r8 = r7.f22535
            java.lang.Runnable r2 = r7.f22539
            r8.postDelayed(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m23542(android.view.MotionEvent r5) {
            r4 = this;
            float r0 = r5.getX()
            int r0 = (int) r0
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r4.f22544
            r2 = 0
            if (r1 != 0) goto L29
            int r1 = r4.f22540
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r3 = r4.f22537
            if (r1 > r3) goto L29
            int r1 = r4.f22541
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r3 = r4.f22537
            if (r1 <= r3) goto L28
            goto L29
        L28:
            return r2
        L29:
            r4.f22540 = r0
            r4.f22541 = r5
            r4.f22544 = r2
            r5 = 1
            return r5
    }
}
