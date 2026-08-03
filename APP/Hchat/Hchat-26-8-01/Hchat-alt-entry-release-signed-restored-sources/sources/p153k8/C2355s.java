package p153k8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p096g8.C1360a;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p125i8.C2002f;
import p125i8.C2005i;

/* JADX INFO: renamed from: k8.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2355s {

    /* JADX INFO: renamed from: a */
    public final WeChatDatabaseApi f7738a;

    /* JADX INFO: renamed from: b */
    public final C1360a f7739b;

    /* JADX INFO: renamed from: c */
    public final DexFinder f7740c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2355s(WeChatDatabaseApi weChatDatabaseApi, C1360a c1360a, DexFinder dexFinder, C2002f c2002f) {
        this.f7738a = weChatDatabaseApi;
        this.f7739b = c1360a;
        this.f7740c = dexFinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m5656g(String str, Map map) {
        Object obj = map != null ? map.get(str) : null;
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj == null) {
            return 0;
        }
        try {
            return Integer.parseInt(String.valueOf(obj));
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static long m5657j(String str, Map map) {
        Object obj = map != null ? map.get(str) : null;
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj == null) {
            return 0L;
        }
        try {
            return Long.parseLong(String.valueOf(obj));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m5658n(String str, Map map) {
        Object obj = map != null ? map.get(str) : null;
        return obj != null ? String.valueOf(obj) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x000e A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m5659a(long j3) {
        long j4;
        if (j3 <= 0) {
            return 0L;
        }
        Iterator it = m5667k().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            WeChatDatabaseApi weChatDatabaseApi = this.f7738a;
            if (!zHasNext) {
                String strQueryFirstString = weChatDatabaseApi.queryFirstString("SELECT createTime FROM message WHERE msgSvrId=? ORDER BY createTime DESC LIMIT 1", new String[]{String.valueOf(j3)}, "createTime");
                if (strQueryFirstString == null) {
                    return 0L;
                }
                try {
                    return Long.parseLong(strQueryFirstString);
                } catch (Throwable unused) {
                    return 0L;
                }
            }
            String strM5669m = m5669m((String) it.next());
            if (!TextUtils.isEmpty(strM5669m)) {
                String strQueryFirstString2 = weChatDatabaseApi.queryFirstString(AbstractC0921a.m2251n("SELECT createTime FROM ", strM5669m, " WHERE msgSvrId=? ORDER BY createTime DESC LIMIT 1"), new String[]{String.valueOf(j3)}, "createTime");
                if (strQueryFirstString2 == null) {
                    j4 = 0;
                    if (j4 <= 0) {
                        return j4;
                    }
                } else {
                    try {
                        j4 = Long.parseLong(strQueryFirstString2);
                    } catch (Throwable unused2) {
                        j4 = 0;
                    }
                    if (j4 <= 0) {
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final WeChatMessage m5660b(String str) {
        ArrayList arrayListM5664f = m5664f(1, str);
        if (arrayListM5664f.isEmpty()) {
            return null;
        }
        return (WeChatMessage) arrayListM5664f.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final WeChatMessage m5661c(long j3) {
        if (j3 <= 0) {
            return null;
        }
        Iterator it = m5667k().iterator();
        while (it.hasNext()) {
            String strM5669m = m5669m((String) it.next());
            if (!TextUtils.isEmpty(strM5669m)) {
                ArrayList arrayListM5668l = m5668l(AbstractC0921a.m2251n("SELECT * FROM ", strM5669m, " WHERE msgId=? LIMIT 1"), new String[]{String.valueOf(j3)});
                if (!arrayListM5668l.isEmpty()) {
                    return (WeChatMessage) arrayListM5668l.get(0);
                }
            }
        }
        ArrayList arrayListM5668l2 = m5668l("SELECT msgId, msgSvrId, type, status, isSend, createTime, talker, content, imgPath, reserved, transContent, flag FROM message WHERE msgId=? LIMIT 1", new String[]{String.valueOf(j3)});
        if (arrayListM5668l2.isEmpty()) {
            return null;
        }
        return (WeChatMessage) arrayListM5668l2.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final WeChatMessage m5662d(long j3) {
        if (j3 <= 0) {
            return null;
        }
        for (String str : m5667k()) {
            String strM5669m = m5669m(str);
            if (!TextUtils.isEmpty(strM5669m)) {
                ArrayList arrayListM5668l = m5668l(AbstractC0921a.m2251n("SELECT * FROM ", strM5669m, " WHERE msgSvrId=? ORDER BY createTime DESC, msgId DESC LIMIT 1"), new String[]{String.valueOf(j3)});
                if (!arrayListM5668l.isEmpty()) {
                    m5666i("按msgSvrId命中分表: id=" + j3 + " table=" + str);
                    return (WeChatMessage) arrayListM5668l.get(0);
                }
            }
        }
        ArrayList arrayListM5668l2 = m5668l("SELECT * FROM message WHERE msgSvrId=? ORDER BY createTime DESC, msgId DESC LIMIT 1", new String[]{String.valueOf(j3)});
        if (arrayListM5668l2.isEmpty()) {
            m5666i("按msgSvrId未命中: id=" + j3);
            return null;
        }
        m5666i("按msgSvrId命中主表: id=" + j3);
        return (WeChatMessage) arrayListM5668l2.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WeChatMessage m5663e(long j3, String str) {
        ArrayList arrayListM5668l;
        if (TextUtils.isEmpty(str) || j3 <= 0) {
            return null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strMessageTableForTalker = HttpUrl.FRAGMENT_ENCODE_SET;
        WeChatDatabaseApi weChatDatabaseApi = this.f7738a;
        String strM5669m = m5669m(zIsEmpty ? HttpUrl.FRAGMENT_ENCODE_SET : weChatDatabaseApi.messageTableForTalker(str));
        if (!TextUtils.isEmpty(strM5669m)) {
            arrayListM5668l = m5668l(AbstractC0921a.m2251n("SELECT * FROM ", strM5669m, " WHERE msgSvrId=? ORDER BY createTime DESC, msgId DESC LIMIT 1"), new String[]{String.valueOf(j3)});
            if (arrayListM5668l.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    strMessageTableForTalker = weChatDatabaseApi.messageTableForTalker(str);
                }
                Iterator it = m5667k().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayListM5668l = m5668l("SELECT * FROM message WHERE talker=? AND msgSvrId=? ORDER BY createTime DESC, msgId DESC LIMIT 1", new String[]{str, String.valueOf(j3)});
                        break;
                    }
                    String str2 = (String) it.next();
                    if (!str2.equals(strMessageTableForTalker)) {
                        String strM5669m2 = m5669m(str2);
                        if (TextUtils.isEmpty(strM5669m2)) {
                            continue;
                        } else {
                            arrayListM5668l = m5668l(AbstractC0921a.m2251n("SELECT * FROM ", strM5669m2, " WHERE msgSvrId=? ORDER BY createTime DESC, msgId DESC LIMIT 1"), new String[]{String.valueOf(j3)});
                            if (!arrayListM5668l.isEmpty()) {
                                StringBuilder sbM2259v = AbstractC0921a.m2259v("按talker/msgSvrId命中分表: talker=", str, " id=", j3);
                                sbM2259v.append(" table=");
                                sbM2259v.append(str2);
                                m5666i(sbM2259v.toString());
                                break;
                            }
                        }
                    }
                }
            } else {
                StringBuilder sbM2259v2 = AbstractC0921a.m2259v("按talker/msgSvrId命中会话表: talker=", str, " id=", j3);
                sbM2259v2.append(" table=");
                sbM2259v2.append(strM5669m);
                m5666i(sbM2259v2.toString());
            }
        }
        if (arrayListM5668l.isEmpty()) {
            return null;
        }
        return (WeChatMessage) arrayListM5668l.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final ArrayList m5664f(int i9, String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        int iMax = Math.max(1, Math.min(200, i9));
        String strM5669m = m5669m(TextUtils.isEmpty(str) ? HttpUrl.FRAGMENT_ENCODE_SET : this.f7738a.messageTableForTalker(str));
        if (!TextUtils.isEmpty(strM5669m)) {
            ArrayList arrayListM5668l = m5668l(AbstractC0921a.m2251n("SELECT msgId, msgSvrId, type, status, isSend, createTime, talker, content, imgPath, reserved, transContent, flag FROM ", strM5669m, " ORDER BY createTime DESC, msgId DESC LIMIT ?"), new String[]{String.valueOf(iMax)});
            if (!arrayListM5668l.isEmpty()) {
                return arrayListM5668l;
            }
        }
        return m5668l("SELECT msgId, msgSvrId, type, status, isSend, createTime, talker, content, imgPath, reserved, transContent, flag FROM message WHERE talker=? ORDER BY createTime DESC, msgId DESC LIMIT ?", new String[]{str, String.valueOf(iMax)});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m5665h() {
        return this.f7738a.isAvailable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m5666i(String str) {
        C2005i.m4939f("[WeChatMessageStoreApi] ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final ArrayList m5667k() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f7738a.messageTables());
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final ArrayList m5668l(String str, String[] strArr) {
        List<Map<String, Object>> arrayList;
        ArrayList arrayList2 = new ArrayList();
        try {
            arrayList = this.f7738a.query(str, strArr);
        } catch (Throwable th2) {
            m5666i("消息查询失败: " + th2.getMessage());
            arrayList = new ArrayList<>();
        }
        for (Iterator<Map<String, Object>> it = arrayList.iterator(); it.hasNext(); it = it) {
            Map<String, Object> next = it.next();
            arrayList2.add(new WeChatMessage(m5657j("msgId", next), m5657j("msgSvrId", next), m5656g("type", next), m5656g("status", next), m5656g("isSend", next), m5657j("createTime", next), m5658n("talker", next), m5658n("content", next), m5658n("imgPath", next), m5658n("reserved", next), m5658n("transContent", next), m5656g("flag", next), m5658n("msgSource", next), this.f7739b.m3652c()));
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final String m5669m(String str) {
        return TextUtils.isEmpty(str) ? HttpUrl.FRAGMENT_ENCODE_SET : this.f7738a.quoteTable(str);
    }
}
