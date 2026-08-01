package androidx.compose.material3.internal;

import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6552;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {566}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
final class AnchoredDraggableState$anchoredDrag$4 extends SuspendLambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC6552 $block;
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ AbstractC1117 this$0;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlin/Pair;", "Landroidx/compose/material3/internal/飘花落叶言子楪哲世兰苏;", "<destruct>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6862(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {568}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC6552 $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC1117 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC6552 interfaceC6552, AbstractC1117 abstractC1117, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$block = interfaceC6552;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, null, interfaceC4357);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(Pair<? extends InterfaceC1125, Object> pair, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(pair, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    AbstractC5185.m10210(obj);
                    return C5176.f14739;
                }
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            Pair pair = (Pair) this.L$0;
            if (pair.component1() != null) {
                C2942.m6394();
                return null;
            }
            pair.component2();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$4(AbstractC1117 abstractC1117, Object obj, InterfaceC6552 interfaceC6552, InterfaceC4357<? super AnchoredDraggableState$anchoredDrag$4> interfaceC4357) {
        super(1, interfaceC4357);
        this.$targetValue = obj;
        this.$block = interfaceC6552;
    }

    private static final Pair invokeSuspend$lambda$0(AbstractC1117 abstractC1117) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new AnchoredDraggableState$anchoredDrag$4(null, this.$targetValue, this.$block, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AnchoredDraggableState$anchoredDrag$4) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC5185.m10210(obj);
            return C5176.f14739;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
