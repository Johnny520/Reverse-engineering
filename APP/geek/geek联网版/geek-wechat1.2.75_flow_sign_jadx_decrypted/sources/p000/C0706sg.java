package p000;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: sg */
/* JADX INFO: loaded from: classes.dex */
public final class C0706sg extends AbstractC0259gf {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0489ml f4316y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0743tg f4317z;

    public C0706sg(DialogInterfaceOnCancelListenerC0743tg dialogInterfaceOnCancelListenerC0743tg, C0489ml c0489ml) {
        this.f4317z = dialogInterfaceOnCancelListenerC0743tg;
        this.f4316y = c0489ml;
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: K */
    public final View mo1264K(int i) {
        C0489ml c0489ml = this.f4316y;
        if (c0489ml.mo1265L()) {
            return c0489ml.mo1264K(i);
        }
        Dialog dialog = this.f4317z.f4519a0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: L */
    public final boolean mo1265L() {
        return this.f4316y.mo1265L() || this.f4317z.f4522d0;
    }
}
