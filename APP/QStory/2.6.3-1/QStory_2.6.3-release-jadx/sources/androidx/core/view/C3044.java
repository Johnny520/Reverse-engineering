package androidx.core.view;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
import io.ktor.client.plugins.api.C4718;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3044 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3045 f6839;

    public C3044(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f6839 = new C3034(nestedScrollView);
        } else {
            this.f6839 = new C4718(7);
        }
    }
}
