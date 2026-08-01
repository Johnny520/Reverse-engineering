package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.app.RunnableC0062;
import com.bumptech.glide.load.engine.C3013;
import com.bumptech.glide.request.C3049;
import com.bumptech.glide.request.InterfaceC3051;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p075.C6958;
import p162.AbstractC7653;
import p222.AbstractC7989;
import p225.InterfaceC7999;
import p232.C8060;
import p232.C8065;
import p232.C8066;
import p232.C8071;
import p232.InterfaceC8061;
import p232.InterfaceC8064;
import p232.InterfaceC8070;
import p232.InterfaceC8073;
import p234.C8082;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C3064 implements ComponentCallbacks2, InterfaceC8073 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C3049 f9792;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C3049 f9793;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC8064 f9794;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8065 f9795;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC8061 f9796;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final CopyOnWriteArrayList f9797;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C8066 f9798;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final RunnableC0062 f9799;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f9800;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC8070 f9801;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ComponentCallbacks2C3058 f9802;

    static {
        C3049 c3049 = (C3049) new C3049().m6617(Bitmap.class);
        c3049.f9732 = true;
        f9792 = c3049;
        ((C3049) new C3049().m6617(C8082.class)).f9732 = true;
    }

    public ComponentCallbacks2C3064(ComponentCallbacks2C3058 componentCallbacks2C3058, InterfaceC8070 interfaceC8070, InterfaceC8064 interfaceC8064, Context context) {
        C3049 c3049;
        C8065 c8065 = new C8065();
        C6958 c6958 = componentCallbacks2C3058.f9770;
        this.f9798 = new C8066();
        RunnableC0062 runnableC0062 = new RunnableC0062(this, 6);
        this.f9799 = runnableC0062;
        this.f9802 = componentCallbacks2C3058;
        this.f9801 = interfaceC8070;
        this.f9794 = interfaceC8064;
        this.f9795 = c8065;
        this.f9800 = context;
        Context applicationContext = context.getApplicationContext();
        C3063 c3063 = new C3063(this, c8065);
        c6958.getClass();
        boolean z = AbstractC7653.m12920(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC8061 c8060 = z ? new C8060(applicationContext, c3063) : new C8071();
        this.f9796 = c8060;
        synchronized (componentCallbacks2C3058.f9771) {
            if (componentCallbacks2C3058.f9771.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C3058.f9771.add(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC8070.mo12277(this);
        } else {
            AbstractC7989.m13478().post(runnableC0062);
        }
        interfaceC8070.mo12277(c8060);
        this.f9797 = new CopyOnWriteArrayList(componentCallbacks2C3058.f9773.f9817);
        C3069 c3069 = componentCallbacks2C3058.f9773;
        synchronized (c3069) {
            try {
                if (c3069.f9825 == null) {
                    c3069.f9818.getClass();
                    C3049 c30492 = new C3049();
                    c30492.f9732 = true;
                    c3069.f9825 = c30492;
                }
                c3049 = c3069.f9825;
            } finally {
            }
        }
        synchronized (this) {
            C3049 c30493 = (C3049) c3049.clone();
            if (c30493.f9732 && !c30493.f9740) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c30493.f9740 = true;
            c30493.f9732 = true;
            this.f9793 = c30493;
        }
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f9795 + ", treeNode=" + this.f9794 + "}";
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final synchronized void mo6775() {
        m6793();
        this.f9798.mo6775();
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final synchronized void mo6777() {
        this.f9798.mo6777();
        m6797();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final synchronized boolean m6792(InterfaceC7999 interfaceC7999) {
        InterfaceC3051 interfaceC3051Mo6776 = interfaceC7999.mo6776();
        if (interfaceC3051Mo6776 == null) {
            return true;
        }
        if (!this.f9795.m13550(interfaceC3051Mo6776)) {
            return false;
        }
        this.f9798.f22248.remove(interfaceC7999);
        interfaceC7999.mo6772(null);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final synchronized void m6793() {
        C8065 c8065 = this.f9795;
        c8065.f22245 = false;
        for (InterfaceC3051 interfaceC3051 : AbstractC7989.m13474((Set) c8065.f22246)) {
            if (!interfaceC3051.mo6604() && !interfaceC3051.isRunning()) {
                interfaceC3051.mo6599();
            }
        }
        ((HashSet) c8065.f22244).clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final synchronized void m6794() {
        try {
            Iterator it = AbstractC7989.m13474(this.f9798.f22248).iterator();
            while (it.hasNext()) {
                m6795((InterfaceC7999) it.next());
            }
            this.f9798.f22248.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m6795(InterfaceC7999 interfaceC7999) {
        if (interfaceC7999 == null) {
            return;
        }
        boolean zM6792 = m6792(interfaceC7999);
        InterfaceC3051 interfaceC3051Mo6776 = interfaceC7999.mo6776();
        if (zM6792) {
            return;
        }
        ComponentCallbacks2C3058 componentCallbacks2C3058 = this.f9802;
        synchronized (componentCallbacks2C3058.f9771) {
            try {
                Iterator it = componentCallbacks2C3058.f9771.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C3064) it.next()).m6792(interfaceC7999)) {
                        return;
                    }
                }
                if (interfaceC3051Mo6776 != null) {
                    interfaceC7999.mo6772(null);
                    interfaceC3051Mo6776.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3062 m6796(String str) {
        return m6800(Drawable.class).m6786(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final synchronized void m6797() {
        C8065 c8065 = this.f9795;
        c8065.f22245 = true;
        for (InterfaceC3051 interfaceC3051 : AbstractC7989.m13474((Set) c8065.f22246)) {
            if (interfaceC3051.isRunning()) {
                interfaceC3051.mo6594();
                ((HashSet) c8065.f22244).add(interfaceC3051);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C3062 m6798(Drawable drawable) {
        return m6800(Drawable.class).m6786(drawable).mo6619((C3049) new C3049().m6616(C3013.f9582));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3062 m6799(File file) {
        return m6800(Drawable.class).m6786(file);
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final synchronized void mo6779() {
        this.f9798.mo6779();
        m6794();
        C8065 c8065 = this.f9795;
        Iterator it = AbstractC7989.m13474((Set) c8065.f22246).iterator();
        while (it.hasNext()) {
            c8065.m13550((InterfaceC3051) it.next());
        }
        ((HashSet) c8065.f22244).clear();
        this.f9801.mo12279(this);
        this.f9801.mo12279(this.f9796);
        AbstractC7989.m13478().removeCallbacks(this.f9799);
        ComponentCallbacks2C3058 componentCallbacks2C3058 = this.f9802;
        synchronized (componentCallbacks2C3058.f9771) {
            if (!componentCallbacks2C3058.f9771.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            componentCallbacks2C3058.f9771.remove(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C3062 m6800(Class cls) {
        return new C3062(this.f9802, this, cls, this.f9800);
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
