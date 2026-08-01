package kotlinx.coroutines.channels;

import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.bytebuddy.pool.TypePool;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m556f = "Deprecated.kt", m557l = {68}, m558m = "elementAt", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
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

    public ChannelsKt__DeprecatedKt$elementAt$1(InterfaceC5189<? super ChannelsKt__DeprecatedKt$elementAt$1> interfaceC5189) {
        super(interfaceC5189);
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
        Object objM10823 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        InterfaceC6031 interfaceC6031 = null;
        if (i2 == 0) {
            AbstractC6017.m10769(objM10823);
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$3;
            int i4 = this.I$2;
            int i5 = this.I$1;
            int i6 = this.I$0;
            InterfaceC6044 interfaceC6044 = (InterfaceC6044) this.L$3;
            InterfaceC6031 interfaceC60312 = (InterfaceC6031) this.L$1;
            try {
                AbstractC6017.m10769(objM10823);
                Object obj2 = interfaceC6044;
                while (((Boolean) objM10823).booleanValue()) {
                    C6023 c6023 = (C6023) obj2;
                    Object objM10821 = c6023.m10821();
                    int i7 = i3 + 1;
                    if (i6 == i3) {
                        interfaceC60312.mo10815(null);
                        return objM10821;
                    }
                    this.L$0 = null;
                    this.L$1 = interfaceC60312;
                    this.L$2 = null;
                    this.L$3 = c6023;
                    this.I$0 = i6;
                    this.I$1 = i5;
                    this.I$2 = i4;
                    this.I$3 = i7;
                    this.label = 1;
                    objM10823 = c6023.m10823(this);
                    if (objM10823 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i3 = i7;
                    obj2 = c6023;
                }
                throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i6 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            } catch (Throwable th2) {
                th = th2;
                interfaceC6031 = interfaceC60312;
            }
        }
        try {
            throw th;
        } catch (Throwable th3) {
            AbstractC6037.m10837(interfaceC6031, th);
            throw th3;
        }
    }
}
