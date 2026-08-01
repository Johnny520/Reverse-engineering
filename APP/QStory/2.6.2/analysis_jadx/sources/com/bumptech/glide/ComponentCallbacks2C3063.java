package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.app.RunnableC0062;
import com.bumptech.glide.load.engine.C3012;
import com.bumptech.glide.request.C3048;
import com.bumptech.glide.request.InterfaceC3050;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p075.C6957;
import p162.AbstractC7652;
import p222.AbstractC7988;
import p225.InterfaceC7998;
import p232.C8059;
import p232.C8064;
import p232.C8065;
import p232.C8070;
import p232.InterfaceC8060;
import p232.InterfaceC8063;
import p232.InterfaceC8069;
import p232.InterfaceC8072;
import p234.C8081;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C3063 implements ComponentCallbacks2, InterfaceC8072 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C3048 f9783;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C3048 f9784;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC8063 f9785;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8064 f9786;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC8060 f9787;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final CopyOnWriteArrayList f9788;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C8065 f9789;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final RunnableC0062 f9790;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f9791;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC8069 f9792;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ComponentCallbacks2C3057 f9793;

    static {
        C3048 c3048 = (C3048) new C3048().m6557(Bitmap.class);
        c3048.f9730 = true;
        f9783 = c3048;
        ((C3048) new C3048().m6557(C8081.class)).f9730 = true;
    }

    public ComponentCallbacks2C3063(ComponentCallbacks2C3057 componentCallbacks2C3057, InterfaceC8069 interfaceC8069, InterfaceC8063 interfaceC8063, Context context) {
        C3048 c3048;
        C8064 c8064 = new C8064();
        C6957 c6957 = componentCallbacks2C3057.f9761;
        this.f9789 = new C8065();
        RunnableC0062 runnableC0062 = new RunnableC0062(this, 6);
        this.f9790 = runnableC0062;
        this.f9793 = componentCallbacks2C3057;
        this.f9792 = interfaceC8069;
        this.f9785 = interfaceC8063;
        this.f9786 = c8064;
        this.f9791 = context;
        Context applicationContext = context.getApplicationContext();
        C3062 c3062 = new C3062(this, c8064);
        c6957.getClass();
        boolean z = AbstractC7652.m12891(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC8060 c8059 = z ? new C8059(applicationContext, c3062) : new C8070();
        this.f9787 = c8059;
        synchronized (componentCallbacks2C3057.f9762) {
            if (componentCallbacks2C3057.f9762.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C3057.f9762.add(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC8069.mo12250(this);
        } else {
            AbstractC7988.m13450().post(runnableC0062);
        }
        interfaceC8069.mo12250(c8059);
        this.f9788 = new CopyOnWriteArrayList(componentCallbacks2C3057.f9764.f9812);
        C3068 c3068 = componentCallbacks2C3057.f9764;
        synchronized (c3068) {
            try {
                if (c3068.f9820 == null) {
                    c3068.f9813.getClass();
                    C3048 c30482 = new C3048();
                    c30482.f9730 = true;
                    c3068.f9820 = c30482;
                }
                c3048 = c3068.f9820;
            } finally {
            }
        }
        synchronized (this) {
            C3048 c30483 = (C3048) c3048.clone();
            if (c30483.f9730 && !c30483.f9738) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c30483.f9738 = true;
            c30483.f9730 = true;
            this.f9784 = c30483;
        }
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f9786 + ", treeNode=" + this.f9785 + "}";
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final synchronized void mo6730() {
        m6748();
        this.f9789.mo6730();
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final synchronized void mo6732() {
        this.f9789.mo6732();
        m6752();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final synchronized boolean m6747(InterfaceC7998 interfaceC7998) {
        InterfaceC3050 interfaceC3050Mo6731 = interfaceC7998.mo6731();
        if (interfaceC3050Mo6731 == null) {
            return true;
        }
        if (!this.f9786.m13521(interfaceC3050Mo6731)) {
            return false;
        }
        this.f9789.f22250.remove(interfaceC7998);
        interfaceC7998.mo6727(null);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final synchronized void m6748() {
        C8064 c8064 = this.f9786;
        c8064.f22247 = false;
        for (InterfaceC3050 interfaceC3050 : AbstractC7988.m13446((Set) c8064.f22248)) {
            if (!interfaceC3050.mo6544() && !interfaceC3050.isRunning()) {
                interfaceC3050.mo6539();
            }
        }
        ((HashSet) c8064.f22246).clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final synchronized void m6749() {
        try {
            Iterator it = AbstractC7988.m13446(this.f9789.f22250).iterator();
            while (it.hasNext()) {
                m6750((InterfaceC7998) it.next());
            }
            this.f9789.f22250.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m6750(InterfaceC7998 interfaceC7998) {
        if (interfaceC7998 == null) {
            return;
        }
        boolean zM6747 = m6747(interfaceC7998);
        InterfaceC3050 interfaceC3050Mo6731 = interfaceC7998.mo6731();
        if (zM6747) {
            return;
        }
        ComponentCallbacks2C3057 componentCallbacks2C3057 = this.f9793;
        synchronized (componentCallbacks2C3057.f9762) {
            try {
                Iterator it = componentCallbacks2C3057.f9762.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C3063) it.next()).m6747(interfaceC7998)) {
                        return;
                    }
                }
                if (interfaceC3050Mo6731 != null) {
                    interfaceC7998.mo6727(null);
                    interfaceC3050Mo6731.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3061 m6751(String str) {
        return m6755(Drawable.class).m6741(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final synchronized void m6752() {
        C8064 c8064 = this.f9786;
        c8064.f22247 = true;
        for (InterfaceC3050 interfaceC3050 : AbstractC7988.m13446((Set) c8064.f22248)) {
            if (interfaceC3050.isRunning()) {
                interfaceC3050.mo6534();
                ((HashSet) c8064.f22246).add(interfaceC3050);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C3061 m6753(Drawable drawable) {
        return m6755(Drawable.class).m6741(drawable).mo6559((C3048) new C3048().m6556(C3012.f9580));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3061 m6754(File file) {
        return m6755(Drawable.class).m6741(file);
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final synchronized void mo6734() {
        this.f9789.mo6734();
        m6749();
        C8064 c8064 = this.f9786;
        Iterator it = AbstractC7988.m13446((Set) c8064.f22248).iterator();
        while (it.hasNext()) {
            c8064.m13521((InterfaceC3050) it.next());
        }
        ((HashSet) c8064.f22246).clear();
        this.f9792.mo12252(this);
        this.f9792.mo12252(this.f9787);
        AbstractC7988.m13450().removeCallbacks(this.f9790);
        ComponentCallbacks2C3057 componentCallbacks2C3057 = this.f9793;
        synchronized (componentCallbacks2C3057.f9762) {
            if (!componentCallbacks2C3057.f9762.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            componentCallbacks2C3057.f9762.remove(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C3061 m6755(Class cls) {
        return new C3061(this.f9793, this, cls, this.f9791);
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
