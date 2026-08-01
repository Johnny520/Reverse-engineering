package io.ktor.utils.p007io;

import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.C6309;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.ByteReadChannelOperationsKt", m556f = "ByteReadChannelOperations.kt", m557l = {99}, m558m = "readBuffer")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ByteReadChannelOperationsKt$readBuffer$3 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$readBuffer$3(InterfaceC5189<? super ByteReadChannelOperationsKt$readBuffer$3> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003f -> B:19:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:18:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C6309 c6309;
        int i;
        this.result = obj;
        int i2 = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        InterfaceC5084 interfaceC5084 = null;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            c6309 = new C6309();
            i = 0;
            if (i > 0) {
            }
            return c6309;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.I$0;
        C6309 c63092 = (C6309) this.L$1;
        InterfaceC5084 interfaceC50842 = (InterfaceC5084) this.L$0;
        AbstractC6017.m10769(obj);
        c6309 = c63092;
        interfaceC5084 = interfaceC50842;
        long jMin = Math.min(i, AbstractC7684.m12638(interfaceC5084.mo9202()));
        interfaceC5084.mo9202().mo11160(c6309, jMin);
        i -= (int) jMin;
        if (i > 0 || interfaceC5084.mo9200()) {
            return c6309;
        }
        if (interfaceC5084.mo9202().mo11163()) {
            this.L$0 = interfaceC5084;
            this.L$1 = c6309;
            this.I$0 = i;
            this.label = 1;
            if (interfaceC5084.mo9201(1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC50842 = interfaceC5084;
            c63092 = c6309;
            c6309 = c63092;
            interfaceC5084 = interfaceC50842;
        }
        long jMin2 = Math.min(i, AbstractC7684.m12638(interfaceC5084.mo9202()));
        interfaceC5084.mo9202().mo11160(c6309, jMin2);
        i -= (int) jMin2;
        if (i > 0) {
        }
        return c6309;
    }
}
