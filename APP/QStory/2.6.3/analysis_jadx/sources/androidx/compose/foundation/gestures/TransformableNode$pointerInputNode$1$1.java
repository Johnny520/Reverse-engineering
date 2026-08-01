package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import com.alibaba.fastjson2.C2942;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", f = "Transformable.kt", l = {199}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TransformableNode$pointerInputNode$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC1635 $this_SuspendingPointerInputModifierNode;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0490 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", f = "Transformable.kt", l = {201}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends RestrictedSuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC5401 $$this$coroutineScope;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC0490 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC0490 abstractC0490, InterfaceC5401 interfaceC5401, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$$this$coroutineScope = interfaceC5401;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null, this.$$this$coroutineScope, interfaceC4357);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC5185.m10210(obj);
                    throw null;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5185.m10210(obj);
                throw null;
            } catch (CancellationException e) {
                if (AbstractC5399.m10495(this.$$this$coroutineScope)) {
                    throw null;
                }
                throw e;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableNode$pointerInputNode$1$1(InterfaceC1635 interfaceC1635, AbstractC0490 abstractC0490, InterfaceC4357<? super TransformableNode$pointerInputNode$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_SuspendingPointerInputModifierNode = interfaceC1635;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TransformableNode$pointerInputNode$1$1 transformableNode$pointerInputNode$1$1 = new TransformableNode$pointerInputNode$1$1(this.$this_SuspendingPointerInputModifierNode, null, interfaceC4357);
        transformableNode$pointerInputNode$1$1.L$0 = obj;
        return transformableNode$pointerInputNode$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TransformableNode$pointerInputNode$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
            AbstractC5399.m10477(interfaceC5401, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(null, null), 1);
            InterfaceC1635 interfaceC1635 = this.$this_SuspendingPointerInputModifierNode;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null, interfaceC5401, null);
            this.label = 1;
            if (AbstractC0521.m1311(interfaceC1635, anonymousClass2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", f = "Transformable.kt", l = {177, 180}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ AbstractC0490 this$0;

        public AnonymousClass1(AbstractC0490 abstractC0490, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, interfaceC4357);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1] */
        /* JADX WARN: Type inference failed for: r3v11, types: [kotlinx.coroutines.飘花落叶言子世楪哲兰苏] */
        /* JADX WARN: Type inference failed for: r3v2, types: [kotlinx.coroutines.飘花落叶言子世楪哲兰苏] */
        /* JADX WARN: Type inference failed for: r3v3, types: [kotlinx.coroutines.飘花落叶言子世楪哲兰苏] */
        /* JADX WARN: Type inference failed for: r3v8, types: [kotlinx.coroutines.飘花落叶言子世楪哲兰苏] */
        /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                try {
                    if (i == 1) {
                        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.L$2;
                        Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
                        this = (InterfaceC5401) this.L$0;
                        AbstractC5185.m10210(obj);
                        ref$ObjectRef.element = obj;
                        if (ref$ObjectRef2.element instanceof C0488) {
                            throw null;
                        }
                    } else {
                        if (i != 2) {
                            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (InterfaceC5401) this.L$0;
                        AbstractC5185.m10210(obj);
                    }
                } catch (CancellationException unused) {
                }
            } else {
                AbstractC5185.m10210(obj);
                this = (InterfaceC5401) this.L$0;
            }
            if (!AbstractC5399.m10495(this)) {
                return C5176.f14739;
            }
            new Ref$ObjectRef();
            throw null;
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;)V"}, k = 3, mv = {2, 1, 0})
        @InterfaceC6862(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", f = "Transformable.kt", l = {190}, m = "invokeSuspend", v = 1)
        public static final class C04591 extends SuspendLambda implements InterfaceC6554 {
            final /* synthetic */ Ref$ObjectRef<AbstractC0521> $event;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ AbstractC0490 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04591(Ref$ObjectRef<AbstractC0521> ref$ObjectRef, AbstractC0490 abstractC0490, InterfaceC4357<? super C04591> interfaceC4357) {
                super(2, interfaceC4357);
                this.$event = ref$ObjectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
                C04591 c04591 = new C04591(this.$event, null, interfaceC4357);
                c04591.L$0 = obj;
                return c04591;
            }

            @Override // p052.InterfaceC6554
            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                if (obj == null) {
                    return invoke((InterfaceC0493) null, (InterfaceC4357<? super C5176>) obj2);
                }
                C2942.m6394();
                return null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5185.m10210(obj);
                    if (this.L$0 != null) {
                        C2942.m6394();
                        return null;
                    }
                } else {
                    if (i != 1) {
                        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                    if (this.L$0 != null) {
                        C2942.m6394();
                        return null;
                    }
                    AbstractC5185.m10210(obj);
                    ref$ObjectRef.element = obj;
                }
                AbstractC0521 abstractC0521 = this.$event.element;
                if (abstractC0521 instanceof C0492) {
                    return C5176.f14739;
                }
                (abstractC0521 instanceof C0489 ? (C0489) abstractC0521 : null).getClass();
                throw null;
            }

            public final Object invoke(InterfaceC0493 interfaceC0493, InterfaceC4357<? super C5176> interfaceC4357) {
                return ((C04591) create(interfaceC0493, interfaceC4357)).invokeSuspend(C5176.f14739);
            }
        }
    }
}
