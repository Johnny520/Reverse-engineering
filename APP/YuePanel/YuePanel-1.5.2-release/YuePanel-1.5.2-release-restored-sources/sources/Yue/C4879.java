package Yue;

import Yue.C4869;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4879 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f11206 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f11207 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f11208 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f11209 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f11210 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f11211 = 7;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f11212 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f11213 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f11214 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f11215 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final /* synthetic */ boolean f11216 = false;

    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC7015 f1203;

    /* JADX INFO: renamed from: ۥ۟ */
    public final ArrayList<C0519> f1204;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final HashMap<String, Integer> f11217;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final HashMap<String, Integer> f11218;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int f11219;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f11220;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Comparator<C0519> f11221;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢۡ$ۥ */
    public class C0518 implements Comparator<C0519> {
        public C0518() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public int compare(C0519 c0519, C0519 c05192) {
            byte b;
            byte b2;
            int i = c0519.f11226;
            int i2 = c05192.f11226;
            do {
                b = C4879.this.f1203.get(i);
                b2 = C4879.this.f1203.get(i2);
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
            } while (b == b2);
            return b - b2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4879(int i) {
        this(new C3396(i), 1);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static int m15011(long j) {
        if (j <= C4869.C4877.m1783((byte) -1)) {
            return 0;
        }
        if (j <= C4869.C4877.m15008((short) -1)) {
            return 1;
        }
        return j <= C4869.C4877.m1784(-1) ? 2 : 3;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final int m1786(int i) {
        int i2 = 1 << i;
        int iM15059 = C0519.m15059(this.f1203.writePosition(), i2);
        while (true) {
            int i3 = iM15059 - 1;
            if (iM15059 == 0) {
                return i2;
            }
            this.f1203.put((byte) 0);
            iM15059 = i3;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C0519 m15012(int i, int i2) {
        long j = i2;
        int iMax = Math.max(0, m15011(j));
        int i3 = i;
        while (i3 < this.f1204.size()) {
            i3++;
            iMax = Math.max(iMax, C0519.m15051(4, 0, this.f1204.get(i3).f11226, this.f1203.writePosition(), i3));
        }
        int iM1786 = m1786(iMax);
        m15043(j, iM1786);
        int iWritePosition = this.f1203.writePosition();
        while (i < this.f1204.size()) {
            int i4 = this.f1204.get(i).f11226;
            m15044(this.f1204.get(i).f11226, iM1786);
            i++;
        }
        return new C0519(-1, C4869.m14966(4, 0), iMax, iWritePosition);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C0519 m15013(int i, int i2, int i3, boolean z, boolean z2, C0519 c0519) {
        int i4;
        int iM14966;
        int i5 = i3;
        long j = i5;
        int iMax = Math.max(0, m15011(j));
        if (c0519 != null) {
            iMax = Math.max(iMax, c0519.m15064(this.f1203.writePosition(), 0));
            i4 = 3;
        } else {
            i4 = 1;
        }
        int i6 = 4;
        int iMax2 = iMax;
        for (int i7 = i2; i7 < this.f1204.size(); i7++) {
            iMax2 = Math.max(iMax2, this.f1204.get(i7).m15064(this.f1203.writePosition(), i7 + i4));
            if (z && i7 == i2) {
                i6 = this.f1204.get(i7).f1205;
                if (!C4869.m14961(i6)) {
                    throw new C4869.C0517("TypedVector does not support this element type");
                }
            }
        }
        int i8 = i2;
        int iM1786 = m1786(iMax2);
        if (c0519 != null) {
            m15044(c0519.f11225, iM1786);
            m15043(1 << c0519.f1206, iM1786);
        }
        if (!z2) {
            m15043(j, iM1786);
        }
        int iWritePosition = this.f1203.writePosition();
        for (int i9 = i8; i9 < this.f1204.size(); i9++) {
            m15040(this.f1204.get(i9), iM1786);
        }
        if (!z) {
            while (i8 < this.f1204.size()) {
                this.f1203.put(this.f1204.get(i8).m15066(iMax2));
                i8++;
            }
        }
        if (c0519 != null) {
            iM14966 = 9;
        } else if (z) {
            if (!z2) {
                i5 = 0;
            }
            iM14966 = C4869.m14966(i6, i5);
        } else {
            iM14966 = 10;
        }
        return new C0519(i, iM14966, iMax2, iWritePosition);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m15014(String str, int i) {
        int iM15030 = m15030(str);
        ArrayList<C0519> arrayList = this.f1204;
        Collections.sort(arrayList.subList(i, arrayList.size()), this.f11221);
        C0519 c0519M15013 = m15013(iM15030, i, this.f1204.size() - i, false, false, m15012(i, this.f1204.size() - i));
        while (this.f1204.size() > i) {
            this.f1204.remove(r0.size() - 1);
        }
        this.f1204.add(c0519M15013);
        return (int) c0519M15013.f11225;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m15015(String str, int i, boolean z, boolean z2) {
        C0519 c0519M15013 = m15013(m15030(str), i, this.f1204.size() - i, z, z2, null);
        while (this.f1204.size() > i) {
            this.f1204.remove(r10.size() - 1);
        }
        this.f1204.add(c0519M15013);
        return (int) c0519M15013.f11225;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public ByteBuffer m15016() {
        int iM1786 = m1786(this.f1204.get(0).m15064(this.f1203.writePosition(), 0));
        m15040(this.f1204.get(0), iM1786);
        this.f1203.put(this.f1204.get(0).m15065());
        this.f1203.put((byte) iM1786);
        this.f11220 = true;
        return ByteBuffer.wrap(this.f1203.data(), 0, this.f1203.writePosition());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public InterfaceC7015 m15017() {
        return this.f1203;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m15018(String str, byte[] bArr) {
        C0519 c0519M15041 = m15041(m15030(str), bArr, 25, false);
        this.f1204.add(c0519M15041);
        return (int) c0519M15041.f11225;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m15019(byte[] bArr) {
        return m15018(null, bArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m15020(String str, boolean z) {
        this.f1204.add(C0519.m15050(m15030(str), z));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m15021(boolean z) {
        m15020(null, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m15022(double d) {
        m15024(null, d);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m15023(float f) {
        m15025(null, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m15024(String str, double d) {
        this.f1204.add(C0519.m15053(m15030(str), d));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m15025(String str, float f) {
        this.f1204.add(C0519.m15052(m15030(str), f));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m15026(int i) {
        m15028(null, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m15027(long j) {
        m15029(null, j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m15028(String str, int i) {
        m15029(str, i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m15029(String str, long j) {
        int iM15030 = m15030(str);
        if (-128 <= j && j <= 127) {
            this.f1204.add(C0519.m15057(iM15030, (int) j));
            return;
        }
        if (-32768 <= j && j <= 32767) {
            this.f1204.add(C0519.m15054(iM15030, (int) j));
        } else if (-2147483648L > j || j > 2147483647L) {
            this.f1204.add(C0519.m15056(iM15030, j));
        } else {
            this.f1204.add(C0519.m15055(iM15030, (int) j));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int m15030(String str) {
        if (str == null) {
            return -1;
        }
        int iWritePosition = this.f1203.writePosition();
        if ((this.f11219 & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f1203.put(bytes, 0, bytes.length);
            this.f1203.put((byte) 0);
            this.f11217.put(str, Integer.valueOf(iWritePosition));
            return iWritePosition;
        }
        Integer num = this.f11217.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f1203.put(bytes2, 0, bytes2.length);
        this.f1203.put((byte) 0);
        this.f11217.put(str, Integer.valueOf(iWritePosition));
        return iWritePosition;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int m15031(String str) {
        return m15032(null, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int m15032(String str, String str2) {
        int iM15030 = m15030(str);
        if ((this.f11219 & 2) == 0) {
            C0519 c0519M15045 = m15045(iM15030, str2);
            this.f1204.add(c0519M15045);
            return (int) c0519M15045.f11225;
        }
        Integer num = this.f11218.get(str2);
        if (num != null) {
            this.f1204.add(C0519.m15049(iM15030, num.intValue(), 5, m15011(str2.length())));
            return num.intValue();
        }
        C0519 c0519M150452 = m15045(iM15030, str2);
        this.f11218.put(str2, Integer.valueOf((int) c0519M150452.f11225));
        this.f1204.add(c0519M150452);
        return (int) c0519M150452.f11225;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m15033(int i) {
        m15035(null, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m15034(long j) {
        m15035(null, j);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m15035(String str, long j) {
        int iM15030 = m15030(str);
        int iM15011 = m15011(j);
        this.f1204.add(iM15011 == 0 ? C0519.m15063(iM15030, (int) j) : iM15011 == 1 ? C0519.m15060(iM15030, (int) j) : iM15011 == 2 ? C0519.m15061(iM15030, (int) j) : C0519.m15062(iM15030, j));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m15036(String str, long j) {
        this.f1204.add(C0519.m15062(m15030(str), j));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m15037(BigInteger bigInteger) {
        m15036(null, bigInteger.longValue());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int m15038() {
        return this.f1204.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int m15039() {
        return this.f1204.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final void m15040(C0519 c0519, int i) {
        int i2 = c0519.f1205;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                m15042(c0519.f11224, i);
                return;
            } else if (i2 != 26) {
                m15044(c0519.f11225, i);
                return;
            }
        }
        m15043(c0519.f11225, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final C0519 m15041(int i, byte[] bArr, int i2, boolean z) {
        int iM15011 = m15011(bArr.length);
        m15043(bArr.length, m1786(iM15011));
        int iWritePosition = this.f1203.writePosition();
        this.f1203.put(bArr, 0, bArr.length);
        if (z) {
            this.f1203.put((byte) 0);
        }
        return C0519.m15049(i, iWritePosition, i2, iM15011);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m15042(double d, int i) {
        if (i == 4) {
            this.f1203.putFloat((float) d);
        } else if (i == 8) {
            this.f1203.putDouble(d);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m15043(long j, int i) {
        if (i == 1) {
            this.f1203.put((byte) j);
            return;
        }
        if (i == 2) {
            this.f1203.putShort((short) j);
        } else if (i == 4) {
            this.f1203.putInt((int) j);
        } else {
            if (i != 8) {
                return;
            }
            this.f1203.putLong(j);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m15044(long j, int i) {
        m15043((int) (((long) this.f1203.writePosition()) - j), i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final C0519 m15045(int i, String str) {
        return m15041(i, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4879() {
        this(256);
    }

    @Deprecated
    public C4879(ByteBuffer byteBuffer, int i) {
        this(new C3396(byteBuffer.array()), i);
    }

    public C4879(InterfaceC7015 interfaceC7015, int i) {
        this.f1204 = new ArrayList<>();
        this.f11217 = new HashMap<>();
        this.f11218 = new HashMap<>();
        this.f11220 = false;
        this.f11221 = new C0518();
        this.f1203 = interfaceC7015;
        this.f11219 = i;
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢۡ$ۥ۟ */
    public static class C0519 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final /* synthetic */ boolean f11223 = false;

        /* JADX INFO: renamed from: ۥ */
        public final int f1205;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f1206;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final double f11224;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public long f11225;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f11226;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0519(int i, int i2, int i3, long j) {
            this.f11226 = i;
            this.f1205 = i2;
            this.f1206 = i3;
            this.f11225 = j;
            this.f11224 = Double.MIN_VALUE;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static C0519 m15049(int i, int i2, int i3, int i4) {
            return new C0519(i, i3, i4, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static C0519 m15050(int i, boolean z) {
            return new C0519(i, 26, 0, z ? 1L : 0L);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static int m15051(int i, int i2, long j, int i3, int i4) {
            if (C4869.m14959(i)) {
                return i2;
            }
            for (int i5 = 1; i5 <= 32; i5 *= 2) {
                int iM15011 = C4879.m15011((int) (((long) ((m15059(i3, i5) + i3) + (i4 * i5))) - j));
                if ((1 << iM15011) == i5) {
                    return iM15011;
                }
            }
            return 3;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static C0519 m15052(int i, float f) {
            return new C0519(i, 3, 2, f);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static C0519 m15053(int i, double d) {
            return new C0519(i, 3, 3, d);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static C0519 m15054(int i, int i2) {
            return new C0519(i, 1, 1, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static C0519 m15055(int i, int i2) {
            return new C0519(i, 1, 2, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static C0519 m15056(int i, long j) {
            return new C0519(i, 1, 3, j);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static C0519 m15057(int i, int i2) {
            return new C0519(i, 1, 0, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static byte m15058(int i, int i2) {
            return (byte) (i | (i2 << 2));
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static int m15059(int i, int i2) {
            return ((~i) + 1) & (i2 - 1);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static C0519 m15060(int i, int i2) {
            return new C0519(i, 2, 1, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static C0519 m15061(int i, int i2) {
            return new C0519(i, 2, 2, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static C0519 m15062(int i, long j) {
            return new C0519(i, 2, 3, j);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static C0519 m15063(int i, int i2) {
            return new C0519(i, 2, 0, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final int m15064(int i, int i2) {
            return m15051(this.f1205, this.f1206, this.f11225, i, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final byte m15065() {
            return m15066(0);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public final byte m15066(int i) {
            return m15058(m15067(i), this.f1205);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final int m15067(int i) {
            return C4869.m14959(this.f1205) ? Math.max(this.f1206, i) : this.f1206;
        }

        public C0519(int i, int i2, int i3, double d) {
            this.f11226 = i;
            this.f1205 = i2;
            this.f1206 = i3;
            this.f11224 = d;
            this.f11225 = Long.MIN_VALUE;
        }
    }

    public C4879(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
