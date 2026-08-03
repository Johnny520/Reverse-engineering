package Yue;

import android.view.MotionEvent;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8174 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final long f24273 = 100;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f24274 = 20;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final long f24275 = 40;

    /* JADX INFO: renamed from: ۥ */
    public final float[] f3282 = new float[20];

    /* JADX INFO: renamed from: ۥ۟ */
    public final long[] f3283 = new long[20];

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f24276 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f24277 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f24278 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static float m26974(float f) {
        return (f < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4204(@InterfaceC6391 MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f24277 != 0 && eventTime - this.f3283[this.f24278] > 40) {
            m4205();
        }
        int i = (this.f24278 + 1) % 20;
        this.f24278 = i;
        int i2 = this.f24277;
        if (i2 != 20) {
            this.f24277 = i2 + 1;
        }
        this.f3282[i] = motionEvent.getAxisValue(26);
        this.f3283[this.f24278] = eventTime;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m4205() {
        this.f24277 = 0;
        this.f24276 = 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m26975(int i) {
        m26976(i, Float.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m26976(int i, float f) {
        float fM26978 = m26978() * i;
        this.f24276 = fM26978;
        if (fM26978 < (-Math.abs(f))) {
            this.f24276 = -Math.abs(f);
        } else if (this.f24276 > Math.abs(f)) {
            this.f24276 = Math.abs(f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float m26977(int i) {
        if (i != 26) {
            return 0.0f;
        }
        return this.f24276;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final float m26978() {
        long[] jArr;
        long j;
        int i = this.f24277;
        if (i < 2) {
            return 0.0f;
        }
        int i2 = this.f24278;
        int i3 = ((i2 + 20) - (i - 1)) % 20;
        long j2 = this.f3283[i2];
        while (true) {
            jArr = this.f3283;
            j = jArr[i3];
            if (j2 - j <= 100) {
                break;
            }
            this.f24277--;
            i3 = (i3 + 1) % 20;
        }
        int i4 = this.f24277;
        if (i4 < 2) {
            return 0.0f;
        }
        if (i4 == 2) {
            int i5 = (i3 + 1) % 20;
            if (j == jArr[i5]) {
                return 0.0f;
            }
            return this.f3282[i5] / (r2 - j);
        }
        float fAbs = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f24277 - 1; i7++) {
            int i8 = i7 + i3;
            long[] jArr2 = this.f3283;
            long j3 = jArr2[i8 % 20];
            int i9 = (i8 + 1) % 20;
            if (jArr2[i9] != j3) {
                i6++;
                float fM26974 = m26974(fAbs);
                float f = this.f3282[i9] / (this.f3283[i9] - j3);
                fAbs += (f - fM26974) * Math.abs(f);
                if (i6 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return m26974(fAbs);
    }
}
