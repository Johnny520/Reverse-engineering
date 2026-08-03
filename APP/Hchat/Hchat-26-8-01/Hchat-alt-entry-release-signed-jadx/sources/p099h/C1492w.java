package p099h;

import ci.C0589j;
import gg.C1421q;
import java.util.List;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p116i.C1765k1;
import p117i0.C1865o1;
import p117i0.C1888v1;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p276sf.C3958e;
import p276sf.C3967n;
import p332wb.C5491y2;
import p352xf.EnumC5799a;
import tg.C4189g;
import tg.InterfaceC4187e;
import ug.AbstractC4338c;
import vg.AbstractC4552a;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: h.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1492w implements InterfaceC4187e {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4948g;

    /* JADX INFO: renamed from: h */
    public final Object f4949h;

    /* JADX INFO: renamed from: i */
    public final Object f4950i;

    /* JADX INFO: renamed from: j */
    public final Object f4951j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1492w(InterfaceC4187e interfaceC4187e, InterfaceC5561g interfaceC5561g) {
        this.f4948g = 2;
        this.f4949h = interfaceC5561g;
        this.f4950i = AbstractC4552a.m8992k(interfaceC5561g);
        this.f4951j = new C0589j(interfaceC4187e, (InterfaceC5557c) null, 17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    @Override // tg.InterfaceC4187e
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1602e(Object obj, InterfaceC5557c interfaceC5557c) {
        C4189g c4189g;
        C1492w c1492w;
        switch (this.f4948g) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C1765k1 c1765k1 = (C1765k1) this.f4950i;
                ((C1865o1) this.f4949h).setValue(Boolean.valueOf(zBooleanValue ? ((Boolean) ((InterfaceC1235p) ((InterfaceC1809a1) this.f4951j).getValue()).invoke(c1765k1.m4414c(), c1765k1.f5892d.getValue())).booleanValue() : false));
                break;
            case 1:
                if (interfaceC5557c instanceof C4189g) {
                    c4189g = (C4189g) interfaceC5557c;
                    int i9 = c4189g.f13747k;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c4189g.f13747k = i9 - Integer.MIN_VALUE;
                    } else {
                        c4189g = new C4189g(this, interfaceC5557c);
                    }
                }
                Object objInvoke = c4189g.f13745i;
                int i10 = c4189g.f13747k;
                C3967n c3967n = C3967n.f12976a;
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            obj = c4189g.f13744h;
                            c1492w = c4189g.f13743g;
                            AbstractC1089i.m2732I0(objInvoke);
                        } else if (i10 != 3) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    AbstractC1089i.m2732I0(objInvoke);
                    break;
                } else {
                    AbstractC1089i.m2732I0(objInvoke);
                    if (((C1421q) this.f4949h).f4734g) {
                        InterfaceC4187e interfaceC4187e = (InterfaceC4187e) this.f4950i;
                        c4189g.f13747k = 1;
                        if (interfaceC4187e.mo1602e(obj, c4189g) != enumC5799a) {
                        }
                    } else {
                        C1888v1 c1888v1 = (C1888v1) this.f4951j;
                        c4189g.f13743g = this;
                        c4189g.f13744h = obj;
                        c4189g.f13747k = 2;
                        objInvoke = c1888v1.invoke(obj, c4189g);
                        if (objInvoke != enumC5799a) {
                            c1492w = this;
                        }
                    }
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    ((C1421q) c1492w.f4949h).f4734g = true;
                    InterfaceC4187e interfaceC4187e2 = (InterfaceC4187e) c1492w.f4950i;
                    c4189g.f13743g = null;
                    c4189g.f13744h = null;
                    c4189g.f13747k = 3;
                    if (interfaceC4187e2.mo1602e(obj, c4189g) != enumC5799a) {
                    }
                }
                break;
            case 2:
                Object objM8793a = AbstractC4338c.m8793a((InterfaceC5561g) this.f4949h, obj, this.f4950i, (C0589j) this.f4951j, interfaceC5557c);
                if (objM8793a != EnumC5799a.f23547g) {
                    break;
                }
                break;
            default:
                C3958e c3958e = (C3958e) obj;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f4951j;
                boolean zBooleanValue2 = ((Boolean) c3958e.f12961g).booleanValue();
                boolean zBooleanValue3 = ((Boolean) c3958e.f12962h).booleanValue();
                boolean z9 = false;
                if (zBooleanValue3) {
                    C5491y2.m9797Q(interfaceC1809a1, true);
                } else if (zBooleanValue2) {
                    C5491y2.m9797Q(interfaceC1809a1, false);
                }
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f4950i;
                if (!zBooleanValue3 && !((List) this.f4949h).isEmpty()) {
                    z9 = true;
                }
                interfaceC1809a12.setValue(Boolean.valueOf(z9));
                break;
        }
        return C3967n.f12976a;
    }

    public C1492w(List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f4948g = 3;
        this.f4949h = list;
        this.f4951j = interfaceC1809a1;
        this.f4950i = interfaceC1809a12;
    }

    public /* synthetic */ C1492w(Object obj, Object obj2, Object obj3, int i9) {
        this.f4948g = i9;
        this.f4949h = obj;
        this.f4950i = obj2;
        this.f4951j = obj3;
    }
}
