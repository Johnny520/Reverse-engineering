package p373z0;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import p041d1.C0653b0;
import p041d1.InterfaceC0664j;
import p069f.C0943k0;
import p069f.C0966x;
import p072f2.AbstractC1049l;
import p072f2.C1050m;
import p072f2.C1056s;
import p090g2.C1293b;
import p332wb.AbstractC4855en;
import p339x1.AbstractC5618k;
import p339x1.C5602f0;
import p351xe.C5784e;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: z0.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6063c extends AbstractC6069i implements InterfaceC0664j {

    /* JADX INFO: renamed from: g */
    public final C5784e f24536g;

    /* JADX INFO: renamed from: h */
    public final C1056s f24537h;

    /* JADX INFO: renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC5934t f24538i;

    /* JADX INFO: renamed from: j */
    public final C1293b f24539j;

    /* JADX INFO: renamed from: k */
    public final String f24540k;

    /* JADX INFO: renamed from: l */
    public final Rect f24541l = new Rect();

    /* JADX INFO: renamed from: m */
    public final AutofillId f24542m;

    /* JADX INFO: renamed from: n */
    public final C0966x f24543n;

    /* JADX INFO: renamed from: o */
    public boolean f24544o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6063c(C5784e c5784e, C1056s c1056s, ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, C1293b c1293b, String str) {
        this.f24536g = c5784e;
        this.f24537h = c1056s;
        this.f24538i = viewTreeObserverOnGlobalLayoutListenerC5934t;
        this.f24539j = c1293b;
        this.f24540k = str;
        viewTreeObserverOnGlobalLayoutListenerC5934t.setImportantForAutofill(1);
        AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC5934t.getAutofillId();
        if (autofillId == null) {
            throw AbstractC4855en.m9257a("Required value was null.");
        }
        this.f24542m = autofillId;
        this.f24543n = new C0966x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041d1.InterfaceC0664j
    /* JADX INFO: renamed from: e */
    public final void mo1842e(C0653b0 c0653b0, C0653b0 c0653b02) {
        C5602f0 c5602f0M10167w;
        C1050m c1050mM10051w;
        C5602f0 c5602f0M10167w2;
        C1050m c1050mM10051w2;
        if (c0653b0 != null && (c5602f0M10167w2 = AbstractC5618k.m10167w(c0653b0)) != null && (c1050mM10051w2 = c5602f0M10167w2.m10051w()) != null) {
            C0943k0 c0943k0 = c1050mM10051w2.f3341g;
            if (c0943k0.m2315b(AbstractC1049l.f3321g) || c0943k0.m2315b(AbstractC1049l.f3322h)) {
                ((AutofillManager) this.f24536g.f23527b).notifyViewExited(this.f24538i, c5602f0M10167w2.f22791h);
            }
        }
        if (c0653b02 == null || (c5602f0M10167w = AbstractC5618k.m10167w(c0653b02)) == null || (c1050mM10051w = c5602f0M10167w.m10051w()) == null) {
            return;
        }
        C0943k0 c0943k02 = c1050mM10051w.f3341g;
        if (c0943k02.m2315b(AbstractC1049l.f3321g) || c0943k02.m2315b(AbstractC1049l.f3322h)) {
            int i9 = c5602f0M10167w.f22791h;
            this.f24539j.f4315b.m350P(i9, new C6061a(this, i9));
        }
    }
}
