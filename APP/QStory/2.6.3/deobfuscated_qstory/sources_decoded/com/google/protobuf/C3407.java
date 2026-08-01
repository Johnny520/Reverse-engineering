package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰哲子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3407 implements Map {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Map f11062;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3370 f11063;

    public C3407(InterfaceC3370 interfaceC3370, Map map) {
        this.f11063 = interfaceC3370;
        this.f11062 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f11063.mo7479();
        this.f11062.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f11062.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f11062.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C3411(this.f11063, this.f11062.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f11062.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f11062.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f11062.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f11062.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C3411(this.f11063, this.f11062.keySet());
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f11063.mo7479();
        Charset charset = AbstractC3402.f11059;
        obj.getClass();
        obj2.getClass();
        return this.f11062.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f11063.mo7479();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC3402.f11059;
            obj.getClass();
            map.get(obj).getClass();
        }
        this.f11062.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.f11063.mo7479();
        return this.f11062.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f11062.size();
    }

    public final String toString() {
        return this.f11062.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C3409(this.f11063, this.f11062.values());
    }
}
