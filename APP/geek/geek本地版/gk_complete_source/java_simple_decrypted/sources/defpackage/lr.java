package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lr implements View.OnTouchListener {
    public static final int r = 0;
    public final x6 a;
    public final AccelerateInterpolator b;
    public final kh c;
    public y6 d;
    public final float[] e;
    public final float[] f;
    public final int g;
    public final int h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final kh q;

    static {
        r = ViewConfiguration.getTapTimeout();
    }

    public lr(kh r12) {
        x6 r0 = new x6();
        r0.e = Long.MIN_VALUE;
        r0.g = -1;
        r0.f = 0;
        this.a = r0;
        this.b = new AccelerateInterpolator();
        float[] r2 = {0.0f, 0.0f};
        this.e = r2;
        float[] r3 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = r3;
        float[] r4 = {0.0f, 0.0f};
        this.i = r4;
        float[] r5 = {0.0f, 0.0f};
        this.j = r5;
        float[] r1 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = r1;
        this.c = r12;
        float r7 = ((int) ((1575.0f * Resources.getSystem().getDisplayMetrics().density) + 0.5f)) / 1000.0f;
        r1[0] = r7;
        r1[1] = r7;
        float r13 = ((int) ((r6 * 315.0f) + 0.5f)) / 1000.0f;
        r5[0] = r13;
        r5[1] = r13;
        this.g = 1;
        r3[0] = Float.MAX_VALUE;
        r3[1] = Float.MAX_VALUE;
        r2[0] = 0.2f;
        r2[1] = 0.2f;
        r4[0] = 0.001f;
        r4[1] = 0.001f;
        this.h = r;
        r0.a = 500;
        r0.b = 500;
        this.q = r12;
    }

    public static float b(float r1, float r2, float r3) {
        if (r1 <= r3) goto L6;
        return r3;
    L6:
        if (r1 >= r2) goto L8;
        return r2;
    L8:
        return r1;
    }

    public final float a(float r4, float r5, float r6, int r7) {
        float r0 = b(this.e[r7] * r5, 0.0f, this.f[r7]);
        float r42 = c(r5 - r4, r0) - c(r4, r0);
        AccelerateInterpolator r02 = this.b;
        if (r42 >= 0.0f) goto L6;
        float r43 = -r02.getInterpolation(-r42);
    L8:
        float r44 = b(r43, -1.0f, 1.0f);
    L11:
        if (r44 != 0.0f) goto L13;
        return 0.0f;
    L13:
        float r03 = this.i[r7];
        float r1 = this.j[r7];
        float r72 = this.k[r7];
        float r04 = r03 * r6;
        if (r44 <= 0.0f) goto L18;
        return b(r44 * r04, r1, r72);
    L18:
        return -b((-r44) * r04, r1, r72);
    L6:
        if (r42 <= 0.0f) goto L9;
        r43 = r02.getInterpolation(r42);
        goto L8
    L9:
        r44 = 0.0f;
        goto L11
    }

    public final float c(float r6, float r7) {
        if (r7 == 0.0f) goto L25;
        int r2 = this.g;
        if (r2 == 0) goto L16;
        if (r2 == 1) goto L16;
        if (r2 != 2) goto L25;
        if (r6 >= 0.0f) goto L25;
        return r6 / (-r7);
    L16:
        if (r6 >= r7) goto L25;
        if (r6 < 0.0f) goto L22;
        return 1.0f - (r6 / r7);
    L22:
        if (this.o == false) goto L25;
        if (r2 != 1) goto L25;
        return 1.0f;
    L25:
        return 0.0f;
    }

    public final void d() {
        int r1 = 0;
        if (this.m == false) goto L6;
        this.o = false;
        return;
    L6:
        long r2 = AnimationUtils.currentAnimationTimeMillis();
        x6 r0 = this.a;
        int r4 = (int) (r2 - r0.e);
        int r5 = r0.b;
        if (r4 <= r5) goto L9;
        r1 = r5;
    L12:
        r0.i = r1;
        r0.h = r0.a(r2);
        r0.g = r2;
        return;
    L9:
        if (r4 < 0) goto L12;
        r1 = r4;
        goto L12
    }

    public final boolean e() {
        x6 r0 = this.a;
        float r1 = r0.d;
        int r12 = (int) (r1 / Math.abs(r1));
        Math.abs(r0.c);
        if (r12 == 0) goto L19;
        kh r2 = this.q;
        int r3 = r2.getCount();
        if (r3 == 0) goto L19;
        int r4 = r2.getChildCount();
        int r5 = r2.getFirstVisiblePosition();
        int r6 = r5 + r4;
        if (r12 <= 0) goto L13;
        if (r6 >= r3) goto L11;
    L18:
        return true;
    L11:
        if (r2.getChildAt(r4 - 1).getBottom() > r2.getHeight()) goto L18;
    L13:
        if (r12 >= 0) goto L19;
        if (r5 > 0) goto L18;
        if (r2.getChildAt(0).getTop() < 0) goto L18;
    L19:
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r8, MotionEvent r9) {
        int r1 = 0;
        if (this.p == false) goto L30;
        int r0 = r9.getActionMasked();
        if (r0 == 0) goto L15;
        if (r0 != 1) goto L9;
    L13:
        d();
        return false;
    L9:
        if (r0 != 2) goto L11;
    L16:
        float r02 = r9.getX();
        float r3 = r8.getWidth();
        kh r4 = this.c;
        float r03 = a(r02, r3, r4.getWidth(), 0);
        float r82 = a(r9.getY(), r8.getHeight(), r4.getHeight(), 1);
        x6 r92 = this.a;
        r92.c = r03;
        r92.d = r82;
        if (this.o == true) goto L30;
        if (e() == false) goto L30;
        if (this.d != null) goto L23;
        this.d = new y6(r1, this);
    L23:
        this.o = true;
        this.m = true;
        if (this.l == true) goto L28;
        int r83 = this.h;
        if (r83 <= 0) goto L28;
        y6 r93 = this.d;
        long r5 = r83;
        WeakHashMap r84 = ja0.a;
        s90.n(r4, r93, r5);
    L29:
        this.l = true;
    L28:
        this.d.run();
        goto L29
    L11:
        if (r0 == 3) goto L13;
    L15:
        this.n = true;
        this.l = false;
    L30:
        return false;
    }
}
