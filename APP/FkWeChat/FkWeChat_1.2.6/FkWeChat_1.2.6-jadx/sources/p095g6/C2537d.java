package p095g6;

import androidx.compose.runtime.InterfaceC0512i2;
import p010a9.InterfaceC0173a;
import p172l8.C4700i0;

/* JADX INFO: renamed from: g6.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2537d implements InterfaceC0173a {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0512i2 f6800q;

    public C2537d(InterfaceC0512i2 interfaceC0512i2) {
        this.f6800q = interfaceC0512i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m9049a() {
        AbstractC2538e.m9051b(this.f6800q, AbstractC2538e.m9050a(this.f6800q) + 1);
    }

    @Override // p010a9.InterfaceC0173a
    public /* bridge */ /* synthetic */ Object invoke() {
        m9049a();
        return C4700i0.f13910a;
    }
}
