package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p052.AbstractC7187;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世苏兰楪哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6725 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        try {
            if (AbstractC7187.f17853 >= 6792) {
                XposedBridge.hookMethod(classLoader.loadClass("com.tencent.mobileqq.troop.flame.api.impl.TroopFlameApiImpl").getMethod("getFlameViewDataFromPB", Object.class), new C6726(this, 0));
                return;
            }
            try {
                XposedBridge.hookMethod(classLoader.loadClass("com.tencent.mobileqq.troop.flame.api.impl.TroopFlameApiImpl").getMethod("getGroupExtFlameData", classLoader.loadClass("com.tencent.mobileqq.data.troop.TroopInfoExt")), new C6726(this, 1));
            } catch (Exception unused) {
                XposedBridge.hookMethod(classLoader.loadClass("com.tencent.mobileqq.troop.flame.api.impl.TroopFlameApiImpl").getDeclaredMethod("getGroupExtFlameData", Object.class), new C6726(this, 2));
            }
        } catch (Exception unused2) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "重启生效";
    }
}
