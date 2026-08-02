package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class bz1 extends AbstractMap implements Map, s41 {
    public zy1 h;
    public i51 i = new i51(6);
    public h43 j;
    public Object k;
    public int l;
    public int m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bz1(zy1 zy1Var) {
        this.h = zy1Var;
        this.j = zy1Var.h;
        this.m = zy1Var.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public zy1 b() {
        h43 h43Var = this.j;
        zy1 zy1Var = this.h;
        if (h43Var != zy1Var.h) {
            this.i = new i51(6);
            zy1Var = new zy1(this.j, this.m);
        }
        this.h = zy1Var;
        return zy1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ zy1 b() {
        return b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i) {
        this.m = i;
        this.l++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.j = h43.e;
        c(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.j.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new dz1(0, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.j.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new dz1(1, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.k = null;
        this.j = this.j.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zy1 zy1VarA = null;
        zy1 zy1Var = map instanceof zy1 ? (zy1) map : null;
        if (zy1Var == null) {
            bz1 bz1Var = map instanceof bz1 ? (bz1) map : null;
            if (bz1Var != null) {
                zy1VarA = bz1Var.b();
            }
        } else {
            zy1VarA = zy1Var;
        }
        if (zy1VarA == null) {
            super.putAll(map);
            return;
        }
        d70 d70Var = new d70();
        d70Var.a = 0;
        int i = this.m;
        h43 h43Var = this.j;
        h43 h43Var2 = zy1VarA.h;
        h43Var2.getClass();
        this.j = h43Var.m(h43Var2, 0, d70Var, this);
        int i2 = (zy1VarA.i + i) - d70Var.a;
        if (i != i2) {
            c(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.m;
        h43 h43VarO = this.j.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (h43VarO == null) {
            h43VarO = h43.e;
        }
        this.j = h43VarO;
        return i != this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new gz1(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.k = null;
        h43 h43VarN = this.j.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (h43VarN == null) {
            h43VarN = h43.e;
        }
        this.j = h43VarN;
        return this.k;
    }
}
