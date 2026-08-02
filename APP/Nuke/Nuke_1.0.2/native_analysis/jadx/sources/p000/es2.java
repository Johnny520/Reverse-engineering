package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class es2 implements Set, t41 {

    /* JADX INFO: renamed from: h */
    public final rs2 f2584h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f2585i;

    public es2(rs2 rs2Var, int i) {
        this.f2585i = i;
        this.f2584h = rs2Var;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m1416a(Collection collection) {
        zy1 zy1Var;
        int i;
        vr2 vr2VarM1126j;
        boolean zM4615d;
        Set setM1153K0 = AbstractC0142du.m1153K0(collection);
        rs2 rs2Var = this.f2584h;
        boolean z = false;
        do {
            synchronized (p40.f7977m) {
                qs2 qs2Var = rs2Var.f9745h;
                qs2Var.getClass();
                qs2 qs2Var2 = (qs2) ds2.m1124h(qs2Var);
                zy1Var = qs2Var2.f9156c;
                i = qs2Var2.f9157d;
            }
            zy1Var.getClass();
            bz1 bz1VarMo6369b = zy1Var.mo6369b();
            Iterator it = rs2Var.f9746i.iterator();
            while (((ou2) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((ou2) it).next();
                if (!setM1153K0.contains(entry.getKey())) {
                    bz1VarMo6369b.remove(entry.getKey());
                    z = true;
                }
            }
            zy1 zy1VarMo609b = bz1VarMo6369b.mo609b();
            if (t11.m5086l(zy1VarMo609b, zy1Var)) {
                break;
            }
            qs2 qs2Var3 = rs2Var.f9745h;
            qs2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM4615d = rs2.m4615d(rs2Var, (qs2) ds2.m1139w(qs2Var3, rs2Var, vr2VarM1126j), i, zy1VarMo609b);
            }
            ds2.m1130n(vr2VarM1126j, rs2Var);
        } while (!zM4615d);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f2585i) {
            case 0:
                p40.m3719b0();
                throw null;
            case 1:
                p40.m3719b0();
                throw null;
            default:
                p40.m3719b0();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f2585i) {
            case 0:
                p40.m3719b0();
                throw null;
            case 1:
                p40.m3719b0();
                throw null;
            default:
                p40.m3719b0();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f2584h.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f2585i;
        rs2 rs2Var = this.f2584h;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof q41) && !(obj instanceof r41))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return t11.m5086l(rs2Var.get(entry.getKey()), entry.getValue());
            case 1:
                return rs2Var.containsKey(obj);
            default:
                return rs2Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f2585i;
        rs2 rs2Var = this.f2584h;
        switch (i) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!rs2Var.containsKey(it2.next())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!rs2Var.containsValue(it3.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f2584h.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f2585i;
        rs2 rs2Var = this.f2584h;
        switch (i) {
            case 0:
                return new ou2(rs2Var, ((zx0) rs2Var.m4616e().f9156c.entrySet()).iterator(), 0);
            case 1:
                return new ou2(rs2Var, ((zx0) rs2Var.m4616e().f9156c.entrySet()).iterator(), 1);
            default:
                return new ou2(rs2Var, ((zx0) rs2Var.m4616e().f9156c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        int i = this.f2585i;
        rs2 rs2Var = this.f2584h;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    if ((!(obj instanceof q41) || (obj instanceof r41)) && rs2Var.remove(((Map.Entry) obj).getKey()) != null) {
                    }
                }
                break;
            case 1:
                if (rs2Var.remove(obj) != null) {
                }
                break;
            default:
                Iterator it = rs2Var.f9746i.iterator();
                while (true) {
                    if (((ou2) it).hasNext()) {
                        next = ((ou2) it).next();
                        if (t11.m5086l(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    rs2Var.remove(entry.getKey());
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        zy1 zy1Var;
        int i;
        vr2 vr2VarM1126j;
        boolean zM4615d;
        boolean z = false;
        switch (this.f2585i) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.f2584h.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.f2584h.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
                break;
            default:
                Set setM1153K0 = AbstractC0142du.m1153K0(collection);
                rs2 rs2Var = this.f2584h;
                do {
                    synchronized (p40.f7977m) {
                        qs2 qs2Var = rs2Var.f9745h;
                        qs2Var.getClass();
                        qs2 qs2Var2 = (qs2) ds2.m1124h(qs2Var);
                        zy1Var = qs2Var2.f9156c;
                        i = qs2Var2.f9157d;
                    }
                    zy1Var.getClass();
                    bz1 bz1VarMo6369b = zy1Var.mo6369b();
                    Iterator it3 = rs2Var.f9746i.iterator();
                    while (((ou2) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((ou2) it3).next();
                        if (setM1153K0.contains(entry.getValue())) {
                            bz1VarMo6369b.remove(entry.getKey());
                            z = true;
                        }
                    }
                    zy1 zy1VarMo609b = bz1VarMo6369b.mo609b();
                    if (!t11.m5086l(zy1VarMo609b, zy1Var)) {
                        qs2 qs2Var3 = rs2Var.f9745h;
                        qs2Var3.getClass();
                        synchronized (ds2.f2181c) {
                            vr2VarM1126j = ds2.m1126j();
                            zM4615d = rs2.m4615d(rs2Var, (qs2) ds2.m1139w(qs2Var3, rs2Var, vr2VarM1126j), i, zy1VarMo609b);
                        }
                        ds2.m1130n(vr2VarM1126j, rs2Var);
                    }
                    return z;
                } while (!zM4615d);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        zy1 zy1Var;
        int i;
        vr2 vr2VarM1126j;
        boolean zM4615d;
        zy1 zy1Var2;
        int i2;
        vr2 vr2VarM1126j2;
        boolean zM4615d2;
        boolean z = false;
        switch (this.f2585i) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iM6103U = xe1.m6103U(AbstractC0179eu.m1421B(collection2, 10));
                if (iM6103U < 16) {
                    iM6103U = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM6103U);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                rs2 rs2Var = this.f2584h;
                do {
                    synchronized (p40.f7977m) {
                        qs2 qs2Var = rs2Var.f9745h;
                        qs2Var.getClass();
                        qs2 qs2Var2 = (qs2) ds2.m1124h(qs2Var);
                        zy1Var = qs2Var2.f9156c;
                        i = qs2Var2.f9157d;
                    }
                    zy1Var.getClass();
                    bz1 bz1VarMo6369b = zy1Var.mo6369b();
                    Iterator it = rs2Var.f9746i.iterator();
                    while (((ou2) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((ou2) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !t11.m5086l(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            bz1VarMo6369b.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    zy1 zy1VarMo609b = bz1VarMo6369b.mo609b();
                    if (!t11.m5086l(zy1VarMo609b, zy1Var)) {
                        qs2 qs2Var3 = rs2Var.f9745h;
                        qs2Var3.getClass();
                        synchronized (ds2.f2181c) {
                            vr2VarM1126j = ds2.m1126j();
                            zM4615d = rs2.m4615d(rs2Var, (qs2) ds2.m1139w(qs2Var3, rs2Var, vr2VarM1126j), i, zy1VarMo609b);
                        }
                        ds2.m1130n(vr2VarM1126j, rs2Var);
                    }
                    return z;
                } while (!zM4615d);
                return z;
            case 1:
                return m1416a(collection);
            default:
                Set setM1153K0 = AbstractC0142du.m1153K0(collection);
                rs2 rs2Var2 = this.f2584h;
                do {
                    synchronized (p40.f7977m) {
                        qs2 qs2Var4 = rs2Var2.f9745h;
                        qs2Var4.getClass();
                        qs2 qs2Var5 = (qs2) ds2.m1124h(qs2Var4);
                        zy1Var2 = qs2Var5.f9156c;
                        i2 = qs2Var5.f9157d;
                    }
                    zy1Var2.getClass();
                    bz1 bz1VarMo6369b2 = zy1Var2.mo6369b();
                    Iterator it2 = rs2Var2.f9746i.iterator();
                    while (((ou2) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((ou2) it2).next();
                        if (!setM1153K0.contains(entry3.getValue())) {
                            bz1VarMo6369b2.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    zy1 zy1VarMo609b2 = bz1VarMo6369b2.mo609b();
                    if (!t11.m5086l(zy1VarMo609b2, zy1Var2)) {
                        qs2 qs2Var6 = rs2Var2.f9745h;
                        qs2Var6.getClass();
                        synchronized (ds2.f2181c) {
                            vr2VarM1126j2 = ds2.m1126j();
                            zM4615d2 = rs2.m4615d(rs2Var2, (qs2) ds2.m1139w(qs2Var6, rs2Var2, vr2VarM1126j2), i2, zy1VarMo609b2);
                        }
                        ds2.m1130n(vr2VarM1126j2, rs2Var2);
                    }
                    return z;
                } while (!zM4615d2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f2584h.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0738tl.m5299a0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0738tl.m5301b0(this, objArr);
    }
}
