package io.ktor.util.cio;

import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.InterfaceC5084;
import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.util.cio.ReadersJvmKt", m556f = "ReadersJvm.kt", m557l = {17}, m558m = "pass")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 176)
final class ReadersJvmKt$pass$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ReadersJvmKt$pass$1(InterfaceC5189<? super ReadersJvmKt$pass$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0044 -> B:14:0x0047). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ByteBuffer byteBuffer;
        InterfaceC7387 interfaceC7387;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        InterfaceC5084 interfaceC5084 = null;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            byteBuffer = null;
            interfaceC7387 = null;
            if (!interfaceC5084.mo9200()) {
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC7387 = (InterfaceC7387) this.L$2;
            ByteBuffer byteBuffer2 = (ByteBuffer) this.L$1;
            InterfaceC5084 interfaceC50842 = (InterfaceC5084) this.L$0;
            AbstractC6017.m10769(obj);
            byteBuffer = byteBuffer2;
            interfaceC5084 = interfaceC50842;
            byteBuffer.flip();
            interfaceC7387.invoke(byteBuffer);
            if (!interfaceC5084.mo9200()) {
                byteBuffer.clear();
                this.L$0 = interfaceC5084;
                this.L$1 = byteBuffer;
                this.L$2 = interfaceC7387;
                this.label = 1;
                if (AbstractC5076.m9235(interfaceC5084, byteBuffer, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                byteBuffer.flip();
                interfaceC7387.invoke(byteBuffer);
                if (!interfaceC5084.mo9200()) {
                    Throwable thMo9203 = interfaceC5084.mo9203();
                    if (thMo9203 == null) {
                        return C6008.f15084;
                    }
                    throw thMo9203;
                }
            }
        }
    }
}
