package p224q2;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import me.dartcv.nuke.BuildConfig;
import p186k.C2421c;
import p186k.C2423e;

/* JADX INFO: renamed from: q2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2921l extends AbstractSet {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9224d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Map f9225e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2921l(Map map, int i5) {
        this.f9224d = i5;
        this.f9225e = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f9224d) {
            case 0:
                ((C2923n) this.f9225e).clear();
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((C2923n) this.f9225e).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        C2922m c2922mM5123a;
        switch (this.f9224d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                C2923n c2923n = (C2923n) this.f9225e;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C2922m c2922m = null;
                if (key != null) {
                    try {
                        c2922mM5123a = c2923n.m5123a(key, false);
                    } catch (ClassCastException unused) {
                        c2922mM5123a = null;
                    }
                    break;
                } else {
                    c2922mM5123a = null;
                }
                if (c2922mM5123a != null && Objects.equals(c2922mM5123a.f9233k, entry.getValue())) {
                    c2922m = c2922mM5123a;
                }
                return c2922m != null;
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C2923n) this.f9225e).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9224d) {
            case 0:
                return new C2920k((C2923n) this.f9225e, 0);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C2920k((C2923n) this.f9225e, 1);
            default:
                return new C2421c((C2423e) this.f9225e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        C2922m c2922mM5123a;
        switch (this.f9224d) {
            case 0:
                C2923n c2923n = (C2923n) this.f9225e;
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C2922m c2922m = null;
                if (key != null) {
                    try {
                        c2922mM5123a = c2923n.m5123a(key, false);
                    } catch (ClassCastException unused) {
                        c2922mM5123a = null;
                    }
                    break;
                } else {
                    c2922mM5123a = null;
                }
                if (c2922mM5123a != null && Objects.equals(c2922mM5123a.f9233k, entry.getValue())) {
                    c2922m = c2922mM5123a;
                }
                if (c2922m == null) {
                    return false;
                }
                c2923n.m5125c(c2922m, true);
                return true;
            case BuildConfig.VERSION_CODE /* 1 */:
                C2923n c2923n2 = (C2923n) this.f9225e;
                C2922m c2922mM5123a2 = null;
                if (obj != null) {
                    try {
                        c2922mM5123a2 = c2923n2.m5123a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c2922mM5123a2 != null) {
                    c2923n2.m5125c(c2922mM5123a2, true);
                }
                return c2922mM5123a2 != null;
            default:
                return super.remove(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f9224d) {
            case 0:
                return ((C2923n) this.f9225e).f9239g;
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C2923n) this.f9225e).f9239g;
            default:
                return ((C2423e) this.f9225e).f7820f;
        }
    }
}
