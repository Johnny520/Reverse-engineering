package p282t7;

import java.util.Map;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1404e;

/* JADX INFO: renamed from: t7.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8192p implements Map.Entry, InterfaceC1404e.a {

    /* JADX INFO: renamed from: q */
    public final Object f27493q;

    /* JADX INFO: renamed from: r */
    public Object f27494r;

    public C8192p(Object obj, Object obj2) {
        this.f27493q = obj;
        this.f27494r = obj2;
    }

    /* JADX INFO: renamed from: a */
    public void m31870a(Object obj) {
        this.f27494r = obj;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC1061t.m3842c(entry.getKey(), getKey()) && AbstractC1061t.m3842c(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f27493q;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f27494r;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        key.getClass();
        int iHashCode = key.hashCode() + 527;
        Object value = getValue();
        value.getClass();
        return iHashCode + value.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        m31870a(obj);
        return getValue();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
