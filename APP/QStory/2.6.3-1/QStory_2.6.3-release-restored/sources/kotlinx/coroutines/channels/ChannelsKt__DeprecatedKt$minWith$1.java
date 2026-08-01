package kotlinx.coroutines.channels;

import java.util.Comparator;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m556f = "Deprecated.kt", m557l = {464, 466}, m558m = "minWith", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class ChannelsKt__DeprecatedKt$minWith$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$minWith$1(InterfaceC5189<? super ChannelsKt__DeprecatedKt$minWith$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:12:0x0040, B:29:0x0098, B:31:0x00a0, B:26:0x007f), top: B:48:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0095 -> B:29:0x0098). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        Object objM10821;
        Comparator comparator;
        InterfaceC6031 interfaceC6031;
        C6023 c6023;
        Object obj2;
        C6023 c60232;
        InterfaceC6044 interfaceC6044;
        this.result = obj;
        int i3 = this.label | Integer.MIN_VALUE;
        this.label = i3;
        if ((i3 & Integer.MIN_VALUE) != 0) {
            this.label = i3 - Integer.MIN_VALUE;
        } else {
            this = new ChannelsKt__DeprecatedKt$minWith$1<>(this);
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
            InterfaceC6044 interfaceC60442 = (InterfaceC6044) this.L$4;
            InterfaceC6031 interfaceC60313 = (InterfaceC6031) this.L$2;
            Comparator comparator2 = (Comparator) this.L$1;
            try {
                AbstractC6017.m10769(objM10823);
                if (!((Boolean) objM10823).booleanValue()) {
                    interfaceC60313.mo10815(null);
                    return null;
                }
                C6023 c60233 = (C6023) interfaceC60442;
                objM10821 = c60233.m10821();
                comparator = comparator2;
                interfaceC6031 = interfaceC60313;
                c6023 = c60233;
                obj2 = objM10821;
                c60232 = c6023;
                this.L$0 = null;
                this.L$1 = comparator;
                this.L$2 = interfaceC6031;
                this.L$3 = null;
                this.L$4 = c60232;
                this.L$5 = obj2;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 2;
                objM10823 = c60232.m10823(this);
                interfaceC6044 = c60232;
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
            obj2 = this.L$5;
            InterfaceC6044 interfaceC60443 = (InterfaceC6044) this.L$4;
            interfaceC6031 = (InterfaceC6031) this.L$2;
            comparator = (Comparator) this.L$1;
            try {
                AbstractC6017.m10769(objM10823);
                interfaceC6044 = interfaceC60443;
                if (((Boolean) objM10823).booleanValue()) {
                    C6023 c60234 = (C6023) interfaceC6044;
                    objM10821 = c60234.m10821();
                    c60232 = c60234;
                    c6023 = c60234;
                    if (comparator.compare(obj2, objM10821) > 0) {
                        obj2 = objM10821;
                        c60232 = c6023;
                    }
                    this.L$0 = null;
                    this.L$1 = comparator;
                    this.L$2 = interfaceC6031;
                    this.L$3 = null;
                    this.L$4 = c60232;
                    this.L$5 = obj2;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 2;
                    objM10823 = c60232.m10823(this);
                    interfaceC6044 = c60232;
                    if (objM10823 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) objM10823).booleanValue()) {
                        interfaceC6031.mo10815(null);
                        return obj2;
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
