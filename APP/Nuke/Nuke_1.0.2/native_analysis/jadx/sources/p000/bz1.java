package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class bz1 extends AbstractMap implements Map, s41 {

    /* JADX INFO: renamed from: h */
    public zy1 f1082h;

    /* JADX INFO: renamed from: i */
    public i51 f1083i = new i51(6);

    /* JADX INFO: renamed from: j */
    public h43 f1084j;

    /* JADX INFO: renamed from: k */
    public Object f1085k;

    /* JADX INFO: renamed from: l */
    public int f1086l;

    /* JADX INFO: renamed from: m */
    public int f1087m;

    public bz1(zy1 zy1Var) {
        this.f1082h = zy1Var;
        this.f1084j = zy1Var.f14150h;
        this.f1087m = zy1Var.f14151i;
    }

    /* JADX INFO: renamed from: a */
    public zy1 mo609b() {
        h43 h43Var = this.f1084j;
        zy1 zy1Var = this.f1082h;
        if (h43Var != zy1Var.f14150h) {
            this.f1083i = new i51(6);
            zy1Var = new zy1(this.f1084j, this.f1087m);
        }
        this.f1082h = zy1Var;
        return zy1Var;
    }

    /* JADX INFO: renamed from: b */
    public /* bridge */ zy1 mo609b() {
        return mo609b();
    }

    /* JADX INFO: renamed from: c */
    public final void m610c(int i) {
        this.f1087m = i;
        this.f1086l++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f1084j = h43.f3816e;
        m610c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f1084j.m2058d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new dz1(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f1084j.m2061g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new dz1(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f1085k = null;
        this.f1084j = this.f1084j.m2065l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f1085k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zy1 zy1VarMo608a = null;
        zy1 zy1Var = map instanceof zy1 ? (zy1) map : null;
        if (zy1Var == null) {
            bz1 bz1Var = map instanceof bz1 ? (bz1) map : null;
            if (bz1Var != null) {
                zy1VarMo608a = bz1Var.mo609b();
            }
        } else {
            zy1VarMo608a = zy1Var;
        }
        if (zy1VarMo608a == null) {
            super.putAll(map);
            return;
        }
        d70 d70Var = new d70();
        d70Var.f1897a = 0;
        int i = this.f1087m;
        h43 h43Var = this.f1084j;
        h43 h43Var2 = zy1VarMo608a.f14150h;
        h43Var2.getClass();
        this.f1084j = h43Var.m2066m(h43Var2, 0, d70Var, this);
        int i2 = (zy1VarMo608a.f14151i + i) - d70Var.f1897a;
        if (i != i2) {
            m610c(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f1087m;
        h43 h43VarM2068o = this.f1084j.m2068o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (h43VarM2068o == null) {
            h43VarM2068o = h43.f3816e;
        }
        this.f1084j = h43VarM2068o;
        return i != this.f1087m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1087m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new gz1(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f1085k = null;
        h43 h43VarM2067n = this.f1084j.m2067n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (h43VarM2067n == null) {
            h43VarM2067n = h43.f3816e;
        }
        this.f1084j = h43VarM2067n;
        return this.f1085k;
    }
}
