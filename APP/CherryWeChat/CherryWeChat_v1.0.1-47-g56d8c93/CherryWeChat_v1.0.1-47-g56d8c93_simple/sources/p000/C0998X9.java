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

    public C0998X9(C1258ca r1, InterfaceC0190Eb r2, C2414qe r3, C0054BA r4, C0140DA r5, View r6) {
        this.f3188e = r3;
        this.f3189f = r6;
        this.f3190g = r4;
        this.f3191h = r5;
        this.f3192i = r1;
        super(r2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r1, Object r2) {
        InterfaceC0190Eb r22 = (InterfaceC0190Eb) r2;
        C0998X9 r12 = (C0998X9) mo447h(r22, (InterfaceC1409fc) r1);
        C0829TC r23 = C0829TC.f2620a;
        r12.mo448i(r23);
        return r23;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r8, Object r9) {
        C0140DA r5 = this.f3191h;
        return new C0998X9(this.f3192i, r8, this.f3188e, this.f3190g, r5, this.f3189f);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r5) {
        AbstractC0628Oj.m1232T(r5);
        C2414qe r0 = this.f3188e;
        r0.m4857b(100);
        AbstractC1208bA.m2328a(new RunnableC2320oe(r0, 1));
        Context r52 = this.f3189f.getContext();
        StringBuilder r02 = new StringBuilder();
        r02.append(AbstractC0295Gu.m625r(-104625403328565L));
        AbstractC2374ph.m4817n(r02, this.f3190g.f121b, -104642583197749L);
        r02.append(this.f3191h.f365b);
        r02.append(AbstractC0295Gu.m625r(-104655468099637L));
        Toast.makeText(r52, r02.toString(), 0).show();
        this.f3192i.notifyDataSetChanged();
        return C0829TC.f2620a;
    }
}
