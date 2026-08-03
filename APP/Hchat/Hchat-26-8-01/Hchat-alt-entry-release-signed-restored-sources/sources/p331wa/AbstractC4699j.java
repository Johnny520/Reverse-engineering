package p331wa;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p129ig.AbstractC2043a;
import p219oh.AbstractC3165h;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: wa.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4699j {

    /* JADX INFO: renamed from: a */
    public static volatile C4696g f15695a;

    /* JADX INFO: renamed from: b */
    public static final Map f15696b = AbstractC3199a.m6843p();

    /* JADX INFO: renamed from: c */
    public static final CopyOnWriteArrayList f15697c = new CopyOnWriteArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m9237a(String str, int i9, int i10, int i11, String str2, InterfaceC4697h interfaceC4697h) {
        Throwable th2;
        JSONObject jSONObject;
        byte[] bArrM5043q;
        C4696g c4696g;
        C4695f c4695f;
        JSONObject jSONObjectOptJSONObject;
        InterfaceC4697h interfaceC4697h2 = interfaceC4697h;
        C4696g c4696g2 = f15695a;
        if (c4696g2 != null) {
            C4694e c4694e = c4696g2.f15690f;
            try {
                jSONObject = new JSONObject((str2 == null || str2.trim().isEmpty()) ? "{}" : str2);
                try {
                    if (i9 == 522) {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("2");
                        if (jSONArrayOptJSONArray != null) {
                            for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i12);
                                if (jSONObjectOptJSONObject2 != null) {
                                    AbstractC3165h.m6780g(jSONObjectOptJSONObject2);
                                }
                            }
                        } else {
                            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("2");
                            if (jSONObjectOptJSONObject3 != null) {
                                AbstractC3165h.m6780g(jSONObjectOptJSONObject3);
                            }
                        }
                    } else if (i9 == 222) {
                        AbstractC3165h.m6769U(jSONObject);
                    } else if (i9 == 175 && (jSONObjectOptJSONObject = jSONObject.optJSONObject("3")) != null) {
                        jSONObjectOptJSONObject.put("9", String.valueOf(System.currentTimeMillis()));
                    }
                } catch (Throwable unused) {
                }
                bArrM5043q = AbstractC2043a.m5043q(jSONObject);
            } catch (Throwable th3) {
                th = th3;
            }
            if (c4696g2.m9236v(i9, str, jSONObject, interfaceC4697h2)) {
                return true;
            }
            C4695f c4695fM9226j = c4696g2.m9226j(i9, str);
            if (c4695fM9226j != null) {
                try {
                    c4694e.getClass();
                    if (i9 == 522 || i9 == 681) {
                        c4695f = c4695fM9226j;
                        c4696g = c4696g2;
                    } else {
                        c4696g = c4696g2;
                        c4695f = c4695fM9226j;
                        if (c4696g2.m9234s(c4695fM9226j, bArrM5043q, str, i9, interfaceC4697h2)) {
                            return true;
                        }
                    }
                    try {
                        interfaceC4697h2 = interfaceC4697h;
                        try {
                            if (c4696g.f15690f.m9212j(str, i9, i10, i11, bArrM5043q, interfaceC4697h2)) {
                                return true;
                            }
                            if (c4695f != null) {
                                if (c4695f.f15681c != null) {
                                    return c4696g.m9234s(c4695f, bArrM5043q, str, i9, interfaceC4697h);
                                }
                            }
                            c4696g.m9233r(interfaceC4697h, false, "通用发包未就绪(" + c4694e.m9211i() + ")，且未找到同类已抓请求");
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        interfaceC4697h2 = interfaceC4697h;
                    }
                    c4696g2 = c4696g;
                } catch (Throwable th6) {
                    th2 = th6;
                    interfaceC4697h2 = interfaceC4697h;
                }
                th2 = th;
            }
            c4696g2.m9233r(interfaceC4697h2, false, "发送失败: " + th2.getMessage());
            return false;
        }
        if (interfaceC4697h2 != null) {
            interfaceC4697h2.mo2205c("Protobuf API未就绪", false);
            return false;
        }
        return false;
    }
}
