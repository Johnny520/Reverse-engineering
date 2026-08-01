package p158;

import androidx.activity.AbstractC0053;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7627 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final byte[] f20672;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f20673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f20675;

    public C7627(long j, byte[] bArr, int i, int i2) {
        this.f20675 = i;
        this.f20674 = i2;
        this.f20673 = j;
        this.f20672 = bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C7627 m12830(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7631.f20701[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C7627(3, byteBufferWrap.array(), 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C7627 m12831(C7625 c7625, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7631.f20701[5]]);
        byteBufferWrap.order(byteOrder);
        C7625 c76252 = new C7625[]{c7625}[0];
        byteBufferWrap.putInt((int) c76252.f20667);
        byteBufferWrap.putInt((int) c76252.f20666);
        return new C7627(5, byteBufferWrap.array(), 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7627 m12832(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7631.f20701[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C7627(4, byteBufferWrap.array(), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C7631.f20702[this.f20675]);
        sb.append(", data length:");
        return AbstractC0053.m147(sb, ")", this.f20672.length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String m12833(ByteOrder byteOrder) throws Throwable {
        Object objM12836 = m12836(byteOrder);
        if (objM12836 == null) {
            return null;
        }
        if (objM12836 instanceof String) {
            return (String) objM12836;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM12836 instanceof long[]) {
            long[] jArr = (long[]) objM12836;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM12836 instanceof int[]) {
            int[] iArr = (int[]) objM12836;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM12836 instanceof double[]) {
            double[] dArr = (double[]) objM12836;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM12836 instanceof C7625[])) {
            return null;
        }
        C7625[] c7625Arr = (C7625[]) objM12836;
        while (i < c7625Arr.length) {
            sb.append(c7625Arr[i].f20667);
            sb.append('/');
            sb.append(c7625Arr[i].f20666);
            i++;
            if (i != c7625Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m12834(ByteOrder byteOrder) throws Throwable {
        Object objM12836 = m12836(byteOrder);
        if (objM12836 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM12836 instanceof String) {
            return Integer.parseInt((String) objM12836);
        }
        if (objM12836 instanceof long[]) {
            long[] jArr = (long[]) objM12836;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM12836 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM12836;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double m12835(ByteOrder byteOrder) throws Throwable {
        Object objM12836 = m12836(byteOrder);
        if (objM12836 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM12836 instanceof String) {
            return Double.parseDouble((String) objM12836);
        }
        if (objM12836 instanceof long[]) {
            if (((long[]) objM12836).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM12836 instanceof int[]) {
            if (((int[]) objM12836).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM12836 instanceof double[]) {
            double[] dArr = (double[]) objM12836;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM12836 instanceof C7625[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C7625[] c7625Arr = (C7625[]) objM12836;
        if (c7625Arr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C7625 c7625 = c7625Arr[0];
        return c7625.f20667 / c7625.f20666;
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
    public final java.io.Serializable m12836(java.nio.ByteOrder r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158.C7627.m12836(java.nio.ByteOrder):java.io.Serializable");
    }

    public C7627(int i, byte[] bArr, int i2) {
        this(-1L, bArr, i, i2);
    }
}
