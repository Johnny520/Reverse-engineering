package io.ktor.utils.io;

import java.io.EOFException;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.io.C5477;
import kotlinx.io.C5479;
import p052.InterfaceC6552;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {436, 441}, m = "read")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
final class ByteReadChannelOperationsKt$read$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$read$1(InterfaceC4357<? super ByteReadChannelOperationsKt$read$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws EOFException {
        Ref$IntRef ref$IntRef;
        C5477 c5477;
        C5479 c5479;
        Ref$IntRef ref$IntRef2;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i == 1) {
            InterfaceC6552 interfaceC6552 = (InterfaceC6552) this.L$1;
            InterfaceC4252 interfaceC4252 = (InterfaceC4252) this.L$0;
            AbstractC5185.m10210(obj);
            if (interfaceC4252.mo8641()) {
                return new Integer(-1);
            }
            Ref$IntRef ref$IntRef3 = new Ref$IntRef();
            C5477 c5477Mo10603 = interfaceC4252.mo8643().mo10603();
            if (c5477Mo10603.mo10604()) {
                C5925.m11310("Buffer is empty");
                return null;
            }
            C5479 c54792 = c5477Mo10603.f15143;
            c54792.getClass();
            byte[] bArr = c54792.f15150;
            int i2 = c54792.f15149;
            int i3 = c54792.f15148;
            Integer num = new Integer(i2);
            Integer num2 = new Integer(i3);
            this.L$0 = ref$IntRef3;
            this.L$1 = c5477Mo10603;
            this.L$2 = c54792;
            this.L$3 = ref$IntRef3;
            this.label = 2;
            Object objInvoke = interfaceC6552.invoke(bArr, num, num2, this);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$IntRef = ref$IntRef3;
            c5477 = c5477Mo10603;
            c5479 = c54792;
            obj = objInvoke;
            ref$IntRef2 = ref$IntRef;
        } else {
            if (i != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$IntRef = (Ref$IntRef) this.L$3;
            c5479 = (C5479) this.L$2;
            c5477 = (C5477) this.L$1;
            ref$IntRef2 = (Ref$IntRef) this.L$0;
            AbstractC5185.m10210(obj);
        }
        ref$IntRef.element = ((Number) obj).intValue();
        int i4 = ref$IntRef2.element;
        if (i4 != 0) {
            if (i4 < 0) {
                C5925.m11311("Returned negative read bytes count");
                return null;
            }
            if (i4 > c5479.m10637()) {
                C5925.m11311("Returned too many bytes");
                return null;
            }
            c5477.skip(i4);
        }
        return new Integer(ref$IntRef2.element);
    }
}
