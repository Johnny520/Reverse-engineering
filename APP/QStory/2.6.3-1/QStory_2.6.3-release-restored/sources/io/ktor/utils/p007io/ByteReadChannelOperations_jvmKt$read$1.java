package io.ktor.utils.p007io;

import androidx.activity.AbstractC0900;
import java.io.EOFException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p068.InterfaceC7387;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", m556f = "ByteReadChannelOperations.jvm.kt", m557l = {182}, m558m = "read")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 176)
final class ByteReadChannelOperations_jvmKt$read$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperations_jvmKt$read$1(InterfaceC5189<? super ByteReadChannelOperations_jvmKt$read$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws EOFException {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5076.m9242(null);
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i2 = this.I$0;
        InterfaceC7387 interfaceC7387 = (InterfaceC7387) this.L$1;
        InterfaceC5084 interfaceC5084 = (InterfaceC5084) this.L$0;
        AbstractC6017.m10769(obj);
        if (interfaceC5084.mo9200() && i2 > 0) {
            StringBuilder sbM710 = AbstractC0900.m710(i2, "Not enough bytes available: required ", " but ");
            sbM710.append(AbstractC5076.m9242(interfaceC5084));
            sbM710.append(" available");
            throw new EOFException(sbM710.toString());
        }
        int iM9242 = AbstractC5076.m9242(interfaceC5084);
        C6008 c6008 = C6008.f15084;
        if (iM9242 > 0) {
            AbstractC7684.m12637(interfaceC5084.mo9202(), interfaceC7387);
        }
        return c6008;
    }
}
