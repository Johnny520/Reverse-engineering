package com.tendcloud.tenddata;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.tendcloud.tenddata.C0024af;
import com.tendcloud.tenddata.C0089cq;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import p001.C0167c4;

/* JADX INFO: renamed from: com.tendcloud.tenddata.zz */
/* JADX INFO: loaded from: classes.dex */
public final class C0133zz implements InterfaceC0033ao {

    /* JADX INFO: renamed from: a */
    public static String f653a = null;

    /* JADX INFO: renamed from: b */
    public static volatile boolean f654b = false;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f655c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f656d = false;

    /* JADX INFO: renamed from: e */
    public static C0045b f657e = null;

    /* JADX INFO: renamed from: f */
    public static final int f658f = 102;

    /* JADX INFO: renamed from: g */
    private static volatile C0133zz f659g = null;

    /* JADX INFO: renamed from: h */
    private static final String f660h = "Function startA was not executed correctly!";

    /* JADX INFO: renamed from: i */
    private static String f661i = null;

    /* JADX INFO: renamed from: j */
    private static String f662j = null;

    /* JADX INFO: renamed from: k */
    private static String f663k = null;

    /* JADX INFO: renamed from: l */
    private static boolean f664l = false;

    /* JADX INFO: renamed from: m */
    private static final int f665m = 101;

    /* JADX INFO: renamed from: n */
    private static final int f666n = 103;

    /* JADX INFO: renamed from: o */
    private static Handler f667o;

    /* JADX INFO: renamed from: p */
    private static final HandlerThread f668p;

    /* JADX INFO: renamed from: q */
    private static Handler f669q;

    /* JADX INFO: renamed from: r */
    private static final HandlerThread f670r;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.zz$a */
    public static class a {
        public HashMap<String, Object> paraMap = new HashMap<>();
    }

