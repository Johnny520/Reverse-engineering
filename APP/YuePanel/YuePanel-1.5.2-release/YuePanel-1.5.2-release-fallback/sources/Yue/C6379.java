package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C6379 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f22545 = "TooltipPopup";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f22546;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.view.View f22547;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.widget.TextView f22548;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final android.view.WindowManager.LayoutParams f22549;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final android.graphics.Rect f22550;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int[] f22551;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int[] f22552;

    public C6379(@Yue.InterfaceC4410 android.content.Context r5) {
            r4 = this;
            r4.<init>()
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r4.f22549 = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.f22550 = r1
            r1 = 2
            int[] r2 = new int[r1]
            r4.f22551 = r2
            int[] r1 = new int[r1]
            r4.f22552 = r1
            r4.f22546 = r5
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            int r2 = Yue.C5058.C5068.f17213
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            r4.f22547 = r1
            int r2 = Yue.C5058.C5065.f17131
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4.f22548 = r1
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.setTitle(r1)
            java.lang.String r5 = r5.getPackageName()
            r0.packageName = r5
            r5 = 1002(0x3ea, float:1.404E-42)
            r0.type = r5
            r5 = -2
            r0.width = r5
            r0.height = r5
            r5 = -3
            r0.format = r5
            int r5 = Yue.C5058.C5070.f17250
            r0.windowAnimations = r5
            r5 = 24
            r0.flags = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.view.View m23543(android.view.View r3) {
            android.view.View r0 = r3.getRootView()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.view.WindowManager.LayoutParams
            if (r2 == 0) goto L14
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1
            int r1 = r1.type
            r2 = 2
            if (r1 != r2) goto L14
            return r0
        L14:
            android.content.Context r3 = r3.getContext()
        L18:
            boolean r1 = r3 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L32
            boolean r1 = r3 instanceof android.app.Activity
            if (r1 == 0) goto L2b
            android.app.Activity r3 = (android.app.Activity) r3
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            return r3
        L2b:
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            goto L18
        L32:
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m23544(android.view.View r9, int r10, int r11, boolean r12, android.view.WindowManager.LayoutParams r13) {
            r8 = this;
            android.os.IBinder r0 = r9.getApplicationWindowToken()
            r13.token = r0
            android.content.Context r0 = r8.f22546
            android.content.res.Resources r0 = r0.getResources()
            int r1 = Yue.C5058.C5063.f17004
            int r0 = r0.getDimensionPixelOffset(r1)
            int r1 = r9.getWidth()
            if (r1 < r0) goto L19
            goto L1f
        L19:
            int r10 = r9.getWidth()
            int r10 = r10 / 2
        L1f:
            int r1 = r9.getHeight()
            r2 = 0
            if (r1 < r0) goto L36
            android.content.Context r0 = r8.f22546
            android.content.res.Resources r0 = r0.getResources()
            int r1 = Yue.C5058.C5063.f17003
            int r0 = r0.getDimensionPixelOffset(r1)
            int r1 = r11 + r0
            int r11 = r11 - r0
            goto L3b
        L36:
            int r1 = r9.getHeight()
            r11 = r2
        L3b:
            r0 = 49
            r13.gravity = r0
            android.content.Context r0 = r8.f22546
            android.content.res.Resources r0 = r0.getResources()
            if (r12 == 0) goto L4a
            int r3 = Yue.C5058.C5063.f17007
            goto L4c
        L4a:
            int r3 = Yue.C5058.C5063.f17006
        L4c:
            int r0 = r0.getDimensionPixelOffset(r3)
            android.view.View r3 = m23543(r9)
            if (r3 != 0) goto L5e
            java.lang.String r9 = "TooltipPopup"
            java.lang.String r10 = "Cannot find app view"
            android.util.Log.e(r9, r10)
            return
        L5e:
            android.graphics.Rect r4 = r8.f22550
            r3.getWindowVisibleDisplayFrame(r4)
            android.graphics.Rect r4 = r8.f22550
            int r5 = r4.left
            if (r5 >= 0) goto L92
            int r4 = r4.top
            if (r4 >= 0) goto L92
            android.content.Context r4 = r8.f22546
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r5 = "dimen"
            java.lang.String r6 = "android"
            java.lang.String r7 = "status_bar_height"
            int r5 = r4.getIdentifier(r7, r5, r6)
            if (r5 == 0) goto L84
            int r5 = r4.getDimensionPixelSize(r5)
            goto L85
        L84:
            r5 = r2
        L85:
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            android.graphics.Rect r6 = r8.f22550
            int r7 = r4.widthPixels
            int r4 = r4.heightPixels
            r6.set(r2, r5, r7, r4)
        L92:
            int[] r4 = r8.f22552
            r3.getLocationOnScreen(r4)
            int[] r4 = r8.f22551
            r9.getLocationOnScreen(r4)
            int[] r9 = r8.f22551
            r4 = r9[r2]
            int[] r5 = r8.f22552
            r6 = r5[r2]
            int r4 = r4 - r6
            r9[r2] = r4
            r6 = 1
            r7 = r9[r6]
            r5 = r5[r6]
            int r7 = r7 - r5
            r9[r6] = r7
            int r4 = r4 + r10
            int r9 = r3.getWidth()
            int r9 = r9 / 2
            int r4 = r4 - r9
            r13.x = r4
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            android.view.View r10 = r8.f22547
            r10.measure(r9, r9)
            android.view.View r9 = r8.f22547
            int r9 = r9.getMeasuredHeight()
            int[] r10 = r8.f22551
            r10 = r10[r6]
            int r11 = r11 + r10
            int r11 = r11 - r0
            int r11 = r11 - r9
            int r10 = r10 + r1
            int r10 = r10 + r0
            if (r12 == 0) goto Ldb
            if (r11 < 0) goto Ld8
            r13.y = r11
            goto Le9
        Ld8:
            r13.y = r10
            goto Le9
        Ldb:
            int r9 = r9 + r10
            android.graphics.Rect r12 = r8.f22550
            int r12 = r12.height()
            if (r9 > r12) goto Le7
            r13.y = r10
            goto Le9
        Le7:
            r13.y = r11
        Le9:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m23545() {
            r2 = this;
            boolean r0 = r2.m23546()
            if (r0 != 0) goto L7
            return
        L7:
            android.content.Context r0 = r2.f22546
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.View r1 = r2.f22547
            r0.removeView(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m23546() {
            r1 = this;
            android.view.View r0 = r1.f22547
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m23547(android.view.View r8, int r9, int r10, boolean r11, java.lang.CharSequence r12) {
            r7 = this;
            boolean r0 = r7.m23546()
            if (r0 == 0) goto L9
            r7.m23545()
        L9:
            android.widget.TextView r0 = r7.f22548
            r0.setText(r12)
            android.view.WindowManager$LayoutParams r6 = r7.f22549
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.m23544(r2, r3, r4, r5, r6)
            android.content.Context r8 = r7.f22546
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            android.view.View r9 = r7.f22547
            android.view.WindowManager$LayoutParams r10 = r7.f22549
            r8.addView(r9, r10)
            return
    }
}
