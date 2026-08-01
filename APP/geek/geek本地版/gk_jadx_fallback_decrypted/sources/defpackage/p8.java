package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p8 {
    public final int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ com.google.android.material.carousel.CarouselLayoutManager c;

    public p8(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public p8(com.google.android.material.carousel.CarouselLayoutManager r1, int r2) {
            r0 = this;
            r0.b = r2
            switch(r2) {
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            r0.c = r1
            r1 = 1
            r0.<init>(r1)
            return
        Lc:
            r0.c = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    public final int a() {
            r2 = this;
            int r0 = r2.b
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            com.google.android.material.carousel.CarouselLayoutManager r0 = r2.c
            boolean r1 = r0.z0()
            if (r1 == 0) goto L10
            int r0 = r0.n
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
        L12:
            r0 = 0
            return r0
    }
}
