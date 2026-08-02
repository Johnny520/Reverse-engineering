package p000;

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
public abstract class rp0 implements y40, InterfaceC0826vx {

    /* JADX INFO: renamed from: a */
    public static final C0402kw f9669a = new C0402kw(636288403, false, new C0595pw(0));

    /* JADX INFO: renamed from: b */
    public static final C0402kw f9670b = new C0402kw(-1357803046, false, new C0595pw(1));

    /* JADX INFO: renamed from: c */
    public static final tc0 f9671c = new tc0(4);

    /* JADX INFO: renamed from: d */
    public static final byte[] f9672d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f9673e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f9674f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g */
    public static final byte[] f9675g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h */
    public static final byte[] f9676h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f9677i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j */
    public static final byte[] f9678j = {48, 48, 50, 0};

    /* JADX INFO: renamed from: k */
    public static final j51 f9679k = new j51(29);

    /* JADX INFO: renamed from: l */
    public static final Object f9680l = new Object();

    /* JADX INFO: renamed from: m */
    public static Constructor f9681m = null;

    /* JADX INFO: renamed from: n */
    public static sx0 f9682n = null;

    /* JADX INFO: renamed from: o */
    public static final int f9683o = 9;

    /* JADX INFO: renamed from: p */
    public static final int f9684p = 10;

    /* JADX INFO: renamed from: q */
    public static final int f9685q = 12;

    /* JADX INFO: renamed from: C */
    public static final void m4517C(y33 y33Var, in0 in0Var, uh1 uh1Var, sf0 sf0Var, ph0 ph0Var, mn0 mn0Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        int i3;
        int i4;
        u33 u33VarM4783a;
        boolean z;
        u33 u33VarM4783a2;
        u33 u33VarM4783a3;
        sf0 sf0Var2;
        ph0 ph0Var2;
        y33 y33Var2;
        boolean z2;
        nx1 nx1Var = y33Var.f13292d;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1912839215);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(y33Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1980f(uh1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.m1980f(sf0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go0Var.m1980f(ph0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go0Var.m1984h(mn0Var) ? 131072 : 65536;
        }
        int i5 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i5 |= go0Var.m1984h(c0402kw) ? 8388608 : 4194304;
        }
        if (!go0Var.m1958O(i5 & 1, (4793491 & i5) != 4793490)) {
            go0Var.m1961R();
        } else if (((Boolean) in0Var.mo5j(nx1Var.getValue())).booleanValue() || ((Boolean) in0Var.mo5j(y33Var.m6213c())).booleanValue() || y33Var.m6217g() || y33Var.m6214d()) {
            go0Var.m1966W(-232386135);
            int i6 = i5 & 14;
            int i7 = i6 | 48;
            int i8 = i7 & 14;
            boolean z3 = ((i8 ^ 6) > 4 && go0Var.m1980f(y33Var)) || (i7 & 6) == 4;
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (z3 || objM1956L == c0160eb) {
                objM1956L = y33Var.m6213c();
                go0Var.m1981f0(objM1956L);
            }
            if (y33Var.m6217g()) {
                objM1956L = y33Var.m6213c();
            }
            go0Var.m1966W(1844425648);
            if0 if0VarM4552m0 = m4552m0(y33Var, in0Var, objM1956L, go0Var);
            go0Var.m1994p(false);
            Object value = nx1Var.getValue();
            go0Var.m1966W(1844425648);
            if0 if0VarM4552m02 = m4552m0(y33Var, in0Var, value, go0Var);
            go0Var.m1994p(false);
            int i9 = i8 | 3072;
            int i10 = (i9 & 14) ^ 6;
            boolean z4 = (i10 > 4 && go0Var.m1980f(y33Var)) || (i9 & 6) == 4;
            Object objM1956L2 = go0Var.m1956L();
            if (z4 || objM1956L2 == c0160eb) {
                i3 = i5;
                i4 = i9;
                objM1956L2 = new y33(new yk1(if0VarM4552m0), y33Var, y33Var.f13291c.concat(" > EnterExitTransition"));
                go0Var.m1981f0(objM1956L2);
            } else {
                i3 = i5;
                i4 = i9;
            }
            y33 y33Var3 = (y33) objM1956L2;
            boolean zM1980f = ((i10 > 4 && go0Var.m1980f(y33Var)) || (i4 & 6) == 4) | go0Var.m1980f(y33Var3);
            Object objM1956L3 = go0Var.m1956L();
            if (zM1980f || objM1956L3 == c0160eb) {
                objM1956L3 = new d62(5, y33Var, y33Var3);
                go0Var.m1981f0(objM1956L3);
            }
            AbstractC0179eu.m1450c(y33Var3, (in0) objM1956L3, go0Var);
            if (y33Var.m6217g()) {
                y33Var3.m6220j(if0VarM4552m0, if0VarM4552m02);
            } else {
                y33Var3.m6221k(if0VarM4552m02);
                y33Var3.f13299k.setValue(Boolean.FALSE);
            }
            n43 n43Var = nf0.f7130a;
            boolean zM1980f2 = go0Var.m1980f(y33Var3);
            Object objM1956L4 = go0Var.m1956L();
            if (zM1980f2 || objM1956L4 == c0160eb) {
                objM1956L4 = op0.m3598u(sf0Var);
                go0Var.m1981f0(objM1956L4);
            }
            xk1 xk1Var = (xk1) objM1956L4;
            Object objM6213c = y33Var3.m6213c();
            nx1 nx1Var2 = y33Var3.f13292d;
            Object value2 = nx1Var2.getValue();
            if0 if0Var = if0.f4588i;
            if (objM6213c == value2 && y33Var3.m6213c() == if0Var) {
                if (y33Var3.m6217g()) {
                    xk1Var.setValue(sf0Var);
                } else {
                    xk1Var.setValue(sf0.f10100b);
                }
            } else if (nx1Var2.getValue() == if0Var) {
                z33 z33Var = ((sf0) xk1Var.getValue()).f10101a;
                z33 z33Var2 = sf0Var.f10101a;
                uh0 uh0Var = z33Var2.f13712a;
                if (uh0Var == null) {
                    uh0Var = z33Var.f13712a;
                }
                uh0 uh0Var2 = uh0Var;
                cd2 cd2Var = z33Var2.f13713b;
                if (cd2Var == null) {
                    cd2Var = z33Var.f13713b;
                }
                xk1Var.setValue(new sf0(new z33(uh0Var2, (t11) null, cd2Var, we1.m5877r0(z33Var.f13715d, z33Var2.f13715d), 32)));
            }
            sf0 sf0Var3 = (sf0) xk1Var.getValue();
            boolean zM1980f3 = go0Var.m1980f(y33Var3);
            Object objM1956L5 = go0Var.m1956L();
            if (zM1980f3 || objM1956L5 == c0160eb) {
                objM1956L5 = op0.m3598u(ph0Var);
                go0Var.m1981f0(objM1956L5);
            }
            xk1 xk1Var2 = (xk1) objM1956L5;
            if (y33Var3.m6213c() == nx1Var2.getValue() && y33Var3.m6213c() == if0Var) {
                if (y33Var3.m6217g()) {
                    xk1Var2.setValue(ph0Var);
                } else {
                    xk1Var2.setValue(ph0.f8348b);
                }
            } else if (nx1Var2.getValue() != if0Var) {
                xk1Var2.setValue(((ph0) xk1Var2.getValue()).m3866a(ph0Var));
            }
            ph0 ph0Var3 = (ph0) xk1Var2.getValue();
            xk1 xk1VarM3601x = op0.m3601x(mn0Var, go0Var);
            Object objMo12g = mn0Var.mo12g(y33Var3.m6213c(), nx1Var2.getValue());
            boolean zM1980f4 = go0Var.m1980f(y33Var3) | go0Var.m1980f(xk1VarM3601x);
            Object objM1956L6 = go0Var.m1956L();
            t00 t00Var = null;
            if (zM1980f4 || objM1956L6 == c0160eb) {
                objM1956L6 = new C0040b2(y33Var3, xk1VarM3601x, (t00) null);
                go0Var.m1981f0(objM1956L6);
            }
            mn0 mn0Var2 = (mn0) objM1956L6;
            Object objM1956L7 = go0Var.m1956L();
            if (objM1956L7 == c0160eb) {
                objM1956L7 = op0.m3598u(objMo12g);
                go0Var.m1981f0(objM1956L7);
            }
            xk1 xk1Var3 = (xk1) objM1956L7;
            boolean zM1984h = go0Var.m1984h(mn0Var2);
            Object objM1956L8 = go0Var.m1956L();
            if (zM1984h || objM1956L8 == c0160eb) {
                objM1956L8 = new ms2(mn0Var2, xk1Var3, t00Var, 0);
                go0Var.m1981f0(objM1956L8);
            }
            AbstractC0179eu.m1456f(go0Var, (mn0) objM1956L8, a83.f116a);
            Object objM6213c2 = y33Var3.m6213c();
            if0 if0Var2 = if0.f4589j;
            if (objM6213c2 == if0Var2 && nx1Var2.getValue() == if0Var2 && ((Boolean) xk1Var3.getValue()).booleanValue()) {
                go0Var.m1966W(-229368781);
                z2 = false;
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(-230699766);
                boolean z5 = i6 == 4;
                Object objM1956L9 = go0Var.m1956L();
                if (z5 || objM1956L9 == c0160eb) {
                    objM1956L9 = new C0126dd();
                    go0Var.m1981f0(objM1956L9);
                }
                C0126dd c0126dd = (C0126dd) objM1956L9;
                Object objM1956L10 = go0Var.m1956L();
                if (objM1956L10 == c0160eb) {
                    objM1956L10 = C0367jy.f5265q;
                    go0Var.m1981f0(objM1956L10);
                }
                xm0 xm0Var = (xm0) objM1956L10;
                go0Var.m1966W(-167964673);
                go0Var.m1994p(false);
                go0Var.m1966W(-167961890);
                go0Var.m1994p(false);
                z33 z33Var3 = sf0Var3.f10101a;
                z33 z33Var4 = ph0Var3.f8350a;
                go0Var.m1966W(-911382324);
                go0Var.m1994p(false);
                go0Var.m1966W(-911179709);
                go0Var.m1994p(false);
                go0Var.m1966W(-910935677);
                go0Var.m1994p(false);
                boolean z6 = !false;
                float[] fArr = C0786uu.f11480a;
                go0Var.m1966W(-910130296);
                go0Var.m1994p(false);
                n43 n43Var2 = rg3.f9572n;
                boolean z7 = (z33Var3.f13712a == null && z33Var4.f13712a == null) ? false : true;
                boolean z8 = (z33Var3.f13713b == null && z33Var4.f13713b == null) ? false : true;
                if (z7) {
                    go0Var.m1966W(-703879421);
                    Object objM1956L11 = go0Var.m1956L();
                    if (objM1956L11 == c0160eb) {
                        objM1956L11 = "Built-in alpha";
                        go0Var.m1981f0("Built-in alpha");
                    }
                    u33VarM4783a = sb3.m4783a(y33Var3, n43Var2, (String) objM1956L11, go0Var);
                    go0Var.m1994p(false);
                } else {
                    go0Var.m1966W(-703709976);
                    go0Var.m1994p(false);
                    u33VarM4783a = null;
                }
                if (z8) {
                    go0Var.m1966W(-703642333);
                    Object objM1956L12 = go0Var.m1956L();
                    if (objM1956L12 == c0160eb) {
                        objM1956L12 = "Built-in scale";
                        go0Var.m1981f0("Built-in scale");
                    }
                    u33VarM4783a2 = sb3.m4783a(y33Var3, n43Var2, (String) objM1956L12, go0Var);
                    z = false;
                    go0Var.m1994p(false);
                } else {
                    z = false;
                    go0Var.m1966W(-703472888);
                    go0Var.m1994p(false);
                    u33VarM4783a2 = null;
                }
                if (z8) {
                    go0Var.m1966W(-703395232);
                    u33VarM4783a3 = sb3.m4783a(y33Var3, nf0.f7130a, "TransformOriginInterruptionHandling", go0Var);
                    go0Var.m1994p(z);
                } else {
                    go0Var.m1966W(-703222904);
                    go0Var.m1994p(z);
                    u33VarM4783a3 = null;
                }
                boolean zM1984h2 = go0Var.m1984h(u33VarM4783a) | go0Var.m1980f(sf0Var3) | go0Var.m1980f(ph0Var3) | go0Var.m1984h(u33VarM4783a2) | go0Var.m1980f(y33Var3) | go0Var.m1984h(u33VarM4783a3);
                Object objM1956L13 = go0Var.m1956L();
                if (zM1984h2 || objM1956L13 == c0160eb) {
                    sf0Var2 = sf0Var3;
                    ph0Var2 = ph0Var3;
                    y33Var2 = y33Var3;
                    objM1956L13 = new kf0(u33VarM4783a, u33VarM4783a2, y33Var2, sf0Var2, ph0Var2, u33VarM4783a3);
                    go0Var.m1981f0(objM1956L13);
                } else {
                    sf0Var2 = sf0Var3;
                    ph0Var2 = ph0Var3;
                    y33Var2 = y33Var3;
                }
                kf0 kf0Var = (kf0) objM1956L13;
                boolean zM1982g = go0Var.m1982g(z6) | go0Var.m1980f(xm0Var);
                Object objM1956L14 = go0Var.m1956L();
                if (zM1982g || objM1956L14 == c0160eb) {
                    objM1956L14 = new mf0(z6, xm0Var);
                    go0Var.m1981f0(objM1956L14);
                }
                rh1 rh1Var = rh1.f9587a;
                uh1 uh1VarMo4491c = AbstractC0731te.m5183L(rh1Var, (in0) objM1956L14).mo4491c(new jf0(y33Var2, null, null, sf0Var2, ph0Var2, xm0Var, kf0Var)).mo4491c(rh1Var);
                go0Var.m1966W(-7404393);
                go0Var.m1994p(false);
                uh1 uh1VarMo4491c2 = uh1Var.mo4491c(uh1VarMo4491c.mo4491c(rh1Var));
                Object objM1956L15 = go0Var.m1956L();
                if (objM1956L15 == c0160eb) {
                    objM1956L15 = new C0805vc(c0126dd);
                    go0Var.m1981f0(objM1956L15);
                }
                C0805vc c0805vc = (C0805vc) objM1956L15;
                int iHashCode = Long.hashCode(go0Var.f3614T);
                yy1 yy1VarM1990l = go0Var.m1990l();
                uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarMo4491c2);
                InterfaceC0293hx.f4166c.getClass();
                C0367jy c0367jy = C0256gx.f3727b;
                go0Var.m1969Z();
                if (go0Var.f3613S) {
                    go0Var.m1989k(c0367jy);
                } else {
                    go0Var.m1987i0();
                }
                yf3.m6268c(go0Var, C0256gx.f3730e, c0805vc);
                yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                Integer numValueOf = Integer.valueOf(iHashCode);
                C0419lc c0419lc = C0256gx.f3731f;
                if (go0Var.f3613S) {
                    go0Var.m1972b(c0419lc, numValueOf);
                }
                yf3.m6267b(go0Var, C0256gx.f3732g);
                yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                c0402kw.mo489e(c0126dd, go0Var, Integer.valueOf((i3 >> 18) & 112));
                go0Var.m1994p(true);
                z2 = false;
                go0Var.m1994p(false);
            }
            go0Var.m1994p(z2);
        } else {
            go0Var.m1966W(-229362829);
            go0Var.m1994p(false);
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0918yc(y33Var, in0Var, uh1Var, sf0Var, ph0Var, mn0Var, c0402kw, i);
        }
    }

