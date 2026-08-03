package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: M4 */
/* JADX INFO: loaded from: classes.dex */
public class C0521M4 extends C2520sy implements Map {

    /* JADX INFO: renamed from: d */
    public C0306H4 f1700d;

    /* JADX INFO: renamed from: e */
    public C0392J4 f1701e;

    /* JADX INFO: renamed from: f */
    public C0478L4 f1702f;

    public C0521M4(C0521M4 c0521m4) {
        super(0);
        mo3g(c0521m4);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0306H4 c0306h4 = this.f1700d;
        if (c0306h4 != null) {
            return c0306h4;
        }
        C0306H4 c0306h42 = new C0306H4(this);
        this.f1700d = c0306h42;
        return c0306h42;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1005k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0392J4 c0392j4 = this.f1701e;
        if (c0392j4 != null) {
            return c0392j4;
        }
        C0392J4 c0392j42 = new C0392J4(this);
        this.f1701e = c0392j42;
        return c0392j42;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1006l(Collection collection) {
        int i = this.f8818c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f8818c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m4998b(map.size() + this.f8818c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0478L4 c0478l4 = this.f1702f;
        if (c0478l4 != null) {
            return c0478l4;
        }
        C0478L4 c0478l42 = new C0478L4(this);
        this.f1702f = c0478l42;
        return c0478l42;
    }
}
