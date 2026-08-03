package p000;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Qp */
/* JADX INFO: loaded from: classes.dex */
public final class C0720Qp extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2305e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0762Rp f2306f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f2307g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0720Qp(Object obj, C0762Rp c0762Rp, long j, InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        this.f2305e = obj;
        this.f2306f = c0762Rp;
        this.f2307g = j;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        return ((C0720Qp) mo447h((InterfaceC0190Eb) obj2, (InterfaceC1409fc) obj)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        return new C0720Qp(this.f2305e, this.f2306f, this.f2307g, interfaceC0190Eb);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        AbstractC0628Oj.m1232T(obj);
        Object obj2 = this.f2305e;
        boolean z = obj2 instanceof C0297Gw;
        C0762Rp c0762Rp = this.f2306f;
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-129918465734709L) + this.f2307g + AbstractC0295Gu.m625r(-129970005342261L));
            if (obj2 != null) {
                sb.append(AbstractC0295Gu.m625r(-129991480178741L) + obj2 + '\n');
            }
            c0762Rp.m1559a(sb.toString());
        }
        Throwable thM726a = C0340Hw.m726a(obj2);
        if (thM726a != null) {
            c0762Rp.m1559a(AbstractC0295Gu.m625r(-130017249982517L) + thM726a.getMessage() + '\n');
        }
        return new C0340Hw(obj2);
    }
}
