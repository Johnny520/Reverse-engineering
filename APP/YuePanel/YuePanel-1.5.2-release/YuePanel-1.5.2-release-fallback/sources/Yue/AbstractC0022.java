package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0022 extends android.view.ViewGroup {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f60 = 200;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.AbstractC0022.C0024 f61;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final android.content.Context f62;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public androidx.appcompat.widget.ActionMenuView f63;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public androidx.appcompat.widget.C7411 f64;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f65;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Yue.C6904 f66;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f67;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f68;

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۢ$ۥ, reason: contains not printable characters */
    public class RunnableC0023 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0022 f69;

        public RunnableC0023(Yue.AbstractC0022 r1) {
                r0 = this;
                r0.f69 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                Yue.ۥ۟۟۠ۢ r0 = r1.f69
                r0.mo298()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۢ$ۥ۟, reason: contains not printable characters */
    public class C0024 implements Yue.InterfaceC6909 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean f70;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f71;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0022 f72;

        public C0024(Yue.AbstractC0022 r1) {
                r0 = this;
                r0.f72 = r1
                r0.<init>()
                r1 = 0
                r0.f70 = r1
                return
        }

        @Override // Yue.InterfaceC6909
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo299(android.view.View r1) {
                r0 = this;
                r1 = 1
                r0.f70 = r1
                return
        }

        @Override // Yue.InterfaceC6909
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void mo300(android.view.View r2) {
                r1 = this;
                boolean r2 = r1.f70
                if (r2 == 0) goto L5
                return
            L5:
                Yue.ۥ۟۟۠ۢ r2 = r1.f72
                r0 = 0
                r2.f66 = r0
                int r0 = r1.f71
                Yue.AbstractC0022.m285(r2, r0)
                return
        }

        @Override // Yue.InterfaceC6909
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo301(android.view.View r2) {
                r1 = this;
                Yue.ۥ۟۟۠ۢ r2 = r1.f72
                r0 = 0
                Yue.AbstractC0022.m284(r2, r0)
                r1.f70 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.AbstractC0022.C0024 m302(Yue.C6904 r2, int r3) {
                r1 = this;
                Yue.ۥ۟۟۠ۢ r0 = r1.f72
                r0.f66 = r2
                r1.f71 = r3
                return r1
        }
    }

    public AbstractC0022(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AbstractC0022(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AbstractC0022(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4544 android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            Yue.ۥ۟۟۠ۢ$ۥ۟ r4 = new Yue.ۥ۟۟۠ۢ$ۥ۟
            r4.<init>(r2)
            r2.f61 = r4
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r5 = r3.getTheme()
            int r0 = Yue.C5058.C5060.f16554
            r1 = 1
            boolean r5 = r5.resolveAttribute(r0, r4, r1)
            if (r5 == 0) goto L2a
            int r5 = r4.resourceId
            if (r5 == 0) goto L2a
            android.view.ContextThemeWrapper r5 = new android.view.ContextThemeWrapper
            int r4 = r4.resourceId
            r5.<init>(r3, r4)
            r2.f62 = r5
            goto L2c
        L2a:
            r2.f62 = r3
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m284(Yue.AbstractC0022 r0, int r1) {
            super.setVisibility(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m285(Yue.AbstractC0022 r0, int r1) {
            super.setVisibility(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m286(int r0, int r1, boolean r2) {
            if (r2 == 0) goto L4
            int r0 = r0 - r1
            goto L5
        L4:
            int r0 = r0 + r1
        L5:
            return r0
    }

    public int getAnimatedVisibility() {
            r1 = this;
            Yue.ۥۢۤۦۦ r0 = r1.f66
            if (r0 == 0) goto L9
            Yue.ۥ۟۟۠ۢ$ۥ۟ r0 = r1.f61
            int r0 = r0.f71
            return r0
        L9:
            int r0 = r1.getVisibility()
            return r0
    }

    public int getContentHeight() {
            r1 = this;
            int r0 = r1.f65
            return r0
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r6) {
            r5 = this;
            super.onConfigurationChanged(r6)
            android.content.Context r0 = r5.getContext()
            int[] r1 = Yue.C5058.C5071.f17589
            int r2 = Yue.C5058.C5060.f16557
            r3 = 0
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r3, r1, r2, r4)
            int r1 = Yue.C5058.C5071.f17603
            int r1 = r0.getLayoutDimension(r1, r4)
            r5.setContentHeight(r1)
            r0.recycle()
            androidx.appcompat.widget.ۥ r0 = r5.f64
            if (r0 == 0) goto L24
            r0.m28426(r6)
        L24:
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.f68 = r1
        Lb:
            boolean r3 = r5.f68
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.f68 = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L21
            r6 = 3
            if (r0 != r6) goto L23
        L21:
            r5.f68 = r1
        L23:
            return r4
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.f67 = r1
        L9:
            boolean r2 = r4.f67
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.f67 = r3
        L18:
            if (r0 == r3) goto L1d
            r5 = 3
            if (r0 != r5) goto L1f
        L1d:
            r4.f67 = r1
        L1f:
            return r3
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.f65 = r1
            r0.requestLayout()
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r2 == r0) goto L10
            Yue.ۥۢۤۦۦ r0 = r1.f66
            if (r0 == 0) goto Ld
            r0.m26719()
        Ld:
            super.setVisibility(r2)
        L10:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo287(int r3) {
            r2 = this;
            r0 = 200(0xc8, double:9.9E-322)
            Yue.ۥۢۤۦۦ r3 = r2.mo297(r3, r0)
            r3.m26739()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo288() {
            r1 = this;
            boolean r0 = r1.mo293()
            if (r0 == 0) goto Le
            int r0 = r1.getVisibility()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo289() {
            r1 = this;
            androidx.appcompat.widget.ۥ r0 = r1.f64
            if (r0 == 0) goto L7
            r0.m28418()
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean mo290() {
            r1 = this;
            androidx.appcompat.widget.ۥ r0 = r1.f64
            if (r0 == 0) goto L9
            boolean r0 = r0.m28421()
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean mo291() {
            r1 = this;
            androidx.appcompat.widget.ۥ r0 = r1.f64
            if (r0 == 0) goto L9
            boolean r0 = r0.m28423()
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean mo292() {
            r1 = this;
            androidx.appcompat.widget.ۥ r0 = r1.f64
            if (r0 == 0) goto L9
            boolean r0 = r0.m28424()
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean mo293() {
            r1 = this;
            androidx.appcompat.widget.ۥ r0 = r1.f64
            if (r0 == 0) goto Lc
            boolean r0 = r0.m28425()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m294(android.view.View r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            r2.measure(r0, r4)
            int r2 = r2.getMeasuredWidth()
            int r3 = r3 - r2
            int r3 = r3 - r5
            r2 = 0
            int r2 = java.lang.Math.max(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m295(android.view.View r3, int r4, int r5, int r6, boolean r7) {
            r2 = this;
            int r0 = r3.getMeasuredWidth()
            int r1 = r3.getMeasuredHeight()
            int r6 = r6 - r1
            int r6 = r6 / 2
            int r5 = r5 + r6
            if (r7 == 0) goto L15
            int r6 = r4 - r0
            int r1 = r1 + r5
            r3.layout(r6, r5, r4, r1)
            goto L1b
        L15:
            int r6 = r4 + r0
            int r1 = r1 + r5
            r3.layout(r4, r5, r6, r1)
        L1b:
            if (r7 == 0) goto L1e
            int r0 = -r0
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void mo296() {
            r1 = this;
            Yue.ۥ۟۟۠ۢ$ۥ r0 = new Yue.ۥ۟۟۠ۢ$ۥ
            r0.<init>(r1)
            r1.post(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public Yue.C6904 mo297(int r3, long r4) {
            r2 = this;
            Yue.ۥۢۤۦۦ r0 = r2.f66
            if (r0 == 0) goto L7
            r0.m26719()
        L7:
            r0 = 0
            if (r3 != 0) goto L2a
            int r1 = r2.getVisibility()
            if (r1 == 0) goto L13
            r2.setAlpha(r0)
        L13:
            Yue.ۥۢۤۦۦ r0 = Yue.C6794.m26092(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            Yue.ۥۢۤۦۦ r0 = r0.m26717(r1)
            r0.m26733(r4)
            Yue.ۥ۟۟۠ۢ$ۥ۟ r4 = r2.f61
            Yue.ۥ۟۟۠ۢ$ۥ۟ r3 = r4.m302(r0, r3)
            r0.m26735(r3)
            return r0
        L2a:
            Yue.ۥۢۤۦۦ r1 = Yue.C6794.m26092(r2)
            Yue.ۥۢۤۦۦ r0 = r1.m26717(r0)
            r0.m26733(r4)
            Yue.ۥ۟۟۠ۢ$ۥ۟ r4 = r2.f61
            Yue.ۥ۟۟۠ۢ$ۥ۟ r3 = r4.m302(r0, r3)
            r0.m26735(r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean mo298() {
            r1 = this;
            androidx.appcompat.widget.ۥ r0 = r1.f64
            if (r0 == 0) goto L9
            boolean r0 = r0.m28433()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
