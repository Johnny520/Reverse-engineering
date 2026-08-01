package androidx.compose.runtime;

import java.util.Iterator;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p150k1.InterfaceC3920m;

/* JADX INFO: renamed from: androidx.compose.runtime.n5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0550n5 implements InterfaceC3920m, Iterable, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final C0535l4 f1502q;

    /* JADX INFO: renamed from: r */
    public final int f1503r;

    /* JADX INFO: renamed from: s */
    public final AbstractC0539m1 f1504s;

    /* JADX INFO: renamed from: t */
    public final AbstractC0543m5 f1505t;

    /* JADX INFO: renamed from: u */
    public final Object f1506u;

    /* JADX INFO: renamed from: v */
    public final Iterable f1507v = this;

    public C0550n5(C0535l4 c0535l4, int i10, AbstractC0539m1 abstractC0539m1, AbstractC0543m5 abstractC0543m5) {
        this.f1502q = c0535l4;
        this.f1503r = i10;
        this.f1504s = abstractC0539m1;
        this.f1505t = abstractC0543m5;
        this.f1506u = Integer.valueOf(abstractC0539m1.m1924f());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0550n5)) {
            return false;
        }
        C0550n5 c0550n5 = (C0550n5) obj;
        return c0550n5.f1503r == this.f1503r && AbstractC1061t.m3842c(c0550n5.f1502q, this.f1502q) && AbstractC1061t.m3842c(c0550n5.f1505t, this.f1505t);
    }

    public int hashCode() {
        return (((this.f1503r * 31) + this.f1502q.hashCode()) * 31) + this.f1505t.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C0536l5(this.f1502q, this.f1503r, this.f1504s, this.f1505t);
    }
}
