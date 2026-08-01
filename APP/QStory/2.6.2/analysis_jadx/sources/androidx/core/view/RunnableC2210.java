package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2210 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f6491;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6492;

    public /* synthetic */ RunnableC2210(View view, int i) {
        this.f6492 = i;
        this.f6491 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6492;
        View view = this.f6491;
        switch (i) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }
}
