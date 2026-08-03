package p001;

import java.io.Serializable;
import p001.C0307m4;

/* JADX INFO: renamed from: ۟.i8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0255i8 {

    /* JADX INFO: renamed from: ۥ */
    public static final a f860 = new a();

    /* JADX INFO: renamed from: ۥ۟ */
    public static final AbstractC0190e f861;

    /* JADX INFO: renamed from: ۟.i8$a */
    public static final class a extends AbstractC0255i8 implements Serializable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p001.AbstractC0255i8
        /* JADX INFO: renamed from: ۥ */
        public final int mo844(int i) {
            return AbstractC0255i8.f861.mo844(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p001.AbstractC0255i8
        /* JADX INFO: renamed from: ۥ۟ */
        public final int mo845() {
            return AbstractC0255i8.f861.mo845();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p001.AbstractC0255i8
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final int mo1057(int i, int i2) {
            return AbstractC0255i8.f861.mo1057(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public final int m1094(int i) {
            return AbstractC0255i8.f861.m1052(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0185d8.f756.getClass();
        Integer num = C0307m4.a.f960;
        f861 = num == null || num.intValue() >= 34 ? new C0199e8() : new C0385s2();
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract int mo844(int i);

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract int mo845();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟ */
    public int mo1057(int i, int i2) {
        int iMo845;
        int i3;
        int iMo844;
        int iMo8452;
        if (!(i2 > i)) {
            Integer numValueOf = Integer.valueOf(i);
            Integer numValueOf2 = Integer.valueOf(i2);
            C0237h4.m1090("from", numValueOf);
            C0237h4.m1090("until", numValueOf2);
            throw new IllegalArgumentException(("Random range is empty: [" + numValueOf + ", " + numValueOf2 + ").").toString());
        }
        int i4 = i2 - i;
        if (i4 <= 0 && i4 != Integer.MIN_VALUE) {
            do {
                iMo8452 = mo845();
            } while (!(i <= iMo8452 && iMo8452 < i2));
            return iMo8452;
        }
        if (((-i4) & i4) == i4) {
            iMo844 = mo844(31 - Integer.numberOfLeadingZeros(i4));
        } else {
            do {
                iMo845 = mo845() >>> 1;
                i3 = iMo845 % i4;
            } while ((i4 - 1) + (iMo845 - i3) < 0);
            iMo844 = i3;
        }
        return i + iMo844;
    }
}
