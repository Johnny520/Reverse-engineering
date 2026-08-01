package p037;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import java.util.Map;
import p026.AbstractC6293;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6363 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C6367 f17495;

    public C6363(C6367 c6367) {
        this.f17495 = c6367;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        HashMap map = C6367.f17501;
        C6367 c6367 = this.f17495;
        c6367.getClass();
        try {
            Object obj = methodHookParam.thisObject;
            C6316 c6316M11826 = C6316.m11826(obj.getClass());
            c6316M11826.f17409.f3617 = "getHostView";
            View view = (View) c6316M11826.m11828(obj, new Object[0]);
            Class clsM11838 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msg.AIOMsgItem");
            HashMap map2 = AbstractC6317.f17410;
            Object obj2 = AbstractC6317.m11833(obj.getClass(), clsM11838).get(obj);
            if (obj2 != null && view != null) {
                C6316 c6316M118262 = C6316.m11826(obj2.getClass());
                c6316M118262.f17409.f3617 = "getMsgRecord";
                c6316M118262.m11828(obj2, new Object[0]);
                for (Map.Entry entry : C6367.f17501.entrySet()) {
                    AbstractC6293 abstractC6293 = (AbstractC6293) entry.getKey();
                    if (abstractC6293.f17376.booleanValue()) {
                        try {
                            if (entry.getValue() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        } catch (Throwable th) {
                            abstractC6293.getExceptionCollectionToolInstance().m11804(th);
                        }
                    }
                }
            }
        } catch (Exception e) {
            c6367.getExceptionCollectionToolInstance().m11804(e);
        }
    }
}
