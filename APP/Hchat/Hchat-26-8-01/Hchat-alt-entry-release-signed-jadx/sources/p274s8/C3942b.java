package p274s8;

import android.content.ContentValues;
import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p096g8.C1360a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.utils.KavaReflector;
import p153k8.C2353q;
import p153k8.C2355s;
import p167l8.C2530e;
import p167l8.C2531f;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p258r8.C3742g;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: s8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3942b extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12923a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3943c f12924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3742g f12925c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3942b(C3943c c3943c, C3742g c3742g, int i9) {
        this.f12923a = i9;
        this.f12924b = c3943c;
        this.f12925c = c3742g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0538 A[PHI: r0
  0x0538: PHI (r0v71 java.lang.String) = (r0v9 java.lang.String), (r0v5 java.lang.String) binds: [B:357:0x056b, B:340:0x0535] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0787  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object next;
        String str;
        Object obj;
        Object c3959f;
        String str2;
        Object obj2;
        long jLongValue;
        int iIntValue;
        int i9;
        Map mapM8143L;
        Long lM6743g0;
        Object[] objArr;
        Object c3959f2;
        String str3;
        Long lM8145P;
        Number number;
        long j3;
        long jLongValue2;
        Object field;
        int iIntValue2;
        long jLongValue3;
        String str4;
        C2531f c2531f;
        long jLongValue4;
        String str5;
        WeChatMessage weChatMessageM5663e;
        C2531f c2531f2;
        boolean z9;
        WeChatMessage weChatMessage;
        String string;
        String str6;
        C2530e c2530eM5651k;
        Object[] objArr2;
        Object obj3;
        int i10 = this.f12923a;
        C3742g c3742g = this.f12925c;
        C3943c c3943c = this.f12924b;
        switch (i10) {
            case 0:
                methodHookParam.getClass();
                if (C3943c.m8146k(c3943c, c3742g) && C3943c.m8137C(c3742g)) {
                    Object[] objArr3 = methodHookParam.args;
                    ConcurrentHashMap concurrentHashMap = c3943c.f12930h;
                    if (objArr3 != null) {
                        Object objM8391z0 = AbstractC4165l.m8391z0(objArr3);
                        String str7 = objM8391z0 instanceof String ? (String) objM8391z0 : null;
                        if (str7 == null || AbstractC3149m.m6721t0(str7)) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj4 : objArr3) {
                                if (obj4 instanceof String) {
                                    arrayList.add(obj4);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (C3943c.m8152u((String) next)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            str7 = (String) next;
                            str = str7 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str7;
                        }
                        if (C3943c.m8152u(str)) {
                            int length = objArr3.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 < length) {
                                    obj = objArr3[i11];
                                    if (!(obj instanceof ContentValues)) {
                                        i11++;
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            ContentValues contentValues = obj instanceof ContentValues ? (ContentValues) obj : null;
                            if (contentValues != null) {
                                String asString = contentValues.getAsString("content");
                                String str8 = asString == null ? HttpUrl.FRAGMENT_ENCODE_SET : asString;
                                try {
                                    Integer asInteger = contentValues.getAsInteger("type");
                                    c3959f = Integer.valueOf(asInteger != null ? asInteger.intValue() : 0);
                                } catch (Throwable th2) {
                                    c3959f = new C3959f(th2);
                                }
                                if (c3959f instanceof C3959f) {
                                    c3959f = 0;
                                }
                                if (C3943c.m8136B(((Number) c3959f).intValue()) || AbstractC3149m.m6709h0(str8, "撤回", false) || AbstractC3149m.m6709h0(str8, "revokemsg", true)) {
                                    int length2 = objArr3.length;
                                    boolean z10 = false;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= length2) {
                                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                        } else {
                                            Object obj5 = objArr3[i12];
                                            if (obj5 instanceof ContentValues) {
                                                z10 = true;
                                            } else if (z10 && (obj5 instanceof String)) {
                                                str2 = (String) obj5;
                                            }
                                            i12++;
                                        }
                                    }
                                    int length3 = objArr3.length;
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < length3) {
                                            obj2 = objArr3[i13];
                                            if (!(obj2 instanceof Object[]) || !AbstractC1416l.m3825a(obj2.getClass().getComponentType(), String.class)) {
                                                i13++;
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    String[] strArr = obj2 instanceof String[] ? (String[]) obj2 : null;
                                    if (AbstractC3149m.m6721t0(str2) || strArr == null || strArr.length == 0 || !AbstractC3149m.m6709h0(str2, "msgId", true)) {
                                        jLongValue = 0;
                                    } else {
                                        int length4 = strArr.length;
                                        int i14 = 0;
                                        while (true) {
                                            if (i14 >= length4) {
                                                lM6743g0 = null;
                                            } else {
                                                lM6743g0 = AbstractC3156t.m6743g0(strArr[i14]);
                                                if (lM6743g0 == null || lM6743g0.longValue() <= 0) {
                                                    lM6743g0 = null;
                                                }
                                                if (lM6743g0 == null) {
                                                    i14++;
                                                }
                                            }
                                        }
                                        if (lM6743g0 != null) {
                                            jLongValue = lM6743g0.longValue();
                                        }
                                    }
                                    if (jLongValue > 0) {
                                        Map map = (Map) concurrentHashMap.get(Long.valueOf(jLongValue));
                                        if (map == null) {
                                            WeChatDatabaseApi weChatDatabaseApiDatabase = WeChatApis.database();
                                            if (weChatDatabaseApiDatabase != null) {
                                                Map mapM8143L2 = C3943c.m8143L(jLongValue, str);
                                                if (mapM8143L2 != null) {
                                                    mapM8143L = mapM8143L2;
                                                } else {
                                                    Iterator<String> it2 = weChatDatabaseApiDatabase.messageTables().iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            String next2 = it2.next();
                                                            next2.getClass();
                                                            Map mapM8143L3 = C3943c.m8143L(jLongValue, next2);
                                                            if (mapM8143L3 != null) {
                                                                mapM8143L = mapM8143L3;
                                                            }
                                                        } else {
                                                            mapM8143L = C3943c.m8143L(jLongValue, "message");
                                                        }
                                                    }
                                                }
                                            } else {
                                                mapM8143L = null;
                                            }
                                            if (mapM8143L != null) {
                                                map = mapM8143L;
                                                concurrentHashMap.put(Long.valueOf(jLongValue), map);
                                            } else {
                                                map = null;
                                            }
                                        }
                                        C2355s c2355sMessageStore = WeChatApis.messageStore();
                                        WeChatMessage weChatMessageM5661c = c2355sMessageStore != null ? c2355sMessageStore.m5661c(jLongValue) : null;
                                        if (c3943c.f12929g.contains(Long.valueOf(jLongValue)) || (weChatMessageM5661c != null && weChatMessageM5661c.isSend())) {
                                            c3943c.m8160F(jLongValue);
                                            if (map != null) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    String str9 = (String) entry.getKey();
                                                    Object value = entry.getValue();
                                                    if (!AbstractC3149m.m6721t0(str9)) {
                                                        Set set = C3943c.f12926n;
                                                        Locale locale = Locale.US;
                                                        locale.getClass();
                                                        String lowerCase = str9.toLowerCase(locale);
                                                        lowerCase.getClass();
                                                        if (!set.contains(lowerCase)) {
                                                            if (value instanceof byte[]) {
                                                                contentValues.put(str9, (byte[]) value);
                                                            } else if (value instanceof String) {
                                                                contentValues.put(str9, (String) value);
                                                            } else if (value instanceof Integer) {
                                                                contentValues.put(str9, (Integer) value);
                                                            } else if (value instanceof Long) {
                                                                contentValues.put(str9, (Long) value);
                                                            } else if (value instanceof Short) {
                                                                contentValues.put(str9, (Short) value);
                                                            } else if (value instanceof Float) {
                                                                contentValues.put(str9, (Float) value);
                                                            } else if (value instanceof Double) {
                                                                contentValues.put(str9, (Double) value);
                                                            } else if (value instanceof Boolean) {
                                                                contentValues.put(str9, (Boolean) value);
                                                            } else {
                                                                contentValues.put(str9, value.toString());
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (weChatMessageM5661c != null) {
                                                int i15 = weChatMessageM5661c.type;
                                                Integer numValueOf = Integer.valueOf(i15);
                                                if (i15 <= 0 || C3943c.m8136B(i15)) {
                                                    numValueOf = null;
                                                }
                                                iIntValue = numValueOf != null ? numValueOf.intValue() : 1;
                                            }
                                            contentValues.put("type", Integer.valueOf(iIntValue));
                                            contentValues.put("isSend", Integer.valueOf(weChatMessageM5661c != null ? weChatMessageM5661c.isSend : 1));
                                            if (weChatMessageM5661c != null && (i9 = weChatMessageM5661c.status) > 0) {
                                                contentValues.put("status", Integer.valueOf(i9));
                                            }
                                            if (weChatMessageM5661c != null) {
                                                if (!AbstractC3149m.m6721t0(weChatMessageM5661c.imagePath)) {
                                                    contentValues.put("imgPath", weChatMessageM5661c.imagePath);
                                                }
                                                if (!AbstractC3149m.m6721t0(weChatMessageM5661c.reserved)) {
                                                    contentValues.put("reserved", weChatMessageM5661c.reserved);
                                                }
                                                if (!AbstractC3149m.m6721t0(weChatMessageM5661c.translatedContent)) {
                                                    contentValues.put("transContent", weChatMessageM5661c.translatedContent);
                                                }
                                                if (!AbstractC3149m.m6721t0(weChatMessageM5661c.msgSource)) {
                                                    contentValues.put("msgSource", weChatMessageM5661c.msgSource);
                                                }
                                                int i16 = weChatMessageM5661c.flag;
                                                if (i16 != 0) {
                                                    contentValues.put("flag", Integer.valueOf(i16));
                                                }
                                            }
                                            if (AbstractC3149m.m6709h0(str8, "撤回", false) || AbstractC3149m.m6709h0(str8, "revokemsg", true)) {
                                                String str10 = weChatMessageM5661c != null ? weChatMessageM5661c.content : null;
                                                String str11 = str10 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str10;
                                                if (!AbstractC3149m.m6721t0(str11)) {
                                                    contentValues.put("content", str11);
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            case 1:
                methodHookParam.getClass();
                Set set2 = c3943c.f12927e;
                C3742g c3742g2 = this.f12925c;
                if (C3943c.m8146k(c3943c, c3742g2) && (objArr = methodHookParam.args) != null) {
                    Object objM8366C0 = AbstractC4165l.m8366C0(0, objArr);
                    String str12 = objM8366C0 instanceof String ? (String) objM8366C0 : null;
                    if (str12 == null) {
                        str12 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    Object objM8366C02 = AbstractC4165l.m8366C0(1, objArr);
                    Number number2 = objM8366C02 instanceof Number ? (Number) objM8366C02 : null;
                    long jLongValue5 = number2 != null ? number2.longValue() : 0L;
                    Object objM8366C03 = AbstractC4165l.m8366C0(3, objArr);
                    String str13 = objM8366C03 instanceof String ? (String) objM8366C03 : null;
                    if (str13 == null) {
                        str13 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    Object objM8366C04 = AbstractC4165l.m8366C0(2, objArr);
                    Object field2 = KavaReflector.readField(objM8366C04, "a");
                    C1360a c1360aAccount = WeChatApis.account();
                    String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
                    try {
                        c3959f2 = Long.valueOf((WeChatApis.messageParser() == null || (c2530eM5651k = C2353q.m5651k(field2, strM3652c == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3652c)) == null) ? 0L : c2530eM5651k.f8176c);
                    } catch (Throwable th3) {
                        c3959f2 = new C3959f(th3);
                    }
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = 0L;
                    }
                    long jM8142K = C3943c.m8142K(((Number) c3959f2).longValue());
                    Long lValueOf = Long.valueOf(jM8142K);
                    if (jM8142K <= 0) {
                        lValueOf = null;
                    }
                    long jLongValue6 = lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis();
                    Object field3 = KavaReflector.readField(objM8366C04, "a");
                    String strM8147l = C3943c.m8147l(field3, "h");
                    String strM8147l2 = C3943c.m8147l(field3, "e");
                    String string2 = AbstractC3149m.m6703R0(str13).toString();
                    long j4 = jLongValue6;
                    if (AbstractC3156t.m6740d0(string2, "你撤回", false) || AbstractC3156t.m6740d0(string2, "\"你\"撤回", false) || AbstractC3156t.m6740d0(string2, "“你”撤回", false)) {
                        strM8147l2 = "你";
                    } else {
                        if (!C3943c.m8157z(str12, strM8147l2)) {
                            if (AbstractC3149m.m6721t0(str13)) {
                                string = HttpUrl.FRAGMENT_ENCODE_SET;
                            } else {
                                Pattern patternCompile = Pattern.compile("[\"“](.*?)[\"”]\\s*撤回");
                                patternCompile.getClass();
                                Matcher matcher = patternCompile.matcher(str13);
                                matcher.getClass();
                                C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str13);
                                string = (c3145iM238b == null || (str6 = (String) AbstractC4166m.m8425w1(1, c3145iM238b.m6676a())) == null) ? null : AbstractC3149m.m6703R0(str6).toString();
                                if (string == null || AbstractC3149m.m6721t0(string)) {
                                    string = AbstractC3149m.m6704S0(AbstractC3149m.m6703R0(AbstractC3149m.m6699N0(str13, "撤回")).toString(), '\"', 8220, 8221);
                                }
                            }
                            str3 = string;
                        }
                        String strM8147l3 = C3943c.m8147l(field3, "f");
                        lM8145P = C3943c.m8145P(strM8147l, "msgid");
                        Object field4 = KavaReflector.readField(field3, "r");
                        number = !(field4 instanceof Number) ? (Number) field4 : null;
                        if (number != null) {
                            Long lM8145P2 = C3943c.m8145P(strM8147l, "newmsgid");
                            if (lM8145P2 == null) {
                                j3 = 0;
                                field = KavaReflector.readField(objM8366C04, "c");
                                if (field == null) {
                                    field = KavaReflector.readField(objM8366C04, "d");
                                }
                                Number number3 = field instanceof Number ? (Number) field : null;
                                iIntValue2 = number3 != null ? number3.intValue() : 0;
                                jLongValue3 = lM8145P != null ? lM8145P.longValue() : jLongValue5;
                                if (!AbstractC3149m.m6721t0(str3) || !AbstractC3149m.m6721t0(strM8147l3) || jLongValue3 > 0 || j3 > 0) {
                                    String str14 = str12;
                                    str4 = str14;
                                    c2531f = new C2531f(jLongValue3, j3, str14, str3, strM8147l3, 0L, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, iIntValue2, null);
                                } else {
                                    str4 = str12;
                                    c2531f = null;
                                }
                                if (!C3943c.m8156y(c2531f)) {
                                    if (c2531f != null) {
                                        long j5 = c2531f.f8185a;
                                        Long lValueOf2 = Long.valueOf(j5);
                                        if (j5 <= 0) {
                                            lValueOf2 = null;
                                        }
                                        if (lValueOf2 == null) {
                                            if (c2531f != null) {
                                                long j10 = c2531f.f8186b;
                                                lValueOf2 = Long.valueOf(j10);
                                                if (j10 <= 0) {
                                                    lValueOf2 = null;
                                                }
                                                if (lValueOf2 == null) {
                                                    jLongValue4 = jLongValue5;
                                                }
                                            }
                                        }
                                        jLongValue4 = lValueOf2.longValue();
                                    }
                                }
                                str5 = str4 + ":" + jLongValue4;
                                if (!(AbstractC3149m.m6721t0(str5) ? false : set2.contains(str5))) {
                                    Iterator it3 = C3943c.m8144M(jLongValue5, c2531f).iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            long jLongValue7 = ((Number) it3.next()).longValue();
                                            weChatMessageM5663e = (WeChatMessage) c3943c.f12928f.get(str4 + ":" + jLongValue7);
                                            if (weChatMessageM5663e == null) {
                                                C2355s c2355sMessageStore2 = WeChatApis.messageStore();
                                                if (c2355sMessageStore2 == null || (weChatMessageM5663e = c2355sMessageStore2.m5661c(jLongValue7)) == null) {
                                                    C2355s c2355sMessageStore3 = WeChatApis.messageStore();
                                                    weChatMessageM5663e = c2355sMessageStore3 != null ? c2355sMessageStore3.m5663e(jLongValue7, str4) : null;
                                                    if (weChatMessageM5663e == null) {
                                                        C2355s c2355sMessageStore4 = WeChatApis.messageStore();
                                                        weChatMessageM5663e = c2355sMessageStore4 != null ? c2355sMessageStore4.m5662d(jLongValue7) : null;
                                                    }
                                                }
                                                if (weChatMessageM5663e != null) {
                                                    c3943c.m8161N(weChatMessageM5663e);
                                                }
                                            }
                                        } else {
                                            weChatMessageM5663e = null;
                                        }
                                    }
                                    if (weChatMessageM5663e != null) {
                                        long j11 = weChatMessageM5663e.msgSvrId;
                                        String str15 = weChatMessageM5663e.talker;
                                        String strSendTalker = weChatMessageM5663e.sendTalker();
                                        long j12 = weChatMessageM5663e.createTime;
                                        String strBodyContent = weChatMessageM5663e.bodyContent();
                                        String msgSource = weChatMessageM5663e.getMsgSource();
                                        int i17 = weChatMessageM5663e.flag;
                                        WeChatMessage weChatMessage2 = weChatMessageM5663e;
                                        c2531f2 = new C2531f(j11, 0L, str15, strSendTalker, HttpUrl.FRAGMENT_ENCODE_SET, j12, strBodyContent, msgSource, i17, weChatMessage2);
                                        if (c2531f != null) {
                                            String str16 = c2531f.f8192h;
                                            String str17 = c2531f.f8191g;
                                            String str18 = c2531f.f8189e;
                                            String str19 = c2531f.f8188d;
                                            String str20 = c2531f.f8187c;
                                            long j13 = c2531f.f8185a;
                                            long j14 = j13 > 0 ? j13 : j11;
                                            long j15 = c2531f.f8186b;
                                            long j16 = j15 > 0 ? j15 : 0L;
                                            if (str20.isEmpty()) {
                                                str20 = c2531f2.f8187c;
                                            }
                                            String str21 = str20;
                                            if (str19.isEmpty()) {
                                                str19 = c2531f2.f8188d;
                                            }
                                            String str22 = str19;
                                            if (str18.isEmpty()) {
                                                str18 = c2531f2.f8189e;
                                            }
                                            String str23 = str18;
                                            long jM5950a = c2531f.m5950a() > 0 ? c2531f.m5950a() : c2531f2.m5950a();
                                            String str24 = !str17.isEmpty() ? str17 : c2531f2.f8191g;
                                            String str25 = !str16.isEmpty() ? str16 : c2531f2.f8192h;
                                            int i18 = c2531f.f8193i;
                                            int i19 = i18 != 0 ? i18 : i17;
                                            WeChatMessage weChatMessage3 = c2531f.f8194j;
                                            c2531f2 = new C2531f(j14, j16, str21, str22, str23, jM5950a, str24, str25, i19, weChatMessage3 != null ? weChatMessage3 : weChatMessage2);
                                        }
                                    } else {
                                        c2531f2 = c2531f;
                                    }
                                    boolean z11 = C3943c.m8156y(c2531f) || C3943c.m8156y(c2531f2);
                                    if (!z11 || C3943c.m8137C(c3742g2)) {
                                        if (z11) {
                                            long j17 = (c2531f2 == null || (weChatMessage = c2531f2.f8194j) == null) ? 0L : weChatMessage.msgId;
                                            if (j17 > 0) {
                                                c3943c.m8160F(j17);
                                            }
                                        }
                                        Context context = c3742g2.f12143a;
                                        if (!z11) {
                                            C2531f c2531f3 = c2531f2;
                                            String str26 = str4;
                                            long j18 = jLongValue5;
                                            if (AbstractC4302b.m8640c(context, "Hchat_anti_recall_config").getBoolean("anti_recall_show_notice", true)) {
                                                C3943c.m8149o(c3742g2, str26, j18, c2531f3, j4, z11);
                                            }
                                        } else if (AbstractC4302b.m8640c(context, "Hchat_anti_recall_config").getBoolean("anti_recall_show_notice", true)) {
                                            C3943c.m8149o(c3742g2, str4, jLongValue5, c2531f2, j4, true);
                                            z9 = true;
                                        }
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (z9) {
                                        if (!AbstractC3149m.m6721t0(str5)) {
                                            set2.add(str5);
                                            if (set2.size() > 1000) {
                                                Iterator it4 = AbstractC4166m.m8403L1(set2.size() - 1000, set2).iterator();
                                                while (it4.hasNext()) {
                                                    set2.remove((String) it4.next());
                                                }
                                            }
                                        }
                                    }
                                }
                                methodHookParam.setResult((Object) null);
                            } else {
                                jLongValue2 = lM8145P2.longValue();
                            }
                        } else {
                            jLongValue2 = number.longValue();
                        }
                        j3 = jLongValue2;
                        field = KavaReflector.readField(objM8366C04, "c");
                        if (field == null) {
                        }
                        if (field instanceof Number) {
                        }
                        if (number3 != null) {
                        }
                        if (lM8145P != null) {
                        }
                        if (AbstractC3149m.m6721t0(str3)) {
                            String str142 = str12;
                            str4 = str142;
                            c2531f = new C2531f(jLongValue3, j3, str142, str3, strM8147l3, 0L, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, iIntValue2, null);
                        }
                        if (!C3943c.m8156y(c2531f)) {
                        }
                        str5 = str4 + ":" + jLongValue4;
                        if (!(AbstractC3149m.m6721t0(str5) ? false : set2.contains(str5))) {
                        }
                        methodHookParam.setResult((Object) null);
                    }
                    str3 = strM8147l2;
                    String strM8147l32 = C3943c.m8147l(field3, "f");
                    lM8145P = C3943c.m8145P(strM8147l, "msgid");
                    Object field42 = KavaReflector.readField(field3, "r");
                    if (!(field42 instanceof Number)) {
                    }
                    if (number != null) {
                    }
                    j3 = jLongValue2;
                    field = KavaReflector.readField(objM8366C04, "c");
                    if (field == null) {
                    }
                    if (field instanceof Number) {
                    }
                    if (number3 != null) {
                    }
                    if (lM8145P != null) {
                    }
                    if (AbstractC3149m.m6721t0(str3)) {
                    }
                    if (!C3943c.m8156y(c2531f)) {
                    }
                    str5 = str4 + ":" + jLongValue4;
                    if (!(AbstractC3149m.m6721t0(str5) ? false : set2.contains(str5))) {
                    }
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 2:
                methodHookParam.getClass();
                if (C3943c.m8146k(c3943c, c3742g) && C3943c.m8137C(c3742g) && (objArr2 = methodHookParam.args) != null && objArr2.length >= 2 && (obj3 = objArr2[0]) != null && C3943c.m8135A(obj3.getClass()) && AbstractC1416l.m3825a(objArr2[1], Boolean.FALSE)) {
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    stackTrace.getClass();
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        if (AbstractC1416l.m3825a(stackTraceElement.getMethodName(), "onGYNetEnd")) {
                            String className = stackTraceElement.getClassName();
                            className.getClass();
                            if (AbstractC3156t.m6740d0(className, "com.tencent.mm.modelsimple.", false)) {
                                int iM8140I = C3943c.m8140I(obj3);
                                if (iM8140I == 3 || iM8140I == 34 || iM8140I == 43 || iM8140I == 47) {
                                    long jM8139H = C3943c.m8139H(obj3);
                                    if (c3943c.f12929g.contains(Long.valueOf(jM8139H)) || C3943c.m8138G(obj3)) {
                                        c3943c.m8160F(jM8139H);
                                        methodHookParam.setResult((Object) null);
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                methodHookParam.getClass();
                if (C3943c.m8146k(c3943c, c3742g) && C3943c.m8137C(c3742g)) {
                    Object[] objArr4 = methodHookParam.args;
                    Set set3 = c3943c.f12929g;
                    if (objArr4 != null && objArr4.length != 0) {
                        Object obj6 = objArr4[0];
                        if (obj6 != null && C3943c.m8135A(obj6.getClass())) {
                            long jM8139H2 = C3943c.m8139H(obj6);
                            int iM8140I2 = C3943c.m8140I(obj6);
                            if (!set3.contains(Long.valueOf(jM8139H2)) || (iM8140I2 != 3 && iM8140I2 != 34 && iM8140I2 != 43 && iM8140I2 != 47)) {
                            }
                        } else if (objArr4.length >= 2 && (obj6 instanceof String)) {
                            Object obj7 = objArr4[1];
                            Number number4 = obj7 instanceof Number ? (Number) obj7 : null;
                            long jLongValue8 = number4 != null ? number4.longValue() : 0L;
                            if (jLongValue8 <= 0 || !set3.contains(Long.valueOf(jLongValue8))) {
                            }
                        }
                        methodHookParam.setResult((Object) null);
                        break;
                    }
                }
                break;
        }
    }
}
