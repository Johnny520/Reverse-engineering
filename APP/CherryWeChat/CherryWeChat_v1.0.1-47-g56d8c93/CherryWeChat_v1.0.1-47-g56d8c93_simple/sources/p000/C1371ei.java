package p000;

import android.view.View;

/* JADX INFO: renamed from: ei */
/* JADX INFO: loaded from: classes.dex */
public final class C1371ei extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AbstractComponentCallbacksC1503hi f4904l;

    public C1371ei(AbstractComponentCallbacksC1503hi r1) {
        this.f4904l = r1;
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: y */
    public final View mo852y(int r4) {
        AbstractComponentCallbacksC1503hi r0 = this.f4904l;
        View r1 = r0.f5296E;
        if (r1 == null) goto L7;
        return r1.findViewById(r4);
    L7:
        throw new IllegalStateException("Fragment " + r0 + " does not have a view");
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: z */
    public final boolean mo853z() {
        if (this.f4904l.f5296E == null) goto L6;
        return true;
    L6:
        return false;
    }
}
