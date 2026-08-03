package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f2971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.view.View f2972b;

    public n(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r1.f2972b = r2
            ab.a r2 = new ab.a
            r0 = 17
            r2.<init>(r1, r0)
            sf.d r0 = sf.d.f12416h
            sf.c r2 = be.h.G(r0, r2)
            r1.f2971a = r2
            return
    }

    public n(android.view.contentcapture.ContentCaptureSession r1, android.view.View r2) {
            r0 = this;
            r0.<init>()
            r0.f2971a = r1
            r0.f2972b = r2
            return
    }

    public android.view.inputmethod.InputMethodManager a() {
            r1 = this;
            java.lang.Object r0 = r1.f2971a
            java.lang.Object r0 = r0.getValue()
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            return r0
    }

    public android.view.autofill.AutofillId b(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L17
            java.lang.Object r0 = r2.f2971a
            android.view.contentcapture.ContentCaptureSession r0 = androidx.lifecycle.a0.c(r0)
            android.view.View r1 = r2.f2972b
            android.view.autofill.AutofillId r1 = r1.getAutofillId()
            android.view.autofill.AutofillId r3 = b2.a.b(r0, r1, r3)
            return r3
        L17:
            r3 = 0
            return r3
    }
}
