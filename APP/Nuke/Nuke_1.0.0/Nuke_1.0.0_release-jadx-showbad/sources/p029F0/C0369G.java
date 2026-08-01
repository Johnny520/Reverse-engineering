package p029F0;

import java.util.List;
import p041H0.AbstractC0559F;
import p112W2.InterfaceC1603e;
import p153e1.C2005a;

/* JADX INFO: renamed from: F0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0369G extends AbstractC0559F {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0373K f1163b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1603e f1164c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0369G(C0373K c0373k, InterfaceC1603e interfaceC1603e, String str) {
        super(str);
        this.f1163b = c0373k;
        this.f1164c = interfaceC1603e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    public final InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5) {
        C0373K c0373k = this.f1163b;
        C0367E c0367e = c0373k.f1178k;
        c0367e.f1154d = interfaceC0379Q.getLayoutDirection();
        c0367e.f1155e = interfaceC0379Q.mo272b();
        c0367e.f1156f = interfaceC0379Q.mo282p();
        boolean zMo606z = interfaceC0379Q.mo606z();
        InterfaceC1603e interfaceC1603e = this.f1164c;
        if (zMo606z || c0373k.f1171d.f1719l == null) {
            c0373k.f1174g = 0;
            InterfaceC0378P interfaceC0378P = (InterfaceC0378P) interfaceC1603e.mo0g(c0367e, new C2005a(j5));
            return new C0368F(interfaceC0378P, c0373k, c0373k.f1174g, interfaceC0378P, 1);
        }
        c0373k.f1175h = 0;
        InterfaceC0378P interfaceC0378P2 = (InterfaceC0378P) interfaceC1603e.mo0g(c0373k.f1179l, new C2005a(j5));
        return new C0368F(interfaceC0378P2, c0373k, c0373k.f1175h, interfaceC0378P2, 0);
    }
}
