package androidx.compose.animation;

import androidx.activity.compose.C0847;
import androidx.compose.runtime.InterfaceC2195;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.view.C3090;
import androidx.lifecycle.InterfaceC3221;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import p132.C8168;
import p132.C8178;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1248 implements InterfaceC2195 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f1687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1688;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f1689;

    public /* synthetic */ C1248(Object obj, Object obj2, Object obj3, int i) {
        this.f1689 = i;
        this.f1688 = obj;
        this.f1687 = obj2;
        this.f1686 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC2195
    public final void dispose() {
        int i = this.f1689;
        Object obj = this.f1686;
        Object obj2 = this.f1687;
        Object obj3 = this.f1688;
        switch (i) {
            case 0:
                ((SnapshotStateList) obj3).remove(obj2);
                ((C1265) obj).f1713.m1318(obj2);
                break;
            case 1:
                ((InterfaceC3221) obj3).getLifecycle().mo5062((C3090) obj2);
                C0847 c0847 = (C0847) ((Ref$ObjectRef) obj).element;
                if (c0847 != null) {
                    c0847.m576();
                }
                break;
            default:
                C8168 c8168 = (C8168) obj3;
                C8178 c8178 = (C8178) obj;
                if (c8168.f19897.m1318(obj2) == c8178) {
                    Map map = c8168.f19899;
                    Map mapMo2044 = c8178.mo2044();
                    if (!mapMo2044.isEmpty()) {
                        map.put(obj2, mapMo2044);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
