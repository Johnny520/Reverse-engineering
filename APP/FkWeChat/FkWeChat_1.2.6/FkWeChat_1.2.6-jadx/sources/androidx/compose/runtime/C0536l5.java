package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import p036c9.InterfaceC1400a;
import p150k1.InterfaceC3920m;
import p215oc.C5706c;

/* JADX INFO: renamed from: androidx.compose.runtime.l5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0536l5 implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final C0535l4 f1483q;

    /* JADX INFO: renamed from: r */
    public final int f1484r;

    /* JADX INFO: renamed from: s */
    public final AbstractC0539m1 f1485s;

    /* JADX INFO: renamed from: t */
    public final AbstractC0543m5 f1486t;

    /* JADX INFO: renamed from: u */
    public final int f1487u;

    /* JADX INFO: renamed from: v */
    public int f1488v;

    public C0536l5(C0535l4 c0535l4, int i10, AbstractC0539m1 abstractC0539m1, AbstractC0543m5 abstractC0543m5) {
        this.f1483q = c0535l4;
        this.f1484r = i10;
        this.f1485s = abstractC0539m1;
        this.f1486t = abstractC0543m5;
        this.f1487u = c0535l4.m1911y();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public InterfaceC3920m next() {
        Object obj;
        ArrayList arrayListM1923e = this.f1485s.m1923e();
        if (arrayListM1923e != null) {
            int i10 = this.f1488v;
            this.f1488v = i10 + 1;
            obj = arrayListM1923e.get(i10);
        } else {
            obj = null;
        }
        if (obj instanceof C0460b) {
            return new C0542m4(this.f1483q, ((C0460b) obj).m1527a(), this.f1487u);
        }
        if (obj instanceof AbstractC0539m1) {
            return new C0550n5(this.f1483q, this.f1484r, (AbstractC0539m1) obj, new C0458a4(this.f1486t, this.f1488v - 1));
        }
        AbstractC0468c0.m1549c("Unexpected group information structure");
        C5706c.m23089a();
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList arrayListM1923e = this.f1485s.m1923e();
        return arrayListM1923e != null && this.f1488v < arrayListM1923e.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
