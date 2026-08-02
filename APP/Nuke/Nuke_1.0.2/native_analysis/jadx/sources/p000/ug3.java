package p000;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ug3 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f11300a = new byte[0];

    /* JADX INFO: renamed from: b */
    public static final nv1 f11301b;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
    
        continue;
     */
    static {
        C0505no c0505no = C0505no.f7266k;
        C0505no[] c0505noArr = {C0160eb.m1320y("efbbbf"), C0160eb.m1320y("feff"), C0160eb.m1320y("fffe0000"), C0160eb.m1320y("fffe"), C0160eb.m1320y("0000feff")};
        ArrayList arrayList = new ArrayList(new C0960zf(c0505noArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            arrayList2.set(AbstractC0179eu.m1475y(arrayList, c0505noArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((C0505no) arrayList.get(0)).mo3322a() <= 0) {
            C0676s.m4651j("the empty byte string is not a supported option");
            return;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            C0505no c0505no2 = (C0505no) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                C0505no c0505no3 = (C0505no) arrayList.get(i6);
                c0505no3.getClass();
                c0505no2.getClass();
                if (c0505no3.mo3327f(c0505no2, c0505no2.mo3322a())) {
                    if (c0505no3.mo3322a() == c0505no2.mo3322a()) {
                        c80.m682z("duplicate option: ", c0505no3);
                        return;
                    } else if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                        arrayList.remove(i6);
                        ((Number) arrayList2.remove(i6)).intValue();
                    } else {
                        i6++;
                    }
                }
            }
            i4 = i5;
        }
        C0209fn c0209fn = new C0209fn();
        AbstractC0691se.m4855z(0L, c0209fn, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (c0209fn.f3068i / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = c0209fn.readInt();
        }
        f11301b = new nv1((C0505no[]) Arrays.copyOf(c0505noArr, 5), iArr);
    }

    /* JADX INFO: renamed from: a */
    public static final void m5493a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("length=" + j + ", offset=" + j2 + ", count=" + j2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5494b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m5495c(String str, char c, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public static final int m5496d(String str, int i, String str2, int i2) {
        str.getClass();
        while (i < i2) {
            if (pv2.m3996i0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m5497e(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final int m5498f(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (t11.m5089o(cCharAt, 31) <= 0 || t11.m5089o(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static final int m5499g(String str, int i, int i2) {
        str.getClass();
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public static final int m5500h(String str, int i, int i2) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public static final String[] m5501i(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m5502j(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    /* JADX INFO: renamed from: k */
    public static final int m5503k(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: l */
    public static final int m5504l(InterfaceC0549on interfaceC0549on) {
        interfaceC0549on.getClass();
        return (interfaceC0549on.readByte() & 255) | ((interfaceC0549on.readByte() & 255) << 16) | ((interfaceC0549on.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: m */
    public static final int m5505m(String str, int i) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }
}
