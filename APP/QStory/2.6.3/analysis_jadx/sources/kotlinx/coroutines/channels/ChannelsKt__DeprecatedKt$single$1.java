package kotlinx.coroutines.channels;

import java.util.NoSuchElementException;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {166, 169}, m = "single", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelsKt__DeprecatedKt$single$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$single$1(InterfaceC4357<? super ChannelsKt__DeprecatedKt$single$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        InterfaceC5199 interfaceC5199;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ChannelsKt__DeprecatedKt$single$1<>(this);
        }
        Object obj3 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        InterfaceC5199 interfaceC51992 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = this.I$1;
                int i4 = this.I$0;
                InterfaceC5212 interfaceC5212 = (InterfaceC5212) this.L$3;
                InterfaceC5199 interfaceC51993 = (InterfaceC5199) this.L$1;
                try {
                    AbstractC5185.m10210(obj3);
                    if (!((Boolean) obj3).booleanValue()) {
                        throw new NoSuchElementException("ReceiveChannel is empty.");
                    }
                    C5191 c5191 = (C5191) interfaceC5212;
                    Object objM10262 = c5191.m10262();
                    this.L$0 = null;
                    this.L$1 = interfaceC51993;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = objM10262;
                    this.I$0 = i4;
                    this.I$1 = i3;
                    this.label = 2;
                    Object objM10264 = c5191.m10264(this);
                    if (objM10264 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = objM10262;
                    interfaceC5199 = interfaceC51993;
                    obj3 = objM10264;
                } catch (Throwable th) {
                    th = th;
                    interfaceC51992 = interfaceC51993;
                }
            } else {
                if (i2 != 2) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$4;
                interfaceC5199 = (InterfaceC5199) this.L$1;
                try {
                    AbstractC5185.m10210(obj3);
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC51992 = interfaceC5199;
                }
            }
            if (((Boolean) obj3).booleanValue()) {
                throw new IllegalArgumentException("ReceiveChannel has more than one element.");
            }
            interfaceC5199.mo10256(null);
            return obj2;
        }
        AbstractC5185.m10210(obj3);
        try {
            throw null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            throw th;
        } catch (Throwable th4) {
            AbstractC5205.m10278(interfaceC51992, th);
            throw th4;
        }
    }
}
