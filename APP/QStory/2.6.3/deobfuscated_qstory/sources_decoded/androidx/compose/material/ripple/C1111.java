package androidx.compose.material.ripple;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.C1030;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import p053.AbstractC6561;

/* JADX INFO: renamed from: androidx.compose.material.ripple.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1111 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final int[] f3259 = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final int[] f3260 = new int[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C1030 f3261;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public RunnableC1107 f3262;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Boolean f3263;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Long f3264;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1106 f3265;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f3262;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f3264;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f3259 : f3260;
            C1106 c1106 = this.f3265;
            if (c1106 != null) {
                c1106.setState(iArr);
            }
        } else {
            RunnableC1107 runnableC1107 = new RunnableC1107(this, 0);
            this.f3262 = runnableC1107;
            postDelayed(runnableC1107, 50L);
        }
        this.f3264 = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(C1111 c1111) {
        C1106 c1106 = c1111.f3265;
        if (c1106 != null) {
            c1106.setState(f3260);
        }
        c1111.f3262 = null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            m2009();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C1030 c1030 = this.f3261;
        if (c1030 != null) {
            c1030.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2007(long j, long j2, int i) {
        C1106 c1106 = this.f3265;
        if (c1106 == null) {
            return;
        }
        if (c1106.getRadius() != i) {
            c1106.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jM2950 = C1599.m2950(f, j2);
        C1599 c1599 = c1106.f3249;
        if (!(c1599 == null ? false : C1599.m2949(c1599.f4700, jM2950))) {
            c1106.f3249 = new C1599(jM2950);
            c1106.setColor(ColorStateList.valueOf(AbstractC1581.m2873(jM2950)));
        }
        Rect rect = new Rect(0, 0, AbstractC6561.m12058(Float.intBitsToFloat((int) (j >> 32))), AbstractC6561.m12058(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c1106.setBounds(rect);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2008() {
        setRippleState(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2009() {
        this.f3261 = null;
        RunnableC1107 runnableC1107 = this.f3262;
        if (runnableC1107 != null) {
            removeCallbacks(runnableC1107);
            RunnableC1107 runnableC11072 = this.f3262;
            runnableC11072.getClass();
            runnableC11072.run();
        } else {
            C1106 c1106 = this.f3265;
            if (c1106 != null) {
                c1106.setState(f3260);
            }
        }
        C1106 c11062 = this.f3265;
        if (c11062 == null) {
            return;
        }
        c11062.setVisible(false, false);
        unscheduleDrawable(c11062);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2010(C0575 c0575, boolean z, long j, int i, long j2, C1030 c1030) {
        if (this.f3265 == null || !Boolean.valueOf(z).equals(this.f3263)) {
            C1106 c1106 = new C1106(z);
            setBackground(c1106);
            this.f3265 = c1106;
            this.f3263 = Boolean.valueOf(z);
        }
        C1106 c11062 = this.f3265;
        c11062.getClass();
        this.f3261 = c1030;
        m2007(j, j2, i);
        if (z) {
            c11062.setHotspot(Float.intBitsToFloat((int) (c0575.f1626 >> 32)), Float.intBitsToFloat((int) (c0575.f1626 & 4294967295L)));
        } else {
            c11062.setHotspot(c11062.getBounds().centerX(), c11062.getBounds().centerY());
        }
        setRippleState(true);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
