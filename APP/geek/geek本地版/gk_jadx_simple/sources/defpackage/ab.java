package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ab extends gb {
    public static final void i0(Collection r1, StringBuilder r2, CharSequence r3, CharSequence r4, CharSequence r5, CharSequence r6, sm r7) {
        r2.append(r4);
        Iterator r12 = r1.iterator();
        int r42 = 0;
    L4:
        if (r12.hasNext() == false) goto L19;
        Object r62 = r12.next();
        boolean r0 = true;
        r42 = r42 + 1;
        if (r42 <= 1) goto L8;
        r2.append(r3);
    L8:
        if (r7 != null) goto L9;
        if (r62 == null) goto L13;
        r0 = r62 instanceof CharSequence;
    L13:
        if (r0 == true) goto L14;
        if ((r62 instanceof Character) == true) goto L17;
        r2.append(r62.toString());
        goto L4
    L17:
        r2.append(((Character) r62).charValue());
        goto L4
    L14:
        r2.append((CharSequence) r62);
        goto L4
    L9:
        r2.append((CharSequence) r7.f(r62));
        goto L4
    L19:
        r2.append(r5);
    }

    public static String j0(Collection r7, String r8, sm r9, int r10) {
        if ((r10 & 1) == 0) goto L5;
        r8 = ", ";
    L5:
        String r2 = r8;
        String r0 = "";
        if ((r10 & 2) == 0) goto L8;
        CharSequence r3 = "";
    L10:
        if ((r10 & 4) == 0) goto L12;
    L11:
        String r4 = r0;
        if ((r10 & 32) == 0) goto L16;
        r9 = null;
    L16:
        ip.o("separator", r2);
        StringBuilder r1 = new StringBuilder();
        i0(r7, r1, r2, r3, r4, "...", r9);
        return r1.toString();
    L12:
        r0 = "]";
        goto L11
    L8:
        r3 = "[";
        goto L10
    }

    public static Comparable k0(ArrayList r3) {
        Iterator r32 = r3.iterator();
        if (r32.hasNext() == true) goto L6;
        return null;
    L6:
        Comparable r0 = (Comparable) r32.next();
    L8:
        if (r32.hasNext() == false) goto L12;
        Comparable r1 = (Comparable) r32.next();
        if (r0.compareTo(r1) <= 0) goto L8;
        r0 = r1;
        goto L8
    L12:
        return r0;
    }

    public static List l0(Iterable r4) {
        ip.o("<this>", r4);
        boolean r0 = r4 instanceof Collection;
        if (r0 == false) goto L15;
        Collection r02 = (Collection) r4;
        int r3 = r02.size();
        if (r3 == 0) goto L28;
        if (r3 == 1) goto L10;
        return new ArrayList(r02);
    L10:
        if ((r4 instanceof List) == false) goto L12;
        Object r42 = ((List) r4).get(0);
    L14:
        return ip.C(r42);
    L12:
        r42 = r02.iterator().next();
    L28:
        return yi.a;
    L15:
        if (r0 == false) goto L17;
        ArrayList r03 = new ArrayList((Collection) r4);
    L21:
        int r43 = r03.size();
        if (r43 == 0) goto L28;
        if (r43 == 1) goto L26;
        return r03;
    L26:
        return ip.C(r03.get(0));
    L17:
        r03 = new ArrayList();
        Iterator r44 = r4.iterator();
    L19:
        if (r44.hasNext() == false) goto L21;
        r03.add(r44.next());
        goto L19
    }
}
