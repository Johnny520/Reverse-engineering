package na;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p024b9.C0215a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p096g8.C1360a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p153k8.C2351o;
import p153k8.InterfaceC2350n;
import p198nb.C2942k;
import p198nb.C2954w;
import p198nb.C2957z;
import p198nb.RunnableC2934f;
import p198nb.RunnableC2938h;
import p211o9.C3095h;
import p211o9.C3096i;
import p211o9.C3103p;
import p212oa.AbstractC3107b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p218og.C3147k;
import p222p.AbstractC3199a;
import p261rb.RunnableC3791g;
import p315v8.C4537q;
import p332wb.AbstractC4855en;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: na.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2915c implements InterfaceC2350n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9450a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9451b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2915c(Object obj, int i9) {
        this.f9450a = i9;
        this.f9451b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:260:0x03fa */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:296:0x0467 */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01a8, code lost:
    
        if (r8 != null) goto L116;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    @Override // p153k8.InterfaceC2350n
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo973a(C2351o c2351o) {
        int iIndexOf;
        String strM9264h;
        ?? r72;
        Object objM3729r;
        long j3;
        long jLongValue;
        long j4;
        String string;
        String str;
        boolean z9;
        List list;
        Iterator it;
        boolean z10;
        List list2;
        Iterator it2;
        boolean z11;
        int i9;
        List listM8407P1;
        C3096i c3096i;
        C3096i c3096i2;
        ArrayList arrayList;
        String strM3652c;
        switch (this.f9450a) {
            case 0:
                C2917e c2917e = (C2917e) this.f9451b;
                String str2 = c2351o.f7718f;
                String str3 = c2351o.f7717e;
                if ("red_packet".equals(c2351o.f7714b)) {
                    String strM6615e = c2351o.f7719g;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = str3;
                    }
                    if (TextUtils.isEmpty(strM6615e)) {
                        strM6615e = AbstractC3107b.m6615e(str2, "nativeurl");
                    }
                    if (TextUtils.isEmpty(strM6615e) && !TextUtils.isEmpty(str3)) {
                        strM6615e = AbstractC3107b.m6615e(str3, "nativeurl");
                    }
                    String str4 = strM6615e;
                    if (!TextUtils.isEmpty(str4)) {
                        String strM6615e2 = AbstractC3107b.m6615e(str2, "exclusive_recv_username");
                        if (TextUtils.isEmpty(strM6615e2) && !TextUtils.isEmpty(str3)) {
                            strM6615e2 = AbstractC3107b.m6615e(str3, "exclusive_recv_username");
                        }
                        String str5 = strM6615e2;
                        String strM6615e3 = AbstractC3107b.m6615e(str2, "fromusername");
                        if (TextUtils.isEmpty(strM6615e3) && !TextUtils.isEmpty(str3)) {
                            strM6615e3 = AbstractC3107b.m6615e(str3, "fromusername");
                        }
                        if (TextUtils.isEmpty(strM6615e3)) {
                            strM6615e3 = AbstractC3107b.m6614d(str4, "sendusername");
                        }
                        if (TextUtils.isEmpty(strM6615e3) && !TextUtils.isEmpty(str3) && (iIndexOf = str3.indexOf(":\n")) > 0) {
                            strM6615e3 = str3.substring(0, iIndexOf);
                        }
                        if (TextUtils.isEmpty(strM6615e3)) {
                            strM6615e3 = c2351o.f7716d;
                        }
                        c2917e.m6328e("Observe:" + c2351o.f7713a, str2, AbstractC3107b.m6617g(strM6615e3), AbstractC3107b.m6617g(c2351o.f7715c), str4, str5);
                        break;
                    }
                }
                break;
            case 1:
                C2954w c2954w = (C2954w) ((C0215a) this.f9451b).f524f;
                if (c2954w != null) {
                    C2957z c2957zM6374y = c2954w.m6374y();
                    if (c2957zM6374y.m6377b("text_speech_enable") && !c2351o.f7721i && !c2351o.m5630q()) {
                        boolean z12 = c2351o.m5634u() && c2957zM6374y.m6377b("text_speech_play_voice_messages");
                        if (WeChatSnsPost.TYPE_TEXT.equals(c2351o.f7714b) || z12) {
                            String strM5617d = c2351o.f7715c;
                            if (AbstractC3149m.m6721t0(strM5617d)) {
                                strM5617d = c2351o.m5617d();
                            }
                            String strM6839l = AbstractC3199a.m6839l(strM5617d, strM5617d);
                            if (strM6839l.length() != 0 && c2957zM6374y.m6376a().contains(strM6839l) && !C2954w.m6352k(c2957zM6374y)) {
                                WeChatMessage weChatMessage = c2351o.f7723k;
                                if (!z12) {
                                    String strBodyContent = weChatMessage != null ? weChatMessage.bodyContent() : null;
                                    ?? r73 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    if (strBodyContent == null) {
                                        strBodyContent = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    if (AbstractC3149m.m6721t0(strBodyContent)) {
                                        strBodyContent = c2351o.f7717e;
                                        if (AbstractC3149m.m6721t0(strBodyContent)) {
                                            strBodyContent = c2351o.m5614a();
                                        }
                                    }
                                    C3147k c3147k = C2954w.f9673A;
                                    String string2 = AbstractC3149m.m6703R0(c3147k.m6685f(strBodyContent, HttpUrl.FRAGMENT_ENCODE_SET)).toString();
                                    if (string2.length() == 0 || AbstractC3156t.m6740d0(string2, "<?xml", true) || AbstractC3156t.m6740d0(string2, "<msg", true) || AbstractC3156t.m6740d0(string2, "<appmsg", true)) {
                                        strM9264h = HttpUrl.FRAGMENT_ENCODE_SET;
                                    } else {
                                        Pattern patternCompile = Pattern.compile("\\s+");
                                        patternCompile.getClass();
                                        String strReplaceAll = patternCompile.matcher(string2).replaceAll(" ");
                                        strReplaceAll.getClass();
                                        strM9264h = AbstractC3149m.m6703R0(strReplaceAll).toString();
                                    }
                                    if (strM9264h.length() != 0) {
                                        if (c2957zM6374y.m6377b("text_speech_announce_sender")) {
                                            boolean z13 = c2351o.f7720h || c2351o.m5623j();
                                            String strM5616c = c2351o.f7716d;
                                            if (AbstractC3149m.m6721t0(strM5616c)) {
                                                strM5616c = c2351o.m5616c();
                                            }
                                            String strM6839l2 = AbstractC3199a.m6839l(strM5616c, strM5616c);
                                            C1368i c1368iM9259c = AbstractC4855en.m9259c();
                                            if (z13) {
                                                if (z13 && (strM6839l2.length() == 0 || strM6839l2.equals(strM6839l) || AbstractC3156t.m6733W(strM6839l2, "@chatroom", false))) {
                                                    String str6 = c2351o.f7717e;
                                                    str6.getClass();
                                                    C3145i c3145iM6680b = C3147k.m6680b(c3147k, AbstractC3149m.m6703R0(str6).toString());
                                                    String str7 = c3145iM6680b != null ? (String) AbstractC4166m.m8425w1(1, c3145iM6680b.m6676a()) : null;
                                                    strM6839l2 = str7 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str7;
                                                }
                                                r72 = r73;
                                                if (strM6839l2.length() != 0) {
                                                    r72 = r73;
                                                    if (!strM6839l2.equals(strM6839l)) {
                                                        String strM3731t = c1368iM9259c != null ? c1368iM9259c.m3731t(strM6839l, strM6839l2) : null;
                                                        if (strM3731t == null) {
                                                            strM3731t = HttpUrl.FRAGMENT_ENCODE_SET;
                                                        }
                                                        if (AbstractC3149m.m6721t0(strM3731t)) {
                                                            objM3729r = c1368iM9259c != null ? c1368iM9259c.m3729r(strM6839l2) : null;
                                                            if (objM3729r != null) {
                                                                r73 = objM3729r;
                                                            }
                                                        } else {
                                                            r73 = strM3731t;
                                                        }
                                                        boolean zM6721t0 = AbstractC3149m.m6721t0(r73);
                                                        r72 = r73;
                                                        if (zM6721t0) {
                                                            r72 = strM6839l2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (!AbstractC3149m.m6721t0(strM6839l2)) {
                                                    strM6839l = strM6839l2;
                                                }
                                                objM3729r = c1368iM9259c != null ? c1368iM9259c.m3729r(strM6839l) : null;
                                                if (objM3729r != null) {
                                                    r73 = objM3729r;
                                                }
                                                boolean zM6721t02 = AbstractC3149m.m6721t0(r73);
                                                r72 = r73;
                                                if (zM6721t02) {
                                                    r72 = strM6839l;
                                                }
                                            }
                                            if (r72.length() > 0) {
                                                strM9264h = AbstractC4855en.m9264h(r72, " 说，", strM9264h);
                                            }
                                        }
                                        c2954w.f9675b.post(new RunnableC2934f(c2954w, strM9264h, 0));
                                        break;
                                    }
                                } else {
                                    WeChatMessage weChatMessage2 = weChatMessage != null ? weChatMessage : c2351o.f7722j;
                                    long msgId = weChatMessage != null ? weChatMessage.getMsgId() : 0L;
                                    Long lValueOf = Long.valueOf(msgId);
                                    if (msgId <= 0) {
                                        lValueOf = null;
                                    }
                                    if (lValueOf != null) {
                                        jLongValue = lValueOf.longValue();
                                    } else if (weChatMessage2 == null) {
                                        j3 = 0;
                                        j4 = weChatMessage2 == null ? weChatMessage2.msgSvrId : 0L;
                                        if (j4 <= 0) {
                                            string = "svr:" + strM6839l + ":" + j4;
                                        } else if (j3 > 0) {
                                            string = AbstractC0255e.m1018g(j3, "local:");
                                        } else {
                                            long j5 = weChatMessage2 != null ? weChatMessage2.createTime : 0L;
                                            int iHashCode = c2351o.f7717e.hashCode();
                                            StringBuilder sbM2259v = AbstractC0921a.m2259v("transient:", strM6839l, ":", j5);
                                            sbM2259v.append(":");
                                            sbM2259v.append(iHashCode);
                                            string = sbM2259v.toString();
                                        }
                                        str = string;
                                        if (!c2954w.f9677d.add(str)) {
                                            objM3729r = weChatMessage2 != null ? C2954w.m6347C(weChatMessage2) : null;
                                            if (objM3729r == null) {
                                                objM3729r = C4173t.f13710g;
                                            }
                                            c2954w.f9675b.postDelayed(new RunnableC2938h(c2954w, new C2942k(str, strM6839l, j3, j4, weChatMessage2, objM3729r), c2954w.f9699z, 0), 300L);
                                            break;
                                        }
                                    } else {
                                        jLongValue = weChatMessage2.msgId;
                                    }
                                    j3 = jLongValue;
                                    if (weChatMessage2 == null) {
                                    }
                                    if (j4 <= 0) {
                                    }
                                    str = string;
                                    if (!c2954w.f9677d.add(str)) {
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                C3103p c3103p = (C3103p) this.f9451b;
                if (c3103p.f10026b.getBoolean("group_invite_detail_enable", false) && c2351o.m5632s() && c2351o.m5623j()) {
                    String strM5617d2 = c2351o.m5617d();
                    strM5617d2.getClass();
                    String string3 = AbstractC3149m.m6703R0(strM5617d2).toString();
                    if (AbstractC3149m.m6721t0(string3)) {
                        String str8 = c2351o.f7715c;
                        string3 = AbstractC3199a.m6839l(str8, str8);
                    }
                    if (string3.length() != 0) {
                        String strM5614a = c2351o.m5614a();
                        String str9 = c2351o.f7718f;
                        StringBuilder sb2 = new StringBuilder();
                        strM5614a.getClass();
                        if (!AbstractC3149m.m6721t0(strM5614a)) {
                            sb2.append(strM5614a);
                        }
                        str9.getClass();
                        if (!AbstractC3149m.m6721t0(str9)) {
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            sb2.append(str9);
                        }
                        String string4 = sb2.toString();
                        C3095h c3095h = null;
                        if (!AbstractC3149m.m6721t0(string4)) {
                            String strM6580i = C3103p.m6580i(string4);
                            List list3 = C3103p.f10020k;
                            if (list3 == null || !list3.isEmpty()) {
                                Iterator it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    if (AbstractC3149m.m6709h0(strM6580i, (String) it3.next(), true)) {
                                        z9 = true;
                                        list = C3103p.f10021l;
                                        if (list == null || !list.isEmpty()) {
                                            it = list.iterator();
                                            while (it.hasNext()) {
                                                if (AbstractC3149m.m6709h0(strM6580i, (String) it.next(), true)) {
                                                    z10 = true;
                                                    list2 = C3103p.f10022m;
                                                    if (list2 == null && list2.isEmpty()) {
                                                        z11 = false;
                                                        if (z9) {
                                                        }
                                                    } else {
                                                        it2 = list2.iterator();
                                                        while (it2.hasNext()) {
                                                            if (AbstractC3149m.m6709h0(strM6580i, (String) it2.next(), true)) {
                                                                z11 = true;
                                                                if (z9 && z10 && !z11) {
                                                                    String[] strArr = {str9, strM5614a};
                                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                    for (i9 = 0; i9 < 2; i9++) {
                                                                        String str10 = strArr[i9];
                                                                        C3103p.m6579h(string3, str10, linkedHashMap);
                                                                        String strM6580i2 = C3103p.m6580i(str10);
                                                                        if (!strM6580i2.equals(str10)) {
                                                                            C3103p.m6579h(string3, strM6580i2, linkedHashMap);
                                                                        }
                                                                    }
                                                                    Collection collectionValues = linkedHashMap.values();
                                                                    collectionValues.getClass();
                                                                    listM8407P1 = AbstractC4166m.m8407P1(collectionValues);
                                                                    if (!listM8407P1.isEmpty()) {
                                                                        String strM5616c2 = c2351o.m5616c();
                                                                        if (!C3103p.m6584r(string3, strM5616c2)) {
                                                                            strM5616c2 = null;
                                                                        }
                                                                        C3096i c3096i3 = strM5616c2 != null ? new C3096i(strM5616c2, HttpUrl.FRAGMENT_ENCODE_SET) : null;
                                                                        WeChatApis.contact().getClass();
                                                                        C1360a c1360a = WeChatApis.accountApi;
                                                                        if (c1360a == null || (strM3652c = c1360a.m3652c()) == null) {
                                                                            c3096i = null;
                                                                            if (listM8407P1.size() < 2) {
                                                                                c3096i2 = (C3096i) AbstractC4166m.m8422t1(listM8407P1);
                                                                                listM8407P1 = AbstractC4166m.m8419q1(1, listM8407P1);
                                                                            } else {
                                                                                if (c3096i3 == null) {
                                                                                    if (c3096i != null) {
                                                                                        if (!AbstractC3149m.m6709h0(string4, "你邀请", false)) {
                                                                                            c3096i = null;
                                                                                        }
                                                                                        c3096i3 = c3096i;
                                                                                    } else {
                                                                                        c3096i3 = null;
                                                                                    }
                                                                                }
                                                                                c3096i2 = c3096i3;
                                                                            }
                                                                            ArrayList arrayList2 = new ArrayList();
                                                                            for (Object obj : listM8407P1) {
                                                                                if (!((C3096i) obj).f9999a.equals(c3096i2.f9999a)) {
                                                                                    arrayList2.add(obj);
                                                                                }
                                                                            }
                                                                            HashSet hashSet = new HashSet();
                                                                            arrayList = new ArrayList();
                                                                            for (Object obj2 : arrayList2) {
                                                                                if (hashSet.add(((C3096i) obj2).f9999a)) {
                                                                                    arrayList.add(obj2);
                                                                                }
                                                                            }
                                                                            if (!arrayList.isEmpty()) {
                                                                                c3095h = new C3095h(c3096i2, arrayList);
                                                                            }
                                                                            break;
                                                                        } else {
                                                                            if (!C3103p.m6584r(string3, strM3652c)) {
                                                                                strM3652c = null;
                                                                            }
                                                                            if (strM3652c != null) {
                                                                                c3096i = new C3096i(strM3652c, HttpUrl.FRAGMENT_ENCODE_SET);
                                                                            }
                                                                            if (listM8407P1.size() < 2) {
                                                                            }
                                                                            ArrayList arrayList22 = new ArrayList();
                                                                            while (r4.hasNext()) {
                                                                            }
                                                                            HashSet hashSet2 = new HashSet();
                                                                            arrayList = new ArrayList();
                                                                            while (r5.hasNext()) {
                                                                            }
                                                                            if (!arrayList.isEmpty()) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z11 = false;
                                                        if (z9) {
                                                            String[] strArr2 = {str9, strM5614a};
                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                            while (i9 < 2) {
                                                            }
                                                            Collection collectionValues2 = linkedHashMap2.values();
                                                            collectionValues2.getClass();
                                                            listM8407P1 = AbstractC4166m.m8407P1(collectionValues2);
                                                            if (!listM8407P1.isEmpty()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z10 = false;
                                            list2 = C3103p.f10022m;
                                            if (list2 == null) {
                                                it2 = list2.iterator();
                                                while (it2.hasNext()) {
                                                }
                                                z11 = false;
                                                if (z9) {
                                                }
                                            }
                                        } else {
                                            z10 = false;
                                            list2 = C3103p.f10022m;
                                            if (list2 == null) {
                                            }
                                        }
                                    }
                                }
                                z9 = false;
                                list = C3103p.f10021l;
                                if (list == null) {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                    }
                                    z10 = false;
                                    list2 = C3103p.f10022m;
                                    if (list2 == null) {
                                    }
                                }
                            } else {
                                z9 = false;
                                list = C3103p.f10021l;
                                if (list == null) {
                                }
                            }
                        }
                        if (c3095h != null) {
                            c3103p.m6589C(string3, c3095h.f9997a);
                            Iterator it4 = c3095h.f9998b.iterator();
                            while (it4.hasNext()) {
                                c3103p.m6589C(string3, (C3096i) it4.next());
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                C4537q c4537q = (C4537q) this.f9451b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = c4537q.f14972c;
                String str11 = c2351o.f7715c;
                str11.getClass();
                if (!AbstractC3149m.m6721t0(str11) && !scheduledThreadPoolExecutor.isShutdown()) {
                    try {
                        scheduledThreadPoolExecutor.schedule(new RunnableC3791g(c4537q, 5, c2351o), c2351o.f7721i ? 250L : 0L, TimeUnit.MILLISECONDS);
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
        }
    }
}
