package p042W0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0183n;
import p009E0.C0170a;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p036T0.C0338a;
import p036T0.C0340c;
import p037U.AbstractC0358S;
import p040V0.C0403f;
import p040V0.C0409l;

/* JADX INFO: renamed from: W0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0425j extends AbstractC0433r {
    /* JADX INFO: renamed from: J0 */
    public static boolean m1005J0(CharSequence r9, CharSequence r10, boolean r11) {
        AbstractC0307g.m703e(r9, "<this>");
        AbstractC0307g.m703e(r10, "other");
        if ((r10 instanceof String) == false) goto L8;
        if (m1011P0(r9, (String) r10, 0, r11, 2) >= 0) goto L11;
        return false;
    L11:
        return true;
    L8:
        if (m1009N0(r9, r10, 0, r9.length(), r11, false) >= 0) goto L11;
        return false;
    }

    /* JADX INFO: renamed from: K0 */
    public static boolean m1006K0(CharSequence r2, char r3) {
        AbstractC0307g.m703e(r2, "<this>");
        if (m1010O0(r2, r3, 0, false, 2) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: L0 */
    public static final int m1007L0(CharSequence r1) {
        AbstractC0307g.m703e(r1, "<this>");
        return r1.length() - 1;
    }

    /* JADX INFO: renamed from: M0 */
    public static final int m1008M0(CharSequence r6, String r7, int r8, boolean r9) {
        AbstractC0307g.m703e(r6, "<this>");
        AbstractC0307g.m703e(r7, "string");
        if (r9 == true) goto L9;
        if ((r6 instanceof String) == false) goto L9;
        return ((String) r6).indexOf(r7, r8);
    L9:
        return m1009N0(r6, r7, r8, r6.length(), r9, false);
    }

    /* JADX INFO: renamed from: N0 */
    public static final int m1009N0(CharSequence r8, CharSequence r9, int r10, int r11, boolean r12, boolean r13) {
        if (r13 == false) goto L5;
        int r132 = m1007L0(r8);
        if (r10 <= r132) goto L14;
        r10 = r132;
    L14:
        if (r11 >= 0) goto L16;
        r11 = 0;
    L16:
        C0338a r133 = new C0338a(r10, r11, -1);
    L17:
        boolean r102 = r8 instanceof String;
        int r112 = r133.f659c;
        int r1 = r133.f658b;
        int r134 = r133.f657a;
        if (r102 == true) goto L20;
    L30:
        if (r112 <= 0) goto L32;
        if (r134 > r1) goto L32;
    L35:
        if (m1015T0(r9, 0, r8, r134, r9.length(), r12) == true) goto L36;
        if (r134 == r1) goto L39;
        r134 = r134 + r112;
    L39:
        return -1;
    L36:
        return r134;
    L32:
        if (r112 >= 0) goto L39;
        if (r1 > r134) goto L39;
    L20:
        if ((r9 instanceof String) == false) goto L30;
        if (r112 <= 0) goto L23;
        if (r134 > r1) goto L23;
    L26:
        if (AbstractC0433r.m1030E0(0, r134, ((String) r9).length(), (String) r9, (String) r8, r12) == true) goto L27;
        if (r134 == r1) goto L39;
        r134 = r134 + r112;
        goto L26
    L27:
        return r134;
    L23:
        if (r112 >= 0) goto L39;
        if (r1 > r134) goto L39;
    L5:
        if (r10 >= 0) goto L7;
        r10 = 0;
    L7:
        int r14 = r8.length();
        if (r11 <= r14) goto L10;
        r11 = r14;
    L10:
        r133 = new C0340c(r10, r11, 1);
        goto L17
    }

    /* JADX INFO: renamed from: O0 */
    public static int m1010O0(CharSequence r2, char r3, int r4, boolean r5, int r6) {
        if ((r6 & 2) == 0) goto L6;
        r4 = 0;
    L6:
        if ((r6 & 4) == 0) goto L8;
        r5 = false;
    L8:
        AbstractC0307g.m703e(r2, "<this>");
        if (r5 == true) goto L15;
        if ((r2 instanceof String) == false) goto L15;
        return ((String) r2).indexOf(r3, r4);
    L15:
        return m1012Q0(r2, new char[]{r3}, r4, r5);
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ int m1011P0(CharSequence r2, String r3, int r4, boolean r5, int r6) {
        if ((r6 & 2) == 0) goto L6;
        r4 = 0;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r5 = false;
    L9:
        return m1008M0(r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: Q0 */
    public static final int m1012Q0(CharSequence r6, char[] r7, int r8, boolean r9) {
        AbstractC0307g.m703e(r6, "<this>");
        AbstractC0307g.m703e(r7, "chars");
        if (r9 == false) goto L5;
    L17:
        if (r8 >= 0) goto L19;
        r8 = 0;
    L19:
        int r1 = m1007L0(r6);
        if (r8 > r1) goto L29;
    L21:
        char r2 = r6.charAt(r8);
        int r3 = r7.length;
        int r4 = 0;
    L22:
        if (r4 >= r3) goto L27;
        if (AbstractC0358S.m902p(r7[r4], r2, r9) == true) goto L25;
        r4 = r4 + 1;
        goto L22
    L25:
        return r8;
    L27:
        if (r8 == r1) goto L34;
        r8 = r8 + 1;
        goto L21
    L34:
        return -1;
    L29:
        return -1;
    L5:
        if (r7.length != 1) goto L17;
        if ((r6 instanceof String) == false) goto L17;
        int r92 = r7.length;
        if (r92 == 0) goto L16;
        if (r92 != 1) goto L14;
        return ((String) r6).indexOf(r7[0], r8);
    L14:
        throw new IllegalArgumentException("Array has more than one element.");
    L16:
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: R0 */
    public static boolean m1013R0(CharSequence r3) {
        AbstractC0307g.m703e(r3, "<this>");
        int r1 = 0;
    L4:
        if (r1 >= r3.length()) goto L9;
        if (AbstractC0358S.m860J(r3.charAt(r1)) == false) goto L13;
        r1 = r1 + 1;
        goto L4
    L13:
        return false;
    L9:
        return true;
    }

    /* JADX INFO: renamed from: S0 */
    public static C0403f m1014S0(CharSequence r5) {
        m1018W0(0);
        List r02 = AbstractC0179j.m530g0(new String[]{"\r\n", "\n", "\r"});
        return new C0403f(new C0418c(r5, 0, 0, new C0434s(r02, false, 1)), new C0170a(2, r5));
    }

    /* JADX INFO: renamed from: T0 */
    public static final boolean m1015T0(CharSequence r4, int r5, CharSequence r6, int r7, int r8, boolean r9) {
        AbstractC0307g.m703e(r4, "<this>");
        AbstractC0307g.m703e(r6, "other");
        if (r7 < 0) goto L18;
        if (r5 < 0) goto L18;
        if (r5 > (r4.length() - r8)) goto L18;
        if (r7 > (r6.length() - r8)) goto L18;
        int r1 = 0;
    L11:
        if (r1 >= r8) goto L16;
        if (AbstractC0358S.m902p(r4.charAt(r5 + r1), r6.charAt(r7 + r1), r9) == false) goto L14;
        r1 = r1 + 1;
        goto L11
    L14:
        return false;
    L16:
        return true;
    L18:
        return false;
    }

    /* JADX INFO: renamed from: U0 */
    public static String m1016U0(String r1, String r2) {
        AbstractC0307g.m703e(r1, "<this>");
        AbstractC0307g.m703e(r2, "prefix");
        if (AbstractC0433r.m1033H0(r1, r2, false) == false) goto L6;
        String r12 = r1.substring(r2.length());
        AbstractC0307g.m702d(r12, "substring(...)");
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: V0 */
    public static String m1017V0(String r1, String r2) {
        if (AbstractC0433r.m1028C0(r1, r2) == false) goto L6;
        String r12 = r1.substring(0, r1.length() - r2.length());
        AbstractC0307g.m702d(r12, "substring(...)");
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: W0 */
    public static final void m1018W0(int r1) {
        if (r1 < 0) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(AbstractC0324d.m720c("Limit must be non-negative, but was ", r1).toString());
    }

    /* JADX INFO: renamed from: X0 */
    public static List m1019X0(String r6, char[] r7) {
        boolean r3 = false;
        if (r7.length != 1) goto L11;
        String r72 = String.valueOf(r7[0]);
        m1018W0(0);
        int r02 = m1008M0(r6, r72, 0, false);
        if (r02 == (-1)) goto L19;
        ArrayList r4 = new ArrayList(10);
        int r2 = 0;
    L7:
        r4.add(r6.subSequence(r2, r02).toString());
        r2 = r72.length() + r02;
        r02 = m1008M0(r6, r72, r2, false);
        if (r02 != (-1)) goto L7;
        r4.add(r6.subSequence(r2, r6.length()).toString());
        return r4;
    L19:
        return AbstractC0040p.m82F(r6.toString());
    L11:
        m1018W0(0);
        C0418c r03 = new C0418c(r6, 0, 0, new C0434s(r7, r3, 0));
        ArrayList r42 = new ArrayList(AbstractC0183n.m559k0(new C0409l(r03), 10));
        Iterator r73 = r03.iterator();
    L13:
        if (r73.hasNext() == false) goto L20;
        C0340c r04 = (C0340c) r73.next();
        AbstractC0307g.m703e(r04, "range");
        r42.add(r6.subSequence(r04.f657a, r04.f658b + 1).toString());
        goto L13
    L20:
        return r42;
    }

    /* JADX INFO: renamed from: Y0 */
    public static String m1020Y0(String r2) {
        AbstractC0307g.m703e(r2, "<this>");
        AbstractC0307g.m703e(r2, "missingDelimiterValue");
        int r02 = r2.lastIndexOf(46, m1007L0(r2));
        if (r02 == (-1)) goto L7;
        String r22 = r2.substring(r02 + 1, r2.length());
        AbstractC0307g.m702d(r22, "substring(...)");
        return r22;
    L7:
        return r2;
    }

    /* JADX INFO: renamed from: Z0 */
    public static String m1021Z0(String r1, int r2) {
        AbstractC0307g.m703e(r1, "<this>");
        if (r2 < 0) goto L10;
        int r02 = r1.length();
        if (r2 <= r02) goto L7;
        r2 = r02;
    L7:
        String r12 = r1.substring(0, r2);
        AbstractC0307g.m702d(r12, "substring(...)");
        return r12;
    L10:
        throw new IllegalArgumentException(("Requested character count " + r2 + " is less than zero.").toString());
    }

    /* JADX INFO: renamed from: a1 */
    public static CharSequence m1022a1(CharSequence r5) {
        AbstractC0307g.m703e(r5, "<this>");
        int r02 = r5.length() - 1;
        int r2 = 0;
        boolean r3 = false;
    L3:
        if (r2 > r02) goto L16;
        if (r3 == true) goto L6;
        int r4 = r2;
    L7:
        boolean r42 = AbstractC0358S.m860J(r5.charAt(r4));
        if (r3 == false) goto L9;
        if (r42 == false) goto L16;
        r02 = r02 - 1;
        goto L3
    L9:
        if (r42 == false) goto L10;
        r2 = r2 + 1;
        goto L3
    L10:
        r3 = true;
        goto L3
    L6:
        r4 = r02;
    L16:
        return r5.subSequence(r2, r02 + 1);
    }

    /* JADX INFO: renamed from: b1 */
    public static CharSequence m1023b1(CharSequence r3) {
        AbstractC0307g.m703e(r3, "<this>");
        int r02 = r3.length() - 1;
        if (r02 < 0) goto L10;
    L4:
        int r1 = r02 - 1;
        if (AbstractC0358S.m860J(r3.charAt(r02)) == false) goto L14;
        if (r1 < 0) goto L10;
        r02 = r1;
        goto L4
    L14:
        return r3.subSequence(0, r02 + 1);
    L10:
        return "";
    }
}
