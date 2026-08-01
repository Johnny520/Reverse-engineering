package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n8 extends defpackage.yq {
    public final /* synthetic */ int q;

    public /* synthetic */ n8(android.content.Context r2) {
            r1 = this;
            r0 = 1
            r1.q = r0
            r1.<init>(r2)
            return
    }

    public n8(com.google.android.material.carousel.CarouselLayoutManager r1, android.content.Context r2) {
            r0 = this;
            r1 = 0
            r0.q = r1
            r0.<init>(r2)
            return
    }

    @Override // defpackage.yq
    public int b(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.q
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r2 = super.b(r2, r3)
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // defpackage.yq
    public int c(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.q
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r2 = super.c(r2, r3)
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // defpackage.yq
    public float d(android.util.DisplayMetrics r2) {
            r1 = this;
            int r0 = r1.q
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            float r2 = super.d(r2)
            return r2
        La:
            int r2 = r2.densityDpi
            float r2 = (float) r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r2
            return r0
    }

    @Override // defpackage.yq
    public android.graphics.PointF f(int r2) {
            r1 = this;
            int r0 = r1.q
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            android.graphics.PointF r2 = super.f(r2)
            return r2
        La:
            r2 = 0
            return r2
    }
}
