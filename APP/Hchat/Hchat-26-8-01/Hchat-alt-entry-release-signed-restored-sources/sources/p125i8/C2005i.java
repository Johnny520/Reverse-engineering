package p125i8;

import android.content.Context;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import p002a1.RunnableC0003a;
import p025bc.AbstractC0255e;
import p036c9.C0456k1;
import p077f8.C1085e;
import p082fd.CallableC1205b;
import p089g1.C1275d;
import p096g8.C1360a;
import p096g8.C1363d;
import p096g8.C1366g;
import p096g8.C1368i;
import p096g8.C1369j;
import p096g8.C1370k;
import p096g8.C1371l;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p106h8.C1624a;
import p106h8.C1625b;
import p116i.C1746e0;
import p136j8.C2105p;
import p153k8.C2341e;
import p153k8.C2343g;
import p153k8.C2345i;
import p153k8.C2347k;
import p153k8.C2352p;
import p153k8.C2353q;
import p153k8.C2355s;
import p183m8.C2813a;
import p183m8.C2815c;
import p196n8.C2911c;
import p210o8.C3077a;
import p210o8.C3080d;
import p210o8.C3081e;
import p210o8.C3082f;
import p210o8.C3083g;
import p210o8.C3086j;
import p210o8.C3087k;
import p230p8.C3351d0;
import p230p8.C3356h;
import p230p8.C3372x;
import p242q8.C3454i;
import p242q8.C3458m;
import p242q8.C3460o;
import p242q8.C3462q;
import p242q8.C3463r;
import p242q8.C3464s;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;
import p258r8.InterfaceC3741f;

