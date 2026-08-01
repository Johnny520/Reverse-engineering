package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: lr */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0458lr implements View.OnTouchListener {

    /* JADX INFO: renamed from: r */
    public static final int f3084r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a */
    public final C0882x6 f3085a;

    /* JADX INFO: renamed from: b */
    public final AccelerateInterpolator f3086b;

    /* JADX INFO: renamed from: c */
    public final C0411kh f3087c;

    /* JADX INFO: renamed from: d */
    public RunnableC0919y6 f3088d;

    /* JADX INFO: renamed from: e */
    public final float[] f3089e;

    /* JADX INFO: renamed from: f */
    public final float[] f3090f;

    /* JADX INFO: renamed from: g */
    public final int f3091g;

    /* JADX INFO: renamed from: h */
    public final int f3092h;

    /* JADX INFO: renamed from: i */
    public final float[] f3093i;

    /* JADX INFO: renamed from: j */
    public final float[] f3094j;

    /* JADX INFO: renamed from: k */
    public final float[] f3095k;

    /* JADX INFO: renamed from: l */
    public boolean f3096l;

    /* JADX INFO: renamed from: m */
    public boolean f3097m;

    /* JADX INFO: renamed from: n */
    public boolean f3098n;

    /* JADX INFO: renamed from: o */
    public boolean f3099o;

    /* JADX INFO: renamed from: p */
    public boolean f3100p;

    /* JADX INFO: renamed from: q */
    public final C0411kh f3101q;

    public ViewOnTouchListenerC0458lr(C0411kh c0411kh) {
        C0882x6 c0882x6 = new C0882x6();
        c0882x6.f5108e = Long.MIN_VALUE;
        c0882x6.f5110g = -1L;
        c0882x6.f5109f = 0L;
        this.f3085a = c0882x6;
        this.f3086b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3089e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3090f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f3093i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3094j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3095k = fArr5;
        this.f3087c = c0411kh;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f3091g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3092h = f3084r;
        c0882x6.f5104a = 500;
        c0882x6.f5105b = 500;
        this.f3101q = c0411kh;
    }

    /* JADX INFO: renamed from: b */
    public static float m1761b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m1762a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f3089e
            r0 = r0[r7]
            float[] r1 = r3.f3090f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = m1761b(r0, r2, r1)
            float r1 = r3.m1763c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.m1763c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f3086b
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
            float r4 = m1761b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f3093i
            r0 = r0[r7]
            float[] r1 = r3.f3094j
            r1 = r1[r7]
            float[] r2 = r3.f3095k
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = m1761b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = m1761b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnTouchListenerC0458lr.m1762a(float, float, float, int):float");
    }

    /* JADX INFO: renamed from: c */
    public final float m1763c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f3091g;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f3099o && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m1764d() {
        int i = 0;
        if (this.f3097m) {
            this.f3099o = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C0882x6 c0882x6 = this.f3085a;
        int i2 = (int) (jCurrentAnimationTimeMillis - c0882x6.f5108e);
        int i3 = c0882x6.f5105b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0882x6.f5112i = i;
        c0882x6.f5111h = c0882x6.m2613a(jCurrentAnimationTimeMillis);
        c0882x6.f5110g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1765e() {
        C0411kh c0411kh;
        int count;
        C0882x6 c0882x6 = this.f3085a;
        float f = c0882x6.f5107d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c0882x6.f5106c);
        if (iAbs != 0 && (count = (c0411kh = this.f3101q).getCount()) != 0) {
            int childCount = c0411kh.getChildCount();
            int firstVisiblePosition = c0411kh.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c0411kh.getChildAt(0).getTop() >= 0)) : !(i >= count && c0411kh.getChildAt(childCount - 1).getBottom() <= c0411kh.getHeight())) {
                return true;
            }
        }
        return false;
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
            boolean r0 = r7.f3100p
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.m1764d()
            return r1
        L1b:
            r7.f3098n = r2
            r7.f3096l = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            kh r4 = r7.f3087c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m1762a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m1762a(r9, r8, r3, r2)
            x6 r9 = r7.f3085a
            r9.f5106c = r0
            r9.f5107d = r8
            boolean r8 = r7.f3099o
            if (r8 != 0) goto L7c
            boolean r8 = r7.m1765e()
            if (r8 == 0) goto L7c
            y6 r8 = r7.f3088d
            if (r8 != 0) goto L60
            y6 r8 = new y6
            r8.<init>(r1, r7)
            r7.f3088d = r8
        L60:
            r7.f3099o = r2
            r7.f3097m = r2
            boolean r8 = r7.f3096l
            if (r8 != 0) goto L75
            int r8 = r7.f3092h
            if (r8 <= 0) goto L75
            y6 r9 = r7.f3088d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = p000.ja0.f2600a
            p000.s90.m2322n(r4, r9, r5)
            goto L7a
        L75:
            y6 r8 = r7.f3088d
            r8.run()
        L7a:
            r7.f3096l = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnTouchListenerC0458lr.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
