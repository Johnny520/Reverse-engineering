package Yue;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: Yue.ۥۣۣۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7503 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final boolean f22673 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final boolean f22674 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f22675 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f22676 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f22677 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f22678 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f22679 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f22680 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f22681 = 6;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f22682 = 7;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f22683 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static int f22684 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static int f22685 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static int f22686 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static int f22687 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static int f22688 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f22689 = 9;

    /* JADX INFO: renamed from: ۥ */
    public boolean f2916;

    /* JADX INFO: renamed from: ۥ۟ */
    public String f2917;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f22690;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f22691;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f22692;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f22693;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f22694;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float[] f22695;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float[] f22696;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public EnumC1281 f22697;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C3398[] f22698;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f22699;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f22700;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean f22701;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int f22702;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public float f22703;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public HashSet<C3398> f22704;

    /* JADX INFO: renamed from: Yue.ۥۣۣۢ۟$ۥ */
    public static /* synthetic */ class C1280 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f2918;

        static {
            int[] iArr = new int[EnumC1281.values().length];
            f2918 = iArr;
            try {
                iArr[EnumC1281.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2918[EnumC1281.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2918[EnumC1281.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2918[EnumC1281.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2918[EnumC1281.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۣۢ۟$ۥ۟ */
    public enum EnumC1281 {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7503(String str, EnumC1281 enumC1281) {
        this.f22690 = -1;
        this.f22691 = -1;
        this.f22692 = 0;
        this.f22694 = false;
        this.f22695 = new float[9];
        this.f22696 = new float[9];
        this.f22698 = new C3398[16];
        this.f22699 = 0;
        this.f22700 = 0;
        this.f22701 = false;
        this.f22702 = -1;
        this.f22703 = 0.0f;
        this.f22704 = null;
        this.f2917 = str;
        this.f22697 = enumC1281;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static String m23449(EnumC1281 enumC1281, String str) {
        if (str != null) {
            return str + f22685;
        }
        int i = C1280.f2918[enumC1281.ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("U");
            int i2 = f22686 + 1;
            f22686 = i2;
            sb.append(i2);
            return sb.toString();
        }
        if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("C");
            int i3 = f22687 + 1;
            f22687 = i3;
            sb2.append(i3);
            return sb2.toString();
        }
        if (i == 3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C4750.f10490);
            int i4 = f22684 + 1;
            f22684 = i4;
            sb3.append(i4);
            return sb3.toString();
        }
        if (i == 4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("e");
            int i5 = f22685 + 1;
            f22685 = i5;
            sb4.append(i5);
            return sb4.toString();
        }
        if (i != 5) {
            throw new AssertionError(enumC1281.name());
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C4750.f10496);
        int i6 = f22688 + 1;
        f22688 = i6;
        sb5.append(i6);
        return sb5.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m23450() {
        f22685++;
    }

    public String toString() {
        if (this.f2917 != null) {
            return "" + this.f2917;
        }
        return "" + this.f22690;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3697(C3398 c3398) {
        int i = 0;
        while (true) {
            int i2 = this.f22699;
            if (i >= i2) {
                C3398[] c3398Arr = this.f22698;
                if (i2 >= c3398Arr.length) {
                    this.f22698 = (C3398[]) Arrays.copyOf(c3398Arr, c3398Arr.length * 2);
                }
                C3398[] c3398Arr2 = this.f22698;
                int i3 = this.f22699;
                c3398Arr2[i3] = c3398;
                this.f22699 = i3 + 1;
                return;
            }
            if (this.f22698[i] == c3398) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3698() {
        for (int i = 0; i < 9; i++) {
            this.f22695[i] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m23451() {
        return this.f2917;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m23452(C3398 c3398) {
        int i = this.f22699;
        int i2 = 0;
        while (i2 < i) {
            if (this.f22698[i2] == c3398) {
                while (i2 < i - 1) {
                    C3398[] c3398Arr = this.f22698;
                    int i3 = i2 + 1;
                    c3398Arr[i2] = c3398Arr[i3];
                    i2 = i3;
                }
                this.f22699--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m23453() {
        this.f2917 = null;
        this.f22697 = EnumC1281.UNKNOWN;
        this.f22692 = 0;
        this.f22690 = -1;
        this.f22691 = -1;
        this.f22693 = 0.0f;
        this.f22694 = false;
        this.f22701 = false;
        this.f22702 = -1;
        this.f22703 = 0.0f;
        int i = this.f22699;
        for (int i2 = 0; i2 < i; i2++) {
            this.f22698[i2] = null;
        }
        this.f22699 = 0;
        this.f22700 = 0;
        this.f2916 = false;
        Arrays.fill(this.f22696, 0.0f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m23454(C5714 c5714, float f) {
        this.f22693 = f;
        this.f22694 = true;
        this.f22701 = false;
        this.f22702 = -1;
        this.f22703 = 0.0f;
        int i = this.f22699;
        this.f22691 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f22698[i2].mo7014(c5714, this, false);
        }
        this.f22699 = 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m23455(String str) {
        this.f2917 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m23456(C5714 c5714, C7503 c7503, float f) {
        this.f22701 = true;
        this.f22702 = c7503.f22690;
        this.f22703 = f;
        int i = this.f22699;
        this.f22691 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f22698[i2].m7043(c5714, this, false);
        }
        this.f22699 = 0;
        c5714.m17642();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m23457(EnumC1281 enumC1281, String str) {
        this.f22697 = enumC1281;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public String m23458() {
        String str = this + "[";
        boolean z = false;
        boolean z2 = true;
        for (int i = 0; i < this.f22695.length; i++) {
            String str2 = str + this.f22695[i];
            float[] fArr = this.f22695;
            float f = fArr[i];
            if (f > 0.0f) {
                z = false;
            } else if (f < 0.0f) {
                z = true;
            }
            if (f != 0.0f) {
                z2 = false;
            }
            str = i < fArr.length - 1 ? str2 + ", " : str2 + "] ";
        }
        if (z) {
            str = str + " (-)";
        }
        if (!z2) {
            return str;
        }
        return str + " (*)";
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m23459(C5714 c5714, C3398 c3398) {
        int i = this.f22699;
        for (int i2 = 0; i2 < i; i2++) {
            this.f22698[i2].mo7015(c5714, c3398, false);
        }
        this.f22699 = 0;
    }

    public C7503(EnumC1281 enumC1281, String str) {
        this.f22690 = -1;
        this.f22691 = -1;
        this.f22692 = 0;
        this.f22694 = false;
        this.f22695 = new float[9];
        this.f22696 = new float[9];
        this.f22698 = new C3398[16];
        this.f22699 = 0;
        this.f22700 = 0;
        this.f22701 = false;
        this.f22702 = -1;
        this.f22703 = 0.0f;
        this.f22704 = null;
        this.f22697 = enumC1281;
    }
}
