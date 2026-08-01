package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.io.Serializable;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import p068.InterfaceC7387;
import p119.AbstractC8104;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5606 extends AbstractC8104 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Serializable f14255;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7387 f14256;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f14257 = 0;

    public C5606(InterfaceC7387 interfaceC7387, Ref$ObjectRef ref$ObjectRef) {
        this.f14255 = ref$ObjectRef;
        this.f14256 = interfaceC7387;
    }

    @Override // p119.AbstractC8104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo9514(Object obj) {
        int i = this.f14257;
        Object obj2 = this.f14255;
        switch (i) {
            case 0:
                ((InterfaceC5312) obj).getClass();
                return ((Ref$ObjectRef) obj2).element == 0;
            default:
                boolean[] zArr = (boolean[]) obj2;
                if (((Boolean) this.f14256.invoke(obj)).booleanValue()) {
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
    @Override // p119.AbstractC8104
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo10066(Object obj) {
        switch (this.f14257) {
            case 0:
                ?? r3 = (InterfaceC5312) obj;
                r3.getClass();
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f14255;
                if (ref$ObjectRef.element == 0 && ((Boolean) this.f14256.invoke(r3)).booleanValue()) {
                    ref$ObjectRef.element = r3;
                    break;
                }
                break;
        }
    }

    @Override // p119.AbstractC8104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo9515() {
        int i = this.f14257;
        Object obj = this.f14255;
        switch (i) {
            case 0:
                return (InterfaceC5312) ((Ref$ObjectRef) obj).element;
            default:
                return Boolean.valueOf(((boolean[]) obj)[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5606(InterfaceC7387 interfaceC7387, boolean[] zArr) {
        this.f14256 = interfaceC7387;
        this.f14255 = zArr;
    }
}
