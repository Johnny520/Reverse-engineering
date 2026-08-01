package p175i0;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import p011B4.AbstractC0231b;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p077P0.AbstractC1124k;
import p077P0.C1125l;
import p077P0.C1130q;
import p082Q0.C1168b;
import p121Y1.C1753n;
import p186k.C2408E;
import p186k.C2440v;
import p198m0.C2567A;
import p198m0.InterfaceC2579j;

/* JADX INFO: renamed from: i0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2268c extends AbstractC2274i implements InterfaceC2579j {

    /* JADX INFO: renamed from: d */
    public final C1753n f7413d;

    /* JADX INFO: renamed from: e */
    public final C1130q f7414e;

    /* JADX INFO: renamed from: f */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772y f7415f;

    /* JADX INFO: renamed from: g */
    public final C1168b f7416g;

    /* JADX INFO: renamed from: h */
    public final String f7417h;

    /* JADX INFO: renamed from: i */
    public final Rect f7418i = new Rect();

    /* JADX INFO: renamed from: j */
    public final AutofillId f7419j;

    /* JADX INFO: renamed from: k */
    public final C2440v f7420k;

    /* JADX INFO: renamed from: l */
    public boolean f7421l;

    public C2268c(C1753n c1753n, C1130q c1130q, ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, C1168b c1168b, String str) {
        this.f7413d = c1753n;
        this.f7414e = c1130q;
        this.f7415f = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f7416g = c1168b;
        this.f7417h = str;
        viewTreeObserverOnGlobalLayoutListenerC0772y.setImportantForAutofill(1);
        AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC0772y.getAutofillId();
        if (autofillId == null) {
            throw AbstractC0231b.m396g("Required value was null.");
        }
        this.f7419j = autofillId;
        this.f7420k = new C2440v();
    }

    @Override // p198m0.InterfaceC2579j
    /* JADX INFO: renamed from: a */
    public final void mo1307a(C2567A c2567a, C2567A c2567a2) {
        C0564I c0564iM1044t;
        C1125l c1125lM841w;
        C0564I c0564iM1044t2;
        C1125l c1125lM841w2;
        if (c2567a != null && (c0564iM1044t2 = AbstractC0601k.m1044t(c2567a)) != null && (c1125lM841w2 = c0564iM1044t2.m841w()) != null) {
            C2408E c2408e = c1125lM841w2.f3702d;
            if (c2408e.m4267b(AbstractC1124k.f3682g) || c2408e.m4267b(AbstractC1124k.f3683h)) {
                ((AutofillManager) this.f7413d.f6028e).notifyViewExited(this.f7415f, c0564iM1044t2.f1712e);
            }
        }
        if (c2567a2 == null || (c0564iM1044t = AbstractC0601k.m1044t(c2567a2)) == null || (c1125lM841w = c0564iM1044t.m841w()) == null) {
            return;
        }
        C2408E c2408e2 = c1125lM841w.f3702d;
        if (c2408e2.m4267b(AbstractC1124k.f3682g) || c2408e2.m4267b(AbstractC1124k.f3683h)) {
            int i5 = c0564iM1044t.f1712e;
            this.f7416g.f3820a.m1356v(i5, new C2266a(this, i5));
        }
    }
}
