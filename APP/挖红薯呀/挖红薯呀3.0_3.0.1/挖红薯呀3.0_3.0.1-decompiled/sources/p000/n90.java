package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class n90 {

    /* JADX INFO: renamed from: a */
    public static final n90 f4211a = new n90();

    /* JADX INFO: renamed from: b */
    private static final u60 f4212b = new x51(new a00(12));

    /* JADX INFO: renamed from: c */
    private static final u60 f4213c = new x51(new a00(13));

    /* JADX INFO: renamed from: d */
    private static final u60 f4214d = new x51(new a00(14));

    /* JADX INFO: renamed from: e */
    private static final u60 f4215e = new x51(new a00(15));

    /* JADX INFO: renamed from: f */
    private static final u60 f4216f = new x51(new a00(16));

    /* JADX INFO: renamed from: g */
    private static final u60 f4217g = new x51(new a00(17));

    /* JADX INFO: renamed from: h */
    private static final u60 f4218h = new x51(new a00(18));

    /* JADX INFO: renamed from: i */
    private static final u60 f4219i = new x51(new a00(19));

    /* JADX INFO: renamed from: j */
    private static final u60 f4220j = new x51(new a00(20));

    /* JADX INFO: renamed from: k */
    private static final u60 f4221k = new x51(new a00(11));

    /* JADX INFO: renamed from: l */
    public static final int f4222l = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private n90() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    private final String m2638A() {
        return (String) f4218h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    private final String m2639B() {
        return (String) f4215e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    private final String m2640C() {
        return (String) f4214d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    private final String m2641D() {
        return (String) f4220j.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    private final String m2642E() {
        return (String) f4221k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    private final String m2643F() {
        return (String) f4212b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    private final String m2644G() {
        return (String) f4217g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    private final String m2645H() {
        return (String) f4219i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    private final String m2646I() {
        return (String) f4213c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    private final String m2647K(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = AbstractC0959yd.f7611a;
        byte[] bytes = str2.getBytes(charset);
        bytes.getClass();
        mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
        byte[] bytes2 = str.getBytes(charset);
        bytes2.getClass();
        byte[] bArrDoFinal = mac.doFinal(bytes2);
        bArrDoFinal.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArrDoFinal) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append(m2648L(b));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    private static final CharSequence m2648L(byte b) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    private final C0504a m2649M(String str, String str2, String str3) {
        String strM4884F;
        List listAsList;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("POST");
            int i = 1;
            char c = 1;
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(8000);
            httpURLConnection.setReadTimeout(8000);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                Charset charset = AbstractC0959yd.f7611a;
                byte[] bytes = str2.getBytes(charset);
                bytes.getClass();
                outputStream.write(bytes);
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (200 > responseCode || responseCode >= 300) {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    strM4884F = errorStream != null ? w60.m4884F(new BufferedReader(new InputStreamReader(errorStream, charset), 8192)) : "";
                } else {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    inputStream.getClass();
                    strM4884F = w60.m4884F(new BufferedReader(new InputStreamReader(inputStream, charset), 8192));
                }
                httpURLConnection.disconnect();
                if (k41.m1769a0(strM4884F)) {
                    return new C0504a(false, "empty_response");
                }
                JSONObject jSONObject = new JSONObject(strM4884F);
                String strOptString = jSONObject.optString("sign", "");
                strOptString.getClass();
                if (strOptString.length() == 0) {
                    return new C0504a(false, "sign_missing");
                }
                jSONObject.remove("sign");
                Iterator<String> itKeys = jSONObject.keys();
                itKeys.getClass();
                List listM3372x = r01.m3372x(new C0553oj(new qa0(i, itKeys)));
                if (listM3372x.size() <= 1) {
                    listAsList = AbstractC0960ye.m5253W(listM3372x);
                } else {
                    Object[] array = listM3372x.toArray(new Comparable[0]);
                    Comparable[] comparableArr = (Comparable[]) array;
                    comparableArr.getClass();
                    if (comparableArr.length > 1) {
                        Arrays.sort(comparableArr);
                    }
                    array.getClass();
                    listAsList = Arrays.asList(array);
                    listAsList.getClass();
                }
                if (!strOptString.equals(m2647K(AbstractC0960ye.m5245O(listAsList, "&", null, null, new C0532o(10, jSONObject), 30), str3))) {
                    return new C0504a(false, "sign_verify_failed");
                }
                if (jSONObject.optInt("code", 0) == 200) {
                    return new C0504a(c == true ? 1 : 0, null, 2, 0 == true ? 1 : 0);
                }
                String strOptString2 = jSONObject.optString("msg", "");
                if (strOptString2.length() == 0) {
                    strOptString2 = "未知错误";
                }
                return new C0504a(false, strOptString2);
            } finally {
            }
        } catch (Exception e) {
            lb0.f3404a.m2015b("license_verify", e);
            return new C0504a(false, "network_error");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final CharSequence m2650N(JSONObject jSONObject, String str) throws UnsupportedEncodingException {
        return str + "=" + URLEncoder.encode(jSONObject.get(str).toString(), "UTF-8");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final String m2662l() {
        return ik0.f2579a.m1592a(35, 12, 4, 65, 56, 66, 95, 30, 42, 22, 26, 80, 36, 74, 64, 3, 127, 86, 4, 94, 59, 87, 17, 68, 63, 16, 47, 65, 62, 26, 28, 88, 40, 87, 6, 84, 57, 17, 22, 72, 101, 8, 24, 65);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final String m2663m() {
        return ik0.f2579a.m1592a(35, 12, 4, 65, 56, 66, 95, 30, 42, 22, 26, 80, 36, 74, 64, 3, 127, 86, 4, 94, 59, 87, 17, 68, 63, 16, 95, 71, 46, 10, 25, 87, 50, 86, 0, 89, 59);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final String m2664n() {
        return ik0.f2579a.m1592a(42, 19, 21, 72);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final String m2665o() {
        return ik0.f2579a.m1592a(36, 19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final String m2666p() {
        return ik0.f2579a.m1592a(28, 48, 35, 28, 19, 85);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final String m2667q() {
        return ik0.f2579a.m1592a(28, 48, 35, 28, 18, 85);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final String m2668r() {
        return ik0.f2579a.m1592a(51, 8, 65, 110, 39, 17, 19, 84, 37, 11, 21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final String m2669s() {
        return ik0.f2579a.m1592a(19, 19, 36, 26, 35, 29, 61, 118, 6, 57, 57, 97, 123, 74, 2, 72, 33, 78, 70, 89, 34, 79, 51, 65, 60, 16, 17, 67, 126, 55, 25, 0, 49, 79, 9, 104, 40, 12, 24, 112, 35, 32, 60, 7, 1, 43, 18, 95);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final String m2670t() {
        return ik0.f2579a.m1592a(39, 41, 54, 6, 25, 63, 58, 70, 1, 15, 35, 66, 30, 51, 3, 96, 62, 64, 30, 126, 28, 58, 17, 124, 120, 28, 40, 72, 60, 22, 10, 97, 100, 75, 50, 112, 51, 25, 65, 116, 13, 13, 64, 12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final String m2671u() {
        return ik0.f2579a.m1592a(62, 17, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    private final SharedPreferences m2672w(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(m2643F(), 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    private final String m2673z() {
        return (String) f4216f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final boolean m2674J(Context context, String str) {
        context.getClass();
        str.getClass();
        SharedPreferences sharedPreferencesM2672w = m2672w(context);
        String string = sharedPreferencesM2672w.getString(m2646I(), null);
        return string != null && string.equals(str) && sharedPreferencesM2672w.getBoolean(m2640C(), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final C0504a m2675O(Context context, String str, String str2) {
        uo0 uo0Var;
        context.getClass();
        str.getClass();
        str2.getClass();
        if (r41.m3382S(str, m2642E(), false)) {
            uo0Var = new uo0(m2638A(), m2645H());
        } else {
            if (!r41.m3382S(str, m2641D(), false)) {
                return new C0504a(false, "invalid_key_format");
            }
            uo0Var = new uo0(m2673z(), m2644G());
        }
        String str3 = (String) uo0Var.f6274d;
        String str4 = (String) uo0Var.f6275e;
        String str5 = "key=" + URLEncoder.encode(str, "UTF-8") + "&redbook_id=" + URLEncoder.encode(str2, "UTF-8");
        C0504a c0504aM2649M = m2649M(str3, str5 + "&sign=" + URLEncoder.encode(m2647K(str5, str4), "UTF-8"), str4);
        if (c0504aM2649M.m2683e()) {
            SharedPreferences.Editor editorEdit = m2672w(context).edit();
            n90 n90Var = f4211a;
            editorEdit.putString(n90Var.m2646I(), str2);
            editorEdit.putBoolean(n90Var.m2640C(), true);
            editorEdit.putString(n90Var.m2639B(), str);
            editorEdit.apply();
        }
        return c0504aM2649M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m2676v(Context context) {
        context.getClass();
        m2672w(context).edit().clear().commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final String m2677x(Context context) {
        context.getClass();
        return m2672w(context).getString(m2639B(), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final String m2678y(Context context) {
        context.getClass();
        String strM2677x = m2677x(context);
        return strM2677x == null ? "" : r41.m3382S(strM2677x, m2642E(), false) ? "Y" : "X";
    }

    /* JADX INFO: renamed from: n90$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0504a {

        /* JADX INFO: renamed from: c */
        public static final int f4223c = 0;

        /* JADX INFO: renamed from: a */
        private final boolean f4224a;

        /* JADX INFO: renamed from: b */
        private final String f4225b;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(boolean, java.lang.String):void (m)] (LINE:6) call: n90.a.<init>(boolean, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0504a(boolean z, String str, int i, AbstractC0619pl abstractC0619pl) {
            this(z, (i & 2) != 0 ? null : str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ C0504a m2679d(C0504a c0504a, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = c0504a.f4224a;
            }
            if ((i & 2) != 0) {
                str = c0504a.f4225b;
            }
            return c0504a.m2682c(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final boolean m2680a() {
            return this.f4224a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final String m2681b() {
            return this.f4225b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final C0504a m2682c(boolean z, String str) {
            return new C0504a(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public final boolean m2683e() {
            return this.f4224a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0504a)) {
                return false;
            }
            C0504a c0504a = (C0504a) obj;
            return this.f4224a == c0504a.f4224a && p30.m3002l(this.f4225b, c0504a.f4225b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final String m2684f() {
            return this.f4225b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f4224a) * 31;
            String str = this.f4225b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "VerifyResult(ok=" + this.f4224a + ", reason=" + this.f4225b + ")";
        }

        public C0504a(boolean z, String str) {
            this.f4224a = z;
            this.f4225b = str;
        }
    }
}
