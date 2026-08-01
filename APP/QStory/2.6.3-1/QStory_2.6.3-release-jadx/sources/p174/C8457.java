package p174;

import android.util.Log;
import androidx.activity.AbstractC0900;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8457 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final byte[] f21012;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f21013;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f21014;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21015;

    public C8457(long j, byte[] bArr, int i, int i2) {
        this.f21015 = i;
        this.f21014 = i2;
        this.f21013 = j;
        this.f21012 = bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C8457 m13418(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C8461.f21041[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C8457(3, byteBufferWrap.array(), 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C8457 m13419(C8455 c8455, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C8461.f21041[5]]);
        byteBufferWrap.order(byteOrder);
        C8455 c84552 = new C8455[]{c8455}[0];
        byteBufferWrap.putInt((int) c84552.f21007);
        byteBufferWrap.putInt((int) c84552.f21006);
        return new C8457(5, byteBufferWrap.array(), 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8457 m13420(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C8461.f21041[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C8457(4, byteBufferWrap.array(), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C8461.f21042[this.f21015]);
        sb.append(", data length:");
        return AbstractC0900.m707(sb, ")", this.f21012.length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String m13421(ByteOrder byteOrder) throws Throwable {
        Object objM13424 = m13424(byteOrder);
        if (objM13424 == null) {
            return null;
        }
        if (objM13424 instanceof String) {
            return (String) objM13424;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM13424 instanceof long[]) {
            long[] jArr = (long[]) objM13424;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM13424 instanceof int[]) {
            int[] iArr = (int[]) objM13424;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM13424 instanceof double[]) {
            double[] dArr = (double[]) objM13424;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM13424 instanceof C8455[])) {
            return null;
        }
        C8455[] c8455Arr = (C8455[]) objM13424;
        while (i < c8455Arr.length) {
            sb.append(c8455Arr[i].f21007);
            sb.append('/');
            sb.append(c8455Arr[i].f21006);
            i++;
            if (i != c8455Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m13422(ByteOrder byteOrder) throws Throwable {
        Object objM13424 = m13424(byteOrder);
        if (objM13424 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM13424 instanceof String) {
            return Integer.parseInt((String) objM13424);
        }
        if (objM13424 instanceof long[]) {
            long[] jArr = (long[]) objM13424;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM13424 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM13424;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double m13423(ByteOrder byteOrder) throws Throwable {
        Object objM13424 = m13424(byteOrder);
        if (objM13424 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM13424 instanceof String) {
            return Double.parseDouble((String) objM13424);
        }
        if (objM13424 instanceof long[]) {
            if (((long[]) objM13424).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM13424 instanceof int[]) {
            if (((int[]) objM13424).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM13424 instanceof double[]) {
            double[] dArr = (double[]) objM13424;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM13424 instanceof C8455[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C8455[] c8455Arr = (C8455[]) objM13424;
        if (c8455Arr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C8455 c8455 = c8455Arr[0];
        return c8455.f21007 / c8455.f21006;
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
    */
    public final Serializable m13424(ByteOrder byteOrder) throws Throwable {
        C8458 c8458;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.f21012;
        InputStream inputStream2 = null;
        try {
            try {
                c8458 = new C8458(bArr);
                try {
                    c8458.f21019 = byteOrder;
                    int i = this.f21015;
                    int length = 0;
                    int i2 = this.f21014;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, C8461.f21025);
                                try {
                                    c8458.close();
                                    return str;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                c8458.close();
                                return str2;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i2 >= C8461.f21040.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = C8461.f21040;
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
                                    c8458.close();
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
                            c8458.close();
                            return str;
                        case 3:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c8458.readUnsignedShort();
                                length++;
                            }
                            try {
                                c8458.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i2];
                            while (length < i2) {
                                r13[length] = ((long) c8458.readInt()) & 4294967295L;
                                length++;
                            }
                            c8458.close();
                            return r13;
                        case 5:
                            r13 = new C8455[i2];
                            while (length < i2) {
                                r13[length] = new C8455(((long) c8458.readInt()) & 4294967295L, ((long) c8458.readInt()) & 4294967295L);
                                length++;
                            }
                            c8458.close();
                            return r13;
                        case 8:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c8458.readShort();
                                length++;
                            }
                            c8458.close();
                            return r13;
                        case 9:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c8458.readInt();
                                length++;
                            }
                            c8458.close();
                            return r13;
                        case 10:
                            r13 = new C8455[i2];
                            while (length < i2) {
                                r13[length] = new C8455(c8458.readInt(), c8458.readInt());
                                length++;
                            }
                            c8458.close();
                            return r13;
                        case 11:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = c8458.readFloat();
                                length++;
                            }
                            c8458.close();
                            return r13;
                        case 12:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = c8458.readDouble();
                                length++;
                            }
                            c8458.close();
                            return r13;
                        default:
                            try {
                                c8458.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c8458 != null) {
                        try {
                            c8458.close();
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
            c8458 = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public C8457(int i, byte[] bArr, int i2) {
        this(-1L, bArr, i, i2);
    }
}
