package com.google.android.material.carousel;

/* JADX INFO: renamed from: com.google.android.material.carousel.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3103 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ CarouselLayoutManager f10178;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f10179;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f10180;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3103(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f10179 = i;
        switch (i) {
            case 1:
                this.f10178 = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f10178 = carouselLayoutManager;
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m7082() {
        switch (this.f10179) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f10178;
                if (carouselLayoutManager.m7080()) {
                    return carouselLayoutManager.f7581;
                }
                return 0;
        }
    }

    public C3103(int i) {
        this.f10180 = i;
    }
}
