package p243t4;

import java.nio.ByteBuffer;
import p206n2.C2690b;

/* JADX INFO: renamed from: t4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3226f extends AbstractC3222b {

    /* JADX INFO: renamed from: b */
    public final int f10012b;

    public C3226f(int i5) {
        this.f10012b = i5;
    }

    @Override // p179i4.AbstractC2352g
    /* JADX INFO: renamed from: w */
    public final int mo4213w(C2690b c2690b) {
        c2690b.m4682l(1);
        int i5 = this.f10012b;
        if (i5 != 0) {
            c2690b.m4680j(4, 0);
            ByteBuffer byteBuffer = c2690b.f8578a;
            int i6 = c2690b.f8579b - 4;
            c2690b.f8579b = i6;
            byteBuffer.putInt(i6, i5);
            c2690b.m4681k(0);
        }
        int iM4676f = c2690b.m4676f();
        c2690b.m4678h(iM4676f);
        return iM4676f;
    }
}
