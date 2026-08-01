package androidx.appcompat.widget;

import android.view.View;
import p190.InterfaceC7797;
import p190.MenuC7802;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0208 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0197 f810;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0203 f811;

    public RunnableC0208(C0197 c0197, C0203 c0203) {
        this.f810 = c0197;
        this.f811 = c0203;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC7797 interfaceC7797;
        C0197 c0197 = this.f810;
        MenuC7802 menuC7802 = c0197.f795;
        if (menuC7802 != null && (interfaceC7797 = menuC7802.f21261) != null) {
            interfaceC7797.mo204(menuC7802);
        }
        View view = (View) c0197.f790;
        if (view != null && view.getWindowToken() != null) {
            C0203 c0203 = this.f811;
            if (c0203.m13145()) {
                c0197.f784 = c0203;
            } else if (c0203.f21184 != null) {
                c0203.m13144(0, 0, false, false);
                c0197.f784 = c0203;
            }
        }
        c0197.f782 = null;
    }
}
