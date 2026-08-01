package p175i0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: i0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2273h extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: a */
    public static final C2273h f7425a = new C2273h();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i5, int i6) {
        super.onAutofillEvent(view, i5, i6);
        Log.d("Autofill Status", i6 != 1 ? i6 != 2 ? i6 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
