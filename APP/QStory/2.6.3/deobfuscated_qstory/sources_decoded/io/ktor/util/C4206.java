package io.ktor.util;

import com.materialkolor.dynamiccolor.C3807;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4395;
import p054.InterfaceC6563;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4206 implements Map, InterfaceC6563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final LinkedHashMap f12695 = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f12695.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f12695.containsKey(new C4205((String) obj));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f12695.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C4221(this.f12695.entrySet(), new C3807(27), new C3807(28));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C4206)) {
            return false;
        }
        return AbstractC4395.m8907(((C4206) obj).f12695, this.f12695);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f12695.get(new C4205((String) obj));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f12695.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f12695.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C4221(this.f12695.keySet(), new C3807(29), new C4207(0));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        str.getClass();
        obj2.getClass();
        return this.f12695.put(new C4205(str), obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            value.getClass();
            this.f12695.put(new C4205(str), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f12695.remove(new C4205((String) obj));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12695.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f12695.values();
    }
}
