package p000;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: Bg */
/* JADX INFO: loaded from: classes.dex */
public final class C0066Bg {

    /* JADX INFO: renamed from: a */
    public final int f157a;

    /* JADX INFO: renamed from: b */
    public final int f158b;

    /* JADX INFO: renamed from: c */
    public final long f159c;

    /* JADX INFO: renamed from: d */
    public final byte[] f160d;

    public C0066Bg(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static C0066Bg m106a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0238Fg.f756C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C0066Bg(byteBufferWrap.array(), 4, 1);
    }

    /* JADX INFO: renamed from: b */
    public static C0066Bg m107b(C0152Dg c0152Dg, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0238Fg.f756C[5]]);
        byteBufferWrap.order(byteOrder);
        C0152Dg c0152Dg2 = new C0152Dg[]{c0152Dg}[0];
        byteBufferWrap.putInt((int) c0152Dg2.f408a);
        byteBufferWrap.putInt((int) c0152Dg2.f409b);
        return new C0066Bg(byteBufferWrap.array(), 5, 1);
    }

    /* JADX INFO: renamed from: c */
    public static C0066Bg m108c(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0238Fg.f756C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C0066Bg(byteBufferWrap.array(), 3, 1);
    }

    /* JADX INFO: renamed from: d */
    public final double m109d(ByteOrder byteOrder) throws Throwable {
        Object objM112g = m112g(byteOrder);
        if (objM112g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM112g instanceof String) {
            return Double.parseDouble((String) objM112g);
        }
        if (objM112g instanceof long[]) {
            if (((long[]) objM112g).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM112g instanceof int[]) {
            if (((int[]) objM112g).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM112g instanceof double[]) {
            double[] dArr = (double[]) objM112g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM112g instanceof C0152Dg[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C0152Dg[] c0152DgArr = (C0152Dg[]) objM112g;
        if (c0152DgArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C0152Dg c0152Dg = c0152DgArr[0];
        return c0152Dg.f408a / c0152Dg.f409b;
    }

    /* JADX INFO: renamed from: e */
    public final int m110e(ByteOrder byteOrder) throws Throwable {
        Object objM112g = m112g(byteOrder);
        if (objM112g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM112g instanceof String) {
            return Integer.parseInt((String) objM112g);
        }
        if (objM112g instanceof long[]) {
            long[] jArr = (long[]) objM112g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM112g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM112g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: f */
    public final String m111f(ByteOrder byteOrder) throws Throwable {
        Object objM112g = m112g(byteOrder);
        if (objM112g == null) {
            return null;
        }
        if (objM112g instanceof String) {
            return (String) objM112g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM112g instanceof long[]) {
            long[] jArr = (long[]) objM112g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM112g instanceof int[]) {
            int[] iArr = (int[]) objM112g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM112g instanceof double[]) {
            double[] dArr = (double[]) objM112g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM112g instanceof C0152Dg[])) {
            return null;
        }
        C0152Dg[] c0152DgArr = (C0152Dg[]) objM112g;
        while (i < c0152DgArr.length) {
            sb.append(c0152DgArr[i].f408a);
            sb.append('/');
            sb.append(c0152DgArr[i].f409b);
            i++;
            if (i != c0152DgArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:59|(2:61|(2:62|(2:64|(2:148|66)(1:67))(2:149|68)))|69|(2:71|(6:151|73|79|143|80|81)(3:74|(2:76|153)(2:77|152)|78))|150|79|143|80|81) */
    /* JADX WARN: Type inference failed for: r12v17, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r12v19, types: [Dg[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v20, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v21, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v22, types: [Dg[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v23, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v24, types: [double[], java.io.Serializable] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m112g(ByteOrder byteOrder) throws Throwable {
        C0023Ag c0023Ag;
        byte b;
        byte[] bArr = this.f160d;
        C0023Ag c0023Ag2 = null;
        try {
            c0023Ag = new C0023Ag(bArr);
        } catch (IOException unused) {
            c0023Ag = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            c0023Ag.f47c = byteOrder;
            int i = this.f157a;
            int length = 0;
            int i2 = this.f158b;
            switch (i) {
                case 1:
                case 6:
                    if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                        String str = new String(bArr, C0238Fg.f765L);
                        try {
                            c0023Ag.close();
                            break;
                        } catch (IOException unused2) {
                        }
                        return str;
                    }
                    String str2 = new String(new char[]{(char) (b + 48)});
                    try {
                        c0023Ag.close();
                        break;
                    } catch (IOException unused3) {
                    }
                    return str2;
                case 2:
                case 7:
                    if (i2 >= C0238Fg.f757D.length) {
                        int i3 = 0;
                        while (true) {
                            byte[] bArr2 = C0238Fg.f757D;
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
                            String string = sb.toString();
                            c0023Ag.close();
                            return string;
                        }
                        if (b2 >= 32) {
                            sb.append((char) b2);
                        } else {
                            sb.append('?');
                        }
                        length++;
                    }
                    String string2 = sb.toString();
                    c0023Ag.close();
                    return string2;
                case 3:
                    ?? r12 = new int[i2];
                    while (length < i2) {
                        r12[length] = c0023Ag.readUnsignedShort();
                        length++;
                    }
                    try {
                        c0023Ag.close();
                        break;
                    } catch (IOException unused4) {
                    }
                    return r12;
                case 4:
                    ?? r122 = new long[i2];
                    while (length < i2) {
                        r122[length] = ((long) c0023Ag.readInt()) & 4294967295L;
                        length++;
                    }
                    try {
                        c0023Ag.close();
                        break;
                    } catch (IOException unused5) {
                    }
                    return r122;
                case 5:
                    ?? r123 = new C0152Dg[i2];
                    while (length < i2) {
                        r123[length] = new C0152Dg(((long) c0023Ag.readInt()) & 4294967295L, ((long) c0023Ag.readInt()) & 4294967295L);
                        length++;
                    }
                    try {
                        c0023Ag.close();
                        break;
                    } catch (IOException unused6) {
                    }
                    return r123;
                case LuaJitConsts.LUA_TTHREAD /* 8 */:
                    ?? r124 = new int[i2];
                    while (length < i2) {
                        r124[length] = c0023Ag.readShort();
                        length++;
                    }
                    try {
                        c0023Ag.close();
                        break;
                    } catch (IOException unused7) {
                    }
                    return r124;
                case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                    ?? r125 = new int[i2];
                    while (length < i2) {
                        r125[length] = c0023Ag.readInt();
                        length++;
                    }
                    try {
                        c0023Ag.close();
                        break;
                    } catch (IOException unused8) {
                    }
                    return r125;
                case 10:
                    ?? r126 = new C0152Dg[i2];
                    while (length < i2) {
                        r126[length] = new C0152Dg(c0023Ag.readInt(), c0023Ag.readInt());
                        length++;
                    }
                    try {
                        c0023Ag.close();
                        break;
                    } catch (IOException unused9) {
                    }
                    return r126;
                case 11:
                    ?? r127 = new double[i2];
                    while (length < i2) {
                        r127[length] = c0023Ag.readFloat();
                        length++;
                    }
                    try {
                        c0023Ag.close();
                        break;
                    } catch (IOException unused10) {
                    }
                    return r127;
                case 12:
                    ?? r128 = new double[i2];
                    while (length < i2) {
                        r128[length] = c0023Ag.readDouble();
                        length++;
                    }
                    try {
                        c0023Ag.close();
                        break;
                    } catch (IOException unused11) {
                    }
                    return r128;
                default:
                    try {
                        c0023Ag.close();
                        break;
                    } catch (IOException unused12) {
                    }
                    return null;
            }
        } catch (IOException unused13) {
            if (c0023Ag != null) {
                try {
                    c0023Ag.close();
                } catch (IOException unused14) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            c0023Ag2 = c0023Ag;
            if (c0023Ag2 != null) {
                try {
                    c0023Ag2.close();
                } catch (IOException unused15) {
                }
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C0238Fg.f755B[this.f157a]);
        sb.append(", data length:");
        return AbstractC0213Ey.m409g(sb, this.f160d.length, ")");
    }

    public C0066Bg(long j, byte[] bArr, int i, int i2) {
        this.f157a = i;
        this.f158b = i2;
        this.f159c = j;
        this.f160d = bArr;
    }
}
