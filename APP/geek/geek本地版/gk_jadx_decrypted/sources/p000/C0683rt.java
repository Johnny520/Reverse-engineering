package p000;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: rt */
/* JADX INFO: loaded from: classes.dex */
public final class C0683rt extends LinearLayoutManager {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f4343E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C0794ut f4344F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0683rt(C0794ut c0794ut, int i, int i2) {
        super(i);
        this.f4344F = c0794ut;
        this.f4343E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0540nz
    /* JADX INFO: renamed from: v0 */
    public final void mo364v0(RecyclerView recyclerView, int i) {
        C0513n8 c0513n8 = new C0513n8(recyclerView.getContext());
        c0513n8.f5379a = i;
        m1981w0(c0513n8);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: y0 */
    public final void mo365y0(C0948yz c0948yz, int[] iArr) {
        int i = this.f4343E;
        C0794ut c0794ut = this.f4344F;
        if (i == 0) {
            iArr[0] = c0794ut.f4766Y.getWidth();
            iArr[1] = c0794ut.f4766Y.getWidth();
        } else {
            iArr[0] = c0794ut.f4766Y.getHeight();
            iArr[1] = c0794ut.f4766Y.getHeight();
        }
    }
}
