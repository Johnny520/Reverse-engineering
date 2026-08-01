package p006D;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import p069i.C0717t0;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: D.j */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0081j implements View.OnTouchListener {

    /* JADX INFO: renamed from: s */
    public static final int f340s = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: b */
    public final C0072a f341b;

    /* JADX INFO: renamed from: c */
    public final AccelerateInterpolator f342c;

    /* JADX INFO: renamed from: d */
    public final ListView f343d;

    /* JADX INFO: renamed from: e */
    public RunnableC0073b f344e;

    /* JADX INFO: renamed from: f */
    public final float[] f345f;

    /* JADX INFO: renamed from: g */
    public final float[] f346g;

    /* JADX INFO: renamed from: h */
    public final int f347h;

    /* JADX INFO: renamed from: i */
    public final int f348i;

    /* JADX INFO: renamed from: j */
    public final float[] f349j;

    /* JADX INFO: renamed from: k */
    public final float[] f350k;

    /* JADX INFO: renamed from: l */
    public final float[] f351l;

    /* JADX INFO: renamed from: m */
    public boolean f352m;

    /* JADX INFO: renamed from: n */
    public boolean f353n;

    /* JADX INFO: renamed from: o */
    public boolean f354o;

    /* JADX INFO: renamed from: p */
    public boolean f355p;

    /* JADX INFO: renamed from: q */
    public boolean f356q;

    /* JADX INFO: renamed from: r */
    public final C0717t0 f357r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnTouchListenerC0081j(C0717t0 c0717t0) {
        C0072a c0072a = new C0072a();
        c0072a.f330e = Long.MIN_VALUE;
        c0072a.f332g = -1L;
        c0072a.f331f = 0L;
        this.f341b = c0072a;
        this.f342c = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f345f = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f346g = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f349j = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f350k = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f351l = fArr5;
        this.f343d = c0717t0;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f347h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f348i = f340s;
        c0072a.f326a = 500;
        c0072a.f327b = 500;
        this.f357r = c0717t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static float m215b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m216a(int i2, float f, float f2, float f3) {
        float fM215b;
        float interpolation;
        float fM215b2 = m215b(this.f345f[i2] * f2, 0.0f, this.f346g[i2]);
        float fM217c = m217c(f2 - f, fM215b2) - m217c(f, fM215b2);
        AccelerateInterpolator accelerateInterpolator = this.f342c;
        if (fM217c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fM217c);
        } else {
            if (fM217c <= 0.0f) {
                fM215b = 0.0f;
                if (fM215b != 0.0f) {
                    return 0.0f;
                }
                float f4 = this.f349j[i2];
                float f5 = this.f350k[i2];
                float f6 = this.f351l[i2];
                float f7 = f4 * f3;
                return fM215b > 0.0f ? m215b(fM215b * f7, f5, f6) : -m215b((-fM215b) * f7, f5, f6);
            }
            interpolation = accelerateInterpolator.getInterpolation(fM217c);
        }
        fM215b = m215b(interpolation, -1.0f, 1.0f);
        if (fM215b != 0.0f) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final float m217c(float f, float f2) {
        if (f2 != 0.0f) {
            int i2 = this.f347h;
            if (i2 == 0 || i2 == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f355p && i2 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i2 == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m218d() {
        int i2 = 0;
        if (this.f353n) {
            this.f355p = false;
            return;
        }
        C0072a c0072a = this.f341b;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (jCurrentAnimationTimeMillis - c0072a.f330e);
        int i4 = c0072a.f327b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        c0072a.f334i = i2;
        c0072a.f333h = c0072a.m154a(jCurrentAnimationTimeMillis);
        c0072a.f332g = jCurrentAnimationTimeMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m219e() {
        C0717t0 c0717t0;
        int count;
        C0072a c0072a = this.f341b;
        float f = c0072a.f329d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c0072a.f328c);
        if (iAbs != 0 && (count = (c0717t0 = this.f357r).getCount()) != 0) {
            int childCount = c0717t0.getChildCount();
            int firstVisiblePosition = c0717t0.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c0717t0.getChildAt(0).getTop() >= 0)) : !(i2 >= count && c0717t0.getChildAt(childCount - 1).getBottom() <= c0717t0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        int i3 = 0;
        if (this.f356q) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m218d();
                return false;
            }
            this.f354o = true;
            this.f352m = false;
            float x2 = motionEvent.getX();
            float width = view.getWidth();
            ListView listView = this.f343d;
            float fM216a = m216a(0, x2, width, listView.getWidth());
            float fM216a2 = m216a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
            C0072a c0072a = this.f341b;
            c0072a.f328c = fM216a;
            c0072a.f329d = fM216a2;
            if (!this.f355p && m219e()) {
                if (this.f344e == null) {
                    this.f344e = new RunnableC0073b(i3, this);
                }
                this.f355p = true;
                this.f353n = true;
                if (this.f352m || (i2 = this.f348i) <= 0) {
                    this.f344e.run();
                } else {
                    RunnableC0073b runnableC0073b = this.f344e;
                    long j2 = i2;
                    WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                    listView.postOnAnimationDelayed(runnableC0073b, j2);
                }
                this.f352m = true;
            }
        }
        return false;
    }
}
