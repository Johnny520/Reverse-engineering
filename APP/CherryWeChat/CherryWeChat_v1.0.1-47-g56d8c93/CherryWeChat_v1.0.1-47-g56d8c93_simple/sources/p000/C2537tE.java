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

    public C2537tE(View r1, InterfaceC0190Eb r2) {
        this.f8845e = r1;
        super(2, r2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r1, Object r2) {
        InterfaceC0190Eb r22 = (InterfaceC0190Eb) r2;
        return ((C2537tE) mo447h(r22, (C2820zx) r1)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r3, Object r4) {
        C2537tE r0 = new C2537tE(this.f8845e, r3);
        r0.f8844d = r4;
        return r0;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r8) {
        int r0 = this.f8843c;
        View r1 = this.f8845e;
        EnumC1453gc r3 = EnumC1453gc.f5148a;
        if (r0 == 0) goto L23;
        C0829TC r4 = C0829TC.f2620a;
        if (r0 == 1) goto L11;
        if (r0 != 2) goto L10;
        AbstractC0628Oj.m1232T(r8);
        return r4;
    L10:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L11:
        C2820zx r02 = (C2820zx) this.f8844d;
        AbstractC0628Oj.m1232T(r8);
        if ((r1 instanceof ViewGroup) == false) goto L22;
        this.f8844d = null;
        this.f8843c = 2;
        r02.getClass();
        C0700QB r82 = new C0700QB(new C2694x(7, (ViewGroup) r1));
        if (r82.f2253b.hasNext() == true) goto L16;
        Object r83 = r4;
    L17:
        if (r83 == r3) goto L20;
        r83 = r4;
    L20:
        if (r83 != r3) goto L22;
        return r3;
    L16:
        r02.f9540c = r82;
        r02.f9538a = 2;
        r02.f9541d = this;
        r83 = r3;
    L22:
        return r4;
    L23:
        AbstractC0628Oj.m1232T(r8);
        C2820zx r84 = (C2820zx) this.f8844d;
        this.f8844d = r84;
        this.f8843c = 1;
        r84.f9539b = r1;
        r84.f9538a = 3;
        r84.f9541d = this;
        return r3;
    }
}
