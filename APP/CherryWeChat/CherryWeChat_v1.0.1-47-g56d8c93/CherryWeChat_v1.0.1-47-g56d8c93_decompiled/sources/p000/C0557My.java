package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: renamed from: My */
/* JADX INFO: loaded from: classes.dex */
public final class C0557My {

    /* JADX INFO: renamed from: a */
    public int f1825a;

    /* JADX INFO: renamed from: b */
    public int f1826b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC1503hi f1827c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f1828d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f1829e;

    /* JADX INFO: renamed from: f */
    public boolean f1830f;

    /* JADX INFO: renamed from: g */
    public boolean f1831g;

    /* JADX INFO: renamed from: h */
    public final C0326Hi f1832h;

    public C0557My(int i, int i2, C0326Hi c0326Hi, C0609O6 c0609o6) {
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c0326Hi.f1110c;
        this.f1825a = i;
        this.f1826b = i2;
        this.f1827c = abstractComponentCallbacksC1503hi;
        this.f1828d = new ArrayList();
        this.f1829e = new LinkedHashSet();
        c0609o6.m1188a(new C2464rl(3, this));
        this.f1832h = c0326Hi;
    }

    /* JADX INFO: renamed from: a */
    public final void m1097a() {
        LinkedHashSet linkedHashSet = this.f1829e;
        if (this.f1830f) {
            return;
        }
        this.f1830f = true;
        if (linkedHashSet.isEmpty()) {
            m1098b();
            return;
        }
        for (C0609O6 c0609o6 : new LinkedHashSet(linkedHashSet)) {
            synchronized (c0609o6) {
                try {
                    if (!c0609o6.f1951a) {
                        c0609o6.f1951a = true;
                        c0609o6.f1953c = true;
                        InterfaceC0566N6 interfaceC0566N6 = c0609o6.f1952b;
                        if (interfaceC0566N6 != null) {
                            try {
                                interfaceC0566N6.onCancel();
                            } catch (Throwable th) {
                                synchronized (c0609o6) {
                                    c0609o6.f1953c = false;
                                    c0609o6.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c0609o6) {
                            c0609o6.f1953c = false;
                            c0609o6.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1098b() {
        if (!this.f1831g) {
            if (AbstractC2805zi.m5374G(2)) {
                toString();
            }
            this.f1831g = true;
            Iterator it = this.f1828d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f1832h.m704k();
    }

    /* JADX INFO: renamed from: c */
    public final void m1099c(int i, int i2) {
        int iM424v = AbstractC0213Ey.m424v(i2);
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1827c;
        if (iM424v == 0) {
            if (this.f1825a != 1) {
                if (AbstractC2805zi.m5374G(2)) {
                    Objects.toString(abstractComponentCallbacksC1503hi);
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        throw null;
                    }
                }
                this.f1825a = i;
                return;
            }
            return;
        }
        if (iM424v != 1) {
            if (iM424v != 2) {
                return;
            }
            if (AbstractC2805zi.m5374G(2)) {
                Objects.toString(abstractComponentCallbacksC1503hi);
            }
            this.f1825a = 1;
            this.f1826b = 3;
            return;
        }
        if (this.f1825a == 1) {
            if (AbstractC2805zi.m5374G(2)) {
                Objects.toString(abstractComponentCallbacksC1503hi);
            }
            this.f1825a = 2;
            this.f1826b = 2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1100d() {
        int i = this.f1826b;
        C0326Hi c0326Hi = this.f1832h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c0326Hi.f1110c;
                View viewM2879z = abstractComponentCallbacksC1503hi.m2879z();
                if (AbstractC2805zi.m5374G(2)) {
                    Objects.toString(viewM2879z.findFocus());
                    viewM2879z.toString();
                    abstractComponentCallbacksC1503hi.toString();
                }
                viewM2879z.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = c0326Hi.f1110c;
        View viewFindFocus = abstractComponentCallbacksC1503hi2.f5296E.findFocus();
        if (viewFindFocus != null) {
            abstractComponentCallbacksC1503hi2.m2868b().f5007k = viewFindFocus;
            if (AbstractC2805zi.m5374G(2)) {
                viewFindFocus.toString();
                abstractComponentCallbacksC1503hi2.toString();
            }
        }
        View viewM2879z2 = this.f1827c.m2879z();
        if (viewM2879z2.getParent() == null) {
            c0326Hi.m695b();
            viewM2879z2.setAlpha(0.0f);
        }
        if (viewM2879z2.getAlpha() == 0.0f && viewM2879z2.getVisibility() == 0) {
            viewM2879z2.setVisibility(4);
        }
        C1415fi c1415fi = abstractComponentCallbacksC1503hi2.f5299H;
        viewM2879z2.setAlpha(c1415fi == null ? 1.0f : c1415fi.f5006j);
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        StringBuilder sb = new StringBuilder("Operation {");
        sb.append(hexString);
        sb.append("} {finalState = ");
        int i = this.f1825a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
        sb.append(" lifecycleImpact = ");
        int i2 = this.f1826b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE");
        sb.append(" fragment = ");
        sb.append(this.f1827c);
        sb.append('}');
        return sb.toString();
    }
}
