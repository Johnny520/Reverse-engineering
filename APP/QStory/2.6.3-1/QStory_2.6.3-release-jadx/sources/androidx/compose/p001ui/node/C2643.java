package androidx.compose.p001ui.node;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.InterfaceC2957;
import androidx.compose.runtime.collection.C2059;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ C2646 f5622;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f5623;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2059 f5624;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2059 f5625;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f5626;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC2961 f5627;

    public C2643(C2646 c2646, AbstractC2961 abstractC2961, int i, C2059 c2059, C2059 c20592, boolean z) {
        this.f5622 = c2646;
        this.f5627 = abstractC2961;
        this.f5626 = i;
        this.f5625 = c2059;
        this.f5624 = c20592;
        this.f5623 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m3973(int i, int i2) {
        C2059 c2059 = this.f5625;
        int i3 = this.f5626;
        InterfaceC2957 interfaceC2957 = (InterfaceC2957) c2059.f3866[i + i3];
        InterfaceC2957 interfaceC29572 = (InterfaceC2957) this.f5624.f3866[i3 + i2];
        return AbstractC5227.m9466(interfaceC2957, interfaceC29572) || interfaceC2957.getClass() == interfaceC29572.getClass();
    }
}
