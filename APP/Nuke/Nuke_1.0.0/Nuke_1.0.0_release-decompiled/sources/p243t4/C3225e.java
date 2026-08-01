package p243t4;

import java.nio.ByteBuffer;
import p206n2.C2690b;

/* JADX INFO: renamed from: t4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3225e extends AbstractC3222b {

    /* JADX INFO: renamed from: b */
    public final float f10011b;

    public C3225e(float f2) {
        this.f10011b = f2;
    }

    @Override // p179i4.AbstractC2352g
    /* JADX INFO: renamed from: w */
    public final int mo4213w(C2690b c2690b) {
        c2690b.m4682l(1);
        float f2 = this.f10011b;
        if (f2 != 0.0d) {
            c2690b.m4680j(4, 0);
            ByteBuffer byteBuffer = c2690b.f8578a;
            int i5 = c2690b.f8579b - 4;
            c2690b.f8579b = i5;
            byteBuffer.putFloat(i5, f2);
            c2690b.m4681k(0);
        }
        int iM4676f = c2690b.m4676f();
        c2690b.m4678h(iM4676f);
        return iM4676f;
    }
}
