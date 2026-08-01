package p028c1;

import bsh.C1189h4;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: c1.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1306d implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public Object f3917q;

    /* JADX INFO: renamed from: r */
    public final Map f3918r;

    /* JADX INFO: renamed from: s */
    public int f3919s;

    public C1306d(Object obj, Map map) {
        this.f3917q = obj;
        this.f3918r = map;
    }

    /* JADX INFO: renamed from: g */
    private final void m5262g() {
        if (hasNext()) {
            return;
        }
        C1189h4.m4429a();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3919s < this.f3918r.size();
    }

    /* JADX INFO: renamed from: l */
    public final int m5263l() {
        return this.f3919s;
    }

    @Override // java.util.Iterator
    public Object next() {
        m5262g();
        Object obj = this.f3917q;
        this.f3919s++;
        Object obj2 = this.f3918r.get(obj);
        if (obj2 != null) {
            this.f3917q = ((C1303a) obj2).m5251c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    /* JADX INFO: renamed from: o */
    public final void m5264o(int i10) {
        this.f3919s = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
