package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3291 extends AbstractC3368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3294 f7656;

    public C3291(C3294 c3294) {
        this.f7656 = c3294;
    }

    @Override // androidx.recyclerview.widget.AbstractC3368
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo5411() {
        this.f7656.f7676.m5495();
    }

    @Override // androidx.recyclerview.widget.AbstractC3368
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo5412(int i, int i2) {
        C3294 c3294 = this.f7656;
        c3294.f7675 -= i2;
        C3325 c3325 = c3294.f7676;
        ((C3326) c3325.f7807).f7643.m5369(i + c3325.m5494(c3294), i2);
        if (c3294.f7675 >= 1 || c3294.f7677.f7641 != RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
            return;
        }
        c3325.m5495();
    }

    @Override // androidx.recyclerview.widget.AbstractC3368
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo5413(int i, int i2) {
        C3294 c3294 = this.f7656;
        C3325 c3325 = c3294.f7676;
        int iM5494 = c3325.m5494(c3294);
        ((C3326) c3325.f7807).m5363(i + iM5494, i2 + iM5494);
    }

    @Override // androidx.recyclerview.widget.AbstractC3368
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo5414(int i, int i2) {
        C3294 c3294 = this.f7656;
        c3294.f7675 += i2;
        C3325 c3325 = c3294.f7676;
        ((C3326) c3325.f7807).m5367(i + c3325.m5494(c3294), i2);
        if (c3294.f7675 <= 0 || c3294.f7677.f7641 != RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
            return;
        }
        c3325.m5495();
    }

    @Override // androidx.recyclerview.widget.AbstractC3368
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo5415(Object obj, int i, int i2) {
        C3294 c3294 = this.f7656;
        C3325 c3325 = c3294.f7676;
        ((C3326) c3325.f7807).f7643.m5371(obj, i + c3325.m5494(c3294), i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC3368
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo5416() {
        C3294 c3294 = this.f7656;
        c3294.f7675 = c3294.f7677.mo5354();
        C3325 c3325 = c3294.f7676;
        ((C3326) c3325.f7807).m5351();
        c3325.m5495();
    }
}
