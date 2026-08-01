package p000;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.C0035a;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class g40 {

    /* JADX INFO: renamed from: a */
    public int f2014a;

    /* JADX INFO: renamed from: b */
    public int f2015b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0489ml f2016c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f2017d;

    /* JADX INFO: renamed from: e */
    public final HashSet f2018e;

    /* JADX INFO: renamed from: f */
    public boolean f2019f;

    /* JADX INFO: renamed from: g */
    public boolean f2020g;

    /* JADX INFO: renamed from: h */
    public final C0035a f2021h;

    public g40(int i, int i2, C0035a c0035a, C0402k8 c0402k8) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0035a.f506c;
        this.f2017d = new ArrayList();
        this.f2018e = new HashSet();
        this.f2019f = false;
        this.f2020g = false;
        this.f2014a = i;
        this.f2015b = i2;
        this.f2016c = abstractComponentCallbacksC0489ml;
        c0402k8.m1643a(new C0431l0(25, this));
        this.f2021h = c0035a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1259a() {
        HashSet hashSet = this.f2018e;
        if (this.f2019f) {
            return;
        }
        this.f2019f = true;
        if (hashSet.isEmpty()) {
            m1260b();
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0402k8 c0402k8 = (C0402k8) obj;
            synchronized (c0402k8) {
                try {
                    if (!c0402k8.f2732a) {
                        c0402k8.f2732a = true;
                        c0402k8.f2734c = true;
                        InterfaceC0365j8 interfaceC0365j8 = c0402k8.f2733b;
                        if (interfaceC0365j8 != null) {
                            try {
                                interfaceC0365j8.onCancel();
                            } catch (Throwable th) {
                                synchronized (c0402k8) {
                                    c0402k8.f2734c = false;
                                    c0402k8.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c0402k8) {
                            c0402k8.f2734c = false;
                            c0402k8.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1260b() {
        if (!this.f2020g) {
            if (C0934yl.m2689A(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2020g = true;
            ArrayList arrayList = this.f2017d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.f2021h.m264k();
    }

    /* JADX INFO: renamed from: c */
    public final void m1261c(int i, int i2) {
        int iM2775t = z30.m2775t(i2);
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f2016c;
        if (iM2775t == 0) {
            if (this.f2014a != 1) {
                if (C0934yl.m2689A(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0489ml + " mFinalState = " + z30.m2777v(this.f2014a) + " -> " + z30.m2777v(i) + ". ");
                }
                this.f2014a = i;
                return;
            }
            return;
        }
        if (iM2775t == 1) {
            if (this.f2014a == 1) {
                if (C0934yl.m2689A(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0489ml + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + z30.m2776u(this.f2015b) + " to ADDING.");
                }
                this.f2014a = 2;
                this.f2015b = 2;
                return;
            }
            return;
        }
        if (iM2775t != 2) {
            return;
        }
        if (C0934yl.m2689A(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0489ml + " mFinalState = " + z30.m2777v(this.f2014a) + " -> REMOVED. mLifecycleImpact  = " + z30.m2776u(this.f2015b) + " to REMOVING.");
        }
        this.f2014a = 1;
        this.f2015b = 3;
    }

    /* JADX INFO: renamed from: d */
    public final void m1262d() {
        if (this.f2015b == 2) {
            C0035a c0035a = this.f2021h;
            AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0035a.f506c;
            View viewFindFocus = abstractComponentCallbacksC0489ml.f3229E.findFocus();
            if (viewFindFocus != null) {
                abstractComponentCallbacksC0489ml.m1833f().f3079k = viewFindFocus;
                if (C0934yl.m2689A(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0489ml);
                }
            }
            View viewM1829A = this.f2016c.m1829A();
            if (viewM1829A.getParent() == null) {
                c0035a.m255b();
                viewM1829A.setAlpha(0.0f);
            }
            if (viewM1829A.getAlpha() == 0.0f && viewM1829A.getVisibility() == 0) {
                viewM1829A.setVisibility(4);
            }
            C0452ll c0452ll = abstractComponentCallbacksC0489ml.f3232H;
            viewM1829A.setAlpha(c0452ll == null ? 1.0f : c0452ll.f3078j);
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + z30.m2777v(this.f2014a) + "} {mLifecycleImpact = " + z30.m2776u(this.f2015b) + "} {mFragment = " + this.f2016c + "}";
    }
}
