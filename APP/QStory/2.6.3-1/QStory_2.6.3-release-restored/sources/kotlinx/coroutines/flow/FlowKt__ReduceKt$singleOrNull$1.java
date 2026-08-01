package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m556f = "Reduce.kt", m557l = {179}, m558m = "singleOrNull", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class FlowKt__ReduceKt$singleOrNull$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public FlowKt__ReduceKt$singleOrNull$1(InterfaceC5189<? super FlowKt__ReduceKt$singleOrNull$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C6173 c6173;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        T t;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        T t2 = (T) AbstractC6051.f15152;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c6173 = (C6173) this.L$3;
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            try {
                AbstractC6017.m10769(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                if (e.owner == c6173) {
                }
            }
            t = ref$ObjectRef.element;
            if (t != t2) {
                return null;
            }
            return t;
        }
        AbstractC6017.m10769(obj);
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = t2;
        c6173 = new C6173(ref$ObjectRef2);
        try {
            this.L$0 = null;
            this.L$1 = ref$ObjectRef2;
            this.L$2 = null;
            this.L$3 = c6173;
            this.I$0 = 0;
            this.label = 1;
            throw null;
        } catch (AbortFlowException e3) {
            ref$ObjectRef = ref$ObjectRef2;
            e = e3;
        }
        if (e.owner == c6173) {
            throw e;
        }
        AbstractC6231.m11061(getContext());
        t = ref$ObjectRef.element;
        if (t != t2) {
        }
    }
}
