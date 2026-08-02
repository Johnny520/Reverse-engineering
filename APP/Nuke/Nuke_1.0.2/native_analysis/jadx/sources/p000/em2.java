package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class em2 implements kl2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ im2 f2513a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gm2 f2514b;

    public em2(im2 im2Var, gm2 gm2Var) {
        this.f2513a = im2Var;
        this.f2514b = gm2Var;
    }

    @Override // p000.kl2
    /* JADX INFO: renamed from: a */
    public final float mo963a(float f) {
        float fAbs = Math.abs(f);
        im2 im2Var = this.f2513a;
        if (fAbs != 0.0f && !((Boolean) im2Var.f4694h.mo6a()).booleanValue()) {
            throw new qj0("The fling animation was cancelled", 0);
        }
        return im2Var.m2367d(im2Var.m2370g(this.f2514b.m1940a(im2Var.m2368e(im2Var.m2371h(f)), 2)));
    }
}
