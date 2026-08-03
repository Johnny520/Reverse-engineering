package p000;

import android.content.Context;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Mg */
/* JADX INFO: loaded from: classes.dex */
public final class C0539Mg extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2414qe f1752e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0625Og f1753f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0185EC f1754g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0140DA f1755h;

    public C0539Mg(InterfaceC0190Eb r1, C2414qe r2, C0625Og r3, C0140DA r4, C0185EC r5) {
        this.f1752e = r2;
        this.f1753f = r3;
        this.f1754g = r5;
        this.f1755h = r4;
        super(r1);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r1, Object r2) {
        InterfaceC0190Eb r22 = (InterfaceC0190Eb) r2;
        C0539Mg r12 = (C0539Mg) mo447h(r22, (InterfaceC1409fc) r1);
        C0829TC r23 = C0829TC.f2620a;
        r12.mo448i(r23);
        return r23;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r7, Object r8) {
        C0185EC r5 = this.f1754g;
        C0140DA r4 = this.f1755h;
        return new C0539Mg(r7, this.f1752e, this.f1753f, r4, r5);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r9) {
        AbstractC0628Oj.m1232T(r9);
        AbstractC1208bA.m2328a(new RunnableC2320oe(this.f1752e, 1));
        C0625Og r92 = this.f1753f;
        AbstractC0213Ey.m413k(-100515119626293L, r92.getContext(), 0);
        r92.f1989a.notifyDataSetChanged();
        Context r0 = r92.getContext();
        AbstractC0295Gu.m625r(-100553774331957L);
        String r1 = AbstractC0295Gu.m625r(-100072737994805L);
        StringBuilder r2 = new StringBuilder();
        r2.append(AbstractC0295Gu.m625r(-100094212831285L));
        C0185EC r4 = this.f1754g;
        r2.append(r4.f551c);
        r2.append(' ');
        C0140DA r5 = this.f1755h;
        r2.append(r5.f365b);
        r2.append(AbstractC0295Gu.m625r(-100119982635061L));
        C1456gf.m2801S(r0, r1, r2.toString(), new DialogInterfaceOnClickListenerC0448Kb(r92, r5, r4), false);
        return C0829TC.f2620a;
    }
}
