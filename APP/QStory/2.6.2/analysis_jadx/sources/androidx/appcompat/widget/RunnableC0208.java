package androidx.appcompat.widget;

import android.view.View;
import p190.InterfaceC7796;
import p190.MenuC7801;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        InterfaceC7796 interfaceC7796;
        C0197 c0197 = this.f810;
        MenuC7801 menuC7801 = c0197.f795;
        if (menuC7801 != null && (interfaceC7796 = menuC7801.f21264) != null) {
            interfaceC7796.mo203(menuC7801);
        }
        View view = (View) c0197.f790;
        if (view != null && view.getWindowToken() != null) {
            C0203 c0203 = this.f811;
            if (c0203.m13117()) {
                c0197.f784 = c0203;
            } else if (c0203.f21187 != null) {
                c0203.m13116(0, 0, false, false);
                c0197.f784 = c0203;
            }
        }
        c0197.f782 = null;
    }
}
