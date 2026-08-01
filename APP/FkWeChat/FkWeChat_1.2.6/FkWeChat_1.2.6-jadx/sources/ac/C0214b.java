package ac;

import java.util.Map;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: ac.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C0214b implements Map.Entry, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final Object f544q;

    /* JADX INFO: renamed from: r */
    public final Object f545r;

    public C0214b(Object obj, Object obj2) {
        this.f544q = obj;
        this.f545r = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && AbstractC1061t.m3842c(entry.getKey(), getKey()) && AbstractC1061t.m3842c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f544q;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f545r;
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
