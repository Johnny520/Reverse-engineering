package androidx.compose.ui.input.pointer;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.C1777;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子世楪苏兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/input/pointer/飘花落叶言子世楪哲苏兰;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C1625 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1777 f4748;

    public C1625(C1777 c1777) {
        this.f4748 = c1777;
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
        if (!(obj instanceof C1625)) {
            return false;
        }
        C1625 c1625 = (C1625) obj;
        C1634 c1634 = AbstractC0983.f2851;
        return c1634.equals(c1634) && AbstractC4394.m8917(this.f4748, c1625.f4748);
    }

    public final int hashCode() {
        int iM140 = AbstractC0053.m140(1022 * 31, 31, false);
        C1777 c1777 = this.f4748;
        return iM140 + (c1777 != null ? c1777.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + AbstractC0983.f2851 + ", overrideDescendants=false, touchBoundsExpansion=" + this.f4748 + ')';
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C1624 c1624 = (C1624) abstractC2128;
        C1634 c1634 = AbstractC0983.f2851;
        if (!AbstractC4394.m8917(c1624.f4764, c1634)) {
            c1624.f4764 = c1634;
            if (c1624.f4763) {
                c1624.m3001();
            }
        }
        c1624.f4762 = this.f4748;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        return new C1624(AbstractC0983.f2851, this.f4748);
    }
}
