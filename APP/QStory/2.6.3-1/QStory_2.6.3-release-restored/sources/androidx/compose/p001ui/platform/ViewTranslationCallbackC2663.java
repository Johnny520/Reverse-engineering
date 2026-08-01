package androidx.compose.p001ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC2663 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ViewTranslationCallbackC2663 f5665 = new ViewTranslationCallbackC2663();

    public final boolean onClearTranslation(View view) {
        view.getClass();
        ((ViewTreeObserverOnGlobalLayoutListenerC2719) view).getContentCaptureManager$ui().m3118();
        return true;
    }

    public final boolean onHideTranslation(View view) {
        view.getClass();
        ((ViewTreeObserverOnGlobalLayoutListenerC2719) view).getContentCaptureManager$ui().m3119();
        return true;
    }

    public final boolean onShowTranslation(View view) {
        view.getClass();
        ((ViewTreeObserverOnGlobalLayoutListenerC2719) view).getContentCaptureManager$ui().m3116();
        return true;
    }
}
