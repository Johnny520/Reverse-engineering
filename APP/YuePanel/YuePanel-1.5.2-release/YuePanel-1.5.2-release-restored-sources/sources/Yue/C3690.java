package Yue;

import Yue.C4128;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3690 {

    /* JADX INFO: renamed from: ۥ */
    public C4128 f466;

    /* JADX INFO: renamed from: ۥ۟ */
    public C4128 f467;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C4128 f6508;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C4128 f6509;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C4128 f6510;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C4128 f6511;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C4128 f6512;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public ArrayList<C4128> f6513;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f6514;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f6515;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float f6516 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f6517;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f6518;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int f6519;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean f6520;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int f6521;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean f6522;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean f6523;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean f6524;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f6525;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f6526;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f6527;

    public C3690(C4128 c4128, int i, boolean z) {
        this.f466 = c4128;
        this.f6521 = i;
        this.f6522 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m10117(C4128 c4128, int i) {
        int i2;
        return c4128.m11890() != 8 && c4128.f8397[i] == C4128.EnumC0339.MATCH_CONSTRAINT && ((i2 = c4128.f8368[i]) == 0 || i2 == 3);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m765() {
        if (!this.f6527) {
            m766();
        }
        this.f6527 = true;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m766() {
        int i = this.f6521 * 2;
        C4128 c4128 = this.f466;
        this.f6520 = true;
        C4128 c41282 = c4128;
        boolean z = false;
        while (!z) {
            this.f6514++;
            C4128[] c4128Arr = c4128.f8436;
            int i2 = this.f6521;
            C4128 c41283 = null;
            c4128Arr[i2] = null;
            c4128.f8435[i2] = null;
            if (c4128.m11890() != 8) {
                this.f6517++;
                C4128.EnumC0339 enumC0339M11855 = c4128.m11855(this.f6521);
                C4128.EnumC0339 enumC0339 = C4128.EnumC0339.MATCH_CONSTRAINT;
                if (enumC0339M11855 != enumC0339) {
                    this.f6518 += c4128.m11868(this.f6521);
                }
                int iM11763 = this.f6518 + c4128.f8394[i].m11763();
                this.f6518 = iM11763;
                int i3 = i + 1;
                this.f6518 = iM11763 + c4128.f8394[i3].m11763();
                int iM117632 = this.f6519 + c4128.f8394[i].m11763();
                this.f6519 = iM117632;
                this.f6519 = iM117632 + c4128.f8394[i3].m11763();
                if (this.f467 == null) {
                    this.f467 = c4128;
                }
                this.f6509 = c4128;
                C4128.EnumC0339[] enumC0339Arr = c4128.f8397;
                int i4 = this.f6521;
                if (enumC0339Arr[i4] == enumC0339) {
                    int i5 = c4128.f8368[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.f6515++;
                        float f = c4128.f8434[i4];
                        if (f > 0.0f) {
                            this.f6516 += f;
                        }
                        if (m10117(c4128, i4)) {
                            if (f < 0.0f) {
                                this.f6523 = true;
                            } else {
                                this.f6524 = true;
                            }
                            if (this.f6513 == null) {
                                this.f6513 = new ArrayList<>();
                            }
                            this.f6513.add(c4128);
                        }
                        if (this.f6511 == null) {
                            this.f6511 = c4128;
                        }
                        C4128 c41284 = this.f6512;
                        if (c41284 != null) {
                            c41284.f8435[this.f6521] = c4128;
                        }
                        this.f6512 = c4128;
                    }
                    if (this.f6521 == 0) {
                        if (c4128.f8366 != 0 || c4128.f8369 != 0 || c4128.f8370 != 0) {
                            this.f6520 = false;
                        }
                    } else if (c4128.f8367 != 0 || c4128.f8372 != 0 || c4128.f8373 != 0) {
                        this.f6520 = false;
                    }
                    if (c4128.f8401 != 0.0f) {
                        this.f6520 = false;
                        this.f6526 = true;
                    }
                }
            }
            if (c41282 != c4128) {
                c41282.f8436[this.f6521] = c4128;
            }
            C4125 c4125 = c4128.f8394[i + 1].f8275;
            if (c4125 != null) {
                C4128 c41285 = c4125.f8273;
                C4125 c41252 = c41285.f8394[i].f8275;
                if (c41252 != null && c41252.f8273 == c4128) {
                    c41283 = c41285;
                }
            }
            if (c41283 == null) {
                c41283 = c4128;
                z = true;
            }
            c41282 = c4128;
            c4128 = c41283;
        }
        C4128 c41286 = this.f467;
        if (c41286 != null) {
            this.f6518 -= c41286.f8394[i].m11763();
        }
        C4128 c41287 = this.f6509;
        if (c41287 != null) {
            this.f6518 -= c41287.f8394[i + 1].m11763();
        }
        this.f6508 = c4128;
        if (this.f6521 == 0 && this.f6522) {
            this.f6510 = c4128;
        } else {
            this.f6510 = this.f466;
        }
        this.f6525 = this.f6524 && this.f6523;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C4128 m10118() {
        return this.f466;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C4128 m10119() {
        return this.f6511;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C4128 m10120() {
        return this.f467;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C4128 m10121() {
        return this.f6510;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C4128 m10122() {
        return this.f6508;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C4128 m10123() {
        return this.f6512;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C4128 m10124() {
        return this.f6509;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float m10125() {
        return this.f6516;
    }
}
