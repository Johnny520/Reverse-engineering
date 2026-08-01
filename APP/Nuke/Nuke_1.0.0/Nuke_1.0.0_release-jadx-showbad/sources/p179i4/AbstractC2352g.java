package p179i4;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.AbstractC1926h;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import me.dartcv.nuke.R;
import org.luckypray.dexkit.DexKitBridge;
import p000A.C0038T0;
import p000A.C0086s0;
import p000A.C0095x;
import p004A3.AbstractC0156a;
import p004A3.C0157b;
import p007B0.C0185S;
import p007B0.C0186T;
import p007B0.C0200n;
import p007B0.C0209w;
import p007B0.EnumC0201o;
import p007B0.InterfaceC0169B;
import p021D3.C0265b;
import p047I0.AbstractC0691Q;
import p048I1.InterfaceC0782g;
import p049I2.AbstractC0797o;
import p056K2.C0891q;
import p061L2.AbstractC0972l;
import p061L2.C0970j;
import p061L2.C0981u;
import p065M2.C0999b;
import p074O2.InterfaceC1046d;
import p076P.AbstractC1085c0;
import p076P.AbstractC1105r;
import p076P.C1104q;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1176a;
import p094S2.AbstractC1300a;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p098T2.AbstractC1421a;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p118X3.C1706p;
import p118X3.C1707q;
import p127Z2.AbstractC1784a;
import p133a4.AbstractC1805a;
import p133a4.C1807c;
import p136b0.AbstractC1848j;
import p149d3.AbstractC1976d;
import p160f3.AbstractC2162v;
import p160f3.C2149n;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p186k.AbstractC2415L;
import p186k.C2408E;
import p186k.C2409F;
import p190k3.C2469q;
import p193l0.AbstractC2485h;
import p206n2.C2690b;
import p208n4.C2716o;
import p208n4.InterfaceC2722u;
import p211o0.C2740O;
import p211o0.C2762u;
import p216p.AbstractC2856m;
import p227r.C2957J;
import p244u.AbstractC3261c;
import p245u0.AbstractC3300G;
import p245u0.C3308e;
import p245u0.C3309f;
import p254v4.C3362i;
import p265x4.C3458d;
import p272z.AbstractC3507e;

