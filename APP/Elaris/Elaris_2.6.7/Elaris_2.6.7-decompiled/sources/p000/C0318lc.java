package p000;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XC_MethodReplacement;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: lc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0318lc extends XC_MethodReplacement {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f540a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0318lc(boolean z) {
        super(70);
        this.f540a = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r6.contains("InputReplyMsgIntent$SetReplyData") == false) goto L22;
     */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodReplacement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        Object objM1093l;
        Object objM1097p;
        Object[] objArr;
        ArrayList arrayList = null;
        if (this.f540a) {
            Object obj = (methodHookParam == null || (objArr = methodHookParam.args) == null || objArr.length == 0) ? null : objArr[0];
            if (obj != null) {
                try {
                    String name = obj.getClass().getName();
                    if (!name.contains("AIOMsgSendEvent$MsgOnClickReplyEvent")) {
                        if (!name.contains("AIOMsgSendEvent$MsgOnReplyEvent")) {
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            return XposedBridge.invokeOriginalMethod(methodHookParam.method, methodHookParam.thisObject, methodHookParam.args);
        }
        Object[] objArr2 = methodHookParam.args;
        Object obj2 = (objArr2 == null || objArr2.length <= 0) ? null : objArr2[0];
        try {
            AbstractC0366oc.f655d = System.currentTimeMillis() + 1800;
            if (obj2 != null) {
                objM1093l = AbstractC0497v4.m1093l(obj2, "com.tencent.mobileqq.aio.msg.AIOMsgItem", 3);
                objM1097p = AbstractC0497v4.m1097p(objM1093l);
            } else {
                objM1093l = null;
                objM1097p = null;
            }
            ArrayList arrayList2 = new ArrayList();
            Set setM624i1 = AbstractC0260i5.m624i1();
            AbstractC0366oc.m775f(objM1097p, arrayList2, 2, setM624i1);
            AbstractC0366oc.m775f(objM1093l, arrayList2, 2, setM624i1);
            AbstractC0366oc.m775f(obj2, arrayList2, 2, setM624i1);
            try {
                Object objInvokeOriginalMethod = XposedBridge.invokeOriginalMethod(methodHookParam.method, methodHookParam.thisObject, methodHookParam.args);
                AbstractC0366oc.m774e(methodHookParam.thisObject, obj2);
                AbstractC0366oc.m772c(arrayList2);
                return objInvokeOriginalMethod;
            } catch (Throwable th) {
                th = th;
                arrayList = arrayList2;
                AbstractC0366oc.m772c(arrayList);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
