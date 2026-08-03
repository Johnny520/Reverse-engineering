package p332wb;

import okhttp3.OkHttpClient;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p218og.C3147k;
import p249qg.InterfaceC3599t;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p345x8.AbstractC5731x;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.in */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4986in extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f17950h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f17951i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f17952j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4986in(InterfaceC1809a1 interfaceC1809a1, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f17950h = i9;
        this.f17952j = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f17950h) {
            case 0:
                C4986in c4986in = new C4986in(this.f17952j, interfaceC5557c, 0);
                c4986in.f17951i = obj;
                return c4986in;
            case 1:
                C4986in c4986in2 = new C4986in(this.f17952j, interfaceC5557c, 1);
                c4986in2.f17951i = obj;
                return c4986in2;
            default:
                C4986in c4986in3 = new C4986in(this.f17952j, interfaceC5557c, 2);
                c4986in3.f17951i = obj;
                return c4986in3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f17950h) {
        }
        return ((C4986in) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        int i9 = this.f17950h;
        InterfaceC1809a1 interfaceC1809a1 = this.f17952j;
        switch (i9) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                try {
                    OkHttpClient okHttpClient = AbstractC5731x.f23348a;
                    C3147k c3147k = AbstractC4955ho.f17686a;
                    c3959f = AbstractC5731x.m10403d((String) interfaceC1809a1.getValue());
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                return new C3960g(c3959f);
            case 1:
                AbstractC1089i.m2732I0(obj);
                try {
                    OkHttpClient okHttpClient2 = AbstractC5731x.f23348a;
                    C3147k c3147k2 = AbstractC4955ho.f17686a;
                    c3959f2 = AbstractC5731x.m10406g((String) interfaceC1809a1.getValue());
                    break;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                return new C3960g(c3959f2);
            default:
                AbstractC1089i.m2732I0(obj);
                try {
                    OkHttpClient okHttpClient3 = AbstractC5731x.f23348a;
                    C3147k c3147k3 = AbstractC4955ho.f17686a;
                    c3959f3 = AbstractC5731x.m10407h((String) interfaceC1809a1.getValue());
                    break;
                } catch (Throwable th4) {
                    c3959f3 = new C3959f(th4);
                }
                return new C3960g(c3959f3);
        }
    }
}
