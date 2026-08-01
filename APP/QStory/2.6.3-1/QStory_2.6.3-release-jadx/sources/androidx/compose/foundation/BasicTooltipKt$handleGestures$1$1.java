package androidx.compose.foundation;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.foundation.gestures.AbstractC1362;
import androidx.compose.foundation.gestures.AbstractC1383;
import androidx.compose.foundation.gestures.C1384;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import com.android.p002dx.p005io.Opcodes;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", m556f = "BasicTooltip.kt", m557l = {195}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class BasicTooltipKt$handleGestures$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1909 $state;
    final /* synthetic */ InterfaceC2470 $this_pointerInput;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1", m556f = "BasicTooltip.kt", m557l = {199, Opcodes.REM_FLOAT_2ADDR, Opcodes.ADD_INT_LIT16}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00241 extends RestrictedSuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6233 $$this$coroutineScope;
        final /* synthetic */ InterfaceC1909 $state;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
        @InterfaceC7691(m555c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1", m556f = "BasicTooltip.kt", m557l = {Opcodes.MUL_DOUBLE_2ADDR}, m558m = "invokeSuspend", m559v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ InterfaceC1909 $state;
            int label;

            public AnonymousClass1(InterfaceC1909 interfaceC1909, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
                super(2, interfaceC5189);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass1(null, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    MutatePriority mutatePriority = MutatePriority.Default;
                    this.label = 1;
                    throw null;
                }
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00241(InterfaceC6233 interfaceC6233, InterfaceC1909 interfaceC1909, InterfaceC5189<? super C00241> interfaceC5189) {
            super(2, interfaceC5189);
            this.$$this$coroutineScope = interfaceC6233;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00241 c00241 = new C00241(this.$$this$coroutineScope, null, interfaceC5189);
            c00241.L$0 = obj;
            return c00241;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00241) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
        
            if (r9 == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PointerEventPass pointerEventPass;
            InterfaceC2468 interfaceC2468;
            InterfaceC2468 interfaceC24682;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC2468 interfaceC24683 = (InterfaceC2468) this.L$0;
                pointerEventPass = PointerEventPass.Initial;
                this.L$0 = interfaceC24683;
                this.L$1 = pointerEventPass;
                this.label = 1;
                Object objM1835 = AbstractC1344.m1835(interfaceC24683, pointerEventPass, this, 1);
                if (objM1835 != coroutineSingletons) {
                    interfaceC2468 = interfaceC24683;
                    obj = objM1835;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i == 2) {
                    pointerEventPass = (PointerEventPass) this.L$1;
                    interfaceC24682 = (InterfaceC2468) this.L$0;
                    AbstractC6017.m10769(obj);
                    if (((AbstractC1383) obj) instanceof C1384) {
                        AbstractC6231.m11036(this.$$this$coroutineScope, null, null, new AnonymousClass1(null, null), 3);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        obj = ((C2456) interfaceC24682).m3559(pointerEventPass, this);
                    }
                    return C6008.f15084;
                }
                if (i != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                List list = ((C2487) obj).f5197;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C2478) list.get(i2)).m3584();
                }
                return C6008.f15084;
            }
            pointerEventPass = (PointerEventPass) this.L$1;
            interfaceC2468 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
            int i3 = ((C2478) obj).f5164;
            if (i3 == 1 || i3 == 3) {
                this.L$0 = interfaceC2468;
                this.L$1 = pointerEventPass;
                this.label = 2;
                obj = AbstractC1344.m1841(interfaceC2468, pointerEventPass, this);
                if (obj != coroutineSingletons) {
                    interfaceC24682 = interfaceC2468;
                    if (((AbstractC1383) obj) instanceof C1384) {
                    }
                }
                return coroutineSingletons;
            }
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$handleGestures$1$1(InterfaceC2470 interfaceC2470, InterfaceC1909 interfaceC1909, InterfaceC5189<? super BasicTooltipKt$handleGestures$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_pointerInput = interfaceC2470;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        BasicTooltipKt$handleGestures$1$1 basicTooltipKt$handleGestures$1$1 = new BasicTooltipKt$handleGestures$1$1(this.$this_pointerInput, null, interfaceC5189);
        basicTooltipKt$handleGestures$1$1.L$0 = obj;
        return basicTooltipKt$handleGestures$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((BasicTooltipKt$handleGestures$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            InterfaceC2470 interfaceC2470 = this.$this_pointerInput;
            C00241 c00241 = new C00241(interfaceC6233, null, null);
            this.label = 1;
            if (AbstractC1362.m1871(interfaceC2470, c00241, this) == coroutineSingletons) {
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
