package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class me0 extends ke0 implements dx0 {

    /* JADX INFO: renamed from: t */
    public final double f6583t;

    public me0(double d) {
        this.f6583t = d;
    }

    @Override // p000.qp0
    /* JADX INFO: renamed from: D */
    public final int mo170D(mj0 mj0Var) {
        mj0Var.m3122m(1);
        double d = this.f6583t;
        if (d != 0.0d) {
            mj0Var.m3120k(8, 0);
            ByteBuffer byteBuffer = mj0Var.f6673a;
            int i = mj0Var.f6674b - 8;
            mj0Var.f6674b = i;
            byteBuffer.putDouble(i, d);
            mj0Var.m3121l(0);
        }
        int iM3116g = mj0Var.m3116g();
        mj0Var.m3118i(iM3116g);
        return iM3116g;
    }
}
