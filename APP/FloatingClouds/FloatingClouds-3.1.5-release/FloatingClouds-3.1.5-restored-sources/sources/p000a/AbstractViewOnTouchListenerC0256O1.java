package p000a;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.O1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0256O1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: q */
    public static final int f899q = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a */
    public final a f900a;

    /* JADX INFO: renamed from: b */
    public final AccelerateInterpolator f901b;

    /* JADX INFO: renamed from: c */
    public final ListView f902c;

    /* JADX INFO: renamed from: d */
    public b f903d;

    /* JADX INFO: renamed from: e */
    public final float[] f904e;

    /* JADX INFO: renamed from: f */
    public final float[] f905f;

    /* JADX INFO: renamed from: g */
    public final int f906g;

    /* JADX INFO: renamed from: h */
    public final int f907h;

    /* JADX INFO: renamed from: i */
    public final float[] f908i;

    /* JADX INFO: renamed from: j */
    public final float[] f909j;

    /* JADX INFO: renamed from: k */
    public final float[] f910k;

    /* JADX INFO: renamed from: l */
    public boolean f911l;

    /* JADX INFO: renamed from: m */
    public boolean f912m;

    /* JADX INFO: renamed from: n */
    public boolean f913n;

    /* JADX INFO: renamed from: o */
    public boolean f914o;

    /* JADX INFO: renamed from: p */
    public boolean f915p;

    /* JADX INFO: renamed from: a.O1$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f916a;

        /* JADX INFO: renamed from: b */
        public int f917b;

        /* JADX INFO: renamed from: c */
        public float f918c;

        /* JADX INFO: renamed from: d */
        public float f919d;

        /* JADX INFO: renamed from: e */
        public long f920e;

        /* JADX INFO: renamed from: f */
        public long f921f;

        /* JADX INFO: renamed from: g */
        public long f922g;

        /* JADX INFO: renamed from: h */
        public float f923h;

        /* JADX INFO: renamed from: i */
        public int f924i;

        /* JADX INFO: renamed from: a */
        public final float m729a(long j) {
            if (j < this.f920e) {
                return 0.0f;
            }
            long j2 = this.f922g;
            if (j2 < 0 || j < j2) {
                return AbstractViewOnTouchListenerC0256O1.m724b((j - r0) / this.f916a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f923h;
            return (AbstractViewOnTouchListenerC0256O1.m724b((j - j2) / this.f924i, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    /* JADX INFO: renamed from: a.O1$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractViewOnTouchListenerC0256O1 abstractViewOnTouchListenerC0256O1 = AbstractViewOnTouchListenerC0256O1.this;
            if (abstractViewOnTouchListenerC0256O1.f914o) {
                boolean z = abstractViewOnTouchListenerC0256O1.f912m;
                a aVar = abstractViewOnTouchListenerC0256O1.f900a;
                if (z) {
                    abstractViewOnTouchListenerC0256O1.f912m = false;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar.f920e = jCurrentAnimationTimeMillis;
                    aVar.f922g = -1L;
                    aVar.f921f = jCurrentAnimationTimeMillis;
                    aVar.f923h = 0.5f;
                }
                if ((aVar.f922g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f922g + ((long) aVar.f924i)) || !abstractViewOnTouchListenerC0256O1.m728e()) {
                    abstractViewOnTouchListenerC0256O1.f914o = false;
                    return;
                }
                boolean z2 = abstractViewOnTouchListenerC0256O1.f913n;
                ListView listView = abstractViewOnTouchListenerC0256O1.f902c;
                if (z2) {
                    abstractViewOnTouchListenerC0256O1.f913n = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    listView.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (aVar.f921f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fM729a = aVar.m729a(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - aVar.f921f;
                aVar.f921f = jCurrentAnimationTimeMillis2;
                ((C0120G9) abstractViewOnTouchListenerC0256O1).f385r.scrollListBy((int) (j * ((fM729a * 4.0f) + ((-4.0f) * fM729a * fM729a)) * aVar.f919d));
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                listView.postOnAnimation(this);
            }
        }
    }

    public AbstractViewOnTouchListenerC0256O1(ListView listView) {
        a aVar = new a();
        aVar.f920e = Long.MIN_VALUE;
        aVar.f922g = -1L;
        aVar.f921f = 0L;
        this.f900a = aVar;
        this.f901b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f904e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f905f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f908i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f909j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f910k = fArr5;
        this.f902c = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f906g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f907h = f899q;
        aVar.f916a = 500;
        aVar.f917b = 500;
    }

    /* JADX INFO: renamed from: b */
    public static float m724b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m725a(float f, float f2, float f3, int i) {
        float fM724b;
        float interpolation;
        float fM724b2 = m724b(this.f904e[i] * f2, 0.0f, this.f905f[i]);
        float fM726c = m726c(f2 - f, fM724b2) - m726c(f, fM724b2);
        AccelerateInterpolator accelerateInterpolator = this.f901b;
        if (fM726c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fM726c);
        } else {
            if (fM726c <= 0.0f) {
                fM724b = 0.0f;
                if (fM724b != 0.0f) {
                    return 0.0f;
                }
                float f4 = this.f908i[i];
                float f5 = this.f909j[i];
                float f6 = this.f910k[i];
                float f7 = f4 * f3;
                return fM724b > 0.0f ? m724b(fM724b * f7, f5, f6) : -m724b((-fM724b) * f7, f5, f6);
            }
            interpolation = accelerateInterpolator.getInterpolation(fM726c);
        }
        fM724b = m724b(interpolation, -1.0f, 1.0f);
        if (fM724b != 0.0f) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m726c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f906g;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f914o && i == 1) {
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
    public final void m727d() {
        int i = 0;
        if (this.f912m) {
            this.f914o = false;
            return;
        }
        a aVar = this.f900a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - aVar.f920e);
        int i3 = aVar.f917b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.f924i = i;
        aVar.f923h = aVar.m729a(jCurrentAnimationTimeMillis);
        aVar.f922g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m728e() {
        C0006A5 c0006a5;
        int count;
        a aVar = this.f900a;
        float f = aVar.f919d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(aVar.f918c);
        if (iAbs != 0 && (count = (c0006a5 = ((C0120G9) this).f385r).getCount()) != 0) {
            int childCount = c0006a5.getChildCount();
            int firstVisiblePosition = c0006a5.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c0006a5.getChildAt(0).getTop() >= 0)) : !(i >= count && c0006a5.getChildAt(childCount - 1).getBottom() <= c0006a5.getHeight())) {
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
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f915p) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m727d();
                return false;
            }
            this.f913n = true;
            this.f911l = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            ListView listView = this.f902c;
            float fM725a = m725a(x, width, listView.getWidth(), 0);
            float fM725a2 = m725a(motionEvent.getY(), view.getHeight(), listView.getHeight(), 1);
            a aVar = this.f900a;
            aVar.f918c = fM725a;
            aVar.f919d = fM725a2;
            if (!this.f914o && m728e()) {
                if (this.f903d == null) {
                    this.f903d = new b();
                }
                this.f914o = true;
                this.f912m = true;
                if (this.f911l || (i = this.f907h) <= 0) {
                    this.f903d.run();
                } else {
                    b bVar = this.f903d;
                    long j = i;
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    listView.postOnAnimationDelayed(bVar, j);
                }
                this.f911l = true;
            }
        }
        return false;
    }
}
