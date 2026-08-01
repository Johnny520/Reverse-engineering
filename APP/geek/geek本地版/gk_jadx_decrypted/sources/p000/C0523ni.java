package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ni */
/* JADX INFO: loaded from: classes.dex */
public final class C0523ni {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f3414d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f3415a;

    /* JADX INFO: renamed from: b */
    public final C0009a8 f3416b;

    /* JADX INFO: renamed from: c */
    public volatile int f3417c = 0;

    public C0523ni(C0009a8 c0009a8, int i) {
        this.f3416b = c0009a8;
        this.f3415a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m1945a(int i) {
        C0833vv c0833vvM1946b = m1946b();
        int iM2359a = c0833vvM1946b.m2359a(16);
        if (iM2359a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0833vvM1946b.f4513d;
        int i2 = iM2359a + c0833vvM1946b.f4510a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final C0833vv m1946b() {
        ThreadLocal threadLocal = f3414d;
        C0833vv c0833vv = (C0833vv) threadLocal.get();
        if (c0833vv == null) {
            c0833vv = new C0833vv();
            threadLocal.set(c0833vv);
        }
        C0870wv c0870wv = (C0870wv) this.f3416b.f64a;
        int iM2359a = c0870wv.m2359a(6);
        if (iM2359a != 0) {
            int i = iM2359a + c0870wv.f4510a;
            int i2 = (this.f3415a * 4) + ((ByteBuffer) c0870wv.f4513d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c0870wv.f4513d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c0870wv.f4513d;
            c0833vv.f4513d = byteBuffer;
            if (byteBuffer != null) {
                c0833vv.f4510a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c0833vv.f4511b = i4;
                c0833vv.f4512c = ((ByteBuffer) c0833vv.f4513d).getShort(i4);
                return c0833vv;
            }
            c0833vv.f4510a = 0;
            c0833vv.f4511b = 0;
            c0833vv.f4512c = 0;
        }
        return c0833vv;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0833vv c0833vvM1946b = m1946b();
        int iM2359a = c0833vvM1946b.m2359a(4);
        sb.append(Integer.toHexString(iM2359a != 0 ? ((ByteBuffer) c0833vvM1946b.f4513d).getInt(iM2359a + c0833vvM1946b.f4510a) : 0));
        sb.append(", codepoints:");
        C0833vv c0833vvM1946b2 = m1946b();
        int iM2359a2 = c0833vvM1946b2.m2359a(16);
        if (iM2359a2 != 0) {
            int i2 = iM2359a2 + c0833vvM1946b2.f4510a;
            i = ((ByteBuffer) c0833vvM1946b2.f4513d).getInt(((ByteBuffer) c0833vvM1946b2.f4513d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m1945a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
