package io.ktor.utils.io;

import androidx.activity.AbstractC0053;
import java.io.EOFException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p052.InterfaceC6558;
import p058.AbstractC6855;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", l = {182}, m = "read")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
final class ByteReadChannelOperations_jvmKt$read$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperations_jvmKt$read$1(InterfaceC4357<? super ByteReadChannelOperations_jvmKt$read$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws EOFException {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AbstractC4244.m8683(null);
            throw null;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i2 = this.I$0;
        InterfaceC6558 interfaceC6558 = (InterfaceC6558) this.L$1;
        InterfaceC4252 interfaceC4252 = (InterfaceC4252) this.L$0;
        AbstractC5185.m10210(obj);
        if (interfaceC4252.mo8641() && i2 > 0) {
            StringBuilder sbM150 = AbstractC0053.m150(i2, "Not enough bytes available: required ", " but ");
            sbM150.append(AbstractC4244.m8683(interfaceC4252));
            sbM150.append(" available");
            throw new EOFException(sbM150.toString());
        }
        int iM8683 = AbstractC4244.m8683(interfaceC4252);
        C5176 c5176 = C5176.f14739;
        if (iM8683 > 0) {
            AbstractC6855.m12078(interfaceC4252.mo8643(), interfaceC6558);
        }
        return c5176;
    }
}
