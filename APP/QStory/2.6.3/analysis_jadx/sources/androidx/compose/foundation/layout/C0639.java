package androidx.compose.foundation.layout;

import androidx.compose.foundation.C1077;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import java.util.List;
import kotlin.collections.AbstractC4339;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0639 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f1796;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0639 f1795 = new C0639(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0639 f1794 = new C0639(1);

    public /* synthetic */ C0639(int i) {
        this.f1796 = i;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1106(InterfaceC1653 interfaceC1653, List list, long j) {
        switch (this.f1796) {
            case 0:
                return interfaceC1653.mo1495(C7898.m13341(j), C7898.m13340(j), AbstractC4339.m8776(), new C1077(2));
            default:
                return interfaceC1653.mo1495(C7898.m13331(j) ? C7898.m13337(j) : 0, C7898.m13332(j) ? C7898.m13338(j) : 0, AbstractC4339.m8776(), new C1077(2));
        }
    }
}
