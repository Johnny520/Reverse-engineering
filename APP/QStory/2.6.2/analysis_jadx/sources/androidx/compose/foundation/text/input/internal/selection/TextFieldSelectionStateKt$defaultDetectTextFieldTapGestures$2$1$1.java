package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.InterfaceC0552;
import androidx.compose.foundation.interaction.InterfaceC0580;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
@InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1", f = "TextFieldSelectionState.kt", l = {1834, 1842}, m = "invokeSuspend", v = 1)
public final class TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC0552 $$this$detectTapAndPress;
    final /* synthetic */ InterfaceC0580 $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ AbstractC0843 $this_defaultDetectTextFieldTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1$1", f = "TextFieldSelectionState.kt", l = {1826, 1831}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC0580 $interactionSource;
        final /* synthetic */ long $offset;
        final /* synthetic */ AbstractC0843 $this_defaultDetectTextFieldTapGestures;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC0843 abstractC0843, long j, InterfaceC0580 interfaceC0580, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$offset = j;
            this.$interactionSource = interfaceC0580;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(null, this.$offset, this.$interactionSource, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                throw null;
            }
            if (i == 1) {
                if (this.L$0 != null) {
                    throw new ClassCastException();
                }
                AbstractC5184.m10206(obj);
                throw null;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5184.m10206(obj);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1(InterfaceC0552 interfaceC0552, AbstractC0843 abstractC0843, long j, InterfaceC0580 interfaceC0580, InterfaceC4356<? super TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$$this$detectTapAndPress = interfaceC0552;
        this.$offset = j;
        this.$interactionSource = interfaceC0580;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 = new TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1(this.$$this$detectTapAndPress, null, this.$offset, this.$interactionSource, interfaceC4356);
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1.L$0 = obj;
        return textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC5398.m10473((InterfaceC5400) this.L$0, null, null, new AnonymousClass1(null, this.$offset, this.$interactionSource, null), 3);
            InterfaceC0552 interfaceC0552 = this.$$this$detectTapAndPress;
            this.label = 1;
            obj = interfaceC0552.mo1321(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
                throw null;
            }
            AbstractC5184.m10206(obj);
        }
        ((Boolean) obj).getClass();
        throw null;
    }
}
