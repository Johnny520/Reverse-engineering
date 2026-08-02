package defpackage;

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
import com.bumptech.glide.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x82 implements ComponentCallbacks2, ga1 {
    public static final z82 p;
    public final a h;
    public final Context i;
    public final eb j;
    public final er2 k;
    public final eb l;
    public final hh1 m;
    public final CopyOnWriteArrayList n;
    public final z82 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        z82 z82Var = (z82) new z82().g(Bitmap.class);
        z82Var.u = true;
        p = z82Var;
        ((z82) new z82().g(yo0.class)).u = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x82(a aVar, eb ebVar, eb ebVar2, Context context) {
        z82 z82Var;
        er2 er2Var = new er2();
        eb ebVar3 = aVar.m;
        this.m = new hh1(20);
        y4 y4Var = new y4(4, this);
        this.h = aVar;
        this.j = ebVar;
        this.l = ebVar2;
        this.k = er2Var;
        this.i = context;
        Context applicationContext = context.getApplicationContext();
        w82 w82Var = new w82(this, er2Var);
        ebVar3.getClass();
        boolean z = ((Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_NETWORK_STATE")) ? applicationContext.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) : new oo1(applicationContext).a.areNotificationsEnabled() ? 0 : -1) == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        ga1 sz0Var = z ? new sz0(applicationContext, w82Var) : new i51(8);
        synchronized (aVar.n) {
            if (aVar.n.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.n.add(this);
        }
        char[] cArr = b93.a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ebVar.t(this);
        } else {
            b93.f().post(y4Var);
        }
        ebVar.t(sz0Var);
        this.n = new CopyOnWriteArrayList(aVar.j.e);
        vp0 vp0Var = aVar.j;
        synchronized (vp0Var) {
            try {
                if (vp0Var.j == null) {
                    vp0Var.d.getClass();
                    z82 z82Var2 = new z82();
                    z82Var2.u = true;
                    vp0Var.j = z82Var2;
                }
                z82Var = vp0Var.j;
            } finally {
            }
        }
        synchronized (this) {
            z82 z82Var3 = (z82) z82Var.clone();
            if (z82Var3.u && !z82Var3.v) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            z82Var3.v = true;
            z82Var3.u = true;
            this.o = z82Var3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(by2 by2Var) {
        if (by2Var == null) {
            return;
        }
        boolean zD = d(by2Var);
        l82 l82VarU = by2Var.u();
        if (zD) {
            return;
        }
        a aVar = this.h;
        synchronized (aVar.n) {
            try {
                Iterator it = aVar.n.iterator();
                while (it.hasNext()) {
                    if (((x82) it.next()).d(by2Var)) {
                        return;
                    }
                }
                if (l82VarU != null) {
                    by2Var.o(null);
                    l82VarU.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final s82 b(String str) {
        return new s82(this.h, this, Drawable.class, this.i).D(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void c() {
        er2 er2Var = this.k;
        er2Var.i = false;
        for (l82 l82Var : b93.e((Set) er2Var.j)) {
            if (!l82Var.j() && !l82Var.isRunning()) {
                l82Var.i();
            }
        }
        ((HashSet) er2Var.k).clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized boolean d(by2 by2Var) {
        boolean z;
        l82 l82VarU = by2Var.u();
        if (l82VarU == null) {
            return true;
        }
        er2 er2Var = this.k;
        if (l82VarU == null) {
            er2Var.getClass();
            z = true;
        } else {
            z = ((HashSet) er2Var.k).remove(l82VarU) || ((Set) er2Var.j).remove(l82VarU);
            if (z) {
                l82VarU.clear();
            }
        }
        if (!z) {
            return false;
        }
        ((Set) this.m.i).remove(by2Var);
        by2Var.o(null);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.k + ", treeNode=" + this.l + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ga1
    public final synchronized void x() {
        c();
        this.m.x();
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
