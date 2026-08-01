package top.suzhelan.qstory.hook.item.chat;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.C7164;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲苏兰世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6694 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        C7164 c7164M12412 = C7164.m12412("com.tencent.mobileqq.emoticonview.EmoticonPanelController");
        c7164M12412.f17803.f3962 = List.class;
        c7164M12412.f17803.f3963 = "getPanelDataList";
        Method methodM12414 = c7164M12412.m12414();
        "get(...)";
        methodM12414.getClass();
        m12389(methodM12414, new C6699(2));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "删除在QQ9.0.50左右出现在经典小表情 选项右侧的大表情动画选项（好傻的表情：汪汪、喜花泥等）";
    }
}
