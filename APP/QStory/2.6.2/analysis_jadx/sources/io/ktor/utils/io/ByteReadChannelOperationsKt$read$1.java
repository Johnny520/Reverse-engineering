package io.ktor.utils.io;

import java.io.EOFException;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.io.C5476;
import kotlinx.io.C5478;
import p052.InterfaceC6551;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {436, 441}, m = "read")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
final class ByteReadChannelOperationsKt$read$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$read$1(InterfaceC4356<? super ByteReadChannelOperationsKt$read$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws EOFException {
        Ref$IntRef ref$IntRef;
        C5476 c5476;
        C5478 c5478;
        Ref$IntRef ref$IntRef2;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i == 1) {
            InterfaceC6551 interfaceC6551 = (InterfaceC6551) this.L$1;
            InterfaceC4251 interfaceC4251 = (InterfaceC4251) this.L$0;
            AbstractC5184.m10206(obj);
            if (interfaceC4251.mo8651()) {
                return new Integer(-1);
            }
            Ref$IntRef ref$IntRef3 = new Ref$IntRef();
            C5476 c5476Mo10600 = interfaceC4251.mo8653().mo10600();
            if (c5476Mo10600.mo10601()) {
                C5919.m11249("Buffer is empty");
                return null;
            }
            C5478 c54782 = c5476Mo10600.f15143;
            c54782.getClass();
            byte[] bArr = c54782.f15150;
            int i2 = c54782.f15149;
            int i3 = c54782.f15148;
            Integer num = new Integer(i2);
            Integer num2 = new Integer(i3);
            this.L$0 = ref$IntRef3;
            this.L$1 = c5476Mo10600;
            this.L$2 = c54782;
            this.L$3 = ref$IntRef3;
            this.label = 2;
            Object objInvoke = interfaceC6551.invoke(bArr, num, num2, this);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$IntRef = ref$IntRef3;
            c5476 = c5476Mo10600;
            c5478 = c54782;
            obj = objInvoke;
            ref$IntRef2 = ref$IntRef;
        } else {
            if (i != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$IntRef = (Ref$IntRef) this.L$3;
            c5478 = (C5478) this.L$2;
            c5476 = (C5476) this.L$1;
            ref$IntRef2 = (Ref$IntRef) this.L$0;
            AbstractC5184.m10206(obj);
        }
        ref$IntRef.element = ((Number) obj).intValue();
        int i4 = ref$IntRef2.element;
        if (i4 != 0) {
            if (i4 < 0) {
                C5919.m11250("Returned negative read bytes count");
                return null;
            }
            if (i4 > c5478.m10633()) {
                C5919.m11250("Returned too many bytes");
                return null;
            }
            c5476.skip(i4);
        }
        return new Integer(ref$IntRef2.element);
    }
}
