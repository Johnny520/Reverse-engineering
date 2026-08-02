package nuke.module.wechat.p002ai;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.AbstractC0179eu;
import p000.AbstractC0731te;
import p000.AbstractC0856wq;
import p000.C0093cj;
import p000.C0114d1;
import p000.EnumC0002a1;
import p000.InterfaceC0187f1;
import p000.ci0;
import p000.dt1;
import p000.et1;
import p000.ir0;
import p000.k82;
import p000.n82;
import p000.o72;
import p000.o82;
import p000.pv2;
import p000.r92;
import p000.s52;
import p000.ug3;
import p000.vf1;
import p000.wg3;
import p000.yw0;

/* JADX INFO: renamed from: nuke.module.wechat.ai.b */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0517b {

    /* JADX INFO: renamed from: e */
    public static final vf1 f7334e;

    /* JADX INFO: renamed from: f */
    public static final ir0 f7335f;

    /* JADX INFO: renamed from: g */
    public static final et1 f7336g;

    /* JADX INFO: renamed from: a */
    public final String f7337a;

    /* JADX INFO: renamed from: b */
    public final String f7338b;

    /* JADX INFO: renamed from: c */
    public final String f7339c;

    /* JADX INFO: renamed from: d */
    public final et1 f7340d;

    static {
        o72 o72Var = vf1.f11926d;
        f7334e = AbstractC0731te.m5175C("application/json; charset=utf-8");
        f7335f = new ir0();
        dt1 dt1Var = new dt1();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        dt1Var.f2224y = wg3.m5889b(15L, timeUnit);
        dt1Var.f2225z = wg3.m5889b(120L, timeUnit);
        dt1Var.f2195A = wg3.m5889b(30L, timeUnit);
        f7336g = new et1(dt1Var);
    }

    public C0517b(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        et1 et1Var = f7336g;
        et1Var.getClass();
        this.f7337a = str;
        this.f7338b = str2;
        this.f7339c = str3;
        this.f7340d = et1Var;
    }

    /* JADX INFO: renamed from: b */
    public static C0114d1 m3436b(String str) {
        return new C0114d1(new AIChatError(EnumC0002a1.f16h, str, null, 4, null));
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0187f1 m3437a(AIChatRequest aIChatRequest) {
        InterfaceC0187f1 c0114d1;
        String str = this.f7337a;
        str.getClass();
        yw0 yw0VarM3435e = C0516a.m3435e(str, "chat/completions");
        if (yw0VarM3435e == null) {
            return m3436b("API Base URL must be a valid HTTPS URL");
        }
        String str2 = this.f7338b;
        if (pv2.m4006s0(str2)) {
            return m3436b("API key is empty");
        }
        String str3 = this.f7339c;
        if (pv2.m4006s0(str3)) {
            return m3436b("Model is empty");
        }
        if (aIChatRequest.getMessages().isEmpty()) {
            return m3436b("Messages are empty");
        }
        String string = pv2.m3993I0(str3).toString();
        List<AIChatMessage> messages = aIChatRequest.getMessages();
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(messages, 10));
        for (AIChatMessage aIChatMessage : messages) {
            arrayList.add(new OpenAIChatModel$OpenAIMessage(aIChatMessage.getRole().f3229h, aIChatMessage.getContent()));
        }
        OpenAIChatModel$OpenAIRequest openAIChatModel$OpenAIRequest = new OpenAIChatModel$OpenAIRequest(string, arrayList, ci0.m778C(aIChatRequest.getTemperature(), 0.0f, 2.0f), ci0.m779D(aIChatRequest.getMaxTokens(), 1, AIChatConfig.MaxOutputTokens));
        C0093cj c0093cj = new C0093cj(4);
        c0093cj.f1579a = yw0VarM3435e;
        c0093cj.m837l("Authorization", "Bearer " + pv2.m3993I0(str2).toString());
        vf1 vf1VarM5175C = f7334e;
        c0093cj.m837l("Accept", vf1VarM5175C.f11928a);
        int i = o82.f7582a;
        String strM2388e = f7335f.m2388e(openAIChatModel$OpenAIRequest);
        strM2388e.getClass();
        Charset charset = AbstractC0856wq.f12612a;
        Charset charsetM5671a = vf1.m5671a(vf1VarM5175C);
        if (charsetM5671a == null) {
            try {
                vf1VarM5175C = AbstractC0731te.m5175C(vf1VarM5175C + "; charset=utf-8");
            } catch (IllegalArgumentException unused) {
                vf1VarM5175C = null;
            }
        } else {
            charset = charsetM5671a;
        }
        byte[] bytes = strM2388e.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        ug3.m5493a(bytes.length, 0L, length);
        c0093cj.m839n("POST", new n82(vf1VarM5175C, length, bytes));
        try {
            r92 r92VarM4732h = new s52(this.f7340d, new k82(c0093cj)).m4732h();
            try {
                String strM3431a = C0516a.m3431a(r92VarM4732h.f9462n.m5476b());
                if (r92VarM4732h.f9471w) {
                    c0114d1 = C0516a.m3434d(strM3431a);
                } else {
                    EnumC0002a1 enumC0002a1 = EnumC0002a1.f18j;
                    String strM3432b = C0516a.m3432b(strM3431a);
                    if (strM3432b == null) {
                        strM3432b = "OpenAI-compatible service returned HTTP " + r92VarM4732h.f9459k;
                    }
                    c0114d1 = new C0114d1(new AIChatError(enumC0002a1, strM3432b, Integer.valueOf(r92VarM4732h.f9459k)));
                }
                r92VarM4732h.close();
            } finally {
            }
        } catch (IOException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "OpenAI-compatible service is unavailable";
            }
            c0114d1 = new C0114d1(new AIChatError(EnumC0002a1.f17i, message, null, 4, null));
        } catch (Throwable th) {
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = "OpenAI-compatible request failed";
            }
            c0114d1 = new C0114d1(new AIChatError(EnumC0002a1.f19k, message2, null, 4, null));
        }
        return c0114d1;
    }
}
