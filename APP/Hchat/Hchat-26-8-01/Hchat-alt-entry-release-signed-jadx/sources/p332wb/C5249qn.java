package p332wb;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2096g;
import p136j8.C2097h;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import tf.C4173t;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.qn */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5249qn extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public C2097h f20261h;

    /* JADX INFO: renamed from: i */
    public C2096g f20262i;

    /* JADX INFO: renamed from: j */
    public int f20263j;

    /* JADX INFO: renamed from: k */
    public int f20264k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f20265l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C2097h f20266m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5249qn(C2097h c2097h, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f20266m = c2097h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C5249qn c5249qn = new C5249qn(this.f20266m, interfaceC5557c);
        c5249qn.f20265l = obj;
        return c5249qn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C5249qn) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:6:0x0011, B:20:0x0041, B:25:0x0051, B:14:0x0026, B:16:0x0031, B:31:0x006b, B:32:0x0072, B:33:0x0073, B:34:0x007a), top: B:38:0x0007 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0064 -> B:7:0x0014). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c3959f;
        C2097h c2097h;
        int i9;
        int i10 = this.f20264k;
        try {
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            C2097h c2097h2 = this.f20266m;
            if (c2097h2 == null) {
                throw new IllegalStateException("收藏 API 未就绪");
            }
            c2097h2.f7008b.resolveFavoriteApi();
            if (!c2097h2.m5240d()) {
                throw new IllegalStateException("收藏列表不可用");
            }
            c2097h = c2097h2;
            c3959f = new C2096g(C4173t.f13710g, false, false);
            i9 = 0;
            if (i9 < 3) {
            }
            return new C3960g(c3959f);
        }
        if (i10 != 1) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i9 = this.f20263j;
        C2096g c2096gM5248u = this.f20262i;
        c2097h = this.f20261h;
        AbstractC1089i.m2732I0(obj);
        c3959f = c2096gM5248u;
        i9++;
        if (i9 < 3) {
            c2096gM5248u = c2097h.m5248u();
            if (c2096gM5248u.f7004a.isEmpty() && i9 != 2) {
                this.f20265l = null;
                this.f20261h = c2097h;
                this.f20262i = c2096gM5248u;
                this.f20263j = i9;
                this.f20264k = 1;
                Object objM7552f = AbstractC3603v.m7552f(350L, this);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM7552f == enumC5799a) {
                    return enumC5799a;
                }
                c3959f = c2096gM5248u;
                i9++;
                if (i9 < 3) {
                }
            }
            c3959f = c2096gM5248u;
        }
        return new C3960g(c3959f);
    }
}
