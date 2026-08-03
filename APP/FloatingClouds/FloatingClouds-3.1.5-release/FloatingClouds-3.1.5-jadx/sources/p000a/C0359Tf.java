package p000a;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: a.Tf */
/* JADX INFO: loaded from: classes.dex */
public final class C0359Tf {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<C0633ib> f1355d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public final int f1356a;

    /* JADX INFO: renamed from: b */
    public final C0671kb f1357b;

    /* JADX INFO: renamed from: c */
    public volatile int f1358c = 0;

    public C0359Tf(C0671kb c0671kb, int i) {
        this.f1357b = c0671kb;
        this.f1356a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m971a(int i) {
        C0633ib c0633ibM972b = m972b();
        int iM849a = c0633ibM972b.m849a(16);
        if (iM849a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0633ibM972b.f1105d;
        int i2 = iM849a + c0633ibM972b.f1102a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final C0633ib m972b() {
        ThreadLocal<C0633ib> threadLocal = f1355d;
        C0633ib c0633ib = threadLocal.get();
        if (c0633ib == null) {
            c0633ib = new C0633ib();
            threadLocal.set(c0633ib);
        }
        C0652jb c0652jb = this.f1357b.f2505a;
        int iM849a = c0652jb.m849a(6);
        if (iM849a != 0) {
            int i = iM849a + c0652jb.f1102a;
            int i2 = (this.f1356a * 4) + ((ByteBuffer) c0652jb.f1105d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c0652jb.f1105d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c0652jb.f1105d;
            c0633ib.f1105d = byteBuffer;
            if (byteBuffer != null) {
                c0633ib.f1102a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c0633ib.f1103b = i4;
                c0633ib.f1104c = ((ByteBuffer) c0633ib.f1105d).getShort(i4);
                return c0633ib;
            }
            c0633ib.f1102a = 0;
            c0633ib.f1103b = 0;
            c0633ib.f1104c = 0;
        }
        return c0633ib;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0633ib c0633ibM972b = m972b();
        int iM849a = c0633ibM972b.m849a(4);
        sb.append(Integer.toHexString(iM849a != 0 ? ((ByteBuffer) c0633ibM972b.f1105d).getInt(iM849a + c0633ibM972b.f1102a) : 0));
        sb.append(", codepoints:");
        C0633ib c0633ibM972b2 = m972b();
        int iM849a2 = c0633ibM972b2.m849a(16);
        if (iM849a2 != 0) {
            int i2 = iM849a2 + c0633ibM972b2.f1102a;
            i = ((ByteBuffer) c0633ibM972b2.f1105d).getInt(((ByteBuffer) c0633ibM972b2.f1105d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m971a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
