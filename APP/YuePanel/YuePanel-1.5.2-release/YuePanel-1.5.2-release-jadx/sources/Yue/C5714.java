package Yue;

import Yue.C4125;
import Yue.C7503;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5714 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final boolean f14097 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final boolean f14098 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final boolean f14099 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final boolean f14100 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static boolean f14101 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static boolean f14102 = true;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static boolean f14103 = true;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static boolean f14104 = true;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static boolean f14105 = true;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static boolean f14106 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static int f14107 = 1000;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static C6226 f14108;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static long f14109;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static long f14110;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public InterfaceC0844 f14112;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C3398[] f14115;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final C3639 f14122;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public InterfaceC0844 f14125;

    /* JADX INFO: renamed from: ۥ */
    public boolean f1629 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f1630 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public HashMap<String, C7503> f14111 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f14113 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f14114 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f14116 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f14117 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean[] f14118 = new boolean[32];

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int f14119 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f14120 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f14121 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C7503[] f14123 = new C7503[f14107];

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int f14124 = 0;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۡۤ$ۥ */
    public interface InterfaceC0844 {
        void clear();

        C7503 getKey();

        boolean isEmpty();

        /* JADX INFO: renamed from: ۥ */
        C7503 mo484(C5714 c5714, boolean[] zArr);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo485(C5714 c5714);

        /* JADX INFO: renamed from: ۥ۟۟ */
        void mo7013(C7503 c7503);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo7014(C5714 c5714, C7503 c7503, boolean z);

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        void mo7015(C5714 c5714, C3398 c3398, boolean z);

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        void mo7016(InterfaceC0844 interfaceC0844);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۡۤ$ۥ۟ */
    public class C0845 extends C3398 {
        public C0845(C3639 c3639) {
            this.f5472 = new C7504(this, c3639);
        }
    }

    public C5714() {
        this.f14115 = null;
        this.f14115 = new C3398[32];
        m17664();
        C3639 c3639 = new C3639();
        this.f14122 = c3639;
        this.f14112 = new C6799(c3639);
        if (f14106) {
            this.f14125 = new C0845(c3639);
        } else {
            this.f14125 = new C3398(c3639);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static C3398 m17618(C5714 c5714, C7503 c7503, C7503 c75032, float f) {
        return c5714.m17639().m7023(c7503, c75032, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static C6226 m17619() {
        return f14108;
    }

    /* JADX INFO: renamed from: ۥ */
    public final C7503 m2393(C7503.EnumC1281 enumC1281, String str) {
        C7503 c7503Acquire = this.f14122.f6411.acquire();
        if (c7503Acquire == null) {
            c7503Acquire = new C7503(enumC1281, str);
            c7503Acquire.m23457(enumC1281, str);
        } else {
            c7503Acquire.m23453();
            c7503Acquire.m23457(enumC1281, str);
        }
        int i = this.f14124;
        int i2 = f14107;
        if (i >= i2) {
            int i3 = i2 * 2;
            f14107 = i3;
            this.f14123 = (C7503[]) Arrays.copyOf(this.f14123, i3);
        }
        C7503[] c7503Arr = this.f14123;
        int i4 = this.f14124;
        this.f14124 = i4 + 1;
        c7503Arr[i4] = c7503Acquire;
        return c7503Acquire;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m2394(C4128 c4128, C4128 c41282, float f, int i) {
        C4125.EnumC0335 enumC0335 = C4125.EnumC0335.LEFT;
        C7503 c7503M17638 = m17638(c4128.mo11847(enumC0335));
        C4125.EnumC0335 enumC03352 = C4125.EnumC0335.TOP;
        C7503 c7503M176382 = m17638(c4128.mo11847(enumC03352));
        C4125.EnumC0335 enumC03353 = C4125.EnumC0335.RIGHT;
        C7503 c7503M176383 = m17638(c4128.mo11847(enumC03353));
        C4125.EnumC0335 enumC03354 = C4125.EnumC0335.BOTTOM;
        C7503 c7503M176384 = m17638(c4128.mo11847(enumC03354));
        C7503 c7503M176385 = m17638(c41282.mo11847(enumC0335));
        C7503 c7503M176386 = m17638(c41282.mo11847(enumC03352));
        C7503 c7503M176387 = m17638(c41282.mo11847(enumC03353));
        C7503 c7503M176388 = m17638(c41282.mo11847(enumC03354));
        C3398 c3398M17639 = m17639();
        double d = f;
        double d2 = i;
        c3398M17639.m7032(c7503M176382, c7503M176384, c7503M176386, c7503M176388, (float) (Math.sin(d) * d2));
        m17621(c3398M17639);
        C3398 c3398M176392 = m17639();
        c3398M176392.m7032(c7503M17638, c7503M176383, c7503M176385, c7503M176387, (float) (Math.cos(d) * d2));
        m17621(c3398M176392);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m17620(C7503 c7503, C7503 c75032, int i, float f, C7503 c75033, C7503 c75034, int i2, int i3) {
        C3398 c3398M17639 = m17639();
        c3398M17639.m7021(c7503, c75032, i, f, c75033, c75034, i2);
        if (i3 != 8) {
            c3398M17639.m7017(this, i3);
        }
        m17621(c3398M17639);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m17621(C3398 c3398) {
        C7503 c7503M7037;
        if (c3398 == null) {
            return;
        }
        C6226 c6226 = f14108;
        if (c6226 != null) {
            c6226.f15350++;
            if (c3398.f5473) {
                c6226.f15351++;
            }
        }
        boolean z = true;
        if (this.f14120 + 1 >= this.f14121 || this.f14119 + 1 >= this.f14114) {
            m17660();
        }
        boolean z2 = false;
        if (!c3398.f5473) {
            c3398.mo485(this);
            if (c3398.isEmpty()) {
                return;
            }
            c3398.m7033();
            if (c3398.m7019(this)) {
                C7503 c7503M17637 = m17637();
                c3398.f272 = c7503M17637;
                int i = this.f14120;
                m17630(c3398);
                if (this.f14120 == i + 1) {
                    this.f14125.mo7016(c3398);
                    m17663(this.f14125, true);
                    if (c7503M17637.f22691 == -1) {
                        if (c3398.f272 == c7503M17637 && (c7503M7037 = c3398.m7037(c7503M17637)) != null) {
                            C6226 c62262 = f14108;
                            if (c62262 != null) {
                                c62262.f15354++;
                            }
                            c3398.m7039(c7503M7037);
                        }
                        if (!c3398.f5473) {
                            c3398.f272.m23459(this, c3398);
                        }
                        if (f14106) {
                            this.f14122.f428.release(c3398);
                        } else {
                            this.f14122.f429.release(c3398);
                        }
                        this.f14120--;
                    }
                } else {
                    z = false;
                }
                if (!c3398.m7034()) {
                    return;
                } else {
                    z2 = z;
                }
            }
        }
        if (z2) {
            return;
        }
        m17630(c3398);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C3398 m17622(C7503 c7503, C7503 c75032, int i, int i2) {
        if (f14102 && i2 == 8 && c75032.f22694 && c7503.f22691 == -1) {
            c7503.m23454(this, c75032.f22693 + i);
            return null;
        }
        C3398 c3398M17639 = m17639();
        c3398M17639.m7028(c7503, c75032, i);
        if (i2 != 8) {
            c3398M17639.m7017(this, i2);
        }
        m17621(c3398M17639);
        return c3398M17639;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m17623(C7503 c7503, int i) {
        if (f14102 && c7503.f22691 == -1) {
            float f = i;
            c7503.m23454(this, f);
            for (int i2 = 0; i2 < this.f1630 + 1; i2++) {
                C7503 c75032 = this.f14122.f6412[i2];
                if (c75032 != null && c75032.f22701 && c75032.f22702 == c7503.f22690) {
                    c75032.m23454(this, c75032.f22703 + f);
                }
            }
            return;
        }
        int i3 = c7503.f22691;
        if (i3 == -1) {
            C3398 c3398M17639 = m17639();
            c3398M17639.m7022(c7503, i);
            m17621(c3398M17639);
            return;
        }
        C3398 c3398 = this.f14115[i3];
        if (c3398.f5473) {
            c3398.f273 = i;
            return;
        }
        if (c3398.f5472.getCurrentSize() == 0) {
            c3398.f5473 = true;
            c3398.f273 = i;
        } else {
            C3398 c3398M176392 = m17639();
            c3398M176392.m7027(c7503, i);
            m17621(c3398M176392);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m17624(C3398 c3398) {
        c3398.m7017(this, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m17625(C7503 c7503, C7503 c75032, int i, boolean z) {
        C3398 c3398M17639 = m17639();
        C7503 c7503M17640 = m17640();
        c7503M17640.f22692 = 0;
        c3398M17639.m7030(c7503, c75032, c7503M17640, i);
        m17621(c3398M17639);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m17626(C7503 c7503, C7503 c75032, int i, int i2) {
        C3398 c3398M17639 = m17639();
        C7503 c7503M17640 = m17640();
        c7503M17640.f22692 = 0;
        c3398M17639.m7030(c7503, c75032, c7503M17640, i);
        if (i2 != 8) {
            m17632(c3398M17639, (int) (c3398M17639.f5472.mo6990(c7503M17640) * (-1.0f)), i2);
        }
        m17621(c3398M17639);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m17627(C7503 c7503, C7503 c75032, int i, boolean z) {
        C3398 c3398M17639 = m17639();
        C7503 c7503M17640 = m17640();
        c7503M17640.f22692 = 0;
        c3398M17639.m7031(c7503, c75032, c7503M17640, i);
        m17621(c3398M17639);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m17628(C7503 c7503, C7503 c75032, int i, int i2) {
        C3398 c3398M17639 = m17639();
        C7503 c7503M17640 = m17640();
        c7503M17640.f22692 = 0;
        c3398M17639.m7031(c7503, c75032, c7503M17640, i);
        if (i2 != 8) {
            m17632(c3398M17639, (int) (c3398M17639.f5472.mo6990(c7503M17640) * (-1.0f)), i2);
        }
        m17621(c3398M17639);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m17629(C7503 c7503, C7503 c75032, C7503 c75033, C7503 c75034, float f, int i) {
        C3398 c3398M17639 = m17639();
        c3398M17639.m7024(c7503, c75032, c75033, c75034, f);
        if (i != 8) {
            c3398M17639.m7017(this, i);
        }
        m17621(c3398M17639);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m17630(C3398 c3398) {
        int i;
        if (f14103 && c3398.f5473) {
            c3398.f272.m23454(this, c3398.f273);
        } else {
            C3398[] c3398Arr = this.f14115;
            int i2 = this.f14120;
            c3398Arr[i2] = c3398;
            C7503 c7503 = c3398.f272;
            c7503.f22691 = i2;
            this.f14120 = i2 + 1;
            c7503.m23459(this, c3398);
        }
        if (f14103 && this.f1629) {
            int i3 = 0;
            while (i3 < this.f14120) {
                if (this.f14115[i3] == null) {
                    System.out.println("WTF");
                }
                C3398 c33982 = this.f14115[i3];
                if (c33982 != null && c33982.f5473) {
                    c33982.f272.m23454(this, c33982.f273);
                    if (f14106) {
                        this.f14122.f428.release(c33982);
                    } else {
                        this.f14122.f429.release(c33982);
                    }
                    this.f14115[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f14120;
                        if (i4 >= i) {
                            break;
                        }
                        C3398[] c3398Arr2 = this.f14115;
                        int i6 = i4 - 1;
                        C3398 c33983 = c3398Arr2[i4];
                        c3398Arr2[i6] = c33983;
                        C7503 c75032 = c33983.f272;
                        if (c75032.f22691 == i4) {
                            c75032.f22691 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f14115[i5] = null;
                    }
                    this.f14120 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f1629 = false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m17631(C3398 c3398, int i) {
        m17632(c3398, i, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m17632(C3398 c3398, int i, int i2) {
        c3398.m7018(m17636(i2, null), i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m17633(C7503 c7503, C7503 c75032, int i) {
        if (c7503.f22691 != -1 || i != 0) {
            m17622(c7503, c75032, i, 8);
            return;
        }
        if (c75032.f22701) {
            c75032 = this.f14122.f6412[c75032.f22702];
        }
        if (c7503.f22701) {
            C7503 c75033 = this.f14122.f6412[c7503.f22702];
        } else {
            c7503.m23456(this, c75032, 0.0f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m17634() {
        int i;
        int i2 = 0;
        while (i2 < this.f14120) {
            C3398 c3398 = this.f14115[i2];
            if (c3398.f5472.getCurrentSize() == 0) {
                c3398.f5473 = true;
            }
            if (c3398.f5473) {
                C7503 c7503 = c3398.f272;
                c7503.f22693 = c3398.f273;
                c7503.m23452(c3398);
                int i3 = i2;
                while (true) {
                    i = this.f14120;
                    if (i3 >= i - 1) {
                        break;
                    }
                    C3398[] c3398Arr = this.f14115;
                    int i4 = i3 + 1;
                    c3398Arr[i3] = c3398Arr[i4];
                    i3 = i4;
                }
                this.f14115[i - 1] = null;
                this.f14120 = i - 1;
                i2--;
                if (f14106) {
                    this.f14122.f428.release(c3398);
                } else {
                    this.f14122.f429.release(c3398);
                }
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m17635() {
        for (int i = 0; i < this.f14120; i++) {
            C3398 c3398 = this.f14115[i];
            c3398.f272.f22693 = c3398.f273;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public C7503 m17636(int i, String str) {
        C6226 c6226 = f14108;
        if (c6226 != null) {
            c6226.f15357++;
        }
        if (this.f14119 + 1 >= this.f14114) {
            m17660();
        }
        C7503 c7503M2393 = m2393(C7503.EnumC1281.ERROR, str);
        int i2 = this.f1630 + 1;
        this.f1630 = i2;
        this.f14119++;
        c7503M2393.f22690 = i2;
        c7503M2393.f22692 = i;
        this.f14122.f6412[i2] = c7503M2393;
        this.f14112.mo7013(c7503M2393);
        return c7503M2393;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C7503 m17637() {
        C6226 c6226 = f14108;
        if (c6226 != null) {
            c6226.f15359++;
        }
        if (this.f14119 + 1 >= this.f14114) {
            m17660();
        }
        C7503 c7503M2393 = m2393(C7503.EnumC1281.SLACK, null);
        int i = this.f1630 + 1;
        this.f1630 = i;
        this.f14119++;
        c7503M2393.f22690 = i;
        this.f14122.f6412[i] = c7503M2393;
        return c7503M2393;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public C7503 m17638(Object obj) {
        C7503 c7503M11766 = null;
        if (obj == null) {
            return null;
        }
        if (this.f14119 + 1 >= this.f14114) {
            m17660();
        }
        if (obj instanceof C4125) {
            C4125 c4125 = (C4125) obj;
            c7503M11766 = c4125.m11766();
            if (c7503M11766 == null) {
                c4125.m11782(this.f14122);
                c7503M11766 = c4125.m11766();
            }
            int i = c7503M11766.f22690;
            if (i == -1 || i > this.f1630 || this.f14122.f6412[i] == null) {
                if (i != -1) {
                    c7503M11766.m23453();
                }
                int i2 = this.f1630 + 1;
                this.f1630 = i2;
                this.f14119++;
                c7503M11766.f22690 = i2;
                c7503M11766.f22697 = C7503.EnumC1281.UNRESTRICTED;
                this.f14122.f6412[i2] = c7503M11766;
            }
        }
        return c7503M11766;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C3398 m17639() {
        C3398 c3398Acquire;
        if (f14106) {
            c3398Acquire = this.f14122.f428.acquire();
            if (c3398Acquire == null) {
                c3398Acquire = new C0845(this.f14122);
                f14110++;
            } else {
                c3398Acquire.m7040();
            }
        } else {
            c3398Acquire = this.f14122.f429.acquire();
            if (c3398Acquire == null) {
                c3398Acquire = new C3398(this.f14122);
                f14109++;
            } else {
                c3398Acquire.m7040();
            }
        }
        C7503.m23450();
        return c3398Acquire;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public C7503 m17640() {
        C6226 c6226 = f14108;
        if (c6226 != null) {
            c6226.f15358++;
        }
        if (this.f14119 + 1 >= this.f14114) {
            m17660();
        }
        C7503 c7503M2393 = m2393(C7503.EnumC1281.SLACK, null);
        int i = this.f1630 + 1;
        this.f1630 = i;
        this.f14119++;
        c7503M2393.f22690 = i;
        this.f14122.f6412[i] = c7503M2393;
        return c7503M2393;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final C7503 m17641(String str, C7503.EnumC1281 enumC1281) {
        C6226 c6226 = f14108;
        if (c6226 != null) {
            c6226.f15356++;
        }
        if (this.f14119 + 1 >= this.f14114) {
            m17660();
        }
        C7503 c7503M2393 = m2393(enumC1281, null);
        c7503M2393.m23455(str);
        int i = this.f1630 + 1;
        this.f1630 = i;
        this.f14119++;
        c7503M2393.f22690 = i;
        if (this.f14111 == null) {
            this.f14111 = new HashMap<>();
        }
        this.f14111.put(str, c7503M2393);
        this.f14122.f6412[this.f1630] = c7503M2393;
        return c7503M2393;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m17642() {
        m17644();
        String str = " num vars " + this.f1630 + "\n";
        for (int i = 0; i < this.f1630 + 1; i++) {
            C7503 c7503 = this.f14122.f6412[i];
            if (c7503 != null && c7503.f22694) {
                str = str + " $[" + i + "] => " + c7503 + " = " + c7503.f22693 + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i2 = 0; i2 < this.f1630 + 1; i2++) {
            C7503[] c7503Arr = this.f14122.f6412;
            C7503 c75032 = c7503Arr[i2];
            if (c75032 != null && c75032.f22701) {
                str2 = str2 + " ~[" + i2 + "] => " + c75032 + " = " + c7503Arr[c75032.f22702] + " + " + c75032.f22703 + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i3 = 0; i3 < this.f14120; i3++) {
            str3 = (str3 + this.f14115[i3].m7042()) + "\n #  ";
        }
        if (this.f14112 != null) {
            str3 = str3 + "Goal: " + this.f14112 + "\n";
        }
        System.out.println(str3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m17643() {
        m17644();
        String str = "";
        for (int i = 0; i < this.f14120; i++) {
            str = (str + this.f14115[i]) + "\n";
        }
        System.out.println(str + this.f14112 + "\n");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m17644() {
        System.out.println("Display Rows (" + this.f14120 + "x" + this.f14119 + ")\n");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m17645() {
        int iM7041 = 0;
        for (int i = 0; i < this.f14113; i++) {
            C3398 c3398 = this.f14115[i];
            if (c3398 != null) {
                iM7041 += c3398.m7041();
            }
        }
        int iM70412 = 0;
        for (int i2 = 0; i2 < this.f14120; i2++) {
            C3398 c33982 = this.f14115[i2];
            if (c33982 != null) {
                iM70412 += c33982.m7041();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("Linear System -> Table size: ");
        sb.append(this.f14113);
        sb.append(" (");
        int i3 = this.f14113;
        sb.append(m17650(i3 * i3));
        sb.append(") -- row sizes: ");
        sb.append(m17650(iM7041));
        sb.append(", actual size: ");
        sb.append(m17650(iM70412));
        sb.append(" rows: ");
        sb.append(this.f14120);
        sb.append("/");
        sb.append(this.f14121);
        sb.append(" cols: ");
        sb.append(this.f14119);
        sb.append("/");
        sb.append(this.f14114);
        sb.append(" ");
        sb.append(0);
        sb.append(" occupied cells, ");
        sb.append(m17650(0));
        printStream.println(sb.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m17646() {
        m17644();
        String str = "";
        for (int i = 0; i < this.f14120; i++) {
            if (this.f14115[i].f272.f22697 == C7503.EnumC1281.UNRESTRICTED) {
                str = (str + this.f14115[i].m7042()) + "\n";
            }
        }
        System.out.println(str + this.f14112 + "\n");
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final int m17647(InterfaceC0844 interfaceC0844) throws Exception {
        for (int i = 0; i < this.f14120; i++) {
            C3398 c3398 = this.f14115[i];
            if (c3398.f272.f22697 != C7503.EnumC1281.UNRESTRICTED && c3398.f273 < 0.0f) {
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    C6226 c6226 = f14108;
                    if (c6226 != null) {
                        c6226.f15355++;
                    }
                    i2++;
                    float f = Float.MAX_VALUE;
                    int i3 = 0;
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = 0;
                    while (true) {
                        if (i3 >= this.f14120) {
                            break;
                        }
                        C3398 c33982 = this.f14115[i3];
                        if (c33982.f272.f22697 != C7503.EnumC1281.UNRESTRICTED && !c33982.f5473 && c33982.f273 < 0.0f) {
                            int i7 = 9;
                            if (f14105) {
                                int currentSize = c33982.f5472.getCurrentSize();
                                int i8 = 0;
                                while (i8 < currentSize) {
                                    C7503 c7503Mo6987 = c33982.f5472.mo6987(i8);
                                    float fMo6990 = c33982.f5472.mo6990(c7503Mo6987);
                                    if (fMo6990 > 0.0f) {
                                        int i9 = 0;
                                        while (i9 < i7) {
                                            float f2 = c7503Mo6987.f22695[i9] / fMo6990;
                                            if ((f2 < f && i9 == i6) || i9 > i6) {
                                                i6 = i9;
                                                i5 = c7503Mo6987.f22690;
                                                i4 = i3;
                                                f = f2;
                                            }
                                            i9++;
                                            i7 = 9;
                                        }
                                    }
                                    i8++;
                                    i7 = 9;
                                }
                            } else {
                                for (int i10 = 1; i10 < this.f14119; i10++) {
                                    C7503 c7503 = this.f14122.f6412[i10];
                                    float fMo69902 = c33982.f5472.mo6990(c7503);
                                    if (fMo69902 > 0.0f) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f3 = c7503.f22695[i11] / fMo69902;
                                            if ((f3 < f && i11 == i6) || i11 > i6) {
                                                i6 = i11;
                                                i4 = i3;
                                                i5 = i10;
                                                f = f3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i3++;
                    }
                    if (i4 != -1) {
                        C3398 c33983 = this.f14115[i4];
                        c33983.f272.f22691 = -1;
                        C6226 c62262 = f14108;
                        if (c62262 != null) {
                            c62262.f15354++;
                        }
                        c33983.m7039(this.f14122.f6412[i5]);
                        C7503 c75032 = c33983.f272;
                        c75032.f22691 = i4;
                        c75032.m23459(this, c33983);
                    } else {
                        z = true;
                    }
                    if (i2 > this.f14119 / 2) {
                        z = true;
                    }
                }
                return i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m17648(C6226 c6226) {
        f14108 = c6226;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public C3639 m17649() {
        return this.f14122;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final String m17650(int i) {
        int i2 = i * 4;
        int i3 = i2 / 1024;
        int i4 = i3 / 1024;
        if (i4 > 0) {
            return "" + i4 + " Mb";
        }
        if (i3 > 0) {
            return "" + i3 + " Kb";
        }
        return "" + i2 + " bytes";
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final String m17651(int i) {
        return i == 1 ? "LOW" : i == 2 ? "MEDIUM" : i == 3 ? "HIGH" : i == 4 ? "HIGHEST" : i == 5 ? "EQUALITY" : i == 8 ? "FIXED" : i == 6 ? "BARRIER" : "NONE";
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public InterfaceC0844 m17652() {
        return this.f14112;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public int m17653() {
        int iM7041 = 0;
        for (int i = 0; i < this.f14120; i++) {
            C3398 c3398 = this.f14115[i];
            if (c3398 != null) {
                iM7041 += c3398.m7041();
            }
        }
        return iM7041;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public int m17654() {
        return this.f14120;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int m17655() {
        return this.f1630;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int m17656(Object obj) {
        C7503 c7503M11766 = ((C4125) obj).m11766();
        if (c7503M11766 != null) {
            return (int) (c7503M11766.f22693 + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public C3398 m17657(int i) {
        return this.f14115[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public float m17658(String str) {
        C7503 c7503M17659 = m17659(str, C7503.EnumC1281.UNRESTRICTED);
        if (c7503M17659 == null) {
            return 0.0f;
        }
        return c7503M17659.f22693;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public C7503 m17659(String str, C7503.EnumC1281 enumC1281) {
        if (this.f14111 == null) {
            this.f14111 = new HashMap<>();
        }
        C7503 c7503 = this.f14111.get(str);
        return c7503 == null ? m17641(str, enumC1281) : c7503;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final void m17660() {
        int i = this.f14113 * 2;
        this.f14113 = i;
        this.f14115 = (C3398[]) Arrays.copyOf(this.f14115, i);
        C3639 c3639 = this.f14122;
        c3639.f6412 = (C7503[]) Arrays.copyOf(c3639.f6412, this.f14113);
        int i2 = this.f14113;
        this.f14118 = new boolean[i2];
        this.f14114 = i2;
        this.f14121 = i2;
        C6226 c6226 = f14108;
        if (c6226 != null) {
            c6226.f15348++;
            c6226.f15360 = Math.max(c6226.f15360, i2);
            C6226 c62262 = f14108;
            c62262.f15376 = c62262.f15360;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m17661() throws Exception {
        C6226 c6226 = f14108;
        if (c6226 != null) {
            c6226.f15349++;
        }
        if (this.f14112.isEmpty()) {
            m17635();
            return;
        }
        if (!this.f14116 && !this.f14117) {
            m17662(this.f14112);
            return;
        }
        C6226 c62262 = f14108;
        if (c62262 != null) {
            c62262.f15362++;
        }
        for (int i = 0; i < this.f14120; i++) {
            if (!this.f14115[i].f5473) {
                m17662(this.f14112);
                return;
            }
        }
        C6226 c62263 = f14108;
        if (c62263 != null) {
            c62263.f15361++;
        }
        m17635();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m17662(InterfaceC0844 interfaceC0844) throws Exception {
        C6226 c6226 = f14108;
        if (c6226 != null) {
            c6226.f15366++;
            c6226.f15367 = Math.max(c6226.f15367, this.f14119);
            C6226 c62262 = f14108;
            c62262.f15368 = Math.max(c62262.f15368, this.f14120);
        }
        m17647(interfaceC0844);
        m17663(interfaceC0844, false);
        m17635();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final int m17663(InterfaceC0844 interfaceC0844, boolean z) {
        C6226 c6226 = f14108;
        if (c6226 != null) {
            c6226.f15352++;
        }
        for (int i = 0; i < this.f14119; i++) {
            this.f14118[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C6226 c62262 = f14108;
            if (c62262 != null) {
                c62262.f15353++;
            }
            i2++;
            if (i2 >= this.f14119 * 2) {
                return i2;
            }
            if (interfaceC0844.getKey() != null) {
                this.f14118[interfaceC0844.getKey().f22690] = true;
            }
            C7503 c7503Mo484 = interfaceC0844.mo484(this, this.f14118);
            if (c7503Mo484 != null) {
                boolean[] zArr = this.f14118;
                int i3 = c7503Mo484.f22690;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (c7503Mo484 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f14120; i5++) {
                    C3398 c3398 = this.f14115[i5];
                    if (c3398.f272.f22697 != C7503.EnumC1281.UNRESTRICTED && !c3398.f5473 && c3398.m7035(c7503Mo484)) {
                        float fMo6990 = c3398.f5472.mo6990(c7503Mo484);
                        if (fMo6990 < 0.0f) {
                            float f2 = (-c3398.f273) / fMo6990;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C3398 c33982 = this.f14115[i4];
                    c33982.f272.f22691 = -1;
                    C6226 c62263 = f14108;
                    if (c62263 != null) {
                        c62263.f15354++;
                    }
                    c33982.m7039(c7503Mo484);
                    C7503 c7503 = c33982.f272;
                    c7503.f22691 = i4;
                    c7503.m23459(this, c33982);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m17664() {
        int i = 0;
        if (f14106) {
            while (i < this.f14120) {
                C3398 c3398 = this.f14115[i];
                if (c3398 != null) {
                    this.f14122.f428.release(c3398);
                }
                this.f14115[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f14120) {
            C3398 c33982 = this.f14115[i];
            if (c33982 != null) {
                this.f14122.f429.release(c33982);
            }
            this.f14115[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m17665(C3398 c3398) {
        C7503 c7503;
        int i;
        if (!c3398.f5473 || (c7503 = c3398.f272) == null) {
            return;
        }
        int i2 = c7503.f22691;
        if (i2 != -1) {
            while (true) {
                i = this.f14120;
                if (i2 >= i - 1) {
                    break;
                }
                C3398[] c3398Arr = this.f14115;
                int i3 = i2 + 1;
                C3398 c33982 = c3398Arr[i3];
                C7503 c75032 = c33982.f272;
                if (c75032.f22691 == i3) {
                    c75032.f22691 = i2;
                }
                c3398Arr[i2] = c33982;
                i2 = i3;
            }
            this.f14120 = i - 1;
        }
        C7503 c75033 = c3398.f272;
        if (!c75033.f22694) {
            c75033.m23454(this, c3398.f273);
        }
        if (f14106) {
            this.f14122.f428.release(c3398);
        } else {
            this.f14122.f429.release(c3398);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m17666() {
        C3639 c3639;
        int i = 0;
        while (true) {
            c3639 = this.f14122;
            C7503[] c7503Arr = c3639.f6412;
            if (i >= c7503Arr.length) {
                break;
            }
            C7503 c7503 = c7503Arr[i];
            if (c7503 != null) {
                c7503.m23453();
            }
            i++;
        }
        c3639.f6411.mo3182(this.f14123, this.f14124);
        this.f14124 = 0;
        Arrays.fill(this.f14122.f6412, (Object) null);
        HashMap<String, C7503> map = this.f14111;
        if (map != null) {
            map.clear();
        }
        this.f1630 = 0;
        this.f14112.clear();
        this.f14119 = 1;
        for (int i2 = 0; i2 < this.f14120; i2++) {
            C3398 c3398 = this.f14115[i2];
            if (c3398 != null) {
                c3398.f5470 = false;
            }
        }
        m17664();
        this.f14120 = 0;
        if (f14106) {
            this.f14125 = new C0845(this.f14122);
        } else {
            this.f14125 = new C3398(this.f14122);
        }
    }
}
