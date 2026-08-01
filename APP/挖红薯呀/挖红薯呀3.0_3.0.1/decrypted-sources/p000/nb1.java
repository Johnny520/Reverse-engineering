package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nb1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f4233a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        char c;
        int i;
        float[] fArr;
        float[] fArr2;
        boolean z;
        float[][] fArr3 = {new float[2], new float[2]};
        boolean z2 = false;
        int i2 = new int[2][0];
        int i3 = 4;
        char c2 = 3;
        int i4 = 1;
        if (i2 == 0) {
            c = 3;
        } else if (i2 == 1) {
            c = 1;
        } else if (i2 == 2 || i2 == 3) {
            c = 2;
        } else if (i2 == 4) {
            c = 4;
        } else if (i2 == 5) {
            c = 5;
        }
        float[] fArr4 = fArr3[0];
        float[] fArr5 = fArr3[1];
        int length = (fArr4.length % 2) + (fArr4.length / 2);
        C0675r3[] c0675r3Arr = new C0675r3[length];
        int i5 = 0;
        while (i5 < length) {
            int i6 = i5 * 2;
            float f = fArr4[i6];
            int i7 = i6 + 1;
            float f2 = fArr4[i7];
            float f3 = fArr5[i6];
            float f4 = fArr5[i7];
            C0675r3 c0675r3 = new C0675r3(i3);
            float f5 = f3 - f;
            float f6 = f4 - f2;
            float[] fArr6 = new float[101];
            if (c != c2 && Math.abs(f5) >= 0.001f && Math.abs(f6) >= 0.001f) {
                float f7 = f2 - f4;
                float[] fArr7 = p30.f4734a;
                int i8 = i4;
                i = i8;
                fArr = fArr4;
                float f8 = f7;
                float fHypot = 0.0f;
                float f9 = 0.0f;
                while (true) {
                    double radians = (float) Math.toRadians((((double) i8) * 90.0d) / 90.0d);
                    float f10 = f7;
                    float fSin = ((float) Math.sin(radians)) * f5;
                    float fCos = f10 * ((float) Math.cos(radians));
                    fArr2 = fArr6;
                    fHypot += (float) Math.hypot(fSin - f9, fCos - f8);
                    fArr7[i8] = fHypot;
                    if (i8 == 90) {
                        break;
                    }
                    i8++;
                    f9 = fSin;
                    f8 = fCos;
                    f7 = f10;
                    fArr6 = fArr2;
                }
                int i9 = i;
                while (true) {
                    fArr7[i9] = fArr7[i9] / fHypot;
                    if (i9 == 90) {
                        break;
                    } else {
                        i9++;
                    }
                }
                for (int i10 = 0; i10 < 101; i10++) {
                    float f11 = i10 / 100.0f;
                    int iBinarySearch = Arrays.binarySearch(fArr7, 0, 91, f11);
                    if (iBinarySearch >= 0) {
                        fArr2[i10] = iBinarySearch / 90.0f;
                    } else if (iBinarySearch == -1) {
                        fArr2[i10] = 0.0f;
                    } else {
                        int i11 = -iBinarySearch;
                        int i12 = i11 - 2;
                        float f12 = i12;
                        float f13 = fArr7[i12];
                        fArr2[i10] = (((f11 - f13) / (fArr7[i11 - 1] - f13)) + f12) / 90.0f;
                    }
                }
                z = false;
            } else {
                i = i4;
                fArr = fArr4;
                z = z2;
                Math.hypot(f6, f5);
            }
            c0675r3Arr[i5] = c0675r3;
            i5++;
            z2 = z;
            i4 = i;
            fArr4 = fArr;
            i3 = 4;
            c2 = 3;
        }
    }
}
