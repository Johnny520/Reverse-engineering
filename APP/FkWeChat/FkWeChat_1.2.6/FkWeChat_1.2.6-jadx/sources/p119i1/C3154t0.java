package p119i1;

import java.util.Iterator;
import java.util.Map;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: i1.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3154t0 extends AbstractC3152s0 implements Iterator, InterfaceC1400a {
    public C3154t0(C3128g0 c3128g0, Iterator it) {
        super(c3128g0, it);
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry entryM11871y = m11871y();
        if (entryM11871y == null) {
            throw new IllegalStateException();
        }
        m11868o();
        return entryM11871y.getKey();
    }
}
