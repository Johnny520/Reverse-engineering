package p222;

import androidx.constraintlayout.core.SolverVariable$Type;
import androidx.core.util.C3018;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p209.C8657;
import p219.C8710;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8740 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean f22242 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8739 f22245;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C8657 f22250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C8741 f22252;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f22248 = DescriptorProtos$Edition.EDITION_2023_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f22247 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f22246 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f22244 = 32;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f22243 = 32;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f22253 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean[] f22257 = new boolean[32];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f22258 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f22255 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f22256 = 32;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C8738[] f22249 = new C8738[DescriptorProtos$Edition.EDITION_2023_VALUE];

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f22251 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C8741[] f22254 = new C8741[32];

    public C8740() {
        m13942();
        C8657 c8657 = new C8657();
        c8657.f21713 = new C3018();
        c8657.f21711 = new C3018();
        c8657.f21712 = new C8738[32];
        this.f22250 = c8657;
        C8739 c8739 = new C8739(c8657);
        c8739.f22238 = new C8738[128];
        c8739.f22240 = new C8738[128];
        c8739.f22239 = 0;
        c8739.f22241 = new C5703(c8739, 25);
        this.f22245 = c8739;
        this.f22252 = new C8741(c8657);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static int m13934(Object obj) {
        C8738 c8738 = ((C8710) obj).f22113;
        if (c8738 != null) {
            return (int) (c8738.f22229 + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13935(C8738 c8738, C8738 c87382, int i, int i2) {
        C8741 c8741M13951 = m13951();
        C8738 c8738M13943 = m13943();
        c8738M13943.f22230 = 0;
        c8741M13951.m13956(c8738, c87382, c8738M13943, i);
        if (i2 != 8) {
            c8741M13951.f22260.m13967(m13953(i2), (int) (c8741M13951.f22260.m13963(c8738M13943) * (-1.0f)));
        }
        m13938(c8741M13951);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13936(C8738 c8738, C8738 c87382, int i, int i2) {
        if (i2 == 8 && c87382.f22233 && c8738.f22236 == -1) {
            c8738.m13925(this, c87382.f22229 + i);
            return;
        }
        C8741 c8741M13951 = m13951();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c8741M13951.f22262 = i;
        }
        C8742 c8742 = c8741M13951.f22260;
        if (z) {
            c8742.m13967(c8738, 1.0f);
            c8741M13951.f22260.m13967(c87382, -1.0f);
        } else {
            c8742.m13967(c8738, -1.0f);
            c8741M13951.f22260.m13967(c87382, 1.0f);
        }
        if (i2 != 8) {
            c8741M13951.m13957(this, i2);
        }
        m13938(c8741M13951);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13937(C8738 c8738, int i) {
        int i2 = c8738.f22236;
        if (i2 == -1) {
            c8738.m13925(this, i);
            for (int i3 = 0; i3 < this.f22246 + 1; i3++) {
                C8738 c87382 = ((C8738[]) this.f22250.f21712)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C8741 c8741M13951 = m13951();
            c8741M13951.f22263 = c8738;
            float f = i;
            c8738.f22229 = f;
            c8741M13951.f22262 = f;
            c8741M13951.f22259 = true;
            m13938(c8741M13951);
            return;
        }
        C8741 c8741 = this.f22254[i2];
        if (c8741.f22259) {
            c8741.f22262 = i;
            return;
        }
        if (c8741.f22260.m13962() == 0) {
            c8741.f22259 = true;
            c8741.f22262 = i;
            return;
        }
        C8741 c8741M139512 = m13951();
        if (i < 0) {
            c8741M139512.f22262 = i * (-1);
            c8741M139512.f22260.m13967(c8738, 1.0f);
        } else {
            c8741M139512.f22262 = i;
            c8741M139512.f22260.m13967(c8738, -1.0f);
        }
        m13938(c8741M139512);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13938(C8741 c8741) {
        boolean z;
        boolean z2;
        C8738 c8738;
        C8738 c8738M13954;
        boolean z3 = true;
        if (this.f22255 + 1 >= this.f22256 || this.f22258 + 1 >= this.f22243) {
            m13946();
        }
        if (c8741.f22259) {
            z = false;
        } else {
            ArrayList arrayList = c8741.f22261;
            if (this.f22254.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int iM13962 = c8741.f22260.m13962();
                    for (int i = 0; i < iM13962; i++) {
                        C8738 c8738M13961 = c8741.f22260.m13961(i);
                        if (c8738M13961.f22236 != -1 || c8738M13961.f22233) {
                            arrayList.add(c8738M13961);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C8738 c87382 = (C8738) arrayList.get(i2);
                            if (c87382.f22233) {
                                c8741.m13958(this, c87382, true);
                            } else {
                                c8741.mo13932(this, this.f22254[c87382.f22236], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c8741.f22263 != null && c8741.f22260.m13962() == 0) {
                    c8741.f22259 = true;
                    this.f22247 = true;
                }
            }
            if (c8741.mo13929()) {
                return;
            }
            float f = c8741.f22262;
            float f2 = 0.0f;
            if (f < 0.0f) {
                c8741.f22262 = f * (-1.0f);
                C8742 c8742 = c8741.f22260;
                int i3 = c8742.f22270;
                for (int i4 = 0; i3 != -1 && i4 < c8742.f22269; i4++) {
                    float[] fArr = c8742.f22271;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c8742.f22264[i3];
                }
            }
            int iM139622 = c8741.f22260.m13962();
            float f3 = 0.0f;
            float f4 = 0.0f;
            C8738 c87383 = null;
            C8738 c87384 = null;
            int i5 = 0;
            boolean z5 = false;
            boolean z6 = false;
            while (i5 < iM139622) {
                float fM13960 = c8741.f22260.m13960(i5);
                C8738 c8738M139612 = c8741.f22260.m13961(i5);
                float f5 = f2;
                if (c8738M139612.f22232 == SolverVariable$Type.UNRESTRICTED) {
                    if (c87383 == null) {
                        z5 = c8738M139612.f22226 <= 1;
                    } else if (f3 > fM13960) {
                        if (c8738M139612.f22226 <= 1) {
                        }
                    } else if (z5 || c8738M139612.f22226 > 1) {
                    }
                    c87383 = c8738M139612;
                    f3 = fM13960;
                } else if (c87383 == null && fM13960 < f5) {
                    if (c87384 == null) {
                        z6 = c8738M139612.f22226 <= 1;
                    } else if (f4 > fM13960) {
                        if (c8738M139612.f22226 <= 1) {
                        }
                    } else if (z6 || c8738M139612.f22226 > 1) {
                    }
                    c87384 = c8738M139612;
                    f4 = fM13960;
                }
                i5++;
                f2 = f5;
            }
            float f6 = f2;
            if (c87383 == null) {
                c87383 = c87384;
            }
            if (c87383 == null) {
                z2 = true;
            } else {
                c8741.m13959(c87383);
                z2 = false;
            }
            if (c8741.f22260.m13962() == 0) {
                c8741.f22259 = true;
            }
            if (z2) {
                if (this.f22258 + 1 >= this.f22243) {
                    m13946();
                }
                C8738 c8738M13940 = m13940(SolverVariable$Type.SLACK);
                int i6 = this.f22246 + 1;
                this.f22246 = i6;
                this.f22258++;
                c8738M13940.f22235 = i6;
                C8657 c8657 = this.f22250;
                ((C8738[]) c8657.f21712)[i6] = c8738M13940;
                c8741.f22263 = c8738M13940;
                int i7 = this.f22255;
                m13948(c8741);
                if (this.f22255 == i7 + 1) {
                    C8741 c87412 = this.f22252;
                    c87412.f22263 = null;
                    c87412.f22260.m13964();
                    for (int i8 = 0; i8 < c8741.f22260.m13962(); i8++) {
                        c87412.f22260.m13965(c8741.f22260.m13961(i8), c8741.f22260.m13960(i8), true);
                    }
                    m13945(this.f22252);
                    if (c8738M13940.f22236 == -1) {
                        if (c8741.f22263 == c8738M13940 && (c8738M13954 = c8741.m13954(null, c8738M13940)) != null) {
                            c8741.m13959(c8738M13954);
                        }
                        if (!c8741.f22259) {
                            c8741.f22263.m13924(this, c8741);
                        }
                        ((C3018) c8657.f21713).m4550(c8741);
                        this.f22255--;
                    }
                }
                c8738 = c8741.f22263;
                if (c8738 != null) {
                }
            } else {
                z3 = false;
                c8738 = c8741.f22263;
                if (c8738 != null) {
                    return;
                }
                if (c8738.f22232 != SolverVariable$Type.UNRESTRICTED && c8741.f22262 < f6) {
                    return;
                } else {
                    z = z3;
                }
            }
        }
        if (z) {
            return;
        }
        m13948(c8741);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13939(C8738 c8738, C8738 c87382, int i, float f, C8738 c87383, C8738 c87384, int i2, int i3) {
        C8741 c8741M13951 = m13951();
        if (c87382 == c87383) {
            c8741M13951.f22260.m13967(c8738, 1.0f);
            c8741M13951.f22260.m13967(c87384, 1.0f);
            c8741M13951.f22260.m13967(c87382, -2.0f);
        } else {
            C8742 c8742 = c8741M13951.f22260;
            if (f == 0.5f) {
                c8742.m13967(c8738, 1.0f);
                c8741M13951.f22260.m13967(c87382, -1.0f);
                c8741M13951.f22260.m13967(c87383, -1.0f);
                c8741M13951.f22260.m13967(c87384, 1.0f);
                if (i > 0 || i2 > 0) {
                    c8741M13951.f22262 = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                c8742.m13967(c8738, -1.0f);
                c8741M13951.f22260.m13967(c87382, 1.0f);
                c8741M13951.f22262 = i;
            } else if (f >= 1.0f) {
                c8742.m13967(c87384, -1.0f);
                c8741M13951.f22260.m13967(c87383, 1.0f);
                c8741M13951.f22262 = -i2;
            } else {
                float f2 = 1.0f - f;
                c8742.m13967(c8738, f2 * 1.0f);
                c8741M13951.f22260.m13967(c87382, f2 * (-1.0f));
                c8741M13951.f22260.m13967(c87383, (-1.0f) * f);
                c8741M13951.f22260.m13967(c87384, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    c8741M13951.f22262 = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            c8741M13951.m13957(this, i3);
        }
        m13938(c8741M13951);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8738 m13940(SolverVariable$Type solverVariable$Type) {
        C3018 c3018 = (C3018) this.f22250.f21711;
        int i = c3018.f6802;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c3018.f6803;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            c3018.f6802 = i2;
            obj = obj2;
        }
        C8738 c8738 = (C8738) obj;
        if (c8738 == null) {
            c8738 = new C8738(solverVariable$Type);
            c8738.f22232 = solverVariable$Type;
        } else {
            c8738.m13926();
            c8738.f22232 = solverVariable$Type;
        }
        int i3 = this.f22251;
        int i4 = this.f22248;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.f22248 = i5;
            this.f22249 = (C8738[]) Arrays.copyOf(this.f22249, i5);
        }
        C8738[] c8738Arr = this.f22249;
        int i6 = this.f22251;
        this.f22251 = i6 + 1;
        c8738Arr[i6] = c8738;
        return c8738;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m13941() {
        C8657 c8657;
        int i = 0;
        while (true) {
            c8657 = this.f22250;
            C8738[] c8738Arr = (C8738[]) c8657.f21712;
            if (i >= c8738Arr.length) {
                break;
            }
            C8738 c8738 = c8738Arr[i];
            if (c8738 != null) {
                c8738.m13926();
            }
            i++;
        }
        C3018 c3018 = (C3018) c8657.f21711;
        C8738[] c8738Arr2 = this.f22249;
        int length = this.f22251;
        c3018.getClass();
        if (length > c8738Arr2.length) {
            length = c8738Arr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C8738 c87382 = c8738Arr2[i2];
            int i3 = c3018.f6802;
            Object[] objArr = c3018.f6803;
            if (i3 < objArr.length) {
                objArr[i3] = c87382;
                c3018.f6802 = i3 + 1;
            }
        }
        this.f22251 = 0;
        Arrays.fill((C8738[]) c8657.f21712, (Object) null);
        this.f22246 = 0;
        C8739 c8739 = this.f22245;
        c8739.f22239 = 0;
        c8739.f22262 = 0.0f;
        this.f22258 = 1;
        for (int i4 = 0; i4 < this.f22255; i4++) {
            C8741 c8741 = this.f22254[i4];
        }
        m13942();
        this.f22255 = 0;
        this.f22252 = new C8741(c8657);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13942() {
        for (int i = 0; i < this.f22255; i++) {
            C8741 c8741 = this.f22254[i];
            if (c8741 != null) {
                ((C3018) this.f22250.f21713).m4550(c8741);
            }
            this.f22254[i] = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C8738 m13943() {
        if (this.f22258 + 1 >= this.f22243) {
            m13946();
        }
        C8738 c8738M13940 = m13940(SolverVariable$Type.SLACK);
        int i = this.f22246 + 1;
        this.f22246 = i;
        this.f22258++;
        c8738M13940.f22235 = i;
        ((C8738[]) this.f22250.f21712)[i] = c8738M13940;
        return c8738M13940;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m13944(C8739 c8739) {
        int i = 0;
        while (true) {
            if (i >= this.f22255) {
                break;
            }
            C8741 c8741 = this.f22254[i];
            if (c8741.f22263.f22232 != SolverVariable$Type.UNRESTRICTED) {
                float f = 0.0f;
                if (c8741.f22262 < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.f22255) {
                            C8741 c87412 = this.f22254[i5];
                            if (c87412.f22263.f22232 != SolverVariable$Type.UNRESTRICTED && !c87412.f22259 && c87412.f22262 < f) {
                                int iM13962 = c87412.f22260.m13962();
                                int i7 = 0;
                                while (i7 < iM13962) {
                                    C8738 c8738M13961 = c87412.f22260.m13961(i7);
                                    float fM13963 = c87412.f22260.m13963(c8738M13961);
                                    if (fM13963 > f) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f3 = c8738M13961.f22234[i8] / fM13963;
                                            if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i4 = c8738M13961.f22235;
                                                i3 = i5;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            C8741 c87413 = this.f22254[i3];
                            c87413.f22263.f22236 = -1;
                            c87413.m13959(((C8738[]) this.f22250.f21712)[i4]);
                            C8738 c8738 = c87413.f22263;
                            c8738.f22236 = i3;
                            c8738.m13924(this, c87413);
                        } else {
                            z = true;
                        }
                        if (i2 > this.f22258 / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        m13945(c8739);
        m13952();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0093 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13945(C8741 c8741) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.f22258; i2++) {
            this.f22257[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f22258 * 2) {
                return;
            }
            C8738 c8738 = c8741.f22263;
            if (c8738 != null) {
                this.f22257[c8738.f22235] = true;
            }
            C8738 c8738Mo13930 = c8741.mo13930(this.f22257);
            if (c8738Mo13930 != null) {
                boolean[] zArr = this.f22257;
                int i4 = c8738Mo13930.f22235;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (c8738Mo13930 != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.f22255) {
                    C8741 c87412 = this.f22254[i5];
                    if (c87412.f22263.f22232 != SolverVariable$Type.UNRESTRICTED && !c87412.f22259) {
                        C8742 c8742 = c87412.f22260;
                        int i7 = c8742.f22270;
                        if (i7 == -1) {
                            z = false;
                            if (!z) {
                                float fM13963 = c87412.f22260.m13963(c8738Mo13930);
                                if (fM13963 < 0.0f) {
                                    float f2 = (-c87412.f22262) / fM13963;
                                    if (f2 < f) {
                                        i6 = i5;
                                        f = f2;
                                    }
                                }
                            }
                        } else {
                            for (int i8 = i; i7 != -1 && i8 < c8742.f22269; i8++) {
                                if (c8742.f22265[i7] == c8738Mo13930.f22235) {
                                    z = true;
                                    break;
                                }
                                i7 = c8742.f22264[i7];
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
                    C8741 c87413 = this.f22254[i6];
                    c87413.f22263.f22236 = -1;
                    c87413.m13959(c8738Mo13930);
                    C8738 c87382 = c87413.f22263;
                    c87382.f22236 = i6;
                    c87382.m13924(this, c87413);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m13946() {
        int i = this.f22244 * 2;
        this.f22244 = i;
        this.f22254 = (C8741[]) Arrays.copyOf(this.f22254, i);
        C8657 c8657 = this.f22250;
        c8657.f21712 = (C8738[]) Arrays.copyOf((C8738[]) c8657.f21712, this.f22244);
        int i2 = this.f22244;
        this.f22257 = new boolean[i2];
        this.f22243 = i2;
        this.f22256 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m13947() {
        C8739 c8739 = this.f22245;
        if (c8739.mo13929()) {
            m13952();
            return;
        }
        if (!this.f22253) {
            m13944(c8739);
            return;
        }
        for (int i = 0; i < this.f22255; i++) {
            if (!this.f22254[i].f22259) {
                m13944(c8739);
                return;
            }
        }
        m13952();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13948(C8741 c8741) {
        int i;
        if (c8741.f22259) {
            c8741.f22263.m13925(this, c8741.f22262);
        } else {
            C8741[] c8741Arr = this.f22254;
            int i2 = this.f22255;
            c8741Arr[i2] = c8741;
            C8738 c8738 = c8741.f22263;
            c8738.f22236 = i2;
            this.f22255 = i2 + 1;
            c8738.m13924(this, c8741);
        }
        if (this.f22247) {
            int i3 = 0;
            while (i3 < this.f22255) {
                if (this.f22254[i3] == null) {
                    System.out.println("WTF");
                }
                C8741 c87412 = this.f22254[i3];
                if (c87412 != null && c87412.f22259) {
                    c87412.f22263.m13925(this, c87412.f22262);
                    ((C3018) this.f22250.f21713).m4550(c87412);
                    this.f22254[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f22255;
                        if (i4 >= i) {
                            break;
                        }
                        C8741[] c8741Arr2 = this.f22254;
                        int i6 = i4 - 1;
                        C8741 c87413 = c8741Arr2[i4];
                        c8741Arr2[i6] = c87413;
                        C8738 c87382 = c87413.f22263;
                        if (c87382.f22236 == i4) {
                            c87382.f22236 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f22254[i5] = null;
                    }
                    this.f22255 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f22247 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13949(C8738 c8738, C8738 c87382, int i, int i2) {
        C8741 c8741M13951 = m13951();
        C8738 c8738M13943 = m13943();
        c8738M13943.f22230 = 0;
        c8741M13951.m13955(c8738, c87382, c8738M13943, i);
        if (i2 != 8) {
            c8741M13951.f22260.m13967(m13953(i2), (int) (c8741M13951.f22260.m13963(c8738M13943) * (-1.0f)));
        }
        m13938(c8741M13951);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C8738 m13950(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f22258 + 1 >= this.f22243) {
            m13946();
        }
        if (!(obj instanceof C8710)) {
            return null;
        }
        C8710 c8710 = (C8710) obj;
        C8738 c8738 = c8710.f22113;
        if (c8738 == null) {
            c8710.m13850();
            c8738 = c8710.f22113;
        }
        int i = c8738.f22235;
        C8657 c8657 = this.f22250;
        if (i != -1 && i <= this.f22246 && ((C8738[]) c8657.f21712)[i] != null) {
            return c8738;
        }
        if (i != -1) {
            c8738.m13926();
        }
        int i2 = this.f22246 + 1;
        this.f22246 = i2;
        this.f22258++;
        c8738.f22235 = i2;
        c8738.f22232 = SolverVariable$Type.UNRESTRICTED;
        ((C8738[]) c8657.f21712)[i2] = c8738;
        return c8738;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C8741 m13951() {
        Object obj;
        C8657 c8657 = this.f22250;
        C3018 c3018 = (C3018) c8657.f21713;
        int i = c3018.f6802;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c3018.f6803;
            obj = objArr[i2];
            objArr[i2] = null;
            c3018.f6802 = i2;
        } else {
            obj = null;
        }
        C8741 c8741 = (C8741) obj;
        if (c8741 == null) {
            return new C8741(c8657);
        }
        c8741.f22263 = null;
        c8741.f22260.m13964();
        c8741.f22262 = 0.0f;
        c8741.f22259 = false;
        return c8741;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13952() {
        for (int i = 0; i < this.f22255; i++) {
            C8741 c8741 = this.f22254[i];
            c8741.f22263.f22229 = c8741.f22262;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C8738 m13953(int i) {
        if (this.f22258 + 1 >= this.f22243) {
            m13946();
        }
        C8738 c8738M13940 = m13940(SolverVariable$Type.ERROR);
        float[] fArr = c8738M13940.f22231;
        int i2 = this.f22246 + 1;
        this.f22246 = i2;
        this.f22258++;
        c8738M13940.f22235 = i2;
        c8738M13940.f22230 = i;
        ((C8738[]) this.f22250.f21712)[i2] = c8738M13940;
        C8739 c8739 = this.f22245;
        c8739.f22241.f14509 = c8738M13940;
        Arrays.fill(fArr, 0.0f);
        fArr[c8738M13940.f22230] = 1.0f;
        c8739.m13933(c8738M13940);
        return c8738M13940;
    }
}
