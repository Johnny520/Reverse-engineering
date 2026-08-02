package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Trace;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0099a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class er2 implements bq0 {

    /* JADX INFO: renamed from: l */
    public static volatile er2 f2574l;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2575h;

    /* JADX INFO: renamed from: i */
    public boolean f2576i;

    /* JADX INFO: renamed from: j */
    public Object f2577j;

    /* JADX INFO: renamed from: k */
    public final Object f2578k;

    public er2(Context context) {
        this.f2575h = 0;
        this.f2578k = new HashSet();
        this.f2577j = new f90(new af0(new r80(context, 9)), new br2(this));
    }

    /* JADX INFO: renamed from: a */
    public boolean m1411a(long j) {
        Object obj;
        List list = (List) ((dq1) this.f2578k).f2147i;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (up0.m5553s(((q12) obj).f8690a, j)) {
                break;
            }
            i++;
        }
        q12 q12Var = (q12) obj;
        if (q12Var != null) {
            return q12Var.f8697h;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public u20 m1412b() {
        bo0 bo0Var = (bo0) this.f2578k;
        int i = bo0Var.f957b;
        int i2 = bo0Var.f958c;
        return i < i2 ? u20.f11068i : i > i2 ? u20.f11067h : u20.f11069j;
    }

    /* JADX INFO: renamed from: c */
    public void m1413c() {
        if (this.f2576i || ((HashSet) this.f2578k).isEmpty()) {
            return;
        }
        f90 f90Var = (f90) this.f2577j;
        af0 af0Var = (af0) f90Var.f2864c;
        boolean z = false;
        f90Var.f2862a = ((ConnectivityManager) af0Var.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) af0Var.get()).registerDefaultNetworkCallback((dr2) f90Var.f2865d);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.f2576i = z;
    }

    /* JADX INFO: renamed from: d */
    public void m1414d() {
        if (this.f2576i) {
            b03.m338b((b03) this.f2578k, (f13) this.f2577j);
        }
    }

    /* JADX INFO: renamed from: e */
    public long m1415e(k03 k03Var, long j, boolean z, vm2 vm2Var) {
        b03 b03Var = (b03) this.f2578k;
        long jM339c = b03.m339c(b03Var, k03Var, j, z, false, vm2Var, false, null);
        if (!f13.m1492a(jM339c, (f13) this.f2577j)) {
            this.f2576i = false;
        }
        b03Var.m353q(f13.m1494c(jM339c) ? tr0.f10908j : tr0.f10907i);
        return jM339c;
    }

    @Override // p000.bq0
    public Object get() {
        if (this.f2576i) {
            C0676s.m4653l("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        pb3.m3844a("Glide registry");
        this.f2576i = true;
        try {
            return t11.m5093s((ComponentCallbacks2C0099a) this.f2577j, (ArrayList) this.f2578k);
        } finally {
            this.f2576i = false;
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.f2575h) {
            case 3:
                return super.toString() + "{numRequests=" + ((Set) this.f2577j).size() + ", isPaused=" + this.f2576i + "}";
            case 4:
                return "SingleSelectionLayout(isStartHandle=" + this.f2576i + ", crossed=" + m1412b() + ", info=\n\t" + ((bo0) this.f2578k) + ')';
            default:
                return super.toString();
        }
    }

    public er2(gd1 gd1Var, dq1 dq1Var) {
        this.f2575h = 1;
        this.f2577j = gd1Var;
        this.f2578k = dq1Var;
    }

    public er2() {
        this.f2575h = 3;
        this.f2577j = Collections.newSetFromMap(new WeakHashMap());
        this.f2578k = new HashSet();
    }

    public er2(ComponentCallbacks2C0099a componentCallbacks2C0099a, ArrayList arrayList, AbstractC0570p7 abstractC0570p7) {
        this.f2575h = 2;
        this.f2577j = componentCallbacks2C0099a;
        this.f2578k = arrayList;
    }

    public er2(boolean z, tm2 tm2Var, bo0 bo0Var) {
        this.f2575h = 4;
        this.f2576i = z;
        this.f2577j = tm2Var;
        this.f2578k = bo0Var;
    }

    public er2(b03 b03Var) {
        this.f2575h = 5;
        this.f2578k = b03Var;
        this.f2576i = true;
    }
}
