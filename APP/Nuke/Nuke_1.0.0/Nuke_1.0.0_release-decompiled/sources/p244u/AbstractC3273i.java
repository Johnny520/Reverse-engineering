package p244u;

import p092S0.C1287y;

/* JADX INFO: renamed from: u.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3273i {

    /* JADX INFO: renamed from: a */
    public static final C3259b f10110a = new C3259b(3);

    /* JADX INFO: renamed from: b */
    public static final C3259b f10111b = new C3259b(2);

    /* JADX INFO: renamed from: c */
    public static final C3263d f10112c = new C3263d();

    /* JADX INFO: renamed from: d */
    public static final C3265e f10113d = new C3265e(0);

    /* JADX INFO: renamed from: e */
    public static final C3265e f10114e;

    static {
        new C3265e(3);
        f10114e = new C3265e(2);
        new C3265e(1);
    }

    /* JADX INFO: renamed from: a */
    public static void m5543a(int i5, int[] iArr, int[] iArr2, boolean z5) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        float f2 = (i5 - i7) / 2;
        if (!z5) {
            int length = iArr.length;
            int i9 = 0;
            while (i6 < length) {
                int i10 = iArr[i6];
                iArr2[i9] = Math.round(f2);
                f2 += i10;
                i6++;
                i9++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i11 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i11;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5544b(int[] iArr, int[] iArr2, boolean z5) {
        int i5 = 0;
        if (!z5) {
            int length = iArr.length;
            int i6 = 0;
            int i7 = 0;
            while (i5 < length) {
                int i8 = iArr[i5];
                iArr2[i6] = i7;
                i7 += i8;
                i5++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i9 = iArr[length2];
            iArr2[length2] = i5;
            i5 += i9;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m5545c(int i5, int[] iArr, int[] iArr2, boolean z5) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        int i9 = i5 - i7;
        if (!z5) {
            int length = iArr.length;
            int i10 = 0;
            while (i6 < length) {
                int i11 = iArr[i6];
                iArr2[i10] = i9;
                i9 += i11;
                i6++;
                i10++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i12 = iArr[length2];
            iArr2[length2] = i9;
            i9 += i12;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m5546d(int i5, int[] iArr, int[] iArr2, boolean z5) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        float length = iArr.length == 0 ? 0.0f : (i5 - i7) / iArr.length;
        float f2 = length / 2;
        if (!z5) {
            int length2 = iArr.length;
            int i9 = 0;
            while (i6 < length2) {
                int i10 = iArr[i6];
                iArr2[i9] = Math.round(f2);
                f2 += i10 + length;
                i6++;
                i9++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i11 = iArr[length3];
            iArr2[length3] = Math.round(f2);
            f2 += i11 + length;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m5547e(int i5, int[] iArr, int[] iArr2, boolean z5) {
        if (iArr.length == 0) {
            return;
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        float fMax = (i5 - i7) / Math.max(iArr.length - 1, 1);
        float f2 = (z5 && iArr.length == 1) ? fMax : 0.0f;
        if (z5) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i9 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i9 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i10 = 0;
        while (i6 < length2) {
            int i11 = iArr[i6];
            iArr2[i10] = Math.round(f2);
            f2 += i11 + fMax;
            i6++;
            i10++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m5548f(int i5, int[] iArr, int[] iArr2, boolean z5) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        float length = (i5 - i7) / (iArr.length + 1);
        if (z5) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i9 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i9 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f5 = length;
        int i10 = 0;
        while (i6 < length3) {
            int i11 = iArr[i6];
            iArr2[i10] = Math.round(f5);
            f5 += i11 + length;
            i6++;
            i10++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static C3269g m5549g(float f2) {
        return new C3269g(f2, new C1287y((byte) 0, 24));
    }
}
