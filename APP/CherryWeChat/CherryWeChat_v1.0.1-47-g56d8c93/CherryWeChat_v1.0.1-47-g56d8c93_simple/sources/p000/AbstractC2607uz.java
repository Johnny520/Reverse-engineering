package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: uz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2607uz extends AbstractC0671Pj {
    /* JADX INFO: renamed from: D */
    public static String m5118D(String r9) {
        C2287no r0 = new C2287no(r9);
        if (r0.hasNext() == true) goto L5;
        List r02 = C0452Kf.f1484a;
    L13:
        ArrayList r1 = new ArrayList();
        Iterator r2 = r02.iterator();
    L15:
        if (r2.hasNext() == false) goto L19;
        Object r3 = r2.next();
        if (AbstractC2564tz.m5059T((String) r3) == true) goto L15;
        r1.add(r3);
        goto L15
    L19:
        ArrayList r22 = new ArrayList(AbstractC2539ta.m5019d0(r1, 10));
        Iterator r12 = r1.iterator();
    L20:
        int r4 = 0;
        if (r12.hasNext() == false) goto L34;
        String r32 = (String) r12.next();
        int r5 = r32.length();
    L24:
        if (r4 >= r5) goto L30;
        char r7 = r32.charAt(r4);
        if (Character.isWhitespace(r7) == true) goto L29;
        if (Character.isSpaceChar(r7) == true) goto L29;
    L31:
        if (r4 != (-1)) goto L33;
        r4 = r32.length();
    L33:
        r22.add(Integer.valueOf(r4));
    L29:
        r4 = r4 + 1;
        goto L24
    L30:
        r4 = -1;
        goto L31
    L34:
        Iterator r13 = r22.iterator();
        if (r13.hasNext() == true) goto L37;
        Comparable r23 = null;
    L43:
        Integer r24 = (Integer) r23;
        if (r24 == null) goto L46;
        int r14 = r24.intValue();
    L47:
        int r92 = r9.length();
        r02.size();
        int r25 = AbstractC2496sa.m4976a0(r02);
        ArrayList r52 = new ArrayList();
        Iterator r03 = r02.iterator();
    L49:
        if (r03.hasNext() == false) goto L64;
        Object r6 = r03.next();
        int r72 = r4 + 1;
        if (r4 < 0) goto L62;
        String r62 = (String) r6;
        if (r4 == 0) goto L56;
        if (r4 == r25) goto L56;
    L58:
        String r42 = AbstractC2564tz.m5052M(r14, r62);
    L59:
        if (r42 == null) goto L61;
        r52.add(r42);
    L61:
        r4 = r72;
    L56:
        if (AbstractC2564tz.m5059T(r62) == false) goto L58;
        r42 = null;
        goto L59
    L62:
        AbstractC2496sa.m4978c0();
        throw null;
    L64:
        StringBuilder r04 = new StringBuilder(r92);
        AbstractC2453ra.m4900j0(r52, r04, "\n");
        return r04.toString();
    L46:
        r14 = 0;
        goto L47
    L37:
        r23 = (Comparable) r13.next();
    L39:
        if (r13.hasNext() == false) goto L43;
        Comparable r53 = (Comparable) r13.next();
        if (r23.compareTo(r53) <= 0) goto L39;
        r23 = r53;
        goto L39
    L5:
        Object r15 = r0.next();
        if (r0.hasNext() == true) goto L8;
        r02 = Collections.singletonList(r15);
        goto L13
    L8:
        ArrayList r26 = new ArrayList();
        r26.add(r15);
    L10:
        if (r0.hasNext() == false) goto L12;
        r26.add(r0.next());
        goto L10
    L12:
        r02 = r26;
        goto L13
    }
}
