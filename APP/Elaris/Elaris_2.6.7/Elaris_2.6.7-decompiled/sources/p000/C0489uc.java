package p000;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: uc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0489uc extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC0505vc.m1110b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr = methodHookParam.args;
        Object obj = (objArr == null || objArr.length <= 1) ? null : objArr[1];
        Object obj2 = AbstractC0505vc.f972b;
        ThreadLocal threadLocal = AbstractC0505vc.f974d;
        ArrayDeque arrayDeque = (ArrayDeque) threadLocal.get();
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            threadLocal.set(arrayDeque);
        }
        Object objPeek = arrayDeque.isEmpty() ? obj2 : arrayDeque.peek();
        boolean zEndsWith = false;
        if (obj != null) {
            try {
                zEndsWith = obj.getClass().getName().endsWith(".FileMsgItem");
            } catch (Throwable unused) {
            }
        }
        if (!zEndsWith) {
            obj2 = objPeek;
        }
        arrayDeque.push(obj2);
    }
}
