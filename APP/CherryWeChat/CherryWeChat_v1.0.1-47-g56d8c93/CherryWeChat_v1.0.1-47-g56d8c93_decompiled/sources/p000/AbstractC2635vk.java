package p000;

/* JADX INFO: renamed from: vk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2635vk {

    /* JADX INFO: renamed from: a */
    public static final int[] f9143a;

    /* JADX INFO: renamed from: b */
    public static final long[] f9144b;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        f9143a = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        f9144b = jArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m5160a(String str, int i, int i2) {
        int i3 = i2 - i;
        if (i3 < 1) {
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i + ", but was \"" + str.substring(i, i2) + "\" of length " + i3);
        }
        if (i3 > 16) {
            int i4 = (i3 + i) - 16;
            while (i < i4) {
                if (str.charAt(i) != '0') {
                    StringBuilder sbM4816m = AbstractC2374ph.m4816m(i, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbM4816m.append(str.charAt(i));
                    sbM4816m.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbM4816m.toString());
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m5161b(String str, int i, int i2) {
        C2764yk c2764yk = C2764yk.f9401c;
        int length = str.length();
        if (i < 0 || i2 > length) {
            throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + length);
        }
        if (i > i2) {
            throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
        }
        if (c2764yk.f9403b.f9302a) {
            m5160a(str, i, i2);
            return m5162c(str, i, i2);
        }
        if (i2 - i <= 0) {
            throw new NumberFormatException(AbstractC0213Ey.m420r("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ", str.substring(i, i2)));
        }
        m5160a(str, i, i2);
        return m5162c(str, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public static final long m5162c(String str, int i, int i2) {
        long j = 0;
        while (i < i2) {
            long j2 = j << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j3 = f9144b[cCharAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                    i++;
                }
            }
            StringBuilder sbM4816m = AbstractC2374ph.m4816m(i, "Expected a hexadecimal digit at index ", ", but was ");
            sbM4816m.append(str.charAt(i));
            throw new NumberFormatException(sbM4816m.toString());
        }
        return j;
    }
}
