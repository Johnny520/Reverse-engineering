package androidx.compose.p001ui.semantics;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/semantics/飘花落叶言子楪世哲兰苏;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class C2775 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7387 f6049;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f6050;

    public C2775(InterfaceC7387 interfaceC7387, boolean z) {
        this.f6050 = z;
        this.f6049 = interfaceC7387;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2775)) {
            return false;
        }
        C2775 c2775 = (C2775) obj;
        return this.f6050 == c2775.f6050 && this.f6049 == c2775.f6049;
    }

    public final int hashCode() {
        return this.f6049.hashCode() + (Boolean.hashCode(this.f6050) * 31);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C2773 c2773 = (C2773) abstractC2961;
        c2773.f6045 = this.f6050;
        c2773.f6046 = this.f6049;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C2773 c2773 = new C2773();
        c2773.f6045 = this.f6050;
        c2773.f6046 = this.f6049;
        return c2773;
    }
}
