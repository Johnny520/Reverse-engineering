package p166l2;

import p165l1.InterfaceC4507m;

/* JADX INFO: renamed from: l2.g1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4543g1 {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m17791c(p117i.C3074n0 r14, java.util.Map r15) {
        /*
            r0 = 0
            if (r14 != 0) goto L4
            return r0
        L4:
            int r1 = r14.m11569f()
            int r2 = r15.size()
            if (r1 == r2) goto Lf
            return r0
        Lf:
            java.lang.Object[] r1 = r14.f8223b
            int[] r2 = r14.f8224c
            long[] r14 = r14.f8222a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L64
            r4 = r0
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5f
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r0
        L35:
            if (r9 >= r7) goto L5d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L59
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r1[r10]
            r10 = r2[r10]
            j2.a r11 = (p135j2.AbstractC3499a) r11
            java.lang.Object r11 = r15.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 != 0) goto L52
            goto L58
        L52:
            int r11 = r11.intValue()
            if (r11 == r10) goto L59
        L58:
            return r0
        L59:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L5d:
            if (r7 != r8) goto L64
        L5f:
            if (r4 == r3) goto L64
            int r4 = r4 + 1
            goto L1b
        L64:
            r14 = 1
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p166l2.AbstractC4543g1.m17791c(i.n0, java.util.Map):boolean");
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC4507m.c m17792d(InterfaceC4553j interfaceC4553j, int i10, int i11) {
        InterfaceC4507m.c cVarM17453d2 = interfaceC4553j.mo17471z().m17453d2();
        if (cVarM17453d2 == null || (cVarM17453d2.m17452c2() & i10) == 0) {
            return null;
        }
        while (cVarM17453d2 != null) {
            int iM17457h2 = cVarM17453d2.m17457h2();
            if ((iM17457h2 & i11) != 0) {
                return null;
            }
            if ((iM17457h2 & i10) != 0) {
                return cVarM17453d2;
            }
            cVarM17453d2 = cVarM17453d2.m17453d2();
        }
        return null;
    }
}
