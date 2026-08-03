package p136j8;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.C0119x;
import bb.C0240b;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p099h.Hchat.dexkit.DexFinder;
import p125i8.C2002f;
import p242q8.C3460o;

/* JADX INFO: renamed from: j8.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2105p {

    /* JADX INFO: renamed from: a */
    public final C2103n f7035a;

    /* JADX INFO: renamed from: b */
    public final C2114y f7036b;

    /* JADX INFO: renamed from: c */
    public final C0240b f7037c;

    /* JADX INFO: renamed from: d */
    public final C2095f f7038d;

    /* JADX INFO: renamed from: e */
    public final C0119x f7039e;

    /* JADX INFO: renamed from: f */
    public final C2097h f7040f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2105p(Context context, DexFinder dexFinder, ClassLoader classLoader, DexKitBridge dexKitBridge, C3460o c3460o, C2002f c2002f) {
        C2103n c2103n = new C2103n(context, dexFinder, new C2002f(c2002f, 26));
        this.f7035a = c2103n;
        this.f7036b = new C2114y(context, dexFinder, new C2002f(c2002f, 27));
        this.f7037c = new C0240b(context, dexFinder, c3460o, c2103n, new C2002f(c2002f, 28));
        this.f7038d = new C2095f(context, dexFinder, new C2002f(c2002f, 29));
        this.f7039e = new C0119x(dexFinder, new C2104o(c2002f));
        this.f7040f = new C2097h(context, dexFinder, classLoader, dexKitBridge, c3460o, new C2104o(c2002f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m5301a(String str, String str2) {
        return this.f7035a.m5274r(str, str2, HttpUrl.FRAGMENT_ENCODE_SET, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m5302b(String str, String str2, String str3, String str4, String str5, byte[] bArr, String str6) {
        String str7;
        C0119x c0119x = this.f7039e;
        c0119x.getClass();
        if (!TextUtils.isEmpty(str5)) {
            str7 = "https://servicewechat.com/" + C0119x.m565R(str4) + "/0/page-frame.html";
        } else if (TextUtils.isEmpty(str4)) {
            str7 = "https://weixin.qq.com/";
        } else {
            str7 = "https://servicewechat.com/" + C0119x.m565R(str4) + "/0/page-frame.html";
        }
        Object objM573D = c0119x.m573D("com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject", C0119x.m571q("userName", str4, "path", str5, "webpageUrl", str7, "miniprogramType", 0), C0119x.m571q("title", str2, "description", str3, "thumbData", bArr));
        return objM573D != null && c0119x.m589U(objM573D, str, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m5303c(String str, String str2, String str3, String str4, byte[] bArr, String str5) {
        C0119x c0119x = this.f7039e;
        c0119x.getClass();
        Object objM573D = c0119x.m573D("com.tencent.mm.opensdk.modelmsg.WXWebpageObject", C0119x.m571q("webpageUrl", str4), C0119x.m571q("title", str2, "description", str3, "thumbData", bArr));
        return objM573D != null && c0119x.m589U(objM573D, str, str5);
    }
}
