package androidx.compose.material3;

import androidx.compose.animation.core.C1177;
import androidx.compose.foundation.interaction.InterfaceC1423;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p221.C8722;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2$1", m556f = "Chip.kt", m557l = {2562, 2564}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class SelectableChipElevation$animateElevation$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1177 $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC1423 $interaction;
    final /* synthetic */ InterfaceC2230 $lastInteraction$delegate;
    final /* synthetic */ float $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableChipElevation$animateElevation$2$1(C1177 c1177, float f, boolean z, InterfaceC1423 interfaceC1423, InterfaceC2230 interfaceC2230, InterfaceC5189<? super SelectableChipElevation$animateElevation$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$animatable = c1177;
        this.$target = f;
        this.$enabled = z;
        this.$interaction = interfaceC1423;
        this.$lastInteraction$delegate = interfaceC2230;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new SelectableChipElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.$interaction, this.$lastInteraction$delegate, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SelectableChipElevation$animateElevation$2$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r6.m1591(r2, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (androidx.compose.material3.internal.AbstractC1962.m2577(r1, r3, r6, r4, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (!C8722.m13877(((C8722) ((AbstractC2182) this.$animatable.f1470).getValue()).f22204, this.$target)) {
                if (this.$enabled) {
                    InterfaceC1423 interfaceC1423 = (InterfaceC1423) this.$lastInteraction$delegate.getValue();
                    C1177 c1177 = this.$animatable;
                    float f = this.$target;
                    InterfaceC1423 interfaceC14232 = this.$interaction;
                    this.label = 2;
                } else {
                    C1177 c11772 = this.$animatable;
                    C8722 c8722 = new C8722(this.$target);
                    this.label = 1;
                }
            }
            return C6008.f15084;
        }
        if (i != 1 && i != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        this.$lastInteraction$delegate.setValue(this.$interaction);
        return C6008.f15084;
    }
}
