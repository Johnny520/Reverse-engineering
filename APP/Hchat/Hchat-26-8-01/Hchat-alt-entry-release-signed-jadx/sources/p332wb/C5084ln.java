package p332wb;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p249qg.InterfaceC3599t;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p345x8.AbstractC5731x;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.ln */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5084ln extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f18763h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f18764i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f18765j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f18766k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5084ln(String str, String str2, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f18763h = i9;
        this.f18765j = str;
        this.f18766k = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f18763h) {
            case 0:
                C5084ln c5084ln = new C5084ln(this.f18765j, this.f18766k, interfaceC5557c, 0);
                c5084ln.f18764i = obj;
                return c5084ln;
            default:
                C5084ln c5084ln2 = new C5084ln(this.f18765j, this.f18766k, interfaceC5557c, 1);
                c5084ln2.f18764i = obj;
                return c5084ln2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f18763h) {
        }
        return ((C5084ln) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        Object c3959f;
        Object c3959f2;
        switch (this.f18763h) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                try {
                    c3959f = AbstractC5731x.m10411l(this.f18765j, this.f18766k);
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                return new C3960g(c3959f);
            default:
                AbstractC1089i.m2732I0(obj);
                try {
                    AbstractC5731x.m10416q(this.f18765j, this.f18766k);
                    c3959f2 = "短信验证码已发送";
                    break;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                return new C3960g(c3959f2);
        }
    }
}
