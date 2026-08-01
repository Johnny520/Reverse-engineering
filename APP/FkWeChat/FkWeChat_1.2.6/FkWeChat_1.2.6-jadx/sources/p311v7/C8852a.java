package p311v7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1404e;

/* JADX INFO: renamed from: v7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8852a implements Map, InterfaceC1404e {

    /* JADX INFO: renamed from: q */
    public final ConcurrentHashMap f29405q;

    public C8852a(int i10) {
        this.f29405q = new ConcurrentHashMap(i10);
    }

    /* JADX INFO: renamed from: a */
    public Set m33993a() {
        Set setEntrySet = this.f29405q.entrySet();
        setEntrySet.getClass();
        return setEntrySet;
    }

    /* JADX INFO: renamed from: c */
    public Set m33994c() {
        Set setKeySet = this.f29405q.keySet();
        setKeySet.getClass();
        return setKeySet;
    }

    @Override // java.util.Map
    public void clear() {
        this.f29405q.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f29405q.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f29405q.containsValue(obj);
    }

    /* JADX INFO: renamed from: e */
    public int m33995e() {
        return this.f29405q.size();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m33993a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof Map) {
            return AbstractC1061t.m3842c(obj, this.f29405q);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public Collection m33996g() {
        Collection collectionValues = this.f29405q.values();
        collectionValues.getClass();
        return collectionValues;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f29405q.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f29405q.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f29405q.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m33994c();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.f29405q.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        map.getClass();
        this.f29405q.putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.f29405q.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m33995e();
    }

    public String toString() {
        return "ConcurrentMapJvm by " + this.f29405q;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m33996g();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return this.f29405q.remove(obj, obj2);
    }

    public /* synthetic */ C8852a(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 32 : i10);
    }
}
