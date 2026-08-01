package androidx.compose.p001ui.platform;

import androidx.compose.p001ui.node.InterfaceC2639;
import androidx.compose.p001ui.semantics.C2793;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2711 implements InterfaceC2639 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f5728;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f5730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Float f5729 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Float f5726 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C2793 f5725 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2793 f5727 = null;

    public C2711(int i, ArrayList arrayList) {
        this.f5730 = i;
        this.f5728 = arrayList;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2639
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo3815() {
        return this.f5728.contains(this);
    }
}
