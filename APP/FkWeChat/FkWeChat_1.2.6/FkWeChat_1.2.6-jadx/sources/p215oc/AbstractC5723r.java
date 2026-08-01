package p215oc;

/* JADX INFO: renamed from: oc.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5723r {
    /* JADX INFO: renamed from: a */
    public static final int m23169a(C5721p c5721p, byte b10, int i10, int i11) {
        c5721p.getClass();
        if (i10 < 0 || i10 >= c5721p.m23150j()) {
            throw new IllegalArgumentException(String.valueOf(i10).toString());
        }
        if (i10 > i11 || i11 > c5721p.m23150j()) {
            throw new IllegalArgumentException(String.valueOf(i11).toString());
        }
        int iM23146f = c5721p.m23146f();
        byte[] bArrM23142b = c5721p.m23142b(true);
        while (i10 < i11) {
            if (bArrM23142b[iM23146f + i10] == b10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m23170b(C5721p c5721p) {
        c5721p.getClass();
        return c5721p.m23150j() == 0;
    }
}
