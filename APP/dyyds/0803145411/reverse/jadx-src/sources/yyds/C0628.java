package yyds;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: yyds.ᛳᛷᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0628 extends AbstractSet {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3025;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Map f3026;

    public /* synthetic */ C0628(Map map, int i) {
        this.f3025 = i;
        this.f3026 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f3025;
        Map map = this.f3026;
        switch (i) {
            case 0:
                ((C1583) map).clear();
                break;
            case 1:
                ((C1583) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        C2580 c2580M3246;
        int i = this.f3025;
        Map map = this.f3026;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                C1583 c1583 = (C1583) map;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C2580 c2580 = null;
                if (key != null) {
                    try {
                        c2580M3246 = c1583.m3246(key, false);
                    } catch (ClassCastException unused) {
                        c2580M3246 = null;
                    }
                    break;
                } else {
                    c2580M3246 = null;
                }
                if (c2580M3246 != null && Objects.equals(c2580M3246.f12724, entry.getValue())) {
                    c2580 = c2580M3246;
                }
                return c2580 != null;
            case 1:
                return ((C1583) map).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f3025;
        Map map = this.f3026;
        switch (i) {
            case 0:
                return new C2154((C1583) map, 0);
            case 1:
                return new C2154((C1583) map, 1);
            default:
                return new C1316((C1505) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        C2580 c2580M3246;
        int i = this.f3025;
        C2580 c2580M32462 = null;
        Map map = this.f3026;
        switch (i) {
            case 0:
                C1583 c1583 = (C1583) map;
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        c2580M3246 = c1583.m3246(key, false);
                    } catch (ClassCastException unused) {
                        c2580M3246 = null;
                    }
                    break;
                } else {
                    c2580M3246 = null;
                }
                if (c2580M3246 != null && Objects.equals(c2580M3246.f12724, entry.getValue())) {
                    c2580M32462 = c2580M3246;
                }
                if (c2580M32462 == null) {
                    return false;
                }
                c1583.m3248(c2580M32462, true);
                return true;
            case 1:
                C1583 c15832 = (C1583) map;
                if (obj != null) {
                    try {
                        c2580M32462 = c15832.m3246(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c2580M32462 != null) {
                    c15832.m3248(c2580M32462, true);
                }
                return c2580M32462 != null;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f3025;
        Map map = this.f3026;
        switch (i) {
            case 0:
                return ((C1583) map).f8026;
            case 1:
                return ((C1583) map).f8026;
            default:
                return ((C1505) map).f4500;
        }
    }
}
