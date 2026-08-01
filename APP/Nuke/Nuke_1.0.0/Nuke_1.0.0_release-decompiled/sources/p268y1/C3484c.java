package p268y1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: y1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3484c {

    /* JADX INFO: renamed from: a */
    public final int f10818a;

    /* JADX INFO: renamed from: b */
    public final int f10819b;

    /* JADX INFO: renamed from: c */
    public final long f10820c;

    /* JADX INFO: renamed from: d */
    public final byte[] f10821d;

    public C3484c(byte[] bArr, int i5, int i6) {
        this(-1L, bArr, i5, i6);
    }

    /* JADX INFO: renamed from: a */
    public static C3484c m5713a(long j5, ByteOrder byteOrder) {
        long[] jArr = {j5};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C3488g.f10830C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C3484c(byteBufferWrap.array(), 4, 1);
    }

    /* JADX INFO: renamed from: b */
    public static C3484c m5714b(C3486e c3486e, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C3488g.f10830C[5]]);
        byteBufferWrap.order(byteOrder);
        C3486e c3486e2 = new C3486e[]{c3486e}[0];
        byteBufferWrap.putInt((int) c3486e2.f10826a);
        byteBufferWrap.putInt((int) c3486e2.f10827b);
        return new C3484c(byteBufferWrap.array(), 5, 1);
    }

    /* JADX INFO: renamed from: c */
    public static C3484c m5715c(int i5, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C3488g.f10830C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i5}[0]);
        return new C3484c(byteBufferWrap.array(), 3, 1);
    }

    /* JADX INFO: renamed from: d */
    public final double m5716d(ByteOrder byteOrder) throws Throwable {
        Object objM5719g = m5719g(byteOrder);
        if (objM5719g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM5719g instanceof String) {
            return Double.parseDouble((String) objM5719g);
        }
        if (objM5719g instanceof long[]) {
            if (((long[]) objM5719g).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM5719g instanceof int[]) {
            if (((int[]) objM5719g).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM5719g instanceof double[]) {
            double[] dArr = (double[]) objM5719g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM5719g instanceof C3486e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C3486e[] c3486eArr = (C3486e[]) objM5719g;
        if (c3486eArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C3486e c3486e = c3486eArr[0];
        return c3486e.f10826a / c3486e.f10827b;
    }

    /* JADX INFO: renamed from: e */
    public final int m5717e(ByteOrder byteOrder) throws Throwable {
        Object objM5719g = m5719g(byteOrder);
        if (objM5719g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM5719g instanceof String) {
            return Integer.parseInt((String) objM5719g);
        }
        if (objM5719g instanceof long[]) {
            long[] jArr = (long[]) objM5719g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM5719g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM5719g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: f */
    public final String m5718f(ByteOrder byteOrder) throws Throwable {
        Object objM5719g = m5719g(byteOrder);
        if (objM5719g == null) {
            return null;
        }
        if (objM5719g instanceof String) {
            return (String) objM5719g;
        }
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        if (objM5719g instanceof long[]) {
            long[] jArr = (long[]) objM5719g;
            while (i5 < jArr.length) {
                sb.append(jArr[i5]);
                i5++;
                if (i5 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM5719g instanceof int[]) {
            int[] iArr = (int[]) objM5719g;
            while (i5 < iArr.length) {
                sb.append(iArr[i5]);
                i5++;
                if (i5 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM5719g instanceof double[]) {
            double[] dArr = (double[]) objM5719g;
            while (i5 < dArr.length) {
                sb.append(dArr[i5]);
                i5++;
                if (i5 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM5719g instanceof C3486e[])) {
            return null;
        }
        C3486e[] c3486eArr = (C3486e[]) objM5719g;
        while (i5 < c3486eArr.length) {
            sb.append(c3486eArr[i5].f10826a);
            sb.append('/');
            sb.append(c3486eArr[i5].f10827b);
            i5++;
            if (i5 != c3486eArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [y1.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [y1.e[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m5719g(java.nio.ByteOrder r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p268y1.C3484c.m5719g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        return "(" + C3488g.f10829B[this.f10818a] + ", data length:" + this.f10821d.length + ")";
    }

    public C3484c(long j5, byte[] bArr, int i5, int i6) {
        this.f10818a = i5;
        this.f10819b = i6;
        this.f10820c = j5;
        this.f10821d = bArr;
    }
}
