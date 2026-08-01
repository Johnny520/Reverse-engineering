package p291u2;

import p121i3.C3185o;

/* JADX INFO: renamed from: u2.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8496d {
    /* JADX INFO: renamed from: c */
    public static final int m32714c(float[] fArr) {
        int i10 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i11 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i10 = 1;
        }
        return (i11 << 1) | i10;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m32715d(long j10) {
        return !C3185o.m12048h(j10, C3185o.f8471b.m12057a());
    }
}
