package androidx.compose.foundation;

import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.C1287;
import androidx.compose.ui.node.InterfaceC1764;
import com.materialkolor.dynamiccolor.C3805;
import p052.InterfaceC6557;
import p265.C8259;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1021 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6557 f2989;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2990;

    public /* synthetic */ C1021(InterfaceC6557 interfaceC6557, int i) {
        this.f2990 = i;
        this.f2989 = interfaceC6557;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        C3805 c3805;
        int i = this.f2990;
        InterfaceC6557 interfaceC6557 = this.f2989;
        switch (i) {
            case 0:
                InterfaceC1764 interfaceC1764 = (InterfaceC1764) obj;
                if (!(interfaceC1764 instanceof C1025)) {
                    C5919.m11250("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) interfaceC6557.invoke(((C1025) interfaceC1764).f3002);
                bool.getClass();
                return bool;
            case 1:
                AbstractC1286 abstractC1286 = (AbstractC1286) interfaceC6557.invoke((C1287) obj);
                synchronized (AbstractC1280.f3744) {
                    AbstractC1280.f3743 = AbstractC1280.f3743.m2282(abstractC1286.mo2200());
                }
                return abstractC1286;
            default:
                C8259 c8259 = (C8259) obj;
                return Double.valueOf((c8259 == null || (c3805 = (C3805) interfaceC6557.invoke(c8259)) == null) ? 50.0d : c3805.m8149(c8259));
        }
    }
}
