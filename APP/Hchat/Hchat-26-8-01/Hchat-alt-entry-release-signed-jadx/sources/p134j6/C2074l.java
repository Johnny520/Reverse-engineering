package p134j6;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p069f.C0926c;
import p069f.C0930e;

/* JADX INFO: renamed from: j6.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2074l extends AbstractSet {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6960g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Map f6961h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2074l(Map map, int i9) {
        this.f6960g = i9;
        this.f6961h = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f6960g) {
            case 0:
                ((C2076n) this.f6961h).clear();
                break;
            case 1:
                ((C2076n) this.f6961h).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        C2075m c2075mM5134a;
        switch (this.f6960g) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                C2076n c2076n = (C2076n) this.f6961h;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C2075m c2075m = null;
                if (key != null) {
                    try {
                        c2075mM5134a = c2076n.m5134a(key, false);
                    } catch (ClassCastException unused) {
                        c2075mM5134a = null;
                    }
                    break;
                } else {
                    c2075mM5134a = null;
                }
                if (c2075mM5134a != null && Objects.equals(c2075mM5134a.f6969n, entry.getValue())) {
                    c2075m = c2075mM5134a;
                }
                return c2075m != null;
            case 1:
                return ((C2076n) this.f6961h).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f6960g) {
            case 0:
                return new C2073k((C2076n) this.f6961h, 0);
            case 1:
                return new C2073k((C2076n) this.f6961h, 1);
            default:
                return new C0926c((C0930e) this.f6961h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        C2075m c2075mM5134a;
        switch (this.f6960g) {
            case 0:
                C2076n c2076n = (C2076n) this.f6961h;
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C2075m c2075m = null;
                if (key != null) {
                    try {
                        c2075mM5134a = c2076n.m5134a(key, false);
                    } catch (ClassCastException unused) {
                        c2075mM5134a = null;
                    }
                    break;
                } else {
                    c2075mM5134a = null;
                }
                if (c2075mM5134a != null && Objects.equals(c2075mM5134a.f6969n, entry.getValue())) {
                    c2075m = c2075mM5134a;
                }
                if (c2075m == null) {
                    return false;
                }
                c2076n.m5136d(c2075m, true);
                return true;
            case 1:
                C2076n c2076n2 = (C2076n) this.f6961h;
                C2075m c2075mM5134a2 = null;
                if (obj != null) {
                    try {
                        c2075mM5134a2 = c2076n2.m5134a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c2075mM5134a2 != null) {
                    c2076n2.m5136d(c2075mM5134a2, true);
                }
                return c2075mM5134a2 != null;
            default:
                return super.remove(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f6960g) {
            case 0:
                return ((C2076n) this.f6961h).f6975j;
            case 1:
                return ((C2076n) this.f6961h).f6975j;
            default:
                return ((C0930e) this.f6961h).f2912i;
        }
    }
}
