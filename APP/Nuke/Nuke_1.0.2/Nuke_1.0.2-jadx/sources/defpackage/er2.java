package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Trace;
import android.util.Log;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class er2 implements bq0 {
    public static volatile er2 l;
    public final /* synthetic */ int h;
    public boolean i;
    public Object j;
    public final Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public er2(Context context) {
        this.h = 0;
        this.k = new HashSet();
        this.j = new f90(new af0(new r80(context, 9)), new br2(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean a(long j) {
        Object obj;
        List list = (List) ((dq1) this.k).i;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (up0.s(((q12) obj).a, j)) {
                break;
            }
            i++;
        }
        q12 q12Var = (q12) obj;
        if (q12Var != null) {
            return q12Var.h;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u20 b() {
        bo0 bo0Var = (bo0) this.k;
        int i = bo0Var.b;
        int i2 = bo0Var.c;
        return i < i2 ? u20.i : i > i2 ? u20.h : u20.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() {
        if (this.i || ((HashSet) this.k).isEmpty()) {
            return;
        }
        f90 f90Var = (f90) this.j;
        af0 af0Var = (af0) f90Var.c;
        boolean z = false;
        f90Var.a = ((ConnectivityManager) af0Var.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) af0Var.get()).registerDefaultNetworkCallback((dr2) f90Var.d);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.i = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d() {
        if (this.i) {
            b03.b((b03) this.k, (f13) this.j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long e(k03 k03Var, long j, boolean z, vm2 vm2Var) {
        b03 b03Var = (b03) this.k;
        long jC = b03.c(b03Var, k03Var, j, z, false, vm2Var, false, null);
        if (!f13.a(jC, (f13) this.j)) {
            this.i = false;
        }
        b03Var.q(f13.c(jC) ? tr0.j : tr0.i);
        return jC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bq0
    public Object get() {
        if (this.i) {
            s.l("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        pb3.a("Glide registry");
        this.i = true;
        try {
            return t11.s((a) this.j, (ArrayList) this.k);
        } finally {
            this.i = false;
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case 3:
                return super.toString() + "{numRequests=" + ((Set) this.j).size() + ", isPaused=" + this.i + "}";
            case 4:
                return "SingleSelectionLayout(isStartHandle=" + this.i + ", crossed=" + b() + ", info=\n\t" + ((bo0) this.k) + ')';
            default:
                return super.toString();
        }
    }

    public er2(gd1 gd1Var, dq1 dq1Var) {
        this.h = 1;
        this.j = gd1Var;
        this.k = dq1Var;
    }

    public er2() {
        this.h = 3;
        this.j = Collections.newSetFromMap(new WeakHashMap());
        this.k = new HashSet();
    }

    public er2(a aVar, ArrayList arrayList, p7 p7Var) {
        this.h = 2;
        this.j = aVar;
        this.k = arrayList;
    }

    public er2(boolean z, tm2 tm2Var, bo0 bo0Var) {
        this.h = 4;
        this.i = z;
        this.j = tm2Var;
        this.k = bo0Var;
    }

    public er2(b03 b03Var) {
        this.h = 5;
        this.k = b03Var;
        this.i = true;
    }
}
