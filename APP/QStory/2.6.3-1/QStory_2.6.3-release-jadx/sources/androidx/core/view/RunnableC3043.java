package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3043 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f6837;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6838;

    public /* synthetic */ RunnableC3043(View view, int i) {
        this.f6838 = i;
        this.f6837 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6838;
        View view = this.f6837;
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
