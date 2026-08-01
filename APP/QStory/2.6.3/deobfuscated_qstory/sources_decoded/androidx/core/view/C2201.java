package androidx.core.view;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2201 implements InterfaceC2212 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ScrollFeedbackProvider f6479;

    public C2201(NestedScrollView nestedScrollView) {
        this.f6479 = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // androidx.core.view.InterfaceC2212
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f6479.onScrollLimit(i, i2, i3, z);
    }

    @Override // androidx.core.view.InterfaceC2212
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f6479.onScrollProgress(i, i2, i3, i4);
    }
}
