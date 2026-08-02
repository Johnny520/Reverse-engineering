package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;
import nuke.module.wechat.p002ai.AIChatMessage;
import nuke.module.wechat.p002ai.AIChatRequest;
import nuke.module.wechat.p002ai.AIChatResponse;
import nuke.module.wechat.p002ai.C0516a;
import nuke.module.wechat.p002ai.C0517b;

/* JADX INFO: renamed from: b0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0038b0 extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final C0038b0 f458d = new C0038b0(false);

    /* JADX INFO: renamed from: e */
    public static final int f459e = R.string.ai_chat;

    /* JADX INFO: renamed from: f */
    public static final int f460f = R.string.ai_chat_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f461g = wm0.f12575i;

    /* JADX INFO: renamed from: h */
    public static final String f462h = "AIChat";

    /* JADX INFO: renamed from: i */
    public static final boolean f463i = true;

    /* JADX INFO: renamed from: j */
    public static final z52 f464j = new z52();

    /* JADX INFO: renamed from: k */
    public static final AtomicLong f465k = new AtomicLong();

    /* JADX INFO: renamed from: l */
    public static final ExecutorService f466l = Executors.newSingleThreadExecutor(new ThreadFactoryC0714t(0));

    /* JADX INFO: renamed from: m */
    public static final Object f467m = new Object();

    /* JADX INFO: renamed from: n */
    public static final HashMap f468n = new HashMap();

    /* JADX INFO: renamed from: o */
    public static C0001a0 f469o;

    /* JADX INFO: renamed from: q */
    public static AIChatConfig m316q() {
        pp1 pp1Var = pp1.f8445a;
        AIChatConfig aIChatConfig = (AIChatConfig) pp1.m3931c().m3605b(AbstractC0691se.m4815D(AIChatConfig.Companion.serializer()), new AIChatConfig((String) null, (String) null, (String) null, (String) null, 0.0f, 0, 0, 0L, (EnumC0075c1) null, (Set) null, 1023, (c50) null), "AIChat/config");
        return aIChatConfig == null ? new AIChatConfig((String) null, (String) null, (String) null, (String) null, 0.0f, 0, 0, 0L, (EnumC0075c1) null, (Set) null, 1023, (c50) null) : aIChatConfig;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m317r(AIChatConfig aIChatConfig) {
        if (!aIChatConfig.isReady()) {
            return false;
        }
        vf1 vf1Var = C0517b.f7334e;
        String baseUrl = aIChatConfig.getBaseUrl();
        baseUrl.getClass();
        return C0516a.m3435e(baseUrl, "chat/completions") != null;
    }

    /* JADX INFO: renamed from: s */
    public static void m318s(final by0 by0Var, final long j) throws InterruptedException {
        List list;
        AtomicLong atomicLong = f465k;
        if (j != atomicLong.get()) {
            return;
        }
        final AIChatConfig aIChatConfigM316q = m316q();
        if (m317r(aIChatConfigM316q) && aIChatConfigM316q.allowsTalker(by0Var.f1074a)) {
            if (aIChatConfigM316q.getReplyDelayMs() > 0) {
                long replyDelayMs = aIChatConfigM316q.getReplyDelayMs();
                if (replyDelayMs > AIChatConfig.MaxReplyDelayMs) {
                    replyDelayMs = 60000;
                }
                Thread.sleep(replyDelayMs);
            }
            if (j != atomicLong.get()) {
                return;
            }
            final C0001a0 c0001a0 = new C0001a0(aIChatConfigM316q.getContextRounds(), pv2.m3994J0(pv2.m3993I0(aIChatConfigM316q.getBaseUrl()).toString(), '/'), aIChatConfigM316q.getApiKey(), aIChatConfigM316q.getModel(), aIChatConfigM316q.getSystemPrompt());
            EnumC0224g1 enumC0224g1 = EnumC0224g1.f3226j;
            String str = by0Var.f1076c;
            String str2 = by0Var.f1075b;
            if (str != null) {
                str2 = "[WeChat sender: " + str + "]\n" + str2;
            }
            final AIChatMessage aIChatMessage = new AIChatMessage(enumC0224g1, str2);
            pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
            String string = pv2.m3993I0(aIChatConfigM316q.getSystemPrompt()).toString();
            List listM1145C0 = null;
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                pb1VarM1424E.add(new AIChatMessage(EnumC0224g1.f3225i, string));
            }
            C0038b0 c0038b0 = f458d;
            String str3 = by0Var.f1074a;
            int contextRounds = aIChatConfigM316q.getContextRounds();
            c0038b0.getClass();
            synchronized (f467m) {
                try {
                    if (!t11.m5086l(f469o, c0001a0)) {
                        f468n.clear();
                        f469o = c0001a0;
                    }
                    if (contextRounds <= 0) {
                        list = be0.f819h;
                    } else {
                        List list2 = (List) f468n.get(str3);
                        if (list2 != null) {
                            if (contextRounds > 20) {
                                contextRounds = 20;
                            }
                            listM1145C0 = AbstractC0142du.m1145C0(contextRounds * 2, list2);
                        }
                        list = listM1145C0 == null ? be0.f819h : listM1145C0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pb1VarM1424E.addAll(list);
            pb1VarM1424E.add(aIChatMessage);
            InterfaceC0187f1 interfaceC0187f1M3437a = new C0517b(aIChatConfigM316q.getBaseUrl(), aIChatConfigM316q.getApiKey(), aIChatConfigM316q.getModel()).m3437a(new AIChatRequest(AbstractC0179eu.m1476z(pb1VarM1424E), aIChatConfigM316q.getTemperature(), aIChatConfigM316q.getMaxTokens()));
            if (j != atomicLong.get()) {
                return;
            }
            AIChatConfig aIChatConfigM316q2 = m316q();
            if (!aIChatConfigM316q2.equals(aIChatConfigM316q) || !aIChatConfigM316q2.allowsTalker(by0Var.f1074a)) {
                hg3.m2168f(f462h, "AI reply discarded because configuration changed: talker=".concat(by0Var.f1074a));
                return;
            }
            if (!(interfaceC0187f1M3437a instanceof C0114d1)) {
                if (!(interfaceC0187f1M3437a instanceof C0150e1)) {
                    c80.m675s();
                    return;
                }
                final AIChatResponse aIChatResponse = ((C0150e1) interfaceC0187f1M3437a).f2290a;
                if (j != atomicLong.get()) {
                    return;
                }
                gd3.m1838l(by0Var.f1074a, aIChatResponse.getContent()).m4900a(new in0() { // from class: u
                    @Override // p000.in0
                    /* JADX INFO: renamed from: j */
                    public final Object mo5j(Object obj) {
                        long j2 = j;
                        AIChatConfig aIChatConfig = aIChatConfigM316q;
                        by0 by0Var2 = by0Var;
                        C0001a0 c0001a02 = c0001a0;
                        AIChatMessage aIChatMessage2 = aIChatMessage;
                        AIChatResponse aIChatResponse2 = aIChatResponse;
                        ((mo2) obj).getClass();
                        if (j2 == C0038b0.f465k.get()) {
                            C0038b0.f458d.getClass();
                            if (C0038b0.m316q().equals(aIChatConfig)) {
                                String str4 = by0Var2.f1074a;
                                int contextRounds2 = aIChatConfig.getContextRounds();
                                AIChatMessage aIChatMessage3 = new AIChatMessage(EnumC0224g1.f3227k, aIChatResponse2.getContent());
                                synchronized (C0038b0.f467m) {
                                    try {
                                        if (!t11.m5086l(C0038b0.f469o, c0001a02)) {
                                            C0038b0.f468n.clear();
                                            C0038b0.f469o = c0001a02;
                                        }
                                        if (contextRounds2 <= 0) {
                                            C0038b0.f468n.remove(str4);
                                        } else {
                                            if (contextRounds2 > 20) {
                                                contextRounds2 = 20;
                                            }
                                            int i = contextRounds2 * 2;
                                            HashMap map = C0038b0.f468n;
                                            Object arrayList = map.get(str4);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                map.put(str4, arrayList);
                                            }
                                            List list3 = (List) arrayList;
                                            list3.add(aIChatMessage2);
                                            list3.add(aIChatMessage3);
                                            if (list3.size() > i) {
                                                list3.subList(0, list3.size() - i).clear();
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }
                        C0038b0.f458d.getClass();
                        String str5 = C0038b0.f462h;
                        String str6 = by0Var2.f1074a;
                        String model = aIChatResponse2.getModel();
                        if (model == null) {
                            model = aIChatConfig.getModel();
                        }
                        int length = aIChatResponse2.getContent().length();
                        String finishReason = aIChatResponse2.getFinishReason();
                        Integer totalTokens = aIChatResponse2.getTotalTokens();
                        StringBuilder sbM5696o = vi0.m5696o("AI reply sent: talker=", str6, ", model=", model, ", replyLength=");
                        sbM5696o.append(length);
                        sbM5696o.append(", finishReason=");
                        sbM5696o.append(finishReason);
                        sbM5696o.append(", totalTokens=");
                        sbM5696o.append(totalTokens);
                        hg3.m2168f(str5, sbM5696o.toString());
                        return a83.f116a;
                    }
                }, new C0792v(0, by0Var));
                return;
            }
            String str4 = f462h;
            String str5 = by0Var.f1074a;
            String model = aIChatConfigM316q.getModel();
            C0114d1 c0114d1 = (C0114d1) interfaceC0187f1M3437a;
            String lowerCase = c0114d1.f1803a.getCode().name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Integer httpCode = c0114d1.f1803a.getHttpCode();
            String message = c0114d1.f1803a.getMessage();
            StringBuilder sbM5696o = vi0.m5696o("AI completion failed: talker=", str5, ", model=", model, ", type=");
            sbM5696o.append(lowerCase);
            sbM5696o.append(", httpCode=");
            sbM5696o.append(httpCode);
            sbM5696o.append(", reason=");
            sbM5696o.append(message);
            hg3.m2166d(str4, sbM5696o.toString());
        }
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f462h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: h */
    public final void mo319h(vb1 vb1Var) {
        f465k.incrementAndGet();
        m316q();
        vb1Var.m5664a(id3.f4575e, new C0829w(0));
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: i */
    public final void mo320i() {
        f465k.incrementAndGet();
        f464j.f13735d.clear();
        synchronized (f467m) {
            f468n.clear();
            f469o = null;
        }
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: j */
    public final String mo321j(Context context) {
        context.getClass();
        AIChatConfig aIChatConfigM316q = m316q();
        if (!m317r(aIChatConfigM316q)) {
            String string = context.getString(R.string.ai_chat_not_configured);
            string.getClass();
            return string;
        }
        String string2 = context.getString(aIChatConfigM316q.getListMode() == EnumC0075c1.f1101j ? R.string.ai_chat_list_whitelist : R.string.ai_chat_list_blacklist);
        string2.getClass();
        String string3 = context.getString(R.string.ai_chat_config_summary, aIChatConfigM316q.getModel(), string2, Integer.valueOf(aIChatConfigM316q.getTargetIds().size()), Integer.valueOf(aIChatConfigM316q.getContextRounds()));
        string3.getClass();
        return string3;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f460f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: l */
    public final boolean mo322l() {
        return f463i;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f459e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f461g;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: p */
    public final void mo323p(View view, xm0 xm0Var) {
        Activity activity;
        view.getClass();
        xm0Var.getClass();
        Context context = view.getContext();
        context.getClass();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
                context.getClass();
            }
        }
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC0724t7(4, activity, new C0402kw(911635723, true, new C0866x(0, m316q(), xm0Var))));
    }
}
