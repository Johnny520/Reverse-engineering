package top.suzhelan.qstory.hook.item;

import android.view.View;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p287.AbstractC8405;
import p389.C9092;
import p391.C9095;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲苏楪兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5887 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Map f16064 = AbstractC4339.m8774(new Pair(AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜呜呜喵~呜呜呜喵喵喵呜喵~呜喵喵喵喵喵喵喵~呜呜喵喵呜喵呜呜~呜呜喵喵呜喵喵喵"), 0), new Pair(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜呜呜呜喵呜喵~呜喵喵喵呜呜喵呜~呜呜喵呜喵呜喵呜~呜呜呜喵喵喵呜呜"), 1), new Pair(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜呜喵喵喵喵喵~呜呜喵呜呜呜呜呜~呜喵喵喵呜呜喵呜~呜呜喵呜喵呜喵呜~呜呜呜喵喵喵呜呜"), 64), new Pair(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜呜喵喵喵喵喵~呜呜喵呜呜呜呜呜~呜喵喵喵呜呜喵呜~呜呜喵喵喵喵喵呜~呜呜喵喵呜喵呜呜"), 512), new Pair(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜呜呜呜喵呜喵~呜喵喵喵呜呜喵呜~呜呜喵喵喵喵喵呜~呜呜喵喵呜喵呜呜"), 1024));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C9095 f16065 = new C9095(AbstractC8405.m13972(1878), 0);

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Class clsM11866;
        Class clsM118662;
        Class clsM118663;
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        Class clsM118664 = null;
        try {
            clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(133));
        } catch (Throwable unused) {
            clsM11866 = null;
        }
        if (clsM11866 == null) {
            try {
                clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1880));
            } catch (Throwable unused2) {
                clsM11866 = null;
            }
            if (clsM11866 == null) {
                return;
            }
        }
        try {
            clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(136));
        } catch (Throwable unused3) {
            clsM118662 = null;
        }
        if (clsM118662 == null) {
            try {
                clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(1881));
            } catch (Throwable unused4) {
                clsM118662 = null;
            }
            if (clsM118662 == null) {
                return;
            }
        }
        try {
            clsM118663 = AbstractC6337.m11866(AbstractC8405.m13972(137));
        } catch (Throwable unused5) {
            clsM118663 = null;
        }
        if (clsM118663 == null) {
            try {
                clsM118664 = AbstractC6337.m11866(AbstractC8405.m13972(1882));
            } catch (Throwable unused6) {
            }
            if (clsM118664 == null) {
                return;
            } else {
                clsM118663 = clsM118664;
            }
        }
        C9092 c9092M14672 = C9092.m14672(clsM118663);
        c9092M14672.m14675(Long.TYPE, clsM11866, ArrayList.class, HashMap.class, clsM118662);
        c9092M14672.f25481 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵");
        Method method = (Method) c9092M14672.m14604();
        if (method == null) {
            return;
        }
        m11831(method, new C5884(this));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        Object objM8818;
        String strM13972 = AbstractC8405.m13972(1884);
        C9095 c9095 = this.f16065;
        c9095.getClass();
        int i = 0;
        int i2 = c9095.f25489.getInt(strM13972, 0);
        Set setKeySet = this.f16064.keySet();
        setKeySet.getClass();
        if (setKeySet instanceof List) {
            objM8818 = AbstractC4344.m8818(i2, (List) setKeySet);
        } else if (i2 < 0) {
            objM8818 = null;
        } else {
            for (Object obj : setKeySet) {
                int i3 = i + 1;
                if (i2 == i) {
                    objM8818 = obj;
                    break;
                }
                i = i3;
            }
            objM8818 = null;
        }
        if (((String) objM8818) == null) {
            AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜呜呜喵~呜呜呜喵喵喵呜喵~呜喵喵喵喵喵喵喵~呜呜喵喵呜喵呜呜~呜呜喵喵呜喵喵喵");
        }
        return AbstractC8405.m13972(1879);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC3183(this, 4);
    }
}
