package p373z0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: z0.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6068h extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: a */
    public static final C6068h f24548a = new C6068h();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i9, int i10) {
        super.onAutofillEvent(view, i9, i10);
        Log.d("Autofill Status", i10 != 1 ? i10 != 2 ? i10 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
