package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rs2 implements pu2, Map, s41 {

    /* JADX INFO: renamed from: h */
    public qs2 f9745h;

    /* JADX INFO: renamed from: i */
    public final es2 f9746i;

    /* JADX INFO: renamed from: j */
    public final es2 f9747j;

    /* JADX INFO: renamed from: k */
    public final es2 f9748k;

    public rs2() {
        zy1 zy1Var = zy1.f14149j;
        vr2 vr2VarM1126j = ds2.m1126j();
        qs2 qs2Var = new qs2(vr2VarM1126j.mo79g(), zy1Var);
        if (!(vr2VarM1126j instanceof hq0)) {
            qs2Var.f9761b = new qs2(1L, zy1Var);
        }
        this.f9745h = qs2Var;
        this.f9746i = new es2(this, 0);
        this.f9747j = new es2(this, 1);
        this.f9748k = new es2(this, 2);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m4615d(rs2 rs2Var, qs2 qs2Var, int i, zy1 zy1Var) {
        boolean z;
        synchronized (p40.f7977m) {
            int i2 = qs2Var.f9157d;
            if (i2 == i) {
                qs2Var.f9156c = zy1Var;
                z = true;
                qs2Var.f9157d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: a */
    public final ru2 mo2588a() {
        return this.f9745h;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: c */
    public final void mo2590c(ru2 ru2Var) {
        ru2Var.getClass();
        this.f9745h = (qs2) ru2Var;
    }

    @Override // java.util.Map
    public final void clear() {
        vr2 vr2VarM1126j;
        qs2 qs2Var = this.f9745h;
        qs2Var.getClass();
        qs2 qs2Var2 = (qs2) ds2.m1124h(qs2Var);
        zy1 zy1Var = zy1.f14149j;
        if (zy1Var != qs2Var2.f9156c) {
            qs2 qs2Var3 = this.f9745h;
            qs2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                qs2 qs2Var4 = (qs2) ds2.m1139w(qs2Var3, this, vr2VarM1126j);
                synchronized (p40.f7977m) {
                    qs2Var4.f9156c = zy1Var;
                    qs2Var4.f9157d++;
                }
            }
            ds2.m1130n(vr2VarM1126j, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m4616e().f9156c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m4616e().f9156c.containsValue(obj);
    }

    /* JADX INFO: renamed from: e */
    public final qs2 m4616e() {
        qs2 qs2Var = this.f9745h;
        qs2Var.getClass();
        return (qs2) ds2.m1136t(qs2Var, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f9746i;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return m4616e().f9156c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return m4616e().f9156c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f9747j;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        zy1 zy1Var;
        int i;
        Object objPut;
        vr2 vr2VarM1126j;
        boolean zM4615d;
        do {
            synchronized (p40.f7977m) {
                qs2 qs2Var = this.f9745h;
                qs2Var.getClass();
                qs2 qs2Var2 = (qs2) ds2.m1124h(qs2Var);
                zy1Var = qs2Var2.f9156c;
                i = qs2Var2.f9157d;
            }
            zy1Var.getClass();
            bz1 bz1VarMo6369b = zy1Var.mo6369b();
            objPut = bz1VarMo6369b.put(obj, obj2);
            zy1 zy1VarMo609b = bz1VarMo6369b.mo609b();
            if (t11.m5086l(zy1VarMo609b, zy1Var)) {
                break;
            }
            qs2 qs2Var3 = this.f9745h;
            qs2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM4615d = m4615d(this, (qs2) ds2.m1139w(qs2Var3, this, vr2VarM1126j), i, zy1VarMo609b);
            }
            ds2.m1130n(vr2VarM1126j, this);
        } while (!zM4615d);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        zy1 zy1Var;
        int i;
        vr2 vr2VarM1126j;
        boolean zM4615d;
        do {
            synchronized (p40.f7977m) {
                qs2 qs2Var = this.f9745h;
                qs2Var.getClass();
                qs2 qs2Var2 = (qs2) ds2.m1124h(qs2Var);
                zy1Var = qs2Var2.f9156c;
                i = qs2Var2.f9157d;
            }
            zy1Var.getClass();
            bz1 bz1VarMo6369b = zy1Var.mo6369b();
            bz1VarMo6369b.putAll(map);
            zy1 zy1VarMo609b = bz1VarMo6369b.mo609b();
            if (t11.m5086l(zy1VarMo609b, zy1Var)) {
                return;
            }
            qs2 qs2Var3 = this.f9745h;
            qs2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM4615d = m4615d(this, (qs2) ds2.m1139w(qs2Var3, this, vr2VarM1126j), i, zy1VarMo609b);
            }
            ds2.m1130n(vr2VarM1126j, this);
        } while (!zM4615d);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        zy1 zy1Var;
        int i;
        V vRemove;
        vr2 vr2VarM1126j;
        boolean zM4615d;
        do {
            synchronized (p40.f7977m) {
                qs2 qs2Var = this.f9745h;
                qs2Var.getClass();
                qs2 qs2Var2 = (qs2) ds2.m1124h(qs2Var);
                zy1Var = qs2Var2.f9156c;
                i = qs2Var2.f9157d;
            }
            zy1Var.getClass();
            bz1 bz1VarMo6369b = zy1Var.mo6369b();
            vRemove = bz1VarMo6369b.remove(obj);
            zy1 zy1VarMo609b = bz1VarMo6369b.mo609b();
            if (t11.m5086l(zy1VarMo609b, zy1Var)) {
                break;
            }
            qs2 qs2Var3 = this.f9745h;
            qs2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM4615d = m4615d(this, (qs2) ds2.m1139w(qs2Var3, this, vr2VarM1126j), i, zy1VarMo609b);
            }
            ds2.m1130n(vr2VarM1126j, this);
        } while (!zM4615d);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        zy1 zy1Var = m4616e().f9156c;
        zy1Var.getClass();
        return zy1Var.f14151i;
    }

    public final String toString() {
        qs2 qs2Var = this.f9745h;
        qs2Var.getClass();
        return "SnapshotStateMap(value=" + ((qs2) ds2.m1124h(qs2Var)).f9156c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f9748k;
    }
}
