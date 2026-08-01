package p179m2;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import p010a9.InterfaceC0173a;
import p073f2.C2262q0;

/* JADX INFO: renamed from: m2.k2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4866k2 implements InterfaceC4887o3 {

    /* JADX INFO: renamed from: a */
    public InterfaceC0173a f14483a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0512i2 f14484b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0512i2 f14485c = AbstractC0522j5.m1773e(Boolean.FALSE, null, 2, null);

    @Override // p179m2.InterfaceC4887o3
    /* JADX INFO: renamed from: a */
    public long mo19422a() {
        C4885o1 c4885o1M19534c;
        if (this.f14484b == null) {
            InterfaceC0173a interfaceC0173a = this.f14483a;
            if (interfaceC0173a == null || (c4885o1M19534c = (C4885o1) interfaceC0173a.invoke()) == null) {
                c4885o1M19534c = C4885o1.f14591c.m19534c();
            }
            this.f14484b = AbstractC0522j5.m1773e(c4885o1M19534c, null, 2, null);
            this.f14483a = null;
        }
        InterfaceC0512i2 interfaceC0512i2 = this.f14484b;
        interfaceC0512i2.getClass();
        return ((C4885o1) interfaceC0512i2.getValue()).m19531b();
    }

    @Override // p179m2.InterfaceC4887o3
    /* JADX INFO: renamed from: b */
    public boolean mo19423b() {
        return ((Boolean) this.f14485c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public void m19424d(int i10) {
        AbstractC4892p3.f14600a.m19538a().setValue(C2262q0.m8222a(i10));
    }

    /* JADX INFO: renamed from: e */
    public final void m19425e(InterfaceC0173a interfaceC0173a) {
        if (this.f14484b == null) {
            this.f14483a = interfaceC0173a;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m19426f(boolean z10) {
        this.f14485c.setValue(Boolean.valueOf(z10));
    }
}
