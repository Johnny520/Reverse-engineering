package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: pi */
/* JADX INFO: loaded from: classes.dex */
public final class C0597pi {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f3711d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f3712a;

    /* JADX INFO: renamed from: b */
    public final C0402k8 f3713b;

    /* JADX INFO: renamed from: c */
    public volatile int f3714c = 0;

    public C0597pi(C0402k8 c0402k8, int i) {
        this.f3713b = c0402k8;
        this.f3712a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m2090a(int i) {
        C0129cw c0129cwM2091b = m2091b();
        int iM2795a = c0129cwM2091b.m2795a(16);
        if (iM2795a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0129cwM2091b.f5550d;
        int i2 = iM2795a + c0129cwM2091b.f5547a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final C0129cw m2091b() {
        ThreadLocal threadLocal = f3711d;
        C0129cw c0129cw = (C0129cw) threadLocal.get();
        if (c0129cw == null) {
            c0129cw = new C0129cw();
            threadLocal.set(c0129cw);
        }
        C0165dw c0165dw = (C0165dw) this.f3713b.f2794a;
        int iM2795a = c0165dw.m2795a(6);
        if (iM2795a != 0) {
            int i = iM2795a + c0165dw.f5547a;
            int i2 = (this.f3712a * 4) + ((ByteBuffer) c0165dw.f5550d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c0165dw.f5550d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c0165dw.f5550d;
            c0129cw.f5550d = byteBuffer;
            if (byteBuffer != null) {
                c0129cw.f5547a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c0129cw.f5548b = i4;
                c0129cw.f5549c = ((ByteBuffer) c0129cw.f5550d).getShort(i4);
                return c0129cw;
            }
            c0129cw.f5547a = 0;
            c0129cw.f5548b = 0;
            c0129cw.f5549c = 0;
        }
        return c0129cw;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0129cw c0129cwM2091b = m2091b();
        int iM2795a = c0129cwM2091b.m2795a(4);
        sb.append(Integer.toHexString(iM2795a != 0 ? ((ByteBuffer) c0129cwM2091b.f5550d).getInt(iM2795a + c0129cwM2091b.f5547a) : 0));
        sb.append(", codepoints:");
        C0129cw c0129cwM2091b2 = m2091b();
        int iM2795a2 = c0129cwM2091b2.m2795a(16);
        if (iM2795a2 != 0) {
            int i2 = iM2795a2 + c0129cwM2091b2.f5547a;
            i = ((ByteBuffer) c0129cwM2091b2.f5550d).getInt(((ByteBuffer) c0129cwM2091b2.f5550d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m2090a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
