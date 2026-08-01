package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class y91 {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f7585d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f7586a;

    /* JADX INFO: renamed from: b */
    public final C0948y2 f7587b;

    /* JADX INFO: renamed from: c */
    public volatile int f7588c = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y91(C0948y2 c0948y2, int i) {
        this.f7587b = c0948y2;
        this.f7586a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m5224a(int i) {
        fe0 fe0VarM5225b = m5225b();
        int iM925a = fe0VarM5225b.m925a(16);
        if (iM925a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) fe0VarM5225b.f1423g;
        int i2 = iM925a + fe0VarM5225b.f1420d;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final fe0 m5225b() {
        ThreadLocal threadLocal = f7585d;
        fe0 fe0Var = (fe0) threadLocal.get();
        if (fe0Var == null) {
            fe0Var = new fe0();
            threadLocal.set(fe0Var);
        }
        ge0 ge0Var = (ge0) this.f7587b.f7491d;
        int iM925a = ge0Var.m925a(6);
        if (iM925a != 0) {
            int i = iM925a + ge0Var.f1420d;
            int i2 = (this.f7586a * 4) + ((ByteBuffer) ge0Var.f1423g).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) ge0Var.f1423g).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) ge0Var.f1423g;
            fe0Var.f1423g = byteBuffer;
            if (byteBuffer != null) {
                fe0Var.f1420d = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                fe0Var.f1421e = i4;
                fe0Var.f1422f = ((ByteBuffer) fe0Var.f1423g).getShort(i4);
                return fe0Var;
            }
            fe0Var.f1420d = 0;
            fe0Var.f1421e = 0;
            fe0Var.f1422f = 0;
        }
        return fe0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        fe0 fe0VarM5225b = m5225b();
        int iM925a = fe0VarM5225b.m925a(4);
        sb.append(Integer.toHexString(iM925a != 0 ? ((ByteBuffer) fe0VarM5225b.f1423g).getInt(iM925a + fe0VarM5225b.f1420d) : 0));
        sb.append(", codepoints:");
        fe0 fe0VarM5225b2 = m5225b();
        int iM925a2 = fe0VarM5225b2.m925a(16);
        if (iM925a2 != 0) {
            int i2 = iM925a2 + fe0VarM5225b2.f1420d;
            i = ((ByteBuffer) fe0VarM5225b2.f1423g).getInt(((ByteBuffer) fe0VarM5225b2.f1423g).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m5224a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
