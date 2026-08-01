package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w60 implements mc1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final boolean m4879A(nr0 nr0Var, long j, long j2) {
        int i = nr0Var.f4313i == 1 ? 1 : 0;
        long j3 = nr0Var.f4307c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static List m4880B(z11 z11Var, int i, z11 z11Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int i2;
        int i3;
        int iM5407u = z11Var.m5407u(i);
        int i4 = i + iM5407u;
        int iM5393f = z11Var.m5393f(i);
        int iM5393f2 = z11Var.m5393f(i4);
        int i5 = iM5393f2 - iM5393f;
        boolean z5 = i >= 0 && (z11Var.f7752b[(z11Var.m5404r(i) * 5) + 1] & 201326592) != 0;
        z11Var2.m5409w(iM5407u);
        z11Var2.m5410x(i5, z11Var2.f7770t);
        if (z11Var.f7757g < i4) {
            z11Var.m5368B(i4);
        }
        if (z11Var.f7761k < iM5393f2) {
            z11Var.m5369C(iM5393f2, i4);
        }
        int[] iArr = z11Var2.f7752b;
        int i6 = z11Var2.f7770t;
        int i7 = i6 * 5;
        AbstractC0201f9.m1055a0(z11Var.f7752b, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = z11Var2.f7753c;
        int i8 = z11Var2.f7759i;
        System.arraycopy(z11Var.f7753c, iM5393f, objArr, i8, i5);
        int i9 = z11Var2.f7772v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + iM5407u;
        int iM5394g = i8 - z11Var2.m5394g(iArr, i6);
        int i12 = z11Var2.f7763m;
        int i13 = z11Var2.f7762l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int iM5394g2 = z11Var2.m5394g(iArr, i15) + iM5394g;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = z11Var2.f7761k;
            }
            iArr2[(i15 * 5) + 4] = z11.m5365i(iM5394g2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        z11Var2.f7763m = i14;
        int iM5199a = y11.m5199a(z11Var.f7754d, i, z11Var.m5402p());
        int iM5199a2 = y11.m5199a(z11Var.f7754d, i4, z11Var.m5402p());
        if (iM5199a < iM5199a2) {
            ArrayList arrayList = z11Var.f7754d;
            ArrayList arrayList2 = new ArrayList(iM5199a2 - iM5199a);
            for (int i17 = iM5199a; i17 < iM5199a2; i17++) {
                C0788u2 c0788u2 = (C0788u2) arrayList.get(i17);
                c0788u2.f6110a += i10;
                arrayList2.add(c0788u2);
            }
            z11Var2.f7754d.addAll(y11.m5199a(z11Var2.f7754d, z11Var2.f7770t, z11Var2.m5402p()), arrayList2);
            arrayList.subList(iM5199a, iM5199a2).clear();
            list = arrayList2;
        } else {
            list = C0294hs.f2354d;
        }
        if (!list.isEmpty()) {
            HashMap map = z11Var.f7755e;
            HashMap map2 = z11Var2.f7755e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = z11Var2.f7772v;
        z11Var2.m5381O(i9);
        int iM5371E = z11Var.m5371E(z11Var.f7752b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iM5371E >= 0;
            if (z7) {
                z11Var.m5382P();
                z11Var.m5388a(iM5371E - z11Var.f7770t);
                z11Var.m5382P();
            }
            z11Var.m5388a(i - z11Var.f7770t);
            boolean zM5374H = z11Var.m5374H();
            if (z7) {
                z11Var.m5379M();
                z11Var.m5396j();
                z11Var.m5379M();
                z11Var.m5396j();
            }
            z4 = zM5374H;
        } else {
            boolean zM5375I = z11Var.m5375I(i, iM5407u);
            z11Var.m5376J(iM5393f, i5, i - 1);
            z4 = zM5375I;
        }
        if (z4) {
            AbstractC0653qi.m3252a("Unexpectedly removed anchors");
        }
        int i20 = z11Var2.f7765o;
        int i21 = iArr3[i7 + 1];
        z11Var2.f7765o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            z11Var2.f7770t = i11;
            z11Var2.f7759i = i8 + i5;
        }
        if (z6) {
            z11Var2.m5386T(i9);
        }
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final boolean m4881C(C0149dv c0149dv, C0697rp c0697rp) {
        Object[] objArr = new C0149dv[16];
        if (!c0149dv.f4529d.f4542q) {
            w10.m4824b("visitChildren called on an unattached node");
        }
        sh0 sh0Var = new sh0(new oe0[16]);
        oe0 oe0Var = c0149dv.f4529d;
        oe0 oe0Var2 = oe0Var.f4534i;
        if (oe0Var2 == null) {
            pf1.m3049e(sh0Var, oe0Var);
        } else {
            sh0Var.m4072b(oe0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = sh0Var.f5770f;
            if (i2 == 0) {
                break;
            }
            oe0 oe0VarM3050f = (oe0) sh0Var.m4081k(i2 - 1);
            if ((oe0VarM3050f.f4532g & 1024) == 0) {
                pf1.m3049e(sh0Var, oe0VarM3050f);
            } else {
                while (true) {
                    if (oe0VarM3050f == null) {
                        break;
                    }
                    if ((oe0VarM3050f.f4531f & 1024) != 0) {
                        sh0 sh0Var2 = null;
                        while (oe0VarM3050f != null) {
                            if (oe0VarM3050f instanceof C0149dv) {
                                C0149dv c0149dv2 = (C0149dv) oe0VarM3050f;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c0149dv2;
                                i = i3;
                            } else if ((oe0VarM3050f.f4531f & 1024) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                int i4 = 0;
                                for (oe0 oe0Var3 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var3 != null; oe0Var3 = oe0Var3.f4534i) {
                                    if ((oe0Var3.f4531f & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            oe0VarM3050f = oe0Var3;
                                        } else {
                                            if (sh0Var2 == null) {
                                                sh0Var2 = new sh0(new oe0[16]);
                                            }
                                            if (oe0VarM3050f != null) {
                                                sh0Var2.m4072b(oe0VarM3050f);
                                                oe0VarM3050f = null;
                                            }
                                            sh0Var2.m4072b(oe0Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            oe0VarM3050f = pf1.m3050f(sh0Var2);
                        }
                    } else {
                        oe0VarM3050f = oe0VarM3050f.f4534i;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, C0186ev.f1529b);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                C0149dv c0149dv3 = (C0149dv) objArr[i5];
                if (AbstractC0307i4.m1544t(c0149dv3) && m4901h(c0149dv3, c0697rp)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final boolean m4882D(C0149dv c0149dv, C0697rp c0697rp) {
        Object[] objArr = new C0149dv[16];
        if (!c0149dv.f4529d.f4542q) {
            w10.m4824b("visitChildren called on an unattached node");
        }
        sh0 sh0Var = new sh0(new oe0[16]);
        oe0 oe0Var = c0149dv.f4529d;
        oe0 oe0Var2 = oe0Var.f4534i;
        if (oe0Var2 == null) {
            pf1.m3049e(sh0Var, oe0Var);
        } else {
            sh0Var.m4072b(oe0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = sh0Var.f5770f;
            if (i2 == 0) {
                break;
            }
            oe0 oe0VarM3050f = (oe0) sh0Var.m4081k(i2 - 1);
            if ((oe0VarM3050f.f4532g & 1024) == 0) {
                pf1.m3049e(sh0Var, oe0VarM3050f);
            } else {
                while (true) {
                    if (oe0VarM3050f == null) {
                        break;
                    }
                    if ((oe0VarM3050f.f4531f & 1024) != 0) {
                        sh0 sh0Var2 = null;
                        while (oe0VarM3050f != null) {
                            if (oe0VarM3050f instanceof C0149dv) {
                                C0149dv c0149dv2 = (C0149dv) oe0VarM3050f;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c0149dv2;
                                i = i3;
                            } else if ((oe0VarM3050f.f4531f & 1024) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                int i4 = 0;
                                for (oe0 oe0Var3 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var3 != null; oe0Var3 = oe0Var3.f4534i) {
                                    if ((oe0Var3.f4531f & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            oe0VarM3050f = oe0Var3;
                                        } else {
                                            if (sh0Var2 == null) {
                                                sh0Var2 = new sh0(new oe0[16]);
                                            }
                                            if (oe0VarM3050f != null) {
                                                sh0Var2.m4072b(oe0VarM3050f);
                                                oe0VarM3050f = null;
                                            }
                                            sh0Var2.m4072b(oe0Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            oe0VarM3050f = pf1.m3050f(sh0Var2);
                        }
                    } else {
                        oe0VarM3050f = oe0VarM3050f.f4534i;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, C0186ev.f1529b);
        for (int i5 = 0; i5 < i; i5++) {
            C0149dv c0149dv3 = (C0149dv) objArr[i5];
            if (AbstractC0307i4.m1544t(c0149dv3) && m4912s(c0149dv3, c0697rp)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static final long m4883E(nr0 nr0Var, boolean z) {
        long jM2933d = ok0.m2933d(nr0Var.f4307c, nr0Var.f4311g);
        if (z || !nr0Var.m2737b()) {
            return jM2933d;
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final String m4884F(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final void m4885G(InterfaceC0356ji interfaceC0356ji, InterfaceC0742sw interfaceC0742sw) {
        ((C0616pi) interfaceC0356ji).m3096b(new C0956ya(11, interfaceC0742sw), na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static final void m4886H(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0197 A[EDGE_INSN: B:157:0x0197->B:127:0x0197 BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m4887I(C0149dv c0149dv, C0149dv c0149dv2, int i, C0697rp c0697rp) {
        oe0 oe0Var;
        b60 b60VarM3039Q;
        mj0 mj0Var;
        if (c0149dv.m727B0() != EnumC0106cv.f894e) {
            C0921xc.m5134o("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new C0149dv[16];
        if (!c0149dv.f4529d.f4542q) {
            w10.m4824b("visitChildren called on an unattached node");
        }
        sh0 sh0Var = new sh0(new oe0[16]);
        oe0 oe0Var2 = c0149dv.f4529d;
        oe0 oe0Var3 = oe0Var2.f4534i;
        if (oe0Var3 == null) {
            pf1.m3049e(sh0Var, oe0Var2);
        } else {
            sh0Var.m4072b(oe0Var3);
        }
        int i2 = 0;
        while (true) {
            int i3 = sh0Var.f5770f;
            oe0Var = null;
            if (i3 == 0) {
                break;
            }
            oe0 oe0VarM3050f = (oe0) sh0Var.m4081k(i3 - 1);
            if ((oe0VarM3050f.f4532g & 1024) == 0) {
                pf1.m3049e(sh0Var, oe0VarM3050f);
            } else {
                while (true) {
                    if (oe0VarM3050f == null) {
                        break;
                    }
                    if ((oe0VarM3050f.f4531f & 1024) != 0) {
                        sh0 sh0Var2 = null;
                        while (oe0VarM3050f != null) {
                            if (oe0VarM3050f instanceof C0149dv) {
                                C0149dv c0149dv3 = (C0149dv) oe0VarM3050f;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = c0149dv3;
                                i2 = i4;
                            } else if ((oe0VarM3050f.f4531f & 1024) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                int i5 = 0;
                                for (oe0 oe0Var4 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var4 != null; oe0Var4 = oe0Var4.f4534i) {
                                    if ((oe0Var4.f4531f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            oe0VarM3050f = oe0Var4;
                                        } else {
                                            if (sh0Var2 == null) {
                                                sh0Var2 = new sh0(new oe0[16]);
                                            }
                                            if (oe0VarM3050f != null) {
                                                sh0Var2.m4072b(oe0VarM3050f);
                                                oe0VarM3050f = null;
                                            }
                                            sh0Var2.m4072b(oe0Var4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            oe0VarM3050f = pf1.m3050f(sh0Var2);
                        }
                    } else {
                        oe0VarM3050f = oe0VarM3050f.f4534i;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i2, C0186ev.f1529b);
        if (i != 1) {
            if (i != 2) {
                C0921xc.m5134o("This function should only be used for 1-D focus search");
                return false;
            }
            z20 z20VarM4893O = m4893O(0, i2);
            int i6 = z20VarM4893O.f7248d;
            int i7 = z20VarM4893O.f7249e;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        C0149dv c0149dv4 = (C0149dv) objArr[i7];
                        if (AbstractC0307i4.m1544t(c0149dv4) && m4901h(c0149dv4, c0697rp)) {
                            break;
                        }
                    }
                    if (p30.m3002l(objArr[i7], c0149dv2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!c0149dv.f4529d.f4542q) {
                }
                oe0 oe0Var5 = c0149dv.f4529d.f4533h;
                b60VarM3039Q = pf1.m3039Q(c0149dv);
                loop5: while (true) {
                    if (b60VarM3039Q == null) {
                    }
                }
                if (oe0Var != null) {
                }
            }
            return false;
        }
        z20 z20VarM4893O2 = m4893O(0, i2);
        int i8 = z20VarM4893O2.f7248d;
        int i9 = z20VarM4893O2.f7249e;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    C0149dv c0149dv5 = (C0149dv) objArr[i8];
                    if (AbstractC0307i4.m1544t(c0149dv5) && m4912s(c0149dv5, c0697rp)) {
                        break;
                    }
                }
                if (p30.m3002l(objArr[i8], c0149dv2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && c0149dv.m733y0().f268a) {
            if (!c0149dv.f4529d.f4542q) {
                w10.m4824b("visitAncestors called on an unattached node");
            }
            oe0 oe0Var52 = c0149dv.f4529d.f4533h;
            b60VarM3039Q = pf1.m3039Q(c0149dv);
            loop5: while (true) {
                if (b60VarM3039Q == null) {
                    break;
                }
                if ((b60VarM3039Q.f395I.f3998f.f4532g & 1024) != 0) {
                    while (oe0Var52 != null) {
                        if ((oe0Var52.f4531f & 1024) != 0) {
                            oe0 oe0VarM3050f2 = oe0Var52;
                            sh0 sh0Var3 = null;
                            while (oe0VarM3050f2 != null) {
                                if (oe0VarM3050f2 instanceof C0149dv) {
                                    oe0Var = oe0VarM3050f2;
                                    break loop5;
                                }
                                if ((oe0VarM3050f2.f4531f & 1024) != 0 && (oe0VarM3050f2 instanceof AbstractC0731sm)) {
                                    int i10 = 0;
                                    for (oe0 oe0Var6 = ((AbstractC0731sm) oe0VarM3050f2).f5782s; oe0Var6 != null; oe0Var6 = oe0Var6.f4534i) {
                                        if ((oe0Var6.f4531f & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                oe0VarM3050f2 = oe0Var6;
                                            } else {
                                                if (sh0Var3 == null) {
                                                    sh0Var3 = new sh0(new oe0[16]);
                                                }
                                                if (oe0VarM3050f2 != null) {
                                                    sh0Var3.m4072b(oe0VarM3050f2);
                                                    oe0VarM3050f2 = null;
                                                }
                                                sh0Var3.m4072b(oe0Var6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oe0VarM3050f2 = pf1.m3050f(sh0Var3);
                            }
                        }
                        oe0Var52 = oe0Var52.f4533h;
                    }
                }
                b60VarM3039Q = b60VarM3039Q.m315v();
                oe0Var52 = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
            }
            if (oe0Var != null) {
                return ((Boolean) c0697rp.invoke(c0149dv)).booleanValue();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static final void m4888J(InterfaceC0356ji interfaceC0356ji, InterfaceC0904ww interfaceC0904ww, Object obj) {
        if (((C0616pi) interfaceC0356ji).f4877S || !p30.m3002l(((C0616pi) interfaceC0356ji).m3080L(), obj)) {
            C0616pi c0616pi = (C0616pi) interfaceC0356ji;
            c0616pi.m3107g0(obj);
            c0616pi.m3096b(interfaceC0904ww, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static void m4889K(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            window.setDecorFitsSystemWindows(z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static x20 m4890L(z20 z20Var) {
        z20Var.getClass();
        return new x20(z20Var.f7248d, z20Var.f7249e, z20Var.f7250f > 0 ? 2 : -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static final void m4891M(Object obj) {
        if (obj instanceof bv0) {
            throw ((bv0) obj).f593d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static final void m4892N() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static z20 m4893O(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new z20(i, i2 - 1, 1);
        }
        z20 z20Var = z20.f7777g;
        return z20.f7777g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m4894a(final pe0 pe0Var, final c90 c90Var, jn0 jn0Var, InterfaceC0794u8 interfaceC0794u8, C0239ga c0239ga, final InterfaceC0975yt interfaceC0975yt, C0343j5 c0343j5, final InterfaceC0742sw interfaceC0742sw, InterfaceC0356ji interfaceC0356ji, final int i) {
        final jn0 jn0Var2;
        final InterfaceC0794u8 interfaceC0794u82;
        final C0239ga c0239ga2;
        final C0343j5 c0343j52;
        int i2;
        C0239ga c0239ga3;
        C0343j5 c0343j5M359a;
        jn0 jn0Var3;
        InterfaceC0794u8 interfaceC0794u83;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-1884325601);
        int i3 = i | (c0616pi.m3104f(c90Var) ? 32 : 16) | 208256 | (c0616pi.m3104f(interfaceC0975yt) ? 1048576 : 524288) | 33554432 | (c0616pi.m3108h(interfaceC0742sw) ? 536870912 : 268435456);
        if (c0616pi.m3082O(i3 & 1, (306783379 & i3) != 306783378)) {
            c0616pi.m3087T();
            if ((i & 1) == 0 || c0616pi.m3128y()) {
                ln0 ln0Var = new ln0(0.0f, 0.0f, 0.0f, 0.0f);
                C0755t8 c0755t8 = rd0.f5362a;
                i2 = i3 & (-234938369);
                c0239ga3 = C0496n2.f4154n;
                c0343j5M359a = bn0.m359a(c0616pi);
                jn0Var3 = ln0Var;
                interfaceC0794u83 = c0755t8;
            } else {
                c0616pi.m3085R();
                i2 = i3 & (-234938369);
                jn0Var3 = jn0Var;
                interfaceC0794u83 = interfaceC0794u8;
                c0239ga3 = c0239ga;
                c0343j5M359a = c0343j5;
            }
            c0616pi.m3120q();
            j50.m1651a(pe0Var, c90Var, jn0Var3, interfaceC0975yt, c0343j5M359a, c0239ga3, interfaceC0794u83, interfaceC0742sw, c0616pi, (i2 & 112) | 28038 | (458752 & (i2 >> 3)) | 1572864, 48 | ((i2 >> 18) & 7168));
            jn0Var2 = jn0Var3;
            c0343j52 = c0343j5M359a;
            c0239ga2 = c0239ga3;
            interfaceC0794u82 = interfaceC0794u83;
        } else {
            c0616pi.m3085R();
            jn0Var2 = jn0Var;
            interfaceC0794u82 = interfaceC0794u8;
            c0239ga2 = c0239ga;
            c0343j52 = c0343j5;
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww(c90Var, jn0Var2, interfaceC0794u82, c0239ga2, interfaceC0975yt, c0343j52, interfaceC0742sw, i) { // from class: v60

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ c90 f6418e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ jn0 f6419f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ InterfaceC0794u8 f6420g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C0239ga f6421h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ InterfaceC0975yt f6422i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ C0343j5 f6423j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ InterfaceC0742sw f6424k;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM1649A = j50.m1649A(12582919);
                    w60.m4894a(this.f6417d, this.f6418e, this.f6419f, this.f6420g, this.f6421h, this.f6422i, this.f6423j, this.f6424k, (InterfaceC0356ji) obj, iM1649A);
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x034d A[PHI: r3
  0x034d: PHI (r3v39 boolean) = (r3v32 boolean), (r3v40 boolean) binds: [B:238:0x034b, B:234:0x0345] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x047b  */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r1v21, types: [pi] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v10, types: [pi] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v29, types: [ji] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4895b(pe0 pe0Var, final C0399km c0399km, final jn0 jn0Var, final f21 f21Var, final boolean z, final C0343j5 c0343j5, final C0496n2 c0496n2, aj0 aj0Var, final C0239ga c0239ga, final C0496n2 c0496n22, final C0474mh c0474mh, InterfaceC0356ji interfaceC0356ji, final int i, final int i2) {
        int i3;
        int i4;
        pe0 pe0Var2;
        C0399km c0399km2;
        ?? r7;
        boolean z2;
        boolean z3;
        boolean zM3104f;
        int i5;
        boolean z4;
        int i6;
        final ?? r11;
        final C0399km c0399km3;
        final InterfaceC0966yk interfaceC0966yk;
        x70 x70Var;
        Object obj;
        ?? r1;
        int i7;
        Object obj2;
        int i8;
        Object obj3;
        InterfaceC0386kb interfaceC0386kb;
        int i9;
        Object obj4;
        pe0 pe0VarM1934t;
        aj0 aj0Var2 = aj0Var;
        C0202fa c0202fa = C0496n2.f4158r;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-572816025);
        if ((i & 6) == 0) {
            i3 = i | (c0616pi.m3104f(pe0Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0616pi.m3104f(c0399km) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0616pi.m3104f(jn0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0616pi.m3106g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c0616pi.m3100d(1) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= c0616pi.m3104f(f21Var) ? MethodData.ACC_DECLARED_SYNCHRONIZED : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c0616pi.m3106g(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c0616pi.m3104f(c0343j5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c0616pi.m3100d(0) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c0616pi.m3098c(0.0f) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c0616pi.m3104f(c0496n2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0616pi.m3108h(aj0Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0616pi.m3108h(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0616pi.m3104f(c0202fa) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c0616pi.m3104f(c0239ga) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= c0616pi.m3104f(c0496n22) ? MethodData.ACC_DECLARED_SYNCHRONIZED : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= c0616pi.m3108h(c0474mh) ? 1048576 : 524288;
        }
        int i10 = i4;
        if (c0616pi.m3082O(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i10) == 599186) ? false : true)) {
            int i11 = i3 & 112;
            boolean z5 = i11 == 32;
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            Object obj5 = objM3080L;
            if (z5 || objM3080L == c0675r3) {
                final int i12 = 0;
                InterfaceC0298hw interfaceC0298hw = new InterfaceC0298hw() { // from class: u70
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0298hw
                    public final Object invoke() {
                        int iMo1941n;
                        int i13 = i12;
                        C0399km c0399km4 = c0399km;
                        switch (i13) {
                            case 0:
                                iMo1941n = c0399km4.mo1941n();
                                break;
                            default:
                                iMo1941n = c0399km4.mo1941n();
                                break;
                        }
                        return Integer.valueOf(iMo1941n);
                    }
                };
                c0616pi.m3107g0(interfaceC0298hw);
                obj5 = interfaceC0298hw;
            }
            InterfaceC0298hw interfaceC0298hw2 = (InterfaceC0298hw) obj5;
            int i13 = i3 >> 3;
            int i14 = i13 & 14;
            int i15 = i10 >> 15;
            int i16 = i14 | (i15 & 112) | (i10 & 896);
            oh0 oh0VarM3424z = r60.m3424z(c0474mh, c0616pi);
            oh0 oh0VarM3424z2 = r60.m3424z(null, c0616pi);
            boolean zM3104f2 = ((((i16 & 14) ^ 6) > 4 && c0616pi.m3104f(c0399km)) || (i16 & 6) == 4) | c0616pi.m3104f(oh0VarM3424z) | c0616pi.m3104f(oh0VarM3424z2) | c0616pi.m3104f(interfaceC0298hw2);
            Object objM3080L2 = c0616pi.m3080L();
            if (zM3104f2 || objM3080L2 == c0675r3) {
                C0496n2 c0496n23 = C0496n2.f4138R;
                int i17 = 4;
                objM3080L2 = new x70(0, 0, w31.class, r60.m3410l(c0496n23, new C0081c7(i17, r60.m3410l(c0496n23, new C0607p9(oh0VarM3424z, oh0VarM3424z2, interfaceC0298hw2, i17)), c0399km)), "value", "getValue()Ljava/lang/Object;");
                c0616pi.m3107g0(objM3080L2);
            }
            x70 x70Var2 = (x70) objM3080L2;
            Object objM3080L3 = c0616pi.m3080L();
            Object obj6 = objM3080L3;
            if (objM3080L3 == c0675r3) {
                InterfaceC0966yk interfaceC0966ykM4054s = s91.m4054s(c0616pi);
                c0616pi.m3107g0(interfaceC0966ykM4054s);
                obj6 = interfaceC0966ykM4054s;
            }
            InterfaceC0966yk interfaceC0966yk2 = (InterfaceC0966yk) obj6;
            boolean z6 = i11 == 32;
            Object objM3080L4 = c0616pi.m3080L();
            Object obj7 = objM3080L4;
            if (z6 || objM3080L4 == c0675r3) {
                final int i18 = 1;
                InterfaceC0298hw interfaceC0298hw3 = new InterfaceC0298hw() { // from class: u70
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0298hw
                    public final Object invoke() {
                        int iMo1941n;
                        int i132 = i18;
                        C0399km c0399km4 = c0399km;
                        switch (i132) {
                            case 0:
                                iMo1941n = c0399km4.mo1941n();
                                break;
                            default:
                                iMo1941n = c0399km4.mo1941n();
                                break;
                        }
                        return Integer.valueOf(iMo1941n);
                    }
                };
                c0616pi.m3107g0(interfaceC0298hw3);
                obj7 = interfaceC0298hw3;
            }
            InterfaceC0298hw interfaceC0298hw4 = (InterfaceC0298hw) obj7;
            int i19 = i3 >> 9;
            int i20 = (i3 & 65520) | (i19 & 458752) | (i19 & 3670016) | ((i10 << 21) & 29360128);
            int i21 = i10 << 15;
            int i22 = i20 | (i21 & 234881024) | (i21 & 1879048192);
            boolean z7 = ((((i22 & 896) ^ 384) > 256 && c0616pi.m3104f(jn0Var)) || (i22 & 384) == 256) | ((((i22 & 112) ^ 48) > 32 && c0616pi.m3104f(c0399km)) || (i22 & 48) == 32) | ((((i22 & 7168) ^ 3072) > 2048 && c0616pi.m3106g(false)) || (i22 & 3072) == 2048);
            if (((57344 & i22) ^ 24576) <= 16384 || !c0616pi.m3100d(1)) {
                boolean z8 = (i22 & 24576) == 16384;
                boolean zM3104f3 = ((((i22 & 234881024) ^ 100663296) > 67108864 && c0616pi.m3104f(c0202fa)) || (i22 & 100663296) == 67108864) | z7 | z8 | ((((i22 & 1879048192) ^ 805306368) > 536870912 && c0616pi.m3104f(c0239ga)) || (i22 & 805306368) == 536870912) | ((((i22 & 3670016) ^ 1572864) > 1048576 && c0616pi.m3098c(0.0f)) || (i22 & 1572864) == 1048576) | ((((i22 & 29360128) ^ 12582912) > 8388608 && c0616pi.m3104f(c0496n2)) || (i22 & 12582912) == 8388608) | ((((i15 & 14) ^ 6) > 4 && c0616pi.m3104f(c0496n22)) || (i15 & 6) == 4) | c0616pi.m3104f(interfaceC0298hw4);
                if (((i22 & 458752) ^ 196608) > 131072) {
                    z2 = false;
                    if (c0616pi.m3100d(0)) {
                        z3 = true;
                        zM3104f = z3 | zM3104f3 | c0616pi.m3104f(interfaceC0966yk2);
                        Object objM3080L5 = c0616pi.m3080L();
                        if (!zM3104f || objM3080L5 == c0675r3) {
                            C0616pi c0616pi2 = c0616pi;
                            i5 = 32;
                            z4 = true;
                            i6 = 4;
                            r11 = z2;
                            c0399km3 = c0399km;
                            yn0 yn0Var = new yn0(c0399km3, jn0Var, c0496n2, x70Var2, interfaceC0298hw4, c0239ga, c0496n22, interfaceC0966yk2);
                            interfaceC0966yk = interfaceC0966yk2;
                            x70Var = x70Var2;
                            c0616pi2.m3107g0(yn0Var);
                            r1 = c0616pi2;
                            obj = yn0Var;
                        } else {
                            r1 = c0616pi;
                            interfaceC0966yk = interfaceC0966yk2;
                            x70Var = x70Var2;
                            i5 = 32;
                            z4 = true;
                            i6 = 4;
                            r11 = z2;
                            c0399km3 = c0399km;
                            obj = objM3080L5;
                        }
                        r70 r70Var = (r70) obj;
                        i7 = (r1.m3106g(r11) ? 1 : 0) | ((((i14 ^ 6) > i6 || !r1.m3104f(c0399km3)) && (i13 & 6) != i6) ? r11 : z4 ? 1 : 0);
                        Object objM3080L6 = r1.m3080L();
                        obj2 = objM3080L6;
                        if (i7 != 0 || objM3080L6 == c0675r3) {
                            g80 g80Var = new g80(c0399km3, r11);
                            r1.m3107g0(g80Var);
                            obj2 = g80Var;
                        }
                        f80 f80Var = (f80) obj2;
                        i8 = ((i3 & 458752) != 131072 ? z4 ? 1 : 0 : r11) | (i11 != i5 ? z4 ? 1 : 0 : r11);
                        Object objM3080L7 = r1.m3080L();
                        obj3 = objM3080L7;
                        if (i8 == 0 || objM3080L7 == c0675r3) {
                            qo0 qo0Var = new qo0(f21Var, c0399km3);
                            r1.m3107g0(qo0Var);
                            obj3 = qo0Var;
                        }
                        qo0 qo0Var2 = (qo0) obj3;
                        interfaceC0386kb = (InterfaceC0386kb) r1.m3112j(AbstractC0468mb.f3908a);
                        i9 = (i11 != i5 ? z4 ? 1 : 0 : r11) | (r1.m3104f(interfaceC0386kb) ? 1 : 0);
                        Object objM3080L8 = r1.m3080L();
                        obj4 = objM3080L8;
                        if (i9 == 0 || objM3080L8 == c0675r3) {
                            on0 on0Var = new on0(c0399km3, interfaceC0386kb);
                            r1.m3107g0(on0Var);
                            obj4 = on0Var;
                        }
                        on0 on0Var2 = (on0) obj4;
                        me0 me0Var = me0.f3922a;
                        um0 um0Var = um0.f6265e;
                        if (z) {
                            r1.m3090W(-853392933);
                            r1.m3119p(r11);
                            pe0VarM1934t = me0Var;
                        } else {
                            r1.m3090W(-853822717);
                            int i23 = i14 | ((i3 >> 21) & 112);
                            ?? r12 = ((((i23 & 14) ^ 6) <= i6 || !r1.m3104f(c0399km3)) && (i23 & 6) != i6) ? r11 : z4 ? 1 : 0;
                            if (((i23 & 112) ^ 48) > i5) {
                                ?? r26 = z4;
                                if (!r1.m3100d(r11)) {
                                    r26 = z4;
                                    if ((i23 & 48) != i5) {
                                        r26 = r11;
                                    }
                                }
                                int i24 = r12 | r26;
                                Object objM3080L9 = r1.m3080L();
                                Object obj8 = objM3080L9;
                                if (i24 != 0 || objM3080L9 == c0675r3) {
                                    nn0 nn0Var = new nn0(c0399km3);
                                    r1.m3107g0(nn0Var);
                                    obj8 = nn0Var;
                                }
                                pe0VarM1934t = AbstractC0398kl.m1934t((nn0) obj8, c0399km3.f3562w, um0Var);
                                r1.m3119p(r11);
                            }
                        }
                        pe0Var2 = pe0Var;
                        pe0 pe0VarM2979O = p30.m2979O(pe0Var2.mo2499c(c0399km3.f3565z).mo2499c(c0399km3.f3563x), x70Var, f80Var, um0Var, z);
                        pe0 pe0VarM4027N = s91.m4027N((!z ? pe0VarM2979O.mo2499c(uz0.m4362a(me0Var, new InterfaceC0742sw() { // from class: tn0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p000.InterfaceC0742sw
                            public final Object invoke(Object obj9) {
                                f01 f01Var = (f01) obj9;
                                boolean z9 = r11;
                                final C0399km c0399km4 = c0399km3;
                                final InterfaceC0966yk interfaceC0966yk3 = interfaceC0966yk;
                                if (z9) {
                                    final int i25 = 0;
                                    InterfaceC0298hw interfaceC0298hw5 = new InterfaceC0298hw() { // from class: un0
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p000.InterfaceC0298hw
                                        public final Object invoke() {
                                            int i26 = i25;
                                            InterfaceC0322ik interfaceC0322ik = null;
                                            InterfaceC0966yk interfaceC0966yk4 = interfaceC0966yk3;
                                            C0399km c0399km5 = c0399km4;
                                            boolean z10 = false;
                                            boolean z11 = false;
                                            boolean z12 = false;
                                            boolean z13 = false;
                                            int i27 = 1;
                                            switch (i26) {
                                                case 0:
                                                    if (c0399km5.mo500a()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                        z10 = true;
                                                    }
                                                    return Boolean.valueOf(z10);
                                                case 1:
                                                    if (c0399km5.mo502c()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i27), 3);
                                                        z13 = true;
                                                    }
                                                    return Boolean.valueOf(z13);
                                                case 2:
                                                    if (c0399km5.mo500a()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                        z12 = true;
                                                    }
                                                    return Boolean.valueOf(z12);
                                                default:
                                                    if (c0399km5.mo502c()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i27), 3);
                                                        z11 = true;
                                                    }
                                                    return Boolean.valueOf(z11);
                                            }
                                        }
                                    };
                                    u40[] u40VarArr = d01.f923a;
                                    f01Var.mo17a(rz0.f5611x, new C0533o0(null, interfaceC0298hw5));
                                    final int i26 = 1;
                                    f01Var.mo17a(rz0.f5613z, new C0533o0(null, new InterfaceC0298hw() { // from class: un0
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p000.InterfaceC0298hw
                                        public final Object invoke() {
                                            int i262 = i26;
                                            InterfaceC0322ik interfaceC0322ik = null;
                                            InterfaceC0966yk interfaceC0966yk4 = interfaceC0966yk3;
                                            C0399km c0399km5 = c0399km4;
                                            boolean z10 = false;
                                            boolean z11 = false;
                                            boolean z12 = false;
                                            boolean z13 = false;
                                            int i27 = 1;
                                            switch (i262) {
                                                case 0:
                                                    if (c0399km5.mo500a()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                        z10 = true;
                                                    }
                                                    return Boolean.valueOf(z10);
                                                case 1:
                                                    if (c0399km5.mo502c()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i27), 3);
                                                        z13 = true;
                                                    }
                                                    return Boolean.valueOf(z13);
                                                case 2:
                                                    if (c0399km5.mo500a()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                        z12 = true;
                                                    }
                                                    return Boolean.valueOf(z12);
                                                default:
                                                    if (c0399km5.mo502c()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i27), 3);
                                                        z11 = true;
                                                    }
                                                    return Boolean.valueOf(z11);
                                            }
                                        }
                                    }));
                                } else {
                                    final int i27 = 2;
                                    InterfaceC0298hw interfaceC0298hw6 = new InterfaceC0298hw() { // from class: un0
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p000.InterfaceC0298hw
                                        public final Object invoke() {
                                            int i262 = i27;
                                            InterfaceC0322ik interfaceC0322ik = null;
                                            InterfaceC0966yk interfaceC0966yk4 = interfaceC0966yk3;
                                            C0399km c0399km5 = c0399km4;
                                            boolean z10 = false;
                                            boolean z11 = false;
                                            boolean z12 = false;
                                            boolean z13 = false;
                                            int i272 = 1;
                                            switch (i262) {
                                                case 0:
                                                    if (c0399km5.mo500a()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                        z10 = true;
                                                    }
                                                    return Boolean.valueOf(z10);
                                                case 1:
                                                    if (c0399km5.mo502c()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i272), 3);
                                                        z13 = true;
                                                    }
                                                    return Boolean.valueOf(z13);
                                                case 2:
                                                    if (c0399km5.mo500a()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                        z12 = true;
                                                    }
                                                    return Boolean.valueOf(z12);
                                                default:
                                                    if (c0399km5.mo502c()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i272), 3);
                                                        z11 = true;
                                                    }
                                                    return Boolean.valueOf(z11);
                                            }
                                        }
                                    };
                                    u40[] u40VarArr2 = d01.f923a;
                                    f01Var.mo17a(rz0.f5612y, new C0533o0(null, interfaceC0298hw6));
                                    final int i28 = 3;
                                    f01Var.mo17a(rz0.f5586A, new C0533o0(null, new InterfaceC0298hw() { // from class: un0
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p000.InterfaceC0298hw
                                        public final Object invoke() {
                                            int i262 = i28;
                                            InterfaceC0322ik interfaceC0322ik = null;
                                            InterfaceC0966yk interfaceC0966yk4 = interfaceC0966yk3;
                                            C0399km c0399km5 = c0399km4;
                                            boolean z10 = false;
                                            boolean z11 = false;
                                            boolean z12 = false;
                                            boolean z13 = false;
                                            int i272 = 1;
                                            switch (i262) {
                                                case 0:
                                                    if (c0399km5.mo500a()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                        z10 = true;
                                                    }
                                                    return Boolean.valueOf(z10);
                                                case 1:
                                                    if (c0399km5.mo502c()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i272), 3);
                                                        z13 = true;
                                                    }
                                                    return Boolean.valueOf(z13);
                                                case 2:
                                                    if (c0399km5.mo500a()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                        z12 = true;
                                                    }
                                                    return Boolean.valueOf(z12);
                                                default:
                                                    if (c0399km5.mo502c()) {
                                                        AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i272), 3);
                                                        z11 = true;
                                                    }
                                                    return Boolean.valueOf(z11);
                                            }
                                        }
                                    }));
                                }
                                return na1.f4229a;
                            }
                        })) : pe0VarM2979O.mo2499c(me0Var)).mo2499c(pe0VarM1934t), c0399km3, um0Var, c0343j5, z, qo0Var2, c0399km3.f3557r, on0Var2);
                        c0399km2 = c0399km3;
                        C0308i5 c0308i5 = new C0308i5(2, c0399km2);
                        ir0 ir0Var = o51.f4465a;
                        aj0Var2 = aj0Var;
                        ?? r72 = r1;
                        r60.m3400b(x70Var, AbstractC0398kl.m1935u(pe0VarM4027N.mo2499c(new n51(c0399km2, null, c0308i5, 6)), aj0Var2), c0399km2.f3560u, r70Var, r72, 0);
                        r7 = r72;
                    }
                } else {
                    z2 = false;
                }
                if ((i22 & 196608) != 131072) {
                    z3 = z2;
                }
                zM3104f = z3 | zM3104f3 | c0616pi.m3104f(interfaceC0966yk2);
                Object objM3080L52 = c0616pi.m3080L();
                if (zM3104f) {
                    C0616pi c0616pi22 = c0616pi;
                    i5 = 32;
                    z4 = true;
                    i6 = 4;
                    r11 = z2;
                    c0399km3 = c0399km;
                    yn0 yn0Var2 = new yn0(c0399km3, jn0Var, c0496n2, x70Var2, interfaceC0298hw4, c0239ga, c0496n22, interfaceC0966yk2);
                    interfaceC0966yk = interfaceC0966yk2;
                    x70Var = x70Var2;
                    c0616pi22.m3107g0(yn0Var2);
                    r1 = c0616pi22;
                    obj = yn0Var2;
                    r70 r70Var2 = (r70) obj;
                    if ((i14 ^ 6) > i6) {
                        i7 = (r1.m3106g(r11) ? 1 : 0) | ((((i14 ^ 6) > i6 || !r1.m3104f(c0399km3)) && (i13 & 6) != i6) ? r11 : z4 ? 1 : 0);
                        Object objM3080L62 = r1.m3080L();
                        obj2 = objM3080L62;
                        if (i7 != 0) {
                            g80 g80Var2 = new g80(c0399km3, r11);
                            r1.m3107g0(g80Var2);
                            obj2 = g80Var2;
                            f80 f80Var2 = (f80) obj2;
                            if (i11 != i5) {
                            }
                            i8 = ((i3 & 458752) != 131072 ? z4 ? 1 : 0 : r11) | (i11 != i5 ? z4 ? 1 : 0 : r11);
                            Object objM3080L72 = r1.m3080L();
                            obj3 = objM3080L72;
                            if (i8 == 0) {
                                qo0 qo0Var3 = new qo0(f21Var, c0399km3);
                                r1.m3107g0(qo0Var3);
                                obj3 = qo0Var3;
                                qo0 qo0Var22 = (qo0) obj3;
                                interfaceC0386kb = (InterfaceC0386kb) r1.m3112j(AbstractC0468mb.f3908a);
                                i9 = (i11 != i5 ? z4 ? 1 : 0 : r11) | (r1.m3104f(interfaceC0386kb) ? 1 : 0);
                                Object objM3080L82 = r1.m3080L();
                                obj4 = objM3080L82;
                                if (i9 == 0) {
                                    on0 on0Var3 = new on0(c0399km3, interfaceC0386kb);
                                    r1.m3107g0(on0Var3);
                                    obj4 = on0Var3;
                                    on0 on0Var22 = (on0) obj4;
                                    me0 me0Var2 = me0.f3922a;
                                    um0 um0Var2 = um0.f6265e;
                                    if (z) {
                                    }
                                    pe0Var2 = pe0Var;
                                    pe0 pe0VarM2979O2 = p30.m2979O(pe0Var2.mo2499c(c0399km3.f3565z).mo2499c(c0399km3.f3563x), x70Var, f80Var2, um0Var2, z);
                                    pe0 pe0VarM4027N2 = s91.m4027N((!z ? pe0VarM2979O2.mo2499c(uz0.m4362a(me0Var2, new InterfaceC0742sw() { // from class: tn0
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p000.InterfaceC0742sw
                                        public final Object invoke(Object obj9) {
                                            f01 f01Var = (f01) obj9;
                                            boolean z9 = r11;
                                            final C0399km c0399km4 = c0399km3;
                                            final InterfaceC0966yk interfaceC0966yk3 = interfaceC0966yk;
                                            if (z9) {
                                                final int i25 = 0;
                                                InterfaceC0298hw interfaceC0298hw5 = new InterfaceC0298hw() { // from class: un0
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                    @Override // p000.InterfaceC0298hw
                                                    public final Object invoke() {
                                                        int i262 = i25;
                                                        InterfaceC0322ik interfaceC0322ik = null;
                                                        InterfaceC0966yk interfaceC0966yk4 = interfaceC0966yk3;
                                                        C0399km c0399km5 = c0399km4;
                                                        boolean z10 = false;
                                                        boolean z11 = false;
                                                        boolean z12 = false;
                                                        boolean z13 = false;
                                                        int i272 = 1;
                                                        switch (i262) {
                                                            case 0:
                                                                if (c0399km5.mo500a()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                                    z10 = true;
                                                                }
                                                                return Boolean.valueOf(z10);
                                                            case 1:
                                                                if (c0399km5.mo502c()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i272), 3);
                                                                    z13 = true;
                                                                }
                                                                return Boolean.valueOf(z13);
                                                            case 2:
                                                                if (c0399km5.mo500a()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                                    z12 = true;
                                                                }
                                                                return Boolean.valueOf(z12);
                                                            default:
                                                                if (c0399km5.mo502c()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i272), 3);
                                                                    z11 = true;
                                                                }
                                                                return Boolean.valueOf(z11);
                                                        }
                                                    }
                                                };
                                                u40[] u40VarArr = d01.f923a;
                                                f01Var.mo17a(rz0.f5611x, new C0533o0(null, interfaceC0298hw5));
                                                final int i26 = 1;
                                                f01Var.mo17a(rz0.f5613z, new C0533o0(null, new InterfaceC0298hw() { // from class: un0
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                    @Override // p000.InterfaceC0298hw
                                                    public final Object invoke() {
                                                        int i262 = i26;
                                                        InterfaceC0322ik interfaceC0322ik = null;
                                                        InterfaceC0966yk interfaceC0966yk4 = interfaceC0966yk3;
                                                        C0399km c0399km5 = c0399km4;
                                                        boolean z10 = false;
                                                        boolean z11 = false;
                                                        boolean z12 = false;
                                                        boolean z13 = false;
                                                        int i272 = 1;
                                                        switch (i262) {
                                                            case 0:
                                                                if (c0399km5.mo500a()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                                    z10 = true;
                                                                }
                                                                return Boolean.valueOf(z10);
                                                            case 1:
                                                                if (c0399km5.mo502c()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i272), 3);
                                                                    z13 = true;
                                                                }
                                                                return Boolean.valueOf(z13);
                                                            case 2:
                                                                if (c0399km5.mo500a()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                                    z12 = true;
                                                                }
                                                                return Boolean.valueOf(z12);
                                                            default:
                                                                if (c0399km5.mo502c()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i272), 3);
                                                                    z11 = true;
                                                                }
                                                                return Boolean.valueOf(z11);
                                                        }
                                                    }
                                                }));
                                            } else {
                                                final int i27 = 2;
                                                InterfaceC0298hw interfaceC0298hw6 = new InterfaceC0298hw() { // from class: un0
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                    @Override // p000.InterfaceC0298hw
                                                    public final Object invoke() {
                                                        int i262 = i27;
                                                        InterfaceC0322ik interfaceC0322ik = null;
                                                        InterfaceC0966yk interfaceC0966yk4 = interfaceC0966yk3;
                                                        C0399km c0399km5 = c0399km4;
                                                        boolean z10 = false;
                                                        boolean z11 = false;
                                                        boolean z12 = false;
                                                        boolean z13 = false;
                                                        int i272 = 1;
                                                        switch (i262) {
                                                            case 0:
                                                                if (c0399km5.mo500a()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                                    z10 = true;
                                                                }
                                                                return Boolean.valueOf(z10);
                                                            case 1:
                                                                if (c0399km5.mo502c()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i272), 3);
                                                                    z13 = true;
                                                                }
                                                                return Boolean.valueOf(z13);
                                                            case 2:
                                                                if (c0399km5.mo500a()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                                    z12 = true;
                                                                }
                                                                return Boolean.valueOf(z12);
                                                            default:
                                                                if (c0399km5.mo502c()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i272), 3);
                                                                    z11 = true;
                                                                }
                                                                return Boolean.valueOf(z11);
                                                        }
                                                    }
                                                };
                                                u40[] u40VarArr2 = d01.f923a;
                                                f01Var.mo17a(rz0.f5612y, new C0533o0(null, interfaceC0298hw6));
                                                final int i28 = 3;
                                                f01Var.mo17a(rz0.f5586A, new C0533o0(null, new InterfaceC0298hw() { // from class: un0
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                    @Override // p000.InterfaceC0298hw
                                                    public final Object invoke() {
                                                        int i262 = i28;
                                                        InterfaceC0322ik interfaceC0322ik = null;
                                                        InterfaceC0966yk interfaceC0966yk4 = interfaceC0966yk3;
                                                        C0399km c0399km5 = c0399km4;
                                                        boolean z10 = false;
                                                        boolean z11 = false;
                                                        boolean z12 = false;
                                                        boolean z13 = false;
                                                        int i272 = 1;
                                                        switch (i262) {
                                                            case 0:
                                                                if (c0399km5.mo500a()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                                    z10 = true;
                                                                }
                                                                return Boolean.valueOf(z10);
                                                            case 1:
                                                                if (c0399km5.mo502c()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i272), 3);
                                                                    z13 = true;
                                                                }
                                                                return Boolean.valueOf(z13);
                                                            case 2:
                                                                if (c0399km5.mo500a()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, z10 ? 1 : 0), 3);
                                                                    z12 = true;
                                                                }
                                                                return Boolean.valueOf(z12);
                                                            default:
                                                                if (c0399km5.mo502c()) {
                                                                    AbstractC0307i4.m1547w(interfaceC0966yk4, null, new vn0(c0399km5, interfaceC0322ik, i272), 3);
                                                                    z11 = true;
                                                                }
                                                                return Boolean.valueOf(z11);
                                                        }
                                                    }
                                                }));
                                            }
                                            return na1.f4229a;
                                        }
                                    })) : pe0VarM2979O2.mo2499c(me0Var2)).mo2499c(pe0VarM1934t), c0399km3, um0Var2, c0343j5, z, qo0Var22, c0399km3.f3557r, on0Var22);
                                    c0399km2 = c0399km3;
                                    C0308i5 c0308i52 = new C0308i5(2, c0399km2);
                                    ir0 ir0Var2 = o51.f4465a;
                                    aj0Var2 = aj0Var;
                                    ?? r722 = r1;
                                    r60.m3400b(x70Var, AbstractC0398kl.m1935u(pe0VarM4027N2.mo2499c(new n51(c0399km2, null, c0308i52, 6)), aj0Var2), c0399km2.f3560u, r70Var2, r722, 0);
                                    r7 = r722;
                                }
                            }
                        }
                    } else {
                        i7 = (r1.m3106g(r11) ? 1 : 0) | ((((i14 ^ 6) > i6 || !r1.m3104f(c0399km3)) && (i13 & 6) != i6) ? r11 : z4 ? 1 : 0);
                        Object objM3080L622 = r1.m3080L();
                        obj2 = objM3080L622;
                        if (i7 != 0) {
                        }
                    }
                }
            }
        } else {
            pe0Var2 = pe0Var;
            c0399km2 = c0399km;
            C0616pi c0616pi3 = c0616pi;
            c0616pi3.m3085R();
            r7 = c0616pi3;
        }
        ht0 ht0VarM3121r = r7.m3121r();
        if (ht0VarM3121r != null) {
            final C0399km c0399km4 = c0399km2;
            final aj0 aj0Var3 = aj0Var2;
            final pe0 pe0Var3 = pe0Var2;
            ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: v70
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    int iM1649A = j50.m1649A(i | 1);
                    int iM1649A2 = j50.m1649A(i2);
                    w60.m4895b(pe0Var3, c0399km4, jn0Var, f21Var, z, c0343j5, c0496n2, aj0Var3, c0239ga, c0496n22, c0474mh, (InterfaceC0356ji) obj9, iM1649A, iM1649A2);
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final Object[] m4896c(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC0201f9.m1059e0(objArr, objArr2, 0, i, 6);
        AbstractC0201f9.m1057c0(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final Object[] m4897d(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC0201f9.m1059e0(objArr, objArr2, 0, i, 6);
        AbstractC0201f9.m1057c0(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final Object[] m4898e(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0201f9.m1059e0(objArr, objArr2, 0, i, 6);
        AbstractC0201f9.m1057c0(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final String m4899f(Object[] objArr, int i, int i2, AbstractC0001a0 abstractC0001a0) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC0001a0) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m4900g(StringBuilder sb, Object obj, InterfaceC0742sw interfaceC0742sw) {
        if (interfaceC0742sw != null) {
            sb.append((CharSequence) interfaceC0742sw.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[RETURN] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m4901h(C0149dv c0149dv, C0697rp c0697rp) {
        int iOrdinal = c0149dv.m727B0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0149dv c0149dvM1541q = AbstractC0307i4.m1541q(c0149dv);
                if (c0149dvM1541q == null) {
                    C0921xc.m5134o("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = c0149dvM1541q.m727B0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                C0921xc.m5129j();
                                return false;
                            }
                            C0921xc.m5134o("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (m4901h(c0149dvM1541q, c0697rp) || m4913t(c0149dv, c0149dvM1541q, 2, c0697rp) || (c0149dvM1541q.m733y0().f268a && ((Boolean) c0697rp.invoke(c0149dvM1541q)).booleanValue())) {
                        return true;
                    }
                }
                return m4913t(c0149dv, c0149dvM1541q, 2, c0697rp);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C0921xc.m5129j();
                    return false;
                }
                if (!m4881C(c0149dv, c0697rp)) {
                    if (!(c0149dv.m733y0().f268a ? ((Boolean) c0697rp.invoke(c0149dv)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return m4881C(c0149dv, c0697rp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final boolean m4902i(nr0 nr0Var) {
        return !nr0Var.f4312h && nr0Var.f4308d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final boolean m4903j(nr0 nr0Var) {
        return (nr0Var.m2737b() || !nr0Var.f4312h || nr0Var.f4308d) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final boolean m4904k(nr0 nr0Var) {
        return nr0Var.f4312h && !nr0Var.f4308d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static double m4905l(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static float m4906m(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static int m4907n(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static long m4908o(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final bv0 m4909p(Throwable th) {
        th.getClass();
        return new bv0(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final int m4910q(int i, List list) {
        int i2;
        int i3 = ((wo0) AbstractC0960ye.m5246P(list)).f7161c;
        if (i > ((wo0) AbstractC0960ye.m5246P(list)).f7161c) {
            x10.m5082a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 > size) {
                i2 = -(i5 + 1);
                break;
            }
            i2 = (i5 + size) >>> 1;
            wo0 wo0Var = (wo0) list.get(i2);
            byte b = wo0Var.f7160b > i ? (byte) 1 : wo0Var.f7161c <= i ? (byte) -1 : (byte) 0;
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i5 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        x10.m5082a("Found paragraph index " + i2 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i + ", paragraphs=[" + ya0.m5226a(list, null, new pg0(i4), 31) + ']');
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final int m4911r(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            wo0 wo0Var = (wo0) list.get(i3);
            byte b = wo0Var.f7162d > i ? (byte) 1 : wo0Var.f7163e <= i ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final boolean m4912s(C0149dv c0149dv, C0697rp c0697rp) {
        int iOrdinal = c0149dv.m727B0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0149dv c0149dvM1541q = AbstractC0307i4.m1541q(c0149dv);
                if (c0149dvM1541q != null) {
                    return m4912s(c0149dvM1541q, c0697rp) || m4913t(c0149dv, c0149dvM1541q, 1, c0697rp);
                }
                C0921xc.m5134o("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return c0149dv.m733y0().f268a ? ((Boolean) c0697rp.invoke(c0149dv)).booleanValue() : m4882D(c0149dv, c0697rp);
                }
                C0921xc.m5129j();
                return false;
            }
        }
        return m4882D(c0149dv, c0697rp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final boolean m4913t(C0149dv c0149dv, C0149dv c0149dv2, int i, C0697rp c0697rp) {
        if (m4887I(c0149dv, c0149dv2, i, c0697rp)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC0307i4.m1519E(c0149dv, i, new hl0(((C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(c0149dv)).getFocusOwner()).m5612f(), c0149dv, c0149dv2, i, c0697rp, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final int m4914u(zn0 zn0Var) {
        return (int) (zn0Var.f7941e == um0.f6264d ? zn0Var.m5599g() & 4294967295L : zn0Var.m5599g() >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final Object m4915v(sz0 sz0Var, e01 e01Var) {
        Object objM1701g = sz0Var.f5877d.m1701g(e01Var);
        if (objM1701g == null) {
            return null;
        }
        return objM1701g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final Bundle m4916w(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException("No valid saved state was found for the key '" + str + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final int m4917x(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final void m4918y(InterfaceC0356ji interfaceC0356ji, Integer num, InterfaceC0904ww interfaceC0904ww) {
        if (((C0616pi) interfaceC0356ji).f4877S) {
            ((C0616pi) interfaceC0356ji).m3096b(interfaceC0904ww, num);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final boolean m4919z(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }
}
