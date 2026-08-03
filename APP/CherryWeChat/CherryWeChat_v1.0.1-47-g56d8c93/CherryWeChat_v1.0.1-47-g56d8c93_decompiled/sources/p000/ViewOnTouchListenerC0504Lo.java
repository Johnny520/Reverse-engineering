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
    public static final int f1639r = ViewConfiguration.getTapTimeout();

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

    public ViewOnTouchListenerC0504Lo(C0365Ie c0365Ie) {
        C1203b5 c1203b5 = new C1203b5();
        c1203b5.f4120e = Long.MIN_VALUE;
        c1203b5.f4122g = -1L;
        c1203b5.f4121f = 0L;
        this.f1640a = c1203b5;
        this.f1641b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1644e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1645f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1648i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1649j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1650k = fArr5;
        this.f1642c = c0365Ie;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f1646g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1647h = f1639r;
        c1203b5.f4116a = 500;
        c1203b5.f4117b = 500;
        this.f1656q = c0365Ie;
    }

    /* JADX INFO: renamed from: b */
    public static float m984b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m985a(int i, float f, float f2, float f3) {
        float fM984b;
        float interpolation;
        float fM984b2 = m984b(this.f1644e[i] * f2, 0.0f, this.f1645f[i]);
        float fM986c = m986c(f2 - f, fM984b2) - m986c(f, fM984b2);
        AccelerateInterpolator accelerateInterpolator = this.f1641b;
        if (fM986c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fM986c);
        } else {
            if (fM986c <= 0.0f) {
                fM984b = 0.0f;
                if (fM984b != 0.0f) {
                    return 0.0f;
                }
                float f4 = this.f1648i[i];
                float f5 = this.f1649j[i];
                float f6 = this.f1650k[i];
                float f7 = f4 * f3;
                return fM984b > 0.0f ? m984b(fM984b * f7, f5, f6) : -m984b((-fM984b) * f7, f5, f6);
            }
            interpolation = accelerateInterpolator.getInterpolation(fM986c);
        }
        fM984b = m984b(interpolation, -1.0f, 1.0f);
        if (fM984b != 0.0f) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m986c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f1646g;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f1654o && i == 1) {
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
    public final void m987d() {
        int i = 0;
        if (this.f1652m) {
            this.f1654o = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C1203b5 c1203b5 = this.f1640a;
        int i2 = (int) (jCurrentAnimationTimeMillis - c1203b5.f4120e);
        int i3 = c1203b5.f4117b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c1203b5.f4124i = i;
        c1203b5.f4123h = c1203b5.m2323a(jCurrentAnimationTimeMillis);
        c1203b5.f4122g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m988e() {
        C0365Ie c0365Ie;
        int count;
        C1203b5 c1203b5 = this.f1640a;
        float f = c1203b5.f4119d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c1203b5.f4118c);
        if (iAbs != 0 && (count = (c0365Ie = this.f1656q).getCount()) != 0) {
            int childCount = c0365Ie.getChildCount();
            int firstVisiblePosition = c0365Ie.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c0365Ie.getChildAt(0).getTop() >= 0)) : !(i >= count && c0365Ie.getChildAt(childCount - 1).getBottom() <= c0365Ie.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f1655p) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = 2;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m987d();
                return false;
            }
            this.f1653n = true;
            this.f1651l = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            C0365Ie c0365Ie = this.f1642c;
            float fM985a = m985a(0, x, width, c0365Ie.getWidth());
            float fM985a2 = m985a(1, motionEvent.getY(), view.getHeight(), c0365Ie.getHeight());
            C1203b5 c1203b5 = this.f1640a;
            c1203b5.f4118c = fM985a;
            c1203b5.f4119d = fM985a2;
            if (!this.f1654o && m988e()) {
                if (this.f1643d == null) {
                    this.f1643d = new RunnableC0431K0(i2, this);
                }
                this.f1654o = true;
                this.f1652m = true;
                if (this.f1651l || (i = this.f1647h) <= 0) {
                    this.f1643d.run();
                } else {
                    RunnableC0431K0 runnableC0431K0 = this.f1643d;
                    long j = i;
                    WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                    c0365Ie.postOnAnimationDelayed(runnableC0431K0, j);
                }
                this.f1651l = true;
            }
        }
        return false;
    }
}
