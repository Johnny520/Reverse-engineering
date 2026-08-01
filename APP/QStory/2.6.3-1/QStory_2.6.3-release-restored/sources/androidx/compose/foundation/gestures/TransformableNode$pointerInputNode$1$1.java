package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import com.alibaba.fastjson2.C3775;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", m556f = "Transformable.kt", m557l = {199}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TransformableNode$pointerInputNode$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2470 $this_SuspendingPointerInputModifierNode;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC1331 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", m556f = "Transformable.kt", m557l = {201}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00482 extends RestrictedSuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6233 $$this$coroutineScope;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC1331 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00482(AbstractC1331 abstractC1331, InterfaceC6233 interfaceC6233, InterfaceC5189<? super C00482> interfaceC5189) {
            super(2, interfaceC5189);
            this.$$this$coroutineScope = interfaceC6233;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00482 c00482 = new C00482(null, this.$$this$coroutineScope, interfaceC5189);
            c00482.L$0 = obj;
            return c00482;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00482) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    throw null;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6017.m10769(obj);
                throw null;
            } catch (CancellationException e) {
                if (AbstractC6231.m11054(this.$$this$coroutineScope)) {
                    throw null;
                }
                throw e;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableNode$pointerInputNode$1$1(InterfaceC2470 interfaceC2470, AbstractC1331 abstractC1331, InterfaceC5189<? super TransformableNode$pointerInputNode$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_SuspendingPointerInputModifierNode = interfaceC2470;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TransformableNode$pointerInputNode$1$1 transformableNode$pointerInputNode$1$1 = new TransformableNode$pointerInputNode$1$1(this.$this_SuspendingPointerInputModifierNode, null, interfaceC5189);
        transformableNode$pointerInputNode$1$1.L$0 = obj;
        return transformableNode$pointerInputNode$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TransformableNode$pointerInputNode$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            AbstractC6231.m11036(interfaceC6233, null, CoroutineStart.UNDISPATCHED, new C00471(null, null), 1);
            InterfaceC2470 interfaceC2470 = this.$this_SuspendingPointerInputModifierNode;
            C00482 c00482 = new C00482(null, interfaceC6233, null);
            this.label = 1;
            if (AbstractC1362.m1871(interfaceC2470, c00482, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", m556f = "Transformable.kt", m557l = {177, 180}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00471 extends SuspendLambda implements InterfaceC7383 {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ AbstractC1331 this$0;

        public C00471(AbstractC1331 abstractC1331, InterfaceC5189<? super C00471> interfaceC5189) {
            super(2, interfaceC5189);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00471 c00471 = new C00471(null, interfaceC5189);
            c00471.L$0 = obj;
            return c00471;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00471) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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
                        this = (InterfaceC6233) this.L$0;
                        AbstractC6017.m10769(obj);
                        ref$ObjectRef.element = obj;
                        if (ref$ObjectRef2.element instanceof C1329) {
                            throw null;
                        }
                    } else {
                        if (i != 2) {
                            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (InterfaceC6233) this.L$0;
                        AbstractC6017.m10769(obj);
                    }
                } catch (CancellationException unused) {
                }
            } else {
                AbstractC6017.m10769(obj);
                this = (InterfaceC6233) this.L$0;
            }
            if (!AbstractC6231.m11054(this)) {
                return C6008.f15084;
            }
            new Ref$ObjectRef();
            throw null;
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;)V"}, m152k = 3, m153mv = {2, 1, 0})
        @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", m556f = "Transformable.kt", m557l = {190}, m558m = "invokeSuspend", m559v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ Ref$ObjectRef<AbstractC1362> $event;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ AbstractC1331 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref$ObjectRef<AbstractC1362> ref$ObjectRef, AbstractC1331 abstractC1331, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
                super(2, interfaceC5189);
                this.$event = ref$ObjectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, null, interfaceC5189);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p068.InterfaceC7383
            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                if (obj == null) {
                    return invoke((InterfaceC1334) null, (InterfaceC5189<? super C6008>) obj2);
                }
                C3775.m6954();
                return null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    if (this.L$0 != null) {
                        C3775.m6954();
                        return null;
                    }
                } else {
                    if (i != 1) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                    if (this.L$0 != null) {
                        C3775.m6954();
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                    ref$ObjectRef.element = obj;
                }
                AbstractC1362 abstractC1362 = this.$event.element;
                if (abstractC1362 instanceof C1333) {
                    return C6008.f15084;
                }
                (abstractC1362 instanceof C1330 ? (C1330) abstractC1362 : null).getClass();
                throw null;
            }

            public final Object invoke(InterfaceC1334 interfaceC1334, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass1) create(interfaceC1334, interfaceC5189)).invokeSuspend(C6008.f15084);
            }
        }
    }
}
