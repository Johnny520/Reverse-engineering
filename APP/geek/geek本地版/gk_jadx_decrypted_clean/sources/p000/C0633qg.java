package p000;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: qg */
/* JADX INFO: loaded from: classes.dex */
public final class C0633qg extends AbstractC0346ip {

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ C0415kl f4085C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0670rg f4086D;

    public C0633qg(DialogInterfaceOnCancelListenerC0670rg dialogInterfaceOnCancelListenerC0670rg, C0415kl c0415kl) {
        this.f4086D = dialogInterfaceOnCancelListenerC0670rg;
        this.f4085C = c0415kl;
    }

    @Override // p000.AbstractC0346ip
    /* JADX INFO: renamed from: G */
    public final View mo1513G(int i) {
        C0415kl c0415kl = this.f4085C;
        if (c0415kl.mo1514H()) {
            return c0415kl.mo1513G(i);
        }
        Dialog dialog = this.f4086D.f4280a0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // p000.AbstractC0346ip
    /* JADX INFO: renamed from: H */
    public final boolean mo1514H() {
        return this.f4085C.mo1514H() || this.f4086D.f4283d0;
    }
}
