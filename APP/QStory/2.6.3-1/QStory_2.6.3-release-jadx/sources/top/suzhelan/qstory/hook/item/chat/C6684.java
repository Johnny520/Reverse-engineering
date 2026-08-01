package top.suzhelan.qstory.hook.item.chat;

import androidx.compose.runtime.internal.C2080;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import lin.xposed.hook.view.main.itemview.C6395;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰世苏哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6684 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(160));
        String[] strArr = {AbstractC9234.m14531(161), AbstractC9234.m14531(162)};
        Class clsM124252 = AbstractC7166.m12425(AbstractC9234.m14531(163));
        C7164 c7164M12413 = C7164.m12413(clsM124252);
        c7164M12413.f17803.f3962 = clsM12425;
        Method methodM12414 = c7164M12413.m12414();
        C7164 c7164M124132 = C7164.m12413(clsM124252);
        c7164M124132.f17803.f3962 = List.class;
        Method methodM124142 = c7164M124132.m12414();
        for (int i = 0; i < 2; i++) {
            C7164 c7164M12412 = C7164.m12412(strArr[i]);
            String name = methodM124142.getName();
            C2080 c2080 = c7164M12412.f17803;
            c2080.f3963 = name;
            c2080.f3962 = List.class;
            m12389(c7164M12412.m12414(), new C6395(methodM12414, clsM12425, this, 4));
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2166);
    }
}
