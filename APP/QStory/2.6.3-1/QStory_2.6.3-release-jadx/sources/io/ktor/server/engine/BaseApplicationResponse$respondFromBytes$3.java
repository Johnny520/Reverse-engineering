package io.ktor.server.engine;

import com.android.p002dx.p005io.Opcodes;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5077;
import io.ktor.utils.p007io.InterfaceC5079;
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

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.BaseApplicationResponse$respondFromBytes$3", m556f = "BaseApplicationResponse.kt", m557l = {Opcodes.REM_FLOAT_2ADDR, Opcodes.ADD_DOUBLE_2ADDR}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class BaseApplicationResponse$respondFromBytes$3 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ byte[] $bytes;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4940 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplicationResponse$respondFromBytes$3(AbstractC4940 abstractC4940, byte[] bArr, InterfaceC5189<? super BaseApplicationResponse$respondFromBytes$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC4940;
        this.$bytes = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new BaseApplicationResponse$respondFromBytes$3(this.this$0, this.$bytes, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((BaseApplicationResponse$respondFromBytes$3) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5079 interfaceC5079;
        byte[] bArr;
        Throwable th;
        InterfaceC5079 interfaceC50792;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                AbstractC4940 abstractC4940 = this.this$0;
                this.label = 1;
                obj = abstractC4940.mo9046(this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC50792 = (InterfaceC5079) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    AbstractC5076.m9225(interfaceC50792);
                    return C6008.f15084;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        AbstractC5078.m9251(interfaceC50792, th);
                        throw th;
                    } catch (Throwable th3) {
                        AbstractC5076.m9225(interfaceC50792);
                        throw th3;
                    }
                }
            }
            AbstractC6017.m10769(obj);
            this.L$0 = interfaceC5079;
            this.label = 2;
            C5077 c5077 = AbstractC5078.f13099;
            if (AbstractC5078.m9248(interfaceC5079, bArr, 0, bArr.length, this) != coroutineSingletons) {
                interfaceC50792 = interfaceC5079;
                AbstractC5076.m9225(interfaceC50792);
                return C6008.f15084;
            }
            return coroutineSingletons;
        } catch (Throwable th4) {
            th = th4;
            interfaceC50792 = interfaceC5079;
            AbstractC5078.m9251(interfaceC50792, th);
            throw th;
        }
        interfaceC5079 = (InterfaceC5079) obj;
        bArr = this.$bytes;
    }
}
