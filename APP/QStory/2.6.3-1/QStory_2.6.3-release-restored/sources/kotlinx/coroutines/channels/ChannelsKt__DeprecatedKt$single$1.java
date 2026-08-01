package kotlinx.coroutines.channels;

import java.util.NoSuchElementException;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m556f = "Deprecated.kt", m557l = {166, 169}, m558m = "single", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
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

    public ChannelsKt__DeprecatedKt$single$1(InterfaceC5189<? super ChannelsKt__DeprecatedKt$single$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        InterfaceC6031 interfaceC6031;
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
        InterfaceC6031 interfaceC60312 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = this.I$1;
                int i4 = this.I$0;
                InterfaceC6044 interfaceC6044 = (InterfaceC6044) this.L$3;
                InterfaceC6031 interfaceC60313 = (InterfaceC6031) this.L$1;
                try {
                    AbstractC6017.m10769(obj3);
                    if (!((Boolean) obj3).booleanValue()) {
                        throw new NoSuchElementException("ReceiveChannel is empty.");
                    }
                    C6023 c6023 = (C6023) interfaceC6044;
                    Object objM10821 = c6023.m10821();
                    this.L$0 = null;
                    this.L$1 = interfaceC60313;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = objM10821;
                    this.I$0 = i4;
                    this.I$1 = i3;
                    this.label = 2;
                    Object objM10823 = c6023.m10823(this);
                    if (objM10823 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = objM10821;
                    interfaceC6031 = interfaceC60313;
                    obj3 = objM10823;
                } catch (Throwable th) {
                    th = th;
                    interfaceC60312 = interfaceC60313;
                }
            } else {
                if (i2 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$4;
                interfaceC6031 = (InterfaceC6031) this.L$1;
                try {
                    AbstractC6017.m10769(obj3);
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC60312 = interfaceC6031;
                }
            }
            if (((Boolean) obj3).booleanValue()) {
                throw new IllegalArgumentException("ReceiveChannel has more than one element.");
            }
            interfaceC6031.mo10815(null);
            return obj2;
        }
        AbstractC6017.m10769(obj3);
        try {
            throw null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            throw th;
        } catch (Throwable th4) {
            AbstractC6037.m10837(interfaceC60312, th);
            throw th4;
        }
    }
}
