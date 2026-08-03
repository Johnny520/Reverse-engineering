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

    public C0420Jq(C0549Mq r1, int r2, int r3) {
        this.f1402b = r1;
        this.f1401a = r3;
        super(r2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(C0038Av r4, int[] r5) {
        int r42 = this.f1401a;
        C0549Mq r2 = this.f1402b;
        if (r42 != 0) goto L6;
        r5[0] = r2.f1780a0.getWidth();
        r5[1] = r2.f1780a0.getWidth();
        return;
    L6:
        r5[0] = r2.f1780a0.getHeight();
        r5[1] = r2.f1780a0.getHeight();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final void smoothScrollToPosition(RecyclerView r1, C0038Av r2, int r3) {
        C0866U6 r22 = new C0866U6(r1.getContext());
        r22.setTargetPosition(r3);
        startSmoothScroll(r22);
    }
}
