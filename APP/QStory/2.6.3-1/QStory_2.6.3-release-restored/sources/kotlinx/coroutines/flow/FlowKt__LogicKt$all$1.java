package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__LogicKt", m556f = "Logic.kt", m557l = {119}, m558m = "all", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class FlowKt__LogicKt$all$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public FlowKt__LogicKt$all$1(InterfaceC5189<? super FlowKt__LogicKt$all$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C6174 c6174;
        Ref$BooleanRef ref$BooleanRef;
        AbortFlowException e;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i != 0) {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c6174 = (C6174) this.L$4;
            ref$BooleanRef = (Ref$BooleanRef) this.L$2;
            try {
                AbstractC6017.m10769(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                if (e.owner == c6174) {
                }
            }
            return Boolean.valueOf(!ref$BooleanRef.element);
        }
        AbstractC6017.m10769(obj);
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        c6174 = new C6174(ref$BooleanRef2);
        try {
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = ref$BooleanRef2;
            this.L$3 = null;
            this.L$4 = c6174;
            this.I$0 = 0;
            this.label = 1;
            throw null;
        } catch (AbortFlowException e3) {
            ref$BooleanRef = ref$BooleanRef2;
            e = e3;
        }
        if (e.owner == c6174) {
            throw e;
        }
        AbstractC6231.m11061(getContext());
        return Boolean.valueOf(!ref$BooleanRef.element);
    }
}
