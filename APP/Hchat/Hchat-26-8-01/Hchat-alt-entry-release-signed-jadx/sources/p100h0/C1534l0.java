package p100h0;

import gg.AbstractC1416l;
import gg.C1425u;
import p057e1.C0807b;
import p069f.C0933f0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p116i.C1739c;
import p136j8.C2104o;
import p187n.C2852f;
import p187n.C2853g;
import p187n.C2854h;
import p187n.C2855i;
import p187n.C2858l;
import p187n.C2859m;
import p187n.C2860n;
import p187n.InterfaceC2856j;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p321w.C4632r0;
import p352xf.EnumC5799a;
import tg.C4182b;
import tg.C4184c;
import tg.C4192j;
import tg.InterfaceC4187e;
import ug.AbstractC4338c;
import ug.C4336a;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: h0.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1534l0 implements InterfaceC4187e {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5113g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f5114h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5115i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1534l0(C4184c c4184c, C1425u c1425u, InterfaceC4187e interfaceC4187e) {
        this.f5113g = 1;
        this.f5114h = c1425u;
        this.f5115i = interfaceC4187e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    @Override // tg.InterfaceC4187e
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1602e(Object obj, InterfaceC5557c interfaceC5557c) {
        C4182b c4182b;
        C4192j c4192j;
        C1534l0 c1534l0;
        switch (this.f5113g) {
            case 0:
                long j3 = ((C0807b) obj).f2414a;
                C1739c c1739c = (C1739c) this.f5114h;
                long j4 = ((C0807b) c1739c.m4360d()).f2414a & 9223372034707292159L;
                C3967n c3967n = C3967n.f12976a;
                if (j4 == 9205357640488583168L || (j3 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((C0807b) c1739c.m4360d()).f2414a & 4294967295L)) == Float.intBitsToFloat((int) (j3 & 4294967295L))) {
                    Object objM4361e = c1739c.m4361e(new C0807b(j3), interfaceC5557c);
                    return objM4361e == EnumC5799a.f23547g ? objM4361e : c3967n;
                }
                AbstractC3603v.m7563q((InterfaceC3599t) this.f5115i, null, new C1531k0(c1739c, j3, (InterfaceC5557c) null, 0), 3);
                return c3967n;
            case 1:
                C1425u c1425u = (C1425u) this.f5114h;
                if (interfaceC5557c instanceof C4182b) {
                    c4182b = (C4182b) interfaceC5557c;
                    int i9 = c4182b.f13732i;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c4182b.f13732i = i9 - Integer.MIN_VALUE;
                    } else {
                        c4182b = new C4182b(this, interfaceC5557c);
                    }
                }
                Object obj2 = c4182b.f13730g;
                int i10 = c4182b.f13732i;
                C3967n c3967n2 = C3967n.f12976a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1089i.m2732I0(obj2);
                        return c3967n2;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj2);
                Object obj3 = c1425u.f4738g;
                if (obj3 != AbstractC4338c.f14500b && AbstractC1416l.m3825a(obj3, obj)) {
                    return c3967n2;
                }
                c1425u.f4738g = obj;
                InterfaceC4187e interfaceC4187e = (InterfaceC4187e) this.f5115i;
                c4182b.f13732i = 1;
                Object objMo1602e = interfaceC4187e.mo1602e(obj, c4182b);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                return objMo1602e == enumC5799a ? enumC5799a : c3967n2;
            case 2:
                if (interfaceC5557c instanceof C4192j) {
                    c4192j = (C4192j) interfaceC5557c;
                    int i11 = c4192j.f13755i;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c4192j.f13755i = i11 - Integer.MIN_VALUE;
                    } else {
                        c4192j = new C4192j(this, interfaceC5557c);
                    }
                }
                Object objInvoke = c4192j.f13754h;
                int i12 = c4192j.f13755i;
                if (i12 == 0) {
                    AbstractC1089i.m2732I0(objInvoke);
                    InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f5114h;
                    c4192j.f13753g = this;
                    c4192j.f13757k = obj;
                    c4192j.f13755i = 1;
                    objInvoke = interfaceC1235p.invoke(obj, c4192j);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objInvoke == enumC5799a2) {
                        return enumC5799a2;
                    }
                    c1534l0 = this;
                } else {
                    if (i12 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = c4192j.f13757k;
                    c1534l0 = c4192j.f13753g;
                    AbstractC1089i.m2732I0(objInvoke);
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    return C3967n.f12976a;
                }
                ((C1425u) c1534l0.f5115i).f4738g = obj;
                throw new C4336a(c1534l0);
            default:
                InterfaceC2856j interfaceC2856j = (InterfaceC2856j) obj;
                C4632r0 c4632r0 = (C4632r0) this.f5115i;
                C0933f0 c0933f0 = (C0933f0) this.f5114h;
                if ((interfaceC2856j instanceof C2854h) || (interfaceC2856j instanceof C2852f) || (interfaceC2856j instanceof C2859m)) {
                    c0933f0.m2286a(interfaceC2856j);
                } else if (interfaceC2856j instanceof C2855i) {
                    c0933f0.m2295j(((C2855i) interfaceC2856j).f9250a);
                } else if (interfaceC2856j instanceof C2853g) {
                    c0933f0.m2295j(((C2853g) interfaceC2856j).f9249a);
                } else if (interfaceC2856j instanceof C2860n) {
                    c0933f0.m2295j(((C2860n) interfaceC2856j).f9253a);
                } else if (interfaceC2856j instanceof C2858l) {
                    c0933f0.m2295j(((C2858l) interfaceC2856j).f9252a);
                }
                Object[] objArr = c0933f0.f2923a;
                int i13 = c0933f0.f2924b;
                int i14 = 0;
                for (int i15 = 0; i15 < i13; i15++) {
                    InterfaceC2856j interfaceC2856j2 = (InterfaceC2856j) objArr[i15];
                    if (interfaceC2856j2 instanceof C2854h) {
                        c4632r0.getClass();
                        i14 |= 2;
                    } else if (interfaceC2856j2 instanceof C2852f) {
                        c4632r0.getClass();
                        i14 |= 1;
                    } else if (interfaceC2856j2 instanceof C2859m) {
                        c4632r0.getClass();
                        i14 |= 4;
                    }
                }
                c4632r0.f15362b.m4493h(i14);
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C1534l0(Object obj, int i9, Object obj2) {
        this.f5113g = i9;
        this.f5114h = obj;
        this.f5115i = obj2;
    }
}
