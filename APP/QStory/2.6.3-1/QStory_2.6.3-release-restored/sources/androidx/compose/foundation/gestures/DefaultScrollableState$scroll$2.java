package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C1925;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.AbstractC2182;
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
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", m556f = "ScrollableState.kt", m557l = {Opcodes.ADD_INT_LIT16}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class DefaultScrollableState$scroll$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $block;
    final /* synthetic */ MutatePriority $scrollPriority;
    int label;
    final /* synthetic */ C1318 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", m556f = "ScrollableState.kt", m557l = {Opcodes.DIV_INT_LIT16}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00381 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7383 $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C1318 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00381(C1318 c1318, InterfaceC7383 interfaceC7383, InterfaceC5189<? super C00381> interfaceC5189) {
            super(2, interfaceC5189);
            this.this$0 = c1318;
            this.$block = interfaceC7383;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00381 c00381 = new C00381(this.this$0, this.$block, interfaceC5189);
            c00381.L$0 = obj;
            return c00381;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC1348 interfaceC1348, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00381) create(interfaceC1348, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.飘花落叶言子楪兰苏哲世] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    InterfaceC1348 interfaceC1348 = (InterfaceC1348) this.L$0;
                    ((AbstractC2182) this.this$0.f1785).setValue(Boolean.TRUE);
                    InterfaceC7383 interfaceC7383 = this.$block;
                    this.label = 1;
                    if (interfaceC7383.invoke(interfaceC1348, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                }
                ((AbstractC2182) this.this$0.f1785).setValue(Boolean.FALSE);
                this = C6008.f15084;
                return this;
            } catch (Throwable th) {
                ((AbstractC2182) this.this$0.f1785).setValue(Boolean.FALSE);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultScrollableState$scroll$2(C1318 c1318, MutatePriority mutatePriority, InterfaceC7383 interfaceC7383, InterfaceC5189<? super DefaultScrollableState$scroll$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1318;
        this.$scrollPriority = mutatePriority;
        this.$block = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new DefaultScrollableState$scroll$2(this.this$0, this.$scrollPriority, this.$block, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DefaultScrollableState$scroll$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C1318 c1318 = this.this$0;
            C1925 c1925 = c1318.f1786;
            C1319 c1319 = c1318.f1787;
            MutatePriority mutatePriority = this.$scrollPriority;
            C00381 c00381 = new C00381(c1318, this.$block, null);
            this.label = 1;
            if (c1925.m2563(c1319, mutatePriority, c00381, this) == coroutineSingletons) {
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
