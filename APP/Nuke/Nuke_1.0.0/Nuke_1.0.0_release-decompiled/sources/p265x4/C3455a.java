package p265x4;

import java.nio.ByteBuffer;
import p117X2.AbstractC1665j;
import p206n2.AbstractC2691c;

/* JADX INFO: renamed from: x4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3455a extends AbstractC2691c {
    /* JADX INFO: renamed from: g */
    public C3457c m5705g(int i5) {
        C3457c c3457c = new C3457c();
        int iM4685b = m4685b(4);
        if (iM4685b == 0) {
            return null;
        }
        int iM4684a = m4684a((i5 * 4) + m4688e(iM4685b));
        ByteBuffer byteBuffer = this.f8592b;
        AbstractC1665j.m2984d(byteBuffer, "bb");
        c3457c.m4686c(iM4684a, byteBuffer);
        return c3457c;
    }

    /* JADX INFO: renamed from: h */
    public int m5706h() {
        int iM4685b = m4685b(4);
        if (iM4685b != 0) {
            return m4689f(iM4685b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public C3470p m5707i(int i5) {
        C3470p c3470p = new C3470p();
        int iM4685b = m4685b(4);
        if (iM4685b == 0) {
            return null;
        }
        int iM4684a = m4684a((i5 * 4) + m4688e(iM4685b));
        ByteBuffer byteBuffer = this.f8592b;
        AbstractC1665j.m2984d(byteBuffer, "bb");
        c3470p.m4686c(iM4684a, byteBuffer);
        return c3470p;
    }

    /* JADX INFO: renamed from: j */
    public AbstractC2691c m5708j(AbstractC2691c abstractC2691c) {
        int iM4685b = m4685b(8);
        if (iM4685b == 0) {
            return null;
        }
        int i5 = iM4685b + this.f8591a;
        ByteBuffer byteBuffer = this.f8592b;
        abstractC2691c.m4686c(byteBuffer.getInt(i5) + i5, byteBuffer);
        return abstractC2691c;
    }
}
