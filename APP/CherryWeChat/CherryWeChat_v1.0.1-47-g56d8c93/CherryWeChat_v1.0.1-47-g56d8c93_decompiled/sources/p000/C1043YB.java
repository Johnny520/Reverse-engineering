package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: YB */
/* JADX INFO: loaded from: classes.dex */
public final class C1043YB {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f3331d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f3332a;

    /* JADX INFO: renamed from: b */
    public final C2428qs f3333b;

    /* JADX INFO: renamed from: c */
    public volatile int f3334c = 0;

    public C1043YB(C2428qs c2428qs, int i) {
        this.f3333b = c2428qs;
        this.f3332a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m1991a(int i) {
        C0636Or c0636OrM1992b = m1992b();
        int iM4624a = c0636OrM1992b.m4624a(16);
        if (iM4624a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0636OrM1992b.f8037d;
        int i2 = iM4624a + c0636OrM1992b.f8034a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final C0636Or m1992b() {
        ThreadLocal threadLocal = f3331d;
        C0636Or c0636Or = (C0636Or) threadLocal.get();
        if (c0636Or == null) {
            c0636Or = new C0636Or();
            threadLocal.set(c0636Or);
        }
        C0679Pr c0679Pr = (C0679Pr) this.f3333b.f8520a;
        int iM4624a = c0679Pr.m4624a(6);
        if (iM4624a != 0) {
            int i = iM4624a + c0679Pr.f8034a;
            int i2 = (this.f3332a * 4) + ((ByteBuffer) c0679Pr.f8037d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c0679Pr.f8037d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c0679Pr.f8037d;
            c0636Or.f8037d = byteBuffer;
            if (byteBuffer != null) {
                c0636Or.f8034a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c0636Or.f8035b = i4;
                c0636Or.f8036c = ((ByteBuffer) c0636Or.f8037d).getShort(i4);
                return c0636Or;
            }
            c0636Or.f8034a = 0;
            c0636Or.f8035b = 0;
            c0636Or.f8036c = 0;
        }
        return c0636Or;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0636Or c0636OrM1992b = m1992b();
        int iM4624a = c0636OrM1992b.m4624a(4);
        sb.append(Integer.toHexString(iM4624a != 0 ? ((ByteBuffer) c0636OrM1992b.f8037d).getInt(iM4624a + c0636OrM1992b.f8034a) : 0));
        sb.append(", codepoints:");
        C0636Or c0636OrM1992b2 = m1992b();
        int iM4624a2 = c0636OrM1992b2.m4624a(16);
        if (iM4624a2 != 0) {
            int i2 = iM4624a2 + c0636OrM1992b2.f8034a;
            i = ((ByteBuffer) c0636OrM1992b2.f8037d).getInt(((ByteBuffer) c0636OrM1992b2.f8037d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m1991a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
