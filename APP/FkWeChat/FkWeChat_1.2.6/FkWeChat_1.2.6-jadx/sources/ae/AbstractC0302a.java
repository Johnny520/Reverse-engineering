package ae;

import java.io.EOFException;
import p376zd.AbstractC9978b;
import p376zd.AbstractC9986d1;
import p376zd.C10003m;
import p376zd.C10010p0;
import p376zd.C10012q0;
import p376zd.C9987e;
import p376zd.C9991g;
import p376zd.C9995i;
import p376zd.C9996i0;

/* JADX INFO: renamed from: ae.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0302a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f737a = AbstractC9986d1.m38642a("0123456789abcdef");

    /* JADX INFO: renamed from: b */
    public static final long[] f738b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    /* JADX INFO: renamed from: b */
    public static final long m897b(C9995i c9995i, C10003m c10003m, long j10, long j11, int i10, int i11) {
        C10012q0 c10012q0;
        long j12 = j10;
        long size = j11;
        c9995i.getClass();
        c10003m.getClass();
        long j13 = i11;
        AbstractC9978b.m38615b(c10003m.m38765G(), i10, j13);
        if (i11 <= 0) {
            C9987e.m38645a("byteCount == 0");
            return 0L;
        }
        long j14 = 0;
        if (j12 < 0) {
            C9991g.m38662a("fromIndex < 0: ", j12);
            return 0L;
        }
        if (j12 > size) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j12 + " > " + size).toString());
        }
        if (size > c9995i.size()) {
            size = c9995i.size();
        }
        long j15 = -1;
        if (j12 == size || (c10012q0 = c9995i.f33561q) == null) {
            return -1L;
        }
        if (c9995i.size() - j12 >= j12) {
            while (true) {
                long j16 = ((long) (c10012q0.f33618c - c10012q0.f33617b)) + j14;
                if (j16 > j12) {
                    break;
                }
                c10012q0 = c10012q0.f33621f;
                c10012q0.getClass();
                j14 = j16;
            }
            byte[] bArrMo38785u = c10003m.mo38785u();
            byte b10 = bArrMo38785u[i10];
            long jMin = Math.min(size, (c9995i.size() - j13) + 1);
            while (j14 < jMin) {
                byte[] bArr = c10012q0.f33616a;
                int iMin = (int) Math.min(c10012q0.f33618c, (((long) c10012q0.f33617b) + jMin) - j14);
                for (int i12 = (int) ((((long) c10012q0.f33617b) + j12) - j14); i12 < iMin; i12++) {
                    if (bArr[i12] == b10 && m902g(c10012q0, i12 + 1, bArrMo38785u, i10 + 1, i11)) {
                        return ((long) (i12 - c10012q0.f33617b)) + j14;
                    }
                }
                j14 += (long) (c10012q0.f33618c - c10012q0.f33617b);
                c10012q0 = c10012q0.f33621f;
                c10012q0.getClass();
                j12 = j14;
            }
            return -1L;
        }
        long size2 = c9995i.size();
        while (size2 > j12) {
            c10012q0 = c10012q0.f33622g;
            c10012q0.getClass();
            size2 -= (long) (c10012q0.f33618c - c10012q0.f33617b);
            j15 = j15;
        }
        long j17 = j15;
        byte[] bArrMo38785u2 = c10003m.mo38785u();
        byte b11 = bArrMo38785u2[i10];
        long jMin2 = Math.min(size, (c9995i.size() - j13) + 1);
        while (size2 < jMin2) {
            byte[] bArr2 = c10012q0.f33616a;
            int iMin2 = (int) Math.min(c10012q0.f33618c, (((long) c10012q0.f33617b) + jMin2) - size2);
            for (int i13 = (int) ((((long) c10012q0.f33617b) + j12) - size2); i13 < iMin2; i13++) {
                if (bArr2[i13] == b11 && m902g(c10012q0, i13 + 1, bArrMo38785u2, i10 + 1, i11)) {
                    return ((long) (i13 - c10012q0.f33617b)) + size2;
                }
            }
            size2 += (long) (c10012q0.f33618c - c10012q0.f33617b);
            c10012q0 = c10012q0.f33621f;
            c10012q0.getClass();
            j12 = size2;
        }
        return j17;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ long m898c(C9995i c9995i, C10003m c10003m, long j10, long j11, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return m897b(c9995i, c10003m, j10, j11, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? c10003m.m38765G() : i11);
    }

    /* JADX INFO: renamed from: d */
    public static final C9995i.a m899d(C9995i c9995i, C9995i.a aVar) {
        c9995i.getClass();
        aVar.getClass();
        C9995i.a aVarM38620g = AbstractC9978b.m38620g(aVar);
        if (aVarM38620g.f33563q != null) {
            C10010p0.m38820a("already attached to a buffer");
            return null;
        }
        aVarM38620g.f33563q = c9995i;
        aVarM38620g.f33564r = true;
        return aVarM38620g;
    }

    /* JADX INFO: renamed from: e */
    public static final int m900e(long j10) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j10)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j10 > f738b[iNumberOfLeadingZeros] ? 1 : 0);
    }

    /* JADX INFO: renamed from: f */
    public static final byte[] m901f() {
        return f737a;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m902g(C10012q0 c10012q0, int i10, byte[] bArr, int i11, int i12) {
        c10012q0.getClass();
        bArr.getClass();
        int i13 = c10012q0.f33618c;
        byte[] bArr2 = c10012q0.f33616a;
        while (i11 < i12) {
            if (i10 == i13) {
                c10012q0 = c10012q0.f33621f;
                c10012q0.getClass();
                byte[] bArr3 = c10012q0.f33616a;
                bArr2 = bArr3;
                i10 = c10012q0.f33617b;
                i13 = c10012q0.f33618c;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static final String m903h(C9995i c9995i, long j10) throws EOFException {
        c9995i.getClass();
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c9995i.m38716l(j11) == 13) {
                String strMo38726s = c9995i.mo38726s(j11);
                c9995i.skip(2L);
                return strMo38726s;
            }
        }
        String strMo38726s2 = c9995i.mo38726s(j10);
        c9995i.skip(1L);
        return strMo38726s2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r19 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[LOOP:0: B:8:0x0020->B:46:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e A[SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m904i(p376zd.C9995i r17, p376zd.C9996i0 r18, boolean r19) {
        /*
            r17.getClass()
            r18.getClass()
            r0 = r17
            zd.q0 r0 = r0.f33561q
            r1 = -2
            r2 = -1
            if (r0 != 0) goto L12
            if (r19 == 0) goto L11
            return r1
        L11:
            return r2
        L12:
            byte[] r3 = r0.f33616a
            int r4 = r0.f33617b
            int r5 = r0.f33618c
            int[] r6 = r18.m38747p()
            r7 = 0
            r9 = r0
            r10 = r2
            r8 = r7
        L20:
            int r11 = r8 + 1
            r12 = r6[r8]
            int r8 = r8 + 2
            r11 = r6[r11]
            if (r11 == r2) goto L2b
            r10 = r11
        L2b:
            if (r9 != 0) goto L2e
            goto L5e
        L2e:
            r11 = 0
            if (r12 >= 0) goto L77
            int r12 = r12 * (-1)
            int r13 = r8 + r12
        L35:
            int r12 = r4 + 1
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r14 = r8 + 1
            r8 = r6[r8]
            if (r4 == r8) goto L42
            goto L81
        L42:
            if (r14 != r13) goto L46
            r4 = 1
            goto L47
        L46:
            r4 = r7
        L47:
            if (r12 != r5) goto L67
            r9.getClass()
            zd.q0 r3 = r9.f33621f
            r3.getClass()
            int r5 = r3.f33617b
            byte[] r8 = r3.f33616a
            int r9 = r3.f33618c
            if (r3 != r0) goto L61
            if (r4 == 0) goto L5e
            r3 = r8
            r8 = r11
            goto L6a
        L5e:
            if (r19 == 0) goto L81
            return r1
        L61:
            r16 = r8
            r8 = r3
            r3 = r16
            goto L6a
        L67:
            r8 = r9
            r9 = r5
            r5 = r12
        L6a:
            if (r4 == 0) goto L72
            r4 = r6[r14]
            r13 = r5
            r5 = r9
            r9 = r8
            goto L9c
        L72:
            r4 = r5
            r5 = r9
            r9 = r8
            r8 = r14
            goto L35
        L77:
            int r13 = r4 + 1
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r14 = r8 + r12
        L7f:
            if (r8 != r14) goto L82
        L81:
            return r10
        L82:
            r15 = r6[r8]
            if (r4 != r15) goto La3
            int r8 = r8 + r12
            r4 = r6[r8]
            if (r13 != r5) goto L9c
            zd.q0 r9 = r9.f33621f
            r9.getClass()
            int r3 = r9.f33617b
            byte[] r5 = r9.f33616a
            int r8 = r9.f33618c
            r13 = r3
            r3 = r5
            r5 = r8
            if (r9 != r0) goto L9c
            r9 = r11
        L9c:
            if (r4 < 0) goto L9f
            return r4
        L9f:
            int r8 = -r4
            r4 = r13
            goto L20
        La3:
            int r8 = r8 + 1
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.AbstractC0302a.m904i(zd.i, zd.i0, boolean):int");
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m905j(C9995i c9995i, C9996i0 c9996i0, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m904i(c9995i, c9996i0, z10);
    }
}
