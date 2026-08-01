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
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m556f = "Deprecated.kt", m557l = {127, 130}, m558m = "last", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class ChannelsKt__DeprecatedKt$last$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$last$1(InterfaceC5189<? super ChannelsKt__DeprecatedKt$last$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x003c, B:26:0x0088, B:28:0x0090, B:23:0x0071), top: B:44:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0085 -> B:26:0x0088). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        InterfaceC6031 interfaceC6031;
        C6023 c6023;
        Object objM10821;
        InterfaceC6044 interfaceC6044;
        this.result = obj;
        int i3 = this.label | Integer.MIN_VALUE;
        this.label = i3;
        if ((i3 & Integer.MIN_VALUE) != 0) {
            this.label = i3 - Integer.MIN_VALUE;
        } else {
            this = new ChannelsKt__DeprecatedKt$last$1<>(this);
        }
        Object objM10823 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        InterfaceC6031 interfaceC60312 = null;
        if (i4 == 0) {
            AbstractC6017.m10769(objM10823);
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else if (i4 == 1) {
            i = this.I$1;
            i2 = this.I$0;
            InterfaceC6044 interfaceC60442 = (InterfaceC6044) this.L$3;
            InterfaceC6031 interfaceC60313 = (InterfaceC6031) this.L$1;
            try {
                AbstractC6017.m10769(objM10823);
                if (!((Boolean) objM10823).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                C6023 c60232 = (C6023) interfaceC60442;
                interfaceC6031 = interfaceC60313;
                c6023 = c60232;
                objM10821 = c60232.m10821();
                this.L$0 = null;
                this.L$1 = interfaceC6031;
                this.L$2 = null;
                this.L$3 = c6023;
                this.L$4 = objM10821;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 2;
                objM10823 = c6023.m10823(this);
                interfaceC6044 = c6023;
                if (objM10823 == coroutineSingletons) {
                }
                if (((Boolean) objM10823).booleanValue()) {
                }
            } catch (Throwable th2) {
                th = th2;
                interfaceC60312 = interfaceC60313;
            }
        } else {
            if (i4 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$1;
            i2 = this.I$0;
            objM10821 = this.L$4;
            InterfaceC6044 interfaceC60443 = (InterfaceC6044) this.L$3;
            interfaceC6031 = (InterfaceC6031) this.L$1;
            try {
                AbstractC6017.m10769(objM10823);
                interfaceC6044 = interfaceC60443;
                if (((Boolean) objM10823).booleanValue()) {
                    C6023 c60233 = (C6023) interfaceC6044;
                    objM10821 = c60233.m10821();
                    c6023 = c60233;
                    this.L$0 = null;
                    this.L$1 = interfaceC6031;
                    this.L$2 = null;
                    this.L$3 = c6023;
                    this.L$4 = objM10821;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 2;
                    objM10823 = c6023.m10823(this);
                    interfaceC6044 = c6023;
                    if (objM10823 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) objM10823).booleanValue()) {
                        interfaceC6031.mo10815(null);
                        return objM10821;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC60312 = interfaceC6031;
            }
        }
        try {
            throw th;
        } catch (Throwable th4) {
            AbstractC6037.m10837(interfaceC60312, th);
            throw th4;
        }
    }
}
