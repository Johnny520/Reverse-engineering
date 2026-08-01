package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: n6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0511n6 extends b40 implements Map {

    /* JADX INFO: renamed from: h */
    public C0474m6 f3235h;

    public C0511n6(b40 b40Var) {
        int i = b40Var.f681c;
        m480b(i);
        if (this.f681c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(b40Var.m485h(i2), b40Var.m487j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(b40Var.f679a, 0, this.f679a, 0, i);
            System.arraycopy(b40Var.f680b, 0, this.f680b, 0, i << 1);
            this.f681c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f3235h == null) {
            this.f3235h = new C0474m6(0, this);
        }
        C0474m6 c0474m6 = this.f3235h;
        if (c0474m6.f3076a == null) {
            c0474m6.f3076a = new C0978zs(c0474m6, 0);
        }
        return c0474m6.f3076a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f3235h == null) {
            this.f3235h = new C0474m6(0, this);
        }
        C0474m6 c0474m6 = this.f3235h;
        if (c0474m6.f3077b == null) {
            c0474m6.f3077b = new C0978zs(c0474m6, 1);
        }
        return c0474m6.f3077b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m480b(map.size() + this.f681c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f3235h == null) {
            this.f3235h = new C0474m6(0, this);
        }
        C0474m6 c0474m6 = this.f3235h;
        if (c0474m6.f3078c == null) {
            c0474m6.f3078c = new C0080bt(c0474m6);
        }
        return c0474m6.f3078c;
    }
}
