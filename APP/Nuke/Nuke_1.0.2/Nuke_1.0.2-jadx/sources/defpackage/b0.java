package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;
import nuke.module.wechat.ai.AIChatMessage;
import nuke.module.wechat.ai.AIChatRequest;
import nuke.module.wechat.ai.AIChatResponse;
import nuke.module.wechat.ai.a;
import nuke.module.wechat.ai.b;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends gx2 {
    public static final b0 d = new b0(false);
    public static final int e = R.string.ai_chat;
    public static final int f = R.string.ai_chat_description;
    public static final wm0 g = wm0.i;
    public static final String h = "AIChat";
    public static final boolean i = true;
    public static final z52 j = new z52();
    public static final AtomicLong k = new AtomicLong();
    public static final ExecutorService l = Executors.newSingleThreadExecutor(new t(0));
    public static final Object m = new Object();
    public static final HashMap n = new HashMap();
    public static a0 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AIChatConfig q() {
        pp1 pp1Var = pp1.a;
        AIChatConfig aIChatConfig = (AIChatConfig) pp1.c().b(se.D(AIChatConfig.Companion.serializer()), new AIChatConfig((String) null, (String) null, (String) null, (String) null, 0.0f, 0, 0, 0L, (c1) null, (Set) null, 1023, (c50) null), "AIChat/config");
        return aIChatConfig == null ? new AIChatConfig((String) null, (String) null, (String) null, (String) null, 0.0f, 0, 0, 0L, (c1) null, (Set) null, 1023, (c50) null) : aIChatConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean r(AIChatConfig aIChatConfig) {
        if (!aIChatConfig.isReady()) {
            return false;
        }
        vf1 vf1Var = b.e;
        String baseUrl = aIChatConfig.getBaseUrl();
        baseUrl.getClass();
        return a.e(baseUrl, "chat/completions") != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void s(final by0 by0Var, final long j2) throws InterruptedException {
        List list;
        AtomicLong atomicLong = k;
        if (j2 != atomicLong.get()) {
            return;
        }
        final AIChatConfig aIChatConfigQ = q();
        if (r(aIChatConfigQ) && aIChatConfigQ.allowsTalker(by0Var.a)) {
            if (aIChatConfigQ.getReplyDelayMs() > 0) {
                long replyDelayMs = aIChatConfigQ.getReplyDelayMs();
                if (replyDelayMs > AIChatConfig.MaxReplyDelayMs) {
                    replyDelayMs = 60000;
                }
                Thread.sleep(replyDelayMs);
            }
            if (j2 != atomicLong.get()) {
                return;
            }
            final a0 a0Var = new a0(aIChatConfigQ.getContextRounds(), pv2.J0(pv2.I0(aIChatConfigQ.getBaseUrl()).toString(), '/'), aIChatConfigQ.getApiKey(), aIChatConfigQ.getModel(), aIChatConfigQ.getSystemPrompt());
            g1 g1Var = g1.j;
            String str = by0Var.c;
            String str2 = by0Var.b;
            if (str != null) {
                str2 = "[WeChat sender: " + str + "]\n" + str2;
            }
            final AIChatMessage aIChatMessage = new AIChatMessage(g1Var, str2);
            pb1 pb1VarE = eu.E();
            String string = pv2.I0(aIChatConfigQ.getSystemPrompt()).toString();
            List listC0 = null;
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                pb1VarE.add(new AIChatMessage(g1.i, string));
            }
            b0 b0Var = d;
            String str3 = by0Var.a;
            int contextRounds = aIChatConfigQ.getContextRounds();
            b0Var.getClass();
            synchronized (m) {
                try {
                    if (!t11.l(o, a0Var)) {
                        n.clear();
                        o = a0Var;
                    }
                    if (contextRounds <= 0) {
                        list = be0.h;
                    } else {
                        List list2 = (List) n.get(str3);
                        if (list2 != null) {
                            if (contextRounds > 20) {
                                contextRounds = 20;
                            }
                            listC0 = du.C0(contextRounds * 2, list2);
                        }
                        list = listC0 == null ? be0.h : listC0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pb1VarE.addAll(list);
            pb1VarE.add(aIChatMessage);
            f1 f1VarA = new b(aIChatConfigQ.getBaseUrl(), aIChatConfigQ.getApiKey(), aIChatConfigQ.getModel()).a(new AIChatRequest(eu.z(pb1VarE), aIChatConfigQ.getTemperature(), aIChatConfigQ.getMaxTokens()));
            if (j2 != atomicLong.get()) {
                return;
            }
            AIChatConfig aIChatConfigQ2 = q();
            if (!aIChatConfigQ2.equals(aIChatConfigQ) || !aIChatConfigQ2.allowsTalker(by0Var.a)) {
                hg3.f(h, "AI reply discarded because configuration changed: talker=".concat(by0Var.a));
                return;
            }
            if (!(f1VarA instanceof d1)) {
                if (!(f1VarA instanceof e1)) {
                    c80.s();
                    return;
                }
                final AIChatResponse aIChatResponse = ((e1) f1VarA).a;
                if (j2 != atomicLong.get()) {
                    return;
                }
                gd3.l(by0Var.a, aIChatResponse.getContent()).a(new in0() { // from class: u
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.in0
                    public final Object j(Object obj) {
                        long j3 = j2;
                        AIChatConfig aIChatConfig = aIChatConfigQ;
                        by0 by0Var2 = by0Var;
                        a0 a0Var2 = a0Var;
                        AIChatMessage aIChatMessage2 = aIChatMessage;
                        AIChatResponse aIChatResponse2 = aIChatResponse;
                        ((mo2) obj).getClass();
                        if (j3 == b0.k.get()) {
                            b0.d.getClass();
                            if (b0.q().equals(aIChatConfig)) {
                                String str4 = by0Var2.a;
                                int contextRounds2 = aIChatConfig.getContextRounds();
                                AIChatMessage aIChatMessage3 = new AIChatMessage(g1.k, aIChatResponse2.getContent());
                                synchronized (b0.m) {
                                    try {
                                        if (!t11.l(b0.o, a0Var2)) {
                                            b0.n.clear();
                                            b0.o = a0Var2;
                                        }
                                        if (contextRounds2 <= 0) {
                                            b0.n.remove(str4);
                                        } else {
                                            if (contextRounds2 > 20) {
                                                contextRounds2 = 20;
                                            }
                                            int i2 = contextRounds2 * 2;
                                            HashMap map = b0.n;
                                            Object arrayList = map.get(str4);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                map.put(str4, arrayList);
                                            }
                                            List list3 = (List) arrayList;
                                            list3.add(aIChatMessage2);
                                            list3.add(aIChatMessage3);
                                            if (list3.size() > i2) {
                                                list3.subList(0, list3.size() - i2).clear();
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }
                        b0.d.getClass();
                        String str5 = b0.h;
                        String str6 = by0Var2.a;
                        String model = aIChatResponse2.getModel();
                        if (model == null) {
                            model = aIChatConfig.getModel();
                        }
                        int length = aIChatResponse2.getContent().length();
                        String finishReason = aIChatResponse2.getFinishReason();
                        Integer totalTokens = aIChatResponse2.getTotalTokens();
                        StringBuilder sbO = vi0.o("AI reply sent: talker=", str6, ", model=", model, ", replyLength=");
                        sbO.append(length);
                        sbO.append(", finishReason=");
                        sbO.append(finishReason);
                        sbO.append(", totalTokens=");
                        sbO.append(totalTokens);
                        hg3.f(str5, sbO.toString());
                        return a83.a;
                    }
                }, new v(0, by0Var));
                return;
            }
            String str4 = h;
            String str5 = by0Var.a;
            String model = aIChatConfigQ.getModel();
            d1 d1Var = (d1) f1VarA;
            String lowerCase = d1Var.a.getCode().name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Integer httpCode = d1Var.a.getHttpCode();
            String message = d1Var.a.getMessage();
            StringBuilder sbO = vi0.o("AI completion failed: talker=", str5, ", model=", model, ", type=");
            sbO.append(lowerCase);
            sbO.append(", httpCode=");
            sbO.append(httpCode);
            sbO.append(", reason=");
            sbO.append(message);
            hg3.d(str4, sbO.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void h(vb1 vb1Var) {
        k.incrementAndGet();
        q();
        vb1Var.a(id3.e, new w(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void i() {
        k.incrementAndGet();
        j.d.clear();
        synchronized (m) {
            n.clear();
            o = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final String j(Context context) {
        context.getClass();
        AIChatConfig aIChatConfigQ = q();
        if (!r(aIChatConfigQ)) {
            String string = context.getString(R.string.ai_chat_not_configured);
            string.getClass();
            return string;
        }
        String string2 = context.getString(aIChatConfigQ.getListMode() == c1.j ? R.string.ai_chat_list_whitelist : R.string.ai_chat_list_blacklist);
        string2.getClass();
        String string3 = context.getString(R.string.ai_chat_config_summary, aIChatConfigQ.getModel(), string2, Integer.valueOf(aIChatConfigQ.getTargetIds().size()), Integer.valueOf(aIChatConfigQ.getContextRounds()));
        string3.getClass();
        return string3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final Integer k() {
        return Integer.valueOf(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final boolean l() {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final int m() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final wm0 n() {
        return g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final void p(View view, xm0 xm0Var) {
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
        activity.runOnUiThread(new t7(4, activity, new kw(911635723, true, new x(0, q(), xm0Var))));
    }
}
