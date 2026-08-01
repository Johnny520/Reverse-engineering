package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class rt extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ ut F;

    public rt(ut r1, int r2, int r3) {
        this.F = r1;
        this.E = r3;
        super(r2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final void v0(RecyclerView r2, int r3) {
        n8 r0 = new n8(r2.getContext());
        r0.a = r3;
        w0(r0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void y0(yz r4, int[] r5) {
        int r42 = this.E;
        ut r2 = this.F;
        if (r42 != 0) goto L6;
        r5[0] = r2.Y.getWidth();
        r5[1] = r2.Y.getWidth();
        return;
    L6:
        r5[0] = r2.Y.getHeight();
        r5[1] = r2.Y.getHeight();
    }
}
