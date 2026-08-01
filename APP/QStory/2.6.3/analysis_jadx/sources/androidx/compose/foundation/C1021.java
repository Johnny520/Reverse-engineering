package androidx.compose.foundation;

import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.C1287;
import androidx.compose.ui.node.InterfaceC1764;
import com.materialkolor.dynamiccolor.C3806;
import p052.InterfaceC6558;
import p265.C8260;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1021 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6558 f2990;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2991;

    public /* synthetic */ C1021(InterfaceC6558 interfaceC6558, int i) {
        this.f2991 = i;
        this.f2990 = interfaceC6558;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        C3806 c3806;
        int i = this.f2991;
        InterfaceC6558 interfaceC6558 = this.f2990;
        switch (i) {
            case 0:
                InterfaceC1764 interfaceC1764 = (InterfaceC1764) obj;
                if (!(interfaceC1764 instanceof C1025)) {
                    C5925.m11311("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) interfaceC6558.invoke(((C1025) interfaceC1764).f3003);
                bool.getClass();
                return bool;
            case 1:
                AbstractC1286 abstractC1286 = (AbstractC1286) interfaceC6558.invoke((C1287) obj);
                synchronized (AbstractC1280.f3745) {
                    AbstractC1280.f3744 = AbstractC1280.f3744.m2292(abstractC1286.mo2210());
                }
                return abstractC1286;
            default:
                C8260 c8260 = (C8260) obj;
                return Double.valueOf((c8260 == null || (c3806 = (C3806) interfaceC6558.invoke(c8260)) == null) ? 50.0d : c3806.m8136(c8260));
        }
    }
}
