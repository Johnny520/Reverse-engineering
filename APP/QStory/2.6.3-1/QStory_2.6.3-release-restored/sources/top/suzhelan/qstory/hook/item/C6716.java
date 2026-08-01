package top.suzhelan.qstory.hook.item;

import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p353.AbstractC9633;
import p405.C9921;
import top.sacz.xphelper.util.DexMethodDescriptor;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲苏兰楪;", "L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6716 extends AbstractC9633 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16408 = "qqfav.apk";

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        String strM14531 = "Lcom/qqfav/activity/BaseDetailActivity;->onCreate(Landroid/os/Bundle;)V";
        int i = C9921.f25825;
        Method methodInstance = new DexMethodDescriptor(strM14531).getMethodInstance(classLoader);
        methodInstance.setAccessible(true);
        m12389(methodInstance, new C6755(1));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "回忆之所以美丽 是因为谁都回不去,目前支持纯文字收藏详情";
    }

    @Override // p353.AbstractC9633
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters and from getter */
    public final String getF16408() {
        return this.f16408;
    }
}
