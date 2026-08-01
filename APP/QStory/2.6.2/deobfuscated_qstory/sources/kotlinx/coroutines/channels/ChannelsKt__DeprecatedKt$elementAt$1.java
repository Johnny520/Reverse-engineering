package kotlinx.coroutines.channels;

import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.bytebuddy.pool.TypePool;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {68}, m = "elementAt", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelsKt__DeprecatedKt$elementAt$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$elementAt$1(InterfaceC4356<? super ChannelsKt__DeprecatedKt$elementAt$1> interfaceC4356) {
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
            this = new ChannelsKt__DeprecatedKt$elementAt$1<>(this);
        }
        Object objM10260 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        InterfaceC5198 interfaceC5198 = null;
        if (i2 == 0) {
            AbstractC5184.m10206(objM10260);
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
            int i3 = this.I$3;
            int i4 = this.I$2;
            int i5 = this.I$1;
            int i6 = this.I$0;
            InterfaceC5211 interfaceC5211 = (InterfaceC5211) this.L$3;
            InterfaceC5198 interfaceC51982 = (InterfaceC5198) this.L$1;
            try {
                AbstractC5184.m10206(objM10260);
                Object obj2 = interfaceC5211;
                while (((Boolean) objM10260).booleanValue()) {
                    C5190 c5190 = (C5190) obj2;
                    Object objM10258 = c5190.m10258();
                    int i7 = i3 + 1;
                    if (i6 == i3) {
                        interfaceC51982.mo10252(null);
                        return objM10258;
                    }
                    this.L$0 = null;
                    this.L$1 = interfaceC51982;
                    this.L$2 = null;
                    this.L$3 = c5190;
                    this.I$0 = i6;
                    this.I$1 = i5;
                    this.I$2 = i4;
                    this.I$3 = i7;
                    this.label = 1;
                    objM10260 = c5190.m10260(this);
                    if (objM10260 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i3 = i7;
                    obj2 = c5190;
                }
                throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i6 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
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