    static {
        HandlerThread handlerThread = new HandlerThread("ProcessingThread", 10);
        f668p = handlerThread;
        f669q = null;
        HandlerThread handlerThread2 = new HandlerThread("PauseEventThread", 10);
        f670r = handlerThread2;
        handlerThread.start();
        f667o = new Handler(handlerThread.getLooper()) { // from class: com.tendcloud.tenddata.zz.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                C0088cp.m440a();
                C0087co.m431a();
                Object obj = message.obj;
                if (obj == null || !(obj instanceof a)) {
                    return;
                }
                try {
                    C0132z.m785a().post((a) obj);
                } catch (Throwable unused) {
                }
            }
        };
        handlerThread2.start();
        f669q = new Handler(handlerThread2.getLooper()) { // from class: com.tendcloud.tenddata.zz.12
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                try {
                    AbstractC0018a abstractC0018a = (AbstractC0018a) message.obj;
                    if (C0020ab.f139n == 1) {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 11);
                        aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        aVar.paraMap.put("sessionEnd", 1);
                        aVar.paraMap.put("service", abstractC0018a);
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                        C0020ab.f116Z.set(true);
                        C0020ab.f139n = 2;
                    }
                } catch (Exception unused) {
                }
            }
        };
    }

    public C0133zz() {
        f659g = this;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0133zz m792a() {
        if (f659g == null) {
            synchronized (C0133zz.class) {
                if (f659g == null) {
                    f659g = new C0133zz();
                }
            }
        }
        return f659g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    private void m793a(final Context context) {
        if (!C0131y.m754a(14)) {
            try {
                C0131y.m752a(Class.forName("android.app.ActivityManagerNative"), new InterfaceC0128v() { // from class: com.tendcloud.tenddata.zz.24
                    @Override // com.tendcloud.tenddata.InterfaceC0128v
                    public void afterMethodInvoked(Object obj, Method method, Object[] objArr, Object obj2) {
                    }

                    @Override // com.tendcloud.tenddata.InterfaceC0128v
                    public void beforeMethodInvoke(Object obj, Method method, Object[] objArr) {
                        String name = method.getName();
                        if (context instanceof Activity) {
                            if (name.equalsIgnoreCase("activityPaused")) {
                                C0072c.m392b((Activity) context, AbstractC0018a.UNIVERSAL);
                            } else if (name.equalsIgnoreCase("activityIdle")) {
                                C0072c.m388a((Activity) context, AbstractC0018a.UNIVERSAL);
                            }
                        }
                    }
                }, "gDefault", "android.app.IActivityManager");
                f664l = true;
                return;
            } catch (Throwable th) {
                StringBuilder sbM1039 = C0167c4.m1039("registerActivityLifecycleListener ");
                sbM1039.append(th.getMessage());
                C0115h.eForDeveloper(sbM1039.toString());
                return;
            }
        }
        Application application = null;
        try {
            Context context2 = C0020ab.f132g;
            if (context2 instanceof Activity) {
                application = ((Activity) context2).getApplication();
            } else if (context2 instanceof Application) {
                application = (Application) context2;
            }
            if (application == null || f664l) {
                return;
            }
            C0045b c0045b = new C0045b();
            f657e = c0045b;
            application.registerActivityLifecycleCallbacks(c0045b);
            f664l = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m794a(Context context, final String str, final int i, final AbstractC0018a abstractC0018a) {
        C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.30
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (C0133zz.f654b) {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", Integer.valueOf(i));
                        aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        HashMap<String, Object> map = aVar.paraMap;
                        String str2 = str;
                        map.put("pageName", str2 == null ? "" : C0131y.m747a(str2));
                        aVar.paraMap.put("service", abstractC0018a);
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static Handler m795b() {
        return f669q;
    }

    /* JADX INFO: renamed from: c */
    public static Handler m796c() {
        return f667o;
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo141a(Activity activity, AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
            } else {
                if (f664l && C0020ab.f100J) {
                    return;
                }
                m793a(activity);
                C0072c.m388a(activity, abstractC0018a);
                C0020ab.f100J = true;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo142a(Activity activity, String str, String str2, AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
            } else {
                m793a(activity);
                mo141a(activity, abstractC0018a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo143a(Context context, AbstractC0018a abstractC0018a) {
        mo145a(context, (String) null, (String) null, abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo144a(Context context, String str, AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (f656d) {
                f656d = false;
                return;
            }
            if (C0131y.m767b(str) && (context instanceof Activity)) {
                str = ((Activity) context).getLocalClassName();
            }
            m794a(context, str, 4, abstractC0018a);
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo145a(Context context, String str, String str2, AbstractC0018a abstractC0018a) {
        mo146a(context, str, str2, (String) null, abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo146a(Context context, String str, String str2, String str3, final AbstractC0018a abstractC0018a) {
        try {
            if (context == null) {
                C0115h.iForDeveloper("start SDK failed Context is null");
                return;
            }
            if (!C0131y.m766b(context, "android.permission.INTERNET")) {
                C0115h.eForDeveloper("[startA] Permission \"android.permission.INTERNET\" is needed.");
                return;
            }
            if (abstractC0018a == null) {
                C0115h.eForDeveloper("Failed to start SDK!");
                return;
            }
            try {
                if (f654b) {
                    return;
                }
                C0020ab.f132g = context.getApplicationContext();
                f661i = str;
                f663k = str2;
                f653a = str3;
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                String strM746a = C0131y.m746a(bundle, C0020ab.f120ac);
                String strM746a2 = C0131y.m746a(bundle, "TD_CHANNEL_ID");
                if (C0131y.m767b(strM746a)) {
                    strM746a = f661i;
                }
                f661i = strM746a;
                if (C0131y.m767b(strM746a2)) {
                    strM746a2 = f663k;
                }
                f663k = strM746a2;
                C0020ab.m25c(f653a, abstractC0018a);
                String strM745a = C0131y.m745a(context, "ChannelConfig.json");
                if (C0131y.m767b(strM745a)) {
                    strM745a = f663k;
                }
                f663k = strM745a;
                if (C0131y.m767b(f661i)) {
                    C0115h.eForDeveloper("[startA] TD AppId is null");
                    return;
                }
                String strTrim = f661i.trim();
                f661i = strTrim;
                C0020ab.m15a(strTrim, f663k, abstractC0018a);
                C0054bi.m320a();
                m793a(context);
                C0053bh.m314a();
                C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.23
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0057bl.m324a();
                            a aVar = new a();
                            aVar.paraMap.put("apiType", 1);
                            aVar.paraMap.put("appId", C0133zz.f661i != null ? C0133zz.f661i : "");
                            aVar.paraMap.put("channelId", C0133zz.f663k != null ? C0133zz.f663k : "");
                            aVar.paraMap.put("service", abstractC0018a);
                            aVar.paraMap.put("action", "init");
                            Message.obtain(C0133zz.m796c(), C0133zz.f665m, aVar).sendToTarget();
                            C0058bm.m341a();
                            if (C0131y.m755a(C0020ab.f132g)) {
                                C0072c.m389a(abstractC0018a);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
                f654b = true;
            } catch (Throwable th) {
                C0115h.m529a("[startA] Failed to start SDK!", th);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo147a(Context context, final String str, final String str2, final Map<String, Object> map, final double d, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C0115h.eForDeveloper("onEvent()# event id is empty.");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onEvent being called! eventId: ");
            sb.append(str);
            String string = "null";
            if (abstractC0018a.index() != 3) {
                sb.append(", eventLabel: ");
                sb.append(str2 == null ? "null" : str2);
            }
            sb.append(", eventMap: ");
            if (map != null) {
                string = map.toString();
            }
            sb.append(string);
            sb.append(", value: ");
            sb.append(d);
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.32
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("apiType", 2);
                        aVar.paraMap.put("eventId", C0131y.m747a(str));
                        HashMap<String, Object> map2 = aVar.paraMap;
                        String str3 = str2;
                        map2.put("eventLabel", str3 == null ? null : C0131y.m747a(str3));
                        aVar.paraMap.put("map", map);
                        aVar.paraMap.put("value", Double.valueOf(d));
                        aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo148a(Context context, String str, String str2, Map<String, Object> map, AbstractC0018a abstractC0018a) {
        mo149a(context, str, str2, map, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo149a(Context context, final String str, final String str2, final Map<String, Object> map, final Map<String, Object> map2, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C0115h.eForDeveloper("onEvent()# event id is empty.");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onEvent being called! eventId: ");
            sb.append(str);
            String string = "null";
            if (abstractC0018a.index() != 3) {
                sb.append(", eventLabel: ");
                sb.append(str2 == null ? "null" : str2);
            }
            sb.append(", eventMap: ");
            if (map != null) {
                string = map.toString();
            }
            sb.append(string);
            if (map2 != null && !map2.isEmpty()) {
                sb.append(", eventValue: ");
                sb.append(map2.toString());
            }
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.31
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("apiType", 2);
                        aVar.paraMap.put("eventId", C0131y.m747a(str));
                        HashMap<String, Object> map3 = aVar.paraMap;
                        String str3 = str2;
                        map3.put("eventLabel", str3 == null ? null : C0131y.m747a(str3));
                        aVar.paraMap.put("map", map);
                        aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        Map map4 = map2;
                        if (map4 != null && !map4.isEmpty()) {
                            aVar.paraMap.put("eventValue", map2);
                        }
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo150a(Context context, final String str, final Map<String, Object> map, final double d, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C0115h.eForDeveloper("onEvent()# event id is empty.");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onEvent being called! eventId: ");
            sb.append(str);
            sb.append(", eventMap: ");
            sb.append(map == null ? "null" : map.toString());
            sb.append(", value: ");
            sb.append(d);
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.33
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("apiType", 2);
                        aVar.paraMap.put("eventId", C0131y.m747a(str));
                        aVar.paraMap.put("map", map);
                        aVar.paraMap.put("value", Double.valueOf(d));
                        aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo151a(Context context, final Throwable th, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
            } else {
                if (th == null) {
                    return;
                }
                C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.34
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            a aVar = new a();
                            aVar.paraMap.put("apiType", 3);
                            aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                            aVar.paraMap.put("throwable", th);
                            aVar.paraMap.put("service", abstractC0018a);
                            Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo152a(final TalkingDataOrder talkingDataOrder, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (talkingDataOrder != null && !talkingDataOrder.optString(TalkingDataOrder.keyOrderId).isEmpty()) {
                C0115h.iForDeveloper("onCancelOrder called --> order: " + talkingDataOrder.toString());
                C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.20
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            a aVar = new a();
                            aVar.paraMap.put("apiType", 8);
                            aVar.paraMap.put("service", abstractC0018a);
                            aVar.paraMap.put("domain", "iap");
                            aVar.paraMap.put("action", "cancelOrder");
                            TreeMap treeMap = new TreeMap();
                            treeMap.put("orderId", talkingDataOrder.getString(TalkingDataOrder.keyOrderId));
                            treeMap.put("amount", Integer.valueOf(talkingDataOrder.optInt(TalkingDataOrder.keyTotalPrice)));
                            String strOptString = talkingDataOrder.optString(TalkingDataOrder.keyCurrencyType);
                            if (TextUtils.isEmpty(strOptString)) {
                                strOptString = "CNY";
                            }
                            treeMap.put("currencyType", strOptString);
                            aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                            Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            C0115h.eForDeveloper("onCancelOrder: order or orderID could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo153a(TalkingDataOrder talkingDataOrder, String str, AbstractC0018a abstractC0018a) {
        mo155a(talkingDataOrder, str, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo154a(final TalkingDataOrder talkingDataOrder, final String str, final String str2, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (talkingDataOrder == null) {
                C0115h.eForDeveloper("onPay: order could not be null or empty");
                return;
            }
            C0115h.iForDeveloper("onOrderPaySucc called --> order: " + talkingDataOrder.toString() + " ,paymentType: " + str + " ,profileId: " + str2);
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.13
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 8);
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("domain", "iap");
                        aVar.paraMap.put("action", "pay");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("accountId", str2);
                        treeMap.put("orderId", talkingDataOrder.getString(TalkingDataOrder.keyOrderId));
                        treeMap.put("amount", Integer.valueOf(talkingDataOrder.optInt(TalkingDataOrder.keyTotalPrice)));
                        String strOptString = talkingDataOrder.optString(TalkingDataOrder.keyCurrencyType);
                        if (TextUtils.isEmpty(strOptString)) {
                            strOptString = "CNY";
                        }
                        treeMap.put("currencyType", strOptString);
                        if (!TextUtils.isEmpty(str)) {
                            treeMap.put("payType", str);
                        }
                        aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo155a(final TalkingDataOrder talkingDataOrder, final String str, final Map<String, Object> map, final AbstractC0018a abstractC0018a) {
        String str2;
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (talkingDataOrder != null && !talkingDataOrder.optString(TalkingDataOrder.keyOrderId).isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("onPlaceOrder called --> order: ");
                sb.append(talkingDataOrder.toString());
                sb.append(", profileId: ");
                sb.append(str);
                if (map == null || map.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = ", eventValue: " + map.toString();
                }
                sb.append(str2);
                C0115h.iForDeveloper(sb.toString());
                C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.18
                    @Override // java.lang.Runnable
                    public void run() {
                        JSONArray jSONArray;
                        try {
                            a aVar = new a();
                            aVar.paraMap.put("apiType", 8);
                            aVar.paraMap.put("service", abstractC0018a);
                            aVar.paraMap.put("domain", "iap");
                            aVar.paraMap.put("action", "placeOrder");
                            TreeMap treeMap = new TreeMap();
                            treeMap.put("accountId", str);
                            treeMap.put("orderId", talkingDataOrder.getString(TalkingDataOrder.keyOrderId));
                            treeMap.put("amount", Integer.valueOf(talkingDataOrder.optInt(TalkingDataOrder.keyTotalPrice)));
                            String strOptString = talkingDataOrder.optString(TalkingDataOrder.keyCurrencyType);
                            if (TextUtils.isEmpty(strOptString)) {
                                strOptString = "CNY";
                            }
                            treeMap.put("currencyType", strOptString);
                            if (talkingDataOrder.has(TalkingDataOrder.keyOrderDetail) && (jSONArray = talkingDataOrder.getJSONArray(TalkingDataOrder.keyOrderDetail)) != null && jSONArray.length() > 0) {
                                treeMap.put("items", jSONArray);
                            }
                            Map map2 = map;
                            if (map2 != null && !map2.isEmpty()) {
                                treeMap.put("eventValue", map);
                            }
                            aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                            Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            C0115h.eForDeveloper("onPlaceOrder: order or orderID could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo156a(final TalkingDataProfile talkingDataProfile, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            C0115h.iForDeveloper("onProfileUpdate called --> profile is " + C0131y.m750a(talkingDataProfile).toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put("domain", "account");
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("action", "update");
                        if ("APP".equals(abstractC0018a.name())) {
                            aVar.paraMap.put("action", "_td_update");
                        }
                        aVar.paraMap.put(C0089cq.a.DATA, C0131y.m750a(talkingDataProfile));
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo157a(final TalkingDataSearch talkingDataSearch, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (talkingDataSearch == null) {
                C0115h.eForDeveloper("TDSearch cannot be null ");
                return;
            }
            C0115h.iForDeveloper("onSearch called --> search: " + talkingDataSearch);
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.26
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 17);
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("domain", "ad");
                        aVar.paraMap.put("action", "search");
                        aVar.paraMap.put(C0089cq.a.DATA, C0131y.m750a(talkingDataSearch));
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo158a(final TalkingDataShoppingCart talkingDataShoppingCart, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            C0115h.iForDeveloper("onViewShoppingCart called --> shoppingCart: " + talkingDataShoppingCart);
            if (talkingDataShoppingCart != null && talkingDataShoppingCart.length() > 0) {
                C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.22
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            a aVar = new a();
                            aVar.paraMap.put("apiType", 8);
                            aVar.paraMap.put("service", abstractC0018a);
                            aVar.paraMap.put("domain", "iap");
                            aVar.paraMap.put("action", "viewItems");
                            TreeMap treeMap = new TreeMap();
                            treeMap.put("items", talkingDataShoppingCart);
                            aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                            Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            C0115h.eForDeveloper("viewShoppingCart# shoppingCart can't be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo159a(String str, int i, String str2, AbstractC0018a abstractC0018a) {
        mo161a(str, i, str2, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo160a(final String str, final int i, final String str2, final String str3, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (str != null && !str.isEmpty()) {
                C0115h.iForDeveloper("onOrderPaySucc called --> orderid: " + str + " ,amount: " + i + " ,currencyType: " + str2 + " ,payType: " + str3);
                if (str2 != null && str2.trim().length() == 3) {
                    C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.11
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("service", abstractC0018a);
                                aVar.paraMap.put("domain", "iap");
                                aVar.paraMap.put("action", "pay");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("orderId", str);
                                treeMap.put("amount", Integer.valueOf(i));
                                treeMap.put("currencyType", str2);
                                treeMap.put("payType", str3);
                                aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                                Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C0115h.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            C0115h.eForDeveloper("onOrderPaySucc: orderId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo161a(final String str, final int i, final String str2, final Map<String, Object> map, final AbstractC0018a abstractC0018a) {
        String str3;
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (str != null && !str.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("onPlaceOrder called --> orderId: ");
                sb.append(str);
                sb.append(" ,amount: ");
                sb.append(i);
                sb.append(" ,currencyType: ");
                sb.append(str2);
                if (map == null || map.isEmpty()) {
                    str3 = "";
                } else {
                    str3 = ", eventValue: " + map.toString();
                }
                sb.append(str3);
                C0115h.iForDeveloper(sb.toString());
                if (str2 != null && str2.trim().length() == 3) {
                    C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.17
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("service", abstractC0018a);
                                aVar.paraMap.put("domain", "iap");
                                aVar.paraMap.put("action", "placeOrder");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("orderId", str);
                                treeMap.put("amount", Integer.valueOf(i));
                                treeMap.put("currencyType", str2);
                                Map map2 = map;
                                if (map2 != null && !map2.isEmpty()) {
                                    treeMap.put("eventValue", map);
                                }
                                aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                                Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C0115h.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            C0115h.eForDeveloper("onPlaceOrder: orderId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo162a(String str, TalkingDataProfile talkingDataProfile, AbstractC0018a abstractC0018a) {
        mo165a(str, talkingDataProfile, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo163a(String str, TalkingDataProfile talkingDataProfile, String str2, AbstractC0018a abstractC0018a) {
        mo164a(str, talkingDataProfile, str2, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo164a(final String str, final TalkingDataProfile talkingDataProfile, final String str2, final Map<String, Object> map, final AbstractC0018a abstractC0018a) {
        StringBuilder sb;
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C0115h.eForDeveloper("onRegister: profileId could not be null or empty");
                return;
            }
            String str3 = "";
            if (talkingDataProfile != null) {
                sb = new StringBuilder();
                sb.append("onRegister called --> profileId is ");
                sb.append(str);
                sb.append(" , profile is ");
                sb.append(C0131y.m750a(talkingDataProfile).toString());
                sb.append(" , invitationCode is ");
                sb.append(str2);
                if (map != null && !map.isEmpty()) {
                    str3 = ", eventValue: " + map.toString();
                }
                sb.append(str3);
            } else {
                sb = new StringBuilder();
                sb.append("onRegister called --> profileId is ");
                sb.append(str);
                sb.append(" , invitationCode is ");
                sb.append(str2);
                if (map != null && !map.isEmpty()) {
                    str3 = ", eventValue: " + map.toString();
                }
                sb.append(str3);
            }
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put("domain", "account");
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("action", "register");
                        if ("APP".equals(abstractC0018a.name())) {
                            aVar.paraMap.put("action", "_td_register");
                        }
                        aVar.paraMap.put("accountId", str);
                        aVar.paraMap.put("invitationCode", str2);
                        aVar.paraMap.put(C0089cq.a.DATA, C0131y.m750a(talkingDataProfile));
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo165a(final String str, final TalkingDataProfile talkingDataProfile, final Map<String, Object> map, final AbstractC0018a abstractC0018a) {
        StringBuilder sb;
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C0115h.eForDeveloper("onLogin: profileId could not be null or empty");
                return;
            }
            String str2 = "";
            if (talkingDataProfile != null) {
                sb = new StringBuilder();
                sb.append("onLogin called --> profileId is ");
                sb.append(str);
                sb.append(" ，profile is ");
                sb.append(C0131y.m750a(talkingDataProfile).toString());
                if (map != null && !map.isEmpty()) {
                    str2 = ", eventValue: " + map.toString();
                }
                sb.append(str2);
            } else {
                sb = new StringBuilder();
                sb.append("onLogin called --> profileId is ");
                sb.append(str);
                if (map != null && !map.isEmpty()) {
                    str2 = ", eventValue: " + map.toString();
                }
                sb.append(str2);
            }
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put("domain", "account");
                        aVar.paraMap.put("action", "login");
                        if ("APP".equals(abstractC0018a.name())) {
                            aVar.paraMap.put("action", "_td_login");
                        }
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("accountId", str);
                        aVar.paraMap.put(C0089cq.a.DATA, C0131y.m750a(talkingDataProfile));
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo166a(String str, AbstractC0018a abstractC0018a) {
        mo179a(str, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo167a(String str, C0024af.ProfileType profileType, String str2, AbstractC0018a abstractC0018a) {
        mo168a(str, profileType, str2, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo168a(final String str, final C0024af.ProfileType profileType, final String str2, final Map<String, Object> map, final AbstractC0018a abstractC0018a) {
        String str3;
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C0115h.eForDeveloper("onRegister: profileId could not be null or empty");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onRegister called --> profileId is ");
            sb.append(str);
            sb.append(" ，type is ");
            sb.append(profileType);
            sb.append(" , name is ");
            sb.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb.append(str3);
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put("domain", "account");
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("action", "register");
                        aVar.paraMap.put("accountId", str);
                        C0024af.ProfileType profileType2 = profileType;
                        if (profileType2 != null) {
                            aVar.paraMap.put("type", profileType2.name());
                        }
                        String str4 = str2;
                        if (str4 != null) {
                            aVar.paraMap.put("name", str4);
                        }
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo169a(String str, Object obj) {
        if (!f654b) {
            C0115h.eForDeveloper(f660h);
            return;
        }
        if (str != null && obj != null) {
            C0115h.iForDeveloper("setGlobalKV# key:" + str + " value:" + obj.toString());
        }
        C0020ab.f129d.put(str, obj);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo170a(final String str, final String str2, final int i, final String str3, final String str4, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (str != null && str.trim().length() > 0) {
                C0115h.iForDeveloper("onOrderPaySucc called --> profileId: " + str + " ,orderid: " + str2 + " ,amount: " + i + " ,currencyType: " + str3 + " ,payType: " + str4);
                if (str3 != null && str3.trim().length() == 3) {
                    C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.14
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("service", abstractC0018a);
                                aVar.paraMap.put("domain", "iap");
                                aVar.paraMap.put("action", "recharge");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("accountId", str);
                                treeMap.put("orderId", str2);
                                treeMap.put("amount", Integer.valueOf(i));
                                treeMap.put("currencyType", str3);
                                treeMap.put("payType", str4);
                                aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                                Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C0115h.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            C0115h.eForDeveloper("onOrderPaySucc: profileId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo171a(final String str, final String str2, final int i, final String str3, final String str4, final String str5, final int i2, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (str2 != null && str2.trim().length() > 0) {
                C0115h.iForDeveloper("onPay called --> profileId: " + str + " ,orderid: " + str2 + " ,amount: " + i + " ,currencyType: " + str3 + " ,payType: " + str4 + " ,itemId: " + str5 + " ,itemCount: " + i2);
                if (str3 != null && str3.trim().length() == 3) {
                    C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.16
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("service", abstractC0018a);
                                aVar.paraMap.put("domain", "iap");
                                aVar.paraMap.put("action", "currencyPurchase");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("accountId", str);
                                treeMap.put("orderId", str2);
                                treeMap.put("amount", Integer.valueOf(i));
                                treeMap.put("currencyType", str3);
                                treeMap.put("payType", str4);
                                treeMap.put("itemId", str5);
                                treeMap.put("itemCount", Integer.valueOf(i2));
                                aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                                Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C0115h.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            C0115h.eForDeveloper("onPay: orderId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo172a(String str, String str2, AbstractC0018a abstractC0018a) {
        mo178a(str, str2, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo173a(String str, String str2, String str3, int i, int i2, AbstractC0018a abstractC0018a) {
        mo174a(str, str2, str3, i, i2, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo174a(final String str, final String str2, final String str3, final int i, final int i2, final Map<String, Object> map, final AbstractC0018a abstractC0018a) {
        String str4;
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onAddItemToShoppingCart called --> itemId: ");
            sb.append(str);
            sb.append(" ,category: ");
            sb.append(str2);
            sb.append(" ,name: ");
            sb.append(str3);
            sb.append(" ,unitPrice: ");
            sb.append(i);
            sb.append(" ,amount: ");
            sb.append(i2);
            if (map == null || map.isEmpty()) {
                str4 = "";
            } else {
                str4 = ", eventValue: " + map.toString();
            }
            sb.append(str4);
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.10
                @Override // java.lang.Runnable
                public void run() {
                    int i3;
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 8);
                        aVar.paraMap.put("domain", "iap");
                        aVar.paraMap.put("action", "addItem");
                        aVar.paraMap.put("service", abstractC0018a);
                        TreeMap treeMap = new TreeMap();
                        if (abstractC0018a.name().equals("APP")) {
                            if (!TextUtils.isEmpty(str)) {
                                treeMap.put("id", str);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                treeMap.put("category", str2);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                treeMap.put("name", str3);
                            }
                            treeMap.put("unitPrice", Integer.valueOf(i));
                            i3 = i2;
                        } else {
                            treeMap.put("id", str);
                            treeMap.put("category", str2);
                            treeMap.put("name", str3);
                            treeMap.put("unitPrice", Integer.valueOf(i));
                            i3 = i2;
                        }
                        treeMap.put("count", Integer.valueOf(i3));
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            treeMap.put("eventValue", map);
                        }
                        aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo175a(String str, String str2, String str3, int i, AbstractC0018a abstractC0018a) {
        mo176a(str, str2, str3, i, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo176a(final String str, final String str2, final String str3, final int i, final Map<String, Object> map, final AbstractC0018a abstractC0018a) {
        String str4;
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onViewItem called --> itemId: ");
            sb.append(str);
            sb.append(" ,category: ");
            sb.append(str2);
            sb.append(" ,name: ");
            sb.append(str3);
            sb.append(" ,unitPrice: ");
            sb.append(i);
            if (map == null || map.isEmpty()) {
                str4 = "";
            } else {
                str4 = ", eventValue: " + map.toString();
            }
            sb.append(str4);
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.21
                @Override // java.lang.Runnable
                public void run() {
                    int i2;
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 8);
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("domain", "iap");
                        aVar.paraMap.put("action", "viewItem");
                        TreeMap treeMap = new TreeMap();
                        if (abstractC0018a.name().equals("APP")) {
                            if (!TextUtils.isEmpty(str)) {
                                treeMap.put("id", str);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                treeMap.put("category", str2);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                treeMap.put("name", str3);
                            }
                            i2 = i;
                        } else {
                            treeMap.put("id", str);
                            treeMap.put("category", str2);
                            treeMap.put("name", str3);
                            i2 = i;
                        }
                        treeMap.put("unitPrice", Integer.valueOf(i2));
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            treeMap.put("eventValue", map);
                        }
                        aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo177a(final String str, final String str2, final String str3, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            C0115h.iForDeveloper("onCreateCard called --> profileId: " + str + " method: " + str2 + "  content: " + str3);
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 17);
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("domain", "account");
                        aVar.paraMap.put("action", "card");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("accountId", str);
                        treeMap.put("method", str2);
                        treeMap.put("content", str3);
                        aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo178a(final String str, final String str2, final Map<String, Object> map, final AbstractC0018a abstractC0018a) {
        String str3;
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C0115h.eForDeveloper("onRegister: profileId could not be null or empty");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onRegister called --> profileId is ");
            sb.append(str);
            sb.append(" invitationCode: ");
            sb.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb.append(str3);
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put("domain", "account");
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("action", "register");
                        aVar.paraMap.put("accountId", str);
                        aVar.paraMap.put("invitationCode", str2);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo179a(final String str, final Map<String, Object> map, final AbstractC0018a abstractC0018a) {
        String str2;
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C0115h.eForDeveloper("onLogin: profileId could not be null or empty");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onLogin called --> profileId is ");
            sb.append(str);
            if (map == null || map.isEmpty()) {
                str2 = "";
            } else {
                str2 = ", eventValue: " + map.toString();
            }
            sb.append(str2);
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.35
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put("domain", "account");
                        aVar.paraMap.put("action", "login");
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("accountId", str);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: a */
    public void mo180a(Map<String, Object> map, TDGenerateUrl tDGenerateUrl) {
        C0048bc.m275a().m281a(map).getShortUrl(tDGenerateUrl);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: b */
    public String mo181b(Context context) {
        try {
            return C0117j.m570a(context);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: b */
    public String mo182b(Context context, AbstractC0018a abstractC0018a) {
        if (context != null) {
            try {
                if (!f654b) {
                    C0115h.iForDeveloper(f660h);
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return C0117j.m570a(context);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: b */
    public void mo183b(Activity activity, AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
            } else {
                if (f664l) {
                    return;
                }
                m793a(activity);
                C0072c.m392b(activity, abstractC0018a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: b */
    public void mo184b(Context context, String str, AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (C0131y.m767b(str)) {
                    str = activity.getLocalClassName();
                }
                if ((activity.getChangingConfigurations() & 128) == 128) {
                    f656d = true;
                    return;
                }
            }
            m794a(context, str, 5, abstractC0018a);
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: b */
    public void mo185b(final String str, final int i, final String str2, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (str != null && !str.isEmpty()) {
                C0115h.iForDeveloper("onCancelOrder called --> orderId: " + str + " ,amount: " + i + " ,currencyType: " + str2);
                if (str2 != null && str2.trim().length() == 3) {
                    C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.19
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("service", abstractC0018a);
                                aVar.paraMap.put("domain", "iap");
                                aVar.paraMap.put("action", "cancelOrder");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("orderId", str);
                                treeMap.put("amount", Integer.valueOf(i));
                                treeMap.put("currencyType", str2);
                                aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                                Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C0115h.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            C0115h.eForDeveloper("onCancelOrder: orderId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: b */
    public void mo186b(String str, AbstractC0018a abstractC0018a) {
        mo192b(str, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: b */
    public void mo187b(String str, C0024af.ProfileType profileType, String str2, AbstractC0018a abstractC0018a) {
        mo188b(str, profileType, str2, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: b */
    public void mo188b(final String str, final C0024af.ProfileType profileType, final String str2, final Map<String, Object> map, final AbstractC0018a abstractC0018a) {
        String str3;
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C0115h.eForDeveloper("onLogin: profileId could not be null or empty");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onLogin called --> profileId is ");
            sb.append(str);
            sb.append(" ，profile is ");
            sb.append(profileType);
            sb.append(" , name is ");
            sb.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb.append(str3);
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put("domain", "account");
                        aVar.paraMap.put("action", "login");
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("accountId", str);
                        C0024af.ProfileType profileType2 = profileType;
                        if (profileType2 != null) {
                            aVar.paraMap.put("type", profileType2.name());
                        }
                        String str4 = str2;
                        if (str4 != null) {
                            aVar.paraMap.put("name", str4);
                        }
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: b */
    public void mo189b(final String str, final String str2, final int i, final String str3, final String str4, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (str != null && str.trim().length() > 0) {
                C0115h.iForDeveloper("onPay called --> profileId: " + str + " ,orderid: " + str2 + " ,amount: " + i + " ,currencyType: " + str3 + " ,payType: " + str4);
                if (str3 != null && str3.trim().length() == 3) {
                    C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.15
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("domain", "iap");
                                aVar.paraMap.put("service", abstractC0018a);
                                aVar.paraMap.put("action", "recharge");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("accountId", str);
                                treeMap.put("orderId", str2);
                                treeMap.put("amount", Integer.valueOf(i));
                                treeMap.put("currencyType", str3);
                                treeMap.put("payType", str4);
                                aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                                Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C0115h.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            C0115h.eForDeveloper("onPay: profileId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: b */
    public void mo190b(String str, String str2, AbstractC0018a abstractC0018a) {
        mo191b(str, str2, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: b */
    public void mo191b(final String str, final String str2, final Map<String, Object> map, final AbstractC0018a abstractC0018a) {
        String str3;
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onFavorite called --> category: ");
            sb.append(str);
            sb.append(", content: ");
            sb.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb.append(str3);
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.27
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 17);
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("domain", "user");
                        aVar.paraMap.put("action", "favorites");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("category", str);
                        treeMap.put("content", str2);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            treeMap.put("eventValue", map);
                        }
                        aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: b */
    public void mo192b(final String str, final Map<String, Object> map, final AbstractC0018a abstractC0018a) {
        String str2;
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C0115h.eForDeveloper("onRegister: profileId could not be null or empty");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onRegister called --> profileId is ");
            sb.append(str);
            if (map == null || map.isEmpty()) {
                str2 = "";
            } else {
                str2 = ", eventValue: " + map.toString();
            }
            sb.append(str2);
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put("domain", "account");
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("action", "register");
                        aVar.paraMap.put("accountId", str);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: c */
    public String mo193c(Context context, AbstractC0018a abstractC0018a) {
        return C0020ab.m12a(context, abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: c */
    public void mo194c(final String str, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C0115h.eForDeveloper("onReceiveDeepLink: url could not be null or empty");
                return;
            }
            C0115h.iForDeveloper("onReceiveDeepLink --> link: " + str);
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.25
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C0092ct.m466a().setDeepLink(str);
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 1);
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("domain", "app");
                        aVar.paraMap.put("action", "deeplink");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("link", str);
                        aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: c */
    public void mo195c(String str, String str2, AbstractC0018a abstractC0018a) {
        mo196c(str, str2, new HashMap(), abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: c */
    public void mo196c(final String str, final String str2, final Map<String, Object> map, final AbstractC0018a abstractC0018a) {
        String str3;
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onShare called --> profileId: ");
            sb.append(str);
            sb.append(", content: ");
            sb.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb.append(str3);
            C0115h.iForDeveloper(sb.toString());
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.28
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 17);
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("domain", "user");
                        aVar.paraMap.put("action", "share");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("accountId", str);
                        treeMap.put("content", str2);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            treeMap.put("eventValue", map);
                        }
                        aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: c */
    public void mo197c(boolean z) {
        try {
            C0020ab.f130e = z;
            C0115h.iForDeveloper(" setReportUncaughtExceptions: " + z);
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: d */
    public Context mo198d() {
        try {
            return C0020ab.f132g;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: d */
    public String mo199d(Context context, AbstractC0018a abstractC0018a) {
        return C0020ab.m19b(context, abstractC0018a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: d */
    public void mo200d(final String str, final String str2, final AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
                return;
            }
            C0115h.iForDeveloper("onPunch called --> profileId: " + str + " punchId: " + str2);
            C0131y.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.29
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 17);
                        aVar.paraMap.put("service", abstractC0018a);
                        aVar.paraMap.put("domain", "user");
                        aVar.paraMap.put("action", "punch");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("accountId", str);
                        treeMap.put("punchId", str2);
                        aVar.paraMap.put(C0089cq.a.DATA, treeMap);
                        Message.obtain(C0133zz.m796c(), C0133zz.f658f, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: e */
    public String mo201e(Context context, AbstractC0018a abstractC0018a) {
        try {
            if (!f654b) {
                C0115h.eForDeveloper(f660h);
            }
            return C0105df.m491a().m492c();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    /* JADX INFO: renamed from: e */
    public void mo202e() {
        try {
            C0115h.f499a = false;
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    public void removeGlobalKV(String str) {
        if (!f654b) {
            C0115h.eForDeveloper(f660h);
            return;
        }
        if (str != null) {
            C0115h.iForDeveloper("removeGlobalKV# key:" + str);
        }
        C0020ab.f129d.remove(str);
    }

    @Override // com.tendcloud.tenddata.InterfaceC0033ao
    public void setCustomDataSwitch(TalkingDataSharingFilter talkingDataSharingFilter) {
        C0020ab.f146u = talkingDataSharingFilter;
    }
}
