package androidx.compose.foundation.text.selection;

import android.content.ClipData;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ContentInfo;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0921 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ ContentInfo.Builder m1835(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ ViewTranslationRequest.Builder m1847(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static /* synthetic */ void m1850() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ ViewTranslationResponse m1852(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ ScrollCaptureSession m1853(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ ScrollCaptureTarget m1857(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(viewTreeObserverOnGlobalLayoutListenerC1884, rect, point, scrollCaptureCallback);
    }
}
