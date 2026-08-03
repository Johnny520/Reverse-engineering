package Yue;

import Yue.C3398;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7504 implements C3398.InterfaceC0129 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final boolean f22711 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final boolean f22712 = true;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static float f22713 = 0.001f;

    /* JADX INFO: renamed from: ۥ */
    public final int f2919 = -1;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f2920 = 16;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f22714 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int[] f22715 = new int[16];

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int[] f22716 = new int[16];

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int[] f22717 = new int[16];

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float[] f22718 = new float[16];

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int[] f22719 = new int[16];

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int[] f22720 = new int[16];

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f22721 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int f22722 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final C3398 f22723;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final C3639 f22724;

    public C7504(C3398 c3398, C3639 c3639) {
        this.f22723 = c3398;
        this.f22724 = c3639;
        clear();
    }

    @Override // Yue.C3398.InterfaceC0129
    public void clear() {
        int i = this.f22721;
        for (int i2 = 0; i2 < i; i2++) {
            C7503 c7503Mo6987 = mo6987(i2);
            if (c7503Mo6987 != null) {
                c7503Mo6987.m23452(this.f22723);
            }
        }
        for (int i3 = 0; i3 < this.f2920; i3++) {
            this.f22717[i3] = -1;
            this.f22716[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f22714; i4++) {
            this.f22715[i4] = -1;
        }
        this.f22721 = 0;
        this.f22722 = -1;
    }

    @Override // Yue.C3398.InterfaceC0129
    public int getCurrentSize() {
        return this.f22721;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i = this.f22721;
        for (int i2 = 0; i2 < i; i2++) {
            C7503 c7503Mo6987 = mo6987(i2);
            if (c7503Mo6987 != null) {
                String str2 = str + c7503Mo6987 + " = " + mo6989(i2) + " ";
                int iMo6993 = mo6993(c7503Mo6987);
                String str3 = str2 + "[p: ";
                String str4 = (this.f22719[iMo6993] != -1 ? str3 + this.f22724.f6412[this.f22717[this.f22719[iMo6993]]] : str3 + "none") + ", n: ";
                str = (this.f22720[iMo6993] != -1 ? str4 + this.f22724.f6412[this.f22717[this.f22720[iMo6993]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ */
    public float mo477(C3398 c3398, boolean z) {
        float fMo6990 = mo6990(c3398.f272);
        mo6985(c3398.f272, z);
        C7504 c7504 = (C7504) c3398.f5472;
        int currentSize = c7504.getCurrentSize();
        int i = 0;
        int i2 = 0;
        while (i < currentSize) {
            int i3 = c7504.f22717[i2];
            if (i3 != -1) {
                mo6992(this.f22724.f6412[i3], c7504.f22718[i2] * fMo6990, z);
                i++;
            }
            i2++;
        }
        return fMo6990;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo478() {
        int i = this.f22721;
        System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            C7503 c7503Mo6987 = mo6987(i2);
            if (c7503Mo6987 != null) {
                System.out.print(c7503Mo6987 + " = " + mo6989(i2) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟ */
    public float mo6985(C7503 c7503, boolean z) {
        int iMo6993 = mo6993(c7503);
        if (iMo6993 == -1) {
            return 0.0f;
        }
        m23466(c7503);
        float f = this.f22718[iMo6993];
        if (this.f22722 == iMo6993) {
            this.f22722 = this.f22720[iMo6993];
        }
        this.f22717[iMo6993] = -1;
        int[] iArr = this.f22719;
        int i = iArr[iMo6993];
        if (i != -1) {
            int[] iArr2 = this.f22720;
            iArr2[i] = iArr2[iMo6993];
        }
        int i2 = this.f22720[iMo6993];
        if (i2 != -1) {
            iArr[i2] = iArr[iMo6993];
        }
        this.f22721--;
        c7503.f22700--;
        if (z) {
            c7503.m23452(this.f22723);
        }
        return f;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo6986(C7503 c7503, float f) {
        float f2 = f22713;
        if (f > (-f2) && f < f2) {
            mo6985(c7503, true);
            return;
        }
        if (this.f22721 == 0) {
            m23461(0, c7503, f);
            m23460(c7503, 0);
            this.f22722 = 0;
            return;
        }
        int iMo6993 = mo6993(c7503);
        if (iMo6993 != -1) {
            this.f22718[iMo6993] = f;
            return;
        }
        if (this.f22721 + 1 >= this.f2920) {
            m23464();
        }
        int i = this.f22721;
        int i2 = this.f22722;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f22717[i2];
            int i6 = c7503.f22690;
            if (i5 == i6) {
                this.f22718[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.f22720[i2];
            if (i2 == -1) {
                break;
            }
        }
        m23465(i3, c7503, f);
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public C7503 mo6987(int i) {
        int i2 = this.f22721;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f22722;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f22724.f6412[this.f22717[i3]];
            }
            i3 = this.f22720[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo6988() {
        int i = this.f22721;
        int i2 = this.f22722;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f22718;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f22720[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public float mo6989(int i) {
        int i2 = this.f22721;
        int i3 = this.f22722;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f22718[i3];
            }
            i3 = this.f22720[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public float mo6990(C7503 c7503) {
        int iMo6993 = mo6993(c7503);
        if (iMo6993 != -1) {
            return this.f22718[iMo6993];
        }
        return 0.0f;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo6991(C7503 c7503) {
        return mo6993(c7503) != -1;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo6992(C7503 c7503, float f, boolean z) {
        float f2 = f22713;
        if (f <= (-f2) || f >= f2) {
            int iMo6993 = mo6993(c7503);
            if (iMo6993 == -1) {
                mo6986(c7503, f);
                return;
            }
            float[] fArr = this.f22718;
            float f3 = fArr[iMo6993] + f;
            fArr[iMo6993] = f3;
            float f4 = f22713;
            if (f3 <= (-f4) || f3 >= f4) {
                return;
            }
            fArr[iMo6993] = 0.0f;
            mo6985(c7503, z);
        }
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public int mo6993(C7503 c7503) {
        if (this.f22721 != 0 && c7503 != null) {
            int i = c7503.f22690;
            int i2 = this.f22715[i % this.f22714];
            if (i2 == -1) {
                return -1;
            }
            if (this.f22717[i2] == i) {
                return i2;
            }
            do {
                i2 = this.f22716[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.f22717[i2] != i);
            if (i2 != -1 && this.f22717[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public int mo6994() {
        return 0;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo6995(float f) {
        int i = this.f22721;
        int i2 = this.f22722;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f22718;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f22720[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m23460(C7503 c7503, int i) {
        int[] iArr;
        int i2 = c7503.f22690 % this.f22714;
        int[] iArr2 = this.f22715;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f22716;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.f22716[i] = -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m23461(int i, C7503 c7503, float f) {
        this.f22717[i] = c7503.f22690;
        this.f22718[i] = f;
        this.f22719[i] = -1;
        this.f22720[i] = -1;
        c7503.m3697(this.f22723);
        c7503.f22700++;
        this.f22721++;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m23462() {
        for (int i = 0; i < this.f22714; i++) {
            if (this.f22715[i] != -1) {
                String str = hashCode() + " hash [" + i + "] => ";
                int i2 = this.f22715[i];
                boolean z = false;
                while (!z) {
                    str = str + " " + this.f22717[i2];
                    int i3 = this.f22716[i2];
                    if (i3 != -1) {
                        i2 = i3;
                    } else {
                        z = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final int m23463() {
        for (int i = 0; i < this.f2920; i++) {
            if (this.f22717[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m23464() {
        int i = this.f2920 * 2;
        this.f22717 = Arrays.copyOf(this.f22717, i);
        this.f22718 = Arrays.copyOf(this.f22718, i);
        this.f22719 = Arrays.copyOf(this.f22719, i);
        this.f22720 = Arrays.copyOf(this.f22720, i);
        this.f22716 = Arrays.copyOf(this.f22716, i);
        for (int i2 = this.f2920; i2 < i; i2++) {
            this.f22717[i2] = -1;
            this.f22716[i2] = -1;
        }
        this.f2920 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m23465(int i, C7503 c7503, float f) {
        int iM23463 = m23463();
        m23461(iM23463, c7503, f);
        if (i != -1) {
            this.f22719[iM23463] = i;
            int[] iArr = this.f22720;
            iArr[iM23463] = iArr[i];
            iArr[i] = iM23463;
        } else {
            this.f22719[iM23463] = -1;
            if (this.f22721 > 0) {
                this.f22720[iM23463] = this.f22722;
                this.f22722 = iM23463;
            } else {
                this.f22720[iM23463] = -1;
            }
        }
        int i2 = this.f22720[iM23463];
        if (i2 != -1) {
            this.f22719[i2] = iM23463;
        }
        m23460(c7503, iM23463);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m23466(C7503 c7503) {
        int[] iArr;
        int i;
        int i2 = c7503.f22690;
        int i3 = i2 % this.f22714;
        int[] iArr2 = this.f22715;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f22717[i4] == i2) {
            int[] iArr3 = this.f22716;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.f22716;
            i = iArr[i4];
            if (i == -1 || this.f22717[i] == i2) {
                break;
            } else {
                i4 = i;
            }
        }
        if (i == -1 || this.f22717[i] != i2) {
            return;
        }
        iArr[i4] = iArr[i];
        iArr[i] = -1;
    }
}
