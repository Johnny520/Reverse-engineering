package io.modelcontextprotocol.kotlin.sdk.shared;

import androidx.compose.ui.graphics.AbstractC1574;
import androidx.compose.ui.graphics.AbstractC1598;
import kotlin.time.C5157;
import p052.InterfaceC6543;
import p056.InterfaceC6840;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4302 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f12866;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f12867;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12868 = 0;

    public /* synthetic */ C4302(long j, InterfaceC6840 interfaceC6840) {
        this.f12866 = j;
        this.f12867 = interfaceC6840;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f12868;
        long j = this.f12866;
        Object obj = this.f12867;
        switch (i) {
            case 0:
                return "Request timed out after " + C5157.m10189(j) + "ms: " + ((InterfaceC6840) obj).getMethod();
            default:
                return ((AbstractC1574) ((AbstractC1598) obj)).mo2868(j);
        }
    }

    public /* synthetic */ C4302(AbstractC1598 abstractC1598, long j) {
        this.f12867 = abstractC1598;
        this.f12866 = j;
    }
}
