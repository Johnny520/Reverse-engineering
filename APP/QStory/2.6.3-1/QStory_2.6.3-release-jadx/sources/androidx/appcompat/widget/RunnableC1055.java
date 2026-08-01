package androidx.appcompat.widget;

import android.view.View;
import p206.InterfaceC8626;
import p206.MenuC8631;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1055 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1044 f1155;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1050 f1156;

    public RunnableC1055(C1044 c1044, C1050 c1050) {
        this.f1155 = c1044;
        this.f1156 = c1050;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC8626 interfaceC8626;
        C1044 c1044 = this.f1155;
        MenuC8631 menuC8631 = c1044.f1140;
        if (menuC8631 != null && (interfaceC8626 = menuC8631.f21606) != null) {
            interfaceC8626.mo764(menuC8631);
        }
        View view = (View) c1044.f1135;
        if (view != null && view.getWindowToken() != null) {
            C1050 c1050 = this.f1156;
            if (c1050.m13704()) {
                c1044.f1129 = c1050;
            } else if (c1050.f21529 != null) {
                c1050.m13703(0, 0, false, false);
                c1044.f1129 = c1050;
            }
        }
        c1044.f1127 = null;
    }
}
