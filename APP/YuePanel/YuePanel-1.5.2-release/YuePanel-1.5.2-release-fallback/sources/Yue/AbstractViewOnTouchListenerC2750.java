package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public abstract class AbstractViewOnTouchListenerC2750 implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final float f9030;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f9031;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f9032;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final android.view.View f9033;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public java.lang.Runnable f9034;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.lang.Runnable f9035;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f9036;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f9037;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final int[] f9038;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۨ$ۥ, reason: contains not printable characters */
    public class RunnableC2751 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractViewOnTouchListenerC2750 f9039;

        public RunnableC2751(Yue.AbstractViewOnTouchListenerC2750 r1) {
                r0 = this;
                r0.f9039 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                Yue.ۥ۠ۢۦۨ r0 = r2.f9039
                android.view.View r0 = r0.f9033
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto Le
                r1 = 1
                r0.requestDisallowInterceptTouchEvent(r1)
            Le:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۨ$ۥ۟, reason: contains not printable characters */
    public class RunnableC2752 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractViewOnTouchListenerC2750 f9040;

        public RunnableC2752(Yue.AbstractViewOnTouchListenerC2750 r1) {
                r0 = this;
                r0.f9040 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                Yue.ۥ۠ۢۦۨ r0 = r1.f9040
                r0.m12048()
                return
        }
    }

    public AbstractViewOnTouchListenerC2750(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2.f9038 = r1
            r2.f9033 = r3
            r1 = 1
            r3.setLongClickable(r1)
            r3.addOnAttachStateChangeListener(r2)
            android.content.Context r3 = r3.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            float r3 = (float) r3
            r2.f9030 = r3
            int r3 = android.view.ViewConfiguration.getTapTimeout()
            r2.f9031 = r3
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            int r3 = r3 + r1
            int r3 = r3 / r0
            r2.f9032 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m12045(android.view.View r2, float r3, float r4, float r5) {
            float r0 = -r5
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 < 0) goto L29
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L29
            int r0 = r2.getRight()
            int r1 = r2.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            float r0 = r0 + r5
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L29
            int r3 = r2.getBottom()
            int r2 = r2.getTop()
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 + r5
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L29
            r2 = 1
            goto L2a
        L29:
            r2 = 0
        L2a:
            return r2
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            r10 = this;
            boolean r11 = r10.f9036
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L17
            boolean r12 = r10.m12049(r12)
            if (r12 != 0) goto L15
            boolean r12 = r10.mo12047()
            if (r12 != 0) goto L13
            goto L15
        L13:
            r12 = r1
            goto L3d
        L15:
            r12 = r0
            goto L3d
        L17:
            boolean r12 = r10.m12050(r12)
            if (r12 == 0) goto L25
            boolean r12 = r10.mo1751()
            if (r12 == 0) goto L25
            r12 = r0
            goto L26
        L25:
            r12 = r1
        L26:
            if (r12 == 0) goto L3d
            long r4 = android.os.SystemClock.uptimeMillis()
            r8 = 0
            r9 = 0
            r6 = 3
            r7 = 0
            r2 = r4
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            android.view.View r3 = r10.f9033
            r3.onTouchEvent(r2)
            r2.recycle()
        L3d:
            r10.f9036 = r12
            if (r12 != 0) goto L45
            if (r11 == 0) goto L44
            goto L45
        L44:
            r0 = r1
        L45:
            return r0
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            r2 = 0
            r1.f9036 = r2
            r2 = -1
            r1.f9037 = r2
            java.lang.Runnable r2 = r1.f9034
            if (r2 == 0) goto Lf
            android.view.View r0 = r1.f9033
            r0.removeCallbacks(r2)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m12046() {
            r2 = this;
            java.lang.Runnable r0 = r2.f9035
            if (r0 == 0) goto L9
            android.view.View r1 = r2.f9033
            r1.removeCallbacks(r0)
        L9:
            java.lang.Runnable r0 = r2.f9034
            if (r0 == 0) goto L12
            android.view.View r1 = r2.f9033
            r1.removeCallbacks(r0)
        L12:
            return
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract Yue.InterfaceC5782 mo1750();

    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo1751() {
            r2 = this;
            Yue.ۥۢ۟۠ۤ r0 = r2.mo1750()
            if (r0 == 0) goto Lf
            boolean r1 = r0.mo14691()
            if (r1 != 0) goto Lf
            r0.show()
        Lf:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo12047() {
            r2 = this;
            Yue.ۥۢ۟۠ۤ r0 = r2.mo1750()
            if (r0 == 0) goto Lf
            boolean r1 = r0.mo14691()
            if (r1 == 0) goto Lf
            r0.dismiss()
        Lf:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m12048() {
            r11 = this;
            r11.m12046()
            android.view.View r0 = r11.f9033
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L36
            boolean r1 = r0.isLongClickable()
            if (r1 == 0) goto L12
            goto L36
        L12:
            boolean r1 = r11.mo1751()
            if (r1 != 0) goto L19
            return
        L19:
            android.view.ViewParent r1 = r0.getParent()
            r2 = 1
            r1.requestDisallowInterceptTouchEvent(r2)
            long r5 = android.os.SystemClock.uptimeMillis()
            r9 = 0
            r10 = 0
            r7 = 3
            r8 = 0
            r3 = r5
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r0.onTouchEvent(r1)
            r1.recycle()
            r11.f9036 = r2
        L36:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m12049(android.view.MotionEvent r5) {
            r4 = this;
            android.view.View r0 = r4.f9033
            Yue.ۥۢ۟۠ۤ r1 = r4.mo1750()
            r2 = 0
            if (r1 == 0) goto L44
            boolean r3 = r1.mo14691()
            if (r3 != 0) goto L10
            goto L44
        L10:
            android.widget.ListView r1 = r1.mo14695()
            Yue.ۥ۠۠ۢ۠ r1 = (Yue.C2032) r1
            if (r1 == 0) goto L44
            boolean r3 = r1.isShown()
            if (r3 != 0) goto L1f
            goto L44
        L1f:
            android.view.MotionEvent r3 = android.view.MotionEvent.obtainNoHistory(r5)
            r4.m12051(r0, r3)
            r4.m12052(r1, r3)
            int r0 = r4.f9037
            boolean r0 = r1.mo9400(r3, r0)
            r3.recycle()
            int r5 = r5.getActionMasked()
            r1 = 1
            if (r5 == r1) goto L3e
            r3 = 3
            if (r5 == r3) goto L3e
            r5 = r1
            goto L3f
        L3e:
            r5 = r2
        L3f:
            if (r0 == 0) goto L44
            if (r5 == 0) goto L44
            r2 = r1
        L44:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m12050(android.view.MotionEvent r6) {
            r5 = this;
            android.view.View r0 = r5.f9033
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f9037
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f9030
            boolean r6 = m12045(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m12046()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m12046()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f9037 = r6
            java.lang.Runnable r6 = r5.f9034
            if (r6 != 0) goto L52
            Yue.ۥ۠ۢۦۨ$ۥ r6 = new Yue.ۥ۠ۢۦۨ$ۥ
            r6.<init>(r5)
            r5.f9034 = r6
        L52:
            java.lang.Runnable r6 = r5.f9034
            int r1 = r5.f9031
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f9035
            if (r6 != 0) goto L65
            Yue.ۥ۠ۢۦۨ$ۥ۟ r6 = new Yue.ۥ۠ۢۦۨ$ۥ۟
            r6.<init>(r5)
            r5.f9035 = r6
        L65:
            java.lang.Runnable r6 = r5.f9035
            int r1 = r5.f9032
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m12051(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            int[] r0 = r2.f9038
            r3.getLocationOnScreen(r0)
            r3 = 0
            r3 = r0[r3]
            float r3 = (float) r3
            r1 = 1
            r0 = r0[r1]
            float r0 = (float) r0
            r4.offsetLocation(r3, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m12052(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            int[] r0 = r2.f9038
            r3.getLocationOnScreen(r0)
            r3 = 0
            r3 = r0[r3]
            int r3 = -r3
            float r3 = (float) r3
            r1 = 1
            r0 = r0[r1]
            int r0 = -r0
            float r0 = (float) r0
            r4.offsetLocation(r3, r0)
            return r1
    }
}
