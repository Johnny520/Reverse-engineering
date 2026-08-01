package p000;

import android.view.View;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: q9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0422q9 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f750a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f751b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0422q9(int i, Method method) {
        super(70);
        this.f750a = i;
        this.f751b = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = methodHookParam.args;
        if (objArr == null || objArr.length != 1) {
            return;
        }
        Object obj = objArr[0];
        if ((obj instanceof View) && ((View) obj).getId() == this.f750a) {
            this.f751b.invoke(methodHookParam.thisObject, Boolean.FALSE);
            methodHookParam.setResult(null);
        }
    }
}
