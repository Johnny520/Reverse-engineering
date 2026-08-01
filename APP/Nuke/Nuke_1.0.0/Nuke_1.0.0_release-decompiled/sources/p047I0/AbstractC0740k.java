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
    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ ScrollCaptureSession m1244h(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ ScrollCaptureTarget m1245i(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(viewTreeObserverOnGlobalLayoutListenerC0772y, rect, point, scrollCaptureCallback);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ ViewTranslationRequest.Builder m1250n(AutofillId autofillId, long j5) {
        return new ViewTranslationRequest.Builder(autofillId, j5);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ ViewTranslationResponse m1252p(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m1254r() {
    }
}
