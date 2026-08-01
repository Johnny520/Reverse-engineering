package p000;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import android.view.View;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h40 {

    /* JADX INFO: renamed from: l */
    public static final C0634qh f2217l = new C0634qh(1);

    /* JADX INFO: renamed from: m */
    public static final C0634qh f2218m = new C0634qh(2);

    /* JADX INFO: renamed from: n */
    public static final C0634qh f2219n = new C0634qh(3);

    /* JADX INFO: renamed from: o */
    public static final C0634qh f2220o = new C0634qh(4);

    /* JADX INFO: renamed from: p */
    public static final C0634qh f2221p = new C0634qh(5);

    /* JADX INFO: renamed from: q */
    public static final C0634qh f2222q = new C0634qh(6);

    /* JADX INFO: renamed from: r */
    public static final C0634qh f2223r = new C0634qh(7);

    /* JADX INFO: renamed from: s */
    public static final C0634qh f2224s = new C0634qh(0);

    /* JADX INFO: renamed from: c */
    public final Object f2227c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0346ip f2228d;

    /* JADX INFO: renamed from: g */
    public float f2231g;

    /* JADX INFO: renamed from: j */
    public i40 f2234j;

    /* JADX INFO: renamed from: k */
    public float f2235k;

    /* JADX INFO: renamed from: a */
    public float f2225a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f2226b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public boolean f2229e = false;

    /* JADX INFO: renamed from: f */
    public long f2230f = 0;

    /* JADX INFO: renamed from: h */
    public final ArrayList f2232h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ArrayList f2233i = new ArrayList();

    public h40(Object obj, AbstractC0346ip abstractC0346ip) {
        this.f2227c = obj;
        this.f2228d = abstractC0346ip;
        if (abstractC0346ip == f2221p || abstractC0346ip == f2222q || abstractC0346ip == f2223r) {
            this.f2231g = 0.1f;
        } else if (abstractC0346ip == f2224s || abstractC0346ip == f2219n || abstractC0346ip == f2220o) {
            this.f2231g = 0.00390625f;
        } else {
            this.f2231g = 1.0f;
        }
        this.f2234j = null;
        this.f2235k = Float.MAX_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final void m1339a(InterfaceC0708sh interfaceC0708sh) {
        ArrayList arrayList = this.f2232h;
        if (arrayList.contains(interfaceC0708sh)) {
            return;
        }
        arrayList.add(interfaceC0708sh);
    }

    /* JADX INFO: renamed from: b */
    public final void m1340b(float f) {
        if (this.f2229e) {
            this.f2235k = f;
            return;
        }
        if (this.f2234j == null) {
            this.f2234j = new i40(f);
        }
        this.f2234j.f2352i = f;
        m1346h();
    }

    /* JADX INFO: renamed from: c */
    public final void m1341c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f2229e) {
            m1342d(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1342d(boolean z) {
        ArrayList arrayList;
        int i = 0;
        this.f2229e = false;
        ThreadLocal threadLocal = C0582p2.f3635f;
        if (threadLocal.get() == null) {
            threadLocal.set(new C0582p2());
        }
        C0582p2 c0582p2 = (C0582p2) threadLocal.get();
        c0582p2.f3636a.remove(this);
        ArrayList arrayList2 = c0582p2.f3637b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            c0582p2.f3640e = true;
        }
        this.f2230f = 0L;
        while (true) {
            arrayList = this.f2232h;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((InterfaceC0708sh) arrayList.get(i)).mo451a();
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
    public final void m1343e(InterfaceC0708sh interfaceC0708sh) {
        ArrayList arrayList = this.f2232h;
        int iIndexOf = arrayList.indexOf(interfaceC0708sh);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1344f(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f2231g = f;
    }

    /* JADX INFO: renamed from: g */
    public final void m1345g(float f) {
        this.f2228d.mo1515V(this.f2227c, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2233i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                C0440l9 c0440l9 = (C0440l9) arrayList.get(i);
                float f2 = this.f2226b;
                float f3 = this.f2225a;
                int i2 = c0440l9.f3032a;
                Object obj = c0440l9.f3033b;
                switch (i2) {
                    case Base64.DEFAULT /* 0 */:
                        ((View) ((i00) obj).f2326b).setScaleY(f2);
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
    public final void m1346h() {
        i40 i40Var = this.f2234j;
        if (i40Var == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) i40Var.f2352i;
        if (d > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f2231g * 0.75f);
        i40Var.f2347d = dAbs;
        i40Var.f2348e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.f2229e;
        if (z || z) {
            return;
        }
        this.f2229e = true;
        float fMo1516y = this.f2228d.mo1516y(this.f2227c);
        this.f2226b = fMo1516y;
        if (fMo1516y > Float.MAX_VALUE || fMo1516y < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = C0582p2.f3635f;
        if (threadLocal.get() == null) {
            threadLocal.set(new C0582p2());
        }
        C0582p2 c0582p2 = (C0582p2) threadLocal.get();
        ArrayList arrayList = c0582p2.f3637b;
        if (arrayList.size() == 0) {
            if (c0582p2.f3639d == null) {
                c0582p2.f3639d = new C0659r5(c0582p2.f3638c);
            }
            C0659r5 c0659r5 = c0582p2.f3639d;
            ((Choreographer) c0659r5.f4210c).postFrameCallback((ChoreographerFrameCallbackC0544o2) c0659r5.f4211d);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }
}
