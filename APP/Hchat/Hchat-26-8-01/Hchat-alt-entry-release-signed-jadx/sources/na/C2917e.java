package na;

import ac.AbstractC0063p;
import ae.C0076g;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import be.AbstractC0283h;
import be.C0289k;
import de.robv.android.xposed.XposedBridge;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import ke.C2399h;
import okhttp3.HttpUrl;
import p003a2.C0014a;
import p007a7.AbstractC0018a;
import p020b5.C0184c;
import p025bc.AbstractC0255e;
import p036c9.C0425c2;
import p068eh.AbstractC0921a;
import p096g8.C1366g;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p109hb.C1671c;
import p142jg.AbstractC2136d;
import p153k8.C2352p;
import p162l3.C2458l;
import p162l3.C2469w;
import p174m.C2571a;
import p183m8.C2815c;
import p210o8.C3086j;
import p212oa.AbstractC3107b;
import p212oa.C3106a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p258r8.C3744i;
import p259r9.AbstractC3754e0;
import p260ra.C3779c;
import p260ra.C3784h;
import p287ta.C4140c;
import p343x6.AbstractC5700d;
import pa.C3376b;
import pa.C3377c;
import sa.C3949c;

/* JADX INFO: renamed from: na.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2917e {

    /* JADX INFO: renamed from: a */
    public final Context f9457a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f9458b;

    /* JADX INFO: renamed from: c */
    public final DexFinder f9459c;

    /* JADX INFO: renamed from: d */
    public final C2458l f9460d;

    /* JADX INFO: renamed from: e */
    public final C2571a f9461e;

    /* JADX INFO: renamed from: f */
    public final C2923k f9462f;

    /* JADX INFO: renamed from: g */
    public final C0184c f9463g;

    /* JADX INFO: renamed from: h */
    public final C0289k f9464h;

    /* JADX INFO: renamed from: i */
    public final C2469w f9465i;

    /* JADX INFO: renamed from: j */
    public final C2815c f9466j;

    /* JADX INFO: renamed from: k */
    public final C3106a f9467k;

    /* JADX INFO: renamed from: l */
    public final C3106a f9468l;

    /* JADX INFO: renamed from: m */
    public final C3784h f9469m;

    /* JADX INFO: renamed from: n */
    public final C3377c f9470n;

    /* JADX INFO: renamed from: o */
    public final C3779c f9471o;

    /* JADX INFO: renamed from: p */
    public final C4140c f9472p;

    /* JADX INFO: renamed from: q */
    public final C1671c f9473q;

    /* JADX INFO: renamed from: r */
    public final C3779c f9474r;

    /* JADX INFO: renamed from: s */
    public final C2919g f9475s;

    /* JADX INFO: renamed from: t */
    public boolean f9476t = false;

    /* JADX INFO: renamed from: u */
    public int f9477u = 0;

    /* JADX INFO: renamed from: v */
    public String f9478v = HttpUrl.FRAGMENT_ENCODE_SET;

    /* JADX INFO: renamed from: w */
    public String f9479w = HttpUrl.FRAGMENT_ENCODE_SET;

    /* JADX INFO: renamed from: x */
    public boolean f9480x = false;

    /* JADX INFO: renamed from: y */
    public boolean f9481y = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2917e(Context context, ClassLoader classLoader, DexFinder dexFinder) {
        this.f9457a = context;
        this.f9458b = classLoader;
        this.f9459c = dexFinder;
        C2458l c2458l = new C2458l(context, classLoader);
        this.f9460d = c2458l;
        this.f9461e = new C2571a(c2458l, 5);
        C2923k c2923k = new C2923k();
        this.f9462f = c2923k;
        C0184c c0184c = new C0184c(context, c2923k, new C2914b(this, 0));
        this.f9463g = c0184c;
        C0184c c0184c2 = new C0184c(c2923k, c2458l, new C2914b(this, 1));
        this.f9464h = new C0289k(c2458l, c2923k, c0184c, new C3949c(context, "[Hchat:RedPacketNotifier]", "Hchat_redpacket_notify_manual_v2", "Hchat 红包提醒"), c0184c2);
        this.f9474r = new C3779c(context, c2458l, c0184c2, new C2914b(this, 1));
        this.f9475s = new C2919g(c2458l, new C0076g(this, 14));
        this.f9465i = new C2469w(11);
        C2815c c2815c = new C2815c(new C2914b(this, 5));
        this.f9466j = c2815c;
        this.f9467k = new C3106a(dexFinder, c2458l, new C2914b(this, 6), new C2914b(this, 7), new C2914b(this, 8));
        this.f9468l = new C3106a(classLoader, c2458l, new C2914b(this, 10), new C2914b(this, 11), new C2914b(this, 9));
        this.f9469m = new C3784h(classLoader, c2458l, new C2914b(this, 12), new C2914b(this, 13), new C2914b(this, 14), new C2914b(this, 15));
        this.f9470n = new C3377c(classLoader, dexFinder, c2458l, new C2914b(this, 16));
        this.f9472p = new C4140c(c2458l, c2923k, new C2914b(this, 17), new C2914b(this, 18));
        C2914b c2914b = new C2914b(this, 19);
        C1671c c1671c = new C1671c();
        c1671c.f5520g = dexFinder;
        c1671c.f5521h = c2458l;
        c1671c.f5522i = c2815c;
        c1671c.f5523j = c2914b;
        this.f9473q = c1671c;
        this.f9471o = new C3779c(dexFinder, c2458l, c2923k, c2815c, new C2399h(c0184c, 25), new C2914b(this, 2), new C2914b(this, 3), new C2914b(this, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m6324a() {
        String str;
        try {
            WeChatApis.contact().getClass();
            if (WeChatApis.accountApi != null) {
                WeChatApis.contact().getClass();
                String strM3652c = WeChatApis.accountApi.m3652c();
                if (!TextUtils.isEmpty(strM3652c)) {
                    return strM3652c;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            str = (String) KavaReflector.invokeMethod(KavaReflector.invokeStaticMethod(KavaReflector.loadClass("com.tencent.mm.sdk.platformtools.MMApplicationContext", this.f9458b), "getSharedPreferences", "login_info", 0), "getString", "login_weixin_username", HttpUrl.FRAGMENT_ENCODE_SET);
        } catch (Throwable unused2) {
        }
        return !TextUtils.isEmpty(str) ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m6325b(String str, String str2, String str3, String str4, String str5) {
        m6329f();
        String strM6324a = this.f9479w;
        if (TextUtils.isEmpty(strM6324a)) {
            strM6324a = m6324a();
        }
        C2913a c2913aM6331h = m6331h(str, str2, str5);
        this.f9465i.getClass();
        String str6 = c2913aM6331h.f9434m;
        int i9 = c2913aM6331h.f9433l;
        String str7 = c2913aM6331h.f9432k;
        String str8 = c2913aM6331h.f9431j;
        if (!c2913aM6331h.f9423b) {
            return "规则已关闭";
        }
        if (!TextUtils.isEmpty(str4) && !AbstractC1416l.m3825a(str4, strM6324a)) {
            return "不是发给我的专属红包";
        }
        if (!TextUtils.isEmpty(strM6324a) && !TextUtils.isEmpty(str) && AbstractC1416l.m3825a(str, strM6324a) && c2913aM6331h.f9429h) {
            return "自己发的红包";
        }
        boolean z9 = false;
        boolean z10 = str2 != null && (AbstractC3156t.m6733W(str2, "@chatroom", false) || AbstractC3156t.m6733W(str2, "@im.chatroom", false) || AbstractC3156t.m6733W(str2, "@openim", false));
        int i10 = c2913aM6331h.f9430i;
        if (i10 == 1) {
            boolean zM5867k = C2469w.m5867k(str8, str);
            if (z10) {
                zM5867k = zM5867k || C2469w.m5867k(str8, str2);
            }
            if (!zM5867k) {
                return "非白名单";
            }
        } else if (i10 == 2) {
            boolean zM5867k2 = C2469w.m5867k(str7, str);
            if (z10) {
                zM5867k2 = zM5867k2 || C2469w.m5867k(str7, str2);
            }
            if (zM5867k2) {
                return "黑名单";
            }
        }
        if (c2913aM6331h.f9435n) {
            Calendar calendar = Calendar.getInstance();
            int i11 = calendar.get(13) + (calendar.get(12) * 60) + (calendar.get(11) * 3600);
            int iM7909r = AbstractC3754e0.m7909r(c2913aM6331h.f9436o, 0, 86399);
            int iM7909r2 = AbstractC3754e0.m7909r(c2913aM6331h.f9437p, 0, 86399);
            if (iM7909r > iM7909r2 ? i11 >= iM7909r || i11 <= iM7909r2 : iM7909r <= i11 && i11 <= iM7909r2) {
                z9 = true;
            }
        }
        if (z9) {
            return "当前时间段禁抢";
        }
        if (i9 == 1 && !AbstractC3107b.m6612b(str3, str6)) {
            return "未包含指定关键词";
        }
        if (i9 == 2 && AbstractC3107b.m6612b(str3, str6)) {
            return "包含屏蔽关键词";
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final ArrayList m6326c() {
        boolean z9;
        C0014a c0014aM3683a;
        C1366g c1366gChatroomChanges;
        ArrayList arrayList = new ArrayList();
        C2458l c2458l = this.f9460d;
        c2458l.getClass();
        try {
            z9 = c2458l.m5853b().getBoolean("hb_log_enable", false);
        } catch (Throwable unused) {
            z9 = false;
        }
        this.f9480x = z9;
        m6329f();
        C2919g c2919g = this.f9475s;
        synchronized (c2919g) {
            c2919g.m6334b();
            c0014aM3683a = null;
            if (!c2919g.f9486c) {
                try {
                    WeChatApis.contact().getClass();
                    c1366gChatroomChanges = WeChatApis.chatroomChangeApi;
                } catch (Throwable unused2) {
                    c1366gChatroomChanges = null;
                }
                if (c1366gChatroomChanges == null) {
                    try {
                        c1366gChatroomChanges = WeChatApis.chatroomChanges();
                    } catch (Throwable unused3) {
                    }
                }
                if (c1366gChatroomChanges == null) {
                    C0076g c0076g = c2919g.f9485b;
                    if (!TextUtils.isEmpty("群聊变更 API 未就绪，新进群屏蔽只使用已记录名单")) {
                        c0076g.accept("群聊变更 API 未就绪，新进群屏蔽只使用已记录名单");
                    }
                } else {
                    c0014aM3683a = c1366gChatroomChanges.m3683a(new C2918f(c2919g, 0));
                    c2919g.f9486c = true;
                }
            }
        }
        if (c0014aM3683a != null) {
            arrayList.add(c0014aM3683a);
        }
        StringBuilder sb2 = new StringBuilder("hookAll 开始, 收红包类=");
        Class<?> cls = this.f9459c.receiveLuckyMoneyClass;
        sb2.append(cls != null ? cls.getName() : "null");
        sb2.append(" 拆红包类=");
        Class<?> cls2 = this.f9459c.openLuckyMoneyClass;
        sb2.append(cls2 != null ? cls2.getName() : "null");
        m6327d(sb2.toString());
        if (!this.f9481y) {
            try {
                WeChatApis.message().getClass();
                C2352p c2352p = WeChatApis.messageObserveApi;
                if (c2352p != null) {
                    WeChatApis.message().getClass();
                    if (WeChatApis.hasMessageObserve() && c2352p.m5638c()) {
                        arrayList.add(c2352p.m5640e(new C2915c(this, 0)));
                        this.f9481y = true;
                        m6327d("红包检测入口: WeChatApis.message().observe()");
                    }
                }
                m6327d("消息观察API不可用，使用红包检测 fallback");
            } catch (Throwable th2) {
                m6327d("ERROR 安装消息观察失败: " + th2.getMessage());
            }
            C3106a c3106a = this.f9467k;
            DexFinder dexFinder = (DexFinder) c3106a.f10076c;
            if (!c3106a.f10075b) {
                if (dexFinder.addMsgClasses.isEmpty()) {
                    c3106a.m6610c("AddMsg类未找到，跳过");
                } else {
                    Iterator<Class<?>> it = dexFinder.addMsgClasses.iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        for (Method method : KavaReflector.declaredMethods(it.next())) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes != null && parameterTypes.length != 0) {
                                ArrayList arrayList2 = new ArrayList();
                                for (int i10 = 0; i10 < parameterTypes.length; i10++) {
                                    Class<?> cls3 = parameterTypes[i10];
                                    if (cls3 != null && !cls3.isPrimitive() && !cls3.isArray() && cls3 != String.class && !Number.class.isAssignableFrom(cls3) && cls3 != Boolean.class && AbstractC5700d.m10250F(cls3, "e") && AbstractC5700d.m10250F(cls3, "f") && (AbstractC5700d.m10250F(cls3, "h") || AbstractC5700d.m10250F(cls3, "i") || AbstractC5700d.m10250F(cls3, "m"))) {
                                        arrayList2.add(Integer.valueOf(i10));
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    C3744i.f12154b.m7763b(method, new C0425c2(10, c3106a, arrayList2, false));
                                    i9++;
                                }
                            }
                        }
                    }
                    c3106a.f10075b = i9 > 0;
                    c3106a.m6610c("AddMsg Hook: " + i9);
                }
            }
            C3106a c3106a2 = this.f9468l;
            if (!c3106a2.f10075b) {
                int iM6609b = c3106a2.m6609b("android.database.sqlite.SQLiteDatabase") + c3106a2.m6609b("com.tencent.wcdb.database.SQLiteDatabase");
                boolean z10 = iM6609b > 0;
                c3106a2.f10075b = z10;
                if (z10) {
                    ((C2914b) c3106a2.f10079f).f9449h.m6327d(AbstractC0921a.m2249l(iM6609b, "数据库兜底Hook完成: "));
                } else {
                    ((C2914b) c3106a2.f10079f).f9449h.m6327d("数据库兜底: 未找到可Hook的SQLiteDatabase");
                }
            }
        }
        C3784h c3784h = this.f9469m;
        ClassLoader classLoader = c3784h.f12398a;
        if (!c3784h.f12406i) {
            String[] strArr = {"com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI", "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI", "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyReceiveUI"};
            for (int i11 = 0; i11 < 3; i11++) {
                String str = strArr[i11];
                try {
                    c3784h.m7961l(KavaReflector.loadClass(str, classLoader), str);
                } catch (Throwable th3) {
                    StringBuilder sbM1026o = AbstractC0255e.m1026o("查找领取页类失败: ", str, " | ");
                    sbM1026o.append(th3.getMessage());
                    c3784h.m7963o(sbM1026o.toString());
                }
            }
            String[] strArr2 = {"com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI", "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI", "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI"};
            for (int i12 = 0; i12 < 3; i12++) {
                String str2 = strArr2[i12];
                try {
                    c3784h.m7960k(KavaReflector.loadClass(str2, classLoader), str2);
                } catch (Throwable th4) {
                    StringBuilder sbM1026o2 = AbstractC0255e.m1026o("查找详情页类失败: ", str2, " | ");
                    sbM1026o2.append(th4.getMessage());
                    c3784h.m7963o(sbM1026o2.toString());
                }
            }
            c3784h.f12406i = true;
        }
        C3377c c3377c = this.f9470n;
        DexFinder dexFinder2 = (DexFinder) c3377c.f10908d;
        if (!c3377c.f10905a) {
            try {
                ArrayList<Class> arrayList3 = new ArrayList();
                c3377c.m7162a("com.tencent.mm.modelbase.m1", arrayList3);
                c3377c.m7162a("com.tencent.mm.modelbase.k1", arrayList3);
                c3377c.m7162a("com.tencent.mm.modelbase.l1", arrayList3);
                c3377c.m7162a("com.tencent.mm.modelbase.n1", arrayList3);
                if (arrayList3.isEmpty()) {
                    arrayList3.addAll(dexFinder2.packetBaseClasses);
                }
                c3377c.m7163b(arrayList3);
                if (arrayList3.isEmpty()) {
                    c3377c.m7164d("发包请求Hook失败: 未找到NetSceneBase");
                } else {
                    HashSet hashSet = new HashSet();
                    int i13 = 0;
                    for (Class cls4 : arrayList3) {
                        for (Method method2 : KavaReflector.declaredMethods(cls4)) {
                            if ("dispatch".equals(method2.getName()) && method2.getParameterTypes().length == 3) {
                                if (hashSet.add(cls4.getName() + "#" + method2)) {
                                    C3744i.f12154b.m7763b(method2, new C3376b(c3377c, 0));
                                    i13++;
                                }
                            }
                        }
                    }
                    c3377c.f10905a = i13 > 0;
                    c3377c.m7164d("发包请求Hook完成, count=" + i13);
                }
            } catch (Throwable th5) {
                c3377c.m7164d("ERROR 发包请求Hook失败: " + th5.getMessage());
            }
        }
        if (!c3377c.f10906b) {
            try {
                ArrayList arrayList4 = new ArrayList(dexFinder2.fakePacketClasses);
                c3377c.m7162a("com.tencent.mm.plugin.luckymoney.model.e6", arrayList4);
                if (arrayList4.isEmpty()) {
                    c3377c.m7164d("假红包响应修正Hook失败: 未找到PrepareLuckyMoney类");
                } else {
                    Iterator it2 = arrayList4.iterator();
                    int i14 = 0;
                    while (it2.hasNext()) {
                        for (Method method3 : KavaReflector.declaredMethods((Class) it2.next())) {
                            if ("onGYNetEnd".equals(method3.getName()) && method3.getParameterTypes().length == 3) {
                                C3744i.f12154b.m7763b(method3, new C3376b(c3377c, 1));
                                i14++;
                            }
                        }
                    }
                    c3377c.f10906b = i14 > 0;
                    c3377c.m7164d("假红包响应修正Hook完成, count=" + i14);
                }
            } catch (Throwable th6) {
                c3377c.m7164d("ERROR 假红包响应修正Hook失败: " + th6.getMessage());
            }
        }
        C2815c c2815c = this.f9466j;
        DexFinder dexFinder3 = this.f9459c;
        c2815c.m6212c(dexFinder3.netQueueClass, dexFinder3.netQueueCandidateClasses);
        C3779c c3779c = this.f9471o;
        DexFinder dexFinder4 = (DexFinder) c3779c.f12373c;
        if (!c3779c.f12371a) {
            c3779c.f12371a = c3779c.m7935i(dexFinder4.receiveLuckyMoneyUnionClass, "union") || c3779c.m7935i(dexFinder4.receiveLuckyMoneyClass, "normal");
        }
        C3779c c3779c2 = this.f9471o;
        DexFinder dexFinder5 = (DexFinder) c3779c2.f12373c;
        if (!c3779c2.f12372b) {
            c3779c2.f12372b = c3779c2.m7934h(dexFinder5.openLuckyMoneyUnionClass, "union") || c3779c2.m7934h(dexFinder5.openLuckyMoneyClass, "normal");
        }
        if (this.f9476t) {
            this.f9479w = m6324a();
        }
        m6327d("hookAll 完成");
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m6327d(Object obj) {
        if (!this.f9480x) {
            if (obj == null) {
                return;
            }
            String strValueOf = String.valueOf(obj);
            if (!strValueOf.startsWith("ERROR") && !strValueOf.contains("失败") && !strValueOf.contains("未找到") && !strValueOf.contains("不可用") && !strValueOf.contains("无合适方法")) {
                return;
            }
        }
        XposedBridge.log("[Hchat:RedPacket] " + obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m6328e(String str, final String str2, final String str3, final String str4, final String str5, String str6) {
        long jMo5362e;
        if (this.f9460d.m5856e()) {
            m6329f();
            C2923k c2923k = this.f9462f;
            ConcurrentHashMap concurrentHashMap = c2923k.f9545h;
            ConcurrentHashMap concurrentHashMap2 = c2923k.f9543f;
            ConcurrentHashMap concurrentHashMap3 = c2923k.f9544g;
            ConcurrentLinkedDeque concurrentLinkedDeque = c2923k.f9547j;
            if (!TextUtils.isEmpty(str5) && str5 != null) {
                String str7 = str2 != null ? str2 : HttpUrl.FRAGMENT_ENCODE_SET;
                String str8 = (String) concurrentHashMap3.putIfAbsent(str5, str7);
                if (str8 == null) {
                    concurrentHashMap2.put(str5, str3 != null ? str3 : HttpUrl.FRAGMENT_ENCODE_SET);
                    concurrentHashMap.put(str5, str4 != null ? str4 : HttpUrl.FRAGMENT_ENCODE_SET);
                    concurrentLinkedDeque.addFirst(str7);
                    while (concurrentLinkedDeque.size() > 30) {
                        concurrentLinkedDeque.removeLast();
                    }
                    C2913a c2913aM6331h = m6331h(str3, str4, str5);
                    String strM6325b = m6325b(str3, str4, str2, str6, str5);
                    if (strM6325b != null) {
                        m6327d(str + " 忽略: " + strM6325b);
                        return;
                    }
                    if (c2913aM6331h.f9425d != 1) {
                        jMo5362e = c2913aM6331h.f9426e;
                        if (jMo5362e < 0) {
                            jMo5362e = 0;
                        }
                    } else {
                        jMo5362e = c2913aM6331h.f9427f;
                        if (jMo5362e < 0) {
                            jMo5362e = 0;
                        }
                        long j3 = c2913aM6331h.f9428g;
                        if (j3 < jMo5362e) {
                            j3 = jMo5362e;
                        }
                        if (j3 > jMo5362e) {
                            jMo5362e = AbstractC2136d.f7122g.mo5362e(jMo5362e, j3 + 1);
                        }
                    }
                    int i9 = c2913aM6331h.f9424c;
                    StringBuilder sbM1025n = AbstractC0255e.m1025n(str, " 红包: ");
                    sbM1025n.append(str5.substring(0, Math.min(30, str5.length())));
                    sbM1025n.append(" mode=");
                    sbM1025n.append(i9);
                    sbM1025n.append(" delay=");
                    sbM1025n.append(jMo5362e);
                    sbM1025n.append(" rule=");
                    sbM1025n.append(c2913aM6331h.f9422a);
                    sbM1025n.append(" recvClass=");
                    DexFinder dexFinder = this.f9459c;
                    sbM1025n.append(dexFinder.receiveLuckyMoneyClass != null);
                    sbM1025n.append(" openClass=");
                    sbM1025n.append(dexFinder.openLuckyMoneyClass != null);
                    m6327d(sbM1025n.toString());
                    if (i9 == 1) {
                        m6327d("进入静默模式, sendid=" + AbstractC3107b.m6614d(str5, "sendid"));
                        if (jMo5362e <= 0) {
                            this.f9471o.m7948w(0, str2, str4, str5);
                            return;
                        } else {
                            final int i10 = 0;
                            m6332i("redpacket_receive:".concat(str5), jMo5362e, new Runnable(this) { // from class: na.d

                                /* JADX INFO: renamed from: h */
                                public final /* synthetic */ C2917e f9453h;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                {
                                    this.f9453h = this;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            this.f9453h.f9471o.m7948w(0, str2, str4, str5);
                                            break;
                                        default:
                                            Intent intent = new Intent();
                                            intent.putExtra("key_native_url", str2);
                                            intent.putExtra("key_username", str4);
                                            String str9 = str5;
                                            if (!TextUtils.isEmpty(str9)) {
                                                intent.putExtra("key_from_username", str9);
                                            }
                                            C2917e c2917e = this.f9453h;
                                            Context context = c2917e.f9457a;
                                            String[] strArr = {"nk4.l", "oq4.l", "pn4.l", "qm4.l", "rm4.l", "sm4.l", "tm4.l", "um4.l", "vm4.l", "wl4.l"};
                                            String[] strArr2 = {"A", "B", "C", "D"};
                                            String[] strArr3 = {".ui.LuckyMoneyNewReceiveUI", ".ui.LuckyMoneyNotHookReceiveUI", ".ui.LuckyMoneyReceiveUI"};
                                            for (int i11 = 0; i11 < 10; i11++) {
                                                String str10 = strArr[i11];
                                                for (int i12 = 0; i12 < 4; i12++) {
                                                    String str11 = strArr2[i12];
                                                    for (int i13 = 0; i13 < 3; i13++) {
                                                        String str12 = strArr3[i13];
                                                        try {
                                                            KavaReflector.invokeStaticMethod(KavaReflector.loadClass(str10, c2917e.f9458b), str11, context, "luckymoney", str12, intent);
                                                            c2917e.m6327d("启动: " + str12);
                                                        } catch (Throwable unused) {
                                                        }
                                                        break;
                                                    }
                                                }
                                            }
                                            for (int i14 = 0; i14 < 3; i14++) {
                                                String str13 = strArr3[i14];
                                                try {
                                                    intent.setClassName(context.getPackageName(), "com.tencent.mm.plugin.luckymoney" + str13);
                                                    intent.addFlags(268435456);
                                                    context.startActivity(intent);
                                                } catch (Throwable unused2) {
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    m6327d("进入UI模式");
                    C0289k c0289k = this.f9464h;
                    String strM1207p = c0289k.m1207p(str4, str5);
                    C0184c c0184c = (C0184c) c0289k.f842e;
                    boolean z9 = c2913aM6331h.f9444w;
                    boolean z10 = c2913aM6331h.f9445x;
                    if (z9 || z10) {
                        ((C3949c) c0289k.f841d).m8172b(c0184c.m817n(((C2458l) c0289k.f839b).m5855d("hb_notify_title", "自动抢红包"), HttpUrl.FRAGMENT_ENCODE_SET, strM1207p, str5), c0184c.m817n("收到红包，点击打开", HttpUrl.FRAGMENT_ENCODE_SET, strM1207p, str5), c0184c.m817n("收到红包，点击打开", HttpUrl.FRAGMENT_ENCODE_SET, strM1207p, str5), strM1207p, str5, 200000, z9, z10, c2913aM6331h.f9446y, c2913aM6331h.f9412A, c2913aM6331h.f9413B);
                    }
                    final int i11 = 1;
                    m6332i("redpacket_ui:".concat(str5), jMo5362e, new Runnable(this) { // from class: na.d

                        /* JADX INFO: renamed from: h */
                        public final /* synthetic */ C2917e f9453h;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.f9453h = this;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.f9453h.f9471o.m7948w(0, str5, str4, str3);
                                    break;
                                default:
                                    Intent intent = new Intent();
                                    intent.putExtra("key_native_url", str5);
                                    intent.putExtra("key_username", str4);
                                    String str9 = str3;
                                    if (!TextUtils.isEmpty(str9)) {
                                        intent.putExtra("key_from_username", str9);
                                    }
                                    C2917e c2917e = this.f9453h;
                                    Context context = c2917e.f9457a;
                                    String[] strArr = {"nk4.l", "oq4.l", "pn4.l", "qm4.l", "rm4.l", "sm4.l", "tm4.l", "um4.l", "vm4.l", "wl4.l"};
                                    String[] strArr2 = {"A", "B", "C", "D"};
                                    String[] strArr3 = {".ui.LuckyMoneyNewReceiveUI", ".ui.LuckyMoneyNotHookReceiveUI", ".ui.LuckyMoneyReceiveUI"};
                                    for (int i112 = 0; i112 < 10; i112++) {
                                        String str10 = strArr[i112];
                                        for (int i12 = 0; i12 < 4; i12++) {
                                            String str11 = strArr2[i12];
                                            for (int i13 = 0; i13 < 3; i13++) {
                                                String str12 = strArr3[i13];
                                                try {
                                                    KavaReflector.invokeStaticMethod(KavaReflector.loadClass(str10, c2917e.f9458b), str11, context, "luckymoney", str12, intent);
                                                    c2917e.m6327d("启动: " + str12);
                                                } catch (Throwable unused) {
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    for (int i14 = 0; i14 < 3; i14++) {
                                        String str13 = strArr3[i14];
                                        try {
                                            intent.setClassName(context.getPackageName(), "com.tencent.mm.plugin.luckymoney" + str13);
                                            intent.addFlags(268435456);
                                            context.startActivity(intent);
                                        } catch (Throwable unused2) {
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (TextUtils.isEmpty(str8) && !TextUtils.isEmpty(str7)) {
                    concurrentHashMap3.put(str5, str7);
                }
                if (!TextUtils.isEmpty(str3) && TextUtils.isEmpty((String) concurrentHashMap2.get(str5)) && str3 != null) {
                    concurrentHashMap2.put(str5, str3);
                }
                if (!TextUtils.isEmpty(str4) && TextUtils.isEmpty((String) concurrentHashMap.get(str5)) && str4 != null) {
                    concurrentHashMap.put(str5, str4);
                }
            }
            StringBuilder sbM1025n2 = AbstractC0255e.m1025n(str, " 跳过: nu=");
            sbM1025n2.append(TextUtils.isEmpty(str5) ? "empty" : "dup");
            m6327d(sbM1025n2.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m6329f() {
        boolean z9;
        C2458l c2458l = this.f9460d;
        try {
            c2458l.getClass();
            int i9 = 0;
            try {
                z9 = c2458l.m5853b().getBoolean("hb_skip_self", false);
            } catch (Throwable unused) {
                z9 = false;
            }
            this.f9476t = z9;
            try {
                c2458l.m5853b().getInt("hb_auto_mode", 0);
            } catch (Throwable unused2) {
            }
            try {
                i9 = c2458l.m5853b().getInt("hb_kw_mode", 0);
            } catch (Throwable unused3) {
            }
            this.f9477u = i9;
            this.f9478v = c2458l.m5855d("hb_keywords", HttpUrl.FRAGMENT_ENCODE_SET);
            this.f9479w = HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Throwable unused4) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final C2913a m6330g(String str) {
        C2913a c2913a;
        return (TextUtils.isEmpty(str) || (c2913a = (C2913a) this.f9462f.f9546i.get(str)) == null) ? AbstractC0283h.m1129I(this.f9460d) : c2913a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final C2913a m6331h(String str, String str2, String str3) {
        Object obj;
        Object next;
        C2922j c2922j;
        boolean zM3825a;
        C2913a c2913a;
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        C2923k c2923k = this.f9462f;
        if (!zIsEmpty && (c2913a = (C2913a) c2923k.f9546i.get(str3)) != null) {
            return c2913a;
        }
        C2458l c2458l = (C2458l) this.f9461e.f8339h;
        C2913a c2913aM1129I = AbstractC0283h.m1129I(c2458l);
        List listM225M = AbstractC0018a.m225M(c2458l.m5855d("hb_rule_templates_v1", HttpUrl.FRAGMENT_ENCODE_SET));
        List listM218F = AbstractC0018a.m218F(c2458l.m5855d("hb_rule_bindings_v1", HttpUrl.FRAGMENT_ENCODE_SET));
        if (!listM225M.isEmpty() || !listM218F.isEmpty()) {
            Iterator it = listM218F.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str4 = ((C2921i) next).f9494b;
                if (str4 == null || AbstractC3149m.m6721t0(str4)) {
                    zM3825a = false;
                } else {
                    String string = AbstractC3149m.m6703R0(str4).toString();
                    String strM6617g = AbstractC3107b.m6617g(str2);
                    strM6617g.getClass();
                    zM3825a = !AbstractC3149m.m6721t0(strM6617g) ? AbstractC1416l.m3825a(string, strM6617g) : AbstractC1416l.m3825a(string, AbstractC3107b.m6617g(str));
                }
                if (zM3825a) {
                    break;
                }
            }
            C2921i c2921i = (C2921i) next;
            if (c2921i != null) {
                String str5 = c2921i.f9497e;
                String str6 = c2921i.f9495c;
                if (c2921i.f9496d) {
                    if (c2921i.f9498f) {
                        c2922j = c2921i.f9499g;
                    } else {
                        Iterator it2 = listM225M.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            if (((C2922j) next2).f9512a.equals(str5)) {
                                obj = next2;
                                break;
                            }
                        }
                        c2922j = (C2922j) obj;
                    }
                    if (c2922j != null) {
                        if (AbstractC3149m.m6721t0(str6)) {
                            str6 = c2922j.f9513b;
                        }
                        c2913aM1129I = AbstractC0063p.m411d(c2922j, str6, c2913aM1129I);
                    } else if (AbstractC3149m.m6721t0(str5)) {
                        c2913aM1129I = AbstractC0283h.m1180r(c2458l, listM225M, c2913aM1129I);
                    } else {
                        if (AbstractC3149m.m6721t0(str6)) {
                            str6 = "未绑定模板";
                        }
                        c2913aM1129I = C2913a.m6320a(c2913aM1129I, str6);
                    }
                } else {
                    if (AbstractC3149m.m6721t0(str6)) {
                        str6 = "适用聊天已关闭";
                    }
                    c2913aM1129I = C2913a.m6320a(c2913aM1129I, str6);
                }
            } else {
                c2913aM1129I = AbstractC0283h.m1180r(c2458l, listM225M, c2913aM1129I);
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            c2923k.f9546i.put(str3, c2913aM1129I);
        }
        return c2913aM1129I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m6332i(String str, long j3, Runnable runnable) {
        try {
            WeChatApis.runtime().getClass();
            C3086j c3086j = WeChatApis.taskApi;
            if (c3086j != null) {
                c3086j.m6555f(str, Math.max(0L, j3), runnable);
                return;
            }
        } catch (Throwable th2) {
            m6327d("任务API调度失败，直接执行: " + th2.getMessage());
        }
        runnable.run();
    }
}
