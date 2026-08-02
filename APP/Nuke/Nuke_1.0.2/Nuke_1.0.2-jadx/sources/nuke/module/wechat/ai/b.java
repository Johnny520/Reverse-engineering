package nuke.module.wechat.ai;

import defpackage.a1;
import defpackage.ci0;
import defpackage.cj;
import defpackage.d1;
import defpackage.dt1;
import defpackage.et1;
import defpackage.eu;
import defpackage.f1;
import defpackage.ir0;
import defpackage.k82;
import defpackage.n82;
import defpackage.o72;
import defpackage.o82;
import defpackage.pv2;
import defpackage.r92;
import defpackage.s52;
import defpackage.te;
import defpackage.ug3;
import defpackage.vf1;
import defpackage.wg3;
import defpackage.wq;
import defpackage.yw0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final vf1 e;
    public static final ir0 f;
    public static final et1 g;
    public final String a;
    public final String b;
    public final String c;
    public final et1 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        o72 o72Var = vf1.d;
        e = te.C("application/json; charset=utf-8");
        f = new ir0();
        dt1 dt1Var = new dt1();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        dt1Var.y = wg3.b(15L, timeUnit);
        dt1Var.z = wg3.b(120L, timeUnit);
        dt1Var.A = wg3.b(30L, timeUnit);
        g = new et1(dt1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        et1 et1Var = g;
        et1Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = et1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d1 b(String str) {
        return new d1(new AIChatError(a1.h, str, null, 4, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final f1 a(AIChatRequest aIChatRequest) {
        f1 d1Var;
        String str = this.a;
        str.getClass();
        yw0 yw0VarE = a.e(str, "chat/completions");
        if (yw0VarE == null) {
            return b("API Base URL must be a valid HTTPS URL");
        }
        String str2 = this.b;
        if (pv2.s0(str2)) {
            return b("API key is empty");
        }
        String str3 = this.c;
        if (pv2.s0(str3)) {
            return b("Model is empty");
        }
        if (aIChatRequest.getMessages().isEmpty()) {
            return b("Messages are empty");
        }
        String string = pv2.I0(str3).toString();
        List<AIChatMessage> messages = aIChatRequest.getMessages();
        ArrayList arrayList = new ArrayList(eu.B(messages, 10));
        for (AIChatMessage aIChatMessage : messages) {
            arrayList.add(new OpenAIChatModel$OpenAIMessage(aIChatMessage.getRole().h, aIChatMessage.getContent()));
        }
        OpenAIChatModel$OpenAIRequest openAIChatModel$OpenAIRequest = new OpenAIChatModel$OpenAIRequest(string, arrayList, ci0.C(aIChatRequest.getTemperature(), 0.0f, 2.0f), ci0.D(aIChatRequest.getMaxTokens(), 1, AIChatConfig.MaxOutputTokens));
        cj cjVar = new cj(4);
        cjVar.a = yw0VarE;
        cjVar.l("Authorization", "Bearer " + pv2.I0(str2).toString());
        vf1 vf1VarC = e;
        cjVar.l("Accept", vf1VarC.a);
        int i = o82.a;
        String strE = f.e(openAIChatModel$OpenAIRequest);
        strE.getClass();
        Charset charset = wq.a;
        Charset charsetA = vf1.a(vf1VarC);
        if (charsetA == null) {
            try {
                vf1VarC = te.C(vf1VarC + "; charset=utf-8");
            } catch (IllegalArgumentException unused) {
                vf1VarC = null;
            }
        } else {
            charset = charsetA;
        }
        byte[] bytes = strE.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        ug3.a(bytes.length, 0L, length);
        cjVar.n("POST", new n82(vf1VarC, length, bytes));
        try {
            r92 r92VarH = new s52(this.d, new k82(cjVar)).h();
            try {
                String strA = a.a(r92VarH.n.b());
                if (r92VarH.w) {
                    d1Var = a.d(strA);
                } else {
                    a1 a1Var = a1.j;
                    String strB = a.b(strA);
                    if (strB == null) {
                        strB = "OpenAI-compatible service returned HTTP " + r92VarH.k;
                    }
                    d1Var = new d1(new AIChatError(a1Var, strB, Integer.valueOf(r92VarH.k)));
                }
                r92VarH.close();
            } finally {
            }
        } catch (IOException e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "OpenAI-compatible service is unavailable";
            }
            d1Var = new d1(new AIChatError(a1.i, message, null, 4, null));
        } catch (Throwable th) {
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = "OpenAI-compatible request failed";
            }
            d1Var = new d1(new AIChatError(a1.k, message2, null, 4, null));
        }
        return d1Var;
    }
}
