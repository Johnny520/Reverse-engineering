package p086r0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001A0.AbstractC0038k;
import p001A0.AbstractC0039l;
import p001A0.C0018S;
import p001A0.C0019T;
import p001A0.C0026a;
import p001A0.C0047t;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: r0.u1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0946u1 implements InterfaceC0204l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0955x1 f3396b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0946u1(C0955x1 c0955x1, int i2) {
        this.f3395a = i2;
        this.f3396b = c0955x1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public final Object mo8c(Object obj) throws JSONException {
        Object c0104d;
        switch (this.f3395a) {
            case 0:
                Context context = (Context) obj;
                AbstractC0223g.m418e(context, "appContext");
                C0018S c0018s = null;
                c0018s = null;
                if (AbstractC0038k.m60a()) {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    String str = applicationInfo != null ? applicationInfo.sourceDir : null;
                    if (str == null || AbstractC0307q.m534d0(str)) {
                        AbstractC0731a.m1387d("read trace dexkit apk path empty");
                    } else {
                        try {
                            c0104d = (C0018S) AbstractC0039l.m62B(str, new C0026a(17));
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        Throwable thM246a = AbstractC0105e.m246a(c0104d);
                        if (thM246a != null) {
                            AbstractC0731a.m1387d("read trace dexkit resolve fail", thM246a);
                        }
                        c0018s = (C0018S) (c0104d instanceof C0104d ? null : c0104d);
                    }
                    break;
                }
                if (c0018s == null) {
                    return new C0047t(false, "未找到已读追踪发送 Hook 点", true);
                }
                JSONObject jSONObjectPut = new JSONObject().put("sendClickClassName", c0018s.f144a).put("sendClickMethodName", c0018s.f145b).put("sendClickMethodSign", c0018s.f146c);
                JSONArray jSONArray = new JSONArray();
                for (C0019T c0019t : c0018s.f147d) {
                    jSONArray.put(new JSONObject().put("className", c0019t.f154a).put("methodName", c0019t.f155b).put("methodSign", c0019t.f156c));
                }
                JSONObject jSONObjectPut2 = jSONObjectPut.put("sendClickMethods", jSONArray).put("appMsgContentClassName", c0018s.f148e).put("parseXmlMethodName", c0018s.f149f).put("parseXmlMethodSign", c0018s.f150g).put("appMsgLogicClassName", c0018s.f151h).put("sendAppMsgMethodName", c0018s.f152i).put("sendAppMsgMethodSign", c0018s.f153j);
                AbstractC0223g.m417d(jSONObjectPut2, "put(...)");
                JSONObject jSONObjectM84v = AbstractC0039l.m84v(jSONObjectPut2, 4);
                SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
                AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
                sharedPreferences.edit().putString("read_trace_v1", jSONObjectM84v.toString()).apply();
                this.f3396b.f3435b = c0018s;
                return new C0047t(true, "成功", true);
            default:
                Class cls = (Class) obj;
                AbstractC0223g.m415b(cls);
                this.f3396b.getClass();
                return C0955x1.m2132f(cls);
        }
    }
}
