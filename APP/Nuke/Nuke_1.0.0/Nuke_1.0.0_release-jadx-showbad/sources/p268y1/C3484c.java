package p268y1;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import me.dartcv.nuke.BuildConfig;

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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3484c(byte[] bArr, int i5, int i6) {
        this(-1L, bArr, i5, i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C3484c m5713a(long j5, ByteOrder byteOrder) {
        long[] jArr = {j5};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C3488g.f10830C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C3484c(byteBufferWrap.array(), 4, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C3484c m5714b(C3486e c3486e, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C3488g.f10830C[5]]);
        byteBufferWrap.order(byteOrder);
        C3486e c3486e2 = new C3486e[]{c3486e}[0];
        byteBufferWrap.putInt((int) c3486e2.f10826a);
        byteBufferWrap.putInt((int) c3486e2.f10827b);
        return new C3484c(byteBufferWrap.array(), 5, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C3484c m5715c(int i5, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C3488g.f10830C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i5}[0]);
        return new C3484c(byteBufferWrap.array(), 3, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x00ac */
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
    */
    public final Serializable m5719g(ByteOrder byteOrder) throws Throwable {
        C3483b c3483b;
        InputStream inputStream;
        ?? str;
        byte b2;
        byte[] bArr = this.f10821d;
        InputStream inputStream2 = null;
        try {
            try {
                c3483b = new C3483b(bArr);
                try {
                    c3483b.f10815e = byteOrder;
                    int i5 = this.f10818a;
                    int length = 0;
                    int i6 = this.f10819b;
                    switch (i5) {
                        case BuildConfig.VERSION_CODE /* 1 */:
                        case 6:
                            if (bArr.length == 1 && (b2 = bArr[0]) >= 0 && b2 <= 1) {
                                String str2 = new String(new char[]{(char) (b2 + 48)});
                                try {
                                    c3483b.close();
                                    return str2;
                                } catch (IOException e5) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                    return str2;
                                }
                            }
                            str = new String(bArr, C3488g.f10839L);
                            break;
                            break;
                        case 2:
                        case 7:
                            if (i6 >= C3488g.f10831D.length) {
                                int i7 = 0;
                                while (true) {
                                    byte[] bArr2 = C3488g.f10831D;
                                    if (i7 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i7] == bArr2[i7]) {
                                        i7++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i6) {
                                byte b5 = bArr[length];
                                if (b5 == 0) {
                                    str = sb.toString();
                                } else {
                                    if (b5 >= 32) {
                                        sb.append((char) b5);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                break;
                            }
                            str = sb.toString();
                            break;
                        case 3:
                            str = new int[i6];
                            while (length < i6) {
                                str[length] = c3483b.readUnsignedShort();
                                length++;
                            }
                            break;
                        case 4:
                            str = new long[i6];
                            while (length < i6) {
                                str[length] = ((long) c3483b.readInt()) & 4294967295L;
                                length++;
                            }
                            break;
                        case 5:
                            str = new C3486e[i6];
                            while (length < i6) {
                                str[length] = new C3486e(((long) c3483b.readInt()) & 4294967295L, ((long) c3483b.readInt()) & 4294967295L);
                                length++;
                            }
                            break;
                        case 8:
                            str = new int[i6];
                            while (length < i6) {
                                str[length] = c3483b.readShort();
                                length++;
                            }
                            break;
                        case 9:
                            str = new int[i6];
                            while (length < i6) {
                                str[length] = c3483b.readInt();
                                length++;
                            }
                            break;
                        case 10:
                            str = new C3486e[i6];
                            while (length < i6) {
                                str[length] = new C3486e(c3483b.readInt(), c3483b.readInt());
                                length++;
                            }
                            break;
                        case 11:
                            str = new double[i6];
                            while (length < i6) {
                                str[length] = c3483b.readFloat();
                                length++;
                            }
                            break;
                        case 12:
                            str = new double[i6];
                            while (length < i6) {
                                str[length] = c3483b.readDouble();
                                length++;
                            }
                            break;
                        default:
                            try {
                                c3483b.close();
                                return null;
                            } catch (IOException e6) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                return null;
                            }
                    }
                    try {
                        c3483b.close();
                        return str;
                    } catch (IOException e7) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                        return str;
                    }
                } catch (IOException e8) {
                    e = e8;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c3483b != null) {
                        try {
                            c3483b.close();
                        } catch (IOException e9) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
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
                    } catch (IOException e10) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                    }
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            c3483b = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + C3488g.f10829B[this.f10818a] + ", data length:" + this.f10821d.length + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3484c(long j5, byte[] bArr, int i5, int i6) {
        this.f10818a = i5;
        this.f10819b = i6;
        this.f10820c = j5;
        this.f10821d = bArr;
    }
}
