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

    public C0720Qp(Object r1, C0762Rp r2, long r3, InterfaceC0190Eb r5) {
        this.f2305e = r1;
        this.f2306f = r2;
        this.f2307g = r3;
        super(r5);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r1, Object r2) {
        InterfaceC0190Eb r22 = (InterfaceC0190Eb) r2;
        return ((C0720Qp) mo447h(r22, (InterfaceC1409fc) r1)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r7, Object r8) {
        C0762Rp r2 = this.f2306f;
        long r3 = this.f2307g;
        return new C0720Qp(this.f2305e, r2, r3, r7);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r7) {
        AbstractC0628Oj.m1232T(r7);
        Object r72 = this.f2305e;
        boolean r0 = r72 instanceof C0297Gw;
        C0762Rp r2 = this.f2306f;
        if (r0 == true) goto L8;
        StringBuilder r02 = new StringBuilder();
        r02.append(AbstractC0295Gu.m625r(-129918465734709L) + this.f2307g + AbstractC0295Gu.m625r(-129970005342261L));
        if (r72 == null) goto L7;
        r02.append(AbstractC0295Gu.m625r(-129991480178741L) + r72 + '\n');
    L7:
        r2.m1559a(r02.toString());
    L8:
        Throwable r03 = C0340Hw.m726a(r72);
        if (r03 == null) goto L12;
        r2.m1559a(AbstractC0295Gu.m625r(-130017249982517L) + r03.getMessage() + '\n');
    L12:
        return new C0340Hw(r72);
    }
}
