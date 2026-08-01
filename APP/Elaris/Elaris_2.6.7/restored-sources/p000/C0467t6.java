package p000;

import android.view.View;
import com.p001mr.elaris.C0149c;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: t6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0467t6 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0149c f896a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0467t6(C0149c c0149c) {
        super(80);
        this.f896a = c0149c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        if (methodHookParam != null) {
            this.f896a.getClass();
            if (AbstractC0451s6.f854i && (objArr = methodHookParam.args) != null && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof View) {
                    View view = (View) obj;
                    Object obj2 = methodHookParam.thisObject;
                    Member member = methodHookParam.method;
                    if (obj2 != null && (member instanceof Method)) {
                        Map map = AbstractC0499v6.f957b;
                        synchronized (map) {
                            map.put(view, new C0483u6(obj2, (Method) member));
                        }
                    }
                    try {
                        this.f896a.getClass();
                        if (C0149c.m199a(view)) {
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                    } catch (Throwable th) {
                        AbstractC0198e7.m343a("group-avatar", "long-click-callback", th);
                    }
                }
            }
        }
    }
}
