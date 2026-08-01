package androidx.compose.foundation.lazy.layout;

import androidx.activity.compose.C0002;
import androidx.collection.C0246;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1757;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.spatial.C1961;
import androidx.compose.ui.spatial.C1966;
import androidx.compose.ui.spatial.C1967;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0704 extends AbstractC2128 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1967 f1979;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0703 f1980;

    public C0704(C0703 c0703) {
        this.f1980 = c0703;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m1492() {
        C0002 c0002 = new C0002(this, 10, this.f1980);
        C1748 c1748M3336 = AbstractC1785.m3336(this);
        int i = c1748M3336.f5122;
        C1961 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748M3336)).getRectManager();
        C1966 c1966 = rectManager.f5821;
        c1966.getClass();
        C0246 c0246 = c1966.f5840;
        C1967 c1967 = new C1967(c1966, i, this, c0002);
        Object objM832 = c0246.m832(i);
        if (objM832 == null) {
            c0246.m789(i, c1967);
            objM832 = c1967;
        }
        C1967 c19672 = (C1967) objM832;
        if (c19672 != c1967) {
            while (true) {
                C1967 c19673 = c19672.f5844;
                if (c19673 == null) {
                    break;
                } else {
                    c19672 = c19673;
                }
            }
            c19672.f5844 = c1967;
        }
        if (AbstractC1785.m3336(this.f6291).f5121) {
            rectManager.f5822.m572(i, true);
        }
        rectManager.f5819 = true;
        rectManager.m3681();
        this.f1979 = c1967;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        C0703 c0703 = this.f1980;
        if (c0703.f1978 == this) {
            c0703.f1978 = null;
        }
        C1967 c1967 = this.f1979;
        if (c1967 != null) {
            c1967.m3684();
        }
        this.f1979 = null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        C0703 c0703 = this.f1980;
        c0703.f1978 = this;
        if (c0703.f1977 != null) {
            m1492();
        }
    }
}
