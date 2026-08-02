package p000;

import android.graphics.Insets;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b00 {
    /* JADX INFO: renamed from: a */
    public static ContentCaptureSession m324a(View view) {
        return view.getContentCaptureSession();
    }

    /* JADX INFO: renamed from: b */
    public static AutofillId m325b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    /* JADX INFO: renamed from: c */
    public static ViewStructure m326c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    /* JADX INFO: renamed from: d */
    public static void m327d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    /* JADX INFO: renamed from: e */
    public static void m328e(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    /* JADX INFO: renamed from: f */
    public static void m329f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    /* JADX INFO: renamed from: g */
    public static void m330g(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    /* JADX INFO: renamed from: h */
    public static Insets m331h(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }
}
