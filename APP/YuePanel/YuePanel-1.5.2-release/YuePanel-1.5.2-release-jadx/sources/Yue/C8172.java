package Yue;

import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8172 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f24269 = 20;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f24270 = 40;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f24271 = 100;

    /* JADX INFO: renamed from: ۥ */
    public long[] f3279;

    /* JADX INFO: renamed from: ۥ۟ */
    public float[] f3280 = new float[20];

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f24272 = 0;

    public C8172() {
        long[] jArr = new long[20];
        this.f3279 = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4198(long j, float f) {
        int i = (this.f24272 + 1) % 20;
        this.f24272 = i;
        this.f3279[i] = j;
        this.f3280[i] = f;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public float m4199() {
        float fM26961;
        int i = this.f24272;
        if (i == 0 && this.f3279[i] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j = this.f3279[i];
        int i2 = 0;
        long j2 = j;
        while (true) {
            long j3 = this.f3279[i];
            if (j3 == Long.MIN_VALUE) {
                break;
            }
            float f = j - j3;
            float fAbs = Math.abs(j3 - j2);
            if (f > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i == 0) {
                i = 20;
            }
            i--;
            i2++;
            if (i2 >= 20) {
                break;
            }
            j2 = j3;
        }
        if (i2 < 2) {
            return 0.0f;
        }
        if (i2 == 2) {
            int i3 = this.f24272;
            int i4 = i3 == 0 ? 19 : i3 - 1;
            long[] jArr = this.f3279;
            float f2 = jArr[i3] - jArr[i4];
            if (f2 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f3280;
            fM26961 = (fArr[i3] - fArr[i4]) / f2;
        } else {
            int i5 = this.f24272;
            int i6 = ((i5 - i2) + 21) % 20;
            int i7 = (i5 + 21) % 20;
            long j4 = this.f3279[i6];
            float f3 = this.f3280[i6];
            int i8 = i6 + 1;
            float fM269612 = 0.0f;
            for (int i9 = i8 % 20; i9 != i7; i9 = (i9 + 1) % 20) {
                long j5 = this.f3279[i9];
                float f4 = j5 - j4;
                if (f4 != 0.0f) {
                    float f5 = this.f3280[i9];
                    float f6 = (f5 - f3) / f4;
                    fM269612 += (f6 - m26961(fM269612)) * Math.abs(f6);
                    if (i9 == i8) {
                        fM269612 *= 0.5f;
                    }
                    f3 = f5;
                    j4 = j5;
                }
            }
            fM26961 = m26961(fM269612);
        }
        return fM26961 * 1000.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float m26961(float f) {
        return (float) (((double) Math.signum(f)) * Math.sqrt(Math.abs(f) * 2.0f));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m26962() {
        this.f24272 = 0;
        Arrays.fill(this.f3279, Long.MIN_VALUE);
        Arrays.fill(this.f3280, 0.0f);
    }
}
