package p000;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.dokar.quickjs.binding.JsObject;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.UByteArray;
import me.dartcv.nuke.R;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: te */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0731te {

    /* JADX INFO: renamed from: b */
    public static ca2 f10690b = null;

    /* JADX INFO: renamed from: i */
    public static final float f10697i = 24.0f;

    /* JADX INFO: renamed from: a */
    public static final sz0 f10689a = new sz0(10, false);

    /* JADX INFO: renamed from: c */
    public static final Object f10691c = new Object();

    /* JADX INFO: renamed from: d */
    public static final StackTraceElement[] f10692d = new StackTraceElement[0];

    /* JADX INFO: renamed from: e */
    public static final yi0 f10693e = new yi0(t80.f10604i);

    /* JADX INFO: renamed from: f */
    public static final yi0 f10694f = new yi0(t80.f10603h);

    /* JADX INFO: renamed from: g */
    public static final yi0 f10695g = new yi0(t80.f10605j);

    /* JADX INFO: renamed from: h */
    public static final uc3 f10696h = new uc3();

    /* JADX INFO: renamed from: A */
    public static String m5173A(long j) {
        double d = j < 0 ? 0L : j;
        if (d >= 1048576.0d) {
            return String.format(Locale.US, "%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(d / 1048576.0d)}, 1));
        }
        if (d >= 1024.0d) {
            return String.format(Locale.US, "%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(d / 1024.0d)}, 1));
        }
        if (j < 0) {
            j = 0;
        }
        return j + " B";
    }

    /* JADX INFO: renamed from: B */
    public static yr0 m5174B(SSLSession sSLSession) throws IOException {
        Object objM5897j;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            C0676s.m4653l("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            c80.m678v("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        C0591ps c0591psM6399j = C0591ps.f8529b.m6399j(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            C0676s.m4653l("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            c80.m678v("tlsVersion == NONE");
            return null;
        }
        s23.f9881i.getClass();
        s23 s23VarM2412e = ix2.m2412e(protocol);
        try {
            objM5897j = wg3.m5897j(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objM5897j = be0.f819h;
        }
        return new yr0(s23VarM2412e, c0591psM6399j, wg3.m5897j(sSLSession.getLocalCertificates()), new C0727ta(8, objM5897j));
    }

    /* JADX INFO: renamed from: C */
    public static vf1 m5175C(String str) {
        str.getClass();
        kj1 kj1VarM3538a = vf1.f11926d.m3538a(str, 0);
        if (kj1VarM3538a == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String str2 = (String) ((bf1) kj1VarM3538a.m2715x()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((bf1) kj1VarM3538a.m2715x()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = kj1VarM3538a.m2717z().f26i;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new vf1(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            kj1 kj1VarM3538a2 = vf1.f11927e.m3538a(str, i2);
            if (kj1VarM3538a2 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
            }
            cf1 cf1Var = (cf1) kj1VarM3538a2.f5596k;
            af1 af1VarM767b = cf1Var.m767b(1);
            String str3 = af1VarM767b != null ? af1VarM767b.f184a : null;
            if (str3 == null) {
                i = kj1VarM3538a2.m2717z().f26i;
            } else {
                af1 af1VarM767b2 = cf1Var.m767b(2);
                String strSubstring = af1VarM767b2 != null ? af1VarM767b2.f184a : null;
                if (strSubstring == null) {
                    af1 af1VarM767b3 = cf1Var.m767b(3);
                    af1VarM767b3.getClass();
                    strSubstring = af1VarM767b3.f184a;
                } else if (pv2.m3989E0(strSubstring, '\'') && pv2.m4000m0(strSubstring, '\'') && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(strSubstring);
                i = kj1VarM3538a2.m2717z().f26i;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public static final C0440lx m5176E(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (C0440lx) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static final float m5177F(a20 a20Var) {
        fi1 fi1Var = (fi1) a20Var.mo15o(C0700sn.f10209M);
        float fMo1656v = fi1Var != null ? fi1Var.mo1656v() : 1.0f;
        if (fMo1656v >= 0.0f) {
            return fMo1656v;
        }
        l22.m2786b("negative scale factor");
        return fMo1656v;
    }

    /* JADX INFO: renamed from: G */
    public static int m5178G(int i, int i2) {
        if (i2 >= 268435456) {
            C0676s.m4653l("data size out of limit");
            return 0;
        }
        int i3 = bi0.f866z;
        if (i2 <= i3) {
            return i3;
        }
        while (i < i2) {
            i <<= 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: H */
    public static LinkedHashSet m5179H(bi0 bi0Var, C0865wz c0865wz) {
        String str = bi0Var.f868b;
        try {
            byte[] bArrM2167e = hg3.m2167e(new File(bi0Var.f867a + str, (String) c0865wz.f13677b));
            if (bArrM2167e == null) {
                Log.w("FastKV", str, new Exception("Read object data failed"));
                return null;
            }
            int i = bArrM2167e[0] & 255;
            String strM1297d = bi0Var.f874h.m1297d(bArrM2167e, 1, i);
            if (((ov2) bi0Var.f869c.get(strM1297d)) != null) {
                int i2 = i + 1;
                return ov2.m3644a(bArrM2167e, i2, bArrM2167e.length - i2);
            }
            Log.w("FastKV", str, new Exception("No encoder for tag:".concat(strM1297d)));
            return null;
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: I */
    public static final long m5180I(C0485n4 c0485n4) {
        DragEvent dragEvent = (DragEvent) c0485n4.f6983i;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    /* JADX INFO: renamed from: J */
    public static final lm2 m5181J(Object obj) {
        if (obj != xe1.f12996e) {
            return (lm2) obj;
        }
        C0676s.m4653l("Does not contain segment");
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static String m5182K(bi0 bi0Var, C0904xz c0904xz) {
        String str = bi0Var.f868b;
        try {
            byte[] bArrM2167e = hg3.m2167e(new File(bi0Var.f867a + str, (String) c0904xz.f13677b));
            if (bArrM2167e != null) {
                return new String(bArrM2167e, StandardCharsets.UTF_8);
            }
            return null;
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static final uh1 m5183L(uh1 uh1Var, in0 in0Var) {
        return uh1Var.mo4491c(new C0134dl(in0Var));
    }

    /* JADX INFO: renamed from: M */
    public static final uh1 m5184M(uh1 uh1Var, float f, float f2, float f3, float f4, long j, eq2 eq2Var, boolean z, long j2, long j3) {
        return uh1Var.mo4491c(new qq0(f, f2, f3, f4, j, eq2Var, z, j2, j3));
    }

    /* JADX INFO: renamed from: N */
    public static uh1 m5185N(uh1 uh1Var, float f, float f2, float f3, eq2 eq2Var, int i) {
        float f4 = (i & 1) != 0 ? 1.0f : f;
        float f5 = (i & 2) != 0 ? 1.0f : f2;
        float f6 = (i & 4) != 0 ? 1.0f : f3;
        long j = m33.f6464b;
        eq2 eq2Var2 = (i & 2048) != 0 ? sp0.f10267h : eq2Var;
        boolean z = (i & 4096) == 0;
        long j2 = tq0.f10898a;
        return m5184M(uh1Var, f4, f5, f6, 0.0f, j, eq2Var2, z, j2, j2);
    }

    /* JADX INFO: renamed from: O */
    public static final uh1 m5186O(uh1 uh1Var, float f) {
        return uh1Var.mo4491c(new kr2(0.0f, f, 0.0f, f, 5));
    }

    /* JADX INFO: renamed from: P */
    public static uh1 m5187P(uh1 uh1Var, float f, float f2, int i) {
        return uh1Var.mo4491c(new kr2(0.0f, (i & 1) != 0 ? Float.NaN : f, 0.0f, (i & 2) != 0 ? Float.NaN : f2, 5));
    }

    /* JADX INFO: renamed from: Q */
    public static final boolean m5188Q(j20 j20Var) {
        k21 k21Var = (k21) j20Var.mo705g().mo15o(C0700sn.f10207K);
        if (k21Var != null) {
            return k21Var.mo1703b();
        }
        return true;
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m5189R(Object obj) {
        return obj == xe1.f12996e;
    }

    /* JADX INFO: renamed from: S */
    public static boolean m5190S(vu0 vu0Var) {
        Object x92Var;
        Object x92Var2;
        try {
            x92Var = pp0.m3923u(vu0Var);
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thM6237a = y92.m6237a(x92Var);
        Object x92Var3 = a83.f116a;
        if (thM6237a != null) {
            String string = "Generate DexCacheSumSign failed: ".concat(fg1.m1624Q(thM6237a)).toString();
            try {
                XposedBridge.log("[NukeCore]" + string);
            } catch (Throwable th2) {
                x92Var3 = new x92(th2);
            }
            if (!(x92Var3 instanceof x92)) {
                return false;
            }
            Log.println(6, "NukeCore", string);
            return false;
        }
        String str = (String) x92Var;
        try {
            pp1 pp1Var = pp1.f8445a;
            x92Var2 = "";
            String strM3606c = pp1.m3930b().m3606c("Dex_Cache_Sum_Sign");
            if (strM3606c != null) {
                x92Var2 = strM3606c;
            }
        } catch (Throwable th3) {
            x92Var2 = new x92(th3);
        }
        Throwable thM6237a2 = y92.m6237a(x92Var2);
        if (thM6237a2 == null) {
            return ((String) x92Var2).equals(str);
        }
        String string2 = "Read DexCacheSumSign failed: ".concat(fg1.m1624Q(thM6237a2)).toString();
        try {
            XposedBridge.log("[NukeCore]" + string2);
        } catch (Throwable th4) {
            x92Var3 = new x92(th4);
        }
        if (!(x92Var3 instanceof x92)) {
            return false;
        }
        Log.println(6, "NukeCore", string2);
        return false;
    }

    /* JADX INFO: renamed from: T */
    public static final boolean m5191T(KeyEvent keyEvent) {
        long jM4271z = qp0.m4271z(keyEvent);
        int i = b51.f580O;
        return b51.m440a(jM4271z, b51.f588h) || b51.m440a(jM4271z, b51.f598r) || b51.m440a(jM4271z, b51.f570E) || b51.m440a(jM4271z, b51.f597q);
    }

    /* JADX INFO: renamed from: U */
    public static void m5192U(bi0 bi0Var) {
        long j;
        String str = bi0Var.f867a;
        StringBuilder sb = new StringBuilder();
        String str2 = bi0Var.f868b;
        File file = new File(str, hk1.m2211j(sb, str2, ".kva"));
        File file2 = new File(str, hk1.m2209h(str2, ".kvb"));
        try {
            if (hg3.m2170h(file) && hg3.m2170h(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                bi0Var.f883q = randomAccessFile.getChannel();
                bi0Var.f884r = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = bi0Var.f883q;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : bi0.f866z);
                    bi0Var.f885s = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    FileChannel fileChannel2 = bi0Var.f884r;
                    if (length2 > 0) {
                        j = length2;
                    } else {
                        j = bi0.f866z;
                        fileChannel2 = fileChannel2;
                    }
                    MappedByteBuffer map2 = fileChannel2.map(mapMode, 0L, j);
                    bi0Var.f886t = map2;
                    map2.order(byteOrder);
                    bi0Var.f874h = new C0158e9(bi0Var.f885s.capacity(), 3);
                    if (length == 0 && length2 == 0) {
                        bi0Var.f870d = 12;
                        return;
                    } else {
                        m5197Z(bi0Var, length, length2);
                        return;
                    }
                } catch (IOException e) {
                    Log.e("FastKV", str2, e);
                    m5219k0(bi0Var);
                    m5223m0(bi0Var, file, file2);
                    return;
                }
            }
            Log.e("FastKV", str2, new Exception("open file failed"));
            m5219k0(bi0Var);
        } catch (Exception e2) {
            Log.e("FastKV", str2, e2);
            m5205d0(bi0Var);
            m5219k0(bi0Var);
        }
    }

    /* JADX INFO: renamed from: V */
    public static boolean m5193V(bi0 bi0Var) {
        String str = bi0Var.f867a;
        StringBuilder sb = new StringBuilder();
        String str2 = bi0Var.f868b;
        File file = new File(str, hk1.m2211j(sb, str2, ".kvc"));
        File file2 = new File(str, hk1.m2209h(str2, ".tmp"));
        boolean z = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!m5194W(bi0Var, file)) {
                    m5205d0(bi0Var);
                    m5239v(bi0Var);
                    return false;
                }
                if (bi0Var.f888v == 0) {
                    if (!m5235s0(bi0Var, bi0Var.f874h)) {
                        bi0Var.f888v = 1;
                        return false;
                    }
                    s11.m4668M(bi0Var, "recover from c file");
                    try {
                        m5239v(bi0Var);
                        return true;
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        Log.e("FastKV", str2, e);
                        return z;
                    }
                }
            } else if (bi0Var.f888v != 0) {
                File file3 = new File(str, str2 + ".kva");
                File file4 = new File(str, str2 + ".kvb");
                if (file3.exists() && file4.exists()) {
                    m5223m0(bi0Var, file3, file4);
                }
            }
            return false;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: W */
    public static boolean m5194W(bi0 bi0Var, File file) {
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i = (int) length;
            int iM5178G = m5178G(bi0.f866z, i);
            C0158e9 c0158e9 = bi0Var.f874h;
            if (c0158e9 == null || ((byte[]) c0158e9.f2354k).length != iM5178G) {
                c0158e9 = new C0158e9(0, new byte[iM5178G]);
                bi0Var.f874h = c0158e9;
            } else {
                c0158e9.f2352i = 0;
            }
            hg3.m2171i(file, (byte[]) c0158e9.f2354k, i);
            int iM1301h = c0158e9.m1301h();
            if (iM1301h >= 0) {
                int i2 = (-1073741825) & iM1301h;
                boolean z = (iM1301h & 1073741824) != 0;
                long jM1302i = c0158e9.m1302i(c0158e9.f2352i);
                c0158e9.f2352i += 8;
                bi0Var.f870d = i2 + 12;
                if (i2 >= 0 && i2 <= i - 12 && jM1302i == c0158e9.m1299f(12, i2) && pp0.m3891C(bi0Var, z)) {
                    bi0Var.f871e = jM1302i;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: X */
    public static of1 m5195X(lb2 lb2Var, int i, int i2, int i3, int i4, int i5, pf1 pf1Var, List list, sz1[] sz1VarArr, int i6) {
        int i7;
        float f;
        long j;
        int i8;
        int i9;
        int i10;
        List list2 = list;
        long j2 = i5;
        int[] iArr = new int[i6];
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i11 < i6) {
            if1 if1Var = (if1) list2.get(i11);
            float fM4822K = AbstractC0691se.m4822K(AbstractC0691se.m4818G(if1Var));
            if (fM4822K > 0.0f) {
                f2 += fM4822K;
                i12++;
                j = j2;
                i8 = i11;
            } else {
                int i14 = i3 - i13;
                sz1 sz1VarMo2340e = sz1VarArr[i11];
                j = j2;
                if (sz1VarMo2340e == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i8 = i11;
                        i9 = i12;
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i8 = i11;
                        i9 = i12;
                        i10 = i14 < 0 ? 0 : i14;
                    }
                    sz1VarMo2340e = if1Var.mo2340e(lb2Var.mo285e(0, i10, i4, false));
                } else {
                    i8 = i11;
                    i9 = i12;
                }
                sz1 sz1Var = sz1VarMo2340e;
                int iMo289i = lb2Var.mo289i(sz1Var);
                int iMo286f = lb2Var.mo286f(sz1Var);
                iArr[i8] = iMo289i;
                int i15 = i14 - iMo289i;
                if (i15 < 0) {
                    i15 = 0;
                }
                iMin = Math.min(i5, i15);
                i13 += iMo289i + iMin;
                iMax = Math.max(iMax, iMo286f);
                sz1VarArr[i8] = sz1Var;
                i12 = i9;
            }
            i11 = i8 + 1;
            j2 = j;
        }
        long j3 = j2;
        int i16 = i12;
        if (i16 == 0) {
            i13 -= iMin;
            i7 = 0;
        } else {
            long j4 = ((long) (i16 - 1)) * j3;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i13)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i17 = 0; i17 < i6; i17++) {
                jRound -= (long) Math.round(AbstractC0691se.m4822K(AbstractC0691se.m4818G((if1) list2.get(i17))) * f3);
            }
            int i18 = iMax;
            int i19 = 0;
            int i20 = 0;
            while (i19 < i6) {
                if (sz1VarArr[i19] == null) {
                    if1 if1Var2 = (if1) list2.get(i19);
                    mb2 mb2VarM4818G = AbstractC0691se.m4818G(if1Var2);
                    float fM4822K2 = AbstractC0691se.m4822K(mb2VarM4818G);
                    if (fM4822K2 <= 0.0f) {
                        iz0.m2424b("All weights <= 0 should have placeables");
                    }
                    f = f3;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fM4822K2 * f) + iSignum);
                    sz1 sz1VarMo2340e2 = if1Var2.mo2340e(lb2Var.mo285e((!(mb2VarM4818G != null ? mb2VarM4818G.f6552b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iMo289i2 = lb2Var.mo289i(sz1VarMo2340e2);
                    int iMo286f2 = lb2Var.mo286f(sz1VarMo2340e2);
                    iArr[i19] = iMo289i2;
                    i20 += iMo289i2;
                    int iMax3 = Math.max(i18, iMo286f2);
                    sz1VarArr[i19] = sz1VarMo2340e2;
                    i18 = iMax3;
                } else {
                    f = f3;
                }
                i19++;
                list2 = list;
                f3 = f;
            }
            i7 = (int) (((long) i20) + j4);
            int i21 = i3 - i13;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > i21) {
                i7 = i21;
            }
            iMax = i18;
        }
        int i22 = i7 + i13;
        if (i22 < 0) {
            i22 = 0;
        }
        int iMax4 = Math.max(i22, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        lb2Var.mo283c(iMax4, pf1Var, iArr, iArr2);
        return lb2Var.mo281a(sz1VarArr, pf1Var, iArr2, iMax4, iMax5);
    }

    /* JADX INFO: renamed from: Y */
    public static k31 m5196Y(l41 l41Var) {
        int i = l41Var.f5933v;
        if (i == 2) {
            l41Var.f5933v = 1;
        }
        try {
            try {
                return gf1.m1861I(l41Var);
            } finally {
                l41Var.m2817L(i);
            }
        } catch (OutOfMemoryError | StackOverflowError e) {
            throw new C0594pv("Failed parsing JSON source: " + l41Var + " to Json", e);
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m5197Z(bi0 bi0Var, long j, long j2) {
        long j3;
        MappedByteBuffer mappedByteBuffer = bi0Var.f885s;
        String str = bi0Var.f868b;
        int i = mappedByteBuffer.getInt();
        int i2 = i & (-1073741825);
        boolean z = (i & 1073741824) != 0;
        long j4 = bi0Var.f885s.getLong();
        int i3 = bi0Var.f886t.getInt();
        int i4 = (-1073741825) & i3;
        boolean z2 = (1073741824 & i3) != 0;
        long j5 = bi0Var.f886t.getLong();
        if (i2 < 0) {
            j3 = 12;
        } else if (i2 <= j - 12) {
            bi0Var.f870d = i2 + 12;
            bi0Var.f885s.rewind();
            j3 = 12;
            bi0Var.f885s.get((byte[]) bi0Var.f874h.f2354k, 0, bi0Var.f870d);
            if (j4 == bi0Var.f874h.m1299f(12, i2) && pp0.m3891C(bi0Var, z)) {
                bi0Var.f871e = j4;
                if (j == j2) {
                    byte[] bArr = new byte[bi0Var.f870d];
                    bi0Var.f886t.rewind();
                    bi0Var.f886t.get(bArr, 0, bi0Var.f870d);
                    byte[] bArr2 = (byte[]) bi0Var.f874h.f2354k;
                    for (int i5 = 0; i5 < bi0Var.f870d; i5++) {
                        if (bArr2[i5] == bArr[i5]) {
                        }
                    }
                    return;
                }
                Log.w("FastKV", str, new Exception("B file error"));
                m5236t(bi0Var, bi0Var.f885s, bi0Var.f886t, bi0Var.f870d);
                return;
            }
        } else {
            j3 = 12;
        }
        if (i4 >= 0 && i4 <= j2 - j3) {
            bi0Var.f872f.clear();
            bi0Var.f879m = 0;
            bi0Var.f880n.clear();
            bi0Var.f870d = i4 + 12;
            if (((byte[]) bi0Var.f874h.f2354k).length != bi0Var.f886t.capacity()) {
                bi0Var.f874h = new C0158e9(bi0Var.f886t.capacity(), 3);
            }
            bi0Var.f886t.rewind();
            bi0Var.f886t.get((byte[]) bi0Var.f874h.f2354k, 0, bi0Var.f870d);
            if (j5 == bi0Var.f874h.m1299f(12, i4) && pp0.m3891C(bi0Var, z2)) {
                Log.w("FastKV", str, new Exception("A file error"));
                m5236t(bi0Var, bi0Var.f886t, bi0Var.f885s, bi0Var.f870d);
                bi0Var.f871e = j5;
                return;
            }
        }
        s11.m4664I(bi0Var, "both files error");
        m5230q(bi0Var);
    }

    /* JADX INFO: renamed from: a */
    public static final void m5198a(String str, uh1 uh1Var, InterfaceC0596px interfaceC0596px, int i) {
        boolean z;
        Object obj;
        String str2 = str;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1938877497);
        int i2 = i | (go0Var.m1980f(str2) ? 4 : 2);
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) go0Var.m1988j(AbstractC0646r7.f9411b);
            C0659rk c0659rk = C0700sn.f10226n;
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(c0659rk, false);
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
            C0419lc c0419lc = C0256gx.f3730e;
            yf3.m6268c(go0Var, c0419lc, nf1VarM1060d);
            C0419lc c0419lc2 = C0256gx.f3729d;
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C0419lc c0419lc3 = C0256gx.f3731f;
            yf3.m6268c(go0Var, c0419lc3, numValueOf);
            C0799v6 c0799v6 = C0256gx.f3732g;
            yf3.m6267b(go0Var, c0799v6);
            C0419lc c0419lc4 = C0256gx.f3728c;
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M);
            rh1 rh1Var = rh1.f9587a;
            uh1 uh1VarM5211g0 = m5211g0(rh1Var, 94.0f);
            fb2 fb2Var = gb2.f3387a;
            uh1 uh1VarM825z = ci0.m825z(uh1VarM5211g0, fb2Var);
            tu2 tu2Var = ur1.f11452a;
            uh1 uh1VarMo4491c = gf1.m1896n(uh1VarM825z, C0363ju.m2565b(0.13f, ((lp1) go0Var.m1988j(tu2Var)).f6239g), sp0.f10267h).mo4491c(new C0660rl(1.0f, new ft2(C0363ju.m2565b(0.28f, ((lp1) go0Var.m1988j(tu2Var)).f6239g)), fb2Var));
            nf1 nf1VarM1060d2 = AbstractC0135dm.m1060d(c0659rk, false);
            int iHashCode2 = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l2 = go0Var.m1990l();
            uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, uh1VarMo4491c);
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, c0419lc, nf1VarM1060d2);
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l2);
            vi0.m5698q(iHashCode2, go0Var, c0419lc3, go0Var, c0799v6);
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M2);
            uh1 uh1VarM825z2 = ci0.m825z(m5211g0(rh1Var, 88.0f), fb2Var);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            Object obj2 = objM1956L;
            if (objM1956L == c0160eb) {
                C0829w c0829w = new C0829w(2);
                go0Var.m1981f0(c0829w);
                obj2 = c0829w;
            }
            in0 in0Var = (in0) obj2;
            boolean zM1984h = go0Var.m1984h(context) | ((i2 & 14) == 4);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1984h || objM1956L2 == c0160eb) {
                z = true;
                str2 = str;
                C0757u1 c0757u1 = new C0757u1(context, str2, true ? 1 : 0);
                go0Var.m1981f0(c0757u1);
                obj = c0757u1;
            } else {
                z = true;
                str2 = str;
                obj = objM1956L2;
            }
            pp0.m3904b(in0Var, uh1VarM825z2, (in0) obj, go0Var, 6, 0);
            go0Var.m1994p(z);
            go0Var.m1994p(z);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0946z1(str2, uh1Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static MappedByteBuffer m5199a0(FileChannel fileChannel, int i) {
        try {
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i);
            map.order(ByteOrder.LITTLE_ENDIAN);
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5200b(in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        in0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1428963425);
        int i2 = (go0Var.m1984h(in0Var) ? 4 : 2) | i;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            String strM4462P = rg3.m4462P(R.string.about_module_avatar_url, go0Var);
            List listM3105t0 = AbstractC0460mg.m3105t0(rg3.m4461O(R.array.about_module_project_lines, go0Var));
            String[] strArrM4461O = rg3.m4461O(R.array.about_module_thanks_names, go0Var);
            String[] strArrM4461O2 = rg3.m4461O(R.array.about_module_thanks_github_usernames, go0Var);
            String[] strArrM4461O3 = rg3.m4461O(R.array.about_module_thanks_descriptions, go0Var);
            boolean zM1980f = go0Var.m1980f(strArrM4461O) | go0Var.m1980f(strArrM4461O2) | go0Var.m1980f(strArrM4461O3);
            Object objM1956L = go0Var.m1956L();
            if (!zM1980f) {
                Object obj = objM1956L;
                if (objM1956L == C0520nx.f7360a) {
                    ArrayList arrayList = new ArrayList(strArrM4461O.length);
                    int length = strArrM4461O.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length) {
                        String str = strArrM4461O[i3];
                        int i5 = i4 + 1;
                        String str2 = (String) AbstractC0460mg.m3099n0(i4, strArrM4461O3);
                        String str3 = str2 == null ? "" : str2;
                        String str4 = (String) AbstractC0460mg.m3099n0(i4, strArrM4461O2);
                        String string = str4 != null ? pv2.m3993I0(str4).toString() : null;
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new C0564p1(str, str3, string));
                        i3++;
                        i4 = i5;
                    }
                    go0Var.m1981f0(arrayList);
                    obj = arrayList;
                }
                ci0.m815p(xe1.m6126i0(1039310378, new C0794v1(in0Var, strM4462P, listM3105t0, (List) obj, 0), go0Var), go0Var, 6);
            }
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0831w1(i, 0, in0Var);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static uh1 m5201b0(uh1 uh1Var, float f, float f2, float f3, float f4, int i) {
        return uh1Var.mo4491c(new kr2(f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, false));
    }

    /* JADX INFO: renamed from: c */
    public static final void m5202c(List list, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(475678026);
        int i2 = 2;
        int i3 = (go0Var.m1980f(list) ? 4 : 2) | i;
        if (go0Var.m1958O(i3 & 1, (i3 & 3) != 2)) {
            uh1 uh1VarM1612D = fg1.m1612D(f10693e, 16.0f, 14.0f);
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(new C0884xf(8.0f, new C0676s(i2)), C0700sn.f10233u, go0Var, 6);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1612D);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, c0032avM6346a);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            go0Var.m1966W(-1478478065);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC0179eu.m1446a((String) it.next(), null, new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(13), im0.f4680j, 0L, 0, rg3.m4450D(19), null, null, 16646136), 0, false, 0, 0, go0Var, 0, 1018);
            }
            go0Var.m1994p(false);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0601q1(list, i, 3);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m5203c0(bi0 bi0Var, MappedByteBuffer mappedByteBuffer) throws IOException {
        MappedByteBuffer mappedByteBufferM5199a0;
        int iCapacity = mappedByteBuffer.capacity();
        int i = bi0.f866z;
        if (iCapacity != i) {
            FileChannel fileChannel = mappedByteBuffer == bi0Var.f885s ? bi0Var.f883q : bi0Var.f884r;
            try {
                fileChannel.truncate(i);
                mappedByteBufferM5199a0 = m5199a0(fileChannel, i);
            } catch (IOException unused) {
                mappedByteBufferM5199a0 = null;
            }
            if (mappedByteBufferM5199a0 == null) {
                c80.m678v("Failed to truncate and remap buffer");
                return;
            }
            if (mappedByteBuffer == bi0Var.f885s) {
                bi0Var.f885s = mappedByteBufferM5199a0;
            } else {
                bi0Var.f886t = mappedByteBufferM5199a0;
            }
            mappedByteBuffer = mappedByteBufferM5199a0;
        }
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    /* JADX INFO: renamed from: d */
    public static final void m5204d(final c73 c73Var, boolean z, final in0 in0Var, final in0 in0Var2, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var;
        Object next;
        Object next2;
        String str;
        int i2;
        xk1 xk1Var;
        xk1 xk1Var2;
        b73 b73Var = c73Var.f1224d;
        int i3 = c73Var.f1222b;
        int i4 = c73Var.f1221a;
        in0Var.getClass();
        in0Var2.getClass();
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(-2005030868);
        int i5 = i | (go0Var2.m1984h(c73Var) ? 4 : 2) | (go0Var2.m1982g(z) ? 32 : 16) | (go0Var2.m1984h(in0Var) ? 256 : 128) | (go0Var2.m1984h(in0Var2) ? 2048 : 1024);
        boolean z2 = true;
        if (go0Var2.m1958O(i5 & 1, (i5 & 1171) != 1170)) {
            boolean zM1976d = go0Var2.m1976d(i4);
            Object objM1956L = go0Var2.m1956L();
            yf0 yf0Var = EnumC0578pf.f8294m;
            t00 t00Var = null;
            C0160eb c0160eb = C0520nx.f7360a;
            if (zM1976d || objM1956L == c0160eb) {
                EnumC0578pf.f8291j.getClass();
                Iterator it = yf0Var.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((EnumC0578pf) next).f8295h == i4) {
                            break;
                        }
                    }
                }
                objM1956L = (EnumC0578pf) next;
                if (objM1956L == null) {
                    objM1956L = EnumC0578pf.f8292k;
                }
                go0Var2.m1981f0(objM1956L);
            }
            final EnumC0578pf enumC0578pf = (EnumC0578pf) objM1956L;
            boolean zM1976d2 = go0Var2.m1976d(i3);
            Object objM1956L2 = go0Var2.m1956L();
            yf0 yf0Var2 = x51.f12816m;
            if (zM1976d2 || objM1956L2 == c0160eb) {
                x51.f12813j.getClass();
                Iterator it2 = yf0Var2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it2.next();
                        if (((x51) next2).f12817h == i3) {
                            break;
                        }
                    }
                }
                objM1956L2 = (x51) next2;
                if (objM1956L2 == null) {
                    objM1956L2 = x51.f12814k;
                }
                go0Var2.m1981f0(objM1956L2);
            }
            final x51 x51Var = (x51) objM1956L2;
            go0Var2.m1966W(1605667535);
            int iM6103U = xe1.m6103U(AbstractC0179eu.m1421B(yf0Var, 10));
            if (iM6103U < 16) {
                iM6103U = 16;
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap(iM6103U);
            int i6 = 0;
            C0717t2 c0717t2 = new C0717t2(i6, yf0Var);
            while (c0717t2.hasNext()) {
                Object next3 = c0717t2.next();
                linkedHashMap.put(next3, rg3.m4462P(((EnumC0578pf) next3).f8296i, go0Var2));
            }
            go0Var2.m1994p(false);
            go0Var2.m1966W(1605671311);
            int iM6103U2 = xe1.m6103U(AbstractC0179eu.m1421B(yf0Var2, 10));
            if (iM6103U2 < 16) {
                iM6103U2 = 16;
            }
            final LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM6103U2);
            C0717t2 c0717t22 = new C0717t2(i6, yf0Var2);
            while (c0717t22.hasNext()) {
                Object next4 = c0717t22.next();
                linkedHashMap2.put(next4, rg3.m4462P(((x51) next4).f12818i, go0Var2));
            }
            go0Var2.m1994p(false);
            boolean z3 = (i5 & 112) == 32;
            Object objM1956L3 = go0Var2.m1956L();
            if (z3 || objM1956L3 == c0160eb) {
                objM1956L3 = z ? p40.m3734q(po1.f8422a) : p40.m3703M(po1.f8422a);
                go0Var2.m1981f0(objM1956L3);
            }
            lp1 lp1Var = (lp1) objM1956L3;
            boolean zM1980f = go0Var2.m1980f(b73Var) | go0Var2.m1980f(lp1Var);
            Object objM1956L4 = go0Var2.m1956L();
            if (zM1980f || objM1956L4 == c0160eb) {
                objM1956L4 = AbstractC0570p7.m3752H(b73Var, lp1Var);
                go0Var2.m1981f0(objM1956L4);
            }
            b73 b73Var2 = (b73) objM1956L4;
            boolean zM1980f2 = go0Var2.m1980f(lp1Var);
            Object objM1956L5 = go0Var2.m1956L();
            if (zM1980f2 || objM1956L5 == c0160eb) {
                objM1956L5 = AbstractC0570p7.m3759O(lp1Var.f6239g);
                go0Var2.m1981f0(objM1956L5);
            }
            String str2 = (String) objM1956L5;
            boolean zM1980f3 = go0Var2.m1980f(b73Var2) | go0Var2.m1980f(str2);
            Object objM1956L6 = go0Var2.m1956L();
            if (zM1980f3 || objM1956L6 == c0160eb) {
                String str3 = b73Var2.f724a;
                objM1956L6 = str3 == null ? str2 : str3;
                go0Var2.m1981f0(objM1956L6);
            }
            final String str4 = (String) objM1956L6;
            boolean zM1980f4 = go0Var2.m1980f(str4);
            Object objM1956L7 = go0Var2.m1956L();
            if (zM1980f4 || objM1956L7 == c0160eb) {
                objM1956L7 = AbstractC0570p7.m3758N(str4);
                go0Var2.m1981f0(objM1956L7);
            }
            final C0363ju c0363ju = (C0363ju) objM1956L7;
            Object[] objArr = new Object[0];
            Object objM1956L8 = go0Var2.m1956L();
            if (objM1956L8 == c0160eb) {
                str = str2;
                objM1956L8 = new C0074c0(5);
                go0Var2.m1981f0(objM1956L8);
            } else {
                str = str2;
            }
            xk1 xk1Var3 = (xk1) gf1.m1865M(objArr, (xm0) objM1956L8, go0Var2, 48);
            Object[] objArr2 = new Object[0];
            boolean zM1980f5 = go0Var2.m1980f(str4);
            Object objM1956L9 = go0Var2.m1956L();
            if (zM1980f5 || objM1956L9 == c0160eb) {
                i2 = 0;
                objM1956L9 = new C0385kf(str4, i2);
                go0Var2.m1981f0(objM1956L9);
            } else {
                i2 = 0;
            }
            xk1 xk1Var4 = (xk1) gf1.m1865M(objArr2, (xm0) objM1956L9, go0Var2, i2);
            Boolean bool = (Boolean) xk1Var3.getValue();
            bool.getClass();
            boolean zM1980f6 = go0Var2.m1980f(xk1Var3) | go0Var2.m1980f(xk1Var4) | go0Var2.m1980f(str4);
            Object objM1956L10 = go0Var2.m1956L();
            if (zM1980f6 || objM1956L10 == c0160eb) {
                xk1Var = xk1Var4;
                xk1Var2 = xk1Var3;
                objM1956L10 = new C0756u0(str4, xk1Var2, xk1Var, t00Var, 1);
                go0Var2.m1981f0(objM1956L10);
            } else {
                xk1Var = xk1Var4;
                xk1Var2 = xk1Var3;
            }
            AbstractC0179eu.m1457g(bool, str4, (mn0) objM1956L10, go0Var2);
            boolean zM1980f7 = go0Var2.m1980f((String) xk1Var.getValue());
            Object objM1956L11 = go0Var2.m1956L();
            if (zM1980f7 || objM1956L11 == c0160eb) {
                objM1956L11 = AbstractC0570p7.m3751G((String) xk1Var.getValue());
                go0Var2.m1981f0(objM1956L11);
            }
            String str5 = (String) objM1956L11;
            boolean z4 = (str5 == null || str5.equals(str4)) ? false : true;
            String str6 = str;
            final xk1 xk1Var5 = xk1Var2;
            ci0.m815p(xe1.m6126i0(1462002177, new mn0() { // from class: lf
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    go0 go0Var3 = (go0) interfaceC0596px2;
                    if (go0Var3.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        yi0 yi0Var = AbstractC0731te.f10695g;
                        C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var3, 0);
                        int iHashCode = Long.hashCode(go0Var3.f3614T);
                        yy1 yy1VarM1990l = go0Var3.m1990l();
                        uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var3, yi0Var);
                        InterfaceC0293hx.f4166c.getClass();
                        C0367jy c0367jy = C0256gx.f3727b;
                        go0Var3.m1969Z();
                        if (go0Var3.f3613S) {
                            go0Var3.m1989k(c0367jy);
                        } else {
                            go0Var3.m1987i0();
                        }
                        yf3.m6268c(go0Var3, C0256gx.f3730e, c0032avM6346a);
                        yf3.m6268c(go0Var3, C0256gx.f3729d, yy1VarM1990l);
                        yf3.m6268c(go0Var3, C0256gx.f3731f, Integer.valueOf(iHashCode));
                        yf3.m6267b(go0Var3, C0256gx.f3732g);
                        yf3.m6268c(go0Var3, C0256gx.f3728c, uh1VarM5285M);
                        tp0.m5358c(rg3.m4462P(R.string.home_settings_appearance, go0Var3), null, null, in0Var2, go0Var3, 0, 30);
                        uh1 uh1VarMo4491c = AbstractC0731te.f10693e.mo4491c(new g71(1.0f, true));
                        jw1 jw1VarM1635h = fg1.m1635h();
                        C0884xf c0884xf = new C0884xf(12.0f, new C0676s(2));
                        EnumC0578pf enumC0578pf2 = enumC0578pf;
                        boolean zM1976d3 = go0Var3.m1976d(enumC0578pf2.ordinal());
                        in0 in0Var3 = in0Var;
                        boolean zM1980f8 = zM1976d3 | go0Var3.m1980f(in0Var3);
                        c73 c73Var2 = c73Var;
                        boolean zM1984h = zM1980f8 | go0Var3.m1984h(c73Var2);
                        LinkedHashMap linkedHashMap3 = linkedHashMap;
                        boolean zM1984h2 = zM1984h | go0Var3.m1984h(linkedHashMap3);
                        x51 x51Var2 = x51Var;
                        boolean zM1976d4 = zM1984h2 | go0Var3.m1976d(x51Var2.ordinal());
                        LinkedHashMap linkedHashMap4 = linkedHashMap2;
                        boolean zM1984h3 = zM1976d4 | go0Var3.m1984h(linkedHashMap4);
                        xk1 xk1Var6 = xk1Var5;
                        boolean zM1980f9 = zM1984h3 | go0Var3.m1980f(xk1Var6);
                        C0363ju c0363ju2 = c0363ju;
                        boolean zM1980f10 = zM1980f9 | go0Var3.m1980f(c0363ju2);
                        String str7 = str4;
                        boolean zM1980f11 = zM1980f10 | go0Var3.m1980f(str7);
                        Object objM1956L12 = go0Var3.m1956L();
                        if (zM1980f11 || objM1956L12 == C0520nx.f7360a) {
                            objM1956L12 = new C0541of(enumC0578pf2, in0Var3, c73Var2, linkedHashMap3, x51Var2, linkedHashMap4, xk1Var6, str7, c0363ju2);
                            go0Var3.m1981f0(objM1956L12);
                        }
                        rg3.m4468d(24960, 490, null, c0884xf, null, go0Var3, null, (in0) objM1956L12, null, uh1VarMo4491c, jw1VarM1635h, false);
                        go0Var3.m1994p(true);
                    } else {
                        go0Var3.m1961R();
                    }
                    return a83.f116a;
                }
            }, go0Var2), go0Var2, 6);
            boolean zBooleanValue = ((Boolean) xk1Var5.getValue()).booleanValue();
            String str7 = (String) xk1Var.getValue();
            List list = b73Var2.f725b;
            xk1 xk1Var6 = xk1Var;
            boolean zM1980f8 = go0Var2.m1980f(xk1Var6);
            Object objM1956L12 = go0Var2.m1956L();
            if (zM1980f8 || objM1956L12 == c0160eb) {
                objM1956L12 = new C0260h0(xk1Var6, 13);
                go0Var2.m1981f0(objM1956L12);
            }
            in0 in0Var3 = (in0) objM1956L12;
            boolean zM1980f9 = go0Var2.m1980f(xk1Var5);
            Object objM1956L13 = go0Var2.m1956L();
            if (zM1980f9 || objM1956L13 == c0160eb) {
                objM1956L13 = new C0186f0(xk1Var5, 9);
                go0Var2.m1981f0(objM1956L13);
            }
            xm0 xm0Var = (xm0) objM1956L13;
            boolean zM1980f10 = go0Var2.m1980f(str5) | go0Var2.m1984h(b73Var2) | go0Var2.m1980f(str6) | ((i5 & 896) == 256);
            if ((i5 & 14) != 4 && !go0Var2.m1984h(c73Var)) {
                z2 = false;
            }
            boolean zM1980f11 = zM1980f10 | z2 | go0Var2.m1980f(xk1Var5);
            Object objM1956L14 = go0Var2.m1956L();
            if (zM1980f11 || objM1956L14 == c0160eb) {
                C0459mf c0459mf = new C0459mf(str5, b73Var2, str6, in0Var, c73Var, xk1Var5);
                go0Var2.m1981f0(c0459mf);
                objM1956L14 = c0459mf;
            }
            go0Var = go0Var2;
            gf1.m1887e(zBooleanValue, str7, str6, str5, list, z4, in0Var3, xm0Var, (xm0) objM1956L14, go0Var, 0);
        } else {
            go0Var = go0Var2;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0496nf(c73Var, z, in0Var, in0Var2, i);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static void m5205d0(bi0 bi0Var) {
        bi0Var.f870d = 12;
        bi0Var.f871e = 0L;
        bi0Var.f872f.clear();
        bi0Var.f879m = 0;
        bi0Var.f880n.clear();
        C0158e9 c0158e9 = bi0Var.f874h;
        if (c0158e9 == null || ((byte[]) c0158e9.f2354k).length != bi0.f866z) {
            bi0Var.f874h = new C0158e9(bi0.f866z, 3);
        } else {
            c0158e9.m1309r(0L, 4);
        }
        bi0Var.f874h.m1308q(0, 0);
    }

    /* JADX INFO: renamed from: e */
    public static final s00 m5206e(a20 a20Var) {
        if (a20Var.mo15o(C0700sn.f10207K) == null) {
            a20Var = a20Var.mo14k(new m21(null));
        }
        return new s00(a20Var);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m5207e0(AbstractC0812vj[] abstractC0812vjArr, pb1 pb1Var, vu0 vu0Var) throws InterruptedException {
        Object x92Var;
        String strM5217j0 = m5217j0(R.string.nuke_core_dex_analysis_check_native_runtime, new Object[0]);
        Float fValueOf = Float.valueOf(0.02f);
        sz0 sz0Var = f10689a;
        sz0Var.m5041N(strM5217j0, fValueOf);
        a72 a72Var = new a72();
        a72Var.f108h = -1;
        b72 b72Var = new b72();
        b72Var.f722h = -1L;
        ThreadLocal threadLocal = am1.f250a;
        C0016af c0016af = new C0016af(5, a72Var, b72Var);
        ThreadLocal threadLocal2 = am1.f250a;
        if (t11.m5086l(Looper.myLooper(), Looper.getMainLooper())) {
            C0676s.m4653l("Native runtime preparation attempted on main thread");
            return;
        }
        ReentrantLock reentrantLock = am1.f252c;
        reentrantLock.lock();
        try {
            Boolean bool = (Boolean) threadLocal2.get();
            threadLocal2.set(Boolean.TRUE);
            try {
                am1.m203c();
                am1.m204d(false, c0016af);
                threadLocal2.set(bool);
                reentrantLock.unlock();
                sz0Var.m5041N(m5217j0(R.string.nuke_core_dex_analysis_verify_native_runtime, new Object[0]), Float.valueOf(0.32f));
                AtomicBoolean atomicBoolean = aq1.f335a;
                pp1 pp1Var = pp1.f8445a;
                aq1.m259a(pp1.m3931c(), pp1.m3930b(), abstractC0812vjArr);
                sz0Var.m5041N(m5217j0(R.string.nuke_core_dex_analysis_init_environment, 0, Integer.valueOf(pb1Var.mo152a())), Float.valueOf(0.38f));
                b80.m484a(DexKitBridge.class, "libdexkit.so", true);
                ClassLoader classLoader = up0.f11402j;
                if (classLoader == null) {
                    t11.m5067S("hostClassLoader");
                    throw null;
                }
                try {
                    if (!Class.forName("dalvik.system.BaseDexClassLoader").isInstance(classLoader)) {
                        C0676s.m4653l("classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)");
                        return;
                    }
                    DexKitBridge dexKitBridge = new DexKitBridge(classLoader);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ListIterator listIterator = pb1Var.listIterator(0);
                    while (true) {
                        vs0 vs0Var = (vs0) listIterator;
                        if (!vs0Var.hasNext()) {
                            break;
                        }
                        String str = ((q70) vs0Var.next()).f8808b.f11803a;
                        Object a72Var2 = linkedHashMap.get(str);
                        if (a72Var2 == null && !linkedHashMap.containsKey(str)) {
                            a72Var2 = new a72();
                        }
                        a72 a72Var3 = (a72) a72Var2;
                        a72Var3.f108h++;
                        linkedHashMap.put(str, a72Var3);
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        entry.getClass();
                        if ((entry instanceof q41) && !(entry instanceof r41)) {
                            xe1.m6132l0("kotlin.collections.MutableMap.MutableEntry", entry);
                            throw null;
                        }
                        entry.setValue(Integer.valueOf(((a72) entry.getValue()).f108h));
                    }
                    Map mapM6117e = xe1.m6117e(linkedHashMap);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : mapM6117e.entrySet()) {
                        if (((Number) entry2.getValue()).intValue() > 1) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    Set setKeySet = linkedHashMap2.keySet();
                    if (!setKeySet.isEmpty()) {
                        C0676s.m4645c("Duplicate Dex descriptor ids: ".concat(AbstractC0142du.m1165u0(setKeySet, null, null, null, null, 63)));
                        return;
                    }
                    ListIterator listIterator2 = pb1Var.listIterator(0);
                    int i = 0;
                    while (true) {
                        vs0 vs0Var2 = (vs0) listIterator2;
                        if (!vs0Var2.hasNext()) {
                            String strM3923u = pp0.m3923u(vu0Var);
                            pp1 pp1Var2 = pp1.f8445a;
                            op1 op1VarM3930b = pp1.m3930b();
                            op1VarM3930b.getClass();
                            op1VarM3930b.m3608e("Dex_Cache_Sum_Sign", strM3923u);
                            sz0Var.m5041N(m5217j0(R.string.nuke_core_dex_analysis_complete_restart, new Object[0]), Float.valueOf(1.0f));
                            Thread.sleep(2500L);
                            if (pp1.m3932d() == vu0.f12174i) {
                                fd3.m1599b();
                                return;
                            } else {
                                Process.killProcess(Process.myPid());
                                return;
                            }
                        }
                        Object next = vs0Var2.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC0179eu.m1447a0();
                            throw null;
                        }
                        q70 q70Var = (q70) next;
                        float f = i2;
                        int iMo152a = pb1Var.mo152a();
                        if (iMo152a < 1) {
                            iMo152a = 1;
                        }
                        sz0Var.m5041N(m5217j0(R.string.nuke_core_dex_analysis_analyzing, Integer.valueOf(i2), Integer.valueOf(pb1Var.mo152a())), Float.valueOf(((f / iMo152a) * 0.5f) + 0.4f));
                        try {
                            q70Var.f8808b.mo129a(dexKitBridge);
                            x92Var = a83.f116a;
                        } catch (Throwable th) {
                            x92Var = new x92(th);
                        }
                        Throwable thM6237a = y92.m6237a(x92Var);
                        if (thM6237a != null) {
                            pp1 pp1Var3 = pp1.f8445a;
                            AbstractC0812vj abstractC0812vj = q70Var.f8807a;
                            v70 v70Var = q70Var.f8808b;
                            pp1.m3936h(abstractC0812vj, "dex_find", thM6237a, vi0.m5691j("Dex descriptor ", v70Var.f11803a, " analysis failed"));
                            hg3.m2166d(q70Var.f8807a.mo9d(), "Dex descriptor " + v70Var.f11803a + " analysis failed: " + fg1.m1624Q(thM6237a));
                        }
                        i = i2;
                    }
                } catch (ClassNotFoundException unused) {
                    C0676s.m4653l("This method requires Android runtime");
                }
            } catch (Throwable th2) {
                threadLocal2.set(bool);
                throw th2;
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m5208f(xm0 xm0Var, n80 n80Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        int i3;
        Object obj;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(826668973);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1984h(xm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1980f(n80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 256 : 128;
        }
        int i4 = i2;
        if (go0Var.m1958O(i4 & 1, (i4 & 147) != 146)) {
            View view = (View) go0Var.m1988j(AbstractC0646r7.f9415f);
            e70 e70Var = (e70) go0Var.m1988j(AbstractC0441ly.f6382h);
            d61 d61Var = (d61) go0Var.m1988j(AbstractC0441ly.f6388n);
            eo0 eo0VarM4458L = rg3.m4458L(go0Var);
            xk1 xk1VarM3601x = op0.m3601x(c0402kw, go0Var);
            Object[] objArr = new Object[0];
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            Object obj2 = objM1956L;
            if (objM1956L == c0160eb) {
                C0607q7 c0607q7 = C0607q7.f8794o;
                go0Var.m1981f0(c0607q7);
                obj2 = c0607q7;
            }
            UUID uuid = (UUID) gf1.m1865M(objArr, (xm0) obj2, go0Var, 48);
            boolean zM1976d = go0Var.m1976d(n80Var.f7048g) | go0Var.m1980f(view) | go0Var.m1980f(e70Var) | go0Var.m1980f(null);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1976d || objM1956L2 == c0160eb) {
                p80 p80Var = new p80(xm0Var, n80Var, view, d61Var, e70Var, uuid);
                C0402kw c0402kw2 = new C0402kw(-1338939603, true, new C0483n2(i, xk1VarM3601x));
                m80 m80Var = p80Var.f8029o;
                m80Var.setParentCompositionContext(eo0VarM4458L);
                m80Var.f6506r.setValue(c0402kw2);
                m80Var.f6510v = true;
                m80Var.m3467e();
                go0Var.m1981f0(p80Var);
                objM1956L2 = p80Var;
            }
            p80 p80Var2 = (p80) objM1956L2;
            boolean zM1984h = go0Var.m1984h(p80Var2);
            Object objM1956L3 = go0Var.m1956L();
            if (zM1984h || objM1956L3 == c0160eb) {
                i3 = 0;
                C0231g8 c0231g8 = new C0231g8(p80Var2, i3);
                go0Var.m1981f0(c0231g8);
                obj = c0231g8;
            } else {
                i3 = 0;
                obj = objM1956L3;
            }
            AbstractC0179eu.m1450c(p80Var2, (in0) obj, go0Var);
            int i5 = (go0Var.m1984h(p80Var2) ? 1 : 0) | ((i4 & 14) == 4 ? 1 : i3) | ((i4 & 112) != 32 ? i3 : 1) | (go0Var.m1976d(d61Var.ordinal()) ? 1 : 0);
            Object objM1956L4 = go0Var.m1956L();
            Object obj3 = objM1956L4;
            if (i5 != 0 || objM1956L4 == c0160eb) {
                C0268h8 c0268h8 = new C0268h8(p80Var2, xm0Var, n80Var, d61Var);
                go0Var.m1981f0(c0268h8);
                obj3 = c0268h8;
            }
            AbstractC0179eu.m1468r((xm0) obj3, go0Var);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0305i8(xm0Var, n80Var, c0402kw, i, 0);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static long m5209f0(long j, int i) {
        int i2 = (i & 7) << 3;
        return (j >>> (64 - i2)) | (j << i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024e  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [boolean, int] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5210g(final boolean z, final in0 in0Var, uh1 uh1Var, boolean z2, InterfaceC0596px interfaceC0596px, final int i) {
        int i2;
        final uh1 uh1Var2;
        final boolean z3;
        int i3;
        uh1 uh1Var3;
        boolean z4;
        float f;
        float f2;
        long jM2565b;
        boolean zM1982g;
        Object objM1956L;
        ?? r15;
        long j;
        in0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1280487758);
        if ((i & 6) == 0) {
            i2 = i | (go0Var.m1982g(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 32 : 16;
        }
        int i4 = i2 | 28032;
        if ((i & 196608) == 0) {
            i4 = 93568 | i2;
        }
        if (go0Var.m1958O(i4 & 1, (74899 & i4) != 74898)) {
            go0Var.m1963T();
            int i5 = i & 1;
            rh1 rh1Var = rh1.f9587a;
            if (i5 == 0 || go0Var.m2003y()) {
                i3 = i4 & (-458753);
                uh1Var3 = rh1Var;
                z4 = true;
            } else {
                go0Var.m1961R();
                int i6 = i4 & (-458753);
                z4 = z2;
                i3 = i6;
                uh1Var3 = uh1Var;
            }
            go0Var.m1995q();
            final bs0 bs0Var = (bs0) go0Var.m1988j(AbstractC0441ly.f6386l);
            go0Var.m1966W(2106890116);
            final boolean zBooleanValue = ((Boolean) go0Var.m1988j(ur1.f11453b)).booleanValue();
            go0Var.m1994p(false);
            Object objM1956L2 = go0Var.m1956L();
            Object obj = C0520nx.f7360a;
            if (objM1956L2 == obj) {
                objM1956L2 = new bk1();
                go0Var.m1981f0(objM1956L2);
            }
            bk1 bk1Var = (bk1) objM1956L2;
            xk1 xk1VarM4484t = rg3.m4484t(bk1Var, go0Var);
            int i7 = i3;
            gu2 gu2VarM5481b = AbstractC0768uc.m5481b(z ? 1.0f : 0.0f, z ? up0.m5528G(0.5f, 1500.0f, null, 4) : up0.m5528G(1.0f, 10000.0f, null, 4), "NukeCheckboxGeometryAnim", go0Var, 3072);
            if (((Boolean) xk1VarM4484t.getValue()).booleanValue() && z4) {
                f2 = 0.9f;
            } else if (z) {
                f2 = 1.04f;
            } else {
                f = 1500.0f;
                f2 = 1.0f;
                gu2 gu2VarM5481b2 = AbstractC0768uc.m5481b(f2, up0.m5528G(0.5f, f, null, 4), "NukeCheckboxPressScale", go0Var, 3120);
                if (z4) {
                    go0Var.m1966W(2106927045);
                    jM2565b = C0363ju.m2565b(0.05f, ((lp1) go0Var.m1988j(ur1.f11452a)).f6238f);
                    go0Var.m1994p(false);
                } else if (z) {
                    go0Var.m1966W(2106929189);
                    jM2565b = C0363ju.m2565b(0.14f, ((lp1) go0Var.m1988j(ur1.f11452a)).f6239g);
                    go0Var.m1994p(false);
                } else {
                    go0Var.m1966W(2106931461);
                    jM2565b = C0363ju.m2565b(0.1f, ((lp1) go0Var.m1988j(ur1.f11452a)).f6238f);
                    go0Var.m1994p(false);
                }
                gu2 gu2VarM269a = ar2.m269a(jM2565b, up0.m5531J(150, null, 6), "NukeCheckboxContainerColor", go0Var);
                kr1 kr1Var = new kr1(6.0f);
                kr1 kr1Var2 = new kr1(3.0f);
                uh1 uh1VarM825z = ci0.m825z(pp0.m3893E(m5211g0(uh1Var3, 20.0f), ((Number) gu2VarM5481b2.getValue()).floatValue()), kr1Var);
                uh1 uh1Var4 = uh1Var3;
                uh1 uh1VarM1896n = gf1.m1896n(uh1VarM825z, ((C0363ju) gu2VarM269a.getValue()).f5219a, sp0.f10267h);
                zM1982g = go0Var.m1982g(zBooleanValue) | go0Var.m1984h(bs0Var) | go0Var.m1976d(0) | ((i7 & 112) != 32) | ((i7 & 14) != 4);
                objM1956L = go0Var.m1956L();
                if (!zM1982g || objM1956L == obj) {
                    objM1956L = new xm0() { // from class: uo1
                        @Override // p000.xm0
                        /* JADX INFO: renamed from: a */
                        public final Object mo6a() {
                            if (zBooleanValue) {
                                ((b02) bs0Var).m336a(0);
                            }
                            in0Var.mo5j(Boolean.valueOf(!z));
                            return a83.f116a;
                        }
                    };
                    go0Var.m1981f0(objM1956L);
                }
                uh1 uh1VarM5232r = m5232r(uh1VarM1896n, bk1Var, z4, (xm0) objM1956L);
                nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
                int iHashCode = Long.hashCode(go0Var.f3614T);
                yy1 yy1VarM1990l = go0Var.m1990l();
                uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM5232r);
                InterfaceC0293hx.f4166c.getClass();
                C0367jy c0367jy = C0256gx.f3727b;
                go0Var.m1969Z();
                if (go0Var.f3613S) {
                    go0Var.m1987i0();
                } else {
                    go0Var.m1989k(c0367jy);
                }
                yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
                yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                yf3.m6267b(go0Var, C0256gx.f3732g);
                yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                uh1 uh1VarM3893E = pp0.m3893E(m5211g0(rh1Var, 12.0f), ((Number) gu2VarM5481b.getValue()).floatValue());
                if (z4) {
                    r15 = 0;
                    go0Var.m1966W(-1580373083);
                    j = ((lp1) go0Var.m1988j(ur1.f11452a)).f6238f;
                } else {
                    go0Var.m1966W(-1580374018);
                    j = ((lp1) go0Var.m1988j(ur1.f11452a)).f6239g;
                    r15 = 0;
                }
                go0Var.m1994p(r15);
                AbstractC0135dm.m1057a(gf1.m1896n(uh1VarM3893E, j, kr1Var2), go0Var, r15);
                go0Var.m1994p(true);
                z3 = z4;
                uh1Var2 = uh1Var4;
            }
            f = 1500.0f;
            gu2 gu2VarM5481b22 = AbstractC0768uc.m5481b(f2, up0.m5528G(0.5f, f, null, 4), "NukeCheckboxPressScale", go0Var, 3120);
            if (z4) {
            }
            gu2 gu2VarM269a2 = ar2.m269a(jM2565b, up0.m5531J(150, null, 6), "NukeCheckboxContainerColor", go0Var);
            kr1 kr1Var3 = new kr1(6.0f);
            kr1 kr1Var22 = new kr1(3.0f);
            uh1 uh1VarM825z2 = ci0.m825z(pp0.m3893E(m5211g0(uh1Var3, 20.0f), ((Number) gu2VarM5481b22.getValue()).floatValue()), kr1Var3);
            uh1 uh1Var42 = uh1Var3;
            uh1 uh1VarM1896n2 = gf1.m1896n(uh1VarM825z2, ((C0363ju) gu2VarM269a2.getValue()).f5219a, sp0.f10267h);
            zM1982g = go0Var.m1982g(zBooleanValue) | go0Var.m1984h(bs0Var) | go0Var.m1976d(0) | ((i7 & 112) != 32) | ((i7 & 14) != 4);
            objM1956L = go0Var.m1956L();
            if (!zM1982g) {
                objM1956L = new xm0() { // from class: uo1
                    @Override // p000.xm0
                    /* JADX INFO: renamed from: a */
                    public final Object mo6a() {
                        if (zBooleanValue) {
                            ((b02) bs0Var).m336a(0);
                        }
                        in0Var.mo5j(Boolean.valueOf(!z));
                        return a83.f116a;
                    }
                };
                go0Var.m1981f0(objM1956L);
                uh1 uh1VarM5232r2 = m5232r(uh1VarM1896n2, bk1Var, z4, (xm0) objM1956L);
                nf1 nf1VarM1060d2 = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
                int iHashCode2 = Long.hashCode(go0Var.f3614T);
                yy1 yy1VarM1990l2 = go0Var.m1990l();
                uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, uh1VarM5232r2);
                InterfaceC0293hx.f4166c.getClass();
                C0367jy c0367jy2 = C0256gx.f3727b;
                go0Var.m1969Z();
                if (go0Var.f3613S) {
                }
                yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d2);
                yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l2);
                yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode2));
                yf3.m6267b(go0Var, C0256gx.f3732g);
                yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M2);
                uh1 uh1VarM3893E2 = pp0.m3893E(m5211g0(rh1Var, 12.0f), ((Number) gu2VarM5481b.getValue()).floatValue());
                if (z4) {
                }
                go0Var.m1994p(r15);
                AbstractC0135dm.m1057a(gf1.m1896n(uh1VarM3893E2, j, kr1Var22), go0Var, r15);
                go0Var.m1994p(true);
                z3 = z4;
                uh1Var2 = uh1Var42;
            }
        } else {
            go0Var.m1961R();
            uh1Var2 = uh1Var;
            z3 = z2;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0() { // from class: vo1
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC0731te.m5210g(z, in0Var, uh1Var2, z3, (InterfaceC0596px) obj2, pp0.m3902N(i | 1));
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static final uh1 m5211g0(uh1 uh1Var, float f) {
        return uh1Var.mo4491c(new kr2(f, f, f, f, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: h */
    public static final void m5212h(List list, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var;
        uh1 uh1VarM5287O;
        C0583pk c0583pk = C0700sn.f10233u;
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(-1952152161);
        int i2 = i | (go0Var2.m1980f(list) ? 4 : 2);
        ?? r5 = 0;
        if (go0Var2.m1958O(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) go0Var2.m1988j(AbstractC0646r7.f9411b);
            Object objM1956L = go0Var2.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            Object obj = objM1956L;
            if (objM1956L == c0160eb) {
                nx1 nx1VarM3598u = op0.m3598u(null);
                go0Var2.m1981f0(nx1VarM3598u);
                obj = nx1VarM3598u;
            }
            xk1 xk1Var = (xk1) obj;
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, c0583pk, go0Var2, 0);
            int iHashCode = Long.hashCode(go0Var2.f3614T);
            yy1 yy1VarM1990l = go0Var2.m1990l();
            yi0 yi0Var = f10693e;
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, yi0Var);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var2.m1969Z();
            if (go0Var2.f3613S) {
                go0Var2.m1989k(c0367jy);
            } else {
                go0Var2.m1987i0();
            }
            yf3.m6268c(go0Var2, C0256gx.f3730e, c0032avM6346a);
            yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var2, C0256gx.f3732g);
            yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M);
            go0Var2.m1966W(688463539);
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    AbstractC0179eu.m1447a0();
                    throw null;
                }
                C0564p1 c0564p1 = (C0564p1) next;
                boolean zM4006s0 = pv2.m4006s0(c0564p1.f7922c);
                rh1 rh1Var = rh1.f9587a;
                if (zM4006s0) {
                    go0Var2.m1966W(-760498005);
                    go0Var2.m1994p(r5);
                    uh1VarM5287O = rh1Var;
                } else {
                    go0Var2.m1966W(-760446297);
                    boolean zM1980f = go0Var2.m1980f(c0564p1);
                    Object objM1956L2 = go0Var2.m1956L();
                    Object obj2 = objM1956L2;
                    if (zM1980f || objM1956L2 == c0160eb) {
                        C0640r1 c0640r1 = new C0640r1(r5, c0564p1, xk1Var);
                        go0Var2.m1981f0(c0640r1);
                        obj2 = c0640r1;
                    }
                    uh1VarM5287O = AbstractC0738tl.m5287O(rh1Var, (xm0) obj2);
                    go0Var2.m1994p(r5);
                }
                uh1 uh1VarM1612D = fg1.m1612D(yi0Var.mo4491c(uh1VarM5287O), 16.0f, 13.0f);
                ob2 ob2VarM3265a = nb2.m3265a(tp0.f10874a, C0700sn.f10232t, go0Var2, 48);
                Context context2 = context;
                xk1 xk1Var2 = xk1Var;
                int iHashCode2 = Long.hashCode(go0Var2.f3614T);
                yy1 yy1VarM1990l2 = go0Var2.m1990l();
                uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var2, uh1VarM1612D);
                InterfaceC0293hx.f4166c.getClass();
                C0367jy c0367jy2 = C0256gx.f3727b;
                go0Var2.m1969Z();
                C0160eb c0160eb2 = c0160eb;
                if (go0Var2.f3613S) {
                    go0Var2.m1989k(c0367jy2);
                } else {
                    go0Var2.m1987i0();
                }
                C0419lc c0419lc = C0256gx.f3730e;
                yf3.m6268c(go0Var2, c0419lc, ob2VarM3265a);
                C0419lc c0419lc2 = C0256gx.f3729d;
                yf3.m6268c(go0Var2, c0419lc2, yy1VarM1990l2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                yi0 yi0Var2 = yi0Var;
                C0419lc c0419lc3 = C0256gx.f3731f;
                yf3.m6268c(go0Var2, c0419lc3, numValueOf);
                C0799v6 c0799v6 = C0256gx.f3732g;
                yf3.m6267b(go0Var2, c0799v6);
                C0419lc c0419lc4 = C0256gx.f3728c;
                yf3.m6268c(go0Var2, c0419lc4, uh1VarM5285M2);
                m5216j(c0564p1, go0Var2, 0);
                rp0.m4529O(go0Var2, m5231q0(rh1Var, 12.0f));
                Iterator it2 = it;
                g71 g71Var = new g71(1.0f, true);
                C0032av c0032avM6346a2 = AbstractC0938yu.m6346a(new C0884xf(3.0f, new C0676s(2)), c0583pk, go0Var2, 6);
                int i5 = i3;
                int iHashCode3 = Long.hashCode(go0Var2.f3614T);
                yy1 yy1VarM1990l3 = go0Var2.m1990l();
                uh1 uh1VarM5285M3 = AbstractC0738tl.m5285M(go0Var2, g71Var);
                go0Var2.m1969Z();
                C0583pk c0583pk2 = c0583pk;
                if (go0Var2.f3613S) {
                    go0Var2.m1989k(c0367jy2);
                } else {
                    go0Var2.m1987i0();
                }
                yf3.m6268c(go0Var2, c0419lc, c0032avM6346a2);
                yf3.m6268c(go0Var2, c0419lc2, yy1VarM1990l3);
                vi0.m5698q(iHashCode3, go0Var2, c0419lc3, go0Var2, c0799v6);
                yf3.m6268c(go0Var2, c0419lc4, uh1VarM5285M3);
                String str = c0564p1.f7920a;
                tu2 tu2Var = ur1.f11452a;
                AbstractC0179eu.m1446a(str, null, new m13(((lp1) go0Var2.m1988j(tu2Var)).f6237e, rg3.m4450D(14), im0.f4682l, 0L, 0, rg3.m4450D(18), null, null, 16646136), 2, false, 1, 0, go0Var2, 1597440, 938);
                AbstractC0179eu.m1446a(c0564p1.f7921b, null, new m13(((lp1) go0Var2.m1988j(tu2Var)).f6238f, rg3.m4450D(12), im0.f4680j, 0L, 0, rg3.m4450D(17), null, null, 16646136), 2, false, 2, 0, go0Var2, 1597440, 938);
                go0Var2.m1994p(true);
                go0Var2.m1994p(true);
                if (i5 < list.size() - 1) {
                    go0Var2.m1966W(-758631278);
                    ci0.m805f(64.0f, go0Var2, 6, 0);
                    go0Var2.m1994p(false);
                } else {
                    go0Var2.m1966W(-758568813);
                    go0Var2.m1994p(false);
                }
                c0160eb = c0160eb2;
                r5 = 0;
                context = context2;
                xk1Var = xk1Var2;
                i3 = i4;
                yi0Var = yi0Var2;
                it = it2;
                c0583pk = c0583pk2;
            }
            Context context3 = context;
            xk1 xk1Var3 = xk1Var;
            boolean z = r5;
            C0160eb c0160eb3 = c0160eb;
            go0Var2.m1994p(z);
            go0Var2.m1994p(true);
            rh0 rh0Var = (rh0) xk1Var3.getValue();
            if (rh0Var == null) {
                go0Var2.m1966W(1589474137);
                go0Var2.m1994p(z);
                go0Var = go0Var2;
            } else {
                go0Var2.m1966W(1589474138);
                String strM4462P = rg3.m4462P(R.string.home_settings_external_link_title, go0Var2);
                String strM4463Q = rg3.m4463Q(R.string.home_settings_external_link_message, new Object[]{rh0Var.f9586a}, go0Var2);
                String strM4462P2 = rg3.m4462P(R.string.home_settings_external_link_open, go0Var2);
                String strM4462P3 = rg3.m4462P(R.string.home_settings_cancel, go0Var2);
                Object objM1956L3 = go0Var2.m1956L();
                Object obj3 = objM1956L3;
                if (objM1956L3 == c0160eb3) {
                    C0186f0 c0186f0 = new C0186f0(xk1Var3, 4);
                    go0Var2.m1981f0(c0186f0);
                    obj3 = c0186f0;
                }
                xm0 xm0Var = (xm0) obj3;
                boolean zM1984h = go0Var2.m1984h(context3) | go0Var2.m1980f(rh0Var);
                Object objM1956L4 = go0Var2.m1956L();
                Object obj4 = objM1956L4;
                if (zM1984h || objM1956L4 == c0160eb3) {
                    C0678s1 c0678s1 = new C0678s1(context3, rh0Var, xk1Var3, z ? 1 : 0);
                    go0Var2.m1981f0(c0678s1);
                    obj4 = c0678s1;
                }
                qp0.m4248c(xm0Var, strM4462P, strM4463Q, strM4462P2, (xm0) obj4, null, strM4462P3, null, go0Var2, 6, 160);
                go0 go0Var3 = go0Var2;
                go0Var3.m1994p(z);
                go0Var = go0Var3;
            }
        } else {
            go0Var2.m1961R();
            go0Var = go0Var2;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0601q1(list, i, 2);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final uh1 m5213h0(uh1 uh1Var, float f, float f2) {
        return uh1Var.mo4491c(new kr2(f, f2, f, f2, true));
    }

    /* JADX INFO: renamed from: i */
    public static final void m5214i(String str, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1810407737);
        int i2 = 2;
        int i3 = (go0Var.m1980f(str) ? 4 : 2) | i;
        if (go0Var.m1958O(i3 & 1, (i3 & 3) != 2)) {
            Character chM4001n0 = pv2.m4001n0(pv2.m3993I0(str).toString());
            String strValueOf = chM4001n0 != null ? String.valueOf(chM4001n0.charValue()) : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            uh1 uh1VarM825z = ci0.m825z(m5211g0(rh1.f9587a, 36.0f), gb2.m1827a(12.0f));
            tu2 tu2Var = ur1.f11452a;
            uh1 uh1VarM1896n = gf1.m1896n(uh1VarM825z, C0363ju.m2565b(0.13f, ((lp1) go0Var.m1988j(tu2Var)).f6239g), sp0.f10267h);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1896n);
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
            AbstractC0179eu.m1446a(strValueOf, null, new m13(((lp1) go0Var.m1988j(tu2Var)).f6239g, rg3.m4450D(15), im0.f4683m, 0L, 0, rg3.m4450D(18), null, null, 16646136), 0, false, 0, 0, go0Var, 0, 1018);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0481n0(str, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static void m5215i0(AbstractC0812vj[] abstractC0812vjArr, vu0 vu0Var) throws InterruptedException {
        abstractC0812vjArr.getClass();
        if (vu0Var == vu0.f12173h) {
            Thread.sleep(2000L);
        }
        pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
        int length = abstractC0812vjArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C0104cs c0104cs = abstractC0812vjArr[i];
            w70 w70Var = c0104cs instanceof w70 ? (w70) c0104cs : null;
            if (w70Var != null) {
                ArrayList arrayList = new ArrayList();
                w70Var.mo8a(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    pb1VarM1424E.add(new q70(c0104cs, (v70) it.next()));
                }
            }
            i++;
        }
        pb1 pb1VarM1476z = AbstractC0179eu.m1476z(pb1VarM1424E);
        int iMo152a = pb1VarM1476z.mo152a();
        Activity activity = up0.f11403k;
        if (activity == null) {
            t11.m5067S("hostAct");
            throw null;
        }
        activity.runOnUiThread(new RunnableC0577pe(iMo152a, 1, activity));
        Thread thread = new Thread(new RunnableC0418lb(abstractC0812vjArr, pb1VarM1476z, vu0Var, 4));
        thread.setName("NukeDexAnalysis");
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: renamed from: j */
    public static final void m5216j(final C0564p1 c0564p1, InterfaceC0596px interfaceC0596px, final int i) {
        b62 b62VarM1996r;
        mn0 mn0Var;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1171733053);
        int i2 = (go0Var.m1980f(c0564p1) ? 4 : 2) | i;
        final int i3 = 1;
        final int i4 = 0;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            String str = c0564p1.f7922c;
            boolean zM1980f = go0Var.m1980f(str);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (zM1980f || objM1956L == c0160eb) {
                objM1956L = op0.m3598u(null);
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            boolean zM1980f2 = go0Var.m1980f(xk1Var) | go0Var.m1980f(str);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1980f2 || objM1956L2 == c0160eb) {
                objM1956L2 = new C0040b2(str, xk1Var, (t00) null);
                go0Var.m1981f0(objM1956L2);
            }
            AbstractC0179eu.m1456f(go0Var, (mn0) objM1956L2, str);
            String str2 = (String) xk1Var.getValue();
            if (str2 == null) {
                go0Var.m1966W(1900809343);
                m5214i(c0564p1.f7920a, go0Var, 0);
                go0Var.m1994p(false);
                b62VarM1996r = go0Var.m1996r();
                if (b62VarM1996r != null) {
                    mn0Var = new mn0(c0564p1, i, i4) { // from class: t1

                        /* JADX INFO: renamed from: h */
                        public final /* synthetic */ int f10467h;

                        /* JADX INFO: renamed from: i */
                        public final /* synthetic */ C0564p1 f10468i;

                        {
                            this.f10467h = i4;
                        }

                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj, Object obj2) {
                            int i5 = this.f10467h;
                            a83 a83Var = a83.f116a;
                            C0564p1 c0564p12 = this.f10468i;
                            InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    AbstractC0731te.m5216j(c0564p12, interfaceC0596px2, pp0.m3902N(1));
                                    break;
                                default:
                                    AbstractC0731te.m5216j(c0564p12, interfaceC0596px2, pp0.m3902N(1));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                    b62VarM1996r.f616d = mn0Var;
                }
                return;
            }
            go0Var.m1966W(1900876613);
            go0Var.m1994p(false);
            Context context = (Context) go0Var.m1988j(AbstractC0646r7.f9411b);
            uh1 uh1VarM1896n = gf1.m1896n(ci0.m825z(m5211g0(rh1.f9587a, 36.0f), gb2.m1827a(12.0f)), C0363ju.m2565b(0.13f, ((lp1) go0Var.m1988j(ur1.f11452a)).f6239g), sp0.f10267h);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1896n);
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
            uh1 uh1VarM2219a = C0282hm.m2219a();
            Object objM1956L3 = go0Var.m1956L();
            if (objM1956L3 == c0160eb) {
                objM1956L3 = new C0829w(i3);
                go0Var.m1981f0(objM1956L3);
            }
            in0 in0Var = (in0) objM1956L3;
            boolean zM1984h = go0Var.m1984h(context) | go0Var.m1980f(str2);
            Object objM1956L4 = go0Var.m1956L();
            if (zM1984h || objM1956L4 == c0160eb) {
                objM1956L4 = new C0757u1(context, str2, i4);
                go0Var.m1981f0(objM1956L4);
            }
            pp0.m3904b(in0Var, uh1VarM2219a, (in0) objM1956L4, go0Var, 6, 0);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            mn0Var = new mn0(c0564p1, i, i3) { // from class: t1

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ int f10467h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ C0564p1 f10468i;

                {
                    this.f10467h = i3;
                }

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    int i5 = this.f10467h;
                    a83 a83Var = a83.f116a;
                    C0564p1 c0564p12 = this.f10468i;
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            AbstractC0731te.m5216j(c0564p12, interfaceC0596px2, pp0.m3902N(1));
                            break;
                        default:
                            AbstractC0731te.m5216j(c0564p12, interfaceC0596px2, pp0.m3902N(1));
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarM1996r.f616d = mn0Var;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static String m5217j0(int i, Object... objArr) {
        Activity activity = up0.f11403k;
        if (activity == null) {
            t11.m5067S("hostAct");
            throw null;
        }
        lg3.m2909a(activity);
        if (objArr.length == 0) {
            Activity activity2 = up0.f11403k;
            if (activity2 == null) {
                t11.m5067S("hostAct");
                throw null;
            }
            String string = activity2.getString(i);
            string.getClass();
            return string;
        }
        Activity activity3 = up0.f11403k;
        if (activity3 == null) {
            t11.m5067S("hostAct");
            throw null;
        }
        String string2 = activity3.getString(i, Arrays.copyOf(objArr, objArr.length));
        string2.getClass();
        return string2;
    }

    /* JADX INFO: renamed from: k */
    public static final void m5218k(uh1 uh1Var, mn0 mn0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1090521195);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(mn0Var) ? 32 : 16;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            Object objM1956L = go0Var.m1956L();
            if (objM1956L == C0520nx.f7360a) {
                objM1956L = C0378k8.f5380b;
                go0Var.m1981f0(objM1956L);
            }
            nf1 nf1Var = (nf1) objM1956L;
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1Var);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, nf1Var);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            mn0Var.mo12g(go0Var, Integer.valueOf((i3 >> 6) & 14));
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0415l8(uh1Var, mn0Var, i);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m5219k0(bi0 bi0Var) {
        bi0Var.f888v = 1;
        hg3.m2163a(bi0Var.f883q);
        hg3.m2163a(bi0Var.f884r);
        bi0Var.f883q = null;
        bi0Var.f884r = null;
        bi0Var.f885s = null;
        bi0Var.f886t = null;
    }

    /* JADX INFO: renamed from: l */
    public static final void m5220l(oy2 oy2Var, Context context, final boolean z, final String str, final long j) {
        if (f13.m1494c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) op0.f7758e.mo5j(context2);
        if (list.isEmpty()) {
            return;
        }
        lk1 lk1Var = oy2Var.f7885a;
        lk1 lk1Var2 = oy2Var.f7885a;
        bz2 bz2Var = bz2.f1088b;
        lk1Var.m2925a(bz2Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            lk1Var2.m2925a(new xy2(new l32(i), resolveInfo.loadLabel(packageManager).toString(), 0, new in0() { // from class: m32
                @Override // p000.in0
                /* JADX INFO: renamed from: j */
                public final Object mo5j(Object obj) {
                    op0.f7759f.mo2749k(context2, resolveInfo, Boolean.valueOf(z), str, new f13(j));
                    ((cz2) obj).close();
                    return a83.f116a;
                }
            }));
            i++;
            context2 = context;
        }
        lk1Var2.m2925a(bz2Var);
    }

    /* JADX INFO: renamed from: l0 */
    public static final by0 m5221l0(yi1 yi1Var) {
        px1 px1Var;
        String str;
        String str2 = yi1Var.f13475h;
        String str3 = yi1Var.f13470c;
        if (yi1Var.f13468a != 0 || yi1Var.f13472e != 1 || pv2.m4006s0(str3) || pv2.m4006s0(str2)) {
            return null;
        }
        if (wv2.m6005W(str3, "@chatroom", false)) {
            int iM4004q0 = pv2.m4004q0(str2, ":\r\n", 0, false, 6);
            if (iM4004q0 > 0) {
                String strSubstring = str2.substring(iM4004q0 + 3);
                String string = pv2.m3993I0(str2.substring(0, iM4004q0)).toString();
                if (pv2.m4006s0(string)) {
                    string = null;
                }
                px1Var = new px1(strSubstring, string);
            } else {
                int iM4004q02 = pv2.m4004q0(str2, ":\n", 0, false, 6);
                if (iM4004q02 > 0) {
                    String strSubstring2 = str2.substring(iM4004q02 + 2);
                    String string2 = pv2.m3993I0(str2.substring(0, iM4004q02)).toString();
                    if (pv2.m4006s0(string2)) {
                        string2 = null;
                    }
                    px1Var = new px1(strSubstring2, string2);
                } else {
                    px1Var = new px1(str2, null);
                }
            }
        } else {
            px1Var = new px1(str2, null);
        }
        String str4 = px1Var.f8640a;
        if (pv2.m4006s0(str4)) {
            return null;
        }
        long j = yi1Var.f13477j;
        if (j != 0) {
            str = "server:" + j;
        } else {
            long j2 = yi1Var.f13473f;
            if (j2 != 0) {
                str = "local:" + j2;
            } else {
                str = "fallback:" + str3 + ":" + yi1Var.f13476i + ":" + str2.hashCode();
            }
        }
        return new by0(str3, str4, px1Var.f8641b, str, yi1Var.f13476i);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5222m(C0310id c0310id, InterfaceC0162ed interfaceC0162ed, long j, final in0 in0Var, t00 t00Var) {
        sw2 sw2Var;
        final o72 o72Var;
        final C0310id c0310id2;
        C0310id c0310id3;
        o72 o72Var2;
        Object objM6080a;
        in0 in0Var2;
        C0236gd c0236gd;
        C0236gd c0236gd2;
        Object objM6080a2;
        final InterfaceC0162ed interfaceC0162ed2 = interfaceC0162ed;
        gd3 gd3Var = gd3.f3447y;
        if (t00Var instanceof sw2) {
            sw2Var = (sw2) t00Var;
            int i = sw2Var.f10394p;
            if ((i & Integer.MIN_VALUE) != 0) {
                sw2Var.f10394p = i - Integer.MIN_VALUE;
            } else {
                sw2Var = new sw2(t00Var);
            }
        }
        sw2 sw2Var2 = sw2Var;
        a20 a20Var = sw2Var2.f11029i;
        Object obj = sw2Var2.f10393o;
        int i2 = sw2Var2.f10394p;
        int i3 = 5;
        int i4 = 0;
        k20 k20Var = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(obj);
            final Object objMo915b = interfaceC0162ed2.mo915b(0L);
            final AbstractC0494nd abstractC0494ndMo919f = interfaceC0162ed2.mo919f(0L);
            o72Var = new o72();
            if (j == Long.MIN_VALUE) {
                try {
                    a20Var.getClass();
                    final float fM5177F = m5177F(a20Var);
                    c0310id2 = c0310id;
                    try {
                        in0 in0Var3 = new in0() { // from class: pw2
                            @Override // p000.in0
                            /* JADX INFO: renamed from: j */
                            public final Object mo5j(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                InterfaceC0162ed interfaceC0162ed3 = interfaceC0162ed2;
                                n43 n43VarMo917d = interfaceC0162ed3.mo917d();
                                Object objMo918e = interfaceC0162ed3.mo918e();
                                C0310id c0310id4 = c0310id2;
                                C0236gd c0236gd3 = new C0236gd(objMo915b, n43VarMo917d, abstractC0494ndMo919f, jLongValue, objMo918e, jLongValue, new qw2(c0310id4, 1));
                                AbstractC0731te.m5240w(c0236gd3, jLongValue, fM5177F, interfaceC0162ed3, c0310id4, in0Var);
                                o72Var.f7574i = c0236gd3;
                                return a83.f116a;
                            }
                        };
                        o72Var2 = o72Var;
                        try {
                            sw2Var2.f10389k = c0310id2;
                            sw2Var2.f10390l = interfaceC0162ed2;
                            sw2Var2.f10391m = in0Var;
                            sw2Var2.f10392n = o72Var2;
                            sw2Var2.f10394p = 1;
                            if (!interfaceC0162ed2.mo914a()) {
                                wo0 wo0Var = new wo0(in0Var3, i3);
                                a20Var.getClass();
                                objM6080a = qp0.m4220A(a20Var).m6080a(wo0Var, sw2Var2);
                            } else {
                                if (sw2Var2.mo2508f().mo15o(gd3Var) != null) {
                                    throw new ClassCastException();
                                }
                                objM6080a = qp0.m4220A(sw2Var2.mo2508f()).m6080a(in0Var3, sw2Var2);
                            }
                            if (objM6080a != k20Var) {
                                c0310id3 = c0310id2;
                                in0Var2 = in0Var;
                                o72Var = o72Var2;
                            }
                            return k20Var;
                        } catch (CancellationException e) {
                            e = e;
                            c0310id3 = c0310id2;
                            o72Var = o72Var2;
                            c0236gd = (C0236gd) o72Var.f7574i;
                            if (c0236gd != null) {
                            }
                            c0236gd2 = (C0236gd) o72Var.f7574i;
                            if (c0236gd2 != null) {
                                c0310id3.f4565m = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        c0310id3 = c0310id2;
                        c0236gd = (C0236gd) o72Var.f7574i;
                        if (c0236gd != null) {
                        }
                        c0236gd2 = (C0236gd) o72Var.f7574i;
                        if (c0236gd2 != null) {
                        }
                        throw e;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    c0310id2 = c0310id;
                }
            } else {
                o72Var2 = o72Var;
                try {
                    C0236gd c0236gd3 = new C0236gd(objMo915b, interfaceC0162ed2.mo917d(), abstractC0494ndMo919f, j, interfaceC0162ed2.mo918e(), j, new qw2(c0310id, i4));
                    a20Var.getClass();
                    m5240w(c0236gd3, j, m5177F(a20Var), interfaceC0162ed2, c0310id, in0Var);
                    o72Var2.f7574i = c0236gd3;
                    c0310id3 = c0310id;
                    interfaceC0162ed2 = interfaceC0162ed;
                    in0Var2 = in0Var;
                    o72Var = o72Var2;
                } catch (CancellationException e4) {
                    e = e4;
                    c0310id3 = c0310id;
                    o72Var = o72Var2;
                    c0236gd = (C0236gd) o72Var.f7574i;
                    if (c0236gd != null) {
                    }
                    c0236gd2 = (C0236gd) o72Var.f7574i;
                    if (c0236gd2 != null) {
                    }
                    throw e;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o72Var = sw2Var2.f10392n;
            in0Var2 = sw2Var2.f10391m;
            interfaceC0162ed2 = sw2Var2.f10390l;
            c0310id3 = sw2Var2.f10389k;
            try {
                fg1.m1627T(obj);
            } catch (CancellationException e5) {
                e = e5;
                c0236gd = (C0236gd) o72Var.f7574i;
                if (c0236gd != null) {
                    c0236gd.f3408i.setValue(Boolean.FALSE);
                }
                c0236gd2 = (C0236gd) o72Var.f7574i;
                if (c0236gd2 != null && c0236gd2.f3406g == c0310id3.f4563k) {
                    c0310id3.f4565m = false;
                }
                throw e;
            }
        }
        do {
            a20 a20Var2 = sw2Var2.f11029i;
            Object obj2 = o72Var.f7574i;
            obj2.getClass();
            if (!((Boolean) ((C0236gd) obj2).f3408i.getValue()).booleanValue()) {
                return a83.f116a;
            }
            a20Var2.getClass();
            final float fM5177F2 = m5177F(a20Var2);
            final o72 o72Var3 = o72Var;
            final in0 in0Var4 = in0Var2;
            final InterfaceC0162ed interfaceC0162ed3 = interfaceC0162ed2;
            final C0310id c0310id4 = c0310id3;
            try {
                in0 in0Var5 = new in0() { // from class: rw2
                    @Override // p000.in0
                    /* JADX INFO: renamed from: j */
                    public final Object mo5j(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = o72Var3.f7574i;
                        obj4.getClass();
                        AbstractC0731te.m5240w((C0236gd) obj4, jLongValue, fM5177F2, interfaceC0162ed3, c0310id4, in0Var4);
                        return a83.f116a;
                    }
                };
                o72Var = o72Var3;
                interfaceC0162ed2 = interfaceC0162ed3;
                c0310id3 = c0310id4;
                in0Var2 = in0Var4;
                sw2Var2.f10389k = c0310id3;
                sw2Var2.f10390l = interfaceC0162ed2;
                sw2Var2.f10391m = in0Var2;
                sw2Var2.f10392n = o72Var;
                sw2Var2.f10394p = 2;
                if (!interfaceC0162ed2.mo914a()) {
                    wo0 wo0Var2 = new wo0(in0Var5, i3);
                    a20Var2.getClass();
                    objM6080a2 = qp0.m4220A(a20Var2).m6080a(wo0Var2, sw2Var2);
                } else {
                    if (sw2Var2.mo2508f().mo15o(gd3Var) != null) {
                        throw new ClassCastException();
                    }
                    objM6080a2 = qp0.m4220A(sw2Var2.mo2508f()).m6080a(in0Var5, sw2Var2);
                }
            } catch (CancellationException e6) {
                e = e6;
                o72Var = o72Var3;
                c0310id3 = c0310id4;
                c0236gd = (C0236gd) o72Var.f7574i;
                if (c0236gd != null) {
                }
                c0236gd2 = (C0236gd) o72Var.f7574i;
                if (c0236gd2 != null) {
                }
                throw e;
            }
        } while (objM6080a2 != k20Var);
        return k20Var;
    }

    /* JADX INFO: renamed from: m0 */
    public static void m5223m0(bi0 bi0Var, File file, File file2) {
        String str = bi0Var.f868b;
        try {
            if (m5194W(bi0Var, file)) {
                return;
            }
        } catch (IOException e) {
            Log.w("FastKV", str, e);
        }
        m5205d0(bi0Var);
        try {
            if (m5194W(bi0Var, file2)) {
                return;
            }
        } catch (IOException e2) {
            Log.w("FastKV", str, e2);
        }
        m5205d0(bi0Var);
    }

    /* JADX INFO: renamed from: n */
    public static final Object m5224n(C0310id c0310id, Float f, fj0 fj0Var, in0 in0Var, tw2 tw2Var) {
        Object objM5222m = m5222m(c0310id, new cy2(fj0Var, c0310id.f4560h, c0310id.f4561i.getValue(), f, c0310id.f4562j), c0310id.f4563k, in0Var, tw2Var);
        return objM5222m == k20.f5323h ? objM5222m : a83.f116a;
    }

    /* JADX INFO: renamed from: n0 */
    public static final h63 m5225n0(z53 z53Var, Object obj) {
        z53Var.getClass();
        obj.getClass();
        h63 h63VarM5227o0 = m5227o0(obj);
        if (h63VarM5227o0 != null) {
            return h63VarM5227o0;
        }
        h63 h63Var = (h63) z53Var.f13737b.get(d72.m967a(obj.getClass()));
        if (h63Var != null) {
            return h63Var;
        }
        throw new IllegalStateException("Cannot find the kotlin type of object " + obj + " (" + d72.m967a(obj.getClass()) + "), did you forget to add a type converter for it?");
    }

    /* JADX INFO: renamed from: o */
    public static final void m5226o(j20 j20Var, xh1 xh1Var) {
        k21 k21Var = (k21) j20Var.mo705g().mo15o(C0700sn.f10207K);
        if (k21Var != null) {
            k21Var.mo1704c(xh1Var);
        } else {
            c80.m677u("Scope cannot be cancelled because it does not have a job: ", j20Var);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static final h63 m5227o0(Object obj) {
        if (t11.m5086l(obj, a83.f116a)) {
            return d72.m969c(a83.class);
        }
        if (obj instanceof Byte) {
            return d72.m969c(Byte.TYPE);
        }
        if (obj instanceof Short) {
            return d72.m969c(Short.TYPE);
        }
        if (obj instanceof Integer) {
            return d72.m969c(Integer.TYPE);
        }
        if (obj instanceof Long) {
            return d72.m969c(Long.TYPE);
        }
        if (obj instanceof Float) {
            return d72.m969c(Float.TYPE);
        }
        if (obj instanceof Double) {
            return d72.m969c(Double.TYPE);
        }
        if (obj instanceof Boolean) {
            return d72.m969c(Boolean.TYPE);
        }
        if (obj instanceof String) {
            return d72.m969c(String.class);
        }
        if (obj instanceof byte[]) {
            return d72.m969c(byte[].class);
        }
        if (obj instanceof UByteArray) {
            return d72.m969c(UByteArray.class);
        }
        boolean z = obj instanceof Object[];
        x41 x41Var = x41.f12806a;
        if (z) {
            return d72.m970d(Object[].class, x41Var);
        }
        if (obj instanceof List) {
            return d72.m970d(List.class, x41Var);
        }
        if (obj instanceof Set) {
            return d72.m970d(Set.class, x41Var);
        }
        if (obj instanceof JsObject) {
            return d72.m969c(JsObject.class);
        }
        if (!(obj instanceof Map)) {
            if (obj instanceof Error) {
                return d72.m969c(Error.class);
            }
            return null;
        }
        e72 e72Var = d72.f1901a;
        C0067bt c0067btM967a = d72.m967a(Map.class);
        List listAsList = Arrays.asList(x41Var, x41Var);
        e72Var.getClass();
        return new h63(c0067btM967a, listAsList, false);
    }

    /* JADX INFO: renamed from: p */
    public static final void m5228p(long j, qv1 qv1Var) {
        if (qv1Var == qv1.f9205h) {
            if (C0221fz.m1762g(j) != Integer.MAX_VALUE) {
                return;
            }
            nz0.m3458c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (C0221fz.m1763h(j) != Integer.MAX_VALUE) {
                return;
            }
            nz0.m3458c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m5229p0(C0236gd c0236gd, C0310id c0310id) {
        c0310id.f4561i.setValue(c0236gd.f3404e.getValue());
        AbstractC0494nd abstractC0494nd = c0310id.f4562j;
        AbstractC0494nd abstractC0494nd2 = c0236gd.f3405f;
        int iMo2478b = abstractC0494nd.mo2478b();
        for (int i = 0; i < iMo2478b; i++) {
            abstractC0494nd.mo2481e(abstractC0494nd2.mo2477a(i), i);
        }
        c0310id.f4564l = c0236gd.f3407h;
        c0310id.f4563k = c0236gd.f3406g;
        c0310id.f4565m = ((Boolean) c0236gd.f3408i.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public static void m5230q(bi0 bi0Var) {
        if (bi0Var.f888v == 0) {
            try {
                m5203c0(bi0Var, bi0Var.f885s);
                m5203c0(bi0Var, bi0Var.f886t);
            } catch (Exception unused) {
                m5219k0(bi0Var);
            }
        }
        m5205d0(bi0Var);
        hg3.m2164b(new File(bi0Var.f867a + bi0Var.f868b));
    }

    /* JADX INFO: renamed from: q0 */
    public static final uh1 m5231q0(uh1 uh1Var, float f) {
        return uh1Var.mo4491c(new kr2(f, 0.0f, f, 0.0f, 10));
    }

    /* JADX INFO: renamed from: r */
    public static uh1 m5232r(uh1 uh1Var, bk1 bk1Var, boolean z, xm0 xm0Var) {
        return uh1Var.mo4491c(new C0362jt(bk1Var, false, z, null, xm0Var));
    }

    /* JADX INFO: renamed from: r0 */
    public static final uh1 m5233r0(uh1 uh1Var, float f, float f2) {
        return uh1Var.mo4491c(new kr2(f, 0.0f, f2, 0.0f, 10));
    }

    /* JADX INFO: renamed from: s */
    public static uh1 m5234s(uh1 uh1Var, boolean z, String str, xm0 xm0Var) {
        return uh1Var.mo4491c(new C0362jt(null, true, z, str, xm0Var));
    }

    /* JADX INFO: renamed from: s0 */
    public static boolean m5235s0(bi0 bi0Var, C0158e9 c0158e9) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        FileChannel.MapMode mapMode;
        ByteOrder byteOrder;
        String str = bi0Var.f868b;
        String str2 = bi0Var.f867a;
        try {
            int length = ((byte[]) c0158e9.f2354k).length;
            File file = new File(str2, str + ".kva");
            File file2 = new File(str2, str + ".kvb");
            if (!hg3.m2170h(file) || !hg3.m2170h(file2)) {
                throw new Exception("open file failed");
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            long j = length;
            try {
                randomAccessFile.setLength(j);
                FileChannel channel = randomAccessFile.getChannel();
                bi0Var.f883q = channel;
                mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = channel.map(mapMode, 0L, j);
                bi0Var.f885s = map;
                byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                bi0Var.f885s.put((byte[]) c0158e9.f2354k, 0, bi0Var.f870d);
                randomAccessFile2 = new RandomAccessFile(file2, "rw");
            } catch (Exception e) {
                e = e;
                randomAccessFile2 = null;
            }
            try {
                randomAccessFile2.setLength(j);
                FileChannel channel2 = randomAccessFile2.getChannel();
                bi0Var.f884r = channel2;
                MappedByteBuffer map2 = channel2.map(mapMode, 0L, j);
                bi0Var.f886t = map2;
                map2.order(byteOrder);
                bi0Var.f886t.put((byte[]) c0158e9.f2354k, 0, bi0Var.f870d);
                return true;
            } catch (Exception e2) {
                e = e2;
                hg3.m2163a(randomAccessFile);
                hg3.m2163a(randomAccessFile2);
                bi0Var.f883q = null;
                bi0Var.f884r = null;
                bi0Var.f885s = null;
                bi0Var.f886t = null;
                Log.e("FastKV", str, e);
                return false;
            }
        } catch (Exception e3) {
            e = e3;
            randomAccessFile = null;
            randomAccessFile2 = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m5236t(bi0 bi0Var, MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            MappedByteBuffer mappedByteBufferM5199a0 = m5199a0(mappedByteBuffer2 == bi0Var.f886t ? bi0Var.f884r : bi0Var.f883q, mappedByteBuffer.capacity());
            if (mappedByteBufferM5199a0 == null) {
                Log.e("FastKV", bi0Var.f868b, new Exception("map failed"));
                m5219k0(bi0Var);
                return;
            } else {
                if (mappedByteBuffer2 == bi0Var.f886t) {
                    bi0Var.f886t = mappedByteBufferM5199a0;
                } else {
                    bi0Var.f885s = mappedByteBufferM5199a0;
                }
                mappedByteBuffer2 = mappedByteBufferM5199a0;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m5237t0(bi0 bi0Var) {
        String str = bi0Var.f868b;
        String str2 = bi0Var.f867a;
        try {
            File file = new File(str2, str + ".tmp");
            if (!hg3.m2170h(file)) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.setLength(bi0Var.f870d);
                randomAccessFile.write((byte[]) bi0Var.f874h.f2354k, 0, bi0Var.f870d);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                File file2 = new File(str2, str + ".kvc");
                if (!(file.renameTo(file2) || ((!file2.exists() || file2.delete()) && file.renameTo(file2)))) {
                    Log.w("FastKV", str, new Exception("rename failed"));
                    return false;
                }
                ArrayList arrayList = bi0Var.f877k;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ci0.m785J().execute(new RunnableC0724t7(2, bi0Var, (String) it.next()));
                    }
                    arrayList.clear();
                }
                return true;
            } finally {
            }
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: u */
    public static final Object m5238u(mn0 mn0Var, t00 t00Var) {
        hd2 hd2Var = new hd2(t00Var, t00Var.mo2508f());
        return ze3.m6410b(hd2Var, true, hd2Var, mn0Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m5239v(bi0 bi0Var) {
        String str = bi0Var.f868b;
        String str2 = bi0Var.f867a;
        try {
            hg3.m2164b(new File(str2, str + ".kvc"));
            hg3.m2164b(new File(str2, str + ".tmp"));
        } catch (Exception e) {
            Log.e("FastKV", str, e);
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m5240w(C0236gd c0236gd, long j, float f, InterfaceC0162ed interfaceC0162ed, C0310id c0310id, in0 in0Var) {
        long jMo916c = f == 0.0f ? interfaceC0162ed.mo916c() : (long) ((j - c0236gd.f3402c) / f);
        c0236gd.f3406g = j;
        c0236gd.f3404e.setValue(interfaceC0162ed.mo915b(jMo916c));
        c0236gd.f3405f = interfaceC0162ed.mo919f(jMo916c);
        if (interfaceC0162ed.m1335g(jMo916c)) {
            c0236gd.f3407h = c0236gd.f3406g;
            c0236gd.f3408i.setValue(Boolean.FALSE);
        }
        m5229p0(c0236gd, c0310id);
        in0Var.mo5j(c0236gd);
    }

    /* JADX INFO: renamed from: x */
    public static final int m5241x(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object objM3845b = pb3.m3845b(view);
            view = objM3845b instanceof View ? (View) objM3845b : null;
        }
        return i3;
    }

    /* JADX INFO: renamed from: y */
    public static final int m5242y(int i, t81 t81Var, Object obj) {
        int iM1300g;
        return (obj == null || t81Var.m5133c() == 0 || (i < t81Var.m5133c() && obj.equals(t81Var.m5134d(i))) || (iM1300g = t81Var.f10610d.m1300g(obj)) == -1) ? i : iM1300g;
    }

    /* JADX INFO: renamed from: z */
    public static final View m5243z(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(m5241x(view, R.id.view_tree_lifecycle_owner), m5241x(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (m5176E(view) == null) {
                i++;
                Object objM3845b = pb3.m3845b(view);
                View view4 = view2;
                view2 = view;
                view = objM3845b instanceof View ? (View) objM3845b : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    /* JADX INFO: renamed from: D */
    public abstract o62 mo5004D();
}
