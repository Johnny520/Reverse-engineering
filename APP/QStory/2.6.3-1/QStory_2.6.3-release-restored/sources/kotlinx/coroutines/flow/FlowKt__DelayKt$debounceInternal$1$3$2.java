package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.C6034;
import kotlinx.coroutines.channels.C6042;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;", "", "value", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;)V"}, m152k = 3, m153mv = {2, 2, 0})
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m556f = "Delay.kt", m557l = {236}, m558m = "invokeSuspend", m559v = 1)
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6150 $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref$ObjectRef<Object> ref$ObjectRef, InterfaceC6150 interfaceC6150, InterfaceC5189<? super FlowKt__DelayKt$debounceInternal$1$3$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = interfaceC6150;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, interfaceC5189);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = ((C6034) obj).f15136;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // p068.InterfaceC7383
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m10845invokeWpGqRn0(((C6034) obj).f15136, (InterfaceC5189) obj2);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m10845invokeWpGqRn0(Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(new C6034(obj), interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$ObjectRef<Object> ref$ObjectRef;
        Ref$ObjectRef<Object> ref$ObjectRef2;
        ?? r0 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            ref$ObjectRef = this.$lastValue;
            boolean z = r0 instanceof C6042;
            if (!z) {
                ref$ObjectRef.element = r0;
            }
            InterfaceC6150 interfaceC6150 = this.$downstream;
            if (z) {
                Throwable thM10832 = C6034.m10832(r0);
                if (thM10832 != null) {
                    throw thM10832;
                }
                Object obj2 = ref$ObjectRef.element;
                if (obj2 != null) {
                    if (obj2 == AbstractC6051.f15152) {
                        obj2 = null;
                    }
                    this.L$0 = null;
                    this.L$1 = r0;
                    this.L$2 = ref$ObjectRef;
                    this.L$3 = null;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (interfaceC6150.emit(obj2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                }
                ref$ObjectRef.element = AbstractC6051.f15150;
            }
            return C6008.f15084;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ref$ObjectRef2 = (Ref$ObjectRef) this.L$2;
        AbstractC6017.m10769(obj);
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.element = AbstractC6051.f15150;
        return C6008.f15084;
    }
}
