package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1045 implements InterfaceC1083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f3085;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1045 f3084 = new C1045(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1045 f3083 = new C1045(1);

    public /* synthetic */ C1045(int i) {
        this.f3085 = i;
    }

    @Override // androidx.compose.foundation.InterfaceC1083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1080 mo1940(View view, InterfaceC7895 interfaceC7895) {
        switch (this.f3085) {
            case 0:
                return new C1082(new Magnifier(view));
            default:
                return new C1044(new Magnifier(view));
        }
    }

    @Override // androidx.compose.foundation.InterfaceC1083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo1941() {
        switch (this.f3085) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
