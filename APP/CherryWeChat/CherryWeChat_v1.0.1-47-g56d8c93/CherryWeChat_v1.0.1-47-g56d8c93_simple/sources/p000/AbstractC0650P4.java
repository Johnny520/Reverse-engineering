package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: P4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0650P4 extends AbstractC0671Pj {
    /* JADX INFO: renamed from: D */
    public static void m1309D(int r0, int r1, int[] r2, int[] r3, int r4) {
        System.arraycopy(r2, r1, r3, r0, r4 - r1);
    }

    /* JADX INFO: renamed from: E */
    public static void m1310E(Object[] r0, Object[] r1, int r2, int r3, int r4) {
        System.arraycopy(r0, r3, r1, r2, r4 - r3);
    }

    /* JADX INFO: renamed from: F */
    public static void m1311F(Object[] r1, Object[] r2, int r3, int r4, int r5) {
        if ((r5 & 4) == 0) goto L5;
        r3 = 0;
    L5:
        System.arraycopy(r1, r3, r2, 0, r4 - r3);
    }

    /* JADX INFO: renamed from: G */
    public static int m1312G(Object r3, Object[] r4) {
        int r0 = 0;
        if (r3 != null) goto L10;
        int r32 = r4.length;
    L5:
        if (r0 >= r32) goto L16;
        if (r4[r0] == null) goto L8;
        r0 = r0 + 1;
        goto L5
    L8:
        return r0;
    L16:
        return -1;
    L10:
        int r1 = r4.length;
    L11:
        if (r0 >= r1) goto L22;
        if (r3.equals(r4[r0]) == true) goto L14;
        r0 = r0 + 1;
        goto L11
    L14:
        return r0;
    L22:
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public static String m1313H(byte[] r7, String r8, InterfaceC1416fj r9) {
        StringBuilder r0 = new StringBuilder();
        r0.append("");
        int r2 = r7.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r2) goto L8;
        byte r5 = r7[r3];
        r4 = r4 + 1;
        if (r4 <= 1) goto L7;
        r0.append(r8);
    L7:
        r0.append((CharSequence) r9.mo90g(Byte.valueOf(r5)));
        r3 = r3 + 1;
        goto L3
    L8:
        r0.append("");
        return r0.toString();
    }

    /* JADX INFO: renamed from: I */
    public static String m1314I(Object[] r7, InterfaceC1416fj r8, int r9) {
        if ((r9 & 1) == 0) goto L5;
        String r92 = ", ";
    L6:
        StringBuilder r2 = new StringBuilder();
        r2.append("");
        int r3 = r7.length;
        int r4 = 0;
        int r5 = 0;
    L7:
        if (r4 >= r3) goto L12;
        Object r6 = r7[r4];
        r5 = r5 + 1;
        if (r5 <= 1) goto L11;
        r2.append(r92);
    L11:
        AbstractC0671Pj.m1344b(r2, r6, r8);
        r4 = r4 + 1;
        goto L7
    L12:
        r2.append("");
        return r2.toString();
    L5:
        r92 = "";
        goto L6
    }

    /* JADX INFO: renamed from: J */
    public static List m1315J(Object[] r6, int r7) {
        if (r7 < 0) goto L22;
        if (r7 != 0) goto L7;
        return C0452Kf.f1484a;
    L7:
        if (r7 >= r6.length) goto L9;
        int r0 = 0;
        if (r7 == 1) goto L13;
        ArrayList r2 = new ArrayList(r7);
        int r3 = r6.length;
        int r4 = 0;
    L15:
        if (r0 >= r3) goto L20;
        r2.add(r6[r0]);
        r4 = r4 + 1;
        if (r4 == r7) goto L20;
        r0 = r0 + 1;
    L20:
        return r2;
    L13:
        return Collections.singletonList(r6[0]);
    L9:
        return m1316K(r6);
    L22:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r7, "Requested element count ", " is less than zero.").toString());
    }

    /* JADX INFO: renamed from: K */
    public static List m1316K(Object[] r2) {
        int r0 = r2.length;
        if (r0 == 0) goto L11;
        if (r0 == 1) goto L9;
        return new ArrayList(new C0048B4(r2));
    L9:
        return Collections.singletonList(r2[0]);
    L11:
        return C0452Kf.f1484a;
    }
}
