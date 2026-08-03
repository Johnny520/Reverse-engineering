package p000;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: W9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0955W9 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2987e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2414qe f2988f;

    public /* synthetic */ C0955W9(C2414qe r1, InterfaceC0190Eb r2, int r3) {
        this.f2987e = r3;
        this.f2988f = r1;
        super(r2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f2987e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C0955W9 r23 = (C0955W9) mo447h(r32, r22);
        C0829TC r33 = C0829TC.f2620a;
        r23.mo448i(r33);
        return r33;
    L6:
        C0955W9 r24 = (C0955W9) mo447h(r32, r22);
        C0829TC r34 = C0829TC.f2620a;
        r24.mo448i(r34);
        return r34;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r3, Object r4) {
        switch(this.f2987e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C0955W9(this.f2988f, r3, 1);
    L7:
        return new C0955W9(this.f2988f, r3, 0);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r2) {
        switch(this.f2987e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0628Oj.m1232T(r2);
        this.f2988f.m4857b(98);
        return C0829TC.f2620a;
    L6:
        AbstractC0628Oj.m1232T(r2);
        this.f2988f.m4857b(95);
        return C0829TC.f2620a;
    }
}
