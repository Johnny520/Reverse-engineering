package p348xb;

import p077f8.AbstractC1089i;
import p136j8.C2104o;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import tg.InterfaceC4187e;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: xb.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5760f implements InterfaceC4187e {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC4187e f23441g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5763i f23442h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ float f23443i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5760f(InterfaceC4187e interfaceC4187e, C5763i c5763i, float f3) {
        this.f23441g = interfaceC4187e;
        this.f23442h = c5763i;
        this.f23443i = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tg.InterfaceC4187e
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1602e(Object obj, InterfaceC5557c interfaceC5557c) {
        C5759e c5759e;
        if (interfaceC5557c instanceof C5759e) {
            c5759e = (C5759e) interfaceC5557c;
            int i9 = c5759e.f23439h;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c5759e.f23439h = i9 - Integer.MIN_VALUE;
            } else {
                c5759e = new C5759e(this, interfaceC5557c);
            }
        }
        Object obj2 = c5759e.f23438g;
        int i10 = c5759e.f23439h;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj2);
            if (Math.abs(((Number) obj).floatValue() - ((Number) this.f23442h.f23460k.f5788e.getValue()).floatValue()) < this.f23443i) {
                c5759e.f23439h = 1;
                Object objMo1602e = this.f23441g.mo1602e(obj, c5759e);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objMo1602e == enumC5799a) {
                    return enumC5799a;
                }
            }
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(obj2);
        }
        return C3967n.f12976a;
    }
}
