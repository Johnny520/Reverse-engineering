package p000;

/* JADX INFO: renamed from: hz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0316hz {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0467m f2289a;

    static {
        Integer num = AbstractC0604pp.f3732a;
        f2289a = (num == null || num.intValue() >= 34) ? new C0983zx() : new C0709sj();
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo1345a(int i);

    /* JADX INFO: renamed from: b */
    public abstract int mo1346b();

    /* JADX INFO: renamed from: c */
    public int mo1347c(int i, int i2) {
        int iMo1346b;
        int i3;
        int iMo1345a;
        if (i2 <= i) {
            throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(i) + ", " + Integer.valueOf(i2) + ").").toString());
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iMo1345a = mo1345a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iMo1346b = mo1346b() >>> 1;
                    i3 = iMo1346b % i4;
                } while ((i4 - 1) + (iMo1346b - i3) < 0);
                iMo1345a = i3;
            }
            return i + iMo1345a;
        }
        while (true) {
            int iMo1346b2 = mo1346b();
            if (i <= iMo1346b2 && iMo1346b2 < i2) {
                return iMo1346b2;
            }
        }
    }
}
