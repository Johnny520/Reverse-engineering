package p000a;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C1284c;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: renamed from: a.Ga */
/* JADX INFO: loaded from: classes.dex */
public final class C0121Ga extends RecyclerView.AbstractC1174k {

    /* JADX INFO: renamed from: a */
    public final Calendar f386a = C0467Zf.m1139e(null);

    /* JADX INFO: renamed from: b */
    public final Calendar f387b = C0467Zf.m1139e(null);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1284c f388c;

    public C0121Ga(C1284c c1284c) {
        this.f388c = c1284c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1174k
    /* JADX INFO: renamed from: c */
    public final void mo312c(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof C0037Bh) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            Iterator<C0729nc<Long, Long>> it = this.f388c.f5692X.m427e().iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw null;
            }
        }
    }
}
