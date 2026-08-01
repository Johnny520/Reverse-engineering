package com.bumptech.glide;

import android.graphics.Bitmap;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import com.bumptech.glide.AbstractC1923e;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.dartcv.nuke.R;
import p000A.C0021K0;
import p000A.C0049a;
import p000A.C0078o0;
import p000A.EnumC0050a0;
import p007B0.C0190d;
import p008B1.C0214b;
import p023E0.AbstractC0277a;
import p028F.AbstractC0350k;
import p029F0.InterfaceC0430v;
import p037G2.C0508t;
import p040H.C0545c;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0551B;
import p041H0.C0564I;
import p041H0.C0590e0;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p041H0.InterfaceC0597i;
import p047I0.AbstractC0740k;
import p047I0.AbstractC0757q0;
import p047I0.InterfaceC0697T0;
import p049I2.C0793k;
import p056K2.AbstractC0885k;
import p056K2.C0884j;
import p056K2.C0891q;
import p058L.AbstractC0903E;
import p058L.C0920W;
import p058L.C0934f;
import p058L.C0939k;
import p058L.InterfaceC0940l;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p063M0.InterfaceC0993a;
import p074O2.C1047e;
import p074O2.C1052j;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1048f;
import p074O2.InterfaceC1051i;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1126m;
import p077P0.C1114a;
import p077P0.C1128o;
import p077P0.C1129p;
import p077P0.InterfaceC1136w;
import p079P2.C1153b;
import p079P2.C1154c;
import p079P2.C1155d;
import p079P2.C1156e;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1176a;
import p084Q2.AbstractC1178c;
import p092S0.C1286x;
import p095T.AbstractC1384r0;
import p095T.AbstractC1385s;
import p095T.AbstractC1387t;
import p095T.AbstractC1391v;
import p095T.C1308D0;
import p095T.C1316H0;
import p095T.C1324L0;
import p095T.C1349a;
import p095T.C1357e;
import p095T.C1366i0;
import p095T.C1371l;
import p095T.C1377o;
import p095T.C1383r;
import p095T.C1386s0;
import p095T.C1388t0;
import p095T.InterfaceC1306C0;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p113W3.C1608a;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p118X3.C1706p;
import p118X3.EnumC1716z;
import p123Y3.AbstractC1774e;
import p127Z2.AbstractC1784a;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p137b3.InterfaceC1854b;
import p147d1.EnumC1960j;
import p149d3.AbstractC1973a;
import p149d3.AbstractC1976d;
import p149d3.AbstractC1983k;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p160f3.AbstractC2153p;
import p163g0.C2178j;
import p169h0.AbstractC2192a;
import p169h0.AbstractC2206o;
import p169h0.C2194c;
import p169h0.C2196e;
import p169h0.C2204m;
import p169h0.InterfaceC2195d;
import p169h0.InterfaceC2207p;
import p176i1.AbstractC2298n;
import p176i1.C2283D;
import p176i1.EnumC2284E;
import p181j0.ViewOnAttachStateChangeListenerC2369d;
import p186k.C2404A;
import p186k.C2439u;
import p190k3.C2458f;
import p193l0.C2481d;
import p204n0.C2684c;
import p204n0.C2685d;
import p211o0.AbstractC2767z;
import p211o0.C2740O;
import p211o0.C2743b;
import p211o0.C2747f;
import p211o0.C2762u;
import p211o0.InterfaceC2760s;
import p213o2.C2787p;
import p213o2.C2791t;
import p213o2.C2792u;
import p222q0.C2900a;
import p222q0.C2901b;
import p222q0.InterfaceC2903d;
import p225q3.InterfaceC2933d;
import p229r1.AbstractC3092v;
import p229r1.C3091u;
import p236s3.C3199o;
import p244u.AbstractC3255Y;
import p244u.AbstractC3261c;
import p244u.C3256Z;
import p244u.C3259b;
import p245u0.AbstractC3300G;
import p245u0.C3308e;
import p245u0.C3309f;
import p257w1.C3389a;

