package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.C6316;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲苏兰世;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5859 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        C6316 c6316M11825 = C6316.m11825("com.tencent.mobileqq.emoticonview.EmoticonPanelController");
        c6316M11825.f17409.f3616 = List.class;
        c6316M11825.f17409.f3617 = "getPanelDataList";
        Method methodM11827 = c6316M11825.m11827();
        "get(...)";
        methodM11827.getClass();
        m11802(methodM11827, new C5864(2));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u5220\u9664\u5728QQ9.0.50\u5de6\u53f3\u51fa\u73b0\u5728\u7ecf\u5178\u5c0f\u8868\u60c5 \u9009\u9879\u53f3\u4fa7\u7684\u5927\u8868\u60c5\u52a8\u753b\u9009\u9879\uff08\u597d\u50bb\u7684\u8868\u60c5\uff1a\u6c6a\u6c6a\u3001\u559c\u82b1\u6ce5\u7b49\uff09";
    }
}
