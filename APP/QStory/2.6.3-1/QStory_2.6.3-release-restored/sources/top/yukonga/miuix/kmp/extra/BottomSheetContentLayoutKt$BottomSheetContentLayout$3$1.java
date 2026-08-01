package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C1177;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.coroutines.channels.InterfaceC6044;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContentLayout$3$1", m556f = "BottomSheetContentLayout.kt", m557l = {183, 183}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class BottomSheetContentLayoutKt$BottomSheetContentLayout$3$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1177 $dragOffsetY;
    final /* synthetic */ InterfaceC6039 $dragSnapChannel;
    float F$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetContentLayoutKt$BottomSheetContentLayout$3$1(InterfaceC6039 interfaceC6039, C1177 c1177, InterfaceC5189<? super BottomSheetContentLayoutKt$BottomSheetContentLayout$3$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$dragSnapChannel = interfaceC6039;
        this.$dragOffsetY = c1177;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new BottomSheetContentLayoutKt$BottomSheetContentLayout$3$1(this.$dragSnapChannel, this.$dragOffsetY, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((BottomSheetContentLayoutKt$BottomSheetContentLayout$3$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r4.m1591(r5, r6) == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[PHI: r1 r7
  0x003b: PHI (r1v1 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r1v12 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r1v13 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:13:0x0038, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r7v3 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x0038, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0060 -> B:7:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6044 interfaceC6044;
        InterfaceC6044 it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            it = this.$dragSnapChannel.iterator();
            this.L$0 = it;
            this.label = 1;
            C6023 c6023 = (C6023) it;
            obj = c6023.m10823(this);
            interfaceC6044 = c6023;
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC6044 interfaceC60442 = (InterfaceC6044) this.L$0;
            AbstractC6017.m10769(obj);
            InterfaceC6044 interfaceC60443 = interfaceC60442;
            it = interfaceC60443;
            this.L$0 = it;
            this.label = 1;
            C6023 c60232 = (C6023) it;
            obj = c60232.m10823(this);
            interfaceC6044 = c60232;
            if (obj != coroutineSingletons) {
                if (((Boolean) obj).booleanValue()) {
                    return C6008.f15084;
                }
                C6023 c60233 = (C6023) interfaceC6044;
                float fFloatValue = ((Number) c60233.m10821()).floatValue();
                C1177 c1177 = this.$dragOffsetY;
                Float f = new Float(fFloatValue);
                this.L$0 = c60233;
                this.F$0 = fFloatValue;
                this.label = 2;
                interfaceC60443 = c60233;
            }
            return coroutineSingletons;
        }
        InterfaceC6044 interfaceC60444 = (InterfaceC6044) this.L$0;
        AbstractC6017.m10769(obj);
        interfaceC6044 = interfaceC60444;
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
