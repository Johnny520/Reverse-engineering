package p000;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: W6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0952W6 extends AbstractC0887Ul {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2981d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CarouselLayoutManager f2982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0952W6(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1);
        this.f2981d = i;
        switch (i) {
            case 1:
                this.f2982e = carouselLayoutManager;
                super(0);
                break;
            default:
                this.f2982e = carouselLayoutManager;
                break;
        }
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: e */
    public final int mo1736e() {
        switch (this.f2981d) {
            case 0:
                return this.f2982e.getHeight();
            default:
                CarouselLayoutManager carouselLayoutManager = this.f2982e;
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
        }
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: f */
    public final int mo1737f() {
        switch (this.f2981d) {
            case 0:
                return this.f2982e.getPaddingLeft();
            default:
                return 0;
        }
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: g */
    public final int mo1738g() {
        switch (this.f2981d) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f2982e;
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            default:
                return this.f2982e.getWidth();
        }
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: h */
    public final int mo1739h() {
        switch (this.f2981d) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f2982e;
                if (carouselLayoutManager.m2459f()) {
                    return carouselLayoutManager.getWidth();
                }
                return 0;
        }
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: i */
    public final int mo1740i() {
        switch (this.f2981d) {
            case 0:
                return 0;
            default:
                return this.f2982e.getPaddingTop();
        }
    }
}
