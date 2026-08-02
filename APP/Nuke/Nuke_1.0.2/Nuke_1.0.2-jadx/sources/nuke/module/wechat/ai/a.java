package nuke.module.wechat.ai;

import defpackage.a1;
import defpackage.d1;
import defpackage.du;
import defpackage.e1;
import defpackage.e41;
import defpackage.f1;
import defpackage.h1;
import defpackage.i1;
import defpackage.j1;
import defpackage.k31;
import defpackage.pp0;
import defpackage.pv2;
import defpackage.s;
import defpackage.sl0;
import defpackage.t11;
import defpackage.vf1;
import defpackage.wq;
import defpackage.wv2;
import defpackage.x92;
import defpackage.xw0;
import defpackage.y92;
import defpackage.yw0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final String a(InputStream inputStream) throws IOException {
        vf1 vf1Var = b.e;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            int i = 0;
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    String string = byteArrayOutputStream.toString(wq.a.name());
                    inputStream.close();
                    string.getClass();
                    return string;
                }
                i += i2;
                if (i > 1048576) {
                    throw new IOException("OpenAI-compatible response is too large");
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                pp0.n(inputStream, th);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(String str) {
        Object x92Var;
        e41 e41Var;
        k31 k31Var;
        String strA;
        try {
            e41 e41Var2 = (e41) b.f.b(str, e41.class);
            if (e41Var2 == null || (e41Var = (e41) e41Var2.h.get("error")) == null || (k31Var = (k31) e41Var.h.get("message")) == null || (strA = k31Var.a()) == null) {
                x92Var = null;
            } else {
                boolean zS0 = pv2.s0(strA);
                x92Var = strA;
                if (zS0) {
                }
            }
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        return (String) (x92Var instanceof x92 ? null : x92Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static j1 c(String str) {
        Object x92Var;
        String string;
        String string2;
        try {
            x92Var = (OpenAIChatModel$OpenAIModelsResponse) b.f.b(str, OpenAIChatModel$OpenAIModelsResponse.class);
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thA = y92.a(x92Var);
        a1 a1Var = a1.k;
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = "Model list is not valid JSON";
            }
            return new h1(new AIChatError(a1Var, message, null, 4, null));
        }
        OpenAIChatModel$OpenAIModelsResponse openAIChatModel$OpenAIModelsResponse = (OpenAIChatModel$OpenAIModelsResponse) x92Var;
        if (openAIChatModel$OpenAIModelsResponse == null) {
            return new h1(new AIChatError(a1Var, "Model list response is empty", null, 4, null));
        }
        List<OpenAIChatModel$OpenAIModelInfo> data = openAIChatModel$OpenAIModelsResponse.getData();
        ArrayList arrayList = new ArrayList();
        for (OpenAIChatModel$OpenAIModelInfo openAIChatModel$OpenAIModelInfo : data) {
            String id = openAIChatModel$OpenAIModelInfo.getId();
            AIModelInfo aIModelInfo = null;
            str = null;
            str = null;
            String str2 = null;
            aIModelInfo = null;
            aIModelInfo = null;
            if (id != null && (string = pv2.I0(id).toString()) != null) {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    String ownedBy = openAIChatModel$OpenAIModelInfo.getOwnedBy();
                    if (ownedBy != null && (string2 = pv2.I0(ownedBy).toString()) != null && string2.length() > 0) {
                        str2 = string2;
                    }
                    aIModelInfo = new AIModelInfo(string, str2);
                }
            }
            if (aIModelInfo != null) {
                arrayList.add(aIModelInfo);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((AIModelInfo) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        return new i1(du.A0(arrayList2, new sl0(16)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static f1 d(String str) {
        Object x92Var;
        String content;
        try {
            x92Var = (OpenAIChatModel$OpenAIResponse) b.f.b(str, OpenAIChatModel$OpenAIResponse.class);
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thA = y92.a(x92Var);
        a1 a1Var = a1.k;
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = "Response is not valid JSON";
            }
            return new d1(new AIChatError(a1Var, message, null, 4, null));
        }
        OpenAIChatModel$OpenAIResponse openAIChatModel$OpenAIResponse = (OpenAIChatModel$OpenAIResponse) x92Var;
        if (openAIChatModel$OpenAIResponse == null) {
            return new d1(new AIChatError(a1Var, "Response body is empty", null, 4, null));
        }
        OpenAIChatModel$OpenAIChoice openAIChatModel$OpenAIChoice = (OpenAIChatModel$OpenAIChoice) du.q0(openAIChatModel$OpenAIResponse.getChoices());
        if (openAIChatModel$OpenAIChoice == null) {
            return new d1(new AIChatError(a1Var, "Response does not contain a completion choice", null, 4, null));
        }
        OpenAIChatModel$OpenAIResponseMessage message2 = openAIChatModel$OpenAIChoice.getMessage();
        String string = (message2 == null || (content = message2.getContent()) == null) ? null : pv2.I0(content).toString();
        if (string == null) {
            string = "";
        }
        String str2 = string;
        if (pv2.s0(str2)) {
            return new d1(new AIChatError(a1.l, "Model returned an empty response", null, 4, null));
        }
        String model = openAIChatModel$OpenAIResponse.getModel();
        String finishReason = openAIChatModel$OpenAIChoice.getFinishReason();
        OpenAIChatModel$OpenAIUsage usage = openAIChatModel$OpenAIResponse.getUsage();
        Integer promptTokens = usage != null ? usage.getPromptTokens() : null;
        OpenAIChatModel$OpenAIUsage usage2 = openAIChatModel$OpenAIResponse.getUsage();
        Integer completionTokens = usage2 != null ? usage2.getCompletionTokens() : null;
        OpenAIChatModel$OpenAIUsage usage3 = openAIChatModel$OpenAIResponse.getUsage();
        return new e1(new AIChatResponse(str2, model, finishReason, promptTokens, completionTokens, usage3 != null ? usage3.getTotalTokens() : null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static yw0 e(String str, String str2) {
        yw0 yw0VarB;
        String strJ0 = pv2.J0(pv2.I0(str).toString(), '/');
        strJ0.getClass();
        try {
            xw0 xw0Var = new xw0();
            xw0Var.e(null, strJ0);
            yw0VarB = xw0Var.b();
        } catch (IllegalArgumentException unused) {
            yw0VarB = null;
        }
        if (yw0VarB != null && t11.l(yw0VarB.a, "https") && !pv2.s0(yw0VarB.d)) {
            String strJ02 = pv2.J0(yw0VarB.b(), '/');
            if (wv2.W(strJ02, "/chat/completions", true)) {
                strJ02 = pv2.k0(strJ02, 17);
            } else if (wv2.W(strJ02, "/models", true)) {
                strJ02 = pv2.k0(strJ02, 7);
            }
            StringBuilder sb = new StringBuilder();
            if (pv2.s0(strJ02)) {
                strJ02 = "";
            }
            sb.append(strJ02);
            sb.append('/');
            sb.append(str2);
            String string = sb.toString();
            xw0 xw0VarF = yw0VarB.f();
            if (wv2.d0(string, "/", false)) {
                xw0VarF.f(string, 0, string.length());
                xw0VarF.g = null;
                xw0VarF.h = null;
                return xw0VarF.b();
            }
            s.c("unexpected encodedPath: ".concat(string));
        }
        return null;
    }
}
