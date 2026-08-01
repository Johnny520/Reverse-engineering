package io.ktor.server.engine;

import com.android.dx.io.Opcodes;
import io.ktor.utils.io.AbstractC4244;
import io.ktor.utils.io.AbstractC4246;
import io.ktor.utils.io.C4245;
import io.ktor.utils.io.InterfaceC4247;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.engine.BaseApplicationResponse$respondFromBytes$3", f = "BaseApplicationResponse.kt", l = {Opcodes.REM_FLOAT_2ADDR, Opcodes.ADD_DOUBLE_2ADDR}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class BaseApplicationResponse$respondFromBytes$3 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ byte[] $bytes;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4108 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplicationResponse$respondFromBytes$3(AbstractC4108 abstractC4108, byte[] bArr, InterfaceC4357<? super BaseApplicationResponse$respondFromBytes$3> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = abstractC4108;
        this.$bytes = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new BaseApplicationResponse$respondFromBytes$3(this.this$0, this.$bytes, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((BaseApplicationResponse$respondFromBytes$3) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC4247 interfaceC4247;
        byte[] bArr;
        Throwable th;
        InterfaceC4247 interfaceC42472;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                AbstractC4108 abstractC4108 = this.this$0;
                this.label = 1;
                obj = abstractC4108.mo8487(this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC42472 = (InterfaceC4247) this.L$0;
                try {
                    AbstractC5185.m10210(obj);
                    AbstractC4244.m8666(interfaceC42472);
                    return C5176.f14739;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        AbstractC4246.m8692(interfaceC42472, th);
                        throw th;
                    } catch (Throwable th3) {
                        AbstractC4244.m8666(interfaceC42472);
                        throw th3;
                    }
                }
            }
            AbstractC5185.m10210(obj);
            this.L$0 = interfaceC4247;
            this.label = 2;
            C4245 c4245 = AbstractC4246.f12754;
            if (AbstractC4246.m8689(interfaceC4247, bArr, 0, bArr.length, this) != coroutineSingletons) {
                interfaceC42472 = interfaceC4247;
                AbstractC4244.m8666(interfaceC42472);
                return C5176.f14739;
            }
            return coroutineSingletons;
        } catch (Throwable th4) {
            th = th4;
            interfaceC42472 = interfaceC4247;
            AbstractC4246.m8692(interfaceC42472, th);
            throw th;
        }
        interfaceC4247 = (InterfaceC4247) obj;
        bArr = this.$bytes;
    }
}
