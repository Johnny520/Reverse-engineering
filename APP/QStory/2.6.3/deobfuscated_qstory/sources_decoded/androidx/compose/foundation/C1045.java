package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1045 implements InterfaceC1083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f3086;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1045 f3085 = new C1045(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1045 f3084 = new C1045(1);

    public /* synthetic */ C1045(int i) {
        this.f3086 = i;
    }

    @Override // androidx.compose.foundation.InterfaceC1083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1080 mo1950(View view, InterfaceC7896 interfaceC7896) {
        switch (this.f3086) {
            case 0:
                return new C1082(new Magnifier(view));
            default:
                return new C1044(new Magnifier(view));
        }
    }

    @Override // androidx.compose.foundation.InterfaceC1083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo1951() {
        switch (this.f3086) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
