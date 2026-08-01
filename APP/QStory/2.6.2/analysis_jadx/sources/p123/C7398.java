package p123;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p054.InterfaceC6562;
import p115.C7335;
import p115.C7336;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C7398 extends AbstractMap implements Map, InterfaceC6562 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f20064;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f20065;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f20066;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7335 f20067 = new C7335();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C7406 f20068;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7400 f20069;

    public C7398(C7400 c7400) {
        this.f20069 = c7400;
        this.f20068 = c7400.f20075;
        this.f20066 = c7400.f20074;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f20068 = C7406.f20081;
        m12542(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f20068.m12549(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C7396(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f20068.m12566(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new C7396(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f20065 = null;
        this.f20068 = this.f20068.m12568(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f20065;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        C7400 c7400Mo2163 = null;
        C7400 c7400 = map instanceof C7400 ? (C7400) map : null;
        if (c7400 == null) {
            C7398 c7398 = map instanceof C7398 ? (C7398) map : null;
            if (c7398 != null) {
                c7400Mo2163 = c7398.mo2163();
            }
        } else {
            c7400Mo2163 = c7400;
        }
        if (c7400Mo2163 == null) {
            super.putAll(map);
            return;
        }
        C7336 c7336 = new C7336();
        c7336.f19554 = 0;
        int i = this.f20066;
        C7406 c7406 = this.f20068;
        C7406 c74062 = c7400Mo2163.f20075;
        c74062.getClass();
        this.f20068 = c7406.m12560(c74062, 0, c7336, this);
        int i2 = (c7400Mo2163.f20074 + i) - c7336.f19554;
        if (i != i2) {
            m12542(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f20066;
        C7406 c7406M12563 = this.f20068.m12563(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c7406M12563 == null) {
            c7406M12563 = C7406.f20081;
        }
        this.f20068 = c7406M12563;
        return i != this.f20066;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20066;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new C7404(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12542(int i) {
        this.f20066 = i;
        this.f20064++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public /* bridge */ C7400 mo2163() {
        return mo2163();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C7400 mo2163() {
        C7406 c7406 = this.f20068;
        C7400 c7400 = this.f20069;
        if (c7406 != c7400.f20075) {
            this.f20067 = new C7335();
            c7400 = new C7400(this.f20068, this.f20066);
        }
        this.f20069 = c7400;
        return c7400;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f20065 = null;
        C7406 c7406M12559 = this.f20068.m12559(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c7406M12559 == null) {
            c7406M12559 = C7406.f20081;
        }
        this.f20068 = c7406M12559;
        return this.f20065;
    }
}
