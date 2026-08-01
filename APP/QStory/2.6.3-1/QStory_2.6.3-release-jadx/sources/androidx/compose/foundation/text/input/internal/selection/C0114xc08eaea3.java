package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.InterfaceC1393;
import androidx.compose.foundation.interaction.InterfaceC1421;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
@InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1", m556f = "TextFieldSelectionState.kt", m557l = {1834, 1842}, m558m = "invokeSuspend", m559v = 1)
public final class C0114xc08eaea3 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1393 $$this$detectTapAndPress;
    final /* synthetic */ InterfaceC1421 $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ AbstractC1681 $this_defaultDetectTextFieldTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1$1", m556f = "TextFieldSelectionState.kt", m557l = {1826, 1831}, m558m = "invokeSuspend", m559v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC1421 $interactionSource;
        final /* synthetic */ long $offset;
        final /* synthetic */ AbstractC1681 $this_defaultDetectTextFieldTapGestures;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC1681 abstractC1681, long j, InterfaceC1421 interfaceC1421, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
            super(2, interfaceC5189);
            this.$offset = j;
            this.$interactionSource = interfaceC1421;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new AnonymousClass1(null, this.$offset, this.$interactionSource, interfaceC5189);
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
                throw null;
            }
            if (i == 1) {
                if (this.L$0 != null) {
                    throw new ClassCastException();
                }
                AbstractC6017.m10769(obj);
                throw null;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6017.m10769(obj);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0114xc08eaea3(InterfaceC1393 interfaceC1393, AbstractC1681 abstractC1681, long j, InterfaceC1421 interfaceC1421, InterfaceC5189<? super C0114xc08eaea3> interfaceC5189) {
        super(2, interfaceC5189);
        this.$$this$detectTapAndPress = interfaceC1393;
        this.$offset = j;
        this.$interactionSource = interfaceC1421;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        C0114xc08eaea3 c0114xc08eaea3 = new C0114xc08eaea3(this.$$this$detectTapAndPress, null, this.$offset, this.$interactionSource, interfaceC5189);
        c0114xc08eaea3.L$0 = obj;
        return c0114xc08eaea3;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((C0114xc08eaea3) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC6231.m11036((InterfaceC6233) this.L$0, null, null, new AnonymousClass1(null, this.$offset, this.$interactionSource, null), 3);
            InterfaceC1393 interfaceC1393 = this.$$this$detectTapAndPress;
            this.label = 1;
            obj = interfaceC1393.mo1891(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                throw null;
            }
            AbstractC6017.m10769(obj);
        }
        ((Boolean) obj).getClass();
        throw null;
    }
}
