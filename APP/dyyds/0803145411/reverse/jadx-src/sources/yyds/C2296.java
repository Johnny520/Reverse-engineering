package yyds;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲁᛸᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2296 {

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static boolean f11274;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final C0644 f11277;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public C1486 f11288;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2020 f11290;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f11280 = 1000;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public boolean f11282 = false;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f11287 = 0;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f11279 = 32;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f11289 = 32;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f11276 = false;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean[] f11278 = new boolean[32];

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f11286 = 1;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f11284 = 0;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f11285 = 32;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public C0972[] f11275 = new C0972[1000];

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f11281 = 0;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C1486[] f11283 = new C1486[32];

    public C2296() {
        m4313();
        C0644 c0644 = new C0644(7, false);
        c0644.f3099 = new C1135();
        c0644.f3102 = new C1135();
        c0644.f3101 = new C0972[32];
        this.f11277 = c0644;
        C2020 c2020 = new C2020(c0644);
        c2020.f10090 = new C0972[128];
        c2020.f10089 = new C0972[128];
        c2020.f10087 = 0;
        c2020.f10088 = new C0119(c2020);
        this.f11290 = c2020;
        this.f11288 = new C1486(c0644);
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static int m4298(Object obj) {
        C0972 c0972 = ((C2141) obj).f10571;
        if (c0972 != null) {
            return (int) (c0972.f4458 + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m4299(C1486 c1486) {
        int i;
        if (c1486.f7025) {
            c1486.f7026.m2114(this, c1486.f7027);
        } else {
            C1486[] c1486Arr = this.f11283;
            int i2 = this.f11284;
            c1486Arr[i2] = c1486;
            C0972 c0972 = c1486.f7026;
            c0972.f4457 = i2;
            this.f11284 = i2 + 1;
            c0972.m2110(this, c1486);
        }
        if (this.f11282) {
            int i3 = 0;
            while (i3 < this.f11284) {
                if (this.f11283[i3] == null) {
                    System.out.println("WTF");
                }
                C1486 c14862 = this.f11283[i3];
                if (c14862 != null && c14862.f7025) {
                    c14862.f7026.m2114(this, c14862.f7027);
                    ((C1135) this.f11277.f3099).m2327(c14862);
                    this.f11283[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f11284;
                        if (i4 >= i) {
                            break;
                        }
                        C1486[] c1486Arr2 = this.f11283;
                        int i6 = i4 - 1;
                        C1486 c14863 = c1486Arr2[i4];
                        c1486Arr2[i6] = c14863;
                        C0972 c09722 = c14863.f7026;
                        if (c09722.f4457 == i4) {
                            c09722.f4457 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f11283[i5] = null;
                    }
                    this.f11284 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f11282 = false;
        }
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final C0972 m4300() {
        if (this.f11286 + 1 >= this.f11289) {
            m4305();
        }
        C0972 c0972M4303 = m4303(3);
        int i = this.f11287 + 1;
        this.f11287 = i;
        this.f11286++;
        c0972M4303.f4464 = i;
        ((C0972[]) this.f11277.f3101)[i] = c0972M4303;
        return c0972M4303;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m4301() {
        for (int i = 0; i < this.f11284; i++) {
            C1486 c1486 = this.f11283[i];
            c1486.f7026.f4458 = c1486.f7027;
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m4302(C0972 c0972, C0972 c09722, int i, int i2) {
        if (i2 == 8 && c09722.f4454 && c0972.f4457 == -1) {
            c0972.m2114(this, c09722.f4458 + i);
            return;
        }
        C1486 c1486M4311 = m4311();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c1486M4311.f7027 = i;
        }
        C2244 c2244 = c1486M4311.f7029;
        if (z) {
            c2244.m4245(c0972, 1.0f);
            c1486M4311.f7029.m4245(c09722, -1.0f);
        } else {
            c2244.m4245(c0972, -1.0f);
            c1486M4311.f7029.m4245(c09722, 1.0f);
        }
        if (i2 != 8) {
            c1486M4311.m2983(this, i2);
        }
        m4314(c1486M4311);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0972 m4303(int i) {
        C1135 c1135 = (C1135) this.f11277.f3102;
        int i2 = c1135.f5215;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = c1135.f5214;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            c1135.f5215 = i3;
            obj = obj2;
        }
        C0972 c0972 = (C0972) obj;
        if (c0972 == null) {
            c0972 = new C0972(i);
            c0972.f4453 = i;
        } else {
            c0972.m2113();
            c0972.f4453 = i;
        }
        int i4 = this.f11281;
        int i5 = this.f11280;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.f11280 = i6;
            this.f11275 = (C0972[]) Arrays.copyOf(this.f11275, i6);
        }
        C0972[] c0972Arr = this.f11275;
        int i7 = this.f11281;
        this.f11281 = i7 + 1;
        c0972Arr[i7] = c0972;
        return c0972;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final void m4304() {
        C0644 c0644;
        int i = 0;
        while (true) {
            c0644 = this.f11277;
            C0972[] c0972Arr = (C0972[]) c0644.f3101;
            if (i >= c0972Arr.length) {
                break;
            }
            C0972 c0972 = c0972Arr[i];
            if (c0972 != null) {
                c0972.m2113();
            }
            i++;
        }
        C1135 c1135 = (C1135) c0644.f3102;
        C0972[] c0972Arr2 = this.f11275;
        int length = this.f11281;
        c1135.getClass();
        if (length > c0972Arr2.length) {
            length = c0972Arr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C0972 c09722 = c0972Arr2[i2];
            int i3 = c1135.f5215;
            Object[] objArr = c1135.f5214;
            if (i3 < objArr.length) {
                objArr[i3] = c09722;
                c1135.f5215 = i3 + 1;
            }
        }
        this.f11281 = 0;
        Arrays.fill((C0972[]) c0644.f3101, (Object) null);
        this.f11287 = 0;
        C2020 c2020 = this.f11290;
        c2020.f10087 = 0;
        c2020.f7027 = 0.0f;
        this.f11286 = 1;
        for (int i4 = 0; i4 < this.f11284; i4++) {
            C1486 c1486 = this.f11283[i4];
        }
        m4313();
        this.f11284 = 0;
        this.f11288 = new C1486(c0644);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m4305() {
        int i = this.f11279 * 2;
        this.f11279 = i;
        this.f11283 = (C1486[]) Arrays.copyOf(this.f11283, i);
        C0644 c0644 = this.f11277;
        c0644.f3101 = (C0972[]) Arrays.copyOf((C0972[]) c0644.f3101, this.f11279);
        int i2 = this.f11279;
        this.f11278 = new boolean[i2];
        this.f11289 = i2;
        this.f11285 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0091 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4306(C1486 c1486) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.f11286; i2++) {
            this.f11278[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f11286 * 2) {
                return;
            }
            C0972 c0972 = c1486.f7026;
            if (c0972 != null) {
                this.f11278[c0972.f4464] = true;
            }
            C0972 c0972Mo2988 = c1486.mo2988(this.f11278);
            if (c0972Mo2988 != null) {
                boolean[] zArr = this.f11278;
                int i4 = c0972Mo2988.f4464;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (c0972Mo2988 != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.f11284) {
                    C1486 c14862 = this.f11283[i5];
                    if (c14862.f7026.f4453 != 1 && !c14862.f7025) {
                        C2244 c2244 = c14862.f7029;
                        int i7 = c2244.f11074;
                        if (i7 == -1) {
                            z = false;
                            if (!z) {
                                float fM4246 = c14862.f7029.m4246(c0972Mo2988);
                                if (fM4246 < 0.0f) {
                                    float f2 = (-c14862.f7027) / fM4246;
                                    if (f2 < f) {
                                        i6 = i5;
                                        f = f2;
                                    }
                                }
                            }
                        } else {
                            for (int i8 = i; i7 != -1 && i8 < c2244.f11077; i8++) {
                                if (c2244.f11076[i7] == c0972Mo2988.f4464) {
                                    z = true;
                                    break;
                                }
                                i7 = c2244.f11082[i7];
                            }
                            z = false;
                            if (!z) {
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    C1486 c14863 = this.f11283[i6];
                    c14863.f7026.f4457 = -1;
                    c14863.m2985(c0972Mo2988);
                    C0972 c09722 = c14863.f7026;
                    c09722.f4457 = i6;
                    c09722.m2110(this, c14863);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4307(C0972 c0972, C0972 c09722, int i, float f, C0972 c09723, C0972 c09724, int i2, int i3) {
        C1486 c1486M4311 = m4311();
        if (c09722 == c09723) {
            c1486M4311.f7029.m4245(c0972, 1.0f);
            c1486M4311.f7029.m4245(c09724, 1.0f);
            c1486M4311.f7029.m4245(c09722, -2.0f);
        } else {
            C2244 c2244 = c1486M4311.f7029;
            if (f == 0.5f) {
                c2244.m4245(c0972, 1.0f);
                c1486M4311.f7029.m4245(c09722, -1.0f);
                c1486M4311.f7029.m4245(c09723, -1.0f);
                c1486M4311.f7029.m4245(c09724, 1.0f);
                if (i > 0 || i2 > 0) {
                    c1486M4311.f7027 = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                c2244.m4245(c0972, -1.0f);
                c1486M4311.f7029.m4245(c09722, 1.0f);
                c1486M4311.f7027 = i;
            } else if (f >= 1.0f) {
                c2244.m4245(c09724, -1.0f);
                c1486M4311.f7029.m4245(c09723, 1.0f);
                c1486M4311.f7027 = -i2;
            } else {
                float f2 = 1.0f - f;
                c2244.m4245(c0972, f2 * 1.0f);
                c1486M4311.f7029.m4245(c09722, f2 * (-1.0f));
                c1486M4311.f7029.m4245(c09723, (-1.0f) * f);
                c1486M4311.f7029.m4245(c09724, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    c1486M4311.f7027 = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            c1486M4311.m2983(this, i3);
        }
        m4314(c1486M4311);
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final void m4308(C2020 c2020) {
        int i = 0;
        while (true) {
            if (i >= this.f11284) {
                break;
            }
            C1486 c1486 = this.f11283[i];
            int i2 = 1;
            if (c1486.f7026.f4453 != 1) {
                float f = 0.0f;
                if (c1486.f7027 < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f11284) {
                            C1486 c14862 = this.f11283[i6];
                            if (c14862.f7026.f4453 != i2 && !c14862.f7025 && c14862.f7027 < f) {
                                int iM4248 = c14862.f7029.m4248();
                                int i8 = 0;
                                while (i8 < iM4248) {
                                    C0972 c0972M4242 = c14862.f7029.m4242(i8);
                                    float fM4246 = c14862.f7029.m4246(c0972M4242);
                                    if (fM4246 > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = c0972M4242.f4456[i9] / fM4246;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = c0972M4242.f4464;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C1486 c14863 = this.f11283[i4];
                            c14863.f7026.f4457 = -1;
                            c14863.m2985(((C0972[]) this.f11277.f3101)[i5]);
                            C0972 c0972 = c14863.f7026;
                            c0972.f4457 = i4;
                            c0972.m2110(this, c14863);
                        } else {
                            z = true;
                        }
                        if (i3 > this.f11286 / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        m4306(c2020);
        m4301();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m4309(C0972 c0972, C0972 c09722, int i, int i2) {
        C1486 c1486M4311 = m4311();
        C0972 c0972M4300 = m4300();
        c0972M4300.f4463 = 0;
        c1486M4311.m2986(c0972, c09722, c0972M4300, i);
        if (i2 != 8) {
            c1486M4311.f7029.m4245(m4312(i2), (int) (c1486M4311.f7029.m4246(c0972M4300) * (-1.0f)));
        }
        m4314(c1486M4311);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final C0972 m4310(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f11286 + 1 >= this.f11289) {
            m4305();
        }
        if (!(obj instanceof C2141)) {
            return null;
        }
        C2141 c2141 = (C2141) obj;
        C0972 c0972 = c2141.f10571;
        if (c0972 == null) {
            c2141.m4080();
            c0972 = c2141.f10571;
        }
        int i = c0972.f4464;
        C0644 c0644 = this.f11277;
        if (i != -1 && i <= this.f11287 && ((C0972[]) c0644.f3101)[i] != null) {
            return c0972;
        }
        if (i != -1) {
            c0972.m2113();
        }
        int i2 = this.f11287 + 1;
        this.f11287 = i2;
        this.f11286++;
        c0972.f4464 = i2;
        c0972.f4453 = 1;
        ((C0972[]) c0644.f3101)[i2] = c0972;
        return c0972;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final C1486 m4311() {
        Object obj;
        C0644 c0644 = this.f11277;
        C1135 c1135 = (C1135) c0644.f3099;
        int i = c1135.f5215;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c1135.f5214;
            obj = objArr[i2];
            objArr[i2] = null;
            c1135.f5215 = i2;
        } else {
            obj = null;
        }
        C1486 c1486 = (C1486) obj;
        if (c1486 == null) {
            return new C1486(c0644);
        }
        c1486.f7026 = null;
        c1486.f7029.m4244();
        c1486.f7027 = 0.0f;
        c1486.f7025 = false;
        return c1486;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C0972 m4312(int i) {
        if (this.f11286 + 1 >= this.f11289) {
            m4305();
        }
        C0972 c0972M4303 = m4303(4);
        float[] fArr = c0972M4303.f4461;
        int i2 = this.f11287 + 1;
        this.f11287 = i2;
        this.f11286++;
        c0972M4303.f4464 = i2;
        c0972M4303.f4463 = i;
        ((C0972[]) this.f11277.f3101)[i2] = c0972M4303;
        C2020 c2020 = this.f11290;
        c2020.f10088.f812 = c0972M4303;
        Arrays.fill(fArr, 0.0f);
        fArr[c0972M4303.f4463] = 1.0f;
        c2020.m3897(c0972M4303);
        return c0972M4303;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final void m4313() {
        for (int i = 0; i < this.f11284; i++) {
            C1486 c1486 = this.f11283[i];
            if (c1486 != null) {
                ((C1135) this.f11277.f3099).m2327(c1486);
            }
            this.f11283[i] = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4314(C1486 c1486) {
        boolean z;
        boolean z2;
        C0972 c0972;
        C0972 c0972M2987;
        if (this.f11284 + 1 >= this.f11285 || this.f11286 + 1 >= this.f11289) {
            m4305();
        }
        if (c1486.f7025) {
            z = false;
        } else {
            ArrayList arrayList = c1486.f7028;
            if (this.f11283.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iM4248 = c1486.f7029.m4248();
                    for (int i = 0; i < iM4248; i++) {
                        C0972 c0972M4242 = c1486.f7029.m4242(i);
                        if (c0972M4242.f4457 != -1 || c0972M4242.f4454) {
                            arrayList.add(c0972M4242);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0972 c09722 = (C0972) arrayList.get(i2);
                            if (c09722.f4454) {
                                c1486.m2980(this, c09722, true);
                            } else {
                                c1486.mo2981(this, this.f11283[c09722.f4457], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (c1486.f7026 != null && c1486.f7029.m4248() == 0) {
                    c1486.f7025 = true;
                    this.f11282 = true;
                }
            }
            if (c1486.mo2982()) {
                return;
            }
            float f = c1486.f7027;
            float f2 = 0.0f;
            if (f < 0.0f) {
                c1486.f7027 = f * (-1.0f);
                C2244 c2244 = c1486.f7029;
                int i3 = c2244.f11074;
                for (int i4 = 0; i3 != -1 && i4 < c2244.f11077; i4++) {
                    float[] fArr = c2244.f11079;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c2244.f11082[i3];
                }
            }
            int iM42482 = c1486.f7029.m4248();
            float f3 = 0.0f;
            float f4 = 0.0f;
            C0972 c09723 = null;
            C0972 c09724 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iM42482) {
                float fM4247 = c1486.f7029.m4247(i5);
                C0972 c0972M42422 = c1486.f7029.m4242(i5);
                float f5 = f2;
                if (c0972M42422.f4453 == 1) {
                    if (c09723 == null) {
                        z4 = c0972M42422.f4455 <= 1;
                    } else if (f3 > fM4247) {
                        if (c0972M42422.f4455 <= 1) {
                        }
                    } else if (z4 || c0972M42422.f4455 > 1) {
                    }
                    c09723 = c0972M42422;
                    f3 = fM4247;
                } else if (c09723 == null && fM4247 < f5) {
                    if (c09724 == null) {
                        z5 = c0972M42422.f4455 <= 1;
                    } else if (f4 > fM4247) {
                        if (c0972M42422.f4455 <= 1) {
                        }
                    } else if (z5 || c0972M42422.f4455 > 1) {
                    }
                    c09724 = c0972M42422;
                    f4 = fM4247;
                }
                i5++;
                f2 = f5;
            }
            float f6 = f2;
            if (c09723 == null) {
                c09723 = c09724;
            }
            if (c09723 == null) {
                z2 = true;
            } else {
                c1486.m2985(c09723);
                z2 = false;
            }
            if (c1486.f7029.m4248() == 0) {
                c1486.f7025 = true;
            }
            if (z2) {
                if (this.f11286 + 1 >= this.f11289) {
                    m4305();
                }
                C0972 c0972M4303 = m4303(3);
                int i6 = this.f11287 + 1;
                this.f11287 = i6;
                this.f11286++;
                c0972M4303.f4464 = i6;
                C0644 c0644 = this.f11277;
                ((C0972[]) c0644.f3101)[i6] = c0972M4303;
                c1486.f7026 = c0972M4303;
                int i7 = this.f11284;
                m4299(c1486);
                if (this.f11284 == i7 + 1) {
                    C1486 c14862 = this.f11288;
                    c14862.f7026 = null;
                    c14862.f7029.m4244();
                    for (int i8 = 0; i8 < c1486.f7029.m4248(); i8++) {
                        c14862.f7029.m4243(c1486.f7029.m4242(i8), c1486.f7029.m4247(i8), true);
                    }
                    m4306(this.f11288);
                    if (c0972M4303.f4457 == -1) {
                        if (c1486.f7026 == c0972M4303 && (c0972M2987 = c1486.m2987(null, c0972M4303)) != null) {
                            c1486.m2985(c0972M2987);
                        }
                        if (!c1486.f7025) {
                            c1486.f7026.m2110(this, c1486);
                        }
                        ((C1135) c0644.f3099).m2327(c1486);
                        this.f11284--;
                    }
                    z = true;
                }
                c0972 = c1486.f7026;
                if (c0972 != null) {
                }
            } else {
                z = false;
                c0972 = c1486.f7026;
                if (c0972 != null) {
                    return;
                }
                if (c0972.f4453 != 1 && c1486.f7027 < f6) {
                    return;
                }
            }
        }
        if (z) {
            return;
        }
        m4299(c1486);
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m4315() {
        C2020 c2020 = this.f11290;
        if (c2020.mo2982()) {
            m4301();
            return;
        }
        if (!this.f11276) {
            m4308(c2020);
            return;
        }
        for (int i = 0; i < this.f11284; i++) {
            if (!this.f11283[i].f7025) {
                m4308(c2020);
                return;
            }
        }
        m4301();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m4316(C0972 c0972, C0972 c09722, int i, int i2) {
        C1486 c1486M4311 = m4311();
        C0972 c0972M4300 = m4300();
        c0972M4300.f4463 = 0;
        c1486M4311.m2984(c0972, c09722, c0972M4300, i);
        if (i2 != 8) {
            c1486M4311.f7029.m4245(m4312(i2), (int) (c1486M4311.f7029.m4246(c0972M4300) * (-1.0f)));
        }
        m4314(c1486M4311);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m4317(C0972 c0972, int i) {
        int i2 = c0972.f4457;
        if (i2 == -1) {
            c0972.m2114(this, i);
            for (int i3 = 0; i3 < this.f11287 + 1; i3++) {
                C0972 c09722 = ((C0972[]) this.f11277.f3101)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C1486 c1486M4311 = m4311();
            c1486M4311.f7026 = c0972;
            float f = i;
            c0972.f4458 = f;
            c1486M4311.f7027 = f;
            c1486M4311.f7025 = true;
            m4314(c1486M4311);
            return;
        }
        C1486 c1486 = this.f11283[i2];
        if (c1486.f7025) {
            c1486.f7027 = i;
            return;
        }
        if (c1486.f7029.m4248() == 0) {
            c1486.f7025 = true;
            c1486.f7027 = i;
            return;
        }
        C1486 c1486M43112 = m4311();
        if (i < 0) {
            c1486M43112.f7027 = i * (-1);
            c1486M43112.f7029.m4245(c0972, 1.0f);
        } else {
            c1486M43112.f7027 = i;
            c1486M43112.f7029.m4245(c0972, -1.0f);
        }
        m4314(c1486M43112);
    }
}
