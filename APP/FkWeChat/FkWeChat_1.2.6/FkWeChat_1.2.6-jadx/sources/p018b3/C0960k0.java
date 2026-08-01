package p018b3;

import p024b9.AbstractC1043k;
import p299ub.AbstractC8611a0;
import p319w2.C9058e;

/* JADX INFO: renamed from: b3.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0960k0 implements InterfaceC0948e1 {

    /* JADX INFO: renamed from: b */
    public final char f2948b;

    public /* synthetic */ C0960k0(char c10, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? (char) 8226 : c10);
    }

    @Override // p018b3.InterfaceC0948e1
    /* JADX INFO: renamed from: a */
    public C0942c1 mo3471a(C9058e c9058e) {
        return new C0942c1(new C9058e(AbstractC8611a0.m33065J(String.valueOf(this.f2948b), c9058e.m35156k().length()), null, 2, null), InterfaceC0956i0.f2937a.m3483a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0960k0) && this.f2948b == ((C0960k0) obj).f2948b;
    }

    public int hashCode() {
        return Character.hashCode(this.f2948b);
    }

    public C0960k0(char c10) {
        this.f2948b = c10;
    }
}
