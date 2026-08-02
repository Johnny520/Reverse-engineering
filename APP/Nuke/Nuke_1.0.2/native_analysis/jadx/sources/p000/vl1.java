package p000;

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

    /* JADX INFO: renamed from: a */
    public static final et1 f12007a;

    /* JADX INFO: renamed from: b */
    public static volatile long f12008b;

    /* JADX INFO: renamed from: c */
    public static volatile String f12009c;

    static {
        dt1 dt1Var = new dt1();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        dt1Var.f2224y = wg3.m5889b(10L, timeUnit);
        timeUnit.getClass();
        dt1Var.f2225z = wg3.m5889b(30L, timeUnit);
        f12007a = new et1(dt1Var);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: a */
    public static sl1 m5712a(ql1 ql1Var, mn0 mn0Var) {
        String strM2209h = hk1.m2209h(pv2.m3994J0(BuildConfig.NUKE_API_BASE_URL, '/'), "/");
        C0093cj c0093cj = new C0093cj(4);
        c0093cj.m844s(strM2209h.concat("api/client/native/manifest"));
        c0093cj.m839n("GET", null);
        String str = f12009c;
        if (str != null) {
            c0093cj.m837l("If-None-Match", str);
        }
        k82 k82Var = new k82(c0093cj);
        et1 et1Var = f12007a;
        et1Var.getClass();
        r92 r92VarM4732h = new s52(et1Var, k82Var).m4732h();
        try {
            int i = r92VarM4732h.f9459k;
            if (i == 304) {
                r92VarM4732h.close();
                return null;
            }
            if (!r92VarM4732h.f9471w) {
                throw new IOException("manifest HTTP " + i);
            }
            u92 u92Var = r92VarM4732h.f9462n;
            long j = 65536;
            if (u92Var.mo273c() > 65536) {
                throw new SecurityException("Native activation manifest is too large");
            }
            InputStream inputStreamM5476b = u92Var.m5476b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                long j2 = 0;
                while (true) {
                    int i2 = inputStreamM5476b.read(bArr);
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
                        inputStreamM5476b.close();
                        byteArray.getClass();
                        ul1 ul1VarM5715d = m5715d(byteArray);
                        String strM2557a = r92VarM4732h.f9461m.m2557a("ETag");
                        if (strM2557a == null) {
                            strM2557a = null;
                        }
                        f12009c = strM2557a;
                        r92VarM4732h.close();
                        tl1 tl1Var = ul1VarM5715d.f11351a;
                        long j4 = tl1Var.f10828a;
                        long j5 = ql1Var.f9030g;
                        if (j4 < j5) {
                            c80.m680x("Native activation sequence was replayed");
                            return null;
                        }
                        if (j4 == j5) {
                            if (tl1Var.f10829b.equals(ql1Var.f9027d) && tl1Var.f10835h == ql1Var.f9028e) {
                                return null;
                            }
                            c80.m680x("Native activation sequence is inconsistent");
                            return null;
                        }
                        if (tl1Var.f10837j != 1 || tl1Var.f10838k > 1) {
                            c80.m680x("Native release requires a newer Bridge");
                            return null;
                        }
                        String strM5691j = vi0.m5691j("/api/client/native/releases/", tl1Var.f10829b, "/package");
                        if (!tl1Var.f10830c.equals(strM5691j)) {
                            c80.m680x("Native release package URL is invalid");
                            return null;
                        }
                        C0093cj c0093cj2 = new C0093cj(4);
                        c0093cj2.m844s(pv2.m3994J0(strM2209h, '/') + strM5691j);
                        c0093cj2.m839n("GET", null);
                        k82 k82Var2 = new k82(c0093cj2);
                        et1 et1Var2 = f12007a;
                        et1Var2.getClass();
                        r92VarM4732h = new s52(et1Var2, k82Var2).m4732h();
                        try {
                            if (!r92VarM4732h.f9471w) {
                                throw new IOException("package HTTP " + r92VarM4732h.f9459k);
                            }
                            u92 u92Var2 = r92VarM4732h.f9462n;
                            if (u92Var2.mo273c() >= 0 && u92Var2.mo273c() != tl1Var.f10832e) {
                                throw new SecurityException("Native release package length header mismatch");
                            }
                            InputStream inputStreamM5476b2 = u92Var2.m5476b();
                            String str2 = tl1Var.f10829b;
                            long j6 = tl1Var.f10832e;
                            File fileM4707m0 = mn0Var == null ? s11.m4707m0(inputStreamM5476b2, str2, j6, tl1Var.f10831d, null) : s11.m4707m0(inputStreamM5476b2, str2, j6, tl1Var.f10831d, new rl1(mn0Var));
                            r92VarM4732h.close();
                            try {
                                ql1 ql1VarM4703k0 = s11.m4703k0(fileM4707m0, ul1VarM5715d.f11353c, tl1Var.f10828a);
                                if (t11.m5086l(ql1VarM4703k0.f9027d, tl1Var.f10829b) && ql1VarM4703k0.f9028e == tl1Var.f10835h && t11.m5086l(ql1VarM4703k0.f9029f, tl1Var.f10836i) && ql1VarM4703k0.f9032i.equals(tl1Var.f10831d) && ql1VarM4703k0.f9033j == tl1Var.f10832e && t11.m5086l(ql1VarM4703k0.f9034k, tl1Var.f10833f) && ql1VarM4703k0.f9035l == tl1Var.f10834g) {
                                    return new sl1(ql1VarM4703k0, ul1VarM5715d.f11352b);
                                }
                                throw new SecurityException("Native package does not match activation manifest");
                            } finally {
                                fileM4707m0.delete();
                            }
                        } catch (Throwable th) {
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    pp0.m3916n(inputStreamM5476b, th2);
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

    /* JADX INFO: renamed from: b */
    public static byte[] m5713b(ql1 ql1Var) throws JSONException {
        File file = ql1Var.f9031h;
        if (file == null) {
            c80.m680x("Native activation proof is missing");
            return null;
        }
        if (!file.isFile() || file.length() <= 0 || file.length() > 65536) {
            c80.m680x("Native activation proof is invalid");
            return null;
        }
        ul1 ul1VarM5715d = m5715d(wi0.m5899e0(file));
        tl1 tl1Var = ul1VarM5715d.f11351a;
        if (tl1Var.f10828a == ql1Var.f9030g && tl1Var.f10829b.equals(ql1Var.f9027d) && tl1Var.f10835h == ql1Var.f9028e && tl1Var.f10836i.equals(ql1Var.f9029f) && tl1Var.f10831d.equals(ql1Var.f9032i) && tl1Var.f10832e == ql1Var.f9033j && tl1Var.f10833f.equals(ql1Var.f9034k) && tl1Var.f10834g == ql1Var.f9035l) {
            return ul1VarM5715d.f11352b;
        }
        c80.m680x("Stored Native activation proof does not match release");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m5714c(JSONObject jSONObject, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            linkedHashSet.add(itKeys.next());
        }
        if (linkedHashSet.equals(set)) {
            return;
        }
        c80.m680x("Native activation JSON shape is invalid");
    }

    /* JADX INFO: renamed from: d */
    public static ul1 m5715d(byte[] bArr) throws JSONException {
        boolean zM5086l;
        Charset charset = AbstractC0856wq.f12612a;
        JSONObject jSONObject = new JSONObject(new String(bArr, charset));
        m5714c(jSONObject, AbstractC0460mg.m3106u0(new String[]{"v", "payload", "signature"}));
        if (jSONObject.getInt("v") != 1) {
            c80.m680x("Native activation envelope version is unsupported");
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
                    c80.m680x("Native activation signature mismatch");
                    return null;
                }
                byte[] bArrPrepareActivationDirect$app = NativeCrypto.INSTANCE.prepareActivationDirect$app(bArrDecode, bArrDecode2);
                if (bArrPrepareActivationDirect$app == null) {
                    c80.m680x("Native activation signature mismatch");
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject(new String(bArrDecode, charset));
                m5714c(jSONObject2, AbstractC0460mg.m3106u0(new String[]{"v", "sequence", "releaseId", "packageUrl", "packageSha256", "packageLength", "engineSha256", "engineLength", "generation", "kid", "engineAbi", "minBridgeAbi", "minAppVersionCode", "publishedAt"}));
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
                            zM5086l = t11.m5086l(string8, lowerCase4);
                        } catch (IllegalArgumentException unused) {
                            zM5086l = false;
                        }
                        if (zM5086l) {
                            Pattern patternCompile = Pattern.compile("[0-9a-f]{64}");
                            patternCompile.getClass();
                            if (patternCompile.matcher(tl1Var.f10831d).matches()) {
                                Pattern patternCompile2 = Pattern.compile("[0-9a-f]{64}");
                                patternCompile2.getClass();
                                if (patternCompile2.matcher(tl1Var.f10833f).matches()) {
                                    Pattern patternCompile3 = Pattern.compile("[0-9a-f]{8}");
                                    patternCompile3.getClass();
                                    if (patternCompile3.matcher(tl1Var.f10836i).matches()) {
                                        long j5 = tl1Var.f10832e;
                                        if (j5 > 0 && j5 <= 67108864) {
                                            long j6 = tl1Var.f10834g;
                                            if (j6 > 0 && j6 <= 67108864) {
                                                return new ul1(tl1Var, bArrPrepareActivationDirect$app, Arrays.copyOf(bArr, bArr.length));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c80.m680x("Native activation manifest fields are invalid");
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
