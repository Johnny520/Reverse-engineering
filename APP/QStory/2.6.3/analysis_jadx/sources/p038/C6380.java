package p038;

import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import java.util.Map;
import p026.AbstractC6311;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6380 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C6384 f17541;

    public C6380(C6384 c6384) {
        this.f17541 = c6384;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        HashMap map = C6384.f17547;
        C6384 c6384 = this.f17541;
        c6384.getClass();
        try {
            Object obj = methodHookParam.thisObject;
            C6335 c6335M11854 = C6335.m11854(obj.getClass());
            c6335M11854.f17458.f3618 = AbstractC8405.m13972(329);
            View view = (View) c6335M11854.m11856(obj, new Object[0]);
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(160));
            HashMap map2 = AbstractC6336.f17459;
            Object obj2 = AbstractC6336.m11861(obj.getClass(), clsM11866).get(obj);
            if (obj2 != null && view != null) {
                C6335 c6335M118542 = C6335.m11854(obj2.getClass());
                c6335M118542.f17458.f3618 = AbstractC8405.m13972(164);
                c6335M118542.m11856(obj2, new Object[0]);
                for (Map.Entry entry : C6384.f17547.entrySet()) {
                    AbstractC6311 abstractC6311 = (AbstractC6311) entry.getKey();
                    if (abstractC6311.f17425.booleanValue()) {
                        try {
                            if (entry.getValue() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        } catch (Throwable th) {
                            abstractC6311.getExceptionCollectionToolInstance().m11832(th);
                        }
                    }
                }
            }
        } catch (Exception e) {
            c6384.getExceptionCollectionToolInstance().m11832(e);
        }
    }
}
