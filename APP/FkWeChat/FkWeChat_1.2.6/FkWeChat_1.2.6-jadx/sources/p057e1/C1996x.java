package p057e1;

/* JADX INFO: renamed from: e1.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1996x {

    /* JADX INFO: renamed from: a */
    public final int f5542a;

    /* JADX INFO: renamed from: b */
    public final long[] f5543b;

    /* JADX INFO: renamed from: c */
    public final Object[] f5544c;

    public C1996x(int i10, long[] jArr, Object[] objArr) {
        this.f5542a = i10;
        this.f5543b = jArr;
        this.f5544c = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final int m7201a(long j10) {
        int i10 = this.f5542a - 1;
        if (i10 != -1) {
            int i11 = 0;
            if (i10 != 0) {
                while (i11 <= i10) {
                    int i12 = (i11 + i10) >>> 1;
                    long j11 = this.f5543b[i12] - j10;
                    if (j11 < 0) {
                        i11 = i12 + 1;
                    } else {
                        if (j11 <= 0) {
                            return i12;
                        }
                        i10 = i12 - 1;
                    }
                }
                return -(i11 + 1);
            }
            long j12 = this.f5543b[0];
            if (j12 == j10) {
                return 0;
            }
            if (j12 > j10) {
                return -2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final Object m7202b(long j10) {
        int iM7201a = m7201a(j10);
        if (iM7201a >= 0) {
            return this.f5544c[iM7201a];
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C1996x m7203c(long j10, Object obj) {
        int i10 = this.f5542a;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : this.f5544c) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr = new long[i13];
        Object[] objArr = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j11 = this.f5543b[i14];
                Object obj3 = this.f5544c[i14];
                if (j11 > j10) {
                    jArr[i11] = j10;
                    objArr[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i11] = j11;
                    objArr[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr[i12] = j10;
                objArr[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j12 = this.f5543b[i14];
                    Object obj4 = this.f5544c[i14];
                    if (obj4 != null) {
                        jArr[i11] = j12;
                        objArr[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr[0] = j10;
            objArr[0] = obj;
        }
        return new C1996x(i13, jArr, objArr);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7204d(long j10, Object obj) {
        int iM7201a = m7201a(j10);
        if (iM7201a < 0) {
            return false;
        }
        this.f5544c[iM7201a] = obj;
        return true;
    }
}
