package p274t;

import p121i3.C3173c;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3563r;
import p135j2.InterfaceC3566s;

/* JADX INFO: renamed from: t.q1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7886q1 extends AbstractC7911v1 {

    /* JADX INFO: renamed from: F */
    public EnumC7901t1 f26284F;

    /* JADX INFO: renamed from: G */
    public boolean f26285G;

    public C7886q1(EnumC7901t1 enumC7901t1, boolean z10) {
        this.f26284F = enumC7901t1;
        this.f26285G = z10;
    }

    @Override // p274t.AbstractC7911v1, p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: G */
    public int mo15345G(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return this.f26284F == EnumC7901t1.f26339q ? interfaceC3563r.mo13151z0(i10) : interfaceC3563r.mo13150t(i10);
    }

    @Override // p274t.AbstractC7911v1
    /* JADX INFO: renamed from: H2 */
    public long mo30474H2(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        int iMo13151z0 = this.f26284F == EnumC7901t1.f26339q ? interfaceC3552n0.mo13151z0(C3173c.m11973l(j10)) : interfaceC3552n0.mo13150t(C3173c.m11973l(j10));
        if (iMo13151z0 < 0) {
            iMo13151z0 = 0;
        }
        return C3173c.f8451b.m11982d(iMo13151z0);
    }

    @Override // p274t.AbstractC7911v1
    /* JADX INFO: renamed from: I2 */
    public boolean mo30475I2() {
        return this.f26285G;
    }

    /* JADX INFO: renamed from: J2 */
    public void m30476J2(boolean z10) {
        this.f26285G = z10;
    }

    /* JADX INFO: renamed from: K2 */
    public final void m30477K2(EnumC7901t1 enumC7901t1) {
        this.f26284F = enumC7901t1;
    }

    @Override // p274t.AbstractC7911v1, p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: g */
    public int mo15346g(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return this.f26284F == EnumC7901t1.f26339q ? interfaceC3563r.mo13151z0(i10) : interfaceC3563r.mo13150t(i10);
    }
}
