package androidx.compose.foundation.text;

import androidx.compose.foundation.C1038;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.ui.text.input.C2014;
import androidx.compose.ui.text.input.C2025;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.C5283;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1", f = "CoreTextField.kt", l = {363}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class CoreTextFieldKt$CoreTextField$5$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C2025 $imeOptions;
    final /* synthetic */ C0882 $manager;
    final /* synthetic */ C0943 $state;
    final /* synthetic */ C2014 $textInputService;
    final /* synthetic */ InterfaceC1333 $writeable$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$5$1(C0943 c0943, InterfaceC1333 interfaceC1333, C2014 c2014, C0882 c0882, C2025 c2025, InterfaceC4356<? super CoreTextFieldKt$CoreTextField$5$1> interfaceC4356) {
        super(2, interfaceC4356);
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
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new CoreTextFieldKt$CoreTextField$5$1(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CoreTextFieldKt$CoreTextField$5$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.飘花落叶言子楪兰苏哲世] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5184.m10206(obj);
                C5283 c5283M2461 = AbstractC1367.m2461(new C0953(this.$writeable$delegate, 0));
                C1038 c1038 = new C1038(this.$state, this.$textInputService, this.$manager, this.$imeOptions, 1);
                this.label = 1;
                if (c5283M2461.mo8463(c1038, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
            }
            AbstractC0983.m1900(this.$state);
            this = C5175.f14739;
            return this;
        } catch (Throwable th) {
            AbstractC0983.m1900(this.$state);
            throw th;
        }
    }
}
