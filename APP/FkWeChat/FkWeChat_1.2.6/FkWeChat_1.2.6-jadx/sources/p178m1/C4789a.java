package p178m1;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import p120i2.AbstractC3167a;
import p215oc.C5706c;
import p222p2.AbstractC5944d;
import p222p2.C5941a;
import p376zd.C10010p0;

/* JADX INFO: renamed from: m1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4789a implements InterfaceC4796h {

    /* JADX INFO: renamed from: a */
    public final View f14253a;

    /* JADX INFO: renamed from: b */
    public final C4804p f14254b;

    /* JADX INFO: renamed from: c */
    public final AutofillManager f14255c;

    /* JADX INFO: renamed from: d */
    public AutofillId f14256d;

    public C4789a(View view, C4804p c4804p) {
        this.f14253a = view;
        this.f14254b = c4804p;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            C10010p0.m38820a("Autofill service could not be located.");
            throw null;
        }
        this.f14255c = autofillManager;
        view.setImportantForAutofill(1);
        C5941a c5941aM23898a = AbstractC5944d.m23898a(view);
        AutofillId autofillIdM23889a = c5941aM23898a != null ? c5941aM23898a.m23889a() : null;
        if (autofillIdM23889a != null) {
            this.f14256d = autofillIdM23889a;
        } else {
            AbstractC3167a.m11957c("Required value was null.");
            C5706c.m23089a();
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final AutofillManager m19177a() {
        return this.f14255c;
    }

    /* JADX INFO: renamed from: b */
    public final C4804p m19178b() {
        return this.f14254b;
    }

    /* JADX INFO: renamed from: c */
    public final AutofillId m19179c() {
        return this.f14256d;
    }

    /* JADX INFO: renamed from: d */
    public final View m19180d() {
        return this.f14253a;
    }
}
