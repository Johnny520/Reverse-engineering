package p044;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import com.davemorrissey.labs.subscaleview.C0328R;

/* JADX INFO: renamed from: 飘花落叶言世哲子兰楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DialogC7147 extends Dialog {
    public DialogC7147(Context context) {
        super(context, C0328R.style.dialog);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12392(int i) {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = i;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m12393() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }
}
