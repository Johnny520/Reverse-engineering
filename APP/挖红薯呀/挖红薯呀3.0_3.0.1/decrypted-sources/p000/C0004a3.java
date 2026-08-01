package p000;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: a3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0004a3 extends AbstractC0384k9 implements InterfaceC0865vu {

    /* JADX INFO: renamed from: d */
    public final C0910x1 f30d;

    /* JADX INFO: renamed from: e */
    public final a01 f31e;

    /* JADX INFO: renamed from: f */
    public final ViewTreeObserverOnGlobalLayoutListenerC0875w3 f32f;

    /* JADX INFO: renamed from: g */
    public final ut0 f33g;

    /* JADX INFO: renamed from: h */
    public final String f34h;

    /* JADX INFO: renamed from: i */
    public final AutofillId f35i;

    /* JADX INFO: renamed from: j */
    public final vg0 f36j;

    /* JADX INFO: renamed from: k */
    public boolean f37k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0004a3(C0910x1 c0910x1, a01 a01Var, ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3, ut0 ut0Var, String str) {
        this.f30d = c0910x1;
        this.f31e = a01Var;
        this.f32f = viewTreeObserverOnGlobalLayoutListenerC0875w3;
        this.f33g = ut0Var;
        this.f34h = str;
        new Rect();
        viewTreeObserverOnGlobalLayoutListenerC0875w3.setImportantForAutofill(1);
        AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC0875w3.getAutofillId();
        if (autofillId == null) {
            throw AbstractC0748t1.m4149g("Required value was null.");
        }
        this.f35i = autofillId;
        this.f36j = new vg0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0865vu
    /* JADX INFO: renamed from: d */
    public final void mo14d(C0149dv c0149dv, C0149dv c0149dv2) {
        b60 b60VarM3039Q;
        sz0 sz0VarM317x;
        b60 b60VarM3039Q2;
        sz0 sz0VarM317x2;
        if (c0149dv != null && (b60VarM3039Q2 = pf1.m3039Q(c0149dv)) != null && (sz0VarM317x2 = b60VarM3039Q2.m317x()) != null) {
            jh0 jh0Var = sz0VarM317x2.f5877d;
            if (jh0Var.m1696b(rz0.f5594g) || jh0Var.m1696b(rz0.f5595h)) {
                ((AutofillManager) this.f30d.f7232e).notifyViewExited(this.f32f, b60VarM3039Q2.f406e);
            }
        }
        if (c0149dv2 == null || (b60VarM3039Q = pf1.m3039Q(c0149dv2)) == null || (sz0VarM317x = b60VarM3039Q.m317x()) == null) {
            return;
        }
        jh0 jh0Var2 = sz0VarM317x.f5877d;
        if (jh0Var2.m1696b(rz0.f5594g) || jh0Var2.m1696b(rz0.f5595h)) {
            int i = b60VarM3039Q.f406e;
            this.f33g.f6297a.m4256h(i, new C0985z2(this, i));
        }
    }
}
