package com.p001mr.elaris;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Locale;
import p000.C0550y9;

/* JADX INFO: renamed from: com.mr.elaris.g */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0153g implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0550y9 f128a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0153g(C0550y9 c0550y9) {
        this.f128a = c0550y9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String str;
        if (method != null && !MessageRepeater.isObjectMethod(method)) {
            C0550y9 c0550y9 = this.f128a;
            if (c0550y9 == null) {
                MessageRepeater.logSendCallback(method, objArr);
            } else if (!c0550y9.f1103c) {
                c0550y9.f1103c = true;
                String name = method.getName();
                String lowerCase = name.toLowerCase(Locale.ROOT);
                Integer numFirstIntArg = MessageRepeater.firstIntArg(objArr);
                if ((numFirstIntArg != null && numFirstIntArg.intValue() != 0) || lowerCase.contains("fail") || lowerCase.contains("error") || lowerCase.contains("reject") || lowerCase.contains("cancel")) {
                    c0550y9.f1104d = false;
                    StringBuilder sb = new StringBuilder("callback ");
                    sb.append(name);
                    if (numFirstIntArg == null) {
                        str = "";
                    } else {
                        str = " code=" + numFirstIntArg;
                    }
                    sb.append(str);
                    sb.append(" args=");
                    sb.append(MessageRepeater.describeArgs(objArr));
                    c0550y9.f1105e = sb.toString();
                    HookEntry.logAlways(c0550y9.f1101a + " send failed reason=" + c0550y9.f1105e);
                } else {
                    c0550y9.f1104d = true;
                    c0550y9.f1105e = "callback ".concat(name);
                    HookEntry.logAlways(c0550y9.f1101a + " send success");
                }
                c0550y9.f1102b.countDown();
            }
        }
        return MessageRepeater.defaultArg(method == null ? null : method.getReturnType());
    }
}
