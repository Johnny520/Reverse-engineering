package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: n6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0511n6 extends u30 implements Map {

    /* JADX INFO: renamed from: h */
    public C0474m6 f3348h;

    public C0511n6(u30 u30Var) {
        int i = u30Var.f4662c;
        m2411b(i);
        if (this.f4662c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(u30Var.m2416h(i2), u30Var.m2418j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(u30Var.f4660a, 0, this.f4660a, 0, i);
            System.arraycopy(u30Var.f4661b, 0, this.f4661b, 0, i << 1);
            this.f4662c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f3348h == null) {
            this.f3348h = new C0474m6(0, this);
        }
        C0474m6 c0474m6 = this.f3348h;
        if (c0474m6.f3146a == null) {
            c0474m6.f3146a = new C0756ts(c0474m6, 0);
        }
        return c0474m6.f3146a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f3348h == null) {
            this.f3348h = new C0474m6(0, this);
        }
        C0474m6 c0474m6 = this.f3348h;
        if (c0474m6.f3147b == null) {
            c0474m6.f3147b = new C0756ts(c0474m6, 1);
        }
        return c0474m6.f3147b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m2411b(map.size() + this.f4662c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f3348h == null) {
            this.f3348h = new C0474m6(0, this);
        }
        C0474m6 c0474m6 = this.f3348h;
        if (c0474m6.f3148c == null) {
            c0474m6.f3148c = new C0830vs(c0474m6);
        }
        return c0474m6.f3148c;
    }
}