/* JADX INFO: renamed from: com.bumptech.glide.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1923e {

    /* JADX INFO: renamed from: a */
    public static C3309f f6523a;

    /* JADX INFO: renamed from: b */
    public static boolean f6524b;

    /* JADX INFO: renamed from: c */
    public static Method f6525c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final InterfaceC1854b m3443A(InterfaceC2933d interfaceC2933d) {
        AbstractC1665j.m2985e(interfaceC2933d, "<this>");
        if (interfaceC2933d instanceof C3199o) {
            return m3443A(((C3199o) interfaceC2933d).f9971a);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final C3389a m3444B(View view) {
        C3389a c3389a = (C3389a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c3389a != null) {
            return c3389a;
        }
        C3389a c3389a2 = new C3389a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c3389a2);
        return c3389a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final C3309f m3445D() {
        C3309f c3309f = f6523a;
        if (c3309f != null) {
            return c3309f;
        }
        C3308e c3308e = new C3308e("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i5 = AbstractC3300G.f10208a;
        C2740O c2740o = new C2740O(C2762u.f8757b);
        C1706p c1706p = new C1706p(5);
        c1706p.m3033l(15.5f, 14.0f);
        c1706p.m3030i(-0.79f);
        c1706p.m3032k(-0.28f, -0.27f);
        c1706p.m3026e(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        c1706p.m3026e(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        c1706p.m3034m(3.0f, 5.91f, 3.0f, 9.5f);
        c1706p.m3034m(5.91f, 16.0f, 9.5f, 16.0f);
        c1706p.m3027f(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        c1706p.m3032k(0.27f, 0.28f);
        c1706p.m3037p(0.79f);
        c1706p.m3032k(5.0f, 4.99f);
        c1706p.m3031j(20.49f, 19.0f);
        c1706p.m3032k(-4.99f, -5.0f);
        c1706p.m3025d();
        c1706p.m3033l(9.5f, 14.0f);
        c1706p.m3026e(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        c1706p.m3034m(7.01f, 5.0f, 9.5f, 5.0f);
        c1706p.m3034m(14.0f, 7.01f, 14.0f, 9.5f);
        c1706p.m3034m(11.99f, 14.0f, 9.5f, 14.0f);
        c1706p.m3025d();
        C3308e.m5578a(c3308e, c1706p.f5857a, c2740o);
        C3309f c3309fM5579b = c3308e.m5579b();
        f6523a = c3309fM5579b;
        return c3309fM5579b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static final void m3446E(String str) {
        AbstractC1665j.m2985e(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = str.charAt(i5);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC1926h.m3565h(16);
                String string = Integer.toString(cCharAt, 16);
                AbstractC1665j.m2984d(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i5);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final void m3447F(String str, String str2) {
        AbstractC1665j.m2985e(str, "value");
        AbstractC1665j.m2985e(str2, "name");
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = str.charAt(i5);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC1926h.m3565h(16);
                String string = Integer.toString(cCharAt, 16);
                AbstractC1665j.m2984d(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i5);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(AbstractC1774e.m3169j(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static InterfaceC1046d m3448G(InterfaceC1046d interfaceC1046d) {
        AbstractC1665j.m2985e(interfaceC1046d, "<this>");
        AbstractC1178c abstractC1178c = interfaceC1046d instanceof AbstractC1178c ? (AbstractC1178c) interfaceC1046d : null;
        if (abstractC1178c == null || (interfaceC1046d = abstractC1178c.f3867f) != null) {
            return interfaceC1046d;
        }
        InterfaceC1048f interfaceC1048f = (InterfaceC1048f) abstractC1178c.mo275e().mo1166C(C1047e.f3285d);
        InterfaceC1046d c2458f = interfaceC1048f != null ? new C2458f((AbstractC2153p) interfaceC1048f, abstractC1178c) : abstractC1178c;
        abstractC1178c.f3867f = c2458f;
        return c2458f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static boolean m3449H(int i5) {
        int type = Character.getType(i5);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static final boolean m3450J(C0920W c0920w, boolean z5) {
        InterfaceC0430v interfaceC0430vM122c;
        C0078o0 c0078o0 = c0920w.f2868d;
        if (c0078o0 == null || (interfaceC0430vM122c = c0078o0.m122c()) == null) {
            return false;
        }
        C2684c c2684cM3211Y = AbstractC1784a.m3211Y(interfaceC0430vM122c);
        long jM1937l = c0920w.m1937l(z5);
        float f2 = c2684cM3211Y.f8558a;
        float f5 = c2684cM3211Y.f8560c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM1937l >> 32));
        if (f2 > fIntBitsToFloat || fIntBitsToFloat > f5) {
            return false;
        }
        float f6 = c2684cM3211Y.f8559b;
        float f7 = c2684cM3211Y.f8561d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM1937l & 4294967295L));
        return f6 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static final boolean m3451K(C2685d c2685d) {
        long j5 = c2685d.f8566e;
        return (j5 >>> 32) == (4294967295L & j5) && j5 == c2685d.f8567f && j5 == c2685d.f8568g && j5 == c2685d.f8569h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static boolean m3452L(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static C0793k m3453M(String str) throws ProtocolException {
        int i5;
        String strSubstring;
        AbstractC1665j.m2985e(str, "statusLine");
        boolean zM3656S = AbstractC1983k.m3656S(str, "HTTP/1.", false);
        EnumC1716z enumC1716z = EnumC1716z.f5944f;
        EnumC1716z enumC1716z2 = EnumC1716z.f5945g;
        if (zM3656S) {
            i5 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC1716z = enumC1716z2;
            }
        } else if (AbstractC1983k.m3656S(str, "ICY ", false)) {
            i5 = 4;
        } else {
            if (!AbstractC1983k.m3656S(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i5 = 12;
            enumC1716z = enumC1716z2;
        }
        int i6 = i5 + 3;
        if (str.length() < i6) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        String strSubstring2 = str.substring(i5, i6);
        AbstractC1665j.m2984d(strSubstring2, "substring(...)");
        Integer numM3657T = AbstractC1983k.m3657T(strSubstring2);
        if (numM3657T == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numM3657T.intValue();
        if (str.length() <= i6) {
            strSubstring = "";
        } else {
            if (str.charAt(i6) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i5 + 4);
            AbstractC1665j.m2984d(strSubstring, "substring(...)");
        }
        return new C0793k(enumC1716z, iIntValue, strSubstring);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static final long m3454N(long j5, long j6) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 >> 32)) + ((int) (j6 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) + ((int) (j6 & 4294967295L)))) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static void m3455O(File file, byte[] bArr, int i5) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i6 = 0;
        while (i6 < i5) {
            try {
                int i7 = randomAccessFile.read(bArr, i6, i5 - i6);
                if (i7 < 0) {
                    break;
                } else {
                    i6 += i7;
                }
            } finally {
                m3475m(randomAccessFile);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static String m3456P(String str) {
        Object objM3229o;
        try {
            objM3229o = AbstractC1976d.m3647o0(AbstractC1926h.m3551B(new File(str))).toString();
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        if (objM3229o instanceof C0884j) {
            objM3229o = null;
        }
        return (String) objM3229o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static final long m3457Q(long j5) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j5 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j5 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static Boolean m3458R(String str) {
        Object objM3229o;
        Method declaredMethod;
        try {
            Class clsM3459S = m3459S();
            Object objInvoke = (clsM3459S == null || (declaredMethod = clsM3459S.getDeclaredMethod(str, null)) == null) ? null : declaredMethod.invoke(null, null);
            objM3229o = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        return (Boolean) (objM3229o instanceof C0884j ? null : objM3229o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static Class m3459S() {
        Object objM3229o;
        try {
            objM3229o = Class.forName("android.os.SELinux");
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        if (objM3229o instanceof C0884j) {
            objM3229o = null;
        }
        return (Class) objM3229o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static String m3460T(String str, Class[] clsArr, Object... objArr) {
        Object objM3229o;
        Method declaredMethod;
        try {
            Class clsM3459S = m3459S();
            Object objInvoke = (clsM3459S == null || (declaredMethod = clsM3459S.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length))) == null) ? null : declaredMethod.invoke(null, Arrays.copyOf(objArr, objArr.length));
            objM3229o = objInvoke instanceof String ? (String) objInvoke : null;
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        if (objM3229o instanceof C0884j) {
            objM3229o = null;
        }
        String str2 = (String) objM3229o;
        if (str2 != null) {
            return AbstractC1976d.m3647o0(str2).toString();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x000d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x000d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [F3.a, g0.j] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: U */
    public static final ArrayList m3461U(C1316H0 c1316h0, int i5, Integer num) {
        ?? c2178j = new C2178j(c1316h0);
        int iM2431q = c1316h0.m2431q(i5);
        C1349a c1349aM2415a = c1316h0.m2415a(i5);
        while (i5 >= 0) {
            c2178j.m742e(c1316h0.m2423i(i5), c1316h0.m2425k(i5) ? c1316h0.m2430p(c1316h0.f4692b, i5) : C1371l.f4833a, c1316h0.f4691a.m2441f(i5), num);
            if (iM2431q >= 0) {
                C1349a c1349a = c1349aM2415a;
                c1349aM2415a = c1316h0.m2415a(iM2431q);
                i5 = iM2431q;
                iM2431q = c1316h0.m2431q(iM2431q);
                num = c1349a;
            } else {
                i5 = iM2431q;
                num = c1349aM2415a;
            }
        }
        return (ArrayList) c2178j.f1354d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static Object m3462V(InterfaceC1603e interfaceC1603e, Object obj, InterfaceC1046d interfaceC1046d) {
        AbstractC1665j.m2985e(interfaceC1603e, "<this>");
        InterfaceC1051i interfaceC1051iMo275e = interfaceC1046d.mo275e();
        Object c1155d = interfaceC1051iMo275e == C1052j.f3286d ? new C1155d(interfaceC1046d) : new C1156e(interfaceC1046d, interfaceC1051iMo275e);
        AbstractC1678w.m2998b(2, interfaceC1603e);
        return interfaceC1603e.mo0g(obj, c1155d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m3463a(InterfaceC0940l interfaceC0940l, InterfaceC2195d interfaceC2195d, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-1090171650);
        if ((i5 & 6) == 0) {
            i6 = ((i5 & 8) == 0 ? c1383r.m2582f(interfaceC0940l) : c1383r.m2586h(interfaceC0940l) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2582f(interfaceC2195d) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 256 : 128;
        }
        boolean z5 = true;
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            boolean z6 = (i6 & 112) == 32;
            if ((i6 & 14) != 4 && ((i6 & 8) == 0 || !c1383r.m2582f(interfaceC0940l))) {
                z5 = false;
            }
            boolean z7 = z6 | z5;
            Object objM2558L = c1383r.m2558L();
            if (z7 || objM2558L == C1371l.f4833a) {
                objM2558L = new C0939k(interfaceC2195d, interfaceC0940l);
                c1383r.m2585g0(objM2558L);
            }
            AbstractC2298n.m4122a((C0939k) objM2558L, null, new C2283D(false, EnumC2284E.f7440d, false), c1843e, c1383r, ((i6 << 3) & 7168) | 384, 2);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0214b(interfaceC0940l, interfaceC2195d, c1843e, i5, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m3464b(InterfaceC2207p interfaceC2207p, AbstractC1384r0 abstractC1384r0, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-714464401);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2582f(interfaceC2207p) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2582f(abstractC1384r0) ? 32 : 16;
        }
        int i7 = i5 & 384;
        C1843e c1843e2 = AbstractC0350k.f1106a;
        if (i7 == 0) {
            i6 |= c1383r.m2586h(c1843e2) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 2048 : 1024;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 1171) != 1170)) {
            Object objM2558L = c1383r.m2558L();
            if (objM2558L == C1371l.f4833a) {
                C1366i0 c1366i0 = new C1366i0(null, C1357e.f4795g);
                c1383r.m2585g0(c1366i0);
                objM2558L = c1366i0;
            }
            C0545c c0545cM3471i = m3471i(c1843e2, c1383r, (i6 >> 6) & 14);
            AbstractC1385s.m2611a(abstractC1384r0.mo2399a(c0545cM3471i), AbstractC1848j.m3314c(274270255, new C0508t(interfaceC2207p, (InterfaceC1347Y) objM2558L, c1843e, c0545cM3471i, 1), c1383r), c1383r, 56);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0214b(interfaceC2207p, abstractC1384r0, c1843e, i5, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final C2685d m3465c(float f2, float f5, float f6, float f7, long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new C2685d(f2, f5, f6, f7, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m3466d(final InterfaceC0940l interfaceC0940l, final boolean z5, final EnumC1960j enumC1960j, final boolean z6, long j5, final float f2, final InterfaceC2207p interfaceC2207p, InterfaceC1373m interfaceC1373m, final int i5) {
        int i6;
        final long j6;
        int i7;
        long j7;
        final boolean z7;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-466280168);
        if ((i5 & 6) == 0) {
            i6 = ((i5 & 8) == 0 ? c1383r.m2582f(interfaceC0940l) : c1383r.m2586h(interfaceC0940l) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2584g(z5) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2578d(enumC1960j.ordinal()) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= c1383r.m2584g(z6) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= 8192;
        }
        if ((1572864 & i5) == 0) {
            i6 |= c1383r.m2582f(interfaceC2207p) ? 1048576 : 524288;
        }
        if (c1383r.m2560O(i6 & 1, (533651 & i6) != 533650)) {
            c1383r.m2565T();
            if ((i5 & 1) == 0 || c1383r.m2606y()) {
                i7 = i6 & (-57345);
                j7 = 9205357640488583168L;
            } else {
                c1383r.m2563R();
                i7 = i6 & (-57345);
                j7 = j5;
            }
            c1383r.m2598q();
            EnumC1960j enumC1960j2 = EnumC1960j.f6637e;
            EnumC1960j enumC1960j3 = EnumC1960j.f6636d;
            if (z5) {
                float f5 = AbstractC0903E.f2809a;
                z7 = (enumC1960j == enumC1960j3 && !z6) || (enumC1960j == enumC1960j2 && z6);
            } else {
                float f6 = AbstractC0903E.f2809a;
                z7 = !((enumC1960j == enumC1960j3 && !z6) || (enumC1960j == enumC1960j2 && z6));
            }
            C2196e c2196e = z7 ? AbstractC2192a.f7158b : AbstractC2192a.f7157a;
            int i8 = i7 & 14;
            boolean zM2584g = ((i7 & 112) == 32) | (i8 == 4 || ((i7 & 8) != 0 && c1383r.m2586h(interfaceC0940l))) | c1383r.m2584g(z7);
            Object objM2558L = c1383r.m2558L();
            if (zM2584g || objM2558L == C1371l.f4833a) {
                objM2558L = new InterfaceC1601c() { // from class: L.a
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p112W2.InterfaceC1601c
                    /* JADX INFO: renamed from: h */
                    public final Object mo1h(Object obj) {
                        InterfaceC1136w interfaceC1136w = (InterfaceC1136w) obj;
                        long jMo19a = interfaceC0940l.mo19a();
                        interfaceC1136w.mo1128a(AbstractC0903E.f2811c, new C0902D(z5 ? EnumC0050a0.f205e : EnumC0050a0.f206f, jMo19a, z7 ? EnumC0901C.f2801d : EnumC0901C.f2803f, (9223372034707292159L & jMo19a) != 9205357640488583168L));
                        return C0891q.f2780a;
                    }
                };
                c1383r.m2585g0(objM2558L);
            }
            final InterfaceC2207p interfaceC2207pM2162a = AbstractC1126m.m2162a(interfaceC2207p, false, (InterfaceC1601c) objM2558L);
            final InterfaceC0697T0 interfaceC0697T0 = (InterfaceC0697T0) c1383r.m2590j(AbstractC0757q0.f2369s);
            long j8 = j7;
            C2196e c2196e2 = c2196e;
            j6 = j8;
            m3463a(interfaceC0940l, c2196e2, AbstractC1848j.m3314c(1365123137, new InterfaceC1603e() { // from class: L.b
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    C1383r c1383r2 = (C1383r) interfaceC1373m2;
                    if (c1383r2.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C1386s0 c1386s0Mo2399a = AbstractC0757q0.f2369s.mo2399a(interfaceC0697T0);
                        final long j9 = j6;
                        final boolean z8 = z7;
                        final InterfaceC2207p interfaceC2207p2 = interfaceC2207pM2162a;
                        final InterfaceC0940l interfaceC0940l2 = interfaceC0940l;
                        AbstractC1385s.m2611a(c1386s0Mo2399a, AbstractC1848j.m3314c(1260045569, new InterfaceC1603e() { // from class: L.d
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p112W2.InterfaceC1603e
                            /* JADX INFO: renamed from: g */
                            public final Object mo0g(Object obj3, Object obj4) {
                                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                C1383r c1383r3 = (C1383r) interfaceC1373m3;
                                if (c1383r3.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j10 = j9;
                                    boolean z9 = z8;
                                    InterfaceC2207p interfaceC2207p3 = interfaceC2207p2;
                                    final InterfaceC0940l interfaceC0940l3 = interfaceC0940l2;
                                    C1357e c1357e = C1371l.f4833a;
                                    if (j10 != 9205357640488583168L) {
                                        c1383r3.m2568W(3458246);
                                        C3259b c3259b = z9 ? AbstractC3261c.f10086b : AbstractC3261c.f10085a;
                                        InterfaceC2207p interfaceC2207pM5532s = AbstractC3261c.m5532s(interfaceC2207p3, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), 0.0f, 0.0f, 12);
                                        C3256Z c3256zM5504a = AbstractC3255Y.m5504a(c3259b, C2194c.f7169m, c1383r3, 0);
                                        int iHashCode = Long.hashCode(c1383r3.f4882T);
                                        InterfaceC1378o0 interfaceC1378o0M2593l = c1383r3.m2593l();
                                        InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r3, interfaceC2207pM5532s);
                                        InterfaceC0593g.f1909a.getClass();
                                        C0551B c0551b = C0591f.f1902b;
                                        c1383r3.m2571Z();
                                        if (c1383r3.f4881S) {
                                            c1383r3.m2592k(c0551b);
                                        } else {
                                            c1383r3.m2591j0();
                                        }
                                        AbstractC1385s.m2635y(c1383r3, C0591f.f1905e, c3256zM5504a);
                                        AbstractC1385s.m2635y(c1383r3, C0591f.f1904d, interfaceC1378o0M2593l);
                                        AbstractC1385s.m2627q(c1383r3, Integer.valueOf(iHashCode), C0591f.f1906f);
                                        AbstractC1385s.m2631u(c1383r3, C0591f.f1907g);
                                        AbstractC1385s.m2635y(c1383r3, C0591f.f1903c, interfaceC2207pM4016c);
                                        boolean zM2586h = c1383r3.m2586h(interfaceC0940l3);
                                        Object objM2558L2 = c1383r3.m2558L();
                                        if (zM2586h || objM2558L2 == c1357e) {
                                            final int i9 = 0;
                                            objM2558L2 = new InterfaceC1599a() { // from class: L.e
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p112W2.InterfaceC1599a
                                                /* JADX INFO: renamed from: a */
                                                public final Object mo6a() {
                                                    switch (i9) {
                                                        case 0:
                                                            return Boolean.valueOf((interfaceC0940l3.mo19a() & 9223372034707292159L) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((interfaceC0940l3.mo19a() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            c1383r3.m2585g0(objM2558L2);
                                        }
                                        AbstractC1923e.m3467e(C2204m.f7185a, (InterfaceC1599a) objM2558L2, z9, c1383r3, 6);
                                        c1383r3.m2597p(true);
                                        c1383r3.m2597p(false);
                                    } else {
                                        c1383r3.m2568W(4389176);
                                        boolean zM2586h2 = c1383r3.m2586h(interfaceC0940l3);
                                        Object objM2558L3 = c1383r3.m2558L();
                                        if (zM2586h2 || objM2558L3 == c1357e) {
                                            final int i10 = 1;
                                            objM2558L3 = new InterfaceC1599a() { // from class: L.e
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p112W2.InterfaceC1599a
                                                /* JADX INFO: renamed from: a */
                                                public final Object mo6a() {
                                                    switch (i10) {
                                                        case 0:
                                                            return Boolean.valueOf((interfaceC0940l3.mo19a() & 9223372034707292159L) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((interfaceC0940l3.mo19a() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            c1383r3.m2585g0(objM2558L3);
                                        }
                                        AbstractC1923e.m3467e(interfaceC2207p3, (InterfaceC1599a) objM2558L3, z9, c1383r3, 0);
                                        c1383r3.m2597p(false);
                                    }
                                } else {
                                    c1383r3.m2563R();
                                }
                                return C0891q.f2780a;
                            }
                        }, c1383r2), c1383r2, 56);
                    } else {
                        c1383r2.m2563R();
                    }
                    return C0891q.f2780a;
                }
            }, c1383r), c1383r, i8 | 384);
        } else {
            c1383r.m2563R();
            j6 = j5;
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            final long j9 = j6;
            c1388t0M2599r.f4928d = new InterfaceC1603e() { // from class: L.c
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1923e.m3466d(interfaceC0940l, z5, enumC1960j, z6, j9, f2, interfaceC2207p, (InterfaceC1373m) obj, AbstractC1385s.m2609A(i5 | 1));
                    return C0891q.f2780a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m3467e(InterfaceC2207p interfaceC2207p, InterfaceC1599a interfaceC1599a, boolean z5, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(2111672474);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2582f(interfaceC2207p) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        int i7 = i6 | (c1383r.m2586h(interfaceC1599a) ? 32 : 16) | (c1383r.m2584g(z5) ? 256 : 128);
        if (c1383r.m2560O(i7 & 1, (i7 & 147) != 146)) {
            AbstractC3261c.m5516c(c1383r, AbstractC2192a.m4014a(AbstractC3261c.m5534u(interfaceC2207p, AbstractC0903E.f2809a, AbstractC0903E.f2810b), new C0021K0(1, interfaceC1599a, z5)));
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0934f(interfaceC2207p, interfaceC1599a, z5, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m3468f(p007B0.C0185S r6, p084Q2.AbstractC1176a r7) {
        /*
            boolean r0 = r7 instanceof p022E.C0275a
            if (r0 == 0) goto L13
            r0 = r7
            E.a r0 = (p022E.C0275a) r0
            int r1 = r0.f895i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f895i = r1
            goto L18
        L13:
            E.a r0 = new E.a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f894h
            int r1 = r0.f895i
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            B0.S r6 = r0.f893g
            p127Z2.AbstractC1784a.m3205S(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            p127Z2.AbstractC1784a.m3205S(r7)
        L32:
            r0.f893g = r6
            r0.f895i = r2
            B0.o r7 = p007B0.EnumC0201o.f703e
            java.lang.Object r7 = r6.m271a(r7, r0)
            P2.a r1 = p079P2.EnumC1152a.f3788d
            if (r7 != r1) goto L41
            return r1
        L41:
            B0.n r7 = (p007B0.C0200n) r7
            int r1 = r7.f699d
            java.lang.Object r7 = r7.f696a
            r1 = r1 & 66
            if (r1 == 0) goto L32
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L51:
            if (r4 >= r1) goto L63
            java.lang.Object r5 = r7.get(r4)
            B0.w r5 = (p007B0.C0209w) r5
            boolean r5 = p007B0.AbstractC0208v.m311a(r5)
            if (r5 != 0) goto L60
            goto L32
        L60:
            int r4 = r4 + 1
            goto L51
        L63:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC1923e.m3468f(B0.S, Q2.a):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: g */
    public static int m3469g(int i5, String str, String str2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/fs/selinux/access", "rw");
        try {
            String str3 = str + " " + str2 + " " + i5;
            Charset charset = AbstractC1973a.f6662a;
            byte[] bytes = str3.getBytes(charset);
            AbstractC1665j.m2984d(bytes, "getBytes(...)");
            Os.write(randomAccessFile.getFD(), bytes, 0, bytes.length);
            byte[] bArr = new byte[64];
            int i6 = randomAccessFile.read(bArr);
            if (i6 <= 0) {
                randomAccessFile.close();
                return 0;
            }
            String str4 = (String) AbstractC0973m.m2013T(AbstractC1976d.m3644l0(AbstractC1976d.m3647o0(new String(bArr, 0, i6, charset)).toString(), new String[]{" "}));
            if (str4 == null) {
                str4 = "0";
            }
            int unsignedInt = Integer.parseUnsignedInt(str4, 16);
            randomAccessFile.close();
            return unsignedInt;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C1608a m3470h(C1608a... c1608aArr) {
        boolean z5;
        boolean z6;
        C1608a c1608a;
        int length = c1608aArr.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z5 = true;
            if (i6 >= length) {
                z6 = false;
                break;
            }
            if (c1608aArr[i6].f5539a) {
                z6 = true;
                break;
            }
            i6++;
        }
        int length2 = c1608aArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length2) {
                z5 = false;
                break;
            }
            if (c1608aArr[i7].f5540b) {
                break;
            }
            i7++;
        }
        String strM3646n0 = AbstractC1976d.m3646n0(AbstractC0972l.m2005c0(c1608aArr, "+", new C1286x(17), 30), 96);
        int length3 = c1608aArr.length;
        while (true) {
            if (i5 >= length3) {
                c1608a = null;
                break;
            }
            c1608a = c1608aArr[i5];
            String str = c1608a.f5542d;
            if (str != null && !AbstractC1976d.m3637e0(str)) {
                break;
            }
            i5++;
        }
        return new C1608a(z6, z5, strM3646n0, c1608a != null ? c1608a.f5542d : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final C0545c m3471i(C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        boolean z5 = (((i5 & 14) ^ 6) > 4 && ((C1383r) interfaceC1373m).m2582f(c1843e)) || (i5 & 6) == 4;
        C1383r c1383r = (C1383r) interfaceC1373m;
        Object objM2558L = c1383r.m2558L();
        C1357e c1357e = C1371l.f4833a;
        if (z5 || objM2558L == c1357e) {
            objM2558L = new C0545c(c1843e);
            c1383r.m2585g0(objM2558L);
        }
        C0545c c0545c = (C0545c) objM2558L;
        boolean zM2582f = c1383r.m2582f(c0545c);
        Object objM2558L2 = c1383r.m2558L();
        if (zM2582f || objM2558L2 == c1357e) {
            objM2558L2 = new C0049a(6, c0545c);
            c1383r.m2585g0(objM2558L2);
        }
        AbstractC1385s.m2613c(c0545c, (InterfaceC1601c) objM2558L2, c1383r);
        return c0545c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final Object m3472j(InterfaceC0597i interfaceC0597i, InterfaceC1599a interfaceC1599a, AbstractC1178c abstractC1178c) {
        Object obj;
        AbstractC0596h0 abstractC0596h0M1043s;
        Object objMo1268t0;
        C0590e0 c0590e0;
        AbstractC2206o abstractC2206o = (AbstractC2206o) interfaceC0597i;
        boolean z5 = abstractC2206o.f7186d.f7199q;
        if (z5) {
            if (!z5) {
                AbstractC0277a.m483b("visitAncestors called on an unattached node");
            }
            AbstractC2206o abstractC2206o2 = abstractC2206o.f7186d.f7190h;
            C0564I c0564iM1044t = AbstractC0601k.m1044t(interfaceC0597i);
            loop0: while (true) {
                obj = null;
                if (c0564iM1044t == null) {
                    break;
                }
                if ((c0564iM1044t.f1699J.f1896f.f7189g & 524288) != 0) {
                    while (abstractC2206o2 != null) {
                        if ((abstractC2206o2.f7188f & 524288) != 0) {
                            AbstractC2206o abstractC2206oM1029e = abstractC2206o2;
                            C1483e c1483e = null;
                            while (abstractC2206oM1029e != null) {
                                if (abstractC2206oM1029e instanceof InterfaceC0993a) {
                                    obj = abstractC2206oM1029e;
                                    break loop0;
                                }
                                if ((abstractC2206oM1029e.f7188f & 524288) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                    int i5 = 0;
                                    for (AbstractC2206o abstractC2206o3 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o3 != null; abstractC2206o3 = abstractC2206o3.f7191i) {
                                        if ((abstractC2206o3.f7188f & 524288) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                abstractC2206oM1029e = abstractC2206o3;
                                            } else {
                                                if (c1483e == null) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (abstractC2206oM1029e != null) {
                                                    c1483e.m2753b(abstractC2206oM1029e);
                                                    abstractC2206oM1029e = null;
                                                }
                                                c1483e.m2753b(abstractC2206o3);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e);
                            }
                        }
                        abstractC2206o2 = abstractC2206o2.f7190h;
                    }
                }
                c0564iM1044t = c0564iM1044t.m839u();
                abstractC2206o2 = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
            }
            InterfaceC0993a interfaceC0993a = (InterfaceC0993a) obj;
            if (interfaceC0993a != null && (objMo1268t0 = interfaceC0993a.mo1268t0((abstractC0596h0M1043s = AbstractC0601k.m1043s(interfaceC0597i)), new C0190d(7, interfaceC1599a, abstractC0596h0M1043s), abstractC1178c)) == EnumC1152a.f3788d) {
                return objMo1268t0;
            }
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:35:0x0092) to fix multi-entry loop: BACK_EDGE: B:35:0x0092 -> B:27:0x0061 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [F3.a, g0.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [T.a] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    /* JADX INFO: renamed from: k */
    public static final List m3473k(C1324L0 c1324l0, Integer num, int i5, Integer num2) {
        int iM2454E;
        int iM2488s;
        C2404A c2404a;
        if (c1324l0.f4745w || c1324l0.m2485p() == 0) {
            return C0981u.f3047d;
        }
        ?? c2178j = new C2178j(c1324l0);
        if (num2 != null) {
            iM2454E = num2.intValue();
        } else {
            iM2454E = c1324l0.f4744v;
            if (iM2454E < 0) {
                iM2454E = c1324l0.m2454E(c1324l0.f4724b, i5);
            }
        }
        if (num == 0) {
            int iM2463N = c1324l0.f4731i - c1324l0.m2463N(c1324l0.f4724b, c1324l0.m2487r(i5));
            C2439u c2439u = c1324l0.f4741s;
            num = Integer.valueOf(iM2463N + ((c2439u == null || (c2404a = (C2404A) c2439u.m4318b(i5)) == null) ? 0 : c2404a.f7767b));
        }
        int iM2487r = c1324l0.m2487r(i5) * 5;
        int[] iArr = c1324l0.f4724b;
        if (iM2487r < iArr.length) {
            iM2488s = c1324l0.m2488s(i5);
        } else {
            int iM2454E2 = iM2454E >= 0 ? c1324l0.m2454E(iArr, iM2454E) : iM2454E;
            iM2488s = c1324l0.m2488s(iM2454E);
            int i6 = iM2454E;
            iM2454E = iM2454E2;
            i5 = i6;
        }
        while (i5 >= 0) {
            c2178j.m742e(iM2488s, (c1324l0.f4724b[(c1324l0.m2487r(i5) * 5) + 1] & 536870912) != 0 ? c1324l0.m2489t(i5) : C1371l.f4833a, c1324l0.m2464O(i5), num);
            num = c1324l0.m2472b(i5);
            if (iM2454E >= 0) {
                int iM2454E3 = c1324l0.m2454E(c1324l0.f4724b, iM2454E);
                iM2488s = c1324l0.m2488s(iM2454E);
                int i7 = iM2454E;
                iM2454E = iM2454E3;
                i5 = i7;
            } else {
                i5 = iM2454E;
            }
        }
        return (ArrayList) c2178j.f1354d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static C1608a m3474l(String str, String str2, String str3, String str4) {
        Object objM3229o;
        Object objM3229o2;
        Method declaredMethod;
        try {
            Class clsM3459S = m3459S();
            if (clsM3459S == null || (declaredMethod = clsM3459S.getDeclaredMethod("checkSELinuxAccess", String.class, String.class, String.class, String.class)) == null) {
                objM3229o = null;
            } else {
                Object objInvoke = declaredMethod.invoke(null, str, str2, str3, str4);
                AbstractC1665j.m2983c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
                objM3229o = new C1608a(((Boolean) objInvoke).booleanValue(), true, "android.os.SELinux", null);
            }
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        if (objM3229o instanceof C0884j) {
            objM3229o = null;
        }
        C1608a c1608a = (C1608a) objM3229o;
        if (c1608a != null) {
            return c1608a;
        }
        try {
            int i5 = Integer.parseInt(AbstractC1976d.m3647o0(AbstractC1926h.m3551B(new File("/sys/fs/selinux/class/" + str3 + "/index"))).toString());
            StringBuilder sb = new StringBuilder("/sys/fs/selinux/class/");
            sb.append(str3);
            sb.append("/perms/");
            sb.append(str4);
            objM3229o2 = new C1608a((m3469g(i5, str, str2) & (1 << (Integer.parseInt(AbstractC1976d.m3647o0(AbstractC1926h.m3551B(new File(sb.toString()))).toString()) - 1))) != 0, true, "selinuxfs", null);
        } catch (Throwable th2) {
            objM3229o2 = AbstractC1784a.m3229o(th2);
        }
        Throwable thM1902a = AbstractC0885k.m1902a(objM3229o2);
        if (thM1902a != null) {
            objM3229o2 = new C1608a(false, false, "selinuxfs", thM1902a.getClass().getSimpleName());
        }
        return (C1608a) objM3229o2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m3475m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final void m3476n(C2791t c2791t, C2787p c2787p, String str, C1608a c1608a) {
        C2791t c2791t2 = new C2791t();
        boolean z5 = c1608a.f5539a;
        c2791t2.m4977a("hit", Boolean.valueOf(z5));
        c2791t2.m4977a("available", Boolean.valueOf(c1608a.f5540b));
        c2791t2.m4979c("method", c1608a.f5541c);
        String str2 = c1608a.f5542d;
        if (str2 != null && !AbstractC1976d.m3637e0(str2)) {
            c2791t2.m4979c("error", str2);
        }
        c2791t.f8818d.put(str, c2791t2);
        if (z5) {
            c2787p.f8816d.add(new C2792u(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final void m3477o(C1706p c1706p, String str, String str2) {
        AbstractC1665j.m2985e(c1706p, "<this>");
        AbstractC1665j.m2985e(str, "name");
        AbstractC1665j.m2985e(str2, "value");
        ArrayList arrayList = c1706p.f5857a;
        arrayList.add(str);
        arrayList.add(AbstractC1976d.m3647o0(str2).toString());
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: p */
    public static C1608a m3478p(String str) {
        Object objM3229o;
        Object objM3229o2;
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("/sys/fs/selinux/context");
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        try {
            byte[] bytes = str.getBytes(AbstractC1973a.f6662a);
            AbstractC1665j.m2984d(bytes, "getBytes(...)");
            Os.write(fileOutputStream.getFD(), bytes, 0, bytes.length);
            fileOutputStream.close();
            objM3229o = new C1608a(true, true, "selinuxfs-context", null);
            Throwable thM1902a = AbstractC0885k.m1902a(objM3229o);
            if (thM1902a != null) {
                try {
                    if (!(thM1902a instanceof ErrnoException) || ((ErrnoException) thM1902a).errno != OsConstants.EINVAL) {
                        throw thM1902a;
                    }
                    objM3229o = new C1608a(false, true, "selinuxfs-context", null);
                } catch (Throwable th2) {
                    objM3229o = AbstractC1784a.m3229o(th2);
                }
            }
            if (objM3229o instanceof C0884j) {
                objM3229o = null;
            }
            C1608a c1608a = (C1608a) objM3229o;
            if (c1608a != null) {
                return c1608a;
            }
            try {
                m3469g(0, str, str);
                objM3229o2 = new C1608a(true, true, "selinuxfs-access", null);
            } catch (Throwable th3) {
                objM3229o2 = AbstractC1784a.m3229o(th3);
            }
            Throwable thM1902a2 = AbstractC0885k.m1902a(objM3229o2);
            if (thM1902a2 != null) {
                try {
                    if (!(thM1902a2 instanceof ErrnoException) || ((ErrnoException) thM1902a2).errno != OsConstants.EINVAL) {
                        throw thM1902a2;
                    }
                    objM3229o2 = new C1608a(false, true, "selinuxfs-access", null);
                } catch (Throwable th4) {
                    objM3229o2 = AbstractC1784a.m3229o(th4);
                }
            }
            Throwable thM1902a3 = AbstractC0885k.m1902a(objM3229o2);
            if (thM1902a3 != null) {
                objM3229o2 = new C1608a(false, false, "selinuxfs", thM1902a3.getClass().getSimpleName());
            }
            return (C1608a) objM3229o2;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: W2.e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static InterfaceC1046d m3479q(InterfaceC1046d interfaceC1046d, InterfaceC1046d interfaceC1046d2, InterfaceC1603e interfaceC1603e) {
        AbstractC1665j.m2985e(interfaceC1603e, "<this>");
        if (interfaceC1603e instanceof AbstractC1176a) {
            return ((AbstractC1176a) interfaceC1603e).mo7n(interfaceC1046d2, interfaceC1046d);
        }
        InterfaceC1051i interfaceC1051iMo275e = interfaceC1046d2.mo275e();
        return interfaceC1051iMo275e == C1052j.f3286d ? new C1153b(interfaceC1046d2, interfaceC1046d, interfaceC1603e) : new C1154c(interfaceC1046d2, interfaceC1051iMo275e, interfaceC1603e, interfaceC1046d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2747f m3480r(C2481d c2481d, float f2) {
        int iCeil = ((int) Math.ceil(f2)) * 2;
        C2747f c2747fM4936f = AbstractC1924f.f6526b;
        C2743b c2743bM4931a = AbstractC1924f.f6527c;
        C2901b c2901b = AbstractC1924f.f6528d;
        if (c2747fM4936f == null || c2743bM4931a == null) {
            c2747fM4936f = AbstractC2767z.m4936f(iCeil, iCeil, 1);
            AbstractC1924f.f6526b = c2747fM4936f;
            c2743bM4931a = AbstractC2767z.m4931a(c2747fM4936f);
            AbstractC1924f.f6527c = c2743bM4931a;
        } else {
            Bitmap bitmap = c2747fM4936f.f8734a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
            }
        }
        C2747f c2747f = c2747fM4936f;
        C2743b c2743b = c2743bM4931a;
        if (c2901b == null) {
            c2901b = new C2901b();
            AbstractC1924f.f6528d = c2901b;
        }
        C2901b c2901b2 = c2901b;
        C2900a c2900a = c2901b2.f9184d;
        EnumC2017m layoutDirection = c2481d.f7981d.getLayoutDirection();
        Bitmap bitmap2 = c2747f.f8734a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        InterfaceC2007c interfaceC2007c = c2900a.f9180a;
        EnumC2017m enumC2017m = c2900a.f9181b;
        InterfaceC2760s interfaceC2760s = c2900a.f9182c;
        long j5 = c2900a.f9183d;
        c2900a.f9180a = c2481d;
        c2900a.f9181b = layoutDirection;
        c2900a.f9182c = c2743b;
        c2900a.f9183d = jFloatToRawIntBits;
        c2743b.mo4852n();
        InterfaceC2903d.m5104h(c2901b2, C2762u.f8757b, 0L, c2901b2.mo859c(), 58);
        InterfaceC2903d.m5104h(c2901b2, AbstractC2767z.m4934d(4278190080L), 0L, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 120);
        InterfaceC2903d.m5100A(c2901b2, AbstractC2767z.m4934d(4278190080L), f2, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), null, 120);
        c2743b.mo4851l();
        c2900a.f9180a = interfaceC2007c;
        c2900a.f9181b = enumC2017m;
        c2900a.f9182c = interfaceC2760s;
        c2900a.f9183d = j5;
        return c2747f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static void m3481s(File file) {
        try {
            if (file.exists()) {
                m3482t(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static void m3482t(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m3482t(file2);
            }
        }
        file.delete();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m3483u(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        int i5 = AbstractC3092v.f9811a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C3091u.f9807d;
        C3091u c3091u = (C3091u) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c3091u == null) {
            c3091u = new C3091u();
            c3091u.f9808a = null;
            c3091u.f9809b = null;
            c3091u.f9810c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c3091u);
        }
        WeakReference weakReference2 = c3091u.f9810c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c3091u.f9810c = new WeakReference(keyEvent);
        if (c3091u.f9809b == null) {
            c3091u.f9809b = new SparseArray();
        }
        SparseArray sparseArray = c3091u.f9809b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m3484v(ViewOnAttachStateChangeListenerC2369d viewOnAttachStateChangeListenerC2369d, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        C1129p c1129p;
        C1128o c1128o;
        InterfaceC1601c interfaceC1601c;
        int size = longSparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            long jKeyAt = longSparseArray.keyAt(i5);
            ViewTranslationResponse viewTranslationResponseM1252p = AbstractC0740k.m1252p(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM1252p != null && (value = viewTranslationResponseM1252p.getValue("android:text")) != null && (text = value.getText()) != null && (c1129p = (C1129p) viewOnAttachStateChangeListenerC2369d.m4220g().m4318b((int) jKeyAt)) != null && (c1128o = c1129p.f3715a) != null) {
                Object objM4272g = c1128o.f3711d.f3702d.m4272g(AbstractC1124k.f3687l);
                if (objM4272g == null) {
                    objM4272g = null;
                }
                C1114a c1114a = (C1114a) objM4272g;
                if (c1114a != null && (interfaceC1601c = (InterfaceC1601c) c1114a.f3634b) != null) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final Integer m3485w(C1316H0 c1316h0, AbstractC1391v abstractC1391v, int i5, int i6) {
        Integer numM3485w;
        int[] iArr = c1316h0.f4692b;
        while (true) {
            if (i5 >= i6) {
                return null;
            }
            int i7 = iArr[(i5 * 5) + 3] + i5;
            if (c1316h0.m2424j(i5) && c1316h0.m2423i(i5) == 206 && AbstractC1665j.m2981a(c1316h0.m2430p(iArr, i5), AbstractC1387t.f4924e)) {
                Object objM2422h = c1316h0.m2422h(i5, 0);
                C1308D0 c1308d0 = objM2422h instanceof C1308D0 ? (C1308D0) objM2422h : null;
                InterfaceC1306C0 interfaceC1306C0 = c1308d0 != null ? c1308d0.f4672a : null;
                C1377o c1377o = interfaceC1306C0 instanceof C1377o ? (C1377o) interfaceC1306C0 : null;
                if (c1377o != null && c1377o.f4851d.equals(abstractC1391v)) {
                    return Integer.valueOf(i5);
                }
            }
            if (c1316h0.m2418d(i5) && (numM3485w = m3485w(c1316h0, abstractC1391v, i5 + 1, i7)) != null) {
                return Integer.valueOf(numM3485w.intValue());
            }
            i5 = i7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static byte[] m3486y(File file) {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            throw new IllegalArgumentException("file too large, path:" + file.getPath());
        }
        int i5 = (int) length;
        byte[] bArr = new byte[i5];
        m3455O(file, bArr, i5);
        return bArr;
    }

    /* JADX INFO: renamed from: C */
    public abstract String[] mo3487C(Class cls);

    /* JADX INFO: renamed from: I */
    public abstract boolean mo3488I(Class cls);

    /* JADX INFO: renamed from: x */
    public abstract Method mo3489x(Class cls, Field field);

    /* JADX INFO: renamed from: z */
    public abstract Constructor mo3490z(Class cls);
}
