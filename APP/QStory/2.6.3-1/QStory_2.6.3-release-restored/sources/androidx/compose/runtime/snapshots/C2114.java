package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5214;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7391;
import p070.InterfaceC7393;
import p070.InterfaceC7396;
import p139.C8228;
import p139.C8230;
import p141.InterfaceC8250;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2114 implements Set, InterfaceC7391 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f4085;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2112 f4086;

    public C2114(C2112 c2112, int i) {
        this.f4085 = i;
        this.f4086 = c2112;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final boolean m2817(Collection collection) {
        C8230 c8230;
        int i;
        AbstractC2121 abstractC2121M2840;
        boolean zM2811;
        Set setM9347 = AbstractC5176.m9347(collection);
        C2112 c2112 = this.f4086;
        boolean z = false;
        do {
            synchronized (AbstractC2109.f4051) {
                C2108 c2108 = c2112.f4071;
                c2108.getClass();
                C2108 c21082 = (C2108) AbstractC2115.m2835(c2108);
                c8230 = c21082.f4049;
                i = c21082.f4048;
            }
            c8230.getClass();
            C8228 c8228Mo2747 = c8230.mo2747();
            Iterator it = c2112.f4069.iterator();
            while (((C2093) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C2093) it).next();
                if (!setM9347.contains(entry.getKey())) {
                    c8228Mo2747.remove(entry.getKey());
                    z = true;
                }
            }
            C8230 c8230Mo2733 = c8228Mo2747.mo2733();
            if (AbstractC5227.m9466(c8230Mo2733, c8230)) {
                break;
            }
            C2108 c21083 = c2112.f4071;
            c21083.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2811 = C2112.m2811(c2112, (C2108) AbstractC2115.m2826(c21083, c2112, abstractC2121M2840), i, c8230Mo2733);
            }
            AbstractC2115.m2829(abstractC2121M2840, c2112);
        } while (!zM2811);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f4085) {
            case 0:
                AbstractC2109.m2796();
                throw null;
            case 1:
                AbstractC2109.m2796();
                throw null;
            default:
                AbstractC2109.m2796();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f4085) {
            case 0:
                AbstractC2109.m2796();
                throw null;
            case 1:
                AbstractC2109.m2796();
                throw null;
            default:
                AbstractC2109.m2796();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f4086.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f4085;
        C2112 c2112 = this.f4086;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof InterfaceC7396) && !(obj instanceof InterfaceC7393))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC5227.m9466(c2112.get(entry.getKey()), entry.getValue());
            case 1:
                return c2112.containsKey(obj);
            default:
                return c2112.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f4085;
        C2112 c2112 = this.f4086;
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
                        if (!c2112.containsKey(it2.next())) {
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
                        if (!c2112.containsValue(it3.next())) {
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
        return this.f4086.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f4085;
        C2112 c2112 = this.f4086;
        switch (i) {
            case 0:
                return new C2093(c2112, ((InterfaceC8250) c2112.m2812().f4049.entrySet()).iterator(), 0);
            case 1:
                return new C2093(c2112, ((InterfaceC8250) c2112.m2812().f4049.entrySet()).iterator(), 1);
            default:
                return new C2093(c2112, ((InterfaceC8250) c2112.m2812().f4049.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        int i = this.f4085;
        C2112 c2112 = this.f4086;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    if ((!(obj instanceof InterfaceC7396) || (obj instanceof InterfaceC7393)) && c2112.remove(((Map.Entry) obj).getKey()) != null) {
                    }
                }
                break;
            case 1:
                if (c2112.remove(obj) != null) {
                }
                break;
            default:
                Iterator it = c2112.f4069.iterator();
                while (true) {
                    if (((C2093) it).hasNext()) {
                        next = ((C2093) it).next();
                        if (AbstractC5227.m9466(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    c2112.remove(entry.getKey());
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C8230 c8230;
        int i;
        AbstractC2121 abstractC2121M2840;
        boolean zM2811;
        boolean z = false;
        switch (this.f4085) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.f4086.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
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
                        if (this.f4086.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
                break;
            default:
                Set setM9347 = AbstractC5176.m9347(collection);
                C2112 c2112 = this.f4086;
                do {
                    synchronized (AbstractC2109.f4051) {
                        C2108 c2108 = c2112.f4071;
                        c2108.getClass();
                        C2108 c21082 = (C2108) AbstractC2115.m2835(c2108);
                        c8230 = c21082.f4049;
                        i = c21082.f4048;
                    }
                    c8230.getClass();
                    C8228 c8228Mo2747 = c8230.mo2747();
                    Iterator it3 = c2112.f4069.iterator();
                    while (((C2093) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C2093) it3).next();
                        if (setM9347.contains(entry.getValue())) {
                            c8228Mo2747.remove(entry.getKey());
                            z = true;
                        }
                    }
                    C8230 c8230Mo2733 = c8228Mo2747.mo2733();
                    if (!AbstractC5227.m9466(c8230Mo2733, c8230)) {
                        C2108 c21083 = c2112.f4071;
                        c21083.getClass();
                        synchronized (AbstractC2115.f4090) {
                            abstractC2121M2840 = AbstractC2115.m2840();
                            zM2811 = C2112.m2811(c2112, (C2108) AbstractC2115.m2826(c21083, c2112, abstractC2121M2840), i, c8230Mo2733);
                        }
                        AbstractC2115.m2829(abstractC2121M2840, c2112);
                    }
                    return z;
                } while (!zM2811);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C8230 c8230;
        int i;
        AbstractC2121 abstractC2121M2840;
        boolean zM2811;
        C8230 c82302;
        int i2;
        AbstractC2121 abstractC2121M28402;
        boolean zM28112;
        boolean z = false;
        switch (this.f4085) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(collection2, 10));
                if (iM9331 < 16) {
                    iM9331 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
                for (Map.Entry entry : collection2) {
                    Pair pair = new Pair(entry.getKey(), entry.getValue());
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                C2112 c2112 = this.f4086;
                do {
                    synchronized (AbstractC2109.f4051) {
                        C2108 c2108 = c2112.f4071;
                        c2108.getClass();
                        C2108 c21082 = (C2108) AbstractC2115.m2835(c2108);
                        c8230 = c21082.f4049;
                        i = c21082.f4048;
                    }
                    c8230.getClass();
                    C8228 c8228Mo2747 = c8230.mo2747();
                    Iterator it = c2112.f4069.iterator();
                    while (((C2093) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((C2093) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC5227.m9466(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            c8228Mo2747.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    C8230 c8230Mo2733 = c8228Mo2747.mo2733();
                    if (!AbstractC5227.m9466(c8230Mo2733, c8230)) {
                        C2108 c21083 = c2112.f4071;
                        c21083.getClass();
                        synchronized (AbstractC2115.f4090) {
                            abstractC2121M2840 = AbstractC2115.m2840();
                            zM2811 = C2112.m2811(c2112, (C2108) AbstractC2115.m2826(c21083, c2112, abstractC2121M2840), i, c8230Mo2733);
                        }
                        AbstractC2115.m2829(abstractC2121M2840, c2112);
                    }
                    return z;
                } while (!zM2811);
                return z;
            case 1:
                return m2817(collection);
            default:
                Set setM9347 = AbstractC5176.m9347(collection);
                C2112 c21122 = this.f4086;
                do {
                    synchronized (AbstractC2109.f4051) {
                        C2108 c21084 = c21122.f4071;
                        c21084.getClass();
                        C2108 c21085 = (C2108) AbstractC2115.m2835(c21084);
                        c82302 = c21085.f4049;
                        i2 = c21085.f4048;
                    }
                    c82302.getClass();
                    C8228 c8228Mo27472 = c82302.mo2747();
                    Iterator it2 = c21122.f4069.iterator();
                    while (((C2093) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((C2093) it2).next();
                        if (!setM9347.contains(entry3.getValue())) {
                            c8228Mo27472.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    C8230 c8230Mo27332 = c8228Mo27472.mo2733();
                    if (!AbstractC5227.m9466(c8230Mo27332, c82302)) {
                        C2108 c21086 = c21122.f4071;
                        c21086.getClass();
                        synchronized (AbstractC2115.f4090) {
                            abstractC2121M28402 = AbstractC2115.m2840();
                            zM28112 = C2112.m2811(c21122, (C2108) AbstractC2115.m2826(c21086, c21122, abstractC2121M28402), i2, c8230Mo27332);
                        }
                        AbstractC2115.m2829(abstractC2121M28402, c21122);
                    }
                    return z;
                } while (!zM28112);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f4086.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC5214.m9434(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC5214.m9433(this, objArr);
    }
}
