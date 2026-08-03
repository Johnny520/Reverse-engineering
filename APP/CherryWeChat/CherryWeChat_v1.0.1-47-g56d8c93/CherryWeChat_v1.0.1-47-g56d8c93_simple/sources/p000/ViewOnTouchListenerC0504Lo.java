package p000;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Lo */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0504Lo implements View.OnTouchListener {

    /* JADX INFO: renamed from: r */
    public static final int f1639r = 0;

    /* JADX INFO: renamed from: a */
    public final C1203b5 f1640a;

    /* JADX INFO: renamed from: b */
    public final AccelerateInterpolator f1641b;

    /* JADX INFO: renamed from: c */
    public final C0365Ie f1642c;

    /* JADX INFO: renamed from: d */
    public RunnableC0431K0 f1643d;

    /* JADX INFO: renamed from: e */
    public final float[] f1644e;

    /* JADX INFO: renamed from: f */
    public final float[] f1645f;

    /* JADX INFO: renamed from: g */
    public final int f1646g;

    /* JADX INFO: renamed from: h */
    public final int f1647h;

    /* JADX INFO: renamed from: i */
    public final float[] f1648i;

    /* JADX INFO: renamed from: j */
    public final float[] f1649j;

    /* JADX INFO: renamed from: k */
    public final float[] f1650k;

    /* JADX INFO: renamed from: l */
    public boolean f1651l;

    /* JADX INFO: renamed from: m */
    public boolean f1652m;

    /* JADX INFO: renamed from: n */
    public boolean f1653n;

    /* JADX INFO: renamed from: o */
    public boolean f1654o;

    /* JADX INFO: renamed from: p */
    public boolean f1655p;

    /* JADX INFO: renamed from: q */
    public final C0365Ie f1656q;

    static {
        f1639r = ViewConfiguration.getTapTimeout();
    }

    public ViewOnTouchListenerC0504Lo(C0365Ie r12) {
        C1203b5 r0 = new C1203b5();
        r0.f4120e = Long.MIN_VALUE;
        r0.f4122g = -1;
        r0.f4121f = 0;
        this.f1640a = r0;
        this.f1641b = new AccelerateInterpolator();
        float[] r2 = {0.0f, 0.0f};
        this.f1644e = r2;
        float[] r3 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1645f = r3;
        float[] r4 = {0.0f, 0.0f};
        this.f1648i = r4;
        float[] r5 = {0.0f, 0.0f};
        this.f1649j = r5;
        float[] r1 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1650k = r1;
        this.f1642c = r12;
        float r7 = ((int) ((1575.0f * Resources.getSystem().getDisplayMetrics().density) + 0.5f)) / 1000.0f;
        r1[0] = r7;
        r1[1] = r7;
        float r13 = ((int) ((r6 * 315.0f) + 0.5f)) / 1000.0f;
        r5[0] = r13;
        r5[1] = r13;
        this.f1646g = 1;
        r3[0] = Float.MAX_VALUE;
        r3[1] = Float.MAX_VALUE;
        r2[0] = 0.2f;
        r2[1] = 0.2f;
        r4[0] = 0.001f;
        r4[1] = 0.001f;
        this.f1647h = f1639r;
        r0.f4116a = 500;
        r0.f4117b = 500;
        this.f1656q = r12;
    }

    /* JADX INFO: renamed from: b */
    public static float m984b(float r1, float r2, float r3) {
        if (r1 <= r3) goto L6;
        return r3;
    L6:
        if (r1 >= r2) goto L8;
        return r2;
    L8:
        return r1;
    }

    /* JADX INFO: renamed from: a */
    public final float m985a(int r4, float r5, float r6, float r7) {
        float r0 = m984b(this.f1644e[r4] * r6, 0.0f, this.f1645f[r4]);
        float r52 = m986c(r6 - r5, r0) - m986c(r5, r0);
        AccelerateInterpolator r02 = this.f1641b;
        if (r52 >= 0.0f) goto L6;
        float r53 = -r02.getInterpolation(-r52);
    L8:
        float r54 = m984b(r53, -1.0f, 1.0f);
    L11:
        if (r54 != 0.0f) goto L13;
        return 0.0f;
    L13:
        float r03 = this.f1648i[r4];
        float r1 = this.f1649j[r4];
        float r42 = this.f1650k[r4];
        float r04 = r03 * r7;
        if (r54 <= 0.0f) goto L18;
        return m984b(r54 * r04, r1, r42);
    L18:
        return -m984b((-r54) * r04, r1, r42);
    L6:
        if (r52 <= 0.0f) goto L9;
        r53 = r02.getInterpolation(r52);
        goto L8
    L9:
        r54 = 0.0f;
        goto L11
    }

    /* JADX INFO: renamed from: c */
    public final float m986c(float r6, float r7) {
        if (r7 == 0.0f) goto L25;
        int r2 = this.f1646g;
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
        if (this.f1654o == false) goto L25;
        if (r2 != 1) goto L25;
        return 1.0f;
    L25:
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m987d() {
        int r1 = 0;
        if (this.f1652m == false) goto L6;
        this.f1654o = false;
        return;
    L6:
        long r2 = AnimationUtils.currentAnimationTimeMillis();
        C1203b5 r0 = this.f1640a;
        int r4 = (int) (r2 - r0.f4120e);
        int r5 = r0.f4117b;
        if (r4 <= r5) goto L9;
        r1 = r5;
    L12:
        r0.f4124i = r1;
        r0.f4123h = r0.m2323a(r2);
        r0.f4122g = r2;
        return;
    L9:
        if (r4 < 0) goto L12;
        r1 = r4;
        goto L12
    }

    /* JADX INFO: renamed from: e */
    public final boolean m988e() {
        C1203b5 r0 = this.f1640a;
        float r1 = r0.f4119d;
        int r12 = (int) (r1 / Math.abs(r1));
        Math.abs(r0.f4118c);
        if (r12 == 0) goto L19;
        C0365Ie r2 = this.f1656q;
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
    public final boolean onTouch(View r9, MotionEvent r10) {
        if (this.f1655p == false) goto L29;
        int r0 = r10.getActionMasked();
        int r2 = 2;
        if (r0 == 0) goto L14;
        if (r0 == 1) goto L12;
        if (r0 != 2) goto L10;
    L15:
        float r02 = r10.getX();
        float r4 = r9.getWidth();
        C0365Ie r5 = this.f1642c;
        float r03 = m985a(0, r02, r4, r5.getWidth());
        float r92 = m985a(1, r10.getY(), r9.getHeight(), r5.getHeight());
        C1203b5 r102 = this.f1640a;
        r102.f4118c = r03;
        r102.f4119d = r92;
        if (this.f1654o == true) goto L29;
        if (m988e() == false) goto L29;
        if (this.f1643d != null) goto L22;
        this.f1643d = new RunnableC0431K0(r2, this);
    L22:
        this.f1654o = true;
        this.f1652m = true;
        if (this.f1651l == true) goto L27;
        int r93 = this.f1647h;
        if (r93 <= 0) goto L27;
        RunnableC0431K0 r103 = this.f1643d;
        long r6 = r93;
        WeakHashMap r94 = AbstractC2185lE.f7617a;
        r5.postOnAnimationDelayed(r103, r6);
    L28:
        this.f1651l = true;
    L27:
        this.f1643d.run();
        goto L28
    L10:
        if (r0 != 3) goto L29;
    L12:
        m987d();
        return false;
    L14:
        this.f1653n = true;
        this.f1651l = false;
    L29:
        return false;
    }
}
