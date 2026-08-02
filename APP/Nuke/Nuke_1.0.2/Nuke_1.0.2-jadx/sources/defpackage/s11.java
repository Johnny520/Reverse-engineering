package defpackage;

import android.content.Context;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.dokar.quickjs.QuickJs;
import com.dokar.quickjs.binding.JsObject;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import me.dartcv.nuke.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s11 {
    public static final kw b = new kw(180618618, false, new ow(14));
    public static final eb c = new eb(20);
    public static final n4 d = new n4(25, new i51(0));
    public static final dq1 e = new dq1(10, new eg1(0, 17), new eq1(21));
    public static sx0 f;
    public final /* synthetic */ int a = 26;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long A(zt0 zt0Var) {
        int iOrdinal = zt0Var.ordinal();
        if (iOrdinal == 0) {
            return sp0.c(4279673674L);
        }
        if (iOrdinal == 1) {
            return sp0.c(4292441862L);
        }
        if (iOrdinal == 2) {
            return sp0.c(4292617766L);
        }
        c80.s();
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean B(qd3 qd3Var, qd3 qd3Var2) {
        if (qd3Var == qd3Var2) {
            return true;
        }
        return Math.abs(qd3Var.a - qd3Var2.a) < 0.001f && Math.abs(qd3Var.b - qd3Var2.b) < 0.001f;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static w80 C(String str) {
        Object x92Var;
        Object x92Var2;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/sys/fs/selinux/context");
            try {
                byte[] bytes = str.getBytes(wq.a);
                bytes.getClass();
                Os.write(fileOutputStream.getFD(), bytes, 0, bytes.length);
                fileOutputStream.close();
                x92Var = new w80(true, true, "selinuxfs-context", null);
            } finally {
            }
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thA = y92.a(x92Var);
        if (thA != null) {
            try {
                if (!(thA instanceof ErrnoException) || ((ErrnoException) thA).errno != OsConstants.EINVAL) {
                    throw thA;
                }
                x92Var = new w80(false, true, "selinuxfs-context", null);
            } catch (Throwable th2) {
                x92Var = new x92(th2);
            }
        }
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        w80 w80Var = (w80) x92Var;
        if (w80Var != null) {
            return w80Var;
        }
        try {
            s(0, str, str);
            x92Var2 = new w80(true, true, "selinuxfs-access", null);
        } catch (Throwable th3) {
            x92Var2 = new x92(th3);
        }
        Throwable thA2 = y92.a(x92Var2);
        if (thA2 != null) {
            try {
                if (!(thA2 instanceof ErrnoException) || ((ErrnoException) thA2).errno != OsConstants.EINVAL) {
                    throw thA2;
                }
                x92Var2 = new w80(false, true, "selinuxfs-access", null);
            } catch (Throwable th4) {
                x92Var2 = new x92(th4);
            }
        }
        Throwable thA3 = y92.a(x92Var2);
        if (thA3 != null) {
            x92Var2 = new w80(false, false, "selinuxfs", thA3.getClass().getSimpleName());
        }
        return (w80) x92Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static id D(id idVar, float f2) {
        float f3 = ((jd) idVar.j).a;
        return new id(idVar.h, Float.valueOf(f2), new jd(f3), idVar.k, idVar.l, idVar.m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static StaticLayout E(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            lz0.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            lz0.a("invalid end value");
        }
        if (i3 < 0) {
            lz0.a("invalid maxLines value");
        }
        if (i < 0) {
            lz0.a("invalid width value");
        }
        if (i4 < 0) {
            lz0.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            builderObtain.setLineBreakConfig(d4.a().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final yy F(su suVar, su suVar2) {
        return suVar == suVar2 ? new wy(suVar, suVar, 1) : (tp0.s(suVar.b, 12884901888L) && tp0.s(suVar2.b, 12884901888L)) ? new xy((ka2) suVar, (ka2) suVar2) : new yy(suVar, suVar2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void G(QuickJs quickJs, fs1 fs1Var, long j) {
        long jM11defineBindingNW8rdx8 = quickJs.m11defineBindingNW8rdx8(fs1Var.a, new zc0(fs1Var, quickJs), j);
        Iterator it = fs1Var.d.iterator();
        while (it.hasNext()) {
            G(quickJs, (fs1) it.next(), jM11defineBindingNW8rdx8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void H(File file) {
        try {
            up0.r(g0().toPath(), file.toPath());
        } catch (Exception e2) {
            throw new SecurityException("Unable to create Native release storage", e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void I(bi0 bi0Var, String str) {
        Log.e("FastKV", bi0Var.b + " " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final c61 J(c61 c61Var) {
        c61 c61Var2;
        c61 c61VarJ = c61Var.j();
        while (true) {
            c61 c61Var3 = c61VarJ;
            c61Var2 = c61Var;
            c61Var = c61Var3;
            if (c61Var == null) {
                break;
            }
            c61VarJ = c61Var.j();
        }
        zn1 zn1Var = c61Var2 instanceof zn1 ? (zn1) c61Var2 : null;
        if (zn1Var == null) {
            return c61Var2;
        }
        zn1 zn1Var2 = zn1Var.x;
        while (true) {
            zn1 zn1Var3 = zn1Var2;
            zn1 zn1Var4 = zn1Var;
            zn1Var = zn1Var3;
            if (zn1Var == null) {
                return zn1Var4;
            }
            zn1Var2 = zn1Var.x;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sx0 K() {
        sx0 sx0Var = f;
        if (sx0Var != null) {
            return sx0Var;
        }
        rx0 rx0Var = new rx0("Filled.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = s93.a;
        ft2 ft2Var = new ft2(ju.b);
        ye0 ye0Var = new ye0(3);
        ye0Var.k(17.65f, 6.35f);
        ye0Var.d(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        ye0Var.e(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        ye0Var.m(3.57f, 8.0f, 7.99f, 8.0f);
        ye0Var.e(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        ye0Var.h(-2.08f);
        ye0Var.e(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        ye0Var.e(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        ye0Var.m(2.69f, -6.0f, 6.0f, -6.0f);
        ye0Var.e(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        ye0Var.i(13.0f, 11.0f);
        ye0Var.h(7.0f);
        py1 py1Var = new py1(4.0f);
        ArrayList arrayList = ye0Var.a;
        arrayList.add(py1Var);
        ye0Var.j(-2.35f, 2.35f);
        ye0Var.c();
        rx0.a(rx0Var, arrayList, ft2Var);
        sx0 sx0VarB = rx0Var.b();
        f = sx0VarB;
        return sx0VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String L(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b2 & 255)));
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void M(bi0 bi0Var, String str) {
        Log.i("FastKV", bi0Var.b + " " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float[] N(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean O(b03 b03Var, boolean z) {
        c61 c61VarC;
        t91 t91Var = b03Var.d;
        if (t91Var == null || (c61VarC = t91Var.c()) == null) {
            return false;
        }
        o62 o62VarD = op0.D(c61VarC);
        long jL = b03Var.l(z);
        float f2 = o62VarD.a;
        float f3 = o62VarD.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
        if (f2 > fIntBitsToFloat || fIntBitsToFloat > f3) {
            return false;
        }
        float f4 = o62VarD.b;
        float f5 = o62VarD.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
        return f4 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String P(zt0 zt0Var, px pxVar) {
        int iOrdinal = zt0Var.ordinal();
        if (iOrdinal == 0) {
            go0 go0Var = (go0) pxVar;
            go0Var.W(-1815795996);
            String strP = rg3.P(R.string.home_settings_hooker_debug_status_normal, go0Var);
            go0Var.p(false);
            return strP;
        }
        if (iOrdinal == 1) {
            go0 go0Var2 = (go0) pxVar;
            go0Var2.W(-1815792567);
            String strP2 = rg3.P(R.string.home_settings_hooker_debug_status_unavailable, go0Var2);
            go0Var2.p(false);
            return strP2;
        }
        if (iOrdinal == 2) {
            go0 go0Var3 = (go0) pxVar;
            go0Var3.W(-1815789148);
            String strP3 = rg3.P(R.string.home_settings_hooker_debug_status_locked, go0Var3);
            go0Var3.p(false);
            return strP3;
        }
        go0 go0Var4 = (go0) pxVar;
        go0Var4.W(-1815797326);
        go0Var4.p(false);
        c80.s();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float[] Q(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float[] R(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: th1 */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void S(th1 th1Var, xm0 xm0Var) {
        ps1 ps1Var = th1Var.n;
        if (ps1Var == null) {
            ps1Var = new ps1((os1) th1Var);
            th1Var.n = ps1Var;
        }
        bw1 snapshotObserver = ((b7) sp0.f0(th1Var)).getSnapshotObserver();
        snapshotObserver.a.c(ps1Var, oq0.o, xm0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 T(uh1 uh1Var, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        return uh1Var.c(new ss1(f2, f3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static FileChannel U(File file) {
        return FileChannel.open(up0.p(file.toPath(), new File(file, "nuke-native-release.lock").toPath()), StandardOpenOption.CREATE, StandardOpenOption.WRITE, LinkOption.NOFOLLOW_LINKS);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String V(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("sha256/");
        no noVar = no.k;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        int length = encoded.length;
        qp0.m(encoded.length, 0L, length);
        int i = 0;
        byte[] bArrG0 = mg.g0(encoded, 0, length);
        no noVar2 = new no(bArrG0);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrG0, 0, noVar2.a());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        new no(bArrDigest);
        byte[] bArr = d.a;
        bArr.getClass();
        byte[] bArr2 = new byte[((bArrDigest.length + 2) / 3) * 4];
        int length2 = bArrDigest.length - (bArrDigest.length % 3);
        int i2 = 0;
        while (i < length2) {
            byte b2 = bArrDigest[i];
            int i3 = i + 2;
            byte b3 = bArrDigest[i + 1];
            i += 3;
            byte b4 = bArrDigest[i3];
            bArr2[i2] = bArr[(b2 & 255) >> 2];
            bArr2[i2 + 1] = bArr[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i2 += 4;
            bArr2[i4] = bArr[b4 & 63];
        }
        int length3 = bArrDigest.length - length2;
        if (length3 == 1) {
            byte b5 = bArrDigest[i];
            bArr2[i2] = bArr[(b5 & 255) >> 2];
            bArr2[i2 + 1] = bArr[(b5 & 3) << 4];
            bArr2[i2 + 2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length3 == 2) {
            int i5 = i + 1;
            byte b6 = bArrDigest[i];
            byte b7 = bArrDigest[i5];
            bArr2[i2] = bArr[(b6 & 255) >> 2];
            bArr2[i2 + 1] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr2[i2 + 2] = bArr[(b7 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        sb.append(new String(bArr2, wq.a));
        return sb.toString();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File W(File file) throws IOException {
        FileOutputStream fileOutputStream;
        File file2 = new File(file, "bootstrap.nkr");
        if (up0.y(file.toPath(), file2.toPath())) {
            return file2;
        }
        Path pathCreateTempFile = Files.createTempFile(file.toPath(), "bootstrap.", ".tmp", new FileAttribute[0]);
        InputStream inputStreamOpen = up0.i.getAssets().open("nuke/native/bootstrap.nkr");
        try {
            fileOutputStream = new FileOutputStream(pathCreateTempFile.toFile());
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
            }
            throw th;
        }
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i == -1) {
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    inputStreamOpen.close();
                    up0.g(file.toPath(), pathCreateTempFile, file2.toPath());
                    return file2;
                }
                fileOutputStream.write(bArr, 0, i);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ql1 X() {
        File fileG0 = g0();
        H(fileG0);
        try {
            FileChannel fileChannelU = U(fileG0);
            try {
                FileLock fileLockLock = fileChannelU.lock();
                try {
                    ql1 ql1VarA0 = a0(Y(fileG0), l0(fileG0, W(fileG0), 0L));
                    if (fileLockLock != null) {
                        fileLockLock.close();
                    }
                    fileChannelU.close();
                    return ql1VarA0;
                } finally {
                }
            } catch (Throwable th) {
                if (fileChannelU != null) {
                    try {
                        fileChannelU.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new SecurityException("Unable to prepare bootstrap Native release", e3);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File Y(File file) throws IOException {
        FileOutputStream fileOutputStream;
        File file2 = new File(up0.l);
        File file3 = new File(file, "bridge");
        H(file3);
        File file4 = new File(file3, (file2.length() + "-" + file2.lastModified()).concat("-libnuke_bridge.so"));
        if (up0.y(file.toPath(), file4.toPath())) {
            try {
                cm1.k(file4);
                return file4;
            } catch (SecurityException unused) {
                Files.deleteIfExists(file4.toPath());
            }
        }
        ZipFile zipFile = new ZipFile(file2);
        try {
            ZipEntry entry = zipFile.getEntry("lib/arm64-v8a/libnuke_bridge.so");
            if (entry == null || entry.isDirectory() || entry.getSize() <= 0) {
                throw new SecurityException("Bundled Native Bridge is missing");
            }
            Path pathCreateTempFile = Files.createTempFile(file3.toPath(), file4.getName() + ".", ".tmp", new FileAttribute[0]);
            InputStream inputStream = zipFile.getInputStream(entry);
            try {
                fileOutputStream = new FileOutputStream(pathCreateTempFile.toFile());
            } finally {
            }
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        inputStream.close();
                        cm1.k(pathCreateTempFile.toFile());
                        up0.g(file.toPath(), pathCreateTempFile, file4.toPath());
                        file4.setReadable(true, true);
                        file4.setExecutable(true, true);
                        zipFile.close();
                        return file4;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[Catch: all -> 0x0089, SYNTHETIC, TRY_LEAVE, TryCatch #6 {all -> 0x0089, blocks: (B:25:0x0085, B:40:0x009e, B:39:0x009b, B:36:0x0096), top: B:62:0x000b, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[Catch: Exception -> 0x00ae, SecurityException -> 0x00b7, SYNTHETIC, TRY_LEAVE, TryCatch #9 {SecurityException -> 0x00b7, Exception -> 0x00ae, blocks: (B:3:0x0007, B:29:0x008c, B:48:0x00ad, B:47:0x00aa, B:44:0x00a5), top: B:66:0x0007, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ql1 Z() throws Throwable {
        FileChannel fileChannel;
        File fileY;
        ud0 ud0VarC0;
        File fileG0 = g0();
        H(fileG0);
        try {
            FileChannel fileChannelU = U(fileG0);
            try {
                try {
                    FileLock fileLockLock = fileChannelU.lock();
                    try {
                        fileY = Y(fileG0);
                        ud0VarC0 = c0(fileG0);
                        if (ud0VarC0 == null) {
                            ud0VarC0 = l0(fileG0, W(fileG0), 0L);
                            r0(ud0VarC0.a, (b5) ud0VarC0.b, fileG0, (File) ud0VarC0.c);
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        b5 b5Var = (b5) ud0VarC0.b;
                        h80 h80Var = (h80) b5Var.i;
                        b0(fileG0, h80Var.a);
                        File file = (File) b5Var.j;
                        File file2 = (File) ud0VarC0.c;
                        fileChannel = fileChannelU;
                        try {
                            ql1 ql1Var = new ql1(fileY, file, file2, h80Var.a, h80Var.b, h80Var.f, ud0VarC0.a, (File) ud0VarC0.d, (String) b5Var.k, file2.length(), (String) h80Var.i, h80Var.g);
                            if (fileLockLock != null) {
                                fileLockLock.close();
                            }
                            fileChannel.close();
                            return ql1Var;
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            if (fileLockLock != null) {
                                throw th3;
                            }
                            try {
                                fileLockLock.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                            Throwable th5 = th;
                            if (fileChannel != null) {
                                throw th5;
                            }
                            try {
                                fileChannel.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        fileChannel = fileChannelU;
                        Throwable th32 = th;
                        if (fileLockLock != null) {
                        }
                        Throwable th52 = th;
                        if (fileChannel != null) {
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    Throwable th522 = th;
                    if (fileChannel != null) {
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                fileChannel = fileChannelU;
                Throwable th5222 = th;
                if (fileChannel != null) {
                }
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new SecurityException("Unable to prepare Native runtime", e3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static id a(float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new id(rg3.n, Float.valueOf(0.0f), new jd(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ql1 a0(File file, ud0 ud0Var) {
        b5 b5Var = (b5) ud0Var.b;
        File file2 = (File) b5Var.j;
        File file3 = (File) ud0Var.c;
        h80 h80Var = (h80) b5Var.i;
        String str = h80Var.a;
        long j = h80Var.b;
        String str2 = h80Var.f;
        long j2 = ud0Var.a;
        File file4 = (File) ud0Var.d;
        String str3 = (String) b5Var.k;
        long length = file3.length();
        h80 h80Var2 = (h80) b5Var.i;
        return new ql1(file, file2, file3, str, j, str2, j2, file4, str3, length, (String) h80Var2.i, h80Var2.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final ch chVar, final xm0 xm0Var, final in0 in0Var, px pxVar, final int i) {
        int i2;
        b62 b62VarR;
        mn0 mn0Var;
        fh fhVar = chVar.f;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1224859872);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.f(chVar) : go0Var.h(chVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.h(xm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.h(in0Var) ? 256 : 128;
        }
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(chVar));
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (z || objL == ebVar) {
                objL = op0.u(Integer.valueOf(chVar.b));
                go0Var.f0(objL);
            }
            final xk1 xk1Var = (xk1) objL;
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(chVar));
            Object objL2 = go0Var.L();
            if (z2 || objL2 == ebVar) {
                objL2 = op0.u(String.valueOf(chVar.a));
                go0Var.f0(objL2);
            }
            final xk1 xk1Var2 = (xk1) objL2;
            boolean z3 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(chVar));
            Object objL3 = go0Var.L();
            if (z3 || objL3 == ebVar) {
                objL3 = op0.u(Boolean.valueOf(fhVar.a));
                go0Var.f0(objL3);
            }
            final xk1 xk1Var3 = (xk1) objL3;
            boolean z4 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(chVar));
            Object objL4 = go0Var.L();
            if (z4 || objL4 == ebVar) {
                objL4 = op0.u(Boolean.valueOf(chVar.c));
                go0Var.f0(objL4);
            }
            final xk1 xk1Var4 = (xk1) objL4;
            boolean z5 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(chVar));
            Object objL5 = go0Var.L();
            if (z5 || objL5 == ebVar) {
                objL5 = op0.u(chVar.d);
                go0Var.f0(objL5);
            }
            xk1 xk1Var5 = (xk1) objL5;
            boolean z6 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(chVar));
            Object objL6 = go0Var.L();
            if (z6 || objL6 == ebVar) {
                objL6 = op0.u(chVar.e);
                go0Var.f0(objL6);
            }
            xk1 xk1Var6 = (xk1) objL6;
            Object objL7 = go0Var.L();
            if (objL7 == ebVar) {
                objL7 = op0.u(Boolean.FALSE);
                go0Var.f0(objL7);
            }
            final xk1 xk1Var7 = (xk1) objL7;
            boolean z7 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(chVar));
            Object objL8 = go0Var.L();
            if (z7 || objL8 == ebVar) {
                objL8 = op0.u(fhVar.b);
                go0Var.f0(objL8);
            }
            final xk1 xk1Var8 = (xk1) objL8;
            Long lF0 = wv2.f0((String) xk1Var2.getValue());
            if (lF0 != null) {
                long jLongValue = lF0.longValue();
                boolean z8 = (0L > jLongValue ? 1 : (0L == jLongValue ? 0 : -1)) <= 0 && (jLongValue > 60001L ? 1 : (jLongValue == 60001L ? 0 : -1)) < 0;
                final String strP = rg3.P(R.string.auto_receive_redpacket_mode_click, go0Var);
                final String strP2 = rg3.P(R.string.auto_receive_redpacket_mode_network, go0Var);
                final String strP3 = rg3.P(R.string.auto_receive_redpacket_list_mode_blacklist, go0Var);
                final String strP4 = rg3.P(R.string.auto_receive_redpacket_list_mode_whitelist, go0Var);
                final Set set = ((Boolean) xk1Var4.getValue()).booleanValue() ? (Set) xk1Var5.getValue() : (Set) xk1Var6.getValue();
                if (((Boolean) xk1Var7.getValue()).booleanValue()) {
                    go0Var.W(-240086109);
                    boolean zBooleanValue = ((Boolean) xk1Var4.getValue()).booleanValue();
                    Object objL9 = go0Var.L();
                    if (objL9 == ebVar) {
                        objL9 = new f0(xk1Var7, 10);
                        go0Var.f0(objL9);
                    }
                    xm0 xm0Var2 = (xm0) objL9;
                    boolean zF = go0Var.f(xk1Var4) | go0Var.f(xk1Var5) | go0Var.f(xk1Var6);
                    Object objL10 = go0Var.L();
                    if (zF || objL10 == ebVar) {
                        objL10 = new lh(xk1Var4, xk1Var5, xk1Var6, xk1Var7, 0);
                        go0Var.f0(objL10);
                    }
                    q(zBooleanValue, set, xm0Var2, (in0) objL10, go0Var, 384);
                    go0Var.p(false);
                    b62VarR = go0Var.r();
                    if (b62VarR == null) {
                        return;
                    }
                    final int i4 = 0;
                    mn0Var = new mn0() { // from class: sh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj, Object obj2) {
                            int i5 = i4;
                            a83 a83Var = a83.a;
                            int i6 = i;
                            in0 in0Var2 = in0Var;
                            xm0 xm0Var3 = xm0Var;
                            ch chVar2 = chVar;
                            px pxVar2 = (px) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    s11.b(chVar2, xm0Var3, in0Var2, pxVar2, pp0.N(i6 | 1));
                                    break;
                                default:
                                    s11.b(chVar2, xm0Var3, in0Var2, pxVar2, pp0.N(i6 | 1));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                } else {
                    go0Var.W(-239625790);
                    go0Var.p(false);
                    final boolean z9 = z8;
                    qp0.d(true, xm0Var, null, rg3.P(R.string.auto_receive_redpacket_config_title, go0Var), null, xe1.i0(389955709, new th(xm0Var, lF0, in0Var, xk1Var, xk1Var4, xk1Var5, xk1Var6, xk1Var3, xk1Var8, z8), go0Var), xe1.i0(-763225548, new nn0() { // from class: uh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.nn0
                        public final Object e(Object obj, Object obj2, Object obj3) {
                            String str;
                            xk1 xk1Var9;
                            rh1 rh1Var;
                            px pxVar2 = (px) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((bv) obj).getClass();
                            go0 go0Var2 = (go0) pxVar2;
                            if (go0Var2.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                                rh1 rh1Var2 = rh1.a;
                                uh1 uh1VarB0 = gf1.b0(te.P(rh1Var2, 0.0f, 520.0f, 1), gf1.P(go0Var2));
                                vf vfVar = tp0.c;
                                pk pkVar = sn.u;
                                av avVarA = yu.a(vfVar, pkVar, go0Var2, 0);
                                int iHashCode = Long.hashCode(go0Var2.T);
                                yy1 yy1VarL = go0Var2.l();
                                uh1 uh1VarM = tl.M(go0Var2, uh1VarB0);
                                hx.c.getClass();
                                jy jyVar = gx.b;
                                go0Var2.Z();
                                if (go0Var2.S) {
                                    go0Var2.k(jyVar);
                                } else {
                                    go0Var2.i0();
                                }
                                lc lcVar = gx.e;
                                yf3.c(go0Var2, lcVar, avVarA);
                                lc lcVar2 = gx.d;
                                yf3.c(go0Var2, lcVar2, yy1VarL);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                lc lcVar3 = gx.f;
                                yf3.c(go0Var2, lcVar3, numValueOf);
                                v6 v6Var = gx.g;
                                yf3.b(go0Var2, v6Var);
                                lc lcVar4 = gx.c;
                                yf3.c(go0Var2, lcVar4, uh1VarM);
                                String strP5 = rg3.P(R.string.auto_receive_redpacket_receive_mode_title, go0Var2);
                                String strP6 = rg3.P(R.string.auto_receive_redpacket_receive_mode_description, go0Var2);
                                List listP = eu.P(0, 1);
                                xk1 xk1Var10 = xk1Var;
                                Integer numValueOf2 = Integer.valueOf(((Number) xk1Var10.getValue()).intValue());
                                boolean zF2 = go0Var2.f(xk1Var10);
                                Object objL11 = go0Var2.L();
                                eb ebVar2 = nx.a;
                                if (zF2 || objL11 == ebVar2) {
                                    str = strP5;
                                    objL11 = new h0(xk1Var10, 18);
                                    go0Var2.f0(objL11);
                                } else {
                                    str = strP5;
                                }
                                in0 in0Var2 = (in0) objL11;
                                String str2 = strP;
                                boolean zF3 = go0Var2.f(str2);
                                String str3 = strP2;
                                boolean zF4 = zF3 | go0Var2.f(str3);
                                Object objL12 = go0Var2.L();
                                if (zF4 || objL12 == ebVar2) {
                                    objL12 = new g0(2, str2, str3);
                                    go0Var2.f0(objL12);
                                }
                                eu.m(str, listP, numValueOf2, in0Var2, null, strP6, (in0) objL12, false, go0Var2, 48);
                                String strF = vi0.f(rh1Var2, 8.0f, go0Var2, R.string.auto_receive_redpacket_list_mode_title, go0Var2);
                                xk1 xk1Var11 = xk1Var4;
                                String strP7 = rg3.P(((Boolean) xk1Var11.getValue()).booleanValue() ? R.string.auto_receive_redpacket_list_mode_whitelist_description : R.string.auto_receive_redpacket_list_mode_blacklist_description, go0Var2);
                                List listP2 = eu.P(Boolean.FALSE, Boolean.TRUE);
                                Boolean bool = (Boolean) xk1Var11.getValue();
                                bool.getClass();
                                boolean zF5 = go0Var2.f(xk1Var11);
                                Object objL13 = go0Var2.L();
                                if (zF5 || objL13 == ebVar2) {
                                    objL13 = new h0(xk1Var11, 19);
                                    go0Var2.f0(objL13);
                                }
                                in0 in0Var3 = (in0) objL13;
                                String str4 = strP4;
                                boolean zF6 = go0Var2.f(str4);
                                String str5 = strP3;
                                boolean zF7 = zF6 | go0Var2.f(str5);
                                Object objL14 = go0Var2.L();
                                if (zF7 || objL14 == ebVar2) {
                                    xk1Var9 = xk1Var11;
                                    objL14 = new g0(1, str4, str5);
                                    go0Var2.f0(objL14);
                                } else {
                                    xk1Var9 = xk1Var11;
                                }
                                eu.m(strF, listP2, bool, in0Var3, null, strP7, (in0) objL14, false, go0Var2, 48);
                                String strP8 = rg3.P(((Boolean) xk1Var9.getValue()).booleanValue() ? R.string.auto_receive_redpacket_configure_whitelist : R.string.auto_receive_redpacket_configure_blacklist, go0Var2);
                                String strQ = rg3.Q(R.string.auto_receive_redpacket_selected_count, new Object[]{Integer.valueOf(set.size())}, go0Var2);
                                Object objL15 = go0Var2.L();
                                if (objL15 == ebVar2) {
                                    objL15 = new f0(xk1Var7, 11);
                                    go0Var2.f0(objL15);
                                }
                                qp0.h(strP8, (xm0) objL15, null, strQ, null, null, null, false, null, go0Var2, 48, 500);
                                s11.c(vi0.f(rh1Var2, 12.0f, go0Var2, R.string.auto_receive_redpacket_wait_time_label, go0Var2), go0Var2, 0);
                                xk1 xk1Var12 = xk1Var2;
                                String str6 = (String) xk1Var12.getValue();
                                boolean zF8 = go0Var2.f(xk1Var12);
                                Object objL16 = go0Var2.L();
                                if (zF8 || objL16 == ebVar2) {
                                    objL16 = new h0(xk1Var12, 14);
                                    go0Var2.f0(objL16);
                                }
                                tp0.b(str6, (in0) objL16, null, rg3.P(R.string.auto_receive_redpacket_wait_time_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var2, 0, 384, 12276);
                                if (pv2.s0((String) xk1Var12.getValue()) || z9) {
                                    rh1Var = rh1Var2;
                                    go0Var2.W(1063453348);
                                    go0Var2.p(false);
                                } else {
                                    go0Var2.W(1063012776);
                                    uh1 uh1VarG = fg1.G(rh1Var2, 0.0f, 6.0f, 0.0f, 0.0f, 13);
                                    rh1Var = rh1Var2;
                                    eu.a(rg3.P(R.string.auto_receive_redpacket_wait_time_invalid, go0Var2), uh1VarG, new m13(((lp1) go0Var2.j(ur1.a)).g, rg3.D(12), im0.k, 0L, 0, rg3.D(17), null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                                    go0Var2.p(false);
                                }
                                rp0.O(go0Var2, te.O(rh1Var, 16.0f));
                                yi0 yi0Var = te.e;
                                ob2 ob2VarA = nb2.a(new xf(12.0f, new s(2)), sn.t, go0Var2, 54);
                                int iHashCode2 = Long.hashCode(go0Var2.T);
                                yy1 yy1VarL2 = go0Var2.l();
                                uh1 uh1VarM2 = tl.M(go0Var2, yi0Var);
                                go0Var2.Z();
                                if (go0Var2.S) {
                                    go0Var2.k(jyVar);
                                } else {
                                    go0Var2.i0();
                                }
                                yf3.c(go0Var2, lcVar, ob2VarA);
                                yf3.c(go0Var2, lcVar2, yy1VarL2);
                                vi0.q(iHashCode2, go0Var2, lcVar3, go0Var2, v6Var);
                                yf3.c(go0Var2, lcVar4, uh1VarM2);
                                g71 g71Var = new g71(1.0f, true);
                                av avVarA2 = yu.a(vfVar, pkVar, go0Var2, 0);
                                int iHashCode3 = Long.hashCode(go0Var2.T);
                                yy1 yy1VarL3 = go0Var2.l();
                                uh1 uh1VarM3 = tl.M(go0Var2, g71Var);
                                go0Var2.Z();
                                if (go0Var2.S) {
                                    go0Var2.k(jyVar);
                                } else {
                                    go0Var2.i0();
                                }
                                yf3.c(go0Var2, lcVar, avVarA2);
                                yf3.c(go0Var2, lcVar2, yy1VarL3);
                                vi0.q(iHashCode3, go0Var2, lcVar3, go0Var2, v6Var);
                                yf3.c(go0Var2, lcVar4, uh1VarM3);
                                String strP9 = rg3.P(R.string.auto_receive_redpacket_auto_reply_title, go0Var2);
                                tu2 tu2Var = ur1.a;
                                eu.a(strP9, null, new m13(((lp1) go0Var2.j(tu2Var)).e, rg3.D(14), im0.l, 0L, 0, rg3.D(19), null, null, 16646136), 0, false, 0, 0, go0Var2, 0, 1018);
                                eu.a(rg3.P(R.string.auto_receive_redpacket_auto_reply_description, go0Var2), null, new m13(((lp1) go0Var2.j(tu2Var)).f, rg3.D(12), null, 0L, 0, rg3.D(17), null, null, 16646140), 0, false, 0, 0, go0Var2, 0, 1018);
                                go0Var2.p(true);
                                xk1 xk1Var13 = xk1Var3;
                                boolean zBooleanValue2 = ((Boolean) xk1Var13.getValue()).booleanValue();
                                boolean zF9 = go0Var2.f(xk1Var13);
                                Object objL17 = go0Var2.L();
                                if (zF9 || objL17 == ebVar2) {
                                    objL17 = new h0(xk1Var13, 15);
                                    go0Var2.f0(objL17);
                                }
                                sp0.i(zBooleanValue2, (in0) objL17, null, false, 0, go0Var2, 0, 60);
                                go0Var2.p(true);
                                rp0.O(go0Var2, te.O(rh1Var, 12.0f));
                                s11.c(rg3.P(R.string.auto_receive_redpacket_reply_content_label, go0Var2), go0Var2, 0);
                                xk1 xk1Var14 = xk1Var8;
                                String str7 = (String) xk1Var14.getValue();
                                boolean zF10 = go0Var2.f(xk1Var14);
                                Object objL18 = go0Var2.L();
                                if (zF10 || objL18 == ebVar2) {
                                    objL18 = new h0(xk1Var14, 16);
                                    go0Var2.f0(objL18);
                                }
                                tp0.b(str7, (in0) objL18, null, rg3.P(R.string.auto_receive_redpacket_reply_content_hint, go0Var2), null, null, false, 2, 4, ((Boolean) xk1Var13.getValue()).booleanValue(), false, null, null, null, go0Var2, 114819072, 0, 15412);
                                go0Var2.p(true);
                            } else {
                                go0Var2.R();
                            }
                            return a83.a;
                        }
                    }, go0Var), go0Var, (i2 & 112) | 1769478, 20);
                }
            }
            b62VarR.d = mn0Var;
        }
        go0Var.R();
        b62VarR = go0Var.r();
        if (b62VarR != null) {
            final int i5 = 1;
            mn0Var = new mn0() { // from class: sh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    int i52 = i5;
                    a83 a83Var = a83.a;
                    int i6 = i;
                    in0 in0Var2 = in0Var;
                    xm0 xm0Var3 = xm0Var;
                    ch chVar2 = chVar;
                    px pxVar2 = (px) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            s11.b(chVar2, xm0Var3, in0Var2, pxVar2, pp0.N(i6 | 1));
                            break;
                        default:
                            s11.b(chVar2, xm0Var3, in0Var2, pxVar2, pp0.N(i6 | 1));
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarR.d = mn0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b0(File file, final String str) {
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: pl1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                if (Files.isSymbolicLink(file2.toPath()) || !Files.isDirectory(file2.toPath(), LinkOption.NOFOLLOW_LINKS) || !file2.getName().startsWith("release-")) {
                    return false;
                }
                String name = file2.getName();
                StringBuilder sb = new StringBuilder("release-");
                sb.append(str);
                return !name.equals(sb.toString());
            }
        });
        if (fileArrListFiles != null) {
            if (fileArrListFiles.length <= 2) {
                return;
            }
            Arrays.sort(fileArrListFiles, new qa(5));
            for (int i = 2; i < fileArrListFiles.length; i++) {
                try {
                    Path path = file.toPath();
                    Path pathP = up0.p(path, fileArrListFiles[i].toPath());
                    if (pathP.equals(path.toRealPath(LinkOption.NOFOLLOW_LINKS))) {
                        throw new SecurityException("Refusing to delete Native release root");
                    }
                    Files.walkFileTree(pathP, new ol1());
                    up0.t(pathP.getParent());
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(String str, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-256448328);
        int i2 = 4;
        int i3 = (go0Var.f(str) ? 4 : 2) | i;
        if (go0Var.O(i3 & 1, (i3 & 3) != 2)) {
            eu.a(str, fg1.G(rh1.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), new m13(((lp1) go0Var.j(ur1.a)).f, rg3.D(13), im0.k, 0L, 0, rg3.D(18), null, null, 16646136), 0, false, 0, 0, go0Var, (i3 & 14) | 48, 1016);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n0(str, i, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ud0 c0(File file) {
        File file2 = new File(file, "active.json");
        if (up0.y(file.toPath(), file2.toPath())) {
            try {
                JSONObject jSONObject = new JSONObject(new String(d0(file2), StandardCharsets.UTF_8));
                Path pathP = up0.p(file.toPath(), new File(jSONObject.getString("packageFile")).toPath());
                if (up0.y(file.toPath(), pathP)) {
                    File file3 = pathP.toFile();
                    ud0 ud0VarE0 = e0(file, jSONObject, file3);
                    if (ud0VarE0 != null) {
                        return ud0VarE0;
                    }
                    b5 b5VarF = zl1.f(file3, file);
                    h80 h80Var = (h80) b5VarF.i;
                    if (jSONObject.getString("releaseId").equals(h80Var.a) && jSONObject.getLong("generation") == h80Var.b && jSONObject.getString("kid").equals(h80Var.f)) {
                        long jOptLong = jSONObject.optLong("sequence", 0L);
                        File file4 = jOptLong == 0 ? null : new File(((File) b5VarF.j).getParentFile(), "activation.json");
                        if (jOptLong <= 0 || up0.y(file.toPath(), file4.toPath())) {
                            r0(jOptLong, b5VarF, file, file3);
                            return new ud0(jOptLong, b5VarF, file3, file4);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(kw kwVar, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1691001626);
        int i2 = 1;
        if (go0Var.O(i & 1, (i & 3) != 2)) {
            uh1 uh1VarO = te.O(te.e, 220.0f);
            av avVarA = yu.a(tp0.d, sn.v, go0Var, 54);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarO);
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
            kwVar.e(bv.a, go0Var, 54);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new o0(kwVar, i, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] d0(File file) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[8192];
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                fileInputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            fileInputStream.close();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(String str, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1528454364);
        int i2 = (go0Var.f(str) ? 4 : 2) | i;
        if (go0Var.O(i2 & 1, (i2 & 3) != 2)) {
            eu.a(str, null, new m13(((lp1) go0Var.j(ur1.a)).f, rg3.D(13), null, 0L, 0, rg3.D(18), null, null, 16646140), 0, false, 0, 0, go0Var, i2 & 14, 1018);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n0(str, i, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ud0 e0(File file, JSONObject jSONObject, File file2) {
        try {
            if (jSONObject.optInt("v", 0) == 2) {
                String string = jSONObject.getString("releaseId");
                Locale locale = Locale.US;
                String lowerCase = string.toLowerCase(locale);
                long j = jSONObject.getLong("generation");
                String lowerCase2 = jSONObject.getString("kid").toLowerCase(locale);
                String lowerCase3 = jSONObject.getString("packageSha256").toLowerCase(locale);
                long j2 = jSONObject.getLong("packageLength");
                String lowerCase4 = jSONObject.getString("engineSha256").toLowerCase(locale);
                long j3 = jSONObject.getLong("engineSize");
                long jOptLong = jSONObject.optLong("sequence", 0L);
                if (lowerCase.equals(UUID.fromString(lowerCase).toString()) && j > 0 && lowerCase2.matches("[0-9a-f]{8}") && lowerCase3.matches("[0-9a-f]{64}") && lowerCase4.matches("[0-9a-f]{64}") && j2 > 0 && j2 <= 67108864 && j3 > 0 && j3 <= 67108864 && file2.length() == j2) {
                    String str = "libnuke_engine_" + j + "_" + lowerCase4.substring(0, 12) + ".so";
                    Path pathP = up0.p(file.toPath(), new File(jSONObject.getString("engineFile")).toPath());
                    File file3 = new File(file, "release-".concat(lowerCase));
                    File file4 = pathP.toFile();
                    if (file4.getName().equals(str) && file4.getParentFile().equals(file3) && up0.y(file.toPath(), pathP) && file4.length() == j3) {
                        File file5 = jOptLong == 0 ? null : new File(file3, "activation.json");
                        if (jOptLong <= 0 || up0.y(file.toPath(), file5.toPath())) {
                            return new ud0(jOptLong, new b5(new h80(lowerCase, j, 1, 1, 1, lowerCase2, "lib/arm64-v8a/".concat(str), lowerCase4, j3), file4, lowerCase3, 22), file2, file5);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(b03 b03Var, kw kwVar, px pxVar, int i) {
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(2080741862);
        if ((i & 6) == 0) {
            i2 = (go0Var.h(b03Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.h(kwVar) ? 32 : 16;
        }
        int i3 = 1;
        if (go0Var.O(i2 & 1, (i2 & 19) != 18)) {
            t11.b(b03Var, kwVar, go0Var, i2 & 126);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new fv(b03Var, kwVar, i, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String f0(String str) {
        Object x92Var;
        try {
            x92Var = pv2.I0(wi0.f0(new File(str))).toString();
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        return (String) x92Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(int i, px pxVar) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-2144271339);
        if (go0Var.O(i & 1, i != 0)) {
            eu.n(null, rg3.P(R.string.home_settings_hooker_debug_actions, go0Var), tp0.h, go0Var, 384, 1);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ye(i, 28);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static File g0() {
        File noBackupFilesDir = up0.i.getNoBackupFilesDir();
        File file = new File(noBackupFilesDir, "nuke/native/releases");
        try {
            up0.r(noBackupFilesDir.toPath(), file.toPath());
            return file;
        } catch (Exception e2) {
            throw new SecurityException("Unable to create Native release root", e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(String str, zt0 zt0Var, px pxVar, int i) {
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1552964452);
        if ((i & 6) == 0) {
            i2 = (go0Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.d(zt0Var.ordinal()) ? 32 : 16;
        }
        if (go0Var.O(i2 & 1, (i2 & 19) != 18)) {
            long jA = A(zt0Var);
            uh1 uh1VarD = fg1.D(gf1.n(ci0.z(rh1.a, gb2.a(999.0f)), ju.b(0.13f, jA), sp0.h), 9.0f, 4.0f);
            nf1 nf1VarD = dm.d(sn.n, false);
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
            yf3.c(go0Var, gx.e, nf1VarD);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            eu.a(str, null, new m13(jA, rg3.D(11), im0.l, 0L, 0, rg3.D(14), null, null, 16646136), 2, false, 1, 0, go0Var, (i2 & 14) | 1597440, 938);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new up(i, 5, str, zt0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Boolean h0(String str) {
        Object x92Var;
        Method declaredMethod;
        try {
            Class clsI0 = i0();
            Object objInvoke = (clsI0 == null || (declaredMethod = clsI0.getDeclaredMethod(str, null)) == null) ? null : declaredMethod.invoke(null, null);
            x92Var = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        return (Boolean) (x92Var instanceof x92 ? null : x92Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(List list, in0 in0Var, px pxVar, int i) {
        Object x92Var;
        Object x92Var2;
        String strD;
        String str;
        Integer numK;
        Object x92Var3;
        list.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(2041025071);
        int i2 = (go0Var.h(in0Var) ? 32 : 16) | (go0Var.f(list) ? 4 : 2) | i;
        if (go0Var.O(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) go0Var.j(r7.b);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                objL = op0.u(0);
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            Object objL2 = go0Var.L();
            if (objL2 == ebVar) {
                objL2 = op0.u(null);
                go0Var.f0(objL2);
            }
            xk1 xk1Var2 = (xk1) objL2;
            boolean zD = go0Var.d(((Number) xk1Var.getValue()).intValue());
            Object objL3 = go0Var.L();
            Object obj = objL3;
            if (zD || objL3 == ebVar) {
                pp1 pp1Var = pp1.a;
                op1 op1VarB = pp1.b();
                op1VarB.getClass();
                try {
                    x92Var = (List) op1VarB.b(se.D(new cg(yt0.Companion.serializer())), null, "hooker_debug_records");
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                if (x92Var instanceof x92) {
                    x92Var = null;
                }
                Iterable iterable = (List) x92Var;
                if (iterable == null) {
                    iterable = be0.h;
                }
                int iU = xe1.U(eu.B(iterable, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iU >= 16 ? iU : 16);
                for (Object obj2 : iterable) {
                    linkedHashMap.put(((yt0) obj2).l(), obj2);
                }
                go0Var.f0(linkedHashMap);
                obj = linkedHashMap;
            }
            Map map = (Map) obj;
            boolean zD2 = go0Var.d(((Number) xk1Var.getValue()).intValue()) | ((i2 & 14) == 4) | go0Var.f(map) | go0Var.f(context);
            Object objL4 = go0Var.L();
            Object obj3 = objL4;
            if (zD2 || objL4 == ebVar) {
                ArrayList arrayList = new ArrayList(eu.B(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    vj vjVar = (vj) it.next();
                    yt0 yt0Var = (yt0) map.get(vjVar.d());
                    ArrayList arrayList2 = vjVar.b;
                    boolean z = vjVar.c;
                    Throwable th2 = (Throwable) du.w0(arrayList2);
                    zt0 zt0Var = (yt0Var == null && th2 == null) ? !z ? zt0.i : zt0.h : zt0.j;
                    String strN = yt0Var != null ? yt0Var.n() : th2 != null ? "Throwable recorded in memory" : !z ? "isAvailable = false" : "No recorded exception";
                    boolean z2 = vjVar instanceof gw;
                    gw gwVar = z2 ? (gw) vjVar : null;
                    if (gwVar != null) {
                        try {
                            x92Var2 = context.getString(gwVar.m());
                        } catch (Throwable th3) {
                            x92Var2 = new x92(th3);
                        }
                        if (x92Var2 instanceof x92) {
                            x92Var2 = null;
                        }
                        strD = (String) x92Var2;
                        if (strD == null) {
                            strD = vjVar.d();
                        } else {
                            if (pv2.s0(strD)) {
                                strD = null;
                            }
                            if (strD == null) {
                            }
                        }
                    }
                    String str2 = strD;
                    gw gwVar2 = z2 ? (gw) vjVar : null;
                    if (gwVar2 == null || (numK = gwVar2.k()) == null) {
                        str = null;
                    } else {
                        try {
                            x92Var3 = context.getString(numK.intValue());
                        } catch (Throwable th4) {
                            x92Var3 = new x92(th4);
                        }
                        if (x92Var3 instanceof x92) {
                            x92Var3 = null;
                        }
                        String str3 = (String) x92Var3;
                        if (str3 != null && !pv2.s0(str3)) {
                            str = str3;
                        }
                    }
                    arrayList.add(new xt0(vjVar, str2, str, zt0Var, strN, yt0Var, th2));
                }
                go0Var.f0(arrayList);
                obj3 = arrayList;
            }
            ci0.p(xe1.i0(-363523452, new tt0(in0Var, (List) obj3, xk1Var2, 0), go0Var), go0Var, 6);
            xt0 xt0Var = (xt0) xk1Var2.getValue();
            if (xt0Var == null) {
                go0Var.W(328235698);
                go0Var.p(false);
            } else {
                go0Var.W(328235699);
                Object objL5 = go0Var.L();
                if (objL5 == ebVar) {
                    objL5 = new f0(xk1Var2, 26);
                    go0Var.f0(objL5);
                }
                xm0 xm0Var = (xm0) objL5;
                boolean zH = go0Var.h(xt0Var);
                Object objL6 = go0Var.L();
                if (zH || objL6 == ebVar) {
                    objL6 = new s1((Object) xt0Var, xk1Var, xk1Var2, 13);
                    go0Var.f0(objL6);
                }
                j(xt0Var, xm0Var, (xm0) objL6, go0Var, 48);
                go0Var.p(false);
            }
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new af(list, in0Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class i0() {
        Object x92Var;
        try {
            x92Var = Class.forName("android.os.SELinux");
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        return (Class) x92Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(xt0 xt0Var, xm0 xm0Var, xm0 xm0Var2, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(1284341609);
        int i2 = 4;
        int i3 = i | (go0Var.h(xt0Var) ? 4 : 2) | (go0Var.h(xm0Var2) ? 256 : 128);
        int i4 = 0;
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            qp0.d(true, xm0Var, null, rg3.P(R.string.home_settings_hooker_debug_detail_title, go0Var), null, xe1.i0(-1920206932, new tr(xm0Var, xt0Var, xm0Var2, i2), go0Var), xe1.i0(486381973, new wt0(i4, xt0Var), go0Var), go0Var, 1769526, 20);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new tt0(xt0Var, xm0Var, xm0Var2, i, 9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String j0(String str, Class[] clsArr, Object... objArr) {
        Object x92Var;
        Method declaredMethod;
        try {
            Class clsI0 = i0();
            Object objInvoke = (clsI0 == null || (declaredMethod = clsI0.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length))) == null) ? null : declaredMethod.invoke(null, Arrays.copyOf(objArr, objArr.length));
            x92Var = objInvoke instanceof String ? (String) objInvoke : null;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        String str2 = (String) x92Var;
        if (str2 != null) {
            return pv2.I0(str2).toString();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k(xt0 xt0Var, boolean z, xm0 xm0Var, px pxVar, int i) {
        String strP;
        go0 go0Var = (go0) pxVar;
        go0Var.X(596746385);
        int i2 = (go0Var.h(xt0Var) ? 4 : 2) | i | (go0Var.g(z) ? 32 : 16) | (go0Var.h(xm0Var) ? 256 : 128);
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                go0Var.W(802053638);
                strP = rg3.P(R.string.home_settings_hooker_debug_hookers, go0Var);
                go0Var.p(false);
            } else {
                go0Var.W(802132285);
                go0Var.p(false);
                strP = null;
            }
            eu.n(null, strP, xe1.i0(1621114864, new af(11, xt0Var, xm0Var), go0Var), go0Var, 384, 1);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new rh(xt0Var, z, xm0Var, i, 3);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public static ql1 k0(File file, byte[] bArr, long j) {
        if (bArr.length == 0 || bArr.length > 65536) {
            c80.x("Native activation envelope size is invalid");
            return null;
        }
        File fileG0 = g0();
        H(fileG0);
        try {
            FileChannel fileChannelU = U(fileG0);
            try {
                FileLock fileLockLock = fileChannelU.lock();
                try {
                    File fileY = Y(fileG0);
                    ud0 ud0VarL0 = l0(fileG0, file, j);
                    b5 b5Var = (b5) ud0VarL0.b;
                    h80 h80Var = (h80) b5Var.i;
                    File file2 = (File) b5Var.j;
                    File file3 = new File(file2.getParentFile(), "activation.json");
                    up0.h(g0().toPath(), file3.toPath(), bArr);
                    File file4 = (File) ud0VarL0.c;
                    ql1 ql1Var = new ql1(fileY, file2, file4, h80Var.a, h80Var.b, h80Var.f, j, file3, (String) b5Var.k, file4.length(), (String) h80Var.i, h80Var.g);
                    if (fileLockLock != null) {
                        fileLockLock.close();
                    }
                    fileChannelU.close();
                    return ql1Var;
                } finally {
                }
            } finally {
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new SecurityException("Unable to stage Native release", e3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void l(zt0 zt0Var, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(1236207254);
        int i2 = 2;
        int i3 = (go0Var.d(zt0Var.ordinal()) ? 4 : 2) | i;
        if (go0Var.O(i3 & 1, (i3 & 3) != 2)) {
            long jA = A(zt0Var);
            rh1 rh1Var = rh1.a;
            uh1 uh1VarN = gf1.n(ci0.z(te.g0(rh1Var, 34.0f), gb2.a(11.0f)), ju.b(0.14f, jA), sp0.h);
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
            int iOrdinal = zt0Var.ordinal();
            if (iOrdinal == 0) {
                go0Var.W(-1931771872);
                fx0.a(p7.u(), te.g0(rh1Var, 18.0f), jA, go0Var, 432);
                go0Var.p(false);
            } else if (iOrdinal == 1) {
                go0Var.W(-1931764025);
                eu.a("-", null, new m13(jA, rg3.D(18), im0.m, 0L, 0, rg3.D(18), null, null, 16646136), 0, false, 0, 0, go0Var, 6, 1018);
                go0Var.p(false);
            } else if (iOrdinal != 2) {
                go0Var.W(-1931772975);
                go0Var.p(false);
                c80.s();
                return;
            } else {
                go0Var.W(-1931754137);
                eu.a("!", null, new m13(jA, rg3.D(18), im0.m, 0L, 0, rg3.D(18), null, null, 16646136), 0, false, 0, 0, go0Var, 6, 1018);
                go0Var.p(false);
            }
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new bt0(zt0Var, i, i2);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x009f */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public static ud0 l0(File file, File file2, long j) throws IOException {
        ?? r1;
        b5 b5VarF = zl1.f(file2, file);
        h80 h80Var = (h80) b5VarF.i;
        File file3 = new File(((File) b5VarF.j).getParentFile(), "release.nkr");
        if (file3.equals(file2)) {
            return new ud0(j, b5VarF, file3, null);
        }
        Path path = g0().toPath();
        Path pathCreateTempFile = Files.createTempFile(file3.getParentFile().toPath(), file3.getName() + ".", ".tmp", new FileAttribute[0]);
        Path path2 = file2.toPath();
        LinkOption linkOption = LinkOption.NOFOLLOW_LINKS;
        FileChannel fileChannelOpen = FileChannel.open(path2, StandardOpenOption.READ, linkOption);
        try {
            FileChannel fileChannelOpen2 = FileChannel.open(pathCreateTempFile, StandardOpenOption.WRITE, linkOption);
            long j2 = 0;
            while (true) {
                try {
                    r1 = (j2 > fileChannelOpen.size() ? 1 : (j2 == fileChannelOpen.size() ? 0 : -1));
                } catch (Throwable th) {
                    th = th;
                    r1 = fileChannelOpen2;
                }
                try {
                    if (r1 >= 0) {
                        FileChannel fileChannel = fileChannelOpen2;
                        fileChannel.force(true);
                        fileChannel.close();
                        fileChannelOpen.close();
                        up0.g(path, pathCreateTempFile, file3.toPath());
                        b5 b5VarF2 = zl1.f(file3, file);
                        h80 h80Var2 = (h80) b5VarF2.i;
                        if (h80Var2.a.equals(h80Var.a) && h80Var2.b == h80Var.b && ((String) b5VarF2.k).equals((String) b5VarF.k)) {
                            return new ud0(j, b5VarF2, file3, null);
                        }
                        Files.deleteIfExists(file3.toPath());
                        c80.x("Native release changed while being staged");
                        return null;
                    }
                    long jTransferTo = fileChannelOpen.transferTo(j2, fileChannelOpen.size() - j2, fileChannelOpen2);
                    FileChannel fileChannel2 = fileChannelOpen2;
                    if (jTransferTo <= 0) {
                        throw new SecurityException("Unable to copy Native release package");
                    }
                    j2 += jTransferTo;
                    fileChannelOpen2 = fileChannel2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    if (r1 == 0) {
                        throw th3;
                    }
                    try {
                        r1.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(zt0 zt0Var, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-780804606);
        int i2 = (go0Var.d(zt0Var.ordinal()) ? 4 : 2) | i;
        int i3 = 1;
        if (go0Var.O(i2 & 1, (i2 & 3) != 2)) {
            h(P(zt0Var, go0Var), zt0Var, go0Var, (i2 << 3) & 112);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new bt0(zt0Var, i, i3);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public static File m0(InputStream inputStream, String str, long j, String str2, rl1 rl1Var) {
        Path path;
        Path path2;
        if (str.matches("[0-9a-fA-F-]{36}") && j > 0) {
            long j2 = 67108864;
            if (j <= 67108864 && str2.matches("[0-9a-f]{64}")) {
                File fileG0 = g0();
                File file = new File(fileG0, "downloads");
                H(file);
                File file2 = new File(file, str + "-" + str2 + ".nkr");
                try {
                    Path path3 = fileG0.toPath();
                    Path pathCreateTempFile = Files.createTempFile(file.toPath(), file2.getName() + ".", ".tmp", new FileAttribute[0]);
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(pathCreateTempFile.toFile());
                            try {
                                byte[] bArr = new byte[16384];
                                long j3 = 0;
                                rl1 rl1Var2 = rl1Var;
                                while (true) {
                                    int i = inputStream.read(bArr);
                                    if (i == -1) {
                                        fileOutputStream.getFD().sync();
                                        fileOutputStream.close();
                                        inputStream.close();
                                        String strL = L(messageDigest.digest());
                                        if (j3 != j || !strL.equals(str2)) {
                                            throw new SecurityException("Native release download digest mismatch");
                                        }
                                        up0.g(path3, pathCreateTempFile, file2.toPath());
                                        return file2;
                                    }
                                    long j4 = j2;
                                    j3 += (long) i;
                                    if (j3 > j || j3 > j4) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i);
                                    messageDigest.update(bArr, 0, i);
                                    if (rl1Var2 != null) {
                                        try {
                                            rl1Var2.a.g(Long.valueOf(j3), Long.valueOf(j));
                                        } catch (Throwable unused) {
                                            rl1Var2 = null;
                                        }
                                    }
                                    j2 = j4;
                                }
                                throw new SecurityException("Native release download exceeds declared size");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (SecurityException e2) {
                        e = e2;
                        path2 = pathCreateTempFile;
                        if (path2 != null) {
                            try {
                                Files.deleteIfExists(path2);
                            } catch (Exception unused2) {
                            }
                        }
                        throw e;
                    } catch (Exception e3) {
                        e = e3;
                        path = pathCreateTempFile;
                        if (path != null) {
                            try {
                                Files.deleteIfExists(path);
                            } catch (Exception unused3) {
                            }
                        }
                        throw new SecurityException("Unable to store Native package download", e);
                    }
                } catch (SecurityException e4) {
                    e = e4;
                    path2 = null;
                } catch (Exception e5) {
                    e = e5;
                    path = null;
                }
            }
        }
        c80.x("Native release download metadata is invalid");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(List list, px pxVar, int i) {
        final int i2;
        final int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-802516022);
        int i4 = 4;
        int i5 = (go0Var.f(list) ? 4 : 2) | i;
        final int i6 = 0;
        if (go0Var.O(i5 & 1, (i5 & 3) != 2)) {
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (((xt0) it.next()).d == zt0.h && (i2 = i2 + 1) < 0) {
                        eu.Z();
                        throw null;
                    }
                }
            } else {
                i2 = 0;
            }
            if (list == null || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                i3 = 0;
                while (it2.hasNext()) {
                    if (((xt0) it2.next()).d == zt0.i && (i3 = i3 + 1) < 0) {
                        eu.Z();
                        throw null;
                    }
                }
            } else {
                i3 = 0;
            }
            if (list == null || !list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    if (((xt0) it3.next()).d == zt0.j && (i6 = i6 + 1) < 0) {
                        eu.Z();
                        throw null;
                    }
                }
            }
            eu.n(null, rg3.P(R.string.home_settings_hooker_debug_summary, go0Var), xe1.i0(-590539927, new mn0() { // from class: ut0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    px pxVar2 = (px) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    go0 go0Var2 = (go0) pxVar2;
                    if (go0Var2.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        uh1 uh1VarD = fg1.D(te.e, 14.0f, 12.0f);
                        ob2 ob2VarA = nb2.a(new xf(8.0f, new s(2)), sn.t, go0Var2, 54);
                        int iHashCode = Long.hashCode(go0Var2.T);
                        yy1 yy1VarL = go0Var2.l();
                        uh1 uh1VarM = tl.M(go0Var2, uh1VarD);
                        hx.c.getClass();
                        jy jyVar = gx.b;
                        go0Var2.Z();
                        if (go0Var2.S) {
                            go0Var2.k(jyVar);
                        } else {
                            go0Var2.i0();
                        }
                        yf3.c(go0Var2, gx.e, ob2VarA);
                        yf3.c(go0Var2, gx.d, yy1VarL);
                        yf3.c(go0Var2, gx.f, Integer.valueOf(iHashCode));
                        yf3.b(go0Var2, gx.g);
                        yf3.c(go0Var2, gx.c, uh1VarM);
                        s11.h(rg3.Q(R.string.home_settings_hooker_debug_normal_count, new Object[]{Integer.valueOf(i2)}, go0Var2), zt0.h, go0Var2, 48);
                        s11.h(rg3.Q(R.string.home_settings_hooker_debug_unavailable_count, new Object[]{Integer.valueOf(i3)}, go0Var2), zt0.i, go0Var2, 48);
                        s11.h(rg3.Q(R.string.home_settings_hooker_debug_locked_count, new Object[]{Integer.valueOf(i6)}, go0Var2), zt0.j, go0Var2, 48);
                        go0Var2.p(true);
                    } else {
                        go0Var2.R();
                    }
                    return a83.a;
                }
            }, go0Var), go0Var, 384, 1);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new q1(list, i, i4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 n0(uh1 uh1Var, dq1 dq1Var, vz2 vz2Var, wz2 wz2Var, j10 j10Var) {
        return uh1Var.c(new ez2(dq1Var, vz2Var, wz2Var, j10Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void o(s62 s62Var, px pxVar, int i) {
        go0 go0Var;
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(452879372);
        int i2 = i | (go0Var2.f(s62Var) ? 4 : 2);
        if (go0Var2.O(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) go0Var2.j(r7.b);
            rh1 rh1Var = rh1.a;
            uh1 uh1VarG0 = te.g0(rh1Var, 42.0f);
            fb2 fb2Var = gb2.a;
            uh1 uh1VarZ = ci0.z(uh1VarG0, fb2Var);
            tu2 tu2Var = ur1.a;
            uh1 uh1VarN = gf1.n(uh1VarZ, ju.b(0.14f, ((lp1) go0Var2.j(tu2Var)).g), sp0.h);
            nf1 nf1VarD = dm.d(sn.n, false);
            int iHashCode = Long.hashCode(go0Var2.T);
            yy1 yy1VarL = go0Var2.l();
            uh1 uh1VarM = tl.M(go0Var2, uh1VarN);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var2.Z();
            if (go0Var2.S) {
                go0Var2.k(jyVar);
            } else {
                go0Var2.i0();
            }
            yf3.c(go0Var2, gx.e, nf1VarD);
            yf3.c(go0Var2, gx.d, yy1VarL);
            yf3.c(go0Var2, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var2, gx.g);
            yf3.c(go0Var2, gx.c, uh1VarM);
            Character chN0 = pv2.n0(pv2.I0(s62Var.b).toString());
            String strValueOf = chN0 != null ? String.valueOf(Character.toUpperCase(chN0.charValue())) : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            m13 m13Var = new m13(((lp1) go0Var2.j(tu2Var)).g, rg3.D(15), im0.m, 0L, 0, 0L, null, null, 16777208);
            go0Var = go0Var2;
            eu.a(strValueOf, null, m13Var, 0, false, 0, 0, go0Var, 0, 1018);
            if (pv2.s0(s62Var.c)) {
                go0Var.W(283507292);
                go0Var.p(false);
            } else {
                go0Var.W(282833321);
                uh1 uh1VarZ2 = ci0.z(te.g0(rh1Var, 42.0f), fb2Var);
                Object objL = go0Var.L();
                eb ebVar = nx.a;
                if (objL == ebVar) {
                    objL = new w(16);
                    go0Var.f0(objL);
                }
                in0 in0Var = (in0) objL;
                boolean zH = go0Var.h(context) | ((i2 & 14) == 4);
                Object objL2 = go0Var.L();
                if (zH || objL2 == ebVar) {
                    objL2 = new d2(2, context, s62Var);
                    go0Var.f0(objL2);
                }
                pp0.b(in0Var, uh1VarZ2, (in0) objL2, go0Var, 6, 0);
                go0Var.p(false);
            }
            go0Var.p(true);
        } else {
            go0Var = go0Var2;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new s9(i, 2, s62Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b5 o0(int i, sh0 sh0Var) {
        return new b5(new e9(i, 6), sh0Var, c, 11, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void p(s62 s62Var, boolean z, in0 in0Var, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(986982458);
        int i2 = i | (go0Var.f(s62Var) ? 4 : 2) | (go0Var.g(z) ? 32 : 16) | (go0Var.h(in0Var) ? 256 : 128);
        int i3 = 0;
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            yi0 yi0Var = te.e;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objL = go0Var.L();
            if (z2 || objL == nx.a) {
                objL = new qh(i3, in0Var, z);
                go0Var.f0(objL);
            }
            uh1 uh1VarD = fg1.D(tl.O(yi0Var, (xm0) objL), 6.0f, 10.0f);
            ob2 ob2VarA = nb2.a(tp0.a, sn.t, go0Var, 48);
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
            lc lcVar = gx.e;
            yf3.c(go0Var, lcVar, ob2VarA);
            lc lcVar2 = gx.d;
            yf3.c(go0Var, lcVar2, yy1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            lc lcVar3 = gx.f;
            yf3.c(go0Var, lcVar3, numValueOf);
            v6 v6Var = gx.g;
            yf3.b(go0Var, v6Var);
            lc lcVar4 = gx.c;
            yf3.c(go0Var, lcVar4, uh1VarM);
            o(s62Var, go0Var, i2 & 14);
            rh1 rh1Var = rh1.a;
            rp0.O(go0Var, te.q0(rh1Var, 12.0f));
            g71 g71Var = new g71(1.0f, true);
            av avVarA = yu.a(tp0.c, sn.u, go0Var, 0);
            int iHashCode2 = Long.hashCode(go0Var.T);
            yy1 yy1VarL2 = go0Var.l();
            uh1 uh1VarM2 = tl.M(go0Var, g71Var);
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, lcVar, avVarA);
            yf3.c(go0Var, lcVar2, yy1VarL2);
            vi0.q(iHashCode2, go0Var, lcVar3, go0Var, v6Var);
            yf3.c(go0Var, lcVar4, uh1VarM2);
            String str = s62Var.b;
            tu2 tu2Var = ur1.a;
            eu.a(str, null, new m13(((lp1) go0Var.j(tu2Var)).e, rg3.D(14), im0.l, 0L, 0, rg3.D(19), null, null, 16646136), 2, false, 1, 0, go0Var, 1597440, 938);
            eu.a(rg3.P(s62Var.d ? R.string.auto_receive_redpacket_group : R.string.auto_receive_redpacket_friend, go0Var) + " · " + s62Var.a, null, new m13(((lp1) go0Var.j(tu2Var)).f, rg3.D(11), null, 0L, 0, rg3.D(16), null, null, 16646140), 2, false, 1, 0, go0Var, 1597440, 938);
            go0Var.p(true);
            rp0.O(go0Var, te.q0(rh1Var, 10.0f));
            te.g(z, in0Var, null, false, go0Var, (i2 >> 3) & 126);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new rh(s62Var, z, in0Var, i, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void p0(h12 h12Var, long j, in0 in0Var, boolean z) {
        MotionEvent motionEventA = h12Var.a();
        if (motionEventA == null) {
            s.j("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        in0Var.j(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventA.setAction(action);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void q(boolean z, Set set, xm0 xm0Var, in0 in0Var, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(2146883938);
        int i2 = i | (go0Var.g(z) ? 4 : 2) | (go0Var.f(set) ? 32 : 16) | (go0Var.h(in0Var) ? 2048 : 1024);
        int i3 = 0;
        if (go0Var.O(i2 & 1, (i2 & 1171) != 1170)) {
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            Object obj = objL;
            if (objL == ebVar) {
                nx1 nx1VarU = op0.u("");
                go0Var.f0(nx1VarU);
                obj = nx1VarU;
            }
            xk1 xk1Var = (xk1) obj;
            boolean z2 = (i2 & 112) == 32;
            Object objL2 = go0Var.L();
            Object obj2 = objL2;
            if (z2 || objL2 == ebVar) {
                nx1 nx1VarU2 = op0.u(set);
                go0Var.f0(nx1VarU2);
                obj2 = nx1VarU2;
            }
            xk1 xk1Var2 = (xk1) obj2;
            Object objL3 = go0Var.L();
            Object obj3 = objL3;
            if (objL3 == ebVar) {
                kx1 kx1Var = new kx1(0);
                go0Var.f0(kx1Var);
                obj3 = kx1Var;
            }
            kx1 kx1Var2 = (kx1) obj3;
            Object objL4 = go0Var.L();
            Object obj4 = objL4;
            if (objL4 == ebVar) {
                nx1 nx1VarU3 = op0.u(v62.a);
                go0Var.f0(nx1VarU3);
                obj4 = nx1VarU3;
            }
            xk1 xk1Var3 = (xk1) obj4;
            Integer numValueOf = Integer.valueOf(kx1Var2.g());
            Object objL5 = go0Var.L();
            boolean z3 = false;
            Object obj5 = objL5;
            if (objL5 == ebVar) {
                xh xhVar = new xh(xk1Var3, z3 ? 1 : 0, i3);
                go0Var.f0(xhVar);
                obj5 = xhVar;
            }
            eu.f(go0Var, (mn0) obj5, numValueOf);
            w62 w62Var = (w62) xk1Var3.getValue();
            u62 u62Var = w62Var instanceof u62 ? (u62) w62Var : null;
            Iterable iterable = u62Var != null ? u62Var.a : null;
            if (iterable == null) {
                iterable = be0.h;
            }
            String string = pv2.I0((String) xk1Var.getValue()).toString();
            boolean zF = go0Var.f(iterable) | go0Var.f(string);
            Object objL6 = go0Var.L();
            Object obj6 = objL6;
            if (zF || objL6 == ebVar) {
                if (!pv2.s0(string)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj7 : iterable) {
                        s62 s62Var = (s62) obj7;
                        if (pv2.h0(s62Var.b, string, true) || pv2.h0(s62Var.a, string, true)) {
                            arrayList.add(obj7);
                        }
                    }
                    iterable = arrayList;
                }
                go0Var.f0(iterable);
                obj6 = iterable;
            }
            qp0.d(true, xm0Var, null, rg3.P(z ? R.string.auto_receive_redpacket_select_whitelist_title : R.string.auto_receive_redpacket_select_blacklist_title, go0Var), null, xe1.i0(1316803429, new ih(xm0Var, in0Var, xk1Var2, i3), go0Var), xe1.i0(-1241668978, new jh((List) obj6, xk1Var2, xk1Var, xk1Var3, kx1Var2, 0), go0Var), go0Var, 1769526, 20);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new kh(z, set, xm0Var, in0Var, i, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long q0(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Boolean r(JsObject jsObject, String str) {
        Object obj = jsObject.get((Object) str);
        if (obj == null) {
            return null;
        }
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool;
        }
        c80.p("INVALID_ARGUMENT", str.concat(" must be a boolean."), 0, null, null, 28);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void r0(long j, b5 b5Var, File file, File file2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("v", 2);
        jSONObject.put("sequence", j);
        h80 h80Var = (h80) b5Var.i;
        jSONObject.put("releaseId", h80Var.a);
        jSONObject.put("generation", h80Var.b);
        jSONObject.put("kid", h80Var.f);
        jSONObject.put("packageSha256", (String) b5Var.k);
        jSONObject.put("packageLength", file2.length());
        jSONObject.put("packageFile", file2.getAbsolutePath());
        jSONObject.put("engineSha256", (String) h80Var.i);
        jSONObject.put("engineSize", h80Var.g);
        jSONObject.put("engineFile", ((File) b5Var.j).getAbsolutePath());
        up0.h(file.toPath(), new File(file, "active.json").toPath(), jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static int s(int i, String str, String str2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/fs/selinux/access", "rw");
        try {
            String str3 = str + " " + str2 + " " + i;
            Charset charset = wq.a;
            byte[] bytes = str3.getBytes(charset);
            bytes.getClass();
            Os.write(randomAccessFile.getFD(), bytes, 0, bytes.length);
            byte[] bArr = new byte[64];
            int i2 = randomAccessFile.read(bArr);
            if (i2 <= 0) {
                randomAccessFile.close();
                return 0;
            }
            String str4 = (String) du.q0(pv2.D0(pv2.I0(new String(bArr, 0, i2, charset)).toString(), new String[]{" "}));
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
    public static void s0(yn ynVar, int i, long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i2 = (iNumberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        ynVar.i(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            ynVar.i((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static su t(su suVar) {
        qd3 qd3Var = pp0.e;
        if (tp0.s(suVar.b, 12884901888L)) {
            ka2 ka2Var = (ka2) suVar;
            qd3 qd3Var2 = ka2Var.d;
            if (!B(qd3Var2, qd3Var)) {
                return new ka2(ka2Var.a, ka2Var.h, qd3Var, Q(y(j5.c.b, qd3Var2.a(), qd3Var.a()), ka2Var.i), ka2Var.k, ka2Var.n, ka2Var.e, ka2Var.f, ka2Var.g, -1);
            }
        }
        return suVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void t0(yn ynVar, int i, long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i2 = (iNumberOfLeadingZeros + 7) >> 3;
        ynVar.i(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            ynVar.i((byte) j);
            j >>= 8;
            i2--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static w80 u(w80... w80VarArr) {
        boolean z;
        boolean z2;
        w80 w80Var;
        int length = w80VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= length) {
                z2 = false;
                break;
            }
            if (w80VarArr[i2].a) {
                z2 = true;
                break;
            }
            i2++;
        }
        int length2 = w80VarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                z = false;
                break;
            }
            if (w80VarArr[i3].b) {
                break;
            }
            i3++;
        }
        String strH0 = pv2.H0(mg.p0(w80VarArr, "+", new gs(11), 30), 96);
        int length3 = w80VarArr.length;
        while (true) {
            if (i >= length3) {
                w80Var = null;
                break;
            }
            w80Var = w80VarArr[i];
            String str = w80Var.d;
            if (str != null && !pv2.s0(str)) {
                break;
            }
            i++;
        }
        return new w80(z2, z, strH0, w80Var != null ? w80Var.d : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final o62 v(c61 c61Var) {
        c61 c61VarJ = c61Var.j();
        return c61VarJ != null ? c61VarJ.J(c61Var, true) : new o62(0.0f, 0.0f, (int) (c61Var.L() >> 32), (int) (c61Var.L() & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final o62 w(c61 c61Var, boolean z) {
        c61 c61VarJ = J(c61Var);
        float fL = (int) (c61VarJ.L() >> 32);
        float fL2 = (int) (c61VarJ.L() & 4294967295L);
        o62 o62VarJ = c61VarJ.J(c61Var, z);
        float f2 = o62VarJ.a;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fL) {
                f2 = fL;
            }
        }
        float f3 = o62VarJ.b;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > fL2) {
                f3 = fL2;
            }
        }
        float f4 = o62VarJ.c;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 <= fL) {
                fL = f4;
            }
            f4 = fL;
        }
        float f5 = o62VarJ.d;
        if (z) {
            float f6 = f5 >= 0.0f ? f5 : 0.0f;
            if (f6 <= fL2) {
                fL2 = f6;
            }
            f5 = fL2;
        }
        if (f2 == f4 || f3 == f5) {
            return o62.e;
        }
        long jH = c61VarJ.h((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jH2 = c61VarJ.h((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jH3 = c61VarJ.h((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
        long jH4 = c61VarJ.h((((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jH4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jH3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jH & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jH2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jH4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jH3 & 4294967295L));
        return new o62(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static w80 x(String str, String str2, String str3, String str4) {
        Object x92Var;
        Object x92Var2;
        Method declaredMethod;
        try {
            Class clsI0 = i0();
            if (clsI0 == null || (declaredMethod = clsI0.getDeclaredMethod("checkSELinuxAccess", String.class, String.class, String.class, String.class)) == null) {
                x92Var = null;
            } else {
                Object objInvoke = declaredMethod.invoke(null, str, str2, str3, str4);
                objInvoke.getClass();
                x92Var = new w80(((Boolean) objInvoke).booleanValue(), true, "android.os.SELinux", null);
            }
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        w80 w80Var = (w80) x92Var;
        if (w80Var != null) {
            return w80Var;
        }
        try {
            int i = Integer.parseInt(pv2.I0(wi0.f0(new File("/sys/fs/selinux/class/" + str3 + "/index"))).toString());
            StringBuilder sb = new StringBuilder("/sys/fs/selinux/class/");
            sb.append(str3);
            sb.append("/perms/");
            sb.append(str4);
            x92Var2 = new w80((s(i, str, str2) & (1 << (Integer.parseInt(pv2.I0(wi0.f0(new File(sb.toString()))).toString()) - 1))) != 0, true, "selinuxfs", null);
        } catch (Throwable th2) {
            x92Var2 = new x92(th2);
        }
        Throwable thA = y92.a(x92Var2);
        if (thA != null) {
            x92Var2 = new w80(false, false, "selinuxfs", thA.getClass().getSimpleName());
        }
        return (w80) x92Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float[] y(float[] fArr, float[] fArr2, float[] fArr3) {
        R(fArr, fArr2);
        R(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrN = N(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return Q(fArrN, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void z(e41 e41Var, a31 a31Var, String str, w80 w80Var) {
        e41 e41Var2 = new e41();
        boolean z = w80Var.a;
        e41Var2.b("hit", Boolean.valueOf(z));
        e41Var2.b("available", Boolean.valueOf(w80Var.b));
        e41Var2.d("method", w80Var.c);
        String str2 = w80Var.d;
        if (str2 != null && !pv2.s0(str2)) {
            e41Var2.d("error", str2);
        }
        e41Var.h.put(str, e41Var2);
        if (z) {
            a31Var.h.add(new j41(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        switch (this.a) {
            case 26:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.a) {
            case 26:
                String strC = d72.a(getClass()).c();
                strC.getClass();
                return strC;
            default:
                return super.toString();
        }
    }
}
