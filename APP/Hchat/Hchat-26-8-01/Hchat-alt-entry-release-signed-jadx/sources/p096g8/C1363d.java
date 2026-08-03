package p096g8;

import android.text.TextUtils;
import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.model.WeChatChatroom;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2002f;
import p125i8.C2005i;
import p183m8.C2815c;

/* JADX INFO: renamed from: g8.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1363d {

    /* JADX INFO: renamed from: a */
    public final WeChatDatabaseApi f4516a;

    /* JADX INFO: renamed from: b */
    public final C1368i f4517b;

    /* JADX INFO: renamed from: c */
    public final DexFinder f4518c;

    /* JADX INFO: renamed from: d */
    public final C2815c f4519d;

    /* JADX INFO: renamed from: e */
    public final C2002f f4520e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f4521f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public volatile boolean f4522g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1363d(WeChatDatabaseApi weChatDatabaseApi, C1368i c1368i, DexFinder dexFinder, C2815c c2815c, C2002f c2002f) {
        this.f4516a = weChatDatabaseApi;
        this.f4517b = c1368i;
        this.f4518c = dexFinder;
        this.f4519d = c2815c;
        this.f4520e = c2002f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static byte[] m3667b(Map map) {
        Object obj = map != null ? map.get("roomdata") : null;
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                String strTrim = str.trim();
                if (strTrim.startsWith("hex->")) {
                    strTrim = strTrim.substring(5);
                }
                String strReplace = strTrim.replace(" ", HttpUrl.FRAGMENT_ENCODE_SET).replace("\n", HttpUrl.FRAGMENT_ENCODE_SET).replace("\r", HttpUrl.FRAGMENT_ENCODE_SET);
                if (strReplace.length() >= 2 && (strReplace.length() & 1) == 0) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= strReplace.length()) {
                            int length = strReplace.length() / 2;
                            byte[] bArr = new byte[length];
                            for (int i10 = 0; i10 < length; i10++) {
                                int i11 = i10 * 2;
                                int iDigit = Character.digit(strReplace.charAt(i11), 16);
                                int iDigit2 = Character.digit(strReplace.charAt(i11 + 1), 16);
                                if (iDigit >= 0 && iDigit2 >= 0) {
                                    bArr[i10] = (byte) (iDigit2 | (iDigit << 4));
                                }
                            }
                            return bArr;
                        }
                        char cCharAt = strReplace.charAt(i9);
                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'f') && (cCharAt < 'A' || cCharAt > 'F'))) {
                            break;
                        }
                        i9++;
                    }
                }
            }
        } else if (obj != null) {
            try {
                Object objInvoke = obj.getClass().getMethod("toByteArray", null).invoke(obj, null);
                if (objInvoke instanceof byte[]) {
                    return (byte[]) objInvoke;
                }
            } catch (Throwable unused) {
            }
            try {
                Object objInvoke2 = obj.getClass().getMethod("getBytes", null).invoke(obj, null);
                if (objInvoke2 instanceof byte[]) {
                    return (byte[]) objInvoke2;
                }
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static ArrayList m3668c(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str) && !arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static C1362c m3669o(byte[] bArr) {
        C1362c c1362c = new C1362c();
        try {
            C1361b c1361b = new C1361b(bArr, 0, (byte) 0);
            while (true) {
                if (c1361b.f4512c >= c1361b.f4511b.length) {
                    return c1362c;
                }
                int iM3662j = c1361b.m3662j();
                int i9 = iM3662j >>> 3;
                int i10 = iM3662j & 7;
                if (i10 == 2 && i9 == 1) {
                    c1362c.f4513a = c1361b.m3661i().trim();
                } else if (i10 == 2 && i9 == 2) {
                    c1361b.m3661i();
                } else if (i10 == 0 && i9 == 3) {
                    c1362c.f4515c = c1361b.m3662j();
                } else if (i10 == 2 && i9 == 4) {
                    c1362c.f4514b = c1361b.m3661i().trim();
                } else {
                    c1361b.m3664l(i10);
                }
            }
        } catch (Throwable unused) {
            return new C1362c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m3670p(String str, Map map) {
        Object obj = map != null ? map.get(str) : null;
        return obj != null ? String.valueOf(obj) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m3671a(String str, List list) {
        C2815c c2815c;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            m3682n("添加群成员失败: chatroom/member为空");
            return false;
        }
        DexFinder dexFinder = this.f4518c;
        if (dexFinder == null || dexFinder.addChatroomMemberCtor == null || (c2815c = this.f4519d) == null) {
            m3682n("添加群成员失败: API未就绪");
            return false;
        }
        ArrayList arrayListM3668c = m3668c(list);
        if (arrayListM3668c.isEmpty()) {
            m3682n("添加群成员失败: member为空");
            return false;
        }
        m3680l();
        try {
            boolean zM6216j = c2815c.m6216j(KavaReflector.newInstance(dexFinder.addChatroomMemberCtor, str, arrayListM3668c, HttpUrl.FRAGMENT_ENCODE_SET, null));
            StringBuilder sb2 = new StringBuilder("添加群成员");
            sb2.append(zM6216j ? "成功" : "失败");
            sb2.append(": ");
            sb2.append(str);
            sb2.append(" count=");
            sb2.append(arrayListM3668c.size());
            m3682n(sb2.toString());
            return zM6216j;
        } catch (Throwable th2) {
            m3682n("添加群成员异常: " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m3672d(String str, List list) {
        C2815c c2815c;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            m3682n("移除群成员失败: chatroom/member为空");
            return false;
        }
        DexFinder dexFinder = this.f4518c;
        if (dexFinder == null || dexFinder.delChatroomMemberCtor == null || (c2815c = this.f4519d) == null) {
            m3682n("移除群成员失败: API未就绪");
            return false;
        }
        ArrayList arrayListM3668c = m3668c(list);
        if (arrayListM3668c.isEmpty()) {
            m3682n("移除群成员失败: member为空");
            return false;
        }
        m3680l();
        try {
            boolean zM6216j = c2815c.m6216j(KavaReflector.newInstance(dexFinder.delChatroomMemberCtor, str, arrayListM3668c, 0));
            StringBuilder sb2 = new StringBuilder("移除群成员");
            sb2.append(zM6216j ? "成功" : "失败");
            sb2.append(": ");
            sb2.append(str);
            sb2.append(" count=");
            sb2.append(arrayListM3668c.size());
            m3682n(sb2.toString());
            return zM6216j;
        } catch (Throwable th2) {
            m3682n("移除群成员异常: " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final WeChatChatroom m3673e(String str) {
        WeChatDatabaseApi weChatDatabaseApi;
        if (this.f4517b != null && C1368i.m3686I(str) && (weChatDatabaseApi = this.f4516a) != null) {
            try {
                List<Map<String, Object>> listQuery = weChatDatabaseApi.query("SELECT chatroomname, memberlist, displayname, roomowner FROM chatroom WHERE chatroomname=? LIMIT 1", new String[]{str});
                if (!listQuery.isEmpty()) {
                    Map<String, Object> map = listQuery.get(0);
                    String strM3670p = m3670p("chatroomname", map);
                    String strM3674f = m3674f(str);
                    String strM3670p2 = m3670p("roomowner", map);
                    String strM3670p3 = m3670p("memberlist", map);
                    ArrayList arrayList = new ArrayList();
                    if (!TextUtils.isEmpty(strM3670p3)) {
                        for (String str2 : strM3670p3.split(";")) {
                            if (!TextUtils.isEmpty(str2)) {
                                arrayList.add(str2);
                            }
                        }
                    }
                    return new WeChatChatroom(strM3670p, strM3674f, strM3670p2, arrayList, m3670p("displayname", map));
                }
            } catch (Throwable th2) {
                StringBuilder sbM1026o = AbstractC0255e.m1026o("读取群聊失败: ", str, " ");
                sbM1026o.append(th2.getMessage());
                m3682n(sbM1026o.toString());
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m3674f(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strM3729r = HttpUrl.FRAGMENT_ENCODE_SET;
        if (zIsEmpty) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1368i c1368i = this.f4517b;
        if (c1368i != null) {
            strM3729r = c1368i.m3729r(str);
        }
        return !TextUtils.isEmpty(strM3729r) ? strM3729r : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final ArrayList m3675g() {
        ArrayList arrayList = new ArrayList();
        C1368i c1368i = this.f4517b;
        if (c1368i != null) {
            for (WeChatContact weChatContact : c1368i.m3735x()) {
                WeChatChatroom weChatChatroomM3673e = m3673e(weChatContact.wxId);
                if (weChatChatroomM3673e != null) {
                    arrayList.add(weChatChatroomM3673e);
                } else {
                    arrayList.add(new WeChatChatroom(weChatContact.wxId, weChatContact.displayName(), HttpUrl.FRAGMENT_ENCODE_SET, new ArrayList(), HttpUrl.FRAGMENT_ENCODE_SET));
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final String m3676h(String str, String str2) {
        C1368i c1368i = this.f4517b;
        return c1368i == null ? !TextUtils.isEmpty(str2) ? str2 : HttpUrl.FRAGMENT_ENCODE_SET : c1368i.m3731t(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final List m3677i(String str) {
        C1368i c1368i = this.f4517b;
        if (c1368i != null) {
            return c1368i.m3732u(str);
        }
        WeChatChatroom weChatChatroomM3673e = m3673e(str);
        return weChatChatroomM3673e != null ? weChatChatroomM3673e.memberIds : new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m3678j(String str, String str2) {
        WeChatDatabaseApi weChatDatabaseApi;
        String strQueryFirstString;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strTrim = HttpUrl.FRAGMENT_ENCODE_SET;
        if (!zIsEmpty && (weChatDatabaseApi = this.f4516a) != null) {
            try {
                strQueryFirstString = weChatDatabaseApi.queryFirstString("SELECT roomowner FROM chatroom WHERE chatroomname=? LIMIT 1", new String[]{str}, "roomowner");
            } catch (Throwable th2) {
                StringBuilder sbM1026o = AbstractC0255e.m1026o("读取群主失败: ", str, " ");
                sbM1026o.append(th2.getMessage());
                m3682n(sbM1026o.toString());
            }
            if (TextUtils.isEmpty(strQueryFirstString)) {
                WeChatChatroom weChatChatroomM3673e = m3673e(str);
                if (weChatChatroomM3673e != null) {
                    strTrim = weChatChatroomM3673e.owner;
                }
            } else {
                strTrim = strQueryFirstString.trim();
            }
        }
        if (!TextUtils.isEmpty(strTrim) && strTrim.equals(str2)) {
            return 2;
        }
        C1362c c1362c = (C1362c) m3679k(str).get(str2);
        return (c1362c == null || (c1362c.f4515c & Opcodes.ACC_STRICT) == 0) ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final LinkedHashMap m3679k(String str) {
        WeChatDatabaseApi weChatDatabaseApi;
        boolean zBooleanValue;
        byte[] bArrM3667b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TextUtils.isEmpty(str) && (weChatDatabaseApi = this.f4516a) != null) {
            if (TextUtils.isEmpty("chatroom") || TextUtils.isEmpty("roomdata")) {
                zBooleanValue = false;
            } else {
                ConcurrentHashMap concurrentHashMap = this.f4521f;
                Boolean bool = (Boolean) concurrentHashMap.get("chatroom:roomdata");
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Iterator<Map<String, Object>> it = weChatDatabaseApi.query("PRAGMA table_info(chatroom)", null).iterator();
                        while (it.hasNext()) {
                            if ("roomdata".equalsIgnoreCase(m3670p("name", it.next()))) {
                                zBooleanValue = true;
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        m3682n("检测字段失败: chatroom.roomdata " + th2.getMessage());
                    }
                    zBooleanValue = false;
                    if (zBooleanValue) {
                        concurrentHashMap.put("chatroom:roomdata", Boolean.TRUE);
                    } else {
                        concurrentHashMap.remove("chatroom:roomdata");
                    }
                }
            }
            if (zBooleanValue) {
                try {
                    List<Map<String, Object>> listQuery = weChatDatabaseApi.query("SELECT roomdata FROM chatroom WHERE chatroomname=? LIMIT 1", new String[]{str});
                    if (!listQuery.isEmpty() && (bArrM3667b = m3667b(listQuery.get(0))) != null && bArrM3667b.length != 0) {
                        C1361b c1361b = new C1361b(bArrM3667b, 0, (byte) 0);
                        while (true) {
                            if (c1361b.f4512c >= c1361b.f4511b.length) {
                                break;
                            }
                            int iM3662j = c1361b.m3662j();
                            int i9 = iM3662j >>> 3;
                            int i10 = iM3662j & 7;
                            if (i9 == 1 && i10 == 2) {
                                C1362c c1362cM3669o = m3669o(c1361b.m3660h());
                                if (!TextUtils.isEmpty(c1362cM3669o.f4513a)) {
                                    linkedHashMap.put(c1362cM3669o.f4513a, c1362cM3669o);
                                }
                            } else {
                                c1361b.m3664l(i10);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    m3682n("解析群成员身份失败: " + th3.getMessage());
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m3680l() {
        DexFinder dexFinder;
        if (this.f4522g || this.f4519d == null || (dexFinder = this.f4518c) == null) {
            return;
        }
        if (dexFinder.netQueueClass == null && dexFinder.netQueueCandidateClasses.isEmpty()) {
            return;
        }
        C2815c c2815c = this.f4519d;
        DexFinder dexFinder2 = this.f4518c;
        c2815c.m6212c(dexFinder2.netQueueClass, dexFinder2.netQueueCandidateClasses);
        this.f4522g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final boolean m3681m(String str, List list) {
        C2815c c2815c;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            m3682n("邀请群成员失败: chatroom/member为空");
            return false;
        }
        DexFinder dexFinder = this.f4518c;
        if (dexFinder == null || dexFinder.inviteChatroomMemberCtor == null || (c2815c = this.f4519d) == null) {
            m3682n("邀请群成员失败: API未就绪");
            return false;
        }
        ArrayList arrayListM3668c = m3668c(list);
        if (arrayListM3668c.isEmpty()) {
            m3682n("邀请群成员失败: member为空");
            return false;
        }
        m3680l();
        try {
            boolean zM6216j = c2815c.m6216j(KavaReflector.newInstance(dexFinder.inviteChatroomMemberCtor, str, arrayListM3668c, 0, null));
            StringBuilder sb2 = new StringBuilder("邀请群成员");
            sb2.append(zM6216j ? "成功" : "失败");
            sb2.append(": ");
            sb2.append(str);
            sb2.append(" count=");
            sb2.append(arrayListM3668c.size());
            m3682n(sb2.toString());
            return zM6216j;
        } catch (Throwable th2) {
            m3682n("邀请群成员异常: " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m3682n(String str) {
        if (this.f4520e != null) {
            C2005i.m4939f("[WeChatChatroomApi] ".concat(str));
        }
    }
}
