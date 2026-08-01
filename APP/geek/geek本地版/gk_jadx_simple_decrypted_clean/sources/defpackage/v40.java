package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class v40 extends ct {
    public static String z(String r13) {
        ip.o("<this>", r13);
        br r1 = new br(r13);
        if (r1.hasNext() == true) goto L5;
        List r12 = yi.a;
    L13:
        ArrayList r2 = new ArrayList();
        Iterator r3 = r12.iterator();
    L15:
        if (r3.hasNext() == false) goto L19;
        Object r4 = r3.next();
        if (b50.H((String) r4) == true) goto L15;
        r2.add(r4);
        goto L15
    L19:
        ArrayList r32 = new ArrayList(cb.h0(r2));
        int r42 = r2.size();
        int r5 = 0;
        int r6 = 0;
    L20:
        if (r6 >= r42) goto L33;
        Object r7 = r2.get(r6);
        r6 = r6 + 1;
        String r72 = (String) r7;
        int r8 = r72.length();
        int r9 = 0;
    L23:
        if (r9 >= r8) goto L29;
        char r11 = r72.charAt(r9);
        if (Character.isWhitespace(r11) == true) goto L28;
        if (Character.isSpaceChar(r11) == true) goto L28;
    L30:
        if (r9 != (-1)) goto L32;
        r9 = r72.length();
    L32:
        r32.add(Integer.valueOf(r9));
    L28:
        r9 = r9 + 1;
        goto L23
    L29:
        r9 = -1;
        goto L30
    L33:
        Integer r22 = (Integer) ab.k0(r32);
        if (r22 == null) goto L36;
        int r23 = r22.intValue();
    L37:
        int r132 = r13.length();
        r12.size();
        int r33 = r12.size() - 1;
        ArrayList r62 = new ArrayList();
        Iterator r14 = r12.iterator();
    L39:
        if (r14.hasNext() == false) goto L62;
        Object r43 = r14.next();
        int r73 = r5 + 1;
        String r82 = null;
        if (r5 < 0) goto L60;
        String r44 = (String) r43;
        if (r5 == 0) goto L46;
        if (r5 == r33) goto L46;
    L48:
        ip.o("<this>", r44);
        if (r23 < 0) goto L59;
        int r52 = r44.length();
        if (r23 > r52) goto L54;
        r52 = r23;
    L54:
        r82 = r44.substring(r52);
        ip.n("substring(...)", r82);
    L55:
        if (r82 == null) goto L57;
        r62.add(r82);
    L57:
        r5 = r73;
        goto L39
    L59:
        throw new IllegalArgumentException(("Requested character count " + r23 + " is less than zero.").toString());
    L46:
        if (b50.H(r44) == false) goto L48;
    L60:
        bb.g0();
        throw null;
    L62:
        StringBuilder r74 = new StringBuilder(r132);
        ab.i0(r62, r74, "\n", "", "", "...", null);
        return r74.toString();
    L36:
        r23 = 0;
        goto L37
    L5:
        Object r24 = r1.next();
        if (r1.hasNext() == true) goto L8;
        r12 = ip.C(r24);
        goto L13
    L8:
        ArrayList r34 = new ArrayList();
        r34.add(r24);
    L10:
        if (r1.hasNext() == false) goto L12;
        r34.add(r1.next());
        goto L10
    L12:
        r12 = r34;
        goto L13
    }
}
