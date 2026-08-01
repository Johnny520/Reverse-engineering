package p016b1;

import java.util.Map;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: b1.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0906b implements Map.Entry, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final Object f2852q;

    /* JADX INFO: renamed from: r */
    public final Object f2853r;

    public C0906b(Object obj, Object obj2) {
        this.f2852q = obj;
        this.f2853r = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && AbstractC1061t.m3842c(entry.getKey(), getKey()) && AbstractC1061t.m3842c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f2852q;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f2853r;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
