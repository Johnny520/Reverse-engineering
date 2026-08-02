package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rp0 implements y40, vx {
    public static final kw a = new kw(636288403, false, new pw(0));
    public static final kw b = new kw(-1357803046, false, new pw(1));
    public static final tc0 c = new tc0(4);
    public static final byte[] d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};
    public static final j51 k = new j51(29);
    public static final Object l = new Object();
    public static Constructor m = null;
    public static sx0 n = null;
    public static final int o = 9;
    public static final int p = 10;
    public static final int q = 12;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void C(y33 y33Var, in0 in0Var, uh1 uh1Var, sf0 sf0Var, ph0 ph0Var, mn0 mn0Var, kw kwVar, px pxVar, int i2) {
        int i3;
        int i4;
        int i5;
        u33 u33VarA;
        boolean z;
        u33 u33VarA2;
        u33 u33VarA3;
        sf0 sf0Var2;
        ph0 ph0Var2;
        y33 y33Var2;
        boolean z2;
        nx1 nx1Var = y33Var.d;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1912839215);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(y33Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(in0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.f(uh1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go0Var.f(sf0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= go0Var.f(ph0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= go0Var.h(mn0Var) ? 131072 : 65536;
        }
        int i6 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            i6 |= go0Var.h(kwVar) ? 8388608 : 4194304;
        }
        if (!go0Var.O(i6 & 1, (4793491 & i6) != 4793490)) {
            go0Var.R();
        } else if (((Boolean) in0Var.j(nx1Var.getValue())).booleanValue() || ((Boolean) in0Var.j(y33Var.c())).booleanValue() || y33Var.g() || y33Var.d()) {
            go0Var.W(-232386135);
            int i7 = i6 & 14;
            int i8 = i7 | 48;
            int i9 = i8 & 14;
            boolean z3 = ((i9 ^ 6) > 4 && go0Var.f(y33Var)) || (i8 & 6) == 4;
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (z3 || objL == ebVar) {
                objL = y33Var.c();
                go0Var.f0(objL);
            }
            if (y33Var.g()) {
                objL = y33Var.c();
            }
            go0Var.W(1844425648);
            if0 if0VarM0 = m0(y33Var, in0Var, objL, go0Var);
            go0Var.p(false);
            Object value = nx1Var.getValue();
            go0Var.W(1844425648);
            if0 if0VarM02 = m0(y33Var, in0Var, value, go0Var);
            go0Var.p(false);
            int i10 = i9 | 3072;
            int i11 = (i10 & 14) ^ 6;
            boolean z4 = (i11 > 4 && go0Var.f(y33Var)) || (i10 & 6) == 4;
            Object objL2 = go0Var.L();
            if (z4 || objL2 == ebVar) {
                i4 = i6;
                i5 = i10;
                objL2 = new y33(new yk1(if0VarM0), y33Var, y33Var.c.concat(" > EnterExitTransition"));
                go0Var.f0(objL2);
            } else {
                i4 = i6;
                i5 = i10;
            }
            y33 y33Var3 = (y33) objL2;
            boolean zF = ((i11 > 4 && go0Var.f(y33Var)) || (i5 & 6) == 4) | go0Var.f(y33Var3);
            Object objL3 = go0Var.L();
            if (zF || objL3 == ebVar) {
                objL3 = new d62(5, y33Var, y33Var3);
                go0Var.f0(objL3);
            }
            eu.c(y33Var3, (in0) objL3, go0Var);
            if (y33Var.g()) {
                y33Var3.j(if0VarM0, if0VarM02);
            } else {
                y33Var3.k(if0VarM02);
                y33Var3.k.setValue(Boolean.FALSE);
            }
            n43 n43Var = nf0.a;
            boolean zF2 = go0Var.f(y33Var3);
            Object objL4 = go0Var.L();
            if (zF2 || objL4 == ebVar) {
                objL4 = op0.u(sf0Var);
                go0Var.f0(objL4);
            }
            xk1 xk1Var = (xk1) objL4;
            Object objC = y33Var3.c();
            nx1 nx1Var2 = y33Var3.d;
            Object value2 = nx1Var2.getValue();
            if0 if0Var = if0.i;
            if (objC == value2 && y33Var3.c() == if0Var) {
                if (y33Var3.g()) {
                    xk1Var.setValue(sf0Var);
                } else {
                    xk1Var.setValue(sf0.b);
                }
            } else if (nx1Var2.getValue() == if0Var) {
                z33 z33Var = ((sf0) xk1Var.getValue()).a;
                z33 z33Var2 = sf0Var.a;
                uh0 uh0Var = z33Var2.a;
                if (uh0Var == null) {
                    uh0Var = z33Var.a;
                }
                uh0 uh0Var2 = uh0Var;
                cd2 cd2Var = z33Var2.b;
                if (cd2Var == null) {
                    cd2Var = z33Var.b;
                }
                xk1Var.setValue(new sf0(new z33(uh0Var2, (t11) null, cd2Var, we1.r0(z33Var.d, z33Var2.d), 32)));
            }
            sf0 sf0Var3 = (sf0) xk1Var.getValue();
            boolean zF3 = go0Var.f(y33Var3);
            Object objL5 = go0Var.L();
            if (zF3 || objL5 == ebVar) {
                objL5 = op0.u(ph0Var);
                go0Var.f0(objL5);
            }
            xk1 xk1Var2 = (xk1) objL5;
            if (y33Var3.c() == nx1Var2.getValue() && y33Var3.c() == if0Var) {
                if (y33Var3.g()) {
                    xk1Var2.setValue(ph0Var);
                } else {
                    xk1Var2.setValue(ph0.b);
                }
            } else if (nx1Var2.getValue() != if0Var) {
                xk1Var2.setValue(((ph0) xk1Var2.getValue()).a(ph0Var));
            }
            ph0 ph0Var3 = (ph0) xk1Var2.getValue();
            xk1 xk1VarX = op0.x(mn0Var, go0Var);
            Object objG = mn0Var.g(y33Var3.c(), nx1Var2.getValue());
            boolean zF4 = go0Var.f(y33Var3) | go0Var.f(xk1VarX);
            Object objL6 = go0Var.L();
            t00 t00Var = null;
            if (zF4 || objL6 == ebVar) {
                objL6 = new b2(y33Var3, xk1VarX, (t00) null);
                go0Var.f0(objL6);
            }
            mn0 mn0Var2 = (mn0) objL6;
            Object objL7 = go0Var.L();
            if (objL7 == ebVar) {
                objL7 = op0.u(objG);
                go0Var.f0(objL7);
            }
            xk1 xk1Var3 = (xk1) objL7;
            boolean zH = go0Var.h(mn0Var2);
            Object objL8 = go0Var.L();
            if (zH || objL8 == ebVar) {
                objL8 = new ms2(mn0Var2, xk1Var3, t00Var, 0);
                go0Var.f0(objL8);
            }
            eu.f(go0Var, (mn0) objL8, a83.a);
            Object objC2 = y33Var3.c();
            if0 if0Var2 = if0.j;
            if (objC2 == if0Var2 && nx1Var2.getValue() == if0Var2 && ((Boolean) xk1Var3.getValue()).booleanValue()) {
                go0Var.W(-229368781);
                z2 = false;
                go0Var.p(false);
            } else {
                go0Var.W(-230699766);
                boolean z5 = i7 == 4;
                Object objL9 = go0Var.L();
                if (z5 || objL9 == ebVar) {
                    objL9 = new dd();
                    go0Var.f0(objL9);
                }
                dd ddVar = (dd) objL9;
                Object objL10 = go0Var.L();
                if (objL10 == ebVar) {
                    objL10 = jy.q;
                    go0Var.f0(objL10);
                }
                xm0 xm0Var = (xm0) objL10;
                go0Var.W(-167964673);
                go0Var.p(false);
                go0Var.W(-167961890);
                go0Var.p(false);
                z33 z33Var3 = sf0Var3.a;
                z33 z33Var4 = ph0Var3.a;
                go0Var.W(-911382324);
                go0Var.p(false);
                go0Var.W(-911179709);
                go0Var.p(false);
                go0Var.W(-910935677);
                go0Var.p(false);
                boolean z6 = !false;
                float[] fArr = uu.a;
                go0Var.W(-910130296);
                go0Var.p(false);
                n43 n43Var2 = rg3.n;
                boolean z7 = (z33Var3.a == null && z33Var4.a == null) ? false : true;
                boolean z8 = (z33Var3.b == null && z33Var4.b == null) ? false : true;
                if (z7) {
                    go0Var.W(-703879421);
                    Object objL11 = go0Var.L();
                    if (objL11 == ebVar) {
                        objL11 = "Built-in alpha";
                        go0Var.f0("Built-in alpha");
                    }
                    u33VarA = sb3.a(y33Var3, n43Var2, (String) objL11, go0Var);
                    go0Var.p(false);
                } else {
                    go0Var.W(-703709976);
                    go0Var.p(false);
                    u33VarA = null;
                }
                if (z8) {
                    go0Var.W(-703642333);
                    Object objL12 = go0Var.L();
                    if (objL12 == ebVar) {
                        objL12 = "Built-in scale";
                        go0Var.f0("Built-in scale");
                    }
                    u33VarA2 = sb3.a(y33Var3, n43Var2, (String) objL12, go0Var);
                    z = false;
                    go0Var.p(false);
                } else {
                    z = false;
                    go0Var.W(-703472888);
                    go0Var.p(false);
                    u33VarA2 = null;
                }
                if (z8) {
                    go0Var.W(-703395232);
                    u33VarA3 = sb3.a(y33Var3, nf0.a, "TransformOriginInterruptionHandling", go0Var);
                    go0Var.p(z);
                } else {
                    go0Var.W(-703222904);
                    go0Var.p(z);
                    u33VarA3 = null;
                }
                boolean zH2 = go0Var.h(u33VarA) | go0Var.f(sf0Var3) | go0Var.f(ph0Var3) | go0Var.h(u33VarA2) | go0Var.f(y33Var3) | go0Var.h(u33VarA3);
                Object objL13 = go0Var.L();
                if (zH2 || objL13 == ebVar) {
                    sf0Var2 = sf0Var3;
                    ph0Var2 = ph0Var3;
                    y33Var2 = y33Var3;
                    objL13 = new kf0(u33VarA, u33VarA2, y33Var2, sf0Var2, ph0Var2, u33VarA3);
                    go0Var.f0(objL13);
                } else {
                    sf0Var2 = sf0Var3;
                    ph0Var2 = ph0Var3;
                    y33Var2 = y33Var3;
                }
                kf0 kf0Var = (kf0) objL13;
                boolean zG = go0Var.g(z6) | go0Var.f(xm0Var);
                Object objL14 = go0Var.L();
                if (zG || objL14 == ebVar) {
                    objL14 = new mf0(z6, xm0Var);
                    go0Var.f0(objL14);
                }
                rh1 rh1Var = rh1.a;
                uh1 uh1VarC = te.L(rh1Var, (in0) objL14).c(new jf0(y33Var2, null, null, sf0Var2, ph0Var2, xm0Var, kf0Var)).c(rh1Var);
                go0Var.W(-7404393);
                go0Var.p(false);
                uh1 uh1VarC2 = uh1Var.c(uh1VarC.c(rh1Var));
                Object objL15 = go0Var.L();
                if (objL15 == ebVar) {
                    objL15 = new vc(ddVar);
                    go0Var.f0(objL15);
                }
                vc vcVar = (vc) objL15;
                int iHashCode = Long.hashCode(go0Var.T);
                yy1 yy1VarL = go0Var.l();
                uh1 uh1VarM = tl.M(go0Var, uh1VarC2);
                hx.c.getClass();
                jy jyVar = gx.b;
                go0Var.Z();
                if (go0Var.S) {
                    go0Var.k(jyVar);
                } else {
                    go0Var.i0();
                }
                yf3.c(go0Var, gx.e, vcVar);
                yf3.c(go0Var, gx.d, yy1VarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                lc lcVar = gx.f;
                if (go0Var.S) {
                    go0Var.b(lcVar, numValueOf);
                }
                yf3.b(go0Var, gx.g);
                yf3.c(go0Var, gx.c, uh1VarM);
                kwVar.e(ddVar, go0Var, Integer.valueOf((i4 >> 18) & 112));
                go0Var.p(true);
                z2 = false;
                go0Var.p(false);
            }
            go0Var.p(z2);
        } else {
            go0Var.W(-229362829);
            go0Var.p(false);
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new yc(y33Var, in0Var, uh1Var, sf0Var, ph0Var, mn0Var, kwVar, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void D(yk1 yk1Var, uh1 uh1Var, sf0 sf0Var, ph0 ph0Var, String str, kw kwVar, px pxVar, int i2) {
        uh1 uh1Var2;
        String str2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(657024243);
        int i3 = i2 | (go0Var.f(yk1Var) ? 4 : 2) | 48 | (go0Var.f(ph0Var) ? 2048 : 1024) | 24576;
        boolean z = true;
        if (go0Var.O(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = (i3 & 14) | 48;
            if ((((i4 & 14) ^ 6) <= 4 || !go0Var.f(yk1Var)) && (i4 & 6) != 4) {
                z = false;
            }
            Object objL = go0Var.L();
            Object obj = nx.a;
            if (z || objL == obj) {
                vr2 vr2VarB = tl.B();
                in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
                vr2 vr2VarK = tl.K(vr2VarB);
                try {
                    Object y33Var = new y33(yk1Var, null, "AnimatedVisibility");
                    tl.U(vr2VarB, vr2VarK, in0VarE);
                    go0Var.f0(y33Var);
                    objL = y33Var;
                } catch (Throwable th) {
                    tl.U(vr2VarB, vr2VarK, in0VarE);
                    throw th;
                }
            }
            y33 y33Var2 = (y33) objL;
            go0Var.W(-1356604288);
            y33Var2.a(yk1Var.c.getValue(), go0Var, 0);
            go0Var.p(false);
            boolean zF = go0Var.f(y33Var2);
            Object objL2 = go0Var.L();
            if (zF || objL2 == obj) {
                objL2 = new xq2(8, y33Var2);
                go0Var.f0(objL2);
            }
            eu.c(y33Var2, (in0) objL2, go0Var);
            Object objL3 = go0Var.L();
            if (objL3 == obj) {
                objL3 = v6.w;
                go0Var.f0(objL3);
            }
            E(y33Var2, (in0) objL3, sf0Var, ph0Var, kwVar, go0Var, ((i3 << 3) & 57344) | 200112);
            uh1Var2 = rh1.a;
            str2 = "AnimatedVisibility";
        } else {
            go0Var.R();
            uh1Var2 = uh1Var;
            str2 = str;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ad(yk1Var, uh1Var2, sf0Var, ph0Var, str2, kwVar, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void E(y33 y33Var, in0 in0Var, sf0 sf0Var, ph0 ph0Var, kw kwVar, px pxVar, int i2) {
        int i3;
        kw kwVar2;
        ph0 ph0Var2;
        sf0 sf0Var2;
        in0 in0Var2;
        y33 y33Var2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1706321816);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(y33Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(in0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.f(rh1.a) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go0Var.f(sf0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= go0Var.f(ph0Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= go0Var.h(kwVar) ? 131072 : 65536;
        }
        if (go0Var.O(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (z || objL == ebVar) {
                objL = new bd(in0Var, y33Var);
                go0Var.f0(objL);
            }
            uh1 uh1VarA = fg1.A((nn0) objL);
            Object objL2 = go0Var.L();
            if (objL2 == ebVar) {
                objL2 = lc.q;
                go0Var.f0(objL2);
            }
            C(y33Var, in0Var, uh1VarA, sf0Var, ph0Var, (mn0) objL2, kwVar, go0Var, i5 | 196608 | i4 | (i3 & 7168) | (57344 & i3) | ((i3 << 6) & 29360128));
            y33Var2 = y33Var;
            in0Var2 = in0Var;
            sf0Var2 = sf0Var;
            ph0Var2 = ph0Var;
            kwVar2 = kwVar;
        } else {
            kwVar2 = kwVar;
            ph0Var2 = ph0Var;
            sf0Var2 = sf0Var;
            in0Var2 = in0Var;
            y33Var2 = y33Var;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new cd(y33Var2, in0Var2, sf0Var2, ph0Var2, kwVar2, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final f6 F(d9 d9Var) {
        Canvas canvas = g6.a;
        f6 f6Var = new f6();
        f6Var.a = new Canvas(p40.i(d9Var));
        return f6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void G(ws1 ws1Var, r5 r5Var, kw kwVar, px pxVar, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go0Var.f(ws1Var) : go0Var.h(ws1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.f(r5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.h(kwVar) ? 256 : 128;
        }
        boolean z = false;
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && go0Var.f(ws1Var))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objL = go0Var.L();
            if (z3 || objL == nx.a) {
                objL = new sr0(r5Var, ws1Var);
                go0Var.f0(objL);
            }
            pa.a((sr0) objL, null, new h22(false, true, true, km2.h, false), kwVar, go0Var, ((i3 << 3) & 7168) | 384, 2);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new va(ws1Var, r5Var, kwVar, i2, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void H(int i2, px pxVar) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(1618303769);
        if (go0Var.O(i2 & 1, i2 != 0)) {
            View view = (View) go0Var.j(r7.f);
            boolean zH = go0Var.h(view);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (zH || objL == ebVar) {
                objL = new v(19, view);
                go0Var.f0(objL);
            }
            eu.c(view, (in0) objL, go0Var);
            Object objL2 = go0Var.L();
            if (objL2 == ebVar) {
                objL2 = wp1.o;
                go0Var.f0(objL2);
            }
            pp0.b((in0) ((yn0) objL2), te.g, null, go0Var, 54, 4);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new eg1(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void I(uh1 uh1Var, e42 e42Var, kw kwVar, px pxVar, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-714464401);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(uh1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.f(e42Var) ? 32 : 16;
        }
        int i4 = i2 & 384;
        kw kwVar2 = a;
        if (i4 == 0) {
            i3 |= go0Var.h(kwVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go0Var.h(kwVar) ? 2048 : 1024;
        }
        if (go0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            Object objL = go0Var.L();
            if (objL == nx.a) {
                nx1 nx1Var = new nx1(null, gd3.C);
                go0Var.f0(nx1Var);
                objL = nx1Var;
            }
            gk gkVarU = U(kwVar2, go0Var, (i3 >> 6) & 14);
            ci0.a(e42Var.a(gkVarU), xe1.i0(274270255, new v1(uh1Var, (xk1) objL, kwVar, gkVarU, 3), go0Var), go0Var, 56);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new va(uh1Var, e42Var, kwVar, i2, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void J(uh1 uh1Var, kw kwVar, px pxVar, int i2) {
        int i3;
        uh1 uh1Var2;
        kw kwVar2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(790527681);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(uh1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(kwVar) ? 32 : 16;
        }
        int i5 = 0;
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                nx1 nx1Var = new nx1(null, gd3.C);
                go0Var.f0(nx1Var);
                objL = nx1Var;
            }
            xk1 xk1Var = (xk1) objL;
            Object objL2 = go0Var.L();
            if (objL2 == ebVar) {
                objL2 = new a02(xk1Var, i5);
                go0Var.f0(objL2);
            }
            xm0 xm0Var = (xm0) objL2;
            h22 h22Var = k60.a;
            gk gkVarU = U(b, go0Var, 6);
            uh1Var2 = uh1Var;
            kwVar2 = kwVar;
            ci0.b(new f42[]{az2.b.a(eu.T(xm0Var, go0Var, 2)), az2.a.a(gkVarU)}, xe1.i0(1070596993, new ze(uh1Var2, xk1Var, kwVar2, gkVarU, xm0Var), go0Var), go0Var, 56);
        } else {
            uh1Var2 = uh1Var;
            kwVar2 = kwVar;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ob(uh1Var2, kwVar2, i2, i4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void K(uh1 uh1Var, kw kwVar, px pxVar, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(155925518);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(uh1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(kwVar) ? 32 : 16;
        }
        int i4 = 3;
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            boolean z = go0Var.j(az2.a) != null;
            boolean z2 = go0Var.j(az2.b) != null;
            if (z && z2) {
                go0Var.W(-1977187922);
                nf1 nf1VarD = dm.d(sn.j, true);
                int iHashCode = Long.hashCode(go0Var.T);
                yy1 yy1VarL = go0Var.l();
                uh1 uh1VarM = tl.M(go0Var, uh1Var);
                hx.c.getClass();
                jy jyVar = gx.b;
                go0Var.Z();
                if (go0Var.S) {
                    go0Var.k(jyVar);
                } else {
                    go0Var.i0();
                }
                yf3.c(go0Var, gx.e, nf1VarD);
                yf3.c(go0Var, gx.d, yy1VarL);
                yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                yf3.b(go0Var, gx.g);
                yf3.c(go0Var, gx.c, uh1VarM);
                kwVar.g(go0Var, Integer.valueOf((i3 >> 3) & 14));
                go0Var.p(true);
                go0Var.p(false);
            } else if (z) {
                go0Var.W(-1976997706);
                eu.o(uh1Var, kwVar, go0Var, i3 & 126);
                go0Var.p(false);
            } else if (z2) {
                go0Var.W(-1976846922);
                k60.d(uh1Var, kwVar, go0Var, i3 & 126);
                go0Var.p(false);
            } else {
                go0Var.W(-1976716505);
                J(uh1Var, kwVar, go0Var, i3 & 126);
                go0Var.p(false);
            }
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ob(uh1Var, kwVar, i2, i4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void L(final ws1 ws1Var, final boolean z, final c92 c92Var, final boolean z2, long j2, final float f2, final uh1 uh1Var, px pxVar, final int i2) {
        int i3;
        final long j3;
        int i4;
        long j4;
        final boolean z3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-466280168);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go0Var.f(ws1Var) : go0Var.h(ws1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.d(c92Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go0Var.g(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            i3 |= go0Var.f(uh1Var) ? 1048576 : 524288;
        }
        if (go0Var.O(i3 & 1, (533651 & i3) != 533650)) {
            go0Var.T();
            if ((i2 & 1) == 0 || go0Var.y()) {
                i4 = i3 & (-57345);
                j4 = 9205357640488583168L;
            } else {
                go0Var.R();
                i4 = i3 & (-57345);
                j4 = j2;
            }
            go0Var.q();
            c92 c92Var2 = c92.i;
            c92 c92Var3 = c92.h;
            if (z) {
                yn2 yn2Var = gn2.a;
                z3 = (c92Var == c92Var3 && !z2) || (c92Var == c92Var2 && z2);
            } else {
                yn2 yn2Var2 = gn2.a;
                z3 = !((c92Var == c92Var3 && !z2) || (c92Var == c92Var2 && z2));
            }
            ok okVar = z3 ? tl.b : tl.a;
            int i5 = i4 & 14;
            boolean zG = ((i4 & 112) == 32) | (i5 == 4 || ((i4 & 8) != 0 && go0Var.h(ws1Var))) | go0Var.g(z3);
            Object objL = go0Var.L();
            if (zG || objL == nx.a) {
                objL = new in0() { // from class: xa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.in0
                    public final Object j(Object obj) {
                        zn2 zn2Var = (zn2) obj;
                        long jA = ws1Var.a();
                        zn2Var.a(gn2.a, new fn2(z ? rr0.i : rr0.j, jA, z3 ? en2.h : en2.j, (9223372034707292159L & jA) != 9205357640488583168L));
                        return a83.a;
                    }
                };
                go0Var.f0(objL);
            }
            final uh1 uh1VarA = nn2.a(uh1Var, false, (in0) objL);
            final za3 za3Var = (za3) go0Var.j(ly.t);
            long j5 = j4;
            ok okVar2 = okVar;
            j3 = j5;
            G(ws1Var, okVar2, xe1.i0(1365123137, new mn0() { // from class: ya
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    px pxVar2 = (px) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    go0 go0Var2 = (go0) pxVar2;
                    if (go0Var2.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        f42 f42VarA = ly.t.a(za3Var);
                        final long j6 = j3;
                        final boolean z4 = z3;
                        final uh1 uh1Var2 = uh1VarA;
                        final ws1 ws1Var2 = ws1Var;
                        ci0.a(f42VarA, xe1.i0(1260045569, new mn0() { // from class: ab
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.mn0
                            public final Object g(Object obj3, Object obj4) {
                                px pxVar3 = (px) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final int i6 = 1;
                                final int i7 = 0;
                                go0 go0Var3 = (go0) pxVar3;
                                if (go0Var3.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j7 = j6;
                                    boolean z5 = z4;
                                    uh1 uh1Var3 = uh1Var2;
                                    final ws1 ws1Var3 = ws1Var2;
                                    eb ebVar = nx.a;
                                    if (j7 != 9205357640488583168L) {
                                        go0Var3.W(3458246);
                                        uf ufVar = z5 ? sp0.b : sp0.a;
                                        uh1 uh1VarB0 = te.b0(uh1Var3, Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), 0.0f, 0.0f, 12);
                                        ob2 ob2VarA = nb2.a(ufVar, sn.s, go0Var3, 0);
                                        int iHashCode = Long.hashCode(go0Var3.T);
                                        yy1 yy1VarL = go0Var3.l();
                                        uh1 uh1VarM = tl.M(go0Var3, uh1VarB0);
                                        hx.c.getClass();
                                        jy jyVar = gx.b;
                                        go0Var3.Z();
                                        if (go0Var3.S) {
                                            go0Var3.k(jyVar);
                                        } else {
                                            go0Var3.i0();
                                        }
                                        yf3.c(go0Var3, gx.e, ob2VarA);
                                        yf3.c(go0Var3, gx.d, yy1VarL);
                                        yf3.c(go0Var3, gx.f, Integer.valueOf(iHashCode));
                                        yf3.b(go0Var3, gx.g);
                                        yf3.c(go0Var3, gx.c, uh1VarM);
                                        boolean zH = go0Var3.h(ws1Var3);
                                        Object objL2 = go0Var3.L();
                                        if (zH || objL2 == ebVar) {
                                            objL2 = new xm0() { // from class: bb
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // defpackage.xm0
                                                public final Object a() {
                                                    int i8 = i7;
                                                    ws1 ws1Var4 = ws1Var3;
                                                    switch (i8) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & ws1Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & ws1Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            go0Var3.f0(objL2);
                                        }
                                        rp0.M(rh1.a, (xm0) objL2, z5, go0Var3, 6);
                                        go0Var3.p(true);
                                        go0Var3.p(false);
                                    } else {
                                        go0Var3.W(4389176);
                                        boolean zH2 = go0Var3.h(ws1Var3);
                                        Object objL3 = go0Var3.L();
                                        if (zH2 || objL3 == ebVar) {
                                            objL3 = new xm0() { // from class: bb
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // defpackage.xm0
                                                public final Object a() {
                                                    int i8 = i6;
                                                    ws1 ws1Var4 = ws1Var3;
                                                    switch (i8) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & ws1Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & ws1Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            go0Var3.f0(objL3);
                                        }
                                        rp0.M(uh1Var3, (xm0) objL3, z5, go0Var3, 0);
                                        go0Var3.p(false);
                                    }
                                } else {
                                    go0Var3.R();
                                }
                                return a83.a;
                            }
                        }, go0Var2), go0Var2, 56);
                    } else {
                        go0Var2.R();
                    }
                    return a83.a;
                }
            }, go0Var), go0Var, i5 | 384);
        } else {
            go0Var.R();
            j3 = j2;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            final long j6 = j3;
            b62VarR.d = new mn0() { // from class: za
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rp0.L(ws1Var, z, c92Var, z2, j6, f2, uh1Var, (px) obj, pp0.N(i2 | 1));
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void M(uh1 uh1Var, xm0 xm0Var, boolean z, px pxVar, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(uh1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (go0Var.h(xm0Var) ? 32 : 16) | (go0Var.g(z) ? 256 : 128);
        int i5 = 0;
        if (go0Var.O(i4 & 1, (i4 & 147) != 146)) {
            yn2 yn2Var = gn2.a;
            O(go0Var, tl.s(te.h0(uh1Var, 25.0f, 25.0f), new cb(i5, xm0Var, z)));
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new r0(uh1Var, xm0Var, z, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final qn2 N(r61 r61Var, boolean z) {
        th1 th1Var = (th1) r61Var.M.g;
        Object obj = null;
        if ((th1Var.k & 8) != 0) {
            loop0: while (true) {
                if (th1Var == null) {
                    break;
                }
                if ((th1Var.j & 8) != 0) {
                    th1 th1VarM = th1Var;
                    zk1 zk1Var = null;
                    while (th1VarM != null) {
                        if (th1VarM instanceof on2) {
                            obj = th1VarM;
                            break loop0;
                        }
                        if ((th1VarM.j & 8) != 0 && (th1VarM instanceof u60)) {
                            int i2 = 0;
                            for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                if ((th1Var2.j & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
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
                            if (i2 == 1) {
                            }
                        }
                        th1VarM = sp0.m(zk1Var);
                    }
                    if ((th1Var.k & 8) != 0) {
                        break;
                    }
                    th1Var = th1Var.m;
                } else if ((th1Var.k & 8) != 0) {
                }
            }
        }
        obj.getClass();
        th1 th1Var3 = ((th1) ((on2) obj)).h;
        ln2 ln2VarW = r61Var.w();
        if (ln2VarW == null) {
            ln2VarW = new ln2();
        }
        return new qn2(th1Var3, z, r61Var, ln2VarW);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void O(px pxVar, uh1 uh1Var) {
        k8 k8Var = k8.h;
        go0 go0Var = (go0) pxVar;
        int iHashCode = Long.hashCode(go0Var.T);
        uh1 uh1VarM = tl.M(pxVar, uh1Var);
        yy1 yy1VarL = go0Var.l();
        hx.c.getClass();
        jy jyVar = gx.b;
        go0 go0Var2 = (go0) pxVar;
        go0Var2.Z();
        if (go0Var2.S) {
            go0Var2.k(jyVar);
        } else {
            go0Var2.i0();
        }
        yf3.c(pxVar, gx.e, k8Var);
        yf3.c(pxVar, gx.d, yy1VarL);
        yf3.b(pxVar, gx.g);
        yf3.c(pxVar, gx.c, uh1VarM);
        yf3.c(pxVar, gx.f, Integer.valueOf(iHashCode));
        go0Var2.p(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void P(hw2 hw2Var, uh1 uh1Var, mn0 mn0Var, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-511989831);
        int i3 = (go0Var.h(hw2Var) ? 4 : 2) | i2 | (go0Var.f(uh1Var) ? 32 : 16) | (go0Var.h(mn0Var) ? 256 : 128);
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            int iHashCode = Long.hashCode(go0Var.T);
            eo0 eo0VarL = rg3.L(go0Var);
            uh1 uh1VarM = tl.M(go0Var, uh1Var);
            yy1 yy1VarL = go0Var.l();
            jy jyVar = jy.s;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, hw2Var.c, hw2Var);
            yf3.c(go0Var, hw2Var.d, eo0VarL);
            yf3.c(go0Var, hw2Var.e, mn0Var);
            hx.c.getClass();
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            go0Var.p(true);
            if (go0Var.A()) {
                go0Var.W(-1259187287);
                go0Var.p(false);
            } else {
                go0Var.W(-1259245908);
                boolean zH = go0Var.h(hw2Var);
                Object objL = go0Var.L();
                if (zH || objL == nx.a) {
                    objL = new ea(20, hw2Var);
                    go0Var.f0(objL);
                }
                eu.r((xm0) objL, go0Var);
                go0Var.p(false);
            }
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ky(hw2Var, uh1Var, mn0Var, i2, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void Q(String str) {
        if (pv2.s0(str) || str.length() > 512) {
            c80.p("INVALID_ARGUMENT", "Class name must not be blank and must contain at most 512 characters.", 0, null, null, 28);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void R(String str, String str2) {
        if (pv2.s0(str) || str.length() > 256) {
            c80.p("INVALID_ARGUMENT", str2.concat(" must not be blank and must contain at most 256 characters."), 0, null, null, 28);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean S(float f2) {
        return Float.isNaN(f2) || Math.abs(f2) < 0.5f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void T(fb3 fb3Var, qc2 qc2Var, ba1 ba1Var) {
        AutoCloseable autoCloseable;
        qc2Var.getClass();
        ba1Var.getClass();
        gb3 gb3Var = fb3Var.a;
        if (gb3Var != null) {
            synchronized (gb3Var.a) {
                autoCloseable = (AutoCloseable) gb3Var.b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        kc2 kc2Var = (kc2) autoCloseable;
        if (kc2Var == null || kc2Var.j) {
            return;
        }
        kc2Var.h(ba1Var, qc2Var);
        aa1 aa1Var = ((la1) ba1Var).h;
        if (aa1Var == aa1.i || aa1Var.compareTo(aa1.k) >= 0) {
            qc2Var.d();
        } else {
            ba1Var.a(new y50(ba1Var, qc2Var));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final gk U(kw kwVar, px pxVar, int i2) {
        boolean z = (((i2 & 14) ^ 6) > 4 && ((go0) pxVar).f(kwVar)) || (i2 & 6) == 4;
        go0 go0Var = (go0) pxVar;
        Object objL = go0Var.L();
        eb ebVar = nx.a;
        if (z || objL == ebVar) {
            objL = new gk(kwVar);
            go0Var.f0(objL);
        }
        gk gkVar = (gk) objL;
        boolean zF = go0Var.f(gkVar);
        Object objL2 = go0Var.L();
        if (zF || objL2 == ebVar) {
            objL2 = new v(5, gkVar);
            go0Var.f0(objL2);
        }
        eu.c(gkVar, (in0) objL2, go0Var);
        return gkVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean V(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = be0.h;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    qn2 qn2Var = (qn2) obj2;
                    qn2 qn2Var2 = (qn2) obj;
                    arrayList2.add(new rs1((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (qn2Var2.g().b() >> 32)) - Float.intBitsToFloat((int) (qn2Var.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (qn2Var2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (qn2Var.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((rs1) du.o0(list)).a;
            } else {
                if (list.isEmpty()) {
                    sb1.b("Empty collection can't be reduced.");
                }
                Object objO0 = du.o0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objO0 = new rs1(rs1.e(((rs1) objO0).a, ((rs1) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((rs1) objO0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static al W(zk zkVar, Drawable drawable, int i2, int i3) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i2 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i3 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i2 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i3 = current.getIntrinsicHeight();
                    }
                    Lock lock = p33.d;
                    lock.lock();
                    Bitmap bitmapF = zkVar.f(i2, i3, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapF);
                        current.setBounds(0, 0, i2, i3);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapF;
                        z = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            zkVar = c;
        }
        return al.c(zkVar, bitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final d9 X(qo qoVar, float f2) {
        int iCeil = ((int) Math.ceil(f2)) * 2;
        d9 d9VarB = p7.j;
        f6 f6VarF = p7.k;
        sp spVar = p7.l;
        if (d9VarB == null || f6VarF == null) {
            d9VarB = p7.b(iCeil, iCeil, 1);
            p7.j = d9VarB;
            f6VarF = F(d9VarB);
            p7.k = f6VarF;
        } else {
            Bitmap bitmap = d9VarB.a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
            }
        }
        d9 d9Var = d9VarB;
        f6 f6Var = f6VarF;
        if (spVar == null) {
            spVar = new sp();
            p7.l = spVar;
        }
        sp spVar2 = spVar;
        rp rpVar = spVar2.h;
        d61 layoutDirection = qoVar.h.getLayoutDirection();
        Bitmap bitmap2 = d9Var.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        e70 e70Var = rpVar.a;
        d61 d61Var = rpVar.b;
        qp qpVar = rpVar.c;
        long j2 = rpVar.d;
        rpVar.a = qoVar;
        rpVar.b = layoutDirection;
        rpVar.c = f6Var;
        rpVar.d = jFloatToRawIntBits;
        f6Var.l();
        nc0.i0(spVar2, ju.b, 0L, spVar2.d(), 58);
        nc0.i0(spVar2, sp0.c(4278190080L), 0L, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 120);
        nc0.O(spVar2, sp0.c(4278190080L), f2, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), null, 120);
        f6Var.i();
        rpVar.a = e70Var;
        rpVar.b = d61Var;
        rpVar.c = qpVar;
        rpVar.d = j2;
        return d9Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final v23 Z(Context context) {
        up0.u(context, R.color.system_neutral1_0);
        up0.u(context, R.color.system_neutral1_10);
        l0(98.0f, up0.u(context, R.color.system_neutral1_600));
        l0(96.0f, up0.u(context, R.color.system_neutral1_600));
        up0.u(context, R.color.system_neutral1_50);
        l0(94.0f, up0.u(context, R.color.system_neutral1_600));
        l0(92.0f, up0.u(context, R.color.system_neutral1_600));
        up0.u(context, R.color.system_neutral1_100);
        l0(87.0f, up0.u(context, R.color.system_neutral1_600));
        up0.u(context, R.color.system_neutral1_200);
        up0.u(context, R.color.system_neutral1_300);
        up0.u(context, R.color.system_neutral1_400);
        up0.u(context, R.color.system_neutral1_500);
        up0.u(context, R.color.system_neutral1_600);
        up0.u(context, R.color.system_neutral1_700);
        l0(24.0f, up0.u(context, R.color.system_neutral1_600));
        l0(22.0f, up0.u(context, R.color.system_neutral1_600));
        up0.u(context, R.color.system_neutral1_800);
        l0(17.0f, up0.u(context, R.color.system_neutral1_600));
        l0(12.0f, up0.u(context, R.color.system_neutral1_600));
        up0.u(context, R.color.system_neutral1_900);
        l0(6.0f, up0.u(context, R.color.system_neutral1_600));
        l0(4.0f, up0.u(context, R.color.system_neutral1_600));
        up0.u(context, R.color.system_neutral1_1000);
        long jU = up0.u(context, R.color.system_neutral2_0);
        up0.u(context, R.color.system_neutral2_10);
        long jL0 = l0(98.0f, up0.u(context, R.color.system_neutral2_600));
        long jL02 = l0(96.0f, up0.u(context, R.color.system_neutral2_600));
        long jU2 = up0.u(context, R.color.system_neutral2_50);
        long jL03 = l0(94.0f, up0.u(context, R.color.system_neutral2_600));
        long jL04 = l0(92.0f, up0.u(context, R.color.system_neutral2_600));
        long jU3 = up0.u(context, R.color.system_neutral2_100);
        long jL05 = l0(87.0f, up0.u(context, R.color.system_neutral2_600));
        long jU4 = up0.u(context, R.color.system_neutral2_200);
        up0.u(context, R.color.system_neutral2_300);
        long jU5 = up0.u(context, R.color.system_neutral2_400);
        long jU6 = up0.u(context, R.color.system_neutral2_500);
        up0.u(context, R.color.system_neutral2_600);
        long jU7 = up0.u(context, R.color.system_neutral2_700);
        long jL06 = l0(24.0f, up0.u(context, R.color.system_neutral2_600));
        long jL07 = l0(22.0f, up0.u(context, R.color.system_neutral2_600));
        long jU8 = up0.u(context, R.color.system_neutral2_800);
        long jL08 = l0(17.0f, up0.u(context, R.color.system_neutral2_600));
        long jL09 = l0(12.0f, up0.u(context, R.color.system_neutral2_600));
        long jU9 = up0.u(context, R.color.system_neutral2_900);
        long jL010 = l0(6.0f, up0.u(context, R.color.system_neutral2_600));
        long jL011 = l0(4.0f, up0.u(context, R.color.system_neutral2_600));
        long jU10 = up0.u(context, R.color.system_neutral2_1000);
        long jU11 = up0.u(context, R.color.system_accent1_0);
        up0.u(context, R.color.system_accent1_10);
        up0.u(context, R.color.system_accent1_50);
        long jU12 = up0.u(context, R.color.system_accent1_100);
        long jU13 = up0.u(context, R.color.system_accent1_200);
        up0.u(context, R.color.system_accent1_300);
        up0.u(context, R.color.system_accent1_400);
        up0.u(context, R.color.system_accent1_500);
        long jU14 = up0.u(context, R.color.system_accent1_600);
        long jU15 = up0.u(context, R.color.system_accent1_700);
        long jU16 = up0.u(context, R.color.system_accent1_800);
        long jU17 = up0.u(context, R.color.system_accent1_900);
        up0.u(context, R.color.system_accent1_1000);
        long jU18 = up0.u(context, R.color.system_accent2_0);
        up0.u(context, R.color.system_accent2_10);
        up0.u(context, R.color.system_accent2_50);
        long jU19 = up0.u(context, R.color.system_accent2_100);
        long jU20 = up0.u(context, R.color.system_accent2_200);
        up0.u(context, R.color.system_accent2_300);
        up0.u(context, R.color.system_accent2_400);
        up0.u(context, R.color.system_accent2_500);
        long jU21 = up0.u(context, R.color.system_accent2_600);
        long jU22 = up0.u(context, R.color.system_accent2_700);
        long jU23 = up0.u(context, R.color.system_accent2_800);
        long jU24 = up0.u(context, R.color.system_accent2_900);
        up0.u(context, R.color.system_accent2_1000);
        long jU25 = up0.u(context, R.color.system_accent3_0);
        up0.u(context, R.color.system_accent3_10);
        up0.u(context, R.color.system_accent3_50);
        long jU26 = up0.u(context, R.color.system_accent3_100);
        long jU27 = up0.u(context, R.color.system_accent3_200);
        up0.u(context, R.color.system_accent3_300);
        up0.u(context, R.color.system_accent3_400);
        up0.u(context, R.color.system_accent3_500);
        long jU28 = up0.u(context, R.color.system_accent3_600);
        long jU29 = up0.u(context, R.color.system_accent3_700);
        long jU30 = up0.u(context, R.color.system_accent3_800);
        long jU31 = up0.u(context, R.color.system_accent3_900);
        up0.u(context, R.color.system_accent3_1000);
        return new v23(jU, jL0, jL02, jU2, jL03, jL04, jU3, jL05, jU4, jU5, jU6, jU7, jL06, jL07, jU8, jL08, jL09, jU9, jL010, jL011, jU10, jU11, jU12, jU13, jU14, jU15, jU16, jU17, jU18, jU19, jU20, jU21, jU22, jU23, jU24, jU25, jU26, jU27, jU28, jU29, jU30, jU31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final pl0 a0(pl0 pl0Var) {
        pl0 pl0VarF = ((bl0) ((b7) sp0.f0(pl0Var)).getFocusOwner()).f();
        if (pl0VarF == null || !pl0VarF.u) {
            return null;
        }
        return pl0VarF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b0(th2 th2Var) {
        th2Var.getClass();
        ri2 ri2Var = th2Var.k;
        LinkedHashSet linkedHashSetA = ri2Var.a();
        ArrayList arrayList = new ArrayList(eu.B(linkedHashSetA, 10));
        Iterator it = linkedHashSetA.iterator();
        while (it.hasNext()) {
            arrayList.add(((ef2) it.next()).h);
        }
        String strU0 = du.u0(du.z0(arrayList), ",", null, null, null, 62);
        String strU02 = du.u0(ri2Var.b(), ",", null, null, new eq1(2), 30);
        return th2Var.f + "|" + strU0 + "|" + strU02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long c0(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i4, 262142);
        int iMin2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    gz.k(i7);
                    s.b();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return gz.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long d0(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i2, 262142);
        int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    gz.k(i7);
                    s.b();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return gz.a(iMin, iMin2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final o62 e0(pl0 pl0Var) {
        zn1 zn1Var;
        if (pl0Var.u && (zn1Var = pl0Var.o) != null) {
            c61 c61VarJ = s11.J(zn1Var);
            if (!c61VarJ.w()) {
                c61VarJ = null;
            }
            if (c61VarJ != null) {
                return pl0Var.P0(c61VarJ);
            }
        }
        return o62.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final pl0 f0(pl0 pl0Var) {
        boolean z = pl0Var.h.u;
        if (z) {
            if (!z) {
                kz0.b("visitChildren called on an unattached node");
            }
            zk1 zk1Var = new zk1(new th1[16]);
            th1 th1Var = pl0Var.h;
            th1 th1Var2 = th1Var.m;
            if (th1Var2 == null) {
                sp0.k(zk1Var, th1Var);
            } else {
                zk1Var.b(th1Var2);
            }
            loop0: while (true) {
                int i2 = zk1Var.j;
                if (i2 == 0) {
                    break;
                }
                th1 th1VarM = (th1) zk1Var.k(i2 - 1);
                if ((th1VarM.k & 1024) == 0) {
                    sp0.k(zk1Var, th1VarM);
                } else {
                    while (true) {
                        if (th1VarM == null) {
                            break;
                        }
                        if ((th1VarM.j & 1024) != 0) {
                            zk1 zk1Var2 = null;
                            while (th1VarM != null) {
                                if (th1VarM instanceof pl0) {
                                    pl0 pl0Var2 = (pl0) th1VarM;
                                    if (pl0Var2.h.u) {
                                        int iOrdinal = pl0Var2.R0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            break loop0;
                                        }
                                        if (iOrdinal != 3) {
                                            c80.s();
                                            return null;
                                        }
                                    }
                                } else if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                    int i3 = 0;
                                    for (th1 th1Var3 = ((u60) th1VarM).w; th1Var3 != null; th1Var3 = th1Var3.m) {
                                        if ((th1Var3.j & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                th1VarM = th1Var3;
                                            } else {
                                                if (zk1Var2 == null) {
                                                    zk1Var2 = new zk1(new th1[16]);
                                                }
                                                if (th1VarM != null) {
                                                    zk1Var2.b(th1VarM);
                                                    th1VarM = null;
                                                }
                                                zk1Var2.b(th1Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                th1VarM = sp0.m(zk1Var2);
                            }
                        } else {
                            th1VarM = th1VarM.m;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object g0(Object obj, Method method, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = m;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            m = declaredConstructor;
        }
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(ip0.class, -1)).unreflectSpecial(method, ip0.class).bindTo(obj).invokeWithArguments(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean h0(pl0 pl0Var) {
        r61 r61Var;
        zn1 zn1Var;
        r61 r61Var2;
        zn1 zn1Var2 = pl0Var.o;
        return (zn1Var2 == null || (r61Var = zn1Var2.v) == null || !r61Var.I() || (zn1Var = pl0Var.o) == null || (r61Var2 = zn1Var.v) == null || !r61Var2.H()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long i0(float f2, long j2) {
        return (Float.isNaN(f2) || f2 >= 1.0f) ? j2 : ju.b(ju.d(j2) * f2, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object j0(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k0(l4 l4Var, qn2 qn2Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        Object objG = qn2Var.k().h.g(vn2.f);
        if (objG == null) {
            objG = null;
        }
        zt ztVar = (zt) objG;
        if (ztVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(ztVar.a, ztVar.b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = qn2Var.k().h.g(vn2.e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listJ = qn2.j(4, qn2Var);
            int size = listJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                qn2 qn2Var2 = (qn2) listJ.get(i2);
                if (qn2Var2.k().h.c(vn2.J)) {
                    arrayList.add(qn2Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zV = V(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zV ? 1 : arrayList.size(), zV ? arrayList.size() : 1, false, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0204, code lost:
    
        if (r42 > 100.01d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0208, code lost:
    
        if (r44 > 100.01d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020c, code lost:
    
        if (r12 <= 100.01d) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x020f, code lost:
    
        r0 = ((((defpackage.rg3.u(r42) & 255) << 16) | (-16777216)) | ((defpackage.rg3.u(r44) & 255) << 8)) | (defpackage.rg3.u(r12) & 255);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long l0(float f2, long j2) {
        int iE;
        boolean z;
        float f3;
        float f4;
        double d2;
        double[] dArr;
        double d3;
        int i2;
        int i3;
        int i4;
        int iCeil;
        double dFloor;
        double[] dArr2;
        double[] dArr3;
        double d4 = f2;
        if ((d4 < 1.0E-4d) || (d4 > 99.9999d)) {
            return sp0.b(rg3.n(d4));
        }
        fp fpVarS = pp0.s(sp0.j0(j2));
        float f5 = fpVarS.a;
        float f6 = fpVarS.b;
        um0 um0Var = um0.k;
        if (t11.l(um0Var, um0Var)) {
            double d5 = f5;
            double d6 = f6;
            double[] dArr4 = p40.h;
            if (d6 < 1.0E-4d || d4 < 1.0E-4d || d4 > 99.9999d) {
                iE = rg3.n(d4);
            } else {
                double d7 = d5 % 360.0d;
                if (d7 < 0.0d) {
                    d7 += 360.0d;
                }
                double radians = Math.toRadians(d7);
                double dPow = (d4 > 8.0d ? Math.pow((d4 + 16.0d) / 116.0d, 3.0d) : d4 / 903.2962962962963d) * 100.0d;
                double dSqrt = Math.sqrt(dPow) * 11.0d;
                int i5 = 1;
                double dPow2 = 1.0d / Math.pow(1.64d - Math.pow(0.29d, um0Var.a), 0.73d);
                double d8 = 2.0d;
                double dCos = (Math.cos(radians + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * ((double) um0Var.f) * ((double) um0Var.d);
                double dSin = Math.sin(radians);
                double dCos2 = Math.cos(radians);
                int i6 = 0;
                while (true) {
                    d2 = d8;
                    if (i6 >= 5) {
                        dArr = dArr4;
                        d3 = dPow;
                        i2 = i5;
                        i3 = -16777216;
                        i4 = 8;
                        break;
                    }
                    i2 = i5;
                    double d9 = d6;
                    double d10 = dSqrt / 100.0d;
                    i3 = -16777216;
                    double dPow3 = Math.pow(((d9 == 0.0d || dSqrt == 0.0d) ? 0.0d : d9 / Math.sqrt(d10)) * dPow2, 1.1111111111111112d);
                    i4 = 8;
                    dArr = dArr4;
                    d3 = dPow;
                    double dPow4 = (Math.pow(d10, (1.0d / ((double) um0Var.e)) / ((double) um0Var.j)) * ((double) um0Var.b)) / ((double) um0Var.c);
                    double d11 = (((0.305d + dPow4) * 23.0d) * dPow3) / (((dPow3 * 108.0d) * dSin) + (((11.0d * dPow3) * dCos2) + (23.0d * dCos)));
                    double d12 = d11 * dCos2;
                    double d13 = d11 * dSin;
                    double d14 = dPow4 * 460.0d;
                    double d15 = ((288.0d * d13) + ((451.0d * d12) + d14)) / 1403.0d;
                    double d16 = ((d14 - (891.0d * d12)) - (261.0d * d13)) / 1403.0d;
                    double d17 = ((d14 - (d12 * 220.0d)) - (d13 * 6300.0d)) / 1403.0d;
                    double dH = p40.H(d15);
                    double dH2 = p40.H(d16);
                    double dH3 = p40.H(d17);
                    double[][] dArr5 = p40.g;
                    double[] dArr6 = dArr5[0];
                    double d18 = (dArr6[2] * dH3) + (dArr6[i2] * dH2) + (dArr6[0] * dH);
                    double[] dArr7 = dArr5[i2];
                    double d19 = (dArr7[2] * dH3) + (dArr7[i2] * dH2) + (dArr7[0] * dH);
                    double[] dArr8 = dArr5[2];
                    double d20 = (dH3 * dArr8[2]) + (dH2 * dArr8[i2]) + (dH * dArr8[0]);
                    if (d18 < 0.0d || d19 < 0.0d || d20 < 0.0d) {
                        break;
                    }
                    double d21 = (dArr[2] * d20) + (dArr[i2] * d19) + (dArr[0] * d18);
                    if (d21 <= 0.0d) {
                        break;
                    }
                    if (i6 == 4) {
                        break;
                    }
                    double d22 = d21 - d3;
                    if (Math.abs(d22) < 0.002d) {
                        break;
                    }
                    dSqrt -= (d22 * dSqrt) / (d21 * d2);
                    i6++;
                    i5 = i2;
                    d8 = d2;
                    d6 = d9;
                    dArr4 = dArr;
                    dPow = d3;
                }
                iE = 0;
                if (iE == 0) {
                    double[] dArr9 = new double[3];
                    dArr9[0] = -1.0d;
                    dArr9[i2] = -1.0d;
                    dArr9[2] = -1.0d;
                    int i7 = i2;
                    boolean z2 = false;
                    int i8 = 0;
                    double[] dArr10 = dArr9;
                    double d23 = 0.0d;
                    double d24 = 0.0d;
                    while (i8 < 12) {
                        double d25 = dArr[0];
                        double d26 = dArr[i2];
                        double d27 = dArr[2];
                        double d28 = i8 % 4 <= i2 ? 0.0d : 100.0d;
                        double d29 = i8 % 2 == 0 ? 0.0d : 100.0d;
                        if (i8 < 4) {
                            double d30 = ((d3 - (d26 * d28)) - (d27 * d29)) / d25;
                            dArr2 = p40.I(d30) ? new double[]{d30, d28, d29} : new double[]{-1.0d, -1.0d, -1.0d};
                        } else if (i8 < i4) {
                            double d31 = ((d3 - (d25 * d29)) - (d27 * d28)) / d26;
                            if (p40.I(d31)) {
                                dArr3 = new double[]{d29, d31, d28};
                                dArr2 = dArr3;
                            } else {
                                dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                            }
                        } else {
                            double d32 = ((d3 - (d25 * d28)) - (d26 * d29)) / d27;
                            if (p40.I(d32)) {
                                dArr3 = new double[]{d28, d29, d32};
                                dArr2 = dArr3;
                            } else {
                                dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                            }
                        }
                        if (dArr2[0] >= 0.0d) {
                            double dE = p40.E(dArr2);
                            if (!z2) {
                                dArr9 = dArr2;
                                dArr10 = dArr9;
                                d23 = dE;
                                d24 = d23;
                                z2 = true;
                            } else if (i7 != 0 || p40.h(d23, dE, d24)) {
                                if (p40.h(d23, radians, dE)) {
                                    i7 = 0;
                                    dArr10 = dArr2;
                                    d24 = dE;
                                } else {
                                    i7 = 0;
                                    dArr9 = dArr2;
                                    d23 = dE;
                                }
                            }
                        }
                        i8++;
                        i2 = 1;
                        i4 = 8;
                    }
                    double[][] dArr11 = {dArr9, dArr10};
                    double[] dArr12 = dArr11[0];
                    double dE2 = p40.E(dArr12);
                    double[] dArr13 = dArr11[1];
                    for (int i9 = 0; i9 < 3; i9++) {
                        double d33 = dArr12[i9];
                        double d34 = dArr13[i9];
                        if (d33 != d34) {
                            if (d33 < d34) {
                                iCeil = (int) Math.floor(p40.a0(d33) - 0.5d);
                                dFloor = Math.ceil(p40.a0(dArr13[i9]) - 0.5d);
                            } else {
                                iCeil = (int) Math.ceil(p40.a0(d33) - 0.5d);
                                dFloor = Math.floor(p40.a0(dArr13[i9]) - 0.5d);
                            }
                            int i10 = (int) dFloor;
                            double d35 = dE2;
                            for (int i11 = 0; i11 < 8 && Math.abs(i10 - iCeil) > 1.0d; i11++) {
                                int iFloor = (int) Math.floor(((double) (iCeil + i10)) / d2);
                                double d36 = p40.i[iFloor];
                                double d37 = dArr12[i9];
                                double d38 = dArr13[i9];
                                if (d38 != d37) {
                                    d38 = (d36 - d37) / (d38 - d37);
                                }
                                double d39 = dArr12[0];
                                double d40 = ((dArr13[0] - d39) * d38) + d39;
                                double d41 = dArr12[1];
                                double d42 = ((dArr13[1] - d41) * d38) + d41;
                                double d43 = dArr12[2];
                                double[] dArr14 = {d40, d42, ((dArr13[2] - d43) * d38) + d43};
                                double dE3 = p40.E(dArr14);
                                if (p40.h(d35, radians, dE3)) {
                                    i10 = iFloor;
                                    dArr13 = dArr14;
                                } else {
                                    iCeil = iFloor;
                                    dArr12 = dArr14;
                                    d35 = dE3;
                                }
                            }
                            dE2 = d35;
                        }
                    }
                    iE = ((rg3.u((dArr12[0] + dArr13[0]) / d2) & 255) << 16) | i3 | ((rg3.u((dArr12[1] + dArr13[1]) / d2) & 255) << 8) | (rg3.u((dArr12[2] + dArr13[2]) / d2) & 255);
                }
            }
        } else if (f6 < 1.0d || Math.round(f2) <= 0.0d || Math.round(f2) >= 100.0d) {
            iE = rg3.E(f2);
        } else {
            float f7 = 0.0f;
            float fMin = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
            float f8 = 0.0f;
            float f9 = f6;
            boolean z3 = true;
            fp fpVar = null;
            while (true) {
                if (Math.abs(f8 - f6) >= 0.4000000059604645d) {
                    float f10 = 1000.0f;
                    float f11 = f7;
                    float f12 = 1000.0f;
                    float f13 = 100.0f;
                    fp fpVar2 = null;
                    while (true) {
                        z = z3;
                        if (Math.abs(f11 - f13) <= 0.009999999776482582d) {
                            f3 = fMin;
                            f4 = 2.0f;
                            break;
                        }
                        float f14 = ((f13 - f11) / 2.0f) + f11;
                        f4 = 2.0f;
                        int iC = pp0.t(f14, f9, fMin).c(um0.k);
                        float fG = rg3.G((iC >> 16) & 255);
                        float fG2 = rg3.G((iC >> 8) & 255);
                        float fG3 = rg3.G(iC & 255);
                        double d44 = fG;
                        double[] dArr15 = rg3.d[1];
                        float f15 = ((float) ((((double) fG3) * dArr15[2]) + ((((double) fG2) * dArr15[1]) + (d44 * dArr15[0])))) / 100.0f;
                        float fCbrt = f15 <= 0.008856452f ? f15 * 903.2963f : (((float) Math.cbrt(f15)) * 116.0f) - 16.0f;
                        float fAbs = (float) Math.abs(f2 - r0);
                        if (fAbs < 0.2f) {
                            fp fpVarS2 = pp0.s(iC);
                            fp fpVarT = pp0.t(fpVarS2.c, fpVarS2.b, fMin);
                            float f16 = fpVarS2.d - fpVarT.d;
                            float f17 = fpVarS2.e - fpVarT.e;
                            float f18 = fpVarS2.f - fpVarT.f;
                            double dSqrt2 = Math.sqrt((f18 * f18) + (f17 * f17) + (f16 * f16));
                            f3 = fMin;
                            float fPow = (float) (Math.pow(dSqrt2, 0.63d) * 1.41d);
                            if (fPow <= 1.0f) {
                                f12 = fPow;
                                fpVar2 = fpVarS2;
                                f10 = fAbs;
                            }
                        } else {
                            f3 = fMin;
                        }
                        if (f10 == f11 && f12 == f11) {
                            break;
                        }
                        if (fCbrt < f2) {
                            fMin = f3;
                            z3 = z;
                            f11 = f14;
                        } else {
                            fMin = f3;
                            z3 = z;
                            f13 = f14;
                        }
                    }
                    fp fpVar3 = fpVar2;
                    if (!z) {
                        if (fpVar3 == null) {
                            f6 = f9;
                        } else {
                            fpVar = fpVar3;
                            f8 = f9;
                        }
                        f9 = ((f6 - f8) / f4) + f8;
                        fMin = f3;
                        f7 = f11;
                        z3 = z;
                    } else {
                        if (fpVar3 != null) {
                            iE = fpVar3.c(um0Var);
                            break;
                        }
                        f9 = ((f6 - f8) / f4) + f8;
                        z3 = false;
                        fMin = f3;
                        f7 = f11;
                    }
                } else {
                    iE = fpVar == null ? rg3.E(f2) : fpVar.c(um0Var);
                }
            }
        }
        return sp0.b(iE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final if0 m0(y33 y33Var, in0 in0Var, Object obj, px pxVar) {
        go0 go0Var = (go0) pxVar;
        go0Var.S(-422486745, 0, y33Var, null);
        boolean zG = y33Var.g();
        if0 if0Var = if0.h;
        if0 if0Var2 = if0.j;
        if0 if0Var3 = if0.i;
        if (zG) {
            go0Var.W(-212166497);
            go0Var.p(false);
            if (((Boolean) in0Var.j(obj)).booleanValue()) {
                if0Var = if0Var3;
            } else if (((Boolean) in0Var.j(y33Var.c())).booleanValue()) {
                if0Var = if0Var2;
            }
        } else {
            go0Var.W(-211892364);
            Object objL = go0Var.L();
            if (objL == nx.a) {
                objL = op0.u(Boolean.FALSE);
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            if (((Boolean) in0Var.j(y33Var.c())).booleanValue()) {
                xk1Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) in0Var.j(obj)).booleanValue()) {
                if0Var = if0Var3;
            } else if (((Boolean) xk1Var.getValue()).booleanValue()) {
                if0Var = if0Var2;
            }
            go0Var.p(false);
        }
        go0Var.p(false);
        return if0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Rect n0(d11 d11Var) {
        return new Rect(d11Var.a, d11Var.b, d11Var.c, d11Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final RectF o0(o62 o62Var) {
        return new RectF(o62Var.a, o62Var.b, o62Var.c, o62Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final o62 p0(RectF rectF) {
        return new o62(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 q0(uh1 uh1Var) {
        return uh1Var.c(new p11());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y40
    public int A(yo2 yo2Var) {
        yo2Var.getClass();
        Y();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y40
    public double B() {
        Y();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void Y() {
        throw new o01(d72.a(getClass()) + " can't retrieve untyped values");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(yo2 yo2Var) {
        yo2Var.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y40
    public vx b(yo2 yo2Var) {
        yo2Var.getClass();
        return this;
    }

    @Override // defpackage.y40
    public abstract long d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vx
    public y40 e(d32 d32Var, int i2) {
        d32Var.getClass();
        return s(d32Var.j(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y40
    public boolean f() {
        Y();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y40
    public boolean g() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y40
    public char h() {
        Y();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vx
    public float i(yo2 yo2Var, int i2) {
        yo2Var.getClass();
        return y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vx
    public double k(d32 d32Var, int i2) {
        d32Var.getClass();
        return B();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vx
    public char l(d32 d32Var, int i2) {
        d32Var.getClass();
        return h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vx
    public byte m(d32 d32Var, int i2) {
        d32Var.getClass();
        return r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vx
    public String n(yo2 yo2Var, int i2) {
        yo2Var.getClass();
        return w();
    }

    @Override // defpackage.y40
    public abstract int o();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vx
    public short p(d32 d32Var, int i2) {
        d32Var.getClass();
        return v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vx
    public boolean q(yo2 yo2Var, int i2) {
        yo2Var.getClass();
        return f();
    }

    @Override // defpackage.y40
    public abstract byte r();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y40
    public y40 s(yo2 yo2Var) {
        yo2Var.getClass();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object t(yo2 yo2Var, int i2, w41 w41Var, Object obj) {
        yo2Var.getClass();
        w41Var.getClass();
        return c(w41Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vx
    public int u(yo2 yo2Var, int i2) {
        yo2Var.getClass();
        return o();
    }

    @Override // defpackage.y40
    public abstract short v();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y40
    public String w() {
        Y();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vx
    public Object x(yo2 yo2Var, int i2, String str) {
        nv2 nv2Var = nv2.a;
        yo2Var.getClass();
        nv2.b.getClass();
        if (g()) {
            return c(nv2Var);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y40
    public float y() {
        Y();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vx
    public long z(yo2 yo2Var, int i2) {
        yo2Var.getClass();
        return d();
    }
}
