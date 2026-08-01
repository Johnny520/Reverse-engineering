package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC1828 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ViewTranslationCallbackC1828 f5319 = new ViewTranslationCallbackC1828();

    public final boolean onClearTranslation(View view) {
        view.getClass();
        ((ViewTreeObserverOnGlobalLayoutListenerC1884) view).getContentCaptureManager$ui().m2548();
        return true;
    }

    public final boolean onHideTranslation(View view) {
        view.getClass();
        ((ViewTreeObserverOnGlobalLayoutListenerC1884) view).getContentCaptureManager$ui().m2549();
        return true;
    }

    public final boolean onShowTranslation(View view) {
        view.getClass();
        ((ViewTreeObserverOnGlobalLayoutListenerC1884) view).getContentCaptureManager$ui().m2546();
        return true;
    }
}
