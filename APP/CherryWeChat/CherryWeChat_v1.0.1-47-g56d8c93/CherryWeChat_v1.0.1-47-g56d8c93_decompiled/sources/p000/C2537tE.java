package p000;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: tE */
/* JADX INFO: loaded from: classes.dex */
public final class C2537tE extends AbstractC0254Fw implements Function2 {

    /* JADX INFO: renamed from: c */
    public int f8843c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f8844d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f8845e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2537tE(View view, InterfaceC0190Eb interfaceC0190Eb) {
        super(2, interfaceC0190Eb);
        this.f8845e = view;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        return ((C2537tE) mo447h((InterfaceC0190Eb) obj2, (C2820zx) obj)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        C2537tE c2537tE = new C2537tE(this.f8845e, interfaceC0190Eb);
        c2537tE.f8844d = obj;
        return c2537tE;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        Object obj2;
        int i = this.f8843c;
        View view = this.f8845e;
        EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
        if (i == 0) {
            AbstractC0628Oj.m1232T(obj);
            C2820zx c2820zx = (C2820zx) this.f8844d;
            this.f8844d = c2820zx;
            this.f8843c = 1;
            c2820zx.f9539b = view;
            c2820zx.f9538a = 3;
            c2820zx.f9541d = this;
            return enumC1453gc;
        }
        C0829TC c0829tc = C0829TC.f2620a;
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0628Oj.m1232T(obj);
            return c0829tc;
        }
        C2820zx c2820zx2 = (C2820zx) this.f8844d;
        AbstractC0628Oj.m1232T(obj);
        if (view instanceof ViewGroup) {
            this.f8844d = null;
            this.f8843c = 2;
            c2820zx2.getClass();
            C0700QB c0700qb = new C0700QB(new C2694x(7, (ViewGroup) view));
            if (c0700qb.f2253b.hasNext()) {
                c2820zx2.f9540c = c0700qb;
                c2820zx2.f9538a = 2;
                c2820zx2.f9541d = this;
                obj2 = enumC1453gc;
            } else {
                obj2 = c0829tc;
            }
            if (obj2 != enumC1453gc) {
                obj2 = c0829tc;
            }
            if (obj2 == enumC1453gc) {
                return enumC1453gc;
            }
        }
        return c0829tc;
    }
}
