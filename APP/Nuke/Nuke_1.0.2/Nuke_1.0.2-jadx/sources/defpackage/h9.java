package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.UUID;
import kotlin.UByteArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h9 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ h9(v30 v30Var, us1 us1Var, k03 k03Var, t91 t91Var, ft2 ft2Var) {
        this.h = 5;
        this.j = v30Var;
        this.k = us1Var;
        this.i = k03Var;
        this.l = t91Var;
        this.m = ft2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        boolean z;
        int i;
        int i2 = this.h;
        a83 a83Var = a83.a;
        final int i3 = 2;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.i;
        Object obj5 = this.k;
        Object obj6 = this.j;
        final int i4 = 1;
        switch (i2) {
            case 0:
                u91 u91Var = (u91) obj;
                m91 m91Var = ((l9) obj6).a;
                u91Var.h = (k03) obj4;
                u91Var.i = (xx0) obj5;
                u91Var.c = (m0) obj3;
                u91Var.d = (in0) obj2;
                u91Var.e = m91Var != null ? m91Var.w : null;
                u91Var.f = m91Var != null ? m91Var.x : null;
                u91Var.g = m91Var != null ? (za3) p40.p(m91Var, ly.t) : null;
                break;
            case 1:
                s81 s81Var = (s81) obj;
                s81Var.getClass();
                s81.a(s81Var, null, new kw(367456076, true, new fr1((List) obj4, (wm0) obj6, (View) obj5, (rs2) obj3, (mn0) obj2, 1)), 3);
                break;
            case 2:
                si1 si1Var = (si1) obj4;
                o72 o72Var = (o72) obj6;
                z62 z62Var = (z62) obj5;
                im2 im2Var = (im2) obj3;
                y62 y62Var = (y62) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                oi1 oi1VarG = si1.g(si1Var.g);
                if (oi1VarG != null) {
                    sz0 sz0Var = si1Var.e;
                    long j = oi1VarG.b;
                    long j2 = oi1VarG.a;
                    z = true;
                    ((bb2) sz0Var.i).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((bb2) sz0Var.j).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    oi1 oi1VarA = ((oi1) o72Var.i).a(oi1VarG);
                    o72Var.i = oi1VarA;
                    z62Var.h = im2Var.i(im2Var.e(oi1VarA.a));
                    y62Var.h = !rp0.S(r0 - fFloatValue);
                } else {
                    z = true;
                }
                break;
            case 3:
                vn1 vn1Var = (vn1) obj4;
                final n4 n4Var = (n4) obj6;
                final v20 v20Var = (v20) obj5;
                dq1 dq1Var = (dq1) obj3;
                jw0 jw0Var = (jw0) obj2;
                fs1 fs1Var = (fs1) obj;
                fs1Var.getClass();
                fs1Var.b("runtimeInfo", new vd2(vn1Var, 8));
                fs1Var.b("hasPermission", new vd2(vn1Var, 0));
                fs1Var.b("configSnapshot", new vd2(vn1Var, i4));
                fs1Var.b("log", new vd2(vn1Var, i3));
                fs1Var.b("minimumIntervalMillis", new vd2(vn1Var, 3));
                fs1Var.b("maximumActiveTimers", new vd2(vn1Var, 4));
                fs1Var.a("sleep", ye2.a);
                fs1Var.b("messagingTakeEvent", new vd2(vn1Var, 5));
                fs1Var.a("messagingSendMessage", new yd2(vn1Var, 9));
                fs1Var.a("messagingDownloadMedia", new yd2(vn1Var, 0));
                fs1Var.a("hostObjectGet", new yd2(vn1Var, 1));
                fs1Var.a("hostObjectCall", new yd2(vn1Var, 2));
                fs1Var.b("hostObjectRelease", new vd2(vn1Var, 6));
                fs1Var.b("hostContext", new vd2(vn1Var, 7));
                fs1Var.b("hostClassLoader", new vd2(vn1Var, 9));
                fs1Var.b("hostFindClass", new vd2(vn1Var, 15));
                fs1Var.a("hostGetStatic", new yd2(vn1Var, 3));
                fs1Var.a("hostCallStatic", new yd2(vn1Var, 4));
                fs1Var.a("hostConstruct", new yd2(vn1Var, 5));
                fs1Var.a("uiToast", new yd2(vn1Var, 6));
                fs1Var.a("uiAlert", new yd2(vn1Var, 7));
                fs1Var.a("uiConfirm", new yd2(vn1Var, 8));
                final int i5 = 0;
                fs1Var.b("encodeUtf8", new xn0() { // from class: wd2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xn0
                    public final Object b(Object[] objArr) {
                        int i6 = i5;
                        n4 n4Var2 = n4Var;
                        switch (i6) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    String strG0 = sp0.g0("value", objArr[0]);
                                    Charset charset = StandardCharsets.UTF_8;
                                    charset.getClass();
                                    byte[] bytes = strG0.getBytes(charset);
                                    bytes.getClass();
                                    n4Var2.y(bytes.length);
                                    return eu.v(new UByteArray(Arrays.copyOf(bytes, bytes.length)));
                                } catch (Throwable th) {
                                    return eu.u(th);
                                }
                            case 1:
                                objArr.getClass();
                                try {
                                    sp0.a0(2, objArr);
                                    return eu.v(n4Var2.p(sp0.Y("value", objArr[0]), sp0.X("fatal", objArr[1])));
                                } catch (Throwable th2) {
                                    return eu.u(th2);
                                }
                            case 2:
                                objArr.getClass();
                                try {
                                    sp0.a0(3, objArr);
                                    byte[] bArrY = sp0.Y("value", objArr[0]);
                                    boolean zX = sp0.X("urlSafe", objArr[1]);
                                    boolean zX2 = sp0.X("padding", objArr[2]);
                                    n4Var2.y(bArrY.length);
                                    Base64.Encoder urlEncoder = zX ? Base64.getUrlEncoder() : Base64.getEncoder();
                                    if (!zX2) {
                                        urlEncoder = urlEncoder.withoutPadding();
                                    }
                                    String strEncodeToString = urlEncoder.encodeToString(bArrY);
                                    strEncodeToString.getClass();
                                    return eu.v(strEncodeToString);
                                } catch (Throwable th3) {
                                    return eu.u(th3);
                                }
                            case 3:
                                objArr.getClass();
                                try {
                                    sp0.a0(3, objArr);
                                    byte[] bArrN = n4Var2.n(sp0.g0("value", objArr[0]), sp0.X("urlSafe", objArr[1]), sp0.X("allowWhitespace", objArr[2]));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrN, bArrN.length)));
                                } catch (Throwable th4) {
                                    return eu.u(th4);
                                }
                            case 4:
                                objArr.getClass();
                                try {
                                    sp0.a0(2, objArr);
                                    byte[] bArrY2 = sp0.Y("value", objArr[0]);
                                    boolean zX3 = sp0.X("uppercase", objArr[1]);
                                    n4Var2.y(bArrY2.length);
                                    String str = zX3 ? "0123456789ABCDEF" : "0123456789abcdef";
                                    StringBuilder sb = new StringBuilder(bArrY2.length * 2);
                                    for (byte b : bArrY2) {
                                        sb.append(str.charAt((b & 255) >>> 4));
                                        sb.append(str.charAt(b & 15));
                                    }
                                    return eu.v(sb.toString());
                                } catch (Throwable th5) {
                                    return eu.u(th5);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    byte[] bArrO = n4Var2.o(sp0.g0("value", objArr[0]));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrO, bArrO.length)));
                                } catch (Throwable th6) {
                                    return eu.u(th6);
                                }
                        }
                    }
                });
                fs1Var.b("decodeUtf8", new xn0() { // from class: wd2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xn0
                    public final Object b(Object[] objArr) {
                        int i6 = i4;
                        n4 n4Var2 = n4Var;
                        switch (i6) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    String strG0 = sp0.g0("value", objArr[0]);
                                    Charset charset = StandardCharsets.UTF_8;
                                    charset.getClass();
                                    byte[] bytes = strG0.getBytes(charset);
                                    bytes.getClass();
                                    n4Var2.y(bytes.length);
                                    return eu.v(new UByteArray(Arrays.copyOf(bytes, bytes.length)));
                                } catch (Throwable th) {
                                    return eu.u(th);
                                }
                            case 1:
                                objArr.getClass();
                                try {
                                    sp0.a0(2, objArr);
                                    return eu.v(n4Var2.p(sp0.Y("value", objArr[0]), sp0.X("fatal", objArr[1])));
                                } catch (Throwable th2) {
                                    return eu.u(th2);
                                }
                            case 2:
                                objArr.getClass();
                                try {
                                    sp0.a0(3, objArr);
                                    byte[] bArrY = sp0.Y("value", objArr[0]);
                                    boolean zX = sp0.X("urlSafe", objArr[1]);
                                    boolean zX2 = sp0.X("padding", objArr[2]);
                                    n4Var2.y(bArrY.length);
                                    Base64.Encoder urlEncoder = zX ? Base64.getUrlEncoder() : Base64.getEncoder();
                                    if (!zX2) {
                                        urlEncoder = urlEncoder.withoutPadding();
                                    }
                                    String strEncodeToString = urlEncoder.encodeToString(bArrY);
                                    strEncodeToString.getClass();
                                    return eu.v(strEncodeToString);
                                } catch (Throwable th3) {
                                    return eu.u(th3);
                                }
                            case 3:
                                objArr.getClass();
                                try {
                                    sp0.a0(3, objArr);
                                    byte[] bArrN = n4Var2.n(sp0.g0("value", objArr[0]), sp0.X("urlSafe", objArr[1]), sp0.X("allowWhitespace", objArr[2]));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrN, bArrN.length)));
                                } catch (Throwable th4) {
                                    return eu.u(th4);
                                }
                            case 4:
                                objArr.getClass();
                                try {
                                    sp0.a0(2, objArr);
                                    byte[] bArrY2 = sp0.Y("value", objArr[0]);
                                    boolean zX3 = sp0.X("uppercase", objArr[1]);
                                    n4Var2.y(bArrY2.length);
                                    String str = zX3 ? "0123456789ABCDEF" : "0123456789abcdef";
                                    StringBuilder sb = new StringBuilder(bArrY2.length * 2);
                                    for (byte b : bArrY2) {
                                        sb.append(str.charAt((b & 255) >>> 4));
                                        sb.append(str.charAt(b & 15));
                                    }
                                    return eu.v(sb.toString());
                                } catch (Throwable th5) {
                                    return eu.u(th5);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    byte[] bArrO = n4Var2.o(sp0.g0("value", objArr[0]));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrO, bArrO.length)));
                                } catch (Throwable th6) {
                                    return eu.u(th6);
                                }
                        }
                    }
                });
                fs1Var.b("encodeBase64", new xn0() { // from class: wd2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xn0
                    public final Object b(Object[] objArr) {
                        int i6 = i3;
                        n4 n4Var2 = n4Var;
                        switch (i6) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    String strG0 = sp0.g0("value", objArr[0]);
                                    Charset charset = StandardCharsets.UTF_8;
                                    charset.getClass();
                                    byte[] bytes = strG0.getBytes(charset);
                                    bytes.getClass();
                                    n4Var2.y(bytes.length);
                                    return eu.v(new UByteArray(Arrays.copyOf(bytes, bytes.length)));
                                } catch (Throwable th) {
                                    return eu.u(th);
                                }
                            case 1:
                                objArr.getClass();
                                try {
                                    sp0.a0(2, objArr);
                                    return eu.v(n4Var2.p(sp0.Y("value", objArr[0]), sp0.X("fatal", objArr[1])));
                                } catch (Throwable th2) {
                                    return eu.u(th2);
                                }
                            case 2:
                                objArr.getClass();
                                try {
                                    sp0.a0(3, objArr);
                                    byte[] bArrY = sp0.Y("value", objArr[0]);
                                    boolean zX = sp0.X("urlSafe", objArr[1]);
                                    boolean zX2 = sp0.X("padding", objArr[2]);
                                    n4Var2.y(bArrY.length);
                                    Base64.Encoder urlEncoder = zX ? Base64.getUrlEncoder() : Base64.getEncoder();
                                    if (!zX2) {
                                        urlEncoder = urlEncoder.withoutPadding();
                                    }
                                    String strEncodeToString = urlEncoder.encodeToString(bArrY);
                                    strEncodeToString.getClass();
                                    return eu.v(strEncodeToString);
                                } catch (Throwable th3) {
                                    return eu.u(th3);
                                }
                            case 3:
                                objArr.getClass();
                                try {
                                    sp0.a0(3, objArr);
                                    byte[] bArrN = n4Var2.n(sp0.g0("value", objArr[0]), sp0.X("urlSafe", objArr[1]), sp0.X("allowWhitespace", objArr[2]));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrN, bArrN.length)));
                                } catch (Throwable th4) {
                                    return eu.u(th4);
                                }
                            case 4:
                                objArr.getClass();
                                try {
                                    sp0.a0(2, objArr);
                                    byte[] bArrY2 = sp0.Y("value", objArr[0]);
                                    boolean zX3 = sp0.X("uppercase", objArr[1]);
                                    n4Var2.y(bArrY2.length);
                                    String str = zX3 ? "0123456789ABCDEF" : "0123456789abcdef";
                                    StringBuilder sb = new StringBuilder(bArrY2.length * 2);
                                    for (byte b : bArrY2) {
                                        sb.append(str.charAt((b & 255) >>> 4));
                                        sb.append(str.charAt(b & 15));
                                    }
                                    return eu.v(sb.toString());
                                } catch (Throwable th5) {
                                    return eu.u(th5);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    byte[] bArrO = n4Var2.o(sp0.g0("value", objArr[0]));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrO, bArrO.length)));
                                } catch (Throwable th6) {
                                    return eu.u(th6);
                                }
                        }
                    }
                });
                final int i6 = 3;
                fs1Var.b("decodeBase64", new xn0() { // from class: wd2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xn0
                    public final Object b(Object[] objArr) {
                        int i62 = i6;
                        n4 n4Var2 = n4Var;
                        switch (i62) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    String strG0 = sp0.g0("value", objArr[0]);
                                    Charset charset = StandardCharsets.UTF_8;
                                    charset.getClass();
                                    byte[] bytes = strG0.getBytes(charset);
                                    bytes.getClass();
                                    n4Var2.y(bytes.length);
                                    return eu.v(new UByteArray(Arrays.copyOf(bytes, bytes.length)));
                                } catch (Throwable th) {
                                    return eu.u(th);
                                }
                            case 1:
                                objArr.getClass();
                                try {
                                    sp0.a0(2, objArr);
                                    return eu.v(n4Var2.p(sp0.Y("value", objArr[0]), sp0.X("fatal", objArr[1])));
                                } catch (Throwable th2) {
                                    return eu.u(th2);
                                }
                            case 2:
                                objArr.getClass();
                                try {
                                    sp0.a0(3, objArr);
                                    byte[] bArrY = sp0.Y("value", objArr[0]);
                                    boolean zX = sp0.X("urlSafe", objArr[1]);
                                    boolean zX2 = sp0.X("padding", objArr[2]);
                                    n4Var2.y(bArrY.length);
                                    Base64.Encoder urlEncoder = zX ? Base64.getUrlEncoder() : Base64.getEncoder();
                                    if (!zX2) {
                                        urlEncoder = urlEncoder.withoutPadding();
                                    }
                                    String strEncodeToString = urlEncoder.encodeToString(bArrY);
                                    strEncodeToString.getClass();
                                    return eu.v(strEncodeToString);
                                } catch (Throwable th3) {
                                    return eu.u(th3);
                                }
                            case 3:
                                objArr.getClass();
                                try {
                                    sp0.a0(3, objArr);
                                    byte[] bArrN = n4Var2.n(sp0.g0("value", objArr[0]), sp0.X("urlSafe", objArr[1]), sp0.X("allowWhitespace", objArr[2]));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrN, bArrN.length)));
                                } catch (Throwable th4) {
                                    return eu.u(th4);
                                }
                            case 4:
                                objArr.getClass();
                                try {
                                    sp0.a0(2, objArr);
                                    byte[] bArrY2 = sp0.Y("value", objArr[0]);
                                    boolean zX3 = sp0.X("uppercase", objArr[1]);
                                    n4Var2.y(bArrY2.length);
                                    String str = zX3 ? "0123456789ABCDEF" : "0123456789abcdef";
                                    StringBuilder sb = new StringBuilder(bArrY2.length * 2);
                                    for (byte b : bArrY2) {
                                        sb.append(str.charAt((b & 255) >>> 4));
                                        sb.append(str.charAt(b & 15));
                                    }
                                    return eu.v(sb.toString());
                                } catch (Throwable th5) {
                                    return eu.u(th5);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    byte[] bArrO = n4Var2.o(sp0.g0("value", objArr[0]));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrO, bArrO.length)));
                                } catch (Throwable th6) {
                                    return eu.u(th6);
                                }
                        }
                    }
                });
                final int i7 = 4;
                fs1Var.b("encodeHex", new xn0() { // from class: wd2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xn0
                    public final Object b(Object[] objArr) {
                        int i62 = i7;
                        n4 n4Var2 = n4Var;
                        switch (i62) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    String strG0 = sp0.g0("value", objArr[0]);
                                    Charset charset = StandardCharsets.UTF_8;
                                    charset.getClass();
                                    byte[] bytes = strG0.getBytes(charset);
                                    bytes.getClass();
                                    n4Var2.y(bytes.length);
                                    return eu.v(new UByteArray(Arrays.copyOf(bytes, bytes.length)));
                                } catch (Throwable th) {
                                    return eu.u(th);
                                }
                            case 1:
                                objArr.getClass();
                                try {
                                    sp0.a0(2, objArr);
                                    return eu.v(n4Var2.p(sp0.Y("value", objArr[0]), sp0.X("fatal", objArr[1])));
                                } catch (Throwable th2) {
                                    return eu.u(th2);
                                }
                            case 2:
                                objArr.getClass();
                                try {
                                    sp0.a0(3, objArr);
                                    byte[] bArrY = sp0.Y("value", objArr[0]);
                                    boolean zX = sp0.X("urlSafe", objArr[1]);
                                    boolean zX2 = sp0.X("padding", objArr[2]);
                                    n4Var2.y(bArrY.length);
                                    Base64.Encoder urlEncoder = zX ? Base64.getUrlEncoder() : Base64.getEncoder();
                                    if (!zX2) {
                                        urlEncoder = urlEncoder.withoutPadding();
                                    }
                                    String strEncodeToString = urlEncoder.encodeToString(bArrY);
                                    strEncodeToString.getClass();
                                    return eu.v(strEncodeToString);
                                } catch (Throwable th3) {
                                    return eu.u(th3);
                                }
                            case 3:
                                objArr.getClass();
                                try {
                                    sp0.a0(3, objArr);
                                    byte[] bArrN = n4Var2.n(sp0.g0("value", objArr[0]), sp0.X("urlSafe", objArr[1]), sp0.X("allowWhitespace", objArr[2]));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrN, bArrN.length)));
                                } catch (Throwable th4) {
                                    return eu.u(th4);
                                }
                            case 4:
                                objArr.getClass();
                                try {
                                    sp0.a0(2, objArr);
                                    byte[] bArrY2 = sp0.Y("value", objArr[0]);
                                    boolean zX3 = sp0.X("uppercase", objArr[1]);
                                    n4Var2.y(bArrY2.length);
                                    String str = zX3 ? "0123456789ABCDEF" : "0123456789abcdef";
                                    StringBuilder sb = new StringBuilder(bArrY2.length * 2);
                                    for (byte b : bArrY2) {
                                        sb.append(str.charAt((b & 255) >>> 4));
                                        sb.append(str.charAt(b & 15));
                                    }
                                    return eu.v(sb.toString());
                                } catch (Throwable th5) {
                                    return eu.u(th5);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    byte[] bArrO = n4Var2.o(sp0.g0("value", objArr[0]));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrO, bArrO.length)));
                                } catch (Throwable th6) {
                                    return eu.u(th6);
                                }
                        }
                    }
                });
                final int i8 = 5;
                fs1Var.b("decodeHex", new xn0() { // from class: wd2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xn0
                    public final Object b(Object[] objArr) {
                        int i62 = i8;
                        n4 n4Var2 = n4Var;
                        switch (i62) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    String strG0 = sp0.g0("value", objArr[0]);
                                    Charset charset = StandardCharsets.UTF_8;
                                    charset.getClass();
                                    byte[] bytes = strG0.getBytes(charset);
                                    bytes.getClass();
                                    n4Var2.y(bytes.length);
                                    return eu.v(new UByteArray(Arrays.copyOf(bytes, bytes.length)));
                                } catch (Throwable th) {
                                    return eu.u(th);
                                }
                            case 1:
                                objArr.getClass();
                                try {
                                    sp0.a0(2, objArr);
                                    return eu.v(n4Var2.p(sp0.Y("value", objArr[0]), sp0.X("fatal", objArr[1])));
                                } catch (Throwable th2) {
                                    return eu.u(th2);
                                }
                            case 2:
                                objArr.getClass();
                                try {
                                    sp0.a0(3, objArr);
                                    byte[] bArrY = sp0.Y("value", objArr[0]);
                                    boolean zX = sp0.X("urlSafe", objArr[1]);
                                    boolean zX2 = sp0.X("padding", objArr[2]);
                                    n4Var2.y(bArrY.length);
                                    Base64.Encoder urlEncoder = zX ? Base64.getUrlEncoder() : Base64.getEncoder();
                                    if (!zX2) {
                                        urlEncoder = urlEncoder.withoutPadding();
                                    }
                                    String strEncodeToString = urlEncoder.encodeToString(bArrY);
                                    strEncodeToString.getClass();
                                    return eu.v(strEncodeToString);
                                } catch (Throwable th3) {
                                    return eu.u(th3);
                                }
                            case 3:
                                objArr.getClass();
                                try {
                                    sp0.a0(3, objArr);
                                    byte[] bArrN = n4Var2.n(sp0.g0("value", objArr[0]), sp0.X("urlSafe", objArr[1]), sp0.X("allowWhitespace", objArr[2]));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrN, bArrN.length)));
                                } catch (Throwable th4) {
                                    return eu.u(th4);
                                }
                            case 4:
                                objArr.getClass();
                                try {
                                    sp0.a0(2, objArr);
                                    byte[] bArrY2 = sp0.Y("value", objArr[0]);
                                    boolean zX3 = sp0.X("uppercase", objArr[1]);
                                    n4Var2.y(bArrY2.length);
                                    String str = zX3 ? "0123456789ABCDEF" : "0123456789abcdef";
                                    StringBuilder sb = new StringBuilder(bArrY2.length * 2);
                                    for (byte b : bArrY2) {
                                        sb.append(str.charAt((b & 255) >>> 4));
                                        sb.append(str.charAt(b & 15));
                                    }
                                    return eu.v(sb.toString());
                                } catch (Throwable th5) {
                                    return eu.u(th5);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    byte[] bArrO = n4Var2.o(sp0.g0("value", objArr[0]));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrO, bArrO.length)));
                                } catch (Throwable th6) {
                                    return eu.u(th6);
                                }
                        }
                    }
                });
                fs1Var.b("randomBytes", new xn0() { // from class: td2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xn0
                    public final Object b(Object[] objArr) {
                        int i9 = i4;
                        v20 v20Var2 = v20Var;
                        switch (i9) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.a0(0, objArr);
                                    byte[] bArrG = v20Var2.g(16);
                                    bArrG[6] = (byte) ((bArrG[6] & 15) | 64);
                                    bArrG[8] = (byte) ((bArrG[8] & 63) | 128);
                                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrG);
                                    String string = new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong()).toString();
                                    string.getClass();
                                    return eu.v(string);
                                } catch (Throwable th) {
                                    return eu.u(th);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    byte[] bArrG2 = v20Var2.g((int) sp0.d0(objArr[0], "length", 0L, 2147483647L));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrG2, bArrG2.length)));
                                } catch (Throwable th2) {
                                    return eu.u(th2);
                                }
                        }
                    }
                });
                final int i9 = 0;
                fs1Var.b("randomUUID", new xn0() { // from class: td2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xn0
                    public final Object b(Object[] objArr) {
                        int i92 = i9;
                        v20 v20Var2 = v20Var;
                        switch (i92) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.a0(0, objArr);
                                    byte[] bArrG = v20Var2.g(16);
                                    bArrG[6] = (byte) ((bArrG[6] & 15) | 64);
                                    bArrG[8] = (byte) ((bArrG[8] & 63) | 128);
                                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrG);
                                    String string = new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong()).toString();
                                    string.getClass();
                                    return eu.v(string);
                                } catch (Throwable th) {
                                    return eu.u(th);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.a0(1, objArr);
                                    byte[] bArrG2 = v20Var2.g((int) sp0.d0(objArr[0], "length", 0L, 2147483647L));
                                    return eu.v(new UByteArray(Arrays.copyOf(bArrG2, bArrG2.length)));
                                } catch (Throwable th2) {
                                    return eu.u(th2);
                                }
                        }
                    }
                });
                fs1Var.a("digest", new he2(v20Var, i9));
                fs1Var.a("hmac", new he2(v20Var, i4));
                fs1Var.b("timingSafeEqual", new ud2());
                fs1Var.a("aesGcmEncrypt", new he2(v20Var, i3));
                fs1Var.a("aesGcmDecrypt", new he2(v20Var, 3));
                fs1Var.a("pbkdf2", new he2(v20Var, 4));
                fs1Var.a("hkdf", new he2(v20Var, 5));
                fs1Var.a("fsExists", new je2(dq1Var, 0));
                fs1Var.a("fsStat", new je2(dq1Var, 1));
                fs1Var.a("fsList", new je2(dq1Var, 2));
                fs1Var.a("fsReadBytes", new je2(dq1Var, 3));
                fs1Var.a("fsReadText", new je2(dq1Var, 4));
                fs1Var.a("fsWriteBytes", new je2(dq1Var, 5));
                fs1Var.a("fsWriteText", new je2(dq1Var, 6));
                fs1Var.a("fsCreateDirectory", new je2(dq1Var, 7));
                fs1Var.a("fsRemove", new je2(dq1Var, 8));
                fs1Var.a("fsCopy", new je2(dq1Var, 9));
                fs1Var.a("fsMove", new je2(dq1Var, 10));
                fs1Var.a("httpFetch", new ve2(jw0Var, 0));
                fs1Var.a("httpDownload", new ve2(jw0Var, 1));
                break;
            case 4:
                p7.A((j20) obj4, null, new nk2((cq1) obj6, ((Boolean) obj).booleanValue(), (Context) obj5, (xk1) obj3, (xk1) obj2, null), 3);
                break;
            default:
                us1 us1Var = (us1) obj5;
                k03 k03Var = (k03) obj4;
                t91 t91Var = (t91) obj3;
                ft2 ft2Var = (ft2) obj2;
                t61 t61Var = (t61) obj;
                t61Var.a();
                sp spVar = t61Var.h;
                float fG = ((v30) obj6).c.g();
                if (fG != 0.0f) {
                    long j3 = k03Var.b;
                    int i10 = f13.c;
                    int iP = us1Var.p((int) (j3 >> 32));
                    z03 z03VarD = t91Var.d();
                    o62 o62VarC = z03VarD != null ? z03VarD.a.c(iP) : new o62(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(t61Var.A(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = o62VarC.a + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (spVar.d() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(o62VarC.b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(o62VarC.d)) & 4294967295L);
                    qp qpVar = spVar.h.c;
                    q9 q9VarI = spVar.k;
                    if (q9VarI == null) {
                        q9VarI = pp0.i();
                        q9VarI.r(1);
                        spVar.k = q9VarI;
                    }
                    Paint paint = (Paint) q9VarI.c;
                    ft2Var.a(fG, spVar.d(), q9VarI);
                    if (!t11.l((cl) q9VarI.e, null)) {
                        q9VarI.l(null);
                    }
                    if (q9VarI.b != 3) {
                        q9VarI.j(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        q9VarI.q(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (q9VarI.f() == 0) {
                        i = 0;
                    } else {
                        i = 0;
                        q9VarI.o(0);
                    }
                    if (q9VarI.g() != 0) {
                        q9VarI.p(i);
                    }
                    if (!paint.isFilterBitmap()) {
                        q9VarI.m(1);
                    }
                    qpVar.m(jFloatToRawIntBits, jFloatToRawIntBits2, q9VarI);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ h9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
        this.m = obj5;
    }
}
