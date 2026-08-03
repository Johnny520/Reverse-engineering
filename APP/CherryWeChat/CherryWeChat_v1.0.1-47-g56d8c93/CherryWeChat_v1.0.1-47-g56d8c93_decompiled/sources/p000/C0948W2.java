package p000;

import io.github.cherrywechat.network.NetworkNativeBridge;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.UnlockStatusData;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: W2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0948W2 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2971e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f2972f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0948W2(int i, InterfaceC0190Eb interfaceC0190Eb, String str) {
        super(interfaceC0190Eb);
        this.f2971e = i;
        this.f2972f = str;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f2971e) {
        }
        return ((C0948W2) mo447h(interfaceC0190Eb, interfaceC1409fc)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f2971e) {
            case 0:
                return new C0948W2(0, interfaceC0190Eb, this.f2972f);
            case 1:
                return new C0948W2(1, interfaceC0190Eb, this.f2972f);
            default:
                return new C0948W2(2, interfaceC0190Eb, this.f2972f);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        Object objM4550a;
        String strM625r;
        BufferedReader bufferedReader;
        switch (this.f2971e) {
            case 0:
                String str = this.f2972f;
                AbstractC0628Oj.m1232T(obj);
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                    C0208Et c0208Et = new C0208Et(AbstractC0295Gu.m625r(-408928131217461L), str);
                    C0208Et c0208Et2 = new C0208Et(AbstractC0295Gu.m625r(-408953901021237L), new Long(jCurrentTimeMillis));
                    String strM625r2 = AbstractC0295Gu.m625r(-408996850694197L);
                    String str2 = AbstractC1077Z2.f3441b;
                    String strM2804n = C1456gf.m2804n(AbstractC1077Z2.f3440a, AbstractC2598uq.m5110L(c0208Et, c0208Et2, new C0208Et(strM625r2, str2)), jCurrentTimeMillis, AbstractC0295Gu.m625r(-408498634487861L));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(AbstractC0295Gu.m625r(-408558764030005L), str);
                    jSONObject.put(AbstractC0295Gu.m625r(-408584533833781L), jCurrentTimeMillis);
                    jSONObject.put(AbstractC0295Gu.m625r(-408627483506741L), str2);
                    jSONObject.put(AbstractC0295Gu.m625r(-408679023114293L), strM2804n);
                    String string = jSONObject.toString();
                    AbstractC0295Gu.m625r(-408700497950773L);
                    URLConnection uRLConnectionOpenConnection = new URL(AbstractC0295Gu.m625r(-407111360051253L)).openConnection();
                    uRLConnectionOpenConnection.setDoOutput(true);
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-407338993317941L), AbstractC0295Gu.m625r(-406845072078901L));
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-406918086522933L), AbstractC0295Gu.m625r(-406961036195893L));
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-407055525476405L), str2);
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-407665410832437L), String.valueOf(jCurrentTimeMillis));
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-407716950439989L), C1456gf.m2786D());
                    OutputStream outputStream = uRLConnectionOpenConnection.getOutputStream();
                    try {
                        Charset charset = AbstractC2659w7.f9201a;
                        byte[] bytes = string.getBytes(charset);
                        AbstractC0295Gu.m625r(-407764195080245L);
                        outputStream.write(bytes);
                        outputStream.close();
                        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                        AbstractC0295Gu.m625r(-407824324622389L);
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
                        try {
                            String strM2708h0 = AbstractC1406fG.m2708h0(bufferedReader2);
                            bufferedReader2.close();
                            try {
                                C0029Am c0029Am = AbstractC2809zm.f9524a;
                                c0029Am.getClass();
                                objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(UnlockStatusData.Companion.serializer()), strM2708h0);
                                break;
                            } catch (Exception e) {
                                AbstractC0295Gu.m625r(-407910223968309L);
                                AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                                AbstractC0295Gu.m625r(-407476432271413L);
                                e.getMessage();
                                objM4550a = null;
                            }
                            ApiResponse apiResponse = (ApiResponse) objM4550a;
                            if (apiResponse != null && apiResponse.getCode() == 0) {
                                UnlockStatusData unlockStatusData = (UnlockStatusData) apiResponse.getData();
                                return new C0905V2(unlockStatusData.getContinuousDays(), unlockStatusData.getAdVersion(), unlockStatusData.getTotalCheckins(), unlockStatusData.getAdUrl(), null, unlockStatusData.isUnlocked());
                            }
                            String strM625r3 = AbstractC0295Gu.m625r(-407493612140597L);
                            if (apiResponse == null || (strM625r = apiResponse.getMsg()) == null) {
                                strM625r = AbstractC0295Gu.m625r(-407497907107893L);
                            }
                            return new C0905V2(0, 0, 0, strM625r3, strM625r, false);
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return new C0905V2(0, 0, 0, AbstractC0295Gu.m625r(-407519381944373L), AbstractC0295Gu.m625r(-407523676911669L), false);
                }
            case 1:
                String str3 = this.f2972f;
                AbstractC0628Oj.m1232T(obj);
                try {
                    URLConnection uRLConnectionOpenConnection2 = new URL(str3).openConnection();
                    AbstractC0295Gu.m625r(-160335424124981L);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection.setRequestMethod(AbstractC0295Gu.m625r(-160060546218037L));
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setRequestProperty(AbstractC0295Gu.m625r(-160077726087221L), AbstractC0295Gu.m625r(-160124970727477L));
                    String strM1327e = C0668Pg.m1327e(AbstractC2248ms.f7951a, httpURLConnection.getHeaderField(AbstractC0295Gu.m625r(-160176510335029L)));
                    if (strM1327e == null || AbstractC2564tz.m5059T(strM1327e)) {
                        String strM5068c0 = AbstractC2564tz.m5068c0(new URL(str3).getPath(), '/');
                        if (AbstractC2564tz.m5059T(strM5068c0)) {
                            strM5068c0 = null;
                        }
                        if (strM5068c0 != null) {
                            try {
                                strM5068c0 = URLDecoder.decode(strM5068c0, AbstractC0295Gu.m625r(-158613142239285L));
                                break;
                            } catch (Exception unused) {
                            }
                            strM1327e = strM5068c0;
                        } else {
                            strM1327e = null;
                        }
                    }
                    if (strM1327e == null || AbstractC2564tz.m5059T(strM1327e)) {
                        strM1327e = String.valueOf(System.currentTimeMillis());
                    }
                    String strReplaceAll = Pattern.compile(AbstractC0295Gu.m625r(-158638912043061L)).matcher(strM1327e).replaceAll(AbstractC0295Gu.m625r(-158711926487093L));
                    File file = AbstractC2248ms.f7952b;
                    file.mkdirs();
                    File file2 = new File(file, strReplaceAll);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file2.createNewFile();
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            AbstractC1293cr.m2555p(inputStream2, fileOutputStream);
                            fileOutputStream.close();
                            inputStream2.close();
                            httpURLConnection.disconnect();
                            return file2.getAbsolutePath();
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception unused2) {
                    AbstractC0295Gu.m625r(-158720516421685L);
                    return null;
                }
            default:
                AbstractC0628Oj.m1232T(obj);
                String strM625r4 = AbstractC0295Gu.m625r(-404491430000693L);
                String str4 = this.f2972f;
                URLConnection uRLConnectionOpenConnection3 = new URL(AbstractC0295Gu.m625r(-404517199804469L) + str4 + AbstractC0295Gu.m625r(AbstractC2564tz.m5051L(str4, strM625r4, false) ? -404500019935285L : -404508609869877L) + AbstractC0295Gu.m625r(-404091998042165L) + C1456gf.m2791I()).openConnection();
                AbstractC0295Gu.m625r(-404117767845941L);
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection3;
                try {
                    httpURLConnection2.setRequestMethod(AbstractC0295Gu.m625r(-402743378311221L));
                    Map<String, String> headers = NetworkNativeBridge.getHeaders(str4, AbstractC0295Gu.m625r(-388621525841973L));
                    for (Map.Entry<String, String> entry : headers.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    headers.get(AbstractC0295Gu.m625r(-402760558180405L));
                    headers.get(AbstractC0295Gu.m625r(-402812097787957L));
                    headers.get(AbstractC0295Gu.m625r(-402846457526325L));
                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getResponseCode() == 200 ? httpURLConnection2.getInputStream() : httpURLConnection2.getErrorStream(), StandardCharsets.UTF_8));
                } finally {
                    try {
                        return string;
                    } finally {
                    }
                }
                try {
                    String strM2708h02 = AbstractC1406fG.m2708h0(bufferedReader);
                    bufferedReader.close();
                    String string2 = AbstractC2564tz.m5051L(strM2708h02, AbstractC0295Gu.m625r(-402897997133877L), false) ? AbstractC0295Gu.m625r(-402949536741429L) : NetworkNativeBridge.decryptData(strM2708h02);
                    return string2;
                } finally {
                }
        }
    }
}
