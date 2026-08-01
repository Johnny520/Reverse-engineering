package p198n8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p024b9.AbstractC1061t;
import p376zd.C9987e;

/* JADX INFO: renamed from: n8.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5510c {
    /* JADX INFO: renamed from: d */
    public static final Object[] m22420d(int i10) {
        if (i10 >= 0) {
            return new Object[i10];
        }
        C9987e.m38645a("capacity must be non-negative.");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final Object[] m22421e(Object[] objArr, int i10) {
        objArr.getClass();
        return Arrays.copyOf(objArr, i10);
    }

    /* JADX INFO: renamed from: f */
    public static final void m22422f(Object[] objArr, int i10) {
        objArr.getClass();
        objArr[i10] = null;
    }

    /* JADX INFO: renamed from: g */
    public static final void m22423g(Object[] objArr, int i10, int i11) {
        objArr.getClass();
        while (i10 < i11) {
            m22422f(objArr, i10);
            i10++;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m22424h(Object[] objArr, int i10, int i11, List list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!AbstractC1061t.m3842c(objArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static final int m22425i(Object[] objArr, int i10, int i11) {
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i10 + i12];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public static final String m22426j(Object[] objArr, int i10, int i11, Collection collection) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
