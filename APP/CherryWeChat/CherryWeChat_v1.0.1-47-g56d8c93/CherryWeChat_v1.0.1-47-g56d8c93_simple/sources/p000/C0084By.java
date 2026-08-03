package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: By */
/* JADX INFO: loaded from: classes.dex */
public final class C0084By extends AbstractC2603uv {

    /* JADX INFO: renamed from: a */
    public boolean f192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0127Cy f193b;

    public C0084By(AbstractC0127Cy r1) {
        this.f193b = r1;
        this.f192a = false;
    }

    @Override // p000.AbstractC2603uv
    public final void onScrollStateChanged(RecyclerView r1, int r2) {
        if (r2 == 0) goto L4;
        return;
    L4:
        if (this.f192a == false) goto L8;
        this.f192a = false;
        this.f193b.snapToTargetExistingView();
        return;
    }

    @Override // p000.AbstractC2603uv
    public final void onScrolled(RecyclerView r1, int r2, int r3) {
        if (r2 != 0) goto L6;
        if (r3 != 0) goto L6;
        return;
    L6:
        this.f192a = true;
    }
}
