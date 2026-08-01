package androidx.compose.animation;

import androidx.activity.compose.C0000;
import androidx.compose.runtime.InterfaceC1360;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.view.C2257;
import androidx.lifecycle.InterfaceC2388;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import p116.C7338;
import p116.C7348;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0402 implements InterfaceC1360 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1341;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f1342;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f1344;

    public /* synthetic */ C0402(Object obj, Object obj2, Object obj3, int i) {
        this.f1344 = i;
        this.f1343 = obj;
        this.f1342 = obj2;
        this.f1341 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC1360
    public final void dispose() {
        int i = this.f1344;
        Object obj = this.f1341;
        Object obj2 = this.f1342;
        Object obj3 = this.f1343;
        switch (i) {
            case 0:
                ((SnapshotStateList) obj3).remove(obj2);
                ((C0419) obj).f1368.m757(obj2);
                break;
            case 1:
                ((InterfaceC2388) obj3).getLifecycle().mo4492((C2257) obj2);
                C0000 c0000 = (C0000) ((Ref$ObjectRef) obj).element;
                if (c0000 != null) {
                    c0000.m16();
                }
                break;
            default:
                C7338 c7338 = (C7338) obj3;
                C7348 c7348 = (C7348) obj;
                if (c7338.f19557.m757(obj2) == c7348) {
                    Map map = c7338.f19559;
                    Map mapMo1474 = c7348.mo1474();
                    if (!mapMo1474.isEmpty()) {
                        map.put(obj2, mapMo1474);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
