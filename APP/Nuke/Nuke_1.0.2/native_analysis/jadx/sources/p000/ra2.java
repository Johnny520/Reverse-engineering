package p000;

import android.R;
import android.app.PendingIntent;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ra2 extends View {

    /* JADX INFO: renamed from: m */
    public static final int[] f9487m = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: n */
    public static final int[] f9488n = new int[0];

    /* JADX INFO: renamed from: h */
    public g83 f9489h;

    /* JADX INFO: renamed from: i */
    public Boolean f9490i;

    /* JADX INFO: renamed from: j */
    public Long f9491j;

    /* JADX INFO: renamed from: k */
    public RunnableC0446m2 f9492k;

    /* JADX INFO: renamed from: l */
    public C0727ta f9493l;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f9492k;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f9491j;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f9487m : f9488n;
            g83 g83Var = this.f9489h;
            if (g83Var != null) {
                g83Var.setState(iArr);
            }
        } else {
            RunnableC0446m2 runnableC0446m2 = new RunnableC0446m2(10, this);
            this.f9492k = runnableC0446m2;
            postDelayed(runnableC0446m2, 50L);
        }
        this.f9491j = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(ra2 ra2Var) {
        g83 g83Var = ra2Var.f9489h;
        if (g83Var != null) {
            g83Var.setState(f9488n);
        }
        ra2Var.f9492k = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m4420b(z22 z22Var, boolean z, long j, int i, long j2, C0727ta c0727ta) {
        if (this.f9489h == null || !Boolean.valueOf(z).equals(this.f9490i)) {
            g83 g83Var = new g83(z);
            setBackground(g83Var);
            this.f9489h = g83Var;
            this.f9490i = Boolean.valueOf(z);
        }
        g83 g83Var2 = this.f9489h;
        g83Var2.getClass();
        this.f9493l = c0727ta;
        m4423e(i, j, j2);
        if (z) {
            g83Var2.setHotspot(Float.intBitsToFloat((int) (z22Var.f13710a >> 32)), Float.intBitsToFloat((int) (z22Var.f13710a & 4294967295L)));
        } else {
            g83Var2.setHotspot(g83Var2.getBounds().centerX(), g83Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m4421c() {
        this.f9493l = null;
        RunnableC0446m2 runnableC0446m2 = this.f9492k;
        if (runnableC0446m2 != null) {
            removeCallbacks(runnableC0446m2);
            RunnableC0446m2 runnableC0446m22 = this.f9492k;
            runnableC0446m22.getClass();
            runnableC0446m22.run();
        } else {
            g83 g83Var = this.f9489h;
            if (g83Var != null) {
                g83Var.setState(f9488n);
            }
        }
        g83 g83Var2 = this.f9489h;
        if (g83Var2 == null) {
            return;
        }
        g83Var2.setVisible(false, false);
        unscheduleDrawable(g83Var2);
    }

    /* JADX INFO: renamed from: d */
    public final void m4422d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            m4421c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4423e(int i, long j, long j2) {
        g83 g83Var = this.f9489h;
        if (g83Var == null) {
            return;
        }
        if (g83Var.getRadius() != i) {
            g83Var.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jM2565b = C0363ju.m2565b(f, j2);
        C0363ju c0363ju = g83Var.f3355i;
        if (!(c0363ju == null ? false : C0363ju.m2566c(c0363ju.f5219a, jM2565b))) {
            g83Var.f3355i = new C0363ju(jM2565b);
            g83Var.setColor(ColorStateList.valueOf(sp0.m4947j0(jM2565b)));
        }
        Rect rect = new Rect(0, 0, gf1.m1869Q(Float.intBitsToFloat((int) (j >> 32))), gf1.m1869Q(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        g83Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) throws PendingIntent.CanceledException {
        C0727ta c0727ta = this.f9493l;
        if (c0727ta != null) {
            c0727ta.mo6a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
