package p009E0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p001A0.AbstractC0040p;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p040V0.C0400c;
import p040V0.InterfaceC0405h;

/* JADX INFO: renamed from: E0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0179j extends AbstractC0040p {
    /* JADX INFO: renamed from: g0 */
    public static List m530g0(Object[] r1) {
        AbstractC0307g.m703e(r1, "<this>");
        List r12 = Arrays.asList(r1);
        AbstractC0307g.m702d(r12, "asList(...)");
        return r12;
    }

    /* JADX INFO: renamed from: h0 */
    public static InterfaceC0405h m531h0(Object[] r2) {
        if (r2.length != 0) goto L7;
        return C0400c.f890a;
    L7:
        return new C0180k(0, r2);
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m532i0(char[] r4, char r5) {
        int r02 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L8;
        if (r5 == r4[r2]) goto L9;
        r2 = r2 + 1;
    L9:
        if (r2 < 0) goto L14;
        return true;
    L14:
        return false;
    L8:
        r2 = -1;
        goto L9
    }

    /* JADX INFO: renamed from: j0 */
    public static void m533j0(Object[] r1, Object[] r2, int r3, int r4, int r5) {
        AbstractC0307g.m703e(r1, "<this>");
        AbstractC0307g.m703e(r2, "destination");
        System.arraycopy(r1, r4, r2, r3, r5 - r4);
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m534k0(Object[] r1, int r2, int r3) {
        AbstractC0307g.m703e(r1, "<this>");
        Arrays.fill(r1, r2, r3, null);
    }

    /* JADX INFO: renamed from: l0 */
    public static ArrayList m535l0(Object[] r4) {
        ArrayList r02 = new ArrayList();
        int r1 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        Object r3 = r4[r2];
        if (r3 == null) goto L7;
        r02.add(r3);
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r02;
    }

    /* JADX INFO: renamed from: m0 */
    public static Object m536m0(Object[] r1) {
        AbstractC0307g.m703e(r1, "<this>");
        if (r1.length != 0) goto L6;
        return null;
    L6:
        return r1[0];
    }

    /* JADX INFO: renamed from: n0 */
    public static Object m537n0(int r1, Object[] r2) {
        AbstractC0307g.m703e(r2, "<this>");
        if (r1 >= 0) goto L5;
    L7:
        return null;
    L5:
        if (r1 >= r2.length) goto L7;
        return r2[r1];
    }

    /* JADX INFO: renamed from: o0 */
    public static String m538o0(Object[] r7, InterfaceC0286l r8) {
        StringBuilder r02 = new StringBuilder();
        r02.append("");
        int r2 = r7.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r2) goto L8;
        Object r5 = r7[r3];
        r4 = r4 + 1;
        if (r4 <= 1) goto L7;
        r02.append("");
    L7:
        AbstractC0358S.m879c(r02, r5, r8);
        r3 = r3 + 1;
        goto L3
    L8:
        r02.append("");
        String r72 = r02.toString();
        AbstractC0307g.m702d(r72, "toString(...)");
        return r72;
    }

    /* JADX INFO: renamed from: p0 */
    public static List m539p0(int[] r4) {
        AbstractC0307g.m703e(r4, "<this>");
        int r02 = r4.length;
        if (r02 == 0) goto L11;
        int r1 = 0;
        if (r02 == 1) goto L13;
        ArrayList r03 = new ArrayList(r4.length);
        int r2 = r4.length;
    L7:
        if (r1 >= r2) goto L14;
        r03.add(Integer.valueOf(r4[r1]));
        r1 = r1 + 1;
        goto L7
    L14:
        return r03;
    L13:
        return AbstractC0040p.m82F(Integer.valueOf(r4[0]));
    L11:
        return C0190u.f401a;
    }

    /* JADX INFO: renamed from: q0 */
    public static List m540q0(Object[] r3) {
        AbstractC0307g.m703e(r3, "<this>");
        int r02 = r3.length;
        if (r02 == 0) goto L9;
        if (r02 == 1) goto L11;
        return new ArrayList(new C0177h(r3, false));
    L11:
        return AbstractC0040p.m82F(r3[0]);
    L9:
        return C0190u.f401a;
    }
}
