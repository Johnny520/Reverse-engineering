package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Ns */
/* JADX INFO: loaded from: classes.dex */
public final class C0594Ns {

    /* JADX INFO: renamed from: a */
    public static final C0594Ns f1925a;

    static {
        AbstractC0295Gu.m625r(-396988122134581L);
        AbstractC0295Gu.m625r(-397043956709429L);
        f1925a = new C0594Ns();
    }

    /* JADX INFO: renamed from: a */
    public static Object m1163a(String str, String str2, AbstractC0644Oz abstractC0644Oz) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC0295Gu.m625r(-401016801458229L), str);
        jSONObject.put(AbstractC0295Gu.m625r(-399431958526005L), str2);
        String strM625r = AbstractC0295Gu.m625r(-399470613231669L);
        int i = AbstractC1450gG.f5067a;
        jSONObject.put(strM625r, AbstractC0295Gu.m625r(AbstractC1406fG.m2699Y(C1456gf.f5172p) ? -399517857871925L : -399547922642997L));
        String string = jSONObject.toString();
        AbstractC0295Gu.m625r(-399586577348661L);
        return m1167f(AbstractC0295Gu.m625r(-399646706890805L), string, abstractC0644Oz);
    }

    /* JADX INFO: renamed from: c */
    public static String m1164c(String str, String str2) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC0295Gu.m625r(-398564375132213L), str);
        jSONObject.put(AbstractC0295Gu.m625r(-398036094154805L), str2);
        String string = jSONObject.toString();
        AbstractC0295Gu.m625r(-398066158925877L);
        URLConnection uRLConnectionOpenConnection = new URL(AbstractC0295Gu.m625r(-398126288468021L).concat(C1456gf.m2791I())).openConnection();
        AbstractC0295Gu.m625r(-398946627221557L);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        try {
            httpURLConnection.setRequestMethod(AbstractC0295Gu.m625r(-398671749314613L));
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(AbstractC0295Gu.m625r(-398693224151093L), AbstractC0295Gu.m625r(-398749058725941L));
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                Charset charset = StandardCharsets.UTF_8;
                AbstractC0295Gu.m625r(-398822073169973L);
                byte[] bytes = string.getBytes(charset);
                AbstractC0295Gu.m625r(-398847842973749L);
                outputStream.write(bytes);
                outputStream.flush();
                outputStream.close();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream(), charset));
                try {
                    String strM2708h0 = AbstractC1406fG.m2708h0(bufferedReader);
                    bufferedReader.close();
                    httpURLConnection.disconnect();
                    return strM2708h0;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m1165d(String str, String str2, String str3, AbstractC0644Oz abstractC0644Oz) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC0295Gu.m625r(-399230095063093L), str2);
        jSONObject.put(AbstractC0295Gu.m625r(-399294519572533L), str3);
        String string = jSONObject.toString();
        AbstractC0295Gu.m625r(-399333174278197L);
        return m1167f(AbstractC0295Gu.m625r(-399393303820341L) + str + AbstractC0295Gu.m625r(-400076203620405L), string, abstractC0644Oz);
    }

    /* JADX INFO: renamed from: e */
    public static Object m1166e(String str, InterfaceC0190Eb interfaceC0190Eb) {
        C1498hd c1498hd = AbstractC1499he.f5282a;
        return AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0948W2(2, null, str), interfaceC0190Eb);
    }

    /* JADX INFO: renamed from: f */
    public static Object m1167f(String str, String str2, AbstractC0644Oz abstractC0644Oz) {
        C1498hd c1498hd = AbstractC1499he.f5282a;
        return AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0993X4(str, str2, null, 5), abstractC0644Oz);
    }

    /* JADX INFO: renamed from: g */
    public static Object m1168g(String str, String str2, String str3, C0950W4 c0950w4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC0295Gu.m625r(-399870045190197L), str2);
        jSONObject.put(AbstractC0295Gu.m625r(-399930174732341L), str3);
        String string = jSONObject.toString();
        AbstractC0295Gu.m625r(-398310972061749L);
        return m1167f(AbstractC0295Gu.m625r(-398371101603893L) + str + AbstractC0295Gu.m625r(-398491360688181L), string, c0950w4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1169b(String str, String str2, long j, InterfaceC1416fj interfaceC1416fj, AbstractC0233Fb abstractC0233Fb) {
        C0508Ls c0508Ls;
        if (abstractC0233Fb instanceof C0508Ls) {
            c0508Ls = (C0508Ls) abstractC0233Fb;
            int i = c0508Ls.f1664f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0508Ls.f1664f = i - Integer.MIN_VALUE;
            } else {
                c0508Ls = new C0508Ls(this, abstractC0233Fb);
            }
        }
        Object objM1133N = c0508Ls.f1662d;
        int i2 = c0508Ls.f1664f;
        if (i2 == 0) {
            AbstractC0628Oj.m1232T(objM1133N);
            C1498hd c1498hd = AbstractC1499he.f5282a;
            ExecutorC0921Vc executorC0921Vc = ExecutorC0921Vc.f2876b;
            C0551Ms c0551Ms = new C0551Ms(str, j, str2, interfaceC1416fj, null);
            c0508Ls.f1664f = 1;
            objM1133N = AbstractC0585Nj.m1133N(executorC0921Vc, c0551Ms, c0508Ls);
            EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
            if (objM1133N == enumC1453gc) {
                return enumC1453gc;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException(AbstractC0295Gu.m625r(-397331719518261L));
            }
            AbstractC0628Oj.m1232T(objM1133N);
        }
        AbstractC0295Gu.m625r(-397258705074229L);
        return objM1133N;
    }
}
