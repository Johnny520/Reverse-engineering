package p040;

import android.view.View;
import androidx.compose.runtime.internal.C1245;
import java.lang.reflect.Method;
import p019.C6263;
import p033.C6335;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6440 extends AbstractC8803 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Method methodM11855;
        if (AbstractC6358.f17508 > 5028) {
            C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(158));
            String strM13973 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
            C1245 c1245 = c6335M11853.f17458;
            c1245.f3618 = strM13973;
            c1245.f3619 = new Class[]{Object.class, View.class};
            methodM11855 = c6335M11853.m11855();
        } else {
            C6335 c6335M118532 = C6335.m11853(AbstractC8405.m13972(159));
            String strM139732 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
            C1245 c12452 = c6335M118532.f17458;
            c12452.f3618 = strM139732;
            c12452.f3619 = new Class[]{Object.class};
            methodM11855 = c6335M118532.m11855();
        }
        m11831(methodM11855, new C6263(this));
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11251(C8785 c8785) {
        return c8785.f24740.intValue() >= 2;
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11252(C8785 c8785) {
        return c8785.f24740.intValue() >= 2;
    }
}
