package p059L0;

import android.graphics.Insets;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: renamed from: L0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0955a {
    /* JADX INFO: renamed from: a */
    public static ContentCaptureSession m1955a(View view) {
        return view.getContentCaptureSession();
    }

    /* JADX INFO: renamed from: b */
    public static AutofillId m1956b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j5) {
        return contentCaptureSession.newAutofillId(autofillId, j5);
    }

    /* JADX INFO: renamed from: c */
    public static ViewStructure m1957c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j5) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j5);
    }

    /* JADX INFO: renamed from: d */
    public static void m1958d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    /* JADX INFO: renamed from: e */
    public static void m1959e(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    /* JADX INFO: renamed from: f */
    public static void m1960f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    /* JADX INFO: renamed from: g */
    public static void m1961g(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    /* JADX INFO: renamed from: h */
    public static Insets m1962h(int i5, int i6, int i7, int i8) {
        return Insets.of(i5, i6, i7, i8);
    }
}
