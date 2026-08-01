package p215o4;

import java.io.EOFException;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1973a;
import p208n4.C2706e;

/* JADX INFO: renamed from: o4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2802a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f8825a;

    /* JADX INFO: renamed from: b */
    public static final long[] f8826b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC1973a.f6662a);
        AbstractC1665j.m2984d(bytes, "getBytes(...)");
        f8825a = bytes;
        f8826b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    /* JADX INFO: renamed from: a */
    public static final String m4986a(C2706e c2706e, long j5) throws EOFException {
        if (j5 > 0) {
            long j6 = j5 - 1;
            if (c2706e.m4721n(j6) == 13) {
                String strM4730x = c2706e.m4730x(j6, AbstractC1973a.f6662a);
                c2706e.skip(2L);
                return strM4730x;
            }
        }
        String strM4730x2 = c2706e.m4730x(j5, AbstractC1973a.f6662a);
        c2706e.skip(1L);
        return strM4730x2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        return r9;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m4987b(p208n4.C2706e r16, p208n4.C2714m r17, boolean r18) {
        /*
            r0 = r17
            java.lang.String r1 = "options"
            p117X2.AbstractC1665j.m2985e(r0, r1)
            r1 = r16
            n4.p r1 = r1.f8628d
            r2 = -1
            if (r1 != 0) goto L12
            if (r18 == 0) goto L11
            goto L5e
        L11:
            return r2
        L12:
            byte[] r3 = r1.f8653a
            int r4 = r1.f8654b
            int r5 = r1.f8655c
            int[] r0 = r0.f8646e
            r6 = 0
            r8 = r1
            r9 = r2
            r7 = r6
        L1e:
            int r10 = r7 + 1
            r11 = r0[r7]
            int r7 = r7 + 2
            r10 = r0[r10]
            if (r10 == r2) goto L29
            r9 = r10
        L29:
            if (r8 != 0) goto L2c
            goto L5c
        L2c:
            r10 = 0
            if (r11 >= 0) goto L74
            int r11 = r11 * (-1)
            int r12 = r11 + r7
        L33:
            int r11 = r4 + 1
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r13 = r7 + 1
            r7 = r0[r7]
            if (r4 == r7) goto L40
            goto L7e
        L40:
            if (r13 != r12) goto L44
            r4 = 1
            goto L45
        L44:
            r4 = r6
        L45:
            if (r11 != r5) goto L64
            p117X2.AbstractC1665j.m2982b(r8)
            n4.p r3 = r8.f8658f
            p117X2.AbstractC1665j.m2982b(r3)
            int r5 = r3.f8654b
            byte[] r7 = r3.f8653a
            int r8 = r3.f8655c
            if (r3 != r1) goto L60
            if (r4 == 0) goto L5c
            r3 = r7
            r7 = r10
            goto L67
        L5c:
            if (r18 == 0) goto L7e
        L5e:
            r0 = -2
            return r0
        L60:
            r15 = r7
            r7 = r3
            r3 = r15
            goto L67
        L64:
            r7 = r8
            r8 = r5
            r5 = r11
        L67:
            if (r4 == 0) goto L6f
            r4 = r0[r13]
            r15 = r8
            r8 = r7
            r7 = r15
            goto La0
        L6f:
            r4 = r5
            r5 = r8
            r8 = r7
            r7 = r13
            goto L33
        L74:
            int r12 = r4 + 1
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r13 = r7 + r11
        L7c:
            if (r7 != r13) goto L7f
        L7e:
            return r9
        L7f:
            r14 = r0[r7]
            if (r4 != r14) goto Laa
            int r7 = r7 + r11
            r4 = r0[r7]
            if (r12 != r5) goto L9e
            n4.p r8 = r8.f8658f
            p117X2.AbstractC1665j.m2982b(r8)
            int r3 = r8.f8654b
            byte[] r5 = r8.f8653a
            int r7 = r8.f8655c
            if (r8 != r1) goto L9a
            r8 = r5
            r5 = r3
            r3 = r8
            r8 = r10
            goto La0
        L9a:
            r15 = r5
            r5 = r3
            r3 = r15
            goto La0
        L9e:
            r7 = r5
            r5 = r12
        La0:
            if (r4 < 0) goto La3
            return r4
        La3:
            int r4 = -r4
            r15 = r7
            r7 = r4
            r4 = r5
            r5 = r15
            goto L1e
        Laa:
            int r7 = r7 + 1
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: p215o4.AbstractC2802a.m4987b(n4.e, n4.m, boolean):int");
    }
}
