package io.ktor.server.engine;

import com.android.dx.io.Opcodes;
import io.ktor.utils.io.AbstractC4243;
import io.ktor.utils.io.AbstractC4245;
import io.ktor.utils.io.C4244;
import io.ktor.utils.io.InterfaceC4246;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.engine.BaseApplicationResponse$respondFromBytes$3", f = "BaseApplicationResponse.kt", l = {Opcodes.REM_FLOAT_2ADDR, Opcodes.ADD_DOUBLE_2ADDR}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class BaseApplicationResponse$respondFromBytes$3 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ byte[] $bytes;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4107 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplicationResponse$respondFromBytes$3(AbstractC4107 abstractC4107, byte[] bArr, InterfaceC4356<? super BaseApplicationResponse$respondFromBytes$3> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = abstractC4107;
        this.$bytes = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new BaseApplicationResponse$respondFromBytes$3(this.this$0, this.$bytes, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((BaseApplicationResponse$respondFromBytes$3) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC4246 interfaceC4246;
        byte[] bArr;
        Throwable th;
        InterfaceC4246 interfaceC42462;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5184.m10206(obj);
                AbstractC4107 abstractC4107 = this.this$0;
                this.label = 1;
                obj = abstractC4107.mo8497(this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC42462 = (InterfaceC4246) this.L$0;
                try {
                    AbstractC5184.m10206(obj);
                    AbstractC4243.m8676(interfaceC42462);
                    return C5175.f14739;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        AbstractC4245.m8702(interfaceC42462, th);
                        throw th;
                    } catch (Throwable th3) {
                        AbstractC4243.m8676(interfaceC42462);
                        throw th3;
                    }
                }
            }
            AbstractC5184.m10206(obj);
            this.L$0 = interfaceC4246;
            this.label = 2;
            C4244 c4244 = AbstractC4245.f12750;
            if (AbstractC4245.m8699(interfaceC4246, bArr, 0, bArr.length, this) != coroutineSingletons) {
                interfaceC42462 = interfaceC4246;
                AbstractC4243.m8676(interfaceC42462);
                return C5175.f14739;
            }
            return coroutineSingletons;
        } catch (Throwable th4) {
            th = th4;
            interfaceC42462 = interfaceC4246;
            AbstractC4245.m8702(interfaceC42462, th);
            throw th;
        }
        interfaceC4246 = (InterfaceC4246) obj;
        bArr = this.$bytes;
    }
}
