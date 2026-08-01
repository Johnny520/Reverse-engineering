package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.C5812;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰苏楪哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5881 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f16056 = AbstractC8405.m13972(1919);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16057 = AbstractC8405.m13972(1920);

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        C5812 c5812 = new C5812(this, 5);
        XposedBridge.hookAllMethods(classLoader.loadClass(AbstractC8405.m13972(1922)), AbstractC8405.m13972(1923), c5812);
        XposedBridge.hookAllMethods(classLoader.loadClass(AbstractC8405.m13972(1922)), AbstractC8405.m13972(1924), c5812);
        XposedBridge.hookAllMethods(classLoader.loadClass(AbstractC8405.m13972(1925)), AbstractC8405.m13972(1923), c5812);
        XposedBridge.hookAllMethods(classLoader.loadClass(AbstractC8405.m13972(1925)), AbstractC8405.m13972(1924), c5812);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1921);
    }
}
