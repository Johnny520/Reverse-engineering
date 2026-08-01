package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3048 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3049 f6843;

    public C3048(Window window, View view) {
        C3075 c3075 = new C3075(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f6843 = new C3046(window, this, c3075);
        } else if (i >= 30) {
            this.f6843 = new C3047(window, this, c3075);
        } else {
            this.f6843 = new C3061(window, c3075);
        }
    }

    public void addOnControllableInsetsChangedListener(InterfaceC3050 interfaceC3050) {
        this.f6843.addOnControllableInsetsChangedListener(interfaceC3050);
    }

    public void removeOnControllableInsetsChangedListener(InterfaceC3050 interfaceC3050) {
        this.f6843.removeOnControllableInsetsChangedListener(interfaceC3050);
    }
}
