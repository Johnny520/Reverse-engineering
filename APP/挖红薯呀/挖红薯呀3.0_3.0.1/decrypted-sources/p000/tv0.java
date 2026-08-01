package p000;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class tv0 extends View {

    /* JADX INFO: renamed from: i */
    public static final int[] f6055i = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: j */
    public static final int[] f6056j = new int[0];

    /* JADX INFO: renamed from: d */
    public qa1 f6057d;

    /* JADX INFO: renamed from: e */
    public Boolean f6058e;

    /* JADX INFO: renamed from: f */
    public Long f6059f;

    /* JADX INFO: renamed from: g */
    public RunnableC0912x3 f6060g;

    /* JADX INFO: renamed from: h */
    public C0381k6 f6061h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f6060g;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f6059f;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f6055i : f6056j;
            qa1 qa1Var = this.f6057d;
            if (qa1Var != null) {
                qa1Var.setState(iArr);
            }
        } else {
            RunnableC0912x3 runnableC0912x3 = new RunnableC0912x3(7, this);
            this.f6060g = runnableC0912x3;
            postDelayed(runnableC0912x3, 50L);
        }
        this.f6059f = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(tv0 tv0Var) {
        qa1 qa1Var = tv0Var.f6057d;
        if (qa1Var != null) {
            qa1Var.setState(f6056j);
        }
        tv0Var.f6060g = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4232b(js0 js0Var, boolean z, long j, int i, long j2, C0381k6 c0381k6) {
        if (this.f6057d == null || !Boolean.valueOf(z).equals(this.f6058e)) {
            qa1 qa1Var = new qa1(z);
            setBackground(qa1Var);
            this.f6057d = qa1Var;
            this.f6058e = Boolean.valueOf(z);
        }
        qa1 qa1Var2 = this.f6057d;
        qa1Var2.getClass();
        this.f6061h = c0381k6;
        m4235e(i, j, j2);
        if (z) {
            qa1Var2.setHotspot(Float.intBitsToFloat((int) (js0Var.f2937a >> 32)), Float.intBitsToFloat((int) (js0Var.f2937a & 4294967295L)));
        } else {
            qa1Var2.setHotspot(qa1Var2.getBounds().centerX(), qa1Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4233c() {
        this.f6061h = null;
        RunnableC0912x3 runnableC0912x3 = this.f6060g;
        if (runnableC0912x3 != null) {
            removeCallbacks(runnableC0912x3);
            RunnableC0912x3 runnableC0912x32 = this.f6060g;
            runnableC0912x32.getClass();
            runnableC0912x32.run();
        } else {
            qa1 qa1Var = this.f6057d;
            if (qa1Var != null) {
                qa1Var.setState(f6056j);
            }
        }
        qa1 qa1Var2 = this.f6057d;
        if (qa1Var2 == null) {
            return;
        }
        qa1Var2.setVisible(false, false);
        unscheduleDrawable(qa1Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4234d() {
        setRippleState(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            m4233c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4235e(int i, long j, long j2) {
        qa1 qa1Var = this.f6057d;
        if (qa1Var == null) {
            return;
        }
        Integer num = qa1Var.f5103f;
        if (num == null || num.intValue() != i) {
            qa1Var.f5103f = Integer.valueOf(i);
            qa1Var.setRadius(i);
        }
        long jM1093b = C0207ff.m1093b(0.1f, j2);
        C0207ff c0207ff = qa1Var.f5102e;
        if (!(c0207ff == null ? false : C0207ff.m1094c(c0207ff.f1709a, jM1093b))) {
            qa1Var.f5102e = new C0207ff(jM1093b);
            qa1Var.setColor(ColorStateList.valueOf(p30.m2987W(jM1093b)));
        }
        Rect rect = new Rect(0, 0, rd0.m3458Q(Float.intBitsToFloat((int) (j >> 32))), rd0.m3458Q(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        qa1Var.setBounds(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C0381k6 c0381k6 = this.f6061h;
        if (c0381k6 != null) {
            c0381k6.invoke();
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
