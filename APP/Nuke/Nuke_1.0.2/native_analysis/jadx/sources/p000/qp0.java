package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qp0 {

    /* JADX INFO: renamed from: a */
    public static final C0346jd f9059a = new C0346jd(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b */
    public static final C0383kd f9060b = new C0383kd(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c */
    public static final C0420ld f9061c = new C0420ld(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d */
    public static final C0457md f9062d = new C0457md(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e */
    public static final C0346jd f9063e = new C0346jd(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f */
    public static final C0383kd f9064f = new C0383kd(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g */
    public static final C0420ld f9065g = new C0420ld(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h */
    public static final C0457md f9066h = new C0457md(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: i */
    public static final C0402kw f9067i = new C0402kw(-1571120048, false, new C0519nw());

    /* JADX INFO: renamed from: j */
    public static final C0402kw f9068j = new C0402kw(-1455401925, false, new C0558ow(0));

    /* JADX INFO: renamed from: k */
    public static final int[] f9069k = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: l */
    public static final int[] f9070l = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: m */
    public static final int[] f9071m = {3, 6};

    /* JADX INFO: renamed from: n */
    public static final int[] f9072n = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: renamed from: o */
    public static final byte[] f9073o = {112, 114, 111, 0};

    /* JADX INFO: renamed from: p */
    public static final byte[] f9074p = {112, 114, 109, 0};

    /* JADX INFO: renamed from: q */
    public static final db0 f9075q = new db0();

    /* JADX INFO: renamed from: r */
    public static sx0 f9076r;

    /* JADX INFO: renamed from: s */
    public static sx0 f9077s;

    /* JADX INFO: renamed from: A */
    public static final C0880xb m4220A(a20 a20Var) {
        C0880xb c0880xb = (C0880xb) a20Var.mo15o(gd3.f3414A);
        if (c0880xb != null) {
            return c0880xb;
        }
        C0676s.m4653l("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* JADX INFO: renamed from: B */
    public static final C0469mp m4221B(t00 t00Var) {
        C0469mp c0469mp;
        C0469mp c0469mp2;
        if (!(t00Var instanceof k90)) {
            return new C0469mp(1, t00Var);
        }
        k90 k90Var = (k90) t00Var;
        hh1 hh1Var = p40.f7969e;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k90.f5403o;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(k90Var);
            c0469mp = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(k90Var, hh1Var);
                c0469mp2 = null;
                break;
            }
            if (obj instanceof C0469mp) {
                while (!atomicReferenceFieldUpdater.compareAndSet(k90Var, obj, hh1Var)) {
                    if (atomicReferenceFieldUpdater.get(k90Var) != obj) {
                        break;
                    }
                }
                c0469mp2 = (C0469mp) obj;
                break loop0;
            }
            if (obj != hh1Var && !(obj instanceof Throwable)) {
                c80.m677u("Inconsistent state ", obj);
                return null;
            }
        }
        if (c0469mp2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0469mp.f6740n;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0469mp2);
            if (!(obj2 instanceof C0475mv) || ((C0475mv) obj2).f6890d == null) {
                C0469mp.f6739m.set(c0469mp2, 536870911);
                atomicReferenceFieldUpdater2.set(c0469mp2, C0871x4.f12800a);
                c0469mp = c0469mp2;
            } else {
                c0469mp2.m3147q();
            }
            if (c0469mp != null) {
                return c0469mp;
            }
        }
        return new C0469mp(2, t00Var);
    }

    /* JADX INFO: renamed from: C */
    public static final int m4222C(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: E */
    public static final void m4223E(on2 on2Var) {
        sp0.m4933c0(on2Var).m4348F();
    }

    /* JADX INFO: renamed from: F */
    public static final sz0 m4224F(String str, String str2, int i, in0 in0Var) {
        char cCharAt = str.charAt(i);
        if (((Boolean) in0Var.mo5j(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return m4225G(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i);
    }

    /* JADX INFO: renamed from: G */
    public static final sz0 m4225G(String str, String str2) {
        return new sz0(21, str2 + " when parsing an Instant from \"" + m4241W(str, 64) + '\"', str);
    }

    /* JADX INFO: renamed from: H */
    public static final int m4226H(String str, int i) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    /* JADX INFO: renamed from: I */
    public static final w30 m4227I(pl0 pl0Var, int i) {
        int iOrdinal = pl0Var.m3876R0().ordinal();
        w30 w30Var = w30.f12288h;
        if (iOrdinal != 0) {
            w30 w30Var2 = w30.f12289i;
            if (iOrdinal == 1) {
                pl0 pl0VarM4545f0 = rp0.m4545f0(pl0Var);
                if (pl0VarM4545f0 == null) {
                    C0676s.m4651j("ActiveParent with no focused child");
                    return null;
                }
                w30 w30VarM4227I = m4227I(pl0VarM4545f0, i);
                w30 w30Var3 = w30VarM4227I != w30Var ? w30VarM4227I : null;
                if (w30Var3 != null) {
                    return w30Var3;
                }
                if (pl0Var.f8387x) {
                    return w30Var;
                }
                pl0Var.f8387x = true;
                try {
                    el0 el0VarM3873O0 = pl0Var.m3873O0();
                    C0358jp c0358jp = new C0358jp(i);
                    bl0 bl0Var = (bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pl0Var)).getFocusOwner();
                    pl0 pl0VarM561f = bl0Var.m561f();
                    el0VarM3873O0.f2494k.mo5j(c0358jp);
                    pl0 pl0VarM561f2 = bl0Var.m561f();
                    if (!c0358jp.f5137b) {
                        return (pl0VarM561f == pl0VarM561f2 || pl0VarM561f2 == null) ? w30Var : gl0.f3571d == gl0.f3570c ? w30Var2 : w30.f12290j;
                    }
                    gl0 gl0Var = gl0.f3569b;
                    return w30Var2;
                } finally {
                    pl0Var.f8387x = false;
                }
            }
            if (iOrdinal == 2) {
                return w30Var2;
            }
            if (iOrdinal != 3) {
                c80.m675s();
                return null;
            }
        }
        return w30Var;
    }

    /* JADX INFO: renamed from: J */
    public static final w30 m4228J(pl0 pl0Var, int i) {
        if (!pl0Var.f8388y) {
            pl0Var.f8388y = true;
            try {
                el0 el0VarM3873O0 = pl0Var.m3873O0();
                C0358jp c0358jp = new C0358jp(i);
                bl0 bl0Var = (bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pl0Var)).getFocusOwner();
                pl0 pl0VarM561f = bl0Var.m561f();
                el0VarM3873O0.f2493j.mo5j(c0358jp);
                pl0 pl0VarM561f2 = bl0Var.m561f();
                boolean z = c0358jp.f5137b;
                w30 w30Var = w30.f12289i;
                if (z) {
                    gl0 gl0Var = gl0.f3569b;
                    return w30Var;
                }
                if (pl0VarM561f != pl0VarM561f2 && pl0VarM561f2 != null) {
                    return gl0.f3571d == gl0.f3570c ? w30Var : w30.f12290j;
                }
            } finally {
                pl0Var.f8388y = false;
            }
        }
        return w30.f12288h;
    }

    /* JADX INFO: renamed from: K */
    public static final w30 m4229K(pl0 pl0Var, int i) {
        th1 th1VarM4952m;
        vn1 vn1Var;
        int iOrdinal = pl0Var.m3876R0().ordinal();
        w30 w30Var = w30.f12288h;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                pl0 pl0VarM4545f0 = rp0.m4545f0(pl0Var);
                if (pl0VarM4545f0 != null) {
                    return m4227I(pl0VarM4545f0, i);
                }
                C0676s.m4651j("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    c80.m675s();
                    return null;
                }
                if (!pl0Var.f10757h.f10770u) {
                    kz0.m2764b("visitAncestors called on an unattached node");
                }
                th1 th1Var = pl0Var.f10757h.f10761l;
                r61 r61VarM4933c0 = sp0.m4933c0(pl0Var);
                loop0: while (true) {
                    if (r61VarM4933c0 == null) {
                        th1VarM4952m = null;
                        break;
                    }
                    if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 1024) != 0) {
                        while (th1Var != null) {
                            if ((th1Var.f10759j & 1024) != 0) {
                                th1VarM4952m = th1Var;
                                zk1 zk1Var = null;
                                while (th1VarM4952m != null) {
                                    if (th1VarM4952m instanceof pl0) {
                                        break loop0;
                                    }
                                    if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                        int i2 = 0;
                                        for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                            if ((th1Var2.f10759j & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    th1VarM4952m = th1Var2;
                                                } else {
                                                    if (zk1Var == null) {
                                                        zk1Var = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM4952m != null) {
                                                        zk1Var.m6423b(th1VarM4952m);
                                                        th1VarM4952m = null;
                                                    }
                                                    zk1Var.m6423b(th1Var2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    th1VarM4952m = sp0.m4952m(zk1Var);
                                }
                            }
                            th1Var = th1Var.f10761l;
                        }
                    }
                    r61VarM4933c0 = r61VarM4933c0.m4389u();
                    th1Var = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
                }
                pl0 pl0Var2 = (pl0) th1VarM4952m;
                if (pl0Var2 == null) {
                    return w30Var;
                }
                int iOrdinal2 = pl0Var2.m3876R0().ordinal();
                if (iOrdinal2 == 0) {
                    return m4228J(pl0Var2, i);
                }
                if (iOrdinal2 == 1) {
                    return m4229K(pl0Var2, i);
                }
                if (iOrdinal2 == 2) {
                    return w30.f12289i;
                }
                if (iOrdinal2 != 3) {
                    c80.m675s();
                    return null;
                }
                w30 w30VarM4229K = m4229K(pl0Var2, i);
                w30 w30Var2 = w30VarM4229K != w30Var ? w30VarM4229K : null;
                return w30Var2 == null ? m4228J(pl0Var2, i) : w30Var2;
            }
        }
        return w30Var;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m4230L(pl0 pl0Var) {
        zk1 zk1Var;
        vn1 vn1Var;
        bl0 bl0Var;
        boolean z;
        int i;
        zk1 zk1Var2;
        int i2;
        int i3;
        vn1 vn1Var2;
        bl0 bl0Var2 = (bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pl0Var)).getFocusOwner();
        pl0 pl0VarM561f = bl0Var2.m561f();
        kl0 kl0VarM3876R0 = pl0Var.m3876R0();
        if (pl0VarM561f == pl0Var) {
            pl0Var.m3872N0(kl0VarM3876R0, kl0VarM3876R0);
            return true;
        }
        if ((pl0VarM561f == null || pl0VarM561f.f8385v) && !pl0Var.f8385v && !((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pl0Var)).getFocusOwner()).f924a.m459F()) {
            return false;
        }
        if (pl0VarM561f != null) {
            zk1Var = new zk1(new pl0[16]);
            if (!pl0VarM561f.f10757h.f10770u) {
                kz0.m2764b("visitAncestors called on an unattached node");
            }
            th1 th1Var = pl0VarM561f.f10757h.f10761l;
            r61 r61VarM4933c0 = sp0.m4933c0(pl0VarM561f);
            while (r61VarM4933c0 != null) {
                if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 1024) != 0) {
                    while (th1Var != null) {
                        if ((th1Var.f10759j & 1024) != 0) {
                            th1 th1VarM4952m = th1Var;
                            zk1 zk1Var3 = null;
                            while (th1VarM4952m != null) {
                                if (th1VarM4952m instanceof pl0) {
                                    zk1Var.m6423b((pl0) th1VarM4952m);
                                } else if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                    int i4 = 0;
                                    for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                        if ((th1Var2.f10759j & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                th1VarM4952m = th1Var2;
                                            } else {
                                                if (zk1Var3 == null) {
                                                    zk1Var3 = new zk1(new th1[16]);
                                                }
                                                if (th1VarM4952m != null) {
                                                    zk1Var3.m6423b(th1VarM4952m);
                                                    th1VarM4952m = null;
                                                }
                                                zk1Var3.m6423b(th1Var2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                th1VarM4952m = sp0.m4952m(zk1Var3);
                            }
                        }
                        th1Var = th1Var.f10761l;
                    }
                }
                r61VarM4933c0 = r61VarM4933c0.m4389u();
                th1Var = (r61VarM4933c0 == null || (vn1Var2 = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var2.f12035f;
            }
        } else {
            zk1Var = null;
        }
        Object[] objArr = new pl0[16];
        Object[] objArr2 = new pl0[16];
        if (!pl0Var.f10757h.f10770u) {
            kz0.m2764b("visitAncestors called on an unattached node");
        }
        th1 th1Var3 = pl0Var.f10757h.f10761l;
        r61 r61VarM4933c02 = sp0.m4933c0(pl0Var);
        boolean z2 = true;
        int i5 = 0;
        int i6 = 0;
        while (r61VarM4933c02 != null) {
            if ((((th1) r61VarM4933c02.f9372M.f12036g).f10760k & 1024) != 0) {
                while (th1Var3 != null) {
                    if ((th1Var3.f10759j & 1024) != 0) {
                        th1 th1VarM4952m2 = th1Var3;
                        zk1 zk1Var4 = null;
                        while (th1VarM4952m2 != null) {
                            if (th1VarM4952m2 instanceof pl0) {
                                pl0 pl0Var2 = (pl0) th1VarM4952m2;
                                if (t11.m5086l(zk1Var != null ? Boolean.valueOf(zk1Var.m6431j(pl0Var2)) : null, Boolean.TRUE)) {
                                    int i7 = i5 + 1;
                                    if (objArr.length < i7) {
                                        int length = objArr.length;
                                        bl0Var = bl0Var2;
                                        Object[] objArr3 = new Object[Math.max(i7, length * 2)];
                                        i3 = i7;
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    } else {
                                        bl0Var = bl0Var2;
                                        i3 = i7;
                                    }
                                    objArr[i5] = pl0Var2;
                                    i5 = i3;
                                } else {
                                    bl0Var = bl0Var2;
                                    int i8 = i6 + 1;
                                    if (objArr2.length < i8) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i8, length2 * 2)];
                                        i2 = i8;
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    } else {
                                        i2 = i8;
                                    }
                                    objArr2[i6] = pl0Var2;
                                    i6 = i2;
                                }
                                if (pl0Var2 == pl0VarM561f) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                bl0Var = bl0Var2;
                                z = true;
                            }
                            if (z && (th1VarM4952m2.f10759j & 1024) != 0 && (th1VarM4952m2 instanceof u60)) {
                                int i9 = 0;
                                for (th1 th1Var4 = ((u60) th1VarM4952m2).f11116w; th1Var4 != null; th1Var4 = th1Var4.f10762m) {
                                    if ((th1Var4.f10759j & 1024) != 0) {
                                        int i10 = i9 + 1;
                                        if (i10 == 1) {
                                            th1VarM4952m2 = th1Var4;
                                            i = i10;
                                        } else {
                                            if (zk1Var4 == null) {
                                                i = i10;
                                                zk1Var2 = new zk1(new th1[16]);
                                            } else {
                                                i = i10;
                                                zk1Var2 = zk1Var4;
                                            }
                                            if (th1VarM4952m2 != null) {
                                                zk1Var2.m6423b(th1VarM4952m2);
                                                th1VarM4952m2 = null;
                                            }
                                            zk1Var2.m6423b(th1Var4);
                                            zk1Var4 = zk1Var2;
                                        }
                                        i9 = i;
                                    }
                                }
                                if (i9 == 1) {
                                    bl0Var2 = bl0Var;
                                } else {
                                    th1VarM4952m2 = sp0.m4952m(zk1Var4);
                                    bl0Var2 = bl0Var;
                                }
                            } else {
                                th1VarM4952m2 = sp0.m4952m(zk1Var4);
                                bl0Var2 = bl0Var;
                            }
                        }
                    }
                    th1Var3 = th1Var3.f10761l;
                    bl0Var2 = bl0Var2;
                }
            }
            bl0 bl0Var3 = bl0Var2;
            r61VarM4933c02 = r61VarM4933c02.m4389u();
            th1Var3 = (r61VarM4933c02 == null || (vn1Var = r61VarM4933c02.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
            bl0Var2 = bl0Var3;
        }
        bl0 bl0Var4 = bl0Var2;
        if (z2 && pl0VarM561f != null && !m4259n(pl0VarM561f, false)) {
            return false;
        }
        s11.m4674S(pl0Var, new C0159ea(10, pl0Var));
        int iOrdinal = pl0Var.m3876R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pl0Var)).getFocusOwner()).m564i(pl0Var);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    c80.m675s();
                    return false;
                }
                ((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pl0Var)).getFocusOwner()).m564i(pl0Var);
            }
        }
        kl0 kl0Var = kl0.f5628j;
        kl0 kl0Var2 = kl0.f5626h;
        if (z2 && pl0VarM561f != null) {
            pl0VarM561f.m3872N0(kl0Var2, kl0Var);
        }
        kl0 kl0Var3 = kl0.f5627i;
        if (zk1Var != null) {
            int i11 = zk1Var.f13936j - 1;
            Object[] objArr5 = zk1Var.f13934h;
            if (i11 < objArr5.length) {
                while (i11 >= 0) {
                    pl0 pl0Var3 = (pl0) objArr5[i11];
                    if (bl0Var4.m561f() != pl0Var) {
                        return false;
                    }
                    pl0Var3.m3872N0(kl0Var3, kl0Var);
                    i11--;
                }
            }
        }
        int i12 = i6 - 1;
        if (i12 < objArr2.length) {
            while (i12 >= 0) {
                pl0 pl0Var4 = (pl0) objArr2[i12];
                if (bl0Var4.m561f() != pl0Var) {
                    return false;
                }
                pl0Var4.m3872N0(pl0Var4 == pl0VarM561f ? kl0Var2 : kl0Var, kl0Var3);
                i12--;
            }
        }
        if (bl0Var4.m561f() != pl0Var) {
            return false;
        }
        pl0Var.m3872N0(kl0VarM3876R0, kl0Var2);
        return bl0Var4.m561f() == pl0Var;
    }

    /* JADX INFO: renamed from: M */
    public static int[] m4231M(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM5060L = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM5060L += (int) t11.m5060L(byteArrayInputStream, 2);
            iArr[i2] = iM5060L;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: N */
    public static h80[] m4232N(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, h80[] h80VarArr) throws IOException {
        byte[] bArr3 = rp0.f9677i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, rp0.f9678j)) {
                C0676s.m4653l("Unsupported meta version");
                return null;
            }
            int iM5060L = (int) t11.m5060L(fileInputStream, 2);
            byte[] bArrM5059K = t11.m5059K(fileInputStream, (int) t11.m5060L(fileInputStream, 4), (int) t11.m5060L(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                C0676s.m4653l("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM5059K);
            try {
                h80[] h80VarArrM4234P = m4234P(byteArrayInputStream, bArr2, iM5060L, h80VarArr);
                byteArrayInputStream.close();
                return h80VarArrM4234P;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(rp0.f9672d, bArr2)) {
            C0676s.m4653l("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            C0676s.m4653l("Unsupported meta version");
            return null;
        }
        int iM5060L2 = (int) t11.m5060L(fileInputStream, 1);
        byte[] bArrM5059K2 = t11.m5059K(fileInputStream, (int) t11.m5060L(fileInputStream, 4), (int) t11.m5060L(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C0676s.m4653l("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM5059K2);
        try {
            h80[] h80VarArrM4233O = m4233O(byteArrayInputStream2, iM5060L2, h80VarArr);
            byteArrayInputStream2.close();
            return h80VarArrM4233O;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [int[], java.io.Serializable] */
    /* JADX INFO: renamed from: O */
    public static h80[] m4233O(ByteArrayInputStream byteArrayInputStream, int i, h80[] h80VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new h80[0];
        }
        if (i != h80VarArr.length) {
            C0676s.m4653l("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM5060L = (int) t11.m5060L(byteArrayInputStream, 2);
            iArr[i2] = (int) t11.m5060L(byteArrayInputStream, 2);
            strArr[i2] = new String(t11.m5058J(byteArrayInputStream, iM5060L), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            h80 h80Var = h80VarArr[i3];
            if (!h80Var.f3896f.equals(strArr[i3])) {
                C0676s.m4653l("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            h80Var.f3893c = i4;
            h80Var.f3898h = m4231M(byteArrayInputStream, i4);
        }
        return h80VarArr;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable] */
    /* JADX INFO: renamed from: P */
    public static h80[] m4234P(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, h80[] h80VarArr) throws IOException {
        h80 h80Var;
        if (byteArrayInputStream.available() == 0) {
            return new h80[0];
        }
        if (i != h80VarArr.length) {
            C0676s.m4653l("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            t11.m5060L(byteArrayInputStream, 2);
            String str = new String(t11.m5058J(byteArrayInputStream, (int) t11.m5060L(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM5060L = t11.m5060L(byteArrayInputStream, 4);
            int iM5060L = (int) t11.m5060L(byteArrayInputStream, 2);
            if (h80VarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < h80VarArr.length; i3++) {
                    if (h80VarArr[i3].f3896f.equals(strSubstring)) {
                        h80Var = h80VarArr[i3];
                        break;
                    }
                }
                h80Var = null;
            } else {
                h80Var = null;
            }
            if (h80Var == null) {
                C0676s.m4653l("Missing profile key: ".concat(str));
                return null;
            }
            h80Var.f3897g = jM5060L;
            ?? M4231M = m4231M(byteArrayInputStream, iM5060L);
            if (Arrays.equals(bArr, rp0.f9676h)) {
                h80Var.f3893c = iM5060L;
                h80Var.f3898h = M4231M;
            }
        }
        return h80VarArr;
    }

    /* JADX INFO: renamed from: Q */
    public static h80[] m4235Q(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, rp0.f9673e)) {
            C0676s.m4653l("Unsupported version");
            return null;
        }
        int iM5060L = (int) t11.m5060L(fileInputStream, 1);
        byte[] bArrM5059K = t11.m5059K(fileInputStream, (int) t11.m5060L(fileInputStream, 4), (int) t11.m5060L(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C0676s.m4653l("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM5059K);
        try {
            h80[] h80VarArrM4236R = m4236R(byteArrayInputStream, str, iM5060L);
            byteArrayInputStream.close();
            return h80VarArrM4236R;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [int[], java.io.Serializable] */
    /* JADX INFO: renamed from: R */
    public static h80[] m4236R(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new h80[0];
        }
        h80[] h80VarArr = new h80[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM5060L = (int) t11.m5060L(byteArrayInputStream, 2);
            int iM5060L2 = (int) t11.m5060L(byteArrayInputStream, 2);
            h80VarArr[i3] = new h80(str, new String(t11.m5058J(byteArrayInputStream, iM5060L), StandardCharsets.UTF_8), t11.m5060L(byteArrayInputStream, 4), iM5060L2, (int) t11.m5060L(byteArrayInputStream, 4), (int) t11.m5060L(byteArrayInputStream, 4), new int[iM5060L2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            h80 h80Var = h80VarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = h80Var.f3894d;
            int i6 = h80Var.f3895e;
            TreeMap treeMap = (TreeMap) h80Var.f3899i;
            int i7 = iAvailable - i5;
            int iM5060L3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM5060L3 += (int) t11.m5060L(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM5060L3), 1);
                int iM5060L4 = (int) t11.m5060L(byteArrayInputStream, 2);
                while (iM5060L4 > 0) {
                    t11.m5060L(byteArrayInputStream, 2);
                    int iM5060L5 = (int) t11.m5060L(byteArrayInputStream, 1);
                    if (iM5060L5 != 6 && iM5060L5 != 7) {
                        while (iM5060L5 > 0) {
                            t11.m5060L(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM5060L6 = (int) t11.m5060L(byteArrayInputStream, 1); iM5060L6 > 0; iM5060L6--) {
                                t11.m5060L(byteArrayInputStream, 2);
                            }
                            iM5060L5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM5060L4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                C0676s.m4653l("Read too much data during profile line parse");
                return null;
            }
            h80Var.f3898h = m4231M(byteArrayInputStream, h80Var.f3893c);
            BitSet bitSetValueOf = BitSet.valueOf(t11.m5058J(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return h80VarArr;
    }

    /* JADX INFO: renamed from: S */
    public static final boolean m4237S(rk1 rk1Var, Object obj, Object obj2) {
        Object objM4505g = rk1Var.m4505g(obj);
        if (objM4505g == null) {
            return false;
        }
        if (!(objM4505g instanceof sk1)) {
            if (!objM4505g.equals(obj2)) {
                return false;
            }
            rk1Var.m4509k(obj);
            return true;
        }
        sk1 sk1Var = (sk1) objM4505g;
        boolean zM4893l = sk1Var.m4893l(obj2);
        if (zM4893l && sk1Var.m4888g()) {
            rk1Var.m4509k(obj);
        }
        return zM4893l;
    }

    /* JADX INFO: renamed from: T */
    public static final void m4238T(rk1 rk1Var, Object obj) {
        boolean zM4888g;
        long[] jArr = rk1Var.f9618a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = rk1Var.f9619b[i4];
                        Object obj3 = rk1Var.f9620c[i4];
                        if (obj3 instanceof sk1) {
                            sk1 sk1Var = (sk1) obj3;
                            sk1Var.m4893l(obj);
                            zM4888g = sk1Var.m4888g();
                        } else {
                            zM4888g = obj3 == obj;
                        }
                        if (zM4888g) {
                            rk1Var.m4510l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public static final String m4239U(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = AbstractC0570p7.f7992a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        if (i2 < 0) {
            C0676s.m4646d(hk1.m2208g(i2, "startIndex: ", ", endIndex: 8, size: 8"));
            return null;
        }
        if (i2 <= 8) {
            return new String(cArr2, i2, 8 - i2);
        }
        C0676s.m4651j(hk1.m2208g(i2, "startIndex: ", " > endIndex: 8"));
        return null;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: V */
    public static boolean m4240V(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, h80[] h80VarArr) throws IOException {
        int i;
        long j;
        int length;
        byte[] bArr2 = rp0.f9676h;
        byte[] bArr3 = rp0.f9675g;
        byte[] bArr4 = rp0.f9672d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = rp0.f9673e;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM4263r = m4263r(h80VarArr, bArr5);
                t11.m5073Y(byteArrayOutputStream, h80VarArr.length, 1);
                t11.m5073Y(byteArrayOutputStream, bArrM4263r.length, 4);
                byte[] bArrM5091q = t11.m5091q(bArrM4263r);
                t11.m5073Y(byteArrayOutputStream, bArrM5091q.length, 4);
                byteArrayOutputStream.write(bArrM5091q);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                t11.m5073Y(byteArrayOutputStream, h80VarArr.length, 1);
                for (h80 h80Var : h80VarArr) {
                    int size = ((TreeMap) h80Var.f3899i).size() * 4;
                    String strM4269x = m4269x(h80Var.f3891a, h80Var.f3896f, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    t11.m5074Z(byteArrayOutputStream, strM4269x.getBytes(charset).length);
                    t11.m5074Z(byteArrayOutputStream, ((int[]) h80Var.f3898h).length);
                    t11.m5073Y(byteArrayOutputStream, size, 4);
                    t11.m5073Y(byteArrayOutputStream, h80Var.f3892b, 4);
                    byteArrayOutputStream.write(strM4269x.getBytes(charset));
                    Iterator it = ((TreeMap) h80Var.f3899i).keySet().iterator();
                    while (it.hasNext()) {
                        t11.m5074Z(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        t11.m5074Z(byteArrayOutputStream, 0);
                    }
                    for (int i3 : (int[]) h80Var.f3898h) {
                        t11.m5074Z(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = rp0.f9674f;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM4263r2 = m4263r(h80VarArr, bArr6);
                t11.m5073Y(byteArrayOutputStream, h80VarArr.length, 1);
                t11.m5073Y(byteArrayOutputStream, bArrM4263r2.length, 4);
                byte[] bArrM5091q2 = t11.m5091q(bArrM4263r2);
                t11.m5073Y(byteArrayOutputStream, bArrM5091q2.length, 4);
                byteArrayOutputStream.write(bArrM5091q2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            t11.m5074Z(byteArrayOutputStream, h80VarArr.length);
            for (h80 h80Var2 : h80VarArr) {
                String str = h80Var2.f3891a;
                TreeMap treeMap = (TreeMap) h80Var2.f3899i;
                String strM4269x2 = m4269x(str, h80Var2.f3896f, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                t11.m5074Z(byteArrayOutputStream, strM4269x2.getBytes(charset2).length);
                t11.m5074Z(byteArrayOutputStream, treeMap.size());
                t11.m5074Z(byteArrayOutputStream, ((int[]) h80Var2.f3898h).length);
                t11.m5073Y(byteArrayOutputStream, h80Var2.f3892b, 4);
                byteArrayOutputStream.write(strM4269x2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    t11.m5074Z(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : (int[]) h80Var2.f3898h) {
                    t11.m5074Z(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            t11.m5074Z(byteArrayOutputStream2, h80VarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (h80 h80Var3 : h80VarArr) {
                t11.m5073Y(byteArrayOutputStream2, h80Var3.f3892b, 4);
                t11.m5073Y(byteArrayOutputStream2, h80Var3.f3897g, 4);
                t11.m5073Y(byteArrayOutputStream2, h80Var3.f3895e, 4);
                String strM4269x3 = m4269x(h80Var3.f3891a, h80Var3.f3896f, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM4269x3.getBytes(charset3).length;
                t11.m5074Z(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strM4269x3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            eg3 eg3Var = new eg3(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(eg3Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < h80VarArr.length) {
                try {
                    h80 h80Var4 = h80VarArr[i7];
                    t11.m5074Z(byteArrayOutputStream3, i7);
                    t11.m5074Z(byteArrayOutputStream3, h80Var4.f3893c);
                    i8 = i8 + 4 + (h80Var4.f3893c * i5);
                    int[] iArr = (int[]) h80Var4.f3898h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        t11.m5074Z(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            eg3 eg3Var2 = new eg3(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(eg3Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < h80VarArr.length; i13++) {
                try {
                    h80 h80Var5 = h80VarArr[i13];
                    Iterator it3 = ((TreeMap) h80Var5.f3899i).entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m4244Z(byteArrayOutputStream4, iIntValue, h80Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m4246a0(byteArrayOutputStream4, h80Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            t11.m5074Z(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i12 + 6;
                            t11.m5073Y(byteArrayOutputStream3, length4, 4);
                            t11.m5074Z(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i14 + length4;
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
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            eg3 eg3Var3 = new eg3(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(eg3Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            t11.m5073Y(byteArrayOutputStream, arrayList.size(), 4);
            int i15 = 0;
            while (i15 < arrayList.size()) {
                eg3 eg3Var4 = (eg3) arrayList.get(i15);
                int i16 = eg3Var4.f2436a;
                byte[] bArr7 = eg3Var4.f2437b;
                if (i16 != 1) {
                    i = i11;
                    if (i16 == i) {
                        j = 1;
                    } else if (i16 == 3) {
                        j = 2;
                    } else if (i16 == 4) {
                        j = 3;
                    } else {
                        if (i16 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                t11.m5073Y(byteArrayOutputStream, j, 4);
                t11.m5073Y(byteArrayOutputStream, size2, 4);
                if (eg3Var4.f2438c) {
                    long length5 = bArr7.length;
                    byte[] bArrM5091q3 = t11.m5091q(bArr7);
                    arrayList2.add(bArrM5091q3);
                    t11.m5073Y(byteArrayOutputStream, bArrM5091q3.length, 4);
                    t11.m5073Y(byteArrayOutputStream, length5, 4);
                    length = bArrM5091q3.length;
                } else {
                    arrayList2.add(bArr7);
                    t11.m5073Y(byteArrayOutputStream, bArr7.length, 4);
                    t11.m5073Y(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                i11 = i;
            }
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
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

    /* JADX INFO: renamed from: W */
    public static final String m4241W(String str, int i) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }

    /* JADX INFO: renamed from: X */
    public static void m4242X(ByteArrayOutputStream byteArrayOutputStream, h80 h80Var) throws IOException {
        m4246a0(byteArrayOutputStream, h80Var);
        int i = h80Var.f3895e;
        int[] iArr = (int[]) h80Var.f3898h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            t11.m5074Z(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) h80Var.f3899i).entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: Y */
    public static void m4243Y(ByteArrayOutputStream byteArrayOutputStream, h80 h80Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        t11.m5074Z(byteArrayOutputStream, str.getBytes(charset).length);
        t11.m5074Z(byteArrayOutputStream, h80Var.f3893c);
        t11.m5073Y(byteArrayOutputStream, h80Var.f3894d, 4);
        t11.m5073Y(byteArrayOutputStream, h80Var.f3892b, 4);
        t11.m5073Y(byteArrayOutputStream, h80Var.f3895e, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: Z */
    public static void m4244Z(ByteArrayOutputStream byteArrayOutputStream, int i, h80 h80Var) throws IOException {
        int i2 = h80Var.f3895e;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) h80Var.f3899i).entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static final long m4245a(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m4246a0(ByteArrayOutputStream byteArrayOutputStream, h80 h80Var) throws IOException {
        int i = 0;
        for (Map.Entry entry : ((TreeMap) h80Var.f3899i).entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                t11.m5074Z(byteArrayOutputStream, iIntValue - i);
                t11.m5074Z(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final gz0 m4247b(w41 w41Var, String str) {
        return new gz0(str, new hz0(w41Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4248c(final xm0 xm0Var, final String str, final String str2, final String str3, final xm0 xm0Var2, uh1 uh1Var, String str4, n80 n80Var, InterfaceC0596px interfaceC0596px, final int i, final int i2) {
        int i3;
        String str5;
        String str6;
        int i4;
        go0 go0Var;
        final uh1 uh1Var2;
        final n80 n80Var2;
        final String str7;
        b62 b62VarM1996r;
        xm0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        xm0Var2.getClass();
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(1522479816);
        if ((i & 6) == 0) {
            i3 = (go0Var2.m1984h(xm0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str5 = str;
            i3 |= go0Var2.m1980f(str5) ? 32 : 16;
        } else {
            str5 = str;
        }
        if ((i & 384) == 0) {
            i3 |= go0Var2.m1980f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= go0Var2.m1980f(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= go0Var2.m1984h(xm0Var2) ? 16384 : 8192;
        }
        int i5 = 196608 | i3;
        int i6 = i2 & 64;
        if (i6 == 0) {
            if ((1572864 & i) == 0) {
                str6 = str4;
                i5 |= go0Var2.m1980f(str6) ? 1048576 : 524288;
            }
            i4 = i5 | 12582912;
            if (go0Var2.m1958O(i4 & 1, (4793491 & i4) == 4793490)) {
                go0Var = go0Var2;
                go0Var.m1961R();
                uh1Var2 = uh1Var;
                n80Var2 = n80Var;
                str7 = str6;
            } else {
                if (i6 != 0) {
                    str6 = null;
                }
                String str8 = str6;
                n80 n80Var3 = new n80();
                int i7 = i4 >> 9;
                rh1 rh1Var = rh1.f9587a;
                go0Var = go0Var2;
                m4249d(true, xm0Var, rh1Var, str5, n80Var3, xe1.m6126i0(-1682068725, new b81(str8, xm0Var, str3, xm0Var2, 6), go0Var2), xe1.m6126i0(724520180, new C0868x1(str2, 3), go0Var2), go0Var, ((i4 << 6) & 7168) | ((i4 << 3) & 112) | 1769478 | (i7 & 896) | (57344 & i7), 0);
                str7 = str8;
                uh1Var2 = rh1Var;
                n80Var2 = n80Var3;
            }
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r == null) {
                b62VarM1996r.f616d = new mn0() { // from class: rp1
                    @Override // p000.mn0
                    /* JADX INFO: renamed from: g */
                    public final Object mo12g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qp0.m4248c(xm0Var, str, str2, str3, xm0Var2, uh1Var2, str7, n80Var2, (InterfaceC0596px) obj, pp0.m3902N(i | 1), i2);
                        return a83.f116a;
                    }
                };
                return;
            }
            return;
        }
        i5 = 1769472 | i3;
        str6 = str4;
        i4 = i5 | 12582912;
        if (go0Var2.m1958O(i4 & 1, (4793491 & i4) == 4793490)) {
        }
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r == null) {
        }
    }

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
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4249d(final boolean z, final xm0 xm0Var, uh1 uh1Var, final String str, n80 n80Var, final nn0 nn0Var, final C0402kw c0402kw, InterfaceC0596px interfaceC0596px, final int i, final int i2) {
        int i3;
        uh1 uh1Var2;
        String str2;
        int i4;
        n80 n80Var2;
        nn0 nn0Var2;
        C0402kw c0402kw2;
        int i5;
        xm0 xm0Var2;
        final uh1 uh1Var3;
        b62 b62VarM1996r;
        xm0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-742493751);
        if ((i & 6) == 0) {
            i3 = (go0Var.m1982g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= go0Var.m1984h(xm0Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                uh1Var2 = uh1Var;
                i3 |= go0Var.m1980f(uh1Var2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                str2 = str;
                i3 |= go0Var.m1980f(str2) ? 2048 : 1024;
            } else {
                str2 = str;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    n80Var2 = n80Var;
                    i3 |= go0Var.m1980f(n80Var2) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    nn0Var2 = nn0Var;
                    i3 |= go0Var.m1984h(nn0Var2) ? 131072 : 65536;
                } else {
                    nn0Var2 = nn0Var;
                }
                if ((1572864 & i) == 0) {
                    c0402kw2 = c0402kw;
                    i3 |= go0Var.m1984h(c0402kw2) ? 1048576 : 524288;
                } else {
                    c0402kw2 = c0402kw;
                }
                i5 = i3;
                if (go0Var.m1958O(i5 & 1, (599187 & i5) != 599186)) {
                    uh1 uh1Var4 = i6 != 0 ? rh1.f9587a : uh1Var2;
                    final n80 n80Var3 = i4 != 0 ? new n80() : n80Var2;
                    Object objM1956L = go0Var.m1956L();
                    C0160eb c0160eb = C0520nx.f7360a;
                    if (objM1956L == c0160eb) {
                        objM1956L = op0.m3598u(Boolean.valueOf(z));
                        go0Var.m1981f0(objM1956L);
                    }
                    xk1 xk1Var = (xk1) objM1956L;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    boolean z2 = (i5 & 14) == 4;
                    Object objM1956L2 = go0Var.m1956L();
                    if (z2 || objM1956L2 == c0160eb) {
                        objM1956L2 = new tp1(z, xk1Var, (t00) null);
                        go0Var.m1981f0(objM1956L2);
                    }
                    AbstractC0179eu.m1456f(go0Var, (mn0) objM1956L2, boolValueOf);
                    if (!((Boolean) xk1Var.getValue()).booleanValue()) {
                        b62 b62VarM1996r2 = go0Var.m1996r();
                        if (b62VarM1996r2 != null) {
                            final uh1 uh1Var5 = uh1Var4;
                            final int i7 = 0;
                            final String str3 = str2;
                            final nn0 nn0Var3 = nn0Var2;
                            final C0402kw c0402kw3 = c0402kw2;
                            b62VarM1996r2.f616d = new mn0() { // from class: sp1
                                @Override // p000.mn0
                                /* JADX INFO: renamed from: g */
                                public final Object mo12g(Object obj, Object obj2) {
                                    int i8 = i7;
                                    a83 a83Var = a83.f116a;
                                    int i9 = i;
                                    switch (i8) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iM3902N = pp0.m3902N(i9 | 1);
                                            qp0.m4249d(z, xm0Var, uh1Var5, str3, n80Var3, nn0Var3, c0402kw3, (InterfaceC0596px) obj, iM3902N, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iM3902N2 = pp0.m3902N(i9 | 1);
                                            qp0.m4249d(z, xm0Var, uh1Var5, str3, n80Var3, nn0Var3, c0402kw3, (InterfaceC0596px) obj, iM3902N2, i2);
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
                    qp1 qp1Var = new qp1(uh1Var6, z, str, nn0Var, c0402kw);
                    uh1Var3 = uh1Var6;
                    AbstractC0731te.m5208f(xm0Var2, n80Var2, xe1.m6126i0(-478376494, qp1Var, go0Var), go0Var, ((i5 >> 3) & 14) | 384 | ((i5 >> 9) & 112));
                } else {
                    xm0Var2 = xm0Var;
                    go0Var.m1961R();
                    uh1Var3 = uh1Var2;
                }
                final n80 n80Var4 = n80Var2;
                b62VarM1996r = go0Var.m1996r();
                if (b62VarM1996r != null) {
                    final int i8 = 1;
                    final xm0 xm0Var3 = xm0Var2;
                    b62VarM1996r.f616d = new mn0() { // from class: sp1
                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj, Object obj2) {
                            int i82 = i8;
                            a83 a83Var = a83.f116a;
                            int i9 = i;
                            switch (i82) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iM3902N = pp0.m3902N(i9 | 1);
                                    qp0.m4249d(z, xm0Var3, uh1Var3, str, n80Var4, nn0Var, c0402kw, (InterfaceC0596px) obj, iM3902N, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iM3902N2 = pp0.m3902N(i9 | 1);
                                    qp0.m4249d(z, xm0Var3, uh1Var3, str, n80Var4, nn0Var, c0402kw, (InterfaceC0596px) obj, iM3902N2, i2);
                                    break;
                            }
                            return a83Var;
                        }
                    };
                    return;
                }
                return;
            }
            i3 |= 24576;
            n80Var2 = n80Var;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i5 = i3;
            if (go0Var.m1958O(i5 & 1, (599187 & i5) != 599186)) {
            }
            final n80 n80Var42 = n80Var2;
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r != null) {
            }
        }
        uh1Var2 = uh1Var;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        n80Var2 = n80Var;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i5 = i3;
        if (go0Var.m1958O(i5 & 1, (599187 & i5) != 599186)) {
        }
        final n80 n80Var422 = n80Var2;
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m4250e(String str, uh1 uh1Var, InterfaceC0596px interfaceC0596px, int i, int i2) {
        uh1 uh1Var2;
        int i3;
        uh1 uh1Var3;
        str.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1246242467);
        int i4 = (go0Var.m1980f(str) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            uh1Var2 = uh1Var;
        } else {
            uh1Var2 = uh1Var;
            i3 = i4 | (go0Var.m1980f(uh1Var2) ? 32 : 16);
        }
        if (go0Var.m1958O(i3 & 1, (i3 & 19) != 18)) {
            uh1Var3 = i5 != 0 ? rh1.f9587a : uh1Var2;
            AbstractC0179eu.m1446a(str, uh1Var3.mo4491c(AbstractC0731te.f10693e), new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(14), im0.f4680j, 0L, 3, rg3.m4450D(20), null, null, 16613368), 0, false, 0, 0, go0Var, i3 & 14, 1016);
        } else {
            go0Var.m1961R();
            uh1Var3 = uh1Var2;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0781up(str, uh1Var3, i, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m4251f(uh1 uh1Var, boolean z, String str, nn0 nn0Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var;
        q51 q51VarM5522A;
        q51 q51VarM5522A2;
        fj0 fj0VarM5531J;
        long j;
        float f;
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(665894619);
        int i2 = i | (go0Var2.m1980f(uh1Var) ? 4 : 2) | (go0Var2.m1982g(z) ? 32 : 16) | (go0Var2.m1980f(str) ? 256 : 128) | (go0Var2.m1984h(nn0Var) ? 2048 : 1024) | (go0Var2.m1984h(c0402kw) ? 16384 : 8192);
        if (go0Var2.m1958O(i2 & 1, (i2 & 9363) != 9362)) {
            Object objM1956L = go0Var2.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                objM1956L = op0.m3598u(Boolean.FALSE);
                go0Var2.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = (i2 & 112) == 32;
            Object objM1956L2 = go0Var2.m1956L();
            if (z2 || objM1956L2 == c0160eb) {
                objM1956L2 = new up1(z, xk1Var, (t00) null);
                go0Var2.m1981f0(objM1956L2);
            }
            AbstractC0179eu.m1456f(go0Var2, (mn0) objM1956L2, boolValueOf);
            float f2 = ((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.94f;
            if (((Boolean) xk1Var.getValue()).booleanValue()) {
                go0Var2.m1966W(-786897736);
                Object objM1956L3 = go0Var2.m1956L();
                if (objM1956L3 == c0160eb) {
                    objM1956L3 = new vi1(26);
                    go0Var2.m1981f0(objM1956L3);
                }
                q51VarM5522A = up0.m5522A((in0) objM1956L3);
                go0Var2.m1994p(false);
            } else {
                go0Var2.m1966W(-786780618);
                Object objM1956L4 = go0Var2.m1956L();
                if (objM1956L4 == c0160eb) {
                    objM1956L4 = new vi1(27);
                    go0Var2.m1981f0(objM1956L4);
                }
                q51VarM5522A = up0.m5522A((in0) objM1956L4);
                go0Var2.m1994p(false);
            }
            gu2 gu2VarM5481b = AbstractC0768uc.m5481b(f2, q51VarM5522A, "NukeDialogScaleX", go0Var2, 3072);
            float f3 = ((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.92f;
            if (((Boolean) xk1Var.getValue()).booleanValue()) {
                go0Var2.m1966W(-786468262);
                Object objM1956L5 = go0Var2.m1956L();
                if (objM1956L5 == c0160eb) {
                    objM1956L5 = new vi1(28);
                    go0Var2.m1981f0(objM1956L5);
                }
                q51VarM5522A2 = up0.m5522A((in0) objM1956L5);
                go0Var2.m1994p(false);
            } else {
                go0Var2.m1966W(-786353066);
                Object objM1956L6 = go0Var2.m1956L();
                if (objM1956L6 == c0160eb) {
                    objM1956L6 = new vi1(24);
                    go0Var2.m1981f0(objM1956L6);
                }
                q51VarM5522A2 = up0.m5522A((in0) objM1956L6);
                go0Var2.m1994p(false);
            }
            gu2 gu2VarM5481b2 = AbstractC0768uc.m5481b(f3, q51VarM5522A2, "NukeDialogScaleY", go0Var2, 3072);
            float f4 = ((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.0f;
            if (((Boolean) xk1Var.getValue()).booleanValue()) {
                go0Var2.m1966W(-786051281);
                Object objM1956L7 = go0Var2.m1956L();
                if (objM1956L7 == c0160eb) {
                    objM1956L7 = new vi1(25);
                    go0Var2.m1981f0(objM1956L7);
                }
                fj0VarM5531J = up0.m5522A((in0) objM1956L7);
                go0Var2.m1994p(false);
            } else {
                go0Var2.m1966W(-785958405);
                go0Var2.m1994p(false);
                fj0VarM5531J = up0.m5531J(150, null, 6);
            }
            gu2 gu2VarM5481b3 = AbstractC0768uc.m5481b(f4, fj0VarM5531J, "NukeDialogAlpha", go0Var2, 3072);
            if (((Boolean) xk1Var.getValue()).booleanValue()) {
                go0Var2.m1966W(-25346353);
                j = ((lp1) go0Var2.m1988j(ur1.f11452a)).f6238f;
                f = 0.045f;
            } else {
                go0Var2.m1966W(-25344754);
                j = ((lp1) go0Var2.m1988j(ur1.f11452a)).f6239g;
                f = 0.16f;
            }
            long jM2565b = C0363ju.m2565b(f, j);
            go0Var2.m1994p(false);
            gu2 gu2VarM269a = ar2.m269a(jM2565b, up0.m5531J(180, null, 6), "NukeDialogFluidEdgeColor", go0Var2);
            gu2 gu2VarM5480a = AbstractC0768uc.m5480a(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 2.0f, up0.m5531J(180, null, 6), "NukeDialogFluidEdgePadding", go0Var2);
            kr1 kr1Var = new kr1(22.0f);
            uh1 uh1VarMo4491c = uh1Var.mo4491c(AbstractC0731te.f10693e);
            boolean zM1980f = go0Var2.m1980f(gu2VarM5481b3) | go0Var2.m1980f(gu2VarM5481b) | go0Var2.m1980f(gu2VarM5481b2);
            Object objM1956L8 = go0Var2.m1956L();
            if (zM1980f || objM1956L8 == c0160eb) {
                objM1956L8 = new C0444m0(gu2VarM5481b3, gu2VarM5481b, gu2VarM5481b2, 9);
                go0Var2.m1981f0(objM1956L8);
            }
            go0Var = go0Var2;
            ci0.m807h(AbstractC0731te.m5183L(uh1VarMo4491c, (in0) objM1956L8), kr1Var, 0L, ((C0363ju) gu2VarM269a.getValue()).f5219a, ((za0) gu2VarM5480a.getValue()).f13798h, 0L, 0.0f, new jw1(20.0f, 20.0f, 20.0f, 20.0f), null, xe1.m6126i0(-1103058934, new C0746tr(str, c0402kw, nn0Var, 1), go0Var2), go0Var, 817889328, 356);
        } else {
            go0Var = go0Var2;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new qp1(uh1Var, z, str, nn0Var, c0402kw, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m4252g(uh1 uh1Var, long j, InterfaceC0596px interfaceC0596px, int i) {
        uh1 uh1Var2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1081890667);
        int i2 = i | 6 | (go0Var.m1978e(j) ? 32 : 16);
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            rh1 rh1Var = rh1.f9587a;
            uh1 uh1VarM5213h0 = AbstractC0731te.m5213h0(rh1Var, 18.0f, 18.0f);
            boolean z = (i2 & 112) == 32;
            Object objM1956L = go0Var.m1956L();
            if (z || objM1956L == C0520nx.f7360a) {
                objM1956L = new C0082c8(j, 4);
                go0Var.m1981f0(objM1956L);
            }
            AbstractC0179eu.m1448b(uh1VarM5213h0, (in0) objM1956L, go0Var, 0);
            uh1Var2 = rh1Var;
        } else {
            go0Var.m1961R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0952z7(uh1Var2, j, i, 1);
        }
    }

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
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4253h(String str, xm0 xm0Var, uh1 uh1Var, String str2, mn0 mn0Var, String str3, C0363ju c0363ju, boolean z, in0 in0Var, InterfaceC0596px interfaceC0596px, int i, int i2) {
        int i3;
        xm0 xm0Var2;
        int i4;
        String str4;
        int i5;
        mn0 mn0Var2;
        int i6;
        String str5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        go0 go0Var;
        boolean z2;
        xm0 xm0Var3;
        String str6;
        mn0 mn0Var3;
        String str7;
        uh1 uh1Var2;
        C0363ju c0363ju2;
        in0 in0Var2;
        b62 b62VarM1996r;
        str.getClass();
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(-321981089);
        if ((i & 6) == 0) {
            i3 = (go0Var2.m1980f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                xm0Var2 = xm0Var;
                i3 |= go0Var2.m1984h(xm0Var2) ? 32 : 16;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str4 = str2;
                    i3 |= go0Var2.m1980f(str4) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        mn0Var2 = mn0Var;
                        i3 |= go0Var2.m1984h(mn0Var2) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            str5 = str3;
                            i3 |= go0Var2.m1980f(str5) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else {
                            if ((1572864 & i) == 0) {
                                i3 |= go0Var2.m1980f(c0363ju) ? 1048576 : 524288;
                            }
                            i8 = i2 & 128;
                            if (i8 == 0) {
                                i9 = i3 | 12582912;
                            } else {
                                int i13 = i3;
                                if ((i & 12582912) == 0) {
                                    i9 = i13 | (go0Var2.m1982g(z) ? 8388608 : 4194304);
                                } else {
                                    i9 = i13;
                                }
                            }
                            i10 = i2 & 256;
                            if (i10 != 0) {
                                if ((i & 100663296) == 0) {
                                    i11 = i10;
                                    i9 |= go0Var2.m1984h(in0Var) ? 67108864 : 33554432;
                                }
                                if (go0Var2.m1958O(i9 & 1, (i9 & 38347795) != 38347794)) {
                                    xm0 xm0Var4 = i12 != 0 ? null : xm0Var2;
                                    String str8 = i4 != 0 ? null : str4;
                                    mn0 mn0Var4 = i5 != 0 ? null : mn0Var2;
                                    if (i6 != 0) {
                                        str5 = null;
                                    }
                                    C0363ju c0363ju3 = i7 != 0 ? null : c0363ju;
                                    boolean z3 = i8 != 0 ? true : z;
                                    in0 in0Var3 = i11 != 0 ? null : in0Var;
                                    int i14 = i9 >> 3;
                                    go0Var = go0Var2;
                                    boolean z4 = z3;
                                    sp0.m4940g(str, null, str8, mn0Var4, xe1.m6126i0(879735963, new C0656rh(str5, c0363ju3, z3), go0Var2), null, z4, xm0Var4, in0Var3, go0Var, (i9 & 14) | 24576 | (i14 & 896) | (i14 & 7168) | (i14 & 3670016) | ((i9 << 18) & 29360128) | (i9 & 234881024), 34);
                                    c0363ju2 = c0363ju3;
                                    str7 = str5;
                                    str6 = str8;
                                    mn0Var3 = mn0Var4;
                                    z2 = z4;
                                    xm0Var3 = xm0Var4;
                                    in0Var2 = in0Var3;
                                    uh1Var2 = rh1.f9587a;
                                } else {
                                    go0Var = go0Var2;
                                    go0Var.m1961R();
                                    z2 = z;
                                    xm0Var3 = xm0Var2;
                                    str6 = str4;
                                    mn0Var3 = mn0Var2;
                                    str7 = str5;
                                    uh1Var2 = uh1Var;
                                    c0363ju2 = c0363ju;
                                    in0Var2 = in0Var;
                                }
                                b62VarM1996r = go0Var.m1996r();
                                if (b62VarM1996r != null) {
                                    b62VarM1996r.f616d = new zp1(str, xm0Var3, uh1Var2, str6, mn0Var3, str7, c0363ju2, z2, in0Var2, i, i2);
                                    return;
                                }
                                return;
                            }
                            i9 |= 100663296;
                            i11 = i10;
                            if (go0Var2.m1958O(i9 & 1, (i9 & 38347795) != 38347794)) {
                            }
                            b62VarM1996r = go0Var.m1996r();
                            if (b62VarM1996r != null) {
                            }
                        }
                        i8 = i2 & 128;
                        if (i8 == 0) {
                        }
                        i10 = i2 & 256;
                        if (i10 != 0) {
                        }
                        i11 = i10;
                        if (go0Var2.m1958O(i9 & 1, (i9 & 38347795) != 38347794)) {
                        }
                        b62VarM1996r = go0Var.m1996r();
                        if (b62VarM1996r != null) {
                        }
                    }
                    str5 = str3;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i10 = i2 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if (go0Var2.m1958O(i9 & 1, (i9 & 38347795) != 38347794)) {
                    }
                    b62VarM1996r = go0Var.m1996r();
                    if (b62VarM1996r != null) {
                    }
                }
                mn0Var2 = mn0Var;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                str5 = str3;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                if (go0Var2.m1958O(i9 & 1, (i9 & 38347795) != 38347794)) {
                }
                b62VarM1996r = go0Var.m1996r();
                if (b62VarM1996r != null) {
                }
            }
            str4 = str2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mn0Var2 = mn0Var;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            str5 = str3;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            if (go0Var2.m1958O(i9 & 1, (i9 & 38347795) != 38347794)) {
            }
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r != null) {
            }
        }
        xm0Var2 = xm0Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str4 = str2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mn0Var2 = mn0Var;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        str5 = str3;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        if (go0Var2.m1958O(i9 & 1, (i9 & 38347795) != 38347794)) {
        }
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m4254i(m13 m13Var) {
        k02 k02Var;
        w02 w02Var = m13Var.f6437c;
        wd0 wd0Var = (w02Var == null || (k02Var = w02Var.f12240a) == null) ? null : new wd0(k02Var.f5295b);
        boolean z = false;
        if (wd0Var != null && wd0Var.f12465a == 1) {
            z = true;
        }
        return !z;
    }

    /* JADX INFO: renamed from: j */
    public static final ExtractedText m4255j(k03 k03Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = k03Var.f5296a.f10051i;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = k03Var.f5297b;
        extractedText.selectionStart = f13.m1497f(j);
        extractedText.selectionEnd = f13.m1496e(j);
        extractedText.flags = !pv2.m3996i0(k03Var.f5296a.f10051i, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: k */
    public static final void m4256k(rk1 rk1Var, Object obj, Object obj2) {
        int iM4504f = rk1Var.m4504f(obj);
        boolean z = iM4504f < 0;
        Object obj3 = z ? null : rk1Var.f9620c[iM4504f];
        if (obj3 != null) {
            if (obj3 instanceof sk1) {
                ((sk1) obj3).m4882a(obj2);
            } else if (obj3 != obj2) {
                sk1 sk1Var = new sk1();
                sk1Var.m4882a(obj3);
                sk1Var.m4882a(obj2);
                obj2 = sk1Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            rk1Var.f9620c[iM4504f] = obj2;
            return;
        }
        int i = ~iM4504f;
        rk1Var.f9619b[i] = obj;
        rk1Var.f9620c[i] = obj2;
    }

    /* JADX INFO: renamed from: l */
    public static final int m4257l(float f) {
        return Math.round((float) Math.ceil(f));
    }

    /* JADX INFO: renamed from: m */
    public static final void m4258m(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m4259n(pl0 pl0Var, boolean z) {
        int iOrdinal = pl0Var.m3876R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                pl0 pl0VarM4545f0 = rp0.m4545f0(pl0Var);
                if (!(pl0VarM4545f0 != null ? m4259n(pl0VarM4545f0, z) : true)) {
                    return false;
                }
                pl0Var.m3872N0(kl0.f5627i, kl0.f5628j);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                c80.m675s();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static rk1 m4260o() {
        long[] jArr = ed2.f2401a;
        return new rk1();
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m4261p(o62 o62Var, float f, float f2) {
        float f3 = o62Var.f7536a;
        if (f > o62Var.f7538c || f3 > f) {
            return false;
        }
        return f2 <= o62Var.f7539d && o62Var.f7537b <= f2;
    }

    /* JADX INFO: renamed from: q */
    public static final long m4262q(long j, ed0 ed0Var) {
        long j2;
        int iOrdinal = ed0Var.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = AIChatConfig.MaxReplyDelayMs;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                c80.m677u("Wrong unit for millisMultiplier: ", ed0Var);
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    /* JADX INFO: renamed from: r */
    public static byte[] m4263r(h80[] h80VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (h80 h80Var : h80VarArr) {
            length += ((((h80Var.f3895e * 2) + 7) & (-8)) / 8) + (h80Var.f3893c * 2) + m4269x(h80Var.f3891a, h80Var.f3896f, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + h80Var.f3894d;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, rp0.f9674f)) {
            int length2 = h80VarArr.length;
            while (i < length2) {
                h80 h80Var2 = h80VarArr[i];
                m4243Y(byteArrayOutputStream, h80Var2, m4269x(h80Var2.f3891a, h80Var2.f3896f, bArr));
                m4242X(byteArrayOutputStream, h80Var2);
                i++;
            }
        } else {
            for (h80 h80Var3 : h80VarArr) {
                m4243Y(byteArrayOutputStream, h80Var3, m4269x(h80Var3.f3891a, h80Var3.f3896f, bArr));
            }
            int length3 = h80VarArr.length;
            while (i < length3) {
                m4242X(byteArrayOutputStream, h80VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: s */
    public static final uh1 m4264s(uh1 uh1Var, in0 in0Var) {
        return uh1Var.mo4491c(new ic0(in0Var));
    }

    /* JADX INFO: renamed from: t */
    public static final uh1 m4265t(uh1 uh1Var, in0 in0Var) {
        return uh1Var.mo4491c(new pc0(in0Var));
    }

    /* JADX INFO: renamed from: u */
    public static final uh1 m4266u(uh1 uh1Var, in0 in0Var) {
        return uh1Var.mo4491c(new qc0(in0Var));
    }

    /* JADX INFO: renamed from: v */
    public static final o62 m4267v(th1 th1Var, boolean z, boolean z2) {
        if (!th1Var.f10757h.f10770u) {
            return o62.f7535e;
        }
        if (z) {
            return sp0.m4927Z(th1Var, 8).m6470o1();
        }
        zn1 zn1VarM4927Z = sp0.m4927Z(th1Var, 8);
        return s11.m4665J(zn1VarM4927Z).mo644J(zn1VarM4927Z, z2);
    }

    /* JADX INFO: renamed from: w */
    public static final void m4268w(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    /* JADX INFO: renamed from: x */
    public static String m4269x(String str, String str2, byte[] bArr) {
        byte[] bArr2 = rp0.f9675g;
        byte[] bArr3 = rp0.f9676h;
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
                return hk1.m2211j(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: y */
    public static k63 m4270y(Object obj) {
        if (obj == null) {
            return h30.f3810h;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? y20.f13283j : y20.f13282i;
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
            return g30.m1791j(((Integer) obj).intValue());
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
            return new r30(a63.m101a((Class) obj).f96b);
        }
        if (obj instanceof a63) {
            return new r30(((a63) obj).f96b);
        }
        throw new UnsupportedOperationException("Not a constant: " + obj);
    }

    /* JADX INFO: renamed from: z */
    public static final long m4271z(KeyEvent keyEvent) {
        return sp0.m4938f(keyEvent.getKeyCode());
    }

    /* JADX INFO: renamed from: D */
    public abstract int mo170D(mj0 mj0Var);
}
