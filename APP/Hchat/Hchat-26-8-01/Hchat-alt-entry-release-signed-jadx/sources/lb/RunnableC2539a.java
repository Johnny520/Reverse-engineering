package lb;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p065eb.C0876k;
import p068eh.AbstractC0921a;
import p096g8.C1371l;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p136j8.C2114y;
import p218og.AbstractC3149m;
import p260ra.C3779c;
import p261rb.C3788d;
import p261rb.C3792h;
import p261rb.C3795k;
import p261rb.EnumC3789e;
import p276sf.C3959f;
import p276sf.C3960g;
import p345x8.C5713f;
import p345x8.C5714g;
import p345x8.C5724q;
import p345x8.C5725r;

/* JADX INFO: renamed from: lb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2539a implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8216g = 3;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f8217h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f8218i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8219j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f8220k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f8221l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC2539a(String str, String str2, int i9, C5725r c5725r, Context context) {
        this.f8217h = str;
        this.f8218i = str2;
        this.f8219j = i9;
        this.f8220k = c5725r;
        this.f8221l = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object c3959f;
        C3788d c3788d;
        Object c3959f2;
        int i9 = this.f8216g;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String str2 = this.f8217h;
        Object obj = this.f8221l;
        Object obj2 = this.f8220k;
        int i10 = this.f8219j;
        Object obj3 = this.f8218i;
        switch (i9) {
            case 0:
                C2547i c2547i = (C2547i) obj2;
                try {
                    c3959f = Boolean.valueOf(((C2114y) obj).m5323s(i10, str2, (String) obj3));
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    c2547i.f8253b.invoke("复读语音发送失败", thM8182b);
                }
                break;
            case 1:
                ((C3779c) obj2).m7948w(i10, str2, (String) obj3, (String) obj);
                break;
            case 2:
                C3795k c3795k = (C3795k) obj2;
                JSONObject jSONObject = (JSONObject) obj3;
                String str3 = ((C3792h) obj).f12434a.f12439a;
                String str4 = (String) c3795k.f12450j.get(str3);
                if (str4 != null) {
                    str = str4;
                }
                if (AbstractC3149m.m6721t0(str)) {
                    str = str3;
                }
                String string = AbstractC3149m.m6703R0(str2).toString();
                if (!AbstractC3149m.m6721t0(string) && (AbstractC3149m.m6709h0(string, "不是收款方好友", false) || AbstractC3149m.m6709h0(string, "拒绝接收你的", false) || AbstractC3149m.m6709h0(string, "对方拒绝接收", false) || AbstractC3149m.m6709h0(string, "好友关系是否正常", false) || (AbstractC3149m.m6709h0(string, "确认你和", false) && AbstractC3149m.m6709h0(string, "好友关系", false)))) {
                    if (AbstractC3149m.m6721t0(string)) {
                        string = "好友关系异常";
                    }
                    c3788d = new C3788d(str3, str, EnumC3789e.f12423h, string);
                } else if (i10 == 0 || i10 == 2) {
                    String strOptString = jSONObject != null ? jSONObject.optString("req_key") : null;
                    if (strOptString == null || AbstractC3149m.m6721t0(strOptString)) {
                        if (AbstractC3149m.m6721t0(string)) {
                            string = AbstractC0921a.m2249l(i10, "检测返回异常码 ");
                        }
                        c3788d = new C3788d(str3, str, EnumC3789e.f12424i, string);
                    } else {
                        c3788d = new C3788d(str3, str, EnumC3789e.f12422g, "好友关系正常");
                    }
                }
                c3795k.m7982i(c3788d);
                break;
            default:
                String str5 = this.f8217h;
                String str6 = (String) obj3;
                C5725r c5725r = (C5725r) obj2;
                Context context = (Context) obj;
                ExecutorService executorService = C5724q.f23297a;
                try {
                    C0876k c0876k = C0876k.f2687a;
                    String strM2189p = C0876k.m2189p(i10, str5, str6);
                    WeChatApis.contact().getClass();
                    C1371l c1371l = WeChatApis.verifyUserApi;
                    if (c1371l != null) {
                        c1371l.m3742c(strM2189p, str6, i10, 0);
                    }
                    C5724q.m10377w(str5, c5725r.m10388h("auto_accept_tag_name", HttpUrl.FRAGMENT_ENCODE_SET), c5725r.m10385e("auto_accept_tag_enable"));
                    C5713f c5713f = C5724q.f23309m;
                    C5724q.m10357c(c5725r, str5, c5713f);
                    C5724q.m10358d(c5725r, str5, c5713f);
                    long jM10387g = c5725r.m10387g("auto_accept_delay_ms");
                    c3959f2 = Boolean.valueOf(C5724q.m10365k(context, str5, c5725r.m10383c(), new C5714g(252, str5, str5, null), jM10387g < 0 ? 0L : jM10387g, false));
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                if (thM8182b2 != null) {
                    AbstractC0921a.m2261x("[Hchat:AutoReply] 好友申请处理失败: ", thM8182b2.getMessage(), thM8182b2);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC2539a(C2547i c2547i, C2114y c2114y, String str, String str2, int i9) {
        this.f8220k = c2547i;
        this.f8221l = c2114y;
        this.f8217h = str;
        this.f8218i = str2;
        this.f8219j = i9;
    }

    public /* synthetic */ RunnableC2539a(C3779c c3779c, String str, String str2, String str3, int i9) {
        this.f8220k = c3779c;
        this.f8217h = str;
        this.f8218i = str2;
        this.f8221l = str3;
        this.f8219j = i9;
    }

    public /* synthetic */ RunnableC2539a(C3795k c3795k, C3792h c3792h, int i9, String str, JSONObject jSONObject) {
        this.f8220k = c3795k;
        this.f8221l = c3792h;
        this.f8219j = i9;
        this.f8217h = str;
        this.f8218i = jSONObject;
    }
}
