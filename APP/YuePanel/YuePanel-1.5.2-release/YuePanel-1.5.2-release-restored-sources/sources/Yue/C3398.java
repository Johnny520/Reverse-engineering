package Yue;

import Yue.C5714;
import Yue.C7503;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3398 implements C5714.InterfaceC0844 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean f5468 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean f5469 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public InterfaceC0129 f5472;

    /* JADX INFO: renamed from: ۥ */
    public C7503 f272 = null;

    /* JADX INFO: renamed from: ۥ۟ */
    public float f273 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f5470 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public ArrayList<C7503> f5471 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f5473 = false;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۨۥ$ۥ */
    public interface InterfaceC0129 {
        void clear();

        int getCurrentSize();

        /* JADX INFO: renamed from: ۥ */
        float mo477(C3398 c3398, boolean z);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo478();

        /* JADX INFO: renamed from: ۥ۟۟ */
        float mo6985(C7503 c7503, boolean z);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo6986(C7503 c7503, float f);

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        C7503 mo6987(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        void mo6988();

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        float mo6989(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        float mo6990(C7503 c7503);

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        boolean mo6991(C7503 c7503);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        void mo6992(C7503 c7503, float f, boolean z);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        int mo6993(C7503 c7503);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        int mo6994();

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        void mo6995(float f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3398() {
    }

    @Override // Yue.C5714.InterfaceC0844
    public void clear() {
        this.f5472.clear();
        this.f272 = null;
        this.f273 = 0.0f;
    }

    @Override // Yue.C5714.InterfaceC0844
    public C7503 getKey() {
        return this.f272;
    }

    @Override // Yue.C5714.InterfaceC0844
    public boolean isEmpty() {
        return this.f272 == null && this.f273 == 0.0f && this.f5472.getCurrentSize() == 0;
    }

    public String toString() {
        return m7042();
    }

    @Override // Yue.C5714.InterfaceC0844
    /* JADX INFO: renamed from: ۥ */
    public C7503 mo484(C5714 c5714, boolean[] zArr) {
        return m7038(zArr, null);
    }

    @Override // Yue.C5714.InterfaceC0844
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo485(C5714 c5714) {
        if (c5714.f14115.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int currentSize = this.f5472.getCurrentSize();
            for (int i = 0; i < currentSize; i++) {
                C7503 c7503Mo6987 = this.f5472.mo6987(i);
                if (c7503Mo6987.f22691 != -1 || c7503Mo6987.f22694 || c7503Mo6987.f22701) {
                    this.f5471.add(c7503Mo6987);
                }
            }
            int size = this.f5471.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    C7503 c7503 = this.f5471.get(i2);
                    if (c7503.f22694) {
                        mo7014(c5714, c7503, true);
                    } else if (c7503.f22701) {
                        m7043(c5714, c7503, true);
                    } else {
                        mo7015(c5714, c5714.f14115[c7503.f22691], true);
                    }
                }
                this.f5471.clear();
            } else {
                z = true;
            }
        }
        if (C5714.f14103 && this.f272 != null && this.f5472.getCurrentSize() == 0) {
            this.f5473 = true;
            c5714.f1629 = true;
        }
    }

    @Override // Yue.C5714.InterfaceC0844
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo7013(C7503 c7503) {
        int i = c7503.f22692;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f5472.mo6986(c7503, f);
    }

    @Override // Yue.C5714.InterfaceC0844
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo7014(C5714 c5714, C7503 c7503, boolean z) {
        if (c7503.f22694) {
            this.f273 += c7503.f22693 * this.f5472.mo6990(c7503);
            this.f5472.mo6985(c7503, z);
            if (z) {
                c7503.m23452(this);
            }
            if (C5714.f14103 && this.f5472.getCurrentSize() == 0) {
                this.f5473 = true;
                c5714.f1629 = true;
            }
        }
    }

    @Override // Yue.C5714.InterfaceC0844
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo7015(C5714 c5714, C3398 c3398, boolean z) {
        this.f273 += c3398.f273 * this.f5472.mo477(c3398, z);
        if (z) {
            c3398.f272.m23452(this);
        }
        if (C5714.f14103 && this.f272 != null && this.f5472.getCurrentSize() == 0) {
            this.f5473 = true;
            c5714.f1629 = true;
        }
    }

    @Override // Yue.C5714.InterfaceC0844
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo7016(C5714.InterfaceC0844 interfaceC0844) {
        if (interfaceC0844 instanceof C3398) {
            C3398 c3398 = (C3398) interfaceC0844;
            this.f272 = null;
            this.f5472.clear();
            for (int i = 0; i < c3398.f5472.getCurrentSize(); i++) {
                this.f5472.mo6992(c3398.f5472.mo6987(i), c3398.f5472.mo6989(i), true);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C3398 m7017(C5714 c5714, int i) {
        this.f5472.mo6986(c5714.m17636(i, "ep"), 1.0f);
        this.f5472.mo6986(c5714.m17636(i, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C3398 m7018(C7503 c7503, int i) {
        this.f5472.mo6986(c7503, i);
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m7019(C5714 c5714) {
        boolean z;
        C7503 c7503M7020 = m7020(c5714);
        if (c7503M7020 == null) {
            z = true;
        } else {
            m7039(c7503M7020);
            z = false;
        }
        if (this.f5472.getCurrentSize() == 0) {
            this.f5473 = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public C7503 m7020(C5714 c5714) {
        int currentSize = this.f5472.getCurrentSize();
        C7503 c7503 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        C7503 c75032 = null;
        for (int i = 0; i < currentSize; i++) {
            float fMo6989 = this.f5472.mo6989(i);
            C7503 c7503Mo6987 = this.f5472.mo6987(i);
            if (c7503Mo6987.f22697 == C7503.EnumC1281.UNRESTRICTED) {
                if (c7503 == null || f > fMo6989) {
                    boolean zM7036 = m7036(c7503Mo6987, c5714);
                    z = zM7036;
                    f = fMo6989;
                    c7503 = c7503Mo6987;
                } else if (!z && m7036(c7503Mo6987, c5714)) {
                    f = fMo6989;
                    c7503 = c7503Mo6987;
                    z = true;
                }
            } else if (c7503 == null && fMo6989 < 0.0f) {
                if (c75032 == null || f2 > fMo6989) {
                    boolean zM70362 = m7036(c7503Mo6987, c5714);
                    z2 = zM70362;
                    f2 = fMo6989;
                    c75032 = c7503Mo6987;
                } else if (!z2 && m7036(c7503Mo6987, c5714)) {
                    f2 = fMo6989;
                    c75032 = c7503Mo6987;
                    z2 = true;
                }
            }
        }
        return c7503 != null ? c7503 : c75032;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C3398 m7021(C7503 c7503, C7503 c75032, int i, float f, C7503 c75033, C7503 c75034, int i2) {
        if (c75032 == c75033) {
            this.f5472.mo6986(c7503, 1.0f);
            this.f5472.mo6986(c75034, 1.0f);
            this.f5472.mo6986(c75032, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f5472.mo6986(c7503, 1.0f);
            this.f5472.mo6986(c75032, -1.0f);
            this.f5472.mo6986(c75033, -1.0f);
            this.f5472.mo6986(c75034, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f273 = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.f5472.mo6986(c7503, -1.0f);
            this.f5472.mo6986(c75032, 1.0f);
            this.f273 = i;
        } else if (f >= 1.0f) {
            this.f5472.mo6986(c75034, -1.0f);
            this.f5472.mo6986(c75033, 1.0f);
            this.f273 = -i2;
        } else {
            float f2 = 1.0f - f;
            this.f5472.mo6986(c7503, f2 * 1.0f);
            this.f5472.mo6986(c75032, f2 * (-1.0f));
            this.f5472.mo6986(c75033, (-1.0f) * f);
            this.f5472.mo6986(c75034, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f273 = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C3398 m7022(C7503 c7503, int i) {
        this.f272 = c7503;
        float f = i;
        c7503.f22693 = f;
        this.f273 = f;
        this.f5473 = true;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C3398 m7023(C7503 c7503, C7503 c75032, float f) {
        this.f5472.mo6986(c7503, -1.0f);
        this.f5472.mo6986(c75032, f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C3398 m7024(C7503 c7503, C7503 c75032, C7503 c75033, C7503 c75034, float f) {
        this.f5472.mo6986(c7503, -1.0f);
        this.f5472.mo6986(c75032, 1.0f);
        this.f5472.mo6986(c75033, f);
        this.f5472.mo6986(c75034, -f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C3398 m7025(float f, float f2, float f3, C7503 c7503, int i, C7503 c75032, int i2, C7503 c75033, int i3, C7503 c75034, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f273 = ((-i) - i2) + i3 + i4;
            this.f5472.mo6986(c7503, 1.0f);
            this.f5472.mo6986(c75032, -1.0f);
            this.f5472.mo6986(c75034, 1.0f);
            this.f5472.mo6986(c75033, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f273 = ((-i) - i2) + (i3 * f4) + (i4 * f4);
            this.f5472.mo6986(c7503, 1.0f);
            this.f5472.mo6986(c75032, -1.0f);
            this.f5472.mo6986(c75034, f4);
            this.f5472.mo6986(c75033, -f4);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public C3398 m7026(float f, float f2, float f3, C7503 c7503, C7503 c75032, C7503 c75033, C7503 c75034) {
        this.f273 = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f5472.mo6986(c7503, 1.0f);
            this.f5472.mo6986(c75032, -1.0f);
            this.f5472.mo6986(c75034, 1.0f);
            this.f5472.mo6986(c75033, -1.0f);
        } else if (f == 0.0f) {
            this.f5472.mo6986(c7503, 1.0f);
            this.f5472.mo6986(c75032, -1.0f);
        } else if (f3 == 0.0f) {
            this.f5472.mo6986(c75033, 1.0f);
            this.f5472.mo6986(c75034, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f5472.mo6986(c7503, 1.0f);
            this.f5472.mo6986(c75032, -1.0f);
            this.f5472.mo6986(c75034, f4);
            this.f5472.mo6986(c75033, -f4);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C3398 m7027(C7503 c7503, int i) {
        if (i < 0) {
            this.f273 = i * (-1);
            this.f5472.mo6986(c7503, 1.0f);
        } else {
            this.f273 = i;
            this.f5472.mo6986(c7503, -1.0f);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public C3398 m7028(C7503 c7503, C7503 c75032, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f273 = i;
        }
        if (z) {
            this.f5472.mo6986(c7503, 1.0f);
            this.f5472.mo6986(c75032, -1.0f);
        } else {
            this.f5472.mo6986(c7503, -1.0f);
            this.f5472.mo6986(c75032, 1.0f);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public C3398 m7029(C7503 c7503, int i, C7503 c75032) {
        this.f273 = i;
        this.f5472.mo6986(c7503, -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C3398 m7030(C7503 c7503, C7503 c75032, C7503 c75033, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f273 = i;
        }
        if (z) {
            this.f5472.mo6986(c7503, 1.0f);
            this.f5472.mo6986(c75032, -1.0f);
            this.f5472.mo6986(c75033, -1.0f);
        } else {
            this.f5472.mo6986(c7503, -1.0f);
            this.f5472.mo6986(c75032, 1.0f);
            this.f5472.mo6986(c75033, 1.0f);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public C3398 m7031(C7503 c7503, C7503 c75032, C7503 c75033, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f273 = i;
        }
        if (z) {
            this.f5472.mo6986(c7503, 1.0f);
            this.f5472.mo6986(c75032, -1.0f);
            this.f5472.mo6986(c75033, 1.0f);
        } else {
            this.f5472.mo6986(c7503, -1.0f);
            this.f5472.mo6986(c75032, 1.0f);
            this.f5472.mo6986(c75033, -1.0f);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C3398 m7032(C7503 c7503, C7503 c75032, C7503 c75033, C7503 c75034, float f) {
        this.f5472.mo6986(c75033, 0.5f);
        this.f5472.mo6986(c75034, 0.5f);
        this.f5472.mo6986(c7503, -0.5f);
        this.f5472.mo6986(c75032, -0.5f);
        this.f273 = -f;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m7033() {
        float f = this.f273;
        if (f < 0.0f) {
            this.f273 = f * (-1.0f);
            this.f5472.mo6988();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m7034() {
        C7503 c7503 = this.f272;
        return c7503 != null && (c7503.f22697 == C7503.EnumC1281.UNRESTRICTED || this.f273 >= 0.0f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean m7035(C7503 c7503) {
        return this.f5472.mo6991(c7503);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final boolean m7036(C7503 c7503, C5714 c5714) {
        return c7503.f22700 <= 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public C7503 m7037(C7503 c7503) {
        return m7038(null, c7503);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final C7503 m7038(boolean[] zArr, C7503 c7503) {
        C7503.EnumC1281 enumC1281;
        int currentSize = this.f5472.getCurrentSize();
        C7503 c75032 = null;
        float f = 0.0f;
        for (int i = 0; i < currentSize; i++) {
            float fMo6989 = this.f5472.mo6989(i);
            if (fMo6989 < 0.0f) {
                C7503 c7503Mo6987 = this.f5472.mo6987(i);
                if ((zArr == null || !zArr[c7503Mo6987.f22690]) && c7503Mo6987 != c7503 && (((enumC1281 = c7503Mo6987.f22697) == C7503.EnumC1281.SLACK || enumC1281 == C7503.EnumC1281.ERROR) && fMo6989 < f)) {
                    f = fMo6989;
                    c75032 = c7503Mo6987;
                }
            }
        }
        return c75032;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m7039(C7503 c7503) {
        C7503 c75032 = this.f272;
        if (c75032 != null) {
            this.f5472.mo6986(c75032, -1.0f);
            this.f272.f22691 = -1;
            this.f272 = null;
        }
        float fMo6985 = this.f5472.mo6985(c7503, true) * (-1.0f);
        this.f272 = c7503;
        if (fMo6985 == 1.0f) {
            return;
        }
        this.f273 /= fMo6985;
        this.f5472.mo6995(fMo6985);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m7040() {
        this.f272 = null;
        this.f5472.clear();
        this.f273 = 0.0f;
        this.f5473 = false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int m7041() {
        return (this.f272 != null ? 4 : 0) + 8 + this.f5472.mo6994();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m7042() {
        boolean z;
        String str = (this.f272 == null ? "0" : "" + this.f272) + " = ";
        if (this.f273 != 0.0f) {
            str = str + this.f273;
            z = true;
        } else {
            z = false;
        }
        int currentSize = this.f5472.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            C7503 c7503Mo6987 = this.f5472.mo6987(i);
            if (c7503Mo6987 != null) {
                float fMo6989 = this.f5472.mo6989(i);
                if (fMo6989 != 0.0f) {
                    String string = c7503Mo6987.toString();
                    if (!z) {
                        if (fMo6989 < 0.0f) {
                            str = str + "- ";
                            fMo6989 *= -1.0f;
                        }
                        str = fMo6989 == 1.0f ? str + string : str + fMo6989 + " " + string;
                        z = true;
                    } else if (fMo6989 > 0.0f) {
                        str = str + " + ";
                        if (fMo6989 == 1.0f) {
                        }
                        z = true;
                    } else {
                        str = str + " - ";
                        fMo6989 *= -1.0f;
                        if (fMo6989 == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return str;
        }
        return str + "0.0";
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m7043(C5714 c5714, C7503 c7503, boolean z) {
        if (c7503.f22701) {
            float fMo6990 = this.f5472.mo6990(c7503);
            this.f273 += c7503.f22703 * fMo6990;
            this.f5472.mo6985(c7503, z);
            if (z) {
                c7503.m23452(this);
            }
            this.f5472.mo6992(c5714.f14122.f6412[c7503.f22702], fMo6990, z);
            if (C5714.f14103 && this.f5472.getCurrentSize() == 0) {
                this.f5473 = true;
                c5714.f1629 = true;
            }
        }
    }

    public C3398(C3639 c3639) {
        this.f5472 = new C3392(this, c3639);
    }
}
