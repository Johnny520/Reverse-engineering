package Yue;

import Yue.C3398;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: Yue.ۥۡۥ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6799 extends C3398 {

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final float f17670 = 1.0E-4f;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final boolean f17671 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f17672 = -1;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f17673;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public C7503[] f17674;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C7503[] f17675;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f17676;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C1086 f17677;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C3639 f17678;

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۦ$ۥ */
    public class C1085 implements Comparator<C7503> {
        public C1085() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public int compare(C7503 c7503, C7503 c75032) {
            return c7503.f22690 - c75032.f22690;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۦ$ۥ۟ */
    public class C1086 implements Comparable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public C7503 f17680;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public C6799 f17681;

        public C1086(C6799 c6799) {
            this.f17681 = c6799;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f17680.f22690 - ((C7503) obj).f22690;
        }

        public String toString() {
            String str = "[ ";
            if (this.f17680 != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f17680.f22696[i] + " ";
                }
            }
            return str + "] " + this.f17680;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m3265(C7503 c7503) {
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f17680.f22696;
                float f = fArr[i] + c7503.f22696[i];
                fArr[i] = f;
                if (Math.abs(f) < 1.0E-4f) {
                    this.f17680.f22696[i] = 0.0f;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m21514(C7503 c7503, float f) {
            boolean z = true;
            if (!this.f17680.f2916) {
                for (int i = 0; i < 9; i++) {
                    float f2 = c7503.f22696[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.f17680.f22696[i] = f3;
                    } else {
                        this.f17680.f22696[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f17680.f22696;
                float f4 = fArr[i2] + (c7503.f22696[i2] * f);
                fArr[i2] = f4;
                if (Math.abs(f4) < 1.0E-4f) {
                    this.f17680.f22696[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                C6799.this.m21513(this.f17680);
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m21515(C7503 c7503) {
            this.f17680 = c7503;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final boolean m21516() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f17680.f22696[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean m21517() {
            for (int i = 0; i < 9; i++) {
                if (this.f17680.f22696[i] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final boolean m21518(C7503 c7503) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = c7503.f22696[i];
                float f2 = this.f17680.f22696[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m21519() {
            Arrays.fill(this.f17680.f22696, 0.0f);
        }
    }

    public C6799(C3639 c3639) {
        super(c3639);
        this.f17673 = 128;
        this.f17674 = new C7503[128];
        this.f17675 = new C7503[128];
        this.f17676 = 0;
        this.f17677 = new C1086(this);
        this.f17678 = c3639;
    }

    @Override // Yue.C3398, Yue.C5714.InterfaceC0844
    public void clear() {
        this.f17676 = 0;
        this.f273 = 0.0f;
    }

    @Override // Yue.C3398, Yue.C5714.InterfaceC0844
    public boolean isEmpty() {
        return this.f17676 == 0;
    }

    @Override // Yue.C3398
    public String toString() {
        String str = " goal -> (" + this.f273 + ") : ";
        for (int i = 0; i < this.f17676; i++) {
            this.f17677.m21515(this.f17674[i]);
            str = str + this.f17677 + " ";
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // Yue.C3398, Yue.C5714.InterfaceC0844
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7503 mo484(C5714 c5714, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f17676; i2++) {
            C7503 c7503 = this.f17674[i2];
            if (!zArr[c7503.f22690]) {
                this.f17677.m21515(c7503);
                if (i == -1) {
                    if (this.f17677.m21516()) {
                        i = i2;
                    }
                } else if (this.f17677.m21518(this.f17674[i])) {
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f17674[i];
    }

    @Override // Yue.C3398, Yue.C5714.InterfaceC0844
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo7013(C7503 c7503) {
        this.f17677.m21515(c7503);
        this.f17677.m21519();
        c7503.f22696[c7503.f22692] = 1.0f;
        m21512(c7503);
    }

    @Override // Yue.C3398, Yue.C5714.InterfaceC0844
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo7015(C5714 c5714, C3398 c3398, boolean z) {
        C7503 c7503 = c3398.f272;
        if (c7503 == null) {
            return;
        }
        C3398.InterfaceC0129 interfaceC0129 = c3398.f5472;
        int currentSize = interfaceC0129.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            C7503 c7503Mo6987 = interfaceC0129.mo6987(i);
            float fMo6989 = interfaceC0129.mo6989(i);
            this.f17677.m21515(c7503Mo6987);
            if (this.f17677.m21514(c7503, fMo6989)) {
                m21512(c7503Mo6987);
            }
            this.f273 += c3398.f273 * fMo6989;
        }
        m21513(c7503);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m21512(C7503 c7503) {
        int i;
        int i2 = this.f17676 + 1;
        C7503[] c7503Arr = this.f17674;
        if (i2 > c7503Arr.length) {
            C7503[] c7503Arr2 = (C7503[]) Arrays.copyOf(c7503Arr, c7503Arr.length * 2);
            this.f17674 = c7503Arr2;
            this.f17675 = (C7503[]) Arrays.copyOf(c7503Arr2, c7503Arr2.length * 2);
        }
        C7503[] c7503Arr3 = this.f17674;
        int i3 = this.f17676;
        c7503Arr3[i3] = c7503;
        int i4 = i3 + 1;
        this.f17676 = i4;
        if (i4 > 1 && c7503Arr3[i3].f22690 > c7503.f22690) {
            int i5 = 0;
            while (true) {
                i = this.f17676;
                if (i5 >= i) {
                    break;
                }
                this.f17675[i5] = this.f17674[i5];
                i5++;
            }
            Arrays.sort(this.f17675, 0, i, new C1085());
            for (int i6 = 0; i6 < this.f17676; i6++) {
                this.f17674[i6] = this.f17675[i6];
            }
        }
        c7503.f2916 = true;
        c7503.m3697(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m21513(C7503 c7503) {
        int i = 0;
        while (i < this.f17676) {
            if (this.f17674[i] == c7503) {
                while (true) {
                    int i2 = this.f17676;
                    if (i >= i2 - 1) {
                        this.f17676 = i2 - 1;
                        c7503.f2916 = false;
                        return;
                    } else {
                        C7503[] c7503Arr = this.f17674;
                        int i3 = i + 1;
                        c7503Arr[i] = c7503Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }
}
