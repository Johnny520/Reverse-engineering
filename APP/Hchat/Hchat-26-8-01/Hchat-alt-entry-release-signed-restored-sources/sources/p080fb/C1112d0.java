package p080fb;

import cd.C0546a;
import org.json.JSONException;
import org.json.JSONObject;
import p025bc.C0257g;
import p025bc.C0259i;
import p025bc.C0260j;
import p025bc.C0261k;
import p025bc.C0262l;
import p081fc.C1201d;
import p084ff.C1217c;
import p084ff.C1218d;
import p085fg.InterfaceC1231l;
import p129ig.AbstractC2043a;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p259r9.AbstractC3754e0;
import p288tb.C4143c;

/* JADX INFO: renamed from: fb.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1112d0 {

    /* JADX INFO: renamed from: a */
    public final String f3634a;

    /* JADX INFO: renamed from: b */
    public final C1145l1 f3635b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C3147k c3147k = C1145l1.f3776e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1112d0(C1145l1 c1145l1, String str) {
        this.f3634a = str;
        this.f3635b = c1145l1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: b */
    public static String m2846b(C1137j1 c1137j1, C1103b c1103b, InterfaceC1231l interfaceC1231l) {
        c1103b.m2828d();
        String str = c1137j1.f3740a;
        String strReplace = AbstractC3149m.m6687B0(AbstractC3149m.m6686A0(str, "L"), ";").replace('/', '.');
        strReplace.getClass();
        C0257g c0257g = new C0257g();
        c0257g.f745n = Math.max(1, 1);
        c0257g.f754w = true;
        c0257g.f753v = false;
        c0257g.f750s = false;
        c0257g.f746o = true;
        c0257g.f716B = false;
        c0257g.f730P = false;
        c0257g.f742k = C1201d.f4032g;
        c0257g.f743l = new C0546a();
        c0257g.f729O = new C1108c0();
        C1217c c1217c = new C1217c();
        C1218d c1218d = new C1218d(c1217c.f4082b.m3351d(c1137j1.f3741b, c1137j1.f3742c));
        C0261k c0261k = new C0261k(c0257g);
        try {
            c0261k.f771n.add(c1218d);
            c0261k.m1041e();
            c1103b.m2828d();
            C0262l c0262l = (C0262l) c0261k.f768k.f14448n.stream().filter(new C0259i(strReplace, 0)).findFirst().map(new C0260j(c0261k, 0)).orElse(null);
            if (c0262l == null) {
                throw new IllegalArgumentException("JADX 没有找到类: " + str);
            }
            Object objInvoke = interfaceC1231l.invoke(c0262l);
            c1103b.m2828d();
            String str2 = (String) objInvoke;
            c0261k.close();
            return str2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2043a.m5035i(c0261k, th2);
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m2847a(String str, String str2, String str3, JSONObject jSONObject) throws JSONException {
        int iM6724w0;
        int iM7909r = AbstractC3754e0.m7909r(jSONObject.optInt("offset", 0), 0, str3.length());
        int iM7909r2 = AbstractC3754e0.m7909r(jSONObject.optInt("max_chars", C4143c.DEFAULT_HZ), 1000, 48000) + iM7909r;
        int length = str3.length();
        if (iM7909r2 > length) {
            iM7909r2 = length;
        }
        if (iM7909r2 < str3.length() && (iM6724w0 = AbstractC3149m.m6724w0(str3, '\n', iM7909r2 - 1, 4)) >= iM7909r + 1000) {
            iM7909r2 = iM6724w0 + 1;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ok", true);
        jSONObject2.put("descriptor", str);
        jSONObject2.put("sourceEntry", str2);
        jSONObject2.put("sourcePath", this.f3634a);
        jSONObject2.put("offset", iM7909r);
        jSONObject2.put("returnedLength", iM7909r2 - iM7909r);
        jSONObject2.put("totalLength", str3.length());
        jSONObject2.put("truncated", iM7909r2 < str3.length());
        if (iM7909r2 < str3.length()) {
            jSONObject2.put("nextOffset", iM7909r2);
        }
        jSONObject2.put("java", str3.substring(iM7909r, iM7909r2));
        String string = jSONObject2.toString();
        string.getClass();
        return string;
    }
}
