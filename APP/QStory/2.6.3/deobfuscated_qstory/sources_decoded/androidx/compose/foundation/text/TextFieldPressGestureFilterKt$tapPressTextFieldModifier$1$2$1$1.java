package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.InterfaceC0552;
import androidx.compose.foundation.interaction.C0572;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.C0576;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.foundation.interaction.InterfaceC0582;
import androidx.compose.runtime.InterfaceC1395;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC0580 $interactionSource;
    final /* synthetic */ InterfaceC1395 $pressedInteraction;
    final /* synthetic */ InterfaceC5401 $scope;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, 64}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC0580 $interactionSource;
        final /* synthetic */ long $it;
        final /* synthetic */ InterfaceC1395 $pressedInteraction;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC1395 interfaceC1395, long j, InterfaceC0580 interfaceC0580, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$pressedInteraction = interfaceC1395;
            this.$it = j;
            this.$interactionSource = interfaceC0580;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$pressedInteraction, this.$it, this.$interactionSource, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L15
                java.lang.Object r0 = r7.L$0
                androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r0 = (androidx.compose.foundation.interaction.C0575) r0
                kotlin.AbstractC5185.m10210(r8)
                goto L66
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5925.m11311(r7)
                return r2
            L1b:
                java.lang.Object r1 = r7.L$0
                androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r1 = (androidx.compose.runtime.InterfaceC1395) r1
                kotlin.AbstractC5185.m10210(r8)
                goto L49
            L23:
                kotlin.AbstractC5185.m10210(r8)
                androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r8 = r7.$pressedInteraction
                java.lang.Object r8 = r8.getValue()
                androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r8 = (androidx.compose.foundation.interaction.C0575) r8
                if (r8 == 0) goto L4d
                androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r1 = r7.$interactionSource
                androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r5 = r7.$pressedInteraction
                androidx.compose.foundation.interaction.飘花落叶言子楪哲世兰苏 r6 = new androidx.compose.foundation.interaction.飘花落叶言子楪哲世兰苏
                r6.<init>(r8)
                if (r1 == 0) goto L4a
                r7.L$0 = r5
                r7.label = r4
                androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r1 = (androidx.compose.foundation.interaction.C0573) r1
                java.lang.Object r8 = r1.m1354(r6, r7)
                if (r8 != r0) goto L48
                goto L64
            L48:
                r1 = r5
            L49:
                r5 = r1
            L4a:
                r5.setValue(r2)
            L4d:
                androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r8 = new androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰
                long r1 = r7.$it
                r8.<init>(r1)
                androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r1 = r7.$interactionSource
                if (r1 == 0) goto L67
                r7.L$0 = r8
                r7.label = r3
                androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r1 = (androidx.compose.foundation.interaction.C0573) r1
                java.lang.Object r1 = r1.m1354(r8, r7)
                if (r1 != r0) goto L65
            L64:
                return r0
            L65:
                r0 = r8
            L66:
                r8 = r0
            L67:
                androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r7 = r7.$pressedInteraction
                r7.setValue(r8)
                kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC0580 $interactionSource;
        final /* synthetic */ InterfaceC1395 $pressedInteraction;
        final /* synthetic */ boolean $success;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC1395 interfaceC1395, boolean z, InterfaceC0580 interfaceC0580, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$pressedInteraction = interfaceC1395;
            this.$success = z;
            this.$interactionSource = interfaceC0580;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass2(this.$pressedInteraction, this.$success, this.$interactionSource, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC1395 interfaceC1395;
            InterfaceC1395 interfaceC13952;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                C0575 c0575 = (C0575) this.$pressedInteraction.getValue();
                if (c0575 != null) {
                    boolean z = this.$success;
                    InterfaceC0580 interfaceC0580 = this.$interactionSource;
                    interfaceC1395 = this.$pressedInteraction;
                    InterfaceC0582 c0576 = z ? new C0576(c0575) : new C0572(c0575);
                    if (interfaceC0580 != null) {
                        this.L$0 = interfaceC1395;
                        this.label = 1;
                        if (((C0573) interfaceC0580).m1354(c0576, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        interfaceC13952 = interfaceC1395;
                    }
                    interfaceC1395.setValue(null);
                }
                return C5176.f14739;
            }
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC13952 = (InterfaceC1395) this.L$0;
            AbstractC5185.m10210(obj);
            interfaceC1395 = interfaceC13952;
            interfaceC1395.setValue(null);
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(InterfaceC5401 interfaceC5401, InterfaceC1395 interfaceC1395, InterfaceC0580 interfaceC0580, InterfaceC4357<? super TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$scope = interfaceC5401;
        this.$pressedInteraction = interfaceC1395;
        this.$interactionSource = interfaceC0580;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m1588invoked4ec7I((InterfaceC0552) obj, ((C7329) obj2).f19541, (InterfaceC4357) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m1588invoked4ec7I(InterfaceC0552 interfaceC0552, long j, InterfaceC4357<? super C5176> interfaceC4357) {
        TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.$scope, this.$pressedInteraction, this.$interactionSource, interfaceC4357);
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.L$0 = interfaceC0552;
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.J$0 = j;
        return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC0552 interfaceC0552 = (InterfaceC0552) this.L$0;
            AbstractC5399.m10477(this.$scope, null, null, new AnonymousClass1(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3);
            this.label = 1;
            obj = interfaceC0552.mo1331(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        AbstractC5399.m10477(this.$scope, null, null, new AnonymousClass2(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3);
        return C5176.f14739;
    }
}
