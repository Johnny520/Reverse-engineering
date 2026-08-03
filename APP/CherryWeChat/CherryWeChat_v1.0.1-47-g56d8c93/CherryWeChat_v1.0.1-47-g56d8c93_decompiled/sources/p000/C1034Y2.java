package p000;

import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.FAQCategory;
import io.github.cherrywechat.network.model.SubmitWxAccountData;
import io.github.cherrywechat.network.model.UpdateItem;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: Y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1034Y2 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3303e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1034Y2(int i, InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        this.f3303e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f3303e) {
            case 0:
                return new C1034Y2(0, interfaceC0190Eb).mo448i(C0829TC.f2620a);
            case 1:
                return new C1034Y2(1, interfaceC0190Eb).mo448i(C0829TC.f2620a);
            case 2:
                return new C1034Y2(2, interfaceC0190Eb).mo448i(C0829TC.f2620a);
            default:
                return new C1034Y2(3, interfaceC0190Eb).mo448i(C0829TC.f2620a);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f3303e) {
            case 0:
                return new C1034Y2(0, interfaceC0190Eb);
            case 1:
                return new C1034Y2(1, interfaceC0190Eb);
            case 2:
                return new C1034Y2(2, interfaceC0190Eb);
            default:
                return new C1034Y2(3, interfaceC0190Eb);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        Object objM4550a;
        Object objM4550a2;
        SubmitWxAccountData submitWxAccountData;
        String string;
        switch (this.f3303e) {
            case 0:
                C0452Kf c0452Kf = C0452Kf.f1484a;
                AbstractC0628Oj.m1232T(obj);
                try {
                    String strM2708h0 = AbstractC1406fG.m2708h0(new BufferedReader(new InputStreamReader(new URL(AbstractC0295Gu.m625r(-416482978691125L)).openConnection().getInputStream())));
                    try {
                        C0029Am c0029Am = AbstractC2809zm.f9524a;
                        c0029Am.getClass();
                        objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(new C0263G4(FAQCategory.Companion.serializer())), strM2708h0);
                        break;
                    } catch (Exception e) {
                        AbstractC0295Gu.m625r(-416671957252149L);
                        AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                        AbstractC0295Gu.m625r(-416238165555253L);
                        e.getMessage();
                        objM4550a = null;
                    }
                    ApiResponse apiResponse = (ApiResponse) objM4550a;
                    if (apiResponse == null || apiResponse.getCode() != 200) {
                        return c0452Kf;
                    }
                    List list = (List) apiResponse.getData();
                    return list == null ? c0452Kf : list;
                } catch (Exception unused) {
                    return c0452Kf;
                }
            case 1:
                C0452Kf c0452Kf2 = C0452Kf.f1484a;
                AbstractC0628Oj.m1232T(obj);
                try {
                    String strM2708h02 = AbstractC1406fG.m2708h0(new BufferedReader(new InputStreamReader(new URL(AbstractC0295Gu.m625r(-414502998767669L)).openConnection().getInputStream())));
                    try {
                        C0029Am c0029Am2 = AbstractC2809zm.f9524a;
                        c0029Am2.getClass();
                        objM4550a2 = c0029Am2.m4550a(ApiResponse.Companion.serializer(new C0263G4(UpdateItem.Companion.serializer())), strM2708h02);
                        break;
                    } catch (Exception e2) {
                        AbstractC0295Gu.m625r(-414155106416693L);
                        AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                        AbstractC0295Gu.m625r(-395029617047605L);
                        e2.getMessage();
                        objM4550a2 = null;
                    }
                    ApiResponse apiResponse2 = (ApiResponse) objM4550a2;
                    if (apiResponse2 == null || apiResponse2.getCode() != 200) {
                        return c0452Kf2;
                    }
                    List list2 = (List) apiResponse2.getData();
                    return list2 == null ? c0452Kf2 : list2;
                } catch (Exception unused2) {
                    return c0452Kf2;
                }
            case 2:
                AbstractC0628Oj.m1232T(obj);
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                    C1456gf c1456gf = AbstractC1077Z2.f3440a;
                    c1456gf.getClass();
                    String strM2794L = C1456gf.m2794L();
                    Object objM4550a3 = null;
                    if (strM2794L.length() <= 0) {
                        strM2794L = null;
                    }
                    if (strM2794L == null) {
                        strM2794L = C1456gf.m2791I();
                    }
                    String strM2793K = C1456gf.m2793K();
                    C0208Et c0208Et = new C0208Et(AbstractC0295Gu.m625r(-394089019209781L), strM2794L);
                    C0208Et c0208Et2 = new C0208Et(AbstractC0295Gu.m625r(-394110494046261L), strM2793K);
                    C0208Et c0208Et3 = new C0208Et(AbstractC0295Gu.m625r(-394149148751925L), new Long(jCurrentTimeMillis));
                    String strM625r = AbstractC0295Gu.m625r(-393642342610997L);
                    String str = AbstractC1077Z2.f3441b;
                    String strM2804n = C1456gf.m2804n(c1456gf, AbstractC2598uq.m5110L(c0208Et, c0208Et2, c0208Et3, new C0208Et(strM625r, str)), jCurrentTimeMillis, AbstractC0295Gu.m625r(-393693882218549L));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(AbstractC0295Gu.m625r(-393754011760693L), strM2794L);
                    jSONObject.put(AbstractC0295Gu.m625r(-393775486597173L), strM2793K);
                    jSONObject.put(AbstractC0295Gu.m625r(-393814141302837L), jCurrentTimeMillis);
                    jSONObject.put(AbstractC0295Gu.m625r(-393857090975797L), str);
                    jSONObject.put(AbstractC0295Gu.m625r(-394458386397237L), strM2804n);
                    String string2 = jSONObject.toString();
                    AbstractC0295Gu.m625r(-394479861233717L);
                    URLConnection uRLConnectionOpenConnection = new URL(AbstractC0295Gu.m625r(-394539990775861L)).openConnection();
                    uRLConnectionOpenConnection.setDoOutput(true);
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-394209278294069L), AbstractC0295Gu.m625r(-394265112868917L));
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-394338127312949L), AbstractC0295Gu.m625r(-394381076985909L));
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-392826298824757L), str);
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-392886428366901L), String.valueOf(jCurrentTimeMillis));
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-392937967974453L), C1456gf.m2786D());
                    OutputStream outputStream = uRLConnectionOpenConnection.getOutputStream();
                    try {
                        Charset charset = AbstractC2659w7.f9201a;
                        byte[] bytes = string2.getBytes(charset);
                        AbstractC0295Gu.m625r(-392985212614709L);
                        outputStream.write(bytes);
                        outputStream.close();
                        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                        AbstractC0295Gu.m625r(-393045342156853L);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
                        try {
                            String strM2708h03 = AbstractC1406fG.m2708h0(bufferedReader);
                            bufferedReader.close();
                            try {
                                C0029Am c0029Am3 = AbstractC2809zm.f9524a;
                                c0029Am3.getClass();
                                objM4550a3 = c0029Am3.m4550a(ApiResponse.Companion.serializer(SubmitWxAccountData.Companion.serializer()), strM2708h03);
                                break;
                            } catch (Exception e3) {
                                AbstractC0295Gu.m625r(-392581485688885L);
                                AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                                AbstractC0295Gu.m625r(-392697449805877L);
                                e3.getMessage();
                            }
                            ApiResponse apiResponse3 = (ApiResponse) objM4550a3;
                            if (apiResponse3 != null && (submitWxAccountData = (SubmitWxAccountData) apiResponse3.getData()) != null) {
                                return new C0862U2(true, AbstractC0295Gu.m625r(-392744694446133L), submitWxAccountData.getWxId(), new Integer(submitWxAccountData.getAdVersion()), new C0819T2(submitWxAccountData.getAdVersion(), submitWxAccountData.getContinuousDays(), submitWxAccountData.getTotalCheckins(), submitWxAccountData.getWxId(), submitWxAccountData.getAdUrl(), submitWxAccountData.isUnlocked()));
                            }
                            return new C0862U2(AbstractC0295Gu.m625r(-392714629675061L), false);
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return new C0862U2(AbstractC0295Gu.m625r(-392766169282613L), false);
                }
            default:
                AbstractC0628Oj.m1232T(obj);
                URLConnection uRLConnectionOpenConnection2 = new URL(AbstractC0295Gu.m625r(-388625820809269L).concat(C1456gf.m2791I())).openConnection();
                AbstractC0295Gu.m625r(-389119742048309L);
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection2;
                try {
                    httpURLConnection.setRequestMethod(AbstractC0295Gu.m625r(-388844864141365L));
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream(), StandardCharsets.UTF_8));
                    try {
                        string = AbstractC1406fG.m2708h0(bufferedReader2);
                        bufferedReader2.close();
                    } finally {
                    }
                } finally {
                    try {
                    } finally {
                    }
                    break;
                }
                return string;
        }
    }
}
