package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: By */
/* JADX INFO: loaded from: classes.dex */
public final class C0084By extends AbstractC2603uv {

    /* JADX INFO: renamed from: a */
    public boolean f192a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0127Cy f193b;

    public C0084By(AbstractC0127Cy abstractC0127Cy) {
        this.f193b = abstractC0127Cy;
    }

    @Override // p000.AbstractC2603uv
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f192a) {
            this.f192a = false;
            this.f193b.snapToTargetExistingView();
        }
    }

    @Override // p000.AbstractC2603uv
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f192a = true;
    }
}
