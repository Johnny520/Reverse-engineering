package ad;

import p375zc.AbstractC9939c;

/* JADX INFO: renamed from: ad.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0282q extends C0276n {

    /* JADX INFO: renamed from: c */
    public final AbstractC9939c f687c;

    /* JADX INFO: renamed from: d */
    public int f688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0282q(InterfaceC0292v interfaceC0292v, AbstractC9939c abstractC9939c) {
        super(interfaceC0292v);
        interfaceC0292v.getClass();
        abstractC9939c.getClass();
        this.f687c = abstractC9939c;
    }

    @Override // ad.C0276n
    /* JADX INFO: renamed from: b */
    public void mo813b() {
        m826o(true);
        this.f688d++;
    }

    @Override // ad.C0276n
    /* JADX INFO: renamed from: c */
    public void mo814c() {
        m826o(false);
        m822k("\n");
        int i10 = this.f688d;
        for (int i11 = 0; i11 < i10; i11++) {
            m822k(this.f687c.m38514f().m38561n());
        }
    }

    @Override // ad.C0276n
    /* JADX INFO: renamed from: d */
    public void mo815d() {
        if (m812a()) {
            m826o(false);
        } else {
            mo814c();
        }
    }

    @Override // ad.C0276n
    /* JADX INFO: renamed from: p */
    public void mo827p() {
        m817f(' ');
    }

    @Override // ad.C0276n
    /* JADX INFO: renamed from: q */
    public void mo828q() {
        this.f688d--;
    }
}