    /* JADX INFO: renamed from: D */
    public static final void m4518D(yk1 yk1Var, uh1 uh1Var, sf0 sf0Var, ph0 ph0Var, String str, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        uh1 uh1Var2;
        String str2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(657024243);
        int i2 = i | (go0Var.m1980f(yk1Var) ? 4 : 2) | 48 | (go0Var.m1980f(ph0Var) ? 2048 : 1024) | 24576;
        boolean z = true;
        if (go0Var.m1958O(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = (i2 & 14) | 48;
            if ((((i3 & 14) ^ 6) <= 4 || !go0Var.m1980f(yk1Var)) && (i3 & 6) != 4) {
                z = false;
            }
            Object objM1956L = go0Var.m1956L();
            Object obj = C0520nx.f7360a;
            if (z || objM1956L == obj) {
                vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
                in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
                vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
                try {
                    Object y33Var = new y33(yk1Var, null, "AnimatedVisibility");
                    AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
                    go0Var.m1981f0(y33Var);
                    objM1956L = y33Var;
                } catch (Throwable th) {
                    AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
                    throw th;
                }
            }
            y33 y33Var2 = (y33) objM1956L;
            go0Var.m1966W(-1356604288);
            y33Var2.m6211a(yk1Var.f13501c.getValue(), go0Var, 0);
            go0Var.m1994p(false);
            boolean zM1980f = go0Var.m1980f(y33Var2);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1980f || objM1956L2 == obj) {
                objM1956L2 = new xq2(8, y33Var2);
                go0Var.m1981f0(objM1956L2);
            }
            AbstractC0179eu.m1450c(y33Var2, (in0) objM1956L2, go0Var);
            Object objM1956L3 = go0Var.m1956L();
            if (objM1956L3 == obj) {
                objM1956L3 = C0799v6.f11774w;
                go0Var.m1981f0(objM1956L3);
            }
            m4519E(y33Var2, (in0) objM1956L3, sf0Var, ph0Var, c0402kw, go0Var, ((i2 << 3) & 57344) | 200112);
            uh1Var2 = rh1.f9587a;
            str2 = "AnimatedVisibility";
        } else {
            go0Var.m1961R();
            uh1Var2 = uh1Var;
            str2 = str;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0014ad(yk1Var, uh1Var2, sf0Var, ph0Var, str2, c0402kw, i);
        }
    }

