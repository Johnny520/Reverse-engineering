package p034c7;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1052o0;
import p035c8.C1399a;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2560n;
import p282t7.C8174a;

/* JADX INFO: renamed from: c7.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1371j implements InterfaceC1369i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f4063a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f4064b;

    /* JADX INFO: renamed from: c */
    public final C8174a f4065c;

    public C1371j(String str, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        InterfaceC2560n interfaceC2560nM3817l;
        str.getClass();
        interfaceC0184l.getClass();
        interfaceC0184l2.getClass();
        this.f4063a = interfaceC0184l;
        this.f4064b = interfaceC0184l2;
        InterfaceC2549c interfaceC2549cM3807b = AbstractC1052o0.m3807b(C1378m0.class);
        try {
            interfaceC2560nM3817l = AbstractC1052o0.m3817l(C1378m0.class);
        } catch (Throwable unused) {
            interfaceC2560nM3817l = null;
        }
        this.f4065c = new C8174a(str, new C1399a(interfaceC2549cM3807b, interfaceC2560nM3817l));
    }

    @Override // p034c7.InterfaceC1372j0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1378m0 mo5406a(C1353a c1353a, InterfaceC0184l interfaceC0184l) {
        c1353a.getClass();
        interfaceC0184l.getClass();
        return AbstractC1395w.m5469h(this, c1353a, c1353a, this.f4064b, this.f4063a, interfaceC0184l);
    }

    @Override // p034c7.InterfaceC1372j0
    public C8174a getKey() {
        return this.f4065c;
    }
}
