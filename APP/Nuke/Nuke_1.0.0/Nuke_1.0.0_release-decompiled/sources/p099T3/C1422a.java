package p099T3;

import p117X2.AbstractC1665j;
import p214o3.C2801d;
import p214o3.InterfaceC2798a;
import p225q3.InterfaceC2933d;
import p227r.C2981c0;
import p231r3.InterfaceC3151a;
import p231r3.InterfaceC3152b;
import p231r3.InterfaceC3153c;
import p236s3.C3191g;
import p236s3.C3196l;
import p236s3.InterfaceC3190f;
import p248u3.C3343g;

/* JADX INFO: renamed from: T3.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1422a implements InterfaceC3190f {

    /* JADX INFO: renamed from: a */
    public static final C1422a f5079a;
    private static final InterfaceC2933d descriptor;

    static {
        C1422a c1422a = new C1422a();
        f5079a = c1422a;
        C3196l c3196l = new C3196l("nuke.ui.model.UIConfig", c1422a, 3);
        c3196l.m5464l("appearanceMode", true);
        c3196l.m5464l("languageMode", true);
        c3196l.m5464l("theme", true);
        descriptor = c3196l;
    }

    @Override // p236s3.InterfaceC3190f
    /* JADX INFO: renamed from: a */
    public final InterfaceC2798a[] mo1482a() {
        C3191g c3191g = C3191g.f9946a;
        return new InterfaceC2798a[]{c3191g, c3191g, C1424c.f5080a};
    }

    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: b */
    public final Object mo1483b(InterfaceC3152b interfaceC3152b) {
        AbstractC1665j.m2985e(interfaceC3152b, "decoder");
        InterfaceC2933d interfaceC2933d = descriptor;
        C3343g c3343gMo5422a = interfaceC3152b.mo5422a(interfaceC2933d);
        C1426e c1426e = null;
        boolean z5 = true;
        int i5 = 0;
        int iM5591j = 0;
        int iM5591j2 = 0;
        while (z5) {
            int iM5590i = c3343gMo5422a.m5590i(interfaceC2933d);
            if (iM5590i == -1) {
                z5 = false;
            } else if (iM5590i == 0) {
                iM5591j = c3343gMo5422a.m5591j(interfaceC2933d, 0);
                i5 |= 1;
            } else if (iM5590i == 1) {
                iM5591j2 = c3343gMo5422a.m5591j(interfaceC2933d, 1);
                i5 |= 2;
            } else {
                if (iM5590i != 2) {
                    throw new C2801d(iM5590i);
                }
                c1426e = (C1426e) c3343gMo5422a.m5594m(interfaceC2933d, 2, C1424c.f5080a, c1426e);
                i5 |= 4;
            }
        }
        c3343gMo5422a.m5596o(interfaceC2933d);
        return new C1427f(i5, iM5591j, iM5591j2, c1426e);
    }

    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: c */
    public final void mo1484c(InterfaceC3153c interfaceC3153c, Object obj) {
        C1427f c1427f = (C1427f) obj;
        AbstractC1665j.m2985e(c1427f, "value");
        C1426e c1426e = c1427f.f5084c;
        int i5 = c1427f.f5083b;
        int i6 = c1427f.f5082a;
        InterfaceC2933d interfaceC2933d = descriptor;
        InterfaceC3151a interfaceC3151aMo5177a = interfaceC3153c.mo5177a(interfaceC2933d);
        if (interfaceC3151aMo5177a.mo5180d(interfaceC2933d) || i6 != 0) {
            ((C2981c0) interfaceC3151aMo5177a).m5190p(0, i6, interfaceC2933d);
        }
        if (interfaceC3151aMo5177a.mo5180d(interfaceC2933d) || i5 != 0) {
            ((C2981c0) interfaceC3151aMo5177a).m5190p(1, i5, interfaceC2933d);
        }
        if (interfaceC3151aMo5177a.mo5180d(interfaceC2933d) || !AbstractC1665j.m2981a(c1426e, new C1426e(null))) {
            ((C2981c0) interfaceC3151aMo5177a).m5192r(interfaceC2933d, 2, C1424c.f5080a, c1426e);
        }
        interfaceC3151aMo5177a.mo5185i(interfaceC2933d);
    }

    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: e */
    public final InterfaceC2933d mo1486e() {
        return descriptor;
    }
}
