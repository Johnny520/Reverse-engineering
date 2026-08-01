package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dz implements android.view.animation.Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ dz(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L5;
                default: goto L5;
            }
        L5:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r0
            float r1 = r3 * r3
            float r1 = r1 * r3
            float r1 = r1 * r3
            float r1 = r1 * r3
            float r1 = r1 + r0
            return r1
    }
}
