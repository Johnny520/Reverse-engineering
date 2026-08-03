package p000a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p000a.AbstractC0461Z9;

/* JADX INFO: renamed from: a.J1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0166J1<K, V> extends C0598ge<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: h */
    public C0148I1 f592h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0166J1() {
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f592h == null) {
            this.f592h = new C0148I1(0, this);
        }
        C0148I1 c0148i1 = this.f592h;
        if (c0148i1.f1731a == null) {
            c0148i1.f1731a = new AbstractC0461Z9.b();
        }
        return c0148i1.f1731a;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        if (this.f592h == null) {
            this.f592h = new C0148I1(0, this);
        }
        C0148I1 c0148i1 = this.f592h;
        if (c0148i1.f1732b == null) {
            c0148i1.f1732b = new AbstractC0461Z9.c();
        }
        return c0148i1.f1732b;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m1431b(map.size() + this.f2221c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        if (this.f592h == null) {
            this.f592h = new C0148I1(0, this);
        }
        C0148I1 c0148i1 = this.f592h;
        if (c0148i1.f1733c == null) {
            c0148i1.f1733c = new AbstractC0461Z9.e();
        }
        return c0148i1.f1733c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: a.J1<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public C0166J1(C0598ge c0598ge) {
        if (c0598ge != null) {
            int i = c0598ge.f2221c;
            m1431b(this.f2221c + i);
            if (this.f2221c != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(c0598ge.m1436h(i2), c0598ge.m1438j(i2));
                }
            } else if (i > 0) {
                System.arraycopy(c0598ge.f2219a, 0, this.f2219a, 0, i);
                System.arraycopy(c0598ge.f2220b, 0, this.f2220b, 0, i << 1);
                this.f2221c = i;
            }
        }
    }
}
