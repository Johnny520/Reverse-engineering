package p174m;

import gg.C1422r;
import java.util.concurrent.CancellationException;
import p036c9.C0454k;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p116i.AbstractC1742d;
import p116i.C1766l;
import p116i.C1793u;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2634o extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public C1422r f8571h;

    /* JADX INFO: renamed from: i */
    public C1766l f8572i;

    /* JADX INFO: renamed from: j */
    public int f8573j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ float f8574k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C2638p f8575l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C2621k2 f8576m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2634o(float f3, C2638p c2638p, C2621k2 c2621k2, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f8574k = f3;
        this.f8575l = c2638p;
        this.f8576m = c2621k2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C2634o(this.f8574k, this.f8575l, this.f8576m, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2634o) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        float f3;
        C1766l c1766lM4366b;
        C1422r c1422r;
        Object objM4370f;
        EnumC5799a enumC5799a;
        int i9 = this.f8573j;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            f3 = this.f8574k;
            if (Math.abs(f3) > 1.0f) {
                C1422r c1422r2 = new C1422r();
                c1422r2.f4735g = f3;
                C1422r c1422r3 = new C1422r();
                c1766lM4366b = AbstractC1742d.m4366b(0.0f, f3, 28);
                try {
                    C2638p c2638p = this.f8575l;
                    C1793u c1793u = c2638p.f8601a;
                    C0454k c0454k = new C0454k(c1422r3, this.f8576m, c1422r2, c2638p, 8);
                    this.f8571h = c1422r2;
                    this.f8572i = c1766lM4366b;
                    this.f8573j = 1;
                    objM4370f = AbstractC1742d.m4370f(c1766lM4366b, c1793u, c0454k, this);
                    enumC5799a = EnumC5799a.f23547g;
                } catch (CancellationException unused) {
                    c1422r = c1422r2;
                    c1422r.f4735g = ((Number) c1766lM4366b.f5900g.f5913b.invoke(c1766lM4366b.f5902i)).floatValue();
                }
                if (objM4370f == enumC5799a) {
                    return enumC5799a;
                }
                c1422r = c1422r2;
                f3 = c1422r.f4735g;
            }
        } else {
            if (i9 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1766lM4366b = this.f8572i;
            c1422r = this.f8571h;
            try {
                AbstractC1089i.m2732I0(obj);
            } catch (CancellationException unused2) {
                c1422r.f4735g = ((Number) c1766lM4366b.f5900g.f5913b.invoke(c1766lM4366b.f5902i)).floatValue();
            }
            f3 = c1422r.f4735g;
        }
        return new Float(f3);
    }
}
