package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4382;
import kotlin.jvm.internal.AbstractC4395;
import p054.InterfaceC6562;
import p054.InterfaceC6564;
import p054.InterfaceC6567;
import p123.C7399;
import p123.C7401;
import p125.InterfaceC7421;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1279 implements Set, InterfaceC6562 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f3740;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1277 f3741;

    public C1279(C1277 c1277, int i) {
        this.f3740 = i;
        this.f3741 = c1277;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final boolean m2257(Collection collection) {
        C7401 c7401;
        int i;
        AbstractC1286 abstractC1286M2280;
        boolean zM2251;
        Set setM8788 = AbstractC4344.m8788(collection);
        C1277 c1277 = this.f3741;
        boolean z = false;
        do {
            synchronized (AbstractC1274.f3706) {
                C1273 c1273 = c1277.f3726;
                c1273.getClass();
                C1273 c12732 = (C1273) AbstractC1280.m2275(c1273);
                c7401 = c12732.f3704;
                i = c12732.f3703;
            }
            c7401.getClass();
            C7399 c7399Mo2187 = c7401.mo2187();
            Iterator it = c1277.f3724.iterator();
            while (((C1258) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C1258) it).next();
                if (!setM8788.contains(entry.getKey())) {
                    c7399Mo2187.remove(entry.getKey());
                    z = true;
                }
            }
            C7401 c7401Mo2173 = c7399Mo2187.mo2173();
            if (AbstractC4395.m8907(c7401Mo2173, c7401)) {
                break;
            }
            C1273 c12733 = c1277.f3726;
            c12733.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2251 = C1277.m2251(c1277, (C1273) AbstractC1280.m2266(c12733, c1277, abstractC1286M2280), i, c7401Mo2173);
            }
            AbstractC1280.m2269(abstractC1286M2280, c1277);
        } while (!zM2251);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3740) {
            case 0:
                AbstractC1274.m2236();
                throw null;
            case 1:
                AbstractC1274.m2236();
                throw null;
            default:
                AbstractC1274.m2236();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f3740) {
            case 0:
                AbstractC1274.m2236();
                throw null;
            case 1:
                AbstractC1274.m2236();
                throw null;
            default:
                AbstractC1274.m2236();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f3741.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f3740;
        C1277 c1277 = this.f3741;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof InterfaceC6567) && !(obj instanceof InterfaceC6564))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC4395.m8907(c1277.get(entry.getKey()), entry.getValue());
            case 1:
                return c1277.containsKey(obj);
            default:
                return c1277.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f3740;
        C1277 c1277 = this.f3741;
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
                        if (!c1277.containsKey(it2.next())) {
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
                        if (!c1277.containsValue(it3.next())) {
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
        return this.f3741.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f3740;
        C1277 c1277 = this.f3741;
        switch (i) {
            case 0:
                return new C1258(c1277, ((InterfaceC7421) c1277.m2252().f3704.entrySet()).iterator(), 0);
            case 1:
                return new C1258(c1277, ((InterfaceC7421) c1277.m2252().f3704.entrySet()).iterator(), 1);
            default:
                return new C1258(c1277, ((InterfaceC7421) c1277.m2252().f3704.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        int i = this.f3740;
        C1277 c1277 = this.f3741;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    if ((!(obj instanceof InterfaceC6567) || (obj instanceof InterfaceC6564)) && c1277.remove(((Map.Entry) obj).getKey()) != null) {
                    }
                }
                break;
            case 1:
                if (c1277.remove(obj) != null) {
                }
                break;
            default:
                Iterator it = c1277.f3724.iterator();
                while (true) {
                    if (((C1258) it).hasNext()) {
                        next = ((C1258) it).next();
                        if (AbstractC4395.m8907(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    c1277.remove(entry.getKey());
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C7401 c7401;
        int i;
        AbstractC1286 abstractC1286M2280;
        boolean zM2251;
        boolean z = false;
        switch (this.f3740) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.f3741.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
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
                        if (this.f3741.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
                break;
            default:
                Set setM8788 = AbstractC4344.m8788(collection);
                C1277 c1277 = this.f3741;
                do {
                    synchronized (AbstractC1274.f3706) {
                        C1273 c1273 = c1277.f3726;
                        c1273.getClass();
                        C1273 c12732 = (C1273) AbstractC1280.m2275(c1273);
                        c7401 = c12732.f3704;
                        i = c12732.f3703;
                    }
                    c7401.getClass();
                    C7399 c7399Mo2187 = c7401.mo2187();
                    Iterator it3 = c1277.f3724.iterator();
                    while (((C1258) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C1258) it3).next();
                        if (setM8788.contains(entry.getValue())) {
                            c7399Mo2187.remove(entry.getKey());
                            z = true;
                        }
                    }
                    C7401 c7401Mo2173 = c7399Mo2187.mo2173();
                    if (!AbstractC4395.m8907(c7401Mo2173, c7401)) {
                        C1273 c12733 = c1277.f3726;
                        c12733.getClass();
                        synchronized (AbstractC1280.f3745) {
                            abstractC1286M2280 = AbstractC1280.m2280();
                            zM2251 = C1277.m2251(c1277, (C1273) AbstractC1280.m2266(c12733, c1277, abstractC1286M2280), i, c7401Mo2173);
                        }
                        AbstractC1280.m2269(abstractC1286M2280, c1277);
                    }
                    return z;
                } while (!zM2251);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C7401 c7401;
        int i;
        AbstractC1286 abstractC1286M2280;
        boolean zM2251;
        C7401 c74012;
        int i2;
        AbstractC1286 abstractC1286M22802;
        boolean zM22512;
        boolean z = false;
        switch (this.f3740) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(collection2, 10));
                if (iM8772 < 16) {
                    iM8772 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
                for (Map.Entry entry : collection2) {
                    Pair pair = new Pair(entry.getKey(), entry.getValue());
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                C1277 c1277 = this.f3741;
                do {
                    synchronized (AbstractC1274.f3706) {
                        C1273 c1273 = c1277.f3726;
                        c1273.getClass();
                        C1273 c12732 = (C1273) AbstractC1280.m2275(c1273);
                        c7401 = c12732.f3704;
                        i = c12732.f3703;
                    }
                    c7401.getClass();
                    C7399 c7399Mo2187 = c7401.mo2187();
                    Iterator it = c1277.f3724.iterator();
                    while (((C1258) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((C1258) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC4395.m8907(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            c7399Mo2187.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    C7401 c7401Mo2173 = c7399Mo2187.mo2173();
                    if (!AbstractC4395.m8907(c7401Mo2173, c7401)) {
                        C1273 c12733 = c1277.f3726;
                        c12733.getClass();
                        synchronized (AbstractC1280.f3745) {
                            abstractC1286M2280 = AbstractC1280.m2280();
                            zM2251 = C1277.m2251(c1277, (C1273) AbstractC1280.m2266(c12733, c1277, abstractC1286M2280), i, c7401Mo2173);
                        }
                        AbstractC1280.m2269(abstractC1286M2280, c1277);
                    }
                    return z;
                } while (!zM2251);
                return z;
            case 1:
                return m2257(collection);
            default:
                Set setM8788 = AbstractC4344.m8788(collection);
                C1277 c12772 = this.f3741;
                do {
                    synchronized (AbstractC1274.f3706) {
                        C1273 c12734 = c12772.f3726;
                        c12734.getClass();
                        C1273 c12735 = (C1273) AbstractC1280.m2275(c12734);
                        c74012 = c12735.f3704;
                        i2 = c12735.f3703;
                    }
                    c74012.getClass();
                    C7399 c7399Mo21872 = c74012.mo2187();
                    Iterator it2 = c12772.f3724.iterator();
                    while (((C1258) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((C1258) it2).next();
                        if (!setM8788.contains(entry3.getValue())) {
                            c7399Mo21872.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    C7401 c7401Mo21732 = c7399Mo21872.mo2173();
                    if (!AbstractC4395.m8907(c7401Mo21732, c74012)) {
                        C1273 c12736 = c12772.f3726;
                        c12736.getClass();
                        synchronized (AbstractC1280.f3745) {
                            abstractC1286M22802 = AbstractC1280.m2280();
                            zM22512 = C1277.m2251(c12772, (C1273) AbstractC1280.m2266(c12736, c12772, abstractC1286M22802), i2, c7401Mo21732);
                        }
                        AbstractC1280.m2269(abstractC1286M22802, c12772);
                    }
                    return z;
                } while (!zM22512);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f3741.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4382.m8875(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4382.m8874(this, objArr);
    }
}
