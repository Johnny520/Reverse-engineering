package p258;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2343;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰苏子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8241 extends DialogInterfaceOnCancelListenerC2343 {

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public WeakReference f22776 = null;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public View f22777;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public AbstractC3738 f22778;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2343, androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo4448() {
        Window window;
        super.mo4448();
        Activity activity = (Activity) this.f22776.get();
        Dialog dialog = this.f6928;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.clearFlags(8);
        window.setSoftInputMode(16);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        attributes.format = -2;
        this.f22777.setOnTouchListener(new ViewOnTouchListenerC8242(this, activity));
        window.setAttributes(attributes);
        window.addFlags(67108864);
        window.getDecorView().setPadding(0, 0, 0, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.getDecorView().setSystemUiVisibility((activity == null || (activity.getWindow().getDecorView().getSystemUiVisibility() & 8192) != 8192) ? 1280 : 9472);
        window.addFlags(-2013265920);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo4455(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f22777;
    }
}
