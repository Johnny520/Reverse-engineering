package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2215 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2216 f6498;

    public C2215(Window window, View view) {
        C2242 c2242 = new C2242(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f6498 = new C2213(window, this, c2242);
        } else if (i >= 30) {
            this.f6498 = new C2214(window, this, c2242);
        } else {
            this.f6498 = new C2228(window, c2242);
        }
    }

    public void addOnControllableInsetsChangedListener(InterfaceC2217 interfaceC2217) {
        this.f6498.addOnControllableInsetsChangedListener(interfaceC2217);
    }

    public void removeOnControllableInsetsChangedListener(InterfaceC2217 interfaceC2217) {
        this.f6498.removeOnControllableInsetsChangedListener(interfaceC2217);
    }
}
