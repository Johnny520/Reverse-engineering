package io.ktor.client.plugins;

import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p257.C8969;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.RequestError$install$1", m556f = "HttpCallValidator.kt", m557l = {134, 136}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class RequestError$install$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7380 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestError$install$1(InterfaceC7380 interfaceC7380, InterfaceC5189<? super RequestError$install$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$handler = interfaceC7380;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        RequestError$install$1 requestError$install$1 = new RequestError$install$1(this.$handler, interfaceC5189);
        requestError$install$1.L$0 = abstractC5026;
        return requestError$install$1.invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r6 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r7 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏] */
    /* JADX WARN: Type inference failed for: r6v0, types: [io.ktor.client.plugins.RequestError$install$1, kotlin.coroutines.飘花落叶言子楪世哲苏兰] */
    /* JADX WARN: Type inference failed for: r6v1, types: [io.ktor.client.plugins.RequestError$install$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
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
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
        } catch (Throwable th) {
            ?? r4 = this.$handler;
            C8969 c8969 = (C8969) r1.f13009;
            InterfaceC9970 interfaceC9970 = AbstractC4773.f12501;
            C4772 c4772 = new C4772(c8969);
            this.L$0 = null;
            this.label = 2;
            obj = r4.invoke(c4772, th, this);
        }
        if (r1 == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
            this.L$0 = abstractC5026;
            this.label = 1;
            Object objMo9125 = abstractC5026.mo9125(this);
            r1 = abstractC5026;
            this = objMo9125;
        } else {
            if (r1 != 1) {
                if (r1 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    throw th2;
                }
                return C6008.f15084;
            }
            AbstractC5026 abstractC50262 = (AbstractC5026) this.L$0;
            AbstractC6017.m10769(obj);
            r1 = abstractC50262;
            this = this;
        }
        return C6008.f15084;
    }
}
