package p178m1;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: m1.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4802n extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: a */
    public static final C4802n f14277a = new C4802n();

    /* JADX INFO: renamed from: b */
    public static final int f14278b = 8;

    /* JADX INFO: renamed from: a */
    public final void m19245a(C4789a c4789a) {
        c4789a.m19177a().registerCallback(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m19246b(C4789a c4789a) {
        c4789a.m19177a().unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i10, int i11) {
        super.onAutofillEvent(view, i10, i11);
        Log.d("Autofill Status", i11 != 1 ? i11 != 2 ? i11 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
