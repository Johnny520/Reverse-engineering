package androidx.compose.foundation;

import androidx.compose.foundation.gestures.InterfaceC1393;
import androidx.compose.foundation.interaction.C1413;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.interaction.C1417;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.foundation.interaction.InterfaceC1423;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", m556f = "Clickable.kt", m557l = {2245, 2247, 2254, 2255, 2265}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class AbstractClickableNode$handlePressInteraction$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1421 $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ InterfaceC1393 $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AbstractC1892 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1(InterfaceC1393 interfaceC1393, long j, InterfaceC1421 interfaceC1421, AbstractC1892 abstractC1892, InterfaceC5189<? super AbstractClickableNode$handlePressInteraction$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_handlePressInteraction = interfaceC1393;
        this.$offset = j;
        this.$interactionSource = interfaceC1421;
        this.this$0 = abstractC1892;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.$this_handlePressInteraction, this.$offset, this.$interactionSource, this.this$0, interfaceC5189);
        abstractClickableNode$handlePressInteraction$2$1.L$0 = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (((androidx.compose.foundation.interaction.C1414) r15).m1914(r1, r14) != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
    
        if (((androidx.compose.foundation.interaction.C1414) r3).m1914(r15, r14) == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6284 interfaceC6284M11036;
        boolean z;
        C1417 c1417;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC6284M11036 = AbstractC6231.m11036((InterfaceC6233) this.L$0, null, null, new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.$offset, this.$interactionSource, null), 3);
            InterfaceC1393 interfaceC1393 = this.$this_handlePressInteraction;
            this.L$0 = interfaceC6284M11036;
            this.label = 1;
            obj = interfaceC1393.mo1891(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            interfaceC6284M11036 = (InterfaceC6284) this.L$0;
            AbstractC6017.m10769(obj);
        } else {
            if (i == 2) {
                z = this.Z$0;
                AbstractC6017.m10769(obj);
                if (z) {
                    C1416 c1416 = new C1416(this.$offset);
                    c1417 = new C1417(c1416);
                    InterfaceC1421 interfaceC1421 = this.$interactionSource;
                    this.L$0 = c1417;
                    this.label = 3;
                    if (((C1414) interfaceC1421).m1914(c1416, this) != coroutineSingletons) {
                        InterfaceC1421 interfaceC14212 = this.$interactionSource;
                        this.L$0 = null;
                        this.label = 4;
                    }
                    return coroutineSingletons;
                }
                this.this$0.f3460 = null;
                return C6008.f15084;
            }
            if (i != 3) {
                if (i != 4 && i != 5) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                this.this$0.f3460 = null;
                return C6008.f15084;
            }
            c1417 = (C1417) this.L$0;
            AbstractC6017.m10769(obj);
            InterfaceC1421 interfaceC142122 = this.$interactionSource;
            this.L$0 = null;
            this.label = 4;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!interfaceC6284M11036.mo11121()) {
            C1416 c14162 = this.this$0.f3460;
            if (c14162 != null) {
                InterfaceC1421 interfaceC14213 = this.$interactionSource;
                InterfaceC1423 c14172 = zBooleanValue ? new C1417(c14162) : new C1413(c14162);
                this.L$0 = null;
                this.label = 5;
            }
            this.this$0.f3460 = null;
            return C6008.f15084;
        }
        this.L$0 = null;
        this.Z$0 = zBooleanValue;
        this.label = 2;
        if (AbstractC6231.m11065(interfaceC6284M11036, this) != coroutineSingletons) {
            z = zBooleanValue;
            if (z) {
            }
            this.this$0.f3460 = null;
            return C6008.f15084;
        }
        return coroutineSingletons;
    }
}
