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
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.ComponentKt$BasicComponent$2$1", m556f = "Component.kt", m557l = {142, 145, 147}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class ComponentKt$BasicComponent$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2230 $holdDown;
    final /* synthetic */ boolean $holdDownState;
    final /* synthetic */ InterfaceC1421 $interactionSource;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentKt$BasicComponent$2$1(boolean z, InterfaceC2230 interfaceC2230, InterfaceC1421 interfaceC1421, InterfaceC5189<? super ComponentKt$BasicComponent$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$holdDownState = z;
        this.$holdDown = interfaceC2230;
        this.$interactionSource = interfaceC1421;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object invokeSuspend$releaseHoldDown(InterfaceC2230 interfaceC2230, InterfaceC1421 interfaceC1421, InterfaceC5189<? super C6008> interfaceC5189) {
        ComponentKt$BasicComponent$2$1$releaseHoldDown$1 componentKt$BasicComponent$2$1$releaseHoldDown$1;
        if (interfaceC5189 instanceof ComponentKt$BasicComponent$2$1$releaseHoldDown$1) {
            componentKt$BasicComponent$2$1$releaseHoldDown$1 = (ComponentKt$BasicComponent$2$1$releaseHoldDown$1) interfaceC5189;
            int i = componentKt$BasicComponent$2$1$releaseHoldDown$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                componentKt$BasicComponent$2$1$releaseHoldDown$1.label = i - Integer.MIN_VALUE;
            } else {
                componentKt$BasicComponent$2$1$releaseHoldDown$1 = new ComponentKt$BasicComponent$2$1$releaseHoldDown$1(interfaceC5189);
            }
        }
        Object obj = componentKt$BasicComponent$2$1$releaseHoldDown$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = componentKt$BasicComponent$2$1$releaseHoldDown$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C6877 c6877 = (C6877) interfaceC2230.getValue();
            if (c6877 != null) {
                C6876 c6876 = new C6876(c6877);
                componentKt$BasicComponent$2$1$releaseHoldDown$1.L$0 = interfaceC2230;
                componentKt$BasicComponent$2$1$releaseHoldDown$1.L$1 = null;
                componentKt$BasicComponent$2$1$releaseHoldDown$1.L$2 = null;
                componentKt$BasicComponent$2$1$releaseHoldDown$1.I$0 = 0;
                componentKt$BasicComponent$2$1$releaseHoldDown$1.label = 1;
                if (((C1414) interfaceC1421).m1914(c6876, componentKt$BasicComponent$2$1$releaseHoldDown$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C6008.f15084;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC2230 = (InterfaceC2230) componentKt$BasicComponent$2$1$releaseHoldDown$1.L$0;
        AbstractC6017.m10769(obj);
        interfaceC2230.setValue(null);
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ComponentKt$BasicComponent$2$1(this.$holdDownState, this.$holdDown, this.$interactionSource, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ComponentKt$BasicComponent$2$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (((androidx.compose.foundation.interaction.C1414) r1).m1914(r7, r6) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (invokeSuspend$releaseHoldDown(r1, r7, r6) == r0) goto L23;
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
            boolean z = this.$holdDownState;
            InterfaceC2230 interfaceC2230 = this.$holdDown;
            if (z) {
                InterfaceC1421 interfaceC1421 = this.$interactionSource;
                this.label = 1;
                if (invokeSuspend$releaseHoldDown(interfaceC2230, interfaceC1421, this) != coroutineSingletons) {
                    C6877 c6877 = new C6877();
                    this.$holdDown.setValue(c6877);
                    InterfaceC1421 interfaceC14212 = this.$interactionSource;
                    this.L$0 = null;
                    this.label = 2;
                }
            } else {
                InterfaceC1421 interfaceC14213 = this.$interactionSource;
                this.label = 3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
            } else if (i != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        AbstractC6017.m10769(obj);
        C6877 c68772 = new C6877();
        this.$holdDown.setValue(c68772);
        InterfaceC1421 interfaceC142122 = this.$interactionSource;
        this.L$0 = null;
        this.label = 2;
    }
}
