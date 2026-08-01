package p000;

import com.github.megatronking.stringfog.Base64;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: a9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0010a9 {

    /* JADX INFO: renamed from: a */
    public final int f52a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f53b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CarouselLayoutManager f54c;

    public C0010a9(int i) {
        this.f52a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m34a() {
        switch (this.f53b) {
            case Base64.DEFAULT /* 0 */:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f54c;
                if (carouselLayoutManager.m706z0()) {
                    return carouselLayoutManager.f4868n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0010a9(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f53b = i;
        switch (i) {
            case Base64.NO_PADDING /* 1 */:
                this.f54c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f54c = carouselLayoutManager;
                break;
        }
    }
}
