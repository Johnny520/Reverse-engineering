package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class up0 {
    public static final i51 f;
    public static final j51 g;
    public static Context i;
    public static ClassLoader j;
    public static Activity k;
    public static String l;
    public static String m;
    public static String n;
    public static sx0 o;
    public static final kw a = new kw(-1551526251, false, new ye(22));
    public static final kw b = new kw(1982100539, false, new ye(23));
    public static final dh0 c = new dh0(0);
    public static final dh0 d = new dh0(1);
    public static final hh1 e = new hh1(19, "NULL");
    public static final i51 h = new i51(21);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i2 = 20;
        f = new i51(i2);
        g = new j51(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final q51 A(in0 in0Var) {
        p51 p51Var = new p51();
        in0Var.j(p51Var);
        return new q51(p51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 B(in0 in0Var) {
        return new f51(in0Var, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 C(uh1 uh1Var, in0 in0Var) {
        return uh1Var.c(new f51(null, in0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BigDecimal D(String str) {
        l(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static rf2 E(lf2 lf2Var, d41 d41Var) {
        lf2Var.getClass();
        d41Var.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set setKeySet = d41Var.h.keySet();
        LinkedHashMap linkedHashMap2 = lf2Var.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : setKeySet) {
            if (!linkedHashMap2.containsKey((String) obj)) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(new gf2((String) it.next(), "Unknown config value is ignored.", hf2.h));
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            kf2 kf2Var = (kf2) entry.getValue();
            j31 j31Var = (j31) d41Var.get(str);
            if (j31Var != null) {
                String strM = M(kf2Var, j31Var);
                if (strM == null) {
                    linkedHashMap.put(str, j31Var);
                } else {
                    arrayList.add(new gf2(str, strM));
                }
            } else {
                j31 j31Var2 = kf2Var.e;
                if (j31Var2 != null) {
                    linkedHashMap.put(str, j31Var2);
                } else if (kf2Var.f) {
                    arrayList.add(new gf2(str, "Required config value is missing."));
                }
            }
        }
        return new rf2(d41Var, new d41(linkedHashMap), arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final d11 F(o62 o62Var) {
        return new d11(Math.round(o62Var.a), Math.round(o62Var.b), Math.round(o62Var.c), Math.round(o62Var.d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static qt2 G(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new qt2(f2, f3, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Class H(String str) {
        Object x92Var;
        Object x92Var2;
        ClassLoader classLoader;
        str.getClass();
        try {
            classLoader = j;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (classLoader == null) {
            t11.S("hostClassLoader");
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String I(long j2) {
        return "PointerId(value=" + j2 + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static m43 J(int i2, gd0 gd0Var, int i3) {
        if ((i3 & 4) != 0) {
            gd0Var = hd0.a;
        }
        return new m43(i2, gd0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String K(double d2, Double d3, Double d4, Double d5) {
        if (d3 != null && d2 < d3.doubleValue()) {
            return "Value must be at least " + d3 + ".";
        }
        if (d4 != null && d2 > d4.doubleValue()) {
            return "Value must be at most " + d4 + ".";
        }
        if (d5 == null) {
            return null;
        }
        if (Math.abs((d2 / d5.doubleValue()) - ((long) r3)) < 1.0E-9d) {
            return null;
        }
        return "Value must be a multiple of " + d5 + ".";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String L(uf2 uf2Var, j31 j31Var, Double d2, Double d3, Double d4, Integer num, Integer num2, String str, if2 if2Var, int i2, int i3, boolean z) {
        String strA;
        Object x92Var;
        int iOrdinal = uf2Var.ordinal();
        Long lF = null;
        dV = null;
        Double dV = null;
        lF = null;
        if (iOrdinal == 0) {
            i41 i41Var = j31Var instanceof i41 ? (i41) j31Var : null;
            if (i41Var == null || i41Var.b() || l31.d(i41Var) == null) {
                return "Value must be a boolean.";
            }
        } else {
            if (iOrdinal == 1) {
                i41 i41Var2 = j31Var instanceof i41 ? (i41) j31Var : null;
                if (i41Var2 != null) {
                    if (i41Var2.b()) {
                        i41Var2 = null;
                    }
                    if (i41Var2 != null) {
                        lF = l31.f(i41Var2);
                    }
                }
                return lF == null ? "Value must be an integer." : Math.abs((double) lF.longValue()) > 9.007199254740991E15d ? "Integer exceeds JavaScript safe range." : K(lF.longValue(), d2, d3, d4);
            }
            if (iOrdinal == 2) {
                i41 i41Var3 = j31Var instanceof i41 ? (i41) j31Var : null;
                if (i41Var3 != null) {
                    if (i41Var3.b()) {
                        i41Var3 = null;
                    }
                    if (i41Var3 != null) {
                        gz0 gz0Var = l31.a;
                        dV = vv2.V(i41Var3.a());
                    }
                }
                return (dV == null || Math.abs(dV.doubleValue()) > Double.MAX_VALUE) ? "Value must be a finite number." : K(dV.doubleValue(), d2, d3, d4);
            }
            int i4 = 0;
            if (iOrdinal == 3) {
                i41 i41Var4 = j31Var instanceof i41 ? (i41) j31Var : null;
                if (i41Var4 == null) {
                    strA = null;
                } else {
                    if (!i41Var4.b()) {
                        i41Var4 = null;
                    }
                    if (i41Var4 != null) {
                        gz0 gz0Var2 = l31.a;
                        if (!(i41Var4 instanceof z31)) {
                            strA = i41Var4.a();
                        }
                    }
                }
                if (strA == null) {
                    return "Value must be a string.";
                }
                int iCodePointCount = strA.codePointCount(0, strA.length());
                if (num != null && iCodePointCount < num.intValue()) {
                    return "Text is shorter than " + num + " characters.";
                }
                if (num2 != null && iCodePointCount > num2.intValue()) {
                    return "Text is longer than " + num2 + " characters.";
                }
                if (t11.l(str, "nonBlank") && pv2.s0(strA)) {
                    return "Text must not be blank.";
                }
                if (t11.l(str, "digits")) {
                    while (i4 < strA.length()) {
                        char cCharAt = strA.charAt(i4);
                        if ('0' > cCharAt || cCharAt >= ':') {
                            return "Text must contain only digits.";
                        }
                        i4++;
                    }
                }
                if (!t11.l(str, "uri")) {
                    return null;
                }
                try {
                    x92Var = Boolean.valueOf(new URI(strA).isAbsolute());
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
                c80.s();
                return null;
            }
            z21 z21Var = j31Var instanceof z21 ? (z21) j31Var : null;
            if (z21Var == null) {
                return "Value must be an array.";
            }
            List list = z21Var.h;
            if (list.size() < i2) {
                return hk1.g(i2, "Array must contain at least ", " items.");
            }
            if (list.size() > i3) {
                return hk1.g(i3, "Array must contain at most ", " items.");
            }
            if (z && du.F0(du.J0(z21Var)).size() != list.size()) {
                return "Array items must be unique.";
            }
            if (if2Var == null) {
                return "Array item schema is missing.";
            }
            for (Object obj2 : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    eu.a0();
                    throw null;
                }
                j31 j31Var2 = (j31) obj2;
                uf2 uf2Var2 = if2Var.a;
                List list2 = if2Var.b;
                String strL = L(uf2Var2, j31Var2, if2Var.c, if2Var.d, if2Var.e, if2Var.f, if2Var.g, if2Var.h, null, 0, 0, false);
                if (strL == null) {
                    if (list2.isEmpty()) {
                        strL = null;
                        break;
                    }
                    if (!list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((jf2) it.next()).a.equals(j31Var2)) {
                                strL = null;
                                break;
                            }
                        }
                    }
                    strL = "Value is not one of the allowed options.";
                }
                if (strL != null) {
                    return "Array item " + i4 + " is invalid: " + strL;
                }
                i4 = i5;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String M(kf2 kf2Var, j31 j31Var) {
        kf2Var.getClass();
        List list = kf2Var.h;
        j31Var.getClass();
        String strL = L(kf2Var.b, j31Var, kf2Var.i, kf2Var.j, kf2Var.k, kf2Var.l, kf2Var.m, kf2Var.n, kf2Var.o, kf2Var.p, kf2Var.q, kf2Var.r);
        if (strL != null) {
            return strL;
        }
        if (list.isEmpty()) {
            return null;
        }
        if (list.isEmpty()) {
            return "Value is not one of the allowed options.";
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((jf2) it.next()).a.equals(j31Var)) {
                return null;
            }
        }
        return "Value is not one of the allowed options.";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int N(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h70 a() {
        return new h70(1.0f, 1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(int i2, in0 in0Var, px pxVar, int i3) {
        in0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(-450323870);
        int i4 = (go0Var.d(i2) ? 4 : 2) | i3 | (go0Var.h(in0Var) ? 32 : 16);
        if (go0Var.O(i4 & 1, (i4 & 19) != 18)) {
            ci0.p(xe1.i0(1404157421, new ge0(i2, in0Var), go0Var), go0Var, 6);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ge0(i2, i3, in0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(boolean z, c92 c92Var, b03 b03Var, px pxVar, int i2) {
        int i3;
        z03 z03VarD;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1344558920);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.d(c92Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.h(b03Var) ? 256 : 128;
        }
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 14;
            boolean zF = (i4 == 4) | go0Var.f(b03Var);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (zF || objL == ebVar) {
                objL = new yz2(b03Var, z);
                go0Var.f0(objL);
            }
            kz2 kz2Var = (kz2) objL;
            boolean zH = (i4 == 4) | go0Var.h(b03Var);
            Object objL2 = go0Var.L();
            if (zH || objL2 == ebVar) {
                objL2 = new c03(b03Var, z);
                go0Var.f0(objL2);
            }
            ws1 ws1Var = (ws1) objL2;
            boolean zG = f13.g(b03Var.n().b);
            int i5 = (int) (z ? b03Var.n().b >> 32 : b03Var.n().b & 4294967295L);
            t91 t91Var = b03Var.d;
            float fE = 0.0f;
            if (t91Var != null && (z03VarD = t91Var.d()) != null) {
                y03 y03Var = z03VarD.a;
                if (i5 >= 0) {
                    x03 x03Var = y03Var.a;
                    lj1 lj1Var = y03Var.b;
                    if (x03Var.a.i.length() != 0) {
                        int iMin = Math.min(lj1Var.d(i5), Math.min(lj1Var.b - 1, lj1Var.f - 1));
                        if (i5 <= lj1Var.c(iMin, false)) {
                            lj1Var.l(iMin);
                            ArrayList arrayList = lj1Var.h;
                            rw1 rw1Var = (rw1) arrayList.get(eu.H(iMin, arrayList));
                            t9 t9Var = rw1Var.a;
                            int i6 = iMin - rw1Var.d;
                            w03 w03Var = t9Var.d;
                            fE = w03Var.e(i6) - w03Var.h(i6);
                        }
                    }
                }
            }
            float f2 = fE;
            boolean zH2 = go0Var.h(kz2Var);
            Object objL3 = go0Var.L();
            if (zH2 || objL3 == ebVar) {
                objL3 = new r8(5, kz2Var);
                go0Var.f0(objL3);
            }
            rp0.L(ws1Var, z, c92Var, zG, 0L, f2, vw2.a(rh1.a, kz2Var, (PointerInputEventHandler) objL3), go0Var, (i3 << 3) & 1008);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new r0(z, c92Var, b03Var, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int d(int i2, int i3, int i4, boolean z) {
        if (i3 >= i4) {
            if (z) {
                return 0;
            }
            return i4 - i3;
        }
        if (z) {
            if (z) {
                if (z) {
                }
            } else if (z) {
            }
        } else {
            if (z ? i4 - i3 <= i2 : i3 > i2) {
                if (z) {
                    return i4 - i3;
                }
                return 0;
            }
            if (z) {
                return i2 - i3;
            }
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ao0 e(ao0 ao0Var) {
        if (ao0Var == null) {
            ao0Var = null;
        }
        if (ao0Var != null) {
            return ao0Var;
        }
        tx.b("Inconsistent composition");
        s.b();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 f(uh1 uh1Var) {
        return uh1Var.c(new og());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(Path path, Path path2, Path path3) {
        Path pathP = p(path, path2);
        Path pathP2 = p(path, path3);
        if (Files.isSymbolicLink(pathP) || !Files.isRegularFile(pathP, LinkOption.NOFOLLOW_LINKS)) {
            c80.x("Native release temporary file is unsafe");
            return;
        }
        try {
            Files.move(pathP, pathP2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            t(pathP2.getParent());
        } catch (AtomicMoveNotSupportedException e2) {
            throw new SecurityException("Native release storage does not support atomic moves", e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(Path path, Path path2, byte[] bArr) {
        Path pathP = p(path, path2);
        Path parent = pathP.getParent();
        r(path, parent);
        Path pathCreateTempFile = Files.createTempFile(parent, pathP.getFileName().toString() + ".", ".tmp", new FileAttribute[0]);
        FileChannel fileChannelOpen = FileChannel.open(pathCreateTempFile, StandardOpenOption.WRITE, LinkOption.NOFOLLOW_LINKS);
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            while (byteBufferWrap.hasRemaining()) {
                fileChannelOpen.write(byteBufferWrap);
            }
            fileChannelOpen.force(true);
            fileChannelOpen.close();
            try {
                g(path, pathCreateTempFile, pathP);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ap2 i(String str, s11 s11Var, yo2[] yo2VarArr, in0 in0Var) {
        if (pv2.s0(str)) {
            s.j("Blank serial names are prohibited");
            return null;
        }
        if (s11Var.equals(yv2.g)) {
            s.j("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        ct ctVar = new ct(str);
        in0Var.j(ctVar);
        return new ap2(str, s11Var, ctVar.b.size(), mg.t0(yo2VarArr), ctVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ap2 j(String str, s11 s11Var, yo2[] yo2VarArr) {
        if (pv2.s0(str)) {
            s.j("Blank serial names are prohibited");
            return null;
        }
        if (s11Var.equals(yv2.g)) {
            s.j("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        ct ctVar = new ct(str);
        return new ap2(str, s11Var, ctVar.b.size(), mg.t0(yo2VarArr), ctVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            s.d(vi0.h("index: ", i2, ", size: ", i3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            s.d(vi0.h("index: ", i2, ", size: ", i3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            c80.q(hk1.k("fromIndex: ", i2, i3, ", toIndex: ", ", size: "), i4);
        } else {
            if (i2 <= i3) {
                return;
            }
            s.j(vi0.h("fromIndex: ", i2, " > toIndex: ", i3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Path p(Path path, Path path2) {
        Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
        Path pathNormalize = path2.toAbsolutePath().normalize();
        if (!pathNormalize.startsWith(realPath)) {
            c80.x("Native release path escapes release root");
            return null;
        }
        Iterator<Path> it = realPath.relativize(pathNormalize).iterator();
        while (it.hasNext()) {
            realPath = realPath.resolve(it.next());
            if (Files.exists(realPath, LinkOption.NOFOLLOW_LINKS) && Files.isSymbolicLink(realPath)) {
                c80.x("Native release path contains a symbolic link");
                return null;
            }
        }
        return pathNormalize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final jc2 q(wj1 wj1Var) {
        LinkedHashMap linkedHashMap = wj1Var.a;
        tc2 tc2Var = (tc2) linkedHashMap.get(f);
        Bundle bundle = null;
        if (tc2Var == null) {
            s.j("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        lb3 lb3Var = (lb3) linkedHashMap.get(g);
        if (lb3Var == null) {
            s.j("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(h);
        String str = (String) linkedHashMap.get(p7.g);
        if (str == null) {
            s.j("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        pc2 pc2VarB = tc2Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        mc2 mc2Var = pc2VarB instanceof mc2 ? (mc2) pc2VarB : null;
        if (mc2Var == null) {
            s.l("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = w(lb3Var).b;
        jc2 jc2Var = (jc2) linkedHashMap2.get(str);
        if (jc2Var != null) {
            return jc2Var;
        }
        mc2Var.b();
        Bundle bundle3 = mc2Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = tl.l((ow1[]) Arrays.copyOf(new ow1[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                mc2Var.c = null;
            }
            bundle = bundle4;
        }
        jc2 jc2VarO = p40.o(bundle, bundle2);
        linkedHashMap2.put(str, jc2VarO);
        return jc2VarO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void r(Path path, Path path2) {
        Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
        Path pathNormalize = path2.toAbsolutePath().normalize();
        if (!pathNormalize.startsWith(realPath)) {
            c80.x("Native release path escapes trusted storage");
            return;
        }
        Iterator<Path> it = realPath.relativize(pathNormalize).iterator();
        while (it.hasNext()) {
            realPath = realPath.resolve(it.next());
            LinkOption linkOption = LinkOption.NOFOLLOW_LINKS;
            if (!Files.exists(realPath, linkOption)) {
                Files.createDirectory(realPath, new FileAttribute[0]);
            } else if (Files.isSymbolicLink(realPath) || !Files.isDirectory(realPath, linkOption)) {
                c80.x("Native release directory is unsafe");
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean s(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void t(Path path) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long u(Context context, int i2) {
        return sp0.b(context.getResources().getColor(i2, context.getTheme()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int v(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final nc2 w(lb3 lb3Var) {
        lc2 lc2Var = new lc2();
        s20 defaultViewModelCreationExtras = lb3Var instanceof es0 ? ((es0) lb3Var).getDefaultViewModelCreationExtras() : r20.b;
        defaultViewModelCreationExtras.getClass();
        kb3 viewModelStore = lb3Var.getViewModelStore();
        viewModelStore.getClass();
        return (nc2) new kj1(viewModelStore, lc2Var, defaultViewModelCreationExtras).B(d72.a(nc2.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String x(int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder(80);
        int i5 = (~i3) & i2;
        int i6 = i2 & i3;
        if ((i6 & 1) != 0) {
            sb.append("|public");
        }
        if ((i6 & 2) != 0) {
            sb.append("|private");
        }
        if ((i6 & 4) != 0) {
            sb.append("|protected");
        }
        if ((i6 & 8) != 0) {
            sb.append("|static");
        }
        if ((i6 & 16) != 0) {
            sb.append("|final");
        }
        if ((i6 & 32) != 0) {
            if (i4 == 1) {
                sb.append("|super");
            } else {
                sb.append("|synchronized");
            }
        }
        if ((i6 & 64) != 0) {
            if (i4 == 3) {
                sb.append("|bridge");
            } else {
                sb.append("|volatile");
            }
        }
        if ((i6 & 128) != 0) {
            if (i4 == 3) {
                sb.append("|varargs");
            } else {
                sb.append("|transient");
            }
        }
        if ((i6 & 256) != 0) {
            sb.append("|native");
        }
        if ((i6 & AIChatConfig.DefaultMaxTokens) != 0) {
            sb.append("|interface");
        }
        if ((i6 & 1024) != 0) {
            sb.append("|abstract");
        }
        if ((i6 & 2048) != 0) {
            sb.append("|strictfp");
        }
        if ((i6 & 4096) != 0) {
            sb.append("|synthetic");
        }
        if ((i6 & 8192) != 0) {
            sb.append("|annotation");
        }
        if ((i6 & 16384) != 0) {
            sb.append("|enum");
        }
        if ((65536 & i6) != 0) {
            sb.append("|constructor");
        }
        if ((i6 & 131072) != 0) {
            sb.append("|declared_synchronized");
        }
        if (i5 != 0 || sb.length() == 0) {
            sb.append('|');
            sb.append(pp0.J(i5));
        }
        return sb.substring(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean y(Path path, Path path2) {
        try {
            Path pathP = p(path, path2);
            if (!Files.isSymbolicLink(pathP)) {
                if (Files.isRegularFile(pathP, LinkOption.NOFOLLOW_LINKS)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean z(int i2, int i3, long j2) {
        int iJ = fz.j(j2);
        if (i2 > fz.h(j2) || iJ > i2) {
            return false;
        }
        return i3 <= fz.g(j2) && fz.i(j2) <= i3;
    }

    public abstract List o(String str, List list);
}
