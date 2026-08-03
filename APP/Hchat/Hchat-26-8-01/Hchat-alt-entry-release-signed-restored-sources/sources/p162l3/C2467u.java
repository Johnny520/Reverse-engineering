package p162l3;

import java.nio.ByteBuffer;
import p109hb.C1671c;
import p178m3.C2775a;
import p178m3.C2776b;

/* JADX INFO: renamed from: l3.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2467u {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f8094d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f8095a;

    /* JADX INFO: renamed from: b */
    public final C1671c f8096b;

    /* JADX INFO: renamed from: c */
    public volatile int f8097c = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2467u(C1671c c1671c, int i9) {
        this.f8096b = c1671c;
        this.f8095a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m5862a(int i9) {
        C2775a c2775aM5863b = m5863b();
        int iM6155a = c2775aM5863b.m6155a(16);
        if (iM6155a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2775aM5863b.f9018j;
        int i10 = iM6155a + c2775aM5863b.f9015g;
        return byteBuffer.getInt((i9 * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C2775a m5863b() {
        ThreadLocal threadLocal = f8094d;
        C2775a c2775a = (C2775a) threadLocal.get();
        if (c2775a == null) {
            c2775a = new C2775a();
            threadLocal.set(c2775a);
        }
        C2776b c2776b = (C2776b) this.f8096b.f5520g;
        int iM6155a = c2776b.m6155a(6);
        if (iM6155a != 0) {
            int i9 = iM6155a + c2776b.f9015g;
            int i10 = (this.f8095a * 4) + ((ByteBuffer) c2776b.f9018j).getInt(i9) + i9 + 4;
            int i11 = ((ByteBuffer) c2776b.f9018j).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) c2776b.f9018j;
            c2775a.f9018j = byteBuffer;
            if (byteBuffer != null) {
                c2775a.f9015g = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                c2775a.f9016h = i12;
                c2775a.f9017i = ((ByteBuffer) c2775a.f9018j).getShort(i12);
                return c2775a;
            }
            c2775a.f9015g = 0;
            c2775a.f9016h = 0;
            c2775a.f9017i = 0;
        }
        return c2775a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        C2775a c2775aM5863b = m5863b();
        int iM6155a = c2775aM5863b.m6155a(4);
        sb2.append(Integer.toHexString(iM6155a != 0 ? ((ByteBuffer) c2775aM5863b.f9018j).getInt(iM6155a + c2775aM5863b.f9015g) : 0));
        sb2.append(", codepoints:");
        C2775a c2775aM5863b2 = m5863b();
        int iM6155a2 = c2775aM5863b2.m6155a(16);
        if (iM6155a2 != 0) {
            int i10 = iM6155a2 + c2775aM5863b2.f9015g;
            i9 = ((ByteBuffer) c2775aM5863b2.f9018j).getInt(((ByteBuffer) c2775aM5863b2.f9018j).getInt(i10) + i10);
        } else {
            i9 = 0;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            sb2.append(Integer.toHexString(m5862a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
