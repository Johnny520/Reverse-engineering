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

    public C1009d(int r1) {
        this.f3719a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final int m2440a() {
        switch(this.f3720b) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        CarouselLayoutManager r02 = this.f3721c;
        return r02.f676j - r02.m818z();
    L7:
        return this.f3721c.f676j;
    }

    /* JADX INFO: renamed from: b */
    public final int m2441b() {
        switch(this.f3720b) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        return 0;
    L7:
        return this.f3721c.m772A();
    }

    /* JADX INFO: renamed from: c */
    public final int m2442c() {
        switch(this.f3720b) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        CarouselLayoutManager r02 = this.f3721c;
        return r02.f675i - r02.m773B();
    L5:
        return this.f3721c.f675i;
    }

    /* JADX INFO: renamed from: d */
    public final int m2443d() {
        switch(this.f3720b) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        CarouselLayoutManager r02 = this.f3721c;
        if (r02.m1866f0() == true) goto L11;
        return 0;
    L11:
        return r02.f675i;
    L9:
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m2444e() {
        switch(this.f3720b) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return 0;
    L5:
        return this.f3721c.m774C();
    }

    public C1009d(CarouselLayoutManager r1, int r2) {
        this.f3720b = r2;
        switch(r2) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.f3721c = r1;
        this(1);
        return;
    L6:
        this.f3721c = r1;
        this(0);
    }
}
