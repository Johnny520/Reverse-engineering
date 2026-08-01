package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", m556f = "CoreTextField.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class CoreTextFieldKt$TextFieldCursorHandle$2$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1720 $manager;
    final /* synthetic */ InterfaceC1851 $observer;
    final /* synthetic */ InterfaceC2470 $this_pointerInput;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", m556f = "CoreTextField.kt", m557l = {1074}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00851 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC1851 $observer;
        final /* synthetic */ InterfaceC2470 $this_pointerInput;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00851(InterfaceC2470 interfaceC2470, InterfaceC1851 interfaceC1851, InterfaceC5189<? super C00851> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_pointerInput = interfaceC2470;
            this.$observer = interfaceC1851;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C00851(this.$this_pointerInput, this.$observer, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00851) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC2470 interfaceC2470 = this.$this_pointerInput;
                InterfaceC1851 interfaceC1851 = this.$observer;
                this.label = 1;
                if (AbstractC1821.m2469(interfaceC2470, interfaceC1851, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", m556f = "CoreTextField.kt", m557l = {1077}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00862 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1720 $manager;
        final /* synthetic */ InterfaceC2470 $this_pointerInput;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00862(InterfaceC2470 interfaceC2470, C1720 c1720, InterfaceC5189<? super C00862> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_pointerInput = interfaceC2470;
            this.$manager = c1720;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C6008 invokeSuspend$lambda$0(C1720 c1720, C8158 c8158) {
            c1720.m2315();
            return C6008.f15084;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C00862(this.$this_pointerInput, this.$manager, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00862) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC2470 interfaceC2470 = this.$this_pointerInput;
                C1799 c1799 = new C1799(this.$manager, 0);
                this.label = 1;
                if (AbstractC1344.m1831(interfaceC2470, c1799, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$TextFieldCursorHandle$2$1$1(InterfaceC2470 interfaceC2470, InterfaceC1851 interfaceC1851, C1720 c1720, InterfaceC5189<? super CoreTextFieldKt$TextFieldCursorHandle$2$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_pointerInput = interfaceC2470;
        this.$observer = interfaceC1851;
        this.$manager = c1720;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        CoreTextFieldKt$TextFieldCursorHandle$2$1$1 coreTextFieldKt$TextFieldCursorHandle$2$1$1 = new CoreTextFieldKt$TextFieldCursorHandle$2$1$1(this.$this_pointerInput, this.$observer, this.$manager, interfaceC5189);
        coreTextFieldKt$TextFieldCursorHandle$2$1$1.L$0 = obj;
        return coreTextFieldKt$TextFieldCursorHandle$2$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CoreTextFieldKt$TextFieldCursorHandle$2$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        AbstractC6231.m11036(interfaceC6233, null, coroutineStart, new C00851(this.$this_pointerInput, this.$observer, null), 1);
        AbstractC6231.m11036(interfaceC6233, null, coroutineStart, new C00862(this.$this_pointerInput, this.$manager, null), 1);
        return C6008.f15084;
    }
}
