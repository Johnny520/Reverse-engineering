package yyds;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: yyds.ᛵᛶᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1116 implements InterfaceC2053 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ScrollFeedbackProvider f5134;

    public C1116(NestedScrollView nestedScrollView) {
        this.f5134 = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // yyds.InterfaceC2053
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f5134.onScrollLimit(i, i2, i3, z);
    }

    @Override // yyds.InterfaceC2053
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f5134.onScrollProgress(i, i2, i3, i4);
    }
}
