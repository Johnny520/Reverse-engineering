package androidx.compose.foundation.text;

import androidx.compose.foundation.C1038;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.ui.text.input.C2014;
import androidx.compose.ui.text.input.C2025;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.C5284;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1", f = "CoreTextField.kt", l = {363}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class CoreTextFieldKt$CoreTextField$5$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C2025 $imeOptions;
    final /* synthetic */ C0882 $manager;
    final /* synthetic */ C0943 $state;
    final /* synthetic */ C2014 $textInputService;
    final /* synthetic */ InterfaceC1333 $writeable$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$5$1(C0943 c0943, InterfaceC1333 interfaceC1333, C2014 c2014, C0882 c0882, C2025 c2025, InterfaceC4357<? super CoreTextFieldKt$CoreTextField$5$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$state = c0943;
        this.$writeable$delegate = interfaceC1333;
        this.$textInputService = c2014;
        this.$manager = c0882;
        this.$imeOptions = c2025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(InterfaceC1333 interfaceC1333) {
        return ((Boolean) interfaceC1333.getValue()).booleanValue();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new CoreTextFieldKt$CoreTextField$5$1(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CoreTextFieldKt$CoreTextField$5$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.飘花落叶言子楪兰苏哲世] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                C5284 c5284M2470 = AbstractC1367.m2470(new C0953(this.$writeable$delegate, 0));
                C1038 c1038 = new C1038(this.$state, this.$textInputService, this.$manager, this.$imeOptions, 1);
                this.label = 1;
                if (c5284M2470.mo8453(c1038, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            AbstractC0983.m1910(this.$state);
            this = C5176.f14739;
            return this;
        } catch (Throwable th) {
            AbstractC0983.m1910(this.$state);
            throw th;
        }
    }
}
