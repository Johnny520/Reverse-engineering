package p000;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: Kq */
/* JADX INFO: loaded from: classes.dex */
public final class C0463Kq extends AbstractC2251mv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0549Mq f1511a;

    public C0463Kq(C0549Mq r1) {
        this.f1511a = r1;
        AbstractC2407qD.m4845c(null);
        AbstractC2407qD.m4845c(null);
    }

    @Override // p000.AbstractC2251mv
    public final void onDraw(Canvas r1, RecyclerView r2, C0038Av r3) {
        if ((r2.getAdapter() instanceof C2139kG) == true) goto L5;
        return;
    L5:
        if ((r2.getLayoutManager() instanceof GridLayoutManager) == false) goto L10;
        C2139kG r12 = (C2139kG) r2.getAdapter();
        GridLayoutManager r13 = (GridLayoutManager) r2.getLayoutManager();
        this.f1511a.getClass();
        throw null;
    }
}
