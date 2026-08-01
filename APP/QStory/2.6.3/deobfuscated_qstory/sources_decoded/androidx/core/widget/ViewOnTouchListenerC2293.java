package androidx.core.widget;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.RunnableC0062;
import androidx.appcompat.widget.C0177;

/* JADX INFO: renamed from: androidx.core.widget.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC2293 implements View.OnTouchListener {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final int f6665 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f6666;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f6667;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f6668;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f6669;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final float[] f6670;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final float[] f6671;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C0177 f6672;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f6673;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float[] f6674;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public RunnableC0062 f6675;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f6676;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final float[] f6677;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final float[] f6678;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f6679;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AccelerateInterpolator f6680;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0177 f6681;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2295 f6682;

    public ViewOnTouchListenerC2293(C0177 c0177) {
        C2295 c2295 = new C2295();
        c2295.f6684 = Long.MIN_VALUE;
        c2295.f6690 = -1L;
        c2295.f6683 = 0L;
        this.f6682 = c2295;
        this.f6680 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f6674 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6678 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f6677 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f6671 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6670 = fArr5;
        this.f6681 = c0177;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f6679 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f6676 = f6665;
        c2295.f6688 = 500;
        c2295.f6687 = 500;
        this.f6672 = c0177;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static float m4306(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f6673
            r1 = 0
            if (r0 != 0) goto L7
            goto L7d
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7d
        L17:
            r7.m4308()
            return r1
        L1b:
            r7.f6667 = r2
            r7.f6669 = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            androidx.appcompat.widget.飘花落叶言子哲楪苏世兰 r4 = r7.f6681
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m4310(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m4310(r9, r8, r3, r2)
            androidx.core.widget.飘花落叶言子楪世苏哲兰 r9 = r7.f6682
            r9.f6686 = r0
            r9.f6685 = r8
            boolean r8 = r7.f6666
            if (r8 != 0) goto L7d
            boolean r8 = r7.m4307()
            if (r8 == 0) goto L7d
            androidx.appcompat.app.飘花落叶言子世兰楪哲苏 r8 = r7.f6675
            if (r8 != 0) goto L61
            androidx.appcompat.app.飘花落叶言子世兰楪哲苏 r8 = new androidx.appcompat.app.飘花落叶言子世兰楪哲苏
            r9 = 5
            r8.<init>(r7, r9)
            r7.f6675 = r8
        L61:
            r7.f6666 = r2
            r7.f6668 = r2
            boolean r8 = r7.f6669
            if (r8 != 0) goto L76
            int r8 = r7.f6676
            if (r8 <= 0) goto L76
            androidx.appcompat.app.飘花落叶言子世兰楪哲苏 r9 = r7.f6675
            long r5 = (long) r8
            java.util.WeakHashMap r8 = androidx.core.view.AbstractC2270.f6594
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L76:
            androidx.appcompat.app.飘花落叶言子世兰楪哲苏 r8 = r7.f6675
            r8.run()
        L7b:
            r7.f6669 = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.ViewOnTouchListenerC2293.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m4307() {
        C0177 c0177;
        int count;
        C2295 c2295 = this.f6682;
        float f = c2295.f6685;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c2295.f6686);
        if (iAbs != 0 && (count = (c0177 = this.f6672).getCount()) != 0) {
            int childCount = c0177.getChildCount();
            int firstVisiblePosition = c0177.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c0177.getChildAt(0).getTop() >= 0)) : !(i >= count && c0177.getChildAt(childCount - 1).getBottom() <= c0177.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4308() {
        int i = 0;
        if (this.f6668) {
            this.f6666 = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C2295 c2295 = this.f6682;
        int i2 = (int) (jCurrentAnimationTimeMillis - c2295.f6684);
        int i3 = c2295.f6687;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c2295.f6691 = i;
        c2295.f6689 = c2295.m4314(jCurrentAnimationTimeMillis);
        c2295.f6690 = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float m4309(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f6679;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f6666 && i == 1) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m4310(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f6674
            r0 = r0[r7]
            float[] r1 = r3.f6678
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = m4306(r0, r2, r1)
            float r1 = r3.m4309(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.m4309(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f6680
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = m4306(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f6677
            r0 = r0[r7]
            float[] r1 = r3.f6671
            r1 = r1[r7]
            float[] r3 = r3.f6670
            r3 = r3[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r3 = m4306(r4, r1, r3)
            return r3
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r3 = m4306(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.ViewOnTouchListenerC2293.m4310(float, float, float, int):float");
    }
}
