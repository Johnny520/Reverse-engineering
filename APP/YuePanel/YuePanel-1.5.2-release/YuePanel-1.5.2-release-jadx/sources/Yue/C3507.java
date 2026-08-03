package Yue;

import Yue.C4125;
import Yue.C4128;
import java.util.HashMap;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3507 extends C5281 {

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static final int f5875 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static final int f5876 = 1;

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final int f5877 = 2;

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static final int f5878 = 3;

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final boolean f5879 = true;

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static final boolean f5880 = false;

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public int f5881 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public boolean f5882 = true;

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public int f5883 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public boolean f5884 = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3507() {
    }

    @Override // Yue.C4128
    public String toString() {
        String str = "[Barrier] " + m11854() + " {";
        for (int i = 0; i < this.f12576; i++) {
            C4128 c4128 = this.f12575[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + c4128.m11854();
        }
        return str + "}";
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo9340(C5714 c5714, boolean z) {
        C4125[] c4125Arr;
        boolean z2;
        int i;
        int i2;
        int i3;
        C4125[] c4125Arr2 = this.f8394;
        c4125Arr2[0] = this.f8386;
        c4125Arr2[2] = this.f8387;
        c4125Arr2[1] = this.f8388;
        c4125Arr2[3] = this.f8389;
        int i4 = 0;
        while (true) {
            c4125Arr = this.f8394;
            if (i4 >= c4125Arr.length) {
                break;
            }
            C4125 c4125 = c4125Arr[i4];
            c4125.f8278 = c5714.m17638(c4125);
            i4++;
        }
        int i5 = this.f5881;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        C4125 c41252 = c4125Arr[i5];
        if (!this.f5884) {
            m9345();
        }
        if (this.f5884) {
            this.f5884 = false;
            int i6 = this.f5881;
            if (i6 == 0 || i6 == 1) {
                c5714.m17623(this.f8386.f8278, this.f8403);
                c5714.m17623(this.f8388.f8278, this.f8403);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    c5714.m17623(this.f8387.f8278, this.f8404);
                    c5714.m17623(this.f8389.f8278, this.f8404);
                    return;
                }
                return;
            }
        }
        for (int i7 = 0; i7 < this.f12576; i7++) {
            C4128 c4128 = this.f12575[i7];
            if ((this.f5882 || c4128.mo9341()) && ((((i2 = this.f5881) == 0 || i2 == 1) && c4128.m11863() == C4128.EnumC0339.MATCH_CONSTRAINT && c4128.f8386.f8275 != null && c4128.f8388.f8275 != null) || (((i3 = this.f5881) == 2 || i3 == 3) && c4128.m11888() == C4128.EnumC0339.MATCH_CONSTRAINT && c4128.f8387.f8275 != null && c4128.f8389.f8275 != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.f8386.m11769() || this.f8388.m11769();
        boolean z4 = this.f8387.m11769() || this.f8389.m11769();
        int i8 = !(!z2 && (((i = this.f5881) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        for (int i9 = 0; i9 < this.f12576; i9++) {
            C4128 c41282 = this.f12575[i9];
            if (this.f5882 || c41282.mo9341()) {
                C7503 c7503M17638 = c5714.m17638(c41282.f8394[this.f5881]);
                C4125[] c4125Arr3 = c41282.f8394;
                int i10 = this.f5881;
                C4125 c41253 = c4125Arr3[i10];
                c41253.f8278 = c7503M17638;
                C4125 c41254 = c41253.f8275;
                int i11 = (c41254 == null || c41254.f8273 != this) ? 0 : c41253.f8276;
                if (i10 == 0 || i10 == 2) {
                    c5714.m17627(c41252.f8278, c7503M17638, this.f5883 - i11, z2);
                } else {
                    c5714.m17625(c41252.f8278, c7503M17638, this.f5883 + i11, z2);
                }
                c5714.m17622(c41252.f8278, c7503M17638, this.f5883 + i11, i8);
            }
        }
        int i12 = this.f5881;
        if (i12 == 0) {
            c5714.m17622(this.f8388.f8278, this.f8386.f8278, 0, 8);
            c5714.m17622(this.f8386.f8278, this.f8398.f8388.f8278, 0, 4);
            c5714.m17622(this.f8386.f8278, this.f8398.f8386.f8278, 0, 0);
            return;
        }
        if (i12 == 1) {
            c5714.m17622(this.f8386.f8278, this.f8388.f8278, 0, 8);
            c5714.m17622(this.f8386.f8278, this.f8398.f8386.f8278, 0, 4);
            c5714.m17622(this.f8386.f8278, this.f8398.f8388.f8278, 0, 0);
        } else if (i12 == 2) {
            c5714.m17622(this.f8389.f8278, this.f8387.f8278, 0, 8);
            c5714.m17622(this.f8387.f8278, this.f8398.f8389.f8278, 0, 4);
            c5714.m17622(this.f8387.f8278, this.f8398.f8387.f8278, 0, 0);
        } else if (i12 == 3) {
            c5714.m17622(this.f8387.f8278, this.f8389.f8278, 0, 8);
            c5714.m17622(this.f8387.f8278, this.f8398.f8387.f8278, 0, 4);
            c5714.m17622(this.f8387.f8278, this.f8398.f8389.f8278, 0, 0);
        }
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean mo9341() {
        return true;
    }

    @Override // Yue.C5281, Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo9342(C4128 c4128, HashMap<C4128, C4128> map) {
        super.mo9342(c4128, map);
        C3507 c3507 = (C3507) c4128;
        this.f5881 = c3507.f5881;
        this.f5882 = c3507.f5882;
        this.f5883 = c3507.f5883;
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public boolean mo9343() {
        return this.f5884;
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public boolean mo9344() {
        return this.f5884;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public boolean m9345() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f12576;
            if (i4 >= i) {
                break;
            }
            C4128 c4128 = this.f12575[i4];
            if ((this.f5882 || c4128.mo9341()) && ((((i2 = this.f5881) == 0 || i2 == 1) && !c4128.mo9343()) || (((i3 = this.f5881) == 2 || i3 == 3) && !c4128.mo9344()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f12576; i5++) {
            C4128 c41282 = this.f12575[i5];
            if (this.f5882 || c41282.mo9341()) {
                if (!z2) {
                    int i6 = this.f5881;
                    if (i6 == 0) {
                        iMax = c41282.mo11847(C4125.EnumC0335.LEFT).m11762();
                    } else if (i6 == 1) {
                        iMax = c41282.mo11847(C4125.EnumC0335.RIGHT).m11762();
                    } else if (i6 == 2) {
                        iMax = c41282.mo11847(C4125.EnumC0335.TOP).m11762();
                    } else if (i6 == 3) {
                        iMax = c41282.mo11847(C4125.EnumC0335.BOTTOM).m11762();
                    }
                    z2 = true;
                }
                int i7 = this.f5881;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c41282.mo11847(C4125.EnumC0335.LEFT).m11762());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c41282.mo11847(C4125.EnumC0335.RIGHT).m11762());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c41282.mo11847(C4125.EnumC0335.TOP).m11762());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c41282.mo11847(C4125.EnumC0335.BOTTOM).m11762());
                }
            }
        }
        int i8 = iMax + this.f5883;
        int i9 = this.f5881;
        if (i9 == 0 || i9 == 1) {
            m11927(i8, i8);
        } else {
            m11930(i8, i8);
        }
        this.f5884 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public boolean m9346() {
        return this.f5882;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public int m9347() {
        return this.f5881;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public int m9348() {
        return this.f5883;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public int m9349() {
        int i = this.f5881;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public void m9350() {
        for (int i = 0; i < this.f12576; i++) {
            C4128 c4128 = this.f12575[i];
            int i2 = this.f5881;
            if (i2 == 0 || i2 == 1) {
                c4128.m11943(0, true);
            } else if (i2 == 2 || i2 == 3) {
                c4128.m11943(1, true);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public void m9351(boolean z) {
        this.f5882 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public void m9352(int i) {
        this.f5881 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public void m9353(int i) {
        this.f5883 = i;
    }

    public C3507(String str) {
        m11920(str);
    }
}
