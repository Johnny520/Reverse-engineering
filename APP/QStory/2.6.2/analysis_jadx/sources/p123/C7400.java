package p123;

import androidx.appcompat.app.C0107;
import androidx.compose.foundation.C1067;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.C5150;
import p054.InterfaceC6566;
import p122.C7395;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C7400 implements Map, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7400 f20073 = new C7400(C7406.f20081, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f20074;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7406 f20075;

    public C7400(C7406 c7406, int i) {
        this.f20075 = c7406;
        this.f20074 = i;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f20075.m12549(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (AbstractC4394.m8917(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C7408(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.f20074 != map.size()) {
            return false;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : setEntrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (AbstractC4394.m8917(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f20075.m12566(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f20074 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C7408(this, 1);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f20074;
    }

    public final String toString() {
        return AbstractC4343.m8813(entrySet(), ", ", "{", "}", new C1067(this, 21), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C5150(this, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7400 m12545(Object obj, C7395 c7395) {
        C0107 c0107M12557 = this.f20075.m12557(obj != null ? obj.hashCode() : 0, 0, obj, c7395);
        return c0107M12557 == null ? this : new C7400((C7406) c0107M12557.f315, this.f20074 + c0107M12557.f314);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public /* bridge */ C7398 mo2177() {
        return mo2178();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C7398 mo2178() {
        return new C7398(this);
    }
}
