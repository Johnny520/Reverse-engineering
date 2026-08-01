package p158;

import androidx.activity.AbstractC0053;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7628 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final byte[] f20667;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f20668;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20669;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f20670;

    public C7628(long j, byte[] bArr, int i, int i2) {
        this.f20670 = i;
        this.f20669 = i2;
        this.f20668 = j;
        this.f20667 = bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C7628 m12859(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7632.f20696[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C7628(3, byteBufferWrap.array(), 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C7628 m12860(C7626 c7626, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7632.f20696[5]]);
        byteBufferWrap.order(byteOrder);
        C7626 c76262 = new C7626[]{c7626}[0];
        byteBufferWrap.putInt((int) c76262.f20662);
        byteBufferWrap.putInt((int) c76262.f20661);
        return new C7628(5, byteBufferWrap.array(), 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7628 m12861(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7632.f20696[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C7628(4, byteBufferWrap.array(), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C7632.f20697[this.f20670]);
        sb.append(", data length:");
        return AbstractC0053.m147(sb, ")", this.f20667.length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String m12862(ByteOrder byteOrder) throws Throwable {
        Object objM12865 = m12865(byteOrder);
        if (objM12865 == null) {
            return null;
        }
        if (objM12865 instanceof String) {
            return (String) objM12865;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM12865 instanceof long[]) {
            long[] jArr = (long[]) objM12865;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM12865 instanceof int[]) {
            int[] iArr = (int[]) objM12865;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM12865 instanceof double[]) {
            double[] dArr = (double[]) objM12865;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM12865 instanceof C7626[])) {
            return null;
        }
        C7626[] c7626Arr = (C7626[]) objM12865;
        while (i < c7626Arr.length) {
            sb.append(c7626Arr[i].f20662);
            sb.append('/');
            sb.append(c7626Arr[i].f20661);
            i++;
            if (i != c7626Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m12863(ByteOrder byteOrder) throws Throwable {
        Object objM12865 = m12865(byteOrder);
        if (objM12865 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM12865 instanceof String) {
            return Integer.parseInt((String) objM12865);
        }
        if (objM12865 instanceof long[]) {
            long[] jArr = (long[]) objM12865;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM12865 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM12865;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double m12864(ByteOrder byteOrder) throws Throwable {
        Object objM12865 = m12865(byteOrder);
        if (objM12865 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM12865 instanceof String) {
            return Double.parseDouble((String) objM12865);
        }
        if (objM12865 instanceof long[]) {
            if (((long[]) objM12865).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM12865 instanceof int[]) {
            if (((int[]) objM12865).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM12865 instanceof double[]) {
            double[] dArr = (double[]) objM12865;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM12865 instanceof C7626[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C7626[] c7626Arr = (C7626[]) objM12865;
        if (c7626Arr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C7626 c7626 = c7626Arr[0];
        return c7626.f20662 / c7626.f20661;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [飘花落叶言子哲兰楪世苏.飘花落叶言子楪世兰苏哲[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [飘花落叶言子哲兰楪世苏.飘花落叶言子楪世兰苏哲[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m12865(java.nio.ByteOrder r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158.C7628.m12865(java.nio.ByteOrder):java.io.Serializable");
    }

    public C7628(int i, byte[] bArr, int i2) {
        this(-1L, bArr, i, i2);
    }
}
