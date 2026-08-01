package cc;

import bsh.C1189h4;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: cc.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C1515e implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public Object f4475q;

    /* JADX INFO: renamed from: r */
    public final Map f4476r;

    /* JADX INFO: renamed from: s */
    public int f4477s;

    public C1515e(Object obj, Map map) {
        map.getClass();
        this.f4475q = obj;
        this.f4476r = map;
    }

    /* JADX INFO: renamed from: g */
    private final void m5930g() {
        if (hasNext()) {
            return;
        }
        C1189h4.m4429a();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4477s < this.f4476r.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        m5930g();
        Object obj = this.f4475q;
        this.f4477s++;
        Object obj2 = this.f4476r.get(obj);
        if (obj2 != null) {
            this.f4475q = ((C1511a) obj2).m5923c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
