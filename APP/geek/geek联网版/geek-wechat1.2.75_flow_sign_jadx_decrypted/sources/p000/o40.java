package p000;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import android.view.View;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o40 {

    /* JADX INFO: renamed from: m */
    public static final C0707sh f3382m = new C0707sh(1);

    /* JADX INFO: renamed from: n */
    public static final C0707sh f3383n = new C0707sh(2);

    /* JADX INFO: renamed from: o */
    public static final C0707sh f3384o = new C0707sh(3);

    /* JADX INFO: renamed from: p */
    public static final C0707sh f3385p = new C0707sh(4);

    /* JADX INFO: renamed from: q */
    public static final C0707sh f3386q = new C0707sh(5);

    /* JADX INFO: renamed from: r */
    public static final C0707sh f3387r = new C0707sh(6);

    /* JADX INFO: renamed from: s */
    public static final C0707sh f3388s = new C0707sh(7);

    /* JADX INFO: renamed from: t */
    public static final C0707sh f3389t = new C0707sh(0);

    /* JADX INFO: renamed from: a */
    public float f3390a;

    /* JADX INFO: renamed from: b */
    public float f3391b;

    /* JADX INFO: renamed from: c */
    public final Object f3392c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0259gf f3393d;

    /* JADX INFO: renamed from: e */
    public boolean f3394e;

    /* JADX INFO: renamed from: f */
    public final float f3395f;

    /* JADX INFO: renamed from: g */
    public long f3396g;

    /* JADX INFO: renamed from: h */
    public float f3397h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f3398i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f3399j;

    /* JADX INFO: renamed from: k */
    public p40 f3400k;

    /* JADX INFO: renamed from: l */
    public float f3401l;

    public o40(Object obj, AbstractC0259gf abstractC0259gf) {
        this(obj, abstractC0259gf, 0);
        this.f3400k = null;
        this.f3401l = Float.MAX_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final void m1984a(InterfaceC0781uh interfaceC0781uh) {
        ArrayList arrayList = this.f3398i;
        if (arrayList.contains(interfaceC0781uh)) {
            return;
        }
        arrayList.add(interfaceC0781uh);
    }

    /* JADX INFO: renamed from: b */
    public final void m1985b(float f) {
        if (this.f3394e) {
            this.f3401l = f;
            return;
        }
        if (this.f3400k == null) {
            this.f3400k = new p40(f);
        }
        this.f3400k.f3590i = f;
        m1991h();
    }

    /* JADX INFO: renamed from: c */
    public final void m1986c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f3394e) {
            m1987d(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1987d(boolean z) {
        ArrayList arrayList;
        int i = 0;
        this.f3394e = false;
        ThreadLocal threadLocal = C0581p2.f3571f;
        if (threadLocal.get() == null) {
            threadLocal.set(new C0581p2());
        }
        C0581p2 c0581p2 = (C0581p2) threadLocal.get();
        c0581p2.f3572a.remove(this);
        ArrayList arrayList2 = c0581p2.f3573b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            c0581p2.f3576e = true;
        }
        this.f3396g = 0L;
        while (true) {
            arrayList = this.f3398i;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((InterfaceC0781uh) arrayList.get(i)).mo587a();
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1988e(InterfaceC0781uh interfaceC0781uh) {
        ArrayList arrayList = this.f3398i;
        int iIndexOf = arrayList.indexOf(interfaceC0781uh);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1989f(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f3397h = f;
    }

    /* JADX INFO: renamed from: g */
    public final void m1990g(float f) {
        this.f3393d.mo1269U(this.f3392c, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3399j;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                C0848w9 c0848w9 = (C0848w9) arrayList.get(i);
                float f2 = this.f3391b;
                float f3 = this.f3390a;
                int i2 = c0848w9.f5073a;
                Object obj = c0848w9.f5074b;
                switch (i2) {
                    case Base64.DEFAULT /* 0 */:
                        ((View) ((p00) obj).f3560b).setScaleY(f2);
                        break;
                    default:
                        View view = (View) obj;
                        float fAbs = (Math.abs(f3) / 3500.0f) + 1.0f;
                        if (fAbs > 1.5f) {
                            fAbs = 1.5f;
                        }
                        view.setScaleX(fAbs);
                        break;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1991h() {
        p40 p40Var = this.f3400k;
        if (p40Var == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) p40Var.f3590i;
        if (d > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        float f = this.f3395f;
        if (d < f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f3397h * 0.75f);
        p40Var.f3585d = dAbs;
        p40Var.f3586e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.f3394e;
        if (z || z) {
            return;
        }
        this.f3394e = true;
        float fMo1273z = this.f3393d.mo1273z(this.f3392c);
        this.f3391b = fMo1273z;
        if (fMo1273z > Float.MAX_VALUE || fMo1273z < f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = C0581p2.f3571f;
        if (threadLocal.get() == null) {
            threadLocal.set(new C0581p2());
        }
        C0581p2 c0581p2 = (C0581p2) threadLocal.get();
        ArrayList arrayList = c0581p2.f3573b;
        if (arrayList.size() == 0) {
            if (c0581p2.f3575d == null) {
                c0581p2.f3575d = new C0658r5(c0581p2.f3574c);
            }
            C0658r5 c0658r5 = c0581p2.f3575d;
            ((Choreographer) c0658r5.f4065c).postFrameCallback((ChoreographerFrameCallbackC0544o2) c0658r5.f4066d);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public o40(View view, AbstractC0259gf abstractC0259gf, float f) {
        this((Object) view, abstractC0259gf, 0);
        this.f3400k = null;
        this.f3401l = Float.MAX_VALUE;
        this.f3400k = new p40(f);
    }

    public o40(Object obj, AbstractC0259gf abstractC0259gf, int i) {
        this.f3390a = 0.0f;
        this.f3391b = Float.MAX_VALUE;
        this.f3394e = false;
        this.f3395f = -3.4028235E38f;
        this.f3396g = 0L;
        this.f3398i = new ArrayList();
        this.f3399j = new ArrayList();
        this.f3392c = obj;
        this.f3393d = abstractC0259gf;
        if (abstractC0259gf != f3386q && abstractC0259gf != f3387r && abstractC0259gf != f3388s) {
            if (abstractC0259gf == f3389t) {
                this.f3397h = 0.00390625f;
                return;
            } else if (abstractC0259gf != f3384o && abstractC0259gf != f3385p) {
                this.f3397h = 1.0f;
                return;
            } else {
                this.f3397h = 0.00390625f;
                return;
            }
        }
        this.f3397h = 0.1f;
    }
}
