package p249u4;

import java.nio.ByteBuffer;
import p179i4.AbstractC2352g;
import p206n2.C2690b;

/* JADX INFO: renamed from: u4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3346a extends AbstractC2352g {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.AbstractC2352g
    /* JADX INFO: renamed from: w */
    public final int mo4213w(C2690b c2690b) {
        c2690b.m4682l(2);
        c2690b.m4680j(4, 0);
        ByteBuffer byteBuffer = c2690b.f8578a;
        int i5 = c2690b.f8579b - 4;
        c2690b.f8579b = i5;
        byteBuffer.putInt(i5, 1);
        c2690b.m4681k(1);
        c2690b.m4680j(4, 0);
        ByteBuffer byteBuffer2 = c2690b.f8578a;
        int i6 = c2690b.f8579b - 4;
        c2690b.f8579b = i6;
        byteBuffer2.putInt(i6, 1);
        c2690b.m4681k(0);
        int iM4676f = c2690b.m4676f();
        c2690b.m4678h(iM4676f);
        return iM4676f;
    }
}
