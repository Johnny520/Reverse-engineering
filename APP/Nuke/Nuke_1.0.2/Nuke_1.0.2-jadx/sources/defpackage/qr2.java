package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qr2 implements ay, Iterable, q41 {
    public int i;
    public int k;
    public int l;
    public boolean n;
    public int o;
    public HashMap q;
    public zj1 r;
    public int[] h = new int[0];
    public Object[] j = new Object[0];
    public final Object m = new Object();
    public ArrayList p = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(ao0 ao0Var) {
        if (this.n) {
            tx.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!ao0Var.a()) {
            j22.a("Anchor refers to a group that was removed");
        }
        return ao0Var.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        this.q = new HashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final pr2 c() {
        if (this.n) {
            s.l("Cannot read while a writer is pending");
            return null;
        }
        this.l++;
        return new pr2(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final tr2 d() {
        if (this.n) {
            tx.a("Cannot start a writer when another writer is pending");
        }
        if (this.l > 0) {
            tx.a("Cannot start a writer when a reader is pending");
        }
        this.n = true;
        this.o++;
        return new tr2(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e(ao0 ao0Var) {
        int iE;
        return ao0Var.a() && (iE = sr2.e(this.p, ao0Var.a, this.i)) >= 0 && t11.l(this.p.get(iE), ao0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final io0 f(int i) {
        int i2;
        ArrayList arrayList;
        int iE;
        HashMap map = this.q;
        if (map != null) {
            if (this.n) {
                tx.a("use active SlotWriter to crate an anchor for location instead");
            }
            ao0 ao0Var = (i < 0 || i >= (i2 = this.i) || (iE = sr2.e((arrayList = this.p), i, i2)) < 0) ? null : (ao0) arrayList.get(iE);
            if (ao0Var != null) {
                return (io0) map.get(ao0Var);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dr0(this, 0, this.i);
    }
}
