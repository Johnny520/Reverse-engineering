package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Fl */
/* JADX INFO: loaded from: classes.dex */
public final class C0243Fl extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public final int f796l;

    /* JADX INFO: renamed from: m */
    public final int f797m;

    public C0243Fl(int i) {
        this.f796l = i;
        this.f797m = i;
    }

    /* JADX INFO: renamed from: N */
    public final int m515N(C0110Ch c0110Ch) {
        c0110Ch.m170i(2);
        int i = this.f797m;
        if (i != 0) {
            c0110Ch.m168g(4, 0);
            ByteBuffer byteBuffer = c0110Ch.f258a;
            int i2 = c0110Ch.f259b - 4;
            c0110Ch.f259b = i2;
            byteBuffer.putInt(i2, i);
            c0110Ch.f261d[1] = c0110Ch.m167f();
        }
        int i3 = this.f796l;
        if (i3 != 0) {
            c0110Ch.m168g(4, 0);
            ByteBuffer byteBuffer2 = c0110Ch.f258a;
            int i4 = c0110Ch.f259b - 4;
            c0110Ch.f259b = i4;
            byteBuffer2.putInt(i4, i3);
            c0110Ch.f261d[0] = c0110Ch.m167f();
        }
        int iM165d = c0110Ch.m165d();
        c0110Ch.m166e(iM165d);
        return iM165d;
    }
}
