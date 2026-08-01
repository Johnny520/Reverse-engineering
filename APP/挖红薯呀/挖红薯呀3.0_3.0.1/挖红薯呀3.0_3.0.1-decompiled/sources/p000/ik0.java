package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ik0 {

    /* JADX INFO: renamed from: a */
    public static final ik0 f2579a = new ik0();

    /* JADX INFO: renamed from: b */
    private static final int[] f2580b = {75, 120, 112, 49};

    /* JADX INFO: renamed from: c */
    public static final int f2581c = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ik0() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1592a(int... iArr) {
        iArr.getClass();
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            int[] iArr2 = f2580b;
            arrayList.add(Character.valueOf((char) (iArr2[i3 % iArr2.length] ^ i4)));
            i2++;
            i3++;
        }
        char[] cArr = new char[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cArr[i] = ((Character) it.next()).charValue();
            i++;
        }
        return new String(cArr);
    }
}
