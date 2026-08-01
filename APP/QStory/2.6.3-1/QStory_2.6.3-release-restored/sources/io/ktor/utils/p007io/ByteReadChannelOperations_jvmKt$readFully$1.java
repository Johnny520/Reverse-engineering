package io.ktor.utils.p007io;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.AbstractC6310;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", m556f = "ByteReadChannelOperations.jvm.kt", m557l = {118}, m558m = "readFully")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ByteReadChannelOperations_jvmKt$readFully$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperations_jvmKt$readFully$1(InterfaceC5189<? super ByteReadChannelOperations_jvmKt$readFully$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:17:0x0043). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws EOFException {
        InterfaceC5084 interfaceC5084;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ByteBuffer byteBuffer = null;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC5084 = null;
            if (!byteBuffer.hasRemaining()) {
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) this.L$1;
            InterfaceC5084 interfaceC50842 = (InterfaceC5084) this.L$0;
            AbstractC6017.m10769(obj);
            interfaceC5084 = interfaceC50842;
            byteBuffer = byteBuffer2;
            AbstractC6310.m11186(interfaceC5084.mo9202(), byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return C6008.f15084;
            }
            if (AbstractC5076.m9242(interfaceC5084) == 0) {
                this.L$0 = interfaceC5084;
                this.L$1 = byteBuffer;
                this.label = 1;
                if (interfaceC5084.mo9201(1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                byteBuffer2 = byteBuffer;
                interfaceC50842 = interfaceC5084;
                interfaceC5084 = interfaceC50842;
                byteBuffer = byteBuffer2;
            }
            AbstractC6310.m11186(interfaceC5084.mo9202(), byteBuffer);
            if (!byteBuffer.hasRemaining()) {
            }
        }
    }
}
