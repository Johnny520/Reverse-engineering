package ae;

import java.util.GregorianCalendar;

/* JADX INFO: renamed from: ae.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0327z {

    /* JADX INFO: renamed from: a */
    public static final int f828a = -1;

    /* JADX INFO: renamed from: b */
    public static final byte[] f829b = new byte[0];

    /* JADX INFO: renamed from: a */
    public static final long m1001a(int i10, int i11, int i12, int i13, int i14, int i15) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i10, i11 - 1, i12, i13, i14, i15);
        return gregorianCalendar.getTime().getTime();
    }

    /* JADX INFO: renamed from: b */
    public static final int m1002b() {
        return f828a;
    }

    /* JADX INFO: renamed from: c */
    public static final byte[] m1003c() {
        return f829b;
    }
}
