package com.google.android.material.carousel;

/* JADX INFO: renamed from: com.google.android.material.carousel.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3102 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ CarouselLayoutManager f10173;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f10174;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f10175;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3102(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f10174 = i;
        switch (i) {
            case 1:
                this.f10173 = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f10173 = carouselLayoutManager;
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m7095() {
        switch (this.f10174) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f10173;
                if (carouselLayoutManager.m7093()) {
                    return carouselLayoutManager.f7580;
                }
                return 0;
        }
    }

    public C3102(int i) {
        this.f10175 = i;
    }
}
