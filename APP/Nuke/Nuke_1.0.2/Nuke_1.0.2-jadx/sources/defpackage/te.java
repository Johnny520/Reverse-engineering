package defpackage;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class te {
    public static ca2 b = null;
    public static final float i = 24.0f;
    public static final sz0 a = new sz0(10, false);
    public static final Object c = new Object();
    public static final StackTraceElement[] d = new StackTraceElement[0];
    public static final yi0 e = new yi0(t80.i);
    public static final yi0 f = new yi0(t80.h);
    public static final yi0 g = new yi0(t80.j);
    public static final uc3 h = new uc3();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String A(long j) {
        double d2 = j < 0 ? 0L : j;
        if (d2 >= 1048576.0d) {
            return String.format(Locale.US, "%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1048576.0d)}, 1));
        }
        if (d2 >= 1024.0d) {
            return String.format(Locale.US, "%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1024.0d)}, 1));
        }
        if (j < 0) {
            j = 0;
        }
        return j + " B";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static yr0 B(SSLSession sSLSession) throws IOException {
        Object objJ;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            s.l("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            c80.v("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        ps psVarJ = ps.b.j(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            s.l("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            c80.v("tlsVersion == NONE");
            return null;
        }
        s23.i.getClass();
        s23 s23VarE = ix2.e(protocol);
        try {
            objJ = wg3.j(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objJ = be0.h;
        }
        return new yr0(s23VarE, psVarJ, wg3.j(sSLSession.getLocalCertificates()), new ta(8, objJ));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static vf1 C(String str) {
        str.getClass();
        kj1 kj1VarA = vf1.d.a(str, 0);
        if (kj1VarA == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String str2 = (String) ((bf1) kj1VarA.x()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((bf1) kj1VarA.x()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = kj1VarA.z().i;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= str.length()) {
                return new vf1(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            kj1 kj1VarA2 = vf1.e.a(str, i3);
            if (kj1VarA2 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i3) + "\" for: \"" + str + '\"').toString());
            }
            cf1 cf1Var = (cf1) kj1VarA2.k;
            af1 af1VarB = cf1Var.b(1);
            String str3 = af1VarB != null ? af1VarB.a : null;
            if (str3 == null) {
                i2 = kj1VarA2.z().i;
            } else {
                af1 af1VarB2 = cf1Var.b(2);
                String strSubstring = af1VarB2 != null ? af1VarB2.a : null;
                if (strSubstring == null) {
                    af1 af1VarB3 = cf1Var.b(3);
                    af1VarB3.getClass();
                    strSubstring = af1VarB3.a;
                } else if (pv2.E0(strSubstring, '\'') && pv2.m0(strSubstring, '\'') && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(strSubstring);
                i2 = kj1VarA2.z().i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final lx E(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (lx) weakReference.get();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float F(a20 a20Var) {
        fi1 fi1Var = (fi1) a20Var.o(sn.M);
        float fV = fi1Var != null ? fi1Var.v() : 1.0f;
        if (fV >= 0.0f) {
            return fV;
        }
        l22.b("negative scale factor");
        return fV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int G(int i2, int i3) {
        if (i3 >= 268435456) {
            s.l("data size out of limit");
            return 0;
        }
        int i4 = bi0.z;
        if (i3 <= i4) {
            return i4;
        }
        while (i2 < i3) {
            i2 <<= 1;
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LinkedHashSet H(bi0 bi0Var, wz wzVar) {
        String str = bi0Var.b;
        try {
            byte[] bArrE = hg3.e(new File(bi0Var.a + str, (String) wzVar.b));
            if (bArrE == null) {
                Log.w("FastKV", str, new Exception("Read object data failed"));
                return null;
            }
            int i2 = bArrE[0] & 255;
            String strD = bi0Var.h.d(bArrE, 1, i2);
            if (((ov2) bi0Var.c.get(strD)) != null) {
                int i3 = i2 + 1;
                return ov2.a(bArrE, i3, bArrE.length - i3);
            }
            Log.w("FastKV", str, new Exception("No encoder for tag:".concat(strD)));
            return null;
        } catch (Exception e2) {
            Log.e("FastKV", str, e2);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long I(n4 n4Var) {
        DragEvent dragEvent = (DragEvent) n4Var.i;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final lm2 J(Object obj) {
        if (obj != xe1.e) {
            return (lm2) obj;
        }
        s.l("Does not contain segment");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String K(bi0 bi0Var, xz xzVar) {
        String str = bi0Var.b;
        try {
            byte[] bArrE = hg3.e(new File(bi0Var.a + str, (String) xzVar.b));
            if (bArrE != null) {
                return new String(bArrE, StandardCharsets.UTF_8);
            }
            return null;
        } catch (Exception e2) {
            Log.e("FastKV", str, e2);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 L(uh1 uh1Var, in0 in0Var) {
        return uh1Var.c(new dl(in0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 M(uh1 uh1Var, float f2, float f3, float f4, float f5, long j, eq2 eq2Var, boolean z, long j2, long j3) {
        return uh1Var.c(new qq0(f2, f3, f4, f5, j, eq2Var, z, j2, j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 N(uh1 uh1Var, float f2, float f3, float f4, eq2 eq2Var, int i2) {
        float f5 = (i2 & 1) != 0 ? 1.0f : f2;
        float f6 = (i2 & 2) != 0 ? 1.0f : f3;
        float f7 = (i2 & 4) != 0 ? 1.0f : f4;
        long j = m33.b;
        eq2 eq2Var2 = (i2 & 2048) != 0 ? sp0.h : eq2Var;
        boolean z = (i2 & 4096) == 0;
        long j2 = tq0.a;
        return M(uh1Var, f5, f6, f7, 0.0f, j, eq2Var2, z, j2, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 O(uh1 uh1Var, float f2) {
        return uh1Var.c(new kr2(0.0f, f2, 0.0f, f2, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 P(uh1 uh1Var, float f2, float f3, int i2) {
        return uh1Var.c(new kr2(0.0f, (i2 & 1) != 0 ? Float.NaN : f2, 0.0f, (i2 & 2) != 0 ? Float.NaN : f3, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean Q(j20 j20Var) {
        k21 k21Var = (k21) j20Var.g().o(sn.K);
        if (k21Var != null) {
            return k21Var.b();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean R(Object obj) {
        return obj == xe1.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean S(vu0 vu0Var) {
        Object x92Var;
        Object x92Var2;
        try {
            x92Var = pp0.u(vu0Var);
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thA = y92.a(x92Var);
        Object x92Var3 = a83.a;
        if (thA != null) {
            String string = "Generate DexCacheSumSign failed: ".concat(fg1.Q(thA)).toString();
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
            pp1 pp1Var = pp1.a;
            x92Var2 = "";
            String strC = pp1.b().c("Dex_Cache_Sum_Sign");
            if (strC != null) {
                x92Var2 = strC;
            }
        } catch (Throwable th3) {
            x92Var2 = new x92(th3);
        }
        Throwable thA2 = y92.a(x92Var2);
        if (thA2 == null) {
            return ((String) x92Var2).equals(str);
        }
        String string2 = "Read DexCacheSumSign failed: ".concat(fg1.Q(thA2)).toString();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean T(KeyEvent keyEvent) {
        long jZ = qp0.z(keyEvent);
        int i2 = b51.O;
        return b51.a(jZ, b51.h) || b51.a(jZ, b51.r) || b51.a(jZ, b51.E) || b51.a(jZ, b51.q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void U(bi0 bi0Var) {
        long j;
        String str = bi0Var.a;
        StringBuilder sb = new StringBuilder();
        String str2 = bi0Var.b;
        File file = new File(str, hk1.j(sb, str2, ".kva"));
        File file2 = new File(str, hk1.h(str2, ".kvb"));
        try {
            if (hg3.h(file) && hg3.h(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                bi0Var.q = randomAccessFile.getChannel();
                bi0Var.r = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = bi0Var.q;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : bi0.z);
                    bi0Var.s = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    FileChannel fileChannel2 = bi0Var.r;
                    if (length2 > 0) {
                        j = length2;
                    } else {
                        j = bi0.z;
                        fileChannel2 = fileChannel2;
                    }
                    MappedByteBuffer map2 = fileChannel2.map(mapMode, 0L, j);
                    bi0Var.t = map2;
                    map2.order(byteOrder);
                    bi0Var.h = new e9(bi0Var.s.capacity(), 3);
                    if (length == 0 && length2 == 0) {
                        bi0Var.d = 12;
                        return;
                    } else {
                        Z(bi0Var, length, length2);
                        return;
                    }
                } catch (IOException e2) {
                    Log.e("FastKV", str2, e2);
                    k0(bi0Var);
                    m0(bi0Var, file, file2);
                    return;
                }
            }
            Log.e("FastKV", str2, new Exception("open file failed"));
            k0(bi0Var);
        } catch (Exception e3) {
            Log.e("FastKV", str2, e3);
            d0(bi0Var);
            k0(bi0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean V(bi0 bi0Var) {
        String str = bi0Var.a;
        StringBuilder sb = new StringBuilder();
        String str2 = bi0Var.b;
        File file = new File(str, hk1.j(sb, str2, ".kvc"));
        File file2 = new File(str, hk1.h(str2, ".tmp"));
        boolean z = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!W(bi0Var, file)) {
                    d0(bi0Var);
                    v(bi0Var);
                    return false;
                }
                if (bi0Var.v == 0) {
                    if (!s0(bi0Var, bi0Var.h)) {
                        bi0Var.v = 1;
                        return false;
                    }
                    s11.M(bi0Var, "recover from c file");
                    try {
                        v(bi0Var);
                        return true;
                    } catch (Exception e2) {
                        e = e2;
                        z = true;
                        Log.e("FastKV", str2, e);
                        return z;
                    }
                }
            } else if (bi0Var.v != 0) {
                File file3 = new File(str, str2 + ".kva");
                File file4 = new File(str, str2 + ".kvb");
                if (file3.exists() && file4.exists()) {
                    m0(bi0Var, file3, file4);
                }
            }
            return false;
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean W(bi0 bi0Var, File file) {
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i2 = (int) length;
            int iG = G(bi0.z, i2);
            e9 e9Var = bi0Var.h;
            if (e9Var == null || ((byte[]) e9Var.k).length != iG) {
                e9Var = new e9(0, new byte[iG]);
                bi0Var.h = e9Var;
            } else {
                e9Var.i = 0;
            }
            hg3.i(file, (byte[]) e9Var.k, i2);
            int iH = e9Var.h();
            if (iH >= 0) {
                int i3 = (-1073741825) & iH;
                boolean z = (iH & 1073741824) != 0;
                long jI = e9Var.i(e9Var.i);
                e9Var.i += 8;
                bi0Var.d = i3 + 12;
                if (i3 >= 0 && i3 <= i2 - 12 && jI == e9Var.f(12, i3) && pp0.C(bi0Var, z)) {
                    bi0Var.e = jI;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static of1 X(lb2 lb2Var, int i2, int i3, int i4, int i5, int i6, pf1 pf1Var, List list, sz1[] sz1VarArr, int i7) {
        int i8;
        float f2;
        long j;
        int i9;
        int i10;
        int i11;
        List list2 = list;
        long j2 = i6;
        int[] iArr = new int[i7];
        int iMax = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int iMin = 0;
        float f3 = 0.0f;
        while (i12 < i7) {
            if1 if1Var = (if1) list2.get(i12);
            float fK = se.K(se.G(if1Var));
            if (fK > 0.0f) {
                f3 += fK;
                i13++;
                j = j2;
                i9 = i12;
            } else {
                int i15 = i4 - i14;
                sz1 sz1VarE = sz1VarArr[i12];
                j = j2;
                if (sz1VarE == null) {
                    if (i4 == Integer.MAX_VALUE) {
                        i9 = i12;
                        i10 = i13;
                        i11 = Integer.MAX_VALUE;
                    } else {
                        i9 = i12;
                        i10 = i13;
                        i11 = i15 < 0 ? 0 : i15;
                    }
                    sz1VarE = if1Var.e(lb2Var.e(0, i11, i5, false));
                } else {
                    i9 = i12;
                    i10 = i13;
                }
                sz1 sz1Var = sz1VarE;
                int i16 = lb2Var.i(sz1Var);
                int iF = lb2Var.f(sz1Var);
                iArr[i9] = i16;
                int i17 = i15 - i16;
                if (i17 < 0) {
                    i17 = 0;
                }
                iMin = Math.min(i6, i17);
                i14 += i16 + iMin;
                iMax = Math.max(iMax, iF);
                sz1VarArr[i9] = sz1Var;
                i13 = i10;
            }
            i12 = i9 + 1;
            j2 = j;
        }
        long j3 = j2;
        int i18 = i13;
        if (i18 == 0) {
            i14 -= iMin;
            i8 = 0;
        } else {
            long j4 = ((long) (i18 - 1)) * j3;
            long jRound = ((long) ((i4 != Integer.MAX_VALUE ? i4 : i2) - i14)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f4 = jRound / f3;
            for (int i19 = 0; i19 < i7; i19++) {
                jRound -= (long) Math.round(se.K(se.G((if1) list2.get(i19))) * f4);
            }
            int i20 = iMax;
            int i21 = 0;
            int i22 = 0;
            while (i21 < i7) {
                if (sz1VarArr[i21] == null) {
                    if1 if1Var2 = (if1) list2.get(i21);
                    mb2 mb2VarG = se.G(if1Var2);
                    float fK2 = se.K(mb2VarG);
                    if (fK2 <= 0.0f) {
                        iz0.b("All weights <= 0 should have placeables");
                    }
                    f2 = f4;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fK2 * f2) + iSignum);
                    sz1 sz1VarE2 = if1Var2.e(lb2Var.e((!(mb2VarG != null ? mb2VarG.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i5, true));
                    int i23 = lb2Var.i(sz1VarE2);
                    int iF2 = lb2Var.f(sz1VarE2);
                    iArr[i21] = i23;
                    i22 += i23;
                    int iMax3 = Math.max(i20, iF2);
                    sz1VarArr[i21] = sz1VarE2;
                    i20 = iMax3;
                } else {
                    f2 = f4;
                }
                i21++;
                list2 = list;
                f4 = f2;
            }
            i8 = (int) (((long) i22) + j4);
            int i24 = i4 - i14;
            if (i8 < 0) {
                i8 = 0;
            }
            if (i8 > i24) {
                i8 = i24;
            }
            iMax = i20;
        }
        int i25 = i8 + i14;
        if (i25 < 0) {
            i25 = 0;
        }
        int iMax4 = Math.max(i25, i2);
        int iMax5 = Math.max(iMax, Math.max(i3, 0));
        int[] iArr2 = new int[i7];
        lb2Var.c(iMax4, pf1Var, iArr, iArr2);
        return lb2Var.a(sz1VarArr, pf1Var, iArr2, iMax4, iMax5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static k31 Y(l41 l41Var) {
        int i2 = l41Var.v;
        if (i2 == 2) {
            l41Var.v = 1;
        }
        try {
            try {
                return gf1.I(l41Var);
            } finally {
                l41Var.L(i2);
            }
        } catch (OutOfMemoryError | StackOverflowError e2) {
            throw new pv("Failed parsing JSON source: " + l41Var + " to Json", e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void Z(bi0 bi0Var, long j, long j2) {
        long j3;
        MappedByteBuffer mappedByteBuffer = bi0Var.s;
        String str = bi0Var.b;
        int i2 = mappedByteBuffer.getInt();
        int i3 = i2 & (-1073741825);
        boolean z = (i2 & 1073741824) != 0;
        long j4 = bi0Var.s.getLong();
        int i4 = bi0Var.t.getInt();
        int i5 = (-1073741825) & i4;
        boolean z2 = (1073741824 & i4) != 0;
        long j5 = bi0Var.t.getLong();
        if (i3 < 0) {
            j3 = 12;
        } else if (i3 <= j - 12) {
            bi0Var.d = i3 + 12;
            bi0Var.s.rewind();
            j3 = 12;
            bi0Var.s.get((byte[]) bi0Var.h.k, 0, bi0Var.d);
            if (j4 == bi0Var.h.f(12, i3) && pp0.C(bi0Var, z)) {
                bi0Var.e = j4;
                if (j == j2) {
                    byte[] bArr = new byte[bi0Var.d];
                    bi0Var.t.rewind();
                    bi0Var.t.get(bArr, 0, bi0Var.d);
                    byte[] bArr2 = (byte[]) bi0Var.h.k;
                    for (int i6 = 0; i6 < bi0Var.d; i6++) {
                        if (bArr2[i6] == bArr[i6]) {
                        }
                    }
                    return;
                }
                Log.w("FastKV", str, new Exception("B file error"));
                t(bi0Var, bi0Var.s, bi0Var.t, bi0Var.d);
                return;
            }
        } else {
            j3 = 12;
        }
        if (i5 >= 0 && i5 <= j2 - j3) {
            bi0Var.f.clear();
            bi0Var.m = 0;
            bi0Var.n.clear();
            bi0Var.d = i5 + 12;
            if (((byte[]) bi0Var.h.k).length != bi0Var.t.capacity()) {
                bi0Var.h = new e9(bi0Var.t.capacity(), 3);
            }
            bi0Var.t.rewind();
            bi0Var.t.get((byte[]) bi0Var.h.k, 0, bi0Var.d);
            if (j5 == bi0Var.h.f(12, i5) && pp0.C(bi0Var, z2)) {
                Log.w("FastKV", str, new Exception("A file error"));
                t(bi0Var, bi0Var.t, bi0Var.s, bi0Var.d);
                bi0Var.e = j5;
                return;
            }
        }
        s11.I(bi0Var, "both files error");
        q(bi0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(String str, uh1 uh1Var, px pxVar, int i2) {
        boolean z;
        Object obj;
        String str2 = str;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1938877497);
        int i3 = i2 | (go0Var.f(str2) ? 4 : 2);
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) go0Var.j(r7.b);
            rk rkVar = sn.n;
            nf1 nf1VarD = dm.d(rkVar, false);
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
            lc lcVar = gx.e;
            yf3.c(go0Var, lcVar, nf1VarD);
            lc lcVar2 = gx.d;
            yf3.c(go0Var, lcVar2, yy1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            lc lcVar3 = gx.f;
            yf3.c(go0Var, lcVar3, numValueOf);
            v6 v6Var = gx.g;
            yf3.b(go0Var, v6Var);
            lc lcVar4 = gx.c;
            yf3.c(go0Var, lcVar4, uh1VarM);
            rh1 rh1Var = rh1.a;
            uh1 uh1VarG0 = g0(rh1Var, 94.0f);
            fb2 fb2Var = gb2.a;
            uh1 uh1VarZ = ci0.z(uh1VarG0, fb2Var);
            tu2 tu2Var = ur1.a;
            uh1 uh1VarC = gf1.n(uh1VarZ, ju.b(0.13f, ((lp1) go0Var.j(tu2Var)).g), sp0.h).c(new rl(1.0f, new ft2(ju.b(0.28f, ((lp1) go0Var.j(tu2Var)).g)), fb2Var));
            nf1 nf1VarD2 = dm.d(rkVar, false);
            int iHashCode2 = Long.hashCode(go0Var.T);
            yy1 yy1VarL2 = go0Var.l();
            uh1 uh1VarM2 = tl.M(go0Var, uh1VarC);
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, lcVar, nf1VarD2);
            yf3.c(go0Var, lcVar2, yy1VarL2);
            vi0.q(iHashCode2, go0Var, lcVar3, go0Var, v6Var);
            yf3.c(go0Var, lcVar4, uh1VarM2);
            uh1 uh1VarZ2 = ci0.z(g0(rh1Var, 88.0f), fb2Var);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            Object obj2 = objL;
            if (objL == ebVar) {
                w wVar = new w(2);
                go0Var.f0(wVar);
                obj2 = wVar;
            }
            in0 in0Var = (in0) obj2;
            boolean zH = go0Var.h(context) | ((i3 & 14) == 4);
            Object objL2 = go0Var.L();
            if (zH || objL2 == ebVar) {
                z = true;
                str2 = str;
                u1 u1Var = new u1(context, str2, true ? 1 : 0);
                go0Var.f0(u1Var);
                obj = u1Var;
            } else {
                z = true;
                str2 = str;
                obj = objL2;
            }
            pp0.b(in0Var, uh1VarZ2, (in0) obj, go0Var, 6, 0);
            go0Var.p(z);
            go0Var.p(z);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new z1(str2, uh1Var, i2, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MappedByteBuffer a0(FileChannel fileChannel, int i2) {
        try {
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i2);
            map.order(ByteOrder.LITTLE_ENDIAN);
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(in0 in0Var, px pxVar, int i2) {
        in0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1428963425);
        int i3 = (go0Var.h(in0Var) ? 4 : 2) | i2;
        if (go0Var.O(i3 & 1, (i3 & 3) != 2)) {
            String strP = rg3.P(R.string.about_module_avatar_url, go0Var);
            List listT0 = mg.t0(rg3.O(R.array.about_module_project_lines, go0Var));
            String[] strArrO = rg3.O(R.array.about_module_thanks_names, go0Var);
            String[] strArrO2 = rg3.O(R.array.about_module_thanks_github_usernames, go0Var);
            String[] strArrO3 = rg3.O(R.array.about_module_thanks_descriptions, go0Var);
            boolean zF = go0Var.f(strArrO) | go0Var.f(strArrO2) | go0Var.f(strArrO3);
            Object objL = go0Var.L();
            if (!zF) {
                Object obj = objL;
                if (objL == nx.a) {
                    ArrayList arrayList = new ArrayList(strArrO.length);
                    int length = strArrO.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        String str = strArrO[i4];
                        int i6 = i5 + 1;
                        String str2 = (String) mg.n0(i5, strArrO3);
                        String str3 = str2 == null ? "" : str2;
                        String str4 = (String) mg.n0(i5, strArrO2);
                        String string = str4 != null ? pv2.I0(str4).toString() : null;
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new p1(str, str3, string));
                        i4++;
                        i5 = i6;
                    }
                    go0Var.f0(arrayList);
                    obj = arrayList;
                }
                ci0.p(xe1.i0(1039310378, new v1(in0Var, strP, listT0, (List) obj, 0), go0Var), go0Var, 6);
            }
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new w1(i2, 0, in0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 b0(uh1 uh1Var, float f2, float f3, float f4, float f5, int i2) {
        return uh1Var.c(new kr2(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(List list, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(475678026);
        int i3 = 2;
        int i4 = (go0Var.f(list) ? 4 : 2) | i2;
        if (go0Var.O(i4 & 1, (i4 & 3) != 2)) {
            uh1 uh1VarD = fg1.D(e, 16.0f, 14.0f);
            av avVarA = yu.a(new xf(8.0f, new s(i3)), sn.u, go0Var, 6);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarD);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, avVarA);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            go0Var.W(-1478478065);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eu.a((String) it.next(), null, new m13(((lp1) go0Var.j(ur1.a)).f, rg3.D(13), im0.j, 0L, 0, rg3.D(19), null, null, 16646136), 0, false, 0, 0, go0Var, 0, 1018);
            }
            go0Var.p(false);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new q1(list, i2, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c0(bi0 bi0Var, MappedByteBuffer mappedByteBuffer) throws IOException {
        MappedByteBuffer mappedByteBufferA0;
        int iCapacity = mappedByteBuffer.capacity();
        int i2 = bi0.z;
        if (iCapacity != i2) {
            FileChannel fileChannel = mappedByteBuffer == bi0Var.s ? bi0Var.q : bi0Var.r;
            try {
                fileChannel.truncate(i2);
                mappedByteBufferA0 = a0(fileChannel, i2);
            } catch (IOException unused) {
                mappedByteBufferA0 = null;
            }
            if (mappedByteBufferA0 == null) {
                c80.v("Failed to truncate and remap buffer");
                return;
            }
            if (mappedByteBuffer == bi0Var.s) {
                bi0Var.s = mappedByteBufferA0;
            } else {
                bi0Var.t = mappedByteBufferA0;
            }
            mappedByteBuffer = mappedByteBufferA0;
        }
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(final c73 c73Var, boolean z, final in0 in0Var, final in0 in0Var2, px pxVar, int i2) {
        go0 go0Var;
        Object next;
        Object next2;
        String str;
        int i3;
        xk1 xk1Var;
        xk1 xk1Var2;
        b73 b73Var = c73Var.d;
        int i4 = c73Var.b;
        int i5 = c73Var.a;
        in0Var.getClass();
        in0Var2.getClass();
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(-2005030868);
        int i6 = i2 | (go0Var2.h(c73Var) ? 4 : 2) | (go0Var2.g(z) ? 32 : 16) | (go0Var2.h(in0Var) ? 256 : 128) | (go0Var2.h(in0Var2) ? 2048 : 1024);
        boolean z2 = true;
        if (go0Var2.O(i6 & 1, (i6 & 1171) != 1170)) {
            boolean zD = go0Var2.d(i5);
            Object objL = go0Var2.L();
            yf0 yf0Var = pf.m;
            t00 t00Var = null;
            eb ebVar = nx.a;
            if (zD || objL == ebVar) {
                pf.j.getClass();
                Iterator it = yf0Var.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((pf) next).h == i5) {
                            break;
                        }
                    }
                }
                objL = (pf) next;
                if (objL == null) {
                    objL = pf.k;
                }
                go0Var2.f0(objL);
            }
            final pf pfVar = (pf) objL;
            boolean zD2 = go0Var2.d(i4);
            Object objL2 = go0Var2.L();
            yf0 yf0Var2 = x51.m;
            if (zD2 || objL2 == ebVar) {
                x51.j.getClass();
                Iterator it2 = yf0Var2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it2.next();
                        if (((x51) next2).h == i4) {
                            break;
                        }
                    }
                }
                objL2 = (x51) next2;
                if (objL2 == null) {
                    objL2 = x51.k;
                }
                go0Var2.f0(objL2);
            }
            final x51 x51Var = (x51) objL2;
            go0Var2.W(1605667535);
            int iU = xe1.U(eu.B(yf0Var, 10));
            if (iU < 16) {
                iU = 16;
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
            int i7 = 0;
            t2 t2Var = new t2(i7, yf0Var);
            while (t2Var.hasNext()) {
                Object next3 = t2Var.next();
                linkedHashMap.put(next3, rg3.P(((pf) next3).i, go0Var2));
            }
            go0Var2.p(false);
            go0Var2.W(1605671311);
            int iU2 = xe1.U(eu.B(yf0Var2, 10));
            if (iU2 < 16) {
                iU2 = 16;
            }
            final LinkedHashMap linkedHashMap2 = new LinkedHashMap(iU2);
            t2 t2Var2 = new t2(i7, yf0Var2);
            while (t2Var2.hasNext()) {
                Object next4 = t2Var2.next();
                linkedHashMap2.put(next4, rg3.P(((x51) next4).i, go0Var2));
            }
            go0Var2.p(false);
            boolean z3 = (i6 & 112) == 32;
            Object objL3 = go0Var2.L();
            if (z3 || objL3 == ebVar) {
                objL3 = z ? p40.q(po1.a) : p40.M(po1.a);
                go0Var2.f0(objL3);
            }
            lp1 lp1Var = (lp1) objL3;
            boolean zF = go0Var2.f(b73Var) | go0Var2.f(lp1Var);
            Object objL4 = go0Var2.L();
            if (zF || objL4 == ebVar) {
                objL4 = p7.H(b73Var, lp1Var);
                go0Var2.f0(objL4);
            }
            b73 b73Var2 = (b73) objL4;
            boolean zF2 = go0Var2.f(lp1Var);
            Object objL5 = go0Var2.L();
            if (zF2 || objL5 == ebVar) {
                objL5 = p7.O(lp1Var.g);
                go0Var2.f0(objL5);
            }
            String str2 = (String) objL5;
            boolean zF3 = go0Var2.f(b73Var2) | go0Var2.f(str2);
            Object objL6 = go0Var2.L();
            if (zF3 || objL6 == ebVar) {
                String str3 = b73Var2.a;
                objL6 = str3 == null ? str2 : str3;
                go0Var2.f0(objL6);
            }
            final String str4 = (String) objL6;
            boolean zF4 = go0Var2.f(str4);
            Object objL7 = go0Var2.L();
            if (zF4 || objL7 == ebVar) {
                objL7 = p7.N(str4);
                go0Var2.f0(objL7);
            }
            final ju juVar = (ju) objL7;
            Object[] objArr = new Object[0];
            Object objL8 = go0Var2.L();
            if (objL8 == ebVar) {
                str = str2;
                objL8 = new c0(5);
                go0Var2.f0(objL8);
            } else {
                str = str2;
            }
            xk1 xk1Var3 = (xk1) gf1.M(objArr, (xm0) objL8, go0Var2, 48);
            Object[] objArr2 = new Object[0];
            boolean zF5 = go0Var2.f(str4);
            Object objL9 = go0Var2.L();
            if (zF5 || objL9 == ebVar) {
                i3 = 0;
                objL9 = new kf(str4, i3);
                go0Var2.f0(objL9);
            } else {
                i3 = 0;
            }
            xk1 xk1Var4 = (xk1) gf1.M(objArr2, (xm0) objL9, go0Var2, i3);
            Boolean bool = (Boolean) xk1Var3.getValue();
            bool.getClass();
            boolean zF6 = go0Var2.f(xk1Var3) | go0Var2.f(xk1Var4) | go0Var2.f(str4);
            Object objL10 = go0Var2.L();
            if (zF6 || objL10 == ebVar) {
                xk1Var = xk1Var4;
                xk1Var2 = xk1Var3;
                objL10 = new u0(str4, xk1Var2, xk1Var, t00Var, 1);
                go0Var2.f0(objL10);
            } else {
                xk1Var = xk1Var4;
                xk1Var2 = xk1Var3;
            }
            eu.g(bool, str4, (mn0) objL10, go0Var2);
            boolean zF7 = go0Var2.f((String) xk1Var.getValue());
            Object objL11 = go0Var2.L();
            if (zF7 || objL11 == ebVar) {
                objL11 = p7.G((String) xk1Var.getValue());
                go0Var2.f0(objL11);
            }
            String str5 = (String) objL11;
            boolean z4 = (str5 == null || str5.equals(str4)) ? false : true;
            String str6 = str;
            final xk1 xk1Var5 = xk1Var2;
            ci0.p(xe1.i0(1462002177, new mn0() { // from class: lf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    px pxVar2 = (px) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    go0 go0Var3 = (go0) pxVar2;
                    if (go0Var3.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        yi0 yi0Var = te.g;
                        av avVarA = yu.a(tp0.c, sn.u, go0Var3, 0);
                        int iHashCode = Long.hashCode(go0Var3.T);
                        yy1 yy1VarL = go0Var3.l();
                        uh1 uh1VarM = tl.M(go0Var3, yi0Var);
                        hx.c.getClass();
                        jy jyVar = gx.b;
                        go0Var3.Z();
                        if (go0Var3.S) {
                            go0Var3.k(jyVar);
                        } else {
                            go0Var3.i0();
                        }
                        yf3.c(go0Var3, gx.e, avVarA);
                        yf3.c(go0Var3, gx.d, yy1VarL);
                        yf3.c(go0Var3, gx.f, Integer.valueOf(iHashCode));
                        yf3.b(go0Var3, gx.g);
                        yf3.c(go0Var3, gx.c, uh1VarM);
                        tp0.c(rg3.P(R.string.home_settings_appearance, go0Var3), null, null, in0Var2, go0Var3, 0, 30);
                        uh1 uh1VarC = te.e.c(new g71(1.0f, true));
                        jw1 jw1VarH = fg1.h();
                        xf xfVar = new xf(12.0f, new s(2));
                        pf pfVar2 = pfVar;
                        boolean zD3 = go0Var3.d(pfVar2.ordinal());
                        in0 in0Var3 = in0Var;
                        boolean zF8 = zD3 | go0Var3.f(in0Var3);
                        c73 c73Var2 = c73Var;
                        boolean zH = zF8 | go0Var3.h(c73Var2);
                        LinkedHashMap linkedHashMap3 = linkedHashMap;
                        boolean zH2 = zH | go0Var3.h(linkedHashMap3);
                        x51 x51Var2 = x51Var;
                        boolean zD4 = zH2 | go0Var3.d(x51Var2.ordinal());
                        LinkedHashMap linkedHashMap4 = linkedHashMap2;
                        boolean zH3 = zD4 | go0Var3.h(linkedHashMap4);
                        xk1 xk1Var6 = xk1Var5;
                        boolean zF9 = zH3 | go0Var3.f(xk1Var6);
                        ju juVar2 = juVar;
                        boolean zF10 = zF9 | go0Var3.f(juVar2);
                        String str7 = str4;
                        boolean zF11 = zF10 | go0Var3.f(str7);
                        Object objL12 = go0Var3.L();
                        if (zF11 || objL12 == nx.a) {
                            objL12 = new of(pfVar2, in0Var3, c73Var2, linkedHashMap3, x51Var2, linkedHashMap4, xk1Var6, str7, juVar2);
                            go0Var3.f0(objL12);
                        }
                        rg3.d(24960, 490, null, xfVar, null, go0Var3, null, (in0) objL12, null, uh1VarC, jw1VarH, false);
                        go0Var3.p(true);
                    } else {
                        go0Var3.R();
                    }
                    return a83.a;
                }
            }, go0Var2), go0Var2, 6);
            boolean zBooleanValue = ((Boolean) xk1Var5.getValue()).booleanValue();
            String str7 = (String) xk1Var.getValue();
            List list = b73Var2.b;
            xk1 xk1Var6 = xk1Var;
            boolean zF8 = go0Var2.f(xk1Var6);
            Object objL12 = go0Var2.L();
            if (zF8 || objL12 == ebVar) {
                objL12 = new h0(xk1Var6, 13);
                go0Var2.f0(objL12);
            }
            in0 in0Var3 = (in0) objL12;
            boolean zF9 = go0Var2.f(xk1Var5);
            Object objL13 = go0Var2.L();
            if (zF9 || objL13 == ebVar) {
                objL13 = new f0(xk1Var5, 9);
                go0Var2.f0(objL13);
            }
            xm0 xm0Var = (xm0) objL13;
            boolean zF10 = go0Var2.f(str5) | go0Var2.h(b73Var2) | go0Var2.f(str6) | ((i6 & 896) == 256);
            if ((i6 & 14) != 4 && !go0Var2.h(c73Var)) {
                z2 = false;
            }
            boolean zF11 = zF10 | z2 | go0Var2.f(xk1Var5);
            Object objL14 = go0Var2.L();
            if (zF11 || objL14 == ebVar) {
                mf mfVar = new mf(str5, b73Var2, str6, in0Var, c73Var, xk1Var5);
                go0Var2.f0(mfVar);
                objL14 = mfVar;
            }
            go0Var = go0Var2;
            gf1.e(zBooleanValue, str7, str6, str5, list, z4, in0Var3, xm0Var, (xm0) objL14, go0Var, 0);
        } else {
            go0Var = go0Var2;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new nf(c73Var, z, in0Var, in0Var2, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d0(bi0 bi0Var) {
        bi0Var.d = 12;
        bi0Var.e = 0L;
        bi0Var.f.clear();
        bi0Var.m = 0;
        bi0Var.n.clear();
        e9 e9Var = bi0Var.h;
        if (e9Var == null || ((byte[]) e9Var.k).length != bi0.z) {
            bi0Var.h = new e9(bi0.z, 3);
        } else {
            e9Var.r(0L, 4);
        }
        bi0Var.h.q(0, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final s00 e(a20 a20Var) {
        if (a20Var.o(sn.K) == null) {
            a20Var = a20Var.k(new m21(null));
        }
        return new s00(a20Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e0(vj[] vjVarArr, pb1 pb1Var, vu0 vu0Var) throws InterruptedException {
        Object x92Var;
        String strJ0 = j0(R.string.nuke_core_dex_analysis_check_native_runtime, new Object[0]);
        Float fValueOf = Float.valueOf(0.02f);
        sz0 sz0Var = a;
        sz0Var.N(strJ0, fValueOf);
        a72 a72Var = new a72();
        a72Var.h = -1;
        b72 b72Var = new b72();
        b72Var.h = -1L;
        ThreadLocal threadLocal = am1.a;
        af afVar = new af(5, a72Var, b72Var);
        ThreadLocal threadLocal2 = am1.a;
        if (t11.l(Looper.myLooper(), Looper.getMainLooper())) {
            s.l("Native runtime preparation attempted on main thread");
            return;
        }
        ReentrantLock reentrantLock = am1.c;
        reentrantLock.lock();
        try {
            Boolean bool = (Boolean) threadLocal2.get();
            threadLocal2.set(Boolean.TRUE);
            try {
                am1.c();
                am1.d(false, afVar);
                threadLocal2.set(bool);
                reentrantLock.unlock();
                sz0Var.N(j0(R.string.nuke_core_dex_analysis_verify_native_runtime, new Object[0]), Float.valueOf(0.32f));
                AtomicBoolean atomicBoolean = aq1.a;
                pp1 pp1Var = pp1.a;
                aq1.a(pp1.c(), pp1.b(), vjVarArr);
                sz0Var.N(j0(R.string.nuke_core_dex_analysis_init_environment, 0, Integer.valueOf(pb1Var.a())), Float.valueOf(0.38f));
                b80.a(DexKitBridge.class, "libdexkit.so", true);
                ClassLoader classLoader = up0.j;
                if (classLoader == null) {
                    t11.S("hostClassLoader");
                    throw null;
                }
                try {
                    if (!Class.forName("dalvik.system.BaseDexClassLoader").isInstance(classLoader)) {
                        s.l("classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)");
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
                        String str = ((q70) vs0Var.next()).b.a;
                        Object a72Var2 = linkedHashMap.get(str);
                        if (a72Var2 == null && !linkedHashMap.containsKey(str)) {
                            a72Var2 = new a72();
                        }
                        a72 a72Var3 = (a72) a72Var2;
                        a72Var3.h++;
                        linkedHashMap.put(str, a72Var3);
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        entry.getClass();
                        if ((entry instanceof q41) && !(entry instanceof r41)) {
                            xe1.l0("kotlin.collections.MutableMap.MutableEntry", entry);
                            throw null;
                        }
                        entry.setValue(Integer.valueOf(((a72) entry.getValue()).h));
                    }
                    Map mapE = xe1.e(linkedHashMap);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : mapE.entrySet()) {
                        if (((Number) entry2.getValue()).intValue() > 1) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    Set setKeySet = linkedHashMap2.keySet();
                    if (!setKeySet.isEmpty()) {
                        s.c("Duplicate Dex descriptor ids: ".concat(du.u0(setKeySet, null, null, null, null, 63)));
                        return;
                    }
                    ListIterator listIterator2 = pb1Var.listIterator(0);
                    int i2 = 0;
                    while (true) {
                        vs0 vs0Var2 = (vs0) listIterator2;
                        if (!vs0Var2.hasNext()) {
                            String strU = pp0.u(vu0Var);
                            pp1 pp1Var2 = pp1.a;
                            op1 op1VarB = pp1.b();
                            op1VarB.getClass();
                            op1VarB.e("Dex_Cache_Sum_Sign", strU);
                            sz0Var.N(j0(R.string.nuke_core_dex_analysis_complete_restart, new Object[0]), Float.valueOf(1.0f));
                            Thread.sleep(2500L);
                            if (pp1.d() == vu0.i) {
                                fd3.b();
                                return;
                            } else {
                                Process.killProcess(Process.myPid());
                                return;
                            }
                        }
                        Object next = vs0Var2.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            eu.a0();
                            throw null;
                        }
                        q70 q70Var = (q70) next;
                        float f2 = i3;
                        int iA = pb1Var.a();
                        if (iA < 1) {
                            iA = 1;
                        }
                        sz0Var.N(j0(R.string.nuke_core_dex_analysis_analyzing, Integer.valueOf(i3), Integer.valueOf(pb1Var.a())), Float.valueOf(((f2 / iA) * 0.5f) + 0.4f));
                        try {
                            q70Var.b.a(dexKitBridge);
                            x92Var = a83.a;
                        } catch (Throwable th) {
                            x92Var = new x92(th);
                        }
                        Throwable thA = y92.a(x92Var);
                        if (thA != null) {
                            pp1 pp1Var3 = pp1.a;
                            vj vjVar = q70Var.a;
                            v70 v70Var = q70Var.b;
                            pp1.h(vjVar, "dex_find", thA, vi0.j("Dex descriptor ", v70Var.a, " analysis failed"));
                            hg3.d(q70Var.a.d(), "Dex descriptor " + v70Var.a + " analysis failed: " + fg1.Q(thA));
                        }
                        i2 = i3;
                    }
                } catch (ClassNotFoundException unused) {
                    s.l("This method requires Android runtime");
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(xm0 xm0Var, n80 n80Var, kw kwVar, px pxVar, int i2) {
        int i3;
        int i4;
        Object obj;
        go0 go0Var = (go0) pxVar;
        go0Var.X(826668973);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.h(xm0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.f(n80Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.h(kwVar) ? 256 : 128;
        }
        int i5 = i3;
        if (go0Var.O(i5 & 1, (i5 & 147) != 146)) {
            View view = (View) go0Var.j(r7.f);
            e70 e70Var = (e70) go0Var.j(ly.h);
            d61 d61Var = (d61) go0Var.j(ly.n);
            eo0 eo0VarL = rg3.L(go0Var);
            xk1 xk1VarX = op0.x(kwVar, go0Var);
            Object[] objArr = new Object[0];
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            Object obj2 = objL;
            if (objL == ebVar) {
                q7 q7Var = q7.o;
                go0Var.f0(q7Var);
                obj2 = q7Var;
            }
            UUID uuid = (UUID) gf1.M(objArr, (xm0) obj2, go0Var, 48);
            boolean zD = go0Var.d(n80Var.g) | go0Var.f(view) | go0Var.f(e70Var) | go0Var.f(null);
            Object objL2 = go0Var.L();
            if (zD || objL2 == ebVar) {
                p80 p80Var = new p80(xm0Var, n80Var, view, d61Var, e70Var, uuid);
                kw kwVar2 = new kw(-1338939603, true, new n2(i, xk1VarX));
                m80 m80Var = p80Var.o;
                m80Var.setParentCompositionContext(eo0VarL);
                m80Var.r.setValue(kwVar2);
                m80Var.v = true;
                m80Var.e();
                go0Var.f0(p80Var);
                objL2 = p80Var;
            }
            p80 p80Var2 = (p80) objL2;
            boolean zH = go0Var.h(p80Var2);
            Object objL3 = go0Var.L();
            if (zH || objL3 == ebVar) {
                i4 = 0;
                g8 g8Var = new g8(p80Var2, i4);
                go0Var.f0(g8Var);
                obj = g8Var;
            } else {
                i4 = 0;
                obj = objL3;
            }
            eu.c(p80Var2, (in0) obj, go0Var);
            int i6 = (go0Var.h(p80Var2) ? 1 : 0) | ((i5 & 14) == 4 ? 1 : i4) | ((i5 & 112) != 32 ? i4 : 1) | (go0Var.d(d61Var.ordinal()) ? 1 : 0);
            Object objL4 = go0Var.L();
            Object obj3 = objL4;
            if (i6 != 0 || objL4 == ebVar) {
                h8 h8Var = new h8(p80Var2, xm0Var, n80Var, d61Var);
                go0Var.f0(h8Var);
                obj3 = h8Var;
            }
            eu.r((xm0) obj3, go0Var);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new i8(xm0Var, n80Var, kwVar, i2, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long f0(long j, int i2) {
        int i3 = (i2 & 7) << 3;
        return (j >>> (64 - i3)) | (j << i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: go0 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final boolean z, final in0 in0Var, uh1 uh1Var, boolean z2, px pxVar, final int i2) {
        int i3;
        final uh1 uh1Var2;
        final boolean z3;
        int i4;
        uh1 uh1Var3;
        boolean z4;
        float f2;
        float f3;
        long jB;
        boolean zG;
        Object objL;
        ?? r15;
        long j;
        in0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1280487758);
        if ((i2 & 6) == 0) {
            i3 = i2 | (go0Var.g(z) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(in0Var) ? 32 : 16;
        }
        int i5 = i3 | 28032;
        if ((i2 & 196608) == 0) {
            i5 = 93568 | i3;
        }
        if (go0Var.O(i5 & 1, (74899 & i5) != 74898)) {
            go0Var.T();
            int i6 = i2 & 1;
            rh1 rh1Var = rh1.a;
            if (i6 == 0 || go0Var.y()) {
                i4 = i5 & (-458753);
                uh1Var3 = rh1Var;
                z4 = true;
            } else {
                go0Var.R();
                int i7 = i5 & (-458753);
                z4 = z2;
                i4 = i7;
                uh1Var3 = uh1Var;
            }
            go0Var.q();
            final bs0 bs0Var = (bs0) go0Var.j(ly.l);
            go0Var.W(2106890116);
            final boolean zBooleanValue = ((Boolean) go0Var.j(ur1.b)).booleanValue();
            go0Var.p(false);
            Object objL2 = go0Var.L();
            Object obj = nx.a;
            if (objL2 == obj) {
                objL2 = new bk1();
                go0Var.f0(objL2);
            }
            bk1 bk1Var = (bk1) objL2;
            xk1 xk1VarT = rg3.t(bk1Var, go0Var);
            int i8 = i4;
            gu2 gu2VarB = uc.b(z ? 1.0f : 0.0f, z ? up0.G(0.5f, 1500.0f, null, 4) : up0.G(1.0f, 10000.0f, null, 4), "NukeCheckboxGeometryAnim", go0Var, 3072);
            if (((Boolean) xk1VarT.getValue()).booleanValue() && z4) {
                f3 = 0.9f;
            } else if (z) {
                f3 = 1.04f;
            } else {
                f2 = 1500.0f;
                f3 = 1.0f;
                gu2 gu2VarB2 = uc.b(f3, up0.G(0.5f, f2, null, 4), "NukeCheckboxPressScale", go0Var, 3120);
                if (z4) {
                    go0Var.W(2106927045);
                    jB = ju.b(0.05f, ((lp1) go0Var.j(ur1.a)).f);
                    go0Var.p(false);
                } else if (z) {
                    go0Var.W(2106929189);
                    jB = ju.b(0.14f, ((lp1) go0Var.j(ur1.a)).g);
                    go0Var.p(false);
                } else {
                    go0Var.W(2106931461);
                    jB = ju.b(0.1f, ((lp1) go0Var.j(ur1.a)).f);
                    go0Var.p(false);
                }
                gu2 gu2VarA = ar2.a(jB, up0.J(150, null, 6), "NukeCheckboxContainerColor", go0Var);
                kr1 kr1Var = new kr1(6.0f);
                kr1 kr1Var2 = new kr1(3.0f);
                uh1 uh1VarZ = ci0.z(pp0.E(g0(uh1Var3, 20.0f), ((Number) gu2VarB2.getValue()).floatValue()), kr1Var);
                uh1 uh1Var4 = uh1Var3;
                uh1 uh1VarN = gf1.n(uh1VarZ, ((ju) gu2VarA.getValue()).a, sp0.h);
                zG = go0Var.g(zBooleanValue) | go0Var.h(bs0Var) | go0Var.d(0) | ((i8 & 112) != 32) | ((i8 & 14) != 4);
                objL = go0Var.L();
                if (!zG || objL == obj) {
                    objL = new xm0() { // from class: uo1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.xm0
                        public final Object a() {
                            if (zBooleanValue) {
                                ((b02) bs0Var).a(0);
                            }
                            in0Var.j(Boolean.valueOf(!z));
                            return a83.a;
                        }
                    };
                    go0Var.f0(objL);
                }
                uh1 uh1VarR = r(uh1VarN, bk1Var, z4, (xm0) objL);
                nf1 nf1VarD = dm.d(sn.n, false);
                int iHashCode = Long.hashCode(go0Var.T);
                yy1 yy1VarL = go0Var.l();
                uh1 uh1VarM = tl.M(go0Var, uh1VarR);
                hx.c.getClass();
                jy jyVar = gx.b;
                go0Var.Z();
                if (go0Var.S) {
                    go0Var.i0();
                } else {
                    go0Var.k(jyVar);
                }
                yf3.c(go0Var, gx.e, nf1VarD);
                yf3.c(go0Var, gx.d, yy1VarL);
                yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                yf3.b(go0Var, gx.g);
                yf3.c(go0Var, gx.c, uh1VarM);
                uh1 uh1VarE = pp0.E(g0(rh1Var, 12.0f), ((Number) gu2VarB.getValue()).floatValue());
                if (z4) {
                    r15 = 0;
                    go0Var.W(-1580373083);
                    j = ((lp1) go0Var.j(ur1.a)).f;
                } else {
                    go0Var.W(-1580374018);
                    j = ((lp1) go0Var.j(ur1.a)).g;
                    r15 = 0;
                }
                go0Var.p(r15);
                dm.a(gf1.n(uh1VarE, j, kr1Var2), go0Var, r15);
                go0Var.p(true);
                z3 = z4;
                uh1Var2 = uh1Var4;
            }
            f2 = 1500.0f;
            gu2 gu2VarB22 = uc.b(f3, up0.G(0.5f, f2, null, 4), "NukeCheckboxPressScale", go0Var, 3120);
            if (z4) {
            }
            gu2 gu2VarA2 = ar2.a(jB, up0.J(150, null, 6), "NukeCheckboxContainerColor", go0Var);
            kr1 kr1Var3 = new kr1(6.0f);
            kr1 kr1Var22 = new kr1(3.0f);
            uh1 uh1VarZ2 = ci0.z(pp0.E(g0(uh1Var3, 20.0f), ((Number) gu2VarB22.getValue()).floatValue()), kr1Var3);
            uh1 uh1Var42 = uh1Var3;
            uh1 uh1VarN2 = gf1.n(uh1VarZ2, ((ju) gu2VarA2.getValue()).a, sp0.h);
            zG = go0Var.g(zBooleanValue) | go0Var.h(bs0Var) | go0Var.d(0) | ((i8 & 112) != 32) | ((i8 & 14) != 4);
            objL = go0Var.L();
            if (!zG) {
                objL = new xm0() { // from class: uo1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xm0
                    public final Object a() {
                        if (zBooleanValue) {
                            ((b02) bs0Var).a(0);
                        }
                        in0Var.j(Boolean.valueOf(!z));
                        return a83.a;
                    }
                };
                go0Var.f0(objL);
                uh1 uh1VarR2 = r(uh1VarN2, bk1Var, z4, (xm0) objL);
                nf1 nf1VarD2 = dm.d(sn.n, false);
                int iHashCode2 = Long.hashCode(go0Var.T);
                yy1 yy1VarL2 = go0Var.l();
                uh1 uh1VarM2 = tl.M(go0Var, uh1VarR2);
                hx.c.getClass();
                jy jyVar2 = gx.b;
                go0Var.Z();
                if (go0Var.S) {
                }
                yf3.c(go0Var, gx.e, nf1VarD2);
                yf3.c(go0Var, gx.d, yy1VarL2);
                yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode2));
                yf3.b(go0Var, gx.g);
                yf3.c(go0Var, gx.c, uh1VarM2);
                uh1 uh1VarE2 = pp0.E(g0(rh1Var, 12.0f), ((Number) gu2VarB.getValue()).floatValue());
                if (z4) {
                }
                go0Var.p(r15);
                dm.a(gf1.n(uh1VarE2, j, kr1Var22), go0Var, r15);
                go0Var.p(true);
                z3 = z4;
                uh1Var2 = uh1Var42;
            }
        } else {
            go0Var.R();
            uh1Var2 = uh1Var;
            z3 = z2;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0() { // from class: vo1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    te.g(z, in0Var, uh1Var2, z3, (px) obj2, pp0.N(i2 | 1));
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 g0(uh1 uh1Var, float f2) {
        return uh1Var.c(new kr2(f2, f2, f2, f2, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: go0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void h(List list, px pxVar, int i2) {
        go0 go0Var;
        uh1 uh1VarO;
        pk pkVar = sn.u;
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(-1952152161);
        int i3 = i2 | (go0Var2.f(list) ? 4 : 2);
        ?? r5 = 0;
        if (go0Var2.O(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) go0Var2.j(r7.b);
            Object objL = go0Var2.L();
            eb ebVar = nx.a;
            Object obj = objL;
            if (objL == ebVar) {
                nx1 nx1VarU = op0.u(null);
                go0Var2.f0(nx1VarU);
                obj = nx1VarU;
            }
            xk1 xk1Var = (xk1) obj;
            av avVarA = yu.a(tp0.c, pkVar, go0Var2, 0);
            int iHashCode = Long.hashCode(go0Var2.T);
            yy1 yy1VarL = go0Var2.l();
            yi0 yi0Var = e;
            uh1 uh1VarM = tl.M(go0Var2, yi0Var);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var2.Z();
            if (go0Var2.S) {
                go0Var2.k(jyVar);
            } else {
                go0Var2.i0();
            }
            yf3.c(go0Var2, gx.e, avVarA);
            yf3.c(go0Var2, gx.d, yy1VarL);
            yf3.c(go0Var2, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var2, gx.g);
            yf3.c(go0Var2, gx.c, uh1VarM);
            go0Var2.W(688463539);
            Iterator it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    eu.a0();
                    throw null;
                }
                p1 p1Var = (p1) next;
                boolean zS0 = pv2.s0(p1Var.c);
                rh1 rh1Var = rh1.a;
                if (zS0) {
                    go0Var2.W(-760498005);
                    go0Var2.p(r5);
                    uh1VarO = rh1Var;
                } else {
                    go0Var2.W(-760446297);
                    boolean zF = go0Var2.f(p1Var);
                    Object objL2 = go0Var2.L();
                    Object obj2 = objL2;
                    if (zF || objL2 == ebVar) {
                        r1 r1Var = new r1(r5, p1Var, xk1Var);
                        go0Var2.f0(r1Var);
                        obj2 = r1Var;
                    }
                    uh1VarO = tl.O(rh1Var, (xm0) obj2);
                    go0Var2.p(r5);
                }
                uh1 uh1VarD = fg1.D(yi0Var.c(uh1VarO), 16.0f, 13.0f);
                ob2 ob2VarA = nb2.a(tp0.a, sn.t, go0Var2, 48);
                Context context2 = context;
                xk1 xk1Var2 = xk1Var;
                int iHashCode2 = Long.hashCode(go0Var2.T);
                yy1 yy1VarL2 = go0Var2.l();
                uh1 uh1VarM2 = tl.M(go0Var2, uh1VarD);
                hx.c.getClass();
                jy jyVar2 = gx.b;
                go0Var2.Z();
                eb ebVar2 = ebVar;
                if (go0Var2.S) {
                    go0Var2.k(jyVar2);
                } else {
                    go0Var2.i0();
                }
                lc lcVar = gx.e;
                yf3.c(go0Var2, lcVar, ob2VarA);
                lc lcVar2 = gx.d;
                yf3.c(go0Var2, lcVar2, yy1VarL2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                yi0 yi0Var2 = yi0Var;
                lc lcVar3 = gx.f;
                yf3.c(go0Var2, lcVar3, numValueOf);
                v6 v6Var = gx.g;
                yf3.b(go0Var2, v6Var);
                lc lcVar4 = gx.c;
                yf3.c(go0Var2, lcVar4, uh1VarM2);
                j(p1Var, go0Var2, 0);
                rp0.O(go0Var2, q0(rh1Var, 12.0f));
                Iterator it2 = it;
                g71 g71Var = new g71(1.0f, true);
                av avVarA2 = yu.a(new xf(3.0f, new s(2)), pkVar, go0Var2, 6);
                int i6 = i4;
                int iHashCode3 = Long.hashCode(go0Var2.T);
                yy1 yy1VarL3 = go0Var2.l();
                uh1 uh1VarM3 = tl.M(go0Var2, g71Var);
                go0Var2.Z();
                pk pkVar2 = pkVar;
                if (go0Var2.S) {
                    go0Var2.k(jyVar2);
                } else {
                    go0Var2.i0();
                }
                yf3.c(go0Var2, lcVar, avVarA2);
                yf3.c(go0Var2, lcVar2, yy1VarL3);
                vi0.q(iHashCode3, go0Var2, lcVar3, go0Var2, v6Var);
                yf3.c(go0Var2, lcVar4, uh1VarM3);
                String str = p1Var.a;
                tu2 tu2Var = ur1.a;
                eu.a(str, null, new m13(((lp1) go0Var2.j(tu2Var)).e, rg3.D(14), im0.l, 0L, 0, rg3.D(18), null, null, 16646136), 2, false, 1, 0, go0Var2, 1597440, 938);
                eu.a(p1Var.b, null, new m13(((lp1) go0Var2.j(tu2Var)).f, rg3.D(12), im0.j, 0L, 0, rg3.D(17), null, null, 16646136), 2, false, 2, 0, go0Var2, 1597440, 938);
                go0Var2.p(true);
                go0Var2.p(true);
                if (i6 < list.size() - 1) {
                    go0Var2.W(-758631278);
                    ci0.f(64.0f, go0Var2, 6, 0);
                    go0Var2.p(false);
                } else {
                    go0Var2.W(-758568813);
                    go0Var2.p(false);
                }
                ebVar = ebVar2;
                r5 = 0;
                context = context2;
                xk1Var = xk1Var2;
                i4 = i5;
                yi0Var = yi0Var2;
                it = it2;
                pkVar = pkVar2;
            }
            Context context3 = context;
            xk1 xk1Var3 = xk1Var;
            boolean z = r5;
            eb ebVar3 = ebVar;
            go0Var2.p(z);
            go0Var2.p(true);
            rh0 rh0Var = (rh0) xk1Var3.getValue();
            if (rh0Var == null) {
                go0Var2.W(1589474137);
                go0Var2.p(z);
                go0Var = go0Var2;
            } else {
                go0Var2.W(1589474138);
                String strP = rg3.P(R.string.home_settings_external_link_title, go0Var2);
                String strQ = rg3.Q(R.string.home_settings_external_link_message, new Object[]{rh0Var.a}, go0Var2);
                String strP2 = rg3.P(R.string.home_settings_external_link_open, go0Var2);
                String strP3 = rg3.P(R.string.home_settings_cancel, go0Var2);
                Object objL3 = go0Var2.L();
                Object obj3 = objL3;
                if (objL3 == ebVar3) {
                    f0 f0Var = new f0(xk1Var3, 4);
                    go0Var2.f0(f0Var);
                    obj3 = f0Var;
                }
                xm0 xm0Var = (xm0) obj3;
                boolean zH = go0Var2.h(context3) | go0Var2.f(rh0Var);
                Object objL4 = go0Var2.L();
                Object obj4 = objL4;
                if (zH || objL4 == ebVar3) {
                    s1 s1Var = new s1(context3, rh0Var, xk1Var3, z ? 1 : 0);
                    go0Var2.f0(s1Var);
                    obj4 = s1Var;
                }
                qp0.c(xm0Var, strP, strQ, strP2, (xm0) obj4, null, strP3, null, go0Var2, 6, 160);
                go0 go0Var3 = go0Var2;
                go0Var3.p(z);
                go0Var = go0Var3;
            }
        } else {
            go0Var2.R();
            go0Var = go0Var2;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new q1(list, i2, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 h0(uh1 uh1Var, float f2, float f3) {
        return uh1Var.c(new kr2(f2, f3, f2, f3, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(String str, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1810407737);
        int i3 = 2;
        int i4 = (go0Var.f(str) ? 4 : 2) | i2;
        if (go0Var.O(i4 & 1, (i4 & 3) != 2)) {
            Character chN0 = pv2.n0(pv2.I0(str).toString());
            String strValueOf = chN0 != null ? String.valueOf(chN0.charValue()) : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            uh1 uh1VarZ = ci0.z(g0(rh1.a, 36.0f), gb2.a(12.0f));
            tu2 tu2Var = ur1.a;
            uh1 uh1VarN = gf1.n(uh1VarZ, ju.b(0.13f, ((lp1) go0Var.j(tu2Var)).g), sp0.h);
            nf1 nf1VarD = dm.d(sn.n, false);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarN);
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
            eu.a(strValueOf, null, new m13(((lp1) go0Var.j(tu2Var)).g, rg3.D(15), im0.m, 0L, 0, rg3.D(18), null, null, 16646136), 0, false, 0, 0, go0Var, 0, 1018);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n0(str, i2, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: cs */
    /* JADX WARN: Multi-variable type inference failed */
    public static void i0(vj[] vjVarArr, vu0 vu0Var) throws InterruptedException {
        vjVarArr.getClass();
        if (vu0Var == vu0.h) {
            Thread.sleep(2000L);
        }
        pb1 pb1VarE = eu.E();
        int length = vjVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            cs csVar = vjVarArr[i2];
            w70 w70Var = csVar instanceof w70 ? (w70) csVar : null;
            if (w70Var != null) {
                ArrayList arrayList = new ArrayList();
                w70Var.a(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    pb1VarE.add(new q70(csVar, (v70) it.next()));
                }
            }
            i2++;
        }
        pb1 pb1VarZ = eu.z(pb1VarE);
        int iA = pb1VarZ.a();
        Activity activity = up0.k;
        if (activity == null) {
            t11.S("hostAct");
            throw null;
        }
        activity.runOnUiThread(new pe(iA, 1, activity));
        Thread thread = new Thread(new lb(vjVarArr, pb1VarZ, vu0Var, 4));
        thread.setName("NukeDexAnalysis");
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(final p1 p1Var, px pxVar, final int i2) {
        b62 b62VarR;
        mn0 mn0Var;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1171733053);
        int i3 = (go0Var.f(p1Var) ? 4 : 2) | i2;
        final int i4 = 1;
        final int i5 = 0;
        if (go0Var.O(i3 & 1, (i3 & 3) != 2)) {
            String str = p1Var.c;
            boolean zF = go0Var.f(str);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (zF || objL == ebVar) {
                objL = op0.u(null);
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            boolean zF2 = go0Var.f(xk1Var) | go0Var.f(str);
            Object objL2 = go0Var.L();
            if (zF2 || objL2 == ebVar) {
                objL2 = new b2(str, xk1Var, (t00) null);
                go0Var.f0(objL2);
            }
            eu.f(go0Var, (mn0) objL2, str);
            String str2 = (String) xk1Var.getValue();
            if (str2 == null) {
                go0Var.W(1900809343);
                i(p1Var.a, go0Var, 0);
                go0Var.p(false);
                b62VarR = go0Var.r();
                if (b62VarR != null) {
                    mn0Var = new mn0(p1Var, i2, i5) { // from class: t1
                        public final /* synthetic */ int h;
                        public final /* synthetic */ p1 i;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.h = i5;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj, Object obj2) {
                            int i6 = this.h;
                            a83 a83Var = a83.a;
                            p1 p1Var2 = this.i;
                            px pxVar2 = (px) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    te.j(p1Var2, pxVar2, pp0.N(1));
                                    break;
                                default:
                                    te.j(p1Var2, pxVar2, pp0.N(1));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                    b62VarR.d = mn0Var;
                }
                return;
            }
            go0Var.W(1900876613);
            go0Var.p(false);
            Context context = (Context) go0Var.j(r7.b);
            uh1 uh1VarN = gf1.n(ci0.z(g0(rh1.a, 36.0f), gb2.a(12.0f)), ju.b(0.13f, ((lp1) go0Var.j(ur1.a)).g), sp0.h);
            nf1 nf1VarD = dm.d(sn.n, false);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarN);
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
            uh1 uh1VarA = hm.a();
            Object objL3 = go0Var.L();
            if (objL3 == ebVar) {
                objL3 = new w(i4);
                go0Var.f0(objL3);
            }
            in0 in0Var = (in0) objL3;
            boolean zH = go0Var.h(context) | go0Var.f(str2);
            Object objL4 = go0Var.L();
            if (zH || objL4 == ebVar) {
                objL4 = new u1(context, str2, i5);
                go0Var.f0(objL4);
            }
            pp0.b(in0Var, uh1VarA, (in0) objL4, go0Var, 6, 0);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62VarR = go0Var.r();
        if (b62VarR != null) {
            mn0Var = new mn0(p1Var, i2, i4) { // from class: t1
                public final /* synthetic */ int h;
                public final /* synthetic */ p1 i;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.h = i4;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    int i6 = this.h;
                    a83 a83Var = a83.a;
                    p1 p1Var2 = this.i;
                    px pxVar2 = (px) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            te.j(p1Var2, pxVar2, pp0.N(1));
                            break;
                        default:
                            te.j(p1Var2, pxVar2, pp0.N(1));
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarR.d = mn0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String j0(int i2, Object... objArr) {
        Activity activity = up0.k;
        if (activity == null) {
            t11.S("hostAct");
            throw null;
        }
        lg3.a(activity);
        if (objArr.length == 0) {
            Activity activity2 = up0.k;
            if (activity2 == null) {
                t11.S("hostAct");
                throw null;
            }
            String string = activity2.getString(i2);
            string.getClass();
            return string;
        }
        Activity activity3 = up0.k;
        if (activity3 == null) {
            t11.S("hostAct");
            throw null;
        }
        String string2 = activity3.getString(i2, Arrays.copyOf(objArr, objArr.length));
        string2.getClass();
        return string2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k(uh1 uh1Var, mn0 mn0Var, px pxVar, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1090521195);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(uh1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(mn0Var) ? 32 : 16;
        }
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Object objL = go0Var.L();
            if (objL == nx.a) {
                objL = k8.b;
                go0Var.f0(objL);
            }
            nf1 nf1Var = (nf1) objL;
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1Var);
            hx.c.getClass();
            jy jyVar = gx.b;
            int i4 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, nf1Var);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            mn0Var.g(go0Var, Integer.valueOf((i4 >> 6) & 14));
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new l8(uh1Var, mn0Var, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k0(bi0 bi0Var) {
        bi0Var.v = 1;
        hg3.a(bi0Var.q);
        hg3.a(bi0Var.r);
        bi0Var.q = null;
        bi0Var.r = null;
        bi0Var.s = null;
        bi0Var.t = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void l(oy2 oy2Var, Context context, final boolean z, final String str, final long j) {
        if (f13.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) op0.e.j(context2);
        if (list.isEmpty()) {
            return;
        }
        lk1 lk1Var = oy2Var.a;
        lk1 lk1Var2 = oy2Var.a;
        bz2 bz2Var = bz2.b;
        lk1Var.a(bz2Var);
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i2);
            lk1Var2.a(new xy2(new l32(i2), resolveInfo.loadLabel(packageManager).toString(), 0, new in0() { // from class: m32
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.in0
                public final Object j(Object obj) {
                    op0.f.k(context2, resolveInfo, Boolean.valueOf(z), str, new f13(j));
                    ((cz2) obj).close();
                    return a83.a;
                }
            }));
            i2++;
            context2 = context;
        }
        lk1Var2.a(bz2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final by0 l0(yi1 yi1Var) {
        px1 px1Var;
        String str;
        String str2 = yi1Var.h;
        String str3 = yi1Var.c;
        if (yi1Var.a != 0 || yi1Var.e != 1 || pv2.s0(str3) || pv2.s0(str2)) {
            return null;
        }
        if (wv2.W(str3, "@chatroom", false)) {
            int iQ0 = pv2.q0(str2, ":\r\n", 0, false, 6);
            if (iQ0 > 0) {
                String strSubstring = str2.substring(iQ0 + 3);
                String string = pv2.I0(str2.substring(0, iQ0)).toString();
                if (pv2.s0(string)) {
                    string = null;
                }
                px1Var = new px1(strSubstring, string);
            } else {
                int iQ02 = pv2.q0(str2, ":\n", 0, false, 6);
                if (iQ02 > 0) {
                    String strSubstring2 = str2.substring(iQ02 + 2);
                    String string2 = pv2.I0(str2.substring(0, iQ02)).toString();
                    if (pv2.s0(string2)) {
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
        String str4 = px1Var.a;
        if (pv2.s0(str4)) {
            return null;
        }
        long j = yi1Var.j;
        if (j != 0) {
            str = "server:" + j;
        } else {
            long j2 = yi1Var.f;
            if (j2 != 0) {
                str = "local:" + j2;
            } else {
                str = "fallback:" + str3 + ":" + yi1Var.i + ":" + str2.hashCode();
            }
        }
        return new by0(str3, str4, px1Var.b, str, yi1Var.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(id idVar, ed edVar, long j, final in0 in0Var, t00 t00Var) {
        sw2 sw2Var;
        final o72 o72Var;
        final id idVar2;
        id idVar3;
        o72 o72Var2;
        Object objA;
        in0 in0Var2;
        gd gdVar;
        gd gdVar2;
        Object objA2;
        final ed edVar2 = edVar;
        gd3 gd3Var = gd3.y;
        if (t00Var instanceof sw2) {
            sw2Var = (sw2) t00Var;
            int i2 = sw2Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sw2Var.p = i2 - Integer.MIN_VALUE;
            } else {
                sw2Var = new sw2(t00Var);
            }
        }
        sw2 sw2Var2 = sw2Var;
        a20 a20Var = sw2Var2.i;
        Object obj = sw2Var2.o;
        int i3 = sw2Var2.p;
        int i4 = 5;
        int i5 = 0;
        k20 k20Var = k20.h;
        if (i3 == 0) {
            fg1.T(obj);
            final Object objB = edVar2.b(0L);
            final nd ndVarF = edVar2.f(0L);
            o72Var = new o72();
            if (j == Long.MIN_VALUE) {
                try {
                    a20Var.getClass();
                    final float F = F(a20Var);
                    idVar2 = idVar;
                    try {
                        in0 in0Var3 = new in0() { // from class: pw2
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.in0
                            public final Object j(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                ed edVar3 = edVar2;
                                n43 n43VarD = edVar3.d();
                                Object objE = edVar3.e();
                                id idVar4 = idVar2;
                                gd gdVar3 = new gd(objB, n43VarD, ndVarF, jLongValue, objE, jLongValue, new qw2(idVar4, 1));
                                te.w(gdVar3, jLongValue, F, edVar3, idVar4, in0Var);
                                o72Var.i = gdVar3;
                                return a83.a;
                            }
                        };
                        o72Var2 = o72Var;
                        try {
                            sw2Var2.k = idVar2;
                            sw2Var2.l = edVar2;
                            sw2Var2.m = in0Var;
                            sw2Var2.n = o72Var2;
                            sw2Var2.p = 1;
                            if (!edVar2.a()) {
                                wo0 wo0Var = new wo0(in0Var3, i4);
                                a20Var.getClass();
                                objA = qp0.A(a20Var).a(wo0Var, sw2Var2);
                            } else {
                                if (sw2Var2.f().o(gd3Var) != null) {
                                    throw new ClassCastException();
                                }
                                objA = qp0.A(sw2Var2.f()).a(in0Var3, sw2Var2);
                            }
                            if (objA != k20Var) {
                                idVar3 = idVar2;
                                in0Var2 = in0Var;
                                o72Var = o72Var2;
                            }
                            return k20Var;
                        } catch (CancellationException e2) {
                            e = e2;
                            idVar3 = idVar2;
                            o72Var = o72Var2;
                            gdVar = (gd) o72Var.i;
                            if (gdVar != null) {
                            }
                            gdVar2 = (gd) o72Var.i;
                            if (gdVar2 != null) {
                                idVar3.m = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        idVar3 = idVar2;
                        gdVar = (gd) o72Var.i;
                        if (gdVar != null) {
                        }
                        gdVar2 = (gd) o72Var.i;
                        if (gdVar2 != null) {
                        }
                        throw e;
                    }
                } catch (CancellationException e4) {
                    e = e4;
                    idVar2 = idVar;
                }
            } else {
                o72Var2 = o72Var;
                try {
                    gd gdVar3 = new gd(objB, edVar2.d(), ndVarF, j, edVar2.e(), j, new qw2(idVar, i5));
                    a20Var.getClass();
                    w(gdVar3, j, F(a20Var), edVar2, idVar, in0Var);
                    o72Var2.i = gdVar3;
                    idVar3 = idVar;
                    edVar2 = edVar;
                    in0Var2 = in0Var;
                    o72Var = o72Var2;
                } catch (CancellationException e5) {
                    e = e5;
                    idVar3 = idVar;
                    o72Var = o72Var2;
                    gdVar = (gd) o72Var.i;
                    if (gdVar != null) {
                    }
                    gdVar2 = (gd) o72Var.i;
                    if (gdVar2 != null) {
                    }
                    throw e;
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o72Var = sw2Var2.n;
            in0Var2 = sw2Var2.m;
            edVar2 = sw2Var2.l;
            idVar3 = sw2Var2.k;
            try {
                fg1.T(obj);
            } catch (CancellationException e6) {
                e = e6;
                gdVar = (gd) o72Var.i;
                if (gdVar != null) {
                    gdVar.i.setValue(Boolean.FALSE);
                }
                gdVar2 = (gd) o72Var.i;
                if (gdVar2 != null && gdVar2.g == idVar3.k) {
                    idVar3.m = false;
                }
                throw e;
            }
        }
        do {
            a20 a20Var2 = sw2Var2.i;
            Object obj2 = o72Var.i;
            obj2.getClass();
            if (!((Boolean) ((gd) obj2).i.getValue()).booleanValue()) {
                return a83.a;
            }
            a20Var2.getClass();
            final float F2 = F(a20Var2);
            final o72 o72Var3 = o72Var;
            final in0 in0Var4 = in0Var2;
            final ed edVar3 = edVar2;
            final id idVar4 = idVar3;
            try {
                in0 in0Var5 = new in0() { // from class: rw2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.in0
                    public final Object j(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = o72Var3.i;
                        obj4.getClass();
                        te.w((gd) obj4, jLongValue, F2, edVar3, idVar4, in0Var4);
                        return a83.a;
                    }
                };
                o72Var = o72Var3;
                edVar2 = edVar3;
                idVar3 = idVar4;
                in0Var2 = in0Var4;
                sw2Var2.k = idVar3;
                sw2Var2.l = edVar2;
                sw2Var2.m = in0Var2;
                sw2Var2.n = o72Var;
                sw2Var2.p = 2;
                if (!edVar2.a()) {
                    wo0 wo0Var2 = new wo0(in0Var5, i4);
                    a20Var2.getClass();
                    objA2 = qp0.A(a20Var2).a(wo0Var2, sw2Var2);
                } else {
                    if (sw2Var2.f().o(gd3Var) != null) {
                        throw new ClassCastException();
                    }
                    objA2 = qp0.A(sw2Var2.f()).a(in0Var5, sw2Var2);
                }
            } catch (CancellationException e7) {
                e = e7;
                o72Var = o72Var3;
                idVar3 = idVar4;
                gdVar = (gd) o72Var.i;
                if (gdVar != null) {
                }
                gdVar2 = (gd) o72Var.i;
                if (gdVar2 != null) {
                }
                throw e;
            }
        } while (objA2 != k20Var);
        return k20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m0(bi0 bi0Var, File file, File file2) {
        String str = bi0Var.b;
        try {
            if (W(bi0Var, file)) {
                return;
            }
        } catch (IOException e2) {
            Log.w("FastKV", str, e2);
        }
        d0(bi0Var);
        try {
            if (W(bi0Var, file2)) {
                return;
            }
        } catch (IOException e3) {
            Log.w("FastKV", str, e3);
        }
        d0(bi0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object n(id idVar, Float f2, fj0 fj0Var, in0 in0Var, tw2 tw2Var) {
        Object objM = m(idVar, new cy2(fj0Var, idVar.h, idVar.i.getValue(), f2, idVar.j), idVar.k, in0Var, tw2Var);
        return objM == k20.h ? objM : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final h63 n0(z53 z53Var, Object obj) {
        z53Var.getClass();
        obj.getClass();
        h63 h63VarO0 = o0(obj);
        if (h63VarO0 != null) {
            return h63VarO0;
        }
        h63 h63Var = (h63) z53Var.b.get(d72.a(obj.getClass()));
        if (h63Var != null) {
            return h63Var;
        }
        throw new IllegalStateException("Cannot find the kotlin type of object " + obj + " (" + d72.a(obj.getClass()) + "), did you forget to add a type converter for it?");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void o(j20 j20Var, xh1 xh1Var) {
        k21 k21Var = (k21) j20Var.g().o(sn.K);
        if (k21Var != null) {
            k21Var.c(xh1Var);
        } else {
            c80.u("Scope cannot be cancelled because it does not have a job: ", j20Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final h63 o0(Object obj) {
        if (t11.l(obj, a83.a)) {
            return d72.c(a83.class);
        }
        if (obj instanceof Byte) {
            return d72.c(Byte.TYPE);
        }
        if (obj instanceof Short) {
            return d72.c(Short.TYPE);
        }
        if (obj instanceof Integer) {
            return d72.c(Integer.TYPE);
        }
        if (obj instanceof Long) {
            return d72.c(Long.TYPE);
        }
        if (obj instanceof Float) {
            return d72.c(Float.TYPE);
        }
        if (obj instanceof Double) {
            return d72.c(Double.TYPE);
        }
        if (obj instanceof Boolean) {
            return d72.c(Boolean.TYPE);
        }
        if (obj instanceof String) {
            return d72.c(String.class);
        }
        if (obj instanceof byte[]) {
            return d72.c(byte[].class);
        }
        if (obj instanceof UByteArray) {
            return d72.c(UByteArray.class);
        }
        boolean z = obj instanceof Object[];
        x41 x41Var = x41.a;
        if (z) {
            return d72.d(Object[].class, x41Var);
        }
        if (obj instanceof List) {
            return d72.d(List.class, x41Var);
        }
        if (obj instanceof Set) {
            return d72.d(Set.class, x41Var);
        }
        if (obj instanceof JsObject) {
            return d72.c(JsObject.class);
        }
        if (!(obj instanceof Map)) {
            if (obj instanceof Error) {
                return d72.c(Error.class);
            }
            return null;
        }
        e72 e72Var = d72.a;
        bt btVarA = d72.a(Map.class);
        List listAsList = Arrays.asList(x41Var, x41Var);
        e72Var.getClass();
        return new h63(btVarA, listAsList, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void p(long j, qv1 qv1Var) {
        if (qv1Var == qv1.h) {
            if (fz.g(j) != Integer.MAX_VALUE) {
                return;
            }
            nz0.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (fz.h(j) != Integer.MAX_VALUE) {
                return;
            }
            nz0.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void p0(gd gdVar, id idVar) {
        idVar.i.setValue(gdVar.e.getValue());
        nd ndVar = idVar.j;
        nd ndVar2 = gdVar.f;
        int iB = ndVar.b();
        for (int i2 = 0; i2 < iB; i2++) {
            ndVar.e(ndVar2.a(i2), i2);
        }
        idVar.l = gdVar.h;
        idVar.k = gdVar.g;
        idVar.m = ((Boolean) gdVar.i.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void q(bi0 bi0Var) {
        if (bi0Var.v == 0) {
            try {
                c0(bi0Var, bi0Var.s);
                c0(bi0Var, bi0Var.t);
            } catch (Exception unused) {
                k0(bi0Var);
            }
        }
        d0(bi0Var);
        hg3.b(new File(bi0Var.a + bi0Var.b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 q0(uh1 uh1Var, float f2) {
        return uh1Var.c(new kr2(f2, 0.0f, f2, 0.0f, 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 r(uh1 uh1Var, bk1 bk1Var, boolean z, xm0 xm0Var) {
        return uh1Var.c(new jt(bk1Var, false, z, null, xm0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 r0(uh1 uh1Var, float f2, float f3) {
        return uh1Var.c(new kr2(f2, 0.0f, f3, 0.0f, 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 s(uh1 uh1Var, boolean z, String str, xm0 xm0Var) {
        return uh1Var.c(new jt(null, true, z, str, xm0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean s0(bi0 bi0Var, e9 e9Var) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        FileChannel.MapMode mapMode;
        ByteOrder byteOrder;
        String str = bi0Var.b;
        String str2 = bi0Var.a;
        try {
            int length = ((byte[]) e9Var.k).length;
            File file = new File(str2, str + ".kva");
            File file2 = new File(str2, str + ".kvb");
            if (!hg3.h(file) || !hg3.h(file2)) {
                throw new Exception("open file failed");
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            long j = length;
            try {
                randomAccessFile.setLength(j);
                FileChannel channel = randomAccessFile.getChannel();
                bi0Var.q = channel;
                mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = channel.map(mapMode, 0L, j);
                bi0Var.s = map;
                byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                bi0Var.s.put((byte[]) e9Var.k, 0, bi0Var.d);
                randomAccessFile2 = new RandomAccessFile(file2, "rw");
            } catch (Exception e2) {
                e = e2;
                randomAccessFile2 = null;
            }
            try {
                randomAccessFile2.setLength(j);
                FileChannel channel2 = randomAccessFile2.getChannel();
                bi0Var.r = channel2;
                MappedByteBuffer map2 = channel2.map(mapMode, 0L, j);
                bi0Var.t = map2;
                map2.order(byteOrder);
                bi0Var.t.put((byte[]) e9Var.k, 0, bi0Var.d);
                return true;
            } catch (Exception e3) {
                e = e3;
                hg3.a(randomAccessFile);
                hg3.a(randomAccessFile2);
                bi0Var.q = null;
                bi0Var.r = null;
                bi0Var.s = null;
                bi0Var.t = null;
                Log.e("FastKV", str, e);
                return false;
            }
        } catch (Exception e4) {
            e = e4;
            randomAccessFile = null;
            randomAccessFile2 = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void t(bi0 bi0Var, MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i2) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            MappedByteBuffer mappedByteBufferA0 = a0(mappedByteBuffer2 == bi0Var.t ? bi0Var.r : bi0Var.q, mappedByteBuffer.capacity());
            if (mappedByteBufferA0 == null) {
                Log.e("FastKV", bi0Var.b, new Exception("map failed"));
                k0(bi0Var);
                return;
            } else {
                if (mappedByteBuffer2 == bi0Var.t) {
                    bi0Var.t = mappedByteBufferA0;
                } else {
                    bi0Var.s = mappedByteBufferA0;
                }
                mappedByteBuffer2 = mappedByteBufferA0;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i2);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean t0(bi0 bi0Var) {
        String str = bi0Var.b;
        String str2 = bi0Var.a;
        try {
            File file = new File(str2, str + ".tmp");
            if (!hg3.h(file)) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.setLength(bi0Var.d);
                randomAccessFile.write((byte[]) bi0Var.h.k, 0, bi0Var.d);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                File file2 = new File(str2, str + ".kvc");
                if (!(file.renameTo(file2) || ((!file2.exists() || file2.delete()) && file.renameTo(file2)))) {
                    Log.w("FastKV", str, new Exception("rename failed"));
                    return false;
                }
                ArrayList arrayList = bi0Var.k;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ci0.J().execute(new t7(2, bi0Var, (String) it.next()));
                    }
                    arrayList.clear();
                }
                return true;
            } finally {
            }
        } catch (Exception e2) {
            Log.e("FastKV", str, e2);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object u(mn0 mn0Var, t00 t00Var) {
        hd2 hd2Var = new hd2(t00Var, t00Var.f());
        return ze3.b(hd2Var, true, hd2Var, mn0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void v(bi0 bi0Var) {
        String str = bi0Var.b;
        String str2 = bi0Var.a;
        try {
            hg3.b(new File(str2, str + ".kvc"));
            hg3.b(new File(str2, str + ".tmp"));
        } catch (Exception e2) {
            Log.e("FastKV", str, e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void w(gd gdVar, long j, float f2, ed edVar, id idVar, in0 in0Var) {
        long jC = f2 == 0.0f ? edVar.c() : (long) ((j - gdVar.c) / f2);
        gdVar.g = j;
        gdVar.e.setValue(edVar.b(jC));
        gdVar.f = edVar.f(jC);
        if (edVar.g(jC)) {
            gdVar.h = gdVar.g;
            gdVar.i.setValue(Boolean.FALSE);
        }
        p0(gdVar, idVar);
        in0Var.j(gdVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int x(View view, int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object objB = pb3.b(view);
            view = objB instanceof View ? (View) objB : null;
        }
        return i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int y(int i2, t81 t81Var, Object obj) {
        int iG;
        return (obj == null || t81Var.c() == 0 || (i2 < t81Var.c() && obj.equals(t81Var.d(i2))) || (iG = t81Var.d.g(obj)) == -1) ? i2 : iG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final View z(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(x(view, R.id.view_tree_lifecycle_owner), x(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (E(view) == null) {
                i2++;
                Object objB = pb3.b(view);
                View view4 = view2;
                view2 = view;
                view = objB instanceof View ? (View) objB : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public abstract o62 D();
}
