package p000;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0998X9 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2414qe f3188e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ View f3189f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0054BA f3190g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0140DA f3191h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1258ca f3192i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0998X9(C1258ca c1258ca, InterfaceC0190Eb interfaceC0190Eb, C2414qe c2414qe, C0054BA c0054ba, C0140DA c0140da, View view) {
        super(interfaceC0190Eb);
        this.f3188e = c2414qe;
        this.f3189f = view;
        this.f3190g = c0054ba;
        this.f3191h = c0140da;
        this.f3192i = c1258ca;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) throws Throwable {
        C0998X9 c0998x9 = (C0998X9) mo447h((InterfaceC0190Eb) obj2, (InterfaceC1409fc) obj);
        C0829TC c0829tc = C0829TC.f2620a;
        c0998x9.mo448i(c0829tc);
        return c0829tc;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        return new C0998X9(this.f3192i, interfaceC0190Eb, this.f3188e, this.f3190g, this.f3191h, this.f3189f);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        AbstractC0628Oj.m1232T(obj);
        C2414qe c2414qe = this.f3188e;
        c2414qe.m4857b(100);
        AbstractC1208bA.m2328a(new RunnableC2320oe(c2414qe, 1));
        Context context = this.f3189f.getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-104625403328565L));
        AbstractC2374ph.m4817n(sb, this.f3190g.f121b, -104642583197749L);
        sb.append(this.f3191h.f365b);
        sb.append(AbstractC0295Gu.m625r(-104655468099637L));
        Toast.makeText(context, sb.toString(), 0).show();
        this.f3192i.notifyDataSetChanged();
        return C0829TC.f2620a;
    }
}
