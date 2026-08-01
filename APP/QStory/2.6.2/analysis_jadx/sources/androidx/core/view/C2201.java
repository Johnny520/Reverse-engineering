package androidx.core.view;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2201 implements InterfaceC2212 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ScrollFeedbackProvider f6478;

    public C2201(NestedScrollView nestedScrollView) {
        this.f6478 = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // androidx.core.view.InterfaceC2212
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f6478.onScrollLimit(i, i2, i3, z);
    }

    @Override // androidx.core.view.InterfaceC2212
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f6478.onScrollProgress(i, i2, i3, i4);
    }
}
