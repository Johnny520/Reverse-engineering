package p266s0;

/* JADX INFO: renamed from: s0.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3880j {

    /* JADX INFO: renamed from: a */
    public final int f12736a;

    /* JADX INFO: renamed from: b */
    public final long[] f12737b;

    /* JADX INFO: renamed from: c */
    public final Object[] f12738c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3880j(int i9, long[] jArr, Object[] objArr) {
        this.f12736a = i9;
        this.f12737b = jArr;
        this.f12738c = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m8073a(long j3) {
        int i9 = this.f12736a - 1;
        if (i9 != -1) {
            long[] jArr = this.f12737b;
            int i10 = 0;
            if (i9 != 0) {
                while (i10 <= i9) {
                    int i11 = (i10 + i9) >>> 1;
                    long j4 = jArr[i11] - j3;
                    if (j4 < 0) {
                        i10 = i11 + 1;
                    } else {
                        if (j4 <= 0) {
                            return i11;
                        }
                        i9 = i11 - 1;
                    }
                }
                return -(i10 + 1);
            }
            long j5 = jArr[0];
            if (j5 == j3) {
                return 0;
            }
            if (j5 > j3) {
                return -2;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C3880j m8074b(Object obj, long j3) {
        long[] jArr;
        int i9;
        Object[] objArr = this.f12738c;
        int i10 = 0;
        int i11 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i11++;
            }
        }
        int i12 = i11 + 1;
        long[] jArr2 = new long[i12];
        Object[] objArr2 = new Object[i12];
        if (i12 > 1) {
            int i13 = 0;
            while (true) {
                jArr = this.f12737b;
                i9 = this.f12736a;
                if (i10 >= i12 || i13 >= i9) {
                    break;
                }
                long j4 = jArr[i13];
                Object obj3 = objArr[i13];
                if (j4 > j3) {
                    jArr2[i10] = j3;
                    objArr2[i10] = obj;
                    i10++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i10] = j4;
                    objArr2[i10] = obj3;
                    i10++;
                }
                i13++;
            }
            if (i13 == i9) {
                jArr2[i11] = j3;
                objArr2[i11] = obj;
            } else {
                while (i10 < i12) {
                    long j5 = jArr[i13];
                    Object obj4 = objArr[i13];
                    if (obj4 != null) {
                        jArr2[i10] = j5;
                        objArr2[i10] = obj4;
                        i10++;
                    }
                    i13++;
                }
            }
        } else {
            jArr2[0] = j3;
            objArr2[0] = obj;
        }
        return new C3880j(i12, jArr2, objArr2);
    }
}
