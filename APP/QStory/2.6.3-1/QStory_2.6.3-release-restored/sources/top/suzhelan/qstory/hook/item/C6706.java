package top.suzhelan.qstory.hook.item;

import android.view.View;
import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p405.C9921;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰哲楪苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6706 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        try {
            C9921 c9921M15231 = C9921.m15231(classLoader.loadClass("com.tencent.mobileqq.newfriend.ui.builder.NewFriendBindContactGuideBuilderV3"));
            c9921M15231.f25826 = "h";
            c9921M15231.m15234(Integer.TYPE, View.class);
            Method method = (Method) c9921M15231.m15163();
            if (method == null) {
                return;
            }
            m12389(method, new C6755(8));
        } catch (ClassNotFoundException unused) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "隐藏新朋友列表中的通讯录推荐卡片";
    }
}
