package p072n0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: n0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1009d {

    /* JADX INFO: renamed from: a */
    public final int f3719a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CarouselLayoutManager f3721c;

    public C1009d(int i2) {
        this.f3719a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m2440a() {
        switch (this.f3720b) {
            case 0:
                return this.f3721c.f676j;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f3721c;
                return carouselLayoutManager.f676j - carouselLayoutManager.m818z();
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2441b() {
        switch (this.f3720b) {
            case 0:
                return this.f3721c.m772A();
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2442c() {
        switch (this.f3720b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f3721c;
                return carouselLayoutManager.f675i - carouselLayoutManager.m773B();
            default:
                return this.f3721c.f675i;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m2443d() {
        switch (this.f3720b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f3721c;
                if (carouselLayoutManager.m1866f0()) {
                    return carouselLayoutManager.f675i;
                }
                return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m2444e() {
        switch (this.f3720b) {
            case 0:
                return 0;
            default:
                return this.f3721c.m774C();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1009d(CarouselLayoutManager carouselLayoutManager, int i2) {
        this(1);
        this.f3720b = i2;
        switch (i2) {
            case 1:
                this.f3721c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f3721c = carouselLayoutManager;
                break;
        }
    }
}
