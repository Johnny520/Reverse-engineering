package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: tz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2564tz extends AbstractC0085Bz {
    /* JADX INFO: renamed from: L */
    public static boolean m5051L(CharSequence r8, CharSequence r9, boolean r10) {
        if ((r9 instanceof String) == false) goto L8;
        if (m5057R(r8, (String) r9, 0, r10, 2) >= 0) goto L12;
    L11:
        return false;
    L12:
        return true;
    L8:
        if (m5055P(r8, r9, 0, r8.length(), r10, false) < 0) goto L11;
        return true;
    }

    /* JADX INFO: renamed from: M */
    public static String m5052M(int r1, String r2) {
        if (r1 < 0) goto L9;
        int r0 = r2.length();
        if (r1 <= r0) goto L7;
        r1 = r0;
    L7:
        return r2.substring(r1);
    L9:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r1, "Requested character count ", " is less than zero.").toString());
    }

    /* JADX INFO: renamed from: N */
    public static final int m5053N(CharSequence r0) {
        return r0.length() - 1;
    }

    /* JADX INFO: renamed from: O */
    public static final int m5054O(CharSequence r6, String r7, int r8, boolean r9) {
        if (r9 == true) goto L9;
        if ((r6 instanceof String) == false) goto L9;
        return ((String) r6).indexOf(r7, r8);
    L9:
        return m5055P(r6, r7, r8, r6.length(), r9, false);
    }

    /* JADX INFO: renamed from: P */
    public static final int m5055P(CharSequence r15, CharSequence r16, int r17, int r18, boolean r19, boolean r20) {
        CharSequence r0 = r16;
        int r1 = r17;
        int r2 = r18;
        if (r20 == false) goto L5;
        int r4 = m5053N(r15);
        if (r1 <= r4) goto L14;
        r1 = r4;
    L14:
        if (r2 >= 0) goto L16;
        r2 = 0;
    L16:
        C0157Dl r42 = new C0157Dl(r1, r2, -1);
    L17:
        boolean r12 = r15 instanceof String;
        int r7 = r42.f434c;
        int r8 = r42.f433b;
        int r22 = r42.f432a;
        if (r12 == true) goto L20;
    L34:
        if (r7 <= 0) goto L36;
        if (r22 > r8) goto L36;
    L38:
        int r3 = r22;
    L40:
        if (m5062W(r0, 0, r15, r3, r0.length(), r19) == true) goto L41;
        if (r3 == r8) goto L44;
        r3 = r3 + r7;
        r0 = r16;
    L44:
        return -1;
    L41:
        return r3;
    L36:
        if (r7 >= 0) goto L44;
        if (r8 > r22) goto L44;
    L20:
        if ((r0 instanceof String) == false) goto L34;
        if (r7 <= 0) goto L23;
        if (r22 > r8) goto L23;
    L25:
        int r13 = r22;
    L26:
        String r9 = (String) r0;
        String r122 = (String) r15;
        int r14 = r9.length();
        if (r19 == true) goto L29;
        boolean r110 = r9.regionMatches(0, r122, r13, r14);
    L30:
        if (r110 == true) goto L31;
        if (r13 == r8) goto L44;
        r13 = r13 + r7;
        goto L26
    L31:
        return r13;
    L29:
        r110 = r9.regionMatches(r19, 0, r122, r13, r14);
    L23:
        if (r7 >= 0) goto L44;
        if (r8 > r22) goto L44;
    L5:
        if (r1 >= 0) goto L7;
        r1 = 0;
    L7:
        int r32 = r15.length();
        if (r2 <= r32) goto L10;
        r2 = r32;
    L10:
        r42 = new C0286Gl(r1, r2, 1);
        goto L17
    }

    /* JADX INFO: renamed from: Q */
    public static int m5056Q(CharSequence r1, char r2, int r3, int r4) {
        if ((r4 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r1 instanceof String) == true) goto L10;
        return m5058S(r1, new char[]{r2}, r3, false);
    L10:
        return ((String) r1).indexOf(r2, r3);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ int m5057R(CharSequence r2, String r3, int r4, boolean r5, int r6) {
        if ((r6 & 2) == 0) goto L6;
        r4 = 0;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r5 = false;
    L9:
        return m5054O(r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: S */
    public static final int m5058S(CharSequence r6, char[] r7, int r8, boolean r9) {
        if (r9 == false) goto L5;
    L17:
        if (r8 >= 0) goto L19;
        r8 = 0;
    L19:
        int r1 = m5053N(r6);
        if (r8 > r1) goto L29;
    L21:
        char r2 = r6.charAt(r8);
        int r3 = r7.length;
        int r4 = 0;
    L22:
        if (r4 >= r3) goto L27;
        if (AbstractC0148Dc.m274h(r7[r4], r2, r9) == true) goto L25;
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

    /* JADX INFO: renamed from: T */
    public static boolean m5059T(CharSequence r4) {
        int r1 = 0;
    L4:
        if (r1 >= r4.length()) goto L12;
        char r2 = r4.charAt(r1);
        if (Character.isWhitespace(r2) == true) goto L11;
        if (Character.isSpaceChar(r2) == true) goto L11;
        return false;
    L11:
        r1 = r1 + 1;
        goto L4
    L12:
        return true;
    }

    /* JADX INFO: renamed from: U */
    public static int m5060U(int r6, String r7, String r8) {
        if ((r6 & 2) == 0) goto L6;
        int r62 = m5053N(r7);
    L5:
        int r2 = r62;
        if (r7 != null) goto L11;
        return m5055P(r7, r8, r2, 0, false, true);
    L11:
        return r7.lastIndexOf(r8, r2);
    L6:
        r62 = 0;
        goto L5
    }

    /* JADX INFO: renamed from: V */
    public static int m5061V(String r4, char r5) {
        int r0 = m5053N(r4);
        if (r4 != null) goto L19;
        char[] r1 = {r5};
        if (r4 != null) goto L7;
        int r52 = m5053N(r4);
        if (r0 <= r52) goto L12;
        r0 = r52;
    L12:
        if ((-1) >= r0) goto L17;
        if (AbstractC0148Dc.m274h(r1[0], r4.charAt(r0), false) == true) goto L15;
        r0 = r0 - 1;
        goto L12
    L15:
        return r0;
    L17:
        return -1;
    L7:
        return r4.lastIndexOf(r1[0], r0);
    L19:
        return r4.lastIndexOf(r5, r0);
    }

    /* JADX INFO: renamed from: W */
    public static final boolean m5062W(CharSequence r4, int r5, CharSequence r6, int r7, int r8, boolean r9) {
        if (r7 < 0) goto L18;
        if (r5 < 0) goto L18;
        if (r5 > (r4.length() - r8)) goto L18;
        if (r7 > (r6.length() - r8)) goto L18;
        int r1 = 0;
    L11:
        if (r1 >= r8) goto L16;
        if (AbstractC0148Dc.m274h(r4.charAt(r5 + r1), r6.charAt(r7 + r1), r9) == false) goto L14;
        r1 = r1 + 1;
        goto L11
    L14:
        return false;
    L16:
        return true;
    L18:
        return false;
    }

    /* JADX INFO: renamed from: X */
    public static final void m5063X(int r1) {
        if (r1 < 0) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r1, "Limit must be non-negative, but was ").toString());
    }

    /* JADX INFO: renamed from: Y */
    public static final List m5064Y(int r8, CharSequence r9, String r10) {
        m5063X(r8);
        int r1 = m5054O(r9, r10, 0, false);
        if (r1 == (-1)) goto L25;
        if (r8 == 1) goto L25;
        if (r8 <= 0) goto L9;
        boolean r4 = true;
    L10:
        int r6 = 10;
        if (r4 == false) goto L15;
        if (r8 > 10) goto L15;
        r6 = r8;
    L15:
        ArrayList r5 = new ArrayList(r6);
        int r62 = 0;
    L16:
        r5.add(r9.subSequence(r62, r1).toString());
        r62 = r10.length() + r1;
        if (r4 == true) goto L19;
    L20:
        r1 = m5054O(r9, r10, r62, false);
        if (r1 != (-1)) goto L16;
    L22:
        r5.add(r9.subSequence(r62, r9.length()).toString());
        return r5;
    L19:
        if (r5.size() == (r8 - 1)) goto L22;
    L9:
        r4 = false;
    L25:
        return Collections.singletonList(r9.toString());
    }

    /* JADX INFO: renamed from: Z */
    public static List m5065Z(CharSequence r4, String[] r5, int r6) {
        if ((r6 & 4) == 0) goto L5;
        int r62 = 0;
    L7:
        if (r5.length != 1) goto L13;
        String r0 = r5[0];
        if (r0.length() == 0) goto L13;
        return m5064Y(r62, r4, r0);
    L13:
        m5063X(r62);
        C2107jl r52 = new C2107jl(1, new C2499sd(r4, r62, new C1082Z7(1, Arrays.asList(r5)), 0));
        ArrayList r63 = new ArrayList(AbstractC2539ta.m5019d0(r52, 10));
        Iterator r53 = r52.iterator();
    L14:
        C2456rd r02 = (C2456rd) r53;
        if (r02.hasNext() == false) goto L17;
        C0286Gl r03 = (C0286Gl) r02.next();
        r63.add(r4.subSequence(r03.f432a, r03.f433b + 1).toString());
        goto L14
    L17:
        return r63;
    L5:
        r62 = 2;
        goto L7
    }

    /* JADX INFO: renamed from: a0 */
    public static List m5066a0(String r5, char[] r6) {
        int r1 = 0;
        if (r6.length == 1) goto L5;
        m5063X(0);
        C2499sd r0 = new C2499sd(r5, r1, new C1082Z7(2, r6), 0);
        C2107jl r62 = new C2107jl(1, r0);
        ArrayList r02 = new ArrayList(AbstractC2539ta.m5019d0(r62, 10));
        Iterator r63 = r62.iterator();
    L7:
        C2456rd r12 = (C2456rd) r63;
        if (r12.hasNext() == false) goto L10;
        C0286Gl r13 = (C0286Gl) r12.next();
        r02.add(r5.subSequence(r13.f432a, r13.f433b + 1).toString());
        goto L7
    L10:
        return r02;
    L5:
        return m5064Y(0, r5, String.valueOf(r6[0]));
    }

    /* JADX INFO: renamed from: b0 */
    public static String m5067b0(String r2, String r3) {
        int r0 = m5057R(r2, r3, 0, false, 6);
        if (r0 != (-1)) goto L6;
        return r2;
    L6:
        return r2.substring(r3.length() + r0, r2.length());
    }

    /* JADX INFO: renamed from: c0 */
    public static String m5068c0(String r1, char r2) {
        int r22 = m5061V(r1, r2);
        if (r22 != (-1)) goto L6;
        return r1;
    L6:
        return r1.substring(r22 + 1, r1.length());
    }

    /* JADX INFO: renamed from: d0 */
    public static String m5069d0(String r2, String r3) {
        int r0 = m5060U(6, r2, r3);
        if (r0 != (-1)) goto L6;
        return r2;
    L6:
        return r2.substring(r3.length() + r0, r2.length());
    }

    /* JADX INFO: renamed from: e0 */
    public static CharSequence m5070e0(String r7) {
        int r0 = r7.length() - 1;
        int r3 = 0;
        boolean r4 = false;
    L3:
        if (r3 > r0) goto L22;
        if (r4 == true) goto L6;
        int r5 = r3;
    L7:
        char r52 = r7.charAt(r5);
        if (Character.isWhitespace(r52) == false) goto L10;
    L13:
        boolean r53 = true;
    L14:
        if (r4 == false) goto L15;
        if (r53 == false) goto L22;
        r0 = r0 - 1;
        goto L3
    L15:
        if (r53 == false) goto L16;
        r3 = r3 + 1;
        goto L3
    L16:
        r4 = true;
        goto L3
    L10:
        if (Character.isSpaceChar(r52) == true) goto L13;
        r53 = false;
        goto L14
    L6:
        r5 = r0;
    L22:
        return r7.subSequence(r3, r0 + 1);
    }
}
