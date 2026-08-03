package p000;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: W6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0952W6 extends AbstractC0887Ul {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2981d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CarouselLayoutManager f2982e;

    public C0952W6(CarouselLayoutManager r1, int r2) {
        this.f2981d = r2;
        switch(r2) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.f2982e = r1;
        super(1);
        return;
    L6:
        this.f2982e = r1;
        super(0);
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: e */
    public final int mo1736e() {
        switch(this.f2981d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        CarouselLayoutManager r0 = this.f2982e;
        return r0.getHeight() - r0.getPaddingBottom();
    L7:
        return this.f2982e.getHeight();
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: f */
    public final int mo1737f() {
        switch(this.f2981d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        return 0;
    L7:
        return this.f2982e.getPaddingLeft();
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: g */
    public final int mo1738g() {
        switch(this.f2981d) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        CarouselLayoutManager r0 = this.f2982e;
        return r0.getWidth() - r0.getPaddingRight();
    L5:
        return this.f2982e.getWidth();
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: h */
    public final int mo1739h() {
        switch(this.f2981d) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        CarouselLayoutManager r0 = this.f2982e;
        if (r0.m2459f() == true) goto L11;
        return 0;
    L11:
        return r0.getWidth();
    L9:
        return 0;
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: i */
    public final int mo1740i() {
        switch(this.f2981d) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return 0;
    L5:
        return this.f2982e.getPaddingTop();
    }
}
