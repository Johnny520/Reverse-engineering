package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: t */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0460t extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassLoader f870a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0460t(ClassLoader classLoader) {
        super(90);
        this.f870a = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        ArrayList<C0001a0> arrayListM77c;
        if (HookEntry.runtimeBool(Prefs.KEY_MESSAGE_RECALL_GUARD)) {
            try {
                Object[] objArr = methodHookParam.args;
                String str = (String) objArr[0];
                Object obj = objArr[1];
                byte[] bArr = obj instanceof byte[] ? (byte[]) obj : new byte[0];
                boolean zEquals = "trpc.msg.olpush.OlPushService.MsgPush".equals(str);
                ClassLoader classLoader = this.f870a;
                if (zEquals) {
                    arrayListM77c = AbstractC0033c0.m78d(classLoader, bArr);
                } else if (!"trpc.msg.register_proxy.RegisterProxy.InfoSyncPush".equals(str)) {
                    return;
                } else {
                    arrayListM77c = AbstractC0033c0.m77c(classLoader, bArr);
                }
                if (arrayListM77c.isEmpty()) {
                    return;
                }
                HashSet hashSet = new HashSet(Math.max(4, arrayListM77c.size() * 2));
                int i = 0;
                for (C0001a0 c0001a0 : arrayListM77c) {
                    int i2 = c0001a0.f0a;
                    if (i2 == 1 || i2 == 2) {
                        if (!AbstractC0033c0.m84j(c0001a0.f1b) && c0001a0.f4e > 0) {
                            String str2 = c0001a0.f2c;
                            if (!(!AbstractC0033c0.m84j(str2) && str2.equals(AbstractC0033c0.m81g(classLoader))) && hashSet.add(c0001a0.m4a())) {
                                AbstractC0033c0.m76b(c0001a0);
                                i++;
                            }
                        }
                    }
                }
                if (i > 0) {
                    if (!"trpc.msg.register_proxy.RegisterProxy.InfoSyncPush".equals(str)) {
                        methodHookParam.setResult(null);
                        return;
                    }
                    byte[] bArrM79e = AbstractC0033c0.m79e(bArr);
                    if (bArrM79e.length < bArr.length) {
                        methodHookParam.args[1] = bArrM79e;
                    } else {
                        methodHookParam.setResult(null);
                    }
                }
            } catch (Throwable th) {
                AbstractC0033c0.m85k("anti-recall push failed: " + th);
            }
        }
    }
}
