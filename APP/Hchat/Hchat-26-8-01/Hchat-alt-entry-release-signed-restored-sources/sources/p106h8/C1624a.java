package p106h8;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.HttpUrl;
import p014b.C0126e;
import p096g8.C1368i;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2002f;
import p125i8.C2005i;
import p167l8.C2527b;
import p242q8.C3463r;

/* JADX INFO: renamed from: h8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1624a {

    /* JADX INFO: renamed from: a */
    public final WeChatDatabaseApi f5317a;

    /* JADX INFO: renamed from: b */
    public final C1368i f5318b;

    /* JADX INFO: renamed from: c */
    public final C3463r f5319c;

    /* JADX INFO: renamed from: d */
    public final DexFinder f5320d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1624a(WeChatDatabaseApi weChatDatabaseApi, C1368i c1368i, C3463r c3463r, DexFinder dexFinder, C2002f c2002f) {
        this.f5317a = weChatDatabaseApi;
        this.f5318b = c1368i;
        this.f5319c = c3463r;
        this.f5320d = dexFinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m4138d(String str, Map map) {
        Object obj = map != null ? map.get(str) : null;
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        try {
            return Integer.parseInt(obj != null ? String.valueOf(obj) : HttpUrl.FRAGMENT_ENCODE_SET);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static long m4139g(String str, Map map) {
        String strValueOf;
        Object obj = map != null ? map.get(str) : null;
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj != null) {
            try {
                strValueOf = String.valueOf(obj);
            } catch (Throwable unused) {
                return 0L;
            }
        } else {
            strValueOf = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return Long.parseLong(strValueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m4140j(String str, Map map) {
        Object obj = map != null ? map.get(str) : null;
        return obj != null ? String.valueOf(obj) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static C2527b m4141k(Map map) {
        String strM4140j = m4140j("username", map);
        m4138d("unReadCount", map);
        m4138d("status", map);
        m4138d("isSend", map);
        m4139g("conversationTime", map);
        m4140j("content", map);
        m4140j("msgType", map);
        m4139g("flag", map);
        m4140j("digest", map);
        m4140j("digestUser", map);
        m4138d("atCount", map);
        m4138d("unReadMuteCount", map);
        m4138d("hasTodo", map);
        return new C2527b(strM4140j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m4142a(String str) {
        String strTrim = str != null ? str.trim() : HttpUrl.FRAGMENT_ENCODE_SET;
        if (!TextUtils.isEmpty(strTrim)) {
            Method method = this.f5320d.conversationDeleteMethod;
            if (method == null) {
                m4146f("原生会话删除方法尚未就绪");
                return false;
            }
            WeChatDatabaseApi weChatDatabaseApi = this.f5317a;
            Object objStorageObjectForMethod = weChatDatabaseApi.storageObjectForMethod(method);
            if (objStorageObjectForMethod == null) {
                m4146f("未找到原生会话 storage: ".concat(method.getDeclaringClass().getName()));
                return false;
            }
            try {
                KavaReflector.invokeOrThrow(method, objStorageObjectForMethod, strTrim);
                Cursor cursorRawQuery = weChatDatabaseApi.rawQuery("SELECT 1 FROM rconversation WHERE username=? LIMIT 1", new String[]{strTrim});
                Boolean boolValueOf = null;
                if (cursorRawQuery != null) {
                    try {
                        boolValueOf = Boolean.valueOf(cursorRawQuery.moveToFirst());
                    } catch (Throwable unused) {
                    }
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable unused2) {
                    }
                }
                if (boolValueOf != null) {
                    return !boolValueOf.booleanValue();
                }
                m4146f("无法验证原生会话删除结果: talker=" + strTrim);
                return false;
            } catch (Throwable th2) {
                m4146f("原生会话删除失败: " + th2.getMessage() + " talker=" + strTrim);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m4143b(String str) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM3729r = this.f5318b.m3729r(str);
        return !TextUtils.isEmpty(strM3729r) ? strM3729r : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final ArrayList m4144c() {
        return m4148i("SELECT username, unReadCount, status, isSend, conversationTime, content, msgType, flag, digest, digestUser, atCount, unReadMuteCount, hasTodo FROM rconversation WHERE username!='' ORDER BY conversationTime DESC LIMIT ?", new String[]{String.valueOf(Math.max(1, Math.min(10000, 10000)))});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4145e(String str) {
        Object obj;
        String strTrim = str.trim();
        if (!TextUtils.isEmpty(strTrim)) {
            Method method = this.f5320d.contactMuteStateMethod;
            if (TextUtils.isEmpty(strTrim)) {
                obj = null;
                if (method != null && obj != null && method.getParameterTypes()[0].isInstance(obj)) {
                    try {
                        return Boolean.TRUE.equals(KavaReflector.invokeOrThrow(method, null, obj));
                    } catch (Throwable th2) {
                        m4146f("读取微信免打扰状态失败: " + th2.getMessage() + " talker=" + strTrim);
                    }
                }
            } else {
                C0126e c0126eM3711R = this.f5318b.m3711R(strTrim.trim());
                if (c0126eM3711R != null) {
                    obj = c0126eM3711R.f333i;
                }
                if (method != null) {
                    return Boolean.TRUE.equals(KavaReflector.invokeOrThrow(method, null, obj));
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4146f(String str) {
        C2005i.m4939f("[WeChatConversationApi] ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m4147h(String str) {
        C3463r c3463r = this.f5319c;
        Context context = c3463r.f11231a;
        Intent[] intentArrM7266a = c3463r.m7266a(str);
        if (intentArrM7266a != null && intentArrM7266a.length != 0) {
            try {
                try {
                    context.startActivities(intentArrM7266a);
                    return true;
                } catch (Throwable unused) {
                    context.startActivity(intentArrM7266a[intentArrM7266a.length - 1]);
                    return true;
                }
            } catch (Throwable th2) {
                c3463r.m7267b("打开聊天失败: " + th2.getMessage());
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final ArrayList m4148i(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        try {
            for (Map<String, Object> map : this.f5317a.query(str, strArr)) {
                if (!m4140j("username", map).startsWith("wxid_hchat_group_")) {
                    arrayList.add(m4141k(map));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            m4146f("会话查询失败: " + th2.getMessage());
            return arrayList;
        }
    }
}
