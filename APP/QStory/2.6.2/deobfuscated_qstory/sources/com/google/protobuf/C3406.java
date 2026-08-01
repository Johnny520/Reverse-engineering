package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰哲子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3406 implements Map {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Map f11057;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3369 f11058;

    public C3406(InterfaceC3369 interfaceC3369, Map map) {
        this.f11058 = interfaceC3369;
        this.f11057 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f11058.mo7492();
        this.f11057.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f11057.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f11057.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C3410(this.f11058, this.f11057.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f11057.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f11057.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f11057.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f11057.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C3410(this.f11058, this.f11057.keySet());
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f11058.mo7492();
        Charset charset = AbstractC3401.f11054;
        obj.getClass();
        obj2.getClass();
        return this.f11057.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f11058.mo7492();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC3401.f11054;
            obj.getClass();
            map.get(obj).getClass();
        }
        this.f11057.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.f11058.mo7492();
        return this.f11057.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f11057.size();
    }

    public final String toString() {
        return this.f11057.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C3408(this.f11058, this.f11057.values());
    }
}