    /* JADX INFO: renamed from: E */
    public static final void m4519E(y33 y33Var, in0 in0Var, sf0 sf0Var, ph0 ph0Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        C0402kw c0402kw2;
        ph0 ph0Var2;
        sf0 sf0Var2;
        in0 in0Var2;
        y33 y33Var2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1706321816);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(y33Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1980f(rh1.f9587a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.m1980f(sf0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go0Var.m1980f(ph0Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 131072 : 65536;
        }
        if (go0Var.m1958O(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (z || objM1956L == c0160eb) {
                objM1956L = new C0051bd(in0Var, y33Var);
                go0Var.m1981f0(objM1956L);
            }
            uh1 uh1VarM1610A = fg1.m1610A((nn0) objM1956L);
            Object objM1956L2 = go0Var.m1956L();
            if (objM1956L2 == c0160eb) {
                objM1956L2 = C0419lc.f6050q;
                go0Var.m1981f0(objM1956L2);
            }
            m4517C(y33Var, in0Var, uh1VarM1610A, sf0Var, ph0Var, (mn0) objM1956L2, c0402kw, go0Var, i4 | 196608 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
            y33Var2 = y33Var;
            in0Var2 = in0Var;
            sf0Var2 = sf0Var;
            ph0Var2 = ph0Var;
            c0402kw2 = c0402kw;
        } else {
            c0402kw2 = c0402kw;
            ph0Var2 = ph0Var;
            sf0Var2 = sf0Var;
            in0Var2 = in0Var;
            y33Var2 = y33Var;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0087cd(y33Var2, in0Var2, sf0Var2, ph0Var2, c0402kw2, i);
        }
    }

    /* JADX INFO: renamed from: F */
    public static final C0192f6 m4520F(C0122d9 c0122d9) {
        Canvas canvas = AbstractC0229g6.f3317a;
        C0192f6 c0192f6 = new C0192f6();
        c0192f6.f2807a = new Canvas(p40.m3727i(c0122d9));
        return c0192f6;
    }

    /* JADX INFO: renamed from: G */
    public static final void m4521G(ws1 ws1Var, InterfaceC0644r5 interfaceC0644r5, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.m1980f(ws1Var) : go0Var.m1984h(ws1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1980f(interfaceC0644r5) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 256 : 128;
        }
        boolean z = false;
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && go0Var.m1980f(ws1Var))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objM1956L = go0Var.m1956L();
            if (z3 || objM1956L == C0520nx.f7360a) {
                objM1956L = new sr0(interfaceC0644r5, ws1Var);
                go0Var.m1981f0(objM1956L);
            }
            AbstractC0573pa.m3831a((sr0) objM1956L, null, new h22(false, true, true, km2.f5651h, false), c0402kw, go0Var, ((i2 << 3) & 7168) | 384, 2);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0803va(ws1Var, interfaceC0644r5, c0402kw, i, 0);
        }
    }

    /* JADX INFO: renamed from: H */
    public static final void m4522H(int i, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1618303769);
        if (go0Var.m1958O(i & 1, i != 0)) {
            View view = (View) go0Var.m1988j(AbstractC0646r7.f9415f);
            boolean zM1984h = go0Var.m1984h(view);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (zM1984h || objM1956L == c0160eb) {
                objM1956L = new C0792v(19, view);
                go0Var.m1981f0(objM1956L);
            }
            AbstractC0179eu.m1450c(view, (in0) objM1956L, go0Var);
            Object objM1956L2 = go0Var.m1956L();
            if (objM1956L2 == c0160eb) {
                objM1956L2 = wp1.f12606o;
                go0Var.m1981f0(objM1956L2);
            }
            pp0.m3904b((in0) ((yn0) objM1956L2), AbstractC0731te.f10695g, null, go0Var, 54, 4);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new eg1(i);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m4523I(uh1 uh1Var, e42 e42Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-714464401);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1980f(e42Var) ? 32 : 16;
        }
        int i3 = i & 384;
        C0402kw c0402kw2 = f9669a;
        if (i3 == 0) {
            i2 |= go0Var.m1984h(c0402kw2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 2048 : 1024;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM1956L = go0Var.m1956L();
            if (objM1956L == C0520nx.f7360a) {
                nx1 nx1Var = new nx1(null, gd3.f3416C);
                go0Var.m1981f0(nx1Var);
                objM1956L = nx1Var;
            }
            C0243gk c0243gkM4535U = m4535U(c0402kw2, go0Var, (i2 >> 6) & 14);
            ci0.m800a(e42Var.mo1251a(c0243gkM4535U), xe1.m6126i0(274270255, new C0794v1(uh1Var, (xk1) objM1956L, c0402kw, c0243gkM4535U, 3), go0Var), go0Var, 56);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0803va(uh1Var, e42Var, c0402kw, i, 2);
        }
    }

    /* JADX INFO: renamed from: J */
    public static final void m4524J(uh1 uh1Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        uh1 uh1Var2;
        C0402kw c0402kw2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 32 : 16;
        }
        int i4 = 0;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                nx1 nx1Var = new nx1(null, gd3.f3416C);
                go0Var.m1981f0(nx1Var);
                objM1956L = nx1Var;
            }
            xk1 xk1Var = (xk1) objM1956L;
            Object objM1956L2 = go0Var.m1956L();
            if (objM1956L2 == c0160eb) {
                objM1956L2 = new a02(xk1Var, i4);
                go0Var.m1981f0(objM1956L2);
            }
            xm0 xm0Var = (xm0) objM1956L2;
            h22 h22Var = k60.f5352a;
            C0243gk c0243gkM4535U = m4535U(f9670b, go0Var, 6);
            uh1Var2 = uh1Var;
            c0402kw2 = c0402kw;
            ci0.m801b(new f42[]{az2.f457b.mo1251a(AbstractC0179eu.m1439T(xm0Var, go0Var, 2)), az2.f456a.mo1251a(c0243gkM4535U)}, xe1.m6126i0(1070596993, new C0959ze(uh1Var2, xk1Var, c0402kw2, c0243gkM4535U, xm0Var), go0Var), go0Var, 56);
        } else {
            uh1Var2 = uh1Var;
            c0402kw2 = c0402kw;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0537ob(uh1Var2, c0402kw2, i, i3);
        }
    }

    /* JADX INFO: renamed from: K */
    public static final void m4525K(uh1 uh1Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(155925518);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 32 : 16;
        }
        int i3 = 3;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            boolean z = go0Var.m1988j(az2.f456a) != null;
            boolean z2 = go0Var.m1988j(az2.f457b) != null;
            if (z && z2) {
                go0Var.m1966W(-1977187922);
                nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10222j, true);
                int iHashCode = Long.hashCode(go0Var.f3614T);
                yy1 yy1VarM1990l = go0Var.m1990l();
                uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1Var);
                InterfaceC0293hx.f4166c.getClass();
                C0367jy c0367jy = C0256gx.f3727b;
                go0Var.m1969Z();
                if (go0Var.f3613S) {
                    go0Var.m1989k(c0367jy);
                } else {
                    go0Var.m1987i0();
                }
                yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
                yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                yf3.m6267b(go0Var, C0256gx.f3732g);
                yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                c0402kw.mo12g(go0Var, Integer.valueOf((i2 >> 3) & 14));
                go0Var.m1994p(true);
                go0Var.m1994p(false);
            } else if (z) {
                go0Var.m1966W(-1976997706);
                AbstractC0179eu.m1465o(uh1Var, c0402kw, go0Var, i2 & 126);
                go0Var.m1994p(false);
            } else if (z2) {
                go0Var.m1966W(-1976846922);
                k60.m2609d(uh1Var, c0402kw, go0Var, i2 & 126);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(-1976716505);
                m4524J(uh1Var, c0402kw, go0Var, i2 & 126);
                go0Var.m1994p(false);
            }
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0537ob(uh1Var, c0402kw, i, i3);
        }
    }

    /* JADX INFO: renamed from: L */
    public static final void m4526L(final ws1 ws1Var, final boolean z, final c92 c92Var, final boolean z2, long j, final float f, final uh1 uh1Var, InterfaceC0596px interfaceC0596px, final int i) {
        int i2;
        final long j2;
        int i3;
        long j3;
        final boolean z3;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.m1980f(ws1Var) : go0Var.m1984h(ws1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1982g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1976d(c92Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.m1982g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= go0Var.m1980f(uh1Var) ? 1048576 : 524288;
        }
        if (go0Var.m1958O(i2 & 1, (533651 & i2) != 533650)) {
            go0Var.m1963T();
            if ((i & 1) == 0 || go0Var.m2003y()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                go0Var.m1961R();
                i3 = i2 & (-57345);
                j3 = j;
            }
            go0Var.m1995q();
            c92 c92Var2 = c92.f1252i;
            c92 c92Var3 = c92.f1251h;
            if (z) {
                yn2 yn2Var = gn2.f3587a;
                z3 = (c92Var == c92Var3 && !z2) || (c92Var == c92Var2 && z2);
            } else {
                yn2 yn2Var2 = gn2.f3587a;
                z3 = !((c92Var == c92Var3 && !z2) || (c92Var == c92Var2 && z2));
            }
            C0546ok c0546ok = z3 ? AbstractC0738tl.f10821b : AbstractC0738tl.f10820a;
            int i4 = i3 & 14;
            boolean zM1982g = ((i3 & 112) == 32) | (i4 == 4 || ((i3 & 8) != 0 && go0Var.m1984h(ws1Var))) | go0Var.m1982g(z3);
            Object objM1956L = go0Var.m1956L();
            if (zM1982g || objM1956L == C0520nx.f7360a) {
                objM1956L = new in0() { // from class: xa
                    @Override // p000.in0
                    /* JADX INFO: renamed from: j */
                    public final Object mo5j(Object obj) {
                        zn2 zn2Var = (zn2) obj;
                        long jMo611a = ws1Var.mo611a();
                        zn2Var.mo1533a(gn2.f3587a, new fn2(z ? rr0.f9717i : rr0.f9718j, jMo611a, z3 ? en2.f2517h : en2.f2519j, (9223372034707292159L & jMo611a) != 9205357640488583168L));
                        return a83.f116a;
                    }
                };
                go0Var.m1981f0(objM1956L);
            }
            final uh1 uh1VarM3321a = nn2.m3321a(uh1Var, false, (in0) objM1956L);
            final za3 za3Var = (za3) go0Var.m1988j(AbstractC0441ly.f6394t);
            long j4 = j3;
            C0546ok c0546ok2 = c0546ok;
            j2 = j4;
            m4521G(ws1Var, c0546ok2, xe1.m6126i0(1365123137, new mn0() { // from class: ya
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    go0 go0Var2 = (go0) interfaceC0596px2;
                    if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        f42 f42VarMo1251a = AbstractC0441ly.f6394t.mo1251a(za3Var);
                        final long j5 = j2;
                        final boolean z4 = z3;
                        final uh1 uh1Var2 = uh1VarM3321a;
                        final ws1 ws1Var2 = ws1Var;
                        ci0.m800a(f42VarMo1251a, xe1.m6126i0(1260045569, new mn0() { // from class: ab
                            @Override // p000.mn0
                            /* JADX INFO: renamed from: g */
                            public final Object mo12g(Object obj3, Object obj4) {
                                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final int i5 = 1;
                                final int i6 = 0;
                                go0 go0Var3 = (go0) interfaceC0596px3;
                                if (go0Var3.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j6 = j5;
                                    boolean z5 = z4;
                                    uh1 uh1Var3 = uh1Var2;
                                    final ws1 ws1Var3 = ws1Var2;
                                    C0160eb c0160eb = C0520nx.f7360a;
                                    if (j6 != 9205357640488583168L) {
                                        go0Var3.m1966W(3458246);
                                        C0771uf c0771uf = z5 ? sp0.f10261b : sp0.f10260a;
                                        uh1 uh1VarM5201b0 = AbstractC0731te.m5201b0(uh1Var3, Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), 0.0f, 0.0f, 12);
                                        ob2 ob2VarM3265a = nb2.m3265a(c0771uf, C0700sn.f10231s, go0Var3, 0);
                                        int iHashCode = Long.hashCode(go0Var3.f3614T);
                                        yy1 yy1VarM1990l = go0Var3.m1990l();
                                        uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var3, uh1VarM5201b0);
                                        InterfaceC0293hx.f4166c.getClass();
                                        C0367jy c0367jy = C0256gx.f3727b;
                                        go0Var3.m1969Z();
                                        if (go0Var3.f3613S) {
                                            go0Var3.m1989k(c0367jy);
                                        } else {
                                            go0Var3.m1987i0();
                                        }
                                        yf3.m6268c(go0Var3, C0256gx.f3730e, ob2VarM3265a);
                                        yf3.m6268c(go0Var3, C0256gx.f3729d, yy1VarM1990l);
                                        yf3.m6268c(go0Var3, C0256gx.f3731f, Integer.valueOf(iHashCode));
                                        yf3.m6267b(go0Var3, C0256gx.f3732g);
                                        yf3.m6268c(go0Var3, C0256gx.f3728c, uh1VarM5285M);
                                        boolean zM1984h = go0Var3.m1984h(ws1Var3);
                                        Object objM1956L2 = go0Var3.m1956L();
                                        if (zM1984h || objM1956L2 == c0160eb) {
                                            objM1956L2 = new xm0() { // from class: bb
                                                @Override // p000.xm0
                                                /* JADX INFO: renamed from: a */
                                                public final Object mo6a() {
                                                    int i7 = i6;
                                                    ws1 ws1Var4 = ws1Var3;
                                                    switch (i7) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & ws1Var4.mo611a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & ws1Var4.mo611a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            go0Var3.m1981f0(objM1956L2);
                                        }
                                        rp0.m4527M(rh1.f9587a, (xm0) objM1956L2, z5, go0Var3, 6);
                                        go0Var3.m1994p(true);
                                        go0Var3.m1994p(false);
                                    } else {
                                        go0Var3.m1966W(4389176);
                                        boolean zM1984h2 = go0Var3.m1984h(ws1Var3);
                                        Object objM1956L3 = go0Var3.m1956L();
                                        if (zM1984h2 || objM1956L3 == c0160eb) {
                                            objM1956L3 = new xm0() { // from class: bb
                                                @Override // p000.xm0
                                                /* JADX INFO: renamed from: a */
                                                public final Object mo6a() {
                                                    int i7 = i5;
                                                    ws1 ws1Var4 = ws1Var3;
                                                    switch (i7) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & ws1Var4.mo611a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & ws1Var4.mo611a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            go0Var3.m1981f0(objM1956L3);
                                        }
                                        rp0.m4527M(uh1Var3, (xm0) objM1956L3, z5, go0Var3, 0);
                                        go0Var3.m1994p(false);
                                    }
                                } else {
                                    go0Var3.m1961R();
                                }
                                return a83.f116a;
                            }
                        }, go0Var2), go0Var2, 56);
                    } else {
                        go0Var2.m1961R();
                    }
                    return a83.f116a;
                }
            }, go0Var), go0Var, i4 | 384);
        } else {
            go0Var.m1961R();
            j2 = j;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            final long j5 = j2;
            b62VarM1996r.f616d = new mn0() { // from class: za
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rp0.m4526L(ws1Var, z, c92Var, z2, j5, f, uh1Var, (InterfaceC0596px) obj, pp0.m3902N(i | 1));
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: M */
    public static final void m4527M(uh1 uh1Var, xm0 xm0Var, boolean z, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(2111672474);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (go0Var.m1984h(xm0Var) ? 32 : 16) | (go0Var.m1982g(z) ? 256 : 128);
        int i4 = 0;
        if (go0Var.m1958O(i3 & 1, (i3 & 147) != 146)) {
            yn2 yn2Var = gn2.f3587a;
            m4529O(go0Var, AbstractC0738tl.m5320s(AbstractC0731te.m5213h0(uh1Var, 25.0f, 25.0f), new C0085cb(i4, xm0Var, z)));
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0639r0(uh1Var, xm0Var, z, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final qn2 m4528N(r61 r61Var, boolean z) {
        th1 th1Var = (th1) r61Var.f9372M.f12036g;
        Object obj = null;
        if ((th1Var.f10760k & 8) != 0) {
            loop0: while (true) {
                if (th1Var == null) {
                    break;
                }
                if ((th1Var.f10759j & 8) != 0) {
                    th1 th1VarM4952m = th1Var;
                    zk1 zk1Var = null;
                    while (th1VarM4952m != null) {
                        if (th1VarM4952m instanceof on2) {
                            obj = th1VarM4952m;
                            break loop0;
                        }
                        if ((th1VarM4952m.f10759j & 8) != 0 && (th1VarM4952m instanceof u60)) {
                            int i = 0;
                            for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                if ((th1Var2.f10759j & 8) != 0) {
                                    i++;
                                    if (i == 1) {
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
                            if (i == 1) {
                            }
                        }
                        th1VarM4952m = sp0.m4952m(zk1Var);
                    }
                    if ((th1Var.f10760k & 8) != 0) {
                        break;
                    }
                    th1Var = th1Var.f10762m;
                } else if ((th1Var.f10760k & 8) != 0) {
                }
            }
        }
        obj.getClass();
        th1 th1Var3 = ((th1) ((on2) obj)).f10757h;
        ln2 ln2VarM4391w = r61Var.m4391w();
        if (ln2VarM4391w == null) {
            ln2VarM4391w = new ln2();
        }
        return new qn2(th1Var3, z, r61Var, ln2VarM4391w);
    }

    /* JADX INFO: renamed from: O */
    public static final void m4529O(InterfaceC0596px interfaceC0596px, uh1 uh1Var) {
        C0378k8 c0378k8 = C0378k8.f5386h;
        go0 go0Var = (go0) interfaceC0596px;
        int iHashCode = Long.hashCode(go0Var.f3614T);
        uh1 uh1VarM5285M = AbstractC0738tl.m5285M(interfaceC0596px, uh1Var);
        yy1 yy1VarM1990l = go0Var.m1990l();
        InterfaceC0293hx.f4166c.getClass();
        C0367jy c0367jy = C0256gx.f3727b;
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1969Z();
        if (go0Var2.f3613S) {
            go0Var2.m1989k(c0367jy);
        } else {
            go0Var2.m1987i0();
        }
        yf3.m6268c(interfaceC0596px, C0256gx.f3730e, c0378k8);
        yf3.m6268c(interfaceC0596px, C0256gx.f3729d, yy1VarM1990l);
        yf3.m6267b(interfaceC0596px, C0256gx.f3732g);
        yf3.m6268c(interfaceC0596px, C0256gx.f3728c, uh1VarM5285M);
        yf3.m6268c(interfaceC0596px, C0256gx.f3731f, Integer.valueOf(iHashCode));
        go0Var2.m1994p(true);
    }

    /* JADX INFO: renamed from: P */
    public static final void m4530P(hw2 hw2Var, uh1 uh1Var, mn0 mn0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-511989831);
        int i2 = (go0Var.m1984h(hw2Var) ? 4 : 2) | i | (go0Var.m1980f(uh1Var) ? 32 : 16) | (go0Var.m1984h(mn0Var) ? 256 : 128);
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(go0Var.f3614T);
            eo0 eo0VarM4458L = rg3.m4458L(go0Var);
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1Var);
            yy1 yy1VarM1990l = go0Var.m1990l();
            C0367jy c0367jy = C0367jy.f5267s;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, hw2Var.f4163c, hw2Var);
            yf3.m6268c(go0Var, hw2Var.f4164d, eo0VarM4458L);
            yf3.m6268c(go0Var, hw2Var.f4165e, mn0Var);
            InterfaceC0293hx.f4166c.getClass();
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            go0Var.m1994p(true);
            if (go0Var.m1945A()) {
                go0Var.m1966W(-1259187287);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(-1259245908);
                boolean zM1984h = go0Var.m1984h(hw2Var);
                Object objM1956L = go0Var.m1956L();
                if (zM1984h || objM1956L == C0520nx.f7360a) {
                    objM1956L = new C0159ea(20, hw2Var);
                    go0Var.m1981f0(objM1956L);
                }
                AbstractC0179eu.m1468r((xm0) objM1956L, go0Var);
                go0Var.m1994p(false);
            }
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0404ky(hw2Var, uh1Var, mn0Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final void m4531Q(String str) {
        if (pv2.m4006s0(str) || str.length() > 512) {
            c80.m672p("INVALID_ARGUMENT", "Class name must not be blank and must contain at most 512 characters.", 0, null, null, 28);
        }
    }

    /* JADX INFO: renamed from: R */
    public static final void m4532R(String str, String str2) {
        if (pv2.m4006s0(str) || str.length() > 256) {
            c80.m672p("INVALID_ARGUMENT", str2.concat(" must not be blank and must contain at most 256 characters."), 0, null, null, 28);
        }
    }

    /* JADX INFO: renamed from: S */
    public static final boolean m4533S(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    /* JADX INFO: renamed from: T */
    public static final void m4534T(fb3 fb3Var, qc2 qc2Var, ba1 ba1Var) {
        AutoCloseable autoCloseable;
        qc2Var.getClass();
        ba1Var.getClass();
        gb3 gb3Var = fb3Var.f2898a;
        if (gb3Var != null) {
            synchronized (gb3Var.f3388a) {
                autoCloseable = (AutoCloseable) gb3Var.f3389b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        kc2 kc2Var = (kc2) autoCloseable;
        if (kc2Var == null || kc2Var.f5458j) {
            return;
        }
        kc2Var.m2628h(ba1Var, qc2Var);
        aa1 aa1Var = ((la1) ba1Var).f6009h;
        if (aa1Var == aa1.f120i || aa1Var.compareTo(aa1.f122k) >= 0) {
            qc2Var.m4136d();
        } else {
            ba1Var.mo505a(new y50(ba1Var, qc2Var));
        }
    }

    /* JADX INFO: renamed from: U */
    public static final C0243gk m4535U(C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((go0) interfaceC0596px).m1980f(c0402kw)) || (i & 6) == 4;
        go0 go0Var = (go0) interfaceC0596px;
        Object objM1956L = go0Var.m1956L();
        C0160eb c0160eb = C0520nx.f7360a;
        if (z || objM1956L == c0160eb) {
            objM1956L = new C0243gk(c0402kw);
            go0Var.m1981f0(objM1956L);
        }
        C0243gk c0243gk = (C0243gk) objM1956L;
        boolean zM1980f = go0Var.m1980f(c0243gk);
        Object objM1956L2 = go0Var.m1956L();
        if (zM1980f || objM1956L2 == c0160eb) {
            objM1956L2 = new C0792v(5, c0243gk);
            go0Var.m1981f0(objM1956L2);
        }
        AbstractC0179eu.m1450c(c0243gk, (in0) objM1956L2, go0Var);
        return c0243gk;
    }

    /* JADX INFO: renamed from: V */
    public static final boolean m4536V(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = be0.f819h;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    qn2 qn2Var = (qn2) obj2;
                    qn2 qn2Var2 = (qn2) obj;
                    arrayList2.add(new rs1((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (qn2Var2.m4206g().m3514b() >> 32)) - Float.intBitsToFloat((int) (qn2Var.m4206g().m3514b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (qn2Var2.m4206g().m3514b() & 4294967295L)) - Float.intBitsToFloat((int) (qn2Var.m4206g().m3514b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((rs1) AbstractC0142du.m1159o0(list)).f9744a;
            } else {
                if (list.isEmpty()) {
                    sb1.m4782b("Empty collection can't be reduced.");
                }
                Object objM1159o0 = AbstractC0142du.m1159o0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objM1159o0 = new rs1(rs1.m4612e(((rs1) objM1159o0).f9744a, ((rs1) list.get(i2)).f9744a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((rs1) objM1159o0).f9744a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: W */
    public static C0022al m4537W(InterfaceC0965zk interfaceC0965zk, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = p33.f7963d;
                    lock.lock();
                    Bitmap bitmapMo1324f = interfaceC0965zk.mo1324f(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo1324f);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo1324f;
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
            interfaceC0965zk = f9671c;
        }
        return C0022al.m188c(interfaceC0965zk, bitmap);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0122d9 m4538X(C0626qo c0626qo, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        C0122d9 c0122d9M3766b = AbstractC0570p7.f8001j;
        C0192f6 c0192f6M4520F = AbstractC0570p7.f8002k;
        C0702sp c0702sp = AbstractC0570p7.f8003l;
        if (c0122d9M3766b == null || c0192f6M4520F == null) {
            c0122d9M3766b = AbstractC0570p7.m3766b(iCeil, iCeil, 1);
            AbstractC0570p7.f8001j = c0122d9M3766b;
            c0192f6M4520F = m4520F(c0122d9M3766b);
            AbstractC0570p7.f8002k = c0192f6M4520F;
        } else {
            Bitmap bitmap = c0122d9M3766b.f1913a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
            }
        }
        C0122d9 c0122d9 = c0122d9M3766b;
        C0192f6 c0192f6 = c0192f6M4520F;
        if (c0702sp == null) {
            c0702sp = new C0702sp();
            AbstractC0570p7.f8003l = c0702sp;
        }
        C0702sp c0702sp2 = c0702sp;
        C0664rp c0664rp = c0702sp2.f10256h;
        d61 layoutDirection = c0626qo.f9053h.getLayoutDirection();
        Bitmap bitmap2 = c0122d9.f1913a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        e70 e70Var = c0664rp.f9665a;
        d61 d61Var = c0664rp.f9666b;
        InterfaceC0627qp interfaceC0627qp = c0664rp.f9667c;
        long j = c0664rp.f9668d;
        c0664rp.f9665a = c0626qo;
        c0664rp.f9666b = layoutDirection;
        c0664rp.f9667c = c0192f6;
        c0664rp.f9668d = jFloatToRawIntBits;
        c0192f6.mo1522l();
        nc0.m3270i0(c0702sp2, C0363ju.f5212b, 0L, c0702sp2.mo3280d(), 58);
        nc0.m3270i0(c0702sp2, sp0.m4932c(4278190080L), 0L, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 120);
        nc0.m3267O(c0702sp2, sp0.m4932c(4278190080L), f, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), null, 120);
        c0192f6.mo1520i();
        c0664rp.f9665a = e70Var;
        c0664rp.f9666b = d61Var;
        c0664rp.f9667c = interfaceC0627qp;
        c0664rp.f9668d = j;
        return c0122d9;
    }

    /* JADX INFO: renamed from: Z */
    public static final v23 m4539Z(Context context) {
        up0.m5555u(context, R.color.system_neutral1_0);
        up0.m5555u(context, R.color.system_neutral1_10);
        m4551l0(98.0f, up0.m5555u(context, R.color.system_neutral1_600));
        m4551l0(96.0f, up0.m5555u(context, R.color.system_neutral1_600));
        up0.m5555u(context, R.color.system_neutral1_50);
        m4551l0(94.0f, up0.m5555u(context, R.color.system_neutral1_600));
        m4551l0(92.0f, up0.m5555u(context, R.color.system_neutral1_600));
        up0.m5555u(context, R.color.system_neutral1_100);
        m4551l0(87.0f, up0.m5555u(context, R.color.system_neutral1_600));
        up0.m5555u(context, R.color.system_neutral1_200);
        up0.m5555u(context, R.color.system_neutral1_300);
        up0.m5555u(context, R.color.system_neutral1_400);
        up0.m5555u(context, R.color.system_neutral1_500);
        up0.m5555u(context, R.color.system_neutral1_600);
        up0.m5555u(context, R.color.system_neutral1_700);
        m4551l0(24.0f, up0.m5555u(context, R.color.system_neutral1_600));
        m4551l0(22.0f, up0.m5555u(context, R.color.system_neutral1_600));
        up0.m5555u(context, R.color.system_neutral1_800);
        m4551l0(17.0f, up0.m5555u(context, R.color.system_neutral1_600));
        m4551l0(12.0f, up0.m5555u(context, R.color.system_neutral1_600));
        up0.m5555u(context, R.color.system_neutral1_900);
        m4551l0(6.0f, up0.m5555u(context, R.color.system_neutral1_600));
        m4551l0(4.0f, up0.m5555u(context, R.color.system_neutral1_600));
        up0.m5555u(context, R.color.system_neutral1_1000);
        long jM5555u = up0.m5555u(context, R.color.system_neutral2_0);
        up0.m5555u(context, R.color.system_neutral2_10);
        long jM4551l0 = m4551l0(98.0f, up0.m5555u(context, R.color.system_neutral2_600));
        long jM4551l02 = m4551l0(96.0f, up0.m5555u(context, R.color.system_neutral2_600));
        long jM5555u2 = up0.m5555u(context, R.color.system_neutral2_50);
        long jM4551l03 = m4551l0(94.0f, up0.m5555u(context, R.color.system_neutral2_600));
        long jM4551l04 = m4551l0(92.0f, up0.m5555u(context, R.color.system_neutral2_600));
        long jM5555u3 = up0.m5555u(context, R.color.system_neutral2_100);
        long jM4551l05 = m4551l0(87.0f, up0.m5555u(context, R.color.system_neutral2_600));
        long jM5555u4 = up0.m5555u(context, R.color.system_neutral2_200);
        up0.m5555u(context, R.color.system_neutral2_300);
        long jM5555u5 = up0.m5555u(context, R.color.system_neutral2_400);
        long jM5555u6 = up0.m5555u(context, R.color.system_neutral2_500);
        up0.m5555u(context, R.color.system_neutral2_600);
        long jM5555u7 = up0.m5555u(context, R.color.system_neutral2_700);
        long jM4551l06 = m4551l0(24.0f, up0.m5555u(context, R.color.system_neutral2_600));
        long jM4551l07 = m4551l0(22.0f, up0.m5555u(context, R.color.system_neutral2_600));
        long jM5555u8 = up0.m5555u(context, R.color.system_neutral2_800);
        long jM4551l08 = m4551l0(17.0f, up0.m5555u(context, R.color.system_neutral2_600));
        long jM4551l09 = m4551l0(12.0f, up0.m5555u(context, R.color.system_neutral2_600));
        long jM5555u9 = up0.m5555u(context, R.color.system_neutral2_900);
        long jM4551l010 = m4551l0(6.0f, up0.m5555u(context, R.color.system_neutral2_600));
        long jM4551l011 = m4551l0(4.0f, up0.m5555u(context, R.color.system_neutral2_600));
        long jM5555u10 = up0.m5555u(context, R.color.system_neutral2_1000);
        long jM5555u11 = up0.m5555u(context, R.color.system_accent1_0);
        up0.m5555u(context, R.color.system_accent1_10);
        up0.m5555u(context, R.color.system_accent1_50);
        long jM5555u12 = up0.m5555u(context, R.color.system_accent1_100);
        long jM5555u13 = up0.m5555u(context, R.color.system_accent1_200);
        up0.m5555u(context, R.color.system_accent1_300);
        up0.m5555u(context, R.color.system_accent1_400);
        up0.m5555u(context, R.color.system_accent1_500);
        long jM5555u14 = up0.m5555u(context, R.color.system_accent1_600);
        long jM5555u15 = up0.m5555u(context, R.color.system_accent1_700);
        long jM5555u16 = up0.m5555u(context, R.color.system_accent1_800);
        long jM5555u17 = up0.m5555u(context, R.color.system_accent1_900);
        up0.m5555u(context, R.color.system_accent1_1000);
        long jM5555u18 = up0.m5555u(context, R.color.system_accent2_0);
        up0.m5555u(context, R.color.system_accent2_10);
        up0.m5555u(context, R.color.system_accent2_50);
        long jM5555u19 = up0.m5555u(context, R.color.system_accent2_100);
        long jM5555u20 = up0.m5555u(context, R.color.system_accent2_200);
        up0.m5555u(context, R.color.system_accent2_300);
        up0.m5555u(context, R.color.system_accent2_400);
        up0.m5555u(context, R.color.system_accent2_500);
        long jM5555u21 = up0.m5555u(context, R.color.system_accent2_600);
        long jM5555u22 = up0.m5555u(context, R.color.system_accent2_700);
        long jM5555u23 = up0.m5555u(context, R.color.system_accent2_800);
        long jM5555u24 = up0.m5555u(context, R.color.system_accent2_900);
        up0.m5555u(context, R.color.system_accent2_1000);
        long jM5555u25 = up0.m5555u(context, R.color.system_accent3_0);
        up0.m5555u(context, R.color.system_accent3_10);
        up0.m5555u(context, R.color.system_accent3_50);
        long jM5555u26 = up0.m5555u(context, R.color.system_accent3_100);
        long jM5555u27 = up0.m5555u(context, R.color.system_accent3_200);
        up0.m5555u(context, R.color.system_accent3_300);
        up0.m5555u(context, R.color.system_accent3_400);
        up0.m5555u(context, R.color.system_accent3_500);
        long jM5555u28 = up0.m5555u(context, R.color.system_accent3_600);
        long jM5555u29 = up0.m5555u(context, R.color.system_accent3_700);
        long jM5555u30 = up0.m5555u(context, R.color.system_accent3_800);
        long jM5555u31 = up0.m5555u(context, R.color.system_accent3_900);
        up0.m5555u(context, R.color.system_accent3_1000);
        return new v23(jM5555u, jM4551l0, jM4551l02, jM5555u2, jM4551l03, jM4551l04, jM5555u3, jM4551l05, jM5555u4, jM5555u5, jM5555u6, jM5555u7, jM4551l06, jM4551l07, jM5555u8, jM4551l08, jM4551l09, jM5555u9, jM4551l010, jM4551l011, jM5555u10, jM5555u11, jM5555u12, jM5555u13, jM5555u14, jM5555u15, jM5555u16, jM5555u17, jM5555u18, jM5555u19, jM5555u20, jM5555u21, jM5555u22, jM5555u23, jM5555u24, jM5555u25, jM5555u26, jM5555u27, jM5555u28, jM5555u29, jM5555u30, jM5555u31);
    }

    /* JADX INFO: renamed from: a0 */
    public static final pl0 m4540a0(pl0 pl0Var) {
        pl0 pl0VarM561f = ((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pl0Var)).getFocusOwner()).m561f();
        if (pl0VarM561f == null || !pl0VarM561f.f10770u) {
            return null;
        }
        return pl0VarM561f;
    }

    /* JADX INFO: renamed from: b0 */
    public static String m4541b0(th2 th2Var) {
        th2Var.getClass();
        ri2 ri2Var = th2Var.f10782k;
        LinkedHashSet linkedHashSetM4492a = ri2Var.m4492a();
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(linkedHashSetM4492a, 10));
        Iterator it = linkedHashSetM4492a.iterator();
        while (it.hasNext()) {
            arrayList.add(((ef2) it.next()).f2431h);
        }
        String strM1165u0 = AbstractC0142du.m1165u0(AbstractC0142du.m1170z0(arrayList), ",", null, null, null, 62);
        String strM1165u02 = AbstractC0142du.m1165u0(ri2Var.m4493b(), ",", null, null, new eq1(2), 30);
        return th2Var.f10777f + "|" + strM1165u0 + "|" + strM1165u02;
    }

    /* JADX INFO: renamed from: c0 */
    public static long m4542c0(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    AbstractC0258gz.m2037k(i6);
                    C0676s.m4644b();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return AbstractC0258gz.m2027a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX INFO: renamed from: d0 */
    public static long m4543d0(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    AbstractC0258gz.m2037k(i6);
                    C0676s.m4644b();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return AbstractC0258gz.m2027a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: e0 */
    public static final o62 m4544e0(pl0 pl0Var) {
        zn1 zn1Var;
        if (pl0Var.f10770u && (zn1Var = pl0Var.f10764o) != null) {
            c61 c61VarM4665J = s11.m4665J(zn1Var);
            if (!c61VarM4665J.mo653w()) {
                c61VarM4665J = null;
            }
            if (c61VarM4665J != null) {
                return pl0Var.m3874P0(c61VarM4665J);
            }
        }
        return o62.f7535e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final pl0 m4545f0(pl0 pl0Var) {
        boolean z = pl0Var.f10757h.f10770u;
        if (z) {
            if (!z) {
                kz0.m2764b("visitChildren called on an unattached node");
            }
            zk1 zk1Var = new zk1(new th1[16]);
            th1 th1Var = pl0Var.f10757h;
            th1 th1Var2 = th1Var.f10762m;
            if (th1Var2 == null) {
                sp0.m4948k(zk1Var, th1Var);
            } else {
                zk1Var.m6423b(th1Var2);
            }
            loop0: while (true) {
                int i = zk1Var.f13936j;
                if (i == 0) {
                    break;
                }
                th1 th1VarM4952m = (th1) zk1Var.m6432k(i - 1);
                if ((th1VarM4952m.f10760k & 1024) == 0) {
                    sp0.m4948k(zk1Var, th1VarM4952m);
                } else {
                    while (true) {
                        if (th1VarM4952m == null) {
                            break;
                        }
                        if ((th1VarM4952m.f10759j & 1024) != 0) {
                            zk1 zk1Var2 = null;
                            while (th1VarM4952m != null) {
                                if (th1VarM4952m instanceof pl0) {
                                    pl0 pl0Var2 = (pl0) th1VarM4952m;
                                    if (pl0Var2.f10757h.f10770u) {
                                        int iOrdinal = pl0Var2.m3876R0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            break loop0;
                                        }
                                        if (iOrdinal != 3) {
                                            c80.m675s();
                                            return null;
                                        }
                                    }
                                } else if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                    int i2 = 0;
                                    for (th1 th1Var3 = ((u60) th1VarM4952m).f11116w; th1Var3 != null; th1Var3 = th1Var3.f10762m) {
                                        if ((th1Var3.f10759j & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                th1VarM4952m = th1Var3;
                                            } else {
                                                if (zk1Var2 == null) {
                                                    zk1Var2 = new zk1(new th1[16]);
                                                }
                                                if (th1VarM4952m != null) {
                                                    zk1Var2.m6423b(th1VarM4952m);
                                                    th1VarM4952m = null;
                                                }
                                                zk1Var2.m6423b(th1Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                th1VarM4952m = sp0.m4952m(zk1Var2);
                            }
                        } else {
                            th1VarM4952m = th1VarM4952m.f10762m;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    public static Object m4546g0(Object obj, Method method, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = f9681m;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f9681m = declaredConstructor;
        }
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(ip0.class, -1)).unreflectSpecial(method, ip0.class).bindTo(obj).invokeWithArguments(objArr);
    }

    /* JADX INFO: renamed from: h0 */
    public static final boolean m4547h0(pl0 pl0Var) {
        r61 r61Var;
        zn1 zn1Var;
        r61 r61Var2;
        zn1 zn1Var2 = pl0Var.f10764o;
        return (zn1Var2 == null || (r61Var = zn1Var2.f13985v) == null || !r61Var.m4351I() || (zn1Var = pl0Var.f10764o) == null || (r61Var2 = zn1Var.f13985v) == null || !r61Var2.m4350H()) ? false : true;
    }

    /* JADX INFO: renamed from: i0 */
    public static final long m4548i0(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : C0363ju.m2565b(C0363ju.m2567d(j) * f, j);
    }

    /* JADX INFO: renamed from: j0 */
    public static final Object m4549j0(Object obj, Object obj2) {
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

    /* JADX INFO: renamed from: k0 */
    public static final void m4550k0(C0411l4 c0411l4, qn2 qn2Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0411l4.f5914a;
        Object objM4505g = qn2Var.m4209k().f6221h.m4505g(vn2.f12063f);
        if (objM4505g == null) {
            objM4505g = null;
        }
        C0974zt c0974zt = (C0974zt) objM4505g;
        if (c0974zt != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(c0974zt.f14088a, c0974zt.f14089b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objM4505g2 = qn2Var.m4209k().f6221h.m4505g(vn2.f12062e);
        if ((objM4505g2 != null ? objM4505g2 : null) != null) {
            List listM4199j = qn2.m4199j(4, qn2Var);
            int size = listM4199j.size();
            for (int i = 0; i < size; i++) {
                qn2 qn2Var2 = (qn2) listM4199j.get(i);
                if (qn2Var2.m4209k().f6221h.m4501c(vn2.f12050J)) {
                    arrayList.add(qn2Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zM4536V = m4536V(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zM4536V ? 1 : arrayList.size(), zM4536V ? arrayList.size() : 1, false, 0));
    }

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
    
        r0 = ((((p000.rg3.m4485u(r42) & 255) << 16) | (-16777216)) | ((p000.rg3.m4485u(r44) & 255) << 8)) | (p000.rg3.m4485u(r12) & 255);
     */
    /* JADX INFO: renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m4551l0(float f, long j) {
        int iM4451E;
        boolean z;
        float f2;
        float f3;
        double d;
        double[] dArr;
        double d2;
        int i;
        int i2;
        int i3;
        int iCeil;
        double dFloor;
        double[] dArr2;
        double[] dArr3;
        double d3 = f;
        if ((d3 < 1.0E-4d) || (d3 > 99.9999d)) {
            return sp0.m4930b(rg3.m4478n(d3));
        }
        C0211fp c0211fpM3921s = pp0.m3921s(sp0.m4947j0(j));
        float f4 = c0211fpM3921s.f3086a;
        float f5 = c0211fpM3921s.f3087b;
        um0 um0Var = um0.f11361k;
        if (t11.m5086l(um0Var, um0Var)) {
            double d4 = f4;
            double d5 = f5;
            double[] dArr4 = p40.f7972h;
            if (d5 < 1.0E-4d || d3 < 1.0E-4d || d3 > 99.9999d) {
                iM4451E = rg3.m4478n(d3);
            } else {
                double d6 = d4 % 360.0d;
                if (d6 < 0.0d) {
                    d6 += 360.0d;
                }
                double radians = Math.toRadians(d6);
                double dPow = (d3 > 8.0d ? Math.pow((d3 + 16.0d) / 116.0d, 3.0d) : d3 / 903.2962962962963d) * 100.0d;
                double dSqrt = Math.sqrt(dPow) * 11.0d;
                int i4 = 1;
                double dPow2 = 1.0d / Math.pow(1.64d - Math.pow(0.29d, um0Var.f11362a), 0.73d);
                double d7 = 2.0d;
                double dCos = (Math.cos(radians + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * ((double) um0Var.f11367f) * ((double) um0Var.f11365d);
                double dSin = Math.sin(radians);
                double dCos2 = Math.cos(radians);
                int i5 = 0;
                while (true) {
                    d = d7;
                    if (i5 >= 5) {
                        dArr = dArr4;
                        d2 = dPow;
                        i = i4;
                        i2 = -16777216;
                        i3 = 8;
                        break;
                    }
                    i = i4;
                    double d8 = d5;
                    double d9 = dSqrt / 100.0d;
                    i2 = -16777216;
                    double dPow3 = Math.pow(((d8 == 0.0d || dSqrt == 0.0d) ? 0.0d : d8 / Math.sqrt(d9)) * dPow2, 1.1111111111111112d);
                    i3 = 8;
                    dArr = dArr4;
                    d2 = dPow;
                    double dPow4 = (Math.pow(d9, (1.0d / ((double) um0Var.f11366e)) / ((double) um0Var.f11371j)) * ((double) um0Var.f11363b)) / ((double) um0Var.f11364c);
                    double d10 = (((0.305d + dPow4) * 23.0d) * dPow3) / (((dPow3 * 108.0d) * dSin) + (((11.0d * dPow3) * dCos2) + (23.0d * dCos)));
                    double d11 = d10 * dCos2;
                    double d12 = d10 * dSin;
                    double d13 = dPow4 * 460.0d;
                    double d14 = ((288.0d * d12) + ((451.0d * d11) + d13)) / 1403.0d;
                    double d15 = ((d13 - (891.0d * d11)) - (261.0d * d12)) / 1403.0d;
                    double d16 = ((d13 - (d11 * 220.0d)) - (d12 * 6300.0d)) / 1403.0d;
                    double dM3698H = p40.m3698H(d14);
                    double dM3698H2 = p40.m3698H(d15);
                    double dM3698H3 = p40.m3698H(d16);
                    double[][] dArr5 = p40.f7971g;
                    double[] dArr6 = dArr5[0];
                    double d17 = (dArr6[2] * dM3698H3) + (dArr6[i] * dM3698H2) + (dArr6[0] * dM3698H);
                    double[] dArr7 = dArr5[i];
                    double d18 = (dArr7[2] * dM3698H3) + (dArr7[i] * dM3698H2) + (dArr7[0] * dM3698H);
                    double[] dArr8 = dArr5[2];
                    double d19 = (dM3698H3 * dArr8[2]) + (dM3698H2 * dArr8[i]) + (dM3698H * dArr8[0]);
                    if (d17 < 0.0d || d18 < 0.0d || d19 < 0.0d) {
                        break;
                    }
                    double d20 = (dArr[2] * d19) + (dArr[i] * d18) + (dArr[0] * d17);
                    if (d20 <= 0.0d) {
                        break;
                    }
                    if (i5 == 4) {
                        break;
                    }
                    double d21 = d20 - d2;
                    if (Math.abs(d21) < 0.002d) {
                        break;
                    }
                    dSqrt -= (d21 * dSqrt) / (d20 * d);
                    i5++;
                    i4 = i;
                    d7 = d;
                    d5 = d8;
                    dArr4 = dArr;
                    dPow = d2;
                }
                iM4451E = 0;
                if (iM4451E == 0) {
                    double[] dArr9 = new double[3];
                    dArr9[0] = -1.0d;
                    dArr9[i] = -1.0d;
                    dArr9[2] = -1.0d;
                    int i6 = i;
                    boolean z2 = false;
                    int i7 = 0;
                    double[] dArr10 = dArr9;
                    double d22 = 0.0d;
                    double d23 = 0.0d;
                    while (i7 < 12) {
                        double d24 = dArr[0];
                        double d25 = dArr[i];
                        double d26 = dArr[2];
                        double d27 = i7 % 4 <= i ? 0.0d : 100.0d;
                        double d28 = i7 % 2 == 0 ? 0.0d : 100.0d;
                        if (i7 < 4) {
                            double d29 = ((d2 - (d25 * d27)) - (d26 * d28)) / d24;
                            dArr2 = p40.m3699I(d29) ? new double[]{d29, d27, d28} : new double[]{-1.0d, -1.0d, -1.0d};
                        } else if (i7 < i3) {
                            double d30 = ((d2 - (d24 * d28)) - (d26 * d27)) / d25;
                            if (p40.m3699I(d30)) {
                                dArr3 = new double[]{d28, d30, d27};
                                dArr2 = dArr3;
                            } else {
                                dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                            }
                        } else {
                            double d31 = ((d2 - (d24 * d27)) - (d25 * d28)) / d26;
                            if (p40.m3699I(d31)) {
                                dArr3 = new double[]{d27, d28, d31};
                                dArr2 = dArr3;
                            } else {
                                dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                            }
                        }
                        if (dArr2[0] >= 0.0d) {
                            double dM3695E = p40.m3695E(dArr2);
                            if (!z2) {
                                dArr9 = dArr2;
                                dArr10 = dArr9;
                                d22 = dM3695E;
                                d23 = d22;
                                z2 = true;
                            } else if (i6 != 0 || p40.m3726h(d22, dM3695E, d23)) {
                                if (p40.m3726h(d22, radians, dM3695E)) {
                                    i6 = 0;
                                    dArr10 = dArr2;
                                    d23 = dM3695E;
                                } else {
                                    i6 = 0;
                                    dArr9 = dArr2;
                                    d22 = dM3695E;
                                }
                            }
                        }
                        i7++;
                        i = 1;
                        i3 = 8;
                    }
                    double[][] dArr11 = {dArr9, dArr10};
                    double[] dArr12 = dArr11[0];
                    double dM3695E2 = p40.m3695E(dArr12);
                    double[] dArr13 = dArr11[1];
                    for (int i8 = 0; i8 < 3; i8++) {
                        double d32 = dArr12[i8];
                        double d33 = dArr13[i8];
                        if (d32 != d33) {
                            if (d32 < d33) {
                                iCeil = (int) Math.floor(p40.m3717a0(d32) - 0.5d);
                                dFloor = Math.ceil(p40.m3717a0(dArr13[i8]) - 0.5d);
                            } else {
                                iCeil = (int) Math.ceil(p40.m3717a0(d32) - 0.5d);
                                dFloor = Math.floor(p40.m3717a0(dArr13[i8]) - 0.5d);
                            }
                            int i9 = (int) dFloor;
                            double d34 = dM3695E2;
                            for (int i10 = 0; i10 < 8 && Math.abs(i9 - iCeil) > 1.0d; i10++) {
                                int iFloor = (int) Math.floor(((double) (iCeil + i9)) / d);
                                double d35 = p40.f7973i[iFloor];
                                double d36 = dArr12[i8];
                                double d37 = dArr13[i8];
                                if (d37 != d36) {
                                    d37 = (d35 - d36) / (d37 - d36);
                                }
                                double d38 = dArr12[0];
                                double d39 = ((dArr13[0] - d38) * d37) + d38;
                                double d40 = dArr12[1];
                                double d41 = ((dArr13[1] - d40) * d37) + d40;
                                double d42 = dArr12[2];
                                double[] dArr14 = {d39, d41, ((dArr13[2] - d42) * d37) + d42};
                                double dM3695E3 = p40.m3695E(dArr14);
                                if (p40.m3726h(d34, radians, dM3695E3)) {
                                    i9 = iFloor;
                                    dArr13 = dArr14;
                                } else {
                                    iCeil = iFloor;
                                    dArr12 = dArr14;
                                    d34 = dM3695E3;
                                }
                            }
                            dM3695E2 = d34;
                        }
                    }
                    iM4451E = ((rg3.m4485u((dArr12[0] + dArr13[0]) / d) & 255) << 16) | i2 | ((rg3.m4485u((dArr12[1] + dArr13[1]) / d) & 255) << 8) | (rg3.m4485u((dArr12[2] + dArr13[2]) / d) & 255);
                }
            }
        } else if (f5 < 1.0d || Math.round(f) <= 0.0d || Math.round(f) >= 100.0d) {
            iM4451E = rg3.m4451E(f);
        } else {
            float f6 = 0.0f;
            float fMin = f4 < 0.0f ? 0.0f : Math.min(360.0f, f4);
            float f7 = 0.0f;
            float f8 = f5;
            boolean z3 = true;
            C0211fp c0211fp = null;
            while (true) {
                if (Math.abs(f7 - f5) >= 0.4000000059604645d) {
                    float f9 = 1000.0f;
                    float f10 = f6;
                    float f11 = 1000.0f;
                    float f12 = 100.0f;
                    C0211fp c0211fp2 = null;
                    while (true) {
                        z = z3;
                        if (Math.abs(f10 - f12) <= 0.009999999776482582d) {
                            f2 = fMin;
                            f3 = 2.0f;
                            break;
                        }
                        float f13 = ((f12 - f10) / 2.0f) + f10;
                        f3 = 2.0f;
                        int iM1710c = pp0.m3922t(f13, f8, fMin).m1710c(um0.f11361k);
                        float fM4453G = rg3.m4453G((iM1710c >> 16) & 255);
                        float fM4453G2 = rg3.m4453G((iM1710c >> 8) & 255);
                        float fM4453G3 = rg3.m4453G(iM1710c & 255);
                        double d43 = fM4453G;
                        double[] dArr15 = rg3.f9562d[1];
                        float f14 = ((float) ((((double) fM4453G3) * dArr15[2]) + ((((double) fM4453G2) * dArr15[1]) + (d43 * dArr15[0])))) / 100.0f;
                        float fCbrt = f14 <= 0.008856452f ? f14 * 903.2963f : (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
                        float fAbs = (float) Math.abs(f - r0);
                        if (fAbs < 0.2f) {
                            C0211fp c0211fpM3921s2 = pp0.m3921s(iM1710c);
                            C0211fp c0211fpM3922t = pp0.m3922t(c0211fpM3921s2.f3088c, c0211fpM3921s2.f3087b, fMin);
                            float f15 = c0211fpM3921s2.f3089d - c0211fpM3922t.f3089d;
                            float f16 = c0211fpM3921s2.f3090e - c0211fpM3922t.f3090e;
                            float f17 = c0211fpM3921s2.f3091f - c0211fpM3922t.f3091f;
                            double dSqrt2 = Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15));
                            f2 = fMin;
                            float fPow = (float) (Math.pow(dSqrt2, 0.63d) * 1.41d);
                            if (fPow <= 1.0f) {
                                f11 = fPow;
                                c0211fp2 = c0211fpM3921s2;
                                f9 = fAbs;
                            }
                        } else {
                            f2 = fMin;
                        }
                        if (f9 == f10 && f11 == f10) {
                            break;
                        }
                        if (fCbrt < f) {
                            fMin = f2;
                            z3 = z;
                            f10 = f13;
                        } else {
                            fMin = f2;
                            z3 = z;
                            f12 = f13;
                        }
                    }
                    C0211fp c0211fp3 = c0211fp2;
                    if (!z) {
                        if (c0211fp3 == null) {
                            f5 = f8;
                        } else {
                            c0211fp = c0211fp3;
                            f7 = f8;
                        }
                        f8 = ((f5 - f7) / f3) + f7;
                        fMin = f2;
                        f6 = f10;
                        z3 = z;
                    } else {
                        if (c0211fp3 != null) {
                            iM4451E = c0211fp3.m1710c(um0Var);
                            break;
                        }
                        f8 = ((f5 - f7) / f3) + f7;
                        z3 = false;
                        fMin = f2;
                        f6 = f10;
                    }
                } else {
                    iM4451E = c0211fp == null ? rg3.m4451E(f) : c0211fp.m1710c(um0Var);
                }
            }
        }
        return sp0.m4930b(iM4451E);
    }

    /* JADX INFO: renamed from: m0 */
    public static final if0 m4552m0(y33 y33Var, in0 in0Var, Object obj, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1962S(-422486745, 0, y33Var, null);
        boolean zM6217g = y33Var.m6217g();
        if0 if0Var = if0.f4587h;
        if0 if0Var2 = if0.f4589j;
        if0 if0Var3 = if0.f4588i;
        if (zM6217g) {
            go0Var.m1966W(-212166497);
            go0Var.m1994p(false);
            if (((Boolean) in0Var.mo5j(obj)).booleanValue()) {
                if0Var = if0Var3;
            } else if (((Boolean) in0Var.mo5j(y33Var.m6213c())).booleanValue()) {
                if0Var = if0Var2;
            }
        } else {
            go0Var.m1966W(-211892364);
            Object objM1956L = go0Var.m1956L();
            if (objM1956L == C0520nx.f7360a) {
                objM1956L = op0.m3598u(Boolean.FALSE);
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            if (((Boolean) in0Var.mo5j(y33Var.m6213c())).booleanValue()) {
                xk1Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) in0Var.mo5j(obj)).booleanValue()) {
                if0Var = if0Var3;
            } else if (((Boolean) xk1Var.getValue()).booleanValue()) {
                if0Var = if0Var2;
            }
            go0Var.m1994p(false);
        }
        go0Var.m1994p(false);
        return if0Var;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Rect m4553n0(d11 d11Var) {
        return new Rect(d11Var.f1807a, d11Var.f1808b, d11Var.f1809c, d11Var.f1810d);
    }

    /* JADX INFO: renamed from: o0 */
    public static final RectF m4554o0(o62 o62Var) {
        return new RectF(o62Var.f7536a, o62Var.f7537b, o62Var.f7538c, o62Var.f7539d);
    }

    /* JADX INFO: renamed from: p0 */
    public static final o62 m4555p0(RectF rectF) {
        return new o62(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: q0 */
    public static final uh1 m4556q0(uh1 uh1Var) {
        return uh1Var.mo4491c(new p11());
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: A */
    public int mo892A(yo2 yo2Var) {
        yo2Var.getClass();
        m4557Y();
        throw null;
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: B */
    public double mo893B() {
        m4557Y();
        throw null;
    }

    /* JADX INFO: renamed from: Y */
    public void m4557Y() {
        throw new o01(d72.m967a(getClass()) + " can't retrieve untyped values");
    }

    /* JADX INFO: renamed from: a */
    public void mo894a(yo2 yo2Var) {
        yo2Var.getClass();
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: b */
    public InterfaceC0826vx mo895b(yo2 yo2Var) {
        yo2Var.getClass();
        return this;
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: d */
    public abstract long mo897d();

    @Override // p000.InterfaceC0826vx
    /* JADX INFO: renamed from: e */
    public y40 mo4558e(d32 d32Var, int i) {
        d32Var.getClass();
        return mo905s(d32Var.mo256j(i));
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: f */
    public boolean mo898f() {
        m4557Y();
        throw null;
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: g */
    public boolean mo899g() {
        return true;
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: h */
    public char mo900h() {
        m4557Y();
        throw null;
    }

    @Override // p000.InterfaceC0826vx
    /* JADX INFO: renamed from: i */
    public float mo4559i(yo2 yo2Var, int i) {
        yo2Var.getClass();
        return mo910y();
    }

    @Override // p000.InterfaceC0826vx
    /* JADX INFO: renamed from: k */
    public double mo4560k(d32 d32Var, int i) {
        d32Var.getClass();
        return mo893B();
    }

    @Override // p000.InterfaceC0826vx
    /* JADX INFO: renamed from: l */
    public char mo4561l(d32 d32Var, int i) {
        d32Var.getClass();
        return mo900h();
    }

    @Override // p000.InterfaceC0826vx
    /* JADX INFO: renamed from: m */
    public byte mo4562m(d32 d32Var, int i) {
        d32Var.getClass();
        return mo903r();
    }

    @Override // p000.InterfaceC0826vx
    /* JADX INFO: renamed from: n */
    public String mo4563n(yo2 yo2Var, int i) {
        yo2Var.getClass();
        return mo909w();
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: o */
    public abstract int mo902o();

    @Override // p000.InterfaceC0826vx
    /* JADX INFO: renamed from: p */
    public short mo4564p(d32 d32Var, int i) {
        d32Var.getClass();
        return mo908v();
    }

    @Override // p000.InterfaceC0826vx
    /* JADX INFO: renamed from: q */
    public boolean mo4565q(yo2 yo2Var, int i) {
        yo2Var.getClass();
        return mo898f();
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: r */
    public abstract byte mo903r();

    @Override // p000.y40
    /* JADX INFO: renamed from: s */
    public y40 mo905s(yo2 yo2Var) {
        yo2Var.getClass();
        return this;
    }

    /* JADX INFO: renamed from: t */
    public Object mo907t(yo2 yo2Var, int i, w41 w41Var, Object obj) {
        yo2Var.getClass();
        w41Var.getClass();
        return mo896c(w41Var);
    }

    @Override // p000.InterfaceC0826vx
    /* JADX INFO: renamed from: u */
    public int mo4566u(yo2 yo2Var, int i) {
        yo2Var.getClass();
        return mo902o();
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: v */
    public abstract short mo908v();

    @Override // p000.y40
    /* JADX INFO: renamed from: w */
    public String mo909w() {
        m4557Y();
        throw null;
    }

    @Override // p000.InterfaceC0826vx
    /* JADX INFO: renamed from: x */
    public Object mo4567x(yo2 yo2Var, int i, String str) {
        nv2 nv2Var = nv2.f7346a;
        yo2Var.getClass();
        nv2.f7347b.getClass();
        if (mo899g()) {
            return mo896c(nv2Var);
        }
        return null;
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: y */
    public float mo910y() {
        m4557Y();
        throw null;
    }

    @Override // p000.InterfaceC0826vx
    /* JADX INFO: renamed from: z */
    public long mo4568z(yo2 yo2Var, int i) {
        yo2Var.getClass();
        return mo897d();
    }
}
