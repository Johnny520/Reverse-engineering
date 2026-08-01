package okio.internal;

import java.io.EOFException;
import kotlin.text.AbstractC5132;
import p004.C6092;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5572 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long[] f15353;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final byte[] f15354;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC5132.f14688);
        bytes.getClass();
        f15354 = bytes;
        f15353 = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        return r9;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m10939(p004.C6092 r16, p004.C6109 r17, boolean r18) {
        /*
            r17.getClass()
            r0 = r16
            飘花落叶言世兰哲苏子楪.飘花落叶言子楪兰世哲苏 r0 = r0.f16648
            r1 = -1
            if (r0 != 0) goto Le
            if (r18 == 0) goto Ld
            goto L5c
        Ld:
            return r1
        Le:
            byte[] r2 = r0.f16669
            int r3 = r0.f16668
            int r4 = r0.f16667
            r5 = r17
            int[] r5 = r5.f16691
            r6 = 0
            r8 = r0
            r9 = r1
            r7 = r6
        L1c:
            int r10 = r7 + 1
            r11 = r5[r7]
            int r7 = r7 + 2
            r10 = r5[r10]
            if (r10 == r1) goto L27
            r9 = r10
        L27:
            if (r8 != 0) goto L2a
            goto L5a
        L2a:
            r10 = 0
            if (r11 >= 0) goto L72
            int r11 = r11 * (-1)
            int r12 = r11 + r7
        L31:
            int r11 = r3 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r13 = r7 + 1
            r7 = r5[r7]
            if (r3 == r7) goto L3e
            goto L7c
        L3e:
            if (r13 != r12) goto L42
            r3 = 1
            goto L43
        L42:
            r3 = r6
        L43:
            if (r11 != r4) goto L62
            r8.getClass()
            飘花落叶言世兰哲苏子楪.飘花落叶言子楪兰世哲苏 r2 = r8.f16664
            r2.getClass()
            int r4 = r2.f16668
            byte[] r7 = r2.f16669
            int r8 = r2.f16667
            if (r2 != r0) goto L5e
            if (r3 == 0) goto L5a
            r2 = r7
            r7 = r10
            goto L65
        L5a:
            if (r18 == 0) goto L7c
        L5c:
            r0 = -2
            return r0
        L5e:
            r15 = r7
            r7 = r2
            r2 = r15
            goto L65
        L62:
            r7 = r8
            r8 = r4
            r4 = r11
        L65:
            if (r3 == 0) goto L6d
            r3 = r5[r13]
            r15 = r8
            r8 = r7
            r7 = r15
            goto L9e
        L6d:
            r3 = r4
            r4 = r8
            r8 = r7
            r7 = r13
            goto L31
        L72:
            int r12 = r3 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r13 = r7 + r11
        L7a:
            if (r7 != r13) goto L7d
        L7c:
            return r9
        L7d:
            r14 = r5[r7]
            if (r3 != r14) goto La8
            int r7 = r7 + r11
            r3 = r5[r7]
            if (r12 != r4) goto L9c
            飘花落叶言世兰哲苏子楪.飘花落叶言子楪兰世哲苏 r8 = r8.f16664
            r8.getClass()
            int r2 = r8.f16668
            byte[] r4 = r8.f16669
            int r7 = r8.f16667
            if (r8 != r0) goto L98
            r8 = r4
            r4 = r2
            r2 = r8
            r8 = r10
            goto L9e
        L98:
            r15 = r4
            r4 = r2
            r2 = r15
            goto L9e
        L9c:
            r7 = r4
            r4 = r12
        L9e:
            if (r3 < 0) goto La1
            return r3
        La1:
            int r3 = -r3
            r15 = r7
            r7 = r3
            r3 = r4
            r4 = r15
            goto L1c
        La8:
            int r7 = r7 + 1
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.AbstractC5572.m10939(飘花落叶言世兰哲苏子楪.飘花落叶言子楪世兰哲苏, 飘花落叶言世兰哲苏子楪.飘花落叶言子楪哲苏兰世, boolean):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m10940(C6092 c6092, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c6092.m11486(j2) == 13) {
                String strM11477 = c6092.m11477(j2, AbstractC5132.f14688);
                c6092.skip(2L);
                return strM11477;
            }
        }
        String strM114772 = c6092.m11477(j, AbstractC5132.f14688);
        c6092.skip(1L);
        return strM114772;
    }
}
