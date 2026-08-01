package p099T3;

import com.bumptech.glide.AbstractC1922d;
import p117X2.AbstractC1665j;
import p214o3.C2801d;
import p214o3.InterfaceC2798a;
import p225q3.InterfaceC2933d;
import p231r3.InterfaceC3151a;
import p231r3.InterfaceC3152b;
import p231r3.InterfaceC3153c;
import p236s3.C3196l;
import p236s3.C3201q;
import p236s3.InterfaceC3190f;
import p248u3.C3343g;

/* JADX INFO: renamed from: T3.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1424c implements InterfaceC3190f {

    /* JADX INFO: renamed from: a */
    public static final C1424c f5080a;
    private static final InterfaceC2933d descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1424c c1424c = new C1424c();
        f5080a = c1424c;
        C3196l c3196l = new C3196l("nuke.ui.model.UIConfig.ThemeConfig", c1424c, 1);
        c3196l.m5464l("accentColorHex", true);
        descriptor = c3196l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p236s3.InterfaceC3190f
    /* JADX INFO: renamed from: a */
    public final InterfaceC2798a[] mo1482a() {
        return new InterfaceC2798a[]{AbstractC1922d.m3431l(C3201q.f9974a)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: b */
    public final Object mo1483b(InterfaceC3152b interfaceC3152b) {
        AbstractC1665j.m2985e(interfaceC3152b, "decoder");
        InterfaceC2933d interfaceC2933d = descriptor;
        C3343g c3343gMo5422a = interfaceC3152b.mo5422a(interfaceC2933d);
        String str = null;
        boolean z5 = true;
        int i5 = 0;
        while (z5) {
            int iM5590i = c3343gMo5422a.m5590i(interfaceC2933d);
            if (iM5590i == -1) {
                z5 = false;
            } else {
                if (iM5590i != 0) {
                    throw new C2801d(iM5590i);
                }
                C3201q c3201q = C3201q.f9974a;
                str = (String) c3343gMo5422a.m5593l(interfaceC2933d, 0, str);
                i5 = 1;
            }
        }
        c3343gMo5422a.m5596o(interfaceC2933d);
        return new C1426e(str, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: c */
    public final void mo1484c(InterfaceC3153c interfaceC3153c, Object obj) {
        C1426e c1426e = (C1426e) obj;
        AbstractC1665j.m2985e(c1426e, "value");
        String str = c1426e.f5081a;
        InterfaceC2933d interfaceC2933d = descriptor;
        InterfaceC3151a interfaceC3151aMo5177a = interfaceC3153c.mo5177a(interfaceC2933d);
        if (interfaceC3151aMo5177a.mo5180d(interfaceC2933d) || str != null) {
            C3201q c3201q = C3201q.f9974a;
            interfaceC3151aMo5177a.mo5181e(interfaceC2933d, 0, str);
        }
        interfaceC3151aMo5177a.mo5185i(interfaceC2933d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: e */
    public final InterfaceC2933d mo1486e() {
        return descriptor;
    }
}
