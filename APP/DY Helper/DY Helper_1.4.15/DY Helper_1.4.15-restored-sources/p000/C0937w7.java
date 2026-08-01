package p000;

/* JADX INFO: renamed from: w7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0937w7 extends android.view.autofill.AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: α */
    public static final p000.C0937w7 f11591 = null;

    static {
            w7 r0 = new w7
            r0.<init>()
            p000.C0937w7.f11591 = r0
            return
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(android.view.View r1, int r2, int r3) {
            r0 = this;
            super.onAutofillEvent(r1, r2, r3)
            r0 = 1
            if (r3 == r0) goto L15
            r0 = 2
            if (r3 == r0) goto L12
            r0 = 3
            if (r3 == r0) goto Lf
            java.lang.String r0 = "Unknown status event."
            goto L17
        Lf:
            java.lang.String r0 = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account"
            goto L17
        L12:
            java.lang.String r0 = "Autofill popup was hidden."
            goto L17
        L15:
            java.lang.String r0 = "Autofill popup was shown."
        L17:
            java.lang.String r1 = "Autofill Status"
            android.util.Log.d(r1, r0)
            return
    }
}
