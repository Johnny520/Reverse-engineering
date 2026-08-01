package androidx.compose.p001ui.input.pointer;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.C2612;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子世楪苏兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/input/pointer/飘花落叶言子世楪哲苏兰;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final /* data */ class C2460 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2612 f5094;

    public C2460(C2612 c2612) {
        this.f5094 = c2612;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2460)) {
            return false;
        }
        C2460 c2460 = (C2460) obj;
        C2469 c2469 = AbstractC1821.f3197;
        return c2469.equals(c2469) && AbstractC5227.m9466(this.f5094, c2460.f5094);
    }

    public final int hashCode() {
        int iM701 = AbstractC0900.m701(1022 * 31, 31, false);
        C2612 c2612 = this.f5094;
        return iM701 + (c2612 != null ? c2612.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + AbstractC1821.f3197 + ", overrideDescendants=false, touchBoundsExpansion=" + this.f5094 + ')';
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C2459 c2459 = (C2459) abstractC2961;
        C2469 c2469 = AbstractC1821.f3197;
        if (!AbstractC5227.m9466(c2459.f5110, c2469)) {
            c2459.f5110 = c2469;
            if (c2459.f5109) {
                c2459.m3571();
            }
        }
        c2459.f5108 = this.f5094;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C2459(AbstractC1821.f3197, this.f5094);
    }
}
