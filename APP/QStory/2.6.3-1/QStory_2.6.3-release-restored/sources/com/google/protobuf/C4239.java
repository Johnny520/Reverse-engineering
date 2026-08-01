package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰哲子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4239 implements Map {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Map f11407;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4202 f11408;

    public C4239(InterfaceC4202 interfaceC4202, Map map) {
        this.f11408 = interfaceC4202;
        this.f11407 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f11408.mo8038();
        this.f11407.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f11407.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f11407.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C4243(this.f11408, this.f11407.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f11407.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f11407.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f11407.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f11407.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C4243(this.f11408, this.f11407.keySet());
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f11408.mo8038();
        Charset charset = AbstractC4234.f11404;
        obj.getClass();
        obj2.getClass();
        return this.f11407.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f11408.mo8038();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC4234.f11404;
            obj.getClass();
            map.get(obj).getClass();
        }
        this.f11407.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.f11408.mo8038();
        return this.f11407.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f11407.size();
    }

    public final String toString() {
        return this.f11407.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C4241(this.f11408, this.f11407.values());
    }
}
