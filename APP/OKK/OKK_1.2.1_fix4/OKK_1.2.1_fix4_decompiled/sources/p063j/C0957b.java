package p063j;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: j.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0957b extends C0966k implements Map {

    /* JADX INFO: renamed from: h */
    public C0956a f3391h;

    public C0957b(C0966k c0966k) {
        int i2 = c0966k.f3432c;
        m2317b(i2);
        if (this.f3432c != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(c0966k.m2322h(i3), c0966k.m2324j(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(c0966k.f3430a, 0, this.f3430a, 0, i2);
            System.arraycopy(c0966k.f3431b, 0, this.f3431b, 0, i2 << 1);
            this.f3432c = i2;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f3391h == null) {
            this.f3391h = new C0956a(0, this);
        }
        C0956a c0956a = this.f3391h;
        if (c0956a.f3386a == null) {
            c0956a.f3386a = new C0963h(c0956a, 0);
        }
        return c0956a.f3386a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f3391h == null) {
            this.f3391h = new C0956a(0, this);
        }
        C0956a c0956a = this.f3391h;
        if (c0956a.f3387b == null) {
            c0956a.f3387b = new C0963h(c0956a, 1);
        }
        return c0956a.f3387b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m2317b(map.size() + this.f3432c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f3391h == null) {
            this.f3391h = new C0956a(0, this);
        }
        C0956a c0956a = this.f3391h;
        if (c0956a.f3388c == null) {
            c0956a.f3388c = new C0965j(c0956a);
        }
        return c0956a.f3388c;
    }
}
