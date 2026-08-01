package kotlinx.coroutines.channels;

import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {105}, m = "firstOrNull", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelsKt__DeprecatedKt$firstOrNull$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$firstOrNull$1(InterfaceC4357<? super ChannelsKt__DeprecatedKt$firstOrNull$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ChannelsKt__DeprecatedKt$firstOrNull$1<>(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        InterfaceC5199 interfaceC5199 = null;
        if (i2 == 0) {
            AbstractC5185.m10210(obj2);
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC5212 interfaceC5212 = (InterfaceC5212) this.L$3;
            InterfaceC5199 interfaceC51992 = (InterfaceC5199) this.L$1;
            try {
                AbstractC5185.m10210(obj2);
                if (!((Boolean) obj2).booleanValue()) {
                    interfaceC51992.mo10256(null);
                    return null;
                }
                Object objM10262 = ((C5191) interfaceC5212).m10262();
                interfaceC51992.mo10256(null);
                return objM10262;
            } catch (Throwable th2) {
                th = th2;
                interfaceC5199 = interfaceC51992;
            }
        }
        try {
            throw th;
        } catch (Throwable th3) {
            AbstractC5205.m10278(interfaceC5199, th);
            throw th3;
        }
    }
}
