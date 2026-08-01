package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2458 extends AbstractC2535 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2461 f7311;

    public C2458(C2461 c2461) {
        this.f7311 = c2461;
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo4851() {
        this.f7311.f7331.m4935();
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo4852(int i, int i2) {
        C2461 c2461 = this.f7311;
        c2461.f7330 -= i2;
        C2492 c2492 = c2461.f7331;
        ((C2493) c2492.f7462).f7298.m4809(i + c2492.m4934(c2461), i2);
        if (c2461.f7330 >= 1 || c2461.f7332.f7296 != RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
            return;
        }
        c2492.m4935();
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo4853(int i, int i2) {
        C2461 c2461 = this.f7311;
        C2492 c2492 = c2461.f7331;
        int iM4934 = c2492.m4934(c2461);
        ((C2493) c2492.f7462).m4803(i + iM4934, i2 + iM4934);
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo4854(int i, int i2) {
        C2461 c2461 = this.f7311;
        c2461.f7330 += i2;
        C2492 c2492 = c2461.f7331;
        ((C2493) c2492.f7462).m4807(i + c2492.m4934(c2461), i2);
        if (c2461.f7330 <= 0 || c2461.f7332.f7296 != RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
            return;
        }
        c2492.m4935();
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo4855(Object obj, int i, int i2) {
        C2461 c2461 = this.f7311;
        C2492 c2492 = c2461.f7331;
        ((C2493) c2492.f7462).f7298.m4811(obj, i + c2492.m4934(c2461), i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo4856() {
        C2461 c2461 = this.f7311;
        c2461.f7330 = c2461.f7332.mo4794();
        C2492 c2492 = c2461.f7331;
        ((C2493) c2492.f7462).m4791();
        c2492.m4935();
    }
}
