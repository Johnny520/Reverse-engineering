package kotlinx.coroutines.channels;

import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {105}, m = "firstOrNull", v = 1)
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

    public ChannelsKt__DeprecatedKt$firstOrNull$1(InterfaceC4356<? super ChannelsKt__DeprecatedKt$firstOrNull$1> interfaceC4356) {
        super(interfaceC4356);
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
        InterfaceC5198 interfaceC5198 = null;
        if (i2 == 0) {
            AbstractC5184.m10206(obj2);
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC5211 interfaceC5211 = (InterfaceC5211) this.L$3;
            InterfaceC5198 interfaceC51982 = (InterfaceC5198) this.L$1;
            try {
                AbstractC5184.m10206(obj2);
                if (!((Boolean) obj2).booleanValue()) {
                    interfaceC51982.mo10252(null);
                    return null;
                }
                Object objM10258 = ((C5190) interfaceC5211).m10258();
                interfaceC51982.mo10252(null);
                return objM10258;
            } catch (Throwable th2) {
                th = th2;
                interfaceC5198 = interfaceC51982;
            }
        }
        try {
            throw th;
        } catch (Throwable th3) {
            AbstractC5204.m10274(interfaceC5198, th);
            throw th3;
        }
    }
}
