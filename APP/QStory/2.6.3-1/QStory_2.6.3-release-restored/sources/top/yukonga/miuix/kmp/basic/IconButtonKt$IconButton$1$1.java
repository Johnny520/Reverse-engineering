package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.InterfaceC1421;
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
import top.suzhelan.qstory.hook.item.C6755;
import top.yukonga.miuix.kmp.interfaces.C6876;
import top.yukonga.miuix.kmp.interfaces.C6877;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.IconButtonKt$IconButton$1$1", m556f = "IconButton.kt", m557l = {61, 64}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class IconButtonKt$IconButton$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2230 $holdDown;
    final /* synthetic */ boolean $holdDownState;
    final /* synthetic */ InterfaceC1421 $interactionSource;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonKt$IconButton$1$1(boolean z, InterfaceC2230 interfaceC2230, InterfaceC1421 interfaceC1421, InterfaceC5189<? super IconButtonKt$IconButton$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$holdDownState = z;
        this.$holdDown = interfaceC2230;
        this.$interactionSource = interfaceC1421;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new IconButtonKt$IconButton$1$1(this.$holdDownState, this.$holdDown, this.$interactionSource, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((IconButtonKt$IconButton$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (((androidx.compose.foundation.interaction.C1414) r1).m1914(r7, r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2230 interfaceC2230;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            boolean z = this.$holdDownState;
            InterfaceC2230 interfaceC22302 = this.$holdDown;
            if (z) {
                C6877 c6877 = new C6877();
                interfaceC22302.setValue(c6877);
                InterfaceC1421 interfaceC1421 = this.$interactionSource;
                this.L$0 = null;
                this.label = 1;
            } else {
                C6877 c68772 = (C6877) interfaceC22302.getValue();
                if (c68772 != null) {
                    InterfaceC1421 interfaceC14212 = this.$interactionSource;
                    InterfaceC2230 interfaceC22303 = this.$holdDown;
                    C6876 c6876 = new C6876(c68772);
                    this.L$0 = interfaceC22303;
                    this.L$1 = null;
                    this.I$0 = 0;
                    this.label = 2;
                    if (((C1414) interfaceC14212).m1914(c6876, this) != coroutineSingletons) {
                        interfaceC2230 = interfaceC22303;
                        interfaceC2230.setValue(null);
                    }
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            AbstractC6017.m10769(obj);
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC2230 = (InterfaceC2230) this.L$0;
            AbstractC6017.m10769(obj);
            interfaceC2230.setValue(null);
        }
        return C6008.f15084;
    }
}
