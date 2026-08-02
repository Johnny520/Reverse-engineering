package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class em2 implements kl2 {
    public final /* synthetic */ im2 a;
    public final /* synthetic */ gm2 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public em2(im2 im2Var, gm2 gm2Var) {
        this.a = im2Var;
        this.b = gm2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kl2
    public final float a(float f) {
        float fAbs = Math.abs(f);
        im2 im2Var = this.a;
        if (fAbs != 0.0f && !((Boolean) im2Var.h.a()).booleanValue()) {
            throw new qj0("The fling animation was cancelled", 0);
        }
        return im2Var.d(im2Var.g(this.b.a(im2Var.e(im2Var.h(f)), 2)));
    }
}
