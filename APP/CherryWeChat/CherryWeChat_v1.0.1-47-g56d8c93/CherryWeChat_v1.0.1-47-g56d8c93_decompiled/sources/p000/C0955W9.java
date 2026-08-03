package p000;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: W9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0955W9 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2987e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2414qe f2988f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0955W9(C2414qe c2414qe, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f2987e = i;
        this.f2988f = c2414qe;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) throws Throwable {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f2987e) {
            case 0:
                C0955W9 c0955w9 = (C0955W9) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc = C0829TC.f2620a;
                c0955w9.mo448i(c0829tc);
                return c0829tc;
            default:
                C0955W9 c0955w92 = (C0955W9) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc2 = C0829TC.f2620a;
                c0955w92.mo448i(c0829tc2);
                return c0829tc2;
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f2987e) {
            case 0:
                return new C0955W9(this.f2988f, interfaceC0190Eb, 0);
            default:
                return new C0955W9(this.f2988f, interfaceC0190Eb, 1);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        switch (this.f2987e) {
            case 0:
                AbstractC0628Oj.m1232T(obj);
                this.f2988f.m4857b(95);
                break;
            default:
                AbstractC0628Oj.m1232T(obj);
                this.f2988f.m4857b(98);
                break;
        }
        return C0829TC.f2620a;
    }
}
