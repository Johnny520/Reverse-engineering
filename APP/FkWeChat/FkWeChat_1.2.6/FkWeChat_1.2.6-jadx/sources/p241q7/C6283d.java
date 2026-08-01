package p241q7;

import p024b9.AbstractC1061t;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: q7.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6283d extends AbstractC6299l {

    /* JADX INFO: renamed from: a */
    public final String f19692a;

    public C6283d(String str) {
        str.getClass();
        this.f19692a = str;
    }

    @Override // p241q7.AbstractC6299l
    /* JADX INFO: renamed from: a */
    public Object mo24864a(C6294i0 c6294i0, int i10, InterfaceC5976f interfaceC5976f) {
        return (i10 >= c6294i0.m24897e().size() || !AbstractC1061t.m3842c(c6294i0.m24897e().get(i10), this.f19692a)) ? AbstractC6301m.f19755b.m24920d() : AbstractC6301m.f19755b.m24918b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6283d) && AbstractC1061t.m3842c(this.f19692a, ((C6283d) obj).f19692a);
    }

    public int hashCode() {
        return this.f19692a.hashCode();
    }

    public String toString() {
        return this.f19692a;
    }
}
