package p000;

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

/* JADX INFO: renamed from: ra */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2453ra extends AbstractC2711xa {
    /* JADX INFO: renamed from: g0 */
    public static boolean m4897g0(Collection r3, Object r4) {
        if (r3 == null) goto L6;
        return r3.contains(r4);
    L6:
        if ((r3 instanceof List) == false) goto L8;
        int r32 = ((List) r3).indexOf(r4);
    L20:
        if (r32 < 0) goto L23;
        return true;
    L23:
        return false;
    L8:
        Iterator r33 = r3.iterator();
        int r0 = 0;
    L10:
        if (r33.hasNext() == false) goto L19;
        Object r2 = r33.next();
        if (r0 < 0) goto L17;
        if (AbstractC0585Nj.m1134a(r4, r2) == true) goto L15;
        r0 = r0 + 1;
        goto L10
    L15:
        r32 = r0;
        goto L20
    L17:
        AbstractC2496sa.m4978c0();
        throw null;
    L19:
        r32 = -1;
        goto L20
    }

    /* JADX INFO: renamed from: h0 */
    public static Object m4898h0(List r1) {
        if (r1.isEmpty() == true) goto L7;
        return r1.get(0);
    L7:
        throw new NoSuchElementException("List is empty.");
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m4899i0(Iterable r2, StringBuilder r3, String r4, CharSequence r5, CharSequence r6, InterfaceC1416fj r7) {
        r3.append(r5);
        Iterator r22 = r2.iterator();
        int r52 = 0;
    L4:
        if (r22.hasNext() == false) goto L9;
        Object r0 = r22.next();
        r52 = r52 + 1;
        if (r52 <= 1) goto L8;
        r3.append(r4);
    L8:
        AbstractC0671Pj.m1344b(r3, r0, r7);
        goto L4
    L9:
        r3.append(r6);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m4900j0(List r6, StringBuilder r7, String r8) {
        m4899i0(r6, r7, r8, "", "", null);
    }

    /* JADX INFO: renamed from: k0 */
    public static String m4901k0(Iterable r2, String r3, String r4, String r5, InterfaceC1416fj r6, int r7) {
        if ((r7 & 2) == 0) goto L6;
        r4 = "";
    L6:
        if ((r7 & 4) == 0) goto L9;
        r5 = "";
    L9:
        if ((r7 & 32) == 0) goto L11;
        r6 = null;
    L11:
        InterfaceC1416fj r72 = r6;
        String r62 = r5;
        StringBuilder r32 = new StringBuilder();
        m4899i0(r2, r32, r3, r4, r62, r72);
        return r32.toString();
    }

    /* JADX INFO: renamed from: l0 */
    public static Object m4902l0(List r1) {
        if (r1.isEmpty() == true) goto L7;
        return r1.get(AbstractC2496sa.m4976a0(r1));
    L7:
        throw new NoSuchElementException("List is empty.");
    }

    /* JADX INFO: renamed from: m0 */
    public static Object m4903m0(ArrayList r1) {
        if (r1.isEmpty() == false) goto L7;
        return null;
    L7:
        return r1.get(r1.size() - 1);
    }

    /* JADX INFO: renamed from: n0 */
    public static List m4904n0(List r2, Comparator r3) {
        if (r2 != null) goto L5;
        if (r2 == null) goto L15;
        ArrayList r1 = new ArrayList(r2);
    L17:
        if (r1.size() <= 1) goto L19;
        Collections.sort(r1, r3);
    L19:
        return r1;
    L15:
        r1 = new ArrayList();
        m4906p0(r2, r1);
        goto L17
    L5:
        if (r2.size() <= 1) goto L7;
        Object[] r22 = r2.toArray(new Object[0]);
        if (r22.length <= 1) goto L12;
        Arrays.sort(r22, r3);
    L12:
        return Arrays.asList(r22);
    L7:
        return m4908r0(r2);
    }

    /* JADX INFO: renamed from: o0 */
    public static List m4905o0(int r6, List r7) {
        if (r6 < 0) goto L34;
        C0452Kf r0 = C0452Kf.f1484a;
        if (r6 != 0) goto L7;
        return r0;
    L7:
        if (r7 != null) goto L9;
    L22:
        ArrayList r2 = new ArrayList(r6);
        Iterator r72 = r7.iterator();
        int r4 = 0;
    L24:
        if (r72.hasNext() == false) goto L27;
        r2.add(r72.next());
        r4 = r4 + 1;
        if (r4 != r6) goto L24;
    L27:
        int r62 = r2.size();
        if (r62 == 0) goto L38;
        if (r62 == 1) goto L32;
        return r2;
    L32:
        return Collections.singletonList(r2.get(0));
    L38:
        return r0;
    L9:
        if (r6 >= r7.size()) goto L11;
        if (r6 != 1) goto L22;
        if (r7 == null) goto L15;
        Object r63 = m4898h0(r7);
    L19:
        return Collections.singletonList(r63);
    L15:
        Iterator r64 = r7.iterator();
        if (r64.hasNext() == false) goto L21;
        r63 = r64.next();
        goto L19
    L21:
        throw new NoSuchElementException("Collection is empty.");
    L11:
        return m4908r0(r7);
    L34:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r6, "Requested element count ", " is less than zero.").toString());
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m4906p0(Iterable r1, AbstractCollection r2) {
        Iterator r12 = r1.iterator();
    L4:
        if (r12.hasNext() == false) goto L6;
        r2.add(r12.next());
        goto L4
    }

    /* JADX INFO: renamed from: q0 */
    public static int[] m4907q0(ArrayList r4) {
        int[] r0 = new int[r4.size()];
        Iterator r42 = r4.iterator();
        int r1 = 0;
    L4:
        if (r42.hasNext() == false) goto L6;
        r0[r1] = ((Number) r42.next()).intValue();
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    /* JADX INFO: renamed from: r0 */
    public static List m4908r0(Iterable r5) {
        boolean r0 = r5 instanceof Collection;
        C0452Kf r1 = C0452Kf.f1484a;
        if (r0 == false) goto L16;
        Collection r02 = (Collection) r5;
        int r4 = r02.size();
        if (r4 == 0) goto L15;
        if (r4 == 1) goto L10;
        return new ArrayList(r02);
    L10:
        if ((r5 instanceof List) == false) goto L12;
        Object r52 = ((List) r5).get(0);
    L14:
        return Collections.singletonList(r52);
    L12:
        r52 = r02.iterator().next();
        goto L14
    L15:
        return r1;
    L16:
        if (r0 == false) goto L18;
        ArrayList r03 = new ArrayList((Collection) r5);
    L19:
        int r53 = r03.size();
        if (r53 == 0) goto L25;
        if (r53 == 1) goto L24;
        return r03;
    L24:
        return Collections.singletonList(r03.get(0));
    L25:
        return r1;
    L18:
        r03 = new ArrayList();
        m4906p0(r5, r03);
        goto L19
    }

    /* JADX INFO: renamed from: s0 */
    public static Set m4909s0(Collection r2) {
        int r0 = r2.size();
        if (r0 == 0) goto L15;
        if (r0 == 1) goto L9;
        LinkedHashSet r02 = new LinkedHashSet(AbstractC2598uq.m5109K(r2.size()));
        m4906p0(r2, r02);
        return r02;
    L9:
        if ((r2 instanceof List) == false) goto L11;
        Object r22 = ((List) r2).get(0);
    L13:
        return Collections.singleton(r22);
    L11:
        r22 = r2.iterator().next();
        goto L13
    L15:
        return C0538Mf.f1751a;
    }
}
