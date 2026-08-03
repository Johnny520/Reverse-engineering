package p000;

import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.CheckInResponseData;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0991X2 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3160e = 0;

    /* JADX INFO: renamed from: f */
    public int f3161f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f3162g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0991X2(int i, InterfaceC0190Eb interfaceC0190Eb, String str) {
        super(interfaceC0190Eb);
        this.f3162g = str;
        this.f3161f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f3160e) {
        }
        return ((C0991X2) mo447h(interfaceC0190Eb, interfaceC1409fc)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f3160e) {
            case 0:
                return new C0991X2(this.f3161f, interfaceC0190Eb, this.f3162g);
            default:
                return new C0991X2(this.f3162g, interfaceC0190Eb);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        Object objM4550a;
        String strM625r;
        switch (this.f3160e) {
            case 0:
                int i = this.f3161f;
                String str = this.f3162g;
                AbstractC0628Oj.m1232T(obj);
                boolean z = false;
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                    C0208Et c0208Et = new C0208Et(AbstractC0295Gu.m625r(-406110632671285L), str);
                    C0208Et c0208Et2 = new C0208Et(AbstractC0295Gu.m625r(-406136402475061L), new Integer(i));
                    C0208Et c0208Et3 = new C0208Et(AbstractC0295Gu.m625r(-406183647115317L), new Long(jCurrentTimeMillis));
                    String strM625r2 = AbstractC0295Gu.m625r(-406226596788277L);
                    String str2 = AbstractC1077Z2.f3441b;
                    String strM2804n = C1456gf.m2804n(AbstractC1077Z2.f3440a, AbstractC2598uq.m5110L(c0208Et, c0208Et2, c0208Et3, new C0208Et(strM625r2, str2)), jCurrentTimeMillis, AbstractC0295Gu.m625r(-405728380581941L));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(AbstractC0295Gu.m625r(-405788510124085L), str);
                    jSONObject.put(AbstractC0295Gu.m625r(-405814279927861L), i);
                    jSONObject.put(AbstractC0295Gu.m625r(-405861524568117L), jCurrentTimeMillis);
                    jSONObject.put(AbstractC0295Gu.m625r(-405904474241077L), str2);
                    jSONObject.put(AbstractC0295Gu.m625r(-405956013848629L), strM2804n);
                    String string = jSONObject.toString();
                    AbstractC0295Gu.m625r(-405977488685109L);
                    URLConnection uRLConnectionOpenConnection = new URL(AbstractC0295Gu.m625r(-406587374041141L)).openConnection();
                    boolean z2 = true;
                    uRLConnectionOpenConnection.setDoOutput(true);
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-406780647569461L), AbstractC0295Gu.m625r(-406286726330421L));
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-406359740774453L), AbstractC0295Gu.m625r(-406402690447413L));
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-406497179727925L), str2);
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-404908041828405L), String.valueOf(jCurrentTimeMillis));
                    uRLConnectionOpenConnection.setRequestProperty(AbstractC0295Gu.m625r(-404959581435957L), C1456gf.m2786D());
                    OutputStream outputStream = uRLConnectionOpenConnection.getOutputStream();
                    try {
                        Charset charset = AbstractC2659w7.f9201a;
                        byte[] bytes = string.getBytes(charset);
                        AbstractC0295Gu.m625r(-405006826076213L);
                        outputStream.write(bytes);
                        outputStream.close();
                        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                        AbstractC0295Gu.m625r(-405066955618357L);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
                        try {
                            String strM2708h0 = AbstractC1406fG.m2708h0(bufferedReader);
                            bufferedReader.close();
                            try {
                                C0029Am c0029Am = AbstractC2809zm.f9524a;
                                c0029Am.getClass();
                                objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(CheckInResponseData.Companion.serializer()), strM2708h0);
                                break;
                            } catch (Exception e) {
                                AbstractC0295Gu.m625r(-405152854964277L);
                                AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                                AbstractC0295Gu.m625r(-404719063267381L);
                                e.getMessage();
                                objM4550a = null;
                            }
                            ApiResponse apiResponse = (ApiResponse) objM4550a;
                            if (apiResponse == null || apiResponse.getCode() != 0) {
                                z2 = false;
                            }
                            if (apiResponse == null || (strM625r = apiResponse.getMsg()) == null) {
                                strM625r = AbstractC0295Gu.m625r(-404736243136565L);
                            }
                            return new C0862U2(strM625r, z2);
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception unused) {
                    return new C0862U2(AbstractC0295Gu.m625r(-404757717973045L), z);
                }
            default:
                int i2 = this.f3161f;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException(AbstractC0295Gu.m625r(-81308025878581L));
                    }
                    AbstractC0628Oj.m1232T(obj);
                    return obj;
                }
                AbstractC0628Oj.m1232T(obj);
                C0594Ns c0594Ns = C0594Ns.f1925a;
                String strM2791I = C1456gf.m2791I();
                this.f3161f = 1;
                c0594Ns.getClass();
                Object objM1163a = C0594Ns.m1163a(strM2791I, this.f3162g, this);
                EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
                return objM1163a == enumC1453gc ? enumC1453gc : objM1163a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0991X2(String str, InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        this.f3162g = str;
    }
}
