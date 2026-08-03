package p080fb;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: fb.k1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1141k1 extends LinkedHashMap {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3762g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1141k1(int i9, float f3, boolean z9, int i10) {
        super(i9, f3, z9);
        this.f3762g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        switch (this.f3762g) {
            case 0:
                if (obj instanceof String) {
                    return super.containsKey((String) obj);
                }
                return false;
            default:
                if (obj instanceof Long) {
                    return super.containsKey((Long) obj);
                }
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsValue(Object obj) {
        switch (this.f3762g) {
            case 0:
                if (obj instanceof String) {
                    return super.containsValue((String) obj);
                }
                return false;
            default:
                return super.containsValue(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        switch (this.f3762g) {
            case 0:
                if (obj instanceof String) {
                    return (String) super.get((String) obj);
                }
                return null;
            default:
                if (obj instanceof Long) {
                    return super.get((Long) obj);
                }
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.f3762g) {
            case 0:
                return !(obj instanceof String) ? obj2 : (String) super.getOrDefault((String) obj, (String) obj2);
            default:
                return !(obj instanceof Long) ? obj2 : super.getOrDefault((Long) obj, obj2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        switch (this.f3762g) {
            case 0:
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    return super.remove((String) obj, (String) obj2);
                }
                return false;
            default:
                if ((obj instanceof Long) && obj2 != null) {
                    return super.remove((Long) obj, obj2);
                }
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f3762g) {
            case 0:
                if (super.size() > 2048) {
                }
                break;
            default:
                if (super.size() > 80) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        switch (this.f3762g) {
            case 0:
                if (obj instanceof String) {
                    return (String) super.remove((String) obj);
                }
                return null;
            default:
                if (obj instanceof Long) {
                    return super.remove((Long) obj);
                }
                return null;
        }
    }
}
