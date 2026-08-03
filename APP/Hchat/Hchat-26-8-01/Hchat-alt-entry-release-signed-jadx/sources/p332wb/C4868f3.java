package p332wb;

import ci.C0589j;
import ci.C0609u;
import p000a.AbstractC0000a;
import p071f1.InterfaceC0998d0;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p172lg.C2561a;
import p174m.C2571a;
import p249qg.AbstractC3603v;
import p267s1.C3914t;
import p276sf.C3967n;
import p279t1.C4081a;
import p279t1.C4082b;
import p279t1.C4084d;
import p293u2.C4247q;
import p348xb.C5755a;
import p348xb.C5763i;
import tf.AbstractC4165l;
import th.C4215g;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.f3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4868f3 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17047g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5763i f17048h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4868f3(C5763i c5763i, int i9) {
        this.f17047g = i9;
        this.f17048h = c5763i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f17047g) {
            case 0:
                InterfaceC0998d0 interfaceC0998d0 = (InterfaceC0998d0) obj;
                interfaceC0998d0.getClass();
                C5763i c5763i = this.f17048h;
                interfaceC0998d0.mo2547q(((Number) c5763i.f23463n.m4360d()).floatValue());
                interfaceC0998d0.mo2541i(((Number) c5763i.f23464o.m4360d()).floatValue());
                float fFloatValue = ((Number) c5763i.f23461l.m4360d()).floatValue() / 10.0f;
                float fMo2536b = interfaceC0998d0.mo2536b();
                float f3 = 0.75f * fFloatValue;
                if (f3 < -0.2f) {
                    f3 = -0.2f;
                }
                if (f3 > 0.2f) {
                    f3 = 0.2f;
                }
                interfaceC0998d0.mo2547q(fMo2536b / (1.0f - f3));
                float fMo2552v = interfaceC0998d0.mo2552v();
                float f10 = fFloatValue * 0.25f;
                float f11 = f10 >= -0.2f ? f10 : -0.2f;
                interfaceC0998d0.mo2541i((1.0f - (f11 <= 0.2f ? f11 : 0.2f)) * fMo2552v);
                break;
            case 1:
                InterfaceC0998d0 interfaceC0998d02 = (InterfaceC0998d0) obj;
                interfaceC0998d02.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0998d02.mo2535a() >> 32));
                if (fIntBitsToFloat < 1.0f) {
                    fIntBitsToFloat = 1.0f;
                }
                float fM3176C = AbstractC1184v0.m3176C(1.0f, ((interfaceC0998d02.mo1333d() * 16) / fIntBitsToFloat) + 1.0f, this.f17048h.m10455a());
                interfaceC0998d02.mo2547q(fM3176C);
                interfaceC0998d02.mo2541i(fM3176C);
                break;
            case 2:
                C4215g c4215g = (C4215g) obj;
                c4215g.getClass();
                float fM10455a = this.f17048h.m10455a();
                float f12 = c4215g.f13839g;
                AbstractC0000a.m97w0(c4215g, 10 * f12 * fM10455a, f12 * 14 * fM10455a, true, 0.5f);
                break;
            case 3:
                ((C3914t) obj).getClass();
                C5763i c5763i2 = this.f17048h;
                C4082b c4082b = (C4082b) c5763i2.f23466q.f8339h;
                C4084d c4084d = c4082b.f13523a;
                C4081a[] c4081aArr = c4084d.f13532d;
                AbstractC4165l.m8387v0(0, c4081aArr.length, null, c4081aArr);
                c4084d.f13533e = 0;
                C4084d c4084d2 = c4082b.f13524b;
                C4081a[] c4081aArr2 = c4084d2.f13532d;
                AbstractC4165l.m8387v0(0, c4081aArr2.length, null, c4081aArr2);
                c4084d2.f13533e = 0;
                c4082b.f13525c = 0L;
                AbstractC3603v.m7563q(c5763i2.f23450a, null, new C0609u(c5763i2, null, 7), 3);
                break;
            case 4:
                ((C3914t) obj).getClass();
                C5763i c5763i3 = this.f17048h;
                c5763i3.f23453d.invoke(c5763i3);
                AbstractC3603v.m7563q(c5763i3.f23450a, null, new C0589j(c5763i3, (InterfaceC5557c) null, 24), 3);
                break;
            default:
                C5763i c5763i4 = this.f17048h;
                C2571a c2571a = c5763i4.f23466q;
                ((C4082b) c2571a.f8339h).m8264a(System.currentTimeMillis(), (((long) Float.floatToRawIntBits(c5763i4.m10457c())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
                float fM8544b = C4247q.m8544b(c2571a.m6030j(AbstractC0000a.m59d(Float.MAX_VALUE, Float.MAX_VALUE)));
                C2561a c2561a = c5763i4.f23451b;
                AbstractC3603v.m7563q(c5763i4.f23450a, null, new C5755a(c5763i4, fM8544b / (Float.valueOf(c2561a.f8311b).floatValue() - Float.valueOf(c2561a.f8310a).floatValue()), null, 2), 3);
                break;
        }
        return C3967n.f12976a;
    }
}
