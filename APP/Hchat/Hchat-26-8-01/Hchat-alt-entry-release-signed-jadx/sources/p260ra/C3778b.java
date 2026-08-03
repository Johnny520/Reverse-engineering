package p260ra;

import android.text.TextUtils;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Constructor;
import java.util.Map;
import ke.C2399h;
import na.C2914b;
import na.C2923k;
import okhttp3.HttpUrl;
import p020b5.C0184c;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p162l3.C2458l;
import p183m8.C2815c;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: ra.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3778b extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12369a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3779c f12370b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3778b(C3779c c3779c, int i9) {
        this.f12369a = i9;
        this.f12370b = c3779c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        String strM10269a0;
        String str;
        switch (this.f12369a) {
            case 1:
                C3779c c3779c = this.f12370b;
                C2923k c2923k = (C2923k) c3779c.f12375e;
                if (((C2458l) c3779c.f12374d).m5857f()) {
                    try {
                        Object[] objArr = methodHookParam.args;
                        Object obj = (objArr == null || objArr.length <= 2) ? null : objArr[2];
                        if (obj != null) {
                            strM10269a0 = AbstractC5700d.m10269a0(obj, "sendId");
                            if (TextUtils.isEmpty(strM10269a0)) {
                                strM10269a0 = AbstractC5700d.m10269a0(obj, "sendid");
                            }
                        } else {
                            strM10269a0 = null;
                        }
                        if (TextUtils.isEmpty(strM10269a0) && c2923k.f9553p.size() == 1) {
                            try {
                                str = (String) c2923k.f9553p.iterator().next();
                            } catch (Throwable unused) {
                                str = strM10269a0;
                            }
                        } else {
                            str = strM10269a0;
                        }
                        if (!TextUtils.isEmpty(str) && c2923k.f9553p.contains(str)) {
                            C3779c.m7926c("redpacket_open_timeout:" + str);
                            int iIntValue = 0;
                            try {
                                Object[] objArr2 = methodHookParam.args;
                                if (objArr2 != null && objArr2.length > 0) {
                                    Object obj2 = objArr2[0];
                                    if (obj2 instanceof Number) {
                                        iIntValue = ((Number) obj2).intValue();
                                    }
                                }
                                break;
                            } catch (Throwable unused2) {
                            }
                            String strM10296w = AbstractC5700d.m10296w(iIntValue, obj);
                            Map map = (Map) c2923k.f9548k.get(str);
                            if (!TextUtils.isEmpty(strM10296w)) {
                                try {
                                    String strReplaceAll = strM10296w.replaceAll("[^0-9.\\-]", HttpUrl.FRAGMENT_ENCODE_SET);
                                    if (!TextUtils.isEmpty(strReplaceAll)) {
                                        if (Double.parseDouble(strReplaceAll) > 1.0E-6d) {
                                            String str2 = map != null ? (String) map.get("talker") : null;
                                            c2923k.f9553p.remove(str);
                                            c2923k.f9554q.add(str);
                                            c3779c.m7936j("拆红包完成: sendid=" + str + " amount=" + strM10296w + " talker=" + str2);
                                            String str3 = map != null ? (String) map.get("nativeurl") : null;
                                            if (!TextUtils.isEmpty(str3)) {
                                                ((C0184c) ((C2399h) c3779c.f12377g).f7868h).m828y(str3);
                                            }
                                            ((C2914b) c3779c.f12378h).m6322c(strM10296w, str2 != null ? str2 : HttpUrl.FRAGMENT_ENCODE_SET, str3, str, obj);
                                        }
                                    }
                                    break;
                                } catch (Throwable unused3) {
                                }
                            }
                            c3779c.m7936j("拆红包完成但未取到本人实收金额: sendid=" + str + " json=" + String.valueOf(obj));
                            c3779c.m7940n("未抢到本人实收金额", map);
                            c3779c.m7931d(str);
                        }
                    } catch (Throwable th2) {
                        c3779c.m7936j("ERROR openCallback: " + th2.getMessage());
                        return;
                    }
                    break;
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Map map;
        String str;
        String str2;
        Object objNewInstance;
        String str3;
        Object objNewInstanceByArgs;
        Constructor<?> constructor;
        Constructor<?> constructor2;
        Constructor<?> constructor3;
        Constructor<?> constructor4;
        Constructor<?> constructor5;
        switch (this.f12369a) {
            case 0:
                C3779c c3779c = this.f12370b;
                C2923k c2923k = (C2923k) c3779c.f12375e;
                DexFinder dexFinder = (DexFinder) c3779c.f12373c;
                if (((C2458l) c3779c.f12374d).m5857f()) {
                    try {
                        Object obj = methodHookParam.args[2];
                        if (obj == null) {
                            break;
                        } else {
                            String strM10269a0 = AbstractC5700d.m10269a0(obj, "sendId");
                            String strM10269a02 = AbstractC5700d.m10269a0(obj, "timingIdentifier");
                            c3779c.m7936j("收红包响应: sendid=" + strM10269a0 + " timingId=" + strM10269a02);
                            if (!TextUtils.isEmpty(strM10269a0) && !TextUtils.isEmpty(strM10269a02)) {
                                try {
                                    map = (Map) c2923k.f9549l.remove(methodHookParam.thisObject);
                                } catch (Throwable unused) {
                                    map = null;
                                }
                                if (map == null) {
                                    map = (Map) c2923k.f9548k.get(strM10269a0);
                                }
                                if (map != null && c2923k.f9552o.contains(strM10269a0) && c2923k.f9553p.add(strM10269a0)) {
                                    c2923k.f9552o.remove(strM10269a0);
                                    C3779c.m7926c("redpacket_receive_timeout:" + strM10269a0);
                                    String str4 = (String) map.get("requestNativeUrl");
                                    if (TextUtils.isEmpty(str4)) {
                                        str4 = (String) map.get("nativeurl");
                                    }
                                    String str5 = str4;
                                    String str6 = (String) map.get("requestTalker");
                                    if (TextUtils.isEmpty(str6)) {
                                        str6 = (String) map.get("talker");
                                    }
                                    String str7 = str6;
                                    boolean z9 = Boolean.TRUE.equals(map.get("isUnion")) && dexFinder.openLuckyMoneyUnionClass != null;
                                    int iIntValue = map.get("msgtype") instanceof Integer ? ((Integer) map.get("msgtype")).intValue() : 1;
                                    int iIntValue2 = map.get("channelid") instanceof Integer ? ((Integer) map.get("channelid")).intValue() : 1;
                                    Object obj2 = map.get("headimg");
                                    String strValueOf = HttpUrl.FRAGMENT_ENCODE_SET;
                                    String strValueOf2 = obj2 != null ? String.valueOf(map.get("headimg")) : HttpUrl.FRAGMENT_ENCODE_SET;
                                    if (map.get("nickname") != null) {
                                        strValueOf = String.valueOf(map.get("nickname"));
                                    }
                                    String str8 = strValueOf;
                                    if (!z9 || (constructor5 = dexFinder.unionOpenCtor10) == null) {
                                        str = strM10269a02;
                                        str2 = strM10269a0;
                                        objNewInstance = null;
                                    } else {
                                        try {
                                            str = strM10269a02;
                                            str2 = strM10269a0;
                                        } catch (Throwable unused2) {
                                            str = strM10269a02;
                                            str2 = strM10269a0;
                                        }
                                        try {
                                            objNewInstance = KavaReflector.newInstance(constructor5, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str2, str5, strValueOf2, str8, str7, "v1.0", str, HttpUrl.FRAGMENT_ENCODE_SET);
                                        } catch (Throwable unused3) {
                                            objNewInstance = null;
                                        }
                                    }
                                    if (objNewInstance == null && z9 && (constructor4 = dexFinder.unionOpenCtor9) != null) {
                                        try {
                                            objNewInstance = KavaReflector.newInstance(constructor4, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str2, str5, strValueOf2, str8, str7, "v1.0", str);
                                            break;
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    if (objNewInstance == null && z9) {
                                        Object[] objArr = {Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str2, str5, strValueOf2, str8, str7, "v1.0", str, HttpUrl.FRAGMENT_ENCODE_SET};
                                        Class<?> cls = dexFinder.openLuckyMoneyUnionClass;
                                        if (cls == null) {
                                            objNewInstance = null;
                                        } else {
                                            try {
                                                objNewInstance = KavaReflector.newInstanceByArgs(cls, objArr);
                                            } catch (Throwable unused5) {
                                                objNewInstance = null;
                                            }
                                        }
                                    }
                                    if (objNewInstance == null && (constructor3 = dexFinder.openCtor10) != null) {
                                        try {
                                            objNewInstance = KavaReflector.newInstance(constructor3, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str2, str5, strValueOf2, str8, str7, "v1.0", str, HttpUrl.FRAGMENT_ENCODE_SET);
                                            break;
                                        } catch (Throwable unused6) {
                                        }
                                    }
                                    if (objNewInstance == null && (constructor2 = dexFinder.openCtor8) != null) {
                                        try {
                                            String str9 = str;
                                            try {
                                                str = str9;
                                                objNewInstance = KavaReflector.newInstance(constructor2, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str2, str5, strValueOf2, str8, str7, str9);
                                            } catch (Throwable unused7) {
                                                str = str9;
                                            }
                                            break;
                                        } catch (Throwable unused8) {
                                        }
                                    }
                                    if (objNewInstance == null && (constructor = dexFinder.openCtor9) != null) {
                                        try {
                                            objNewInstance = KavaReflector.newInstance(constructor, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str2, str5, strValueOf2, str8, str7, "v1.0", str);
                                            break;
                                        } catch (Throwable unused9) {
                                        }
                                    }
                                    if (objNewInstance == null) {
                                        Object[] objArr2 = {Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str2, str5, strValueOf2, str8, str7, "v1.0", str, HttpUrl.FRAGMENT_ENCODE_SET};
                                        str3 = str2;
                                        Class<?> cls2 = dexFinder.openLuckyMoneyClass;
                                        if (cls2 == null) {
                                            objNewInstanceByArgs = null;
                                            objNewInstance = objNewInstanceByArgs;
                                        } else {
                                            try {
                                                objNewInstanceByArgs = KavaReflector.newInstanceByArgs(cls2, objArr2);
                                            } catch (Throwable unused10) {
                                                objNewInstanceByArgs = null;
                                            }
                                            objNewInstance = objNewInstanceByArgs;
                                        }
                                    } else {
                                        str3 = str2;
                                    }
                                    if (objNewInstance != null) {
                                        map.put("openReq", objNewInstance);
                                        if (!((C2815c) c3779c.f12376f).m6216j(objNewInstance)) {
                                            c3779c.m7936j("拆红包发包失败: " + str3);
                                            if (!c3779c.m7942p(map, str3, "拆红包发包失败")) {
                                                c3779c.m7940n("拆红包发包失败", map);
                                                c3779c.m7931d(str3);
                                            }
                                        } else {
                                            c3779c.m7936j("拆红包请求已发送: " + str3);
                                            C3779c.m7928t("redpacket_open_timeout:" + str3, 4500L, new RunnableC3777a(c3779c, str3, 0));
                                        }
                                    } else {
                                        c3779c.m7936j("拆红包请求构造失败");
                                        c3779c.m7940n("拆红包请求构造失败", map);
                                        c3779c.m7931d(str3);
                                    }
                                }
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        c3779c.m7936j("ERROR receiveCallback: " + th2.getMessage());
                        return;
                    }
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
