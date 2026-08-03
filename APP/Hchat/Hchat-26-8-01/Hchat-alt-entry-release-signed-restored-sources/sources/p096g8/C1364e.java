package p096g8;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p012ah.C0086a;
import p014b.C0126e;
import p036c9.C0480q1;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p106h8.C1624a;
import p106h8.C1625b;
import p108ha.C1636d;
import p108ha.C1642g;
import p108ha.C1644h;
import p108ha.C1650k;
import p125i8.C2005i;
import p153k8.C2345i;
import p153k8.C2355s;
import p153k8.InterfaceC2344h;
import p167l8.C2526a;
import p167l8.C2527b;
import p210o8.InterfaceC3079c;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p219oh.AbstractC3165h;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: g8.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1364e implements InterfaceC3079c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4523a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4524b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1364e(Object obj, int i9) {
        this.f4523a = i9;
        this.f4524b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04fe A[Catch: all -> 0x0502, TRY_LEAVE, TryCatch #2 {all -> 0x0502, blocks: (B:310:0x04f8, B:312:0x04fe), top: B:382:0x04f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r5
  0x002a: PHI (r5v80 long) = (r5v37 long), (r5v38 long), (r5v40 long), (r5v42 long), (r5v49 long), (r5v51 long), (r5v52 long) binds: [B:8:0x0028, B:11:0x0033, B:14:0x003e, B:17:0x0049, B:43:0x0094, B:41:0x008f, B:22:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p210o8.InterfaceC3079c
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2173a(C2526a c2526a) {
        C1363d c1363d;
        String str;
        String[] strArr;
        Object obj;
        int iIntValue;
        Long asLong;
        C1368i c1368i;
        String[] strArr2;
        C1624a c1624a;
        C2527b c2527b;
        String str2;
        String str3;
        String str4;
        long j3;
        WeChatMessage weChatMessage;
        Long asLong2;
        Long asLong3;
        int iIntValue2;
        Long asLong4;
        C2355s c2355s;
        switch (this.f4523a) {
            case 0:
                C1366g c1366g = (C1366g) this.f4524b;
                c1366g.getClass();
                if ("chatroom".equalsIgnoreCase(c2526a.f8162b)) {
                    ContentValues contentValues = c2526a.f8164d;
                    String strValueOf = HttpUrl.FRAGMENT_ENCODE_SET;
                    if (contentValues != null && !TextUtils.isEmpty("chatroomname") && contentValues.containsKey("chatroomname") && (obj = contentValues.get("chatroomname")) != null) {
                        strValueOf = String.valueOf(obj);
                    }
                    if (TextUtils.isEmpty(strValueOf) && (str = c2526a.f8165e) != null && str.toLowerCase().contains("chatroomname") && (strArr = c2526a.f8166f) != null && strArr.length > 0) {
                        strValueOf = strArr[0];
                    }
                    C0126e c0126e = new C0126e(c2526a, 8, (TextUtils.isEmpty(strValueOf) || (c1363d = c1366g.f4526b) == null) ? null : c1363d.m3673e(strValueOf));
                    Iterator it = c1366g.f4528d.iterator();
                    while (it.hasNext()) {
                        try {
                            ((InterfaceC1365f) it.next()).mo2162a(c0126e);
                        } catch (Throwable th2) {
                            String str5 = "群聊变更回调失败: " + th2.getMessage();
                            if (c1366g.f4527c != null) {
                                C2005i.m4939f("[WeChatChatroomChangeApi] ".concat(str5));
                            }
                        }
                    }
                    return;
                }
                return;
            case 1:
                C1369j c1369j = (C1369j) this.f4524b;
                c1369j.getClass();
                String str6 = c2526a.f8162b;
                if ("rcontact".equalsIgnoreCase(str6) || "img_flag".equalsIgnoreCase(str6)) {
                    ContentValues contentValues2 = c2526a.f8164d;
                    String strM3738a = C1369j.m3738a(contentValues2, "username");
                    if ((TextUtils.isEmpty(strM3738a) || (c1368i = c1369j.f4550b) == null || c1368i.m3725n(strM3738a) == null) && "rcontact".equalsIgnoreCase(str6) && contentValues2 != null) {
                        String strM3738a2 = C1369j.m3738a(contentValues2, "nickname");
                        String strM3738a3 = C1369j.m3738a(contentValues2, "alias");
                        String strM3738a4 = C1369j.m3738a(contentValues2, "conRemark");
                        String strM3738a5 = C1369j.m3738a(contentValues2, "encryptUsername");
                        String strM3738a6 = C1369j.m3738a(contentValues2, "province");
                        String strM3738a7 = C1369j.m3738a(contentValues2, "city");
                        int iIntValue3 = 0;
                        if (TextUtils.isEmpty("sex") || !contentValues2.containsKey("sex")) {
                            iIntValue = 0;
                            if (!TextUtils.isEmpty("type") && contentValues2.containsKey("type")) {
                                try {
                                    asLong = contentValues2.getAsLong("type");
                                    if (asLong != null) {
                                        iIntValue3 = asLong.intValue();
                                    }
                                    break;
                                } catch (Throwable unused) {
                                }
                            }
                            new WeChatContact(strM3738a, strM3738a2, strM3738a3, strM3738a4, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, strM3738a5, strM3738a6, strM3738a7, iIntValue, iIntValue3);
                        } else {
                            try {
                                Long asLong5 = contentValues2.getAsLong("sex");
                                if (asLong5 != null) {
                                    iIntValue = asLong5.intValue();
                                }
                            } catch (Throwable unused2) {
                            }
                            if (!TextUtils.isEmpty("type")) {
                                asLong = contentValues2.getAsLong("type");
                                if (asLong != null) {
                                }
                            }
                            new WeChatContact(strM3738a, strM3738a2, strM3738a3, strM3738a4, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, strM3738a5, strM3738a6, strM3738a7, iIntValue, iIntValue3);
                        }
                    }
                    Iterator it2 = c1369j.f4552d.iterator();
                    while (it2.hasNext()) {
                        if (it2.next() != null) {
                            C0086a.m445d();
                            return;
                        }
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            String str7 = "联系人变更回调失败: " + th3.getMessage();
                            if (c1369j.f4551c != null) {
                                C2005i.m4939f("[WeChatContactChangeApi] ".concat(str7));
                            }
                        }
                    }
                    return;
                }
                return;
            case 2:
                C1625b c1625b = (C1625b) this.f4524b;
                c1625b.getClass();
                ContentValues contentValues3 = c2526a.f8164d;
                if ("rconversation".equalsIgnoreCase(c2526a.f8162b)) {
                    String str8 = HttpUrl.FRAGMENT_ENCODE_SET;
                    String strM4150b = C1625b.m4150b(contentValues3, "username");
                    if (TextUtils.isEmpty(strM4150b)) {
                        String str9 = c2526a.f8165e;
                        if (!TextUtils.isEmpty(str9) && str9.toLowerCase(Locale.US).contains("username") && (strArr2 = c2526a.f8166f) != null) {
                            int length = strArr2.length;
                            int i9 = 0;
                            while (true) {
                                if (i9 < length) {
                                    String str10 = strArr2[i9];
                                    if (TextUtils.isEmpty(str10)) {
                                        i9++;
                                    } else {
                                        str8 = str10;
                                    }
                                }
                            }
                        }
                    } else {
                        str8 = strM4150b;
                    }
                    C2527b c2527b2 = null;
                    if (TextUtils.isEmpty(str8) || (c1624a = c1625b.f5322b) == null) {
                        if (contentValues3 != null) {
                            C1625b.m4149a(contentValues3, "unReadCount");
                            C1625b.m4149a(contentValues3, "status");
                            C1625b.m4149a(contentValues3, "isSend");
                            if (!TextUtils.isEmpty("conversationTime") && contentValues3.containsKey("conversationTime")) {
                                try {
                                    contentValues3.getAsLong("conversationTime");
                                    break;
                                } catch (Throwable unused3) {
                                }
                            }
                            C1625b.m4150b(contentValues3, "content");
                            C1625b.m4150b(contentValues3, "msgType");
                            if (!TextUtils.isEmpty("flag") && contentValues3.containsKey("flag")) {
                                try {
                                    contentValues3.getAsLong("flag");
                                    break;
                                } catch (Throwable unused4) {
                                }
                            }
                            C1625b.m4150b(contentValues3, "digest");
                            C1625b.m4150b(contentValues3, "digestUser");
                            C1625b.m4149a(contentValues3, "atCount");
                            C1625b.m4149a(contentValues3, "unReadMuteCount");
                            C1625b.m4149a(contentValues3, "hasTodo");
                            c2527b2 = new C2527b(str8);
                        }
                    } else if (TextUtils.isEmpty(str8)) {
                        c2527b = null;
                        if (c2527b == null) {
                            c2527b2 = c2527b;
                        }
                    } else {
                        ArrayList arrayListM4148i = c1624a.m4148i("SELECT username, unReadCount, status, isSend, conversationTime, content, msgType, flag, digest, digestUser, atCount, unReadMuteCount, hasTodo FROM rconversation WHERE username=? LIMIT 1", new String[]{str8});
                        if (!arrayListM4148i.isEmpty()) {
                            c2527b = (C2527b) arrayListM4148i.get(0);
                        }
                        if (c2527b == null) {
                        }
                    }
                    C0126e c0126e2 = new C0126e(c2526a, 10, c2527b2);
                    Iterator it3 = c1625b.f5324d.iterator();
                    while (it3.hasNext()) {
                        try {
                            ((C0480q1) it3.next()).m1510a(c0126e2);
                        } catch (Throwable th4) {
                            String str11 = "会话变更回调失败: " + th4.getMessage();
                            if (c1625b.f5323c != null) {
                                C2005i.m4939f("[WeChatConversationChangeApi] ".concat(str11));
                            }
                        }
                    }
                    return;
                }
                return;
            case 3:
                C1636d c1636d = (C1636d) this.f4524b;
                if (AbstractC3156t.m6734X(c2526a.f8162b, "SnsInfo") && "delete".equals(c2526a.f8161a)) {
                    String str12 = c2526a.f8165e;
                    if (str12 == null) {
                        str12 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (AbstractC3149m.m6709h0(str12, "snsId", true)) {
                        String[] strArr3 = c2526a.f8166f;
                        if (strArr3 == null || (str2 = (String) AbstractC4165l.m8391z0(strArr3)) == null) {
                            Pattern patternCompile = Pattern.compile("snsId\\s*=\\s*['\"]?([0-9]+)", 66);
                            patternCompile.getClass();
                            Matcher matcher = patternCompile.matcher(str12);
                            matcher.getClass();
                            C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str12);
                            str2 = c3145iM238b != null ? (String) AbstractC4166m.m8425w1(1, c3145iM238b.m6676a()) : null;
                        }
                        String strM6758J = AbstractC3165h.m6758J(str2);
                        if (strM6758J != null) {
                            ScheduledFuture scheduledFuture = (ScheduledFuture) c1636d.f5365h.remove(strM6758J);
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            synchronized (c1636d.f5361d) {
                            }
                            c1636d.m4162c("已取消被删除朋友圈的待评论任务");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                C1644h c1644h = (C1644h) this.f4524b;
                if (AbstractC3156t.m6734X(c2526a.f8162b, "SnsInfo") && "delete".equals(c2526a.f8161a)) {
                    String str13 = c2526a.f8165e;
                    if (str13 == null) {
                        str13 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    boolean z9 = true;
                    String strM6758J2 = null;
                    if (AbstractC3149m.m6709h0(str13, "snsId", true)) {
                        String[] strArr4 = c2526a.f8166f;
                        if (strArr4 == null || (str3 = (String) AbstractC4165l.m8391z0(strArr4)) == null) {
                            Pattern patternCompile2 = Pattern.compile("snsId\\s*=\\s*['\"]?([0-9-]+)", 66);
                            patternCompile2.getClass();
                            Matcher matcher2 = patternCompile2.matcher(str13);
                            matcher2.getClass();
                            C3145i c3145iM238b2 = AbstractC0018a.m238b(matcher2, 0, str13);
                            if (c3145iM238b2 != null) {
                                strM6758J2 = (String) AbstractC4166m.m8425w1(1, c3145iM238b2.m6676a());
                            }
                        } else {
                            strM6758J2 = str3;
                        }
                        strM6758J2 = AbstractC3165h.m6758J(strM6758J2);
                    }
                    if (strM6758J2 != null) {
                        synchronized (c1644h.f5399e) {
                            try {
                                C1642g c1642g = (C1642g) c1644h.f5403i.remove(strM6758J2);
                                if (c1642g != null) {
                                    c1642g.f5385e.set(true);
                                    ScheduledFuture scheduledFuture2 = c1642g.f5387g;
                                    if (scheduledFuture2 != null) {
                                        scheduledFuture2.cancel(true);
                                    }
                                } else {
                                    z9 = false;
                                }
                                if (c1644h.f5404j) {
                                    c1644h.m4189k(strM6758J2);
                                }
                            } catch (Throwable th5) {
                                throw th5;
                            }
                            break;
                        }
                        if (z9) {
                            c1644h.m4187i("已取消被删除朋友圈的待转发任务");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                C1650k c1650k = (C1650k) this.f4524b;
                if (AbstractC3156t.m6734X(c2526a.f8162b, "SnsInfo") && "delete".equals(c2526a.f8161a)) {
                    String str14 = c2526a.f8165e;
                    if (str14 == null) {
                        str14 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (AbstractC3149m.m6709h0(str14, "snsId", true)) {
                        String[] strArr5 = c2526a.f8166f;
                        if (strArr5 == null || (str4 = (String) AbstractC4165l.m8391z0(strArr5)) == null) {
                            Pattern patternCompile3 = Pattern.compile("snsId\\s*=\\s*['\"]?([0-9]+)", 66);
                            patternCompile3.getClass();
                            Matcher matcher3 = patternCompile3.matcher(str14);
                            matcher3.getClass();
                            C3145i c3145iM238b3 = AbstractC0018a.m238b(matcher3, 0, str14);
                            str4 = c3145iM238b3 != null ? (String) AbstractC4166m.m8425w1(1, c3145iM238b3.m6676a()) : null;
                        }
                        String strM6758J3 = AbstractC3165h.m6758J(str4);
                        if (strM6758J3 != null) {
                            ScheduledFuture scheduledFuture3 = (ScheduledFuture) c1650k.f5435h.remove(strM6758J3);
                            if (scheduledFuture3 != null) {
                                scheduledFuture3.cancel(false);
                            }
                            synchronized (c1650k.f5431d) {
                            }
                            c1650k.m4221b("已取消被删除朋友圈的待点赞任务");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C2345i c2345i = (C2345i) this.f4524b;
                ContentValues contentValues4 = c2526a.f8164d;
                if ("message".equalsIgnoreCase(c2526a.f8162b)) {
                    long jM5604c = C2345i.m5604c(contentValues4, "msgId");
                    if (jM5604c > 0) {
                        j3 = jM5604c;
                    } else {
                        jM5604c = C2345i.m5604c(contentValues4, "msgid");
                        if (jM5604c <= 0) {
                            jM5604c = C2345i.m5604c(contentValues4, "_id");
                            if (jM5604c <= 0) {
                                jM5604c = C2345i.m5604c(contentValues4, "rowid");
                                if (jM5604c <= 0) {
                                    if ("insert".equals(c2526a.f8161a)) {
                                        jM5604c = c2526a.f8163c;
                                        if (jM5604c <= 0) {
                                            String str15 = c2526a.f8165e;
                                            String[] strArr6 = c2526a.f8166f;
                                            if (TextUtils.isEmpty(str15) || strArr6 == null || strArr6.length == 0 || !str15.toLowerCase(Locale.US).contains("msgid")) {
                                                j3 = 0;
                                            } else {
                                                int length2 = strArr6.length;
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 < length2) {
                                                        String str16 = strArr6[i10];
                                                        if (!TextUtils.isEmpty(str16)) {
                                                            try {
                                                                long j4 = Long.parseLong(str16);
                                                                if (j4 > 0) {
                                                                    jM5604c = j4;
                                                                }
                                                            } catch (Throwable unused5) {
                                                                continue;
                                                            }
                                                        }
                                                        i10++;
                                                    } else {
                                                        jM5604c = 0;
                                                    }
                                                }
                                                j3 = jM5604c;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (j3 <= 0 || (c2355s = c2345i.f7694b) == null || (weChatMessage = c2355s.m5661c(j3)) == null) {
                        weChatMessage = null;
                        asLong = null;
                        asLong = null;
                        Long asLong6 = null;
                        if (contentValues4 != null) {
                            long jM5604c2 = C2345i.m5604c(contentValues4, "msgSvrId");
                            if (TextUtils.isEmpty("type") || !contentValues4.containsKey("type")) {
                                asLong2 = null;
                                int iIntValue4 = asLong2 == null ? asLong2.intValue() : 0;
                                if (TextUtils.isEmpty("status") && contentValues4.containsKey("status")) {
                                    try {
                                        asLong3 = contentValues4.getAsLong("status");
                                    } catch (Throwable unused6) {
                                        asLong3 = null;
                                    }
                                    if (asLong3 != null) {
                                    }
                                    if (TextUtils.isEmpty("isSend")) {
                                        asLong4 = null;
                                        if (asLong4 != null) {
                                        }
                                        long jM5604c3 = C2345i.m5604c(contentValues4, "createTime");
                                        String strM5605d = C2345i.m5605d(contentValues4, "talker");
                                        String strM5605d2 = C2345i.m5605d(contentValues4, "content");
                                        String strM5605d3 = C2345i.m5605d(contentValues4, "imgPath");
                                        String strM5605d4 = C2345i.m5605d(contentValues4, "reserved");
                                        String strM5605d5 = C2345i.m5605d(contentValues4, "transContent");
                                        if (!TextUtils.isEmpty("flag")) {
                                        }
                                        int iIntValue5 = asLong6 != null ? asLong6.intValue() : 0;
                                        String strM5605d6 = C2345i.m5605d(contentValues4, "msgSource");
                                        C1360a c1360a = c2345i.f7695c;
                                        weChatMessage = new WeChatMessage(j3, jM5604c2, iIntValue4, iIntValue2, iIntValue, jM5604c3, strM5605d, strM5605d2, strM5605d3, strM5605d4, strM5605d5, iIntValue5, strM5605d6, c1360a != null ? c1360a.m3652c() : HttpUrl.FRAGMENT_ENCODE_SET);
                                    }
                                } else {
                                    asLong3 = null;
                                    iIntValue2 = asLong3 != null ? asLong3.intValue() : 0;
                                    if (TextUtils.isEmpty("isSend") || !contentValues4.containsKey("isSend")) {
                                        asLong4 = null;
                                        int iIntValue6 = asLong4 != null ? asLong4.intValue() : 0;
                                        long jM5604c32 = C2345i.m5604c(contentValues4, "createTime");
                                        String strM5605d7 = C2345i.m5605d(contentValues4, "talker");
                                        String strM5605d22 = C2345i.m5605d(contentValues4, "content");
                                        String strM5605d32 = C2345i.m5605d(contentValues4, "imgPath");
                                        String strM5605d42 = C2345i.m5605d(contentValues4, "reserved");
                                        String strM5605d52 = C2345i.m5605d(contentValues4, "transContent");
                                        if (!TextUtils.isEmpty("flag") && contentValues4.containsKey("flag")) {
                                            try {
                                                asLong6 = contentValues4.getAsLong("flag");
                                                break;
                                            } catch (Throwable unused7) {
                                            }
                                        }
                                        int iIntValue52 = asLong6 != null ? asLong6.intValue() : 0;
                                        String strM5605d62 = C2345i.m5605d(contentValues4, "msgSource");
                                        C1360a c1360a2 = c2345i.f7695c;
                                        weChatMessage = new WeChatMessage(j3, jM5604c2, iIntValue4, iIntValue2, iIntValue6, jM5604c32, strM5605d7, strM5605d22, strM5605d32, strM5605d42, strM5605d52, iIntValue52, strM5605d62, c1360a2 != null ? c1360a2.m3652c() : HttpUrl.FRAGMENT_ENCODE_SET);
                                    } else {
                                        try {
                                            asLong4 = contentValues4.getAsLong("isSend");
                                        } catch (Throwable unused8) {
                                            asLong4 = null;
                                        }
                                        if (asLong4 != null) {
                                        }
                                        long jM5604c322 = C2345i.m5604c(contentValues4, "createTime");
                                        String strM5605d72 = C2345i.m5605d(contentValues4, "talker");
                                        String strM5605d222 = C2345i.m5605d(contentValues4, "content");
                                        String strM5605d322 = C2345i.m5605d(contentValues4, "imgPath");
                                        String strM5605d422 = C2345i.m5605d(contentValues4, "reserved");
                                        String strM5605d522 = C2345i.m5605d(contentValues4, "transContent");
                                        if (!TextUtils.isEmpty("flag")) {
                                            asLong6 = contentValues4.getAsLong("flag");
                                        }
                                        int iIntValue522 = asLong6 != null ? asLong6.intValue() : 0;
                                        String strM5605d622 = C2345i.m5605d(contentValues4, "msgSource");
                                        C1360a c1360a22 = c2345i.f7695c;
                                        weChatMessage = new WeChatMessage(j3, jM5604c2, iIntValue4, iIntValue2, iIntValue6, jM5604c322, strM5605d72, strM5605d222, strM5605d322, strM5605d422, strM5605d522, iIntValue522, strM5605d622, c1360a22 != null ? c1360a22.m3652c() : HttpUrl.FRAGMENT_ENCODE_SET);
                                    }
                                }
                            } else {
                                try {
                                    asLong2 = contentValues4.getAsLong("type");
                                } catch (Throwable unused9) {
                                    asLong2 = null;
                                }
                                if (asLong2 == null) {
                                }
                                if (TextUtils.isEmpty("status")) {
                                    asLong3 = null;
                                    if (asLong3 != null) {
                                    }
                                    if (TextUtils.isEmpty("isSend")) {
                                    }
                                }
                            }
                        }
                        break;
                    }
                    C0126e c0126e3 = new C0126e(c2526a, 19, weChatMessage);
                    Iterator it4 = c2345i.f7697e.iterator();
                    while (it4.hasNext()) {
                        try {
                            ((InterfaceC2344h) it4.next()).mo2171a(c0126e3);
                        } catch (Throwable th6) {
                            String str17 = "消息变更回调失败: " + th6.getMessage();
                            if (c2345i.f7696d != null) {
                                C2005i.m4939f("[WeChatMessageChangeApi] ".concat(str17));
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }
}
