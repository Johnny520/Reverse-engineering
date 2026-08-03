package p348xb;

import p077f8.AbstractC1089i;
import p136j8.C2104o;
import p174m.C2571a;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import tg.InterfaceC4186d;
import tg.InterfaceC4187e;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: xb.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5761g implements InterfaceC4186d {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2571a f23444g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5763i f23445h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ float f23446i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5761g(C2571a c2571a, C5763i c5763i, float f3) {
        this.f23444g = c2571a;
        this.f23445h = c5763i;
        this.f23446i = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tg.InterfaceC4186d
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6025b(InterfaceC4187e interfaceC4187e, InterfaceC5557c interfaceC5557c) {
        C5758d c5758d;
        if (interfaceC5557c instanceof C5758d) {
            c5758d = (C5758d) interfaceC5557c;
            int i9 = c5758d.f23436h;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c5758d.f23436h = i9 - Integer.MIN_VALUE;
            } else {
                c5758d = new C5758d(this, interfaceC5557c);
            }
        }
        Object obj = c5758d.f23435g;
        int i10 = c5758d.f23436h;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            C5760f c5760f = new C5760f(interfaceC4187e, this.f23445h, this.f23446i);
            c5758d.f23436h = 1;
            Object objMo6025b = this.f23444g.mo6025b(c5760f, c5758d);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objMo6025b == enumC5799a) {
                return enumC5799a;
            }
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(obj);
        }
        return C3967n.f12976a;
    }
}
