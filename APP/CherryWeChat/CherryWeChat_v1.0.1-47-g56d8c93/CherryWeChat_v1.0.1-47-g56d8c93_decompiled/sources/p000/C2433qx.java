package p000;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: qx */
/* JADX INFO: loaded from: classes.dex */
public final class C2433qx implements InterfaceC2476rx {

    /* JADX INFO: renamed from: a */
    public final ScrollFeedbackProvider f8540a;

    public C2433qx(NestedScrollView nestedScrollView) {
        this.f8540a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // p000.InterfaceC2476rx
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f8540a.onScrollLimit(i, i2, i3, z);
    }

    @Override // p000.InterfaceC2476rx
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f8540a.onScrollProgress(i, i2, i3, i4);
    }
}
