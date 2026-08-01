package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class st extends kz {
    @Override // defpackage.kz
    public final void a(RecyclerView r2) {
        if ((r2.getAdapter() instanceof fd0) == true) goto L5;
        return;
    L5:
        if ((r2.getLayoutManager() instanceof GridLayoutManager) == false) goto L10;
        fd0 r0 = (fd0) r2.getAdapter();
        GridLayoutManager r22 = (GridLayoutManager) r2.getLayoutManager();
        throw null;
    }
}
