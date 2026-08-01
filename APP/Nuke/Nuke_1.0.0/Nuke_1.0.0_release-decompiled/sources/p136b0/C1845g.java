package p136b0;

import java.util.Set;
import p095T.C1308D0;
import p095T.InterfaceC1306C0;
import p105V.C1483e;

/* JADX INFO: renamed from: b0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1845g implements InterfaceC1306C0 {

    /* JADX INFO: renamed from: d */
    public final Set f6247d;

    /* JADX INFO: renamed from: e */
    public final C1483e f6248e = new C1483e(new C1308D0[16]);

    public C1845g(Set set) {
        this.f6247d = set;
    }

    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: a */
    public final void mo2401a() {
        C1483e c1483e = this.f6248e;
        Object[] objArr = c1483e.f5181d;
        int i5 = c1483e.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            InterfaceC1306C0 interfaceC1306C0 = ((C1308D0) objArr[i6]).f4672a;
            this.f6247d.remove(interfaceC1306C0);
            interfaceC1306C0.mo2401a();
        }
    }

    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: d */
    public final void mo2402d() {
    }

    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: e */
    public final void mo2403e() {
    }
}
