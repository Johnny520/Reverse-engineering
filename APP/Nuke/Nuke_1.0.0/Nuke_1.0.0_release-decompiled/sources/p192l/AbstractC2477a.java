package p192l;

import java.util.NoSuchElementException;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: l.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2477a {

    /* JADX INFO: renamed from: a */
    public static final int[] f7971a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f7972b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f7973c = new Object[0];

    /* JADX INFO: renamed from: a */
    public static final int m4420a(int[] iArr, int i5, int i6) {
        AbstractC1665j.m2985e(iArr, "array");
        int i7 = i5 - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            int i10 = iArr[i9];
            if (i10 < i6) {
                i8 = i9 + 1;
            } else {
                if (i10 <= i6) {
                    return i9;
                }
                i7 = i9 - 1;
            }
        }
        return ~i8;
    }

    /* JADX INFO: renamed from: b */
    public static final int m4421b(long[] jArr, int i5, long j5) {
        AbstractC1665j.m2985e(jArr, "array");
        int i6 = i5 - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            long j6 = jArr[i8];
            if (j6 < j5) {
                i7 = i8 + 1;
            } else {
                if (j6 <= j5) {
                    return i8;
                }
                i6 = i8 - 1;
            }
        }
        return ~i7;
    }

    /* JADX INFO: renamed from: c */
    public static final void m4422c(String str) {
        AbstractC1665j.m2985e(str, "message");
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: d */
    public static final void m4423d(String str) {
        AbstractC1665j.m2985e(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX INFO: renamed from: e */
    public static final void m4424e(String str) {
        AbstractC1665j.m2985e(str, "message");
        throw new NoSuchElementException(str);
    }
}
