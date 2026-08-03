package p027c0;

import ac.C0058k;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import ci.C0579e;
import ci.C0581f;
import ci.C0594l0;
import p000a.AbstractC0000a;
import p001a0.C0002b;
import p056e0.C0803c;
import p056e0.C0804d;
import p085fg.InterfaceC1220a;
import p100h0.C1505b1;
import p100h0.C1511d1;
import p100h0.C1520g1;
import p100h0.C1545q0;
import p144k.C2177i;
import p174m.AbstractC2677y2;
import p249qg.AbstractC3603v;
import p267s1.C3906l0;
import p267s1.InterfaceC3918x;
import p276sf.C3967n;
import p307v0.C4361a;
import p321w.C4639u0;
import p321w.C4642w;
import p321w.InterfaceC4647y0;
import p332wb.C4868f3;
import p332wb.C4934h3;
import p332wb.C5014jj;
import p332wb.C5539zi;
import p339x1.AbstractC5618k;
import p348xb.C5763i;
import p348xb.C5764j;
import p348xb.C5766l;
import p348xb.C5769o;
import p352xf.EnumC5799a;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: c0.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0362g implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1013a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1014b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0362g(Object obj, int i9) {
        this.f1013a = i9;
        this.f1014b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC3918x interfaceC3918x, InterfaceC5557c interfaceC5557c) {
        switch (this.f1013a) {
            case 0:
                Object objM78n = AbstractC0000a.m78n(interfaceC3918x, new C0002b(new C0361f(1, (C0365j) this.f1014b, C0365j.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 0), null, 0), interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM78n != enumC5799a) {
                    objM78n = c3967n;
                }
                return objM78n == enumC5799a ? objM78n : c3967n;
            case 1:
                C0594l0 c0594l0 = (C0594l0) this.f1014b;
                Object objM7551e = AbstractC3603v.m7551e(new C0579e(interfaceC3918x, c0594l0, new C0581f(c0594l0, null), null, 0), interfaceC5557c);
                C3967n c3967n2 = C3967n.f12976a;
                EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                if (objM7551e != enumC5799a2) {
                    objM7551e = c3967n2;
                }
                return objM7551e == enumC5799a2 ? objM7551e : c3967n2;
            case 2:
                Object objM78n2 = AbstractC0000a.m78n(interfaceC3918x, new C0803c((C0804d) this.f1014b, null), interfaceC5557c);
                return objM78n2 == EnumC5799a.f23547g ? objM78n2 : C3967n.f12976a;
            case 3:
                Object objM8105k1 = ((C3906l0) interfaceC3918x).m8105k1(new C0002b((C4642w) this.f1014b, null, 1), interfaceC5557c);
                return objM8105k1 == EnumC5799a.f23547g ? objM8105k1 : C3967n.f12976a;
            case 4:
                Object objM7551e2 = AbstractC3603v.m7551e(new C4639u0(interfaceC3918x, (InterfaceC4647y0) this.f1014b, null, 0), interfaceC5557c);
                C3967n c3967n3 = C3967n.f12976a;
                EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                if (objM7551e2 != enumC5799a3) {
                    objM7551e2 = c3967n3;
                }
                return objM7551e2 == enumC5799a3 ? objM7551e2 : c3967n3;
            case 5:
                Object objM78n3 = AbstractC0000a.m78n(interfaceC3918x, new C0002b((C2177i) this.f1014b, null, 2), interfaceC5557c);
                return objM78n3 == EnumC5799a.f23547g ? objM78n3 : C3967n.f12976a;
            case 6:
                C1511d1 c1511d1 = (C1511d1) this.f1014b;
                C1545q0 c1545q0 = c1511d1.f5054z;
                C1505b1 c1505b1 = c1511d1.f5053y;
                C3906l0 c3906l0 = (C3906l0) interfaceC3918x;
                c3906l0.getClass();
                Object objM78n4 = AbstractC0000a.m78n(interfaceC3918x, new C0803c(new C0058k(AbstractC5618k.m10167w(c3906l0).f22773G), c1545q0, c1505b1, null), interfaceC5557c);
                if (objM78n4 != EnumC5799a.f23547g) {
                    objM78n4 = C3967n.f12976a;
                }
                return objM78n4 == EnumC5799a.f23547g ? objM78n4 : C3967n.f12976a;
            case 7:
                return AbstractC2677y2.m6119d(interfaceC3918x, null, new C1520g1((InterfaceC1220a) this.f1014b, 3), interfaceC5557c, 7);
            case 8:
                C5763i c5763i = (C5763i) this.f1014b;
                return AbstractC0000a.m78n(interfaceC3918x, new C5764j(new C4868f3(c5763i, 3), new C5539zi(c5763i, 10, interfaceC3918x), new C4934h3(c5763i, 2), new C4868f3(c5763i, 4), null), interfaceC5557c);
            default:
                C5769o c5769o = (C5769o) this.f1014b;
                return AbstractC0000a.m78n(interfaceC3918x, new C5764j(new C5766l(c5769o, 1), new C5014jj(c5769o, 3), new C4361a(c5769o, 9), new C5766l(c5769o, 2), null), interfaceC5557c);
        }
    }
}
