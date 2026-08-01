package androidx.compose.material3.internal;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {518}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
final class AnchoredDraggableState$anchoredDrag$2 extends SuspendLambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC6551 $block;
    int label;
    final /* synthetic */ AbstractC1117 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$2(AbstractC1117 abstractC1117, InterfaceC6551 interfaceC6551, InterfaceC4357<? super AnchoredDraggableState$anchoredDrag$2> interfaceC4357) {
        super(1, interfaceC4357);
        this.$block = interfaceC6551;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1125 invokeSuspend$lambda$0(AbstractC1117 abstractC1117) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new AnchoredDraggableState$anchoredDrag$2(null, this.$block, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AnchoredDraggableState$anchoredDrag$2) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C1119 c1119 = new C1119();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, null, null);
            this.label = 1;
            if (AbstractC1120.m2014(c1119, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/material3/internal/飘花落叶言子楪哲世兰苏;", "latestAnchors", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/material3/internal/飘花落叶言子楪哲世兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6862(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {519}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC6551 $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC1117 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC6551 interfaceC6551, AbstractC1117 abstractC1117, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$block = interfaceC6551;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, null, interfaceC4357);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p052.InterfaceC6554
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj == null) {
                return invoke((InterfaceC1125) null, (InterfaceC4357<? super C5176>) obj2);
            }
            C2942.m6394();
            return null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                throw AbstractC0053.m159(this.L$0);
            }
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return C5176.f14739;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        public final Object invoke(InterfaceC1125 interfaceC1125, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(interfaceC1125, interfaceC4357)).invokeSuspend(C5176.f14739);
        }
    }
}
