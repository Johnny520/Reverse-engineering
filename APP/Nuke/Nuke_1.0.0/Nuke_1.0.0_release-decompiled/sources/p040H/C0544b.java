package p040H;

import p018D.InterfaceC0258g;
import p056K2.C0891q;
import p172h3.AbstractC2250j;
import p172h3.C2243c;

/* JADX INFO: renamed from: H.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0544b implements InterfaceC0258g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0546d f1656a;

    /* JADX INFO: renamed from: b */
    public final C2243c f1657b = AbstractC2250j.m4101a(0, 7, null);

    public C0544b(InterfaceC0546d interfaceC0546d) {
        this.f1656a = interfaceC0546d;
    }

    @Override // p018D.InterfaceC0258g
    public final void close() {
        this.f1657b.mo4090o(C0891q.f2780a);
    }
}
