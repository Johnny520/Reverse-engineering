package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.AbstractC1362;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import io.ktor.client.plugins.api.C4718;
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
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", m556f = "TextFieldSelectionState.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;"}, m152k = 3, m153mv = {2, 1, 0})
final class TextFieldSelectionState$selectionHandleGestures$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ InterfaceC2470 $this_selectionHandleGestures;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC1681 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", m556f = "TextFieldSelectionState.kt", m557l = {506}, m558m = "invokeSuspend", m559v = 1)
    public static final class C01091 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC2470 $this_selectionHandleGestures;
        int label;
        final /* synthetic */ AbstractC1681 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01091(AbstractC1681 abstractC1681, InterfaceC2470 interfaceC2470, InterfaceC5189<? super C01091> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_selectionHandleGestures = interfaceC2470;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C01091(null, this.$this_selectionHandleGestures, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01091) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", m556f = "TextFieldSelectionState.kt", m557l = {508}, m558m = "invokeSuspend", m559v = 1)
    public static final class C01102 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ InterfaceC2470 $this_selectionHandleGestures;
        int label;
        final /* synthetic */ AbstractC1681 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01102(InterfaceC2470 interfaceC2470, AbstractC1681 abstractC1681, boolean z, InterfaceC5189<? super C01102> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_selectionHandleGestures = interfaceC2470;
            this.$isStartHandle = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C6008 invokeSuspend$lambda$0(AbstractC1681 abstractC1681) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C01102(this.$this_selectionHandleGestures, null, this.$isStartHandle, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01102) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C6008 c6008 = C6008.f15084;
            int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    return c6008;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            InterfaceC2470 interfaceC2470 = this.$this_selectionHandleGestures;
            C4718 c4718 = new C4718(3);
            C1684 c1684 = new C1684(i2);
            this.label = 1;
            Object objM1871 = AbstractC1362.m1871(interfaceC2470, new PressDownGestureKt$detectPressDownGesture$2(c4718, c1684, null), this);
            if (objM1871 != coroutineSingletons) {
                objM1871 = c6008;
            }
            return objM1871 == coroutineSingletons ? coroutineSingletons : c6008;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$4 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$4", m556f = "TextFieldSelectionState.kt", m557l = {526}, m558m = "invokeSuspend", m559v = 1)
    public static final class C01114 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ InterfaceC2470 $this_selectionHandleGestures;
        int label;
        final /* synthetic */ AbstractC1681 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01114(AbstractC1681 abstractC1681, InterfaceC2470 interfaceC2470, boolean z, InterfaceC5189<? super C01114> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_selectionHandleGestures = interfaceC2470;
            this.$isStartHandle = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C01114(null, this.$this_selectionHandleGestures, this.$isStartHandle, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01114) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$selectionHandleGestures$2(AbstractC1681 abstractC1681, InterfaceC2470 interfaceC2470, boolean z, InterfaceC5189<? super TextFieldSelectionState$selectionHandleGestures$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_selectionHandleGestures = interfaceC2470;
        this.$isStartHandle = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(AbstractC1681 abstractC1681, Throwable th) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TextFieldSelectionState$selectionHandleGestures$2 textFieldSelectionState$selectionHandleGestures$2 = new TextFieldSelectionState$selectionHandleGestures$2(null, this.$this_selectionHandleGestures, this.$isStartHandle, interfaceC5189);
        textFieldSelectionState$selectionHandleGestures$2.L$0 = obj;
        return textFieldSelectionState$selectionHandleGestures$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super InterfaceC6284> interfaceC5189) {
        return ((TextFieldSelectionState$selectionHandleGestures$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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
        AbstractC6231.m11036(interfaceC6233, null, coroutineStart, new C01091(null, this.$this_selectionHandleGestures, null), 1);
        AbstractC6231.m11036(interfaceC6233, null, coroutineStart, new C01102(this.$this_selectionHandleGestures, null, this.$isStartHandle, null), 1).mo11118(new C1682(1));
        return AbstractC6231.m11036(interfaceC6233, null, coroutineStart, new C01114(null, this.$this_selectionHandleGestures, this.$isStartHandle, null), 1);
    }
}
