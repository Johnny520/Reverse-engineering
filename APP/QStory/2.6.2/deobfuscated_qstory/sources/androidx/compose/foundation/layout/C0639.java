package androidx.compose.foundation.layout;

import androidx.compose.foundation.C1077;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import java.util.List;
import kotlin.collections.AbstractC4338;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0639 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f1795;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0639 f1794 = new C0639(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0639 f1793 = new C0639(1);

    public /* synthetic */ C0639(int i) {
        this.f1795 = i;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1105(InterfaceC1653 interfaceC1653, List list, long j) {
        switch (this.f1795) {
            case 0:
                return interfaceC1653.mo1485(C7897.m13313(j), C7897.m13312(j), AbstractC4338.m8781(), new C1077(2));
            default:
                return interfaceC1653.mo1485(C7897.m13303(j) ? C7897.m13309(j) : 0, C7897.m13304(j) ? C7897.m13310(j) : 0, AbstractC4338.m8781(), new C1077(2));
        }
    }
}
