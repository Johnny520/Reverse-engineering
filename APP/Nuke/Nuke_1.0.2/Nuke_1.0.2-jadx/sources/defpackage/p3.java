package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p3 extends qp0 {
    public final /* synthetic */ int t;
    public int u;
    public int v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [nx0.j(java.lang.Object):java.lang.Object, yg1.c0(yg1, int):void, yg1.d0(int):void] */
    public /* synthetic */ p3(int i) {
        this.t = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp0
    public final int D(mj0 mj0Var) {
        byte b;
        switch (this.t) {
            case 0:
                int i = this.u;
                int i2 = this.v;
                if (i2 == 1) {
                    b = 0;
                } else {
                    if (i2 != 2) {
                        throw null;
                    }
                    b = 1;
                }
                mj0Var.m(2);
                mj0Var.k(4, 0);
                ByteBuffer byteBuffer = mj0Var.a;
                int i3 = mj0Var.b - 4;
                mj0Var.b = i3;
                byteBuffer.putInt(i3, i);
                mj0Var.l(0);
                if (b != 0) {
                    mj0Var.a(b);
                    mj0Var.l(1);
                }
                int iG = mj0Var.g();
                mj0Var.i(iG);
                return iG;
            default:
                int i4 = this.u;
                int i5 = this.v;
                mj0Var.m(2);
                if (i5 != 0) {
                    mj0Var.k(4, 0);
                    ByteBuffer byteBuffer2 = mj0Var.a;
                    int i6 = mj0Var.b - 4;
                    mj0Var.b = i6;
                    byteBuffer2.putInt(i6, i5);
                    mj0Var.l(1);
                }
                if (i4 != 0) {
                    mj0Var.k(4, 0);
                    ByteBuffer byteBuffer3 = mj0Var.a;
                    int i7 = mj0Var.b - 4;
                    mj0Var.b = i7;
                    byteBuffer3.putInt(i7, i4);
                    mj0Var.l(0);
                }
                int iG2 = mj0Var.g();
                mj0Var.i(iG2);
                return iG2;
        }
    }
}
