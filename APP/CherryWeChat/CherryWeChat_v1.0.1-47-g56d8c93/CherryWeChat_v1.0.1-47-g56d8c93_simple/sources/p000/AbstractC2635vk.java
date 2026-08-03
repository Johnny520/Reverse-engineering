package p000;

/* JADX INFO: renamed from: vk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2635vk {

    /* JADX INFO: renamed from: a */
    public static final int[] f9143a = null;

    /* JADX INFO: renamed from: b */
    public static final long[] f9144b = null;

    static {
        int[] r1 = new int[256];
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r3 >= 256) goto L6;
        r1[r3] = "0123456789abcdef".charAt(r3 & 15) | ("0123456789abcdef".charAt(r3 >> 4) << '\b');
        r3 = r3 + 1;
        goto L4
    L6:
        f9143a = r1;
        int[] r12 = new int[256];
        int r32 = 0;
    L8:
        if (r32 >= 256) goto L10;
        r12[r32] = "0123456789ABCDEF".charAt(r32 & 15) | ("0123456789ABCDEF".charAt(r32 >> 4) << '\b');
        r32 = r32 + 1;
        goto L8
    L10:
        int[] r13 = new int[256];
        int r33 = 0;
    L11:
        if (r33 >= 256) goto L13;
        r13[r33] = -1;
        r33 = r33 + 1;
        goto L11
    L13:
        int r34 = 0;
        int r6 = 0;
    L15:
        if (r34 >= "0123456789abcdef".length()) goto L17;
        r13["0123456789abcdef".charAt(r34)] = r6;
        r34 = r34 + 1;
        r6 = r6 + 1;
        goto L15
    L17:
        int r35 = 0;
        int r62 = 0;
    L19:
        if (r35 >= "0123456789ABCDEF".length()) goto L21;
        r13["0123456789ABCDEF".charAt(r35)] = r62;
        r35 = r35 + 1;
        r62 = r62 + 1;
        goto L19
    L21:
        long[] r14 = new long[256];
        int r36 = 0;
    L22:
        if (r36 >= 256) goto L24;
        r14[r36] = -1;
        r36 = r36 + 1;
        goto L22
    L24:
        int r0 = 0;
        int r37 = 0;
    L26:
        if (r0 >= "0123456789abcdef".length()) goto L28;
        r14["0123456789abcdef".charAt(r0)] = r37;
        r0 = r0 + 1;
        r37 = r37 + 1;
        goto L26
    L28:
        int r02 = 0;
    L30:
        if (r2 >= "0123456789ABCDEF".length()) goto L32;
        r14["0123456789ABCDEF".charAt(r2)] = r02;
        r2 = r2 + 1;
        r02 = r02 + 1;
        goto L30
    L32:
        f9144b = r14;
    }

    /* JADX INFO: renamed from: a */
    public static final void m5160a(String r3, int r4, int r5) {
        int r0 = r5 - r4;
        if (r0 < 1) goto L15;
        if (r0 <= 16) goto L13;
        int r02 = (r0 + r4) - 16;
    L7:
        if (r4 >= r02) goto L18;
        if (r3.charAt(r4) != '0') goto L11;
        r4 = r4 + 1;
        goto L7
    L11:
        StringBuilder r03 = AbstractC2374ph.m4816m(r4, "Expected the hexadecimal digit '0' at index ", ", but was '");
        r03.append(r3.charAt(r4));
        r03.append("'.\nThe result won't fit the type being parsed.");
        throw new NumberFormatException(r03.toString());
    L18:
        return;
    L13:
        return;
    L15:
        throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + r4 + ", but was \"" + r3.substring(r4, r5) + "\" of length " + r0);
    }

    /* JADX INFO: renamed from: b */
    public static long m5161b(String r3, int r4, int r5) {
        C2764yk r0 = C2764yk.f9401c;
        int r1 = r3.length();
        if (r4 < 0) goto L19;
        if (r5 > r1) goto L19;
        if (r4 > r5) goto L17;
        if (r0.f9403b.f9302a == false) goto L11;
        m5160a(r3, r4, r5);
        return m5162c(r3, r4, r5);
    L11:
        if ((r5 - r4) <= 0) goto L15;
        m5160a(r3, r4, r5);
        return m5162c(r3, r4, r5);
    L15:
        throw new NumberFormatException(AbstractC0213Ey.m420r("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ", r3.substring(r4, r5)));
    L17:
        throw new IllegalArgumentException("startIndex: " + r4 + " > endIndex: " + r5);
    L19:
        throw new IndexOutOfBoundsException("startIndex: " + r4 + ", endIndex: " + r5 + ", size: " + r1);
    }

    /* JADX INFO: renamed from: c */
    public static final long m5162c(String r7, int r8, int r9) {
        long r2 = 0;
    L3:
        if (r8 >= r9) goto L11;
        long r22 = r2 << 4;
        char r4 = r7.charAt(r8);
        if ((r4 >>> '\b') != 0) goto L9;
        long r42 = f9144b[r4];
        if (r42 < 0) goto L9;
        r2 = r22 | r42;
        r8 = r8 + 1;
    L9:
        StringBuilder r0 = AbstractC2374ph.m4816m(r8, "Expected a hexadecimal digit at index ", ", but was ");
        r0.append(r7.charAt(r8));
        throw new NumberFormatException(r0.toString());
    L11:
        return r2;
    }
}
