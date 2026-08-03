package p036c9;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p003a2.C0014a;
import p010aa.C0039g;
import p024b9.C0219e;
import p062e8.C0828b;
import p063e9.C0830a;
import p063e9.C0837h;
import p063e9.C0846q;
import p065eb.C0877k0;
import p065eb.C0881m0;
import p065eb.C0892s;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p077f8.C1086f;
import p080fb.AbstractC1184v0;
import p086fh.C1253k;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p099h.Hchat.utils.KavaReflector;
import p108ha.C1649j0;
import p108ha.C1651k0;
import p115hh.C1730o;
import p115hh.C1731p;
import p154k9.C2357a;
import p154k9.C2358b;
import p154k9.C2372p;
import p154k9.C2374r;
import p162l3.C2469w;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p219oh.AbstractC3165h;
import p242q8.C3458m;
import p242q8.C3460o;
import p242q8.C3462q;
import p243q9.C3465a;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.C3744i;
import p258r8.EnumC3738c;
import p274s8.C3944d;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p329w8.C4688a;
import p330w9.C4689a;
import p366ya.AbstractC6019i;
import sh.C4056v1;
import tf.AbstractC4171r;

/* JADX INFO: renamed from: c9.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0438g extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1292e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [h.Hchat.ModuleEntry.lambda$initModule$4(de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam, android.content.Context, android.content.Context, ub.a):void] */
    public /* synthetic */ C0438g(int i9) {
        this.f1292e = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m1451k(C3742g c3742g) {
        Handler handler = C3740e.f12138a;
        C0434f c0434f = new C0434f(c3742g, 1);
        EnumC3738c enumC3738c = EnumC3738c.WARMUP;
        C3740e.m7759f(8, c0434f, "shared:send_button", "聊天发送按钮", enumC3738c);
        C3740e.m7759f(8, new C0434f(c3742g, 2), "script_plugin:message", "脚本插件-消息监听", enumC3738c);
        C3740e.m7759f(8, new C0434f(c3742g, 3), "script_plugin:new_friend", "脚本插件-好友申请", enumC3738c);
        C3740e.m7759f(8, new C0434f(c3742g, 4), "script_plugin:member_change", "脚本插件-成员变动", enumC3738c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        switch (this.f1292e) {
            case 0:
                return "conversation_group";
            case 1:
                return "custom_notification";
            case 2:
                return "script_plugin";
            case 3:
                return "sns_anti_recall";
            case 4:
                return "floating_shortcut_menu";
            case 5:
                return "group_chat_label";
            case 6:
                return "block_at_all_notification";
            case 7:
                return "audio_transform";
            case 8:
                return "auto_original_image";
            case 9:
                return "wechat_keep_alive";
            case 10:
                return "protobuf_packet";
            case 11:
                return "auto_reply";
            case 12:
                return "keyword_notification";
            case 13:
                return "message_affix";
            default:
                return "quick_terminate";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        int i9 = this.f1292e;
        c3742g.getClass();
        switch (i9) {
            case 0:
                m7751h(new C0039g("conversation_group", "聊天分组", "按自定义分组整理聊天，支持多级分类", "enhance"));
                break;
            case 1:
                m7751h(new C0039g("custom_notification", "自定义通知", "按默认规则或会话规则接管微信通知，支持铃声、震动、静默、群成员过滤、已读和快捷回复", "enhance"));
                break;
            case 2:
                m7751h(new C0039g("script_plugin", "插件总开关", "启动时自动加载已启用插件", "enhance"));
                break;
            case 3:
                m7751h(new C1651k0("sns_anti_recall", "朋友圈防撤回", "已缓存的朋友圈在对方删除或限制可见范围后继续显示", "practical"));
                break;
            case 4:
                m7751h(new C1651k0("floating_shortcut_menu", "悬浮快捷菜单", "展开插件 Agent、自定义快捷项或微信页面", "practical"));
                break;
            case 5:
                m7751h(new C1651k0("group_chat_label", "群聊标签", "分类管理群聊，在名单选择器中按标签批量选择", "practical"));
                break;
            case 6:
                m7751h(new C3944d("block_at_all_notification", "屏蔽艾特所有人", "按选择的群聊拦截艾特所有人通知", "practical"));
                break;
            case 7:
                m7751h(new C3944d("audio_transform", "音频转换", "任意音频转 Silk 保存/发送，或把 Silk 导出为 MP3/M4A 保存", "practical"));
                break;
            case 8:
                m7751h(new C3944d("auto_original_image", "自动勾选原图", "发送聊天图片时自动勾选原图", "practical"));
                break;
            case 9:
                m7751h(new C3944d("wechat_keep_alive", "微信强保活", "前台服务、WakeLock 和 Root 白名单提高息屏存活率", "practical"));
                break;
            case 10:
                m7751h(new C3944d("protobuf_packet", "Protobuf", "抓包和自定义发包", "entertainment"));
                break;
            case 11:
                m7751h(new C3944d("auto_reply", "自动回复", "按规则回复消息，处理好友申请和通过后的欢迎语", "practical"));
                break;
            case 12:
                m7751h(new C3944d("keyword_notification", "关键词通知", "按关键词、@我或@所有人提醒指定聊天消息，支持铃声和震动", "enhance"));
                break;
            case 13:
                m7751h(new C3944d("message_affix", "发送文本格式", "自定义聊天文字消息的发送格式", "practical"));
                break;
            default:
                m7751h(new C3944d("quick_terminate", "快捷终止", "从微信右上角加号菜单快速结束微信进程", "practical"));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo299g(C3742g c3742g) {
        Object c3959f;
        Object next;
        C2469w c2469w;
        C2469w c2469w2;
        Activity activityM7263a;
        Method methodFindDeclaredMethod;
        boolean zBooleanValue;
        Object c3959f2;
        switch (this.f1292e) {
            case 0:
                c3742g.getClass();
                Handler handler = C3740e.f12138a;
                C3740e.m7759f(8, new C0434f(c3742g, 0), "conversation_group", "聊天分组", EnumC3738c.BRIDGE);
                return;
            case 1:
                c3742g.getClass();
                AtomicBoolean atomicBoolean = C0846q.f2580a;
                C0846q.m2124i(c3742g);
                m7752i(C1085e.class, new C0830a(this, 0, c3742g));
                return;
            case 2:
                c3742g.getClass();
                AbstractC6019i.m10780a(c3742g);
                ScriptPluginRuntime.INSTANCE.install(c3742g);
                m1451k(c3742g);
                m7752i(C1085e.class, new C0892s(this, c3742g, 0));
                return;
            case 3:
                Class cls = Boolean.TYPE;
                c3742g.getClass();
                C1649j0 c1649j0 = new C1649j0(c3742g);
                C3742g c3742g2 = c1649j0.f5422a;
                for (Class<?> superclass = c3742g.f12147e.sqliteDbWrapperClass; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                    c1649j0.m4213h(superclass);
                }
                try {
                    c1649j0.m4213h(KavaReflector.loadClass("com.tencent.wcdb.database.SQLiteDatabase", c3742g2.f12145c));
                    break;
                } catch (Throwable unused) {
                }
                try {
                    c1649j0.m4213h(KavaReflector.loadClass("com.tencent.wcdb.compat.SQLiteDatabase", c3742g2.f12145c));
                    break;
                } catch (Throwable unused2) {
                }
                try {
                    c1649j0.m4213h(KavaReflector.loadClass("android.database.sqlite.SQLiteDatabase", c3742g2.f12145c));
                    break;
                } catch (Throwable unused3) {
                }
                SharedPreferences sharedPreferences = c1649j0.f5424c;
                Context context = c3742g.f12143a;
                ClassLoader classLoader = c3742g.f12145c;
                classLoader.getClass();
                String str = C3087k.m6557a(context, classLoader).f8202h;
                if (AbstractC3149m.m6721t0(str)) {
                    str = null;
                }
                String strConcat = str != null ? str.concat("|sns_anti_recall_v2") : null;
                if (strConcat == null) {
                    strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Method methodM2087c = C0828b.m2087c(sharedPreferences, strConcat, classLoader, "enable_flutter_sns_page");
                if (methodM2087c != null) {
                    Class<?>[] parameterTypes = methodM2087c.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length != 0 || !AbstractC1416l.m3825a(methodM2087c.getReturnType(), cls)) {
                        methodM2087c = null;
                    }
                    if (methodM2087c == null) {
                        try {
                            DexKitBridge dexKitBridge = c3742g.f12146d;
                            C0570e c0570e = new C0570e();
                            C1253k c1253k = new C1253k();
                            c1253k.m3374r0("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
                            c0570e.f1764h = c1253k;
                            C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                            ArrayList arrayList = new ArrayList();
                            for (C1730o c1730o : c1731pFindMethod) {
                                c1730o.getClass();
                                arrayList.add(c1730o.m4348p().m6023b(classLoader));
                            }
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    Method method = (Method) next;
                                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                                    parameterTypes2.getClass();
                                    if (parameterTypes2.length == 0 && AbstractC1416l.m3825a(method.getReturnType(), cls)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            c3959f = (Method) next;
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            AbstractC0921a.m2261x("[Hchat:SnsAntiRecall] 定位旧版朋友圈主页开关失败: ", thM8182b.getMessage(), thM8182b);
                            c3959f = null;
                        }
                        methodM2087c = (Method) c3959f;
                        if (methodM2087c != null) {
                            C0828b.m2092h(sharedPreferences, strConcat, "enable_flutter_sns_page", methodM2087c);
                        } else {
                            try {
                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                                    editorEdit.clear().putString("cache.key", strConcat);
                                }
                                editorEdit.remove("enable_flutter_sns_page").apply();
                                break;
                            } catch (Throwable unused4) {
                            }
                        }
                    }
                    break;
                }
                if (methodM2087c == null || !c1649j0.f5425d.add(methodM2087c)) {
                    return;
                }
                try {
                    C3744i.f12154b.m7763b(methodM2087c, new C0219e(c1649j0, 10));
                    return;
                } catch (Throwable th3) {
                    AbstractC0921a.m2261x("[Hchat:SnsAntiRecall] Hook旧版朋友圈主页开关失败: ", th3.getMessage(), th3);
                    return;
                }
            case 4:
                c3742g.getClass();
                C2374r c2374r = C2374r.f7799a;
                Context context2 = c3742g.f12143a;
                synchronized (c2374r) {
                    if (!C2374r.f7803e) {
                        AbstractC3165h.m6760L(context2);
                        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context2, "floating_shortcut_menu");
                        sharedPreferencesM8640c.registerOnSharedPreferenceChangeListener(C2374r.f7809k);
                        C2374r.f7802d = sharedPreferencesM8640c.getBoolean("enable", false);
                        C2374r.f7801c = sharedPreferencesM8640c;
                        C2374r.f7803e = true;
                    }
                }
                C3462q c3462qLifecycle = WeChatApis.lifecycle();
                if (c3462qLifecycle != null) {
                    c3462qLifecycle.f11229b.addIfAbsent(new C2357a());
                    c2469w = new C2469w(20);
                } else {
                    c2469w = null;
                }
                m7753j(c2469w);
                C3458m c3458mChatPage = WeChatApis.chatPage();
                if (c3458mChatPage != null) {
                    c3458mChatPage.f11217g.addIfAbsent(new C2358b());
                    c2469w2 = new C2469w(19);
                } else {
                    c2469w2 = null;
                }
                m7753j(c2469w2);
                C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                if (c3460oCurrentActivity == null || (activityM7263a = c3460oCurrentActivity.m7263a()) == null) {
                    return;
                }
                C2374r.m5687p(new C2372p(activityM7263a, 0));
                return;
            case 5:
                c3742g.getClass();
                return;
            case 6:
                c3742g.getClass();
                AtomicBoolean atomicBoolean2 = C0846q.f2580a;
                C0846q.m2124i(c3742g);
                m7752i(C1085e.class, new C0830a(this, 8, c3742g));
                return;
            case 7:
                c3742g.getClass();
                return;
            case 8:
                c3742g.getClass();
                C4688a c4688a = new C4688a(c3742g);
                ConcurrentHashMap.KeySetView keySetView = c4688a.f15658c;
                Iterator it2 = C4688a.f15655d.iterator();
                int i9 = 0;
                while (it2.hasNext()) {
                    Class<?> clsLoadClass = KavaReflector.loadClass((String) it2.next(), c4688a.f15656a.f12145c);
                    if (clsLoadClass != null && (methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(clsLoadClass, "onCreate", Bundle.class)) != null) {
                        if (!keySetView.contains(methodFindDeclaredMethod)) {
                            if (Modifier.isAbstract(methodFindDeclaredMethod.getModifiers()) || methodFindDeclaredMethod.getDeclaringClass().isInterface()) {
                                zBooleanValue = false;
                            } else {
                                try {
                                    C3744i.f12154b.m7763b(methodFindDeclaredMethod, new C0219e(c4688a, 28));
                                    keySetView.add(methodFindDeclaredMethod);
                                    c3959f2 = Boolean.TRUE;
                                } catch (Throwable th4) {
                                    c3959f2 = new C3959f(th4);
                                }
                                Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                                if (thM8182b2 != null) {
                                    AbstractC0921a.m2261x("[Hchat:AutoOriginalImage] 安装图片发送页面 Hook 失败: ", methodFindDeclaredMethod.toGenericString(), thM8182b2);
                                    c3959f2 = Boolean.FALSE;
                                }
                                zBooleanValue = ((Boolean) c3959f2).booleanValue();
                            }
                            if (zBooleanValue) {
                            }
                            break;
                        }
                        i9++;
                    }
                }
                if (i9 == 0) {
                    AbstractC1184v0.m3203m("[Hchat:AutoOriginalImage] 未找到图片发送页面 onCreate Hook 入口");
                    return;
                }
                return;
            case 9:
                c3742g.getClass();
                C4689a.m9197a(c3742g.f12143a, c3742g.f12144b);
                return;
            case 10:
                c3742g.getClass();
                Handler handler2 = C3740e.f12138a;
                C3740e.m7759f(8, new C4056v1(c3742g, 5, this), "protobuf_packet", "Protobuf", EnumC3738c.WARMUP);
                m7752i(C1085e.class, new C0830a(this, 13, c3742g));
                return;
            case 11:
                c3742g.getClass();
                m7752i(C1085e.class, new C0830a(this, 14, c3742g));
                return;
            case 12:
                c3742g.getClass();
                m7752i(C1085e.class, new C0830a(this, 15, c3742g));
                m7752i(C1086f.class, new C0892s(c3742g));
                return;
            case 13:
                c3742g.getClass();
                C3465a c3465a = new C3465a(AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_message_affix_config"), this);
                CopyOnWriteArrayList copyOnWriteArrayList = C0881m0.f2714h;
                AbstractC4171r.m8433i1(new C0837h(19), copyOnWriteArrayList);
                copyOnWriteArrayList.add(new C0877k0(c3465a));
                m7753j(new C0014a(10));
                Handler handler3 = C3740e.f12138a;
                C3740e.m7759f(8, new C0434f(c3742g, 10), "shared:send_button", "聊天发送按钮", EnumC3738c.WARMUP);
                m7752i(C1085e.class, new C0892s(this, c3742g, 3));
                return;
            default:
                c3742g.getClass();
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        switch (this.f1292e) {
            case 0:
                return "聊天分组";
            case 1:
                return "自定义通知";
            case 2:
                return "脚本插件";
            case 3:
                return "朋友圈防撤回";
            case 4:
                return "悬浮快捷菜单";
            case 5:
                return "群聊标签";
            case 6:
                return "屏蔽艾特所有人";
            case 7:
                return "音频转换";
            case 8:
                return "自动勾选原图";
            case 9:
                return "微信强保活";
            case 10:
                return "Protobuf";
            case 11:
                return "自动回复";
            case 12:
                return "关键词通知";
            case 13:
                return "发送文本格式";
            default:
                return "快捷终止";
        }
    }
}
