package p096g8;

import android.content.Context;
import android.text.TextUtils;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2002f;
import p125i8.C2005i;

/* JADX INFO: renamed from: g8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1360a {

    /* JADX INFO: renamed from: a */
    public final Context f4506a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f4507b;

    /* JADX INFO: renamed from: c */
    public final WeChatDatabaseApi f4508c;

    /* JADX INFO: renamed from: d */
    public volatile String f4509d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1360a(Context context, ClassLoader classLoader, WeChatDatabaseApi weChatDatabaseApi, C2002f c2002f) {
        this.f4506a = context;
        this.f4507b = classLoader;
        this.f4508c = weChatDatabaseApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m3650a(String str, String str2) {
        try {
            Object objInvokeStaticMethod = KavaReflector.invokeStaticMethod(KavaReflector.loadClass("com.tencent.mm.sdk.platformtools.MMApplicationContext", this.f4507b), "getSharedPreferences", str, 4);
            if (objInvokeStaticMethod == null) {
                objInvokeStaticMethod = this.f4506a.getSharedPreferences(str, 4);
            }
            if (objInvokeStaticMethod != null) {
                Object objInvokeMethod = KavaReflector.invokeMethod(objInvokeStaticMethod, "getString", str2, HttpUrl.FRAGMENT_ENCODE_SET);
                if (objInvokeMethod instanceof String) {
                    return (String) objInvokeMethod;
                }
            }
        } catch (Throwable unused) {
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m3651b(int i9) {
        try {
            return this.f4508c.queryFirstString("SELECT value FROM userinfo WHERE id=?", new String[]{String.valueOf(i9)}, "value");
        } catch (Throwable th2) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "读取账号字段失败: ", " ");
            sbM2257t.append(th2.getMessage());
            C2005i.m4939f("[WeChatAccountApi] ".concat(sbM2257t.toString()));
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m3652c() {
        if (!TextUtils.isEmpty(this.f4509d)) {
            return this.f4509d;
        }
        String strM3651b = m3651b(2);
        boolean zIsEmpty = TextUtils.isEmpty(strM3651b);
        String strQueryFirstString = HttpUrl.FRAGMENT_ENCODE_SET;
        if (zIsEmpty) {
            String strM3650a = m3650a("notify_key_pref_no_account", "login_weixin_username");
            if (TextUtils.isEmpty(strM3650a)) {
                String[] strArr = {"login_weixin_username", "login_user_name", "login_username", "last_login_username"};
                int i9 = 0;
                while (true) {
                    if (i9 >= 4) {
                        strM3651b = HttpUrl.FRAGMENT_ENCODE_SET;
                        break;
                    }
                    String strM3650a2 = m3650a("login_info", strArr[i9]);
                    if (!TextUtils.isEmpty(strM3650a2)) {
                        strM3651b = strM3650a2.trim();
                        break;
                    }
                    i9++;
                }
            } else {
                strM3651b = strM3650a.trim();
            }
        }
        if (TextUtils.isEmpty(strM3651b)) {
            String strM3651b2 = m3651b(42);
            if (!TextUtils.isEmpty(strM3651b2)) {
                try {
                    strQueryFirstString = this.f4508c.queryFirstString("SELECT username FROM rcontact WHERE alias=? AND username!='' AND username NOT LIKE '%@chatroom' AND username NOT LIKE '%@im.chatroom' LIMIT 1", new String[]{strM3651b2}, "username");
                } catch (Throwable th2) {
                    C2005i.m4939f("[WeChatAccountApi] ".concat("通过微信号反查自身wxid失败: " + th2.getMessage()));
                }
            }
            strM3651b = strQueryFirstString;
        }
        if (!TextUtils.isEmpty(strM3651b)) {
            this.f4509d = strM3651b;
        }
        return strM3651b;
    }
}
