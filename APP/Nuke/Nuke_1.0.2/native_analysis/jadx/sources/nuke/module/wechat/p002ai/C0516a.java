package nuke.module.wechat.p002ai;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p000.AbstractC0142du;
import p000.AbstractC0856wq;
import p000.C0114d1;
import p000.C0150e1;
import p000.C0261h1;
import p000.C0298i1;
import p000.C0676s;
import p000.EnumC0002a1;
import p000.InterfaceC0187f1;
import p000.InterfaceC0333j1;
import p000.e41;
import p000.k31;
import p000.pp0;
import p000.pv2;
import p000.sl0;
import p000.t11;
import p000.vf1;
import p000.wv2;
import p000.x92;
import p000.xw0;
import p000.y92;
import p000.yw0;

/* JADX INFO: renamed from: nuke.module.wechat.ai.a */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0516a {
    /* JADX INFO: renamed from: a */
    public static final String m3431a(InputStream inputStream) throws IOException {
        vf1 vf1Var = C0517b.f7334e;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            int i = 0;
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    String string = byteArrayOutputStream.toString(AbstractC0856wq.f12612a.name());
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
                pp0.m3916n(inputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m3432b(String str) {
        Object x92Var;
        e41 e41Var;
        k31 k31Var;
        String strMo25a;
        try {
            e41 e41Var2 = (e41) C0517b.f7335f.m2385b(str, e41.class);
            if (e41Var2 == null || (e41Var = (e41) e41Var2.f2304h.get("error")) == null || (k31Var = (k31) e41Var.f2304h.get("message")) == null || (strMo25a = k31Var.mo25a()) == null) {
                x92Var = null;
            } else {
                boolean zM4006s0 = pv2.m4006s0(strMo25a);
                x92Var = strMo25a;
                if (zM4006s0) {
                }
            }
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        return (String) (x92Var instanceof x92 ? null : x92Var);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0333j1 m3433c(String str) {
        Object x92Var;
        String string;
        String string2;
        try {
            x92Var = (OpenAIChatModel$OpenAIModelsResponse) C0517b.f7335f.m2385b(str, OpenAIChatModel$OpenAIModelsResponse.class);
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thM6237a = y92.m6237a(x92Var);
        EnumC0002a1 enumC0002a1 = EnumC0002a1.f19k;
        if (thM6237a != null) {
            String message = thM6237a.getMessage();
            if (message == null) {
                message = "Model list is not valid JSON";
            }
            return new C0261h1(new AIChatError(enumC0002a1, message, null, 4, null));
        }
        OpenAIChatModel$OpenAIModelsResponse openAIChatModel$OpenAIModelsResponse = (OpenAIChatModel$OpenAIModelsResponse) x92Var;
        if (openAIChatModel$OpenAIModelsResponse == null) {
            return new C0261h1(new AIChatError(enumC0002a1, "Model list response is empty", null, 4, null));
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
            if (id != null && (string = pv2.m3993I0(id).toString()) != null) {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    String ownedBy = openAIChatModel$OpenAIModelInfo.getOwnedBy();
                    if (ownedBy != null && (string2 = pv2.m3993I0(ownedBy).toString()) != null && string2.length() > 0) {
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
        return new C0298i1(AbstractC0142du.m1143A0(arrayList2, new sl0(16)));
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC0187f1 m3434d(String str) {
        Object x92Var;
        String content;
        try {
            x92Var = (OpenAIChatModel$OpenAIResponse) C0517b.f7335f.m2385b(str, OpenAIChatModel$OpenAIResponse.class);
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thM6237a = y92.m6237a(x92Var);
        EnumC0002a1 enumC0002a1 = EnumC0002a1.f19k;
        if (thM6237a != null) {
            String message = thM6237a.getMessage();
            if (message == null) {
                message = "Response is not valid JSON";
            }
            return new C0114d1(new AIChatError(enumC0002a1, message, null, 4, null));
        }
        OpenAIChatModel$OpenAIResponse openAIChatModel$OpenAIResponse = (OpenAIChatModel$OpenAIResponse) x92Var;
        if (openAIChatModel$OpenAIResponse == null) {
            return new C0114d1(new AIChatError(enumC0002a1, "Response body is empty", null, 4, null));
        }
        OpenAIChatModel$OpenAIChoice openAIChatModel$OpenAIChoice = (OpenAIChatModel$OpenAIChoice) AbstractC0142du.m1161q0(openAIChatModel$OpenAIResponse.getChoices());
        if (openAIChatModel$OpenAIChoice == null) {
            return new C0114d1(new AIChatError(enumC0002a1, "Response does not contain a completion choice", null, 4, null));
        }
        OpenAIChatModel$OpenAIResponseMessage message2 = openAIChatModel$OpenAIChoice.getMessage();
        String string = (message2 == null || (content = message2.getContent()) == null) ? null : pv2.m3993I0(content).toString();
        if (string == null) {
            string = "";
        }
        String str2 = string;
        if (pv2.m4006s0(str2)) {
            return new C0114d1(new AIChatError(EnumC0002a1.f20l, "Model returned an empty response", null, 4, null));
        }
        String model = openAIChatModel$OpenAIResponse.getModel();
        String finishReason = openAIChatModel$OpenAIChoice.getFinishReason();
        OpenAIChatModel$OpenAIUsage usage = openAIChatModel$OpenAIResponse.getUsage();
        Integer promptTokens = usage != null ? usage.getPromptTokens() : null;
        OpenAIChatModel$OpenAIUsage usage2 = openAIChatModel$OpenAIResponse.getUsage();
        Integer completionTokens = usage2 != null ? usage2.getCompletionTokens() : null;
        OpenAIChatModel$OpenAIUsage usage3 = openAIChatModel$OpenAIResponse.getUsage();
        return new C0150e1(new AIChatResponse(str2, model, finishReason, promptTokens, completionTokens, usage3 != null ? usage3.getTotalTokens() : null));
    }

    /* JADX INFO: renamed from: e */
    public static yw0 m3435e(String str, String str2) {
        yw0 yw0VarM6193b;
        String strM3994J0 = pv2.m3994J0(pv2.m3993I0(str).toString(), '/');
        strM3994J0.getClass();
        try {
            xw0 xw0Var = new xw0();
            xw0Var.m6196e(null, strM3994J0);
            yw0VarM6193b = xw0Var.m6193b();
        } catch (IllegalArgumentException unused) {
            yw0VarM6193b = null;
        }
        if (yw0VarM6193b != null && t11.m5086l(yw0VarM6193b.f13641a, "https") && !pv2.m4006s0(yw0VarM6193b.f13644d)) {
            String strM3994J02 = pv2.m3994J0(yw0VarM6193b.m6356b(), '/');
            if (wv2.m6005W(strM3994J02, "/chat/completions", true)) {
                strM3994J02 = pv2.m3998k0(strM3994J02, 17);
            } else if (wv2.m6005W(strM3994J02, "/models", true)) {
                strM3994J02 = pv2.m3998k0(strM3994J02, 7);
            }
            StringBuilder sb = new StringBuilder();
            if (pv2.m4006s0(strM3994J02)) {
                strM3994J02 = "";
            }
            sb.append(strM3994J02);
            sb.append('/');
            sb.append(str2);
            String string = sb.toString();
            xw0 xw0VarM6360f = yw0VarM6193b.m6360f();
            if (wv2.m6012d0(string, "/", false)) {
                xw0VarM6360f.m6197f(string, 0, string.length());
                xw0VarM6360f.f13206g = null;
                xw0VarM6360f.f13207h = null;
                return xw0VarM6360f.m6193b();
            }
            C0676s.m4645c("unexpected encodedPath: ".concat(string));
        }
        return null;
    }
}
