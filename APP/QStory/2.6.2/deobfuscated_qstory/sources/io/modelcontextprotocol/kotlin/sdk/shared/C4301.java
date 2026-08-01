package io.modelcontextprotocol.kotlin.sdk.shared;

import androidx.compose.ui.graphics.AbstractC1574;
import androidx.compose.ui.graphics.AbstractC1598;
import kotlin.time.C5156;
import p052.InterfaceC6542;
import p056.InterfaceC6839;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4301 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f12862;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f12863;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12864 = 0;

    public /* synthetic */ C4301(long j, InterfaceC6839 interfaceC6839) {
        this.f12862 = j;
        this.f12863 = interfaceC6839;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f12864;
        long j = this.f12862;
        Object obj = this.f12863;
        switch (i) {
            case 0:
                return "Request timed out after " + C5156.m10185(j) + "ms: " + ((InterfaceC6839) obj).getMethod();
            default:
                return ((AbstractC1574) ((AbstractC1598) obj)).mo2858(j);
        }
    }

    public /* synthetic */ C4301(AbstractC1598 abstractC1598, long j) {
        this.f12863 = abstractC1598;
        this.f12862 = j;
    }
}
