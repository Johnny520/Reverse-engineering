package androidx.compose.runtime;

import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5$1", m556f = "ProduceState.kt", m557l = {Opcodes.SUB_DOUBLE_2ADDR}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class SnapshotStateKt__ProduceStateKt$produceState$5$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $producer;
    final /* synthetic */ InterfaceC2230 $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__ProduceStateKt$produceState$5$1(InterfaceC7383 interfaceC7383, InterfaceC2230 interfaceC2230, InterfaceC5189<? super SnapshotStateKt__ProduceStateKt$produceState$5$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$producer = interfaceC7383;
        this.$result = interfaceC2230;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SnapshotStateKt__ProduceStateKt$produceState$5$1 snapshotStateKt__ProduceStateKt$produceState$5$1 = new SnapshotStateKt__ProduceStateKt$produceState$5$1(this.$producer, this.$result, interfaceC5189);
        snapshotStateKt__ProduceStateKt$produceState$5$1.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$5$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$5$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            InterfaceC7383 interfaceC7383 = this.$producer;
            C2222 c2222 = new C2222(this.$result, interfaceC6233.mo2990());
            this.label = 1;
            if (interfaceC7383.invoke(c2222, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
