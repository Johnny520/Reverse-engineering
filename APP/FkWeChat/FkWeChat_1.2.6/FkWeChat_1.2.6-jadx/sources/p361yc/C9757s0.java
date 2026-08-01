package p361yc;

import java.util.Arrays;
import p024b9.AbstractC1061t;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9757s0 extends C9714j2 {

    /* JADX INFO: renamed from: m */
    public final boolean f33026m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9757s0(String str, InterfaceC9732n0 interfaceC9732n0) {
        super(str, interfaceC9732n0, 1);
        str.getClass();
        interfaceC9732n0.getClass();
        this.f33026m = true;
    }

    @Override // p361yc.C9714j2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9757s0)) {
            return false;
        }
        InterfaceC9218f interfaceC9218f = (InterfaceC9218f) obj;
        if (!AbstractC1061t.m3842c(mo35888a(), interfaceC9218f.mo35888a())) {
            return false;
        }
        C9757s0 c9757s0 = (C9757s0) obj;
        if (!c9757s0.mo35897k() || !Arrays.equals(m37941s(), c9757s0.m37941s()) || mo35891e() != interfaceC9218f.mo35891e()) {
            return false;
        }
        int iMo35891e = mo35891e();
        for (int i10 = 0; i10 < iMo35891e; i10++) {
            if (!AbstractC1061t.m3842c(mo35894h(i10).mo35888a(), interfaceC9218f.mo35894h(i10).mo35888a()) || !AbstractC1061t.m3842c(mo35894h(i10).mo35896j(), interfaceC9218f.mo35894h(i10).mo35896j())) {
                return false;
            }
        }
        return true;
    }

    @Override // p361yc.C9714j2
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p361yc.C9714j2, p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: k */
    public boolean mo35897k() {
        return this.f33026m;
    }
}
