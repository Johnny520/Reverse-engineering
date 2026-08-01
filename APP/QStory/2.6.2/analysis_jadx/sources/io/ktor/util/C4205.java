package io.ktor.util;

import com.materialkolor.dynamiccolor.C3806;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4394;
import p054.InterfaceC6562;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4205 implements Map, InterfaceC6562 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final LinkedHashMap f12691 = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f12691.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f12691.containsKey(new C4204((String) obj));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f12691.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C4220(this.f12691.entrySet(), new C3806(27), new C3806(28));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C4205)) {
            return false;
        }
        return AbstractC4394.m8917(((C4205) obj).f12691, this.f12691);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f12691.get(new C4204((String) obj));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f12691.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f12691.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C4220(this.f12691.keySet(), new C3806(29), new C4206(0));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        str.getClass();
        obj2.getClass();
        return this.f12691.put(new C4204(str), obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            value.getClass();
            this.f12691.put(new C4204(str), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f12691.remove(new C4204((String) obj));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12691.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f12691.values();
    }
}
