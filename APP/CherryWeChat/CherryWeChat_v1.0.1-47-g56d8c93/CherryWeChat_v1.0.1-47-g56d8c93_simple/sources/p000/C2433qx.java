package p000;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: qx */
/* JADX INFO: loaded from: classes.dex */
public final class C2433qx implements InterfaceC2476rx {

    /* JADX INFO: renamed from: a */
    public final ScrollFeedbackProvider f8540a;

    public C2433qx(NestedScrollView r1) {
        this.f8540a = ScrollFeedbackProvider.createProvider(r1);
    }

    @Override // p000.InterfaceC2476rx
    public final void onScrollLimit(int r2, int r3, int r4, boolean r5) {
        this.f8540a.onScrollLimit(r2, r3, r4, r5);
    }

    @Override // p000.InterfaceC2476rx
    public final void onScrollProgress(int r2, int r3, int r4, int r5) {
        this.f8540a.onScrollProgress(r2, r3, r4, r5);
    }
}
