package p000a;

import p000a.InterfaceC0512c4;
import p000a.InterfaceC0911x4;

/* JADX INFO: renamed from: a.b4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0493b4 extends AbstractC0399W1 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0911x4 f1836b;

    /* JADX INFO: renamed from: c */
    public transient InterfaceC0474a4<Object> f1837c;

    public AbstractC0493b4(InterfaceC0474a4<Object> interfaceC0474a4, InterfaceC0911x4 interfaceC0911x4) {
        super(interfaceC0474a4);
        this.f1836b = interfaceC0911x4;
    }

    @Override // p000a.InterfaceC0474a4
    /* JADX INFO: renamed from: c */
    public final InterfaceC0911x4 mo846c() {
        InterfaceC0911x4 interfaceC0911x4 = this.f1836b;
        C0631i9.m1479b(interfaceC0911x4);
        return interfaceC0911x4;
    }

    @Override // p000a.AbstractC0399W1
    /* JADX INFO: renamed from: i */
    public final void mo1040i() {
        InterfaceC0474a4<?> interfaceC0474a4 = this.f1837c;
        if (interfaceC0474a4 != null && interfaceC0474a4 != this) {
            InterfaceC0911x4 interfaceC0911x4 = this.f1836b;
            C0631i9.m1479b(interfaceC0911x4);
            InterfaceC0911x4.a aVarMo1050b = interfaceC0911x4.mo1050b(InterfaceC0512c4.a.f1862a);
            C0631i9.m1479b(aVarMo1050b);
            ((InterfaceC0512c4) aVarMo1050b).m1258a(interfaceC0474a4);
        }
        this.f1837c = C0929y3.f3539a;
    }
}
