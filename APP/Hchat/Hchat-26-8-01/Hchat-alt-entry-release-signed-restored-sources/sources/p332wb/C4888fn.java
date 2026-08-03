package p332wb;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p249qg.InterfaceC3599t;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p345x8.C5724q;
import p345x8.C5727t;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.fn */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4888fn extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f17224h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f17225i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f17226j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17227k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17228l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f17229m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f17230n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f17231o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f17232p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f17233q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f17234r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f17235s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f17236t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f17237u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f17238v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC1809a1 f17239w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC1809a1 f17240x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4888fn(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f17224h = context;
        this.f17225i = interfaceC1809a1;
        this.f17226j = interfaceC1809a12;
        this.f17227k = interfaceC1809a13;
        this.f17228l = interfaceC1809a14;
        this.f17229m = interfaceC1809a15;
        this.f17230n = interfaceC1809a16;
        this.f17231o = interfaceC1809a17;
        this.f17232p = interfaceC1809a18;
        this.f17233q = interfaceC1809a19;
        this.f17234r = interfaceC1809a110;
        this.f17235s = interfaceC1809a111;
        this.f17236t = interfaceC1809a112;
        this.f17237u = interfaceC1809a113;
        this.f17238v = interfaceC1809a114;
        this.f17239w = interfaceC1809a115;
        this.f17240x = interfaceC1809a116;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C4888fn(this.f17224h, this.f17225i, this.f17226j, this.f17227k, this.f17228l, this.f17229m, this.f17230n, this.f17231o, this.f17232p, this.f17233q, this.f17234r, this.f17235s, this.f17236t, this.f17237u, this.f17238v, this.f17239w, this.f17240x, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4888fn) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String c3959f;
        String strOptString;
        AbstractC1089i.m2732I0(obj);
        ExecutorService executorService = C5724q.f23297a;
        C5727t c5727tM9638q = AbstractC4955ho.m9638q(this.f17225i, this.f17226j, this.f17227k, this.f17228l, this.f17229m, this.f17230n, this.f17231o, this.f17232p, this.f17233q, this.f17234r, this.f17235s, this.f17236t, this.f17237u, this.f17238v, this.f17239w, this.f17240x);
        String string = AbstractC3149m.m6703R0(c5727tM9638q.f23318b).toString();
        if (AbstractC3149m.m6721t0(string)) {
            return "请先填写 OTA 地址";
        }
        Context context = this.f17224h;
        String strM10352X = C5724q.m10352X(context);
        String strM10351W = C5724q.m10351W(context);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("name", "xiaozhi-web-test", "version", "1.0.0");
        jSONObjectM9268l.put("idf_version", "1.0.0");
        jSONObject.put("application", jSONObjectM9268l);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("label", "xiaozhi-web");
        jSONObject.put("ota", jSONObject2);
        jSONObject.put("mac_address", strM10351W);
        try {
            Request.Builder builderAddHeader = new Request.Builder().url(string).addHeader("Content-Type", "application/json").addHeader("client-id", strM10352X).addHeader("device-id", strM10351W);
            RequestBody.Companion companion = RequestBody.Companion;
            String string2 = jSONObject.toString();
            string2.getClass();
            Response responseExecute = C5724q.f23299c.newCall(builderAddHeader.post(companion.create(string2, MediaType.Companion.get("application/json"))).build()).execute();
            try {
                ResponseBody responseBodyBody = responseExecute.body();
                String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                if (strString == null) {
                    strString = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (!responseExecute.isSuccessful() || AbstractC3149m.m6721t0(strString)) {
                    c3959f = "请求失败: HTTP " + responseExecute.code();
                } else {
                    JSONObject jSONObject3 = new JSONObject(strString);
                    if (jSONObject3.has("activation")) {
                        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("activation");
                        strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("code") : null;
                        if (strOptString != null) {
                            str = strOptString;
                        }
                        String str2 = c5727tM9638q.f23319c;
                        if (AbstractC3149m.m6721t0(str2)) {
                            str2 = "https://xiaozhi.me/console/agents";
                        }
                        c3959f = "验证码: " + str + "\n控制台: " + ((Object) str2);
                    } else if (jSONObject3.has("firmware")) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("firmware");
                        strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("version") : null;
                        if (strOptString != null) {
                            str = strOptString;
                        }
                        c3959f = AbstractC3149m.m6721t0(str) ? "设备已绑定" : "设备已绑定\n固件版本: ".concat(str);
                    } else if (jSONObject3.has("error")) {
                        c3959f = "出现错误: " + jSONObject3.optString("error");
                    } else {
                        c3959f = AbstractC3149m.m6701P0(500, strString);
                    }
                }
                responseExecute.close();
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC1184v0.m3204n("[Hchat:AutoReply] 小智设备绑定失败: " + thM8182b.getMessage(), thM8182b);
            c3959f = AbstractC4855en.m9263g("绑定失败: ", thM8182b.getMessage());
        }
        return (String) c3959f;
    }
}
