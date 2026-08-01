package top.suzhelan.qstory.hook.item.chat;

import androidx.compose.runtime.internal.C1245;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import lin.xposed.hook.view.main.itemview.C5565;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰世苏哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5854 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(160));
        String[] strArr = {AbstractC8405.m13972(161), AbstractC8405.m13972(162)};
        Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(163));
        C6335 c6335M11854 = C6335.m11854(clsM118662);
        c6335M11854.f17458.f3617 = clsM11866;
        Method methodM11855 = c6335M11854.m11855();
        C6335 c6335M118542 = C6335.m11854(clsM118662);
        c6335M118542.f17458.f3617 = List.class;
        Method methodM118552 = c6335M118542.m11855();
        for (int i = 0; i < 2; i++) {
            C6335 c6335M11853 = C6335.m11853(strArr[i]);
            String name = methodM118552.getName();
            C1245 c1245 = c6335M11853.f17458;
            c1245.f3618 = name;
            c1245.f3617 = List.class;
            m11830(c6335M11853.m11855(), new C5565(methodM11855, clsM11866, this, 4));
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2166);
    }
}
