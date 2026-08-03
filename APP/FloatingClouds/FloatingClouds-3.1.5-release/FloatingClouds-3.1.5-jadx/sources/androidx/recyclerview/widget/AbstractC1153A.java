package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1153A extends RecyclerView.AbstractC1177n {

    /* JADX INFO: renamed from: a */
    public RecyclerView f4740a;

    /* JADX INFO: renamed from: b */
    public final a f4741b = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.A$a */
    public class a extends RecyclerView.AbstractC1179p {

        /* JADX INFO: renamed from: a */
        public boolean f4742a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1179p
        /* JADX INFO: renamed from: a */
        public final void mo439a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.f4742a) {
                this.f4742a = false;
                AbstractC1153A.this.m2633b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1179p
        /* JADX INFO: renamed from: b */
        public final void mo440b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f4742a = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int[] mo2632a(RecyclerView.AbstractC1175l abstractC1175l, View view);

    /* JADX INFO: renamed from: b */
    public final void m2633b() {
        RecyclerView.AbstractC1175l layoutManager;
        RecyclerView recyclerView = this.f4740a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        C1216u c1216u = (C1216u) this;
        View viewM2995d = layoutManager.mo2716e() ? C1216u.m2995d(layoutManager, c1216u.m2997f(layoutManager)) : layoutManager.mo2714d() ? C1216u.m2995d(layoutManager, c1216u.m2996e(layoutManager)) : null;
        if (viewM2995d == null) {
            return;
        }
        int[] iArrMo2632a = mo2632a(layoutManager, viewM2995d);
        int i = iArrMo2632a[0];
        if (i == 0 && iArrMo2632a[1] == 0) {
            return;
        }
        this.f4740a.m2774g0(i, iArrMo2632a[1], false);
    }
}
