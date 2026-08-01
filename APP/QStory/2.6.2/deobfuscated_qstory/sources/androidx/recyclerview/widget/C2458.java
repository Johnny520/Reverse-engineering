package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2458 extends AbstractC2535 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2461 f7310;

    public C2458(C2461 c2461) {
        this.f7310 = c2461;
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo4841() {
        this.f7310.f7330.m4925();
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo4842(int i, int i2) {
        C2461 c2461 = this.f7310;
        c2461.f7329 -= i2;
        C2492 c2492 = c2461.f7330;
        ((C2493) c2492.f7461).f7297.m4799(i + c2492.m4924(c2461), i2);
        if (c2461.f7329 >= 1 || c2461.f7331.f7295 != RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
            return;
        }
        c2492.m4925();
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo4843(int i, int i2) {
        C2461 c2461 = this.f7310;
        C2492 c2492 = c2461.f7330;
        int iM4924 = c2492.m4924(c2461);
        ((C2493) c2492.f7461).m4793(i + iM4924, i2 + iM4924);
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo4844(int i, int i2) {
        C2461 c2461 = this.f7310;
        c2461.f7329 += i2;
        C2492 c2492 = c2461.f7330;
        ((C2493) c2492.f7461).m4797(i + c2492.m4924(c2461), i2);
        if (c2461.f7329 <= 0 || c2461.f7331.f7295 != RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
            return;
        }
        c2492.m4925();
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo4845(Object obj, int i, int i2) {
        C2461 c2461 = this.f7310;
        C2492 c2492 = c2461.f7330;
        ((C2493) c2492.f7461).f7297.m4801(obj, i + c2492.m4924(c2461), i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo4846() {
        C2461 c2461 = this.f7310;
        c2461.f7329 = c2461.f7331.mo4784();
        C2492 c2492 = c2461.f7330;
        ((C2493) c2492.f7461).m4781();
        c2492.m4925();
    }
}
