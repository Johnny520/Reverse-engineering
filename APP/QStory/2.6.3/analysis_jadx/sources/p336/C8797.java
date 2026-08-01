package p336;

import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import p026.AbstractC6314;
import p033.AbstractC6333;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.C5812;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "弃用")
public class C8797 extends AbstractC6314 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f24765 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final CountDownTimerC8798 f24764 = new CountDownTimerC8798(this);

    @Override // p026.AbstractC6314
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        this.f24764.start();
        this.f24765.add(XposedBridge.hookMethod(AbstractC6333.m11843(ClassLoader.class, Class.class, AbstractC8405.m13972(1142), new Class[]{String.class}), new C5812(this, 23)));
    }
}
