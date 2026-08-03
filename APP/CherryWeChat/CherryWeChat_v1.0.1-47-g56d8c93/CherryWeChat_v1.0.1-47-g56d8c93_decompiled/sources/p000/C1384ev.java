package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: ev */
/* JADX INFO: loaded from: classes.dex */
public final class C1384ev implements InterfaceC2451rE, InterfaceC2165kv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f4930a;

    /* JADX INFO: renamed from: a */
    public void m2670a(int i) {
        RecyclerView recyclerView = this.f4930a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
