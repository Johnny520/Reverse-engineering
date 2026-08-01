package androidx.lifecycle;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", m556f = "CoroutineLiveData.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Landroidx/lifecycle/飘花落叶言子楪苏兰哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Landroidx/lifecycle/飘花落叶言子楪苏兰哲世;"}, m152k = 3, m153mv = {2, 0, 0})
final class CoroutineLiveDataKt$addDisposableSource$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC3208 $source;
    final /* synthetic */ AbstractC3206 $this_addDisposableSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveDataKt$addDisposableSource$2(AbstractC3206 abstractC3206, AbstractC3208 abstractC3208, InterfaceC5189<? super CoroutineLiveDataKt$addDisposableSource$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$source = abstractC3208;
    }

    private static final C6008 invokeSuspend$lambda$0(AbstractC3206 abstractC3206, Object obj) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new CoroutineLiveDataKt$addDisposableSource$2(null, this.$source, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super AbstractC3245> interfaceC5189) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        throw null;
    }
}
