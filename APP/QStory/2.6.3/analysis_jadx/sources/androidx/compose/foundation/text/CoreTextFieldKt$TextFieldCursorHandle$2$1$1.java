package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.AbstractC0503;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class CoreTextFieldKt$TextFieldCursorHandle$2$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C0882 $manager;
    final /* synthetic */ InterfaceC1013 $observer;
    final /* synthetic */ InterfaceC1635 $this_pointerInput;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1074}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC1013 $observer;
        final /* synthetic */ InterfaceC1635 $this_pointerInput;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC1635 interfaceC1635, InterfaceC1013 interfaceC1013, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$this_pointerInput = interfaceC1635;
            this.$observer = interfaceC1013;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$this_pointerInput, this.$observer, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                InterfaceC1635 interfaceC1635 = this.$this_pointerInput;
                InterfaceC1013 interfaceC1013 = this.$observer;
                this.label = 1;
                if (AbstractC0983.m1909(interfaceC1635, interfaceC1013, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            return C5176.f14739;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1077}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ C0882 $manager;
        final /* synthetic */ InterfaceC1635 $this_pointerInput;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC1635 interfaceC1635, C0882 c0882, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$this_pointerInput = interfaceC1635;
            this.$manager = c0882;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5176 invokeSuspend$lambda$0(C0882 c0882, C7329 c7329) {
            c0882.m1755();
            return C5176.f14739;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass2(this.$this_pointerInput, this.$manager, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                InterfaceC1635 interfaceC1635 = this.$this_pointerInput;
                C0961 c0961 = new C0961(this.$manager, 0);
                this.label = 1;
                if (AbstractC0503.m1271(interfaceC1635, c0961, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$TextFieldCursorHandle$2$1$1(InterfaceC1635 interfaceC1635, InterfaceC1013 interfaceC1013, C0882 c0882, InterfaceC4357<? super CoreTextFieldKt$TextFieldCursorHandle$2$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_pointerInput = interfaceC1635;
        this.$observer = interfaceC1013;
        this.$manager = c0882;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        CoreTextFieldKt$TextFieldCursorHandle$2$1$1 coreTextFieldKt$TextFieldCursorHandle$2$1$1 = new CoreTextFieldKt$TextFieldCursorHandle$2$1$1(this.$this_pointerInput, this.$observer, this.$manager, interfaceC4357);
        coreTextFieldKt$TextFieldCursorHandle$2$1$1.L$0 = obj;
        return coreTextFieldKt$TextFieldCursorHandle$2$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CoreTextFieldKt$TextFieldCursorHandle$2$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        AbstractC5399.m10477(interfaceC5401, null, coroutineStart, new AnonymousClass1(this.$this_pointerInput, this.$observer, null), 1);
        AbstractC5399.m10477(interfaceC5401, null, coroutineStart, new AnonymousClass2(this.$this_pointerInput, this.$manager, null), 1);
        return C5176.f14739;
    }
}
