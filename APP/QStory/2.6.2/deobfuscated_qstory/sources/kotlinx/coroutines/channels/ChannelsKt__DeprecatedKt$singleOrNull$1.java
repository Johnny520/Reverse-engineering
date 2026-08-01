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
@InterfaceC6861(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {179, 182}, m = "singleOrNull", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelsKt__DeprecatedKt$singleOrNull$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$singleOrNull$1(InterfaceC4356<? super ChannelsKt__DeprecatedKt$singleOrNull$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        InterfaceC5198 interfaceC5198;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ChannelsKt__DeprecatedKt$singleOrNull$1<>(this);
        }
        Object obj3 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        InterfaceC5198 interfaceC51982 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = this.I$1;
                int i4 = this.I$0;
                InterfaceC5211 interfaceC5211 = (InterfaceC5211) this.L$3;
                InterfaceC5198 interfaceC51983 = (InterfaceC5198) this.L$1;
                try {
                    AbstractC5184.m10206(obj3);
                    if (!((Boolean) obj3).booleanValue()) {
                        interfaceC51983.mo10252(null);
                        return null;
                    }
                    C5190 c5190 = (C5190) interfaceC5211;
                    Object objM10258 = c5190.m10258();
                    this.L$0 = null;
                    this.L$1 = interfaceC51983;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = objM10258;
                    this.I$0 = i4;
                    this.I$1 = i3;
                    this.label = 2;
                    Object objM10260 = c5190.m10260(this);
                    if (objM10260 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = objM10258;
                    interfaceC5198 = interfaceC51983;
                    obj3 = objM10260;
                } catch (Throwable th) {
                    th = th;
                    interfaceC51982 = interfaceC51983;
                }
            } else {
                if (i2 != 2) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$4;
                interfaceC5198 = (InterfaceC5198) this.L$1;
                try {
                    AbstractC5184.m10206(obj3);
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC51982 = interfaceC5198;
                }
            }
            if (((Boolean) obj3).booleanValue()) {
                interfaceC5198.mo10252(null);
                return null;
            }
            interfaceC5198.mo10252(null);
            return obj2;
        }
        AbstractC5184.m10206(obj3);
        try {
            throw null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            throw th;
        } catch (Throwable th4) {
            AbstractC5204.m10274(interfaceC51982, th);
            throw th4;
        }
    }
}
