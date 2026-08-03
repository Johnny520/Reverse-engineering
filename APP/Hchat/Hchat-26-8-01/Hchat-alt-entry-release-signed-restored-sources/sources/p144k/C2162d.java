package p144k;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p187n.C2857k;
import p187n.C2859m;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: k.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2162d extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7164h;

    /* JADX INFO: renamed from: i */
    public int f7165i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2857k f7166j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2859m f7167k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AbstractC2171g f7168l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2162d(C2857k c2857k, C2859m c2859m, AbstractC2171g abstractC2171g, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f7164h = i9;
        this.f7166j = c2857k;
        this.f7167k = c2859m;
        this.f7168l = abstractC2171g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f7164h) {
            case 0:
                return new C2162d(this.f7166j, this.f7167k, this.f7168l, interfaceC5557c, 0);
            default:
                return new C2162d(this.f7166j, this.f7167k, this.f7168l, interfaceC5557c, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f7164h) {
        }
        return ((C2162d) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7164h) {
            case 0:
                int i9 = this.f7165i;
                C2859m c2859m = this.f7167k;
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1089i.m2732I0(obj);
                    } else if (i9 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        AbstractC1089i.m2732I0(obj);
                        this.f7168l.f7200L = c2859m;
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    long j3 = AbstractC2222x.f7362a;
                    this.f7165i = 1;
                    if (AbstractC3603v.m7552f(j3, this) == enumC5799a) {
                    }
                }
                this.f7165i = 2;
                if (this.f7166j.m6281a(c2859m, this) == enumC5799a) {
                }
                this.f7168l.f7200L = c2859m;
                break;
            default:
                int i10 = this.f7165i;
                C2859m c2859m2 = this.f7167k;
                EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1089i.m2732I0(obj);
                    } else if (i10 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        AbstractC1089i.m2732I0(obj);
                        this.f7168l.f7197I = c2859m2;
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    long j4 = AbstractC2222x.f7362a;
                    this.f7165i = 1;
                    if (AbstractC3603v.m7552f(j4, this) == enumC5799a2) {
                    }
                }
                this.f7165i = 2;
                if (this.f7166j.m6281a(c2859m2, this) == enumC5799a2) {
                }
                this.f7168l.f7197I = c2859m2;
                break;
        }
        return C3967n.f12976a;
    }
}
