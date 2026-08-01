package p038ce;

import be.AbstractC1113a;

/* JADX INFO: renamed from: ce.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1521c implements InterfaceC1519a {

    /* JADX INFO: renamed from: a */
    public final AbstractC1113a f4488a;

    /* JADX INFO: renamed from: b */
    public final int f4489b;

    /* JADX INFO: renamed from: c */
    public final int f4490c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1519a f4491d;

    public AbstractC1521c(AbstractC1113a abstractC1113a, int i10, int i11) {
        abstractC1113a.getClass();
        this.f4488a = abstractC1113a;
        this.f4489b = i10;
        this.f4490c = i11;
    }

    /* JADX INFO: renamed from: a */
    public final void m5945a(InterfaceC1519a interfaceC1519a) {
        this.f4491d = interfaceC1519a;
    }

    @Override // p038ce.InterfaceC1519a
    /* JADX INFO: renamed from: g */
    public int mo5939g() {
        return this.f4490c;
    }

    @Override // p038ce.InterfaceC1519a
    public final InterfaceC1519a getParent() {
        return this.f4491d;
    }

    @Override // p038ce.InterfaceC1519a
    public AbstractC1113a getType() {
        return this.f4488a;
    }

    @Override // p038ce.InterfaceC1519a
    /* JADX INFO: renamed from: h */
    public int mo5940h() {
        return this.f4489b;
    }
}
