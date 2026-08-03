package p332wb;

import java.util.List;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p227p4.C3315t;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p251r.C3641z;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.jt */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5024jt extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public int f18241h;

    /* JADX INFO: renamed from: i */
    public int f18242i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List f18243j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ List f18244k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C3641z f18245l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f18246m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f18247n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5024jt(List list, List list2, C3641z c3641z, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f18243j = list;
        this.f18244k = list2;
        this.f18245l = c3641z;
        this.f18246m = interfaceC1809a1;
        this.f18247n = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C5024jt(this.f18243j, this.f18244k, this.f18245l, this.f18246m, this.f18247n, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C5024jt) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r1.m7619f(r9, r8) != r5) goto L23;
     */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int i9 = this.f18242i;
        C3641z c3641z = this.f18245l;
        List list = this.f18243j;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            InterfaceC1809a1 interfaceC1809a1 = this.f18246m;
            iIntValue = ((Number) interfaceC1809a1.getValue()).intValue();
            interfaceC1809a1.setValue(Integer.valueOf(list.size()));
            if (!this.f18244k.isEmpty()) {
                C5491y2.m9797Q(this.f18247n, true);
                if (iIntValue < 0 || list.size() >= iIntValue) {
                    this.f18241h = iIntValue;
                    this.f18242i = 1;
                    if (AbstractC3603v.m7552f(80L, this) != enumC5799a) {
                        int size = list.size();
                        this.f18241h = iIntValue;
                        this.f18242i = 2;
                        C3315t c3315t = C3641z.f11796y;
                    }
                    return enumC5799a;
                }
                C3641z.m7617l(c3641z, list.size());
            }
            return C3967n.f12976a;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                AbstractC1089i.m2732I0(obj);
                return C3967n.f12976a;
            }
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        iIntValue = this.f18241h;
        AbstractC1089i.m2732I0(obj);
        int size2 = list.size();
        this.f18241h = iIntValue;
        this.f18242i = 2;
        C3315t c3315t2 = C3641z.f11796y;
    }
}
