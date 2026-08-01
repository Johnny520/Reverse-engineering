package io.ktor.utils.p007io;

import java.io.EOFException;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.p010io.C6309;
import kotlinx.p010io.C6311;
import p068.InterfaceC7381;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.ByteReadChannelOperationsKt", m556f = "ByteReadChannelOperations.kt", m557l = {436, 441}, m558m = "read")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 176)
final class ByteReadChannelOperationsKt$read$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$read$1(InterfaceC5189<? super ByteReadChannelOperationsKt$read$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws EOFException {
        Ref$IntRef ref$IntRef;
        C6309 c6309;
        C6311 c6311;
        Ref$IntRef ref$IntRef2;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i == 1) {
            InterfaceC7381 interfaceC7381 = (InterfaceC7381) this.L$1;
            InterfaceC5084 interfaceC5084 = (InterfaceC5084) this.L$0;
            AbstractC6017.m10769(obj);
            if (interfaceC5084.mo9200()) {
                return new Integer(-1);
            }
            Ref$IntRef ref$IntRef3 = new Ref$IntRef();
            C6309 c6309Mo11162 = interfaceC5084.mo9202().mo11162();
            if (c6309Mo11162.mo11163()) {
                C6755.m11869("Buffer is empty");
                return null;
            }
            C6311 c63112 = c6309Mo11162.f15488;
            c63112.getClass();
            byte[] bArr = c63112.f15495;
            int i2 = c63112.f15494;
            int i3 = c63112.f15493;
            Integer num = new Integer(i2);
            Integer num2 = new Integer(i3);
            this.L$0 = ref$IntRef3;
            this.L$1 = c6309Mo11162;
            this.L$2 = c63112;
            this.L$3 = ref$IntRef3;
            this.label = 2;
            Object objInvoke = interfaceC7381.invoke(bArr, num, num2, this);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$IntRef = ref$IntRef3;
            c6309 = c6309Mo11162;
            c6311 = c63112;
            obj = objInvoke;
            ref$IntRef2 = ref$IntRef;
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$IntRef = (Ref$IntRef) this.L$3;
            c6311 = (C6311) this.L$2;
            c6309 = (C6309) this.L$1;
            ref$IntRef2 = (Ref$IntRef) this.L$0;
            AbstractC6017.m10769(obj);
        }
        ref$IntRef.element = ((Number) obj).intValue();
        int i4 = ref$IntRef2.element;
        if (i4 != 0) {
            if (i4 < 0) {
                C6755.m11870("Returned negative read bytes count");
                return null;
            }
            if (i4 > c6311.m11196()) {
                C6755.m11870("Returned too many bytes");
                return null;
            }
            c6309.skip(i4);
        }
        return new Integer(ref$IntRef2.element);
    }
}
