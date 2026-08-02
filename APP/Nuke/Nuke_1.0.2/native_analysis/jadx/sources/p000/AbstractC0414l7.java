package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* JADX INFO: renamed from: l7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0414l7 {
    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ ScrollCaptureSession m2853e(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ ScrollCaptureTarget m2854f(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(viewTreeObserverOnGlobalLayoutListenerC0045b7, rect, point, scrollCaptureCallback);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ ViewTranslationRequest.Builder m2859k(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ViewTranslationResponse m2861m(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m2863o() {
    }
}
