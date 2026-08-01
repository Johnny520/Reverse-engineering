package androidx.compose.foundation.text;

import androidx.compose.foundation.C1876;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.text.input.C2848;
import androidx.compose.p001ui.text.input.C2859;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2168;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.C6116;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1", m556f = "CoreTextField.kt", m557l = {363}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class CoreTextFieldKt$CoreTextField$5$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C2859 $imeOptions;
    final /* synthetic */ C1720 $manager;
    final /* synthetic */ C1781 $state;
    final /* synthetic */ C2848 $textInputService;
    final /* synthetic */ InterfaceC2168 $writeable$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$5$1(C1781 c1781, InterfaceC2168 interfaceC2168, C2848 c2848, C1720 c1720, C2859 c2859, InterfaceC5189<? super CoreTextFieldKt$CoreTextField$5$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$state = c1781;
        this.$writeable$delegate = interfaceC2168;
        this.$textInputService = c2848;
        this.$manager = c1720;
        this.$imeOptions = c2859;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(InterfaceC2168 interfaceC2168) {
        return ((Boolean) interfaceC2168.getValue()).booleanValue();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new CoreTextFieldKt$CoreTextField$5$1(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CoreTextFieldKt$CoreTextField$5$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.飘花落叶言子楪兰苏哲世] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C6116 c6116M3030 = AbstractC2202.m3030(new C1791(this.$writeable$delegate, 0));
                C1876 c1876 = new C1876(this.$state, this.$textInputService, this.$manager, this.$imeOptions, 1);
                this.label = 1;
                if (c6116M3030.mo9012(c1876, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            AbstractC1821.m2470(this.$state);
            this = C6008.f15084;
            return this;
        } catch (Throwable th) {
            AbstractC1821.m2470(this.$state);
            throw th;
        }
    }
}
