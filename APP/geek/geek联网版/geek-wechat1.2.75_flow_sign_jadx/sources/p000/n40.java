package p000;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.C0035a;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class n40 {

    /* JADX INFO: renamed from: a */
    public int f3214a;

    /* JADX INFO: renamed from: b */
    public int f3215b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0563ol f3216c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f3217d;

    /* JADX INFO: renamed from: e */
    public final HashSet f3218e;

    /* JADX INFO: renamed from: f */
    public boolean f3219f;

    /* JADX INFO: renamed from: g */
    public boolean f3220g;

    /* JADX INFO: renamed from: h */
    public final C0035a f3221h;

    public n40(int i, int i2, C0035a c0035a, C0772u8 c0772u8) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0035a.f469c;
        this.f3217d = new ArrayList();
        this.f3218e = new HashSet();
        this.f3219f = false;
        this.f3220g = false;
        this.f3214a = i;
        this.f3215b = i2;
        this.f3216c = abstractComponentCallbacksC0563ol;
        c0772u8.m2445a(new C0431l0(25, this));
        this.f3221h = c0035a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1912a() {
        HashSet hashSet = this.f3218e;
        if (this.f3219f) {
            return;
        }
        this.f3219f = true;
        if (hashSet.isEmpty()) {
            m1913b();
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0772u8 c0772u8 = (C0772u8) obj;
            synchronized (c0772u8) {
                try {
                    if (!c0772u8.f4664a) {
                        c0772u8.f4664a = true;
                        c0772u8.f4666c = true;
                        InterfaceC0735t8 interfaceC0735t8 = c0772u8.f4665b;
                        if (interfaceC0735t8 != null) {
                            try {
                                interfaceC0735t8.onCancel();
                            } catch (Throwable th) {
                                synchronized (c0772u8) {
                                    c0772u8.f4666c = false;
                                    c0772u8.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c0772u8) {
                            c0772u8.f4666c = false;
                            c0772u8.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1913b() {
        if (!this.f3220g) {
            if (C0023am.m55A(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3220g = true;
            ArrayList arrayList = this.f3217d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.f3221h.m249k();
    }

    /* JADX INFO: renamed from: c */
    public final void m1914c(int i, int i2) {
        int iM1158u = g40.m1158u(i2);
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f3216c;
        if (iM1158u == 0) {
            if (this.f3214a != 1) {
                if (C0023am.m55A(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0563ol + " mFinalState = " + g40.m1160w(this.f3214a) + " -> " + g40.m1160w(i) + ". ");
                }
                this.f3214a = i;
                return;
            }
            return;
        }
        if (iM1158u == 1) {
            if (this.f3214a == 1) {
                if (C0023am.m55A(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0563ol + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + g40.m1159v(this.f3215b) + " to ADDING.");
                }
                this.f3214a = 2;
                this.f3215b = 2;
                return;
            }
            return;
        }
        if (iM1158u != 2) {
            return;
        }
        if (C0023am.m55A(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0563ol + " mFinalState = " + g40.m1160w(this.f3214a) + " -> REMOVED. mLifecycleImpact  = " + g40.m1159v(this.f3215b) + " to REMOVING.");
        }
        this.f3214a = 1;
        this.f3215b = 3;
    }

    /* JADX INFO: renamed from: d */
    public final void m1915d() {
        if (this.f3215b == 2) {
            C0035a c0035a = this.f3221h;
            AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0035a.f469c;
            View viewFindFocus = abstractComponentCallbacksC0563ol.f3474E.findFocus();
            if (viewFindFocus != null) {
                abstractComponentCallbacksC0563ol.m2035f().f3319k = viewFindFocus;
                if (C0023am.m55A(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0563ol);
                }
            }
            View viewM2031A = this.f3216c.m2031A();
            if (viewM2031A.getParent() == null) {
                c0035a.m240b();
                viewM2031A.setAlpha(0.0f);
            }
            if (viewM2031A.getAlpha() == 0.0f && viewM2031A.getVisibility() == 0) {
                viewM2031A.setVisibility(4);
            }
            C0526nl c0526nl = abstractComponentCallbacksC0563ol.f3477H;
            viewM2031A.setAlpha(c0526nl == null ? 1.0f : c0526nl.f3318j);
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + g40.m1160w(this.f3214a) + "} {mLifecycleImpact = " + g40.m1159v(this.f3215b) + "} {mFragment = " + this.f3216c + "}";
    }
}
