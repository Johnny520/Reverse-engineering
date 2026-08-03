package p000a;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: a.ve */
/* JADX INFO: loaded from: classes.dex */
public final class C0883ve extends AbstractC0472a2 {

    /* JADX INFO: renamed from: a */
    public final String f3458a;

    /* JADX INFO: renamed from: b */
    public int f3459b;

    /* JADX INFO: renamed from: c */
    public final boolean f3460c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0883ve() {
        this.f3459b = 1;
    }

    @Override // p000a.AbstractC0472a2
    /* JADX INFO: renamed from: b */
    public final int mo1150b(C0026B6 c0026b6) {
        String str = this.f3458a;
        if (str == null) {
            throw new IllegalArgumentException("value must be specified");
        }
        if (str.length() == 0 && this.f3459b != 5) {
            this.f3459b = 5;
        }
        int iM62c = c0026b6.m62c(str);
        int i = this.f3459b;
        byte b = 1;
        if (i != 1) {
            byte b2 = 2;
            if (i != 2) {
                b = 3;
                if (i != 3) {
                    b2 = 4;
                    if (i != 4) {
                        if (i != 5) {
                            throw null;
                        }
                        b = b2;
                    }
                } else {
                    b = b2;
                }
            }
        } else {
            b = 0;
        }
        c0026b6.m68i(3);
        c0026b6.m60a(0, iM62c);
        boolean z = this.f3460c;
        if (z) {
            c0026b6.m67h(1, 0);
            ByteBuffer byteBuffer = c0026b6.f76a;
            int i2 = c0026b6.f77b - 1;
            c0026b6.f77b = i2;
            byteBuffer.put(i2, z ? (byte) 1 : (byte) 0);
            c0026b6.f79d[2] = c0026b6.m66g();
        } else {
            c0026b6.getClass();
        }
        if (b != 0) {
            c0026b6.m67h(1, 0);
            ByteBuffer byteBuffer2 = c0026b6.f76a;
            int i3 = c0026b6.f77b - 1;
            c0026b6.f77b = i3;
            byteBuffer2.put(i3, b);
            c0026b6.f79d[1] = c0026b6.m66g();
        }
        int iM64e = c0026b6.m64e();
        c0026b6.m65f(iM64e);
        return iM64e;
    }

    public C0883ve(String str, int i, boolean z) {
        C0631i9.m1482e(str, "value");
        C0944z.m2230j("matchType", i);
        this.f3458a = str;
        this.f3459b = i;
        this.f3460c = z;
    }
}
