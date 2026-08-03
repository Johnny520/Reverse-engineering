package Yue;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5223 {
    /* JADX INFO: renamed from: ۥ */
    public static int[] m1990(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m15996(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static long[] m1991(long[] jArr, int i, long j) {
        if (i + 1 > jArr.length) {
            long[] jArr2 = new long[m15996(i)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            jArr = jArr2;
        }
        jArr[i] = j;
        return jArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static <T> T[] m15994(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m15996(i));
            System.arraycopy(tArr, 0, objArr, 0, i);
            tArr = (T[]) objArr;
        }
        tArr[i] = t;
        return tArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean[] m15995(boolean[] zArr, int i, boolean z) {
        if (i + 1 > zArr.length) {
            boolean[] zArr2 = new boolean[m15996(i)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            zArr = zArr2;
        }
        zArr[i] = z;
        return zArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m15996(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int[] m15997(int[] iArr, int i, int i2, int i3) {
        if (i + 1 <= iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i - i2);
            iArr[i2] = i3;
            return iArr;
        }
        int[] iArr2 = new int[m15996(i)];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        iArr2[i2] = i3;
        System.arraycopy(iArr, i2, iArr2, i2 + 1, iArr.length - i2);
        return iArr2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static long[] m15998(long[] jArr, int i, int i2, long j) {
        if (i + 1 <= jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i - i2);
            jArr[i2] = j;
            return jArr;
        }
        long[] jArr2 = new long[m15996(i)];
        System.arraycopy(jArr, 0, jArr2, 0, i2);
        jArr2[i2] = j;
        System.arraycopy(jArr, i2, jArr2, i2 + 1, jArr.length - i2);
        return jArr2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static <T> T[] m15999(T[] tArr, int i, int i2, T t) {
        if (i + 1 <= tArr.length) {
            System.arraycopy(tArr, i2, tArr, i2 + 1, i - i2);
            tArr[i2] = t;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), m15996(i)));
        System.arraycopy(tArr, 0, tArr2, 0, i2);
        tArr2[i2] = t;
        System.arraycopy(tArr, i2, tArr2, i2 + 1, tArr.length - i2);
        return tArr2;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean[] m16000(boolean[] zArr, int i, int i2, boolean z) {
        if (i + 1 <= zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i - i2);
            zArr[i2] = z;
            return zArr;
        }
        boolean[] zArr2 = new boolean[m15996(i)];
        System.arraycopy(zArr, 0, zArr2, 0, i2);
        zArr2[i2] = z;
        System.arraycopy(zArr, i2, zArr2, i2 + 1, zArr.length - i2);
        return zArr2;
    }
}
