package p000;

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

    /* JADX INFO: renamed from: b */
    public static final C0402kw f9862b = new C0402kw(180618618, false, new C0558ow(14));

    /* JADX INFO: renamed from: c */
    public static final C0160eb f9863c = new C0160eb(20);

    /* JADX INFO: renamed from: d */
    public static final C0485n4 f9864d = new C0485n4(25, new i51(0));

    /* JADX INFO: renamed from: e */
    public static final dq1 f9865e = new dq1(10, new eg1(0, 17), new eq1(21));

    /* JADX INFO: renamed from: f */
    public static sx0 f9866f;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9867a = 26;

    /* JADX INFO: renamed from: A */
    public static final long m4656A(zt0 zt0Var) {
        int iOrdinal = zt0Var.ordinal();
        if (iOrdinal == 0) {
            return sp0.m4932c(4279673674L);
        }
        if (iOrdinal == 1) {
            return sp0.m4932c(4292441862L);
        }
        if (iOrdinal == 2) {
            return sp0.m4932c(4292617766L);
        }
        c80.m675s();
        return 0L;
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m4657B(qd3 qd3Var, qd3 qd3Var2) {
        if (qd3Var == qd3Var2) {
            return true;
        }
        return Math.abs(qd3Var.f8924a - qd3Var2.f8924a) < 0.001f && Math.abs(qd3Var.f8925b - qd3Var2.f8925b) < 0.001f;
    }

    /* JADX INFO: renamed from: C */
    public static w80 m4658C(String str) {
        Object x92Var;
        Object x92Var2;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/sys/fs/selinux/context");
            try {
                byte[] bytes = str.getBytes(AbstractC0856wq.f12612a);
                bytes.getClass();
                Os.write(fileOutputStream.getFD(), bytes, 0, bytes.length);
                fileOutputStream.close();
                x92Var = new w80(true, true, "selinuxfs-context", null);
            } finally {
            }
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thM6237a = y92.m6237a(x92Var);
        if (thM6237a != null) {
            try {
                if (!(thM6237a instanceof ErrnoException) || ((ErrnoException) thM6237a).errno != OsConstants.EINVAL) {
                    throw thM6237a;
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
            m4718s(0, str, str);
            x92Var2 = new w80(true, true, "selinuxfs-access", null);
        } catch (Throwable th3) {
            x92Var2 = new x92(th3);
        }
        Throwable thM6237a2 = y92.m6237a(x92Var2);
        if (thM6237a2 != null) {
            try {
                if (!(thM6237a2 instanceof ErrnoException) || ((ErrnoException) thM6237a2).errno != OsConstants.EINVAL) {
                    throw thM6237a2;
                }
                x92Var2 = new w80(false, true, "selinuxfs-access", null);
            } catch (Throwable th4) {
                x92Var2 = new x92(th4);
            }
        }
        Throwable thM6237a3 = y92.m6237a(x92Var2);
        if (thM6237a3 != null) {
            x92Var2 = new w80(false, false, "selinuxfs", thM6237a3.getClass().getSimpleName());
        }
        return (w80) x92Var2;
    }

    /* JADX INFO: renamed from: D */
    public static C0310id m4659D(C0310id c0310id, float f) {
        float f2 = ((C0346jd) c0310id.f4562j).f4968a;
        return new C0310id(c0310id.f4560h, Float.valueOf(f), new C0346jd(f2), c0310id.f4563k, c0310id.f4564l, c0310id.f4565m);
    }

    /* JADX INFO: renamed from: E */
    public static StaticLayout m4660E(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            lz0.m2988a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            lz0.m2988a("invalid end value");
        }
        if (i3 < 0) {
            lz0.m2988a("invalid maxLines value");
        }
        if (i < 0) {
            lz0.m2988a("invalid width value");
        }
        if (i4 < 0) {
            lz0.m2988a("invalid ellipsizedWidth value");
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
            builderObtain.setLineBreakConfig(AbstractC0117d4.m939a().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    /* JADX INFO: renamed from: F */
    public static final C0942yy m4661F(AbstractC0708su abstractC0708su, AbstractC0708su abstractC0708su2) {
        return abstractC0708su == abstractC0708su2 ? new C0864wy(abstractC0708su, abstractC0708su, 1) : (tp0.m5371s(abstractC0708su.f10369b, 12884901888L) && tp0.m5371s(abstractC0708su2.f10369b, 12884901888L)) ? new C0903xy((ka2) abstractC0708su, (ka2) abstractC0708su2) : new C0942yy(abstractC0708su, abstractC0708su2, 0);
    }

    /* JADX INFO: renamed from: G */
    public static final void m4662G(QuickJs quickJs, fs1 fs1Var, long j) {
        long jM6533defineBindingNW8rdx8 = quickJs.m6533defineBindingNW8rdx8(fs1Var.f3126a, new zc0(fs1Var, quickJs), j);
        Iterator it = fs1Var.f3129d.iterator();
        while (it.hasNext()) {
            m4662G(quickJs, (fs1) it.next(), jM6533defineBindingNW8rdx8);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m4663H(File file) {
        try {
            up0.m5552r(m4695g0().toPath(), file.toPath());
        } catch (Exception e) {
            throw new SecurityException("Unable to create Native release storage", e);
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m4664I(bi0 bi0Var, String str) {
        Log.e("FastKV", bi0Var.f868b + " " + str);
    }

    /* JADX INFO: renamed from: J */
    public static final c61 m4665J(c61 c61Var) {
        c61 c61Var2;
        c61 c61VarMo650j = c61Var.mo650j();
        while (true) {
            c61 c61Var3 = c61VarMo650j;
            c61Var2 = c61Var;
            c61Var = c61Var3;
            if (c61Var == null) {
                break;
            }
            c61VarMo650j = c61Var.mo650j();
        }
        zn1 zn1Var = c61Var2 instanceof zn1 ? (zn1) c61Var2 : null;
        if (zn1Var == null) {
            return c61Var2;
        }
        zn1 zn1Var2 = zn1Var.f13987x;
        while (true) {
            zn1 zn1Var3 = zn1Var2;
            zn1 zn1Var4 = zn1Var;
            zn1Var = zn1Var3;
            if (zn1Var == null) {
                return zn1Var4;
            }
            zn1Var2 = zn1Var.f13987x;
        }
    }

    /* JADX INFO: renamed from: K */
    public static final sx0 m4666K() {
        sx0 sx0Var = f9866f;
        if (sx0Var != null) {
            return sx0Var;
        }
        rx0 rx0Var = new rx0("Filled.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = s93.f9998a;
        ft2 ft2Var = new ft2(C0363ju.f5212b);
        ye0 ye0Var = new ye0(3);
        ye0Var.m6259k(17.65f, 6.35f);
        ye0Var.m6252d(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        ye0Var.m6253e(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        ye0Var.m6261m(3.57f, 8.0f, 7.99f, 8.0f);
        ye0Var.m6253e(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        ye0Var.m6256h(-2.08f);
        ye0Var.m6253e(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        ye0Var.m6253e(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        ye0Var.m6261m(2.69f, -6.0f, 6.0f, -6.0f);
        ye0Var.m6253e(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        ye0Var.m6257i(13.0f, 11.0f);
        ye0Var.m6256h(7.0f);
        py1 py1Var = new py1(4.0f);
        ArrayList arrayList = ye0Var.f13428a;
        arrayList.add(py1Var);
        ye0Var.m6258j(-2.35f, 2.35f);
        ye0Var.m6251c();
        rx0.m4624a(rx0Var, arrayList, ft2Var);
        sx0 sx0VarM4625b = rx0Var.m4625b();
        f9866f = sx0VarM4625b;
        return sx0VarM4625b;
    }

    /* JADX INFO: renamed from: L */
    public static String m4667L(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: M */
    public static void m4668M(bi0 bi0Var, String str) {
        Log.i("FastKV", bi0Var.f868b + " " + str);
    }

    /* JADX INFO: renamed from: N */
    public static final float[] m4669N(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m4670O(b03 b03Var, boolean z) {
        c61 c61VarM5145c;
        t91 t91Var = b03Var.f483d;
        if (t91Var == null || (c61VarM5145c = t91Var.m5145c()) == null) {
            return false;
        }
        o62 o62VarM3578D = op0.m3578D(c61VarM5145c);
        long jM348l = b03Var.m348l(z);
        float f = o62VarM3578D.f7536a;
        float f2 = o62VarM3578D.f7538c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM348l >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = o62VarM3578D.f7537b;
        float f4 = o62VarM3578D.f7539d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM348l & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    /* JADX INFO: renamed from: P */
    public static final String m4671P(zt0 zt0Var, InterfaceC0596px interfaceC0596px) {
        int iOrdinal = zt0Var.ordinal();
        if (iOrdinal == 0) {
            go0 go0Var = (go0) interfaceC0596px;
            go0Var.m1966W(-1815795996);
            String strM4462P = rg3.m4462P(R.string.home_settings_hooker_debug_status_normal, go0Var);
            go0Var.m1994p(false);
            return strM4462P;
        }
        if (iOrdinal == 1) {
            go0 go0Var2 = (go0) interfaceC0596px;
            go0Var2.m1966W(-1815792567);
            String strM4462P2 = rg3.m4462P(R.string.home_settings_hooker_debug_status_unavailable, go0Var2);
            go0Var2.m1994p(false);
            return strM4462P2;
        }
        if (iOrdinal == 2) {
            go0 go0Var3 = (go0) interfaceC0596px;
            go0Var3.m1966W(-1815789148);
            String strM4462P3 = rg3.m4462P(R.string.home_settings_hooker_debug_status_locked, go0Var3);
            go0Var3.m1994p(false);
            return strM4462P3;
        }
        go0 go0Var4 = (go0) interfaceC0596px;
        go0Var4.m1966W(-1815797326);
        go0Var4.m1994p(false);
        c80.m675s();
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static final float[] m4672Q(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    /* JADX INFO: renamed from: R */
    public static final float[] m4673R(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public static final void m4674S(th1 th1Var, xm0 xm0Var) {
        ps1 ps1Var = th1Var.f10763n;
        if (ps1Var == null) {
            ps1Var = new ps1((os1) th1Var);
            th1Var.f10763n = ps1Var;
        }
        bw1 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(th1Var)).getSnapshotObserver();
        snapshotObserver.f1051a.m5436c(ps1Var, oq0.f7777o, xm0Var);
    }

    /* JADX INFO: renamed from: T */
    public static uh1 m4675T(uh1 uh1Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return uh1Var.mo4491c(new ss1(f, f2));
    }

    /* JADX INFO: renamed from: U */
    public static FileChannel m4676U(File file) {
        return FileChannel.open(up0.m5550p(file.toPath(), new File(file, "nuke-native-release.lock").toPath()), StandardOpenOption.CREATE, StandardOpenOption.WRITE, LinkOption.NOFOLLOW_LINKS);
    }

    /* JADX INFO: renamed from: V */
    public static String m4677V(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("sha256/");
        C0505no c0505no = C0505no.f7266k;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        int length = encoded.length;
        qp0.m4258m(encoded.length, 0L, length);
        int i = 0;
        byte[] bArrM3092g0 = AbstractC0460mg.m3092g0(encoded, 0, length);
        C0505no c0505no2 = new C0505no(bArrM3092g0);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrM3092g0, 0, c0505no2.mo3322a());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        new C0505no(bArrDigest);
        byte[] bArr = AbstractC0112d.f1796a;
        bArr.getClass();
        byte[] bArr2 = new byte[((bArrDigest.length + 2) / 3) * 4];
        int length2 = bArrDigest.length - (bArrDigest.length % 3);
        int i2 = 0;
        while (i < length2) {
            byte b = bArrDigest[i];
            int i3 = i + 2;
            byte b2 = bArrDigest[i + 1];
            i += 3;
            byte b3 = bArrDigest[i3];
            bArr2[i2] = bArr[(b & 255) >> 2];
            bArr2[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr2[i4] = bArr[b3 & 63];
        }
        int length3 = bArrDigest.length - length2;
        if (length3 == 1) {
            byte b4 = bArrDigest[i];
            bArr2[i2] = bArr[(b4 & 255) >> 2];
            bArr2[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr2[i2 + 2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length3 == 2) {
            int i5 = i + 1;
            byte b5 = bArrDigest[i];
            byte b6 = bArrDigest[i5];
            bArr2[i2] = bArr[(b5 & 255) >> 2];
            bArr2[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr2[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        sb.append(new String(bArr2, AbstractC0856wq.f12612a));
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File m4678W(File file) throws IOException {
        FileOutputStream fileOutputStream;
        File file2 = new File(file, "bootstrap.nkr");
        if (up0.m5559y(file.toPath(), file2.toPath())) {
            return file2;
        }
        Path pathCreateTempFile = Files.createTempFile(file.toPath(), "bootstrap.", ".tmp", new FileAttribute[0]);
        InputStream inputStreamOpen = up0.f11401i.getAssets().open("nuke/native/bootstrap.nkr");
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
                    up0.m5542g(file.toPath(), pathCreateTempFile, file2.toPath());
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

    /* JADX INFO: renamed from: X */
    public static ql1 m4679X() {
        File fileM4695g0 = m4695g0();
        m4663H(fileM4695g0);
        try {
            FileChannel fileChannelM4676U = m4676U(fileM4695g0);
            try {
                FileLock fileLockLock = fileChannelM4676U.lock();
                try {
                    ql1 ql1VarM4683a0 = m4683a0(m4680Y(fileM4695g0), m4705l0(fileM4695g0, m4678W(fileM4695g0), 0L));
                    if (fileLockLock != null) {
                        fileLockLock.close();
                    }
                    fileChannelM4676U.close();
                    return ql1VarM4683a0;
                } finally {
                }
            } catch (Throwable th) {
                if (fileChannelM4676U != null) {
                    try {
                        fileChannelM4676U.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SecurityException e) {
            throw e;
        } catch (Exception e2) {
            throw new SecurityException("Unable to prepare bootstrap Native release", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File m4680Y(File file) throws IOException {
        FileOutputStream fileOutputStream;
        File file2 = new File(up0.f11404l);
        File file3 = new File(file, "bridge");
        m4663H(file3);
        File file4 = new File(file3, (file2.length() + "-" + file2.lastModified()).concat("-libnuke_bridge.so"));
        if (up0.m5559y(file.toPath(), file4.toPath())) {
            try {
                cm1.m860k(file4);
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
                        cm1.m860k(pathCreateTempFile.toFile());
                        up0.m5542g(file.toPath(), pathCreateTempFile, file4.toPath());
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

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[Catch: all -> 0x0089, SYNTHETIC, TRY_LEAVE, TryCatch #6 {all -> 0x0089, blocks: (B:25:0x0085, B:40:0x009e, B:39:0x009b, B:36:0x0096), top: B:62:0x000b, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[Catch: Exception -> 0x00ae, SecurityException -> 0x00b7, SYNTHETIC, TRY_LEAVE, TryCatch #9 {SecurityException -> 0x00b7, Exception -> 0x00ae, blocks: (B:3:0x0007, B:29:0x008c, B:48:0x00ad, B:47:0x00aa, B:44:0x00a5), top: B:66:0x0007, inners: #5 }] */
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ql1 m4681Z() throws Throwable {
        FileChannel fileChannel;
        File fileM4680Y;
        ud0 ud0VarM4687c0;
        File fileM4695g0 = m4695g0();
        m4663H(fileM4695g0);
        try {
            FileChannel fileChannelM4676U = m4676U(fileM4695g0);
            try {
                try {
                    FileLock fileLockLock = fileChannelM4676U.lock();
                    try {
                        fileM4680Y = m4680Y(fileM4695g0);
                        ud0VarM4687c0 = m4687c0(fileM4695g0);
                        if (ud0VarM4687c0 == null) {
                            ud0VarM4687c0 = m4705l0(fileM4695g0, m4678W(fileM4695g0), 0L);
                            m4717r0(ud0VarM4687c0.f11238a, (C0043b5) ud0VarM4687c0.f11239b, fileM4695g0, (File) ud0VarM4687c0.f11240c);
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        C0043b5 c0043b5 = (C0043b5) ud0VarM4687c0.f11239b;
                        h80 h80Var = (h80) c0043b5.f562i;
                        m4685b0(fileM4695g0, h80Var.f3891a);
                        File file = (File) c0043b5.f563j;
                        File file2 = (File) ud0VarM4687c0.f11240c;
                        fileChannel = fileChannelM4676U;
                        try {
                            ql1 ql1Var = new ql1(fileM4680Y, file, file2, h80Var.f3891a, h80Var.f3892b, h80Var.f3896f, ud0VarM4687c0.f11238a, (File) ud0VarM4687c0.f11241d, (String) c0043b5.f564k, file2.length(), (String) h80Var.f3899i, h80Var.f3897g);
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
                        fileChannel = fileChannelM4676U;
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
                fileChannel = fileChannelM4676U;
                Throwable th5222 = th;
                if (fileChannel != null) {
                }
            }
        } catch (SecurityException e) {
            throw e;
        } catch (Exception e2) {
            throw new SecurityException("Unable to prepare Native runtime", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0310id m4682a(float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new C0310id(rg3.f9572n, Float.valueOf(0.0f), new C0346jd(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: a0 */
    public static ql1 m4683a0(File file, ud0 ud0Var) {
        C0043b5 c0043b5 = (C0043b5) ud0Var.f11239b;
        File file2 = (File) c0043b5.f563j;
        File file3 = (File) ud0Var.f11240c;
        h80 h80Var = (h80) c0043b5.f562i;
        String str = h80Var.f3891a;
        long j = h80Var.f3892b;
        String str2 = h80Var.f3896f;
        long j2 = ud0Var.f11238a;
        File file4 = (File) ud0Var.f11241d;
        String str3 = (String) c0043b5.f564k;
        long length = file3.length();
        h80 h80Var2 = (h80) c0043b5.f562i;
        return new ql1(file, file2, file3, str, j, str2, j2, file4, str3, length, (String) h80Var2.f3899i, h80Var2.f3897g);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4684b(final C0091ch c0091ch, final xm0 xm0Var, final in0 in0Var, InterfaceC0596px interfaceC0596px, final int i) {
        int i2;
        b62 b62VarM1996r;
        mn0 mn0Var;
        C0203fh c0203fh = c0091ch.f1539f;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1224859872);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.m1980f(c0091ch) : go0Var.m1984h(c0091ch) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(xm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 256 : 128;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0091ch));
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (z || objM1956L == c0160eb) {
                objM1956L = op0.m3598u(Integer.valueOf(c0091ch.f1535b));
                go0Var.m1981f0(objM1956L);
            }
            final xk1 xk1Var = (xk1) objM1956L;
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0091ch));
            Object objM1956L2 = go0Var.m1956L();
            if (z2 || objM1956L2 == c0160eb) {
                objM1956L2 = op0.m3598u(String.valueOf(c0091ch.f1534a));
                go0Var.m1981f0(objM1956L2);
            }
            final xk1 xk1Var2 = (xk1) objM1956L2;
            boolean z3 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0091ch));
            Object objM1956L3 = go0Var.m1956L();
            if (z3 || objM1956L3 == c0160eb) {
                objM1956L3 = op0.m3598u(Boolean.valueOf(c0203fh.f2998a));
                go0Var.m1981f0(objM1956L3);
            }
            final xk1 xk1Var3 = (xk1) objM1956L3;
            boolean z4 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0091ch));
            Object objM1956L4 = go0Var.m1956L();
            if (z4 || objM1956L4 == c0160eb) {
                objM1956L4 = op0.m3598u(Boolean.valueOf(c0091ch.f1536c));
                go0Var.m1981f0(objM1956L4);
            }
            final xk1 xk1Var4 = (xk1) objM1956L4;
            boolean z5 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0091ch));
            Object objM1956L5 = go0Var.m1956L();
            if (z5 || objM1956L5 == c0160eb) {
                objM1956L5 = op0.m3598u(c0091ch.f1537d);
                go0Var.m1981f0(objM1956L5);
            }
            xk1 xk1Var5 = (xk1) objM1956L5;
            boolean z6 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0091ch));
            Object objM1956L6 = go0Var.m1956L();
            if (z6 || objM1956L6 == c0160eb) {
                objM1956L6 = op0.m3598u(c0091ch.f1538e);
                go0Var.m1981f0(objM1956L6);
            }
            xk1 xk1Var6 = (xk1) objM1956L6;
            Object objM1956L7 = go0Var.m1956L();
            if (objM1956L7 == c0160eb) {
                objM1956L7 = op0.m3598u(Boolean.FALSE);
                go0Var.m1981f0(objM1956L7);
            }
            final xk1 xk1Var7 = (xk1) objM1956L7;
            boolean z7 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(c0091ch));
            Object objM1956L8 = go0Var.m1956L();
            if (z7 || objM1956L8 == c0160eb) {
                objM1956L8 = op0.m3598u(c0203fh.f2999b);
                go0Var.m1981f0(objM1956L8);
            }
            final xk1 xk1Var8 = (xk1) objM1956L8;
            Long lM6014f0 = wv2.m6014f0((String) xk1Var2.getValue());
            if (lM6014f0 != null) {
                long jLongValue = lM6014f0.longValue();
                boolean z8 = (0L > jLongValue ? 1 : (0L == jLongValue ? 0 : -1)) <= 0 && (jLongValue > 60001L ? 1 : (jLongValue == 60001L ? 0 : -1)) < 0;
                final String strM4462P = rg3.m4462P(R.string.auto_receive_redpacket_mode_click, go0Var);
                final String strM4462P2 = rg3.m4462P(R.string.auto_receive_redpacket_mode_network, go0Var);
                final String strM4462P3 = rg3.m4462P(R.string.auto_receive_redpacket_list_mode_blacklist, go0Var);
                final String strM4462P4 = rg3.m4462P(R.string.auto_receive_redpacket_list_mode_whitelist, go0Var);
                final Set set = ((Boolean) xk1Var4.getValue()).booleanValue() ? (Set) xk1Var5.getValue() : (Set) xk1Var6.getValue();
                if (((Boolean) xk1Var7.getValue()).booleanValue()) {
                    go0Var.m1966W(-240086109);
                    boolean zBooleanValue = ((Boolean) xk1Var4.getValue()).booleanValue();
                    Object objM1956L9 = go0Var.m1956L();
                    if (objM1956L9 == c0160eb) {
                        objM1956L9 = new C0186f0(xk1Var7, 10);
                        go0Var.m1981f0(objM1956L9);
                    }
                    xm0 xm0Var2 = (xm0) objM1956L9;
                    boolean zM1980f = go0Var.m1980f(xk1Var4) | go0Var.m1980f(xk1Var5) | go0Var.m1980f(xk1Var6);
                    Object objM1956L10 = go0Var.m1956L();
                    if (zM1980f || objM1956L10 == c0160eb) {
                        objM1956L10 = new C0424lh(xk1Var4, xk1Var5, xk1Var6, xk1Var7, 0);
                        go0Var.m1981f0(objM1956L10);
                    }
                    m4714q(zBooleanValue, set, xm0Var2, (in0) objM1956L10, go0Var, 384);
                    go0Var.m1994p(false);
                    b62VarM1996r = go0Var.m1996r();
                    if (b62VarM1996r == null) {
                        return;
                    }
                    final int i4 = 0;
                    mn0Var = new mn0() { // from class: sh
                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj, Object obj2) {
                            int i5 = i4;
                            a83 a83Var = a83.f116a;
                            int i6 = i;
                            in0 in0Var2 = in0Var;
                            xm0 xm0Var3 = xm0Var;
                            C0091ch c0091ch2 = c0091ch;
                            InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    s11.m4684b(c0091ch2, xm0Var3, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                                    break;
                                default:
                                    s11.m4684b(c0091ch2, xm0Var3, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                } else {
                    go0Var.m1966W(-239625790);
                    go0Var.m1994p(false);
                    final boolean z9 = z8;
                    qp0.m4249d(true, xm0Var, null, rg3.m4462P(R.string.auto_receive_redpacket_config_title, go0Var), null, xe1.m6126i0(389955709, new C0734th(xm0Var, lM6014f0, in0Var, xk1Var, xk1Var4, xk1Var5, xk1Var6, xk1Var3, xk1Var8, z8), go0Var), xe1.m6126i0(-763225548, new nn0() { // from class: uh
                        @Override // p000.nn0
                        /* JADX INFO: renamed from: e */
                        public final Object mo489e(Object obj, Object obj2, Object obj3) {
                            String str;
                            xk1 xk1Var9;
                            rh1 rh1Var;
                            InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((C0069bv) obj).getClass();
                            go0 go0Var2 = (go0) interfaceC0596px2;
                            if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                                rh1 rh1Var2 = rh1.f9587a;
                                uh1 uh1VarM1882b0 = gf1.m1882b0(AbstractC0731te.m5187P(rh1Var2, 0.0f, 520.0f, 1), gf1.m1868P(go0Var2));
                                C0808vf c0808vf = tp0.f10876c;
                                C0583pk c0583pk = C0700sn.f10233u;
                                C0032av c0032avM6346a = AbstractC0938yu.m6346a(c0808vf, c0583pk, go0Var2, 0);
                                int iHashCode = Long.hashCode(go0Var2.f3614T);
                                yy1 yy1VarM1990l = go0Var2.m1990l();
                                uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, uh1VarM1882b0);
                                InterfaceC0293hx.f4166c.getClass();
                                C0367jy c0367jy = C0256gx.f3727b;
                                go0Var2.m1969Z();
                                if (go0Var2.f3613S) {
                                    go0Var2.m1989k(c0367jy);
                                } else {
                                    go0Var2.m1987i0();
                                }
                                C0419lc c0419lc = C0256gx.f3730e;
                                yf3.m6268c(go0Var2, c0419lc, c0032avM6346a);
                                C0419lc c0419lc2 = C0256gx.f3729d;
                                yf3.m6268c(go0Var2, c0419lc2, yy1VarM1990l);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                C0419lc c0419lc3 = C0256gx.f3731f;
                                yf3.m6268c(go0Var2, c0419lc3, numValueOf);
                                C0799v6 c0799v6 = C0256gx.f3732g;
                                yf3.m6267b(go0Var2, c0799v6);
                                C0419lc c0419lc4 = C0256gx.f3728c;
                                yf3.m6268c(go0Var2, c0419lc4, uh1VarM5285M);
                                String strM4462P5 = rg3.m4462P(R.string.auto_receive_redpacket_receive_mode_title, go0Var2);
                                String strM4462P6 = rg3.m4462P(R.string.auto_receive_redpacket_receive_mode_description, go0Var2);
                                List listM1435P = AbstractC0179eu.m1435P(0, 1);
                                xk1 xk1Var10 = xk1Var;
                                Integer numValueOf2 = Integer.valueOf(((Number) xk1Var10.getValue()).intValue());
                                boolean zM1980f2 = go0Var2.m1980f(xk1Var10);
                                Object objM1956L11 = go0Var2.m1956L();
                                C0160eb c0160eb2 = C0520nx.f7360a;
                                if (zM1980f2 || objM1956L11 == c0160eb2) {
                                    str = strM4462P5;
                                    objM1956L11 = new C0260h0(xk1Var10, 18);
                                    go0Var2.m1981f0(objM1956L11);
                                } else {
                                    str = strM4462P5;
                                }
                                in0 in0Var2 = (in0) objM1956L11;
                                String str2 = strM4462P;
                                boolean zM1980f3 = go0Var2.m1980f(str2);
                                String str3 = strM4462P2;
                                boolean zM1980f4 = zM1980f3 | go0Var2.m1980f(str3);
                                Object objM1956L12 = go0Var2.m1956L();
                                if (zM1980f4 || objM1956L12 == c0160eb2) {
                                    objM1956L12 = new C0223g0(2, str2, str3);
                                    go0Var2.m1981f0(objM1956L12);
                                }
                                AbstractC0179eu.m1463m(str, listM1435P, numValueOf2, in0Var2, null, strM4462P6, (in0) objM1956L12, false, go0Var2, 48);
                                String strM5687f = vi0.m5687f(rh1Var2, 8.0f, go0Var2, R.string.auto_receive_redpacket_list_mode_title, go0Var2);
                                xk1 xk1Var11 = xk1Var4;
                                String strM4462P7 = rg3.m4462P(((Boolean) xk1Var11.getValue()).booleanValue() ? R.string.auto_receive_redpacket_list_mode_whitelist_description : R.string.auto_receive_redpacket_list_mode_blacklist_description, go0Var2);
                                List listM1435P2 = AbstractC0179eu.m1435P(Boolean.FALSE, Boolean.TRUE);
                                Boolean bool = (Boolean) xk1Var11.getValue();
                                bool.getClass();
                                boolean zM1980f5 = go0Var2.m1980f(xk1Var11);
                                Object objM1956L13 = go0Var2.m1956L();
                                if (zM1980f5 || objM1956L13 == c0160eb2) {
                                    objM1956L13 = new C0260h0(xk1Var11, 19);
                                    go0Var2.m1981f0(objM1956L13);
                                }
                                in0 in0Var3 = (in0) objM1956L13;
                                String str4 = strM4462P4;
                                boolean zM1980f6 = go0Var2.m1980f(str4);
                                String str5 = strM4462P3;
                                boolean zM1980f7 = zM1980f6 | go0Var2.m1980f(str5);
                                Object objM1956L14 = go0Var2.m1956L();
                                if (zM1980f7 || objM1956L14 == c0160eb2) {
                                    xk1Var9 = xk1Var11;
                                    objM1956L14 = new C0223g0(1, str4, str5);
                                    go0Var2.m1981f0(objM1956L14);
                                } else {
                                    xk1Var9 = xk1Var11;
                                }
                                AbstractC0179eu.m1463m(strM5687f, listM1435P2, bool, in0Var3, null, strM4462P7, (in0) objM1956L14, false, go0Var2, 48);
                                String strM4462P8 = rg3.m4462P(((Boolean) xk1Var9.getValue()).booleanValue() ? R.string.auto_receive_redpacket_configure_whitelist : R.string.auto_receive_redpacket_configure_blacklist, go0Var2);
                                String strM4463Q = rg3.m4463Q(R.string.auto_receive_redpacket_selected_count, new Object[]{Integer.valueOf(set.size())}, go0Var2);
                                Object objM1956L15 = go0Var2.m1956L();
                                if (objM1956L15 == c0160eb2) {
                                    objM1956L15 = new C0186f0(xk1Var7, 11);
                                    go0Var2.m1981f0(objM1956L15);
                                }
                                qp0.m4253h(strM4462P8, (xm0) objM1956L15, null, strM4463Q, null, null, null, false, null, go0Var2, 48, 500);
                                s11.m4686c(vi0.m5687f(rh1Var2, 12.0f, go0Var2, R.string.auto_receive_redpacket_wait_time_label, go0Var2), go0Var2, 0);
                                xk1 xk1Var12 = xk1Var2;
                                String str6 = (String) xk1Var12.getValue();
                                boolean zM1980f8 = go0Var2.m1980f(xk1Var12);
                                Object objM1956L16 = go0Var2.m1956L();
                                if (zM1980f8 || objM1956L16 == c0160eb2) {
                                    objM1956L16 = new C0260h0(xk1Var12, 14);
                                    go0Var2.m1981f0(objM1956L16);
                                }
                                tp0.m5357b(str6, (in0) objM1956L16, null, rg3.m4462P(R.string.auto_receive_redpacket_wait_time_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var2, 0, 384, 12276);
                                if (pv2.m4006s0((String) xk1Var12.getValue()) || z9) {
                                    rh1Var = rh1Var2;
                                    go0Var2.m1966W(1063453348);
                                    go0Var2.m1994p(false);
                                } else {
                                    go0Var2.m1966W(1063012776);
                                    uh1 uh1VarM1615G = fg1.m1615G(rh1Var2, 0.0f, 6.0f, 0.0f, 0.0f, 13);
                                    rh1Var = rh1Var2;
                                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.auto_receive_redpacket_wait_time_invalid, go0Var2), uh1VarM1615G, new m13(((lp1) go0Var2.m1988j(ur1.f11452a)).f6239g, rg3.m4450D(12), im0.f4681k, 0L, 0, rg3.m4450D(17), null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                                    go0Var2.m1994p(false);
                                }
                                rp0.m4529O(go0Var2, AbstractC0731te.m5186O(rh1Var, 16.0f));
                                yi0 yi0Var = AbstractC0731te.f10693e;
                                ob2 ob2VarM3265a = nb2.m3265a(new C0884xf(12.0f, new C0676s(2)), C0700sn.f10232t, go0Var2, 54);
                                int iHashCode2 = Long.hashCode(go0Var2.f3614T);
                                yy1 yy1VarM1990l2 = go0Var2.m1990l();
                                uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var2, yi0Var);
                                go0Var2.m1969Z();
                                if (go0Var2.f3613S) {
                                    go0Var2.m1989k(c0367jy);
                                } else {
                                    go0Var2.m1987i0();
                                }
                                yf3.m6268c(go0Var2, c0419lc, ob2VarM3265a);
                                yf3.m6268c(go0Var2, c0419lc2, yy1VarM1990l2);
                                vi0.m5698q(iHashCode2, go0Var2, c0419lc3, go0Var2, c0799v6);
                                yf3.m6268c(go0Var2, c0419lc4, uh1VarM5285M2);
                                g71 g71Var = new g71(1.0f, true);
                                C0032av c0032avM6346a2 = AbstractC0938yu.m6346a(c0808vf, c0583pk, go0Var2, 0);
                                int iHashCode3 = Long.hashCode(go0Var2.f3614T);
                                yy1 yy1VarM1990l3 = go0Var2.m1990l();
                                uh1 uh1VarM5285M3 = AbstractC0738tl.m5285M(go0Var2, g71Var);
                                go0Var2.m1969Z();
                                if (go0Var2.f3613S) {
                                    go0Var2.m1989k(c0367jy);
                                } else {
                                    go0Var2.m1987i0();
                                }
                                yf3.m6268c(go0Var2, c0419lc, c0032avM6346a2);
                                yf3.m6268c(go0Var2, c0419lc2, yy1VarM1990l3);
                                vi0.m5698q(iHashCode3, go0Var2, c0419lc3, go0Var2, c0799v6);
                                yf3.m6268c(go0Var2, c0419lc4, uh1VarM5285M3);
                                String strM4462P9 = rg3.m4462P(R.string.auto_receive_redpacket_auto_reply_title, go0Var2);
                                tu2 tu2Var = ur1.f11452a;
                                AbstractC0179eu.m1446a(strM4462P9, null, new m13(((lp1) go0Var2.m1988j(tu2Var)).f6237e, rg3.m4450D(14), im0.f4682l, 0L, 0, rg3.m4450D(19), null, null, 16646136), 0, false, 0, 0, go0Var2, 0, 1018);
                                AbstractC0179eu.m1446a(rg3.m4462P(R.string.auto_receive_redpacket_auto_reply_description, go0Var2), null, new m13(((lp1) go0Var2.m1988j(tu2Var)).f6238f, rg3.m4450D(12), null, 0L, 0, rg3.m4450D(17), null, null, 16646140), 0, false, 0, 0, go0Var2, 0, 1018);
                                go0Var2.m1994p(true);
                                xk1 xk1Var13 = xk1Var3;
                                boolean zBooleanValue2 = ((Boolean) xk1Var13.getValue()).booleanValue();
                                boolean zM1980f9 = go0Var2.m1980f(xk1Var13);
                                Object objM1956L17 = go0Var2.m1956L();
                                if (zM1980f9 || objM1956L17 == c0160eb2) {
                                    objM1956L17 = new C0260h0(xk1Var13, 15);
                                    go0Var2.m1981f0(objM1956L17);
                                }
                                sp0.m4944i(zBooleanValue2, (in0) objM1956L17, null, false, 0, go0Var2, 0, 60);
                                go0Var2.m1994p(true);
                                rp0.m4529O(go0Var2, AbstractC0731te.m5186O(rh1Var, 12.0f));
                                s11.m4686c(rg3.m4462P(R.string.auto_receive_redpacket_reply_content_label, go0Var2), go0Var2, 0);
                                xk1 xk1Var14 = xk1Var8;
                                String str7 = (String) xk1Var14.getValue();
                                boolean zM1980f10 = go0Var2.m1980f(xk1Var14);
                                Object objM1956L18 = go0Var2.m1956L();
                                if (zM1980f10 || objM1956L18 == c0160eb2) {
                                    objM1956L18 = new C0260h0(xk1Var14, 16);
                                    go0Var2.m1981f0(objM1956L18);
                                }
                                tp0.m5357b(str7, (in0) objM1956L18, null, rg3.m4462P(R.string.auto_receive_redpacket_reply_content_hint, go0Var2), null, null, false, 2, 4, ((Boolean) xk1Var13.getValue()).booleanValue(), false, null, null, null, go0Var2, 114819072, 0, 15412);
                                go0Var2.m1994p(true);
                            } else {
                                go0Var2.m1961R();
                            }
                            return a83.f116a;
                        }
                    }, go0Var), go0Var, (i2 & 112) | 1769478, 20);
                }
            }
            b62VarM1996r.f616d = mn0Var;
        }
        go0Var.m1961R();
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            final int i5 = 1;
            mn0Var = new mn0() { // from class: sh
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    int i52 = i5;
                    a83 a83Var = a83.f116a;
                    int i6 = i;
                    in0 in0Var2 = in0Var;
                    xm0 xm0Var3 = xm0Var;
                    C0091ch c0091ch2 = c0091ch;
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            s11.m4684b(c0091ch2, xm0Var3, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                            break;
                        default:
                            s11.m4684b(c0091ch2, xm0Var3, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarM1996r.f616d = mn0Var;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m4685b0(File file, final String str) {
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: pl1
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
            Arrays.sort(fileArrListFiles, new C0612qa(5));
            for (int i = 2; i < fileArrListFiles.length; i++) {
                try {
                    Path path = file.toPath();
                    Path pathM5550p = up0.m5550p(path, fileArrListFiles[i].toPath());
                    if (pathM5550p.equals(path.toRealPath(LinkOption.NOFOLLOW_LINKS))) {
                        throw new SecurityException("Refusing to delete Native release root");
                    }
                    Files.walkFileTree(pathM5550p, new ol1());
                    up0.m5554t(pathM5550p.getParent());
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4686c(String str, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-256448328);
        int i2 = 4;
        int i3 = (go0Var.m1980f(str) ? 4 : 2) | i;
        if (go0Var.m1958O(i3 & 1, (i3 & 3) != 2)) {
            AbstractC0179eu.m1446a(str, fg1.m1615G(rh1.f9587a, 0.0f, 0.0f, 0.0f, 8.0f, 7), new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(13), im0.f4681k, 0L, 0, rg3.m4450D(18), null, null, 16646136), 0, false, 0, 0, go0Var, (i3 & 14) | 48, 1016);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0481n0(str, i, i2);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static ud0 m4687c0(File file) {
        File file2 = new File(file, "active.json");
        if (up0.m5559y(file.toPath(), file2.toPath())) {
            try {
                JSONObject jSONObject = new JSONObject(new String(m4689d0(file2), StandardCharsets.UTF_8));
                Path pathM5550p = up0.m5550p(file.toPath(), new File(jSONObject.getString("packageFile")).toPath());
                if (up0.m5559y(file.toPath(), pathM5550p)) {
                    File file3 = pathM5550p.toFile();
                    ud0 ud0VarM4691e0 = m4691e0(file, jSONObject, file3);
                    if (ud0VarM4691e0 != null) {
                        return ud0VarM4691e0;
                    }
                    C0043b5 c0043b5M6440f = zl1.m6440f(file3, file);
                    h80 h80Var = (h80) c0043b5M6440f.f562i;
                    if (jSONObject.getString("releaseId").equals(h80Var.f3891a) && jSONObject.getLong("generation") == h80Var.f3892b && jSONObject.getString("kid").equals(h80Var.f3896f)) {
                        long jOptLong = jSONObject.optLong("sequence", 0L);
                        File file4 = jOptLong == 0 ? null : new File(((File) c0043b5M6440f.f563j).getParentFile(), "activation.json");
                        if (jOptLong <= 0 || up0.m5559y(file.toPath(), file4.toPath())) {
                            m4717r0(jOptLong, c0043b5M6440f, file, file3);
                            return new ud0(jOptLong, c0043b5M6440f, file3, file4);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m4688d(C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1691001626);
        int i2 = 1;
        if (go0Var.m1958O(i & 1, (i & 3) != 2)) {
            uh1 uh1VarM5186O = AbstractC0731te.m5186O(AbstractC0731te.f10693e, 220.0f);
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10877d, C0700sn.f10234v, go0Var, 54);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM5186O);
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
            c0402kw.mo489e(C0069bv.f1040a, go0Var, 54);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0524o0(c0402kw, i, i2);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static byte[] m4689d0(File file) throws IOException {
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

    /* JADX INFO: renamed from: e */
    public static final void m4690e(String str, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1528454364);
        int i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            AbstractC0179eu.m1446a(str, null, new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(13), null, 0L, 0, rg3.m4450D(18), null, null, 16646140), 0, false, 0, 0, go0Var, i2 & 14, 1018);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0481n0(str, i, 5);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static ud0 m4691e0(File file, JSONObject jSONObject, File file2) {
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
                    Path pathM5550p = up0.m5550p(file.toPath(), new File(jSONObject.getString("engineFile")).toPath());
                    File file3 = new File(file, "release-".concat(lowerCase));
                    File file4 = pathM5550p.toFile();
                    if (file4.getName().equals(str) && file4.getParentFile().equals(file3) && up0.m5559y(file.toPath(), pathM5550p) && file4.length() == j3) {
                        File file5 = jOptLong == 0 ? null : new File(file3, "activation.json");
                        if (jOptLong <= 0 || up0.m5559y(file.toPath(), file5.toPath())) {
                            return new ud0(jOptLong, new C0043b5(new h80(lowerCase, j, 1, 1, 1, lowerCase2, "lib/arm64-v8a/".concat(str), lowerCase4, j3), file4, lowerCase3, 22), file2, file5);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final void m4692f(b03 b03Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(2080741862);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1984h(b03Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 32 : 16;
        }
        int i3 = 1;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            t11.m5076b(b03Var, c0402kw, go0Var, i2 & 126);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0217fv(b03Var, c0402kw, i, i3);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static String m4693f0(String str) {
        Object x92Var;
        try {
            x92Var = pv2.m3993I0(wi0.m5900f0(new File(str))).toString();
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        return (String) x92Var;
    }

    /* JADX INFO: renamed from: g */
    public static final void m4694g(int i, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-2144271339);
        if (go0Var.m1958O(i & 1, i != 0)) {
            AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.home_settings_hooker_debug_actions, go0Var), tp0.f10881h, go0Var, 384, 1);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0920ye(i, 28);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static File m4695g0() {
        File noBackupFilesDir = up0.f11401i.getNoBackupFilesDir();
        File file = new File(noBackupFilesDir, "nuke/native/releases");
        try {
            up0.m5552r(noBackupFilesDir.toPath(), file.toPath());
            return file;
        } catch (Exception e) {
            throw new SecurityException("Unable to create Native release root", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m4696h(String str, zt0 zt0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1552964452);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1976d(zt0Var.ordinal()) ? 32 : 16;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            long jM4656A = m4656A(zt0Var);
            uh1 uh1VarM1612D = fg1.m1612D(gf1.m1896n(ci0.m825z(rh1.f9587a, gb2.m1827a(999.0f)), C0363ju.m2565b(0.13f, jM4656A), sp0.f10267h), 9.0f, 4.0f);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
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
            yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            AbstractC0179eu.m1446a(str, null, new m13(jM4656A, rg3.m4450D(11), im0.f4682l, 0L, 0, rg3.m4450D(14), null, null, 16646136), 2, false, 1, 0, go0Var, (i2 & 14) | 1597440, 938);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0781up(i, 5, str, zt0Var);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m4697h0(String str) {
        Object x92Var;
        Method declaredMethod;
        try {
            Class clsM4699i0 = m4699i0();
            Object objInvoke = (clsM4699i0 == null || (declaredMethod = clsM4699i0.getDeclaredMethod(str, null)) == null) ? null : declaredMethod.invoke(null, null);
            x92Var = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        return (Boolean) (x92Var instanceof x92 ? null : x92Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4698i(List list, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        Object x92Var;
        Object x92Var2;
        String strMo9d;
        String str;
        Integer numMo141k;
        Object x92Var3;
        list.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(2041025071);
        int i2 = (go0Var.m1984h(in0Var) ? 32 : 16) | (go0Var.m1980f(list) ? 4 : 2) | i;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) go0Var.m1988j(AbstractC0646r7.f9411b);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                objM1956L = op0.m3598u(0);
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            Object objM1956L2 = go0Var.m1956L();
            if (objM1956L2 == c0160eb) {
                objM1956L2 = op0.m3598u(null);
                go0Var.m1981f0(objM1956L2);
            }
            xk1 xk1Var2 = (xk1) objM1956L2;
            boolean zM1976d = go0Var.m1976d(((Number) xk1Var.getValue()).intValue());
            Object objM1956L3 = go0Var.m1956L();
            Object obj = objM1956L3;
            if (zM1976d || objM1956L3 == c0160eb) {
                pp1 pp1Var = pp1.f8445a;
                op1 op1VarM3930b = pp1.m3930b();
                op1VarM3930b.getClass();
                try {
                    x92Var = (List) op1VarM3930b.m3605b(AbstractC0691se.m4815D(new C0090cg(yt0.Companion.serializer())), null, "hooker_debug_records");
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                if (x92Var instanceof x92) {
                    x92Var = null;
                }
                Iterable iterable = (List) x92Var;
                if (iterable == null) {
                    iterable = be0.f819h;
                }
                int iM6103U = xe1.m6103U(AbstractC0179eu.m1421B(iterable, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM6103U >= 16 ? iM6103U : 16);
                for (Object obj2 : iterable) {
                    linkedHashMap.put(((yt0) obj2).m6337l(), obj2);
                }
                go0Var.m1981f0(linkedHashMap);
                obj = linkedHashMap;
            }
            Map map = (Map) obj;
            boolean zM1976d2 = go0Var.m1976d(((Number) xk1Var.getValue()).intValue()) | ((i2 & 14) == 4) | go0Var.m1980f(map) | go0Var.m1980f(context);
            Object objM1956L4 = go0Var.m1956L();
            Object obj3 = objM1956L4;
            if (zM1976d2 || objM1956L4 == c0160eb) {
                ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC0812vj abstractC0812vj = (AbstractC0812vj) it.next();
                    yt0 yt0Var = (yt0) map.get(abstractC0812vj.mo9d());
                    ArrayList arrayList2 = abstractC0812vj.f11986b;
                    boolean z = abstractC0812vj.f11987c;
                    Throwable th2 = (Throwable) AbstractC0142du.m1167w0(arrayList2);
                    zt0 zt0Var = (yt0Var == null && th2 == null) ? !z ? zt0.f14091i : zt0.f14090h : zt0.f14092j;
                    String strM6339n = yt0Var != null ? yt0Var.m6339n() : th2 != null ? "Throwable recorded in memory" : !z ? "isAvailable = false" : "No recorded exception";
                    boolean z2 = abstractC0812vj instanceof AbstractC0255gw;
                    AbstractC0255gw abstractC0255gw = z2 ? (AbstractC0255gw) abstractC0812vj : null;
                    if (abstractC0255gw != null) {
                        try {
                            x92Var2 = context.getString(abstractC0255gw.mo142m());
                        } catch (Throwable th3) {
                            x92Var2 = new x92(th3);
                        }
                        if (x92Var2 instanceof x92) {
                            x92Var2 = null;
                        }
                        strMo9d = (String) x92Var2;
                        if (strMo9d == null) {
                            strMo9d = abstractC0812vj.mo9d();
                        } else {
                            if (pv2.m4006s0(strMo9d)) {
                                strMo9d = null;
                            }
                            if (strMo9d == null) {
                            }
                        }
                    }
                    String str2 = strMo9d;
                    AbstractC0255gw abstractC0255gw2 = z2 ? (AbstractC0255gw) abstractC0812vj : null;
                    if (abstractC0255gw2 == null || (numMo141k = abstractC0255gw2.mo141k()) == null) {
                        str = null;
                    } else {
                        try {
                            x92Var3 = context.getString(numMo141k.intValue());
                        } catch (Throwable th4) {
                            x92Var3 = new x92(th4);
                        }
                        if (x92Var3 instanceof x92) {
                            x92Var3 = null;
                        }
                        String str3 = (String) x92Var3;
                        if (str3 != null && !pv2.m4006s0(str3)) {
                            str = str3;
                        }
                    }
                    arrayList.add(new xt0(abstractC0812vj, str2, str, zt0Var, strM6339n, yt0Var, th2));
                }
                go0Var.m1981f0(arrayList);
                obj3 = arrayList;
            }
            ci0.m815p(xe1.m6126i0(-363523452, new tt0(in0Var, (List) obj3, xk1Var2, 0), go0Var), go0Var, 6);
            xt0 xt0Var = (xt0) xk1Var2.getValue();
            if (xt0Var == null) {
                go0Var.m1966W(328235698);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(328235699);
                Object objM1956L5 = go0Var.m1956L();
                if (objM1956L5 == c0160eb) {
                    objM1956L5 = new C0186f0(xk1Var2, 26);
                    go0Var.m1981f0(objM1956L5);
                }
                xm0 xm0Var = (xm0) objM1956L5;
                boolean zM1984h = go0Var.m1984h(xt0Var);
                Object objM1956L6 = go0Var.m1956L();
                if (zM1984h || objM1956L6 == c0160eb) {
                    objM1956L6 = new C0678s1((Object) xt0Var, xk1Var, xk1Var2, 13);
                    go0Var.m1981f0(objM1956L6);
                }
                m4700j(xt0Var, xm0Var, (xm0) objM1956L6, go0Var, 48);
                go0Var.m1994p(false);
            }
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0016af(list, in0Var, i);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static Class m4699i0() {
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

    /* JADX INFO: renamed from: j */
    public static final void m4700j(xt0 xt0Var, xm0 xm0Var, xm0 xm0Var2, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1284341609);
        int i2 = 4;
        int i3 = i | (go0Var.m1984h(xt0Var) ? 4 : 2) | (go0Var.m1984h(xm0Var2) ? 256 : 128);
        int i4 = 0;
        if (go0Var.m1958O(i3 & 1, (i3 & 147) != 146)) {
            qp0.m4249d(true, xm0Var, null, rg3.m4462P(R.string.home_settings_hooker_debug_detail_title, go0Var), null, xe1.m6126i0(-1920206932, new C0746tr(xm0Var, xt0Var, xm0Var2, i2), go0Var), xe1.m6126i0(486381973, new wt0(i4, xt0Var), go0Var), go0Var, 1769526, 20);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new tt0(xt0Var, xm0Var, xm0Var2, i, 9);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static String m4701j0(String str, Class[] clsArr, Object... objArr) {
        Object x92Var;
        Method declaredMethod;
        try {
            Class clsM4699i0 = m4699i0();
            Object objInvoke = (clsM4699i0 == null || (declaredMethod = clsM4699i0.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length))) == null) ? null : declaredMethod.invoke(null, Arrays.copyOf(objArr, objArr.length));
            x92Var = objInvoke instanceof String ? (String) objInvoke : null;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        String str2 = (String) x92Var;
        if (str2 != null) {
            return pv2.m3993I0(str2).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static final void m4702k(xt0 xt0Var, boolean z, xm0 xm0Var, InterfaceC0596px interfaceC0596px, int i) {
        String strM4462P;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(596746385);
        int i2 = (go0Var.m1984h(xt0Var) ? 4 : 2) | i | (go0Var.m1982g(z) ? 32 : 16) | (go0Var.m1984h(xm0Var) ? 256 : 128);
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                go0Var.m1966W(802053638);
                strM4462P = rg3.m4462P(R.string.home_settings_hooker_debug_hookers, go0Var);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(802132285);
                go0Var.m1994p(false);
                strM4462P = null;
            }
            AbstractC0179eu.m1464n(null, strM4462P, xe1.m6126i0(1621114864, new C0016af(11, xt0Var, xm0Var), go0Var), go0Var, 384, 1);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0656rh(xt0Var, z, xm0Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static ql1 m4703k0(File file, byte[] bArr, long j) {
        if (bArr.length == 0 || bArr.length > 65536) {
            c80.m680x("Native activation envelope size is invalid");
            return null;
        }
        File fileM4695g0 = m4695g0();
        m4663H(fileM4695g0);
        try {
            FileChannel fileChannelM4676U = m4676U(fileM4695g0);
            try {
                FileLock fileLockLock = fileChannelM4676U.lock();
                try {
                    File fileM4680Y = m4680Y(fileM4695g0);
                    ud0 ud0VarM4705l0 = m4705l0(fileM4695g0, file, j);
                    C0043b5 c0043b5 = (C0043b5) ud0VarM4705l0.f11239b;
                    h80 h80Var = (h80) c0043b5.f562i;
                    File file2 = (File) c0043b5.f563j;
                    File file3 = new File(file2.getParentFile(), "activation.json");
                    up0.m5543h(m4695g0().toPath(), file3.toPath(), bArr);
                    File file4 = (File) ud0VarM4705l0.f11240c;
                    ql1 ql1Var = new ql1(fileM4680Y, file2, file4, h80Var.f3891a, h80Var.f3892b, h80Var.f3896f, j, file3, (String) c0043b5.f564k, file4.length(), (String) h80Var.f3899i, h80Var.f3897g);
                    if (fileLockLock != null) {
                        fileLockLock.close();
                    }
                    fileChannelM4676U.close();
                    return ql1Var;
                } finally {
                }
            } finally {
            }
        } catch (SecurityException e) {
            throw e;
        } catch (Exception e2) {
            throw new SecurityException("Unable to stage Native release", e2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m4704l(zt0 zt0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1236207254);
        int i2 = 2;
        int i3 = (go0Var.m1976d(zt0Var.ordinal()) ? 4 : 2) | i;
        if (go0Var.m1958O(i3 & 1, (i3 & 3) != 2)) {
            long jM4656A = m4656A(zt0Var);
            rh1 rh1Var = rh1.f9587a;
            uh1 uh1VarM1896n = gf1.m1896n(ci0.m825z(AbstractC0731te.m5211g0(rh1Var, 34.0f), gb2.m1827a(11.0f)), C0363ju.m2565b(0.14f, jM4656A), sp0.f10267h);
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
            int iOrdinal = zt0Var.ordinal();
            if (iOrdinal == 0) {
                go0Var.m1966W(-1931771872);
                fx0.m1724a(AbstractC0570p7.m3785u(), AbstractC0731te.m5211g0(rh1Var, 18.0f), jM4656A, go0Var, 432);
                go0Var.m1994p(false);
            } else if (iOrdinal == 1) {
                go0Var.m1966W(-1931764025);
                AbstractC0179eu.m1446a("-", null, new m13(jM4656A, rg3.m4450D(18), im0.f4683m, 0L, 0, rg3.m4450D(18), null, null, 16646136), 0, false, 0, 0, go0Var, 6, 1018);
                go0Var.m1994p(false);
            } else if (iOrdinal != 2) {
                go0Var.m1966W(-1931772975);
                go0Var.m1994p(false);
                c80.m675s();
                return;
            } else {
                go0Var.m1966W(-1931754137);
                AbstractC0179eu.m1446a("!", null, new m13(jM4656A, rg3.m4450D(18), im0.f4683m, 0L, 0, rg3.m4450D(18), null, null, 16646136), 0, false, 0, 0, go0Var, 6, 1018);
                go0Var.m1994p(false);
            }
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new bt0(zt0Var, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX INFO: renamed from: l0 */
    public static ud0 m4705l0(File file, File file2, long j) throws IOException {
        ?? r1;
        C0043b5 c0043b5M6440f = zl1.m6440f(file2, file);
        h80 h80Var = (h80) c0043b5M6440f.f562i;
        File file3 = new File(((File) c0043b5M6440f.f563j).getParentFile(), "release.nkr");
        if (file3.equals(file2)) {
            return new ud0(j, c0043b5M6440f, file3, null);
        }
        Path path = m4695g0().toPath();
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
                        up0.m5542g(path, pathCreateTempFile, file3.toPath());
                        C0043b5 c0043b5M6440f2 = zl1.m6440f(file3, file);
                        h80 h80Var2 = (h80) c0043b5M6440f2.f562i;
                        if (h80Var2.f3891a.equals(h80Var.f3891a) && h80Var2.f3892b == h80Var.f3892b && ((String) c0043b5M6440f2.f564k).equals((String) c0043b5M6440f.f564k)) {
                            return new ud0(j, c0043b5M6440f2, file3, null);
                        }
                        Files.deleteIfExists(file3.toPath());
                        c80.m680x("Native release changed while being staged");
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

    /* JADX INFO: renamed from: m */
    public static final void m4706m(zt0 zt0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-780804606);
        int i2 = (go0Var.m1976d(zt0Var.ordinal()) ? 4 : 2) | i;
        int i3 = 1;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            m4696h(m4671P(zt0Var, go0Var), zt0Var, go0Var, (i2 << 3) & 112);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new bt0(zt0Var, i, i3);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static File m4707m0(InputStream inputStream, String str, long j, String str2, rl1 rl1Var) {
        Path path;
        Path path2;
        if (str.matches("[0-9a-fA-F-]{36}") && j > 0) {
            long j2 = 67108864;
            if (j <= 67108864 && str2.matches("[0-9a-f]{64}")) {
                File fileM4695g0 = m4695g0();
                File file = new File(fileM4695g0, "downloads");
                m4663H(file);
                File file2 = new File(file, str + "-" + str2 + ".nkr");
                try {
                    Path path3 = fileM4695g0.toPath();
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
                                        String strM4667L = m4667L(messageDigest.digest());
                                        if (j3 != j || !strM4667L.equals(str2)) {
                                            throw new SecurityException("Native release download digest mismatch");
                                        }
                                        up0.m5542g(path3, pathCreateTempFile, file2.toPath());
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
                                            rl1Var2.f9634a.mo12g(Long.valueOf(j3), Long.valueOf(j));
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
                    } catch (SecurityException e) {
                        e = e;
                        path2 = pathCreateTempFile;
                        if (path2 != null) {
                            try {
                                Files.deleteIfExists(path2);
                            } catch (Exception unused2) {
                            }
                        }
                        throw e;
                    } catch (Exception e2) {
                        e = e2;
                        path = pathCreateTempFile;
                        if (path != null) {
                            try {
                                Files.deleteIfExists(path);
                            } catch (Exception unused3) {
                            }
                        }
                        throw new SecurityException("Unable to store Native package download", e);
                    }
                } catch (SecurityException e3) {
                    e = e3;
                    path2 = null;
                } catch (Exception e4) {
                    e = e4;
                    path = null;
                }
            }
        }
        c80.m680x("Native release download metadata is invalid");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final void m4708n(List list, InterfaceC0596px interfaceC0596px, int i) {
        final int i2;
        final int i3;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-802516022);
        int i4 = 4;
        int i5 = (go0Var.m1980f(list) ? 4 : 2) | i;
        final int i6 = 0;
        if (go0Var.m1958O(i5 & 1, (i5 & 3) != 2)) {
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (((xt0) it.next()).f13170d == zt0.f14090h && (i2 = i2 + 1) < 0) {
                        AbstractC0179eu.m1445Z();
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
                    if (((xt0) it2.next()).f13170d == zt0.f14091i && (i3 = i3 + 1) < 0) {
                        AbstractC0179eu.m1445Z();
                        throw null;
                    }
                }
            } else {
                i3 = 0;
            }
            if (list == null || !list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    if (((xt0) it3.next()).f13170d == zt0.f14092j && (i6 = i6 + 1) < 0) {
                        AbstractC0179eu.m1445Z();
                        throw null;
                    }
                }
            }
            AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.home_settings_hooker_debug_summary, go0Var), xe1.m6126i0(-590539927, new mn0() { // from class: ut0
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    go0 go0Var2 = (go0) interfaceC0596px2;
                    if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        uh1 uh1VarM1612D = fg1.m1612D(AbstractC0731te.f10693e, 14.0f, 12.0f);
                        ob2 ob2VarM3265a = nb2.m3265a(new C0884xf(8.0f, new C0676s(2)), C0700sn.f10232t, go0Var2, 54);
                        int iHashCode = Long.hashCode(go0Var2.f3614T);
                        yy1 yy1VarM1990l = go0Var2.m1990l();
                        uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, uh1VarM1612D);
                        InterfaceC0293hx.f4166c.getClass();
                        C0367jy c0367jy = C0256gx.f3727b;
                        go0Var2.m1969Z();
                        if (go0Var2.f3613S) {
                            go0Var2.m1989k(c0367jy);
                        } else {
                            go0Var2.m1987i0();
                        }
                        yf3.m6268c(go0Var2, C0256gx.f3730e, ob2VarM3265a);
                        yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l);
                        yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode));
                        yf3.m6267b(go0Var2, C0256gx.f3732g);
                        yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M);
                        s11.m4696h(rg3.m4463Q(R.string.home_settings_hooker_debug_normal_count, new Object[]{Integer.valueOf(i2)}, go0Var2), zt0.f14090h, go0Var2, 48);
                        s11.m4696h(rg3.m4463Q(R.string.home_settings_hooker_debug_unavailable_count, new Object[]{Integer.valueOf(i3)}, go0Var2), zt0.f14091i, go0Var2, 48);
                        s11.m4696h(rg3.m4463Q(R.string.home_settings_hooker_debug_locked_count, new Object[]{Integer.valueOf(i6)}, go0Var2), zt0.f14092j, go0Var2, 48);
                        go0Var2.m1994p(true);
                    } else {
                        go0Var2.m1961R();
                    }
                    return a83.f116a;
                }
            }, go0Var), go0Var, 384, 1);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0601q1(list, i, i4);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static final uh1 m4709n0(uh1 uh1Var, dq1 dq1Var, vz2 vz2Var, wz2 wz2Var, j10 j10Var) {
        return uh1Var.mo4491c(new ez2(dq1Var, vz2Var, wz2Var, j10Var));
    }

    /* JADX INFO: renamed from: o */
    public static final void m4710o(s62 s62Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var;
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(452879372);
        int i2 = i | (go0Var2.m1980f(s62Var) ? 4 : 2);
        if (go0Var2.m1958O(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) go0Var2.m1988j(AbstractC0646r7.f9411b);
            rh1 rh1Var = rh1.f9587a;
            uh1 uh1VarM5211g0 = AbstractC0731te.m5211g0(rh1Var, 42.0f);
            fb2 fb2Var = gb2.f3387a;
            uh1 uh1VarM825z = ci0.m825z(uh1VarM5211g0, fb2Var);
            tu2 tu2Var = ur1.f11452a;
            uh1 uh1VarM1896n = gf1.m1896n(uh1VarM825z, C0363ju.m2565b(0.14f, ((lp1) go0Var2.m1988j(tu2Var)).f6239g), sp0.f10267h);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
            int iHashCode = Long.hashCode(go0Var2.f3614T);
            yy1 yy1VarM1990l = go0Var2.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, uh1VarM1896n);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var2.m1969Z();
            if (go0Var2.f3613S) {
                go0Var2.m1989k(c0367jy);
            } else {
                go0Var2.m1987i0();
            }
            yf3.m6268c(go0Var2, C0256gx.f3730e, nf1VarM1060d);
            yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var2, C0256gx.f3732g);
            yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M);
            Character chM4001n0 = pv2.m4001n0(pv2.m3993I0(s62Var.f9945b).toString());
            String strValueOf = chM4001n0 != null ? String.valueOf(Character.toUpperCase(chM4001n0.charValue())) : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            m13 m13Var = new m13(((lp1) go0Var2.m1988j(tu2Var)).f6239g, rg3.m4450D(15), im0.f4683m, 0L, 0, 0L, null, null, 16777208);
            go0Var = go0Var2;
            AbstractC0179eu.m1446a(strValueOf, null, m13Var, 0, false, 0, 0, go0Var, 0, 1018);
            if (pv2.m4006s0(s62Var.f9946c)) {
                go0Var.m1966W(283507292);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(282833321);
                uh1 uh1VarM825z2 = ci0.m825z(AbstractC0731te.m5211g0(rh1Var, 42.0f), fb2Var);
                Object objM1956L = go0Var.m1956L();
                C0160eb c0160eb = C0520nx.f7360a;
                if (objM1956L == c0160eb) {
                    objM1956L = new C0829w(16);
                    go0Var.m1981f0(objM1956L);
                }
                in0 in0Var = (in0) objM1956L;
                boolean zM1984h = go0Var.m1984h(context) | ((i2 & 14) == 4);
                Object objM1956L2 = go0Var.m1956L();
                if (zM1984h || objM1956L2 == c0160eb) {
                    objM1956L2 = new C0115d2(2, context, s62Var);
                    go0Var.m1981f0(objM1956L2);
                }
                pp0.m3904b(in0Var, uh1VarM825z2, (in0) objM1956L2, go0Var, 6, 0);
                go0Var.m1994p(false);
            }
            go0Var.m1994p(true);
        } else {
            go0Var = go0Var2;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0686s9(i, 2, s62Var);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static C0043b5 m4711o0(int i, sh0 sh0Var) {
        return new C0043b5(new C0158e9(i, 6), sh0Var, f9863c, 11, false);
    }

    /* JADX INFO: renamed from: p */
    public static final void m4712p(s62 s62Var, boolean z, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(986982458);
        int i2 = i | (go0Var.m1980f(s62Var) ? 4 : 2) | (go0Var.m1982g(z) ? 32 : 16) | (go0Var.m1984h(in0Var) ? 256 : 128);
        int i3 = 0;
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            yi0 yi0Var = AbstractC0731te.f10693e;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objM1956L = go0Var.m1956L();
            if (z2 || objM1956L == C0520nx.f7360a) {
                objM1956L = new C0619qh(i3, in0Var, z);
                go0Var.m1981f0(objM1956L);
            }
            uh1 uh1VarM1612D = fg1.m1612D(AbstractC0738tl.m5287O(yi0Var, (xm0) objM1956L), 6.0f, 10.0f);
            ob2 ob2VarM3265a = nb2.m3265a(tp0.f10874a, C0700sn.f10232t, go0Var, 48);
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
            C0419lc c0419lc = C0256gx.f3730e;
            yf3.m6268c(go0Var, c0419lc, ob2VarM3265a);
            C0419lc c0419lc2 = C0256gx.f3729d;
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C0419lc c0419lc3 = C0256gx.f3731f;
            yf3.m6268c(go0Var, c0419lc3, numValueOf);
            C0799v6 c0799v6 = C0256gx.f3732g;
            yf3.m6267b(go0Var, c0799v6);
            C0419lc c0419lc4 = C0256gx.f3728c;
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M);
            m4710o(s62Var, go0Var, i2 & 14);
            rh1 rh1Var = rh1.f9587a;
            rp0.m4529O(go0Var, AbstractC0731te.m5231q0(rh1Var, 12.0f));
            g71 g71Var = new g71(1.0f, true);
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var, 0);
            int iHashCode2 = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l2 = go0Var.m1990l();
            uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, g71Var);
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, c0419lc, c0032avM6346a);
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l2);
            vi0.m5698q(iHashCode2, go0Var, c0419lc3, go0Var, c0799v6);
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M2);
            String str = s62Var.f9945b;
            tu2 tu2Var = ur1.f11452a;
            AbstractC0179eu.m1446a(str, null, new m13(((lp1) go0Var.m1988j(tu2Var)).f6237e, rg3.m4450D(14), im0.f4682l, 0L, 0, rg3.m4450D(19), null, null, 16646136), 2, false, 1, 0, go0Var, 1597440, 938);
            AbstractC0179eu.m1446a(rg3.m4462P(s62Var.f9947d ? R.string.auto_receive_redpacket_group : R.string.auto_receive_redpacket_friend, go0Var) + " · " + s62Var.f9944a, null, new m13(((lp1) go0Var.m1988j(tu2Var)).f6238f, rg3.m4450D(11), null, 0L, 0, rg3.m4450D(16), null, null, 16646140), 2, false, 1, 0, go0Var, 1597440, 938);
            go0Var.m1994p(true);
            rp0.m4529O(go0Var, AbstractC0731te.m5231q0(rh1Var, 10.0f));
            AbstractC0731te.m5210g(z, in0Var, null, false, go0Var, (i2 >> 3) & 126);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0656rh(s62Var, z, in0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m4713p0(h12 h12Var, long j, in0 in0Var, boolean z) {
        MotionEvent motionEventM2043a = h12Var.m2043a();
        if (motionEventM2043a == null) {
            C0676s.m4651j("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventM2043a.getAction();
        if (z) {
            motionEventM2043a.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventM2043a.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        in0Var.mo5j(motionEventM2043a);
        motionEventM2043a.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventM2043a.setAction(action);
    }

    /* JADX INFO: renamed from: q */
    public static final void m4714q(boolean z, Set set, xm0 xm0Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(2146883938);
        int i2 = i | (go0Var.m1982g(z) ? 4 : 2) | (go0Var.m1980f(set) ? 32 : 16) | (go0Var.m1984h(in0Var) ? 2048 : 1024);
        int i3 = 0;
        if (go0Var.m1958O(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            Object obj = objM1956L;
            if (objM1956L == c0160eb) {
                nx1 nx1VarM3598u = op0.m3598u("");
                go0Var.m1981f0(nx1VarM3598u);
                obj = nx1VarM3598u;
            }
            xk1 xk1Var = (xk1) obj;
            boolean z2 = (i2 & 112) == 32;
            Object objM1956L2 = go0Var.m1956L();
            Object obj2 = objM1956L2;
            if (z2 || objM1956L2 == c0160eb) {
                nx1 nx1VarM3598u2 = op0.m3598u(set);
                go0Var.m1981f0(nx1VarM3598u2);
                obj2 = nx1VarM3598u2;
            }
            xk1 xk1Var2 = (xk1) obj2;
            Object objM1956L3 = go0Var.m1956L();
            Object obj3 = objM1956L3;
            if (objM1956L3 == c0160eb) {
                kx1 kx1Var = new kx1(0);
                go0Var.m1981f0(kx1Var);
                obj3 = kx1Var;
            }
            kx1 kx1Var2 = (kx1) obj3;
            Object objM1956L4 = go0Var.m1956L();
            Object obj4 = objM1956L4;
            if (objM1956L4 == c0160eb) {
                nx1 nx1VarM3598u3 = op0.m3598u(v62.f11797a);
                go0Var.m1981f0(nx1VarM3598u3);
                obj4 = nx1VarM3598u3;
            }
            xk1 xk1Var3 = (xk1) obj4;
            Integer numValueOf = Integer.valueOf(kx1Var2.m2759g());
            Object objM1956L5 = go0Var.m1956L();
            boolean z3 = false;
            Object obj5 = objM1956L5;
            if (objM1956L5 == c0160eb) {
                C0886xh c0886xh = new C0886xh(xk1Var3, z3 ? 1 : 0, i3);
                go0Var.m1981f0(c0886xh);
                obj5 = c0886xh;
            }
            AbstractC0179eu.m1456f(go0Var, (mn0) obj5, numValueOf);
            w62 w62Var = (w62) xk1Var3.getValue();
            u62 u62Var = w62Var instanceof u62 ? (u62) w62Var : null;
            Iterable iterable = u62Var != null ? u62Var.f11118a : null;
            if (iterable == null) {
                iterable = be0.f819h;
            }
            String string = pv2.m3993I0((String) xk1Var.getValue()).toString();
            boolean zM1980f = go0Var.m1980f(iterable) | go0Var.m1980f(string);
            Object objM1956L6 = go0Var.m1956L();
            Object obj6 = objM1956L6;
            if (zM1980f || objM1956L6 == c0160eb) {
                if (!pv2.m4006s0(string)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj7 : iterable) {
                        s62 s62Var = (s62) obj7;
                        if (pv2.m3995h0(s62Var.f9945b, string, true) || pv2.m3995h0(s62Var.f9944a, string, true)) {
                            arrayList.add(obj7);
                        }
                    }
                    iterable = arrayList;
                }
                go0Var.m1981f0(iterable);
                obj6 = iterable;
            }
            qp0.m4249d(true, xm0Var, null, rg3.m4462P(z ? R.string.auto_receive_redpacket_select_whitelist_title : R.string.auto_receive_redpacket_select_blacklist_title, go0Var), null, xe1.m6126i0(1316803429, new C0313ih(xm0Var, in0Var, xk1Var2, i3), go0Var), xe1.m6126i0(-1241668978, new C0350jh((List) obj6, xk1Var2, xk1Var, xk1Var3, kx1Var2, 0), go0Var), go0Var, 1769526, 20);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0387kh(z, set, xm0Var, in0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static final long m4715q0(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    /* JADX INFO: renamed from: r */
    public static final Boolean m4716r(JsObject jsObject, String str) {
        Object obj = jsObject.get((Object) str);
        if (obj == null) {
            return null;
        }
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool;
        }
        c80.m672p("INVALID_ARGUMENT", str.concat(" must be a boolean."), 0, null, null, 28);
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m4717r0(long j, C0043b5 c0043b5, File file, File file2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("v", 2);
        jSONObject.put("sequence", j);
        h80 h80Var = (h80) c0043b5.f562i;
        jSONObject.put("releaseId", h80Var.f3891a);
        jSONObject.put("generation", h80Var.f3892b);
        jSONObject.put("kid", h80Var.f3896f);
        jSONObject.put("packageSha256", (String) c0043b5.f564k);
        jSONObject.put("packageLength", file2.length());
        jSONObject.put("packageFile", file2.getAbsolutePath());
        jSONObject.put("engineSha256", (String) h80Var.f3899i);
        jSONObject.put("engineSize", h80Var.f3897g);
        jSONObject.put("engineFile", ((File) c0043b5.f563j).getAbsolutePath());
        up0.m5543h(file.toPath(), new File(file, "active.json").toPath(), jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: s */
    public static int m4718s(int i, String str, String str2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/fs/selinux/access", "rw");
        try {
            String str3 = str + " " + str2 + " " + i;
            Charset charset = AbstractC0856wq.f12612a;
            byte[] bytes = str3.getBytes(charset);
            bytes.getClass();
            Os.write(randomAccessFile.getFD(), bytes, 0, bytes.length);
            byte[] bArr = new byte[64];
            int i2 = randomAccessFile.read(bArr);
            if (i2 <= 0) {
                randomAccessFile.close();
                return 0;
            }
            String str4 = (String) AbstractC0142du.m1161q0(pv2.m3988D0(pv2.m3993I0(new String(bArr, 0, i2, charset)).toString(), new String[]{" "}));
            if (str4 == null) {
                str4 = "0";
            }
            int unsignedInt = Integer.parseUnsignedInt(str4, 16);
            randomAccessFile.close();
            return unsignedInt;
        } finally {
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static void m4719s0(C0929yn c0929yn, int i, long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i2 = (iNumberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        c0929yn.m6297i(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            c0929yn.m6297i((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: t */
    public static AbstractC0708su m4720t(AbstractC0708su abstractC0708su) {
        qd3 qd3Var = pp0.f8436e;
        if (tp0.m5371s(abstractC0708su.f10369b, 12884901888L)) {
            ka2 ka2Var = (ka2) abstractC0708su;
            qd3 qd3Var2 = ka2Var.f5419d;
            if (!m4657B(qd3Var2, qd3Var)) {
                return new ka2(ka2Var.f10368a, ka2Var.f5423h, qd3Var, m4672Q(m4726y(C0337j5.f4892c.f4894b, qd3Var2.m4147a(), qd3Var.m4147a()), ka2Var.f5424i), ka2Var.f5426k, ka2Var.f5429n, ka2Var.f5420e, ka2Var.f5421f, ka2Var.f5422g, -1);
            }
        }
        return abstractC0708su;
    }

    /* JADX INFO: renamed from: t0 */
    public static void m4721t0(C0929yn c0929yn, int i, long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i2 = (iNumberOfLeadingZeros + 7) >> 3;
        c0929yn.m6297i(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            c0929yn.m6297i((byte) j);
            j >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: u */
    public static w80 m4722u(w80... w80VarArr) {
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
            if (w80VarArr[i2].f12393a) {
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
            if (w80VarArr[i3].f12394b) {
                break;
            }
            i3++;
        }
        String strM3992H0 = pv2.m3992H0(AbstractC0460mg.m3101p0(w80VarArr, "+", new C0251gs(11), 30), 96);
        int length3 = w80VarArr.length;
        while (true) {
            if (i >= length3) {
                w80Var = null;
                break;
            }
            w80Var = w80VarArr[i];
            String str = w80Var.f12396d;
            if (str != null && !pv2.m4006s0(str)) {
                break;
            }
            i++;
        }
        return new w80(z2, z, strM3992H0, w80Var != null ? w80Var.f12396d : null);
    }

    /* JADX INFO: renamed from: v */
    public static final o62 m4723v(c61 c61Var) {
        c61 c61VarMo650j = c61Var.mo650j();
        return c61VarMo650j != null ? c61VarMo650j.mo644J(c61Var, true) : new o62(0.0f, 0.0f, (int) (c61Var.mo645L() >> 32), (int) (c61Var.mo645L() & 4294967295L));
    }

    /* JADX INFO: renamed from: w */
    public static final o62 m4724w(c61 c61Var, boolean z) {
        c61 c61VarM4665J = m4665J(c61Var);
        float fMo645L = (int) (c61VarM4665J.mo645L() >> 32);
        float fMo645L2 = (int) (c61VarM4665J.mo645L() & 4294967295L);
        o62 o62VarMo644J = c61VarM4665J.mo644J(c61Var, z);
        float f = o62VarMo644J.f7536a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fMo645L) {
                f = fMo645L;
            }
        }
        float f2 = o62VarMo644J.f7537b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fMo645L2) {
                f2 = fMo645L2;
            }
        }
        float f3 = o62VarMo644J.f7538c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fMo645L) {
                fMo645L = f3;
            }
            f3 = fMo645L;
        }
        float f4 = o62VarMo644J.f7539d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fMo645L2) {
                fMo645L2 = f5;
            }
            f4 = fMo645L2;
        }
        if (f == f3 || f2 == f4) {
            return o62.f7535e;
        }
        long jMo649h = c61VarM4665J.mo649h((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo649h2 = c61VarM4665J.mo649h((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo649h3 = c61VarM4665J.mo649h((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jMo649h4 = c61VarM4665J.mo649h((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo649h >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo649h2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo649h4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo649h3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo649h & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo649h2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo649h4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo649h3 & 4294967295L));
        return new o62(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX INFO: renamed from: x */
    public static w80 m4725x(String str, String str2, String str3, String str4) {
        Object x92Var;
        Object x92Var2;
        Method declaredMethod;
        try {
            Class clsM4699i0 = m4699i0();
            if (clsM4699i0 == null || (declaredMethod = clsM4699i0.getDeclaredMethod("checkSELinuxAccess", String.class, String.class, String.class, String.class)) == null) {
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
            int i = Integer.parseInt(pv2.m3993I0(wi0.m5900f0(new File("/sys/fs/selinux/class/" + str3 + "/index"))).toString());
            StringBuilder sb = new StringBuilder("/sys/fs/selinux/class/");
            sb.append(str3);
            sb.append("/perms/");
            sb.append(str4);
            x92Var2 = new w80((m4718s(i, str, str2) & (1 << (Integer.parseInt(pv2.m3993I0(wi0.m5900f0(new File(sb.toString()))).toString()) - 1))) != 0, true, "selinuxfs", null);
        } catch (Throwable th2) {
            x92Var2 = new x92(th2);
        }
        Throwable thM6237a = y92.m6237a(x92Var2);
        if (thM6237a != null) {
            x92Var2 = new w80(false, false, "selinuxfs", thM6237a.getClass().getSimpleName());
        }
        return (w80) x92Var2;
    }

    /* JADX INFO: renamed from: y */
    public static final float[] m4726y(float[] fArr, float[] fArr2, float[] fArr3) {
        m4673R(fArr, fArr2);
        m4673R(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrM4669N = m4669N(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return m4672Q(fArrM4669N, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    /* JADX INFO: renamed from: z */
    public static final void m4727z(e41 e41Var, a31 a31Var, String str, w80 w80Var) {
        e41 e41Var2 = new e41();
        boolean z = w80Var.f12393a;
        e41Var2.m1248b("hit", Boolean.valueOf(z));
        e41Var2.m1248b("available", Boolean.valueOf(w80Var.f12394b));
        e41Var2.m1250d("method", w80Var.f12395c);
        String str2 = w80Var.f12396d;
        if (str2 != null && !pv2.m4006s0(str2)) {
            e41Var2.m1250d("error", str2);
        }
        e41Var.f2304h.put(str, e41Var2);
        if (z) {
            a31Var.f43h.add(new j41(str));
        }
    }

    public int hashCode() {
        switch (this.f9867a) {
            case 26:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f9867a) {
            case 26:
                String strM591c = d72.m967a(getClass()).m591c();
                strM591c.getClass();
                return strM591c;
            default:
                return super.toString();
        }
    }
}
