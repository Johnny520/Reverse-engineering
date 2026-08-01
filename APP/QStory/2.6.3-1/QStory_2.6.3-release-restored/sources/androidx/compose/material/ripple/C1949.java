package androidx.compose.material.ripple;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.C1868;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;
import p069.AbstractC7390;

/* JADX INFO: renamed from: androidx.compose.material.ripple.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1949 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final int[] f3604 = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final int[] f3605 = new int[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C1868 f3606;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public RunnableC1945 f3607;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Boolean f3608;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Long f3609;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1944 f3610;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f3607;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f3609;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f3604 : f3605;
            C1944 c1944 = this.f3610;
            if (c1944 != null) {
                c1944.setState(iArr);
            }
        } else {
            RunnableC1945 runnableC1945 = new RunnableC1945(this, 0);
            this.f3607 = runnableC1945;
            postDelayed(runnableC1945, 50L);
        }
        this.f3609 = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(C1949 c1949) {
        C1944 c1944 = c1949.f3610;
        if (c1944 != null) {
            c1944.setState(f3605);
        }
        c1949.f3607 = null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            m2569();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C1868 c1868 = this.f3606;
        if (c1868 != null) {
            c1868.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2567(long j, long j2, int i) {
        C1944 c1944 = this.f3610;
        if (c1944 == null) {
            return;
        }
        if (c1944.getRadius() != i) {
            c1944.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jM3510 = C2434.m3510(f, j2);
        C2434 c2434 = c1944.f3594;
        if (!(c2434 == null ? false : C2434.m3509(c2434.f5045, jM3510))) {
            c1944.f3594 = new C2434(jM3510);
            c1944.setColor(ColorStateList.valueOf(AbstractC2416.m3433(jM3510)));
        }
        Rect rect = new Rect(0, 0, AbstractC7390.m12617(Float.intBitsToFloat((int) (j >> 32))), AbstractC7390.m12617(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c1944.setBounds(rect);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2568() {
        setRippleState(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2569() {
        this.f3606 = null;
        RunnableC1945 runnableC1945 = this.f3607;
        if (runnableC1945 != null) {
            removeCallbacks(runnableC1945);
            RunnableC1945 runnableC19452 = this.f3607;
            runnableC19452.getClass();
            runnableC19452.run();
        } else {
            C1944 c1944 = this.f3610;
            if (c1944 != null) {
                c1944.setState(f3605);
            }
        }
        C1944 c19442 = this.f3610;
        if (c19442 == null) {
            return;
        }
        c19442.setVisible(false, false);
        unscheduleDrawable(c19442);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2570(C1416 c1416, boolean z, long j, int i, long j2, C1868 c1868) {
        if (this.f3610 == null || !Boolean.valueOf(z).equals(this.f3608)) {
            C1944 c1944 = new C1944(z);
            setBackground(c1944);
            this.f3610 = c1944;
            this.f3608 = Boolean.valueOf(z);
        }
        C1944 c19442 = this.f3610;
        c19442.getClass();
        this.f3606 = c1868;
        m2567(j, j2, i);
        if (z) {
            c19442.setHotspot(Float.intBitsToFloat((int) (c1416.f1971 >> 32)), Float.intBitsToFloat((int) (c1416.f1971 & 4294967295L)));
        } else {
            c19442.setHotspot(c19442.getBounds().centerX(), c19442.getBounds().centerY());
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
