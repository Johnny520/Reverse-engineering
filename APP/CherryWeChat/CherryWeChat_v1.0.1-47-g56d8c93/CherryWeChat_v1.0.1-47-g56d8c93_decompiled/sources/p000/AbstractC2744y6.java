package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: y6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2744y6 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final C2701x6 f9369b = new C2701x6(AbstractC0501Ll.f1638b);

    /* JADX INFO: renamed from: c */
    public static final C2220m6 f9370c;

    /* JADX INFO: renamed from: a */
    public int f9371a;

    static {
        f9370c = AbstractC2783z2.m5355a() ? new C2220m6(3) : new C2220m6(2);
    }

    /* JADX INFO: renamed from: b */
    public static int m5327b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC2374ph.m4813j(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    /* JADX INFO: renamed from: c */
    public static C2701x6 m5328c(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange;
        m5327b(i, i + i2, bArr.length);
        switch (f9370c.f7716a) {
            case 2:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i2];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                break;
        }
        return new C2701x6(bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo5220a(int i);

    /* JADX INFO: renamed from: e */
    public abstract void mo5221e(int i, byte[] bArr);

    /* JADX INFO: renamed from: g */
    public final byte[] m5329g() {
        int size = size();
        if (size == 0) {
            return AbstractC0501Ll.f1638b;
        }
        byte[] bArr = new byte[size];
        mo5221e(size, bArr);
        return bArr;
    }

    public final int hashCode() {
        int i = this.f9371a;
        if (i != 0) {
            return i;
        }
        int size = size();
        C2701x6 c2701x6 = (C2701x6) this;
        int iMo5222h = c2701x6.mo5222h();
        int i2 = size;
        for (int i3 = iMo5222h; i3 < iMo5222h + size; i3++) {
            i2 = (i2 * 31) + c2701x6.f9275d[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f9371a = i2;
        return i2;
    }

    public abstract int size();

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC0828TB.m1641h(this);
        } else {
            StringBuilder sb = new StringBuilder();
            C2701x6 c2701x6 = (C2701x6) this;
            int iM5327b = m5327b(0, 47, c2701x6.size());
            sb.append(AbstractC0828TB.m1641h(iM5327b == 0 ? f9369b : new C2658w6(c2701x6.f9275d, c2701x6.mo5222h(), iM5327b)));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return AbstractC0213Ey.m410h(sb2, string, "\">");
    }
}
