package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: pr */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0606pr implements View.OnTouchListener {

    /* JADX INFO: renamed from: r */
    public static final int f3734r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a */
    public final C0288h7 f3735a;

    /* JADX INFO: renamed from: b */
    public final AccelerateInterpolator f3736b;

    /* JADX INFO: renamed from: c */
    public final C0485mh f3737c;

    /* JADX INFO: renamed from: d */
    public RunnableC0325i7 f3738d;

    /* JADX INFO: renamed from: e */
    public final float[] f3739e;

    /* JADX INFO: renamed from: f */
    public final float[] f3740f;

    /* JADX INFO: renamed from: g */
    public final int f3741g;

    /* JADX INFO: renamed from: h */
    public final int f3742h;

    /* JADX INFO: renamed from: i */
    public final float[] f3743i;

    /* JADX INFO: renamed from: j */
    public final float[] f3744j;

    /* JADX INFO: renamed from: k */
    public final float[] f3745k;

    /* JADX INFO: renamed from: l */
    public boolean f3746l;

    /* JADX INFO: renamed from: m */
    public boolean f3747m;

    /* JADX INFO: renamed from: n */
    public boolean f3748n;

    /* JADX INFO: renamed from: o */
    public boolean f3749o;

    /* JADX INFO: renamed from: p */
    public boolean f3750p;

    /* JADX INFO: renamed from: q */
    public final C0485mh f3751q;

    public ViewOnTouchListenerC0606pr(C0485mh c0485mh) {
        C0288h7 c0288h7 = new C0288h7();
        c0288h7.f2125e = Long.MIN_VALUE;
        c0288h7.f2127g = -1L;
        c0288h7.f2126f = 0L;
        this.f3735a = c0288h7;
        this.f3736b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3739e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3740f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f3743i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3744j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3745k = fArr5;
        this.f3737c = c0485mh;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f3741g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3742h = f3734r;
        c0288h7.f2121a = 500;
        c0288h7.f2122b = 500;
        this.f3751q = c0485mh;
    }

    /* JADX INFO: renamed from: b */
    public static float m2092b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m2093a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f3739e
            r0 = r0[r7]
            float[] r1 = r3.f3740f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = m2092b(r0, r2, r1)
            float r1 = r3.m2094c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.m2094c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f3736b
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
            float r4 = m2092b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f3743i
            r0 = r0[r7]
            float[] r1 = r3.f3744j
            r1 = r1[r7]
            float[] r2 = r3.f3745k
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = m2092b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = m2092b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnTouchListenerC0606pr.m2093a(float, float, float, int):float");
    }

    /* JADX INFO: renamed from: c */
    public final float m2094c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f3741g;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f3749o && i == 1) {
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
    public final void m2095d() {
        int i = 0;
        if (this.f3747m) {
            this.f3749o = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C0288h7 c0288h7 = this.f3735a;
        int i2 = (int) (jCurrentAnimationTimeMillis - c0288h7.f2125e);
        int i3 = c0288h7.f2122b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0288h7.f2129i = i;
        c0288h7.f2128h = c0288h7.m1358a(jCurrentAnimationTimeMillis);
        c0288h7.f2127g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2096e() {
        C0485mh c0485mh;
        int count;
        C0288h7 c0288h7 = this.f3735a;
        float f = c0288h7.f2124d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c0288h7.f2123c);
        if (iAbs != 0 && (count = (c0485mh = this.f3751q).getCount()) != 0) {
            int childCount = c0485mh.getChildCount();
            int firstVisiblePosition = c0485mh.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c0485mh.getChildAt(0).getTop() >= 0)) : !(i >= count && c0485mh.getChildAt(childCount - 1).getBottom() <= c0485mh.getHeight())) {
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
            boolean r0 = r7.f3750p
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
            r7.m2095d()
            return r1
        L1b:
            r7.f3748n = r2
            r7.f3746l = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            mh r4 = r7.f3737c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m2093a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m2093a(r9, r8, r3, r2)
            h7 r9 = r7.f3735a
            r9.f2123c = r0
            r9.f2124d = r8
            boolean r8 = r7.f3749o
            if (r8 != 0) goto L7c
            boolean r8 = r7.m2096e()
            if (r8 == 0) goto L7c
            i7 r8 = r7.f3738d
            if (r8 != 0) goto L60
            i7 r8 = new i7
            r8.<init>(r1, r7)
            r7.f3738d = r8
        L60:
            r7.f3749o = r2
            r7.f3747m = r2
            boolean r8 = r7.f3746l
            if (r8 != 0) goto L75
            int r8 = r7.f3742h
            if (r8 <= 0) goto L75
            i7 r9 = r7.f3738d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = p000.oa0.f3426a
            p000.x90.m2666n(r4, r9, r5)
            goto L7a
        L75:
            i7 r8 = r7.f3738d
            r8.run()
        L7a:
            r7.f3746l = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnTouchListenerC0606pr.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
