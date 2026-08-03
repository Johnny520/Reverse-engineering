package Yue;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC3498 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final float f5813 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final float f5814 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final float f5815 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f5816 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f5817 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f5818 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f5819 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f5820 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int f5821 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final int f5822 = 315;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final int f5823 = 1575;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final float f5824 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final float f5825 = 0.2f;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final float f5826 = 1.0f;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f5827 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f5828 = 500;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final int f5829 = 500;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final View f5832;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Runnable f5833;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f5836;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f5837;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean f5841;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean f5842;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean f5843;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f5844;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean f5845;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f5846;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C0155 f5830 = new C0155();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Interpolator f5831 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public float[] f5834 = {0.0f, 0.0f};

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public float[] f5835 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public float[] f5838 = {0.0f, 0.0f};

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public float[] f5839 = {0.0f, 0.0f};

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public float[] f5840 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۤ$ۥ */
    public static class C0155 {

        /* JADX INFO: renamed from: ۥ */
        public int f336;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f337;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f5847;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f5848;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public float f5854;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public int f5855;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public long f5849 = Long.MIN_VALUE;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public long f5853 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public long f5850 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f5851 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f5852 = 0;

        /* JADX INFO: renamed from: ۥ */
        public void m557() {
            if (this.f5850 == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fM9321 = m9321(m9319(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f5850;
            this.f5850 = jCurrentAnimationTimeMillis;
            float f = j * fM9321;
            this.f5851 = (int) (this.f5847 * f);
            this.f5852 = (int) (f * this.f5848);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m558() {
            return this.f5851;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m9317() {
            return this.f5852;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m9318() {
            float f = this.f5847;
            return (int) (f / Math.abs(f));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final float m9319(long j) {
            if (j < this.f5849) {
                return 0.0f;
            }
            long j2 = this.f5853;
            if (j2 < 0 || j < j2) {
                return AbstractViewOnTouchListenerC3498.m9294((j - r0) / this.f336, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f5854;
            return (1.0f - f) + (f * AbstractViewOnTouchListenerC3498.m9294((j - j2) / this.f5855, 0.0f, 1.0f));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int m9320() {
            float f = this.f5848;
            return (int) (f / Math.abs(f));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final float m9321(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean m9322() {
            return this.f5853 > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f5853 + ((long) this.f5855);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m9323() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f5855 = AbstractViewOnTouchListenerC3498.m9295((int) (jCurrentAnimationTimeMillis - this.f5849), 0, this.f337);
            this.f5854 = m9319(jCurrentAnimationTimeMillis);
            this.f5853 = jCurrentAnimationTimeMillis;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m9324(int i) {
            this.f337 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m9325(int i) {
            this.f336 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void m9326(float f, float f2) {
            this.f5847 = f;
            this.f5848 = f2;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void m9327() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f5849 = jCurrentAnimationTimeMillis;
            this.f5853 = -1L;
            this.f5850 = jCurrentAnimationTimeMillis;
            this.f5854 = 0.5f;
            this.f5851 = 0;
            this.f5852 = 0;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۤ$ۥ۟ */
    public class RunnableC0156 implements Runnable {
        public RunnableC0156() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC3498 abstractViewOnTouchListenerC3498 = AbstractViewOnTouchListenerC3498.this;
            if (abstractViewOnTouchListenerC3498.f5844) {
                if (abstractViewOnTouchListenerC3498.f5842) {
                    abstractViewOnTouchListenerC3498.f5842 = false;
                    abstractViewOnTouchListenerC3498.f5830.m9327();
                }
                C0155 c0155 = AbstractViewOnTouchListenerC3498.this.f5830;
                if (c0155.m9322() || !AbstractViewOnTouchListenerC3498.this.m9315()) {
                    AbstractViewOnTouchListenerC3498.this.f5844 = false;
                    return;
                }
                AbstractViewOnTouchListenerC3498 abstractViewOnTouchListenerC34982 = AbstractViewOnTouchListenerC3498.this;
                if (abstractViewOnTouchListenerC34982.f5843) {
                    abstractViewOnTouchListenerC34982.f5843 = false;
                    abstractViewOnTouchListenerC34982.m9296();
                }
                c0155.m557();
                AbstractViewOnTouchListenerC3498.this.mo9303(c0155.m558(), c0155.m9317());
                C8273.m27427(AbstractViewOnTouchListenerC3498.this.f5832, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC3498(@InterfaceC6391 View view) {
        this.f5832 = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m9309(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m9310(f3, f3);
        m9305(1);
        m9308(Float.MAX_VALUE, Float.MAX_VALUE);
        m9313(0.2f, 0.2f);
        m9314(1.0f, 1.0f);
        m9304(f5827);
        m9312(500);
        m9311(500);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static float m9294(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m9295(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f5845) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m9302();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            }
            return this.f5846 && this.f5844;
        }
        this.f5843 = true;
        this.f5841 = false;
        this.f5830.m9326(m9297(0, motionEvent.getX(), view.getWidth(), this.f5832.getWidth()), m9297(1, motionEvent.getY(), view.getHeight(), this.f5832.getHeight()));
        if (!this.f5844 && m9315()) {
            m9316();
        }
        if (this.f5846) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract boolean mo555(int i);

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract boolean mo556(int i);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m9296() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f5832.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final float m9297(int i, float f, float f2, float f3) {
        float fM9299 = m9299(this.f5834[i], f2, this.f5835[i], f);
        if (fM9299 == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f5838[i];
        float f5 = this.f5839[i];
        float f6 = this.f5840[i];
        float f7 = f4 * f3;
        return fM9299 > 0.0f ? m9294(fM9299 * f7, f5, f6) : -m9294((-fM9299) * f7, f5, f6);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final float m9298(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f5836;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f5844 && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final float m9299(float f, float f2, float f3, float f4) {
        float interpolation;
        float fM9294 = m9294(f * f2, 0.0f, f3);
        float fM9298 = m9298(f2 - f4, fM9294) - m9298(f4, fM9294);
        if (fM9298 < 0.0f) {
            interpolation = -this.f5831.getInterpolation(-fM9298);
        } else {
            if (fM9298 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f5831.getInterpolation(fM9298);
        }
        return m9294(interpolation, -1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m9300() {
        return this.f5845;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m9301() {
        return this.f5846;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m9302() {
        if (this.f5842) {
            this.f5844 = false;
        } else {
            this.f5830.m9323();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public abstract void mo9303(int i, int i2);

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC3498 m9304(int i) {
        this.f5837 = i;
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC3498 m9305(int i) {
        this.f5836 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC3498 m9306(boolean z) {
        if (this.f5845 && !z) {
            m9302();
        }
        this.f5845 = z;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC3498 m9307(boolean z) {
        this.f5846 = z;
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC3498 m9308(float f, float f2) {
        float[] fArr = this.f5835;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC3498 m9309(float f, float f2) {
        float[] fArr = this.f5840;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC3498 m9310(float f, float f2) {
        float[] fArr = this.f5839;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC3498 m9311(int i) {
        this.f5830.m9324(i);
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC3498 m9312(int i) {
        this.f5830.m9325(i);
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC3498 m9313(float f, float f2) {
        float[] fArr = this.f5834;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC3498 m9314(float f, float f2) {
        float[] fArr = this.f5838;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m9315() {
        C0155 c0155 = this.f5830;
        int iM9320 = c0155.m9320();
        int iM9318 = c0155.m9318();
        return (iM9320 != 0 && mo556(iM9320)) || (iM9318 != 0 && mo555(iM9318));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m9316() {
        int i;
        if (this.f5833 == null) {
            this.f5833 = new RunnableC0156();
        }
        this.f5844 = true;
        this.f5842 = true;
        if (this.f5841 || (i = this.f5837) <= 0) {
            this.f5833.run();
        } else {
            C8273.m27428(this.f5832, this.f5833, i);
        }
        this.f5841 = true;
    }
}
