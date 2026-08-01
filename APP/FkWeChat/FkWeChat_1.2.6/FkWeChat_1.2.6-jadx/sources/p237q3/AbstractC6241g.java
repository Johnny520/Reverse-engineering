package p237q3;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: q3.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6241g {
    /* JADX INFO: renamed from: a */
    public static int[] m24615a(int[] iArr, int i10, int i11) {
        if (i10 + 1 > iArr.length) {
            int[] iArr2 = new int[m24617c(i10)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            iArr = iArr2;
        }
        iArr[i10] = i11;
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static Object[] m24616b(Object[] objArr, int i10, Object obj) {
        if (i10 + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), m24617c(i10));
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            objArr = objArr2;
        }
        objArr[i10] = obj;
        return objArr;
    }

    /* JADX INFO: renamed from: c */
    public static int m24617c(int i10) {
        if (i10 <= 4) {
            return 8;
        }
        return i10 * 2;
    }
}
