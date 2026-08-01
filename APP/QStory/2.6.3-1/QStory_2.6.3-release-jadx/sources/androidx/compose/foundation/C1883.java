package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1883 implements InterfaceC1921 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f3431;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1883 f3430 = new C1883(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1883 f3429 = new C1883(1);

    public /* synthetic */ C1883(int i) {
        this.f3431 = i;
    }

    @Override // androidx.compose.foundation.InterfaceC1921
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1918 mo2510(View view, InterfaceC8725 interfaceC8725) {
        switch (this.f3431) {
            case 0:
                return new C1920(new Magnifier(view));
            default:
                return new C1882(new Magnifier(view));
        }
    }

    @Override // androidx.compose.foundation.InterfaceC1921
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo2511() {
        switch (this.f3431) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
