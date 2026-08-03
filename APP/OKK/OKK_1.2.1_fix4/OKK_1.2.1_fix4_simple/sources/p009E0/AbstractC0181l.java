package p009E0;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p001A0.AbstractC0040p;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: E0.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0181l extends AbstractC0188s {
    /* JADX INFO: renamed from: A0 */
    public static ArrayList m541A0(Collection r1) {
        AbstractC0307g.m703e(r1, "<this>");
        return new ArrayList(r1);
    }

    /* JADX INFO: renamed from: B0 */
    public static Set m542B0(ArrayList r2) {
        C0192w r02 = C0192w.f403a;
        int r1 = r2.size();
        if (r1 != 0) goto L5;
        return r02;
    L5:
        if (r1 == 1) goto L7;
        LinkedHashSet r03 = new LinkedHashSet(AbstractC0193x.m563g0(r2.size()));
        m551w0(r2, r03);
        return r03;
    L7:
        Set r04 = Collections.singleton(r2.get(0));
        AbstractC0307g.m702d(r04, "singleton(...)");
        return r04;
    }

    /* JADX INFO: renamed from: o0 */
    public static List m543o0(List r1) {
        AbstractC0307g.m703e(r1, "<this>");
        return m553y0(new LinkedHashSet(r1));
    }

    /* JADX INFO: renamed from: p0 */
    public static Object m544p0(ArrayList r1) {
        if (r1.isEmpty() == false) goto L6;
        return null;
    L6:
        return r1.get(0);
    }

    /* JADX INFO: renamed from: q0 */
    public static Object m545q0(List r1, int r2) {
        AbstractC0307g.m703e(r1, "<this>");
        if (r2 >= 0) goto L5;
    L7:
        return null;
    L5:
        if (r2 >= r1.size()) goto L7;
        return r1.get(r2);
    }

    /* JADX INFO: renamed from: r0 */
    public static String m546r0(Iterable r2, String r3, String r4, String r5, InterfaceC0286l r6, int r7) {
        if ((r7 & 1) == 0) goto L6;
        r3 = ", ";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r7 & 32) == 0) goto L14;
        r6 = null;
    L14:
        AbstractC0307g.m703e(r2, "<this>");
        AbstractC0307g.m703e(r3, "separator");
        AbstractC0307g.m703e(r4, "prefix");
        AbstractC0307g.m703e(r5, "postfix");
        StringBuilder r72 = new StringBuilder();
        r72.append(r4);
        Iterator r22 = r2.iterator();
        int r42 = 0;
    L16:
        if (r22.hasNext() == false) goto L21;
        Object r02 = r22.next();
        r42 = r42 + 1;
        if (r42 <= 1) goto L20;
        r72.append(r3);
    L20:
        AbstractC0358S.m879c(r72, r02, r6);
        goto L16
    L21:
        r72.append(r5);
        String r23 = r72.toString();
        AbstractC0307g.m702d(r23, "toString(...)");
        return r23;
    }

    /* JADX INFO: renamed from: s0 */
    public static Comparable m547s0(ArrayList r3) {
        Iterator r32 = r3.iterator();
        if (r32.hasNext() == true) goto L6;
        return null;
    L6:
        Comparable r02 = (Comparable) r32.next();
    L8:
        if (r32.hasNext() == false) goto L12;
        Comparable r1 = (Comparable) r32.next();
        if (r02.compareTo(r1) <= 0) goto L8;
        r02 = r1;
        goto L8
    L12:
        return r02;
    }

    /* JADX INFO: renamed from: t0 */
    public static List m548t0(Collection r2, Comparator r3) {
        if (r2.size() <= 1) goto L5;
        Object[] r22 = r2.toArray(new Object[0]);
        AbstractC0307g.m703e(r22, "<this>");
        if (r22.length <= 1) goto L10;
        Arrays.sort(r22, r3);
    L10:
        return AbstractC0179j.m530g0(r22);
    L5:
        return m553y0(r2);
    }

    /* JADX INFO: renamed from: u0 */
    public static List m549u0(int r6, Collection r7) {
        AbstractC0307g.m703e(r7, "<this>");
        if (r6 < 0) goto L39;
        C0190u r02 = C0190u.f401a;
        if (r6 != 0) goto L8;
        return r02;
    L8:
        if (r6 < r7.size()) goto L12;
        return m553y0(r7);
    L12:
        if (r6 == 1) goto L14;
        ArrayList r3 = new ArrayList(r6);
        Iterator r72 = r7.iterator();
        int r4 = 0;
    L29:
        if (r72.hasNext() == false) goto L32;
        r3.add(r72.next());
        r4 = r4 + 1;
        if (r4 != r6) goto L29;
    L32:
        int r62 = r3.size();
        if (r62 == 0) goto L43;
        if (r62 == 1) goto L37;
        return r3;
    L37:
        return AbstractC0040p.m82F(r3.get(0));
    L43:
        return r02;
    L14:
        if ((r7 instanceof List) == false) goto L20;
        List r73 = (List) r7;
        if (r73.isEmpty() == true) goto L19;
        Object r63 = r73.get(0);
    L24:
        return AbstractC0040p.m82F(r63);
    L19:
        throw new NoSuchElementException("List is empty.");
    L20:
        Iterator r64 = r7.iterator();
        if (r64.hasNext() == false) goto L26;
        r63 = r64.next();
        goto L24
    L26:
        throw new NoSuchElementException("Collection is empty.");
    L39:
        throw new IllegalArgumentException(("Requested element count " + r6 + " is less than zero.").toString());
    }

    /* JADX INFO: renamed from: v0 */
    public static List m550v0(ArrayList r3, int r4) {
        if (r4 < 0) goto L23;
        if (r4 == 0) goto L5;
        int r02 = r3.size();
        if (r4 < r02) goto L11;
        return m553y0(r3);
    L11:
        if (r4 == 1) goto L13;
        ArrayList r1 = new ArrayList(r4);
        int r42 = r02 - r4;
    L19:
        if (r42 >= r02) goto L21;
        r1.add(r3.get(r42));
        r42 = r42 + 1;
        goto L19
    L21:
        return r1;
    L13:
        if (r3.isEmpty() == true) goto L17;
        return AbstractC0040p.m82F(r3.get(AbstractC0182m.m555g0(r3)));
    L17:
        throw new NoSuchElementException("List is empty.");
    L5:
        return C0190u.f401a;
    L23:
        throw new IllegalArgumentException(("Requested element count " + r4 + " is less than zero.").toString());
    }

    /* JADX INFO: renamed from: w0 */
    public static final void m551w0(Iterable r1, AbstractCollection r2) {
        AbstractC0307g.m703e(r1, "<this>");
        Iterator r12 = r1.iterator();
    L4:
        if (r12.hasNext() == false) goto L6;
        r2.add(r12.next());
        goto L4
    }

    /* JADX INFO: renamed from: x0 */
    public static int[] m552x0(ArrayList r4) {
        int[] r02 = new int[r4.size()];
        Iterator r42 = r4.iterator();
        int r1 = 0;
    L4:
        if (r42.hasNext() == false) goto L6;
        r02[r1] = ((Number) r42.next()).intValue();
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }

    /* JADX INFO: renamed from: y0 */
    public static List m553y0(Iterable r5) {
        AbstractC0307g.m703e(r5, "<this>");
        boolean r02 = r5 instanceof Collection;
        C0190u r1 = C0190u.f401a;
        if (r02 == false) goto L14;
        Collection r03 = (Collection) r5;
        int r4 = r03.size();
        if (r4 == 0) goto L23;
        if (r4 == 1) goto L9;
        return m541A0(r03);
    L9:
        if ((r5 instanceof List) == false) goto L11;
        Object r52 = ((List) r5).get(0);
    L13:
        return AbstractC0040p.m82F(r52);
    L11:
        r52 = r5.iterator().next();
        goto L13
    L23:
        return r1;
    L14:
        if (r02 == false) goto L16;
        ArrayList r53 = m541A0((Collection) r5);
    L17:
        int r04 = r53.size();
        if (r04 == 0) goto L25;
        if (r04 == 1) goto L22;
        return r53;
    L22:
        return AbstractC0040p.m82F(r53.get(0));
    L25:
        return r1;
    L16:
        ArrayList r05 = new ArrayList();
        m551w0(r5, r05);
        r53 = r05;
        goto L17
    }

    /* JADX INFO: renamed from: z0 */
    public static long[] m554z0(ArrayList r5) {
        long[] r02 = new long[r5.size()];
        Iterator r52 = r5.iterator();
        int r1 = 0;
    L4:
        if (r52.hasNext() == false) goto L6;
        r02[r1] = ((Number) r52.next()).longValue();
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }
}
