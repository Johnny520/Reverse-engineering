package ug;

import gg.C1425u;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p144k.C2160c0;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import tg.InterfaceC4186d;
import tg.InterfaceC4187e;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ug.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4340e extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f14501h = 0;

    /* JADX INFO: renamed from: i */
    public int f14502i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f14503j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4342g f14504k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC4187e f14505l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4340e(C4342g c4342g, InterfaceC4187e interfaceC4187e, Object obj, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f14504k = c4342g;
        this.f14505l = interfaceC4187e;
        this.f14503j = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f14501h) {
            case 0:
                return new C4340e(this.f14504k, this.f14505l, this.f14503j, interfaceC5557c);
            default:
                C4340e c4340e = new C4340e(this.f14504k, this.f14505l, interfaceC5557c);
                c4340e.f14503j = obj;
                return c4340e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f14501h) {
        }
        return ((C4340e) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [fg.q, yf.i] */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f14501h) {
            case 0:
                int i9 = this.f14502i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    ?? r92 = this.f14504k.f14515k;
                    Object obj2 = this.f14503j;
                    this.f14502i = 1;
                    Object objMo734b = r92.mo734b(this.f14505l, obj2, this);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objMo734b == enumC5799a) {
                    }
                } else if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            default:
                int i10 = this.f14502i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f14503j;
                    C1425u c1425u = new C1425u();
                    C4342g c4342g = this.f14504k;
                    InterfaceC4186d interfaceC4186d = c4342g.f14514j;
                    C2160c0 c2160c0 = new C2160c0(c1425u, interfaceC3599t, c4342g, this.f14505l, 1);
                    this.f14502i = 1;
                    Object objMo6025b = interfaceC4186d.mo6025b(c2160c0, this);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objMo6025b == enumC5799a2) {
                    }
                } else if (i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
        }
        return C3967n.f12976a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4340e(C4342g c4342g, InterfaceC4187e interfaceC4187e, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f14504k = c4342g;
        this.f14505l = interfaceC4187e;
    }
}
