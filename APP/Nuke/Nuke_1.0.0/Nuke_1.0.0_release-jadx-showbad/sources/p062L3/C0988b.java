package p062L3;

import p117X2.AbstractC1665j;
import p214o3.C2801d;
import p214o3.InterfaceC2798a;
import p225q3.InterfaceC2933d;
import p227r.C2981c0;
import p231r3.InterfaceC3151a;
import p231r3.InterfaceC3152b;
import p231r3.InterfaceC3153c;
import p236s3.C3192h;
import p236s3.C3196l;
import p236s3.InterfaceC3190f;
import p248u3.C3343g;

/* JADX INFO: renamed from: L3.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0988b implements InterfaceC3190f {

    /* JADX INFO: renamed from: a */
    public static final C0988b f3059a;
    private static final InterfaceC2933d descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0988b c0988b = new C0988b();
        f3059a = c0988b;
        C3196l c3196l = new C3196l("nuke.module.weixin.item.amusement.ChatAvatarRotator.ChatAvatarRotatorConf", c0988b, 1);
        c3196l.m5464l("duration", true);
        descriptor = c3196l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p236s3.InterfaceC3190f
    /* JADX INFO: renamed from: a */
    public final InterfaceC2798a[] mo1482a() {
        return new InterfaceC2798a[]{C3192h.f9948a};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: b */
    public final Object mo1483b(InterfaceC3152b interfaceC3152b) {
        AbstractC1665j.m2985e(interfaceC3152b, "decoder");
        InterfaceC2933d interfaceC2933d = descriptor;
        C3343g c3343gMo5422a = interfaceC3152b.mo5422a(interfaceC2933d);
        long jM5592k = 0;
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
                jM5592k = c3343gMo5422a.m5592k(interfaceC2933d, 0);
                i5 = 1;
            }
        }
        c3343gMo5422a.m5596o(interfaceC2933d);
        return new C0990d(jM5592k, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: c */
    public final void mo1484c(InterfaceC3153c interfaceC3153c, Object obj) {
        C0990d c0990d = (C0990d) obj;
        AbstractC1665j.m2985e(c0990d, "value");
        long j5 = c0990d.f3060a;
        InterfaceC2933d interfaceC2933d = descriptor;
        InterfaceC3151a interfaceC3151aMo5177a = interfaceC3153c.mo5177a(interfaceC2933d);
        if (interfaceC3151aMo5177a.mo5180d(interfaceC2933d) || j5 != 1000) {
            ((C2981c0) interfaceC3151aMo5177a).m5191q(interfaceC2933d, 0, j5);
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
