package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.io.Serializable;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import p052.InterfaceC6557;
import p103.AbstractC7274;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4773 extends AbstractC7274 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Serializable f13906;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6557 f13907;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f13908 = 0;

    public C4773(InterfaceC6557 interfaceC6557, Ref$ObjectRef ref$ObjectRef) {
        this.f13906 = ref$ObjectRef;
        this.f13907 = interfaceC6557;
    }

    @Override // p103.AbstractC7274
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8965(Object obj) {
        int i = this.f13908;
        Object obj2 = this.f13906;
        switch (i) {
            case 0:
                ((InterfaceC4479) obj).getClass();
                return ((Ref$ObjectRef) obj2).element == 0;
            default:
                boolean[] zArr = (boolean[]) obj2;
                if (((Boolean) this.f13907.invoke(obj)).booleanValue()) {
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
    @Override // p103.AbstractC7274
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo9517(Object obj) {
        switch (this.f13908) {
            case 0:
                ?? r3 = (InterfaceC4479) obj;
                r3.getClass();
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f13906;
                if (ref$ObjectRef.element == 0 && ((Boolean) this.f13907.invoke(r3)).booleanValue()) {
                    ref$ObjectRef.element = r3;
                    break;
                }
                break;
        }
    }

    @Override // p103.AbstractC7274
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo8966() {
        int i = this.f13908;
        Object obj = this.f13906;
        switch (i) {
            case 0:
                return (InterfaceC4479) ((Ref$ObjectRef) obj).element;
            default:
                return Boolean.valueOf(((boolean[]) obj)[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4773(InterfaceC6557 interfaceC6557, boolean[] zArr) {
        this.f13907 = interfaceC6557;
        this.f13906 = zArr;
    }
}
