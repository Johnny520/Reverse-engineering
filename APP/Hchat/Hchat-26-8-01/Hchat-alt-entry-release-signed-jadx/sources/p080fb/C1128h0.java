package p080fb;

import java.util.Locale;
import java.util.Set;
import ng.AbstractC3015m;
import ng.C3011i;
import p015b0.C0136d0;
import p054dg.C0795n;
import p072f2.InterfaceC1062y;
import p085fg.InterfaceC1231l;
import p100h0.AbstractC1522h0;
import p100h0.C1519g0;
import p100h0.EnumC1516f0;
import p100h0.InterfaceC1533l;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import p285t7.C4135b;
import p321w.EnumC4599g0;

/* JADX INFO: renamed from: fb.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1128h0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3691g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f3692h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f3693i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f3694j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1128h0(InterfaceC1533l interfaceC1533l, boolean z9, boolean z10) {
        this.f3691g = 2;
        this.f3694j = interfaceC1533l;
        this.f3692h = z9;
        this.f3693i = z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9 = this.f3691g;
        int i10 = 1;
        boolean z9 = this.f3693i;
        boolean z10 = this.f3692h;
        Object obj2 = this.f3694j;
        switch (i9) {
            case 0:
                C4135b c4135b = (C4135b) obj;
                c4135b.getClass();
                Set set = C1152n0.f3803a;
                return AbstractC3015m.m6413W(new C3011i(new C0795n(C1152n0.m2931R(c4135b), 6), true, new C1128h0(z10, z9, (String) obj2, i10)), new C0136d0(c4135b, 14));
            case 1:
                String str = (String) obj2;
                C1144l0 c1144l0 = (C1144l0) obj;
                c1144l0.getClass();
                String lowerCase = c1144l0.f3773a;
                if (z10) {
                    lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                return Boolean.valueOf(z9 ? AbstractC3149m.m6709h0(lowerCase, str, false) : lowerCase.equals(str));
            default:
                InterfaceC1062y interfaceC1062y = (InterfaceC1062y) obj;
                long jMo4036a = ((InterfaceC1533l) obj2).mo4036a();
                interfaceC1062y.mo2644a(AbstractC1522h0.f5086c, new C1519g0(z10 ? EnumC4599g0.f15157h : EnumC4599g0.f15158i, jMo4036a, z9 ? EnumC1516f0.f5066g : EnumC1516f0.f5068i, (9223372034707292159L & jMo4036a) != 9205357640488583168L));
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C1128h0(boolean z9, boolean z10, String str, int i9) {
        this.f3691g = i9;
        this.f3692h = z9;
        this.f3693i = z10;
        this.f3694j = str;
    }
}
