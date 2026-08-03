package Yue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5318 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C5318 f1436;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1437 = 15;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f12852 = 31;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f12853 = 63;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f12854 = 127;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f12855 = 4096;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f12856 = 16384;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C5255[] f12857;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final Map<C3630, Integer> f12858;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧ$ۥ */
    public static final class C0712 {

        /* JADX INFO: renamed from: ۥ */
        public final int f1438;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f1439;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final List<C5255> f12859;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC3604 f12860;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public C5255[] f12861;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f12862;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC5568
        public int f12863;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        @InterfaceC5568
        public int f12864;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC5573
        public C0712(@InterfaceC6399 InterfaceC7506 interfaceC7506, int i) {
            this(interfaceC7506, i, 0, 4, null);
            C5499.m17103(interfaceC7506, "source");
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m2101() {
            int i = this.f1439;
            int i2 = this.f12864;
            if (i < i2) {
                if (i == 0) {
                    m2102();
                } else {
                    m16323(i2 - i);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m2102() {
            C3404.m7201(this.f12861, null, 0, 0, 6, null);
            this.f12862 = this.f12861.length - 1;
            this.f12863 = 0;
            this.f12864 = 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m16322(int i) {
            return this.f12862 + 1 + i;
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:5:0x0008 */
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m16323(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f12861.length;
                while (true) {
                    length--;
                    i2 = this.f12862;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C5255 c5255 = this.f12861[length];
                    C5499.m17100(c5255);
                    int i4 = c5255.f12533;
                    i -= i4;
                    this.f12864 -= i4;
                    this.f12863--;
                    i3++;
                }
                C5255[] c5255Arr = this.f12861;
                System.arraycopy(c5255Arr, i2 + 1, c5255Arr, i2 + 1 + i3, this.f12863);
                this.f12862 += i3;
            }
            return i3;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final List<C5255> m16324() {
            List<C5255> listM11062 = C3888.m11062(this.f12859);
            this.f12859.clear();
            return listM11062;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C3630 m16325(int i) throws IOException {
            if (m16327(i)) {
                return C5318.f1436.m16320()[i].f1369;
            }
            int iM16322 = m16322(i - C5318.f1436.m16320().length);
            if (iM16322 >= 0) {
                C5255[] c5255Arr = this.f12861;
                if (iM16322 < c5255Arr.length) {
                    C5255 c5255 = c5255Arr[iM16322];
                    C5499.m17100(c5255);
                    return c5255.f1369;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m16326(int i, C5255 c5255) {
            this.f12859.add(c5255);
            int i2 = c5255.f12533;
            if (i != -1) {
                C5255 c52552 = this.f12861[m16322(i)];
                C5499.m17100(c52552);
                i2 -= c52552.f12533;
            }
            int i3 = this.f1439;
            if (i2 > i3) {
                m2102();
                return;
            }
            int iM16323 = m16323((this.f12864 + i2) - i3);
            if (i == -1) {
                int i4 = this.f12863 + 1;
                C5255[] c5255Arr = this.f12861;
                if (i4 > c5255Arr.length) {
                    C5255[] c5255Arr2 = new C5255[c5255Arr.length * 2];
                    System.arraycopy(c5255Arr, 0, c5255Arr2, c5255Arr.length, c5255Arr.length);
                    this.f12862 = this.f12861.length - 1;
                    this.f12861 = c5255Arr2;
                }
                int i5 = this.f12862;
                this.f12862 = i5 - 1;
                this.f12861[i5] = c5255;
                this.f12863++;
            } else {
                this.f12861[i + m16322(i) + iM16323] = c5255;
            }
            this.f12864 += i2;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final boolean m16327(int i) {
            return i >= 0 && i <= C5318.f1436.m16320().length - 1;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final int m16328() {
            return this.f1439;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final int m16329() throws IOException {
            return C8158.m26833(this.f12860.readByte(), 255);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final C3630 m16330() throws IOException {
            int iM16329 = m16329();
            boolean z = (iM16329 & 128) == 128;
            long jM16333 = m16333(iM16329, 127);
            if (!z) {
                return this.f12860.mo9612(jM16333);
            }
            C3600 c3600 = new C3600();
            C5388.f1476.m2153(this.f12860, jM16333, c3600);
            return c3600.mo9648();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m16331() throws IOException {
            while (!this.f12860.mo9622()) {
                int iM26833 = C8158.m26833(this.f12860.readByte(), 255);
                if (iM26833 == 128) {
                    throw new IOException("index == 0");
                }
                if ((iM26833 & 128) == 128) {
                    m16332(m16333(iM26833, 127) - 1);
                } else if (iM26833 == 64) {
                    m16335();
                } else if ((iM26833 & 64) == 64) {
                    m16334(m16333(iM26833, 63) - 1);
                } else if ((iM26833 & 32) == 32) {
                    int iM16333 = m16333(iM26833, 31);
                    this.f1439 = iM16333;
                    if (iM16333 < 0 || iM16333 > this.f1438) {
                        throw new IOException("Invalid dynamic table size update " + this.f1439);
                    }
                    m2101();
                } else if (iM26833 == 16 || iM26833 == 0) {
                    m16337();
                } else {
                    m16336(m16333(iM26833, 15) - 1);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final void m16332(int i) throws IOException {
            if (m16327(i)) {
                this.f12859.add(C5318.f1436.m16320()[i]);
                return;
            }
            int iM16322 = m16322(i - C5318.f1436.m16320().length);
            if (iM16322 >= 0) {
                C5255[] c5255Arr = this.f12861;
                if (iM16322 < c5255Arr.length) {
                    List<C5255> list = this.f12859;
                    C5255 c5255 = c5255Arr[iM16322];
                    C5499.m17100(c5255);
                    list.add(c5255);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final int m16333(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int iM16329 = m16329();
                if ((iM16329 & 128) == 0) {
                    return i2 + (iM16329 << i4);
                }
                i2 += (iM16329 & 127) << i4;
                i4 += 7;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m16334(int i) throws IOException {
            m16326(-1, new C5255(m16325(i), m16330()));
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final void m16335() throws IOException {
            m16326(-1, new C5255(C5318.f1436.m2099(m16330()), m16330()));
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final void m16336(int i) throws IOException {
            this.f12859.add(new C5255(m16325(i), m16330()));
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final void m16337() throws IOException {
            this.f12859.add(new C5255(C5318.f1436.m2099(m16330()), m16330()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC5573
        public C0712(@InterfaceC6399 InterfaceC7506 interfaceC7506, int i, int i2) {
            C5499.m17103(interfaceC7506, "source");
            this.f1438 = i;
            this.f1439 = i2;
            this.f12859 = new ArrayList();
            this.f12860 = C6542.m20831(interfaceC7506);
            this.f12861 = new C5255[8];
            this.f12862 = r2.length - 1;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 Yue.ۥۣۢ۟ۦ)
  (r2v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (r2v0 int) : (r3v0 int))
 A[MD:(Yue.ۥۣۢ۟ۦ, int, int):void (m)] (LINE:9) call: Yue.ۥ۠ۤۧ.ۥ.<init>(Yue.ۥۣۢ۟ۦ, int, int):void type: THIS */
        public /* synthetic */ C0712(InterfaceC7506 interfaceC7506, int i, int i2, int i3, C4335 c4335) {
            this(interfaceC7506, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧ$ۥ۟ */
    public static final class C0713 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC5568
        public int f1440;

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean f1441;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final C3600 f12865;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f12866;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f12867;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @InterfaceC5568
        public int f12868;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public C5255[] f12869;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f12870;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        @InterfaceC5568
        public int f12871;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        @InterfaceC5568
        public int f12872;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC5573
        public C0713(int i, @InterfaceC6399 C3600 c3600) {
            this(i, false, c3600, 2, null);
            C5499.m17103(c3600, "out");
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m2103() {
            int i = this.f12868;
            int i2 = this.f12872;
            if (i < i2) {
                if (i == 0) {
                    m2104();
                } else {
                    m16338(i2 - i);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m2104() {
            C3404.m7201(this.f12869, null, 0, 0, 6, null);
            this.f12870 = this.f12869.length - 1;
            this.f12871 = 0;
            this.f12872 = 0;
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:5:0x0008 */
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m16338(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f12869.length;
                while (true) {
                    length--;
                    i2 = this.f12870;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C5255 c5255 = this.f12869[length];
                    C5499.m17100(c5255);
                    i -= c5255.f12533;
                    int i4 = this.f12872;
                    C5255 c52552 = this.f12869[length];
                    C5499.m17100(c52552);
                    this.f12872 = i4 - c52552.f12533;
                    this.f12871--;
                    i3++;
                }
                C5255[] c5255Arr = this.f12869;
                System.arraycopy(c5255Arr, i2 + 1, c5255Arr, i2 + 1 + i3, this.f12871);
                C5255[] c5255Arr2 = this.f12869;
                int i5 = this.f12870;
                Arrays.fill(c5255Arr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.f12870 += i3;
            }
            return i3;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m16339(C5255 c5255) {
            int i = c5255.f12533;
            int i2 = this.f12868;
            if (i > i2) {
                m2104();
                return;
            }
            m16338((this.f12872 + i) - i2);
            int i3 = this.f12871 + 1;
            C5255[] c5255Arr = this.f12869;
            if (i3 > c5255Arr.length) {
                C5255[] c5255Arr2 = new C5255[c5255Arr.length * 2];
                System.arraycopy(c5255Arr, 0, c5255Arr2, c5255Arr.length, c5255Arr.length);
                this.f12870 = this.f12869.length - 1;
                this.f12869 = c5255Arr2;
            }
            int i4 = this.f12870;
            this.f12870 = i4 - 1;
            this.f12869[i4] = c5255;
            this.f12871++;
            this.f12872 += i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m16340(int i) {
            this.f1440 = i;
            int iMin = Math.min(i, 16384);
            int i2 = this.f12868;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.f12866 = Math.min(this.f12866, iMin);
            }
            this.f12867 = true;
            this.f12868 = iMin;
            m2103();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m16341(@InterfaceC6399 C3630 c3630) throws IOException {
            C5499.m17103(c3630, "data");
            if (this.f1441) {
                C5388 c5388 = C5388.f1476;
                if (c5388.m16867(c3630) < c3630.m9852()) {
                    C3600 c3600 = new C3600();
                    c5388.m16866(c3630, c3600);
                    C3630 c3630Mo9648 = c3600.mo9648();
                    m16343(c3630Mo9648.m9852(), 127, 128);
                    this.f12865.mo9668(c3630Mo9648);
                    return;
                }
            }
            m16343(c3630.m9852(), 127, 0);
            this.f12865.mo9668(c3630);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m16342(@InterfaceC6399 List<C5255> list) throws IOException {
            int length;
            int length2;
            C5499.m17103(list, "headerBlock");
            if (this.f12867) {
                int i = this.f12866;
                if (i < this.f12868) {
                    m16343(i, 31, 32);
                }
                this.f12867 = false;
                this.f12866 = Integer.MAX_VALUE;
                m16343(this.f12868, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C5255 c5255 = list.get(i2);
                C3630 c3630Mo9859 = c5255.f1369.mo9859();
                C3630 c3630 = c5255.f1370;
                C5318 c5318 = C5318.f1436;
                Integer num = c5318.m2100().get(c3630Mo9859);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (C5499.m17094(c5318.m16320()[iIntValue].f1370, c3630)) {
                        length = length2;
                    } else if (C5499.m17094(c5318.m16320()[length2].f1370, c3630)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i3 = this.f12870 + 1;
                    int length3 = this.f12869.length;
                    while (true) {
                        if (i3 >= length3) {
                            break;
                        }
                        C5255 c52552 = this.f12869[i3];
                        C5499.m17100(c52552);
                        if (C5499.m17094(c52552.f1369, c3630Mo9859)) {
                            C5255 c52553 = this.f12869[i3];
                            C5499.m17100(c52553);
                            if (C5499.m17094(c52553.f1370, c3630)) {
                                length2 = C5318.f1436.m16320().length + (i3 - this.f12870);
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.f12870) + C5318.f1436.m16320().length;
                            }
                        }
                        i3++;
                    }
                }
                if (length2 != -1) {
                    m16343(length2, 127, 128);
                } else if (length == -1) {
                    this.f12865.writeByte(64);
                    m16341(c3630Mo9859);
                    m16341(c3630);
                    m16339(c5255);
                } else if (!c3630Mo9859.m9853(C5255.f12522) || C5499.m17094(C5255.f12532, c3630Mo9859)) {
                    m16343(length, 63, 64);
                    m16341(c3630);
                    m16339(c5255);
                } else {
                    m16343(length, 15, 0);
                    m16341(c3630);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m16343(int i, int i2, int i3) {
            if (i < i2) {
                this.f12865.writeByte(i | i3);
                return;
            }
            this.f12865.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f12865.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f12865.writeByte(i4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC5573
        public C0713(@InterfaceC6399 C3600 c3600) {
            this(0, false, c3600, 3, null);
            C5499.m17103(c3600, "out");
        }

        @InterfaceC5573
        public C0713(int i, boolean z, @InterfaceC6399 C3600 c3600) {
            C5499.m17103(c3600, "out");
            this.f1440 = i;
            this.f1441 = z;
            this.f12865 = c3600;
            this.f12866 = Integer.MAX_VALUE;
            this.f12868 = i;
            this.f12869 = new C5255[8];
            this.f12870 = r2.length - 1;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (4096 int) : (r1v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (r3v0 Yue.ۥۣ۟ۢۨ)
 A[MD:(int, boolean, Yue.ۥۣ۟ۢۨ):void (m)] (LINE:11) call: Yue.ۥ۠ۤۧ.ۥ۟.<init>(int, boolean, Yue.ۥۣ۟ۢۨ):void type: THIS */
        public /* synthetic */ C0713(int i, boolean z, C3600 c3600, int i2, C4335 c4335) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, c3600);
        }
    }

    static {
        C5318 c5318 = new C5318();
        f1436 = c5318;
        C5255 c5255 = new C5255(C5255.f12532, "");
        C3630 c3630 = C5255.f12529;
        C5255 c52552 = new C5255(c3630, "GET");
        C5255 c52553 = new C5255(c3630, "POST");
        C3630 c36302 = C5255.f12530;
        C5255 c52554 = new C5255(c36302, "/");
        C5255 c52555 = new C5255(c36302, "/index.html");
        C3630 c36303 = C5255.f12531;
        C5255 c52556 = new C5255(c36303, "http");
        C5255 c52557 = new C5255(c36303, "https");
        C3630 c36304 = C5255.f12528;
        f12857 = new C5255[]{c5255, c52552, c52553, c52554, c52555, c52556, c52557, new C5255(c36304, "200"), new C5255(c36304, "204"), new C5255(c36304, "206"), new C5255(c36304, "304"), new C5255(c36304, "400"), new C5255(c36304, "404"), new C5255(c36304, "500"), new C5255("accept-charset", ""), new C5255("accept-encoding", "gzip, deflate"), new C5255("accept-language", ""), new C5255("accept-ranges", ""), new C5255("accept", ""), new C5255("access-control-allow-origin", ""), new C5255("age", ""), new C5255("allow", ""), new C5255("authorization", ""), new C5255("cache-control", ""), new C5255("content-disposition", ""), new C5255("content-encoding", ""), new C5255("content-language", ""), new C5255("content-length", ""), new C5255("content-location", ""), new C5255("content-range", ""), new C5255("content-type", ""), new C5255("cookie", ""), new C5255("date", ""), new C5255("etag", ""), new C5255("expect", ""), new C5255("expires", ""), new C5255("from", ""), new C5255(C5368.f13117, ""), new C5255("if-match", ""), new C5255("if-modified-since", ""), new C5255("if-none-match", ""), new C5255("if-range", ""), new C5255("if-unmodified-since", ""), new C5255("last-modified", ""), new C5255("link", ""), new C5255("location", ""), new C5255("max-forwards", ""), new C5255("proxy-authenticate", ""), new C5255("proxy-authorization", ""), new C5255("range", ""), new C5255("referer", ""), new C5255("refresh", ""), new C5255("retry-after", ""), new C5255("server", ""), new C5255("set-cookie", ""), new C5255("strict-transport-security", ""), new C5255(C5368.f13120, ""), new C5255("user-agent", ""), new C5255("vary", ""), new C5255("via", ""), new C5255("www-authenticate", "")};
        f12858 = c5318.m16321();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final C3630 m2099(@InterfaceC6399 C3630 c3630) throws IOException {
        C5499.m17103(c3630, "name");
        int iM9852 = c3630.m9852();
        for (int i = 0; i < iM9852; i++) {
            byte bM9823 = c3630.m9823(i);
            if (65 <= bM9823 && bM9823 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c3630.m9862());
            }
        }
        return c3630;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final Map<C3630, Integer> m2100() {
        return f12858;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C5255[] m16320() {
        return f12857;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Map<C3630, Integer> m16321() {
        C5255[] c5255Arr = f12857;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c5255Arr.length);
        int length = c5255Arr.length;
        for (int i = 0; i < length; i++) {
            C5255[] c5255Arr2 = f12857;
            if (!linkedHashMap.containsKey(c5255Arr2[i].f1369)) {
                linkedHashMap.put(c5255Arr2[i].f1369, Integer.valueOf(i));
            }
        }
        Map<C3630, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C5499.m17102(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }
}
