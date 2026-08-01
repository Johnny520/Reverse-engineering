package p051J;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import p000A.C0099z;
import p002A1.AbstractC0151x;
import p049I2.AbstractC0797o;
import p056K2.EnumC0880f;
import p059L0.AbstractC0955a;

/* JADX INFO: renamed from: J.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0822n {

    /* JADX INFO: renamed from: a */
    public final Object f2640a;

    /* JADX INFO: renamed from: b */
    public final View f2641b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0822n(View view) {
        this.f2641b = view;
        this.f2640a = AbstractC0797o.m1395t(EnumC0880f.f2767e, new C0099z(8, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [K2.e, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public InputMethodManager m1454a() {
        return (InputMethodManager) this.f2640a.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public AutofillId m1455b(long j5) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0955a.m1956b(AbstractC0151x.m205f(this.f2640a), this.f2641b.getAutofillId(), j5);
        }
        return null;
    }

    public C0822n(ContentCaptureSession contentCaptureSession, View view) {
        this.f2640a = contentCaptureSession;
        this.f2641b = view;
    }
}
