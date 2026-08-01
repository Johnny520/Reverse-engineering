package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.foundation.gestures.AbstractC1362;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", m556f = "LazyLayoutPager.kt", m557l = {296}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class LazyLayoutPagerKt$dragDirectionDetector$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC1609 $state;
    final /* synthetic */ InterfaceC2470 $this_pointerInput;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", m556f = "LazyLayoutPager.kt", m557l = {298, 302}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00771 extends RestrictedSuspendLambda implements InterfaceC7383 {
        final /* synthetic */ AbstractC1609 $state;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C00771(AbstractC1609 abstractC1609, InterfaceC5189<? super C00771> interfaceC5189) {
            super(2, interfaceC5189);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00771 c00771 = new C00771(null, interfaceC5189);
            c00771.L$0 = obj;
            return c00771;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00771) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        
            if (r12 == r0) goto L26;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    throw null;
                }
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C2478 c2478 = (C2478) this.L$2;
                C2478 c24782 = (C2478) this.L$1;
                ?? r6 = (InterfaceC2468) this.L$0;
                AbstractC6017.m10769(obj);
                do {
                    C2487 c2487 = (C2487) obj;
                    List list = c2487.f5197;
                    int size = list.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            c2478 = (C2478) c2487.f5197.get(0);
                            break;
                        }
                        if (!AbstractC2481.m3588((C2478) list.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                    if (c2478 != null) {
                        C8158.m13085(c2478.f5152, c24782.f5152);
                        throw null;
                    }
                    PointerEventPass pointerEventPass = PointerEventPass.Initial;
                    this.L$0 = r6;
                    this.L$1 = c24782;
                    this.L$2 = c2478;
                    this.label = 2;
                    r6 = (C2456) r6;
                    obj = r6.m3559(pointerEventPass, this);
                } while (obj != coroutineSingletons);
                return coroutineSingletons;
            }
            AbstractC6017.m10769(obj);
            InterfaceC2468 interfaceC2468 = (InterfaceC2468) this.L$0;
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            this.L$0 = interfaceC2468;
            this.label = 1;
            obj = AbstractC1344.m1836(interfaceC2468, false, pointerEventPass2, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$dragDirectionDetector$1$1(InterfaceC2470 interfaceC2470, AbstractC1609 abstractC1609, InterfaceC5189<? super LazyLayoutPagerKt$dragDirectionDetector$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_pointerInput = interfaceC2470;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new LazyLayoutPagerKt$dragDirectionDetector$1$1(this.$this_pointerInput, null, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((LazyLayoutPagerKt$dragDirectionDetector$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC2470 interfaceC2470 = this.$this_pointerInput;
            C00771 c00771 = new C00771(null, null);
            this.label = 1;
            if (AbstractC1362.m1871(interfaceC2470, c00771, this) == coroutineSingletons) {
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
