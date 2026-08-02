package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: hg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class C0276hg extends uq2 implements Map {

    /* JADX INFO: renamed from: k */
    public kb1 f3997k;

    /* JADX INFO: renamed from: l */
    public C0165eg f3998l;

    /* JADX INFO: renamed from: m */
    public C0239gg f3999m;

    @Override // java.util.Map
    public final Set entrySet() {
        kb1 kb1Var = this.f3997k;
        if (kb1Var != null) {
            return kb1Var;
        }
        kb1 kb1Var2 = new kb1(this, 2);
        this.f3997k = kb1Var2;
        return kb1Var2;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2161k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0165eg c0165eg = this.f3998l;
        if (c0165eg != null) {
            return c0165eg;
        }
        C0165eg c0165eg2 = new C0165eg(this);
        this.f3998l = c0165eg2;
        return c0165eg2;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2162l(Collection collection) {
        int i = this.f11446j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f11446j;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m5565b(map.size() + this.f11446j);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0239gg c0239gg = this.f3999m;
        if (c0239gg != null) {
            return c0239gg;
        }
        C0239gg c0239gg2 = new C0239gg(this);
        this.f3999m = c0239gg2;
        return c0239gg2;
    }
}
