package top.suzhelan.qstory.hook.item;

import androidx.compose.runtime.internal.C2080;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p049.C7164;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲世兰楪;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6776 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        try {
            C7164 c7164M12413 = C7164.m12413(AbstractC7166.m12425("com.tencent.mobileqq.profilecard.activity.FriendProfileCardActivity"));
            String strM14531 = "handleSwitchVasCard";
            C2080 c2080 = c7164M12413.f17803;
            c2080.f3963 = strM14531;
            c2080.f3962 = Void.TYPE;
            m12390(c7164M12413.m12414(), new C6755(12));
        } catch (Exception unused) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "屏蔽查看好友页面自定义的名片";
    }
}
