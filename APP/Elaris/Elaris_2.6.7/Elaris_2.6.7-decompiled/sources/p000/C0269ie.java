package p000;

import android.content.Context;
import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ie */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0269ie extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f427a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0203ec f428b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Field f429c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ClassLoader f430d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0269ie(Method method, C0203ec c0203ec, Field field, ClassLoader classLoader) {
        super(48);
        this.f427a = method;
        this.f428b = c0203ec;
        this.f429c = field;
        this.f430d = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_VOICE_MESSAGE_ACTIONS)) {
            Object result = methodHookParam == null ? null : methodHookParam.getResult();
            if (result instanceof List) {
                try {
                    Object objInvoke = this.f427a.invoke(methodHookParam.thisObject, null);
                    if (AbstractC0169w.m234B0(objInvoke) == null) {
                        return;
                    }
                    try {
                        List list = (List) result;
                        Context contextHostContext = HookEntry.hostContext();
                        if (contextHostContext == null) {
                            return;
                        }
                        Object objM283a = AbstractC0169w.m283a(this.f428b, contextHostContext, objInvoke, list, this.f429c, "保存语音");
                        Object objM283a2 = AbstractC0169w.m283a(this.f428b, contextHostContext, objInvoke, list, this.f429c, "转发语音");
                        if (objM283a != null && objM283a2 != null) {
                            Map map = AbstractC0169w.f162b;
                            map.put(objM283a, new C0502v9(1, objInvoke));
                            map.put(objM283a2, new C0502v9(2, objInvoke));
                            AbstractC0169w.m257N(this.f430d, objM283a.getClass());
                            AbstractC0169w.m257N(this.f430d, objM283a2.getClass());
                            ArrayList arrayList = new ArrayList(list.size() + 2);
                            arrayList.add(objM283a);
                            arrayList.add(objM283a2);
                            for (int i = 0; i < list.size(); i++) {
                                Object obj = list.get(i);
                                if (!(AbstractC0169w.m315p0(obj) != null)) {
                                    String strM331x0 = AbstractC0169w.m331x0(0, obj);
                                    if (!(strM331x0.contains("保存语音") || strM331x0.contains("转发语音"))) {
                                        arrayList.add(obj);
                                    }
                                }
                            }
                            methodHookParam.setResult(arrayList);
                            if (AbstractC0169w.f172l) {
                                return;
                            }
                            AbstractC0169w.f172l = true;
                            HookEntry.log("voice menu add success");
                        }
                    } catch (Throwable th) {
                        HookEntry.log("voice menu add failed reason=" + th.getClass().getSimpleName() + ": " + AbstractC0169w.m242F0(th.getMessage()));
                    }
                } catch (Throwable th2) {
                    HookEntry.log("voice menu skipped reason=message getter ".concat(th2.getClass().getSimpleName()));
                }
            }
        }
    }
}
