package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import me.dartcv.nuke.BuildConfig;
import nuke.data.cipher.NativeCrypto;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vl1 {
    public static final et1 a;
    public static volatile long b;
    public static volatile String c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        dt1 dt1Var = new dt1();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        dt1Var.y = wg3.b(10L, timeUnit);
        timeUnit.getClass();
        dt1Var.z = wg3.b(30L, timeUnit);
        a = new et1(dt1Var);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX WARN: Finally extract failed */
    public static sl1 a(ql1 ql1Var, mn0 mn0Var) {
        String strH = hk1.h(pv2.J0(BuildConfig.NUKE_API_BASE_URL, '/'), "/");
        cj cjVar = new cj(4);
        cjVar.s(strH.concat("api/client/native/manifest"));
        cjVar.n("GET", null);
        String str = c;
        if (str != null) {
            cjVar.l("If-None-Match", str);
        }
        k82 k82Var = new k82(cjVar);
        et1 et1Var = a;
        et1Var.getClass();
        r92 r92VarH = new s52(et1Var, k82Var).h();
        try {
            int i = r92VarH.k;
            if (i == 304) {
                r92VarH.close();
                return null;
            }
            if (!r92VarH.w) {
                throw new IOException("manifest HTTP " + i);
            }
            u92 u92Var = r92VarH.n;
            long j = 65536;
            if (u92Var.c() > 65536) {
                throw new SecurityException("Native activation manifest is too large");
            }
            InputStream inputStreamB = u92Var.b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                long j2 = 0;
                while (true) {
                    int i2 = inputStreamB.read(bArr);
                    long j3 = j;
                    if (i2 != -1) {
                        j2 += (long) i2;
                        if (j2 > j3) {
                            throw new SecurityException("Native activation manifest is too large");
                        }
                        byteArrayOutputStream.write(bArr, 0, i2);
                        j = j3;
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        inputStreamB.close();
                        byteArray.getClass();
                        ul1 ul1VarD = d(byteArray);
                        String strA = r92VarH.m.a("ETag");
                        if (strA == null) {
                            strA = null;
                        }
                        c = strA;
                        r92VarH.close();
                        tl1 tl1Var = ul1VarD.a;
                        long j4 = tl1Var.a;
                        long j5 = ql1Var.g;
                        if (j4 < j5) {
                            c80.x("Native activation sequence was replayed");
                            return null;
                        }
                        if (j4 == j5) {
                            if (tl1Var.b.equals(ql1Var.d) && tl1Var.h == ql1Var.e) {
                                return null;
                            }
                            c80.x("Native activation sequence is inconsistent");
                            return null;
                        }
                        if (tl1Var.j != 1 || tl1Var.k > 1) {
                            c80.x("Native release requires a newer Bridge");
                            return null;
                        }
                        String strJ = vi0.j("/api/client/native/releases/", tl1Var.b, "/package");
                        if (!tl1Var.c.equals(strJ)) {
                            c80.x("Native release package URL is invalid");
                            return null;
                        }
                        cj cjVar2 = new cj(4);
                        cjVar2.s(pv2.J0(strH, '/') + strJ);
                        cjVar2.n("GET", null);
                        k82 k82Var2 = new k82(cjVar2);
                        et1 et1Var2 = a;
                        et1Var2.getClass();
                        r92VarH = new s52(et1Var2, k82Var2).h();
                        try {
                            if (!r92VarH.w) {
                                throw new IOException("package HTTP " + r92VarH.k);
                            }
                            u92 u92Var2 = r92VarH.n;
                            if (u92Var2.c() >= 0 && u92Var2.c() != tl1Var.e) {
                                throw new SecurityException("Native release package length header mismatch");
                            }
                            InputStream inputStreamB2 = u92Var2.b();
                            String str2 = tl1Var.b;
                            long j6 = tl1Var.e;
                            File fileM0 = mn0Var == null ? s11.m0(inputStreamB2, str2, j6, tl1Var.d, null) : s11.m0(inputStreamB2, str2, j6, tl1Var.d, new rl1(mn0Var));
                            r92VarH.close();
                            try {
                                ql1 ql1VarK0 = s11.k0(fileM0, ul1VarD.c, tl1Var.a);
                                if (t11.l(ql1VarK0.d, tl1Var.b) && ql1VarK0.e == tl1Var.h && t11.l(ql1VarK0.f, tl1Var.i) && ql1VarK0.i.equals(tl1Var.d) && ql1VarK0.j == tl1Var.e && t11.l(ql1VarK0.k, tl1Var.f) && ql1VarK0.l == tl1Var.g) {
                                    return new sl1(ql1VarK0, ul1VarD.b);
                                }
                                throw new SecurityException("Native package does not match activation manifest");
                            } finally {
                                fileM0.delete();
                            }
                        } catch (Throwable th) {
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    pp0.n(inputStreamB, th2);
                    throw th3;
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] b(ql1 ql1Var) throws JSONException {
        File file = ql1Var.h;
        if (file == null) {
            c80.x("Native activation proof is missing");
            return null;
        }
        if (!file.isFile() || file.length() <= 0 || file.length() > 65536) {
            c80.x("Native activation proof is invalid");
            return null;
        }
        ul1 ul1VarD = d(wi0.e0(file));
        tl1 tl1Var = ul1VarD.a;
        if (tl1Var.a == ql1Var.g && tl1Var.b.equals(ql1Var.d) && tl1Var.h == ql1Var.e && tl1Var.i.equals(ql1Var.f) && tl1Var.d.equals(ql1Var.i) && tl1Var.e == ql1Var.j && tl1Var.f.equals(ql1Var.k) && tl1Var.g == ql1Var.l) {
            return ul1VarD.b;
        }
        c80.x("Stored Native activation proof does not match release");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(JSONObject jSONObject, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            linkedHashSet.add(itKeys.next());
        }
        if (linkedHashSet.equals(set)) {
            return;
        }
        c80.x("Native activation JSON shape is invalid");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ul1 d(byte[] bArr) throws JSONException {
        boolean zL;
        Charset charset = wq.a;
        JSONObject jSONObject = new JSONObject(new String(bArr, charset));
        c(jSONObject, mg.u0(new String[]{"v", "payload", "signature"}));
        if (jSONObject.getInt("v") != 1) {
            c80.x("Native activation envelope version is unsupported");
            return null;
        }
        String string = jSONObject.getString("payload");
        string.getClass();
        try {
            byte[] bArrDecode = Base64.getDecoder().decode(string);
            bArrDecode.getClass();
            String string2 = jSONObject.getString("signature");
            string2.getClass();
            try {
                byte[] bArrDecode2 = Base64.getDecoder().decode(string2);
                bArrDecode2.getClass();
                if (bArrDecode.length == 0 || bArrDecode.length > 65536 || bArrDecode2.length != 64) {
                    c80.x("Native activation signature mismatch");
                    return null;
                }
                byte[] bArrPrepareActivationDirect$app = NativeCrypto.INSTANCE.prepareActivationDirect$app(bArrDecode, bArrDecode2);
                if (bArrPrepareActivationDirect$app == null) {
                    c80.x("Native activation signature mismatch");
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject(new String(bArrDecode, charset));
                c(jSONObject2, mg.u0(new String[]{"v", "sequence", "releaseId", "packageUrl", "packageSha256", "packageLength", "engineSha256", "engineLength", "generation", "kid", "engineAbi", "minBridgeAbi", "minAppVersionCode", "publishedAt"}));
                long j = jSONObject2.getLong("sequence");
                String string3 = jSONObject2.getString("releaseId");
                string3.getClass();
                String string4 = jSONObject2.getString("packageUrl");
                string4.getClass();
                String string5 = jSONObject2.getString("packageSha256");
                string5.getClass();
                Locale locale = Locale.ROOT;
                String lowerCase = string5.toLowerCase(locale);
                lowerCase.getClass();
                long j2 = jSONObject2.getLong("packageLength");
                String string6 = jSONObject2.getString("engineSha256");
                string6.getClass();
                String lowerCase2 = string6.toLowerCase(locale);
                lowerCase2.getClass();
                long j3 = jSONObject2.getLong("engineLength");
                long j4 = jSONObject2.getLong("generation");
                String string7 = jSONObject2.getString("kid");
                string7.getClass();
                String lowerCase3 = string7.toLowerCase(locale);
                lowerCase3.getClass();
                tl1 tl1Var = new tl1(j, string3, string4, lowerCase, j2, lowerCase2, j3, j4, lowerCase3, jSONObject2.getInt("engineAbi"), jSONObject2.getInt("minBridgeAbi"), jSONObject2.getInt("minAppVersionCode"));
                try {
                    Instant.parse(jSONObject2.getString("publishedAt"));
                    if (jSONObject2.getInt("v") == 1 && j > 0 && j4 > 0) {
                        try {
                            String string8 = UUID.fromString(string3).toString();
                            String lowerCase4 = string3.toLowerCase(locale);
                            lowerCase4.getClass();
                            zL = t11.l(string8, lowerCase4);
                        } catch (IllegalArgumentException unused) {
                            zL = false;
                        }
                        if (zL) {
                            Pattern patternCompile = Pattern.compile("[0-9a-f]{64}");
                            patternCompile.getClass();
                            if (patternCompile.matcher(tl1Var.d).matches()) {
                                Pattern patternCompile2 = Pattern.compile("[0-9a-f]{64}");
                                patternCompile2.getClass();
                                if (patternCompile2.matcher(tl1Var.f).matches()) {
                                    Pattern patternCompile3 = Pattern.compile("[0-9a-f]{8}");
                                    patternCompile3.getClass();
                                    if (patternCompile3.matcher(tl1Var.i).matches()) {
                                        long j5 = tl1Var.e;
                                        if (j5 > 0 && j5 <= 67108864) {
                                            long j6 = tl1Var.g;
                                            if (j6 > 0 && j6 <= 67108864) {
                                                return new ul1(tl1Var, bArrPrepareActivationDirect$app, Arrays.copyOf(bArr, bArr.length));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c80.x("Native activation manifest fields are invalid");
                    return null;
                } catch (Exception e) {
                    throw new SecurityException("Native activation publish time is invalid", e);
                }
            } catch (IllegalArgumentException e2) {
                throw new SecurityException("Native activation base64 is invalid", e2);
            }
        } catch (IllegalArgumentException e3) {
            throw new SecurityException("Native activation base64 is invalid", e3);
        }
    }
}
