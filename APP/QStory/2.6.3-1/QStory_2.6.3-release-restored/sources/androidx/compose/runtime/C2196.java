package androidx.compose.runtime;

import androidx.collection.AbstractC1081;
import androidx.collection.C1099;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.snapshots.AbstractC2090;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.InterfaceC2092;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2196 extends AbstractC2090 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Object f4280 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f4281;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C1099 f4282;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f4283;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f4284;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f4285;

    public C2196(long j) {
        super(j);
        C1099 c1099 = AbstractC1081.f1219;
        c1099.getClass();
        this.f4282 = c1099;
        this.f4281 = f4280;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[PHI: r11
  0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v10, types: [androidx.compose.runtime.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r13v5, types: [androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏] */
    /* JADX WARN: Type inference failed for: r13v6, types: [androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏, java.lang.Object] */
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
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2999(C2197 c2197, AbstractC2121 abstractC2121) {
        C1099 c1099;
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
        ?? M2839;
        synchronized (AbstractC2115.f4090) {
            c1099 = this.f4282;
        }
        int i3 = 7;
        if (c1099.f1259 == 0) {
            return 7;
        }
        C2059 c2059M3055 = AbstractC2202.m3055();
        Object[] objArr3 = c2059M3055.f3866;
        int i4 = c2059M3055.f3865;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            ((C2148) objArr3[i5]).m2870();
        }
        try {
            Object[] objArr4 = c1099.f1262;
            int[] iArr = c1099.f1261;
            long[] jArr3 = c1099.f1263;
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
                                InterfaceC2092 interfaceC2092 = (InterfaceC2092) objArr4[i9];
                                int i10 = i7;
                                if (iArr[i9] != 1) {
                                    jArr2 = jArr3;
                                    r25 = r3;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (interfaceC2092 instanceof C2197) {
                                        C2197 c21972 = (C2197) interfaceC2092;
                                        M2839 = c21972.m3001((C2196) AbstractC2115.m2839(c21972.f4286, abstractC2121), abstractC2121, z, c21972.f4287);
                                        C1099 c10992 = M2839.f4282;
                                        Object[] objArr5 = c10992.f1262;
                                        long[] jArr4 = c10992.f1263;
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
                                                            iIdentityHashCode2 = (iIdentityHashCode2 * 31) + System.identityHashCode((InterfaceC2092) objArr5[(i11 << 3) + i13]);
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
                                        M2839 = AbstractC2115.m2839(interfaceC2092.mo2753(), abstractC2121);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(M2839)) * 31) + Long.hashCode(M2839.f3992);
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
            Object[] objArr6 = c2059M3055.f3866;
            int i14 = c2059M3055.f3865;
            for (int i15 = 0; i15 < i14; i15++) {
                ((C2148) objArr6[i15]).m2871();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr7 = c2059M3055.f3866;
            int i16 = c2059M3055.f3865;
            for (int i17 = 0; i17 < i16; i17++) {
                ((C2148) objArr7[i17]).m2871();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3000(C2197 c2197, AbstractC2121 abstractC2121) {
        boolean z;
        boolean z2;
        Object obj = AbstractC2115.f4090;
        synchronized (obj) {
            z = true;
            if (this.f4284 == abstractC2121.mo2770()) {
                z2 = this.f4283 != abstractC2121.mo2783();
            }
        }
        if (this.f4281 == f4280 || (z2 && this.f4285 != m2999(c2197, abstractC2121))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.f4284 = abstractC2121.mo2770();
            this.f4283 = abstractC2121.mo2783();
        }
        return z;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2090
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2090 mo2756(long j) {
        return new C2196(j);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2090
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2757(AbstractC2090 abstractC2090) {
        abstractC2090.getClass();
        C2196 c2196 = (C2196) abstractC2090;
        this.f4282 = c2196.f4282;
        this.f4281 = c2196.f4281;
        this.f4285 = c2196.f4285;
    }
}
