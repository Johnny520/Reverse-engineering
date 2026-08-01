package p000;

import com.github.megatronking.stringfog.Base64;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: p8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0588p8 {

    /* JADX INFO: renamed from: a */
    public final int f3680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3681b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CarouselLayoutManager f3682c;

    public C0588p8(int i) {
        this.f3680a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m2067a() {
        switch (this.f3681b) {
            case Base64.DEFAULT /* 0 */:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f3682c;
                if (carouselLayoutManager.m748z0()) {
                    return carouselLayoutManager.f3468n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0588p8(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f3681b = i;
        switch (i) {
            case Base64.NO_PADDING /* 1 */:
                this.f3682c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f3682c = carouselLayoutManager;
                break;
        }
    }
}
