package androidx.compose.runtime;

import java.util.Iterator;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p150k1.InterfaceC3920m;

/* JADX INFO: renamed from: androidx.compose.runtime.m4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0542m4 implements InterfaceC3920m, Iterable, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final C0535l4 f1493q;

    /* JADX INFO: renamed from: r */
    public final int f1494r;

    /* JADX INFO: renamed from: s */
    public final int f1495s;

    public C0542m4(C0535l4 c0535l4, int i10, int i11) {
        this.f1493q = c0535l4;
        this.f1494r = i10;
        this.f1495s = i11;
    }

    /* JADX INFO: renamed from: a */
    private final void m1930a() {
        if (this.f1493q.m1911y() != this.f1495s) {
            AbstractC0549n4.m1962u();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0542m4)) {
            return false;
        }
        C0542m4 c0542m4 = (C0542m4) obj;
        return c0542m4.f1494r == this.f1494r && c0542m4.f1495s == this.f1495s && AbstractC1061t.m3842c(c0542m4.f1493q, this.f1493q);
    }

    public int hashCode() {
        return this.f1494r + (this.f1493q.hashCode() * 31);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        m1930a();
        this.f1493q.m1895F(this.f1494r);
        C0535l4 c0535l4 = this.f1493q;
        int i10 = this.f1494r;
        return new C0525k1(c0535l4, i10 + 1, i10 + AbstractC0549n4.m1956o(c0535l4.m1906t(), this.f1494r));
    }
}
