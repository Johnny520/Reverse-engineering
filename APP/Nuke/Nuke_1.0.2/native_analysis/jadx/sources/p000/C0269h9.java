package p000;

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

/* JADX INFO: renamed from: h9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0269h9 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3902h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f3903i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f3904j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f3905k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f3906l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f3907m;

    public /* synthetic */ C0269h9(v30 v30Var, us1 us1Var, k03 k03Var, t91 t91Var, ft2 ft2Var) {
        this.f3902h = 5;
        this.f3904j = v30Var;
        this.f3905k = us1Var;
        this.f3903i = k03Var;
        this.f3906l = t91Var;
        this.f3907m = ft2Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        boolean z;
        int i;
        int i2 = this.f3902h;
        a83 a83Var = a83.f116a;
        final int i3 = 2;
        Object obj2 = this.f3907m;
        Object obj3 = this.f3906l;
        Object obj4 = this.f3903i;
        Object obj5 = this.f3905k;
        Object obj6 = this.f3904j;
        final int i4 = 1;
        switch (i2) {
            case 0:
                u91 u91Var = (u91) obj;
                m91 m91Var = ((C0416l9) obj6).f5986a;
                u91Var.f11164h = (k03) obj4;
                u91Var.f11165i = (xx0) obj5;
                u91Var.f11159c = (C0444m0) obj3;
                u91Var.f11160d = (in0) obj2;
                u91Var.f11161e = m91Var != null ? m91Var.f6522w : null;
                u91Var.f11162f = m91Var != null ? m91Var.f6523x : null;
                u91Var.f11163g = m91Var != null ? (za3) p40.m3733p(m91Var, AbstractC0441ly.f6394t) : null;
                break;
            case 1:
                s81 s81Var = (s81) obj;
                s81Var.getClass();
                s81.m4760a(s81Var, null, new C0402kw(367456076, true, new fr1((List) obj4, (wm0) obj6, (View) obj5, (rs2) obj3, (mn0) obj2, 1)), 3);
                break;
            case 2:
                si1 si1Var = (si1) obj4;
                o72 o72Var = (o72) obj6;
                z62 z62Var = (z62) obj5;
                im2 im2Var = (im2) obj3;
                y62 y62Var = (y62) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                oi1 oi1VarM4869g = si1.m4869g(si1Var.f10150g);
                if (oi1VarM4869g != null) {
                    sz0 sz0Var = si1Var.f4715e;
                    long j = oi1VarM4869g.f7687b;
                    long j2 = oi1VarM4869g.f7686a;
                    z = true;
                    ((bb2) sz0Var.f10436i).m509a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((bb2) sz0Var.f10437j).m509a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    oi1 oi1VarM3563a = ((oi1) o72Var.f7574i).m3563a(oi1VarM4869g);
                    o72Var.f7574i = oi1VarM3563a;
                    z62Var.f13745h = im2Var.m2372i(im2Var.m2368e(oi1VarM3563a.f7686a));
                    y62Var.f13324h = !rp0.m4533S(r0 - fFloatValue);
                } else {
                    z = true;
                }
                break;
            case 3:
                vn1 vn1Var = (vn1) obj4;
                final C0485n4 c0485n4 = (C0485n4) obj6;
                final v20 v20Var = (v20) obj5;
                dq1 dq1Var = (dq1) obj3;
                jw0 jw0Var = (jw0) obj2;
                fs1 fs1Var = (fs1) obj;
                fs1Var.getClass();
                fs1Var.m1716b("runtimeInfo", new vd2(vn1Var, 8));
                fs1Var.m1716b("hasPermission", new vd2(vn1Var, 0));
                fs1Var.m1716b("configSnapshot", new vd2(vn1Var, i4));
                fs1Var.m1716b("log", new vd2(vn1Var, i3));
                fs1Var.m1716b("minimumIntervalMillis", new vd2(vn1Var, 3));
                fs1Var.m1716b("maximumActiveTimers", new vd2(vn1Var, 4));
                fs1Var.m1715a("sleep", ye2.f13430a);
                fs1Var.m1716b("messagingTakeEvent", new vd2(vn1Var, 5));
                fs1Var.m1715a("messagingSendMessage", new yd2(vn1Var, 9));
                fs1Var.m1715a("messagingDownloadMedia", new yd2(vn1Var, 0));
                fs1Var.m1715a("hostObjectGet", new yd2(vn1Var, 1));
                fs1Var.m1715a("hostObjectCall", new yd2(vn1Var, 2));
                fs1Var.m1716b("hostObjectRelease", new vd2(vn1Var, 6));
                fs1Var.m1716b("hostContext", new vd2(vn1Var, 7));
                fs1Var.m1716b("hostClassLoader", new vd2(vn1Var, 9));
                fs1Var.m1716b("hostFindClass", new vd2(vn1Var, 15));
                fs1Var.m1715a("hostGetStatic", new yd2(vn1Var, 3));
                fs1Var.m1715a("hostCallStatic", new yd2(vn1Var, 4));
                fs1Var.m1715a("hostConstruct", new yd2(vn1Var, 5));
                fs1Var.m1715a("uiToast", new yd2(vn1Var, 6));
                fs1Var.m1715a("uiAlert", new yd2(vn1Var, 7));
                fs1Var.m1715a("uiConfirm", new yd2(vn1Var, 8));
                final int i5 = 0;
                fs1Var.m1716b("encodeUtf8", new xn0() { // from class: wd2
                    @Override // p000.xn0
                    /* JADX INFO: renamed from: b */
                    public final Object mo5172b(Object[] objArr) {
                        int i6 = i5;
                        C0485n4 c0485n42 = c0485n4;
                        switch (i6) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    String strM4941g0 = sp0.m4941g0("value", objArr[0]);
                                    Charset charset = StandardCharsets.UTF_8;
                                    charset.getClass();
                                    byte[] bytes = strM4941g0.getBytes(charset);
                                    bytes.getClass();
                                    c0485n42.m3246y(bytes.length);
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bytes, bytes.length)));
                                } catch (Throwable th) {
                                    return AbstractC0179eu.m1471u(th);
                                }
                            case 1:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(2, objArr);
                                    return AbstractC0179eu.m1472v(c0485n42.m3240p(sp0.m4926Y("value", objArr[0]), sp0.m4925X("fatal", objArr[1])));
                                } catch (Throwable th2) {
                                    return AbstractC0179eu.m1471u(th2);
                                }
                            case 2:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(3, objArr);
                                    byte[] bArrM4926Y = sp0.m4926Y("value", objArr[0]);
                                    boolean zM4925X = sp0.m4925X("urlSafe", objArr[1]);
                                    boolean zM4925X2 = sp0.m4925X("padding", objArr[2]);
                                    c0485n42.m3246y(bArrM4926Y.length);
                                    Base64.Encoder urlEncoder = zM4925X ? Base64.getUrlEncoder() : Base64.getEncoder();
                                    if (!zM4925X2) {
                                        urlEncoder = urlEncoder.withoutPadding();
                                    }
                                    String strEncodeToString = urlEncoder.encodeToString(bArrM4926Y);
                                    strEncodeToString.getClass();
                                    return AbstractC0179eu.m1472v(strEncodeToString);
                                } catch (Throwable th3) {
                                    return AbstractC0179eu.m1471u(th3);
                                }
                            case 3:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(3, objArr);
                                    byte[] bArrM3238n = c0485n42.m3238n(sp0.m4941g0("value", objArr[0]), sp0.m4925X("urlSafe", objArr[1]), sp0.m4925X("allowWhitespace", objArr[2]));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM3238n, bArrM3238n.length)));
                                } catch (Throwable th4) {
                                    return AbstractC0179eu.m1471u(th4);
                                }
                            case 4:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(2, objArr);
                                    byte[] bArrM4926Y2 = sp0.m4926Y("value", objArr[0]);
                                    boolean zM4925X3 = sp0.m4925X("uppercase", objArr[1]);
                                    c0485n42.m3246y(bArrM4926Y2.length);
                                    String str = zM4925X3 ? "0123456789ABCDEF" : "0123456789abcdef";
                                    StringBuilder sb = new StringBuilder(bArrM4926Y2.length * 2);
                                    for (byte b : bArrM4926Y2) {
                                        sb.append(str.charAt((b & 255) >>> 4));
                                        sb.append(str.charAt(b & 15));
                                    }
                                    return AbstractC0179eu.m1472v(sb.toString());
                                } catch (Throwable th5) {
                                    return AbstractC0179eu.m1471u(th5);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    byte[] bArrM3239o = c0485n42.m3239o(sp0.m4941g0("value", objArr[0]));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM3239o, bArrM3239o.length)));
                                } catch (Throwable th6) {
                                    return AbstractC0179eu.m1471u(th6);
                                }
                        }
                    }
                });
                fs1Var.m1716b("decodeUtf8", new xn0() { // from class: wd2
                    @Override // p000.xn0
                    /* JADX INFO: renamed from: b */
                    public final Object mo5172b(Object[] objArr) {
                        int i6 = i4;
                        C0485n4 c0485n42 = c0485n4;
                        switch (i6) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    String strM4941g0 = sp0.m4941g0("value", objArr[0]);
                                    Charset charset = StandardCharsets.UTF_8;
                                    charset.getClass();
                                    byte[] bytes = strM4941g0.getBytes(charset);
                                    bytes.getClass();
                                    c0485n42.m3246y(bytes.length);
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bytes, bytes.length)));
                                } catch (Throwable th) {
                                    return AbstractC0179eu.m1471u(th);
                                }
                            case 1:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(2, objArr);
                                    return AbstractC0179eu.m1472v(c0485n42.m3240p(sp0.m4926Y("value", objArr[0]), sp0.m4925X("fatal", objArr[1])));
                                } catch (Throwable th2) {
                                    return AbstractC0179eu.m1471u(th2);
                                }
                            case 2:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(3, objArr);
                                    byte[] bArrM4926Y = sp0.m4926Y("value", objArr[0]);
                                    boolean zM4925X = sp0.m4925X("urlSafe", objArr[1]);
                                    boolean zM4925X2 = sp0.m4925X("padding", objArr[2]);
                                    c0485n42.m3246y(bArrM4926Y.length);
                                    Base64.Encoder urlEncoder = zM4925X ? Base64.getUrlEncoder() : Base64.getEncoder();
                                    if (!zM4925X2) {
                                        urlEncoder = urlEncoder.withoutPadding();
                                    }
                                    String strEncodeToString = urlEncoder.encodeToString(bArrM4926Y);
                                    strEncodeToString.getClass();
                                    return AbstractC0179eu.m1472v(strEncodeToString);
                                } catch (Throwable th3) {
                                    return AbstractC0179eu.m1471u(th3);
                                }
                            case 3:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(3, objArr);
                                    byte[] bArrM3238n = c0485n42.m3238n(sp0.m4941g0("value", objArr[0]), sp0.m4925X("urlSafe", objArr[1]), sp0.m4925X("allowWhitespace", objArr[2]));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM3238n, bArrM3238n.length)));
                                } catch (Throwable th4) {
                                    return AbstractC0179eu.m1471u(th4);
                                }
                            case 4:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(2, objArr);
                                    byte[] bArrM4926Y2 = sp0.m4926Y("value", objArr[0]);
                                    boolean zM4925X3 = sp0.m4925X("uppercase", objArr[1]);
                                    c0485n42.m3246y(bArrM4926Y2.length);
                                    String str = zM4925X3 ? "0123456789ABCDEF" : "0123456789abcdef";
                                    StringBuilder sb = new StringBuilder(bArrM4926Y2.length * 2);
                                    for (byte b : bArrM4926Y2) {
                                        sb.append(str.charAt((b & 255) >>> 4));
                                        sb.append(str.charAt(b & 15));
                                    }
                                    return AbstractC0179eu.m1472v(sb.toString());
                                } catch (Throwable th5) {
                                    return AbstractC0179eu.m1471u(th5);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    byte[] bArrM3239o = c0485n42.m3239o(sp0.m4941g0("value", objArr[0]));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM3239o, bArrM3239o.length)));
                                } catch (Throwable th6) {
                                    return AbstractC0179eu.m1471u(th6);
                                }
                        }
                    }
                });
                fs1Var.m1716b("encodeBase64", new xn0() { // from class: wd2
                    @Override // p000.xn0
                    /* JADX INFO: renamed from: b */
                    public final Object mo5172b(Object[] objArr) {
                        int i6 = i3;
                        C0485n4 c0485n42 = c0485n4;
                        switch (i6) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    String strM4941g0 = sp0.m4941g0("value", objArr[0]);
                                    Charset charset = StandardCharsets.UTF_8;
                                    charset.getClass();
                                    byte[] bytes = strM4941g0.getBytes(charset);
                                    bytes.getClass();
                                    c0485n42.m3246y(bytes.length);
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bytes, bytes.length)));
                                } catch (Throwable th) {
                                    return AbstractC0179eu.m1471u(th);
                                }
                            case 1:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(2, objArr);
                                    return AbstractC0179eu.m1472v(c0485n42.m3240p(sp0.m4926Y("value", objArr[0]), sp0.m4925X("fatal", objArr[1])));
                                } catch (Throwable th2) {
                                    return AbstractC0179eu.m1471u(th2);
                                }
                            case 2:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(3, objArr);
                                    byte[] bArrM4926Y = sp0.m4926Y("value", objArr[0]);
                                    boolean zM4925X = sp0.m4925X("urlSafe", objArr[1]);
                                    boolean zM4925X2 = sp0.m4925X("padding", objArr[2]);
                                    c0485n42.m3246y(bArrM4926Y.length);
                                    Base64.Encoder urlEncoder = zM4925X ? Base64.getUrlEncoder() : Base64.getEncoder();
                                    if (!zM4925X2) {
                                        urlEncoder = urlEncoder.withoutPadding();
                                    }
                                    String strEncodeToString = urlEncoder.encodeToString(bArrM4926Y);
                                    strEncodeToString.getClass();
                                    return AbstractC0179eu.m1472v(strEncodeToString);
                                } catch (Throwable th3) {
                                    return AbstractC0179eu.m1471u(th3);
                                }
                            case 3:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(3, objArr);
                                    byte[] bArrM3238n = c0485n42.m3238n(sp0.m4941g0("value", objArr[0]), sp0.m4925X("urlSafe", objArr[1]), sp0.m4925X("allowWhitespace", objArr[2]));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM3238n, bArrM3238n.length)));
                                } catch (Throwable th4) {
                                    return AbstractC0179eu.m1471u(th4);
                                }
                            case 4:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(2, objArr);
                                    byte[] bArrM4926Y2 = sp0.m4926Y("value", objArr[0]);
                                    boolean zM4925X3 = sp0.m4925X("uppercase", objArr[1]);
                                    c0485n42.m3246y(bArrM4926Y2.length);
                                    String str = zM4925X3 ? "0123456789ABCDEF" : "0123456789abcdef";
                                    StringBuilder sb = new StringBuilder(bArrM4926Y2.length * 2);
                                    for (byte b : bArrM4926Y2) {
                                        sb.append(str.charAt((b & 255) >>> 4));
                                        sb.append(str.charAt(b & 15));
                                    }
                                    return AbstractC0179eu.m1472v(sb.toString());
                                } catch (Throwable th5) {
                                    return AbstractC0179eu.m1471u(th5);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    byte[] bArrM3239o = c0485n42.m3239o(sp0.m4941g0("value", objArr[0]));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM3239o, bArrM3239o.length)));
                                } catch (Throwable th6) {
                                    return AbstractC0179eu.m1471u(th6);
                                }
                        }
                    }
                });
                final int i6 = 3;
                fs1Var.m1716b("decodeBase64", new xn0() { // from class: wd2
                    @Override // p000.xn0
                    /* JADX INFO: renamed from: b */
                    public final Object mo5172b(Object[] objArr) {
                        int i62 = i6;
                        C0485n4 c0485n42 = c0485n4;
                        switch (i62) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    String strM4941g0 = sp0.m4941g0("value", objArr[0]);
                                    Charset charset = StandardCharsets.UTF_8;
                                    charset.getClass();
                                    byte[] bytes = strM4941g0.getBytes(charset);
                                    bytes.getClass();
                                    c0485n42.m3246y(bytes.length);
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bytes, bytes.length)));
                                } catch (Throwable th) {
                                    return AbstractC0179eu.m1471u(th);
                                }
                            case 1:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(2, objArr);
                                    return AbstractC0179eu.m1472v(c0485n42.m3240p(sp0.m4926Y("value", objArr[0]), sp0.m4925X("fatal", objArr[1])));
                                } catch (Throwable th2) {
                                    return AbstractC0179eu.m1471u(th2);
                                }
                            case 2:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(3, objArr);
                                    byte[] bArrM4926Y = sp0.m4926Y("value", objArr[0]);
                                    boolean zM4925X = sp0.m4925X("urlSafe", objArr[1]);
                                    boolean zM4925X2 = sp0.m4925X("padding", objArr[2]);
                                    c0485n42.m3246y(bArrM4926Y.length);
                                    Base64.Encoder urlEncoder = zM4925X ? Base64.getUrlEncoder() : Base64.getEncoder();
                                    if (!zM4925X2) {
                                        urlEncoder = urlEncoder.withoutPadding();
                                    }
                                    String strEncodeToString = urlEncoder.encodeToString(bArrM4926Y);
                                    strEncodeToString.getClass();
                                    return AbstractC0179eu.m1472v(strEncodeToString);
                                } catch (Throwable th3) {
                                    return AbstractC0179eu.m1471u(th3);
                                }
                            case 3:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(3, objArr);
                                    byte[] bArrM3238n = c0485n42.m3238n(sp0.m4941g0("value", objArr[0]), sp0.m4925X("urlSafe", objArr[1]), sp0.m4925X("allowWhitespace", objArr[2]));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM3238n, bArrM3238n.length)));
                                } catch (Throwable th4) {
                                    return AbstractC0179eu.m1471u(th4);
                                }
                            case 4:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(2, objArr);
                                    byte[] bArrM4926Y2 = sp0.m4926Y("value", objArr[0]);
                                    boolean zM4925X3 = sp0.m4925X("uppercase", objArr[1]);
                                    c0485n42.m3246y(bArrM4926Y2.length);
                                    String str = zM4925X3 ? "0123456789ABCDEF" : "0123456789abcdef";
                                    StringBuilder sb = new StringBuilder(bArrM4926Y2.length * 2);
                                    for (byte b : bArrM4926Y2) {
                                        sb.append(str.charAt((b & 255) >>> 4));
                                        sb.append(str.charAt(b & 15));
                                    }
                                    return AbstractC0179eu.m1472v(sb.toString());
                                } catch (Throwable th5) {
                                    return AbstractC0179eu.m1471u(th5);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    byte[] bArrM3239o = c0485n42.m3239o(sp0.m4941g0("value", objArr[0]));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM3239o, bArrM3239o.length)));
                                } catch (Throwable th6) {
                                    return AbstractC0179eu.m1471u(th6);
                                }
                        }
                    }
                });
                final int i7 = 4;
                fs1Var.m1716b("encodeHex", new xn0() { // from class: wd2
                    @Override // p000.xn0
                    /* JADX INFO: renamed from: b */
                    public final Object mo5172b(Object[] objArr) {
                        int i62 = i7;
                        C0485n4 c0485n42 = c0485n4;
                        switch (i62) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    String strM4941g0 = sp0.m4941g0("value", objArr[0]);
                                    Charset charset = StandardCharsets.UTF_8;
                                    charset.getClass();
                                    byte[] bytes = strM4941g0.getBytes(charset);
                                    bytes.getClass();
                                    c0485n42.m3246y(bytes.length);
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bytes, bytes.length)));
                                } catch (Throwable th) {
                                    return AbstractC0179eu.m1471u(th);
                                }
                            case 1:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(2, objArr);
                                    return AbstractC0179eu.m1472v(c0485n42.m3240p(sp0.m4926Y("value", objArr[0]), sp0.m4925X("fatal", objArr[1])));
                                } catch (Throwable th2) {
                                    return AbstractC0179eu.m1471u(th2);
                                }
                            case 2:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(3, objArr);
                                    byte[] bArrM4926Y = sp0.m4926Y("value", objArr[0]);
                                    boolean zM4925X = sp0.m4925X("urlSafe", objArr[1]);
                                    boolean zM4925X2 = sp0.m4925X("padding", objArr[2]);
                                    c0485n42.m3246y(bArrM4926Y.length);
                                    Base64.Encoder urlEncoder = zM4925X ? Base64.getUrlEncoder() : Base64.getEncoder();
                                    if (!zM4925X2) {
                                        urlEncoder = urlEncoder.withoutPadding();
                                    }
                                    String strEncodeToString = urlEncoder.encodeToString(bArrM4926Y);
                                    strEncodeToString.getClass();
                                    return AbstractC0179eu.m1472v(strEncodeToString);
                                } catch (Throwable th3) {
                                    return AbstractC0179eu.m1471u(th3);
                                }
                            case 3:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(3, objArr);
                                    byte[] bArrM3238n = c0485n42.m3238n(sp0.m4941g0("value", objArr[0]), sp0.m4925X("urlSafe", objArr[1]), sp0.m4925X("allowWhitespace", objArr[2]));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM3238n, bArrM3238n.length)));
                                } catch (Throwable th4) {
                                    return AbstractC0179eu.m1471u(th4);
                                }
                            case 4:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(2, objArr);
                                    byte[] bArrM4926Y2 = sp0.m4926Y("value", objArr[0]);
                                    boolean zM4925X3 = sp0.m4925X("uppercase", objArr[1]);
                                    c0485n42.m3246y(bArrM4926Y2.length);
                                    String str = zM4925X3 ? "0123456789ABCDEF" : "0123456789abcdef";
                                    StringBuilder sb = new StringBuilder(bArrM4926Y2.length * 2);
                                    for (byte b : bArrM4926Y2) {
                                        sb.append(str.charAt((b & 255) >>> 4));
                                        sb.append(str.charAt(b & 15));
                                    }
                                    return AbstractC0179eu.m1472v(sb.toString());
                                } catch (Throwable th5) {
                                    return AbstractC0179eu.m1471u(th5);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    byte[] bArrM3239o = c0485n42.m3239o(sp0.m4941g0("value", objArr[0]));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM3239o, bArrM3239o.length)));
                                } catch (Throwable th6) {
                                    return AbstractC0179eu.m1471u(th6);
                                }
                        }
                    }
                });
                final int i8 = 5;
                fs1Var.m1716b("decodeHex", new xn0() { // from class: wd2
                    @Override // p000.xn0
                    /* JADX INFO: renamed from: b */
                    public final Object mo5172b(Object[] objArr) {
                        int i62 = i8;
                        C0485n4 c0485n42 = c0485n4;
                        switch (i62) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    String strM4941g0 = sp0.m4941g0("value", objArr[0]);
                                    Charset charset = StandardCharsets.UTF_8;
                                    charset.getClass();
                                    byte[] bytes = strM4941g0.getBytes(charset);
                                    bytes.getClass();
                                    c0485n42.m3246y(bytes.length);
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bytes, bytes.length)));
                                } catch (Throwable th) {
                                    return AbstractC0179eu.m1471u(th);
                                }
                            case 1:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(2, objArr);
                                    return AbstractC0179eu.m1472v(c0485n42.m3240p(sp0.m4926Y("value", objArr[0]), sp0.m4925X("fatal", objArr[1])));
                                } catch (Throwable th2) {
                                    return AbstractC0179eu.m1471u(th2);
                                }
                            case 2:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(3, objArr);
                                    byte[] bArrM4926Y = sp0.m4926Y("value", objArr[0]);
                                    boolean zM4925X = sp0.m4925X("urlSafe", objArr[1]);
                                    boolean zM4925X2 = sp0.m4925X("padding", objArr[2]);
                                    c0485n42.m3246y(bArrM4926Y.length);
                                    Base64.Encoder urlEncoder = zM4925X ? Base64.getUrlEncoder() : Base64.getEncoder();
                                    if (!zM4925X2) {
                                        urlEncoder = urlEncoder.withoutPadding();
                                    }
                                    String strEncodeToString = urlEncoder.encodeToString(bArrM4926Y);
                                    strEncodeToString.getClass();
                                    return AbstractC0179eu.m1472v(strEncodeToString);
                                } catch (Throwable th3) {
                                    return AbstractC0179eu.m1471u(th3);
                                }
                            case 3:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(3, objArr);
                                    byte[] bArrM3238n = c0485n42.m3238n(sp0.m4941g0("value", objArr[0]), sp0.m4925X("urlSafe", objArr[1]), sp0.m4925X("allowWhitespace", objArr[2]));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM3238n, bArrM3238n.length)));
                                } catch (Throwable th4) {
                                    return AbstractC0179eu.m1471u(th4);
                                }
                            case 4:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(2, objArr);
                                    byte[] bArrM4926Y2 = sp0.m4926Y("value", objArr[0]);
                                    boolean zM4925X3 = sp0.m4925X("uppercase", objArr[1]);
                                    c0485n42.m3246y(bArrM4926Y2.length);
                                    String str = zM4925X3 ? "0123456789ABCDEF" : "0123456789abcdef";
                                    StringBuilder sb = new StringBuilder(bArrM4926Y2.length * 2);
                                    for (byte b : bArrM4926Y2) {
                                        sb.append(str.charAt((b & 255) >>> 4));
                                        sb.append(str.charAt(b & 15));
                                    }
                                    return AbstractC0179eu.m1472v(sb.toString());
                                } catch (Throwable th5) {
                                    return AbstractC0179eu.m1471u(th5);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    byte[] bArrM3239o = c0485n42.m3239o(sp0.m4941g0("value", objArr[0]));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM3239o, bArrM3239o.length)));
                                } catch (Throwable th6) {
                                    return AbstractC0179eu.m1471u(th6);
                                }
                        }
                    }
                });
                fs1Var.m1716b("randomBytes", new xn0() { // from class: td2
                    @Override // p000.xn0
                    /* JADX INFO: renamed from: b */
                    public final Object mo5172b(Object[] objArr) {
                        int i9 = i4;
                        v20 v20Var2 = v20Var;
                        switch (i9) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(0, objArr);
                                    byte[] bArrM5609g = v20Var2.m5609g(16);
                                    bArrM5609g[6] = (byte) ((bArrM5609g[6] & 15) | 64);
                                    bArrM5609g[8] = (byte) ((bArrM5609g[8] & 63) | 128);
                                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrM5609g);
                                    String string = new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong()).toString();
                                    string.getClass();
                                    return AbstractC0179eu.m1472v(string);
                                } catch (Throwable th) {
                                    return AbstractC0179eu.m1471u(th);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    byte[] bArrM5609g2 = v20Var2.m5609g((int) sp0.m4935d0(objArr[0], "length", 0L, 2147483647L));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM5609g2, bArrM5609g2.length)));
                                } catch (Throwable th2) {
                                    return AbstractC0179eu.m1471u(th2);
                                }
                        }
                    }
                });
                final int i9 = 0;
                fs1Var.m1716b("randomUUID", new xn0() { // from class: td2
                    @Override // p000.xn0
                    /* JADX INFO: renamed from: b */
                    public final Object mo5172b(Object[] objArr) {
                        int i92 = i9;
                        v20 v20Var2 = v20Var;
                        switch (i92) {
                            case 0:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(0, objArr);
                                    byte[] bArrM5609g = v20Var2.m5609g(16);
                                    bArrM5609g[6] = (byte) ((bArrM5609g[6] & 15) | 64);
                                    bArrM5609g[8] = (byte) ((bArrM5609g[8] & 63) | 128);
                                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrM5609g);
                                    String string = new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong()).toString();
                                    string.getClass();
                                    return AbstractC0179eu.m1472v(string);
                                } catch (Throwable th) {
                                    return AbstractC0179eu.m1471u(th);
                                }
                            default:
                                objArr.getClass();
                                try {
                                    sp0.m4929a0(1, objArr);
                                    byte[] bArrM5609g2 = v20Var2.m5609g((int) sp0.m4935d0(objArr[0], "length", 0L, 2147483647L));
                                    return AbstractC0179eu.m1472v(new UByteArray(Arrays.copyOf(bArrM5609g2, bArrM5609g2.length)));
                                } catch (Throwable th2) {
                                    return AbstractC0179eu.m1471u(th2);
                                }
                        }
                    }
                });
                fs1Var.m1715a("digest", new he2(v20Var, i9));
                fs1Var.m1715a("hmac", new he2(v20Var, i4));
                fs1Var.m1716b("timingSafeEqual", new ud2());
                fs1Var.m1715a("aesGcmEncrypt", new he2(v20Var, i3));
                fs1Var.m1715a("aesGcmDecrypt", new he2(v20Var, 3));
                fs1Var.m1715a("pbkdf2", new he2(v20Var, 4));
                fs1Var.m1715a("hkdf", new he2(v20Var, 5));
                fs1Var.m1715a("fsExists", new je2(dq1Var, 0));
                fs1Var.m1715a("fsStat", new je2(dq1Var, 1));
                fs1Var.m1715a("fsList", new je2(dq1Var, 2));
                fs1Var.m1715a("fsReadBytes", new je2(dq1Var, 3));
                fs1Var.m1715a("fsReadText", new je2(dq1Var, 4));
                fs1Var.m1715a("fsWriteBytes", new je2(dq1Var, 5));
                fs1Var.m1715a("fsWriteText", new je2(dq1Var, 6));
                fs1Var.m1715a("fsCreateDirectory", new je2(dq1Var, 7));
                fs1Var.m1715a("fsRemove", new je2(dq1Var, 8));
                fs1Var.m1715a("fsCopy", new je2(dq1Var, 9));
                fs1Var.m1715a("fsMove", new je2(dq1Var, 10));
                fs1Var.m1715a("httpFetch", new ve2(jw0Var, 0));
                fs1Var.m1715a("httpDownload", new ve2(jw0Var, 1));
                break;
            case 4:
                AbstractC0570p7.m3745A((j20) obj4, null, new nk2((cq1) obj6, ((Boolean) obj).booleanValue(), (Context) obj5, (xk1) obj3, (xk1) obj2, null), 3);
                break;
            default:
                us1 us1Var = (us1) obj5;
                k03 k03Var = (k03) obj4;
                t91 t91Var = (t91) obj3;
                ft2 ft2Var = (ft2) obj2;
                t61 t61Var = (t61) obj;
                t61Var.m5125a();
                C0702sp c0702sp = t61Var.f10581h;
                float fM2591g = ((v30) obj6).f11664c.m2591g();
                if (fM2591g != 0.0f) {
                    long j3 = k03Var.f5297b;
                    int i10 = f13.f2738c;
                    int iMo2451p = us1Var.mo2451p((int) (j3 >> 32));
                    z03 z03VarM5146d = t91Var.m5146d();
                    o62 o62VarM6203c = z03VarM5146d != null ? z03VarM5146d.f13697a.m6203c(iMo2451p) : new o62(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(t61Var.mo689A(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = o62VarM6203c.f7536a + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c0702sp.mo3280d() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(o62VarM6203c.f7537b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(o62VarM6203c.f7539d)) & 4294967295L);
                    InterfaceC0627qp interfaceC0627qp = c0702sp.f10256h.f9667c;
                    C0611q9 c0611q9M3911i = c0702sp.f10259k;
                    if (c0611q9M3911i == null) {
                        c0611q9M3911i = pp0.m3911i();
                        c0611q9M3911i.m4102r(1);
                        c0702sp.f10259k = c0611q9M3911i;
                    }
                    Paint paint = (Paint) c0611q9M3911i.f8830c;
                    ft2Var.mo234a(fM2591g, c0702sp.mo3280d(), c0611q9M3911i);
                    if (!t11.m5086l((C0095cl) c0611q9M3911i.f8832e, null)) {
                        c0611q9M3911i.m4096l(null);
                    }
                    if (c0611q9M3911i.f8829b != 3) {
                        c0611q9M3911i.m4094j(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        c0611q9M3911i.m4101q(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (c0611q9M3911i.m4090f() == 0) {
                        i = 0;
                    } else {
                        i = 0;
                        c0611q9M3911i.m4099o(0);
                    }
                    if (c0611q9M3911i.m4091g() != 0) {
                        c0611q9M3911i.m4100p(i);
                    }
                    if (!paint.isFilterBitmap()) {
                        c0611q9M3911i.m4097m(1);
                    }
                    interfaceC0627qp.mo1523m(jFloatToRawIntBits, jFloatToRawIntBits2, c0611q9M3911i);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0269h9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f3902h = i;
        this.f3903i = obj;
        this.f3904j = obj2;
        this.f3905k = obj3;
        this.f3906l = obj4;
        this.f3907m = obj5;
    }
}
