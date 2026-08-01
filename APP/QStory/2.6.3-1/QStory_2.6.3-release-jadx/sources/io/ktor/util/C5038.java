package io.ktor.util;

import com.materialkolor.dynamiccolor.C4639;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7392;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5038 implements Map, InterfaceC7392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final LinkedHashMap f13040 = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f13040.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f13040.containsKey(new C5037((String) obj));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f13040.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C5053(this.f13040.entrySet(), new C4639(27), new C4639(28));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5038)) {
            return false;
        }
        return AbstractC5227.m9466(((C5038) obj).f13040, this.f13040);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f13040.get(new C5037((String) obj));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f13040.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f13040.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C5053(this.f13040.keySet(), new C4639(29), new C5039(0));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        str.getClass();
        obj2.getClass();
        return this.f13040.put(new C5037(str), obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            value.getClass();
            this.f13040.put(new C5037(str), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f13040.remove(new C5037((String) obj));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f13040.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f13040.values();
    }
}
