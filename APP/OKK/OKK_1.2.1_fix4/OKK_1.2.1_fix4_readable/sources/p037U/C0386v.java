package p037U;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: U.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0386v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f875a;

    public /* synthetic */ C0386v(RecyclerView recyclerView) {
        this.f875a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public void m977a(int i2) {
        RecyclerView recyclerView = this.f875a;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            RecyclerView.m1301u(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i2);
    }
}
