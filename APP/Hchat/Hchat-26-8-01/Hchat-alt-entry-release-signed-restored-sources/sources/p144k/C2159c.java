package p144k;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p187n.C2857k;
import p187n.C2859m;
import p187n.C2860n;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: k.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2159c extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7154h;

    /* JADX INFO: renamed from: i */
    public int f7155i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2857k f7156j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2859m f7157k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2159c(C2859m c2859m, C2857k c2857k, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f7154h = 0;
        this.f7157k = c2859m;
        this.f7156j = c2857k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f7154h) {
            case 0:
                return new C2159c(this.f7157k, this.f7156j, interfaceC5557c);
            case 1:
                return new C2159c(this.f7156j, this.f7157k, interfaceC5557c, 1);
            default:
                return new C2159c(this.f7156j, this.f7157k, interfaceC5557c, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f7154h) {
        }
        return ((C2159c) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f7154h) {
            case 0:
                int i9 = this.f7155i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2860n c2860n = new C2860n(this.f7157k);
                    this.f7155i = 1;
                    Object objM6281a = this.f7156j.m6281a(c2860n, this);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objM6281a == enumC5799a) {
                    }
                } else if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 1:
                int i10 = this.f7155i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    this.f7155i = 1;
                    Object objM6281a2 = this.f7156j.m6281a(this.f7157k, this);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objM6281a2 == enumC5799a2) {
                    }
                } else if (i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            default:
                int i11 = this.f7155i;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    this.f7155i = 1;
                    Object objM6281a3 = this.f7156j.m6281a(this.f7157k, this);
                    EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                    if (objM6281a3 == enumC5799a3) {
                    }
                } else if (i11 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
        }
        return C3967n.f12976a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2159c(C2857k c2857k, C2859m c2859m, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f7154h = i9;
        this.f7156j = c2857k;
        this.f7157k = c2859m;
    }
}
