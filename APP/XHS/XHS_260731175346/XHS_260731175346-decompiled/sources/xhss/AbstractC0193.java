package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛷᲁᲁ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0193 extends xhss.AbstractC0485 {
    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public static java.lang.Object m447(int r1, java.lang.Object[] r2) {
            if (r1 < 0) goto L8
            int r0 = r2.length
            if (r1 >= r0) goto L8
            r1 = r2[r1]
            return r1
        L8:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static void m448(int r0, int r1, int r2, java.lang.Object[] r3, java.lang.Object[] r4) {
            int r2 = r2 - r1
            java.lang.System.arraycopy(r3, r1, r4, r0, r2)
            return
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static java.util.ArrayList m449(java.lang.Object[] r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L13
            r3 = r4[r2]
            if (r3 == 0) goto L10
            r0.add(r3)
        L10:
            int r2 = r2 + 1
            goto L7
        L13:
            return r0
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static void m450(int r2, int r3, int r4, java.lang.Object[] r5, java.lang.Object[] r6) {
            r0 = r4 & 4
            r1 = 0
            if (r0 == 0) goto L6
            r2 = r1
        L6:
            r4 = r4 & 8
            if (r4 == 0) goto Lb
            int r3 = r5.length
        Lb:
            int r3 = r3 - r2
            java.lang.System.arraycopy(r5, r2, r6, r1, r3)
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public static byte[] m451(byte[] r1, int r2, int r3) {
            int r0 = r1.length
            xhss.AbstractC0485.m881(r3, r0)
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public static void m452(byte[] r1, byte[] r2, int r3, int r4) {
            r0 = 0
            int r4 = r4 - r3
            java.lang.System.arraycopy(r1, r3, r2, r0, r4)
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static boolean m453(char[] r4, char r5) {
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto Ld
            char r3 = r4[r2]
            if (r5 != r3) goto La
            goto Le
        La:
            int r2 = r2 + 1
            goto L3
        Ld:
            r2 = -1
        Le:
            if (r2 < 0) goto L12
            r4 = 1
            return r4
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public static java.util.List m454(java.lang.Object[] r2) {
            int r0 = r2.length
            if (r0 == 0) goto L18
            r1 = 1
            if (r0 == r1) goto L10
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.util.List r2 = java.util.Arrays.asList(r2)
            return r2
        L10:
            r0 = 0
            r2 = r2[r0]
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L18:
            xhss.ᛵᛷᛶᛱ r2 = xhss.C0492.f1802
            return r2
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public static int m455(java.lang.Object[] r3, java.lang.Object r4) {
            r0 = 0
            if (r4 != 0) goto Le
            int r4 = r3.length
        L4:
            if (r0 >= r4) goto L1d
            r1 = r3[r0]
            if (r1 != 0) goto Lb
            return r0
        Lb:
            int r0 = r0 + 1
            goto L4
        Le:
            int r1 = r3.length
        Lf:
            if (r0 >= r1) goto L1d
            r2 = r3[r0]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1a
            return r0
        L1a:
            int r0 = r0 + 1
            goto Lf
        L1d:
            r3 = -1
            return r3
    }

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public static java.lang.String m456(java.lang.Object[] r7, xhss.InterfaceC0645 r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            int r2 = r7.length
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L1e
            r5 = r7[r3]
            r6 = 1
            int r4 = r4 + r6
            if (r4 <= r6) goto L18
            r0.append(r1)
        L18:
            xhss.AbstractC0561.m1008(r0, r5, r8)
            int r3 = r3 + 1
            goto Ld
        L1e:
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            return r7
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static void m457(int r0, int r1, int r2, int[] r3, int[] r4) {
            int r2 = r2 - r1
            java.lang.System.arraycopy(r3, r1, r4, r0, r2)
            return
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public static java.lang.String m458(byte[] r7, java.lang.String r8, xhss.InterfaceC0645 r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            int r2 = r7.length
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L28
            r5 = r7[r3]
            r6 = 1
            int r4 = r4 + r6
            if (r4 <= r6) goto L18
            r0.append(r8)
        L18:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            java.lang.Object r5 = r9.mo112(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L28:
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            return r7
    }
}
