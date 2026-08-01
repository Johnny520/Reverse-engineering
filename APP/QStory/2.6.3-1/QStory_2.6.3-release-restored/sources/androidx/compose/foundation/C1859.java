package androidx.compose.foundation;

import androidx.compose.p001ui.node.InterfaceC2599;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.C2122;
import com.materialkolor.dynamiccolor.C4638;
import p068.InterfaceC7387;
import p281.C9089;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1859 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7387 f3335;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3336;

    public /* synthetic */ C1859(InterfaceC7387 interfaceC7387, int i) {
        this.f3336 = i;
        this.f3335 = interfaceC7387;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        C4638 c4638;
        int i = this.f3336;
        InterfaceC7387 interfaceC7387 = this.f3335;
        switch (i) {
            case 0:
                InterfaceC2599 interfaceC2599 = (InterfaceC2599) obj;
                if (!(interfaceC2599 instanceof C1863)) {
                    C6755.m11870("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) interfaceC7387.invoke(((C1863) interfaceC2599).f3348);
                bool.getClass();
                return bool;
            case 1:
                AbstractC2121 abstractC2121 = (AbstractC2121) interfaceC7387.invoke((C2122) obj);
                synchronized (AbstractC2115.f4090) {
                    AbstractC2115.f4089 = AbstractC2115.f4089.m2852(abstractC2121.mo2770());
                }
                return abstractC2121;
            default:
                C9089 c9089 = (C9089) obj;
                return Double.valueOf((c9089 == null || (c4638 = (C4638) interfaceC7387.invoke(c9089)) == null) ? 50.0d : c4638.m8695(c9089));
        }
    }
}
