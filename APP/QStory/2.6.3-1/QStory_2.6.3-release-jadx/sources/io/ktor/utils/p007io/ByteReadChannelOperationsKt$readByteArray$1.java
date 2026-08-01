package io.ktor.utils.p007io;

import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import kotlinx.p010io.InterfaceC6313;
import kotlinx.p010io.InterfaceC6316;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.ByteReadChannelOperationsKt", m556f = "ByteReadChannelOperations.kt", m557l = {189}, m558m = "readByteArray")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ByteReadChannelOperationsKt$readByteArray$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$readByteArray$1(InterfaceC5189<? super ByteReadChannelOperationsKt$readByteArray$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0051 -> B:15:0x0054). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        C6309 c6309;
        InterfaceC5084 interfaceC5084;
        InterfaceC6316 interfaceC6316;
        int i2;
        this.result = obj;
        int i3 = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            i = 0;
            c6309 = new C6309();
            interfaceC5084 = null;
            interfaceC6316 = c6309;
            i2 = (int) ((C6309) interfaceC6316).f15487;
            if (i2 < i) {
            }
        } else {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            interfaceC6316 = (InterfaceC6316) this.L$2;
            c6309 = (C6309) this.L$1;
            InterfaceC5084 interfaceC50842 = (InterfaceC5084) this.L$0;
            AbstractC6017.m10769(obj);
            AbstractC7684.m12644(interfaceC6316, (InterfaceC6313) obj);
            interfaceC5084 = interfaceC50842;
            i2 = (int) ((C6309) interfaceC6316).f15487;
            if (i2 < i) {
                this.L$0 = interfaceC5084;
                this.L$1 = c6309;
                this.L$2 = interfaceC6316;
                this.I$0 = i;
                this.label = 1;
                Object objM9229 = AbstractC5076.m9229(interfaceC5084, i - i2, this);
                if (objM9229 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC50842 = interfaceC5084;
                obj = objM9229;
                AbstractC7684.m12644(interfaceC6316, (InterfaceC6313) obj);
                interfaceC5084 = interfaceC50842;
                i2 = (int) ((C6309) interfaceC6316).f15487;
                if (i2 < i) {
                    return AbstractC6310.m11190(c6309);
                }
            }
        }
    }
}
