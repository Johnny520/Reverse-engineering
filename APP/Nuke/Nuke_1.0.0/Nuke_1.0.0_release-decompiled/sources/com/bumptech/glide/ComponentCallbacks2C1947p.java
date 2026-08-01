package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p047I0.RunnableC0766v;
import p110W0.C1577b;
import p121Y1.C1753n;
import p142c2.C1892c;
import p154e2.C2023b;
import p154e2.C2029h;
import p154e2.InterfaceC2024c;
import p171h2.C2238e;
import p171h2.InterfaceC2236c;
import p177i2.InterfaceC2313c;
import p194l1.C2495c;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: com.bumptech.glide.p */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C1947p implements ComponentCallbacks2, InterfaceC2024c {

    /* JADX INFO: renamed from: l */
    public static final C2238e f6607l;

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C1921c f6608d;

    /* JADX INFO: renamed from: e */
    public final Context f6609e;

    /* JADX INFO: renamed from: f */
    public final C1577b f6610f;

    /* JADX INFO: renamed from: g */
    public final C2029h f6611g;

    /* JADX INFO: renamed from: h */
    public final C1577b f6612h;

    /* JADX INFO: renamed from: i */
    public final C1753n f6613i;

    /* JADX INFO: renamed from: j */
    public final CopyOnWriteArrayList f6614j;

    /* JADX INFO: renamed from: k */
    public final C2238e f6615k;

    static {
        C2238e c2238e = (C2238e) new C2238e().m4037g(Bitmap.class);
        c2238e.f7306o = true;
        f6607l = c2238e;
        ((C2238e) new C2238e().m4037g(C1892c.class)).f7306o = true;
    }

    public ComponentCallbacks2C1947p(ComponentCallbacks2C1921c componentCallbacks2C1921c, C1577b c1577b, C1577b c1577b2, Context context) {
        C2238e c2238e;
        C2029h c2029h = new C2029h();
        C1577b c1577b3 = componentCallbacks2C1921c.f6519i;
        this.f6613i = new C1753n(5);
        RunnableC0766v runnableC0766v = new RunnableC0766v(4, this);
        this.f6608d = componentCallbacks2C1921c;
        this.f6610f = c1577b;
        this.f6612h = c1577b2;
        this.f6611g = c2029h;
        this.f6609e = context;
        Context applicationContext = context.getApplicationContext();
        C1946o c1946o = new C1946o(this, c2029h);
        c1577b3.getClass();
        boolean z5 = ((Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_NETWORK_STATE")) ? applicationContext.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) : new C2495c(applicationContext).f8004a.areNotificationsEnabled() ? 0 : -1) == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z5 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC2024c c2023b = z5 ? new C2023b(applicationContext, c1946o) : new C1577b(20);
        synchronized (componentCallbacks2C1921c.f6520j) {
            if (componentCallbacks2C1921c.f6520j.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C1921c.f6520j.add(this);
        }
        char[] cArr = AbstractC2511o.f8029a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c1577b.m2850k(this);
        } else {
            AbstractC2511o.m4457f().post(runnableC0766v);
        }
        c1577b.m2850k(c2023b);
        this.f6614j = new CopyOnWriteArrayList(componentCallbacks2C1921c.f6516f.f6541e);
        C1927i c1927i = componentCallbacks2C1921c.f6516f;
        synchronized (c1927i) {
            try {
                if (c1927i.f6546j == null) {
                    c1927i.f6540d.getClass();
                    C2238e c2238e2 = new C2238e();
                    c2238e2.f7306o = true;
                    c1927i.f6546j = c2238e2;
                }
                c2238e = c1927i.f6546j;
            } finally {
            }
        }
        synchronized (this) {
            C2238e c2238e3 = (C2238e) c2238e.clone();
            if (c2238e3.f7306o && !c2238e3.f7307p) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c2238e3.f7307p = true;
            c2238e3.f7306o = true;
            this.f6615k = c2238e3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3613a(InterfaceC2313c interfaceC2313c) {
        if (interfaceC2313c == null) {
            return;
        }
        boolean zM3615c = m3615c(interfaceC2313c);
        InterfaceC2236c interfaceC2236cMo3381t = interfaceC2313c.mo3381t();
        if (zM3615c) {
            return;
        }
        ComponentCallbacks2C1921c componentCallbacks2C1921c = this.f6608d;
        synchronized (componentCallbacks2C1921c.f6520j) {
            try {
                Iterator it = componentCallbacks2C1921c.f6520j.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C1947p) it.next()).m3615c(interfaceC2313c)) {
                        return;
                    }
                }
                if (interfaceC2236cMo3381t != null) {
                    interfaceC2313c.mo3377d(null);
                    interfaceC2236cMo3381t.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3614b() {
        C2029h c2029h = this.f6611g;
        c2029h.f6762e = false;
        for (InterfaceC2236c interfaceC2236c : AbstractC2511o.m4456e((Set) c2029h.f6763f)) {
            if (!interfaceC2236c.mo4052b() && !interfaceC2236c.isRunning()) {
                interfaceC2236c.mo4058h();
            }
        }
        ((HashSet) c2029h.f6764g).clear();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m3615c(InterfaceC2313c interfaceC2313c) {
        InterfaceC2236c interfaceC2236cMo3381t = interfaceC2313c.mo3381t();
        if (interfaceC2236cMo3381t == null) {
            return true;
        }
        C2029h c2029h = this.f6611g;
        boolean z5 = true;
        if (interfaceC2236cMo3381t == null) {
            c2029h.getClass();
        } else {
            boolean zRemove = ((Set) c2029h.f6763f).remove(interfaceC2236cMo3381t);
            if (!((HashSet) c2029h.f6764g).remove(interfaceC2236cMo3381t) && !zRemove) {
                z5 = false;
            }
            if (z5) {
                interfaceC2236cMo3381t.clear();
            }
        }
        if (!z5) {
            return false;
        }
        ((Set) this.f6613i.f6028e).remove(interfaceC2313c);
        interfaceC2313c.mo3377d(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f6611g + ", treeNode=" + this.f6612h + "}";
    }

    @Override // p154e2.InterfaceC2024c
    /* JADX INFO: renamed from: x */
    public final synchronized void mo2852x() {
        m3614b();
        this.f6613i.mo2852x();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
    }
}
