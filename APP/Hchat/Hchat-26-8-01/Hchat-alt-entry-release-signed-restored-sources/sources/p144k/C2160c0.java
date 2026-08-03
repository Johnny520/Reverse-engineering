package p144k;

import gg.C1423s;
import gg.C1425u;
import p077f8.AbstractC1089i;
import p100h0.C1511d1;
import p116i.C1767l0;
import p136j8.C2104o;
import p187n.C2852f;
import p187n.C2853g;
import p187n.C2854h;
import p187n.C2855i;
import p187n.C2858l;
import p187n.C2859m;
import p187n.C2860n;
import p187n.InterfaceC2856j;
import p190n2.C2875j;
import p190n2.C2885t;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p321w.AbstractC4634s;
import p321w.C4629q0;
import p339x1.AbstractC5618k;
import p352xf.EnumC5799a;
import tg.InterfaceC4187e;
import ug.C4340e;
import ug.C4341f;
import ug.C4342g;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: k.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2160c0 implements InterfaceC4187e {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7158g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f7159h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f7160i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f7161j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f7162k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2160c0(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f7158g = i9;
        this.f7159h = obj;
        this.f7160i = obj2;
        this.f7161j = obj3;
        this.f7162k = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    @Override // tg.InterfaceC4187e
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1602e(Object obj, InterfaceC5557c interfaceC5557c) {
        C4341f c4341f;
        C2160c0 c2160c0;
        switch (this.f7158g) {
            case 0:
                InterfaceC2856j interfaceC2856j = (InterfaceC2856j) obj;
                C1423s c1423s = (C1423s) this.f7161j;
                C1423s c1423s2 = (C1423s) this.f7160i;
                C1423s c1423s3 = (C1423s) this.f7159h;
                boolean z9 = true;
                if (interfaceC2856j instanceof C2859m) {
                    c1423s3.f4736g++;
                } else if ((interfaceC2856j instanceof C2860n) || (interfaceC2856j instanceof C2858l)) {
                    c1423s3.f4736g--;
                } else if (interfaceC2856j instanceof C2854h) {
                    c1423s2.f4736g++;
                } else if (interfaceC2856j instanceof C2855i) {
                    c1423s2.f4736g--;
                } else if (interfaceC2856j instanceof C2852f) {
                    c1423s.f4736g++;
                } else if (interfaceC2856j instanceof C2853g) {
                    c1423s.f4736g--;
                }
                int i9 = c1423s3.f4736g;
                boolean z10 = false;
                boolean z11 = i9 > 0;
                boolean z12 = c1423s2.f4736g > 0;
                boolean z13 = c1423s.f4736g > 0;
                C2163d0 c2163d0 = (C2163d0) this.f7162k;
                if (c2163d0.f7170v != z11) {
                    c2163d0.f7170v = z11;
                    z10 = true;
                }
                if (c2163d0.f7171w != z12) {
                    c2163d0.f7171w = z12;
                    z10 = true;
                }
                if (c2163d0.f7172x != z13) {
                    c2163d0.f7172x = z13;
                } else {
                    z9 = z10;
                }
                if (z9) {
                    AbstractC5618k.m10156l(c2163d0);
                }
                break;
            case 1:
                if (interfaceC5557c instanceof C4341f) {
                    c4341f = (C4341f) interfaceC5557c;
                    int i10 = c4341f.f14510k;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c4341f.f14510k = i10 - Integer.MIN_VALUE;
                    } else {
                        c4341f = new C4341f(this, interfaceC5557c);
                    }
                }
                Object obj2 = c4341f.f14508i;
                int i11 = c4341f.f14510k;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj2);
                    InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) ((C1425u) this.f7159h).f4738g;
                    if (interfaceC3596r0 != null) {
                        interfaceC3596r0.mo7485a(new C1767l0("Child of the scoped flow was cancelled", 1));
                        c4341f.f14506g = this;
                        c4341f.f14507h = obj;
                        c4341f.f14510k = 1;
                        Object objMo7488g = interfaceC3596r0.mo7488g(c4341f);
                        EnumC5799a enumC5799a = EnumC5799a.f23547g;
                        if (objMo7488g == enumC5799a) {
                        }
                    }
                    c2160c0 = this;
                } else if (i11 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    obj = c4341f.f14507h;
                    c2160c0 = c4341f.f14506g;
                    AbstractC1089i.m2732I0(obj2);
                }
                ((C1425u) c2160c0.f7159h).f4738g = AbstractC3603v.m7563q((InterfaceC3599t) c2160c0.f7160i, null, new C4340e((C4342g) c2160c0.f7161j, (InterfaceC4187e) c2160c0.f7162k, obj, null), 1);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C1511d1 c1511d1 = (C1511d1) this.f7161j;
                C4629q0 c4629q0 = (C4629q0) this.f7159h;
                if (zBooleanValue && c4629q0.m9049b()) {
                    AbstractC4634s.m9082y((C2885t) this.f7160i, c4629q0, c1511d1.m4028n(), (C2875j) this.f7162k, c1511d1.f5030b);
                } else {
                    AbstractC4634s.m9072o(c4629q0);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
