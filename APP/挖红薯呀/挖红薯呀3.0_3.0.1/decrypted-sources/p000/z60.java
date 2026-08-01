package p000;

import android.view.View;
import android.view.ViewParent;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import org.luckypray.dexkit.C0587R;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z60 {

    /* JADX INFO: renamed from: a */
    public static final float f7815a = 24.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static void m5414A(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m5421H(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m5421H(b3)))) {
            C0921xc.m5131l("Invalid UTF-8");
        } else {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static void m5415B(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            C0921xc.m5131l("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        } else if (m5421H(b2)) {
            C0921xc.m5131l("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        } else {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static int m5416C(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        C0921xc.m5131l(AbstractC0748t1.m4154l("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final void m5417D(vz0 vz0Var) {
        pf1.m3039Q(vz0Var).m270F();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static final boolean m5418E(st0 st0Var, st0 st0Var2, st0 st0Var3, int i) {
        if (!m5419F(i, st0Var, st0Var3)) {
            return false;
        }
        if (m5419F(i, st0Var2, st0Var3) && !m5440j(st0Var3, st0Var, st0Var2, i)) {
            return !m5440j(st0Var3, st0Var2, st0Var, i) && m5420G(i, st0Var3, st0Var) < m5420G(i, st0Var3, st0Var2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final boolean m5419F(int i, st0 st0Var, st0 st0Var2) {
        if (i == 3) {
            float f = st0Var2.f5834c;
            float f2 = st0Var2.f5832a;
            float f3 = st0Var.f5834c;
            return (f > f3 || f2 >= f3) && f2 > st0Var.f5832a;
        }
        if (i == 4) {
            float f4 = st0Var2.f5832a;
            float f5 = st0Var2.f5834c;
            float f6 = st0Var.f5832a;
            return (f4 < f6 || f5 <= f6) && f5 < st0Var.f5834c;
        }
        if (i == 5) {
            float f7 = st0Var2.f5835d;
            float f8 = st0Var2.f5833b;
            float f9 = st0Var.f5835d;
            return (f7 > f9 || f8 >= f9) && f8 > st0Var.f5833b;
        }
        if (i != 6) {
            C0921xc.m5134o("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = st0Var2.f5833b;
        float f11 = st0Var2.f5835d;
        float f12 = st0Var.f5833b;
        return (f10 < f12 || f11 <= f12) && f11 < st0Var.f5835d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final long m5420G(int i, st0 st0Var, st0 st0Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = st0Var.f5832a;
            f2 = st0Var2.f5834c;
        } else if (i == 4) {
            f = st0Var2.f5832a;
            f2 = st0Var.f5834c;
        } else if (i == 5) {
            f = st0Var.f5833b;
            f2 = st0Var2.f5835d;
        } else {
            if (i != 6) {
                C0921xc.m5134o("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = st0Var2.f5833b;
            f2 = st0Var.f5835d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = st0Var.f5833b;
            f3 = ((st0Var.f5835d - f7) / 2.0f) + f7;
            f4 = st0Var2.f5833b;
            f5 = st0Var2.f5835d;
        } else {
            if (i != 5 && i != 6) {
                C0921xc.m5134o("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = st0Var.f5832a;
            f3 = ((st0Var.f5834c - f8) / 2.0f) + f8;
            f4 = st0Var2.f5832a;
            f5 = st0Var2.f5834c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static boolean m5421H(byte b) {
        return b > -65;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static u60 m5422I(InterfaceC0298hw interfaceC0298hw) {
        C0496n2 c0496n2 = C0496n2.f4143W;
        ra1 ra1Var = new ra1();
        ra1Var.f5344d = interfaceC0298hw;
        ra1Var.f5345e = c0496n2;
        return ra1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static x51 m5423J(InterfaceC0298hw interfaceC0298hw) {
        interfaceC0298hw.getClass();
        return new x51(interfaceC0298hw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static final void m5424K(z11 z11Var, InterfaceC0643q8 interfaceC0643q8, int i) {
        while (true) {
            int i2 = z11Var.f7772v;
            if (i > i2 && i < z11Var.f7771u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            z11Var.m5379M();
            if (z11Var.m5411y(z11Var.f7772v)) {
                interfaceC0643q8.mo1689j();
            }
            z11Var.m5396j();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static ge0 m5425L(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    ge0 ge0Var = new ge0();
                    int iPosition = byteBufferDuplicate.position() + AbstractC0748t1.m4148f(byteBufferDuplicate, ByteOrder.LITTLE_ENDIAN);
                    ge0Var.f1423g = byteBufferDuplicate;
                    ge0Var.f1420d = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    ge0Var.f1421e = i6;
                    ge0Var.f1422f = ((ByteBuffer) ge0Var.f1423g).getShort(i6);
                    return ge0Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final s71 m5426M(s71 s71Var, k50 k50Var) {
        long j;
        z61 z61Var;
        int i;
        int i2;
        k71 k71Var;
        j31 j31Var = s71Var.f5669a;
        x61 x61Var = k31.f3006d;
        x61 x61Var2 = j31Var.f2670a;
        if (x61Var2.equals(C0496n2.f4142V)) {
            x61Var2 = k31.f3006d;
        }
        x61 x61Var3 = x61Var2;
        long j2 = j31Var.f2671b;
        v71[] v71VarArr = u71.f6157b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = k31.f3003a;
        }
        long j3 = j2;
        C1018zv c1018zv = j31Var.f2672c;
        if (c1018zv == null) {
            c1018zv = C1018zv.f8005f;
        }
        C1018zv c1018zv2 = c1018zv;
        C0940xv c0940xv = j31Var.f2673d;
        C0940xv c0940xv2 = new C0940xv(c0940xv != null ? c0940xv.f7426a : 0);
        C0977yv c0977yv = j31Var.f2674e;
        C0977yv c0977yv2 = new C0977yv(c0977yv != null ? c0977yv.f7696a : 65535);
        z51 z51Var = j31Var.f2675f;
        if (z51Var == null) {
            z51Var = z51.f7804a;
        }
        z51 z51Var2 = z51Var;
        String str = j31Var.f2676g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = j31Var.f2677h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = k31.f3004b;
        }
        long j5 = j4;
        C0992z9 c0992z9 = j31Var.f2678i;
        float f = c0992z9 != null ? c0992z9.f7838a : 0.0f;
        C0992z9 c0992z92 = new C0992z9(Float.isNaN(f) ? 0.0f : f);
        y61 y61Var = j31Var.f2679j;
        if (y61Var == null) {
            y61Var = y61.f7554c;
        }
        y61 y61Var2 = y61Var;
        fb0 fb0VarM1664n = j31Var.f2680k;
        if (fb0VarM1664n == null) {
            fb0 fb0Var = fb0.f1650f;
            fb0VarM1664n = j50.m1664n();
        }
        fb0 fb0Var2 = fb0VarM1664n;
        long j6 = j31Var.f2681l;
        if (j6 == 16) {
            j6 = k31.f3005c;
        }
        long j7 = j6;
        u61 u61Var = j31Var.f2682m;
        if (u61Var == null) {
            u61Var = u61.f6143b;
        }
        u61 u61Var2 = u61Var;
        v01 v01Var = j31Var.f2683n;
        if (v01Var == null) {
            v01Var = v01.f6368d;
        }
        v01 v01Var2 = v01Var;
        o30 o30Var = j31Var.f2684o;
        if (o30Var == null) {
            o30Var = C0664qt.f5220Q;
        }
        j31 j31Var2 = new j31(x61Var3, j3, c1018zv2, c0940xv2, c0977yv2, z51Var2, str2, j5, c0992z92, y61Var2, fb0Var2, j7, u61Var2, v01Var2, o30Var);
        ap0 ap0Var = s71Var.f5670b;
        int i3 = bp0.f558b;
        int i4 = ap0Var.f224a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = ap0Var.f225b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = k50Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        C0921xc.m5129j();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = ap0Var.f226c;
            if ((j & 1095216660480L) == 0) {
                j = bp0.f557a;
            }
            z61Var = ap0Var.f227d;
            if (z61Var == null) {
                z61Var = z61.f7816c;
            }
            er0 er0Var = ap0Var.f228e;
            la0 la0Var = ap0Var.f229f;
            i = ap0Var.f230g;
            if (i == 0) {
                i = ga0.f1898b;
            }
            i2 = ap0Var.f231h;
            if (i2 == 0) {
                i2 = 1;
            }
            k71Var = ap0Var.f232i;
            if (k71Var == null) {
                k71Var = k71.f3042c;
            }
            return new s71(j31Var2, new ap0(i4, i6, j, z61Var, er0Var, la0Var, i, i2, k71Var), s71Var.f5671c);
        }
        int iOrdinal2 = k50Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            C0921xc.m5129j();
            return null;
        }
        i6 = i5;
        j = ap0Var.f226c;
        if ((j & 1095216660480L) == 0) {
        }
        z61Var = ap0Var.f227d;
        if (z61Var == null) {
        }
        er0 er0Var2 = ap0Var.f228e;
        la0 la0Var2 = ap0Var.f229f;
        i = ap0Var.f230g;
        if (i == 0) {
        }
        i2 = ap0Var.f231h;
        if (i2 == 0) {
        }
        k71Var = ap0Var.f232i;
        if (k71Var == null) {
        }
        return new s71(j31Var2, new ap0(i4, i6, j, z61Var, er0Var2, la0Var2, i, i2, k71Var), s71Var.f5671c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static final boolean m5427N(int i, C0697rp c0697rp, C0149dv c0149dv, st0 st0Var) {
        C0149dv c0149dvM5450t;
        sh0 sh0Var = new sh0(new C0149dv[16]);
        if (!c0149dv.f4529d.f4542q) {
            w10.m4824b("visitChildren called on an unattached node");
        }
        sh0 sh0Var2 = new sh0(new oe0[16]);
        oe0 oe0Var = c0149dv.f4529d;
        oe0 oe0Var2 = oe0Var.f4534i;
        if (oe0Var2 == null) {
            pf1.m3049e(sh0Var2, oe0Var);
        } else {
            sh0Var2.m4072b(oe0Var2);
        }
        while (true) {
            int i2 = sh0Var2.f5770f;
            if (i2 == 0) {
                break;
            }
            oe0 oe0VarM3050f = (oe0) sh0Var2.m4081k(i2 - 1);
            if ((oe0VarM3050f.f4532g & 1024) == 0) {
                pf1.m3049e(sh0Var2, oe0VarM3050f);
            } else {
                while (true) {
                    if (oe0VarM3050f == null) {
                        break;
                    }
                    if ((oe0VarM3050f.f4531f & 1024) != 0) {
                        sh0 sh0Var3 = null;
                        while (oe0VarM3050f != null) {
                            if (oe0VarM3050f instanceof C0149dv) {
                                C0149dv c0149dv2 = (C0149dv) oe0VarM3050f;
                                if (c0149dv2.f4542q) {
                                    sh0Var.m4072b(c0149dv2);
                                }
                            } else if ((oe0VarM3050f.f4531f & 1024) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                int i3 = 0;
                                for (oe0 oe0Var3 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var3 != null; oe0Var3 = oe0Var3.f4534i) {
                                    if ((oe0Var3.f4531f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            oe0VarM3050f = oe0Var3;
                                        } else {
                                            if (sh0Var3 == null) {
                                                sh0Var3 = new sh0(new oe0[16]);
                                            }
                                            if (oe0VarM3050f != null) {
                                                sh0Var3.m4072b(oe0VarM3050f);
                                                oe0VarM3050f = null;
                                            }
                                            sh0Var3.m4072b(oe0Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            oe0VarM3050f = pf1.m3050f(sh0Var3);
                        }
                    } else {
                        oe0VarM3050f = oe0VarM3050f.f4534i;
                    }
                }
            }
        }
        while (sh0Var.f5770f != 0 && (c0149dvM5450t = m5450t(sh0Var, st0Var, i)) != null) {
            if (c0149dvM5450t.m733y0().f268a) {
                return ((Boolean) c0697rp.invoke(c0149dvM5450t)).booleanValue();
            }
            if (m5452v(i, c0697rp, c0149dvM5450t, st0Var)) {
                return true;
            }
            sh0Var.m4080j(c0149dvM5450t);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static String m5428O(long j) {
        return "PointerId(value=" + j + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static final Boolean m5429P(int i, C0697rp c0697rp, C0149dv c0149dv, st0 st0Var) {
        int iOrdinal = c0149dv.m727B0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0149dv c0149dvM1541q = AbstractC0307i4.m1541q(c0149dv);
                if (c0149dvM1541q == null) {
                    C0921xc.m5134o("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = c0149dvM1541q.m727B0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolM5429P = m5429P(i, c0697rp, c0149dvM1541q, st0Var);
                        if (!p30.m3002l(boolM5429P, Boolean.FALSE)) {
                            return boolM5429P;
                        }
                        if (st0Var == null) {
                            if (c0149dvM1541q.m727B0() != EnumC0106cv.f894e) {
                                C0921xc.m5134o("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            C0149dv c0149dvM1538n = AbstractC0307i4.m1538n(c0149dvM1541q);
                            if (c0149dvM1538n == null) {
                                C0921xc.m5134o("ActiveParent must have a focusedChild");
                                return null;
                            }
                            st0Var = AbstractC0307i4.m1539o(c0149dvM1538n);
                        }
                        return Boolean.valueOf(m5452v(i, c0697rp, c0149dv, st0Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            C0921xc.m5129j();
                            return null;
                        }
                        C0921xc.m5134o("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (st0Var == null) {
                    st0Var = AbstractC0307i4.m1539o(c0149dvM1541q);
                }
                return Boolean.valueOf(m5452v(i, c0697rp, c0149dv, st0Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return c0149dv.m733y0().f268a ? (Boolean) c0697rp.invoke(c0149dv) : st0Var == null ? Boolean.valueOf(m5451u(c0149dv, i, c0697rp)) : Boolean.valueOf(m5427N(i, c0697rp, c0149dv, st0Var));
                }
                C0921xc.m5129j();
                return null;
            }
        }
        return Boolean.valueOf(m5451u(c0149dv, i, c0697rp));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static final void m5430Q(C0793u7 c0793u7, C0879w7 c0879w7) {
        c0879w7.f7016e.setValue(c0793u7.f6150e.getValue());
        AbstractC0046b8 abstractC0046b8 = c0879w7.f7017f;
        AbstractC0046b8 abstractC0046b82 = c0793u7.f6151f;
        int iMo27b = abstractC0046b8.mo27b();
        for (int i = 0; i < iMo27b; i++) {
            abstractC0046b8.mo30e(abstractC0046b82.mo26a(i), i);
        }
        c0879w7.f7019h = c0793u7.f6153h;
        c0879w7.f7018g = c0793u7.f6152g;
        c0879w7.f7020i = ((Boolean) c0793u7.f6154i.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m5431a(final Object obj, final int i, final a80 a80Var, final C0474mh c0474mh, InterfaceC0356ji interfaceC0356ji, final int i2) {
        int i3;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(872548579);
        if ((i2 & 6) == 0) {
            i3 = (c0616pi.m3108h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0616pi.m3100d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0616pi.m3108h(a80Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c0616pi.m3108h(c0474mh) ? 2048 : 1024;
        }
        if (c0616pi.m3082O(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zM3104f = c0616pi.m3104f(obj) | c0616pi.m3104f(a80Var);
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (zM3104f || objM3080L == c0675r3) {
                objM3080L = new y70(obj, a80Var);
                c0616pi.m3107g0(objM3080L);
            }
            y70 y70Var = (y70) objM3080L;
            y70Var.f7561c = i;
            gp0 gp0Var = y70Var.f7565g;
            C0174ej c0174ej = vq0.f6807a;
            y70 y70Var2 = (y70) c0616pi.m3112j(c0174ej);
            l21 l21VarM4270k = u50.m4270k();
            InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
            l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
            try {
                if (y70Var2 != ((y70) gp0Var.getValue())) {
                    gp0Var.setValue(y70Var2);
                    if (y70Var.f7562d > 0) {
                        y70 y70Var3 = y70Var.f7563e;
                        if (y70Var3 != null) {
                            y70Var3.m5215b();
                        }
                        if (y70Var2 != null) {
                            y70Var2.m5214a();
                        } else {
                            y70Var2 = null;
                        }
                        y70Var.f7563e = y70Var2;
                    }
                }
                u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
                boolean zM3104f2 = c0616pi.m3104f(y70Var);
                Object objM3080L2 = c0616pi.m3080L();
                if (zM3104f2 || objM3080L2 == c0675r3) {
                    objM3080L2 = new C0532o(7, y70Var);
                    c0616pi.m3107g0(objM3080L2);
                }
                s91.m4038c(y70Var, (InterfaceC0742sw) objM3080L2, c0616pi);
                AbstractC0307i4.m1526b(c0174ej.mo206a(y70Var), c0474mh, c0616pi, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
                throw th;
            }
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: z70
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    z60.m5431a(obj, i, a80Var, c0474mh, (InterfaceC0356ji) obj2, j50.m1649A(i2 | 1));
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m5432b(final pe0 pe0Var, InterfaceC0904ww interfaceC0904ww, final C0474mh c0474mh, InterfaceC0904ww interfaceC0904ww2, InterfaceC0904ww interfaceC0904ww3, int i, long j, long j2, fd1 fd1Var, final C0474mh c0474mh2, InterfaceC0356ji interfaceC0356ji, final int i2) {
        final InterfaceC0904ww interfaceC0904ww4;
        final InterfaceC0904ww interfaceC0904ww5;
        final InterfaceC0904ww interfaceC0904ww6;
        final int i3;
        final long j3;
        final long j4;
        C0616pi c0616pi;
        final fd1 fd1Var2;
        InterfaceC0904ww interfaceC0904ww7;
        InterfaceC0904ww interfaceC0904ww8;
        InterfaceC0904ww interfaceC0904ww9;
        long j5;
        long jM2696b;
        fd1 ma1Var;
        C0616pi c0616pi2 = (C0616pi) interfaceC0356ji;
        c0616pi2.m3091X(-1211482744);
        int i4 = 2;
        int i5 = i2 | (c0616pi2.m3104f(pe0Var) ? 4 : 2) | 38497328;
        if (c0616pi2.m3082O(i5 & 1, (306783379 & i5) != 306783378)) {
            c0616pi2.m3087T();
            if ((i2 & 1) == 0 || c0616pi2.m3128y()) {
                interfaceC0904ww7 = AbstractC0652qh.f5145a;
                interfaceC0904ww8 = AbstractC0652qh.f5146b;
                interfaceC0904ww9 = AbstractC0652qh.f5147c;
                j5 = ((C0429lf) c0616pi2.m3112j(AbstractC0510nf.f4248a)).f3465n;
                jM2696b = AbstractC0510nf.m2696b(j5, c0616pi2);
                WeakHashMap weakHashMap = de1.f1062v;
                ma1Var = new ma1(jo0.m1731o(c0616pi2).f1069g, jo0.m1731o(c0616pi2).f1064b);
            } else {
                c0616pi2.m3085R();
                interfaceC0904ww7 = interfaceC0904ww;
                interfaceC0904ww8 = interfaceC0904ww2;
                interfaceC0904ww9 = interfaceC0904ww3;
                i4 = i;
                j5 = j;
                jM2696b = j2;
                ma1Var = fd1Var;
            }
            c0616pi2.m3120q();
            boolean zM3104f = c0616pi2.m3104f(ma1Var);
            Object objM3080L = c0616pi2.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (zM3104f || objM3080L == c0675r3) {
                objM3080L = new uh0(ma1Var);
                c0616pi2.m3107g0(objM3080L);
            }
            uh0 uh0Var = (uh0) objM3080L;
            boolean zM3104f2 = c0616pi2.m3104f(uh0Var) | c0616pi2.m3104f(ma1Var);
            Object objM3080L2 = c0616pi2.m3080L();
            if (zM3104f2 || objM3080L2 == c0675r3) {
                objM3080L2 = new C0073c(18, uh0Var, ma1Var);
                c0616pi2.m3107g0(objM3080L2);
            }
            int i6 = i4;
            InterfaceC0904ww interfaceC0904ww10 = interfaceC0904ww8;
            InterfaceC0904ww interfaceC0904ww11 = interfaceC0904ww9;
            long j6 = j5;
            long j7 = jM2696b;
            h51.m1275a(rd0.m3443B(pe0Var, (InterfaceC0742sw) objM3080L2), null, j6, j7, 0.0f, 0.0f, AbstractC0398kl.m1937w(848889571, new zx0(i6, interfaceC0904ww7, c0474mh2, interfaceC0904ww10, interfaceC0904ww11, uh0Var, c0474mh), c0616pi2), c0616pi2, 12582912, 114);
            interfaceC0904ww4 = interfaceC0904ww7;
            j4 = j7;
            c0616pi = c0616pi2;
            fd1Var2 = ma1Var;
            i3 = i6;
            j3 = j6;
            interfaceC0904ww5 = interfaceC0904ww10;
            interfaceC0904ww6 = interfaceC0904ww11;
        } else {
            c0616pi2.m3085R();
            interfaceC0904ww4 = interfaceC0904ww;
            interfaceC0904ww5 = interfaceC0904ww2;
            interfaceC0904ww6 = interfaceC0904ww3;
            i3 = i;
            j3 = j;
            j4 = j2;
            c0616pi = c0616pi2;
            fd1Var2 = fd1Var;
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww(interfaceC0904ww4, c0474mh, interfaceC0904ww5, interfaceC0904ww6, i3, j3, j4, fd1Var2, c0474mh2, i2) { // from class: vx0

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC0904ww f6862e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ C0474mh f6863f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ InterfaceC0904ww f6864g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ InterfaceC0904ww f6865h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ int f6866i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ long f6867j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ long f6868k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ fd1 f6869l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ C0474mh f6870m;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM1649A = j50.m1649A(805306753);
                    z60.m5432b(this.f6861d, this.f6862e, this.f6863f, this.f6864g, this.f6865h, this.f6866i, this.f6867j, this.f6868k, this.f6869l, this.f6870m, (InterfaceC0356ji) obj, iM1649A);
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m5433c(final int i, final InterfaceC0904ww interfaceC0904ww, final C0474mh c0474mh, final InterfaceC0904ww interfaceC0904ww2, final InterfaceC0904ww interfaceC0904ww3, final fd1 fd1Var, final C0474mh c0474mh2, InterfaceC0356ji interfaceC0356ji, final int i2) {
        int i3;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-280287501);
        int i4 = 4;
        int i5 = i2 | (c0616pi.m3100d(i) ? 4 : 2) | (c0616pi.m3108h(interfaceC0904ww) ? 32 : 16) | (c0616pi.m3108h(c0474mh) ? 256 : 128) | (c0616pi.m3108h(interfaceC0904ww2) ? 2048 : 1024) | (c0616pi.m3108h(interfaceC0904ww3) ? 16384 : 8192) | (c0616pi.m3104f(fd1Var) ? MethodData.ACC_DECLARED_SYNCHRONIZED : 65536) | (c0616pi.m3108h(c0474mh2) ? 1048576 : 524288);
        int i6 = 1;
        if (c0616pi.m3082O(i5 & 1, (599187 & i5) != 599186)) {
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (objM3080L == c0675r3) {
                objM3080L = new ay0();
                c0616pi.m3107g0(objM3080L);
            }
            final ay0 ay0Var = (ay0) objM3080L;
            boolean z = (i5 & 112) == 32;
            Object objM3080L2 = c0616pi.m3080L();
            if (z || objM3080L2 == c0675r3) {
                objM3080L2 = new C0474mh(605195056, true, new C0268h2(i4, interfaceC0904ww));
                c0616pi.m3107g0(objM3080L2);
            }
            final InterfaceC0904ww interfaceC0904ww4 = (InterfaceC0904ww) objM3080L2;
            boolean z2 = (i5 & 7168) == 2048;
            Object objM3080L3 = c0616pi.m3080L();
            int i7 = 3;
            if (z2 || objM3080L3 == c0675r3) {
                objM3080L3 = new C0474mh(418899191, true, new C0268h2(i7, interfaceC0904ww2));
                c0616pi.m3107g0(objM3080L3);
            }
            final InterfaceC0904ww interfaceC0904ww5 = (InterfaceC0904ww) objM3080L3;
            boolean z3 = (57344 & i5) == 16384;
            Object objM3080L4 = c0616pi.m3080L();
            if (z3 || objM3080L4 == c0675r3) {
                objM3080L4 = new C0474mh(338600263, true, new C0268h2(2, interfaceC0904ww3));
                c0616pi.m3107g0(objM3080L4);
            }
            final InterfaceC0904ww interfaceC0904ww6 = (InterfaceC0904ww) objM3080L4;
            boolean z4 = (i5 & 896) == 256;
            Object objM3080L5 = c0616pi.m3080L();
            if (z4 || objM3080L5 == c0675r3) {
                i3 = i5;
                objM3080L5 = new C0474mh(-1776388365, true, new C0350jc(3, c0474mh, ay0Var));
                c0616pi.m3107g0(objM3080L5);
            } else {
                i3 = i5;
            }
            final InterfaceC0904ww interfaceC0904ww7 = (InterfaceC0904ww) objM3080L5;
            boolean z5 = (i3 & 3670016) == 1048576;
            Object objM3080L6 = c0616pi.m3080L();
            if (z5 || objM3080L6 == c0675r3) {
                objM3080L6 = new C0474mh(-1731662488, true, new C0316id(c0474mh2, i6));
                c0616pi.m3107g0(objM3080L6);
            }
            final InterfaceC0904ww interfaceC0904ww8 = (InterfaceC0904ww) objM3080L6;
            boolean zM3104f = ((i3 & 458752) == 131072) | c0616pi.m3104f(interfaceC0904ww4) | c0616pi.m3104f(interfaceC0904ww5) | c0616pi.m3104f(interfaceC0904ww6) | ((i3 & 14) == 4) | c0616pi.m3104f(interfaceC0904ww8) | c0616pi.m3104f(interfaceC0904ww7);
            Object objM3080L7 = c0616pi.m3080L();
            if (zM3104f || objM3080L7 == c0675r3) {
                InterfaceC0904ww interfaceC0904ww9 = new InterfaceC0904ww() { // from class: wx0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0904ww
                    public final Object invoke(Object obj, Object obj2) {
                        int i8;
                        int iMo641F;
                        int iMo641F2;
                        C0406kt c0406kt;
                        C0406kt c0406kt2;
                        Integer numValueOf;
                        int i9;
                        int iIntValue;
                        int iMo641F3;
                        int iMo675a;
                        final y41 y41Var = (y41) obj;
                        C0617pj c0617pj = (C0617pj) obj2;
                        final int iM3137h = C0617pj.m3137h(c0617pj.f4912a);
                        final int iM3136g = C0617pj.m3136g(c0617pj.f4912a);
                        long jM3130a = C0617pj.m3130a(c0617pj.f4912a, 0, 0, 0, 0, 10);
                        k50 layoutDirection = y41Var.getLayoutDirection();
                        final fd1 fd1Var2 = fd1Var;
                        int iMo678d = fd1Var2.mo678d(y41Var, layoutDirection);
                        int iMo677c = fd1Var2.mo677c(y41Var, y41Var.getLayoutDirection());
                        int iMo675a2 = fd1Var2.mo675a(y41Var);
                        final xq0 xq0VarMo184e = ((sd0) AbstractC0960ye.m5240J(y41Var.mo1280w(interfaceC0904ww4, by0.f605d))).mo184e(jM3130a);
                        int i10 = (-iMo678d) - iMo677c;
                        int i11 = -iMo675a2;
                        final xq0 xq0VarMo184e2 = ((sd0) AbstractC0960ye.m5240J(y41Var.mo1280w(interfaceC0904ww5, by0.f607f))).mo184e(AbstractC0654qj.m3261h(jM3130a, i10, i11));
                        final xq0 xq0VarMo184e3 = ((sd0) AbstractC0960ye.m5240J(y41Var.mo1280w(interfaceC0904ww6, by0.f608g))).mo184e(AbstractC0654qj.m3261h(jM3130a, i10, i11));
                        int i12 = xq0VarMo184e3.f7400d;
                        k50 k50Var = k50.f3015d;
                        int i13 = i;
                        if (i12 == 0 && xq0VarMo184e3.f7401e == 0) {
                            c0406kt = null;
                        } else {
                            int i14 = xq0VarMo184e3.f7401e;
                            if (i13 == 0) {
                                i8 = iMo678d;
                                if (y41Var.getLayoutDirection() == k50Var) {
                                    iMo641F = y41Var.mo641F(16.0f);
                                    iMo641F2 = iMo641F + i8;
                                    c0406kt = new C0406kt(iMo641F2, i14);
                                } else {
                                    iMo641F2 = ((iM3137h - y41Var.mo641F(16.0f)) - i12) - iMo677c;
                                    c0406kt = new C0406kt(iMo641F2, i14);
                                }
                            } else {
                                i8 = iMo678d;
                                if (i13 != 2 && i13 != 3) {
                                    iMo641F2 = (((iM3137h - i12) + i8) - iMo677c) / 2;
                                } else if (y41Var.getLayoutDirection() == k50Var) {
                                    iMo641F2 = ((iM3137h - y41Var.mo641F(16.0f)) - i12) - iMo677c;
                                } else {
                                    iMo641F = y41Var.mo641F(16.0f);
                                    iMo641F2 = iMo641F + i8;
                                }
                                c0406kt = new C0406kt(iMo641F2, i14);
                            }
                        }
                        final xq0 xq0VarMo184e4 = ((sd0) AbstractC0960ye.m5240J(y41Var.mo1280w(interfaceC0904ww8, by0.f609h))).mo184e(jM3130a);
                        boolean z6 = xq0VarMo184e4.f7400d == 0 && xq0VarMo184e4.f7401e == 0;
                        if (c0406kt != null) {
                            int i15 = c0406kt.f3262b;
                            c0406kt2 = c0406kt;
                            if (z6 || i13 == 3) {
                                iMo641F3 = y41Var.mo641F(16.0f) + i15;
                                iMo675a = fd1Var2.mo675a(y41Var);
                            } else {
                                iMo641F3 = xq0VarMo184e4.f7401e + i15;
                                iMo675a = y41Var.mo641F(16.0f);
                            }
                            numValueOf = Integer.valueOf(iMo675a + iMo641F3);
                        } else {
                            c0406kt2 = c0406kt;
                            numValueOf = null;
                        }
                        int i16 = xq0VarMo184e2.f7401e;
                        if (i16 != 0) {
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                Integer numValueOf2 = z6 ? null : Integer.valueOf(xq0VarMo184e4.f7401e);
                                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : fd1Var2.mo675a(y41Var);
                            }
                            i9 = iIntValue + i16;
                        } else {
                            i9 = 0;
                        }
                        float fMo652f0 = (xq0VarMo184e.f7400d == 0 && xq0VarMo184e.f7401e == 0) ? y41Var.mo652f0(fd1Var2.mo676b(y41Var)) : y41Var.mo652f0(xq0VarMo184e.f7401e);
                        float fMo652f02 = z6 ? y41Var.mo652f0(fd1Var2.mo675a(y41Var)) : y41Var.mo652f0(xq0VarMo184e4.f7401e);
                        final Integer num = numValueOf;
                        k50 layoutDirection2 = y41Var.getLayoutDirection();
                        float fMo652f03 = layoutDirection2 == k50Var ? y41Var.mo652f0(fd1Var2.mo678d(y41Var, layoutDirection2)) : y41Var.mo652f0(fd1Var2.mo677c(y41Var, layoutDirection2));
                        k50 layoutDirection3 = y41Var.getLayoutDirection();
                        ay0Var.f300a.setValue(new ln0(fMo652f03, fMo652f0, layoutDirection3 == k50Var ? y41Var.mo652f0(fd1Var2.mo677c(y41Var, layoutDirection3)) : y41Var.mo652f0(fd1Var2.mo678d(y41Var, layoutDirection3)), fMo652f02));
                        final xq0 xq0VarMo184e5 = ((sd0) AbstractC0960ye.m5240J(y41Var.mo1280w(interfaceC0904ww7, by0.f606e))).mo184e(jM3130a);
                        final C0406kt c0406kt3 = c0406kt2;
                        final int i17 = i9;
                        return y41Var.mo1279Q(iM3137h, iM3136g, C0330is.f2614d, new InterfaceC0742sw() { // from class: yx0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p000.InterfaceC0742sw
                            public final Object invoke(Object obj3) {
                                wq0 wq0Var = (wq0) obj3;
                                wq0.m5015i(wq0Var, xq0VarMo184e5, 0, 0);
                                wq0.m5015i(wq0Var, xq0VarMo184e, 0, 0);
                                xq0 xq0Var = xq0VarMo184e2;
                                int i18 = iM3137h - xq0Var.f7400d;
                                y41 y41Var2 = y41Var;
                                k50 layoutDirection4 = y41Var2.getLayoutDirection();
                                fd1 fd1Var3 = fd1Var2;
                                int iMo678d2 = ((fd1Var3.mo678d(y41Var2, layoutDirection4) + i18) - fd1Var3.mo677c(y41Var2, y41Var2.getLayoutDirection())) / 2;
                                int i19 = iM3136g;
                                wq0.m5015i(wq0Var, xq0Var, iMo678d2, i19 - i17);
                                xq0 xq0Var2 = xq0VarMo184e4;
                                wq0.m5015i(wq0Var, xq0Var2, 0, i19 - xq0Var2.f7401e);
                                C0406kt c0406kt4 = c0406kt3;
                                if (c0406kt4 != null) {
                                    int i20 = c0406kt4.f3261a;
                                    Integer num2 = num;
                                    num2.getClass();
                                    wq0.m5015i(wq0Var, xq0VarMo184e3, i20, i19 - num2.intValue());
                                }
                                return na1.f4229a;
                            }
                        });
                    }
                };
                c0616pi.m3107g0(interfaceC0904ww9);
                objM3080L7 = interfaceC0904ww9;
            }
            AbstractC0307i4.m1530f(null, (InterfaceC0904ww) objM3080L7, c0616pi, 0);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww(i, interfaceC0904ww, c0474mh, interfaceC0904ww2, interfaceC0904ww3, fd1Var, c0474mh2, i2) { // from class: xx0

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f7452d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC0904ww f7453e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ C0474mh f7454f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ InterfaceC0904ww f7455g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ InterfaceC0904ww f7456h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ fd1 f7457i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ C0474mh f7458j;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM1649A = j50.m1649A(1);
                    z60.m5433c(this.f7452d, this.f7453e, this.f7454f, this.f7455g, this.f7456h, this.f7457i, this.f7458j, (InterfaceC0356ji) obj, iM1649A);
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m5434d(z11 z11Var, List list, C0964yi c0964yi) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iM5390c = z11Var.m5390c((C0788u2) list.get(i));
            int iM5380N = z11Var.m5380N(z11Var.f7752b, z11Var.m5404r(iM5390c));
            Object obj = iM5380N < z11Var.m5394g(z11Var.f7752b, z11Var.m5404r(iM5390c + 1)) ? z11Var.f7753c[z11Var.m5395h(iM5380N)] : C0320ii.f2572a;
            ht0 ht0Var = obj instanceof ht0 ? (ht0) obj : null;
            if (ht0Var != null) {
                ht0Var.f2359a = c0964yi;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5435e(C0879w7 c0879w7, InterfaceC0642q7 interfaceC0642q7, long j, final InterfaceC0742sw interfaceC0742sw, AbstractC0358jk abstractC0358jk) {
        l51 l51Var;
        final zt0 zt0Var;
        final C0879w7 c0879w72;
        C0879w7 c0879w73;
        final float fM5454x;
        InterfaceC0742sw interfaceC0742sw2;
        zt0 zt0Var2;
        InterfaceC0742sw interfaceC0742sw3;
        C0793u7 c0793u7;
        C0793u7 c0793u72;
        InterfaceC0742sw interfaceC0742sw4;
        final InterfaceC0642q7 interfaceC0642q72 = interfaceC0642q7;
        if (abstractC0358jk instanceof l51) {
            l51Var = (l51) abstractC0358jk;
            int i = l51Var.f3347l;
            if ((i & Integer.MIN_VALUE) != 0) {
                l51Var.f3347l = i - Integer.MIN_VALUE;
            } else {
                l51Var = new l51(abstractC0358jk);
            }
        }
        l51 l51Var2 = l51Var;
        Object obj = l51Var2.f3346k;
        int i2 = l51Var2.f3347l;
        int i3 = 0;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i2 == 0) {
            w60.m4891M(obj);
            final Object objMo2024b = interfaceC0642q72.mo2024b(0L);
            final AbstractC0046b8 abstractC0046b8Mo2028f = interfaceC0642q72.mo2028f(0L);
            zt0Var = new zt0();
            if (j == Long.MIN_VALUE) {
                try {
                    fM5454x = m5454x(l51Var2.mo540e());
                    c0879w72 = c0879w7;
                } catch (CancellationException e) {
                    e = e;
                    c0879w72 = c0879w7;
                }
                try {
                    interfaceC0742sw2 = new InterfaceC0742sw() { // from class: i51
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p000.InterfaceC0742sw
                        public final Object invoke(Object obj2) {
                            long jLongValue = ((Long) obj2).longValue();
                            InterfaceC0642q7 interfaceC0642q73 = interfaceC0642q72;
                            q91 q91VarMo2026d = interfaceC0642q73.mo2026d();
                            Object objMo2027e = interfaceC0642q73.mo2027e();
                            C0879w7 c0879w74 = c0879w72;
                            C0793u7 c0793u73 = new C0793u7(objMo2024b, q91VarMo2026d, abstractC0046b8Mo2028f, jLongValue, objMo2027e, jLongValue, new j51(c0879w74, 1));
                            z60.m5448r(c0793u73, jLongValue, fM5454x, interfaceC0642q73, c0879w74, interfaceC0742sw);
                            zt0Var.f7995d = c0793u73;
                            return na1.f4229a;
                        }
                    };
                    zt0Var2 = zt0Var;
                } catch (CancellationException e2) {
                    e = e2;
                    c0879w73 = c0879w72;
                    c0793u7 = (C0793u7) zt0Var.f7995d;
                    if (c0793u7 != null) {
                    }
                    c0793u72 = (C0793u7) zt0Var.f7995d;
                    if (c0793u72 != null) {
                        c0879w73.f7020i = false;
                    }
                    throw e;
                }
                try {
                    l51Var2.f3342g = c0879w72;
                    l51Var2.f3343h = interfaceC0642q72;
                    l51Var2.f3344i = interfaceC0742sw;
                    l51Var2.f3345j = zt0Var2;
                    l51Var2.f3347l = 1;
                    if (m5442l(interfaceC0642q72, interfaceC0742sw2, l51Var2) != enumC1007zk) {
                        c0879w73 = c0879w72;
                        interfaceC0742sw3 = interfaceC0742sw;
                        zt0Var = zt0Var2;
                    }
                    return enumC1007zk;
                } catch (CancellationException e3) {
                    e = e3;
                    c0879w73 = c0879w72;
                    zt0Var = zt0Var2;
                    c0793u7 = (C0793u7) zt0Var.f7995d;
                    if (c0793u7 != null) {
                    }
                    c0793u72 = (C0793u7) zt0Var.f7995d;
                    if (c0793u72 != null) {
                    }
                    throw e;
                }
            }
            zt0Var2 = zt0Var;
            try {
                C0793u7 c0793u73 = new C0793u7(objMo2024b, interfaceC0642q72.mo2026d(), abstractC0046b8Mo2028f, j, interfaceC0642q72.mo2027e(), j, new j51(c0879w7, i3));
                m5448r(c0793u73, j, m5454x(l51Var2.mo540e()), interfaceC0642q72, c0879w7, interfaceC0742sw);
                zt0Var2.f7995d = c0793u73;
                c0879w73 = c0879w7;
                interfaceC0642q72 = interfaceC0642q7;
                interfaceC0742sw3 = interfaceC0742sw;
                zt0Var = zt0Var2;
            } catch (CancellationException e4) {
                e = e4;
                c0879w73 = c0879w7;
                zt0Var = zt0Var2;
                c0793u7 = (C0793u7) zt0Var.f7995d;
                if (c0793u7 != null) {
                    c0793u7.f6154i.setValue(Boolean.FALSE);
                }
                c0793u72 = (C0793u7) zt0Var.f7995d;
                if (c0793u72 != null && c0793u72.f6152g == c0879w73.f7018g) {
                    c0879w73.f7020i = false;
                }
                throw e;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zt0Var = l51Var2.f3345j;
            interfaceC0742sw3 = l51Var2.f3344i;
            interfaceC0642q72 = l51Var2.f3343h;
            c0879w73 = l51Var2.f3342g;
            try {
                w60.m4891M(obj);
            } catch (CancellationException e5) {
                e = e5;
                c0793u7 = (C0793u7) zt0Var.f7995d;
                if (c0793u7 != null) {
                }
                c0793u72 = (C0793u7) zt0Var.f7995d;
                if (c0793u72 != null) {
                }
                throw e;
            }
        }
        do {
            Object obj2 = zt0Var.f7995d;
            obj2.getClass();
            if (!((Boolean) ((C0793u7) obj2).f6154i.getValue()).booleanValue()) {
                return na1.f4229a;
            }
            final float fM5454x2 = m5454x(l51Var2.mo540e());
            final zt0 zt0Var3 = zt0Var;
            final InterfaceC0742sw interfaceC0742sw5 = interfaceC0742sw3;
            final InterfaceC0642q7 interfaceC0642q73 = interfaceC0642q72;
            final C0879w7 c0879w74 = c0879w73;
            try {
                interfaceC0742sw4 = new InterfaceC0742sw() { // from class: k51
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0742sw
                    public final Object invoke(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = zt0Var3.f7995d;
                        obj4.getClass();
                        z60.m5448r((C0793u7) obj4, jLongValue, fM5454x2, interfaceC0642q73, c0879w74, interfaceC0742sw5);
                        return na1.f4229a;
                    }
                };
                zt0Var = zt0Var3;
                interfaceC0642q72 = interfaceC0642q73;
                c0879w73 = c0879w74;
                interfaceC0742sw3 = interfaceC0742sw5;
                l51Var2.f3342g = c0879w73;
                l51Var2.f3343h = interfaceC0642q72;
                l51Var2.f3344i = interfaceC0742sw3;
                l51Var2.f3345j = zt0Var;
                l51Var2.f3347l = 2;
            } catch (CancellationException e6) {
                e = e6;
                zt0Var = zt0Var3;
                c0879w73 = c0879w74;
                c0793u7 = (C0793u7) zt0Var.f7995d;
                if (c0793u7 != null) {
                }
                c0793u72 = (C0793u7) zt0Var.f7995d;
                if (c0793u72 != null) {
                }
                throw e;
            }
        } while (m5442l(interfaceC0642q72, interfaceC0742sw4, l51Var2) != enumC1007zk);
        return enumC1007zk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Object m5436f(float f, InterfaceC0830v7 interfaceC0830v7, InterfaceC0904ww interfaceC0904ww, m51 m51Var, int i) {
        if ((i & 8) != 0) {
            interfaceC0830v7 = s91.m4028O(0.0f, 0.0f, null, 7);
        }
        InterfaceC0830v7 interfaceC0830v72 = interfaceC0830v7;
        q91 q91Var = AbstractC0398kl.f3213x;
        Float f2 = new Float(0.0f);
        Float f3 = new Float(f);
        Float f4 = new Float(0.0f);
        InterfaceC0742sw interfaceC0742sw = q91Var.f5089a;
        AbstractC0046b8 abstractC0046b8Mo28c = (AbstractC0046b8) interfaceC0742sw.invoke(f4);
        if (abstractC0046b8Mo28c == null) {
            abstractC0046b8Mo28c = ((AbstractC0046b8) interfaceC0742sw.invoke(f2)).mo28c();
        }
        AbstractC0046b8 abstractC0046b8 = abstractC0046b8Mo28c;
        Object objM5435e = m5435e(new C0879w7(q91Var, f2, abstractC0046b8, 56), new n61(interfaceC0830v72, q91Var, f2, f3, abstractC0046b8), Long.MIN_VALUE, new C0532o(23, interfaceC0904ww), m51Var);
        na1 na1Var = na1.f4229a;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (objM5435e != enumC1007zk) {
            objM5435e = na1Var;
        }
        return objM5435e == enumC1007zk ? objM5435e : na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final Object m5437g(C0879w7 c0879w7, C0478ml c0478ml, boolean z, InterfaceC0742sw interfaceC0742sw, AbstractC0358jk abstractC0358jk) {
        Object objM5435e = m5435e(c0879w7, new C0435ll(c0478ml, c0879w7.f7015d, c0879w7.f7016e.getValue(), c0879w7.f7017f), z ? c0879w7.f7018g : Long.MIN_VALUE, interfaceC0742sw, abstractC0358jk);
        return objM5435e == EnumC1007zk.f7916d ? objM5435e : na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final Object m5438h(C0879w7 c0879w7, Float f, InterfaceC0830v7 interfaceC0830v7, boolean z, InterfaceC0742sw interfaceC0742sw, AbstractC0358jk abstractC0358jk) {
        Object objM5435e = m5435e(c0879w7, new n61(interfaceC0830v7, c0879w7.f7015d, c0879w7.f7016e.getValue(), f, c0879w7.f7017f), z ? c0879w7.f7018g : Long.MIN_VALUE, interfaceC0742sw, abstractC0358jk);
        return objM5435e == EnumC1007zk.f7916d ? objM5435e : na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static float m5439i(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.f5834c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f5832a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.f5835d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.f5833b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        p000.C0921xc.m5134o("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        p000.C0921xc.m5134o("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m5440j(st0 st0Var, st0 st0Var2, st0 st0Var3, int i) {
        boolean zM5441k = m5441k(i, st0Var3, st0Var);
        float f = st0Var3.f5833b;
        float f2 = st0Var3.f5835d;
        float f3 = st0Var3.f5832a;
        float f4 = st0Var3.f5834c;
        float f5 = st0Var.f5835d;
        float f6 = st0Var.f5833b;
        float f7 = st0Var.f5834c;
        float f8 = st0Var.f5832a;
        if (!zM5441k && m5441k(i, st0Var2, st0Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            C0921xc.m5134o("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final boolean m5441k(int i, st0 st0Var, st0 st0Var2) {
        if (i == 3 || i == 4) {
            return st0Var.f5835d > st0Var2.f5833b && st0Var.f5833b < st0Var2.f5835d;
        }
        if (i == 5 || i == 6) {
            return st0Var.f5834c > st0Var2.f5832a && st0Var.f5832a < st0Var2.f5834c;
        }
        C0921xc.m5134o("This function should only be used for 2-D focus search");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final Object m5442l(InterfaceC0642q7 interfaceC0642q7, InterfaceC0742sw interfaceC0742sw, l51 l51Var) {
        if (!interfaceC0642q7.mo2023a()) {
            return v50.m4406l(l51Var.mo540e()).m4008c(new s21(interfaceC0742sw, 1), l51Var);
        }
        if (l51Var.mo540e().mo64l(C0496n2.f4128H) == null) {
            return v50.m4406l(l51Var.mo540e()).m4008c(interfaceC0742sw, l51Var);
        }
        C0921xc.m5123d();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final void m5443m(int i, int i2) {
        if (i < 0 || i >= i2) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final void m5444n(int i, int i2) {
        if (i < 0 || i > i2) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final void m5445o(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            C0921xc.m5131l(AbstractC0748t1.m4153k(i, i2, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final void m5446p(C0149dv c0149dv, sh0 sh0Var) {
        if (!c0149dv.f4529d.f4542q) {
            w10.m4824b("visitChildren called on an unattached node");
        }
        sh0 sh0Var2 = new sh0(new oe0[16]);
        oe0 oe0Var = c0149dv.f4529d;
        oe0 oe0Var2 = oe0Var.f4534i;
        if (oe0Var2 == null) {
            pf1.m3049e(sh0Var2, oe0Var);
        } else {
            sh0Var2.m4072b(oe0Var2);
        }
        while (true) {
            int i = sh0Var2.f5770f;
            if (i == 0) {
                return;
            }
            oe0 oe0VarM3050f = (oe0) sh0Var2.m4081k(i - 1);
            if ((oe0VarM3050f.f4532g & 1024) == 0) {
                pf1.m3049e(sh0Var2, oe0VarM3050f);
            } else {
                while (true) {
                    if (oe0VarM3050f == null) {
                        break;
                    }
                    if ((oe0VarM3050f.f4531f & 1024) != 0) {
                        sh0 sh0Var3 = null;
                        while (oe0VarM3050f != null) {
                            if (oe0VarM3050f instanceof C0149dv) {
                                C0149dv c0149dv2 = (C0149dv) oe0VarM3050f;
                                if (c0149dv2.f4542q && !pf1.m3039Q(c0149dv2).f404R) {
                                    if (c0149dv2.m733y0().f268a) {
                                        sh0Var.m4072b(c0149dv2);
                                    } else {
                                        m5446p(c0149dv2, sh0Var);
                                    }
                                }
                            } else if ((oe0VarM3050f.f4531f & 1024) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                int i2 = 0;
                                for (oe0 oe0Var3 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var3 != null; oe0Var3 = oe0Var3.f4534i) {
                                    if ((oe0Var3.f4531f & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            oe0VarM3050f = oe0Var3;
                                        } else {
                                            if (sh0Var3 == null) {
                                                sh0Var3 = new sh0(new oe0[16]);
                                            }
                                            if (oe0VarM3050f != null) {
                                                sh0Var3.m4072b(oe0VarM3050f);
                                                oe0VarM3050f = null;
                                            }
                                            sh0Var3.m4072b(oe0Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            oe0VarM3050f = pf1.m3050f(sh0Var3);
                        }
                    } else {
                        oe0VarM3050f = oe0VarM3050f.f4534i;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static ei0 m5447q(long j, long j2, long j3, C0616pi c0616pi) {
        long j4;
        long j5 = C0207ff.f1707g;
        C0429lf c0429lf = (C0429lf) c0616pi.m3112j(AbstractC0510nf.f4248a);
        ei0 ei0Var = c0429lf.f3451Z;
        if (ei0Var == null) {
            long jM2697c = AbstractC0510nf.m2697c(c0429lf, AbstractC0307i4.f2425f);
            long jM2697c2 = AbstractC0510nf.m2697c(c0429lf, AbstractC0307i4.f2428i);
            long jM2697c3 = AbstractC0510nf.m2697c(c0429lf, AbstractC0307i4.f2426g);
            EnumC0472mf enumC0472mf = AbstractC0307i4.f2429j;
            long jM2697c4 = AbstractC0510nf.m2697c(c0429lf, enumC0472mf);
            EnumC0472mf enumC0472mf2 = AbstractC0307i4.f2430k;
            j4 = j5;
            ei0 ei0Var2 = new ei0(jM2697c, jM2697c2, jM2697c3, jM2697c4, AbstractC0510nf.m2697c(c0429lf, enumC0472mf2), C0207ff.m1093b(0.38f, AbstractC0510nf.m2697c(c0429lf, enumC0472mf)), C0207ff.m1093b(0.38f, AbstractC0510nf.m2697c(c0429lf, enumC0472mf2)));
            c0429lf.f3451Z = ei0Var2;
            ei0Var = ei0Var2;
        } else {
            j4 = j5;
        }
        return new ei0(j != 16 ? j : ei0Var.f1463a, j2 != 16 ? j2 : ei0Var.f1464b, j3 != 16 ? j3 : ei0Var.f1465c, j4 != 16 ? j4 : ei0Var.f1466d, j4 != 16 ? j4 : ei0Var.f1467e, j4 != 16 ? j4 : ei0Var.f1468f, j4 != 16 ? j4 : ei0Var.f1469g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final void m5448r(C0793u7 c0793u7, long j, float f, InterfaceC0642q7 interfaceC0642q7, C0879w7 c0879w7, InterfaceC0742sw interfaceC0742sw) {
        long jMo2025c = f == 0.0f ? interfaceC0642q7.mo2025c() : (long) ((j - c0793u7.f6148c) / f);
        c0793u7.f6152g = j;
        c0793u7.f6150e.setValue(interfaceC0642q7.mo2024b(jMo2025c));
        c0793u7.f6151f = interfaceC0642q7.mo2028f(jMo2025c);
        if (interfaceC0642q7.m3207g(jMo2025c)) {
            c0793u7.f6153h = c0793u7.f6152g;
            c0793u7.f6154i.setValue(Boolean.FALSE);
        }
        m5430Q(c0793u7, c0879w7);
        interfaceC0742sw.invoke(c0793u7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final boolean m5449s(long j, long j2) {
        return j == j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final C0149dv m5450t(sh0 sh0Var, st0 st0Var, int i) {
        st0 st0VarM4104d;
        C0149dv c0149dv = null;
        if (i == 3) {
            st0VarM4104d = st0Var.m4104d((st0Var.f5834c - st0Var.f5832a) + 1.0f, 0.0f);
        } else if (i == 4) {
            st0VarM4104d = st0Var.m4104d(-((st0Var.f5834c - st0Var.f5832a) + 1.0f), 0.0f);
        } else if (i == 5) {
            st0VarM4104d = st0Var.m4104d(0.0f, (st0Var.f5835d - st0Var.f5833b) + 1.0f);
        } else {
            if (i != 6) {
                C0921xc.m5134o("This function should only be used for 2-D focus search");
                return null;
            }
            st0VarM4104d = st0Var.m4104d(0.0f, -((st0Var.f5835d - st0Var.f5833b) + 1.0f));
        }
        Object[] objArr = sh0Var.f5768d;
        int i2 = sh0Var.f5770f;
        for (int i3 = 0; i3 < i2; i3++) {
            C0149dv c0149dv2 = (C0149dv) objArr[i3];
            if (AbstractC0307i4.m1544t(c0149dv2)) {
                st0 st0VarM1539o = AbstractC0307i4.m1539o(c0149dv2);
                if (m5418E(st0VarM1539o, st0VarM4104d, st0Var, i)) {
                    c0149dv = c0149dv2;
                    st0VarM4104d = st0VarM1539o;
                }
            }
        }
        return c0149dv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final boolean m5451u(C0149dv c0149dv, int i, InterfaceC0742sw interfaceC0742sw) {
        st0 st0Var;
        sh0 sh0Var = new sh0(new C0149dv[16]);
        m5446p(c0149dv, sh0Var);
        int i2 = sh0Var.f5770f;
        if (i2 <= 1) {
            C0149dv c0149dv2 = (C0149dv) (i2 == 0 ? null : sh0Var.f5768d[0]);
            if (c0149dv2 != null) {
                return ((Boolean) interfaceC0742sw.invoke(c0149dv2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                st0 st0VarM1539o = AbstractC0307i4.m1539o(c0149dv);
                float f = st0VarM1539o.f5832a;
                float f2 = st0VarM1539o.f5833b;
                st0Var = new st0(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    C0921xc.m5134o("This function should only be used for 2-D focus search");
                    return false;
                }
                st0 st0VarM1539o2 = AbstractC0307i4.m1539o(c0149dv);
                float f3 = st0VarM1539o2.f5834c;
                float f4 = st0VarM1539o2.f5835d;
                st0Var = new st0(f3, f4, f3, f4);
            }
            C0149dv c0149dvM5450t = m5450t(sh0Var, st0Var, i);
            if (c0149dvM5450t != null) {
                return ((Boolean) interfaceC0742sw.invoke(c0149dvM5450t)).booleanValue();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final boolean m5452v(int i, C0697rp c0697rp, C0149dv c0149dv, st0 st0Var) {
        if (m5427N(i, c0697rp, c0149dv, st0Var)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC0307i4.m1519E(c0149dv, i, new hl0(((C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(c0149dv)).getFocusOwner()).m5612f(), c0149dv, st0Var, i, c0697rp, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final ae0 m5453w(s70 s70Var, int i, long j, xn0 xn0Var, long j2, C0239ga c0239ga, k50 k50Var, int i2, ug0 ug0Var) {
        List list;
        Object objMo2793c = xn0Var.mo2793c(i);
        List list2 = (List) ug0Var.m4248b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listM4009a = s70Var.m4009a(i);
            int size = listM4009a.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((sd0) listM4009a.get(i3)).mo184e(j));
            }
            ug0Var.m4330i(i, arrayList);
            list = arrayList;
        }
        return new ae0(i, i2, list, j2, objMo2793c, c0239ga, k50Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final float m5454x(InterfaceC0618pk interfaceC0618pk) {
        xf0 xf0Var = (xf0) interfaceC0618pk.mo64l(C0496n2.f4131K);
        float fMo591u = xf0Var != null ? xf0Var.mo591u() : 1.0f;
        if (fMo591u >= 0.0f) {
            return fMo591u;
        }
        yr0.m5293b("negative scale factor");
        return fMo591u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final ViewParent m5455y(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(C0587R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static void m5456z(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m5421H(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m5421H(b3) && !m5421H(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        C0921xc.m5131l("Invalid UTF-8");
    }
}
