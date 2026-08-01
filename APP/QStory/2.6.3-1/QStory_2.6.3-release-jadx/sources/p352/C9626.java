package p352;

import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import p042.AbstractC7143;
import p049.AbstractC7162;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "弃用")
public class C9626 extends AbstractC7143 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f25110 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final CountDownTimerC9627 f25109 = new CountDownTimerC9627(this);

    @Override // p042.AbstractC7143
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        this.f25109.start();
        this.f25110.add(XposedBridge.hookMethod(AbstractC7162.m12402(ClassLoader.class, Class.class, AbstractC9234.m14531(1142), new Class[]{String.class}), new C6642(this, 23)));
    }
}
