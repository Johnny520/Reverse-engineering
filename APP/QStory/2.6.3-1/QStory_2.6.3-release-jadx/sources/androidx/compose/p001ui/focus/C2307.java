package androidx.compose.p001ui.focus;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/focus/飘花落叶言子楪兰苏世哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/focus/飘花落叶言子楪兰哲世苏;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final /* data */ class C2307 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2303 f4517;

    public C2307(C2303 c2303) {
        this.f4517 = c2303;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2307) && AbstractC5227.m9466(this.f4517, ((C2307) obj).f4517);
    }

    public final int hashCode() {
        return this.f4517.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f4517 + ')';
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C2305 c2305 = (C2305) abstractC2961;
        c2305.f4516.f4515.m2615(c2305);
        C2303 c2303 = this.f4517;
        c2305.f4516 = c2303;
        c2303.f4515.m2607(c2305);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C2305 c2305 = new C2305();
        c2305.f4516 = this.f4517;
        return c2305;
    }
}
