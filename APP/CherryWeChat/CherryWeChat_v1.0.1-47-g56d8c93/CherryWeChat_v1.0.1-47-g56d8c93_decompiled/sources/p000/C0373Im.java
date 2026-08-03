package p000;

import kotlin.Function;
import kotlinx.serialization.json.AbstractC2156b;

/* JADX INFO: renamed from: Im */
/* JADX INFO: loaded from: classes.dex */
public final class C0373Im extends AbstractC0254Fw implements Function {

    /* JADX INFO: renamed from: c */
    public int f1300c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C0535Mc f1301d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2256n f1302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0373Im(C2256n c2256n, InterfaceC0190Eb interfaceC0190Eb) {
        super(3, interfaceC0190Eb);
        this.f1302e = c2256n;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        C2256n c2256n = this.f1302e;
        C2341oz c2341oz = (C2341oz) c2256n.f7969c;
        int i = this.f1300c;
        if (i == 0) {
            AbstractC0628Oj.m1232T(obj);
            C0535Mc c0535Mc = this.f1301d;
            byte bM4765p = c2341oz.m4765p();
            if (bM4765p == 1) {
                return c2256n.m4585f(true);
            }
            if (bM4765p == 0) {
                return c2256n.m4585f(false);
            }
            if (bM4765p != 6) {
                if (bM4765p == 8) {
                    return c2256n.m4584e();
                }
                C2341oz.m4750m(c2341oz, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f1300c = 1;
            obj = C2256n.m4582a(c2256n, c0535Mc, this);
            EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
            if (obj == enumC1453gc) {
                return enumC1453gc;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0628Oj.m1232T(obj);
        }
        return (AbstractC2156b) obj;
    }
}
