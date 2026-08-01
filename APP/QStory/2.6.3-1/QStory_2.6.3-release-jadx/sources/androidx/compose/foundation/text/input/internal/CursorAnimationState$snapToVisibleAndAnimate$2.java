package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.AbstractC2184;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", m556f = "CursorAnimationState.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Z"}, m152k = 3, m153mv = {2, 1, 0})
final class CursorAnimationState$snapToVisibleAndAnimate$2 extends SuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1712 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", m556f = "CursorAnimationState.kt", m557l = {72, 77, 79, 81}, m558m = "invokeSuspend", m559v = 1)
    public static final class C01001 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6284 $oldJob;
        int label;
        final /* synthetic */ C1712 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01001(InterfaceC6284 interfaceC6284, C1712 c1712, InterfaceC5189<? super C01001> interfaceC5189) {
            super(2, interfaceC5189);
            this.$oldJob = interfaceC6284;
            this.this$0 = c1712;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C01001(this.$oldJob, this.this$0, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01001) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
        
            if (kotlinx.coroutines.AbstractC6231.m11058(500, r10) != r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0067 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0017, B:36:0x0079, B:30:0x005e, B:33:0x0067, B:14:0x0024, B:15:0x0028, B:28:0x0058, B:29:0x005d, B:23:0x0040, B:25:0x004f), top: B:40:0x000d }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0076 -> B:36:0x0079). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    InterfaceC6284 interfaceC6284 = this.$oldJob;
                    if (interfaceC6284 != null) {
                        this.label = 1;
                        if (AbstractC6231.m11065(interfaceC6284, this) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    this.label = 3;
                    if (AbstractC6231.m11058(500L, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                } else {
                    if (i == 2) {
                        AbstractC6017.m10769(obj);
                        throw new KotlinNothingValueException();
                    }
                    if (i != 3) {
                        if (i != 4) {
                            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC6017.m10769(obj);
                        ((AbstractC2184) this.this$0.f2803).m2995(1.0f);
                        this.label = 3;
                        if (AbstractC6231.m11058(500L, this) != coroutineSingletons) {
                            ((AbstractC2184) this.this$0.f2803).m2995(0.0f);
                            this.label = 4;
                        }
                        return coroutineSingletons;
                    }
                    AbstractC6017.m10769(obj);
                    ((AbstractC2184) this.this$0.f2803).m2995(0.0f);
                    this.label = 4;
                }
                ((AbstractC2184) this.this$0.f2803).m2995(1.0f);
                if (!this.this$0.f2805) {
                    this.label = 2;
                    if (AbstractC6231.m11063(this) == coroutineSingletons) {
                    }
                    throw new KotlinNothingValueException();
                }
                this.label = 3;
                if (AbstractC6231.m11058(500L, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            } catch (Throwable th) {
                ((AbstractC2184) this.this$0.f2803).m2995(0.0f);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnimationState$snapToVisibleAndAnimate$2(C1712 c1712, InterfaceC5189<? super CursorAnimationState$snapToVisibleAndAnimate$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1712;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.this$0, interfaceC5189);
        cursorAnimationState$snapToVisibleAndAnimate$2.L$0 = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super Boolean> interfaceC5189) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        InterfaceC6284 interfaceC6284 = (InterfaceC6284) this.this$0.f2804.getAndSet(null);
        C1712 c1712 = this.this$0;
        AtomicReference atomicReference = c1712.f2804;
        C6249 c6249M11036 = AbstractC6231.m11036(interfaceC6233, null, null, new C01001(interfaceC6284, c1712, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, c6249M11036)) {
                z = true;
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
