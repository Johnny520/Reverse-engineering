package z0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends android.view.autofill.AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0.h f22490a = null;

    static {
            z0.h r0 = new z0.h
            r0.<init>()
            z0.h.f22490a = r0
            return
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(android.view.View r1, int r2, int r3) {
            r0 = this;
            super.onAutofillEvent(r1, r2, r3)
            r1 = 1
            if (r3 == r1) goto L15
            r1 = 2
            if (r3 == r1) goto L12
            r1 = 3
            if (r3 == r1) goto Lf
            java.lang.String r1 = "Unknown status event."
            goto L17
        Lf:
            java.lang.String r1 = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account"
            goto L17
        L12:
            java.lang.String r1 = "Autofill popup was hidden."
            goto L17
        L15:
            java.lang.String r1 = "Autofill popup was shown."
        L17:
            java.lang.String r2 = "Autofill Status"
            android.util.Log.d(r2, r1)
            return
    }
}
