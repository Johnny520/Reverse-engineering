package androidx.core.view;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
import io.ktor.client.plugins.api.C3885;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2211 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2212 f6493;

    public C2211(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f6493 = new C2201(nestedScrollView);
        } else {
            this.f6493 = new C3885(7);
        }
    }
}
