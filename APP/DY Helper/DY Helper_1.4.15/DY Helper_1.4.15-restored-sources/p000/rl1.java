package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rl1 implements android.view.animation.Interpolator {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9400;

    public /* synthetic */ rl1(int r1) {
            r0 = this;
            r0.f9400 = r1
            r0.<init>()
            return
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r2) {
            r1 = this;
            int r1 = r1.f9400
            switch(r1) {
                case 0: goto L5;
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
    }
}
