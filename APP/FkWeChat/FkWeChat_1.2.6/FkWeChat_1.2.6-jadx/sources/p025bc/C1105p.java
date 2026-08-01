package p025bc;

import bsh.C1189h4;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: bc.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C1105p implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public Object f3332q;

    /* JADX INFO: renamed from: r */
    public final Map f3333r;

    /* JADX INFO: renamed from: s */
    public int f3334s;

    public C1105p(Object obj, Map map) {
        map.getClass();
        this.f3332q = obj;
        this.f3333r = map;
    }

    /* JADX INFO: renamed from: g */
    public final Object m4005g() {
        return this.f3332q;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3334s < this.f3333r.size();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C1090a next() {
        if (!hasNext()) {
            C1189h4.m4429a();
            return null;
        }
        Object obj = this.f3333r.get(this.f3332q);
        if (obj != null) {
            C1090a c1090a = (C1090a) obj;
            this.f3334s++;
            this.f3332q = c1090a.m3968c();
            return c1090a;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f3332q + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
