package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class p8 {
    public final int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CarouselLayoutManager c;

    public p8(int r1) {
        this.a = r1;
    }

    public final int a() {
        switch(this.b) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        CarouselLayoutManager r0 = this.c;
        if (r0.z0() == true) goto L11;
        return 0;
    L11:
        return r0.n;
    L9:
        return 0;
    }

    public p8(CarouselLayoutManager r1, int r2) {
        this.b = r2;
        switch(r2) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.c = r1;
        this(1);
        return;
    L6:
        this.c = r1;
        this(0);
    }
}
