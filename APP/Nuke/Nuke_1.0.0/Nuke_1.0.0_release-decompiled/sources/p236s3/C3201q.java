package p236s3;

import p117X2.AbstractC1665j;
import p214o3.InterfaceC2798a;
import p225q3.C2931b;
import p225q3.InterfaceC2933d;
import p231r3.InterfaceC3152b;
import p231r3.InterfaceC3153c;

/* JADX INFO: renamed from: s3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C3201q implements InterfaceC2798a {

    /* JADX INFO: renamed from: a */
    public static final C3201q f9974a = new C3201q();

    /* JADX INFO: renamed from: b */
    public static final C3198n f9975b = new C3198n("kotlin.String", C2931b.f9253k);

    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: b */
    public final Object mo1483b(InterfaceC3152b interfaceC3152b) {
        AbstractC1665j.m2985e(interfaceC3152b, "decoder");
        return interfaceC3152b.mo5428g();
    }

    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: c */
    public final void mo1484c(InterfaceC3153c interfaceC3153c, Object obj) {
        String str = (String) obj;
        AbstractC1665j.m2985e(str, "value");
        interfaceC3153c.mo5186j(str);
    }

    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: e */
    public final InterfaceC2933d mo1486e() {
        return f9975b;
    }
}
