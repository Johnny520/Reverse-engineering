package p042W0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: W0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0433r extends AbstractC0432q {
    /* JADX INFO: renamed from: C0 */
    public static boolean m1028C0(String r1, String r2) {
        AbstractC0307g.m703e(r1, "<this>");
        AbstractC0307g.m703e(r2, "suffix");
        return r1.endsWith(r2);
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m1029D0(String r02, String r1, boolean r2) {
        if (r02 != null) goto L7;
        if (r1 != null) goto L5;
        return true;
    L5:
        return false;
    L7:
        if (r2 == true) goto L10;
        return r02.equals(r1);
    L10:
        return r02.equalsIgnoreCase(r1);
    }

    /* JADX INFO: renamed from: E0 */
    public static final boolean m1030E0(int r6, int r7, int r8, String r9, String r10, boolean r11) {
        AbstractC0307g.m703e(r9, "<this>");
        AbstractC0307g.m703e(r10, "other");
        if (r11 == true) goto L6;
        return r9.regionMatches(r6, r10, r7, r8);
    L6:
        return r9.regionMatches(r11, r6, r10, r7, r8);
    }

    /* JADX INFO: renamed from: F0 */
    public static String m1031F0(String r6, String r7, String r8, boolean r9) {
        AbstractC0307g.m703e(r6, "<this>");
        AbstractC0307g.m703e(r7, "oldValue");
        AbstractC0307g.m703e(r8, "newValue");
        int r02 = 0;
        int r1 = AbstractC0425j.m1008M0(r6, r7, 0, r9);
        if (r1 >= 0) goto L5;
        return r6;
    L5:
        int r2 = r7.length();
        int r3 = 1;
        if (r2 < 1) goto L9;
        r3 = r2;
    L9:
        int r4 = r6.length() - r2;
        int r5 = r8.length() + r4;
        if (r5 < 0) goto L19;
        StringBuilder r42 = new StringBuilder(r5);
    L12:
        r42.append(r6, r02, r1);
        r42.append(r8);
        r02 = r1 + r2;
        if (r1 >= r6.length()) goto L16;
        r1 = AbstractC0425j.m1008M0(r6, r7, r1 + r3, r9);
        if (r1 > 0) goto L12;
    L16:
        r42.append(r6, r02, r6.length());
        String r62 = r42.toString();
        AbstractC0307g.m702d(r62, "toString(...)");
        return r62;
    L19:
        throw new OutOfMemoryError();
    }

    /* JADX INFO: renamed from: G0 */
    public static String m1032G0(String r1, char r2, char r3) {
        AbstractC0307g.m703e(r1, "<this>");
        String r12 = r1.replace(r2, r3);
        AbstractC0307g.m702d(r12, "replace(...)");
        return r12;
    }

    /* JADX INFO: renamed from: H0 */
    public static boolean m1033H0(String r6, String r7, boolean r8) {
        AbstractC0307g.m703e(r6, "<this>");
        AbstractC0307g.m703e(r7, "prefix");
        if (r8 == true) goto L7;
        return r6.startsWith(r7);
    L7:
        return m1030E0(0, 0, r7.length(), r6, r7, r8);
    }

    /* JADX INFO: renamed from: I0 */
    public static boolean m1034I0(String r1, int r2) {
        AbstractC0307g.m703e(r1, "<this>");
        return r1.startsWith(":\r\n", r2);
    }
}
