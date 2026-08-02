package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class es2 implements Set, t41 {
    public final rs2 h;
    public final /* synthetic */ int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public es2(rs2 rs2Var, int i) {
        this.i = i;
        this.h = rs2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean a(Collection collection) {
        zy1 zy1Var;
        int i;
        vr2 vr2VarJ;
        boolean zD;
        Set setK0 = du.K0(collection);
        rs2 rs2Var = this.h;
        boolean z = false;
        do {
            synchronized (p40.m) {
                qs2 qs2Var = rs2Var.h;
                qs2Var.getClass();
                qs2 qs2Var2 = (qs2) ds2.h(qs2Var);
                zy1Var = qs2Var2.c;
                i = qs2Var2.d;
            }
            zy1Var.getClass();
            bz1 bz1VarB = zy1Var.b();
            Iterator it = rs2Var.i.iterator();
            while (((ou2) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((ou2) it).next();
                if (!setK0.contains(entry.getKey())) {
                    bz1VarB.remove(entry.getKey());
                    z = true;
                }
            }
            zy1 zy1VarB = bz1VarB.b();
            if (t11.l(zy1VarB, zy1Var)) {
                break;
            }
            qs2 qs2Var3 = rs2Var.h;
            qs2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zD = rs2.d(rs2Var, (qs2) ds2.w(qs2Var3, rs2Var, vr2VarJ), i, zy1VarB);
            }
            ds2.n(vr2VarJ, rs2Var);
        } while (!zD);
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.i) {
            case 0:
                p40.b0();
                throw null;
            case 1:
                p40.b0();
                throw null;
            default:
                p40.b0();
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.i) {
            case 0:
                p40.b0();
                throw null;
            case 1:
                p40.b0();
                throw null;
            default:
                p40.b0();
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.h.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.i;
        rs2 rs2Var = this.h;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof q41) && !(obj instanceof r41))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return t11.l(rs2Var.get(entry.getKey()), entry.getValue());
            case 1:
                return rs2Var.containsKey(obj);
            default:
                return rs2Var.containsValue(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.i;
        rs2 rs2Var = this.h;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.h.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.i;
        rs2 rs2Var = this.h;
        switch (i) {
            case 0:
                return new ou2(rs2Var, ((zx0) rs2Var.e().c.entrySet()).iterator(), 0);
            case 1:
                return new ou2(rs2Var, ((zx0) rs2Var.e().c.entrySet()).iterator(), 1);
            default:
                return new ou2(rs2Var, ((zx0) rs2Var.e().c.entrySet()).iterator(), 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        int i = this.i;
        rs2 rs2Var = this.h;
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
                Iterator it = rs2Var.i.iterator();
                while (true) {
                    if (((ou2) it).hasNext()) {
                        next = ((ou2) it).next();
                        if (t11.l(((Map.Entry) next).getValue(), obj)) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        zy1 zy1Var;
        int i;
        vr2 vr2VarJ;
        boolean zD;
        boolean z = false;
        switch (this.i) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.h.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
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
                        if (this.h.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
                break;
            default:
                Set setK0 = du.K0(collection);
                rs2 rs2Var = this.h;
                do {
                    synchronized (p40.m) {
                        qs2 qs2Var = rs2Var.h;
                        qs2Var.getClass();
                        qs2 qs2Var2 = (qs2) ds2.h(qs2Var);
                        zy1Var = qs2Var2.c;
                        i = qs2Var2.d;
                    }
                    zy1Var.getClass();
                    bz1 bz1VarB = zy1Var.b();
                    Iterator it3 = rs2Var.i.iterator();
                    while (((ou2) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((ou2) it3).next();
                        if (setK0.contains(entry.getValue())) {
                            bz1VarB.remove(entry.getKey());
                            z = true;
                        }
                    }
                    zy1 zy1VarB = bz1VarB.b();
                    if (!t11.l(zy1VarB, zy1Var)) {
                        qs2 qs2Var3 = rs2Var.h;
                        qs2Var3.getClass();
                        synchronized (ds2.c) {
                            vr2VarJ = ds2.j();
                            zD = rs2.d(rs2Var, (qs2) ds2.w(qs2Var3, rs2Var, vr2VarJ), i, zy1VarB);
                        }
                        ds2.n(vr2VarJ, rs2Var);
                    }
                    return z;
                } while (!zD);
                return z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        zy1 zy1Var;
        int i;
        vr2 vr2VarJ;
        boolean zD;
        zy1 zy1Var2;
        int i2;
        vr2 vr2VarJ2;
        boolean zD2;
        boolean z = false;
        switch (this.i) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iU = xe1.U(eu.B(collection2, 10));
                if (iU < 16) {
                    iU = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                rs2 rs2Var = this.h;
                do {
                    synchronized (p40.m) {
                        qs2 qs2Var = rs2Var.h;
                        qs2Var.getClass();
                        qs2 qs2Var2 = (qs2) ds2.h(qs2Var);
                        zy1Var = qs2Var2.c;
                        i = qs2Var2.d;
                    }
                    zy1Var.getClass();
                    bz1 bz1VarB = zy1Var.b();
                    Iterator it = rs2Var.i.iterator();
                    while (((ou2) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((ou2) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !t11.l(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            bz1VarB.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    zy1 zy1VarB = bz1VarB.b();
                    if (!t11.l(zy1VarB, zy1Var)) {
                        qs2 qs2Var3 = rs2Var.h;
                        qs2Var3.getClass();
                        synchronized (ds2.c) {
                            vr2VarJ = ds2.j();
                            zD = rs2.d(rs2Var, (qs2) ds2.w(qs2Var3, rs2Var, vr2VarJ), i, zy1VarB);
                        }
                        ds2.n(vr2VarJ, rs2Var);
                    }
                    return z;
                } while (!zD);
                return z;
            case 1:
                return a(collection);
            default:
                Set setK0 = du.K0(collection);
                rs2 rs2Var2 = this.h;
                do {
                    synchronized (p40.m) {
                        qs2 qs2Var4 = rs2Var2.h;
                        qs2Var4.getClass();
                        qs2 qs2Var5 = (qs2) ds2.h(qs2Var4);
                        zy1Var2 = qs2Var5.c;
                        i2 = qs2Var5.d;
                    }
                    zy1Var2.getClass();
                    bz1 bz1VarB2 = zy1Var2.b();
                    Iterator it2 = rs2Var2.i.iterator();
                    while (((ou2) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((ou2) it2).next();
                        if (!setK0.contains(entry3.getValue())) {
                            bz1VarB2.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    zy1 zy1VarB2 = bz1VarB2.b();
                    if (!t11.l(zy1VarB2, zy1Var2)) {
                        qs2 qs2Var6 = rs2Var2.h;
                        qs2Var6.getClass();
                        synchronized (ds2.c) {
                            vr2VarJ2 = ds2.j();
                            zD2 = rs2.d(rs2Var2, (qs2) ds2.w(qs2Var6, rs2Var2, vr2VarJ2), i2, zy1VarB2);
                        }
                        ds2.n(vr2VarJ2, rs2Var2);
                    }
                    return z;
                } while (!zD2);
                return z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.h.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return tl.a0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return tl.b0(this, objArr);
    }
}
