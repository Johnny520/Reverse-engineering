package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6133 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f15229;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6150 f15230;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6132 f15231;

    public C6133(C6132 c6132, Ref$ObjectRef ref$ObjectRef, InterfaceC6150 interfaceC6150) {
        this.f15231 = c6132;
        this.f15229 = ref$ObjectRef;
        this.f15230 = interfaceC6150;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
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
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
        if (interfaceC5189 instanceof DistinctFlowImpl$collect$2$emit$1) {
            distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) interfaceC5189;
            int i = distinctFlowImpl$collect$2$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                distinctFlowImpl$collect$2$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, interfaceC5189);
            }
        }
        Object obj2 = distinctFlowImpl$collect$2$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = distinctFlowImpl$collect$2$emit$1.label;
        C6008 c6008 = C6008.f15084;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC6017.m10769(obj2);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj2);
        C6132 c6132 = this.f15231;
        ?? Invoke = c6132.f15226.invoke(obj);
        Ref$ObjectRef ref$ObjectRef = this.f15229;
        T t = ref$ObjectRef.element;
        if (t == AbstractC6051.f15152 || !((Boolean) c6132.f15227.invoke(t, Invoke)).booleanValue()) {
            ref$ObjectRef.element = Invoke;
            distinctFlowImpl$collect$2$emit$1.L$0 = null;
            distinctFlowImpl$collect$2$emit$1.L$1 = null;
            distinctFlowImpl$collect$2$emit$1.label = 1;
            if (this.f15230.emit(obj, distinctFlowImpl$collect$2$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c6008;
    }
}
