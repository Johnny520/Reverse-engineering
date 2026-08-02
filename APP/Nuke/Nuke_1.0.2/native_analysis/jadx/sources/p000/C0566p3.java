package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: p3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0566p3 extends qp0 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int f7955t;

    /* JADX INFO: renamed from: u */
    public int f7956u;

    /* JADX INFO: renamed from: v */
    public int f7957v;

    public /* synthetic */ C0566p3(int i) {
        this.f7955t = i;
    }

    @Override // p000.qp0
    /* JADX INFO: renamed from: D */
    public final int mo170D(mj0 mj0Var) {
        byte b;
        switch (this.f7955t) {
            case 0:
                int i = this.f7956u;
                int i2 = this.f7957v;
                if (i2 == 1) {
                    b = 0;
                } else {
                    if (i2 != 2) {
                        throw null;
                    }
                    b = 1;
                }
                mj0Var.m3122m(2);
                mj0Var.m3120k(4, 0);
                ByteBuffer byteBuffer = mj0Var.f6673a;
                int i3 = mj0Var.f6674b - 4;
                mj0Var.f6674b = i3;
                byteBuffer.putInt(i3, i);
                mj0Var.m3121l(0);
                if (b != 0) {
                    mj0Var.m3110a(b);
                    mj0Var.m3121l(1);
                }
                int iM3116g = mj0Var.m3116g();
                mj0Var.m3118i(iM3116g);
                return iM3116g;
            default:
                int i4 = this.f7956u;
                int i5 = this.f7957v;
                mj0Var.m3122m(2);
                if (i5 != 0) {
                    mj0Var.m3120k(4, 0);
                    ByteBuffer byteBuffer2 = mj0Var.f6673a;
                    int i6 = mj0Var.f6674b - 4;
                    mj0Var.f6674b = i6;
                    byteBuffer2.putInt(i6, i5);
                    mj0Var.m3121l(1);
                }
                if (i4 != 0) {
                    mj0Var.m3120k(4, 0);
                    ByteBuffer byteBuffer3 = mj0Var.f6673a;
                    int i7 = mj0Var.f6674b - 4;
                    mj0Var.f6674b = i7;
                    byteBuffer3.putInt(i7, i4);
                    mj0Var.m3121l(0);
                }
                int iM3116g2 = mj0Var.m3116g();
                mj0Var.m3118i(iM3116g2);
                return iM3116g2;
        }
    }
}
