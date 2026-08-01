package p179m2;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: renamed from: m2.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC4814a0 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a */
    public static final ViewTranslationCallbackC4814a0 f14337a = new ViewTranslationCallbackC4814a0();

    public boolean onClearTranslation(View view) {
        view.getClass();
        ((ViewTreeObserverOnGlobalLayoutListenerC4898r) view).getContentCaptureManager$ui().m22271t();
        return true;
    }

    public boolean onHideTranslation(View view) {
        view.getClass();
        ((ViewTreeObserverOnGlobalLayoutListenerC4898r) view).getContentCaptureManager$ui().m22273v();
        return true;
    }

    public boolean onShowTranslation(View view) {
        view.getClass();
        ((ViewTreeObserverOnGlobalLayoutListenerC4898r) view).getContentCaptureManager$ui().m22276y();
        return true;
    }
}
