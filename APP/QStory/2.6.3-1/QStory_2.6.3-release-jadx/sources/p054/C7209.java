package p054;

import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import java.util.Map;
import p042.AbstractC7140;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7209 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C7213 f17886;

    public C7209(C7213 c7213) {
        this.f17886 = c7213;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        HashMap map = C7213.f17892;
        C7213 c7213 = this.f17886;
        c7213.getClass();
        try {
            Object obj = methodHookParam.thisObject;
            C7164 c7164M12413 = C7164.m12413(obj.getClass());
            c7164M12413.f17803.f3963 = AbstractC9234.m14531(329);
            View view = (View) c7164M12413.m12415(obj, new Object[0]);
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(160));
            HashMap map2 = AbstractC7165.f17804;
            Object obj2 = AbstractC7165.m12420(obj.getClass(), clsM12425).get(obj);
            if (obj2 != null && view != null) {
                C7164 c7164M124132 = C7164.m12413(obj2.getClass());
                c7164M124132.f17803.f3963 = AbstractC9234.m14531(164);
                c7164M124132.m12415(obj2, new Object[0]);
                for (Map.Entry entry : C7213.f17892.entrySet()) {
                    AbstractC7140 abstractC7140 = (AbstractC7140) entry.getKey();
                    if (abstractC7140.f17770.booleanValue()) {
                        try {
                            if (entry.getValue() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        } catch (Throwable th) {
                            abstractC7140.getExceptionCollectionToolInstance().m12391(th);
                        }
                    }
                }
            }
        } catch (Exception e) {
            c7213.getExceptionCollectionToolInstance().m12391(e);
        }
    }
}
