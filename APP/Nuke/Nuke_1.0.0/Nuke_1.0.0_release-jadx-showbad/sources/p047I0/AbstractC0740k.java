package p047I0;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* JADX INFO: renamed from: I0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0740k {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.ScrollCaptureSession) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ ScrollCaptureSession m1244h(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 I0.y), (r2v0 android.graphics.Rect), (r3v0 android.graphics.Point), (r4v0 android.view.ScrollCaptureCallback) A[MD:(android.view.View, android.graphics.Rect, android.graphics.Point, android.view.ScrollCaptureCallback):void (c)] (LINE:3) call: android.view.ScrollCaptureTarget.<init>(android.view.View, android.graphics.Rect, android.graphics.Point, android.view.ScrollCaptureCallback):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ ScrollCaptureTarget m1245i(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(viewTreeObserverOnGlobalLayoutListenerC0772y, rect, point, scrollCaptureCallback);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 android.view.autofill.AutofillId), (r2v0 long) A[MD:(android.view.autofill.AutofillId, long):void (c)] (LINE:3) call: android.view.translation.ViewTranslationRequest.Builder.<init>(android.view.autofill.AutofillId, long):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ ViewTranslationRequest.Builder m1250n(AutofillId autofillId, long j5) {
        return new ViewTranslationRequest.Builder(autofillId, j5);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.translation.ViewTranslationResponse) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ ViewTranslationResponse m1252p(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m1254r() {
    }
}
