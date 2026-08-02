package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m70 extends ru2 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public gk1 e;
    public Object f;
    public int g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m70(long j) {
        super(j);
        gk1 gk1Var = hs1.a;
        gk1Var.getClass();
        this.e = gk1Var;
        this.f = h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ru2
    public final void a(ru2 ru2Var) {
        ru2Var.getClass();
        m70 m70Var = (m70) ru2Var;
        this.e = m70Var.e;
        this.f = m70Var.f;
        this.g = m70Var.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ru2
    public final ru2 b(long j) {
        return new m70(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(n70 n70Var, vr2 vr2Var) {
        boolean z;
        boolean z2;
        Object obj = ds2.c;
        synchronized (obj) {
            z = true;
            if (this.c == vr2Var.g()) {
                z2 = this.d != vr2Var.h();
            }
        }
        if (this.f == h || (z2 && this.g != d(n70Var, vr2Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = vr2Var.g();
            this.d = vr2Var.h();
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x0116 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:84:0x00f8 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[PHI: r11
  0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v10, types: [m70] */
    /* JADX WARN: Type inference failed for: r13v5, types: [ru2] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, ru2] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [int] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(n70 n70Var, vr2 vr2Var) {
        gk1 gk1Var;
        int iIdentityHashCode;
        long[] jArr;
        int i;
        Object[] objArr;
        long[] jArr2;
        ?? r25;
        Object[] objArr2;
        long j;
        long j2;
        int i2;
        ?? r252;
        ?? I;
        synchronized (ds2.c) {
            gk1Var = this.e;
        }
        int i3 = 7;
        if (gk1Var.e == 0) {
            return 7;
        }
        zk1 zk1VarL = op0.l();
        Object[] objArr3 = zk1VarL.h;
        int i4 = zk1VarL.j;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            ((fo0) objArr3[i5]).b();
        }
        try {
            Object[] objArr4 = gk1Var.b;
            int[] iArr = gk1Var.c;
            long[] jArr3 = gk1Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i6 = 0;
                while (true) {
                    long j3 = jArr3[i6];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8;
                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                        i = i3;
                        ?? r3 = z;
                        while (r3 < i8) {
                            if ((j3 & 255) < 128) {
                                int i9 = (i6 << 3) + r3;
                                j2 = j4;
                                pu2 pu2Var = (pu2) objArr4[i9];
                                int i10 = i7;
                                if (iArr[i9] != 1) {
                                    jArr2 = jArr3;
                                    r25 = r3;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (pu2Var instanceof n70) {
                                        n70 n70Var2 = (n70) pu2Var;
                                        I = n70Var2.g((m70) ds2.i(n70Var2.k, vr2Var), vr2Var, z, n70Var2.i);
                                        gk1 gk1Var2 = I.e;
                                        Object[] objArr5 = gk1Var2.b;
                                        long[] jArr4 = gk1Var2.a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        r252 = r3;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i11 = 0;
                                            while (true) {
                                                long j5 = jArr4[i11];
                                                j = j3;
                                                int iIdentityHashCode2 = iIdentityHashCode;
                                                if ((((~j5) << i) & j5 & j2) != j2) {
                                                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                    for (int i13 = 0; i13 < i12; i13++) {
                                                        if ((j5 & 255) < 128) {
                                                            iIdentityHashCode2 = (iIdentityHashCode2 * 31) + System.identityHashCode((pu2) objArr5[(i11 << 3) + i13]);
                                                        }
                                                        j5 >>= i10;
                                                    }
                                                    if (i12 != i10) {
                                                        iIdentityHashCode = iIdentityHashCode2;
                                                        break;
                                                    }
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i11 == length2) {
                                                        break;
                                                    }
                                                    i11++;
                                                    j3 = j;
                                                    i10 = 8;
                                                }
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        r252 = r3;
                                        objArr2 = objArr4;
                                        j = j3;
                                        I = ds2.i(pu2Var.a(), vr2Var);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(I)) * 31) + Long.hashCode(I.a);
                                    r25 = r252;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                r25 = r3;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i2 = i7;
                            }
                            j3 = j >> i2;
                            i7 = i2;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            r3 = r25 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i8 != i7) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i = i3;
                        objArr = objArr4;
                    }
                    if (i6 == length) {
                        i3 = iIdentityHashCode;
                        break;
                    }
                    i6++;
                    i3 = i;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    z = false;
                }
            }
            iIdentityHashCode = i3;
            Object[] objArr6 = zk1VarL.h;
            int i14 = zk1VarL.j;
            for (int i15 = 0; i15 < i14; i15++) {
                ((fo0) objArr6[i15]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr7 = zk1VarL.h;
            int i16 = zk1VarL.j;
            for (int i17 = 0; i17 < i16; i17++) {
                ((fo0) objArr7[i17]).a();
            }
            throw th;
        }
    }
}
