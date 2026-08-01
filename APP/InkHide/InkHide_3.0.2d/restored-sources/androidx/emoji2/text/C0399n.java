package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p012G.C0137a;
import p012G.C0138b;

/* JADX INFO: renamed from: androidx.emoji2.text.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0399n {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f1185d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f1186a;

    /* JADX INFO: renamed from: b */
    public final C0404s f1187b;

    /* JADX INFO: renamed from: c */
    public volatile int f1188c = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0399n(C0404s c0404s, int i2) {
        this.f1187b = c0404s;
        this.f1186a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m767a(int i2) {
        C0137a c0137aM768b = m768b();
        int iM303a = c0137aM768b.m303a(16);
        if (iM303a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0137aM768b.f437d;
        int i3 = iM303a + c0137aM768b.f434a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0137a m768b() {
        ThreadLocal threadLocal = f1185d;
        C0137a c0137a = (C0137a) threadLocal.get();
        if (c0137a == null) {
            c0137a = new C0137a();
            threadLocal.set(c0137a);
        }
        C0138b c0138b = (C0138b) this.f1187b.f1209a;
        int iM303a = c0138b.m303a(6);
        if (iM303a != 0) {
            int i2 = iM303a + c0138b.f434a;
            int i3 = (this.f1186a * 4) + ((ByteBuffer) c0138b.f437d).getInt(i2) + i2 + 4;
            int i4 = ((ByteBuffer) c0138b.f437d).getInt(i3) + i3;
            ByteBuffer byteBuffer = (ByteBuffer) c0138b.f437d;
            c0137a.f437d = byteBuffer;
            if (byteBuffer != null) {
                c0137a.f434a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                c0137a.f435b = i5;
                c0137a.f436c = ((ByteBuffer) c0137a.f437d).getShort(i5);
                return c0137a;
            }
            c0137a.f434a = 0;
            c0137a.f435b = 0;
            c0137a.f436c = 0;
        }
        return c0137a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0137a c0137aM768b = m768b();
        int iM303a = c0137aM768b.m303a(4);
        sb.append(Integer.toHexString(iM303a != 0 ? ((ByteBuffer) c0137aM768b.f437d).getInt(iM303a + c0137aM768b.f434a) : 0));
        sb.append(", codepoints:");
        C0137a c0137aM768b2 = m768b();
        int iM303a2 = c0137aM768b2.m303a(16);
        if (iM303a2 != 0) {
            int i3 = iM303a2 + c0137aM768b2.f434a;
            i2 = ((ByteBuffer) c0137aM768b2.f437d).getInt(((ByteBuffer) c0137aM768b2.f437d).getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(m767a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
