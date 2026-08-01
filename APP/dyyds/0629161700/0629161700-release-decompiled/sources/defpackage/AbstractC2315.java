package defpackage;

/* JADX INFO: renamed from: ᲈᛸᲈᛲ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2315 extends defpackage.AbstractC2346 {
    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public static java.lang.String m3764(byte[] r7, java.lang.String r8, defpackage.InterfaceC0598 r9) {
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
            java.lang.Object r5 = r9.mo617(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L28:
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            return r7
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public static int m3765(java.lang.Object r3, java.lang.Object[] r4) {
            r0 = 0
            if (r3 != 0) goto Le
            int r3 = r4.length
        L4:
            if (r0 >= r3) goto L1d
            r1 = r4[r0]
            if (r1 != 0) goto Lb
            return r0
        Lb:
            int r0 = r0 + 1
            goto L4
        Le:
            int r1 = r4.length
        Lf:
            if (r0 >= r1) goto L1d
            r2 = r4[r0]
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1a
            return r0
        L1a:
            int r0 = r0 + 1
            goto Lf
        L1d:
            r3 = -1
            return r3
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static void m3766(int r0, int r1, int r2, java.lang.Object[] r3, java.lang.Object[] r4) {
            int r2 = r2 - r1
            java.lang.System.arraycopy(r3, r1, r4, r0, r2)
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public static java.lang.Object m3767(int r1, java.lang.Object[] r2) {
            if (r1 < 0) goto L8
            int r0 = r2.length
            if (r1 >= r0) goto L8
            r1 = r2[r1]
            return r1
        L8:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static boolean m3768(char[] r4, char r5) {
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

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public static java.lang.String m3769(java.lang.Object[] r7, defpackage.InterfaceC0598 r8) {
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
            defpackage.AbstractC1171.m2264(r0, r5, r8)
            int r3 = r3 + 1
            goto Ld
        L1e:
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            return r7
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static void m3770(int r0, int r1, int r2, int[] r3, int[] r4) {
            int r2 = r2 - r1
            java.lang.System.arraycopy(r3, r1, r4, r0, r2)
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public static java.util.List m3771(java.lang.Object[] r2) {
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
            ᲀᛶᲇ r2 = defpackage.C1698.f7558
            return r2
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static void m3772(byte[] r1, byte[] r2, int r3, int r4) {
            r0 = 0
            int r4 = r4 - r3
            java.lang.System.arraycopy(r1, r3, r2, r0, r4)
            return
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public static byte[] m3773(byte[] r1, int r2, int r3) {
            int r0 = r1.length
            defpackage.AbstractC2346.m3844(r3, r0)
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static void m3774(int r2, int r3, int r4, java.lang.Object[] r5, java.lang.Object[] r6) {
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
}
