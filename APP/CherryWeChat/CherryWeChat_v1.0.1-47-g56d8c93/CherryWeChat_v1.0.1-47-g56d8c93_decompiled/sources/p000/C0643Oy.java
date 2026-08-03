package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: Oy */
/* JADX INFO: loaded from: classes.dex */
public final class C0643Oy {

    /* JADX INFO: renamed from: m */
    public static final C0709Qe f2062m = new C0709Qe(1);

    /* JADX INFO: renamed from: n */
    public static final C0709Qe f2063n = new C0709Qe(2);

    /* JADX INFO: renamed from: o */
    public static final C0709Qe f2064o = new C0709Qe(3);

    /* JADX INFO: renamed from: p */
    public static final C0709Qe f2065p = new C0709Qe(4);

    /* JADX INFO: renamed from: q */
    public static final C0709Qe f2066q = new C0709Qe(5);

    /* JADX INFO: renamed from: r */
    public static final C0709Qe f2067r = new C0709Qe(0);

    /* JADX INFO: renamed from: c */
    public final InterfaceC1300cy f2070c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0671Pj f2071d;

    /* JADX INFO: renamed from: g */
    public final float f2074g;

    /* JADX INFO: renamed from: j */
    public C0686Py f2077j;

    /* JADX INFO: renamed from: k */
    public float f2078k;

    /* JADX INFO: renamed from: l */
    public boolean f2079l;

    /* JADX INFO: renamed from: a */
    public float f2068a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f2069b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public boolean f2072e = false;

    /* JADX INFO: renamed from: f */
    public long f2073f = 0;

    /* JADX INFO: renamed from: h */
    public final ArrayList f2075h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ArrayList f2076i = new ArrayList();

    public C0643Oy(InterfaceC1300cy interfaceC1300cy, AbstractC0671Pj abstractC0671Pj) {
        this.f2070c = interfaceC1300cy;
        this.f2071d = abstractC0671Pj;
        if (abstractC0671Pj == f2064o || abstractC0671Pj == f2065p || abstractC0671Pj == f2066q) {
            this.f2074g = 0.1f;
        } else if (abstractC0671Pj == f2067r) {
            this.f2074g = 0.00390625f;
        } else if (abstractC0671Pj == f2062m || abstractC0671Pj == f2063n) {
            this.f2074g = 0.002f;
        } else {
            this.f2074g = 1.0f;
        }
        this.f2077j = null;
        this.f2078k = Float.MAX_VALUE;
        this.f2079l = false;
    }

    /* JADX INFO: renamed from: b */
    public static C0691Q2 m1265b() {
        ThreadLocal threadLocal = C0691Q2.f2219i;
        if (threadLocal.get() == null) {
            threadLocal.set(new C0691Q2(new C0649P3(3)));
        }
        return (C0691Q2) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [O2, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m1266a(float f) {
        if (this.f2072e) {
            this.f2078k = f;
            return;
        }
        if (this.f2077j == null) {
            this.f2077j = new C0686Py(f);
        }
        C0686Py c0686Py = this.f2077j;
        double d = f;
        c0686Py.f2212i = d;
        double d2 = (float) d;
        if (d2 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f2074g * 0.75f);
        c0686Py.f2207d = dAbs;
        c0686Py.f2208e = dAbs * 62.5d;
        C0649P3 c0649p3 = m1265b().f2224e;
        c0649p3.getClass();
        if (Thread.currentThread() != ((Looper) c0649p3.f2090c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f2072e;
        if (z || z) {
            return;
        }
        this.f2072e = true;
        float fMo191o = this.f2071d.mo191o(this.f2070c);
        this.f2069b = fMo191o;
        if (fMo191o > Float.MAX_VALUE || fMo191o < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        C0691Q2 c0691q2M1265b = m1265b();
        ArrayList arrayList = c0691q2M1265b.f2221b;
        if (arrayList.size() == 0) {
            ((Choreographer) c0691q2M1265b.f2224e.f2089b).postFrameCallback(new ChoreographerFrameCallbackC0648P2(c0691q2M1265b.f2223d));
            if (Build.VERSION.SDK_INT >= 33) {
                c0691q2M1265b.f2226g = ValueAnimator.getDurationScale();
                if (c0691q2M1265b.f2227h == null) {
                    c0691q2M1265b.f2227h = new C0649P3(2, c0691q2M1265b);
                }
                final C0649P3 c0649p32 = c0691q2M1265b.f2227h;
                if (((C0605O2) c0649p32.f2089b) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: O2
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f2) {
                            ((C0691Q2) c0649p32.f2090c).f2226g = f2;
                        }
                    };
                    c0649p32.f2089b = r1;
                    ValueAnimator.registerDurationScaleChangeListener(r1);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m1267c(float f) {
        this.f2071d.mo192z(this.f2070c, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2076i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                throw new ClassCastException();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1268d() {
        if (this.f2077j.f2205b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        C0649P3 c0649p3 = m1265b().f2224e;
        c0649p3.getClass();
        if (Thread.currentThread() != ((Looper) c0649p3.f2090c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f2072e) {
            this.f2079l = true;
        }
    }
}
