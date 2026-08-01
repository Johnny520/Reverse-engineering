package com.google.android.material.carousel;

/* JADX INFO: renamed from: com.google.android.material.carousel.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3935 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ CarouselLayoutManager f10523;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f10524;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f10525;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3935(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f10524 = i;
        switch (i) {
            case 1:
                this.f10523 = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f10523 = carouselLayoutManager;
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m7641() {
        switch (this.f10524) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f10523;
                if (carouselLayoutManager.m7639()) {
                    return carouselLayoutManager.f7926;
                }
                return 0;
        }
    }

    public C3935(int i) {
        this.f10525 = i;
    }
}
