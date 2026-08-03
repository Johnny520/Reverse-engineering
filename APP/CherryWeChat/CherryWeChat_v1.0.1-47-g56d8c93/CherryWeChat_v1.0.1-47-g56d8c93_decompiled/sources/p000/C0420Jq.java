package p000;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: Jq */
/* JADX INFO: loaded from: classes.dex */
public final class C0420Jq extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1401a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0549Mq f1402b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0420Jq(C0549Mq c0549Mq, int i, int i2) {
        super(i);
        this.f1402b = c0549Mq;
        this.f1401a = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(C0038Av c0038Av, int[] iArr) {
        int i = this.f1401a;
        C0549Mq c0549Mq = this.f1402b;
        if (i == 0) {
            iArr[0] = c0549Mq.f1780a0.getWidth();
            iArr[1] = c0549Mq.f1780a0.getWidth();
        } else {
            iArr[0] = c0549Mq.f1780a0.getHeight();
            iArr[1] = c0549Mq.f1780a0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final void smoothScrollToPosition(RecyclerView recyclerView, C0038Av c0038Av, int i) {
        C0866U6 c0866u6 = new C0866U6(recyclerView.getContext());
        c0866u6.setTargetPosition(i);
        startSmoothScroll(c0866u6);
    }
}
