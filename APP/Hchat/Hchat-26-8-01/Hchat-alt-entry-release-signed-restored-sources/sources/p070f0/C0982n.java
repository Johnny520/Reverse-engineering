package p070f0;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0092a0;
import be.AbstractC0283h;
import p011ab.C0041a;
import p017b2.AbstractC0169a;
import p276sf.EnumC3957d;

/* JADX INFO: renamed from: f0.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0982n {

    /* JADX INFO: renamed from: a */
    public final Object f3095a;

    /* JADX INFO: renamed from: b */
    public final View f3096b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0982n(View view) {
        this.f3096b = view;
        this.f3095a = AbstractC0283h.m1127G(EnumC3957d.f12959h, new C0041a(this, 17));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: a */
    public InputMethodManager m2429a() {
        return (InputMethodManager) this.f3095a.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public AutofillId m2430b(long j3) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0169a.m751b(AbstractC0092a0.m515c(this.f3095a), this.f3096b.getAutofillId(), j3);
        }
        return null;
    }

    public C0982n(ContentCaptureSession contentCaptureSession, View view) {
        this.f3095a = contentCaptureSession;
        this.f3096b = view;
    }
}
