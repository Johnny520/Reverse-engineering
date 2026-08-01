package p139;

import androidx.appcompat.app.C0954;
import androidx.compose.foundation.C1905;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.C5983;
import p070.InterfaceC7396;
import p138.C8225;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8230 implements Map, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8230 f20413 = new C8230(C8236.f20421, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f20414;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8236 f20415;

    public C8230(C8236 c8236, int i) {
        this.f20415 = c8236;
        this.f20414 = i;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f20415.m13135(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (AbstractC5227.m9466(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C8238(this, 0);
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
        if (this.f20414 != map.size()) {
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
                if (AbstractC5227.m9466(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f20415.m13152(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f20414 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C8238(this, 1);
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
        return this.f20414;
    }

    public final String toString() {
        return AbstractC5176.m9369(entrySet(), ", ", "{", "}", new C1905(this, 21), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C5983(this, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8230 m13131(Object obj, C8225 c8225) {
        C0954 c0954M13143 = this.f20415.m13143(obj != null ? obj.hashCode() : 0, 0, obj, c8225);
        return c0954M13143 == null ? this : new C8230((C8236) c0954M13143.f660, this.f20414 + c0954M13143.f659);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public /* bridge */ C8228 mo2747() {
        return mo2748();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C8228 mo2748() {
        return new C8228(this);
    }
}
