package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rs2 implements pu2, Map, s41 {
    public qs2 h;
    public final es2 i;
    public final es2 j;
    public final es2 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rs2() {
        zy1 zy1Var = zy1.j;
        vr2 vr2VarJ = ds2.j();
        qs2 qs2Var = new qs2(vr2VarJ.g(), zy1Var);
        if (!(vr2VarJ instanceof hq0)) {
            qs2Var.b = new qs2(1L, zy1Var);
        }
        this.h = qs2Var;
        this.i = new es2(this, 0);
        this.j = new es2(this, 1);
        this.k = new es2(this, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean d(rs2 rs2Var, qs2 qs2Var, int i, zy1 zy1Var) {
        boolean z;
        synchronized (p40.m) {
            int i2 = qs2Var.d;
            if (i2 == i) {
                qs2Var.c = zy1Var;
                z = true;
                qs2Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final ru2 a() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final void c(ru2 ru2Var) {
        ru2Var.getClass();
        this.h = (qs2) ru2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void clear() {
        vr2 vr2VarJ;
        qs2 qs2Var = this.h;
        qs2Var.getClass();
        qs2 qs2Var2 = (qs2) ds2.h(qs2Var);
        zy1 zy1Var = zy1.j;
        if (zy1Var != qs2Var2.c) {
            qs2 qs2Var3 = this.h;
            qs2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                qs2 qs2Var4 = (qs2) ds2.w(qs2Var3, this, vr2VarJ);
                synchronized (p40.m) {
                    qs2Var4.c = zy1Var;
                    qs2Var4.d++;
                }
            }
            ds2.n(vr2VarJ, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e().c.containsKey(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e().c.containsValue(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final qs2 e() {
        qs2 qs2Var = this.h;
        qs2Var.getClass();
        return (qs2) ds2.t(qs2Var, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set entrySet() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object get(Object obj) {
        return e().c.get(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean isEmpty() {
        return e().c.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set keySet() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        zy1 zy1Var;
        int i;
        Object objPut;
        vr2 vr2VarJ;
        boolean zD;
        do {
            synchronized (p40.m) {
                qs2 qs2Var = this.h;
                qs2Var.getClass();
                qs2 qs2Var2 = (qs2) ds2.h(qs2Var);
                zy1Var = qs2Var2.c;
                i = qs2Var2.d;
            }
            zy1Var.getClass();
            bz1 bz1VarB = zy1Var.b();
            objPut = bz1VarB.put(obj, obj2);
            zy1 zy1VarB = bz1VarB.b();
            if (t11.l(zy1VarB, zy1Var)) {
                break;
            }
            qs2 qs2Var3 = this.h;
            qs2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zD = d(this, (qs2) ds2.w(qs2Var3, this, vr2VarJ), i, zy1VarB);
            }
            ds2.n(vr2VarJ, this);
        } while (!zD);
        return objPut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void putAll(Map map) {
        zy1 zy1Var;
        int i;
        vr2 vr2VarJ;
        boolean zD;
        do {
            synchronized (p40.m) {
                qs2 qs2Var = this.h;
                qs2Var.getClass();
                qs2 qs2Var2 = (qs2) ds2.h(qs2Var);
                zy1Var = qs2Var2.c;
                i = qs2Var2.d;
            }
            zy1Var.getClass();
            bz1 bz1VarB = zy1Var.b();
            bz1VarB.putAll(map);
            zy1 zy1VarB = bz1VarB.b();
            if (t11.l(zy1VarB, zy1Var)) {
                return;
            }
            qs2 qs2Var3 = this.h;
            qs2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zD = d(this, (qs2) ds2.w(qs2Var3, this, vr2VarJ), i, zy1VarB);
            }
            ds2.n(vr2VarJ, this);
        } while (!zD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object remove(Object obj) {
        zy1 zy1Var;
        int i;
        V vRemove;
        vr2 vr2VarJ;
        boolean zD;
        do {
            synchronized (p40.m) {
                qs2 qs2Var = this.h;
                qs2Var.getClass();
                qs2 qs2Var2 = (qs2) ds2.h(qs2Var);
                zy1Var = qs2Var2.c;
                i = qs2Var2.d;
            }
            zy1Var.getClass();
            bz1 bz1VarB = zy1Var.b();
            vRemove = bz1VarB.remove(obj);
            zy1 zy1VarB = bz1VarB.b();
            if (t11.l(zy1VarB, zy1Var)) {
                break;
            }
            qs2 qs2Var3 = this.h;
            qs2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zD = d(this, (qs2) ds2.w(qs2Var3, this, vr2VarJ), i, zy1VarB);
            }
            ds2.n(vr2VarJ, this);
        } while (!zD);
        return vRemove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final int size() {
        zy1 zy1Var = e().c;
        zy1Var.getClass();
        return zy1Var.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        qs2 qs2Var = this.h;
        qs2Var.getClass();
        return "SnapshotStateMap(value=" + ((qs2) ds2.h(qs2Var)).c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Collection values() {
        return this.k;
    }
}
