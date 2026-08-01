package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.VibratorManager;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* JADX INFO: renamed from: f3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0195f3 {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.os.VibratorManager) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ VibratorManager m1010h(Object obj) {
        return (VibratorManager) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.ScrollCaptureSession) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ ScrollCaptureSession m1012j(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 w3), (r2v0 android.graphics.Rect), (r3v0 android.graphics.Point), (r4v0 android.view.ScrollCaptureCallback) A[MD:(android.view.View, android.graphics.Rect, android.graphics.Point, android.view.ScrollCaptureCallback):void (c)] (LINE:3) call: android.view.ScrollCaptureTarget.<init>(android.view.View, android.graphics.Rect, android.graphics.Point, android.view.ScrollCaptureCallback):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ ScrollCaptureTarget m1013k(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(viewTreeObserverOnGlobalLayoutListenerC0875w3, rect, point, scrollCaptureCallback);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 android.view.autofill.AutofillId), (r2v0 long) A[MD:(android.view.autofill.AutofillId, long):void (c)] (LINE:3) call: android.view.translation.ViewTranslationRequest.Builder.<init>(android.view.autofill.AutofillId, long):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ ViewTranslationRequest.Builder m1017o(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.translation.ViewTranslationResponse) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ ViewTranslationResponse m1019q(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m1021s() {
    }
}
