package androidx.compose.foundation.lazy;

import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1606 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2580;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1603 f2581;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f2582;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2583 = 1;

    public /* synthetic */ C1606(int i, C1603 c1603, Object obj) {
        this.f2581 = c1603;
        this.f2582 = i;
        this.f2580 = obj;
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
    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2583;
        C6008 c6008 = C6008.f15084;
        Object obj3 = this.f2580;
        int i2 = this.f2582;
        C1603 c1603 = this.f2581;
        InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                c1603.m2133(i2, obj3, interfaceC2208, AbstractC2202.m3031(1));
                break;
            default:
                int iIntValue = num.intValue();
                C2159 c2159 = (C2159) interfaceC2208;
                if (!c2159.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c2159.m2899();
                } else {
                    c1603.m2133(i2, obj3, c2159, 0);
                }
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1606(C1603 c1603, int i, Object obj, int i2) {
        this.f2581 = c1603;
        this.f2582 = i;
        this.f2580 = obj;
    }
}
