package androidx.compose.foundation.lazy.layout;

import androidx.activity.compose.C0849;
import androidx.collection.C1093;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2592;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.spatial.C2796;
import androidx.compose.p001ui.spatial.C2801;
import androidx.compose.p001ui.spatial.C2802;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1545 extends AbstractC2961 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C2802 f2325;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1544 f2326;

    public C1545(C1544 c1544) {
        this.f2326 = c1544;
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
    public final void m2062() {
        C0849 c0849 = new C0849(this, 10, this.f2326);
        C2583 c2583M3906 = AbstractC2620.m3906(this);
        int i = c2583M3906.f5468;
        C2796 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583M3906)).getRectManager();
        C2801 c2801 = rectManager.f6167;
        c2801.getClass();
        C1093 c1093 = c2801.f6186;
        C2802 c2802 = new C2802(c2801, i, this, c0849);
        Object objM1393 = c1093.m1393(i);
        if (objM1393 == null) {
            c1093.m1350(i, c2802);
            objM1393 = c2802;
        }
        C2802 c28022 = (C2802) objM1393;
        if (c28022 != c2802) {
            while (true) {
                C2802 c28023 = c28022.f6190;
                if (c28023 == null) {
                    break;
                } else {
                    c28022 = c28023;
                }
            }
            c28022.f6190 = c2802;
        }
        if (AbstractC2620.m3906(this.f6637).f5467) {
            rectManager.f6168.m1133(i, true);
        }
        rectManager.f6165 = true;
        rectManager.m4251();
        this.f2325 = c2802;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        C1544 c1544 = this.f2326;
        if (c1544.f2324 == this) {
            c1544.f2324 = null;
        }
        C2802 c2802 = this.f2325;
        if (c2802 != null) {
            c2802.m4254();
        }
        this.f2325 = null;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        C1544 c1544 = this.f2326;
        c1544.f2324 = this;
        if (c1544.f2323 != null) {
            m2062();
        }
    }
}
