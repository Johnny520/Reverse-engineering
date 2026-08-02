package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.ExtractedText;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qp0 {
    public static final jd a = new jd(Float.POSITIVE_INFINITY);
    public static final kd b = new kd(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ld c = new ld(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final md d = new md(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final jd e = new jd(Float.NEGATIVE_INFINITY);
    public static final kd f = new kd(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final ld g = new ld(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final md h = new md(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final kw i = new kw(-1571120048, false, new nw());
    public static final kw j = new kw(-1455401925, false, new ow(0));
    public static final int[] k = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] l = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] m = {3, 6};
    public static final int[] n = {1, 2, 4, 5, 7, 8};
    public static final byte[] o = {112, 114, 111, 0};
    public static final byte[] p = {112, 114, 109, 0};
    public static final db0 q = new db0();
    public static sx0 r;
    public static sx0 s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final xb A(a20 a20Var) {
        xb xbVar = (xb) a20Var.o(gd3.A);
        if (xbVar != null) {
            return xbVar;
        }
        s.l("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final mp B(t00 t00Var) {
        mp mpVar;
        mp mpVar2;
        if (!(t00Var instanceof k90)) {
            return new mp(1, t00Var);
        }
        k90 k90Var = (k90) t00Var;
        hh1 hh1Var = p40.e;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k90.o;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(k90Var);
            mpVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(k90Var, hh1Var);
                mpVar2 = null;
                break;
            }
            if (obj instanceof mp) {
                while (!atomicReferenceFieldUpdater.compareAndSet(k90Var, obj, hh1Var)) {
                    if (atomicReferenceFieldUpdater.get(k90Var) != obj) {
                        break;
                    }
                }
                mpVar2 = (mp) obj;
                break loop0;
            }
            if (obj != hh1Var && !(obj instanceof Throwable)) {
                c80.u("Inconsistent state ", obj);
                return null;
            }
        }
        if (mpVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = mp.n;
            Object obj2 = atomicReferenceFieldUpdater2.get(mpVar2);
            if (!(obj2 instanceof mv) || ((mv) obj2).d == null) {
                mp.m.set(mpVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mpVar2, x4.a);
                mpVar = mpVar2;
            } else {
                mpVar2.q();
            }
            if (mpVar != null) {
                return mpVar;
            }
        }
        return new mp(2, t00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int C(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void E(on2 on2Var) {
        sp0.c0(on2Var).F();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sz0 F(String str, String str2, int i2, in0 in0Var) {
        char cCharAt = str.charAt(i2);
        if (((Boolean) in0Var.j(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return G(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sz0 G(String str, String str2) {
        return new sz0(21, str2 + " when parsing an Instant from \"" + W(str, 64) + '\"', str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int H(String str, int i2) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final w30 I(pl0 pl0Var, int i2) {
        int iOrdinal = pl0Var.R0().ordinal();
        w30 w30Var = w30.h;
        if (iOrdinal != 0) {
            w30 w30Var2 = w30.i;
            if (iOrdinal == 1) {
                pl0 pl0VarF0 = rp0.f0(pl0Var);
                if (pl0VarF0 == null) {
                    s.j("ActiveParent with no focused child");
                    return null;
                }
                w30 w30VarI = I(pl0VarF0, i2);
                w30 w30Var3 = w30VarI != w30Var ? w30VarI : null;
                if (w30Var3 != null) {
                    return w30Var3;
                }
                if (pl0Var.x) {
                    return w30Var;
                }
                pl0Var.x = true;
                try {
                    el0 el0VarO0 = pl0Var.O0();
                    jp jpVar = new jp(i2);
                    bl0 bl0Var = (bl0) ((b7) sp0.f0(pl0Var)).getFocusOwner();
                    pl0 pl0VarF = bl0Var.f();
                    el0VarO0.k.j(jpVar);
                    pl0 pl0VarF2 = bl0Var.f();
                    if (!jpVar.b) {
                        return (pl0VarF == pl0VarF2 || pl0VarF2 == null) ? w30Var : gl0.d == gl0.c ? w30Var2 : w30.j;
                    }
                    gl0 gl0Var = gl0.b;
                    return w30Var2;
                } finally {
                    pl0Var.x = false;
                }
            }
            if (iOrdinal == 2) {
                return w30Var2;
            }
            if (iOrdinal != 3) {
                c80.s();
                return null;
            }
        }
        return w30Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final w30 J(pl0 pl0Var, int i2) {
        if (!pl0Var.y) {
            pl0Var.y = true;
            try {
                el0 el0VarO0 = pl0Var.O0();
                jp jpVar = new jp(i2);
                bl0 bl0Var = (bl0) ((b7) sp0.f0(pl0Var)).getFocusOwner();
                pl0 pl0VarF = bl0Var.f();
                el0VarO0.j.j(jpVar);
                pl0 pl0VarF2 = bl0Var.f();
                boolean z = jpVar.b;
                w30 w30Var = w30.i;
                if (z) {
                    gl0 gl0Var = gl0.b;
                    return w30Var;
                }
                if (pl0VarF != pl0VarF2 && pl0VarF2 != null) {
                    return gl0.d == gl0.c ? w30Var : w30.j;
                }
            } finally {
                pl0Var.y = false;
            }
        }
        return w30.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final w30 K(pl0 pl0Var, int i2) {
        th1 th1VarM;
        vn1 vn1Var;
        int iOrdinal = pl0Var.R0().ordinal();
        w30 w30Var = w30.h;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                pl0 pl0VarF0 = rp0.f0(pl0Var);
                if (pl0VarF0 != null) {
                    return I(pl0VarF0, i2);
                }
                s.j("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    c80.s();
                    return null;
                }
                if (!pl0Var.h.u) {
                    kz0.b("visitAncestors called on an unattached node");
                }
                th1 th1Var = pl0Var.h.l;
                r61 r61VarC0 = sp0.c0(pl0Var);
                loop0: while (true) {
                    if (r61VarC0 == null) {
                        th1VarM = null;
                        break;
                    }
                    if ((((th1) r61VarC0.M.g).k & 1024) != 0) {
                        while (th1Var != null) {
                            if ((th1Var.j & 1024) != 0) {
                                th1VarM = th1Var;
                                zk1 zk1Var = null;
                                while (th1VarM != null) {
                                    if (th1VarM instanceof pl0) {
                                        break loop0;
                                    }
                                    if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                        int i3 = 0;
                                        for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                            if ((th1Var2.j & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    th1VarM = th1Var2;
                                                } else {
                                                    if (zk1Var == null) {
                                                        zk1Var = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM != null) {
                                                        zk1Var.b(th1VarM);
                                                        th1VarM = null;
                                                    }
                                                    zk1Var.b(th1Var2);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    th1VarM = sp0.m(zk1Var);
                                }
                            }
                            th1Var = th1Var.l;
                        }
                    }
                    r61VarC0 = r61VarC0.u();
                    th1Var = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
                }
                pl0 pl0Var2 = (pl0) th1VarM;
                if (pl0Var2 == null) {
                    return w30Var;
                }
                int iOrdinal2 = pl0Var2.R0().ordinal();
                if (iOrdinal2 == 0) {
                    return J(pl0Var2, i2);
                }
                if (iOrdinal2 == 1) {
                    return K(pl0Var2, i2);
                }
                if (iOrdinal2 == 2) {
                    return w30.i;
                }
                if (iOrdinal2 != 3) {
                    c80.s();
                    return null;
                }
                w30 w30VarK = K(pl0Var2, i2);
                w30 w30Var2 = w30VarK != w30Var ? w30VarK : null;
                return w30Var2 == null ? J(pl0Var2, i2) : w30Var2;
            }
        }
        return w30Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean L(pl0 pl0Var) {
        zk1 zk1Var;
        vn1 vn1Var;
        bl0 bl0Var;
        boolean z;
        int i2;
        zk1 zk1Var2;
        int i3;
        int i4;
        vn1 vn1Var2;
        bl0 bl0Var2 = (bl0) ((b7) sp0.f0(pl0Var)).getFocusOwner();
        pl0 pl0VarF = bl0Var2.f();
        kl0 kl0VarR0 = pl0Var.R0();
        if (pl0VarF == pl0Var) {
            pl0Var.N0(kl0VarR0, kl0VarR0);
            return true;
        }
        if ((pl0VarF == null || pl0VarF.v) && !pl0Var.v && !((bl0) ((b7) sp0.f0(pl0Var)).getFocusOwner()).a.F()) {
            return false;
        }
        if (pl0VarF != null) {
            zk1Var = new zk1(new pl0[16]);
            if (!pl0VarF.h.u) {
                kz0.b("visitAncestors called on an unattached node");
            }
            th1 th1Var = pl0VarF.h.l;
            r61 r61VarC0 = sp0.c0(pl0VarF);
            while (r61VarC0 != null) {
                if ((((th1) r61VarC0.M.g).k & 1024) != 0) {
                    while (th1Var != null) {
                        if ((th1Var.j & 1024) != 0) {
                            th1 th1VarM = th1Var;
                            zk1 zk1Var3 = null;
                            while (th1VarM != null) {
                                if (th1VarM instanceof pl0) {
                                    zk1Var.b((pl0) th1VarM);
                                } else if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                    int i5 = 0;
                                    for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                        if ((th1Var2.j & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                th1VarM = th1Var2;
                                            } else {
                                                if (zk1Var3 == null) {
                                                    zk1Var3 = new zk1(new th1[16]);
                                                }
                                                if (th1VarM != null) {
                                                    zk1Var3.b(th1VarM);
                                                    th1VarM = null;
                                                }
                                                zk1Var3.b(th1Var2);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                th1VarM = sp0.m(zk1Var3);
                            }
                        }
                        th1Var = th1Var.l;
                    }
                }
                r61VarC0 = r61VarC0.u();
                th1Var = (r61VarC0 == null || (vn1Var2 = r61VarC0.M) == null) ? null : (qx2) vn1Var2.f;
            }
        } else {
            zk1Var = null;
        }
        Object[] objArr = new pl0[16];
        Object[] objArr2 = new pl0[16];
        if (!pl0Var.h.u) {
            kz0.b("visitAncestors called on an unattached node");
        }
        th1 th1Var3 = pl0Var.h.l;
        r61 r61VarC02 = sp0.c0(pl0Var);
        boolean z2 = true;
        int i6 = 0;
        int i7 = 0;
        while (r61VarC02 != null) {
            if ((((th1) r61VarC02.M.g).k & 1024) != 0) {
                while (th1Var3 != null) {
                    if ((th1Var3.j & 1024) != 0) {
                        th1 th1VarM2 = th1Var3;
                        zk1 zk1Var4 = null;
                        while (th1VarM2 != null) {
                            if (th1VarM2 instanceof pl0) {
                                pl0 pl0Var2 = (pl0) th1VarM2;
                                if (t11.l(zk1Var != null ? Boolean.valueOf(zk1Var.j(pl0Var2)) : null, Boolean.TRUE)) {
                                    int i8 = i6 + 1;
                                    if (objArr.length < i8) {
                                        int length = objArr.length;
                                        bl0Var = bl0Var2;
                                        Object[] objArr3 = new Object[Math.max(i8, length * 2)];
                                        i4 = i8;
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    } else {
                                        bl0Var = bl0Var2;
                                        i4 = i8;
                                    }
                                    objArr[i6] = pl0Var2;
                                    i6 = i4;
                                } else {
                                    bl0Var = bl0Var2;
                                    int i9 = i7 + 1;
                                    if (objArr2.length < i9) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i9, length2 * 2)];
                                        i3 = i9;
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    } else {
                                        i3 = i9;
                                    }
                                    objArr2[i7] = pl0Var2;
                                    i7 = i3;
                                }
                                if (pl0Var2 == pl0VarF) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                bl0Var = bl0Var2;
                                z = true;
                            }
                            if (z && (th1VarM2.j & 1024) != 0 && (th1VarM2 instanceof u60)) {
                                int i10 = 0;
                                for (th1 th1Var4 = ((u60) th1VarM2).w; th1Var4 != null; th1Var4 = th1Var4.m) {
                                    if ((th1Var4.j & 1024) != 0) {
                                        int i11 = i10 + 1;
                                        if (i11 == 1) {
                                            th1VarM2 = th1Var4;
                                            i2 = i11;
                                        } else {
                                            if (zk1Var4 == null) {
                                                i2 = i11;
                                                zk1Var2 = new zk1(new th1[16]);
                                            } else {
                                                i2 = i11;
                                                zk1Var2 = zk1Var4;
                                            }
                                            if (th1VarM2 != null) {
                                                zk1Var2.b(th1VarM2);
                                                th1VarM2 = null;
                                            }
                                            zk1Var2.b(th1Var4);
                                            zk1Var4 = zk1Var2;
                                        }
                                        i10 = i2;
                                    }
                                }
                                if (i10 == 1) {
                                    bl0Var2 = bl0Var;
                                } else {
                                    th1VarM2 = sp0.m(zk1Var4);
                                    bl0Var2 = bl0Var;
                                }
                            } else {
                                th1VarM2 = sp0.m(zk1Var4);
                                bl0Var2 = bl0Var;
                            }
                        }
                    }
                    th1Var3 = th1Var3.l;
                    bl0Var2 = bl0Var2;
                }
            }
            bl0 bl0Var3 = bl0Var2;
            r61VarC02 = r61VarC02.u();
            th1Var3 = (r61VarC02 == null || (vn1Var = r61VarC02.M) == null) ? null : (qx2) vn1Var.f;
            bl0Var2 = bl0Var3;
        }
        bl0 bl0Var4 = bl0Var2;
        if (z2 && pl0VarF != null && !n(pl0VarF, false)) {
            return false;
        }
        s11.S(pl0Var, new ea(10, pl0Var));
        int iOrdinal = pl0Var.R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((bl0) ((b7) sp0.f0(pl0Var)).getFocusOwner()).i(pl0Var);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    c80.s();
                    return false;
                }
                ((bl0) ((b7) sp0.f0(pl0Var)).getFocusOwner()).i(pl0Var);
            }
        }
        kl0 kl0Var = kl0.j;
        kl0 kl0Var2 = kl0.h;
        if (z2 && pl0VarF != null) {
            pl0VarF.N0(kl0Var2, kl0Var);
        }
        kl0 kl0Var3 = kl0.i;
        if (zk1Var != null) {
            int i12 = zk1Var.j - 1;
            Object[] objArr5 = zk1Var.h;
            if (i12 < objArr5.length) {
                while (i12 >= 0) {
                    pl0 pl0Var3 = (pl0) objArr5[i12];
                    if (bl0Var4.f() != pl0Var) {
                        return false;
                    }
                    pl0Var3.N0(kl0Var3, kl0Var);
                    i12--;
                }
            }
        }
        int i13 = i7 - 1;
        if (i13 < objArr2.length) {
            while (i13 >= 0) {
                pl0 pl0Var4 = (pl0) objArr2[i13];
                if (bl0Var4.f() != pl0Var) {
                    return false;
                }
                pl0Var4.N0(pl0Var4 == pl0VarF ? kl0Var2 : kl0Var, kl0Var3);
                i13--;
            }
        }
        if (bl0Var4.f() != pl0Var) {
            return false;
        }
        pl0Var.N0(kl0VarR0, kl0Var2);
        return bl0Var4.f() == pl0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int[] M(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iL = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iL += (int) t11.L(byteArrayInputStream, 2);
            iArr[i3] = iL;
        }
        return iArr;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h80[] N(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, h80[] h80VarArr) throws IOException {
        byte[] bArr3 = rp0.i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, rp0.j)) {
                s.l("Unsupported meta version");
                return null;
            }
            int iL = (int) t11.L(fileInputStream, 2);
            byte[] bArrK = t11.K(fileInputStream, (int) t11.L(fileInputStream, 4), (int) t11.L(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                s.l("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrK);
            try {
                h80[] h80VarArrP = P(byteArrayInputStream, bArr2, iL, h80VarArr);
                byteArrayInputStream.close();
                return h80VarArrP;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(rp0.d, bArr2)) {
            s.l("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            s.l("Unsupported meta version");
            return null;
        }
        int iL2 = (int) t11.L(fileInputStream, 1);
        byte[] bArrK2 = t11.K(fileInputStream, (int) t11.L(fileInputStream, 4), (int) t11.L(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            s.l("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrK2);
        try {
            h80[] h80VarArrO = O(byteArrayInputStream2, iL2, h80VarArr);
            byteArrayInputStream2.close();
            return h80VarArrO;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int[], java.io.Serializable] */
    public static h80[] O(ByteArrayInputStream byteArrayInputStream, int i2, h80[] h80VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new h80[0];
        }
        if (i2 != h80VarArr.length) {
            s.l("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iL = (int) t11.L(byteArrayInputStream, 2);
            iArr[i3] = (int) t11.L(byteArrayInputStream, 2);
            strArr[i3] = new String(t11.J(byteArrayInputStream, iL), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            h80 h80Var = h80VarArr[i4];
            if (!h80Var.f.equals(strArr[i4])) {
                s.l("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            h80Var.c = i5;
            h80Var.h = M(byteArrayInputStream, i5);
        }
        return h80VarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable] */
    public static h80[] P(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, h80[] h80VarArr) throws IOException {
        h80 h80Var;
        if (byteArrayInputStream.available() == 0) {
            return new h80[0];
        }
        if (i2 != h80VarArr.length) {
            s.l("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            t11.L(byteArrayInputStream, 2);
            String str = new String(t11.J(byteArrayInputStream, (int) t11.L(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jL = t11.L(byteArrayInputStream, 4);
            int iL = (int) t11.L(byteArrayInputStream, 2);
            if (h80VarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i4 = 0; i4 < h80VarArr.length; i4++) {
                    if (h80VarArr[i4].f.equals(strSubstring)) {
                        h80Var = h80VarArr[i4];
                        break;
                    }
                }
                h80Var = null;
            } else {
                h80Var = null;
            }
            if (h80Var == null) {
                s.l("Missing profile key: ".concat(str));
                return null;
            }
            h80Var.g = jL;
            ?? M = M(byteArrayInputStream, iL);
            if (Arrays.equals(bArr, rp0.h)) {
                h80Var.c = iL;
                h80Var.h = M;
            }
        }
        return h80VarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h80[] Q(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, rp0.e)) {
            s.l("Unsupported version");
            return null;
        }
        int iL = (int) t11.L(fileInputStream, 1);
        byte[] bArrK = t11.K(fileInputStream, (int) t11.L(fileInputStream, 4), (int) t11.L(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            s.l("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrK);
        try {
            h80[] h80VarArrR = R(byteArrayInputStream, str, iL);
            byteArrayInputStream.close();
            return h80VarArrR;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int[], java.io.Serializable] */
    public static h80[] R(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new h80[0];
        }
        h80[] h80VarArr = new h80[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iL = (int) t11.L(byteArrayInputStream, 2);
            int iL2 = (int) t11.L(byteArrayInputStream, 2);
            h80VarArr[i4] = new h80(str, new String(t11.J(byteArrayInputStream, iL), StandardCharsets.UTF_8), t11.L(byteArrayInputStream, 4), iL2, (int) t11.L(byteArrayInputStream, 4), (int) t11.L(byteArrayInputStream, 4), new int[iL2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            h80 h80Var = h80VarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = h80Var.d;
            int i7 = h80Var.e;
            TreeMap treeMap = (TreeMap) h80Var.i;
            int i8 = iAvailable - i6;
            int iL3 = i3;
            while (byteArrayInputStream.available() > i8) {
                iL3 += (int) t11.L(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iL3), 1);
                int iL4 = (int) t11.L(byteArrayInputStream, 2);
                while (iL4 > 0) {
                    t11.L(byteArrayInputStream, 2);
                    int iL5 = (int) t11.L(byteArrayInputStream, 1);
                    if (iL5 != 6 && iL5 != 7) {
                        while (iL5 > 0) {
                            t11.L(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iL6 = (int) t11.L(byteArrayInputStream, 1); iL6 > 0; iL6--) {
                                t11.L(byteArrayInputStream, 2);
                            }
                            iL5--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iL4--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                s.l("Read too much data during profile line parse");
                return null;
            }
            h80Var.h = M(byteArrayInputStream, h80Var.c);
            BitSet bitSetValueOf = BitSet.valueOf(t11.J(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return h80VarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean S(rk1 rk1Var, Object obj, Object obj2) {
        Object objG = rk1Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof sk1)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            rk1Var.k(obj);
            return true;
        }
        sk1 sk1Var = (sk1) objG;
        boolean zL = sk1Var.l(obj2);
        if (zL && sk1Var.g()) {
            rk1Var.k(obj);
        }
        return zL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void T(rk1 rk1Var, Object obj) {
        boolean zG;
        long[] jArr = rk1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj2 = rk1Var.b[i5];
                        Object obj3 = rk1Var.c[i5];
                        if (obj3 instanceof sk1) {
                            sk1 sk1Var = (sk1) obj3;
                            sk1Var.l(obj);
                            zG = sk1Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            rk1Var.l(i5);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String U(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = p7.a;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        if (i3 < 0) {
            s.d(hk1.g(i3, "startIndex: ", ", endIndex: 8, size: 8"));
            return null;
        }
        if (i3 <= 8) {
            return new String(cArr2, i3, 8 - i3);
        }
        s.j(hk1.g(i3, "startIndex: ", " > endIndex: 8"));
        return null;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, GOTO] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, GOTO] complete} */
    /* JADX WARN: Finally extract failed */
    public static boolean V(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, h80[] h80VarArr) throws IOException {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = rp0.h;
        byte[] bArr3 = rp0.g;
        byte[] bArr4 = rp0.d;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = rp0.e;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrR = r(h80VarArr, bArr5);
                t11.Y(byteArrayOutputStream, h80VarArr.length, 1);
                t11.Y(byteArrayOutputStream, bArrR.length, 4);
                byte[] bArrQ = t11.q(bArrR);
                t11.Y(byteArrayOutputStream, bArrQ.length, 4);
                byteArrayOutputStream.write(bArrQ);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                t11.Y(byteArrayOutputStream, h80VarArr.length, 1);
                for (h80 h80Var : h80VarArr) {
                    int size = ((TreeMap) h80Var.i).size() * 4;
                    String strX = x(h80Var.a, h80Var.f, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    t11.Z(byteArrayOutputStream, strX.getBytes(charset).length);
                    t11.Z(byteArrayOutputStream, ((int[]) h80Var.h).length);
                    t11.Y(byteArrayOutputStream, size, 4);
                    t11.Y(byteArrayOutputStream, h80Var.b, 4);
                    byteArrayOutputStream.write(strX.getBytes(charset));
                    Iterator it = ((TreeMap) h80Var.i).keySet().iterator();
                    while (it.hasNext()) {
                        t11.Z(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        t11.Z(byteArrayOutputStream, 0);
                    }
                    for (int i4 : (int[]) h80Var.h) {
                        t11.Z(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = rp0.f;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrR2 = r(h80VarArr, bArr6);
                t11.Y(byteArrayOutputStream, h80VarArr.length, 1);
                t11.Y(byteArrayOutputStream, bArrR2.length, 4);
                byte[] bArrQ2 = t11.q(bArrR2);
                t11.Y(byteArrayOutputStream, bArrQ2.length, 4);
                byteArrayOutputStream.write(bArrQ2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            t11.Z(byteArrayOutputStream, h80VarArr.length);
            for (h80 h80Var2 : h80VarArr) {
                String str = h80Var2.a;
                TreeMap treeMap = (TreeMap) h80Var2.i;
                String strX2 = x(str, h80Var2.f, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                t11.Z(byteArrayOutputStream, strX2.getBytes(charset2).length);
                t11.Z(byteArrayOutputStream, treeMap.size());
                t11.Z(byteArrayOutputStream, ((int[]) h80Var2.h).length);
                t11.Y(byteArrayOutputStream, h80Var2.b, 4);
                byteArrayOutputStream.write(strX2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    t11.Z(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : (int[]) h80Var2.h) {
                    t11.Z(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            t11.Z(byteArrayOutputStream2, h80VarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (h80 h80Var3 : h80VarArr) {
                t11.Y(byteArrayOutputStream2, h80Var3.b, 4);
                t11.Y(byteArrayOutputStream2, h80Var3.g, 4);
                t11.Y(byteArrayOutputStream2, h80Var3.e, 4);
                String strX3 = x(h80Var3.a, h80Var3.f, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strX3.getBytes(charset3).length;
                t11.Z(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(strX3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            eg3 eg3Var = new eg3(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(eg3Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < h80VarArr.length) {
                try {
                    h80 h80Var4 = h80VarArr[i8];
                    t11.Z(byteArrayOutputStream3, i8);
                    t11.Z(byteArrayOutputStream3, h80Var4.c);
                    i9 = i9 + 4 + (h80Var4.c * i6);
                    int[] iArr = (int[]) h80Var4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        t11.Z(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            eg3 eg3Var2 = new eg3(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(eg3Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < h80VarArr.length; i14++) {
                try {
                    h80 h80Var5 = h80VarArr[i14];
                    Iterator it3 = ((TreeMap) h80Var5.i).entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        Z(byteArrayOutputStream4, iIntValue, h80Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            a0(byteArrayOutputStream4, h80Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            t11.Z(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i13 + 6;
                            t11.Y(byteArrayOutputStream3, length4, 4);
                            t11.Z(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i15 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            eg3 eg3Var3 = new eg3(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(eg3Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            t11.Y(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                eg3 eg3Var4 = (eg3) arrayList.get(i16);
                int i17 = eg3Var4.a;
                byte[] bArr7 = eg3Var4.b;
                if (i17 != 1) {
                    i2 = i12;
                    if (i17 == i2) {
                        j2 = 1;
                    } else if (i17 == 3) {
                        j2 = 2;
                    } else if (i17 == 4) {
                        j2 = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                t11.Y(byteArrayOutputStream, j2, 4);
                t11.Y(byteArrayOutputStream, size2, 4);
                if (eg3Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrQ3 = t11.q(bArr7);
                    arrayList2.add(bArrQ3);
                    t11.Y(byteArrayOutputStream, bArrQ3.length, 4);
                    t11.Y(byteArrayOutputStream, length5, 4);
                    length = bArrQ3.length;
                } else {
                    arrayList2.add(bArr7);
                    t11.Y(byteArrayOutputStream, bArr7.length, 4);
                    t11.Y(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i16++;
                i12 = i2;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String W(String str, int i2) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void X(ByteArrayOutputStream byteArrayOutputStream, h80 h80Var) throws IOException {
        a0(byteArrayOutputStream, h80Var);
        int i2 = h80Var.e;
        int[] iArr = (int[]) h80Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            t11.Z(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) h80Var.i).entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void Y(ByteArrayOutputStream byteArrayOutputStream, h80 h80Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        t11.Z(byteArrayOutputStream, str.getBytes(charset).length);
        t11.Z(byteArrayOutputStream, h80Var.c);
        t11.Y(byteArrayOutputStream, h80Var.d, 4);
        t11.Y(byteArrayOutputStream, h80Var.b, 4);
        t11.Y(byteArrayOutputStream, h80Var.e, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void Z(ByteArrayOutputStream byteArrayOutputStream, int i2, h80 h80Var) throws IOException {
        int i3 = h80Var.e;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) h80Var.i).entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long a(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a0(ByteArrayOutputStream byteArrayOutputStream, h80 h80Var) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : ((TreeMap) h80Var.i).entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                t11.Z(byteArrayOutputStream, iIntValue - i2);
                t11.Z(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final gz0 b(w41 w41Var, String str) {
        return new gz0(str, new hz0(w41Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final xm0 xm0Var, final String str, final String str2, final String str3, final xm0 xm0Var2, uh1 uh1Var, String str4, n80 n80Var, px pxVar, final int i2, final int i3) {
        int i4;
        String str5;
        String str6;
        int i5;
        go0 go0Var;
        final uh1 uh1Var2;
        final n80 n80Var2;
        final String str7;
        b62 b62VarR;
        xm0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        xm0Var2.getClass();
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(1522479816);
        if ((i2 & 6) == 0) {
            i4 = (go0Var2.h(xm0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str5 = str;
            i4 |= go0Var2.f(str5) ? 32 : 16;
        } else {
            str5 = str;
        }
        if ((i2 & 384) == 0) {
            i4 |= go0Var2.f(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= go0Var2.f(str3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= go0Var2.h(xm0Var2) ? 16384 : 8192;
        }
        int i6 = 196608 | i4;
        int i7 = i3 & 64;
        if (i7 == 0) {
            if ((1572864 & i2) == 0) {
                str6 = str4;
                i6 |= go0Var2.f(str6) ? 1048576 : 524288;
            }
            i5 = i6 | 12582912;
            if (go0Var2.O(i5 & 1, (4793491 & i5) == 4793490)) {
                go0Var = go0Var2;
                go0Var.R();
                uh1Var2 = uh1Var;
                n80Var2 = n80Var;
                str7 = str6;
            } else {
                if (i7 != 0) {
                    str6 = null;
                }
                String str8 = str6;
                n80 n80Var3 = new n80();
                int i8 = i5 >> 9;
                rh1 rh1Var = rh1.a;
                go0Var = go0Var2;
                d(true, xm0Var, rh1Var, str5, n80Var3, xe1.i0(-1682068725, new b81(str8, xm0Var, str3, xm0Var2, 6), go0Var2), xe1.i0(724520180, new x1(str2, 3), go0Var2), go0Var, ((i5 << 6) & 7168) | ((i5 << 3) & 112) | 1769478 | (i8 & 896) | (57344 & i8), 0);
                str7 = str8;
                uh1Var2 = rh1Var;
                n80Var2 = n80Var3;
            }
            b62VarR = go0Var.r();
            if (b62VarR == null) {
                b62VarR.d = new mn0() { // from class: rp1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.mn0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qp0.c(xm0Var, str, str2, str3, xm0Var2, uh1Var2, str7, n80Var2, (px) obj, pp0.N(i2 | 1), i3);
                        return a83.a;
                    }
                };
                return;
            }
            return;
        }
        i6 = 1769472 | i4;
        str6 = str4;
        i5 = i6 | 12582912;
        if (go0Var2.O(i5 & 1, (4793491 & i5) == 4793490)) {
        }
        b62VarR = go0Var.r();
        if (b62VarR == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final boolean z, final xm0 xm0Var, uh1 uh1Var, final String str, n80 n80Var, final nn0 nn0Var, final kw kwVar, px pxVar, final int i2, final int i3) {
        int i4;
        uh1 uh1Var2;
        String str2;
        int i5;
        n80 n80Var2;
        nn0 nn0Var2;
        kw kwVar2;
        int i6;
        xm0 xm0Var2;
        final uh1 uh1Var3;
        b62 b62VarR;
        xm0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(-742493751);
        if ((i2 & 6) == 0) {
            i4 = (go0Var.g(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= go0Var.h(xm0Var) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                uh1Var2 = uh1Var;
                i4 |= go0Var.f(uh1Var2) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                str2 = str;
                i4 |= go0Var.f(str2) ? 2048 : 1024;
            } else {
                str2 = str;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    n80Var2 = n80Var;
                    i4 |= go0Var.f(n80Var2) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
                    nn0Var2 = nn0Var;
                    i4 |= go0Var.h(nn0Var2) ? 131072 : 65536;
                } else {
                    nn0Var2 = nn0Var;
                }
                if ((1572864 & i2) == 0) {
                    kwVar2 = kwVar;
                    i4 |= go0Var.h(kwVar2) ? 1048576 : 524288;
                } else {
                    kwVar2 = kwVar;
                }
                i6 = i4;
                if (go0Var.O(i6 & 1, (599187 & i6) != 599186)) {
                    uh1 uh1Var4 = i7 != 0 ? rh1.a : uh1Var2;
                    final n80 n80Var3 = i5 != 0 ? new n80() : n80Var2;
                    Object objL = go0Var.L();
                    eb ebVar = nx.a;
                    if (objL == ebVar) {
                        objL = op0.u(Boolean.valueOf(z));
                        go0Var.f0(objL);
                    }
                    xk1 xk1Var = (xk1) objL;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    boolean z2 = (i6 & 14) == 4;
                    Object objL2 = go0Var.L();
                    if (z2 || objL2 == ebVar) {
                        objL2 = new tp1(z, xk1Var, (t00) null);
                        go0Var.f0(objL2);
                    }
                    eu.f(go0Var, (mn0) objL2, boolValueOf);
                    if (!((Boolean) xk1Var.getValue()).booleanValue()) {
                        b62 b62VarR2 = go0Var.r();
                        if (b62VarR2 != null) {
                            final uh1 uh1Var5 = uh1Var4;
                            final int i8 = 0;
                            final String str3 = str2;
                            final nn0 nn0Var3 = nn0Var2;
                            final kw kwVar3 = kwVar2;
                            b62VarR2.d = new mn0() { // from class: sp1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // defpackage.mn0
                                public final Object g(Object obj, Object obj2) {
                                    int i9 = i8;
                                    a83 a83Var = a83.a;
                                    int i10 = i2;
                                    switch (i9) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iN = pp0.N(i10 | 1);
                                            qp0.d(z, xm0Var, uh1Var5, str3, n80Var3, nn0Var3, kwVar3, (px) obj, iN, i3);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iN2 = pp0.N(i10 | 1);
                                            qp0.d(z, xm0Var, uh1Var5, str3, n80Var3, nn0Var3, kwVar3, (px) obj, iN2, i3);
                                            break;
                                    }
                                    return a83Var;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    uh1 uh1Var6 = uh1Var4;
                    xm0Var2 = xm0Var;
                    n80Var2 = n80Var3;
                    qp1 qp1Var = new qp1(uh1Var6, z, str, nn0Var, kwVar);
                    uh1Var3 = uh1Var6;
                    te.f(xm0Var2, n80Var2, xe1.i0(-478376494, qp1Var, go0Var), go0Var, ((i6 >> 3) & 14) | 384 | ((i6 >> 9) & 112));
                } else {
                    xm0Var2 = xm0Var;
                    go0Var.R();
                    uh1Var3 = uh1Var2;
                }
                final n80 n80Var4 = n80Var2;
                b62VarR = go0Var.r();
                if (b62VarR != null) {
                    final int i9 = 1;
                    final xm0 xm0Var3 = xm0Var2;
                    b62VarR.d = new mn0() { // from class: sp1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj, Object obj2) {
                            int i92 = i9;
                            a83 a83Var = a83.a;
                            int i10 = i2;
                            switch (i92) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iN = pp0.N(i10 | 1);
                                    qp0.d(z, xm0Var3, uh1Var3, str, n80Var4, nn0Var, kwVar, (px) obj, iN, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iN2 = pp0.N(i10 | 1);
                                    qp0.d(z, xm0Var3, uh1Var3, str, n80Var4, nn0Var, kwVar, (px) obj, iN2, i3);
                                    break;
                            }
                            return a83Var;
                        }
                    };
                    return;
                }
                return;
            }
            i4 |= 24576;
            n80Var2 = n80Var;
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            i6 = i4;
            if (go0Var.O(i6 & 1, (599187 & i6) != 599186)) {
            }
            final n80 n80Var42 = n80Var2;
            b62VarR = go0Var.r();
            if (b62VarR != null) {
            }
        }
        uh1Var2 = uh1Var;
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        n80Var2 = n80Var;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        i6 = i4;
        if (go0Var.O(i6 & 1, (599187 & i6) != 599186)) {
        }
        final n80 n80Var422 = n80Var2;
        b62VarR = go0Var.r();
        if (b62VarR != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(String str, uh1 uh1Var, px pxVar, int i2, int i3) {
        uh1 uh1Var2;
        int i4;
        uh1 uh1Var3;
        str.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(1246242467);
        int i5 = (go0Var.f(str) ? 4 : 2) | i2;
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
            uh1Var2 = uh1Var;
        } else {
            uh1Var2 = uh1Var;
            i4 = i5 | (go0Var.f(uh1Var2) ? 32 : 16);
        }
        if (go0Var.O(i4 & 1, (i4 & 19) != 18)) {
            uh1Var3 = i6 != 0 ? rh1.a : uh1Var2;
            eu.a(str, uh1Var3.c(te.e), new m13(((lp1) go0Var.j(ur1.a)).f, rg3.D(14), im0.j, 0L, 3, rg3.D(20), null, null, 16613368), 0, false, 0, 0, go0Var, i4 & 14, 1016);
        } else {
            go0Var.R();
            uh1Var3 = uh1Var2;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new up(str, uh1Var3, i2, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(uh1 uh1Var, boolean z, String str, nn0 nn0Var, kw kwVar, px pxVar, int i2) {
        go0 go0Var;
        q51 q51VarA;
        q51 q51VarA2;
        fj0 fj0VarJ;
        long j2;
        float f2;
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(665894619);
        int i3 = i2 | (go0Var2.f(uh1Var) ? 4 : 2) | (go0Var2.g(z) ? 32 : 16) | (go0Var2.f(str) ? 256 : 128) | (go0Var2.h(nn0Var) ? 2048 : 1024) | (go0Var2.h(kwVar) ? 16384 : 8192);
        if (go0Var2.O(i3 & 1, (i3 & 9363) != 9362)) {
            Object objL = go0Var2.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                objL = op0.u(Boolean.FALSE);
                go0Var2.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = (i3 & 112) == 32;
            Object objL2 = go0Var2.L();
            if (z2 || objL2 == ebVar) {
                objL2 = new up1(z, xk1Var, (t00) null);
                go0Var2.f0(objL2);
            }
            eu.f(go0Var2, (mn0) objL2, boolValueOf);
            float f3 = ((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.94f;
            if (((Boolean) xk1Var.getValue()).booleanValue()) {
                go0Var2.W(-786897736);
                Object objL3 = go0Var2.L();
                if (objL3 == ebVar) {
                    objL3 = new vi1(26);
                    go0Var2.f0(objL3);
                }
                q51VarA = up0.A((in0) objL3);
                go0Var2.p(false);
            } else {
                go0Var2.W(-786780618);
                Object objL4 = go0Var2.L();
                if (objL4 == ebVar) {
                    objL4 = new vi1(27);
                    go0Var2.f0(objL4);
                }
                q51VarA = up0.A((in0) objL4);
                go0Var2.p(false);
            }
            gu2 gu2VarB = uc.b(f3, q51VarA, "NukeDialogScaleX", go0Var2, 3072);
            float f4 = ((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.92f;
            if (((Boolean) xk1Var.getValue()).booleanValue()) {
                go0Var2.W(-786468262);
                Object objL5 = go0Var2.L();
                if (objL5 == ebVar) {
                    objL5 = new vi1(28);
                    go0Var2.f0(objL5);
                }
                q51VarA2 = up0.A((in0) objL5);
                go0Var2.p(false);
            } else {
                go0Var2.W(-786353066);
                Object objL6 = go0Var2.L();
                if (objL6 == ebVar) {
                    objL6 = new vi1(24);
                    go0Var2.f0(objL6);
                }
                q51VarA2 = up0.A((in0) objL6);
                go0Var2.p(false);
            }
            gu2 gu2VarB2 = uc.b(f4, q51VarA2, "NukeDialogScaleY", go0Var2, 3072);
            float f5 = ((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.0f;
            if (((Boolean) xk1Var.getValue()).booleanValue()) {
                go0Var2.W(-786051281);
                Object objL7 = go0Var2.L();
                if (objL7 == ebVar) {
                    objL7 = new vi1(25);
                    go0Var2.f0(objL7);
                }
                fj0VarJ = up0.A((in0) objL7);
                go0Var2.p(false);
            } else {
                go0Var2.W(-785958405);
                go0Var2.p(false);
                fj0VarJ = up0.J(150, null, 6);
            }
            gu2 gu2VarB3 = uc.b(f5, fj0VarJ, "NukeDialogAlpha", go0Var2, 3072);
            if (((Boolean) xk1Var.getValue()).booleanValue()) {
                go0Var2.W(-25346353);
                j2 = ((lp1) go0Var2.j(ur1.a)).f;
                f2 = 0.045f;
            } else {
                go0Var2.W(-25344754);
                j2 = ((lp1) go0Var2.j(ur1.a)).g;
                f2 = 0.16f;
            }
            long jB = ju.b(f2, j2);
            go0Var2.p(false);
            gu2 gu2VarA = ar2.a(jB, up0.J(180, null, 6), "NukeDialogFluidEdgeColor", go0Var2);
            gu2 gu2VarA2 = uc.a(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 2.0f, up0.J(180, null, 6), "NukeDialogFluidEdgePadding", go0Var2);
            kr1 kr1Var = new kr1(22.0f);
            uh1 uh1VarC = uh1Var.c(te.e);
            boolean zF = go0Var2.f(gu2VarB3) | go0Var2.f(gu2VarB) | go0Var2.f(gu2VarB2);
            Object objL8 = go0Var2.L();
            if (zF || objL8 == ebVar) {
                objL8 = new m0(gu2VarB3, gu2VarB, gu2VarB2, 9);
                go0Var2.f0(objL8);
            }
            go0Var = go0Var2;
            ci0.h(te.L(uh1VarC, (in0) objL8), kr1Var, 0L, ((ju) gu2VarA.getValue()).a, ((za0) gu2VarA2.getValue()).h, 0L, 0.0f, new jw1(20.0f, 20.0f, 20.0f, 20.0f), null, xe1.i0(-1103058934, new tr(str, kwVar, nn0Var, 1), go0Var2), go0Var, 817889328, 356);
        } else {
            go0Var = go0Var2;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new qp1(uh1Var, z, str, nn0Var, kwVar, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(uh1 uh1Var, long j2, px pxVar, int i2) {
        uh1 uh1Var2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1081890667);
        int i3 = i2 | 6 | (go0Var.e(j2) ? 32 : 16);
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            rh1 rh1Var = rh1.a;
            uh1 uh1VarH0 = te.h0(rh1Var, 18.0f, 18.0f);
            boolean z = (i3 & 112) == 32;
            Object objL = go0Var.L();
            if (z || objL == nx.a) {
                objL = new c8(j2, 4);
                go0Var.f0(objL);
            }
            eu.b(uh1VarH0, (in0) objL, go0Var, 0);
            uh1Var2 = rh1Var;
        } else {
            go0Var.R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new z7(uh1Var2, j2, i2, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(String str, xm0 xm0Var, uh1 uh1Var, String str2, mn0 mn0Var, String str3, ju juVar, boolean z, in0 in0Var, px pxVar, int i2, int i3) {
        int i4;
        xm0 xm0Var2;
        int i5;
        String str4;
        int i6;
        mn0 mn0Var2;
        int i7;
        String str5;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        go0 go0Var;
        boolean z2;
        xm0 xm0Var3;
        String str6;
        mn0 mn0Var3;
        String str7;
        uh1 uh1Var2;
        ju juVar2;
        in0 in0Var2;
        b62 b62VarR;
        str.getClass();
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(-321981089);
        if ((i2 & 6) == 0) {
            i4 = (go0Var2.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                xm0Var2 = xm0Var;
                i4 |= go0Var2.h(xm0Var2) ? 32 : 16;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    str4 = str2;
                    i4 |= go0Var2.f(str4) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        mn0Var2 = mn0Var;
                        i4 |= go0Var2.h(mn0Var2) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            str5 = str3;
                            i4 |= go0Var2.f(str5) ? 131072 : 65536;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i4 |= 1572864;
                        } else {
                            if ((1572864 & i2) == 0) {
                                i4 |= go0Var2.f(juVar) ? 1048576 : 524288;
                            }
                            i9 = i3 & 128;
                            if (i9 == 0) {
                                i10 = i4 | 12582912;
                            } else {
                                int i14 = i4;
                                if ((i2 & 12582912) == 0) {
                                    i10 = i14 | (go0Var2.g(z) ? 8388608 : 4194304);
                                } else {
                                    i10 = i14;
                                }
                            }
                            i11 = i3 & 256;
                            if (i11 != 0) {
                                if ((i2 & 100663296) == 0) {
                                    i12 = i11;
                                    i10 |= go0Var2.h(in0Var) ? 67108864 : 33554432;
                                }
                                if (go0Var2.O(i10 & 1, (i10 & 38347795) != 38347794)) {
                                    xm0 xm0Var4 = i13 != 0 ? null : xm0Var2;
                                    String str8 = i5 != 0 ? null : str4;
                                    mn0 mn0Var4 = i6 != 0 ? null : mn0Var2;
                                    if (i7 != 0) {
                                        str5 = null;
                                    }
                                    ju juVar3 = i8 != 0 ? null : juVar;
                                    boolean z3 = i9 != 0 ? true : z;
                                    in0 in0Var3 = i12 != 0 ? null : in0Var;
                                    int i15 = i10 >> 3;
                                    go0Var = go0Var2;
                                    boolean z4 = z3;
                                    sp0.g(str, null, str8, mn0Var4, xe1.i0(879735963, new rh(str5, juVar3, z3), go0Var2), null, z4, xm0Var4, in0Var3, go0Var, (i10 & 14) | 24576 | (i15 & 896) | (i15 & 7168) | (i15 & 3670016) | ((i10 << 18) & 29360128) | (i10 & 234881024), 34);
                                    juVar2 = juVar3;
                                    str7 = str5;
                                    str6 = str8;
                                    mn0Var3 = mn0Var4;
                                    z2 = z4;
                                    xm0Var3 = xm0Var4;
                                    in0Var2 = in0Var3;
                                    uh1Var2 = rh1.a;
                                } else {
                                    go0Var = go0Var2;
                                    go0Var.R();
                                    z2 = z;
                                    xm0Var3 = xm0Var2;
                                    str6 = str4;
                                    mn0Var3 = mn0Var2;
                                    str7 = str5;
                                    uh1Var2 = uh1Var;
                                    juVar2 = juVar;
                                    in0Var2 = in0Var;
                                }
                                b62VarR = go0Var.r();
                                if (b62VarR != null) {
                                    b62VarR.d = new zp1(str, xm0Var3, uh1Var2, str6, mn0Var3, str7, juVar2, z2, in0Var2, i2, i3);
                                    return;
                                }
                                return;
                            }
                            i10 |= 100663296;
                            i12 = i11;
                            if (go0Var2.O(i10 & 1, (i10 & 38347795) != 38347794)) {
                            }
                            b62VarR = go0Var.r();
                            if (b62VarR != null) {
                            }
                        }
                        i9 = i3 & 128;
                        if (i9 == 0) {
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                        }
                        i12 = i11;
                        if (go0Var2.O(i10 & 1, (i10 & 38347795) != 38347794)) {
                        }
                        b62VarR = go0Var.r();
                        if (b62VarR != null) {
                        }
                    }
                    str5 = str3;
                    i8 = i3 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if (go0Var2.O(i10 & 1, (i10 & 38347795) != 38347794)) {
                    }
                    b62VarR = go0Var.r();
                    if (b62VarR != null) {
                    }
                }
                mn0Var2 = mn0Var;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                str5 = str3;
                i8 = i3 & 64;
                if (i8 != 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                if (go0Var2.O(i10 & 1, (i10 & 38347795) != 38347794)) {
                }
                b62VarR = go0Var.r();
                if (b62VarR != null) {
                }
            }
            str4 = str2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            mn0Var2 = mn0Var;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            str5 = str3;
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            if (go0Var2.O(i10 & 1, (i10 & 38347795) != 38347794)) {
            }
            b62VarR = go0Var.r();
            if (b62VarR != null) {
            }
        }
        xm0Var2 = xm0Var;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        str4 = str2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        mn0Var2 = mn0Var;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        str5 = str3;
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        if (go0Var2.O(i10 & 1, (i10 & 38347795) != 38347794)) {
        }
        b62VarR = go0Var.r();
        if (b62VarR != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean i(m13 m13Var) {
        k02 k02Var;
        w02 w02Var = m13Var.c;
        wd0 wd0Var = (w02Var == null || (k02Var = w02Var.a) == null) ? null : new wd0(k02Var.b);
        boolean z = false;
        if (wd0Var != null && wd0Var.a == 1) {
            z = true;
        }
        return !z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ExtractedText j(k03 k03Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = k03Var.a.i;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = k03Var.b;
        extractedText.selectionStart = f13.f(j2);
        extractedText.selectionEnd = f13.e(j2);
        extractedText.flags = !pv2.i0(k03Var.a.i, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k(rk1 rk1Var, Object obj, Object obj2) {
        int iF = rk1Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : rk1Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof sk1) {
                ((sk1) obj3).a(obj2);
            } else if (obj3 != obj2) {
                sk1 sk1Var = new sk1();
                sk1Var.a(obj3);
                sk1Var.a(obj2);
                obj2 = sk1Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            rk1Var.c[iF] = obj2;
            return;
        }
        int i2 = ~iF;
        rk1Var.b[i2] = obj;
        rk1Var.c[i2] = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int l(float f2) {
        return Math.round((float) Math.ceil(f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean n(pl0 pl0Var, boolean z) {
        int iOrdinal = pl0Var.R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                pl0 pl0VarF0 = rp0.f0(pl0Var);
                if (!(pl0VarF0 != null ? n(pl0VarF0, z) : true)) {
                    return false;
                }
                pl0Var.N0(kl0.i, kl0.j);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                c80.s();
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static rk1 o() {
        long[] jArr = ed2.a;
        return new rk1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean p(o62 o62Var, float f2, float f3) {
        float f4 = o62Var.a;
        if (f2 > o62Var.c || f4 > f2) {
            return false;
        }
        return f3 <= o62Var.d && o62Var.b <= f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long q(long j2, ed0 ed0Var) {
        long j3;
        int iOrdinal = ed0Var.ordinal();
        if (iOrdinal == 2) {
            j3 = 1;
        } else if (iOrdinal == 3) {
            j3 = 1000;
        } else if (iOrdinal == 4) {
            j3 = AIChatConfig.MaxReplyDelayMs;
        } else if (iOrdinal == 5) {
            j3 = 3600000;
        } else {
            if (iOrdinal != 6) {
                c80.u("Wrong unit for millisMultiplier: ", ed0Var);
                return 0L;
            }
            j3 = 86400000;
        }
        if (j2 == 0) {
            return 0L;
        }
        if (j2 == 1) {
            if (j3 <= 4611686018427387903L) {
                return j3;
            }
        } else if (j3 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j2)) - Long.numberOfLeadingZeros(j3);
            if (iNumberOfLeadingZeros < 63) {
                return j2 * j3;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j4 = j2 * j3;
                if (j4 <= 4611686018427387903L) {
                    return j4;
                }
            }
        } else if (j2 <= 4611686018427387903L) {
            return j2;
        }
        return 4611686018427387903L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] r(h80[] h80VarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (h80 h80Var : h80VarArr) {
            length += ((((h80Var.e * 2) + 7) & (-8)) / 8) + (h80Var.c * 2) + x(h80Var.a, h80Var.f, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + h80Var.d;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, rp0.f)) {
            int length2 = h80VarArr.length;
            while (i2 < length2) {
                h80 h80Var2 = h80VarArr[i2];
                Y(byteArrayOutputStream, h80Var2, x(h80Var2.a, h80Var2.f, bArr));
                X(byteArrayOutputStream, h80Var2);
                i2++;
            }
        } else {
            for (h80 h80Var3 : h80VarArr) {
                Y(byteArrayOutputStream, h80Var3, x(h80Var3.a, h80Var3.f, bArr));
            }
            int length3 = h80VarArr.length;
            while (i2 < length3) {
                X(byteArrayOutputStream, h80VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 s(uh1 uh1Var, in0 in0Var) {
        return uh1Var.c(new ic0(in0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 t(uh1 uh1Var, in0 in0Var) {
        return uh1Var.c(new pc0(in0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 u(uh1 uh1Var, in0 in0Var) {
        return uh1Var.c(new qc0(in0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final o62 v(th1 th1Var, boolean z, boolean z2) {
        if (!th1Var.h.u) {
            return o62.e;
        }
        if (z) {
            return sp0.Z(th1Var, 8).o1();
        }
        zn1 zn1VarZ = sp0.Z(th1Var, 8);
        return s11.J(zn1VarZ).J(zn1VarZ, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void w(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String x(String str, String str2, byte[] bArr) {
        byte[] bArr2 = rp0.g;
        byte[] bArr3 = rp0.h;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return hk1.j(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static k63 y(Object obj) {
        if (obj == null) {
            return h30.h;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? y20.j : y20.i;
        }
        if (obj instanceof Byte) {
            return new z20(((Byte) obj).byteValue());
        }
        if (obj instanceof Character) {
            return new a30(((Character) obj).charValue());
        }
        if (obj instanceof Double) {
            return new b30(Double.doubleToLongBits(((Double) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return new d30(Float.floatToIntBits(((Float) obj).floatValue()));
        }
        if (obj instanceof Integer) {
            return g30.j(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return new l30(((Long) obj).longValue());
        }
        if (obj instanceof Short) {
            return new p30(((Short) obj).shortValue());
        }
        if (obj instanceof String) {
            return new q30((String) obj);
        }
        if (obj instanceof Class) {
            return new r30(a63.a((Class) obj).b);
        }
        if (obj instanceof a63) {
            return new r30(((a63) obj).b);
        }
        throw new UnsupportedOperationException("Not a constant: " + obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long z(KeyEvent keyEvent) {
        return sp0.f(keyEvent.getKeyCode());
    }

    public abstract int D(mj0 mj0Var);
}
