package yyds;

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
import com.bumptech.glide.ComponentCallbacks2C0040;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: yyds.ᲁᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2272 implements ComponentCallbacks2, InterfaceC1021 {

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final C1261 f11192;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C2650 f11193;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final RunnableC0871 f11194;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC2111 f11195;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C1586 f11196;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f11197;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final C1261 f11198;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2038 f11199;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ComponentCallbacks2C0040 f11200;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C1424 f11201;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Context f11202;

    static {
        C1261 c1261 = (C1261) new C1261().m1799(Bitmap.class);
        c1261.f3645 = true;
        f11192 = c1261;
        ((C1261) new C1261().m1799(C2380.class)).f3645 = true;
    }

    public ComponentCallbacks2C2272(ComponentCallbacks2C0040 componentCallbacks2C0040, InterfaceC2111 interfaceC2111, C1586 c1586, Context context) {
        C1261 c1261;
        C1424 c1424 = new C1424();
        C0469 c0469 = componentCallbacks2C0040.f379;
        this.f11193 = new C2650();
        RunnableC0871 runnableC0871 = new RunnableC0871(14, this);
        this.f11194 = runnableC0871;
        this.f11200 = componentCallbacks2C0040;
        this.f11195 = interfaceC2111;
        this.f11196 = c1586;
        this.f11201 = c1424;
        this.f11202 = context;
        Context applicationContext = context.getApplicationContext();
        C1941 c1941 = new C1941(this, c1424);
        c0469.getClass();
        boolean z = ((Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_NETWORK_STATE")) ? applicationContext.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) : new C0262(applicationContext).f1450.areNotificationsEnabled() ? 0 : -1) == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC2038 c1078 = z ? new C1078(applicationContext, c1941) : new C1050();
        this.f11199 = c1078;
        synchronized (componentCallbacks2C0040.f380) {
            if (componentCallbacks2C0040.f380.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C0040.f380.add(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC2111.mo246(this);
        } else {
            AbstractC0181.m743().post(runnableC0871);
        }
        interfaceC2111.mo246(c1078);
        this.f11197 = new CopyOnWriteArrayList(componentCallbacks2C0040.f381.f12669);
        C2572 c2572 = componentCallbacks2C0040.f381;
        synchronized (c2572) {
            c1261 = c2572.f12662;
            if (c1261 == null) {
                c1261 = new C1261();
                c1261.f3645 = true;
                c2572.f12662 = c1261;
            }
        }
        synchronized (this) {
            C1261 c12612 = (C1261) c1261.clone();
            if (c12612.f3645 && !c12612.f3638) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c12612.f3638 = true;
            c12612.f3645 = true;
            this.f11198 = c12612;
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

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f11201 + ", treeNode=" + this.f11196 + "}";
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final C0472 m4277(String str) {
        return new C0472(this.f11200, this, Drawable.class, this.f11202).m1279(str);
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final synchronized void m4278() {
        try {
            Iterator it = AbstractC0181.m741(this.f11193.f13048).iterator();
            while (it.hasNext()) {
                m4281((InterfaceC2156) it.next());
            }
            this.f11193.f13048.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final synchronized void m4279() {
        C1424 c1424 = this.f11201;
        c1424.f6735 = true;
        for (InterfaceC1823 interfaceC1823 : AbstractC0181.m741((Set) c1424.f6732)) {
            if (interfaceC1823.isRunning()) {
                interfaceC1823.mo458();
                ((HashSet) c1424.f6734).add(interfaceC1823);
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final synchronized boolean m4280(InterfaceC2156 interfaceC2156) {
        InterfaceC1823 interfaceC1823Mo1201 = interfaceC2156.mo1201();
        if (interfaceC1823Mo1201 == null) {
            return true;
        }
        if (!this.f11201.m2892(interfaceC1823Mo1201)) {
            return false;
        }
        this.f11193.f13048.remove(interfaceC2156);
        interfaceC2156.mo1198(null);
        return true;
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final synchronized void mo1202() {
        this.f11193.mo1202();
        m4278();
        C1424 c1424 = this.f11201;
        Iterator it = AbstractC0181.m741((Set) c1424.f6732).iterator();
        while (it.hasNext()) {
            c1424.m2892((InterfaceC1823) it.next());
        }
        ((HashSet) c1424.f6734).clear();
        this.f11195.mo247(this);
        this.f11195.mo247(this.f11199);
        AbstractC0181.m743().removeCallbacks(this.f11194);
        ComponentCallbacks2C0040 componentCallbacks2C0040 = this.f11200;
        synchronized (componentCallbacks2C0040.f380) {
            if (!componentCallbacks2C0040.f380.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            componentCallbacks2C0040.f380.remove(this);
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m4281(InterfaceC2156 interfaceC2156) {
        if (interfaceC2156 == null) {
            return;
        }
        boolean zM4280 = m4280(interfaceC2156);
        InterfaceC1823 interfaceC1823Mo1201 = interfaceC2156.mo1201();
        if (zM4280) {
            return;
        }
        ComponentCallbacks2C0040 componentCallbacks2C0040 = this.f11200;
        synchronized (componentCallbacks2C0040.f380) {
            try {
                Iterator it = componentCallbacks2C0040.f380.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C2272) it.next()).m4280(interfaceC2156)) {
                        return;
                    }
                }
                if (interfaceC1823Mo1201 != null) {
                    interfaceC2156.mo1198(null);
                    interfaceC1823Mo1201.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final synchronized void mo1203() {
        m4282();
        this.f11193.mo1203();
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final synchronized void mo1204() {
        this.f11193.mo1204();
        m4279();
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final synchronized void m4282() {
        C1424 c1424 = this.f11201;
        c1424.f6735 = false;
        for (InterfaceC1823 interfaceC1823 : AbstractC0181.m741((Set) c1424.f6732)) {
            if (!interfaceC1823.mo450() && !interfaceC1823.isRunning()) {
                interfaceC1823.mo454();
            }
        }
        ((HashSet) c1424.f6734).clear();
    }
}
