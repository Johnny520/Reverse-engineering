package p000;

/* JADX INFO: renamed from: az */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0049az {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0467m f694a;

    static {
        Integer num = AbstractC0456lp.f3082a;
        f694a = (num == null || num.intValue() >= 34) ? new C0687rx() : new C0636qj();
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo478a(int i);

    /* JADX INFO: renamed from: b */
    public abstract int mo479b();

    /* JADX INFO: renamed from: c */
    public int mo480c(int i, int i2) {
        int iMo479b;
        int i3;
        int iMo478a;
        if (i2 <= i) {
            throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(i) + ", " + Integer.valueOf(i2) + ").").toString());
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iMo478a = mo478a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iMo479b = mo479b() >>> 1;
                    i3 = iMo479b % i4;
                } while ((i4 - 1) + (iMo479b - i3) < 0);
                iMo478a = i3;
            }
            return i + iMo478a;
        }
        while (true) {
            int iMo479b2 = mo479b();
            if (i <= iMo479b2 && iMo479b2 < i2) {
                return iMo479b2;
            }
        }
    }
}
