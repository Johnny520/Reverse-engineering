package p000;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: d6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0119d6 extends AbstractC0695si implements xk0 {

    /* JADX INFO: renamed from: h */
    public final hh1 f1875h;

    /* JADX INFO: renamed from: i */
    public final tn2 f1876i;

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserverOnGlobalLayoutListenerC0045b7 f1877j;

    /* JADX INFO: renamed from: k */
    public final q62 f1878k;

    /* JADX INFO: renamed from: l */
    public final String f1879l;

    /* JADX INFO: renamed from: m */
    public final Rect f1880m = new Rect();

    /* JADX INFO: renamed from: n */
    public final AutofillId f1881n;

    /* JADX INFO: renamed from: o */
    public final ak1 f1882o;

    /* JADX INFO: renamed from: p */
    public boolean f1883p;

    public C0119d6(hh1 hh1Var, tn2 tn2Var, ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, q62 q62Var, String str) {
        this.f1875h = hh1Var;
        this.f1876i = tn2Var;
        this.f1877j = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        this.f1878k = q62Var;
        this.f1879l = str;
        viewTreeObserverOnGlobalLayoutListenerC0045b7.setImportantForAutofill(1);
        AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC0045b7.getAutofillId();
        if (autofillId == null) {
            throw vi0.m5686e("Required value was null.");
        }
        this.f1881n = autofillId;
        this.f1882o = new ak1();
    }

    @Override // p000.xk0
    /* JADX INFO: renamed from: a */
    public final void mo468a(pl0 pl0Var, pl0 pl0Var2) {
        r61 r61VarM4933c0;
        ln2 ln2VarM4391w;
        r61 r61VarM4933c02;
        ln2 ln2VarM4391w2;
        if (pl0Var != null && (r61VarM4933c02 = sp0.m4933c0(pl0Var)) != null && (ln2VarM4391w2 = r61VarM4933c02.m4391w()) != null) {
            rk1 rk1Var = ln2VarM4391w2.f6221h;
            if (rk1Var.m4500b(kn2.f5665g) || rk1Var.m4500b(kn2.f5666h)) {
                ((AutofillManager) this.f1875h.f4019i).notifyViewExited(this.f1877j, r61VarM4933c02.f9385i);
            }
        }
        if (pl0Var2 == null || (r61VarM4933c0 = sp0.m4933c0(pl0Var2)) == null || (ln2VarM4391w = r61VarM4933c0.m4391w()) == null) {
            return;
        }
        rk1 rk1Var2 = ln2VarM4391w.f6221h;
        if (rk1Var2.m4500b(kn2.f5665g) || rk1Var2.m4500b(kn2.f5666h)) {
            int i = r61VarM4933c0.f9385i;
            this.f1878k.f8751b.m1313v(i, new C0044b6(this, i));
        }
    }
}
