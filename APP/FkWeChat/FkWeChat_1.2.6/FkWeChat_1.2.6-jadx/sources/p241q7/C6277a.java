package p241q7;

import p024b9.AbstractC1061t;
import p210o7.AbstractC5653e;
import p228p8.InterfaceC5976f;
import p281t6.C8171x;

/* JADX INFO: renamed from: q7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6277a extends AbstractC6299l {

    /* JADX INFO: renamed from: a */
    public final C8171x f19678a;

    public C6277a(C8171x c8171x) {
        c8171x.getClass();
        this.f19678a = c8171x;
    }

    @Override // p241q7.AbstractC6299l
    /* JADX INFO: renamed from: a */
    public Object mo24864a(C6294i0 c6294i0, int i10, InterfaceC5976f interfaceC5976f) {
        return AbstractC1061t.m3842c(AbstractC5653e.m22858c(c6294i0.m24895c().mo5372m()), this.f19678a) ? AbstractC6301m.f19755b.m24917a() : AbstractC6301m.f19755b.m24919c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6277a) && AbstractC1061t.m3842c(this.f19678a, ((C6277a) obj).f19678a);
    }

    public int hashCode() {
        return this.f19678a.hashCode();
    }

    public String toString() {
        return "(method:" + this.f19678a.m31698i() + ')';
    }
}
