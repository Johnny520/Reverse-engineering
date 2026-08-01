package p186k;

import java.util.ConcurrentModificationException;
import p117X2.AbstractC1665j;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2434p {

    /* JADX INFO: renamed from: a */
    public static final Object f7858a = new Object();

    /* JADX INFO: renamed from: b */
    public static final long[] f7859b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object f7860c = new Object();

    /* JADX INFO: renamed from: a */
    public static final int m4325a(C2424f c2424f, Object obj, int i5) {
        int i6 = c2424f.f7840f;
        if (i6 == 0) {
            return -1;
        }
        try {
            int iM4420a = AbstractC2477a.m4420a(c2424f.f7838d, i6, i5);
            if (iM4420a < 0 || AbstractC1665j.m2981a(obj, c2424f.f7839e[iM4420a])) {
                return iM4420a;
            }
            int i7 = iM4420a + 1;
            while (i7 < i6 && c2424f.f7838d[i7] == i5) {
                if (AbstractC1665j.m2981a(obj, c2424f.f7839e[i7])) {
                    return i7;
                }
                i7++;
            }
            for (int i8 = iM4420a - 1; i8 >= 0 && c2424f.f7838d[i8] == i5; i8--) {
                if (AbstractC1665j.m2981a(obj, c2424f.f7839e[i8])) {
                    return i8;
                }
            }
            return ~i7;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
