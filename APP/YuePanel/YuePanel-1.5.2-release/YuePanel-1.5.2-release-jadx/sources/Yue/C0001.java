package Yue;

import Yue.C3600;
import com.android.p001dx.p004io.Opcodes;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥ۟ */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1730:1\n112#1,20:1753\n112#1,20:1786\n112#1:1806\n114#1,18:1808\n112#1,20:1826\n74#2:1731\n74#2:1732\n74#2:1733\n74#2:1734\n74#2:1735\n74#2:1736\n74#2:1737\n74#2:1738\n74#2:1739\n74#2:1740\n74#2:1741\n74#2:1742\n83#2:1743\n83#2:1744\n77#2:1745\n77#2:1746\n77#2:1747\n77#2:1748\n77#2:1749\n77#2:1750\n77#2:1751\n77#2:1752\n86#2:1773\n89#2:1775\n74#2:1776\n74#2:1777\n74#2:1778\n74#2:1779\n74#2:1780\n74#2:1781\n74#2:1782\n74#2:1783\n74#2:1784\n74#2:1785\n89#2:1807\n86#2:1846\n1#3:1774\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n415#1:1753,20\n1292#1:1786,20\n1323#1:1806\n1323#1:1808,18\n1357#1:1826,20\n178#1:1731\n202#1:1732\n321#1:1733\n326#1:1734\n349#1:1735\n350#1:1736\n351#1:1737\n352#1:1738\n358#1:1739\n359#1:1740\n360#1:1741\n361#1:1742\n385#1:1743\n386#1:1744\n392#1:1745\n393#1:1746\n394#1:1747\n395#1:1748\n396#1:1749\n397#1:1750\n398#1:1751\n399#1:1752\n427#1:1773\n888#1:1775\n906#1:1776\n908#1:1777\n912#1:1778\n914#1:1779\n918#1:1780\n920#1:1781\n924#1:1782\n926#1:1783\n946#1:1784\n949#1:1785\n1336#1:1807\n1676#1:1846\n*E\n"})
@InterfaceC5572(name = "-Buffer")
public final class C0001 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final byte[] f2 = C8582.m4551(C5282.f1386);

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f3 = 4096;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long f4238 = -922337203685477580L;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final long f4239 = -7;

    /* JADX INFO: renamed from: ۥ */
    public static final void m2(@InterfaceC6399 C3600 c3600) throws EOFException {
        C5499.m17103(c3600, "<this>");
        c3600.skip(c3600.m9684());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m3(@InterfaceC6399 C3600.C0192 c0192) {
        C5499.m17103(c0192, "<this>");
        if (c0192.f6211 == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        c0192.f6211 = null;
        c0192.m9713(null);
        c0192.f6214 = -1L;
        c0192.f6215 = null;
        c0192.f6216 = -1;
        c0192.f6217 = -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m5449(@InterfaceC6399 C3600 c3600) {
        C5499.m17103(c3600, "<this>");
        long jM9684 = c3600.m9684();
        if (jM9684 == 0) {
            return 0L;
        }
        C7275 c7275 = c3600.f6209;
        C5499.m17100(c7275);
        C7275 c72752 = c7275.f21954;
        C5499.m17100(c72752);
        int i = c72752.f21950;
        return (i >= 8192 || !c72752.f21952) ? jM9684 : jM9684 - ((long) (i - c72752.f2779));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final C3600 m5450(@InterfaceC6399 C3600 c3600) {
        C5499.m17103(c3600, "<this>");
        C3600 c36002 = new C3600();
        if (c3600.m9684() == 0) {
            return c36002;
        }
        C7275 c7275 = c3600.f6209;
        C5499.m17100(c7275);
        C7275 c7275M22727 = c7275.m22727();
        c36002.f6209 = c7275M22727;
        c7275M22727.f21954 = c7275M22727;
        c7275M22727.f21953 = c7275M22727;
        for (C7275 c72752 = c7275.f21953; c72752 != c7275; c72752 = c72752.f21953) {
            C7275 c72753 = c7275M22727.f21954;
            C5499.m17100(c72753);
            C5499.m17100(c72752);
            c72753.m22726(c72752.m22727());
        }
        c36002.m9680(c3600.m9684());
        return c36002;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final C3600 m5451(@InterfaceC6399 C3600 c3600, @InterfaceC6399 C3600 c36002, long j, long j2) {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(c36002, "out");
        C2963.m5677(c3600.m9684(), j, j2);
        if (j2 == 0) {
            return c3600;
        }
        c36002.m9680(c36002.m9684() + j2);
        C7275 c7275 = c3600.f6209;
        while (true) {
            C5499.m17100(c7275);
            int i = c7275.f21950;
            int i2 = c7275.f2779;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c7275 = c7275.f21953;
        }
        while (j2 > 0) {
            C5499.m17100(c7275);
            C7275 c7275M22727 = c7275.m22727();
            int i3 = c7275M22727.f2779 + ((int) j);
            c7275M22727.f2779 = i3;
            c7275M22727.f21950 = Math.min(i3 + ((int) j2), c7275M22727.f21950);
            C7275 c72752 = c36002.f6209;
            if (c72752 == null) {
                c7275M22727.f21954 = c7275M22727;
                c7275M22727.f21953 = c7275M22727;
                c36002.f6209 = c7275M22727;
            } else {
                C5499.m17100(c72752);
                C7275 c72753 = c72752.f21954;
                C5499.m17100(c72753);
                c72753.m22726(c7275M22727);
            }
            j2 -= (long) (c7275M22727.f21950 - c7275M22727.f2779);
            c7275 = c7275.f21953;
            j = 0;
        }
        return c3600;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final boolean m5452(@InterfaceC6399 C3600 c3600, @InterfaceC6489 Object obj) {
        C5499.m17103(c3600, "<this>");
        if (c3600 == obj) {
            return true;
        }
        if (!(obj instanceof C3600)) {
            return false;
        }
        C3600 c36002 = (C3600) obj;
        if (c3600.m9684() != c36002.m9684()) {
            return false;
        }
        if (c3600.m9684() == 0) {
            return true;
        }
        C7275 c7275 = c3600.f6209;
        C5499.m17100(c7275);
        C7275 c72752 = c36002.f6209;
        C5499.m17100(c72752);
        int i = c7275.f2779;
        int i2 = c72752.f2779;
        long j = 0;
        while (j < c3600.m9684()) {
            long jMin = Math.min(c7275.f21950 - i, c72752.f21950 - i2);
            long j2 = 0;
            while (j2 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c7275.f2778[i] != c72752.f2778[i2]) {
                    return false;
                }
                j2++;
                i = i3;
                i2 = i4;
            }
            if (i == c7275.f21950) {
                c7275 = c7275.f21953;
                C5499.m17100(c7275);
                i = c7275.f2779;
            }
            if (i2 == c72752.f21950) {
                c72752 = c72752.f21953;
                C5499.m17100(c72752);
                i2 = c72752.f2779;
            }
            j += jMin;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final long m5453(@InterfaceC6399 C3600.C0192 c0192, int i) {
        C5499.m17103(c0192, "<this>");
        if (i <= 0) {
            throw new IllegalArgumentException(("minByteCount <= 0: " + i).toString());
        }
        if (i > 8192) {
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i).toString());
        }
        C3600 c3600 = c0192.f6211;
        if (c3600 == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!c0192.f6212) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
        }
        long jM9684 = c3600.m9684();
        C7275 c7275M9687 = c3600.m9687(i);
        int i2 = 8192 - c7275M9687.f21950;
        c7275M9687.f21950 = 8192;
        long j = i2;
        c3600.m9680(jM9684 + j);
        c0192.m9713(c7275M9687);
        c0192.f6214 = jM9684;
        c0192.f6215 = c7275M9687.f2778;
        c0192.f6216 = 8192 - i2;
        c0192.f6217 = 8192;
        return j;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final byte m5454(@InterfaceC6399 C3600 c3600, long j) {
        C5499.m17103(c3600, "<this>");
        C2963.m5677(c3600.m9684(), j, 1L);
        C7275 c7275 = c3600.f6209;
        if (c7275 == null) {
            C5499.m17100(null);
            throw null;
        }
        if (c3600.m9684() - j < j) {
            long jM9684 = c3600.m9684();
            while (jM9684 > j) {
                c7275 = c7275.f21954;
                C5499.m17100(c7275);
                jM9684 -= (long) (c7275.f21950 - c7275.f2779);
            }
            C5499.m17100(c7275);
            return c7275.f2778[(int) ((((long) c7275.f2779) + j) - jM9684)];
        }
        long j2 = 0;
        while (true) {
            long j3 = ((long) (c7275.f21950 - c7275.f2779)) + j2;
            if (j3 > j) {
                C5499.m17100(c7275);
                return c7275.f2778[(int) ((((long) c7275.f2779) + j) - j2)];
            }
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
            j2 = j3;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m5455(@InterfaceC6399 C3600 c3600) {
        C5499.m17103(c3600, "<this>");
        C7275 c7275 = c3600.f6209;
        if (c7275 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c7275.f21950;
            for (int i3 = c7275.f2779; i3 < i2; i3++) {
                i = (i * 31) + c7275.f2778[i3];
            }
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
        } while (c7275 != c3600.f6209);
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final long m5456(@InterfaceC6399 C3600 c3600, byte b, long j, long j2) {
        C7275 c7275;
        int i;
        C5499.m17103(c3600, "<this>");
        long jM9684 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + c3600.m9684() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > c3600.m9684()) {
            j2 = c3600.m9684();
        }
        if (j == j2 || (c7275 = c3600.f6209) == null) {
            return -1L;
        }
        if (c3600.m9684() - j < j) {
            jM9684 = c3600.m9684();
            while (jM9684 > j) {
                c7275 = c7275.f21954;
                C5499.m17100(c7275);
                jM9684 -= (long) (c7275.f21950 - c7275.f2779);
            }
            while (jM9684 < j2) {
                byte[] bArr = c7275.f2778;
                int iMin = (int) Math.min(c7275.f21950, (((long) c7275.f2779) + j2) - jM9684);
                i = (int) ((((long) c7275.f2779) + j) - jM9684);
                while (i < iMin) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                jM9684 += (long) (c7275.f21950 - c7275.f2779);
                c7275 = c7275.f21953;
                C5499.m17100(c7275);
                j = jM9684;
            }
            return -1L;
        }
        while (true) {
            long j3 = ((long) (c7275.f21950 - c7275.f2779)) + jM9684;
            if (j3 > j) {
                break;
            }
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
            jM9684 = j3;
        }
        while (jM9684 < j2) {
            byte[] bArr2 = c7275.f2778;
            int iMin2 = (int) Math.min(c7275.f21950, (((long) c7275.f2779) + j2) - jM9684);
            i = (int) ((((long) c7275.f2779) + j) - jM9684);
            while (i < iMin2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            jM9684 += (long) (c7275.f21950 - c7275.f2779);
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
            j = jM9684;
        }
        return -1L;
        return ((long) (i - c7275.f2779)) + jM9684;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long m5457(@InterfaceC6399 C3600 c3600, @InterfaceC6399 C3630 c3630, long j) {
        long jM9684;
        int i;
        long j2 = j;
        C5499.m17103(c3600, "<this>");
        C5499.m17103(c3630, "bytes");
        if (c3630.m9852() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        C7275 c7275 = c3600.f6209;
        if (c7275 == null) {
            return -1L;
        }
        if (c3600.m9684() - j2 < j2) {
            jM9684 = c3600.m9684();
            while (jM9684 > j2) {
                c7275 = c7275.f21954;
                C5499.m17100(c7275);
                jM9684 -= (long) (c7275.f21950 - c7275.f2779);
            }
            byte[] bArrMo9837 = c3630.mo9837();
            byte b = bArrMo9837[0];
            int iM9852 = c3630.m9852();
            long jM96842 = (c3600.m9684() - ((long) iM9852)) + 1;
            while (jM9684 < jM96842) {
                byte[] bArr = c7275.f2778;
                int iMin = (int) Math.min(c7275.f21950, (((long) c7275.f2779) + jM96842) - jM9684);
                i = (int) ((((long) c7275.f2779) + j2) - jM9684);
                while (i < iMin) {
                    if (bArr[i] != b || !m5507(c7275, i + 1, bArrMo9837, 1, iM9852)) {
                        i++;
                    }
                }
                jM9684 += (long) (c7275.f21950 - c7275.f2779);
                c7275 = c7275.f21953;
                C5499.m17100(c7275);
                j2 = jM9684;
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (c7275.f21950 - c7275.f2779)) + j3;
            if (j4 > j2) {
                break;
            }
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
            j3 = j4;
        }
        byte[] bArrMo98372 = c3630.mo9837();
        byte b2 = bArrMo98372[0];
        int iM98522 = c3630.m9852();
        long jM96843 = (c3600.m9684() - ((long) iM98522)) + 1;
        jM9684 = j3;
        while (jM9684 < jM96843) {
            byte[] bArr2 = c7275.f2778;
            long j5 = jM96843;
            int iMin2 = (int) Math.min(c7275.f21950, (((long) c7275.f2779) + jM96843) - jM9684);
            i = (int) ((((long) c7275.f2779) + j2) - jM9684);
            while (i < iMin2) {
                if (bArr2[i] == b2 && m5507(c7275, i + 1, bArrMo98372, 1, iM98522)) {
                }
                i++;
            }
            jM9684 += (long) (c7275.f21950 - c7275.f2779);
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
            jM96843 = j5;
            j2 = jM9684;
        }
        return -1L;
        return ((long) (i - c7275.f2779)) + jM9684;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final long m5458(@InterfaceC6399 C3600 c3600, @InterfaceC6399 C3630 c3630, long j) {
        int i;
        int i2;
        C5499.m17103(c3600, "<this>");
        C5499.m17103(c3630, "targetBytes");
        long jM9684 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        C7275 c7275 = c3600.f6209;
        if (c7275 == null) {
            return -1L;
        }
        if (c3600.m9684() - j < j) {
            jM9684 = c3600.m9684();
            while (jM9684 > j) {
                c7275 = c7275.f21954;
                C5499.m17100(c7275);
                jM9684 -= (long) (c7275.f21950 - c7275.f2779);
            }
            if (c3630.m9852() == 2) {
                byte bM9823 = c3630.m9823(0);
                byte bM98232 = c3630.m9823(1);
                while (jM9684 < c3600.m9684()) {
                    byte[] bArr = c7275.f2778;
                    i = (int) ((((long) c7275.f2779) + j) - jM9684);
                    int i3 = c7275.f21950;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b == bM9823 || b == bM98232) {
                            i2 = c7275.f2779;
                        } else {
                            i++;
                        }
                    }
                    jM9684 += (long) (c7275.f21950 - c7275.f2779);
                    c7275 = c7275.f21953;
                    C5499.m17100(c7275);
                    j = jM9684;
                }
            } else {
                byte[] bArrMo9837 = c3630.mo9837();
                while (jM9684 < c3600.m9684()) {
                    byte[] bArr2 = c7275.f2778;
                    i = (int) ((((long) c7275.f2779) + j) - jM9684);
                    int i4 = c7275.f21950;
                    while (i < i4) {
                        byte b2 = bArr2[i];
                        for (byte b3 : bArrMo9837) {
                            if (b2 == b3) {
                                i2 = c7275.f2779;
                            }
                        }
                        i++;
                    }
                    jM9684 += (long) (c7275.f21950 - c7275.f2779);
                    c7275 = c7275.f21953;
                    C5499.m17100(c7275);
                    j = jM9684;
                }
            }
            return -1L;
        }
        while (true) {
            long j2 = ((long) (c7275.f21950 - c7275.f2779)) + jM9684;
            if (j2 > j) {
                break;
            }
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
            jM9684 = j2;
        }
        if (c3630.m9852() == 2) {
            byte bM98233 = c3630.m9823(0);
            byte bM98234 = c3630.m9823(1);
            while (jM9684 < c3600.m9684()) {
                byte[] bArr3 = c7275.f2778;
                i = (int) ((((long) c7275.f2779) + j) - jM9684);
                int i5 = c7275.f21950;
                while (i < i5) {
                    byte b4 = bArr3[i];
                    if (b4 == bM98233 || b4 == bM98234) {
                        i2 = c7275.f2779;
                    } else {
                        i++;
                    }
                }
                jM9684 += (long) (c7275.f21950 - c7275.f2779);
                c7275 = c7275.f21953;
                C5499.m17100(c7275);
                j = jM9684;
            }
        } else {
            byte[] bArrMo98372 = c3630.mo9837();
            while (jM9684 < c3600.m9684()) {
                byte[] bArr4 = c7275.f2778;
                i = (int) ((((long) c7275.f2779) + j) - jM9684);
                int i6 = c7275.f21950;
                while (i < i6) {
                    byte b5 = bArr4[i];
                    for (byte b6 : bArrMo98372) {
                        if (b5 == b6) {
                            i2 = c7275.f2779;
                        }
                    }
                    i++;
                }
                jM9684 += (long) (c7275.f21950 - c7275.f2779);
                c7275 = c7275.f21953;
                C5499.m17100(c7275);
                j = jM9684;
            }
        }
        return -1L;
        return ((long) (i - i2)) + jM9684;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int m5459(@InterfaceC6399 C3600.C0192 c0192) {
        C5499.m17103(c0192, "<this>");
        long j = c0192.f6214;
        C3600 c3600 = c0192.f6211;
        C5499.m17100(c3600);
        if (j == c3600.m9684()) {
            throw new IllegalStateException("no more bytes".toString());
        }
        long j2 = c0192.f6214;
        return c0192.m9712(j2 == -1 ? 0L : j2 + ((long) (c0192.f6217 - c0192.f6216)));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final boolean m5460(@InterfaceC6399 C3600 c3600, long j, @InterfaceC6399 C3630 c3630, int i, int i2) {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(c3630, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || c3600.m9684() - j < i2 || c3630.m9852() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (c3600.m9650(((long) i3) + j) != c3630.m9823(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int m5461(@InterfaceC6399 C3600 c3600, @InterfaceC6399 byte[] bArr) {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(bArr, "sink");
        return c3600.read(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int m5462(@InterfaceC6399 C3600 c3600, @InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(bArr, "sink");
        C2963.m5677(bArr.length, i, i2);
        C7275 c7275 = c3600.f6209;
        if (c7275 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c7275.f21950 - c7275.f2779);
        byte[] bArr2 = c7275.f2778;
        int i3 = c7275.f2779;
        C3404.m7123(bArr2, bArr, i, i3, i3 + iMin);
        c7275.f2779 += iMin;
        c3600.m9680(c3600.m9684() - ((long) iMin));
        if (c7275.f2779 == c7275.f21950) {
            c3600.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final long m5463(@InterfaceC6399 C3600 c3600, @InterfaceC6399 C3600 c36002, long j) {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(c36002, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (c3600.m9684() == 0) {
            return -1L;
        }
        if (j > c3600.m9684()) {
            j = c3600.m9684();
        }
        c36002.mo9102(c3600, j);
        return j;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final long m5464(@InterfaceC6399 C3600 c3600, @InterfaceC6399 InterfaceC7472 interfaceC7472) throws IOException {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(interfaceC7472, "sink");
        long jM9684 = c3600.m9684();
        if (jM9684 > 0) {
            interfaceC7472.mo9102(c3600, jM9684);
        }
        return jM9684;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final C3600.C0192 m5465(@InterfaceC6399 C3600 c3600, @InterfaceC6399 C3600.C0192 c0192) {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(c0192, "unsafeCursor");
        C3600.C0192 c0192M5686 = C2963.m5686(c0192);
        if (c0192M5686.f6211 != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        c0192M5686.f6211 = c3600;
        c0192M5686.f6212 = true;
        return c0192M5686;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final byte m5466(@InterfaceC6399 C3600 c3600) throws EOFException {
        C5499.m17103(c3600, "<this>");
        if (c3600.m9684() == 0) {
            throw new EOFException();
        }
        C7275 c7275 = c3600.f6209;
        C5499.m17100(c7275);
        int i = c7275.f2779;
        int i2 = c7275.f21950;
        int i3 = i + 1;
        byte b = c7275.f2778[i];
        c3600.m9680(c3600.m9684() - 1);
        if (i3 == i2) {
            c3600.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        } else {
            c7275.f2779 = i3;
        }
        return b;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final byte[] m5467(@InterfaceC6399 C3600 c3600) {
        C5499.m17103(c3600, "<this>");
        return c3600.mo9661(c3600.m9684());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final byte[] m5468(@InterfaceC6399 C3600 c3600, long j) throws EOFException {
        C5499.m17103(c3600, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (c3600.m9684() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        c3600.readFully(bArr);
        return bArr;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final C3630 m5469(@InterfaceC6399 C3600 c3600) {
        C5499.m17103(c3600, "<this>");
        return c3600.mo9612(c3600.m9684());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final C3630 m5470(@InterfaceC6399 C3600 c3600, long j) throws EOFException {
        C5499.m17103(c3600, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (c3600.m9684() < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C3630(c3600.mo9661(j));
        }
        C3630 c3630M9686 = c3600.m9686((int) j);
        c3600.skip(j);
        return c3630M9686;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final long m5471(@InterfaceC6399 C3600 c3600) throws EOFException {
        C5499.m17103(c3600, "<this>");
        if (c3600.m9684() == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            C7275 c7275 = c3600.f6209;
            C5499.m17100(c7275);
            byte[] bArr = c7275.f2778;
            int i2 = c7275.f2779;
            int i3 = c7275.f21950;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < f4238 || (j == f4238 && i4 < j2)) {
                        C3600 c3600M9693 = new C3600().mo9671(j).writeByte(b);
                        if (!z) {
                            c3600M9693.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + c3600M9693.mo9662());
                    }
                    j = (j * 10) + ((long) i4);
                } else {
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j2--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                c3600.f6209 = c7275.m3540();
                C7278.m22744(c7275);
            } else {
                c7275.f2779 = i2;
            }
            if (z2) {
                break;
            }
        } while (c3600.f6209 != null);
        c3600.m9680(c3600.m9684() - ((long) i));
        if (i >= (z ? 2 : 1)) {
            return z ? j : -j;
        }
        if (c3600.m9684() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + C2963.m5693(c3600.m9650(0L)));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final void m5472(@InterfaceC6399 C3600 c3600, @InterfaceC6399 C3600 c36002, long j) throws EOFException {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(c36002, "sink");
        if (c3600.m9684() >= j) {
            c36002.mo9102(c3600, j);
        } else {
            c36002.mo9102(c3600, c3600.m9684());
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final void m5473(@InterfaceC6399 C3600 c3600, @InterfaceC6399 byte[] bArr) throws EOFException {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int i2 = c3600.read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac A[EDGE_INSN: B:43:0x00ac->B:37:0x00ac BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m5474(@InterfaceC6399 C3600 c3600) throws EOFException {
        int i;
        C5499.m17103(c3600, "<this>");
        if (c3600.m9684() == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C7275 c7275 = c3600.f6209;
            C5499.m17100(c7275);
            byte[] bArr = c7275.f2778;
            int i3 = c7275.f2779;
            int i4 = c7275.f21950;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b >= 65 && b <= 70) {
                    i = b + C4750.f10624;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + C2963.m5693(b));
                    }
                    z = true;
                    if (i3 != i4) {
                        c3600.f6209 = c7275.m3540();
                        C7278.m22744(c7275);
                    } else {
                        c7275.f2779 = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new C3600().mo9646(j).writeByte(b).mo9662());
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (c3600.f6209 != null);
        c3600.m9680(c3600.m9684() - ((long) i2));
        return j;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int m5475(@InterfaceC6399 C3600 c3600) throws EOFException {
        C5499.m17103(c3600, "<this>");
        if (c3600.m9684() < 4) {
            throw new EOFException();
        }
        C7275 c7275 = c3600.f6209;
        C5499.m17100(c7275);
        int i = c7275.f2779;
        int i2 = c7275.f21950;
        if (i2 - i < 4) {
            return (c3600.readByte() & 255) | ((c3600.readByte() & 255) << 24) | ((c3600.readByte() & 255) << 16) | ((c3600.readByte() & 255) << 8);
        }
        byte[] bArr = c7275.f2778;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        c3600.m9680(c3600.m9684() - 4);
        if (i5 == i2) {
            c3600.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        } else {
            c7275.f2779 = i5;
        }
        return i6;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final long m5476(@InterfaceC6399 C3600 c3600) throws EOFException {
        C5499.m17103(c3600, "<this>");
        if (c3600.m9684() < 8) {
            throw new EOFException();
        }
        C7275 c7275 = c3600.f6209;
        C5499.m17100(c7275);
        int i = c7275.f2779;
        int i2 = c7275.f21950;
        if (i2 - i < 8) {
            return ((((long) c3600.readInt()) & C8578.f25466) << 32) | (C8578.f25466 & ((long) c3600.readInt()));
        }
        byte[] bArr = c7275.f2778;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        c3600.m9680(c3600.m9684() - 8);
        if (i4 == i2) {
            c3600.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        } else {
            c7275.f2779 = i4;
        }
        return j2;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final short m5477(@InterfaceC6399 C3600 c3600) throws EOFException {
        C5499.m17103(c3600, "<this>");
        if (c3600.m9684() < 2) {
            throw new EOFException();
        }
        C7275 c7275 = c3600.f6209;
        C5499.m17100(c7275);
        int i = c7275.f2779;
        int i2 = c7275.f21950;
        if (i2 - i < 2) {
            return (short) ((c3600.readByte() & 255) | ((c3600.readByte() & 255) << 8));
        }
        byte[] bArr = c7275.f2778;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        c3600.m9680(c3600.m9684() - 2);
        if (i5 == i2) {
            c3600.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        } else {
            c7275.f2779 = i5;
        }
        return (short) i6;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final C3600.C0192 m5478(@InterfaceC6399 C3600 c3600, @InterfaceC6399 C3600.C0192 c0192) {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(c0192, "unsafeCursor");
        C3600.C0192 c0192M5686 = C2963.m5686(c0192);
        if (c0192M5686.f6211 != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        c0192M5686.f6211 = c3600;
        c0192M5686.f6212 = false;
        return c0192M5686;
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۢۦۤۡ.ۥ۟۟(byte[], int, int, int, java.lang.Object):java.lang.String */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final String m5479(@InterfaceC6399 C3600 c3600, long j) throws EOFException {
        C5499.m17103(c3600, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (c3600.m9684() < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C7275 c7275 = c3600.f6209;
        C5499.m17100(c7275);
        int i = c7275.f2779;
        if (((long) i) + j > c7275.f21950) {
            return C8584.m28588(c3600.mo9661(j), 0, 0, 3, null);
        }
        int i2 = (int) j;
        String strM4555 = C8584.m4555(c7275.f2778, i, i + i2);
        c7275.f2779 += i2;
        c3600.m9680(c3600.m9684() - j);
        if (c7275.f2779 == c7275.f21950) {
            c3600.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        }
        return strM4555;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int m5480(@InterfaceC6399 C3600 c3600) throws EOFException {
        int i;
        int i2;
        int i3;
        C5499.m17103(c3600, "<this>");
        if (c3600.m9684() == 0) {
            throw new EOFException();
        }
        byte bM9650 = c3600.m9650(0L);
        if ((bM9650 & C3626.f423) == 0) {
            i = bM9650 & C3626.f6362;
            i3 = 0;
            i2 = 1;
        } else if ((bM9650 & 224) == 192) {
            i = bM9650 & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bM9650 & 240) == 224) {
            i = bM9650 & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bM9650 & 248) != 240) {
                c3600.skip(1L);
                return C8149.f24169;
            }
            i = bM9650 & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (c3600.m9684() < j) {
            throw new EOFException("size < " + i2 + ": " + c3600.m9684() + " (to read code point prefixed 0x" + C2963.m5693(bM9650) + ')');
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bM96502 = c3600.m9650(j2);
            if ((bM96502 & C4750.f10617) != 128) {
                c3600.skip(j2);
                return C8149.f24169;
            }
            i = (i << 6) | (bM96502 & C8149.f3255);
        }
        c3600.skip(j);
        return i > 1114111 ? C8149.f24169 : ((55296 > i || i >= 57344) && i >= i3) ? i : C8149.f24169;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final String m5481(@InterfaceC6399 C3600 c3600) {
        C5499.m17103(c3600, "<this>");
        long jMo9673 = c3600.mo9673((byte) 10);
        if (jMo9673 != -1) {
            return m5508(c3600, jMo9673);
        }
        if (c3600.m9684() != 0) {
            return c3600.mo9609(c3600.m9684());
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final String m5482(@InterfaceC6399 C3600 c3600, long j) throws EOFException {
        C5499.m17103(c3600, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jMo9630 = c3600.mo9630((byte) 10, 0L, j2);
        if (jMo9630 != -1) {
            return m5508(c3600, jMo9630);
        }
        if (j2 < c3600.m9684() && c3600.m9650(j2 - 1) == 13 && c3600.m9650(j2) == 10) {
            return m5508(c3600, j2);
        }
        C3600 c36002 = new C3600();
        c3600.m9620(c36002, 0L, Math.min(32, c3600.m9684()));
        throw new EOFException("\\n not found: limit=" + Math.min(c3600.m9684(), j) + " content=" + c36002.mo9648().mo9828() + C8039.f23902);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final long m5483(@InterfaceC6399 C3600.C0192 c0192, long j) {
        C5499.m17103(c0192, "<this>");
        C3600 c3600 = c0192.f6211;
        if (c3600 == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!c0192.f6212) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        long jM9684 = c3600.m9684();
        if (j <= jM9684) {
            if (j < 0) {
                throw new IllegalArgumentException(("newSize < 0: " + j).toString());
            }
            long j2 = jM9684 - j;
            while (true) {
                if (j2 <= 0) {
                    break;
                }
                C7275 c7275 = c3600.f6209;
                C5499.m17100(c7275);
                C7275 c72752 = c7275.f21954;
                C5499.m17100(c72752);
                int i = c72752.f21950;
                long j3 = i - c72752.f2779;
                if (j3 > j2) {
                    c72752.f21950 = i - ((int) j2);
                    break;
                }
                c3600.f6209 = c72752.m3540();
                C7278.m22744(c72752);
                j2 -= j3;
            }
            c0192.m9713(null);
            c0192.f6214 = j;
            c0192.f6215 = null;
            c0192.f6216 = -1;
            c0192.f6217 = -1;
        } else if (j > jM9684) {
            long j4 = j - jM9684;
            boolean z = true;
            while (j4 > 0) {
                C7275 c7275M9687 = c3600.m9687(1);
                int iMin = (int) Math.min(j4, 8192 - c7275M9687.f21950);
                c7275M9687.f21950 += iMin;
                j4 -= (long) iMin;
                if (z) {
                    c0192.m9713(c7275M9687);
                    c0192.f6214 = jM9684;
                    c0192.f6215 = c7275M9687.f2778;
                    int i2 = c7275M9687.f21950;
                    c0192.f6216 = i2 - iMin;
                    c0192.f6217 = i2;
                    z = false;
                }
            }
        }
        c3600.m9680(j);
        return jM9684;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int m5484(@InterfaceC6399 C3600.C0192 c0192, long j) {
        C7275 c7275M22726;
        C5499.m17103(c0192, "<this>");
        C3600 c3600 = c0192.f6211;
        if (c3600 == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (j < -1 || j > c3600.m9684()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + c3600.m9684());
        }
        if (j == -1 || j == c3600.m9684()) {
            c0192.m9713(null);
            c0192.f6214 = j;
            c0192.f6215 = null;
            c0192.f6216 = -1;
            c0192.f6217 = -1;
            return -1;
        }
        long jM9684 = c3600.m9684();
        C7275 c7275M9709 = c3600.f6209;
        long j2 = 0;
        if (c0192.m9709() != null) {
            long j3 = c0192.f6214;
            int i = c0192.f6216;
            C7275 c7275M97092 = c0192.m9709();
            C5499.m17100(c7275M97092);
            long j4 = j3 - ((long) (i - c7275M97092.f2779));
            if (j4 > j) {
                c7275M22726 = c7275M9709;
                c7275M9709 = c0192.m9709();
                jM9684 = j4;
            } else {
                c7275M22726 = c0192.m9709();
                j2 = j4;
            }
        } else {
            c7275M22726 = c7275M9709;
        }
        if (jM9684 - j > j - j2) {
            while (true) {
                C5499.m17100(c7275M22726);
                int i2 = c7275M22726.f21950;
                int i3 = c7275M22726.f2779;
                if (j < ((long) (i2 - i3)) + j2) {
                    break;
                }
                j2 += (long) (i2 - i3);
                c7275M22726 = c7275M22726.f21953;
            }
        } else {
            while (jM9684 > j) {
                C5499.m17100(c7275M9709);
                c7275M9709 = c7275M9709.f21954;
                C5499.m17100(c7275M9709);
                jM9684 -= (long) (c7275M9709.f21950 - c7275M9709.f2779);
            }
            j2 = jM9684;
            c7275M22726 = c7275M9709;
        }
        if (c0192.f6212) {
            C5499.m17100(c7275M22726);
            if (c7275M22726.f21951) {
                C7275 c7275M22729 = c7275M22726.m22729();
                if (c3600.f6209 == c7275M22726) {
                    c3600.f6209 = c7275M22729;
                }
                c7275M22726 = c7275M22726.m22726(c7275M22729);
                C7275 c7275 = c7275M22726.f21954;
                C5499.m17100(c7275);
                c7275.m3540();
            }
        }
        c0192.m9713(c7275M22726);
        c0192.f6214 = j;
        C5499.m17100(c7275M22726);
        c0192.f6215 = c7275M22726.f2778;
        int i4 = c7275M22726.f2779 + ((int) (j - j2));
        c0192.f6216 = i4;
        int i5 = c7275M22726.f21950;
        c0192.f6217 = i5;
        return i5 - i4;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int m5485(@InterfaceC6399 C3600 c3600, @InterfaceC6399 C6582 c6582) throws EOFException {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(c6582, "options");
        int iM5511 = m5511(c3600, c6582, false, 2, null);
        if (iM5511 == -1) {
            return -1;
        }
        c3600.skip(c6582.m20903()[iM5511].m9852());
        return iM5511;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final void m5486(@InterfaceC6399 C3600 c3600, long j) throws EOFException {
        C5499.m17103(c3600, "<this>");
        while (j > 0) {
            C7275 c7275 = c3600.f6209;
            if (c7275 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c7275.f21950 - c7275.f2779);
            long j2 = iMin;
            c3600.m9680(c3600.m9684() - j2);
            j -= j2;
            int i = c7275.f2779 + iMin;
            c7275.f2779 = i;
            if (i == c7275.f21950) {
                c3600.f6209 = c7275.m3540();
                C7278.m22744(c7275);
            }
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final C3630 m5487(@InterfaceC6399 C3600 c3600) {
        C5499.m17103(c3600, "<this>");
        if (c3600.m9684() <= 2147483647L) {
            return c3600.m9686((int) c3600.m9684());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + c3600.m9684()).toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final C3630 m5488(@InterfaceC6399 C3600 c3600, int i) {
        C5499.m17103(c3600, "<this>");
        if (i == 0) {
            return C3630.f6372;
        }
        C2963.m5677(c3600.m9684(), 0L, i);
        C7275 c7275 = c3600.f6209;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C5499.m17100(c7275);
            int i5 = c7275.f21950;
            int i6 = c7275.f2779;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c7275 = c7275.f21953;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C7275 c72752 = c3600.f6209;
        int i7 = 0;
        while (i2 < i) {
            C5499.m17100(c72752);
            bArr[i7] = c72752.f2778;
            i2 += c72752.f21950 - c72752.f2779;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c72752.f2779;
            c72752.f21951 = true;
            i7++;
            c72752 = c72752.f21953;
        }
        return new C7279(bArr, iArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final C7275 m5489(@InterfaceC6399 C3600 c3600, int i) {
        C5499.m17103(c3600, "<this>");
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        C7275 c7275 = c3600.f6209;
        if (c7275 != null) {
            C5499.m17100(c7275);
            C7275 c72752 = c7275.f21954;
            C5499.m17100(c72752);
            return (c72752.f21950 + i > 8192 || !c72752.f21952) ? c72752.m22726(C7278.m22745()) : c72752;
        }
        C7275 c7275M22745 = C7278.m22745();
        c3600.f6209 = c7275M22745;
        c7275M22745.f21954 = c7275M22745;
        c7275M22745.f21953 = c7275M22745;
        return c7275M22745;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final C3600 m5490(@InterfaceC6399 C3600 c3600, @InterfaceC6399 C3630 c3630, int i, int i2) {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(c3630, "byteString");
        c3630.mo9864(c3600, i, i2);
        return c3600;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final C3600 m5491(@InterfaceC6399 C3600 c3600, @InterfaceC6399 InterfaceC7506 interfaceC7506, long j) throws IOException {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(interfaceC7506, "source");
        while (j > 0) {
            long jMo9103 = interfaceC7506.mo9103(c3600, j);
            if (jMo9103 == -1) {
                throw new EOFException();
            }
            j -= jMo9103;
        }
        return c3600;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final C3600 m5492(@InterfaceC6399 C3600 c3600, @InterfaceC6399 byte[] bArr) {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(bArr, "source");
        return c3600.write(bArr, 0, bArr.length);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final C3600 m5493(@InterfaceC6399 C3600 c3600, @InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(bArr, "source");
        long j = i2;
        C2963.m5677(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C7275 c7275M9687 = c3600.m9687(1);
            int iMin = Math.min(i3 - i, 8192 - c7275M9687.f21950);
            int i4 = i + iMin;
            C3404.m7123(bArr, c7275M9687.f2778, c7275M9687.f21950, i, i4);
            c7275M9687.f21950 += iMin;
            i = i4;
        }
        c3600.m9680(c3600.m9684() + j);
        return c3600;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final void m5494(@InterfaceC6399 C3600 c3600, @InterfaceC6399 C3600 c36002, long j) {
        C7275 c7275;
        C5499.m17103(c3600, "<this>");
        C5499.m17103(c36002, "source");
        if (c36002 == c3600) {
            throw new IllegalArgumentException("source == this".toString());
        }
        C2963.m5677(c36002.m9684(), 0L, j);
        while (j > 0) {
            C7275 c72752 = c36002.f6209;
            C5499.m17100(c72752);
            int i = c72752.f21950;
            C5499.m17100(c36002.f6209);
            if (j < i - r1.f2779) {
                C7275 c72753 = c3600.f6209;
                if (c72753 != null) {
                    C5499.m17100(c72753);
                    c7275 = c72753.f21954;
                } else {
                    c7275 = null;
                }
                if (c7275 != null && c7275.f21952) {
                    if ((((long) c7275.f21950) + j) - ((long) (c7275.f21951 ? 0 : c7275.f2779)) <= 8192) {
                        C7275 c72754 = c36002.f6209;
                        C5499.m17100(c72754);
                        c72754.m22730(c7275, (int) j);
                        c36002.m9680(c36002.m9684() - j);
                        c3600.m9680(c3600.m9684() + j);
                        return;
                    }
                }
                C7275 c72755 = c36002.f6209;
                C5499.m17100(c72755);
                c36002.f6209 = c72755.m22728((int) j);
            }
            C7275 c72756 = c36002.f6209;
            C5499.m17100(c72756);
            long j2 = c72756.f21950 - c72756.f2779;
            c36002.f6209 = c72756.m3540();
            C7275 c72757 = c3600.f6209;
            if (c72757 == null) {
                c3600.f6209 = c72756;
                c72756.f21954 = c72756;
                c72756.f21953 = c72756;
            } else {
                C5499.m17100(c72757);
                C7275 c72758 = c72757.f21954;
                C5499.m17100(c72758);
                c72758.m22726(c72756).m3539();
            }
            c36002.m9680(c36002.m9684() - j2);
            c3600.m9680(c3600.m9684() + j2);
            j -= j2;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ C3600 m5495(C3600 c3600, C3630 c3630, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = c3630.m9852();
        }
        C5499.m17103(c3600, "<this>");
        C5499.m17103(c3630, "byteString");
        c3630.mo9864(c3600, i, i2);
        return c3600;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final long m5496(@InterfaceC6399 C3600 c3600, @InterfaceC6399 InterfaceC7506 interfaceC7506) throws IOException {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(interfaceC7506, "source");
        long j = 0;
        while (true) {
            long jMo9103 = interfaceC7506.mo9103(c3600, 8192L);
            if (jMo9103 == -1) {
                return j;
            }
            j += jMo9103;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final C3600 m5497(@InterfaceC6399 C3600 c3600, int i) {
        C5499.m17103(c3600, "<this>");
        C7275 c7275M9687 = c3600.m9687(1);
        byte[] bArr = c7275M9687.f2778;
        int i2 = c7275M9687.f21950;
        c7275M9687.f21950 = i2 + 1;
        bArr[i2] = (byte) i;
        c3600.m9680(c3600.m9684() + 1);
        return c3600;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final C3600 m5498(@InterfaceC6399 C3600 c3600, long j) {
        boolean z;
        C5499.m17103(c3600, "<this>");
        if (j == 0) {
            return c3600.writeByte(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return c3600.mo9638("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < C7026.f21194 ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < C4720.f10089 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C7275 c7275M9687 = c3600.m9687(i);
        byte[] bArr = c7275M9687.f2778;
        int i2 = c7275M9687.f21950 + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = m5505()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c7275M9687.f21950 += i;
        c3600.m9680(c3600.m9684() + ((long) i));
        return c3600;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final C3600 m5499(@InterfaceC6399 C3600 c3600, long j) {
        C5499.m17103(c3600, "<this>");
        if (j == 0) {
            return c3600.writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C7275 c7275M9687 = c3600.m9687(i);
        byte[] bArr = c7275M9687.f2778;
        int i2 = c7275M9687.f21950;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = m5505()[(int) (15 & j)];
            j >>>= 4;
        }
        c7275M9687.f21950 += i;
        c3600.m9680(c3600.m9684() + ((long) i));
        return c3600;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final C3600 m5500(@InterfaceC6399 C3600 c3600, int i) {
        C5499.m17103(c3600, "<this>");
        C7275 c7275M9687 = c3600.m9687(4);
        byte[] bArr = c7275M9687.f2778;
        int i2 = c7275M9687.f21950;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c7275M9687.f21950 = i2 + 4;
        c3600.m9680(c3600.m9684() + 4);
        return c3600;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final C3600 m5501(@InterfaceC6399 C3600 c3600, long j) {
        C5499.m17103(c3600, "<this>");
        C7275 c7275M9687 = c3600.m9687(8);
        byte[] bArr = c7275M9687.f2778;
        int i = c7275M9687.f21950;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        c7275M9687.f21950 = i + 8;
        c3600.m9680(c3600.m9684() + 8);
        return c3600;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final C3600 m5502(@InterfaceC6399 C3600 c3600, int i) {
        C5499.m17103(c3600, "<this>");
        C7275 c7275M9687 = c3600.m9687(2);
        byte[] bArr = c7275M9687.f2778;
        int i2 = c7275M9687.f21950;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c7275M9687.f21950 = i2 + 2;
        c3600.m9680(c3600.m9684() + 2);
        return c3600;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final C3600 m5503(@InterfaceC6399 C3600 c3600, @InterfaceC6399 String str, int i, int i2) {
        char cCharAt;
        C5499.m17103(c3600, "<this>");
        C5499.m17103(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C7275 c7275M9687 = c3600.m9687(1);
                byte[] bArr = c7275M9687.f2778;
                int i3 = c7275M9687.f21950 - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c7275M9687.f21950;
                int i6 = (i3 + i) - i5;
                c7275M9687.f21950 = i5 + i6;
                c3600.m9680(c3600.m9684() + ((long) i6));
            } else {
                if (cCharAt2 < 2048) {
                    C7275 c7275M96872 = c3600.m9687(2);
                    byte[] bArr2 = c7275M96872.f2778;
                    int i7 = c7275M96872.f21950;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c7275M96872.f21950 = i7 + 2;
                    c3600.m9680(c3600.m9684() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C7275 c7275M96873 = c3600.m9687(3);
                    byte[] bArr3 = c7275M96873.f2778;
                    int i8 = c7275M96873.f21950;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | Opcodes.SHL_INT_LIT8);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c7275M96873.f21950 = i8 + 3;
                    c3600.m9680(c3600.m9684() + 3);
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        c3600.writeByte(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C7275 c7275M96874 = c3600.m9687(4);
                        byte[] bArr4 = c7275M96874.f2778;
                        int i11 = c7275M96874.f21950;
                        bArr4[i11] = (byte) ((i10 >> 18) | C3464.f305);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c7275M96874.f21950 = i11 + 4;
                        c3600.m9680(c3600.m9684() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return c3600;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final C3600 m5504(@InterfaceC6399 C3600 c3600, int i) {
        C5499.m17103(c3600, "<this>");
        if (i < 128) {
            c3600.writeByte(i);
        } else if (i < 2048) {
            C7275 c7275M9687 = c3600.m9687(2);
            byte[] bArr = c7275M9687.f2778;
            int i2 = c7275M9687.f21950;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c7275M9687.f21950 = i2 + 2;
            c3600.m9680(c3600.m9684() + 2);
        } else if (55296 <= i && i < 57344) {
            c3600.writeByte(63);
        } else if (i < 65536) {
            C7275 c7275M96872 = c3600.m9687(3);
            byte[] bArr2 = c7275M96872.f2778;
            int i3 = c7275M96872.f21950;
            bArr2[i3] = (byte) ((i >> 12) | Opcodes.SHL_INT_LIT8);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c7275M96872.f21950 = i3 + 3;
            c3600.m9680(c3600.m9684() + 3);
        } else {
            if (i > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + C2963.m5694(i));
            }
            C7275 c7275M96873 = c3600.m9687(4);
            byte[] bArr3 = c7275M96873.f2778;
            int i4 = c7275M96873.f21950;
            bArr3[i4] = (byte) ((i >> 18) | C3464.f305);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            c7275M96873.f21950 = i4 + 4;
            c3600.m9680(c3600.m9684() + 4);
        }
        return c3600;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final byte[] m5505() {
        return f2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static /* synthetic */ void m5506() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final boolean m5507(@InterfaceC6399 C7275 c7275, int i, @InterfaceC6399 byte[] bArr, int i2, int i3) {
        C5499.m17103(c7275, "segment");
        C5499.m17103(bArr, "bytes");
        int i4 = c7275.f21950;
        byte[] bArr2 = c7275.f2778;
        while (i2 < i3) {
            if (i == i4) {
                c7275 = c7275.f21953;
                C5499.m17100(c7275);
                byte[] bArr3 = c7275.f2778;
                bArr2 = bArr3;
                i = c7275.f2779;
                i4 = c7275.f21950;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final String m5508(@InterfaceC6399 C3600 c3600, long j) throws EOFException {
        C5499.m17103(c3600, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (c3600.m9650(j2) == 13) {
                String strMo9609 = c3600.mo9609(j2);
                c3600.skip(2L);
                return strMo9609;
            }
        }
        String strMo96092 = c3600.mo9609(j);
        c3600.skip(1L);
        return strMo96092;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final <T> T m5509(@InterfaceC6399 C3600 c3600, long j, @InterfaceC6399 InterfaceC5138<? super C7275, ? super Long, ? extends T> interfaceC5138) {
        C5499.m17103(c3600, "<this>");
        C5499.m17103(interfaceC5138, "lambda");
        C7275 c7275 = c3600.f6209;
        if (c7275 == null) {
            return interfaceC5138.invoke(null, -1L);
        }
        if (c3600.m9684() - j < j) {
            long jM9684 = c3600.m9684();
            while (jM9684 > j) {
                c7275 = c7275.f21954;
                C5499.m17100(c7275);
                jM9684 -= (long) (c7275.f21950 - c7275.f2779);
            }
            return interfaceC5138.invoke(c7275, Long.valueOf(jM9684));
        }
        long j2 = 0;
        while (true) {
            long j3 = ((long) (c7275.f21950 - c7275.f2779)) + j2;
            if (j3 > j) {
                return interfaceC5138.invoke(c7275, Long.valueOf(j2));
            }
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
            j2 = j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r19 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        return r10;
     */
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m5510(@InterfaceC6399 C3600 c3600, @InterfaceC6399 C6582 c6582, boolean z) {
        int i;
        int i2;
        C7275 c7275;
        int i3;
        int i4;
        C5499.m17103(c3600, "<this>");
        C5499.m17103(c6582, "options");
        C7275 c72752 = c3600.f6209;
        if (c72752 != null) {
            byte[] bArr = c72752.f2778;
            int i5 = c72752.f2779;
            int i6 = c72752.f21950;
            int[] iArrM20904 = c6582.m20904();
            C7275 c72753 = c72752;
            int i7 = -1;
            int i8 = 0;
            loop0: while (true) {
                int i9 = i8 + 1;
                int i10 = iArrM20904[i8];
                int i11 = i8 + 2;
                int i12 = iArrM20904[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (c72753 == null) {
                    break;
                }
                if (i10 >= 0) {
                    i = i5 + 1;
                    int i13 = bArr[i5] & 255;
                    int i14 = i11 + i10;
                    while (i11 != i14) {
                        if (i13 == iArrM20904[i11]) {
                            i2 = iArrM20904[i11 + i10];
                            if (i == i6) {
                                c72753 = c72753.f21953;
                                C5499.m17100(c72753);
                                i = c72753.f2779;
                                bArr = c72753.f2778;
                                i6 = c72753.f21950;
                                if (c72753 == c72752) {
                                    c72753 = null;
                                }
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i7;
                }
                int i15 = i11 + (i10 * (-1));
                while (true) {
                    int i16 = i5 + 1;
                    int i17 = i11 + 1;
                    if ((bArr[i5] & 255) != iArrM20904[i11]) {
                        return i7;
                    }
                    boolean z2 = i17 == i15;
                    if (i16 == i6) {
                        C5499.m17100(c72753);
                        C7275 c72754 = c72753.f21953;
                        C5499.m17100(c72754);
                        i4 = c72754.f2779;
                        byte[] bArr2 = c72754.f2778;
                        i3 = c72754.f21950;
                        if (c72754 != c72752) {
                            c7275 = c72754;
                            bArr = bArr2;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr2;
                            c7275 = null;
                        }
                    } else {
                        c7275 = c72753;
                        i3 = i6;
                        i4 = i16;
                    }
                    if (z2) {
                        i2 = iArrM20904[i17];
                        i = i4;
                        i6 = i3;
                        c72753 = c7275;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    c72753 = c7275;
                    i11 = i17;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i8 = -i2;
                i5 = i;
            }
        } else {
            return z ? -2 : -1;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static /* synthetic */ int m5511(C3600 c3600, C6582 c6582, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m5510(c3600, c6582, z);
    }
}