/* JADX INFO: renamed from: i4.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2352g {

    /* JADX INFO: renamed from: a */
    public static C3309f f7651a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static ArrayList m4178A(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0970j(objArr, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static C1707q m4179B(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        AbstractC1665j.m2985e(strArr2, "inputNamesAndValues");
        if (strArr2.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (strArr3[i6] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr3[i6] = AbstractC1976d.m3647o0(strArr2[i6]).toString();
        }
        int iM3576s = AbstractC1926h.m3576s(0, strArr3.length - 1, 2);
        if (iM3576s >= 0) {
            while (true) {
                String str = strArr3[i5];
                String str2 = strArr3[i5 + 1];
                AbstractC1923e.m3446E(str);
                AbstractC1923e.m3447F(str2, str);
                if (i5 == iM3576s) {
                    break;
                }
                i5 += 2;
            }
        }
        return new C1707q(strArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final boolean m4180C(C2408E c2408e, Object obj, Object obj2) {
        Object objM4272g = c2408e.m4272g(obj);
        if (objM4272g == null) {
            return false;
        }
        if (!(objM4272g instanceof C2409F)) {
            if (!objM4272g.equals(obj2)) {
                return false;
            }
            c2408e.m4276k(obj);
            return true;
        }
        C2409F c2409f = (C2409F) objM4272g;
        boolean zM4290l = c2409f.m4290l(obj2);
        if (zM4290l && c2409f.m4285g()) {
            c2408e.m4276k(obj);
        }
        return zM4290l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final void m4181D(C2408E c2408e, Object obj) {
        boolean zM4285g;
        long[] jArr = c2408e.f7787a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        int i8 = (i5 << 3) + i7;
                        Object obj2 = c2408e.f7788b[i8];
                        Object obj3 = c2408e.f7789c[i8];
                        if (obj3 instanceof C2409F) {
                            C2409F c2409f = (C2409F) obj3;
                            c2409f.m4290l(obj);
                            zM4285g = c2409f.m4285g();
                        } else {
                            zM4285g = obj3 == obj;
                        }
                        if (zM4285g) {
                            c2408e.m4277l(i8);
                        }
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static String m4182E(Throwable th) {
        AbstractC1665j.m2985e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final Object m4183F(C2469q c2469q, C2469q c2469q2, InterfaceC1603e interfaceC1603e) throws Throwable {
        Object c2149n;
        Object objM3935R;
        try {
            AbstractC1678w.m2998b(2, interfaceC1603e);
            c2149n = interfaceC1603e.mo0g(c2469q2, c2469q);
        } catch (Throwable th) {
            c2149n = new C2149n(th, false);
        }
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (c2149n == enumC1152a || (objM3935R = c2469q.m3935R(c2149n)) == AbstractC2162v.f7114e) {
            return enumC1152a;
        }
        if (objM3935R instanceof C2149n) {
            throw ((C2149n) objM3935R).f7092a;
        }
        return AbstractC2162v.m3999u(objM3935R);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final String[] m4184G(int i5, InterfaceC1373m interfaceC1373m) {
        return ((Resources) ((C1383r) interfaceC1373m).m2590j(AbstractC0691Q.f2212c)).getStringArray(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static final String m4185H(int i5, InterfaceC1373m interfaceC1373m) {
        return ((Resources) ((C1383r) interfaceC1373m).m2590j(AbstractC0691Q.f2212c)).getString(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static final String m4186I(int i5, Object[] objArr, InterfaceC1373m interfaceC1373m) {
        return ((Resources) ((C1383r) interfaceC1373m).m2590j(AbstractC0691Q.f2212c)).getString(i5, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static void m4187J() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m4188a(C0038T0 c0038t0, InterfaceC2207p interfaceC2207p, String str, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1072881857);
        int i6 = (c1383r.m2582f(c0038t0) ? 4 : 2) | i5 | 432;
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            C2204m c2204m = C2204m.f7185a;
            AbstractC1085c0.m2142a(AbstractC3261c.m5512A(c2204m, 300, 520).mo4021c(AbstractC3261c.f10087c), AbstractC3507e.m5761a(8), ((C1104q) c1383r.m2590j(AbstractC1105r.f3612a)).f3601p, 6, 10, AbstractC1848j.m3314c(1490904710, new C0265b(c0038t0, 2), c1383r), c1383r, 12804096, 72);
            str = "正在分析 Dex";
            interfaceC2207p = c2204m;
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0095x(c0038t0, interfaceC2207p, str, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m4189b(String str, C3309f c3309f, InterfaceC1599a interfaceC1599a, InterfaceC1373m interfaceC1373m, int i5) {
        AbstractC1665j.m2985e(str, "text");
        AbstractC1665j.m2985e(interfaceC1599a, "onClick");
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-163039330);
        int i6 = (c1383r.m2582f(str) ? 4 : 2) | i5 | (c1383r.m2582f(c3309f) ? 32 : 16) | (c1383r.m2586h(interfaceC1599a) ? 256 : 128);
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            C0157b c0157b = (C0157b) c1383r.m2590j(AbstractC0156a.f563i);
            float f2 = 0;
            AbstractC1085c0.m2142a(AbstractC2856m.m5053g(AbstractC2485h.m4427a(AbstractC3261c.m5521h(AbstractC3261c.f10087c, 56), AbstractC3507e.m5761a(8)), false, null, interfaceC1599a, 15), null, c0157b.f569f, f2, f2, AbstractC1848j.m3314c(-825479111, new C0095x(c3309f, c0157b, str, 9), c1383r), c1383r, 12804096, 74);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0095x(str, c3309f, interfaceC1599a, i5, 10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final long m4190c(float f2, float f5) {
        return (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m4191d(Logger logger, AbstractC1805a abstractC1805a, C1807c c1807c, String str) {
        logger.fine(c1807c.f6155b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC1805a.f6148a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m4192e(C2408E c2408e, Object obj, Object obj2) {
        int iM4271f = c2408e.m4271f(obj);
        boolean z5 = iM4271f < 0;
        Object obj3 = z5 ? null : c2408e.f7789c[iM4271f];
        if (obj3 != null) {
            if (obj3 instanceof C2409F) {
                ((C2409F) obj3).m4279a(obj2);
            } else if (obj3 != obj2) {
                C2409F c2409f = new C2409F();
                c2409f.m4279a(obj3);
                c2409f.m4279a(obj2);
                obj2 = c2409f;
            }
            obj2 = obj3;
        }
        if (!z5) {
            c2408e.f7789c[iM4271f] = obj2;
            return;
        }
        int i5 = ~iM4271f;
        c2408e.f7788b[i5] = obj;
        c2408e.f7789c[i5] = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m4193f(Throwable th, Throwable th2) {
        AbstractC1665j.m2985e(th, "<this>");
        AbstractC1665j.m2985e(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC1421a.f5078a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC1300a.f4659a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m4194g(StringBuilder sb, Object obj, InterfaceC1601c interfaceC1601c) {
        if (interfaceC1601c != null) {
            sb.append((CharSequence) interfaceC1601c.mo1h(obj));
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
    /* JADX INFO: renamed from: h */
    public static ArrayList m4195h(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0970j(objArr, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4196i(C0185S c0185s, EnumC0201o enumC0201o, AbstractC1176a abstractC1176a) {
        C2957J c2957j;
        EnumC1152a enumC1152a;
        int size;
        int i5;
        if (abstractC1176a instanceof C2957J) {
            c2957j = (C2957J) abstractC1176a;
            int i6 = c2957j.f9361j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c2957j.f9361j = i6 - Integer.MIN_VALUE;
            } else {
                c2957j = new C2957J(abstractC1176a);
            }
        }
        Object objM271a = c2957j.f9360i;
        int i7 = c2957j.f9361j;
        if (i7 == 0) {
            AbstractC1784a.m3205S(objM271a);
            ?? r9 = c0185s.f645i.f653w.f696a;
            int size2 = r9.size();
            for (int i8 = 0; i8 < size2; i8++) {
                if (((C0209w) r9.get(i8)).f714d) {
                    c2957j.f9358g = c0185s;
                    c2957j.f9359h = enumC0201o;
                    c2957j.f9361j = 1;
                    objM271a = c0185s.m271a(enumC0201o, c2957j);
                    enumC1152a = EnumC1152a.f3788d;
                    if (objM271a == enumC1152a) {
                    }
                    ?? r92 = ((C0200n) objM271a).f696a;
                    size = r92.size();
                    i5 = 0;
                    while (i5 < size) {
                    }
                    return C0891q.f2780a;
                }
            }
            return C0891q.f2780a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        EnumC0201o enumC0201o2 = c2957j.f9359h;
        C0185S c0185s2 = c2957j.f9358g;
        AbstractC1784a.m3205S(objM271a);
        enumC0201o = enumC0201o2;
        c0185s = c0185s2;
        ?? r922 = ((C0200n) objM271a).f696a;
        size = r922.size();
        i5 = 0;
        while (i5 < size) {
            if (((C0209w) r922.get(i5)).f714d) {
                c2957j.f9358g = c0185s;
                c2957j.f9359h = enumC0201o;
                c2957j.f9361j = 1;
                objM271a = c0185s.m271a(enumC0201o, c2957j);
                enumC1152a = EnumC1152a.f3788d;
                if (objM271a == enumC1152a) {
                    return enumC1152a;
                }
                ?? r9222 = ((C0200n) objM271a).f696a;
                size = r9222.size();
                i5 = 0;
                while (i5 < size) {
                }
            } else {
                i5++;
            }
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final Object m4197j(InterfaceC0169B interfaceC0169B, InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        Object objM285J0 = ((C0186T) interfaceC0169B).m285J0(new C0086s0(interfaceC1046d.mo275e(), interfaceC1603e, (InterfaceC1046d) null), interfaceC1046d);
        return objM285J0 == EnumC1152a.f3788d ? objM285J0 : C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static int m4198k(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        AbstractC1665j.m2985e(arrayList, "<this>");
        int size2 = arrayList.size();
        int i5 = 0;
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i6 = size - 1;
        while (i5 <= i6) {
            int i7 = (i5 + i6) >>> 1;
            int iM1386k = AbstractC0797o.m1386k((Comparable) arrayList.get(i7), comparable);
            if (iM1386k < 0) {
                i5 = i7 + 1;
            } else {
                if (iM1386k <= 0) {
                    return i7;
                }
                i6 = i7 - 1;
            }
        }
        return -(i5 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final C2716o m4199l(InterfaceC2722u interfaceC2722u) {
        AbstractC1665j.m2985e(interfaceC2722u, "<this>");
        return new C2716o(interfaceC2722u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static C0999b m4200m(C0999b c0999b) {
        c0999b.m2060f();
        c0999b.f3090f = true;
        return c0999b.f3089e > 0 ? c0999b : C0999b.f3087g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C2408E m4201n() {
        long[] jArr = AbstractC2415L.f7816a;
        return new C2408E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static C0999b m4202o() {
        return new C0999b(10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final float m4203p(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / ((long) 3))) + 709952852);
        float f5 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f5 - ((f5 - (f2 / (f5 * f5))) * 0.33333334f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final String m4204q(long j5) {
        String str;
        if (j5 <= -999500000) {
            str = ((j5 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j5 <= -999500) {
            str = ((j5 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j5 <= 0) {
            str = ((j5 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j5 < 999500) {
            str = ((j5 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j5 < 999500000) {
            str = ((j5 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j5 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static C3362i m4205r(DexKitBridge dexKitBridge, C3458d c3458d) {
        AbstractC1665j.m2985e(dexKitBridge, "bridge");
        int iM4685b = c3458d.m4685b(4);
        int i5 = iM4685b != 0 ? c3458d.f8592b.getInt(iM4685b + c3458d.f8591a) : 0;
        int iM4685b2 = c3458d.m4685b(6);
        int i6 = iM4685b2 != 0 ? c3458d.f8592b.getInt(iM4685b2 + c3458d.f8591a) : 0;
        int iM4685b3 = c3458d.m4685b(8);
        if (iM4685b3 != 0) {
            c3458d.m4687d(iM4685b3 + c3458d.f8591a);
        }
        int iM4685b4 = c3458d.m4685b(10);
        int i7 = iM4685b4 != 0 ? c3458d.f8592b.getInt(iM4685b4 + c3458d.f8591a) : 0;
        int iM4685b5 = c3458d.m4685b(12);
        String strM4687d = iM4685b5 != 0 ? c3458d.m4687d(iM4685b5 + c3458d.f8591a) : null;
        if (strM4687d == null) {
            strM4687d = "";
        }
        int iM4685b6 = c3458d.m4685b(14);
        int i8 = iM4685b6 != 0 ? c3458d.f8592b.getInt(iM4685b6 + c3458d.f8591a) : 0;
        Integer numValueOf = i8 != -1 ? Integer.valueOf(i8) : null;
        ArrayList arrayList = new ArrayList();
        int iM4685b7 = c3458d.m4685b(16);
        int iM4689f = iM4685b7 != 0 ? c3458d.m4689f(iM4685b7) : 0;
        for (int i9 = 0; i9 < iM4689f; i9++) {
            int iM4685b8 = c3458d.m4685b(16);
            arrayList.add(Integer.valueOf(iM4685b8 != 0 ? c3458d.f8592b.getInt((i9 * 4) + c3458d.m4688e(iM4685b8)) : 0));
        }
        ArrayList arrayList2 = new ArrayList();
        int iM4685b9 = c3458d.m4685b(18);
        int iM4689f2 = iM4685b9 != 0 ? c3458d.m4689f(iM4685b9) : 0;
        for (int i10 = 0; i10 < iM4689f2; i10++) {
            int iM4685b10 = c3458d.m4685b(18);
            arrayList2.add(Integer.valueOf(iM4685b10 != 0 ? c3458d.f8592b.getInt((i10 * 4) + c3458d.m4688e(iM4685b10)) : 0));
        }
        ArrayList arrayList3 = new ArrayList();
        int iM4685b11 = c3458d.m4685b(20);
        int iM4689f3 = iM4685b11 != 0 ? c3458d.m4689f(iM4685b11) : 0;
        for (int i11 = 0; i11 < iM4689f3; i11++) {
            int iM4685b12 = c3458d.m4685b(20);
            arrayList3.add(Integer.valueOf(iM4685b12 != 0 ? c3458d.f8592b.getInt((i11 * 4) + c3458d.m4688e(iM4685b12)) : 0));
        }
        return new C3362i(dexKitBridge, i5, i6, i7, strM4687d, numValueOf, arrayList, arrayList2, arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final InterfaceC0782g m4206s(View view) {
        AbstractC1665j.m2985e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            InterfaceC0782g interfaceC0782g = tag instanceof InterfaceC0782g ? (InterfaceC0782g) tag : null;
            if (interfaceC0782g != null) {
                return interfaceC0782g;
            }
            Object objM3501m = AbstractC1924f.m3501m(view);
            view = objM3501m instanceof View ? (View) objM3501m : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final C3309f m4207t() {
        C3309f c3309f = f7651a;
        if (c3309f != null) {
            return c3309f;
        }
        C3308e c3308e = new C3308e("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i5 = AbstractC3300G.f10208a;
        C2740O c2740o = new C2740O(C2762u.f8757b);
        C1706p c1706p = new C1706p(5);
        c1706p.m3033l(12.0f, 21.35f);
        c1706p.m3032k(-1.45f, -1.32f);
        c1706p.m3026e(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        c1706p.m3026e(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        c1706p.m3027f(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        c1706p.m3026e(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        c1706p.m3026e(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        c1706p.m3027f(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        c1706p.m3031j(12.0f, 21.35f);
        c1706p.m3025d();
        C3308e.m5578a(c3308e, c1706p.f5857a, c2740o);
        C3309f c3309fM5579b = c3308e.m5579b();
        f7651a = c3309fM5579b;
        return c3309fM5579b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static int m4208u(List list) {
        AbstractC1665j.m2985e(list, "<this>");
        return list.size() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final int m4209v(int i5, int i6) {
        return (i5 >> i6) & 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return true;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m4210x(C0200n c0200n) {
        MotionEvent motionEventM310a;
        ?? r02 = c0200n.f696a;
        int size = r02.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            if (((C0209w) r02.get(i5)).f719i == 2) {
                i5++;
            } else {
                MotionEvent motionEventM310a2 = c0200n.m310a();
                if ((motionEventM310a2 == null || !motionEventM310a2.isFromSource(8194)) && ((motionEventM310a = c0200n.m310a()) == null || !motionEventM310a.isFromSource(1048584))) {
                    return false;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static List m4211y(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC1665j.m2984d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static List m4212z(Object... objArr) {
        return objArr.length > 0 ? AbstractC0972l.m1987K(objArr) : C0981u.f3047d;
    }

    /* JADX INFO: renamed from: w */
    public abstract int mo4213w(C2690b c2690b);
}
