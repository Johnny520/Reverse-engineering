package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p004C.C0066j;
import p091u.C1013c;
import p091u.InterfaceC1012b;

/* JADX INFO: renamed from: androidx.fragment.app.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0420K {

    /* JADX INFO: renamed from: a */
    public int f1274a;

    /* JADX INFO: renamed from: b */
    public int f1275b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0434l f1276c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f1277d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f1278e = new HashSet();

    /* JADX INFO: renamed from: f */
    public boolean f1279f = false;

    /* JADX INFO: renamed from: g */
    public boolean f1280g = false;

    /* JADX INFO: renamed from: h */
    public final C0415F f1281h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0420K(int i2, int i3, C0415F c0415f, C1013c c1013c) {
        this.f1274a = i2;
        this.f1275b = i3;
        this.f1276c = c0415f.f1254c;
        c1013c.m2214a(new C0066j(12, this));
        this.f1281h = c0415f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: a */
    public final void m809a() {
        if (this.f1279f) {
            return;
        }
        this.f1279f = true;
        HashSet hashSet = this.f1278e;
        if (hashSet.isEmpty()) {
            m810b();
            return;
        }
        for (C1013c c1013c : new ArrayList(hashSet)) {
            synchronized (c1013c) {
                try {
                    if (!c1013c.f3609a) {
                        c1013c.f3609a = true;
                        c1013c.f3611c = true;
                        InterfaceC1012b interfaceC1012b = c1013c.f3610b;
                        if (interfaceC1012b != null) {
                            try {
                                interfaceC1012b.mo125o();
                            } catch (Throwable th) {
                                synchronized (c1013c) {
                                    c1013c.f3611c = false;
                                    c1013c.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c1013c) {
                            c1013c.f3611c = false;
                            c1013c.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m810b() {
        if (!this.f1280g) {
            if (C0448z.m856E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1280g = true;
            Iterator it = this.f1277d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f1281h.m799k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m811c(int i2, int i3) {
        int iM816d = AbstractC0421L.m816d(i3);
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1276c;
        if (iM816d == 0) {
            if (this.f1274a != 1) {
                if (C0448z.m856E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0434l + " mFinalState = " + AbstractC0421L.m818f(this.f1274a) + " -> " + AbstractC0421L.m818f(i2) + ". ");
                }
                this.f1274a = i2;
                return;
            }
            return;
        }
        if (iM816d == 1) {
            if (this.f1274a == 1) {
                if (C0448z.m856E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0434l + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC0421L.m817e(this.f1275b) + " to ADDING.");
                }
                this.f1274a = 2;
                this.f1275b = 2;
                return;
            }
            return;
        }
        if (iM816d != 2) {
            return;
        }
        if (C0448z.m856E(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0434l + " mFinalState = " + AbstractC0421L.m818f(this.f1274a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC0421L.m817e(this.f1275b) + " to REMOVING.");
        }
        this.f1274a = 1;
        this.f1275b = 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m812d() {
        if (this.f1275b == 2) {
            C0415F c0415f = this.f1281h;
            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0415f.f1254c;
            View viewFindFocus = abstractComponentCallbacksC0434l.f1353F.findFocus();
            if (viewFindFocus != null) {
                abstractComponentCallbacksC0434l.m839d().f1346k = viewFindFocus;
                if (C0448z.m856E(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0434l);
                }
            }
            View viewM849n = this.f1276c.m849n();
            if (viewM849n.getParent() == null) {
                c0415f.m790b();
                viewM849n.setAlpha(0.0f);
            }
            if (viewM849n.getAlpha() == 0.0f && viewM849n.getVisibility() == 0) {
                viewM849n.setVisibility(4);
            }
            C0433k c0433k = abstractComponentCallbacksC0434l.f1356I;
            viewM849n.setAlpha(c0433k == null ? 1.0f : c0433k.f1345j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + AbstractC0421L.m818f(this.f1274a) + "} {mLifecycleImpact = " + AbstractC0421L.m817e(this.f1275b) + "} {mFragment = " + this.f1276c + "}";
    }
}
