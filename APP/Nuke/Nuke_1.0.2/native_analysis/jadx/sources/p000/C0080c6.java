package p000;

import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: c6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0080c6 extends w51 implements on0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0119d6 f1209i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ r61 f1210j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0080c6(C0119d6 c0119d6, r61 r61Var) {
        super(4);
        this.f1209i = c0119d6;
        this.f1210j = r61Var;
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: o */
    public final Object mo171o(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        C0119d6 c0119d6 = this.f1209i;
        c0119d6.f1880m.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        hh1 hh1Var = c0119d6.f1875h;
        ((AutofillManager) hh1Var.f4019i).requestAutofill(c0119d6.f1877j, this.f1210j.f9385i, c0119d6.f1880m);
        return a83.f116a;
    }
}
