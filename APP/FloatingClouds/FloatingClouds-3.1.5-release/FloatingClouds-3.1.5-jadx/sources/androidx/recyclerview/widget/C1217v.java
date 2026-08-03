package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1217v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f5197a;

    public C1217v(RecyclerView recyclerView) {
        this.f5197a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public final void m2998a(int i) {
        RecyclerView recyclerView = this.f5197a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.m2735L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
