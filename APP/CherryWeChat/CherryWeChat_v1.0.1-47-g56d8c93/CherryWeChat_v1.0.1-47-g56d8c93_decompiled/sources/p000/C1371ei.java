package p000;

import android.view.View;

/* JADX INFO: renamed from: ei */
/* JADX INFO: loaded from: classes.dex */
public final class C1371ei extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AbstractComponentCallbacksC1503hi f4904l;

    public C1371ei(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        this.f4904l = abstractComponentCallbacksC1503hi;
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: y */
    public final View mo852y(int i) {
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f4904l;
        View view = abstractComponentCallbacksC1503hi.f5296E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC1503hi + " does not have a view");
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: z */
    public final boolean mo853z() {
        return this.f4904l.f5296E != null;
    }
}
