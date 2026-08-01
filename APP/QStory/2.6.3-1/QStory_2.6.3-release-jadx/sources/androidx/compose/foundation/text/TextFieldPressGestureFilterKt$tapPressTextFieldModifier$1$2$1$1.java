package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.InterfaceC1393;
import androidx.compose.foundation.interaction.C1413;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.interaction.C1417;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.foundation.interaction.InterfaceC1423;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", m556f = "TextFieldPressGestureFilter.kt", m557l = {67}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC1421 $interactionSource;
    final /* synthetic */ InterfaceC2230 $pressedInteraction;
    final /* synthetic */ InterfaceC6233 $scope;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", m556f = "TextFieldPressGestureFilter.kt", m557l = {60, 64}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00901 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC1421 $interactionSource;
        final /* synthetic */ long $it;
        final /* synthetic */ InterfaceC2230 $pressedInteraction;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00901(InterfaceC2230 interfaceC2230, long j, InterfaceC1421 interfaceC1421, InterfaceC5189<? super C00901> interfaceC5189) {
            super(2, interfaceC5189);
            this.$pressedInteraction = interfaceC2230;
            this.$it = j;
            this.$interactionSource = interfaceC1421;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C00901(this.$pressedInteraction, this.$it, this.$interactionSource, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00901) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC2230 interfaceC2230;
            InterfaceC2230 interfaceC22302;
            C1416 c1416;
            InterfaceC1421 interfaceC1421;
            C1416 c14162;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1416 c14163 = (C1416) this.$pressedInteraction.getValue();
                if (c14163 == null) {
                    c1416 = new C1416(this.$it);
                    interfaceC1421 = this.$interactionSource;
                    if (interfaceC1421 != null) {
                    }
                    this.$pressedInteraction.setValue(c1416);
                    return C6008.f15084;
                }
                InterfaceC1421 interfaceC14212 = this.$interactionSource;
                interfaceC2230 = this.$pressedInteraction;
                C1413 c1413 = new C1413(c14163);
                if (interfaceC14212 != null) {
                    this.L$0 = interfaceC2230;
                    this.label = 1;
                    if (((C1414) interfaceC14212).m1914(c1413, this) != coroutineSingletons) {
                        interfaceC22302 = interfaceC2230;
                    }
                }
                interfaceC2230.setValue(null);
                c1416 = new C1416(this.$it);
                interfaceC1421 = this.$interactionSource;
                if (interfaceC1421 != null) {
                    this.L$0 = c1416;
                    this.label = 2;
                    if (((C1414) interfaceC1421).m1914(c1416, this) != coroutineSingletons) {
                        c14162 = c1416;
                        c1416 = c14162;
                    }
                }
                this.$pressedInteraction.setValue(c1416);
                return C6008.f15084;
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c14162 = (C1416) this.L$0;
                AbstractC6017.m10769(obj);
                c1416 = c14162;
                this.$pressedInteraction.setValue(c1416);
                return C6008.f15084;
            }
            interfaceC22302 = (InterfaceC2230) this.L$0;
            AbstractC6017.m10769(obj);
            interfaceC2230 = interfaceC22302;
            interfaceC2230.setValue(null);
            c1416 = new C1416(this.$it);
            interfaceC1421 = this.$interactionSource;
            if (interfaceC1421 != null) {
            }
            this.$pressedInteraction.setValue(c1416);
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", m556f = "TextFieldPressGestureFilter.kt", m557l = {76}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00912 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC1421 $interactionSource;
        final /* synthetic */ InterfaceC2230 $pressedInteraction;
        final /* synthetic */ boolean $success;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00912(InterfaceC2230 interfaceC2230, boolean z, InterfaceC1421 interfaceC1421, InterfaceC5189<? super C00912> interfaceC5189) {
            super(2, interfaceC5189);
            this.$pressedInteraction = interfaceC2230;
            this.$success = z;
            this.$interactionSource = interfaceC1421;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C00912(this.$pressedInteraction, this.$success, this.$interactionSource, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00912) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC2230 interfaceC2230;
            InterfaceC2230 interfaceC22302;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1416 c1416 = (C1416) this.$pressedInteraction.getValue();
                if (c1416 != null) {
                    boolean z = this.$success;
                    InterfaceC1421 interfaceC1421 = this.$interactionSource;
                    interfaceC2230 = this.$pressedInteraction;
                    InterfaceC1423 c1417 = z ? new C1417(c1416) : new C1413(c1416);
                    if (interfaceC1421 != null) {
                        this.L$0 = interfaceC2230;
                        this.label = 1;
                        if (((C1414) interfaceC1421).m1914(c1417, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        interfaceC22302 = interfaceC2230;
                    }
                    interfaceC2230.setValue(null);
                }
                return C6008.f15084;
            }
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC22302 = (InterfaceC2230) this.L$0;
            AbstractC6017.m10769(obj);
            interfaceC2230 = interfaceC22302;
            interfaceC2230.setValue(null);
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(InterfaceC6233 interfaceC6233, InterfaceC2230 interfaceC2230, InterfaceC1421 interfaceC1421, InterfaceC5189<? super TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$scope = interfaceC6233;
        this.$pressedInteraction = interfaceC2230;
        this.$interactionSource = interfaceC1421;
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m2148invoked4ec7I((InterfaceC1393) obj, ((C8158) obj2).f19886, (InterfaceC5189) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m2148invoked4ec7I(InterfaceC1393 interfaceC1393, long j, InterfaceC5189<? super C6008> interfaceC5189) {
        TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.$scope, this.$pressedInteraction, this.$interactionSource, interfaceC5189);
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.L$0 = interfaceC1393;
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.J$0 = j;
        return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC1393 interfaceC1393 = (InterfaceC1393) this.L$0;
            AbstractC6231.m11036(this.$scope, null, null, new C00901(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3);
            this.label = 1;
            obj = interfaceC1393.mo1891(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        AbstractC6231.m11036(this.$scope, null, null, new C00912(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3);
        return C6008.f15084;
    }
}
