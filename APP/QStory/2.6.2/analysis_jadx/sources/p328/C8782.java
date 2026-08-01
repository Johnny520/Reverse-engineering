package p328;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import p026.AbstractC6296;
import p032.AbstractC6314;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "弃用")
public class C8782 extends AbstractC6296 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f24733 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final CountDownTimerC8775 f24732 = new CountDownTimerC8775(this);

    @Override // p026.AbstractC6296
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        this.f24732.start();
        this.f24733.add(XposedBridge.hookMethod(AbstractC6314.m11815(ClassLoader.class, Class.class, AbstractC3056.m6668(-3937668790637299111L), new Class[]{String.class}), new C5811(this, 23)));
    }
}
