package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p023M.C0247a;
import p023M.C0248b;
import p043Y.C0463v;

/* JADX INFO: renamed from: androidx.emoji2.text.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0497v {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f1397d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f1398a;

    /* JADX INFO: renamed from: b */
    public final C0463v f1399b;

    /* JADX INFO: renamed from: c */
    public volatile int f1400c = 0;

    public C0497v(C0463v c0463v, int i2) {
        this.f1399b = c0463v;
        this.f1398a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m1218a(int i2) {
        C0247a c0247aM1220c = m1220c();
        int iM205a = c0247aM1220c.m205a(16);
        if (iM205a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0247aM1220c.f214d;
        int i3 = iM205a + c0247aM1220c.f211a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final int m1219b() {
        C0247a c0247aM1220c = m1220c();
        int iM205a = c0247aM1220c.m205a(16);
        if (iM205a == 0) {
            return 0;
        }
        int i2 = iM205a + c0247aM1220c.f211a;
        return ((ByteBuffer) c0247aM1220c.f214d).getInt(((ByteBuffer) c0247aM1220c.f214d).getInt(i2) + i2);
    }

    /* JADX INFO: renamed from: c */
    public final C0247a m1220c() {
        ThreadLocal threadLocal = f1397d;
        C0247a c0247a = (C0247a) threadLocal.get();
        if (c0247a == null) {
            c0247a = new C0247a();
            threadLocal.set(c0247a);
        }
        C0248b c0248b = (C0248b) this.f1399b.f1044a;
        int iM205a = c0248b.m205a(6);
        if (iM205a != 0) {
            int i2 = iM205a + c0248b.f211a;
            int i3 = (this.f1398a * 4) + ((ByteBuffer) c0248b.f214d).getInt(i2) + i2 + 4;
            int i4 = ((ByteBuffer) c0248b.f214d).getInt(i3) + i3;
            ByteBuffer byteBuffer = (ByteBuffer) c0248b.f214d;
            c0247a.f214d = byteBuffer;
            if (byteBuffer != null) {
                c0247a.f211a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                c0247a.f212b = i5;
                c0247a.f213c = ((ByteBuffer) c0247a.f214d).getShort(i5);
            } else {
                c0247a.f211a = 0;
                c0247a.f212b = 0;
                c0247a.f213c = 0;
            }
        }
        return c0247a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0247a c0247aM1220c = m1220c();
        int iM205a = c0247aM1220c.m205a(4);
        sb.append(Integer.toHexString(iM205a != 0 ? ((ByteBuffer) c0247aM1220c.f214d).getInt(iM205a + c0247aM1220c.f211a) : 0));
        sb.append(", codepoints:");
        int iM1219b = m1219b();
        for (int i2 = 0; i2 < iM1219b; i2++) {
            sb.append(Integer.toHexString(m1218a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
