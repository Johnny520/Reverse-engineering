package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.AbstractC1344;
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
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", m556f = "TextFieldSelectionState.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;"}, m152k = 3, m153mv = {2, 1, 0})
final class TextFieldSelectionState$cursorHandleGestures$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2470 $this_cursorHandleGestures;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC1681 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", m556f = "TextFieldSelectionState.kt", m557l = {493}, m558m = "invokeSuspend", m559v = 1)
    public static final class C01061 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC2470 $this_cursorHandleGestures;
        int label;
        final /* synthetic */ AbstractC1681 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01061(AbstractC1681 abstractC1681, InterfaceC2470 interfaceC2470, InterfaceC5189<? super C01061> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_cursorHandleGestures = interfaceC2470;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C01061(null, this.$this_cursorHandleGestures, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01061) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
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

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", m556f = "TextFieldSelectionState.kt", m557l = {494}, m558m = "invokeSuspend", m559v = 1)
    public static final class C01072 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC2470 $this_cursorHandleGestures;
        int label;
        final /* synthetic */ AbstractC1681 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01072(AbstractC1681 abstractC1681, InterfaceC2470 interfaceC2470, InterfaceC5189<? super C01072> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_cursorHandleGestures = interfaceC2470;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C01072(null, this.$this_cursorHandleGestures, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01072) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
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

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", m556f = "TextFieldSelectionState.kt", m557l = {496}, m558m = "invokeSuspend", m559v = 1)
    public static final class C01083 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC2470 $this_cursorHandleGestures;
        int label;
        final /* synthetic */ AbstractC1681 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01083(InterfaceC2470 interfaceC2470, AbstractC1681 abstractC1681, InterfaceC5189<? super C01083> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_cursorHandleGestures = interfaceC2470;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C6008 invokeSuspend$lambda$0(AbstractC1681 abstractC1681, C8158 c8158) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C01083(this.$this_cursorHandleGestures, null, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01083) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC2470 interfaceC2470 = this.$this_cursorHandleGestures;
                C1682 c1682 = new C1682(0);
                this.label = 1;
                if (AbstractC1344.m1831(interfaceC2470, c1682, this) == coroutineSingletons) {
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
    public TextFieldSelectionState$cursorHandleGestures$2(AbstractC1681 abstractC1681, InterfaceC2470 interfaceC2470, InterfaceC5189<? super TextFieldSelectionState$cursorHandleGestures$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_cursorHandleGestures = interfaceC2470;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TextFieldSelectionState$cursorHandleGestures$2 textFieldSelectionState$cursorHandleGestures$2 = new TextFieldSelectionState$cursorHandleGestures$2(null, this.$this_cursorHandleGestures, interfaceC5189);
        textFieldSelectionState$cursorHandleGestures$2.L$0 = obj;
        return textFieldSelectionState$cursorHandleGestures$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super InterfaceC6284> interfaceC5189) {
        return ((TextFieldSelectionState$cursorHandleGestures$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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
        AbstractC6231.m11036(interfaceC6233, null, coroutineStart, new C01061(null, this.$this_cursorHandleGestures, null), 1);
        AbstractC6231.m11036(interfaceC6233, null, coroutineStart, new C01072(null, this.$this_cursorHandleGestures, null), 1);
        return AbstractC6231.m11036(interfaceC6233, null, coroutineStart, new C01083(this.$this_cursorHandleGestures, null, null), 1);
    }
}
