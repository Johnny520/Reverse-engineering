package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.app.RunnableC0909;
import com.bumptech.glide.load.engine.C3845;
import com.bumptech.glide.request.C3881;
import com.bumptech.glide.request.InterfaceC3883;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p091.C7787;
import p178.AbstractC8482;
import p238.AbstractC8818;
import p241.InterfaceC8828;
import p248.C8889;
import p248.C8894;
import p248.C8895;
import p248.C8900;
import p248.InterfaceC8890;
import p248.InterfaceC8893;
import p248.InterfaceC8899;
import p248.InterfaceC8902;
import p250.C8911;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C3896 implements ComponentCallbacks2, InterfaceC8902 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C3881 f10137;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C3881 f10138;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC8893 f10139;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8894 f10140;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC8890 f10141;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final CopyOnWriteArrayList f10142;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C8895 f10143;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final RunnableC0909 f10144;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f10145;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC8899 f10146;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ComponentCallbacks2C3890 f10147;

    static {
        C3881 c3881 = (C3881) new C3881().m7177(Bitmap.class);
        c3881.f10077 = true;
        f10137 = c3881;
        ((C3881) new C3881().m7177(C8911.class)).f10077 = true;
    }

    public ComponentCallbacks2C3896(ComponentCallbacks2C3890 componentCallbacks2C3890, InterfaceC8899 interfaceC8899, InterfaceC8893 interfaceC8893, Context context) {
        C3881 c3881;
        C8894 c8894 = new C8894();
        C7787 c7787 = componentCallbacks2C3890.f10115;
        this.f10143 = new C8895();
        RunnableC0909 runnableC0909 = new RunnableC0909(this, 6);
        this.f10144 = runnableC0909;
        this.f10147 = componentCallbacks2C3890;
        this.f10146 = interfaceC8899;
        this.f10139 = interfaceC8893;
        this.f10140 = c8894;
        this.f10145 = context;
        Context applicationContext = context.getApplicationContext();
        C3895 c3895 = new C3895(this, c8894);
        c7787.getClass();
        boolean z = AbstractC8482.m13479(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC8890 c8889 = z ? new C8889(applicationContext, c3895) : new C8900();
        this.f10141 = c8889;
        synchronized (componentCallbacks2C3890.f10116) {
            if (componentCallbacks2C3890.f10116.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C3890.f10116.add(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC8899.mo12836(this);
        } else {
            AbstractC8818.m14037().post(runnableC0909);
        }
        interfaceC8899.mo12836(c8889);
        this.f10142 = new CopyOnWriteArrayList(componentCallbacks2C3890.f10118.f10162);
        C3901 c3901 = componentCallbacks2C3890.f10118;
        synchronized (c3901) {
            try {
                if (c3901.f10170 == null) {
                    c3901.f10163.getClass();
                    C3881 c38812 = new C3881();
                    c38812.f10077 = true;
                    c3901.f10170 = c38812;
                }
                c3881 = c3901.f10170;
            } finally {
            }
        }
        synchronized (this) {
            C3881 c38813 = (C3881) c3881.clone();
            if (c38813.f10077 && !c38813.f10085) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c38813.f10085 = true;
            c38813.f10077 = true;
            this.f10138 = c38813;
        }
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f10140 + ", treeNode=" + this.f10139 + "}";
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final synchronized void mo7335() {
        m7353();
        this.f10143.mo7335();
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final synchronized void mo7337() {
        this.f10143.mo7337();
        m7357();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final synchronized boolean m7352(InterfaceC8828 interfaceC8828) {
        InterfaceC3883 interfaceC3883Mo7336 = interfaceC8828.mo7336();
        if (interfaceC3883Mo7336 == null) {
            return true;
        }
        if (!this.f10140.m14109(interfaceC3883Mo7336)) {
            return false;
        }
        this.f10143.f22593.remove(interfaceC8828);
        interfaceC8828.mo7332(null);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final synchronized void m7353() {
        C8894 c8894 = this.f10140;
        c8894.f22590 = false;
        for (InterfaceC3883 interfaceC3883 : AbstractC8818.m14033((Set) c8894.f22591)) {
            if (!interfaceC3883.mo7164() && !interfaceC3883.isRunning()) {
                interfaceC3883.mo7159();
            }
        }
        ((HashSet) c8894.f22589).clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final synchronized void m7354() {
        try {
            Iterator it = AbstractC8818.m14033(this.f10143.f22593).iterator();
            while (it.hasNext()) {
                m7355((InterfaceC8828) it.next());
            }
            this.f10143.f22593.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m7355(InterfaceC8828 interfaceC8828) {
        if (interfaceC8828 == null) {
            return;
        }
        boolean zM7352 = m7352(interfaceC8828);
        InterfaceC3883 interfaceC3883Mo7336 = interfaceC8828.mo7336();
        if (zM7352) {
            return;
        }
        ComponentCallbacks2C3890 componentCallbacks2C3890 = this.f10147;
        synchronized (componentCallbacks2C3890.f10116) {
            try {
                Iterator it = componentCallbacks2C3890.f10116.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C3896) it.next()).m7352(interfaceC8828)) {
                        return;
                    }
                }
                if (interfaceC3883Mo7336 != null) {
                    interfaceC8828.mo7332(null);
                    interfaceC3883Mo7336.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3894 m7356(String str) {
        return m7360(Drawable.class).m7346(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final synchronized void m7357() {
        C8894 c8894 = this.f10140;
        c8894.f22590 = true;
        for (InterfaceC3883 interfaceC3883 : AbstractC8818.m14033((Set) c8894.f22591)) {
            if (interfaceC3883.isRunning()) {
                interfaceC3883.mo7154();
                ((HashSet) c8894.f22589).add(interfaceC3883);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C3894 m7358(Drawable drawable) {
        return m7360(Drawable.class).m7346(drawable).mo7179((C3881) new C3881().m7176(C3845.f9927));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3894 m7359(File file) {
        return m7360(Drawable.class).m7346(file);
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final synchronized void mo7339() {
        this.f10143.mo7339();
        m7354();
        C8894 c8894 = this.f10140;
        Iterator it = AbstractC8818.m14033((Set) c8894.f22591).iterator();
        while (it.hasNext()) {
            c8894.m14109((InterfaceC3883) it.next());
        }
        ((HashSet) c8894.f22589).clear();
        this.f10146.mo12838(this);
        this.f10146.mo12838(this.f10141);
        AbstractC8818.m14037().removeCallbacks(this.f10144);
        ComponentCallbacks2C3890 componentCallbacks2C3890 = this.f10147;
        synchronized (componentCallbacks2C3890.f10116) {
            if (!componentCallbacks2C3890.f10116.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            componentCallbacks2C3890.f10116.remove(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C3894 m7360(Class cls) {
        return new C3894(this.f10147, this, cls, this.f10145);
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
