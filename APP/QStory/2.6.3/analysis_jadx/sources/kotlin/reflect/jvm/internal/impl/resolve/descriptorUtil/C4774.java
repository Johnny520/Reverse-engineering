package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.io.Serializable;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import p052.InterfaceC6558;
import p103.AbstractC7275;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4774 extends AbstractC7275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Serializable f13910;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6558 f13911;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f13912 = 0;

    public C4774(InterfaceC6558 interfaceC6558, Ref$ObjectRef ref$ObjectRef) {
        this.f13910 = ref$ObjectRef;
        this.f13911 = interfaceC6558;
    }

    @Override // p103.AbstractC7275
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8955(Object obj) {
        int i = this.f13912;
        Object obj2 = this.f13910;
        switch (i) {
            case 0:
                ((InterfaceC4480) obj).getClass();
                return ((Ref$ObjectRef) obj2).element == 0;
            default:
                boolean[] zArr = (boolean[]) obj2;
                if (((Boolean) this.f13911.invoke(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世哲苏兰] */
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
    @Override // p103.AbstractC7275
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo9507(Object obj) {
        switch (this.f13912) {
            case 0:
                ?? r3 = (InterfaceC4480) obj;
                r3.getClass();
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f13910;
                if (ref$ObjectRef.element == 0 && ((Boolean) this.f13911.invoke(r3)).booleanValue()) {
                    ref$ObjectRef.element = r3;
                    break;
                }
                break;
        }
    }

    @Override // p103.AbstractC7275
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo8956() {
        int i = this.f13912;
        Object obj = this.f13910;
        switch (i) {
            case 0:
                return (InterfaceC4480) ((Ref$ObjectRef) obj).element;
            default:
                return Boolean.valueOf(((boolean[]) obj)[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4774(InterfaceC6558 interfaceC6558, boolean[] zArr) {
        this.f13911 = interfaceC6558;
        this.f13910 = zArr;
    }
}
