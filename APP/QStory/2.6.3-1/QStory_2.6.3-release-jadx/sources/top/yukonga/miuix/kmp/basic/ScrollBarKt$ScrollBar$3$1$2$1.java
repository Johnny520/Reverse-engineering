package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1208;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2232;
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

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$3$1$2$1", m556f = "ScrollBar.kt", m557l = {308, 309}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class ScrollBarKt$ScrollBar$3$1$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2232 $opacity$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollBarKt$ScrollBar$3$1$2$1(InterfaceC2232 interfaceC2232, InterfaceC5189<? super ScrollBarKt$ScrollBar$3$1$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$opacity$delegate = interfaceC2232;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(InterfaceC2232 interfaceC2232, float f, float f2) {
        ((AbstractC2184) interfaceC2232).m2995(f);
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ScrollBarKt$ScrollBar$3$1$2$1(this.$opacity$delegate, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ScrollBarKt$ScrollBar$3$1$2$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (androidx.compose.animation.core.AbstractC1176.m1584(1.0f, 0.0f, r7, r8, r11, 4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.label = 1;
            if (AbstractC6231.m11058(1000L, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C1208 c1208M1573 = AbstractC1176.m1573(500, 6, null);
        C6835 c6835 = new C6835(this.$opacity$delegate, i2);
        this.label = 2;
    }
}
