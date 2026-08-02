package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0099a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x82 implements ComponentCallbacks2, ga1 {

    /* JADX INFO: renamed from: p */
    public static final z82 f12891p;

    /* JADX INFO: renamed from: h */
    public final ComponentCallbacks2C0099a f12892h;

    /* JADX INFO: renamed from: i */
    public final Context f12893i;

    /* JADX INFO: renamed from: j */
    public final C0160eb f12894j;

    /* JADX INFO: renamed from: k */
    public final er2 f12895k;

    /* JADX INFO: renamed from: l */
    public final C0160eb f12896l;

    /* JADX INFO: renamed from: m */
    public final hh1 f12897m;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArrayList f12898n;

    /* JADX INFO: renamed from: o */
    public final z82 f12899o;

    static {
        z82 z82Var = (z82) new z82().m5906g(Bitmap.class);
        z82Var.f12535u = true;
        f12891p = z82Var;
        ((z82) new z82().m5906g(yo0.class)).f12535u = true;
    }

    public x82(ComponentCallbacks2C0099a componentCallbacks2C0099a, C0160eb c0160eb, C0160eb c0160eb2, Context context) {
        z82 z82Var;
        er2 er2Var = new er2();
        C0160eb c0160eb3 = componentCallbacks2C0099a.f1648m;
        this.f12897m = new hh1(20);
        RunnableC0910y4 runnableC0910y4 = new RunnableC0910y4(4, this);
        this.f12892h = componentCallbacks2C0099a;
        this.f12894j = c0160eb;
        this.f12896l = c0160eb2;
        this.f12895k = er2Var;
        this.f12893i = context;
        Context applicationContext = context.getApplicationContext();
        w82 w82Var = new w82(this, er2Var);
        c0160eb3.getClass();
        boolean z = ((Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_NETWORK_STATE")) ? applicationContext.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) : new oo1(applicationContext).f7752a.areNotificationsEnabled() ? 0 : -1) == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        ga1 sz0Var = z ? new sz0(applicationContext, w82Var) : new i51(8);
        synchronized (componentCallbacks2C0099a.f1649n) {
            if (componentCallbacks2C0099a.f1649n.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C0099a.f1649n.add(this);
        }
        char[] cArr = b93.f747a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c0160eb.m1331t(this);
        } else {
            b93.m499f().post(runnableC0910y4);
        }
        c0160eb.m1331t(sz0Var);
        this.f12898n = new CopyOnWriteArrayList(componentCallbacks2C0099a.f1645j.f12103e);
        vp0 vp0Var = componentCallbacks2C0099a.f1645j;
        synchronized (vp0Var) {
            try {
                if (vp0Var.f12108j == null) {
                    vp0Var.f12102d.getClass();
                    z82 z82Var2 = new z82();
                    z82Var2.f12535u = true;
                    vp0Var.f12108j = z82Var2;
                }
                z82Var = vp0Var.f12108j;
            } finally {
            }
        }
        synchronized (this) {
            z82 z82Var3 = (z82) z82Var.clone();
            if (z82Var3.f12535u && !z82Var3.f12536v) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            z82Var3.f12536v = true;
            z82Var3.f12535u = true;
            this.f12899o = z82Var3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6048a(by2 by2Var) {
        if (by2Var == null) {
            return;
        }
        boolean zM6051d = m6051d(by2Var);
        l82 l82VarMo604u = by2Var.mo604u();
        if (zM6051d) {
            return;
        }
        ComponentCallbacks2C0099a componentCallbacks2C0099a = this.f12892h;
        synchronized (componentCallbacks2C0099a.f1649n) {
            try {
                Iterator it = componentCallbacks2C0099a.f1649n.iterator();
                while (it.hasNext()) {
                    if (((x82) it.next()).m6051d(by2Var)) {
                        return;
                    }
                }
                if (l82VarMo604u != null) {
                    by2Var.mo602o(null);
                    l82VarMo604u.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final s82 m6049b(String str) {
        return new s82(this.f12892h, this, Drawable.class, this.f12893i).m4765D(str);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6050c() {
        er2 er2Var = this.f12895k;
        er2Var.f2576i = false;
        for (l82 l82Var : b93.m498e((Set) er2Var.f2577j)) {
            if (!l82Var.mo1027j() && !l82Var.isRunning()) {
                l82Var.mo1026i();
            }
        }
        ((HashSet) er2Var.f2578k).clear();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m6051d(by2 by2Var) {
        boolean z;
        l82 l82VarMo604u = by2Var.mo604u();
        if (l82VarMo604u == null) {
            return true;
        }
        er2 er2Var = this.f12895k;
        if (l82VarMo604u == null) {
            er2Var.getClass();
            z = true;
        } else {
            z = ((HashSet) er2Var.f2578k).remove(l82VarMo604u) || ((Set) er2Var.f2577j).remove(l82VarMo604u);
            if (z) {
                l82VarMo604u.clear();
            }
        }
        if (!z) {
            return false;
        }
        ((Set) this.f12897m.f4019i).remove(by2Var);
        by2Var.mo602o(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f12895k + ", treeNode=" + this.f12896l + "}";
    }

    @Override // p000.ga1
    /* JADX INFO: renamed from: x */
    public final synchronized void mo881x() {
        m6050c();
        this.f12897m.mo881x();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
