package p017J;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.lang.reflect.Field;
import p001A0.RunnableC0019E;
import p006D.AbstractC0080Q;

/* JADX INFO: renamed from: J.g */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0218g implements View.OnTouchListener {

    /* JADX INFO: renamed from: r */
    public static final int f444r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a */
    public final C0212a f445a;

    /* JADX INFO: renamed from: b */
    public final AccelerateInterpolator f446b;

    /* JADX INFO: renamed from: c */
    public final View f447c;

    /* JADX INFO: renamed from: d */
    public RunnableC0019E f448d;

    /* JADX INFO: renamed from: e */
    public final float[] f449e;

    /* JADX INFO: renamed from: f */
    public final float[] f450f;

    /* JADX INFO: renamed from: g */
    public final int f451g;

    /* JADX INFO: renamed from: h */
    public final int f452h;

    /* JADX INFO: renamed from: i */
    public final float[] f453i;

    /* JADX INFO: renamed from: j */
    public final float[] f454j;

    /* JADX INFO: renamed from: k */
    public final float[] f455k;

    /* JADX INFO: renamed from: l */
    public boolean f456l;

    /* JADX INFO: renamed from: m */
    public boolean f457m;

    /* JADX INFO: renamed from: n */
    public boolean f458n;

    /* JADX INFO: renamed from: o */
    public boolean f459o;

    /* JADX INFO: renamed from: p */
    public boolean f460p;

    /* JADX INFO: renamed from: q */
    public final ListView f461q;

    public ViewOnTouchListenerC0218g(ListView listView) {
        C0212a c0212a = new C0212a();
        c0212a.f439e = Long.MIN_VALUE;
        c0212a.f441g = -1L;
        c0212a.f440f = 0L;
        this.f445a = c0212a;
        this.f446b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f449e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f450f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f453i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f454j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f455k = fArr5;
        this.f447c = listView;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f451g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f452h = f444r;
        c0212a.f435a = 500;
        c0212a.f436b = 500;
        this.f461q = listView;
    }

    /* JADX INFO: renamed from: b */
    public static float m606b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m607a(int i2, float f2, float f3, float f4) {
        float fM606b;
        float interpolation;
        float fM606b2 = m606b(this.f449e[i2] * f3, 0.0f, this.f450f[i2]);
        float fM608c = m608c(f3 - f2, fM606b2) - m608c(f2, fM606b2);
        AccelerateInterpolator accelerateInterpolator = this.f446b;
        if (fM608c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fM608c);
        } else {
            if (fM608c <= 0.0f) {
                fM606b = 0.0f;
                if (fM606b != 0.0f) {
                    return 0.0f;
                }
                float f5 = this.f453i[i2];
                float f6 = this.f454j[i2];
                float f7 = this.f455k[i2];
                float f8 = f5 * f4;
                return fM606b > 0.0f ? m606b(fM606b * f8, f6, f7) : -m606b((-fM606b) * f8, f6, f7);
            }
            interpolation = accelerateInterpolator.getInterpolation(fM608c);
        }
        fM606b = m606b(interpolation, -1.0f, 1.0f);
        if (fM606b != 0.0f) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m608c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f451g;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f459o && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m609d() {
        int i2 = 0;
        if (this.f457m) {
            this.f459o = false;
            return;
        }
        C0212a c0212a = this.f445a;
        c0212a.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (jCurrentAnimationTimeMillis - c0212a.f439e);
        int i4 = c0212a.f436b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        c0212a.f443i = i2;
        c0212a.f442h = c0212a.m592a(jCurrentAnimationTimeMillis);
        c0212a.f441g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m610e() {
        ListView listView;
        int count;
        C0212a c0212a = this.f445a;
        float f2 = c0212a.f438d;
        int iAbs = (int) (f2 / Math.abs(f2));
        Math.abs(c0212a.f437c);
        if (iAbs == 0 || (count = (listView = this.f461q).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        int i3 = 1;
        if (!this.f460p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m609d();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            }
            return false;
        }
        this.f458n = true;
        this.f456l = false;
        float x = motionEvent.getX();
        float width = view.getWidth();
        View view2 = this.f447c;
        float fM607a = m607a(0, x, width, view2.getWidth());
        float fM607a2 = m607a(1, motionEvent.getY(), view.getHeight(), view2.getHeight());
        C0212a c0212a = this.f445a;
        c0212a.f437c = fM607a;
        c0212a.f438d = fM607a2;
        if (!this.f459o && m610e()) {
            if (this.f448d == null) {
                this.f448d = new RunnableC0019E(i3, this);
            }
            this.f459o = true;
            this.f457m = true;
            if (this.f456l || (i2 = this.f452h) <= 0) {
                this.f448d.run();
            } else {
                RunnableC0019E runnableC0019E = this.f448d;
                long j2 = i2;
                Field field = AbstractC0080Q.f219a;
                view2.postOnAnimationDelayed(runnableC0019E, j2);
            }
            this.f456l = true;
        }
        return false;
    }
}
