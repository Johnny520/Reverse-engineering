package ad;

import p172l8.C4684a0;
import p172l8.C4688c0;
import p172l8.C4694f0;
import p172l8.C4718y;

/* JADX INFO: renamed from: ad.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0280p extends C0276n {

    /* JADX INFO: renamed from: c */
    public final boolean f685c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0280p(InterfaceC0292v interfaceC0292v, boolean z10) {
        super(interfaceC0292v);
        interfaceC0292v.getClass();
        this.f685c = z10;
    }

    @Override // ad.C0276n
    /* JADX INFO: renamed from: e */
    public void mo816e(byte b10) {
        boolean z10 = this.f685c;
        String strM18821j = C4718y.m18821j(C4718y.m18817c(b10));
        if (z10) {
            mo825n(strM18821j);
        } else {
            m822k(strM18821j);
        }
    }

    @Override // ad.C0276n
    /* JADX INFO: renamed from: i */
    public void mo820i(int i10) {
        boolean z10 = this.f685c;
        String unsignedString = Integer.toUnsignedString(C4684a0.m18703c(i10));
        if (z10) {
            mo825n(unsignedString);
        } else {
            m822k(unsignedString);
        }
    }

    @Override // ad.C0276n
    /* JADX INFO: renamed from: j */
    public void mo821j(long j10) {
        boolean z10 = this.f685c;
        String unsignedString = Long.toUnsignedString(C4688c0.m18729c(j10));
        if (z10) {
            mo825n(unsignedString);
        } else {
            m822k(unsignedString);
        }
    }

    @Override // ad.C0276n
    /* JADX INFO: renamed from: l */
    public void mo823l(short s10) {
        boolean z10 = this.f685c;
        String strM18760i = C4694f0.m18760i(C4694f0.m18757c(s10));
        if (z10) {
            mo825n(strM18760i);
        } else {
            m822k(strM18760i);
        }
    }
}
