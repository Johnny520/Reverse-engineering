package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.InterfaceC1157;
import androidx.compose.p001ui.graphics.layer.C2351;
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

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", m556f = "LazyLayoutItemAnimation.kt", m557l = {Opcodes.SUB_DOUBLE_2ADDR}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class LazyLayoutItemAnimation$animateDisappearance$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C2351 $layer;
    final /* synthetic */ InterfaceC1157 $spec;
    int label;
    final /* synthetic */ AbstractC1557 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateDisappearance$1(AbstractC1557 abstractC1557, InterfaceC1157 interfaceC1157, C2351 c2351, InterfaceC5189<? super LazyLayoutItemAnimation$animateDisappearance$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC1557;
        this.$spec = interfaceC1157;
        this.$layer = c2351;
    }

    private static final C6008 invokeSuspend$lambda$0(C2351 c2351, AbstractC1557 abstractC1557, C1177 c1177) {
        c2351.m3352(((Number) c1177.m1593()).floatValue());
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new LazyLayoutItemAnimation$animateDisappearance$1(this.this$0, this.$spec, this.$layer, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((LazyLayoutItemAnimation$animateDisappearance$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        throw null;
    }
}
