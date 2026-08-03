package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: y6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2744y6 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final C2701x6 f9369b = null;

    /* JADX INFO: renamed from: c */
    public static final C2220m6 f9370c = null;

    /* JADX INFO: renamed from: a */
    public int f9371a;

    static {
        f9369b = new C2701x6(AbstractC0501Ll.f1638b);
        if (AbstractC2783z2.m5355a() == false) goto L5;
        C2220m6 r0 = new C2220m6(3);
    L6:
        f9370c = r0;
        return;
    L5:
        r0 = new C2220m6(2);
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public static int m5327b(int r3, int r4, int r5) {
        int r0 = r4 - r3;
        if ((((r3 | r4) | r0) | (r5 - r4)) >= 0) goto L12;
        if (r3 < 0) goto L11;
        if (r4 >= r3) goto L9;
        throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + r3 + ", " + r4);
    L9:
        throw new IndexOutOfBoundsException("End index: " + r4 + " >= " + r5);
    L11:
        throw new IndexOutOfBoundsException(AbstractC2374ph.m4813j(r3, "Beginning index: ", " < 0"));
    L12:
        return r0;
    }

    /* JADX INFO: renamed from: c */
    public static C2701x6 m5328c(byte[] r3, int r4, int r5) {
        m5327b(r4, r4 + r5, r3.length);
        switch(f9370c.f7716a) {
            case 2: goto L5;
            default: goto L4;
        };
    L4:
        byte[] r1 = new byte[r5];
        System.arraycopy(r3, r4, r1, 0, r5);
    L7:
        return new C2701x6(r1);
    L5:
        r1 = Arrays.copyOfRange(r3, r4, r5 + r4);
        goto L7
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo5220a(int r1);

    /* JADX INFO: renamed from: e */
    public abstract void mo5221e(int r1, byte[] r2);

    /* JADX INFO: renamed from: g */
    public final byte[] m5329g() {
        int r0 = size();
        if (r0 == 0) goto L5;
        byte[] r1 = new byte[r0];
        mo5221e(r0, r1);
        return r1;
    L5:
        return AbstractC0501Ll.f1638b;
    }

    public final int hashCode() {
        int r0 = this.f9371a;
        if (r0 != 0) goto L12;
        int r02 = size();
        C2701x6 r1 = (C2701x6) this;
        int r2 = r1.mo5222h();
        int r4 = r02;
        int r3 = r2;
    L6:
        if (r3 >= (r2 + r02)) goto L8;
        r4 = (r4 * 31) + r1.f9275d[r3];
        r3 = r3 + 1;
        goto L6
    L8:
        if (r4 != 0) goto L10;
        r4 = 1;
    L10:
        this.f9371a = r4;
        return r4;
    L12:
        return r0;
    }

    public abstract int size();

    public final String toString() {
        Locale r0 = Locale.ROOT;
        String r02 = Integer.toHexString(System.identityHashCode(this));
        int r1 = size();
        if (size() > 50) goto L5;
        String r2 = AbstractC0828TB.m1641h(this);
    L10:
        StringBuilder r3 = new StringBuilder("<ByteString@");
        r3.append(r02);
        r3.append(" size=");
        r3.append(r1);
        r3.append(" contents=\"");
        return AbstractC0213Ey.m410h(r3, r2, "\">");
    L5:
        StringBuilder r22 = new StringBuilder();
        C2701x6 r32 = (C2701x6) this;
        int r4 = m5327b(0, 47, r32.size());
        if (r4 != 0) goto L8;
        C2701x6 r33 = f9369b;
    L9:
        r22.append(AbstractC0828TB.m1641h(r33));
        r22.append("...");
        r2 = r22.toString();
        goto L10
    L8:
        r33 = new C2658w6(r32.f9275d, r32.mo5222h(), r4);
        goto L9
    }
}
