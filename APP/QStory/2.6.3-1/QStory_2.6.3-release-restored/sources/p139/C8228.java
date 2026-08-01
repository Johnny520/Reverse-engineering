package p139;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p070.InterfaceC7392;
import p131.C8165;
import p131.C8166;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8228 extends AbstractMap implements Map, InterfaceC7392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f20404;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f20405;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f20406;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C8165 f20407 = new C8165();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C8236 f20408;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C8230 f20409;

    public C8228(C8230 c8230) {
        this.f20409 = c8230;
        this.f20408 = c8230.f20415;
        this.f20406 = c8230.f20414;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f20408 = C8236.f20421;
        m13128(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f20408.m13135(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C8226(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f20408.m13152(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new C8226(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f20405 = null;
        this.f20408 = this.f20408.m13154(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f20405;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        C8230 c8230Mo2733 = null;
        C8230 c8230 = map instanceof C8230 ? (C8230) map : null;
        if (c8230 == null) {
            C8228 c8228 = map instanceof C8228 ? (C8228) map : null;
            if (c8228 != null) {
                c8230Mo2733 = c8228.mo2733();
            }
        } else {
            c8230Mo2733 = c8230;
        }
        if (c8230Mo2733 == null) {
            super.putAll(map);
            return;
        }
        C8166 c8166 = new C8166();
        c8166.f19894 = 0;
        int i = this.f20406;
        C8236 c8236 = this.f20408;
        C8236 c82362 = c8230Mo2733.f20415;
        c82362.getClass();
        this.f20408 = c8236.m13146(c82362, 0, c8166, this);
        int i2 = (c8230Mo2733.f20414 + i) - c8166.f19894;
        if (i != i2) {
            m13128(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f20406;
        C8236 c8236M13149 = this.f20408.m13149(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c8236M13149 == null) {
            c8236M13149 = C8236.f20421;
        }
        this.f20408 = c8236M13149;
        return i != this.f20406;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20406;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new C8234(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13128(int i) {
        this.f20406 = i;
        this.f20404++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public /* bridge */ C8230 mo2733() {
        return mo2733();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C8230 mo2733() {
        C8236 c8236 = this.f20408;
        C8230 c8230 = this.f20409;
        if (c8236 != c8230.f20415) {
            this.f20407 = new C8165();
            c8230 = new C8230(this.f20408, this.f20406);
        }
        this.f20409 = c8230;
        return c8230;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f20405 = null;
        C8236 c8236M13145 = this.f20408.m13145(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c8236M13145 == null) {
            c8236M13145 = C8236.f20421;
        }
        this.f20408 = c8236M13145;
        return this.f20405;
    }
}
