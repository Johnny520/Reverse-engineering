package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.math.BigDecimal;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class up0 {

    /* JADX INFO: renamed from: f */
    public static final i51 f11398f;

    /* JADX INFO: renamed from: g */
    public static final j51 f11399g;

    /* JADX INFO: renamed from: i */
    public static Context f11401i;

    /* JADX INFO: renamed from: j */
    public static ClassLoader f11402j;

    /* JADX INFO: renamed from: k */
    public static Activity f11403k;

    /* JADX INFO: renamed from: l */
    public static String f11404l;

    /* JADX INFO: renamed from: m */
    public static String f11405m;

    /* JADX INFO: renamed from: n */
    public static String f11406n;

    /* JADX INFO: renamed from: o */
    public static sx0 f11407o;

    /* JADX INFO: renamed from: a */
    public static final C0402kw f11393a = new C0402kw(-1551526251, false, new C0920ye(22));

    /* JADX INFO: renamed from: b */
    public static final C0402kw f11394b = new C0402kw(1982100539, false, new C0920ye(23));

    /* JADX INFO: renamed from: c */
    public static final dh0 f11395c = new dh0(0);

    /* JADX INFO: renamed from: d */
    public static final dh0 f11396d = new dh0(1);

    /* JADX INFO: renamed from: e */
    public static final hh1 f11397e = new hh1(19, "NULL");

    /* JADX INFO: renamed from: h */
    public static final i51 f11400h = new i51(21);

    static {
        int i = 20;
        f11398f = new i51(i);
        f11399g = new j51(i);
    }

    /* JADX INFO: renamed from: A */
    public static final q51 m5522A(in0 in0Var) {
        p51 p51Var = new p51();
        in0Var.mo5j(p51Var);
        return new q51(p51Var);
    }

    /* JADX INFO: renamed from: B */
    public static final uh1 m5523B(in0 in0Var) {
        return new f51(in0Var, null);
    }

    /* JADX INFO: renamed from: C */
    public static final uh1 m5524C(uh1 uh1Var, in0 in0Var) {
        return uh1Var.mo4491c(new f51(null, in0Var));
    }

    /* JADX INFO: renamed from: D */
    public static BigDecimal m5525D(String str) {
        m5547l(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX INFO: renamed from: E */
    public static rf2 m5526E(lf2 lf2Var, d41 d41Var) {
        lf2Var.getClass();
        d41Var.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set setKeySet = d41Var.f1861h.keySet();
        LinkedHashMap linkedHashMap2 = lf2Var.f6099a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : setKeySet) {
            if (!linkedHashMap2.containsKey((String) obj)) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(new gf2((String) it.next(), "Unknown config value is ignored.", hf2.f3993h));
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            kf2 kf2Var = (kf2) entry.getValue();
            j31 j31Var = (j31) d41Var.get(str);
            if (j31Var != null) {
                String strM5534M = m5534M(kf2Var, j31Var);
                if (strM5534M == null) {
                    linkedHashMap.put(str, j31Var);
                } else {
                    arrayList.add(new gf2(str, strM5534M));
                }
            } else {
                j31 j31Var2 = kf2Var.f5503e;
                if (j31Var2 != null) {
                    linkedHashMap.put(str, j31Var2);
                } else if (kf2Var.f5504f) {
                    arrayList.add(new gf2(str, "Required config value is missing."));
                }
            }
        }
        return new rf2(d41Var, new d41(linkedHashMap), arrayList);
    }

    /* JADX INFO: renamed from: F */
    public static final d11 m5527F(o62 o62Var) {
        return new d11(Math.round(o62Var.f7536a), Math.round(o62Var.f7537b), Math.round(o62Var.f7538c), Math.round(o62Var.f7539d));
    }

    /* JADX INFO: renamed from: G */
    public static qt2 m5528G(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new qt2(f, f2, obj);
    }

    /* JADX INFO: renamed from: H */
    public static final Class m5529H(String str) {
        Object x92Var;
        Object x92Var2;
        ClassLoader classLoader;
        str.getClass();
        try {
            classLoader = f11402j;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (classLoader == null) {
            t11.m5067S("hostClassLoader");
            throw null;
        }
        x92Var = classLoader.loadClass(str);
        if (!(x92Var instanceof x92)) {
            Class cls = (Class) x92Var;
            cls.getClass();
            return cls;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                x92Var2 = contextClassLoader.loadClass(str);
            } catch (Throwable th2) {
                x92Var2 = new x92(th2);
            }
            if (!(x92Var2 instanceof x92)) {
                Class cls2 = (Class) x92Var2;
                cls2.getClass();
                return cls2;
            }
        }
        return Class.forName(str);
    }

    /* JADX INFO: renamed from: I */
    public static String m5530I(long j) {
        return "PointerId(value=" + j + ')';
    }

    /* JADX INFO: renamed from: J */
    public static m43 m5531J(int i, gd0 gd0Var, int i2) {
        if ((i2 & 4) != 0) {
            gd0Var = hd0.f3955a;
        }
        return new m43(i, gd0Var);
    }

    /* JADX INFO: renamed from: K */
    public static String m5532K(double d, Double d2, Double d3, Double d4) {
        if (d2 != null && d < d2.doubleValue()) {
            return "Value must be at least " + d2 + ".";
        }
        if (d3 != null && d > d3.doubleValue()) {
            return "Value must be at most " + d3 + ".";
        }
        if (d4 == null) {
            return null;
        }
        if (Math.abs((d / d4.doubleValue()) - ((long) r3)) < 1.0E-9d) {
            return null;
        }
        return "Value must be a multiple of " + d4 + ".";
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m5533L(uf2 uf2Var, j31 j31Var, Double d, Double d2, Double d3, Integer num, Integer num2, String str, if2 if2Var, int i, int i2, boolean z) {
        String strMo2263a;
        Object x92Var;
        int iOrdinal = uf2Var.ordinal();
        Long lM2798f = null;
        dM5802V = null;
        Double dM5802V = null;
        lM2798f = null;
        if (iOrdinal == 0) {
            i41 i41Var = j31Var instanceof i41 ? (i41) j31Var : null;
            if (i41Var == null || i41Var.mo2264b() || l31.m2796d(i41Var) == null) {
                return "Value must be a boolean.";
            }
        } else {
            if (iOrdinal == 1) {
                i41 i41Var2 = j31Var instanceof i41 ? (i41) j31Var : null;
                if (i41Var2 != null) {
                    if (i41Var2.mo2264b()) {
                        i41Var2 = null;
                    }
                    if (i41Var2 != null) {
                        lM2798f = l31.m2798f(i41Var2);
                    }
                }
                return lM2798f == null ? "Value must be an integer." : Math.abs((double) lM2798f.longValue()) > 9.007199254740991E15d ? "Integer exceeds JavaScript safe range." : m5532K(lM2798f.longValue(), d, d2, d3);
            }
            if (iOrdinal == 2) {
                i41 i41Var3 = j31Var instanceof i41 ? (i41) j31Var : null;
                if (i41Var3 != null) {
                    if (i41Var3.mo2264b()) {
                        i41Var3 = null;
                    }
                    if (i41Var3 != null) {
                        gz0 gz0Var = l31.f5905a;
                        dM5802V = vv2.m5802V(i41Var3.mo2263a());
                    }
                }
                return (dM5802V == null || Math.abs(dM5802V.doubleValue()) > Double.MAX_VALUE) ? "Value must be a finite number." : m5532K(dM5802V.doubleValue(), d, d2, d3);
            }
            int i3 = 0;
            if (iOrdinal == 3) {
                i41 i41Var4 = j31Var instanceof i41 ? (i41) j31Var : null;
                if (i41Var4 == null) {
                    strMo2263a = null;
                } else {
                    if (!i41Var4.mo2264b()) {
                        i41Var4 = null;
                    }
                    if (i41Var4 != null) {
                        gz0 gz0Var2 = l31.f5905a;
                        if (!(i41Var4 instanceof z31)) {
                            strMo2263a = i41Var4.mo2263a();
                        }
                    }
                }
                if (strMo2263a == null) {
                    return "Value must be a string.";
                }
                int iCodePointCount = strMo2263a.codePointCount(0, strMo2263a.length());
                if (num != null && iCodePointCount < num.intValue()) {
                    return "Text is shorter than " + num + " characters.";
                }
                if (num2 != null && iCodePointCount > num2.intValue()) {
                    return "Text is longer than " + num2 + " characters.";
                }
                if (t11.m5086l(str, "nonBlank") && pv2.m4006s0(strMo2263a)) {
                    return "Text must not be blank.";
                }
                if (t11.m5086l(str, "digits")) {
                    while (i3 < strMo2263a.length()) {
                        char cCharAt = strMo2263a.charAt(i3);
                        if ('0' > cCharAt || cCharAt >= ':') {
                            return "Text must contain only digits.";
                        }
                        i3++;
                    }
                }
                if (!t11.m5086l(str, "uri")) {
                    return null;
                }
                try {
                    x92Var = Boolean.valueOf(new URI(strMo2263a).isAbsolute());
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                Boolean bool = Boolean.FALSE;
                boolean z2 = x92Var instanceof x92;
                Object obj = x92Var;
                if (z2) {
                    obj = bool;
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                return "Text must be an absolute URI.";
            }
            if (iOrdinal != 4) {
                c80.m675s();
                return null;
            }
            z21 z21Var = j31Var instanceof z21 ? (z21) j31Var : null;
            if (z21Var == null) {
                return "Value must be an array.";
            }
            List list = z21Var.f13709h;
            if (list.size() < i) {
                return hk1.m2208g(i, "Array must contain at least ", " items.");
            }
            if (list.size() > i2) {
                return hk1.m2208g(i2, "Array must contain at most ", " items.");
            }
            if (z && AbstractC0142du.m1148F0(AbstractC0142du.m1152J0(z21Var)).size() != list.size()) {
                return "Array items must be unique.";
            }
            if (if2Var == null) {
                return "Array item schema is missing.";
            }
            for (Object obj2 : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    AbstractC0179eu.m1447a0();
                    throw null;
                }
                j31 j31Var2 = (j31) obj2;
                uf2 uf2Var2 = if2Var.f4591a;
                List list2 = if2Var.f4592b;
                String strM5533L = m5533L(uf2Var2, j31Var2, if2Var.f4593c, if2Var.f4594d, if2Var.f4595e, if2Var.f4596f, if2Var.f4597g, if2Var.f4598h, null, 0, 0, false);
                if (strM5533L == null) {
                    if (list2.isEmpty()) {
                        strM5533L = null;
                        break;
                    }
                    if (!list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((jf2) it.next()).f5016a.equals(j31Var2)) {
                                strM5533L = null;
                                break;
                            }
                        }
                    }
                    strM5533L = "Value is not one of the allowed options.";
                }
                if (strM5533L != null) {
                    return "Array item " + i3 + " is invalid: " + strM5533L;
                }
                i3 = i4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public static String m5534M(kf2 kf2Var, j31 j31Var) {
        kf2Var.getClass();
        List list = kf2Var.f5506h;
        j31Var.getClass();
        String strM5533L = m5533L(kf2Var.f5500b, j31Var, kf2Var.f5507i, kf2Var.f5508j, kf2Var.f5509k, kf2Var.f5510l, kf2Var.f5511m, kf2Var.f5512n, kf2Var.f5513o, kf2Var.f5514p, kf2Var.f5515q, kf2Var.f5516r);
        if (strM5533L != null) {
            return strM5533L;
        }
        if (list.isEmpty()) {
            return null;
        }
        if (list.isEmpty()) {
            return "Value is not one of the allowed options.";
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((jf2) it.next()).f5016a.equals(j31Var)) {
                return null;
            }
        }
        return "Value is not one of the allowed options.";
    }

    /* JADX INFO: renamed from: N */
    public static final int m5535N(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static h70 m5536a() {
        return new h70(1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: b */
    public static final void m5537b(int i, in0 in0Var, InterfaceC0596px interfaceC0596px, int i2) {
        in0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-450323870);
        int i3 = (go0Var.m1976d(i) ? 4 : 2) | i2 | (go0Var.m1984h(in0Var) ? 32 : 16);
        if (go0Var.m1958O(i3 & 1, (i3 & 19) != 18)) {
            ci0.m815p(xe1.m6126i0(1404157421, new ge0(i, in0Var), go0Var), go0Var, 6);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new ge0(i, i2, in0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m5538c(boolean z, c92 c92Var, b03 b03Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        z03 z03VarM5146d;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1344558920);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1982g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1976d(c92Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(b03Var) ? 256 : 128;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean zM1980f = (i3 == 4) | go0Var.m1980f(b03Var);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (zM1980f || objM1956L == c0160eb) {
                objM1956L = new yz2(b03Var, z);
                go0Var.m1981f0(objM1956L);
            }
            kz2 kz2Var = (kz2) objM1956L;
            boolean zM1984h = (i3 == 4) | go0Var.m1984h(b03Var);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1984h || objM1956L2 == c0160eb) {
                objM1956L2 = new c03(b03Var, z);
                go0Var.m1981f0(objM1956L2);
            }
            ws1 ws1Var = (ws1) objM1956L2;
            boolean zM1498g = f13.m1498g(b03Var.m350n().f5297b);
            int i4 = (int) (z ? b03Var.m350n().f5297b >> 32 : b03Var.m350n().f5297b & 4294967295L);
            t91 t91Var = b03Var.f483d;
            float fM5818e = 0.0f;
            if (t91Var != null && (z03VarM5146d = t91Var.m5146d()) != null) {
                y03 y03Var = z03VarM5146d.f13697a;
                if (i4 >= 0) {
                    x03 x03Var = y03Var.f13266a;
                    lj1 lj1Var = y03Var.f13267b;
                    if (x03Var.f12754a.f10051i.length() != 0) {
                        int iMin = Math.min(lj1Var.m2917d(i4), Math.min(lj1Var.f6147b - 1, lj1Var.f6151f - 1));
                        if (i4 <= lj1Var.m2916c(iMin, false)) {
                            lj1Var.m2924l(iMin);
                            ArrayList arrayList = lj1Var.f6153h;
                            rw1 rw1Var = (rw1) arrayList.get(AbstractC0179eu.m1427H(iMin, arrayList));
                            C0726t9 c0726t9 = rw1Var.f9775a;
                            int i5 = iMin - rw1Var.f9778d;
                            w03 w03Var = c0726t9.f10616d;
                            fM5818e = w03Var.m5818e(i5) - w03Var.m5821h(i5);
                        }
                    }
                }
            }
            float f = fM5818e;
            boolean zM1984h2 = go0Var.m1984h(kz2Var);
            Object objM1956L3 = go0Var.m1956L();
            if (zM1984h2 || objM1956L3 == c0160eb) {
                objM1956L3 = new C0647r8(5, kz2Var);
                go0Var.m1981f0(objM1956L3);
            }
            rp0.m4526L(ws1Var, z, c92Var, zM1498g, 0L, f, vw2.m5804a(rh1.f9587a, kz2Var, (PointerInputEventHandler) objM1956L3), go0Var, (i2 << 3) & 1008);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0639r0(z, c92Var, b03Var, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m5539d(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            if (z) {
                if (z) {
                }
            } else if (z) {
            }
        } else {
            if (z ? i3 - i2 <= i : i2 > i) {
                if (z) {
                    return i3 - i2;
                }
                return 0;
            }
            if (z) {
                return i - i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static final ao0 m5540e(ao0 ao0Var) {
        if (ao0Var == null) {
            ao0Var = null;
        }
        if (ao0Var != null) {
            return ao0Var;
        }
        AbstractC0752tx.m5444b("Inconsistent composition");
        C0676s.m4644b();
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static uh1 m5541f(uh1 uh1Var) {
        return uh1Var.mo4491c(new C0542og());
    }

    /* JADX INFO: renamed from: g */
    public static void m5542g(Path path, Path path2, Path path3) {
        Path pathM5550p = m5550p(path, path2);
        Path pathM5550p2 = m5550p(path, path3);
        if (Files.isSymbolicLink(pathM5550p) || !Files.isRegularFile(pathM5550p, LinkOption.NOFOLLOW_LINKS)) {
            c80.m680x("Native release temporary file is unsafe");
            return;
        }
        try {
            Files.move(pathM5550p, pathM5550p2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            m5554t(pathM5550p2.getParent());
        } catch (AtomicMoveNotSupportedException e) {
            throw new SecurityException("Native release storage does not support atomic moves", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m5543h(Path path, Path path2, byte[] bArr) {
        Path pathM5550p = m5550p(path, path2);
        Path parent = pathM5550p.getParent();
        m5552r(path, parent);
        Path pathCreateTempFile = Files.createTempFile(parent, pathM5550p.getFileName().toString() + ".", ".tmp", new FileAttribute[0]);
        FileChannel fileChannelOpen = FileChannel.open(pathCreateTempFile, StandardOpenOption.WRITE, LinkOption.NOFOLLOW_LINKS);
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            while (byteBufferWrap.hasRemaining()) {
                fileChannelOpen.write(byteBufferWrap);
            }
            fileChannelOpen.force(true);
            fileChannelOpen.close();
            try {
                m5542g(path, pathCreateTempFile, pathM5550p);
            } catch (Throwable th) {
                Files.deleteIfExists(pathCreateTempFile);
                throw th;
            }
        } catch (Throwable th2) {
            if (fileChannelOpen != null) {
                try {
                    fileChannelOpen.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final ap2 m5544i(String str, s11 s11Var, yo2[] yo2VarArr, in0 in0Var) {
        if (pv2.m4006s0(str)) {
            C0676s.m4651j("Blank serial names are prohibited");
            return null;
        }
        if (s11Var.equals(yv2.f13632g)) {
            C0676s.m4651j("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        C0105ct c0105ct = new C0105ct(str);
        in0Var.mo5j(c0105ct);
        return new ap2(str, s11Var, c0105ct.f1715b.size(), AbstractC0460mg.m3105t0(yo2VarArr), c0105ct);
    }

    /* JADX INFO: renamed from: j */
    public static ap2 m5545j(String str, s11 s11Var, yo2[] yo2VarArr) {
        if (pv2.m4006s0(str)) {
            C0676s.m4651j("Blank serial names are prohibited");
            return null;
        }
        if (s11Var.equals(yv2.f13632g)) {
            C0676s.m4651j("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        C0105ct c0105ct = new C0105ct(str);
        return new ap2(str, s11Var, c0105ct.f1715b.size(), AbstractC0460mg.m3105t0(yo2VarArr), c0105ct);
    }

    /* JADX INFO: renamed from: k */
    public static final void m5546k(int i, int i2) {
        if (i < 0 || i >= i2) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m5547l(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    /* JADX INFO: renamed from: m */
    public static final void m5548m(int i, int i2) {
        if (i < 0 || i > i2) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m5549n(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            c80.m673q(hk1.m2212k("fromIndex: ", i, i2, ", toIndex: ", ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            C0676s.m4651j(vi0.m5689h("fromIndex: ", i, " > toIndex: ", i2));
        }
    }

    /* JADX INFO: renamed from: p */
    public static Path m5550p(Path path, Path path2) {
        Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
        Path pathNormalize = path2.toAbsolutePath().normalize();
        if (!pathNormalize.startsWith(realPath)) {
            c80.m680x("Native release path escapes release root");
            return null;
        }
        Iterator<Path> it = realPath.relativize(pathNormalize).iterator();
        while (it.hasNext()) {
            realPath = realPath.resolve(it.next());
            if (Files.exists(realPath, LinkOption.NOFOLLOW_LINKS) && Files.isSymbolicLink(realPath)) {
                c80.m680x("Native release path contains a symbolic link");
                return null;
            }
        }
        return pathNormalize;
    }

    /* JADX INFO: renamed from: q */
    public static final jc2 m5551q(wj1 wj1Var) {
        LinkedHashMap linkedHashMap = wj1Var.f9877a;
        tc2 tc2Var = (tc2) linkedHashMap.get(f11398f);
        Bundle bundle = null;
        if (tc2Var == null) {
            C0676s.m4651j("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        lb3 lb3Var = (lb3) linkedHashMap.get(f11399g);
        if (lb3Var == null) {
            C0676s.m4651j("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(f11400h);
        String str = (String) linkedHashMap.get(AbstractC0570p7.f7998g);
        if (str == null) {
            C0676s.m4651j("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        pc2 pc2VarM4134b = tc2Var.getSavedStateRegistry().m4134b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        mc2 mc2Var = pc2VarM4134b instanceof mc2 ? (mc2) pc2VarM4134b : null;
        if (mc2Var == null) {
            C0676s.m4653l("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = m5557w(lb3Var).f7109b;
        jc2 jc2Var = (jc2) linkedHashMap2.get(str);
        if (jc2Var != null) {
            return jc2Var;
        }
        mc2Var.m3058b();
        Bundle bundle3 = mc2Var.f6564c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = AbstractC0738tl.m5313l((ow1[]) Arrays.copyOf(new ow1[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                mc2Var.f6564c = null;
            }
            bundle = bundle4;
        }
        jc2 jc2VarM3732o = p40.m3732o(bundle, bundle2);
        linkedHashMap2.put(str, jc2VarM3732o);
        return jc2VarM3732o;
    }

    /* JADX INFO: renamed from: r */
    public static void m5552r(Path path, Path path2) {
        Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
        Path pathNormalize = path2.toAbsolutePath().normalize();
        if (!pathNormalize.startsWith(realPath)) {
            c80.m680x("Native release path escapes trusted storage");
            return;
        }
        Iterator<Path> it = realPath.relativize(pathNormalize).iterator();
        while (it.hasNext()) {
            realPath = realPath.resolve(it.next());
            LinkOption linkOption = LinkOption.NOFOLLOW_LINKS;
            if (!Files.exists(realPath, linkOption)) {
                Files.createDirectory(realPath, new FileAttribute[0]);
            } else if (Files.isSymbolicLink(realPath) || !Files.isDirectory(realPath, linkOption)) {
                c80.m680x("Native release directory is unsafe");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m5553s(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: t */
    public static void m5554t(Path path) {
        try {
            FileChannel fileChannelOpen = FileChannel.open(path, StandardOpenOption.READ);
            try {
                fileChannelOpen.force(true);
                fileChannelOpen.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: u */
    public static long m5555u(Context context, int i) {
        return sp0.m4930b(context.getResources().getColor(i, context.getTheme()));
    }

    /* JADX INFO: renamed from: v */
    public static final int m5556v(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX INFO: renamed from: w */
    public static final nc2 m5557w(lb3 lb3Var) {
        lc2 lc2Var = new lc2();
        s20 defaultViewModelCreationExtras = lb3Var instanceof es0 ? ((es0) lb3Var).getDefaultViewModelCreationExtras() : r20.f9329b;
        defaultViewModelCreationExtras.getClass();
        kb3 viewModelStore = lb3Var.getViewModelStore();
        viewModelStore.getClass();
        return (nc2) new kj1(viewModelStore, lc2Var, defaultViewModelCreationExtras).m2698B(d72.m967a(nc2.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* JADX INFO: renamed from: x */
    public static String m5558x(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(80);
        int i4 = (~i2) & i;
        int i5 = i & i2;
        if ((i5 & 1) != 0) {
            sb.append("|public");
        }
        if ((i5 & 2) != 0) {
            sb.append("|private");
        }
        if ((i5 & 4) != 0) {
            sb.append("|protected");
        }
        if ((i5 & 8) != 0) {
            sb.append("|static");
        }
        if ((i5 & 16) != 0) {
            sb.append("|final");
        }
        if ((i5 & 32) != 0) {
            if (i3 == 1) {
                sb.append("|super");
            } else {
                sb.append("|synchronized");
            }
        }
        if ((i5 & 64) != 0) {
            if (i3 == 3) {
                sb.append("|bridge");
            } else {
                sb.append("|volatile");
            }
        }
        if ((i5 & 128) != 0) {
            if (i3 == 3) {
                sb.append("|varargs");
            } else {
                sb.append("|transient");
            }
        }
        if ((i5 & 256) != 0) {
            sb.append("|native");
        }
        if ((i5 & AIChatConfig.DefaultMaxTokens) != 0) {
            sb.append("|interface");
        }
        if ((i5 & 1024) != 0) {
            sb.append("|abstract");
        }
        if ((i5 & 2048) != 0) {
            sb.append("|strictfp");
        }
        if ((i5 & 4096) != 0) {
            sb.append("|synthetic");
        }
        if ((i5 & 8192) != 0) {
            sb.append("|annotation");
        }
        if ((i5 & 16384) != 0) {
            sb.append("|enum");
        }
        if ((65536 & i5) != 0) {
            sb.append("|constructor");
        }
        if ((i5 & 131072) != 0) {
            sb.append("|declared_synchronized");
        }
        if (i4 != 0 || sb.length() == 0) {
            sb.append('|');
            sb.append(pp0.m3898J(i4));
        }
        return sb.substring(1);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m5559y(Path path, Path path2) {
        try {
            Path pathM5550p = m5550p(path, path2);
            if (!Files.isSymbolicLink(pathM5550p)) {
                if (Files.isRegularFile(pathM5550p, LinkOption.NOFOLLOW_LINKS)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m5560z(int i, int i2, long j) {
        int iM1765j = C0221fz.m1765j(j);
        if (i > C0221fz.m1763h(j) || iM1765j > i) {
            return false;
        }
        return i2 <= C0221fz.m1762g(j) && C0221fz.m1764i(j) <= i2;
    }

    /* JADX INFO: renamed from: o */
    public abstract List mo847o(String str, List list);
}
