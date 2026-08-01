package p170h1;

import me.dartcv.nuke.BuildConfig;
import p000A.C0073m;
import p000A.C0098y0;
import p007B0.C0190d;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0601k;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.C1663h;
import p117X2.C1675t;
import p160f3.AbstractC2162v;
import p198m0.EnumC2594y;
import p216p.C2811D;
import p225q3.InterfaceC2933d;
import p232s.C3157d;
import p232s.C3158e;
import p232s.C3162i;
import p248u3.C3340d;
import p260x.C3395A;

/* JADX INFO: renamed from: h1.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2229t extends C1663h implements InterfaceC1603e {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f7284k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2229t(int i5, Object obj, Class cls, String str, String str2, int i6, int i7, int i8) {
        super(i5, obj, cls, str, str2, i6, i7);
        this.f7284k = i8;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        boolean zM4540a;
        boolean zM4540a2;
        switch (this.f7284k) {
            case 0:
                EnumC2594y enumC2594y = (EnumC2594y) obj;
                EnumC2594y enumC2594y2 = (EnumC2594y) obj2;
                C2230u c2230u = (C2230u) this.f5693e;
                if (c2230u.f7199q && (zM4540a = enumC2594y2.m4540a()) != enumC2594y.m4540a()) {
                    C3395A c3395a = null;
                    if (zM4540a) {
                        C1675t c1675t = new C1675t();
                        AbstractC0601k.m1040p(c2230u, new C0190d(8, c1675t, c2230u));
                        C3395A c3395a2 = (C3395A) c1675t.f5710e;
                        if (c3395a2 != null) {
                            c3395a2.m5671a();
                            c3395a = c3395a2;
                        }
                        c2230u.f7286u = c3395a;
                    } else {
                        C3395A c3395a3 = c2230u.f7286u;
                        if (c3395a3 != null) {
                            c3395a3.m5672b();
                        }
                        c2230u.f7286u = null;
                    }
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                EnumC2594y enumC2594y3 = (EnumC2594y) obj;
                EnumC2594y enumC2594y4 = (EnumC2594y) obj2;
                C2811D c2811d = (C2811D) this.f5693e;
                if (c2811d.f7199q && (zM4540a2 = enumC2594y4.m4540a()) != enumC2594y3.m4540a()) {
                    InterfaceC1601c interfaceC1601c = c2811d.f8854u;
                    if (interfaceC1601c != null) {
                        interfaceC1601c.mo1h(Boolean.valueOf(zM4540a2));
                    }
                    InterfaceC1046d interfaceC1046d = null;
                    if (zM4540a2) {
                        AbstractC2162v.m3994p(c2811d.m4023x0(), null, new C0098y0(c2811d, interfaceC1046d, 4), 3);
                        C1675t c1675t2 = new C1675t();
                        AbstractC0601k.m1040p(c2811d, new C0073m(26, c1675t2, c2811d));
                        C3395A c3395a4 = (C3395A) c1675t2.f5710e;
                        if (c3395a4 != null) {
                            c3395a4.m5671a();
                        } else {
                            c3395a4 = null;
                        }
                        c2811d.f8856w = c3395a4;
                        AbstractC0596h0 abstractC0596h0 = c2811d.f8857x;
                        if (abstractC0596h0 != null && abstractC0596h0.mo981R0().f7199q) {
                            c2811d.m5015N0();
                        }
                    } else {
                        C3395A c3395a5 = c2811d.f8856w;
                        if (c3395a5 != null) {
                            c3395a5.m5672b();
                        }
                        c2811d.f8856w = null;
                        c2811d.m5015N0();
                    }
                    AbstractC0601k.m1036l(c2811d);
                    C3162i c3162i = c2811d.f8853t;
                    if (c3162i != null) {
                        if (zM4540a2) {
                            C3157d c3157d = c2811d.f8855v;
                            if (c3157d != null) {
                                c2811d.m5014M0(c3162i, new C3158e(c3157d));
                                c2811d.f8855v = null;
                            }
                            C3157d c3157d2 = new C3157d();
                            c2811d.m5014M0(c3162i, c3157d2);
                            c2811d.f8855v = c3157d2;
                        } else {
                            C3157d c3157d3 = c2811d.f8855v;
                            if (c3157d3 != null) {
                                c2811d.m5014M0(c3162i, new C3158e(c3157d3));
                                c2811d.f8855v = null;
                            }
                        }
                    }
                }
                return C0891q.f2780a;
            default:
                InterfaceC2933d interfaceC2933d = (InterfaceC2933d) obj;
                int iIntValue = ((Number) obj2).intValue();
                AbstractC1665j.m2985e(interfaceC2933d, "p0");
                C3340d c3340d = (C3340d) this.f5693e;
                c3340d.getClass();
                boolean z5 = !interfaceC2933d.mo5139k(iIntValue) && interfaceC2933d.mo5138j(iIntValue).mo5136h();
                c3340d.f10387b = z5;
                return Boolean.valueOf(z5);
        }
    }
}
