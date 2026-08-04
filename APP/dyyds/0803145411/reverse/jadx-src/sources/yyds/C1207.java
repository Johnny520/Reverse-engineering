package yyds;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: yyds.ᛵᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1207 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f5494;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f5495;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final long f5496;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final byte[] f5497;

    public C1207(long j, byte[] bArr, int i, int i2) {
        this.f5494 = i;
        this.f5495 = i2;
        this.f5496 = j;
        this.f5497 = bArr;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C1207 m2396(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2367.f11630[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C1207(byteBufferWrap.array(), 4, 1);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C1207 m2397(C0885 c0885, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2367.f11630[5]]);
        byteBufferWrap.order(byteOrder);
        C0885 c08852 = new C0885[]{c0885}[0];
        byteBufferWrap.putInt((int) c08852.f4058);
        byteBufferWrap.putInt((int) c08852.f4059);
        return new C1207(byteBufferWrap.array(), 5, 1);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C1207 m2398(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2367.f11630[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C1207(byteBufferWrap.array(), 3, 1);
    }

    public final String toString() {
        return "(" + C2367.f11648[this.f5494] + ", data length:" + this.f5497.length + ")";
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int m2399(ByteOrder byteOrder) throws Throwable {
        Object objM2400 = m2400(byteOrder);
        if (objM2400 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM2400 instanceof String) {
            return Integer.parseInt((String) objM2400);
        }
        if (objM2400 instanceof long[]) {
            long[] jArr = (long[]) objM2400;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM2400 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM2400;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [yyds.ᛴᛷᛲᲈ[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [yyds.ᛴᛷᛲᲈ[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m2400(ByteOrder byteOrder) throws Throwable {
        C0886 c0886;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.f5497;
        InputStream inputStream2 = null;
        try {
            try {
                c0886 = new C0886(bArr);
                try {
                    c0886.f4065 = byteOrder;
                    int i = this.f5494;
                    int length = 0;
                    int i2 = this.f5495;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, C2367.f11650);
                                try {
                                    c0886.close();
                                    return str;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                c0886.close();
                                return str2;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i2 >= C2367.f11651.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = C2367.f11651;
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
                                    c0886.close();
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
                            c0886.close();
                            return str;
                        case 3:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c0886.readUnsignedShort();
                                length++;
                            }
                            try {
                                c0886.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i2];
                            while (length < i2) {
                                r13[length] = ((long) c0886.readInt()) & 4294967295L;
                                length++;
                            }
                            c0886.close();
                            return r13;
                        case 5:
                            r13 = new C0885[i2];
                            while (length < i2) {
                                r13[length] = new C0885(((long) c0886.readInt()) & 4294967295L, ((long) c0886.readInt()) & 4294967295L);
                                length++;
                            }
                            c0886.close();
                            return r13;
                        case 8:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c0886.readShort();
                                length++;
                            }
                            c0886.close();
                            return r13;
                        case 9:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c0886.readInt();
                                length++;
                            }
                            c0886.close();
                            return r13;
                        case 10:
                            r13 = new C0885[i2];
                            while (length < i2) {
                                r13[length] = new C0885(c0886.readInt(), c0886.readInt());
                                length++;
                            }
                            c0886.close();
                            return r13;
                        case 11:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = c0886.readFloat();
                                length++;
                            }
                            c0886.close();
                            return r13;
                        case 12:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = c0886.readDouble();
                                length++;
                            }
                            c0886.close();
                            return r13;
                        default:
                            try {
                                c0886.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c0886 != null) {
                        try {
                            c0886.close();
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
            c0886 = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final String m2401(ByteOrder byteOrder) throws Throwable {
        Object objM2400 = m2400(byteOrder);
        if (objM2400 == null) {
            return null;
        }
        if (objM2400 instanceof String) {
            return (String) objM2400;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM2400 instanceof long[]) {
            long[] jArr = (long[]) objM2400;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM2400 instanceof int[]) {
            int[] iArr = (int[]) objM2400;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM2400 instanceof double[]) {
            double[] dArr = (double[]) objM2400;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM2400 instanceof C0885[])) {
            return null;
        }
        C0885[] c0885Arr = (C0885[]) objM2400;
        while (i < c0885Arr.length) {
            sb.append(c0885Arr[i].f4058);
            sb.append('/');
            sb.append(c0885Arr[i].f4059);
            i++;
            if (i != c0885Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final double m2402(ByteOrder byteOrder) throws Throwable {
        Object objM2400 = m2400(byteOrder);
        if (objM2400 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM2400 instanceof String) {
            return Double.parseDouble((String) objM2400);
        }
        if (objM2400 instanceof long[]) {
            if (((long[]) objM2400).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM2400 instanceof int[]) {
            if (((int[]) objM2400).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM2400 instanceof double[]) {
            double[] dArr = (double[]) objM2400;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM2400 instanceof C0885[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C0885[] c0885Arr = (C0885[]) objM2400;
        if (c0885Arr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C0885 c0885 = c0885Arr[0];
        return c0885.f4058 / c0885.f4059;
    }

    public C1207(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }
}
