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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0539Mg(InterfaceC0190Eb interfaceC0190Eb, C2414qe c2414qe, C0625Og c0625Og, C0140DA c0140da, C0185EC c0185ec) {
        super(interfaceC0190Eb);
        this.f1752e = c2414qe;
        this.f1753f = c0625Og;
        this.f1754g = c0185ec;
        this.f1755h = c0140da;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) throws Throwable {
        C0539Mg c0539Mg = (C0539Mg) mo447h((InterfaceC0190Eb) obj2, (InterfaceC1409fc) obj);
        C0829TC c0829tc = C0829TC.f2620a;
        c0539Mg.mo448i(c0829tc);
        return c0829tc;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        C0185EC c0185ec = this.f1754g;
        return new C0539Mg(interfaceC0190Eb, this.f1752e, this.f1753f, this.f1755h, c0185ec);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        AbstractC0628Oj.m1232T(obj);
        AbstractC1208bA.m2328a(new RunnableC2320oe(this.f1752e, 1));
        C0625Og c0625Og = this.f1753f;
        AbstractC0213Ey.m413k(-100515119626293L, c0625Og.getContext(), 0);
        c0625Og.f1989a.notifyDataSetChanged();
        Context context = c0625Og.getContext();
        AbstractC0295Gu.m625r(-100553774331957L);
        String strM625r = AbstractC0295Gu.m625r(-100072737994805L);
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-100094212831285L));
        C0185EC c0185ec = this.f1754g;
        sb.append(c0185ec.f551c);
        sb.append(' ');
        C0140DA c0140da = this.f1755h;
        sb.append(c0140da.f365b);
        sb.append(AbstractC0295Gu.m625r(-100119982635061L));
        C1456gf.m2801S(context, strM625r, sb.toString(), new DialogInterfaceOnClickListenerC0448Kb(c0625Og, c0140da, c0185ec), false);
        return C0829TC.f2620a;
    }
}
