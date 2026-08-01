package defpackage;

/* JADX INFO: renamed from: ᛵᛳᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC0846 implements android.view.animation.Interpolator {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f3871;

    public /* synthetic */ InterpolatorC0846(int r1) {
            r0 = this;
            r0.f3871 = r1
            r0.<init>()
            return
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r2) {
            r1 = this;
            int r1 = r1.f3871
            switch(r1) {
                case 0: goto Lf;
                case 1: goto L5;
                default: goto L5;
            }
        L5:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r1
            float r0 = r2 * r2
            float r0 = r0 * r2
            float r0 = r0 * r2
            float r0 = r0 * r2
            float r0 = r0 + r1
            return r0
        Lf:
            float r1 = r2 * r2
            float r1 = r1 * r2
            float r1 = r1 * r2
            float r1 = r1 * r2
            return r1
    }
}
