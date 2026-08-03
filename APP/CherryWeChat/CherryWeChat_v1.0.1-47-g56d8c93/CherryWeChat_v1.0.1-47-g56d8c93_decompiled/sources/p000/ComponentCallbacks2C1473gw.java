package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: gw */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C1473gw implements ComponentCallbacks2, InterfaceC0975Wn {

    /* JADX INFO: renamed from: k */
    public static final C2252mw f5215k;

    /* JADX INFO: renamed from: a */
    public final ComponentCallbacks2C1273a f5216a;

    /* JADX INFO: renamed from: b */
    public final Context f5217b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0718Qn f5218c;

    /* JADX INFO: renamed from: d */
    public final C2692wy f5219d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2209lw f5220e;

    /* JADX INFO: renamed from: f */
    public final C1488hA f5221f;

    /* JADX INFO: renamed from: g */
    public final RunnableC0431K0 f5222g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1136ab f5223h;

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArrayList f5224i;

    /* JADX INFO: renamed from: j */
    public final C2252mw f5225j;

    static {
        C2252mw c2252mw = (C2252mw) new C2252mw().m5310d(Bitmap.class);
        c2252mw.f9365n = true;
        f5215k = c2252mw;
        ((C2252mw) new C2252mw().m5310d(C0026Aj.class)).f9365n = true;
    }

    public ComponentCallbacks2C1473gw(ComponentCallbacks2C1273a componentCallbacks2C1273a, InterfaceC0718Qn interfaceC0718Qn, InterfaceC2209lw interfaceC2209lw, Context context) {
        C2252mw c2252mw;
        C2692wy c2692wy = new C2692wy();
        C2220m6 c2220m6 = componentCallbacks2C1273a.f4342f;
        this.f5221f = new C1488hA();
        RunnableC0431K0 runnableC0431K0 = new RunnableC0431K0(12, this);
        this.f5222g = runnableC0431K0;
        this.f5216a = componentCallbacks2C1273a;
        this.f5218c = interfaceC0718Qn;
        this.f5220e = interfaceC2209lw;
        this.f5219d = c2692wy;
        this.f5217b = context;
        Context applicationContext = context.getApplicationContext();
        C1429fw c1429fw = new C1429fw(this, c2692wy);
        c2220m6.getClass();
        InterfaceC1136ab c0578Nc = AbstractC0295Gu.m610c(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new C0578Nc(applicationContext, c1429fw) : new C1234bt();
        this.f5223h = c0578Nc;
        synchronized (componentCallbacks2C1273a.f4343g) {
            if (componentCallbacks2C1273a.f4343g.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C1273a.f4343g.add(this);
        }
        char[] cArr = AbstractC2622vD.f9104a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC0718Qn.mo1508l(this);
        } else {
            AbstractC2622vD.m5135f().post(runnableC0431K0);
        }
        interfaceC0718Qn.mo1508l(c0578Nc);
        this.f5224i = new CopyOnWriteArrayList(componentCallbacks2C1273a.f4339c.f2400e);
        C0756Rj c0756Rj = componentCallbacks2C1273a.f4339c;
        synchronized (c0756Rj) {
            try {
                if (c0756Rj.f2405j == null) {
                    c0756Rj.f2399d.getClass();
                    C2252mw c2252mw2 = new C2252mw();
                    c2252mw2.f9365n = true;
                    c0756Rj.f2405j = c2252mw2;
                }
                c2252mw = c0756Rj.f2405j;
            } finally {
            }
        }
        synchronized (this) {
            C2252mw c2252mw3 = (C2252mw) c2252mw.clone();
            if (c2252mw3.f9365n && !c2252mw3.f9366o) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c2252mw3.f9366o = true;
            c2252mw3.f9365n = true;
            this.f5225j = c2252mw3;
        }
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: b */
    public final synchronized void mo392b() {
        this.f5221f.mo392b();
        m2832m();
        C2692wy c2692wy = this.f5219d;
        Iterator it = AbstractC2622vD.m5134e((Set) c2692wy.f9265c).iterator();
        while (it.hasNext()) {
            c2692wy.m5267a((InterfaceC1026Xv) it.next());
        }
        ((HashSet) c2692wy.f9266d).clear();
        this.f5218c.mo1507d(this);
        this.f5218c.mo1507d(this.f5223h);
        AbstractC2622vD.m5135f().removeCallbacks(this.f5222g);
        ComponentCallbacks2C1273a componentCallbacks2C1273a = this.f5216a;
        synchronized (componentCallbacks2C1273a.f4343g) {
            if (!componentCallbacks2C1273a.f4343g.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            componentCallbacks2C1273a.f4343g.remove(this);
        }
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: d */
    public final synchronized void mo394d() {
        this.f5221f.mo394d();
        m2834o();
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: k */
    public final synchronized void mo401k() {
        m2835p();
        this.f5221f.mo401k();
    }

    /* JADX INFO: renamed from: l */
    public final void m2831l(InterfaceC1444gA interfaceC1444gA) {
        if (interfaceC1444gA == null) {
            return;
        }
        boolean zM2836q = m2836q(interfaceC1444gA);
        InterfaceC1026Xv interfaceC1026XvMo391a = interfaceC1444gA.mo391a();
        if (zM2836q) {
            return;
        }
        ComponentCallbacks2C1273a componentCallbacks2C1273a = this.f5216a;
        synchronized (componentCallbacks2C1273a.f4343g) {
            try {
                Iterator it = componentCallbacks2C1273a.f4343g.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C1473gw) it.next()).m2836q(interfaceC1444gA)) {
                        return;
                    }
                }
                if (interfaceC1026XvMo391a != null) {
                    interfaceC1444gA.mo397g(null);
                    interfaceC1026XvMo391a.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m2832m() {
        try {
            Iterator it = AbstractC2622vD.m5134e(this.f5221f.f5258a).iterator();
            while (it.hasNext()) {
                m2831l((InterfaceC1444gA) it.next());
            }
            this.f5221f.f5258a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C1193aw m2833n(String str) {
        return new C1193aw(this.f5216a, this, Drawable.class, this.f5217b).m2300C(str);
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m2834o() {
        C2692wy c2692wy = this.f5219d;
        c2692wy.f9264b = true;
        for (InterfaceC1026Xv interfaceC1026Xv : AbstractC2622vD.m5134e((Set) c2692wy.f9265c)) {
            if (interfaceC1026Xv.isRunning()) {
                interfaceC1026Xv.mo1937d();
                ((HashSet) c2692wy.f9266d).add(interfaceC1026Xv);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m2835p() {
        C2692wy c2692wy = this.f5219d;
        c2692wy.f9264b = false;
        for (InterfaceC1026Xv interfaceC1026Xv : AbstractC2622vD.m5134e((Set) c2692wy.f9265c)) {
            if (!interfaceC1026Xv.mo1942k() && !interfaceC1026Xv.isRunning()) {
                interfaceC1026Xv.mo1941j();
            }
        }
        ((HashSet) c2692wy.f9266d).clear();
    }

    /* JADX INFO: renamed from: q */
    public final synchronized boolean m2836q(InterfaceC1444gA interfaceC1444gA) {
        InterfaceC1026Xv interfaceC1026XvMo391a = interfaceC1444gA.mo391a();
        if (interfaceC1026XvMo391a == null) {
            return true;
        }
        if (!this.f5219d.m5267a(interfaceC1026XvMo391a)) {
            return false;
        }
        this.f5221f.f5258a.remove(interfaceC1444gA);
        interfaceC1444gA.mo397g(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f5219d + ", treeNode=" + this.f5220e + "}";
    }
}