/* JADX INFO: renamed from: i8.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2005i implements InterfaceC3741f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m4938e(String str, Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            StringBuilder sbM1025n = AbstractC0255e.m1025n(str, " API安装失败: ");
            sbM1025n.append(th2.getMessage());
            m4939f(sbM1025n.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m4939f(String str) {
        if (str == null) {
            return;
        }
        if (str.contains("失败") || str.contains("异常") || str.contains("未找到") || str.contains("为空") || str.contains("不可用") || str.contains("未就绪") || str.contains("未解析") || str.contains("缺失") || str.contains("无合适") || str.contains("ERROR") || str.contains("error")) {
            XposedBridge.log("[Hchat:WechatApi] ".concat(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "wechat_api";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: b */
    public final boolean mo4940b(C3742g c3742g) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: c */
    public final void mo4941c(final C3742g c3742g) {
        C2815c c2815c = new C2815c(new C1275d(this, 19));
        C3077a c3077a = new C3077a(c3742g.f12143a);
        final C2813a c2813a = new C2813a(c2815c, new C1275d(this, 27));
        DexFinder dexFinder = c3742g.f12147e;
        WeChatDatabaseApi weChatDatabaseApi = new WeChatDatabaseApi(dexFinder, new C2002f(this, 2));
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        C1360a c1360a = new C1360a(context, classLoader, weChatDatabaseApi, new C2002f(this, 4));
        C1368i c1368i = new C1368i(weChatDatabaseApi, dexFinder, c2815c, new C2002f(this, 5));
        C3463r c3463r = new C3463r(context, new C2002f(this, 6));
        C3464s c3464s = new C3464s(context);
        C2355s c2355s = new C2355s(weChatDatabaseApi, c1360a, dexFinder, new C2002f(this, 7));
        C2343g c2343g = new C2343g(dexFinder, c2815c, c1360a, c1368i, c2355s, c3742g.f12148f, new C2002f(this, 8));
        C2341e c2341e = new C2341e(dexFinder, new C2002f(this, 0));
        c2341e.m5574g();
        C1624a c1624a = new C1624a(weChatDatabaseApi, c1368i, c3463r, dexFinder, new C2002f(this, 3));
        C1370k c1370k = new C1370k(c1360a, c1368i);
        C1363d c1363d = new C1363d(weChatDatabaseApi, c1368i, dexFinder, c2815c, new C2002f(this, 9));
        C3083g c3083g = new C3083g(weChatDatabaseApi);
        C2353q c2353q = new C2353q();
        final C2347k c2347k = new C2347k(dexFinder, c1360a, c2353q, c3742g.f12148f, new C2002f(this, 10));
        C3082f c3082f = new C3082f();
        final C3080d c3080d = new C3080d(dexFinder, classLoader, new C2002f(this, 11));
        C3460o c3460o = new C3460o(new C2002f(this, 12));
        C2105p c2105p = new C2105p(context, dexFinder, c3742g.f12145c, c3742g.f12146d, c3460o, new C2002f(this, 13));
        C3454i c3454i = new C3454i(new C2002f(this, 14));
        final C2345i c2345i = new C2345i(c3080d, c2355s, c1360a, new C2002f(this, 15));
        final C1625b c1625b = new C1625b(c3080d, c1624a, new C1275d(this, 20));
        final C1369j c1369j = new C1369j(c3080d, c1368i, new C1275d(this, 21));
        final C1366g c1366g = new C1366g(c3080d, c1363d, new C1275d(this, 22));
        C3462q c3462q = new C3462q(new C1275d(this, 23));
        C3081e c3081e = new C3081e();
        C3086j c3086j = new C3086j(context, new C1275d(this, 24));
        C3087k c3087k = new C3087k(context, classLoader);
        final C2352p c2352p = new C2352p(c2347k, c2345i, c2353q, c1360a, new C1275d(this, 25));
        final C3458m c3458m = new C3458m(dexFinder, c3460o, c3462q, c3454i, c1368i, new C1275d(this, 26));
        C2911c c2911c = new C2911c(dexFinder, c2815c, new C1275d(this, 28));
        C1371l c1371l = new C1371l(dexFinder, c2815c, new C1275d(this, 29));
        final C3351d0 c3351d0 = new C3351d0(context, dexFinder, c3742g.f12145c, c3742g.f12146d, c2813a, c1360a, c1368i, c3742g, new C2002f(this, 1));
        c2813a.m6205a(dexFinder);
        c2347k.m5610a();
        m4938e("databaseChanges", new RunnableC0003a(c3080d, 12));
        m4938e("messageChanges", new RunnableC0003a(c2345i, 13));
        m4938e("conversationChanges", new RunnableC0003a(c1625b, 14));
        m4938e("contactChanges", new RunnableC0003a(c1369j, 15));
        m4938e("chatroomChanges", new RunnableC0003a(c1366g, 16));
        m4938e("currentActivity", new RunnableC0003a(c3460o, 17));
        m4938e("activityStart", new RunnableC0003a(c3454i, 18));
        m4938e("lifecycle", new RunnableC0003a(c3462q, 19));
        m4938e("messageObserve", new RunnableC0003a(c2352p, 20));
        m4938e("chatPage", new RunnableC0003a(c3458m, 21));
        WeChatApis.init(c2343g, weChatDatabaseApi, c1360a, c1368i, c2355s, c1624a, c3463r, c3077a, c2813a, c1370k, c1363d, c3083g, c2353q, c2347k, c2341e, c3464s, c2105p, c3082f, c3080d, c3460o, c3454i, c2345i, c1625b, c1369j, c1366g, c3462q, c3081e, c3086j, c2352p, c3458m, c3087k, c2911c, c1371l, c3351d0);
        C3740e.m7758e(1000, new C1746e0(new Callable(this) { // from class: i8.g
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                StringBuilder sb2;
                EnumC3738c enumC3738c = EnumC3738c.WARMUP;
                C3742g c3742g2 = c3742g;
                C2813a c2813a2 = c2813a;
                final C3351d0 c3351d02 = c3351d0;
                C2347k c2347k2 = c2347k;
                C3080d c3080d2 = c3080d;
                C2345i c2345i2 = c2345i;
                C1625b c1625b2 = c1625b;
                C1369j c1369j2 = c1369j;
                C1366g c1366g2 = c1366g;
                C2352p c2352p2 = c2352p;
                C3458m c3458m2 = c3458m;
                try {
                    c3742g2.f12147e.resolveAll();
                    c2813a2.m6205a(c3742g2.f12147e);
                    final int i9 = 0;
                    C2005i.m4938e("snsInteractionWarmup", new Runnable() { // from class: i8.h
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object objM7105k;
                            Method methodM7101f;
                            Method methodM7101f2;
                            Method methodM7101f3;
                            switch (i9) {
                                case 0:
                                    C3372x c3372xM7076h = c3351d02.m7076h();
                                    if (c3372xM7076h != null) {
                                        c3372xM7076h.m7152g();
                                        c3372xM7076h.m7151f();
                                        c3372xM7076h.m7153h();
                                    }
                                    break;
                                case 1:
                                    C3356h c3356hM7075g = c3351d02.m7075g();
                                    if (c3356hM7075g != null && (objM7105k = c3356hM7075g.m7105k()) != null) {
                                        if (c3356hM7075g.f10820g == null && (methodM7101f3 = c3356hM7075g.m7101f(C3356h.f10810l, new C0456k1(c3356hM7075g, objM7105k, 11), "sns_info_get_by_id_v1")) != null) {
                                            c3356hM7075g.f10820g = methodM7101f3;
                                        }
                                        if (c3356hM7075g.f10821h == null && (methodM7101f2 = c3356hM7075g.m7101f(C3356h.f10811m, new C0456k1(c3356hM7075g, objM7105k, 12), "sns_info_get_by_user_v1")) != null) {
                                            c3356hM7075g.f10821h = methodM7101f2;
                                        }
                                        if (c3356hM7075g.f10822i == null && (methodM7101f = c3356hM7075g.m7101f(C3356h.f10812n, new C0456k1(c3356hM7075g, objM7105k, 13), "sns_info_get_timeline_v1")) != null) {
                                            c3356hM7075g.f10822i = methodM7101f;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    c3351d02.m7077i();
                                    break;
                            }
                        }
                    });
                    final int i10 = 1;
                    C2005i.m4938e("snsCachedPostsWarmup", new Runnable() { // from class: i8.h
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object objM7105k;
                            Method methodM7101f;
                            Method methodM7101f2;
                            Method methodM7101f3;
                            switch (i10) {
                                case 0:
                                    C3372x c3372xM7076h = c3351d02.m7076h();
                                    if (c3372xM7076h != null) {
                                        c3372xM7076h.m7152g();
                                        c3372xM7076h.m7151f();
                                        c3372xM7076h.m7153h();
                                    }
                                    break;
                                case 1:
                                    C3356h c3356hM7075g = c3351d02.m7075g();
                                    if (c3356hM7075g != null && (objM7105k = c3356hM7075g.m7105k()) != null) {
                                        if (c3356hM7075g.f10820g == null && (methodM7101f3 = c3356hM7075g.m7101f(C3356h.f10810l, new C0456k1(c3356hM7075g, objM7105k, 11), "sns_info_get_by_id_v1")) != null) {
                                            c3356hM7075g.f10820g = methodM7101f3;
                                        }
                                        if (c3356hM7075g.f10821h == null && (methodM7101f2 = c3356hM7075g.m7101f(C3356h.f10811m, new C0456k1(c3356hM7075g, objM7105k, 12), "sns_info_get_by_user_v1")) != null) {
                                            c3356hM7075g.f10821h = methodM7101f2;
                                        }
                                        if (c3356hM7075g.f10822i == null && (methodM7101f = c3356hM7075g.m7101f(C3356h.f10812n, new C0456k1(c3356hM7075g, objM7105k, 13), "sns_info_get_timeline_v1")) != null) {
                                            c3356hM7075g.f10822i = methodM7101f;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    c3351d02.m7077i();
                                    break;
                            }
                        }
                    });
                    final int i11 = 2;
                    C2005i.m4938e("snsPostObserverWarmup", new Runnable() { // from class: i8.h
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object objM7105k;
                            Method methodM7101f;
                            Method methodM7101f2;
                            Method methodM7101f3;
                            switch (i11) {
                                case 0:
                                    C3372x c3372xM7076h = c3351d02.m7076h();
                                    if (c3372xM7076h != null) {
                                        c3372xM7076h.m7152g();
                                        c3372xM7076h.m7151f();
                                        c3372xM7076h.m7153h();
                                    }
                                    break;
                                case 1:
                                    C3356h c3356hM7075g = c3351d02.m7075g();
                                    if (c3356hM7075g != null && (objM7105k = c3356hM7075g.m7105k()) != null) {
                                        if (c3356hM7075g.f10820g == null && (methodM7101f3 = c3356hM7075g.m7101f(C3356h.f10810l, new C0456k1(c3356hM7075g, objM7105k, 11), "sns_info_get_by_id_v1")) != null) {
                                            c3356hM7075g.f10820g = methodM7101f3;
                                        }
                                        if (c3356hM7075g.f10821h == null && (methodM7101f2 = c3356hM7075g.m7101f(C3356h.f10811m, new C0456k1(c3356hM7075g, objM7105k, 12), "sns_info_get_by_user_v1")) != null) {
                                            c3356hM7075g.f10821h = methodM7101f2;
                                        }
                                        if (c3356hM7075g.f10822i == null && (methodM7101f = c3356hM7075g.m7101f(C3356h.f10812n, new C0456k1(c3356hM7075g, objM7105k, 13), "sns_info_get_timeline_v1")) != null) {
                                            c3356hM7075g.f10822i = methodM7101f;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    c3351d02.m7077i();
                                    break;
                            }
                        }
                    });
                    c2347k2.m5610a();
                    C2005i.m4938e("databaseChangesWarmup", new RunnableC0003a(c3080d2, 12));
                    C2005i.m4938e("messageChangesWarmup", new RunnableC0003a(c2345i2, 13));
                    C2005i.m4938e("conversationChangesWarmup", new RunnableC0003a(c1625b2, 14));
                    C2005i.m4938e("contactChangesWarmup", new RunnableC0003a(c1369j2, 15));
                    C2005i.m4938e("chatroomChangesWarmup", new RunnableC0003a(c1366g2, 16));
                    C2005i.m4938e("messageObserveWarmup", new RunnableC0003a(c2352p2, 20));
                    C2005i.m4938e("chatPageWarmup", new RunnableC0003a(c3458m2, 21));
                    try {
                        C3740e.m7754a(enumC3738c);
                        c3742g2.f12148f.m2715b(new C1085e());
                    } catch (Throwable th2) {
                        th = th2;
                        sb2 = new StringBuilder("DexReady 发布失败: ");
                        sb2.append(th.getMessage());
                        C2005i.m4939f(sb2.toString());
                    }
                } catch (Throwable th3) {
                    try {
                        C2005i.m4939f("DexKit 预热失败: " + th3.getMessage());
                        try {
                            C3740e.m7754a(enumC3738c);
                            c3742g2.f12148f.m2715b(new C1085e());
                        } catch (Throwable th4) {
                            th = th4;
                            sb2 = new StringBuilder("DexReady 发布失败: ");
                            sb2.append(th.getMessage());
                            C2005i.m4939f(sb2.toString());
                        }
                    } finally {
                    }
                }
                return Boolean.TRUE;
            }
        }, 14), "wechat_api:warmup", "微信公共API预热", EnumC3738c.BRIDGE);
        C3740e.m7758e(0, new C1746e0(new CallableC1205b(c3742g, 2), 14), "wechat_api:private_conversation_mute", "私聊免打扰API补定位", EnumC3738c.WARMUP);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "微信公共API";
    }
}
