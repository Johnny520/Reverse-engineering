package com.p001mr.elaris;

import android.content.Context;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.callbacks.XCallback;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: com.mr.elaris.q */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0163q extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f146a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ClassLoader f147b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f148c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0163q(Method method, ClassLoader classLoader, boolean z) {
        super(XCallback.PRIORITY_HIGHEST);
        this.f146a = method;
        this.f147b = classLoader;
        this.f148c = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Context contextHostContext;
        Method method = this.f146a;
        try {
            Object[] objArr = methodHookParam.args;
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[0];
                contextHostContext = !(obj instanceof Context) ? HookEntry.hostContext() : (Context) obj;
            }
            if (contextHostContext == null) {
                contextHostContext = QQSettingsEntryHooks.topActivity();
            }
            Object result = methodHookParam.getResult();
            StringBuilder sb = new StringBuilder("QQ settings provider callback method=");
            sb.append(method.getName());
            sb.append(" result=");
            sb.append(result == null ? "null" : result.getClass().getName());
            sb.append(" size=");
            sb.append(result instanceof List ? ((List) result).size() : -1);
            HookEntry.logAlways(sb.toString());
            if (contextHostContext == null || !(result instanceof List)) {
                return;
            }
            QQSettingsEntryHooks.insertElarisSettingEntry(this.f147b, contextHostContext, (List) result, this.f148c, method.getName());
        } catch (Throwable th) {
            HookEntry.logAlways("insert QQ settings entry failed: " + th);
        }
    }
}
