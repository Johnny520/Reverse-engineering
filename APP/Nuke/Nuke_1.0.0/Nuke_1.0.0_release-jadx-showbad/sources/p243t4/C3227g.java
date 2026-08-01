package p243t4;

import java.nio.ByteBuffer;
import p206n2.C2690b;

/* JADX INFO: renamed from: t4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3227g extends AbstractC3222b {

    /* JADX INFO: renamed from: b */
    public final long f10013b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3227g(long j5) {
        this.f10013b = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.AbstractC2352g
    /* JADX INFO: renamed from: w */
    public final int mo4213w(C2690b c2690b) {
        c2690b.m4682l(1);
        long j5 = this.f10013b;
        if (j5 != 0) {
            c2690b.m4680j(8, 0);
            ByteBuffer byteBuffer = c2690b.f8578a;
            int i5 = c2690b.f8579b - 8;
            c2690b.f8579b = i5;
            byteBuffer.putLong(i5, j5);
            c2690b.m4681k(0);
        }
        int iM4676f = c2690b.m4676f();
        c2690b.m4678h(iM4676f);
        return iM4676f;
    }
}
