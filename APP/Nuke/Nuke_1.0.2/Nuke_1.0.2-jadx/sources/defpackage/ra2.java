package defpackage;

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
    public static final int[] m = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] n = new int[0];
    public g83 h;
    public Boolean i;
    public Long j;
    public m2 k;
    public ta l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.k;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.j;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? m : n;
            g83 g83Var = this.h;
            if (g83Var != null) {
                g83Var.setState(iArr);
            }
        } else {
            m2 m2Var = new m2(10, this);
            this.k = m2Var;
            postDelayed(m2Var, 50L);
        }
        this.j = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(ra2 ra2Var) {
        g83 g83Var = ra2Var.h;
        if (g83Var != null) {
            g83Var.setState(n);
        }
        ra2Var.k = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(z22 z22Var, boolean z, long j, int i, long j2, ta taVar) {
        if (this.h == null || !Boolean.valueOf(z).equals(this.i)) {
            g83 g83Var = new g83(z);
            setBackground(g83Var);
            this.h = g83Var;
            this.i = Boolean.valueOf(z);
        }
        g83 g83Var2 = this.h;
        g83Var2.getClass();
        this.l = taVar;
        e(i, j, j2);
        if (z) {
            g83Var2.setHotspot(Float.intBitsToFloat((int) (z22Var.a >> 32)), Float.intBitsToFloat((int) (z22Var.a & 4294967295L)));
        } else {
            g83Var2.setHotspot(g83Var2.getBounds().centerX(), g83Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        this.l = null;
        m2 m2Var = this.k;
        if (m2Var != null) {
            removeCallbacks(m2Var);
            m2 m2Var2 = this.k;
            m2Var2.getClass();
            m2Var2.run();
        } else {
            g83 g83Var = this.h;
            if (g83Var != null) {
                g83Var.setState(n);
            }
        }
        g83 g83Var2 = this.h;
        if (g83Var2 == null) {
            return;
        }
        g83Var2.setVisible(false, false);
        unscheduleDrawable(g83Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        setRippleState(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, long j, long j2) {
        g83 g83Var = this.h;
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
        long jB = ju.b(f, j2);
        ju juVar = g83Var.i;
        if (!(juVar == null ? false : ju.c(juVar.a, jB))) {
            g83Var.i = new ju(jB);
            g83Var.setColor(ColorStateList.valueOf(sp0.j0(jB)));
        }
        Rect rect = new Rect(0, 0, gf1.Q(Float.intBitsToFloat((int) (j >> 32))), gf1.Q(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        g83Var.setBounds(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) throws PendingIntent.CanceledException {
        ta taVar = this.l;
        if (taVar != null) {
            taVar.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
