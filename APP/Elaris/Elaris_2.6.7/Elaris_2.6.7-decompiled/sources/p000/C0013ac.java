package p000;

import android.content.Context;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: ac */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0013ac extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f44a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f45b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0203ec f46c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Class f47d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Field f48e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ClassLoader f49f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013ac(Method method, Class cls, C0203ec c0203ec, Class cls2, Field field, ClassLoader classLoader) {
        super(48);
        this.f44a = method;
        this.f45b = cls;
        this.f46c = c0203ec;
        this.f47d = cls2;
        this.f48e = field;
        this.f49f = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (AbstractC0219fc.m393f()) {
            Object objM391d = null;
            Object result = methodHookParam == null ? null : methodHookParam.getResult();
            if (result instanceof List) {
                try {
                    Object objInvoke = this.f44a.invoke(methodHookParam.thisObject, null);
                    if (objInvoke == null) {
                        return;
                    }
                    List list = (List) result;
                    if (System.currentTimeMillis() < AbstractC0219fc.f273o) {
                        methodHookParam.setResult(new ArrayList());
                        AbstractC0219fc.m389b(null, methodHookParam.thisObject);
                        AbstractC0219fc.m395h(this.f45b, list.size());
                        return;
                    }
                    AbstractC0219fc.m387a();
                    try {
                        AbstractC0219fc.m396i(this.f45b, list);
                        Context contextHostContext = HookEntry.hostContext();
                        if (contextHostContext == null) {
                            return;
                        }
                        boolean zM393f = AbstractC0219fc.m393f();
                        if (zM393f) {
                            objM391d = AbstractC0219fc.m391d(this.f46c, this.f47d, contextHostContext, objInvoke, list, this.f48e);
                            if (objM391d == null) {
                                return;
                            }
                            Map map = AbstractC0219fc.f261c;
                            synchronized (map) {
                                map.put(objM391d, objInvoke);
                            }
                            Map map2 = AbstractC0219fc.f262d;
                            synchronized (map2) {
                                map2.put(objM391d, methodHookParam.thisObject);
                            }
                            Class cls = this.f45b;
                            String lowerCase = cls == null ? "" : cls.getName().toLowerCase(Locale.US);
                            if (lowerCase.contains("reply") || lowerCase.contains("quote")) {
                                Map map3 = AbstractC0219fc.f263e;
                                synchronized (map3) {
                                    map3.put(objM391d, Boolean.TRUE);
                                }
                            }
                            AbstractC0219fc.m370J(this.f49f, objM391d.getClass());
                        }
                        ArrayList arrayList = new ArrayList(list.size() + 1);
                        if (zM393f) {
                            arrayList.add(objM391d);
                        }
                        int i = 0;
                        for (Object obj : list) {
                            if (AbstractC0219fc.m394g(obj)) {
                                i++;
                            } else {
                                arrayList.add(obj);
                            }
                        }
                        methodHookParam.setResult(arrayList);
                        if (zM393f && !AbstractC0219fc.f268j) {
                            AbstractC0219fc.f268j = true;
                            HookEntry.log("repeater long press menu add success");
                        }
                        if (i > 0) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - AbstractC0219fc.f275q < 3000) {
                                return;
                            }
                            AbstractC0219fc.f275q = jCurrentTimeMillis;
                            HookEntry.log("repeater long press menu stale item replaced count=" + i);
                        }
                    } catch (Throwable th) {
                        HookEntry.log("repeater long press menu add failed reason=".concat(AbstractC0219fc.m406s(th)));
                    }
                } catch (Throwable th2) {
                    HookEntry.log("repeater long press menu skipped reason=message getter ".concat(th2.getClass().getSimpleName()));
                }
            }
        }
    }
}
