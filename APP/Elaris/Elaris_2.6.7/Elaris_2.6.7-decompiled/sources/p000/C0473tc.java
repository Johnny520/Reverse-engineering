package p000;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: tc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0473tc extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f929b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f930c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0473tc(int i, Method method, int i2) {
        super(120);
        this.f928a = i;
        this.f929b = method;
        this.f930c = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC0505vc.m1110b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Object[] objArr = methodHookParam.args;
        if (objArr != null) {
            int length = objArr.length;
            int i = this.f928a;
            obj = length > i ? objArr[i] : null;
        }
        AbstractC0505vc.m1111c(obj, this.f929b, false);
        int i2 = this.f930c;
        if (i2 >= 0) {
            ArrayDeque arrayDeque = (ArrayDeque) AbstractC0505vc.f974d.get();
            Object objPeek = (arrayDeque == null || arrayDeque.isEmpty()) ? null : arrayDeque.peek();
            if ((objPeek != AbstractC0505vc.f972b ? objPeek : null) == obj) {
                Object[] objArr2 = methodHookParam.args;
                if (objArr2.length > i2) {
                    objArr2[i2] = Boolean.FALSE;
                }
            }
        }
    }
}
