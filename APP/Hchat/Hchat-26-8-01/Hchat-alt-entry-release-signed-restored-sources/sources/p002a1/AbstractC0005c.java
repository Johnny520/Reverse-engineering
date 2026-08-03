package p002a1;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: a1.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0005c {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.ScrollCaptureSession) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ ScrollCaptureSession m126j(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 y1.t), (r2v0 android.graphics.Rect), (r3v0 android.graphics.Point), (r4v0 android.view.ScrollCaptureCallback) A[MD:(android.view.View, android.graphics.Rect, android.graphics.Point, android.view.ScrollCaptureCallback):void (c)] (LINE:3) call: android.view.ScrollCaptureTarget.<init>(android.view.View, android.graphics.Rect, android.graphics.Point, android.view.ScrollCaptureCallback):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ ScrollCaptureTarget m127k(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(viewTreeObserverOnGlobalLayoutListenerC5934t, rect, point, scrollCaptureCallback);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 android.view.autofill.AutofillId), (r2v0 long) A[MD:(android.view.autofill.AutofillId, long):void (c)] (LINE:3) call: android.view.translation.ViewTranslationRequest.Builder.<init>(android.view.autofill.AutofillId, long):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ ViewTranslationRequest.Builder m132p(AutofillId autofillId, long j3) {
        return new ViewTranslationRequest.Builder(autofillId, j3);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.translation.ViewTranslationResponse) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ ViewTranslationResponse m134r(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m136t() {
    }
}
