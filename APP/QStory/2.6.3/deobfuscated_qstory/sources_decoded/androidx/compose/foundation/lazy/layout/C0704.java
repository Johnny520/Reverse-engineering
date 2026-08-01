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
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0704 extends AbstractC2128 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1967 f1980;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0703 f1981;

    public C0704(C0703 c0703) {
        this.f1981 = c0703;
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
    public final void m1502() {
        C0002 c0002 = new C0002(this, 10, this.f1981);
        C1748 c1748M3346 = AbstractC1785.m3346(this);
        int i = c1748M3346.f5123;
        C1961 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748M3346)).getRectManager();
        C1966 c1966 = rectManager.f5822;
        c1966.getClass();
        C0246 c0246 = c1966.f5841;
        C1967 c1967 = new C1967(c1966, i, this, c0002);
        Object objM833 = c0246.m833(i);
        if (objM833 == null) {
            c0246.m790(i, c1967);
            objM833 = c1967;
        }
        C1967 c19672 = (C1967) objM833;
        if (c19672 != c1967) {
            while (true) {
                C1967 c19673 = c19672.f5845;
                if (c19673 == null) {
                    break;
                } else {
                    c19672 = c19673;
                }
            }
            c19672.f5845 = c1967;
        }
        if (AbstractC1785.m3346(this.f6292).f5122) {
            rectManager.f5823.m573(i, true);
        }
        rectManager.f5820 = true;
        rectManager.m3691();
        this.f1980 = c1967;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        C0703 c0703 = this.f1981;
        if (c0703.f1979 == this) {
            c0703.f1979 = null;
        }
        C1967 c1967 = this.f1980;
        if (c1967 != null) {
            c1967.m3694();
        }
        this.f1980 = null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        C0703 c0703 = this.f1981;
        c0703.f1979 = this;
        if (c0703.f1978 != null) {
            m1502();
        }
    }
}
