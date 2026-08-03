package b2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static android.view.contentcapture.ContentCaptureSession a(android.view.View r0) {
            android.view.contentcapture.ContentCaptureSession r0 = r0.getContentCaptureSession()
            return r0
    }

    public static android.view.autofill.AutofillId b(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, long r2) {
            android.view.autofill.AutofillId r0 = r0.newAutofillId(r1, r2)
            return r0
    }

    public static android.view.ViewStructure c(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, long r2) {
            android.view.ViewStructure r0 = r0.newVirtualViewStructure(r1, r2)
            return r0
    }

    public static void d(android.view.contentcapture.ContentCaptureSession r0, android.view.ViewStructure r1) {
            r0.notifyViewAppeared(r1)
            return
    }

    public static void e(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1) {
            r0.notifyViewDisappeared(r1)
            return
    }

    public static void f(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, java.lang.String r2) {
            r0.notifyViewTextChanged(r1, r2)
            return
    }

    public static void g(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, long[] r2) {
            r0.notifyViewsDisappeared(r1, r2)
            return
    }

    public static android.graphics.Insets h(int r0, int r1, int r2, int r3) {
            android.graphics.Insets r0 = android.graphics.Insets.of(r0, r1, r2, r3)
            return r0
    }
}
