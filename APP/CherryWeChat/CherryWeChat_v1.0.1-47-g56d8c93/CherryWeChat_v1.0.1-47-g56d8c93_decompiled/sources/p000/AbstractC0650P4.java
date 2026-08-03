package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: P4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0650P4 extends AbstractC0671Pj {
    /* JADX INFO: renamed from: D */
    public static void m1309D(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: E */
    public static void m1310E(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: F */
    public static void m1311F(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    /* JADX INFO: renamed from: G */
    public static int m1312G(Object obj, Object[] objArr) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public static String m1313H(byte[] bArr, String str, InterfaceC1416fj interfaceC1416fj) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            sb.append((CharSequence) interfaceC1416fj.mo90g(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: I */
    public static String m1314I(Object[] objArr, InterfaceC1416fj interfaceC1416fj, int i) {
        String str = (i & 1) != 0 ? ", " : "";
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC0671Pj.m1344b(sb, obj, interfaceC1416fj);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: J */
    public static List m1315J(Object[] objArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2374ph.m4813j(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return C0452Kf.f1484a;
        }
        if (i >= objArr.length) {
            return m1316K(objArr);
        }
        if (i == 1) {
            return Collections.singletonList(objArr[0]);
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (Object obj : objArr) {
            arrayList.add(obj);
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public static List m1316K(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C0048B4(objArr)) : Collections.singletonList(objArr[0]) : C0452Kf.f1484a;
    }
}
