package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4381;
import kotlin.jvm.internal.AbstractC4394;
import p054.InterfaceC6561;
import p054.InterfaceC6563;
import p054.InterfaceC6566;
import p123.C7398;
import p123.C7400;
import p125.InterfaceC7420;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1279 implements Set, InterfaceC6561 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f3739;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1277 f3740;

    public C1279(C1277 c1277, int i) {
        this.f3739 = i;
        this.f3740 = c1277;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final boolean m2247(Collection collection) {
        C7400 c7400;
        int i;
        AbstractC1286 abstractC1286M2270;
        boolean zM2241;
        Set setM8800 = AbstractC4343.m8800(collection);
        C1277 c1277 = this.f3740;
        boolean z = false;
        do {
            synchronized (AbstractC1274.f3705) {
                C1273 c1273 = c1277.f3725;
                c1273.getClass();
                C1273 c12732 = (C1273) AbstractC1280.m2265(c1273);
                c7400 = c12732.f3703;
                i = c12732.f3702;
            }
            c7400.getClass();
            C7398 c7398Mo2177 = c7400.mo2177();
            Iterator it = c1277.f3723.iterator();
            while (((C1258) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C1258) it).next();
                if (!setM8800.contains(entry.getKey())) {
                    c7398Mo2177.remove(entry.getKey());
                    z = true;
                }
            }
            C7400 c7400Mo2163 = c7398Mo2177.mo2163();
            if (AbstractC4394.m8917(c7400Mo2163, c7400)) {
                break;
            }
            C1273 c12733 = c1277.f3725;
            c12733.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2241 = C1277.m2241(c1277, (C1273) AbstractC1280.m2256(c12733, c1277, abstractC1286M2270), i, c7400Mo2163);
            }
            AbstractC1280.m2259(abstractC1286M2270, c1277);
        } while (!zM2241);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3739) {
            case 0:
                AbstractC1274.m2226();
                throw null;
            case 1:
                AbstractC1274.m2226();
                throw null;
            default:
                AbstractC1274.m2226();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f3739) {
            case 0:
                AbstractC1274.m2226();
                throw null;
            case 1:
                AbstractC1274.m2226();
                throw null;
            default:
                AbstractC1274.m2226();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f3740.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f3739;
        C1277 c1277 = this.f3740;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof InterfaceC6566) && !(obj instanceof InterfaceC6563))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC4394.m8917(c1277.get(entry.getKey()), entry.getValue());
            case 1:
                return c1277.containsKey(obj);
            default:
                return c1277.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f3739;
        C1277 c1277 = this.f3740;
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
        return this.f3740.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f3739;
        C1277 c1277 = this.f3740;
        switch (i) {
            case 0:
                return new C1258(c1277, ((InterfaceC7420) c1277.m2242().f3703.entrySet()).iterator(), 0);
            case 1:
                return new C1258(c1277, ((InterfaceC7420) c1277.m2242().f3703.entrySet()).iterator(), 1);
            default:
                return new C1258(c1277, ((InterfaceC7420) c1277.m2242().f3703.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        int i = this.f3739;
        C1277 c1277 = this.f3740;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    if ((!(obj instanceof InterfaceC6566) || (obj instanceof InterfaceC6563)) && c1277.remove(((Map.Entry) obj).getKey()) != null) {
                    }
                }
                break;
            case 1:
                if (c1277.remove(obj) != null) {
                }
                break;
            default:
                Iterator it = c1277.f3723.iterator();
                while (true) {
                    if (((C1258) it).hasNext()) {
                        next = ((C1258) it).next();
                        if (AbstractC4394.m8917(((Map.Entry) next).getValue(), obj)) {
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
        C7400 c7400;
        int i;
        AbstractC1286 abstractC1286M2270;
        boolean zM2241;
        boolean z = false;
        switch (this.f3739) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.f3740.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
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
                        if (this.f3740.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
                break;
            default:
                Set setM8800 = AbstractC4343.m8800(collection);
                C1277 c1277 = this.f3740;
                do {
                    synchronized (AbstractC1274.f3705) {
                        C1273 c1273 = c1277.f3725;
                        c1273.getClass();
                        C1273 c12732 = (C1273) AbstractC1280.m2265(c1273);
                        c7400 = c12732.f3703;
                        i = c12732.f3702;
                    }
                    c7400.getClass();
                    C7398 c7398Mo2177 = c7400.mo2177();
                    Iterator it3 = c1277.f3723.iterator();
                    while (((C1258) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C1258) it3).next();
                        if (setM8800.contains(entry.getValue())) {
                            c7398Mo2177.remove(entry.getKey());
                            z = true;
                        }
                    }
                    C7400 c7400Mo2163 = c7398Mo2177.mo2163();
                    if (!AbstractC4394.m8917(c7400Mo2163, c7400)) {
                        C1273 c12733 = c1277.f3725;
                        c12733.getClass();
                        synchronized (AbstractC1280.f3744) {
                            abstractC1286M2270 = AbstractC1280.m2270();
                            zM2241 = C1277.m2241(c1277, (C1273) AbstractC1280.m2256(c12733, c1277, abstractC1286M2270), i, c7400Mo2163);
                        }
                        AbstractC1280.m2259(abstractC1286M2270, c1277);
                    }
                    return z;
                } while (!zM2241);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C7400 c7400;
        int i;
        AbstractC1286 abstractC1286M2270;
        boolean zM2241;
        C7400 c74002;
        int i2;
        AbstractC1286 abstractC1286M22702;
        boolean zM22412;
        boolean z = false;
        switch (this.f3739) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(collection2, 10));
                if (iM8779 < 16) {
                    iM8779 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
                for (Map.Entry entry : collection2) {
                    Pair pair = new Pair(entry.getKey(), entry.getValue());
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                C1277 c1277 = this.f3740;
                do {
                    synchronized (AbstractC1274.f3705) {
                        C1273 c1273 = c1277.f3725;
                        c1273.getClass();
                        C1273 c12732 = (C1273) AbstractC1280.m2265(c1273);
                        c7400 = c12732.f3703;
                        i = c12732.f3702;
                    }
                    c7400.getClass();
                    C7398 c7398Mo2177 = c7400.mo2177();
                    Iterator it = c1277.f3723.iterator();
                    while (((C1258) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((C1258) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC4394.m8917(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            c7398Mo2177.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    C7400 c7400Mo2163 = c7398Mo2177.mo2163();
                    if (!AbstractC4394.m8917(c7400Mo2163, c7400)) {
                        C1273 c12733 = c1277.f3725;
                        c12733.getClass();
                        synchronized (AbstractC1280.f3744) {
                            abstractC1286M2270 = AbstractC1280.m2270();
                            zM2241 = C1277.m2241(c1277, (C1273) AbstractC1280.m2256(c12733, c1277, abstractC1286M2270), i, c7400Mo2163);
                        }
                        AbstractC1280.m2259(abstractC1286M2270, c1277);
                    }
                    return z;
                } while (!zM2241);
                return z;
            case 1:
                return m2247(collection);
            default:
                Set setM8800 = AbstractC4343.m8800(collection);
                C1277 c12772 = this.f3740;
                do {
                    synchronized (AbstractC1274.f3705) {
                        C1273 c12734 = c12772.f3725;
                        c12734.getClass();
                        C1273 c12735 = (C1273) AbstractC1280.m2265(c12734);
                        c74002 = c12735.f3703;
                        i2 = c12735.f3702;
                    }
                    c74002.getClass();
                    C7398 c7398Mo21772 = c74002.mo2177();
                    Iterator it2 = c12772.f3723.iterator();
                    while (((C1258) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((C1258) it2).next();
                        if (!setM8800.contains(entry3.getValue())) {
                            c7398Mo21772.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    C7400 c7400Mo21632 = c7398Mo21772.mo2163();
                    if (!AbstractC4394.m8917(c7400Mo21632, c74002)) {
                        C1273 c12736 = c12772.f3725;
                        c12736.getClass();
                        synchronized (AbstractC1280.f3744) {
                            abstractC1286M22702 = AbstractC1280.m2270();
                            zM22412 = C1277.m2241(c12772, (C1273) AbstractC1280.m2256(c12736, c12772, abstractC1286M22702), i2, c7400Mo21632);
                        }
                        AbstractC1280.m2259(abstractC1286M22702, c12772);
                    }
                    return z;
                } while (!zM22412);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f3740.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4381.m8885(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4381.m8884(this, objArr);
    }
}
