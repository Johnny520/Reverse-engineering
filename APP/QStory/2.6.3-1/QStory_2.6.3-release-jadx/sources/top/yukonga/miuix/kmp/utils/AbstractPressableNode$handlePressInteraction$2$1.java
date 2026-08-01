package top.yukonga.miuix.kmp.utils;

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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$handlePressInteraction$2$1", m556f = "Pressable.kt", m557l = {401, 403, 410, 411, 420}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class AbstractPressableNode$handlePressInteraction$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1421 $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ InterfaceC1393 $this_handlePressInteraction;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ AbstractC6892 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractPressableNode$handlePressInteraction$2$1(InterfaceC1393 interfaceC1393, long j, InterfaceC1421 interfaceC1421, AbstractC6892 abstractC6892, InterfaceC5189<? super AbstractPressableNode$handlePressInteraction$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_handlePressInteraction = interfaceC1393;
        this.$offset = j;
        this.$interactionSource = interfaceC1421;
        this.this$0 = abstractC6892;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        AbstractPressableNode$handlePressInteraction$2$1 abstractPressableNode$handlePressInteraction$2$1 = new AbstractPressableNode$handlePressInteraction$2$1(this.$this_handlePressInteraction, this.$offset, this.$interactionSource, this.this$0, interfaceC5189);
        abstractPressableNode$handlePressInteraction$2$1.L$0 = obj;
        return abstractPressableNode$handlePressInteraction$2$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AbstractPressableNode$handlePressInteraction$2$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (((androidx.compose.foundation.interaction.C1414) r4).m1914(r3, r16) != r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0105, code lost:
    
        if (((androidx.compose.foundation.interaction.C1414) r5).m1914(r6, r16) == r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6284 interfaceC6284M11036;
        Object objMo1891;
        boolean z;
        C1417 c1417;
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC6284M11036 = AbstractC6231.m11036(interfaceC6233, null, null, new AbstractPressableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.$offset, this.$interactionSource, null), 3);
            InterfaceC1393 interfaceC1393 = this.$this_handlePressInteraction;
            this.L$0 = null;
            this.L$1 = interfaceC6284M11036;
            this.label = 1;
            objMo1891 = interfaceC1393.mo1891(this);
            if (objMo1891 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            interfaceC6284M11036 = (InterfaceC6284) this.L$1;
            AbstractC6017.m10769(obj);
            objMo1891 = obj;
        } else {
            if (i == 2) {
                z = this.Z$0;
                AbstractC6017.m10769(obj);
                if (z) {
                    C1416 c1416 = new C1416(this.$offset);
                    C1417 c14172 = new C1417(c1416);
                    InterfaceC1421 interfaceC1421 = this.$interactionSource;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = c14172;
                    this.Z$0 = z;
                    this.label = 3;
                    if (((C1414) interfaceC1421).m1914(c1416, this) != coroutineSingletons) {
                        c1417 = c14172;
                        InterfaceC1421 interfaceC14212 = this.$interactionSource;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z;
                        this.label = 4;
                    }
                    return coroutineSingletons;
                }
                this.this$0.f16919 = null;
                return C6008.f15084;
            }
            if (i != 3) {
                if (i == 4) {
                } else {
                    if (i != 5) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                AbstractC6017.m10769(obj);
                this.this$0.f16919 = null;
                return C6008.f15084;
            }
            z = this.Z$0;
            c1417 = (C1417) this.L$3;
            AbstractC6017.m10769(obj);
            InterfaceC1421 interfaceC142122 = this.$interactionSource;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.Z$0 = z;
            this.label = 4;
        }
        boolean zBooleanValue = ((Boolean) objMo1891).booleanValue();
        if (!interfaceC6284M11036.mo11121()) {
            C1416 c14162 = this.this$0.f16919;
            if (c14162 != null) {
                InterfaceC1421 interfaceC14213 = this.$interactionSource;
                InterfaceC1423 c14173 = zBooleanValue ? new C1417(c14162) : new C1413(c14162);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.Z$0 = zBooleanValue;
                this.I$0 = 0;
                this.label = 5;
            }
            this.this$0.f16919 = null;
            return C6008.f15084;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.Z$0 = zBooleanValue;
        this.label = 2;
        if (AbstractC6231.m11065(interfaceC6284M11036, this) != coroutineSingletons) {
            z = zBooleanValue;
            if (z) {
            }
            this.this$0.f16919 = null;
            return C6008.f15084;
        }
        return coroutineSingletons;
    }
}
