package androidx.core.widget;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.RunnableC0909;
import androidx.appcompat.widget.C1024;
import androidx.core.view.AbstractC3103;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.core.widget.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC3126 implements View.OnTouchListener {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final int f7010 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f7011;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f7012;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f7013;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f7014;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final float[] f7015;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final float[] f7016;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C1024 f7017;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f7018;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float[] f7019;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public RunnableC0909 f7020;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f7021;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final float[] f7022;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final float[] f7023;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f7024;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AccelerateInterpolator f7025;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1024 f7026;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3128 f7027;

    public ViewOnTouchListenerC3126(C1024 c1024) {
        C3128 c3128 = new C3128();
        c3128.f7029 = Long.MIN_VALUE;
        c3128.f7035 = -1L;
        c3128.f7028 = 0L;
        this.f7027 = c3128;
        this.f7025 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f7019 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f7023 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f7022 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f7016 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f7015 = fArr5;
        this.f7026 = c1024;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f7024 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f7021 = f7010;
        c3128.f7033 = 500;
        c3128.f7032 = 500;
        this.f7017 = c1024;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static float m4866(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f7018) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m4868();
                return false;
            }
            this.f7012 = true;
            this.f7014 = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            C1024 c1024 = this.f7026;
            float fM4870 = m4870(x, width, c1024.getWidth(), 0);
            float fM48702 = m4870(motionEvent.getY(), view.getHeight(), c1024.getHeight(), 1);
            C3128 c3128 = this.f7027;
            c3128.f7031 = fM4870;
            c3128.f7030 = fM48702;
            if (!this.f7011 && m4867()) {
                if (this.f7020 == null) {
                    this.f7020 = new RunnableC0909(this, 5);
                }
                this.f7011 = true;
                this.f7013 = true;
                if (this.f7014 || (i = this.f7021) <= 0) {
                    this.f7020.run();
                } else {
                    RunnableC0909 runnableC0909 = this.f7020;
                    long j = i;
                    WeakHashMap weakHashMap = AbstractC3103.f6939;
                    c1024.postOnAnimationDelayed(runnableC0909, j);
                }
                this.f7014 = true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m4867() {
        C1024 c1024;
        int count;
        C3128 c3128 = this.f7027;
        float f = c3128.f7030;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c3128.f7031);
        if (iAbs != 0 && (count = (c1024 = this.f7017).getCount()) != 0) {
            int childCount = c1024.getChildCount();
            int firstVisiblePosition = c1024.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c1024.getChildAt(0).getTop() >= 0)) : !(i >= count && c1024.getChildAt(childCount - 1).getBottom() <= c1024.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4868() {
        int i = 0;
        if (this.f7013) {
            this.f7011 = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C3128 c3128 = this.f7027;
        int i2 = (int) (jCurrentAnimationTimeMillis - c3128.f7029);
        int i3 = c3128.f7032;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c3128.f7036 = i;
        c3128.f7034 = c3128.m4874(jCurrentAnimationTimeMillis);
        c3128.f7035 = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float m4869(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f7024;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f7011 && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m4870(float f, float f2, float f3, int i) {
        float fM4866;
        float interpolation;
        float fM48662 = m4866(this.f7019[i] * f2, 0.0f, this.f7023[i]);
        float fM4869 = m4869(f2 - f, fM48662) - m4869(f, fM48662);
        AccelerateInterpolator accelerateInterpolator = this.f7025;
        if (fM4869 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fM4869);
        } else {
            if (fM4869 <= 0.0f) {
                fM4866 = 0.0f;
                if (fM4866 != 0.0f) {
                    return 0.0f;
                }
                float f4 = this.f7022[i];
                float f5 = this.f7016[i];
                float f6 = this.f7015[i];
                float f7 = f4 * f3;
                return fM4866 > 0.0f ? m4866(fM4866 * f7, f5, f6) : -m4866((-fM4866) * f7, f5, f6);
            }
            interpolation = accelerateInterpolator.getInterpolation(fM4869);
        }
        fM4866 = m4866(interpolation, -1.0f, 1.0f);
        if (fM4866 != 0.0f) {
        }
    }
}
