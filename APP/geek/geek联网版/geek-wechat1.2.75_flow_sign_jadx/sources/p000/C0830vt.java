package p000;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: vt */
/* JADX INFO: loaded from: classes.dex */
public final class C0830vt extends LinearLayoutManager {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f5002E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C0942yt f5003F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0830vt(C0942yt c0942yt, int i, int i2) {
        super(i);
        this.f5003F = c0942yt;
        this.f5002E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0799uz
    /* JADX INFO: renamed from: v0 */
    public final void mo349v0(RecyclerView recyclerView, int i) {
        C0921y8 c0921y8 = new C0921y8(recyclerView.getContext());
        c0921y8.f1236a = i;
        m2529w0(c0921y8);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: y0 */
    public final void mo350y0(f00 f00Var, int[] iArr) {
        int i = this.f5002E;
        C0942yt c0942yt = this.f5003F;
        if (i == 0) {
            iArr[0] = c0942yt.f5498Y.getWidth();
            iArr[1] = c0942yt.f5498Y.getWidth();
        } else {
            iArr[0] = c0942yt.f5498Y.getHeight();
            iArr[1] = c0942yt.f5498Y.getHeight();
        }
    }
}
