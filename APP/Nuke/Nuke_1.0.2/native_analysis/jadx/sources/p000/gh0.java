package p000;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gh0 {

    /* JADX INFO: renamed from: a */
    public final int f3523a;

    /* JADX INFO: renamed from: b */
    public final int f3524b;

    /* JADX INFO: renamed from: c */
    public final long f3525c;

    /* JADX INFO: renamed from: d */
    public final byte[] f3526d;

    public gh0(long j, byte[] bArr, int i, int i2) {
        this.f3523a = i;
        this.f3524b = i2;
        this.f3525c = j;
        this.f3526d = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static gh0 m1916a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[kh0.f5537C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new gh0(byteBufferWrap.array(), 4, 1);
    }

    /* JADX INFO: renamed from: b */
    public static gh0 m1917b(ih0 ih0Var, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[kh0.f5537C[5]]);
        byteBufferWrap.order(byteOrder);
        ih0 ih0Var2 = new ih0[]{ih0Var}[0];
        byteBufferWrap.putInt((int) ih0Var2.f4614a);
        byteBufferWrap.putInt((int) ih0Var2.f4615b);
        return new gh0(byteBufferWrap.array(), 5, 1);
    }

    /* JADX INFO: renamed from: c */
    public static gh0 m1918c(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[kh0.f5537C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new gh0(byteBufferWrap.array(), 3, 1);
    }

    /* JADX INFO: renamed from: d */
    public final double m1919d(ByteOrder byteOrder) throws Throwable {
        Object objM1922g = m1922g(byteOrder);
        if (objM1922g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM1922g instanceof String) {
            return Double.parseDouble((String) objM1922g);
        }
        if (objM1922g instanceof long[]) {
            if (((long[]) objM1922g).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM1922g instanceof int[]) {
            if (((int[]) objM1922g).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM1922g instanceof double[]) {
            double[] dArr = (double[]) objM1922g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM1922g instanceof ih0[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        ih0[] ih0VarArr = (ih0[]) objM1922g;
        if (ih0VarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        ih0 ih0Var = ih0VarArr[0];
        return ih0Var.f4614a / ih0Var.f4615b;
    }

    /* JADX INFO: renamed from: e */
    public final int m1920e(ByteOrder byteOrder) throws Throwable {
        Object objM1922g = m1922g(byteOrder);
        if (objM1922g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM1922g instanceof String) {
            return Integer.parseInt((String) objM1922g);
        }
        if (objM1922g instanceof long[]) {
            long[] jArr = (long[]) objM1922g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM1922g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM1922g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: f */
    public final String m1921f(ByteOrder byteOrder) throws Throwable {
        Object objM1922g = m1922g(byteOrder);
        if (objM1922g == null) {
            return null;
        }
        if (objM1922g instanceof String) {
            return (String) objM1922g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM1922g instanceof long[]) {
            long[] jArr = (long[]) objM1922g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM1922g instanceof int[]) {
            int[] iArr = (int[]) objM1922g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM1922g instanceof double[]) {
            double[] dArr = (double[]) objM1922g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM1922g instanceof ih0[])) {
            return null;
        }
        ih0[] ih0VarArr = (ih0[]) objM1922g;
        while (i < ih0VarArr.length) {
            sb.append(ih0VarArr[i].f4614a);
            sb.append('/');
            sb.append(ih0VarArr[i].f4615b);
            i++;
            if (i != ih0VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [ih0[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [ih0[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m1922g(ByteOrder byteOrder) throws Throwable {
        fh0 fh0Var;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.f3526d;
        InputStream inputStream2 = null;
        try {
            try {
                fh0Var = new fh0(bArr);
                try {
                    fh0Var.f3003i = byteOrder;
                    int i = this.f3523a;
                    int length = 0;
                    int i2 = this.f3524b;
                    switch (i) {
                        case 1:
                        case AIChatConfig.DefaultContextRounds /* 6 */:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, kh0.f5546L);
                                try {
                                    fh0Var.close();
                                    return str;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                fh0Var.close();
                                return str2;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i2 >= kh0.f5538D.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = kh0.f5538D;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    fh0Var.close();
                                    return str;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            str = sb.toString();
                            fh0Var.close();
                            return str;
                        case 3:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = fh0Var.readUnsignedShort();
                                length++;
                            }
                            try {
                                fh0Var.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i2];
                            while (length < i2) {
                                r13[length] = ((long) fh0Var.readInt()) & 4294967295L;
                                length++;
                            }
                            fh0Var.close();
                            return r13;
                        case 5:
                            r13 = new ih0[i2];
                            while (length < i2) {
                                r13[length] = new ih0(((long) fh0Var.readInt()) & 4294967295L, ((long) fh0Var.readInt()) & 4294967295L);
                                length++;
                            }
                            fh0Var.close();
                            return r13;
                        case 8:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = fh0Var.readShort();
                                length++;
                            }
                            fh0Var.close();
                            return r13;
                        case 9:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = fh0Var.readInt();
                                length++;
                            }
                            fh0Var.close();
                            return r13;
                        case 10:
                            r13 = new ih0[i2];
                            while (length < i2) {
                                r13[length] = new ih0(fh0Var.readInt(), fh0Var.readInt());
                                length++;
                            }
                            fh0Var.close();
                            return r13;
                        case 11:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = fh0Var.readFloat();
                                length++;
                            }
                            fh0Var.close();
                            return r13;
                        case 12:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = fh0Var.readDouble();
                                length++;
                            }
                            fh0Var.close();
                            return r13;
                        default:
                            try {
                                fh0Var.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (fh0Var != null) {
                        try {
                            fh0Var.close();
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e7) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            fh0Var = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + kh0.f5536B[this.f3523a] + ", data length:" + this.f3526d.length + ")";
    }

    public gh0(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }
}
