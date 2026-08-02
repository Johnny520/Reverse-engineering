package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class me0 extends ke0 implements dx0 {
    public final double t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public me0(double d) {
        this.t = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp0
    public final int D(mj0 mj0Var) {
        mj0Var.m(1);
        double d = this.t;
        if (d != 0.0d) {
            mj0Var.k(8, 0);
            ByteBuffer byteBuffer = mj0Var.a;
            int i = mj0Var.b - 8;
            mj0Var.b = i;
            byteBuffer.putDouble(i, d);
            mj0Var.l(0);
        }
        int iG = mj0Var.g();
        mj0Var.i(iG);
        return iG;
    }
}
