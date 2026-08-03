package Yue;

import Yue.C3398;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3392 implements C3398.InterfaceC0129 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean f5451 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f5452 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final boolean f5453 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static float f5454 = 0.001f;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C3398 f267;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C3639 f5455;

    /* JADX INFO: renamed from: ۥ */
    public int f266 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f5456 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C7503 f5457 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int[] f5458 = new int[8];

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int[] f5459 = new int[8];

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float[] f5460 = new float[8];

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f5461 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f5462 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f5463 = false;

    public C3392(C3398 c3398, C3639 c3639) {
        this.f267 = c3398;
        this.f5455 = c3639;
    }

    @Override // Yue.C3398.InterfaceC0129
    public final void clear() {
        int i = this.f5461;
        for (int i2 = 0; i != -1 && i2 < this.f266; i2++) {
            C7503 c7503 = this.f5455.f6412[this.f5458[i]];
            if (c7503 != null) {
                c7503.m23452(this.f267);
            }
            i = this.f5459[i];
        }
        this.f5461 = -1;
        this.f5462 = -1;
        this.f5463 = false;
        this.f266 = 0;
    }

    @Override // Yue.C3398.InterfaceC0129
    public int getCurrentSize() {
        return this.f266;
    }

    public String toString() {
        int i = this.f5461;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f266; i2++) {
            str = ((str + " -> ") + this.f5460[i] + " : ") + this.f5455.f6412[this.f5458[i]];
            i = this.f5459[i];
        }
        return str;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ */
    public float mo477(C3398 c3398, boolean z) {
        float fMo6990 = mo6990(c3398.f272);
        mo6985(c3398.f272, z);
        C3398.InterfaceC0129 interfaceC0129 = c3398.f5472;
        int currentSize = interfaceC0129.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            C7503 c7503Mo6987 = interfaceC0129.mo6987(i);
            mo6992(c7503Mo6987, interfaceC0129.mo6990(c7503Mo6987) * fMo6990, z);
        }
        return fMo6990;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo478() {
        int i = this.f266;
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
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float mo6985(C7503 c7503, boolean z) {
        if (this.f5457 == c7503) {
            this.f5457 = null;
        }
        int i = this.f5461;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f266) {
            if (this.f5458[i] == c7503.f22690) {
                if (i == this.f5461) {
                    this.f5461 = this.f5459[i];
                } else {
                    int[] iArr = this.f5459;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c7503.m23452(this.f267);
                }
                c7503.f22700--;
                this.f266--;
                this.f5458[i] = -1;
                if (this.f5463) {
                    this.f5462 = i;
                }
                return this.f5460[i];
            }
            i2++;
            i3 = i;
            i = this.f5459[i];
        }
        return 0.0f;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void mo6986(C7503 c7503, float f) {
        if (f == 0.0f) {
            mo6985(c7503, true);
            return;
        }
        int i = this.f5461;
        if (i == -1) {
            this.f5461 = 0;
            this.f5460[0] = f;
            this.f5458[0] = c7503.f22690;
            this.f5459[0] = -1;
            c7503.f22700++;
            c7503.m3697(this.f267);
            this.f266++;
            if (this.f5463) {
                return;
            }
            int i2 = this.f5462 + 1;
            this.f5462 = i2;
            int[] iArr = this.f5458;
            if (i2 >= iArr.length) {
                this.f5463 = true;
                this.f5462 = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f266; i4++) {
            int i5 = this.f5458[i];
            int i6 = c7503.f22690;
            if (i5 == i6) {
                this.f5460[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f5459[i];
        }
        int length = this.f5462;
        int i7 = length + 1;
        if (this.f5463) {
            int[] iArr2 = this.f5458;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f5458;
        if (length >= iArr3.length && this.f266 < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f5458;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f5458;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f5456 * 2;
            this.f5456 = i9;
            this.f5463 = false;
            this.f5462 = length - 1;
            this.f5460 = Arrays.copyOf(this.f5460, i9);
            this.f5458 = Arrays.copyOf(this.f5458, this.f5456);
            this.f5459 = Arrays.copyOf(this.f5459, this.f5456);
        }
        this.f5458[length] = c7503.f22690;
        this.f5460[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f5459;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f5459[length] = this.f5461;
            this.f5461 = length;
        }
        c7503.f22700++;
        c7503.m3697(this.f267);
        int i10 = this.f266 + 1;
        this.f266 = i10;
        if (!this.f5463) {
            this.f5462++;
        }
        int[] iArr7 = this.f5458;
        if (i10 >= iArr7.length) {
            this.f5463 = true;
        }
        if (this.f5462 >= iArr7.length) {
            this.f5463 = true;
            this.f5462 = iArr7.length - 1;
        }
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C7503 mo6987(int i) {
        int i2 = this.f5461;
        for (int i3 = 0; i2 != -1 && i3 < this.f266; i3++) {
            if (i3 == i) {
                return this.f5455.f6412[this.f5458[i2]];
            }
            i2 = this.f5459[i2];
        }
        return null;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo6988() {
        int i = this.f5461;
        for (int i2 = 0; i != -1 && i2 < this.f266; i2++) {
            float[] fArr = this.f5460;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f5459[i];
        }
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float mo6989(int i) {
        int i2 = this.f5461;
        for (int i3 = 0; i2 != -1 && i3 < this.f266; i3++) {
            if (i3 == i) {
                return this.f5460[i2];
            }
            i2 = this.f5459[i2];
        }
        return 0.0f;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final float mo6990(C7503 c7503) {
        int i = this.f5461;
        for (int i2 = 0; i != -1 && i2 < this.f266; i2++) {
            if (this.f5458[i] == c7503.f22690) {
                return this.f5460[i];
            }
            i = this.f5459[i];
        }
        return 0.0f;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean mo6991(C7503 c7503) {
        int i = this.f5461;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f266; i2++) {
            if (this.f5458[i] == c7503.f22690) {
                return true;
            }
            i = this.f5459[i];
        }
        return false;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo6992(C7503 c7503, float f, boolean z) {
        float f2 = f5454;
        if (f <= (-f2) || f >= f2) {
            int i = this.f5461;
            if (i == -1) {
                this.f5461 = 0;
                this.f5460[0] = f;
                this.f5458[0] = c7503.f22690;
                this.f5459[0] = -1;
                c7503.f22700++;
                c7503.m3697(this.f267);
                this.f266++;
                if (this.f5463) {
                    return;
                }
                int i2 = this.f5462 + 1;
                this.f5462 = i2;
                int[] iArr = this.f5458;
                if (i2 >= iArr.length) {
                    this.f5463 = true;
                    this.f5462 = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f266; i4++) {
                int i5 = this.f5458[i];
                int i6 = c7503.f22690;
                if (i5 == i6) {
                    float[] fArr = this.f5460;
                    float f3 = fArr[i] + f;
                    float f4 = f5454;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f5461) {
                            this.f5461 = this.f5459[i];
                        } else {
                            int[] iArr2 = this.f5459;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c7503.m23452(this.f267);
                        }
                        if (this.f5463) {
                            this.f5462 = i;
                        }
                        c7503.f22700--;
                        this.f266--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f5459[i];
            }
            int length = this.f5462;
            int i7 = length + 1;
            if (this.f5463) {
                int[] iArr3 = this.f5458;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f5458;
            if (length >= iArr4.length && this.f266 < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f5458;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f5458;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f5456 * 2;
                this.f5456 = i9;
                this.f5463 = false;
                this.f5462 = length - 1;
                this.f5460 = Arrays.copyOf(this.f5460, i9);
                this.f5458 = Arrays.copyOf(this.f5458, this.f5456);
                this.f5459 = Arrays.copyOf(this.f5459, this.f5456);
            }
            this.f5458[length] = c7503.f22690;
            this.f5460[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f5459;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f5459[length] = this.f5461;
                this.f5461 = length;
            }
            c7503.f22700++;
            c7503.m3697(this.f267);
            this.f266++;
            if (!this.f5463) {
                this.f5462++;
            }
            int i10 = this.f5462;
            int[] iArr8 = this.f5458;
            if (i10 >= iArr8.length) {
                this.f5463 = true;
                this.f5462 = iArr8.length - 1;
            }
        }
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int mo6993(C7503 c7503) {
        int i = this.f5461;
        if (i == -1) {
            return -1;
        }
        for (int i2 = 0; i != -1 && i2 < this.f266; i2++) {
            if (this.f5458[i] == c7503.f22690) {
                return i;
            }
            i = this.f5459[i];
        }
        return -1;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int mo6994() {
        return (this.f5458.length * 12) + 36;
    }

    @Override // Yue.C3398.InterfaceC0129
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void mo6995(float f) {
        int i = this.f5461;
        for (int i2 = 0; i != -1 && i2 < this.f266; i2++) {
            float[] fArr = this.f5460;
            fArr[i] = fArr[i] / f;
            i = this.f5459[i];
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m6996() {
        return this.f5461;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final int m6997(int i) {
        return this.f5458[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final int m6998(int i) {
        return this.f5459[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C7503 m6999() {
        C7503 c7503 = this.f5457;
        if (c7503 != null) {
            return c7503;
        }
        int i = this.f5461;
        C7503 c75032 = null;
        for (int i2 = 0; i != -1 && i2 < this.f266; i2++) {
            if (this.f5460[i] < 0.0f) {
                C7503 c75033 = this.f5455.f6412[this.f5458[i]];
                if (c75032 == null || c75032.f22692 < c75033.f22692) {
                    c75032 = c75033;
                }
            }
            i = this.f5459[i];
        }
        return c75032;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final float m7000(int i) {
        return this.f5460[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m7001() {
        int i = this.f5461;
        for (int i2 = 0; i != -1 && i2 < this.f266; i2++) {
            if (this.f5460[i] > 0.0f) {
                return true;
            }
            i = this.f5459[i];
        }
        return false;
    }
}
