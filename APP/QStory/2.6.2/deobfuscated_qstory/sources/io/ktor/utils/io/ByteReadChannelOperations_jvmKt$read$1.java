package io.ktor.utils.io;

import androidx.activity.AbstractC0053;
import java.io.EOFException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p052.InterfaceC6557;
import p058.AbstractC6854;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", l = {182}, m = "read")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
final class ByteReadChannelOperations_jvmKt$read$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperations_jvmKt$read$1(InterfaceC4356<? super ByteReadChannelOperations_jvmKt$read$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws EOFException {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC4243.m8693(null);
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i2 = this.I$0;
        InterfaceC6557 interfaceC6557 = (InterfaceC6557) this.L$1;
        InterfaceC4251 interfaceC4251 = (InterfaceC4251) this.L$0;
        AbstractC5184.m10206(obj);
        if (interfaceC4251.mo8651() && i2 > 0) {
            StringBuilder sbM148 = AbstractC0053.m148(i2, "Not enough bytes available: required ", " but ");
            sbM148.append(AbstractC4243.m8693(interfaceC4251));
            sbM148.append(" available");
            throw new EOFException(sbM148.toString());
        }
        int iM8693 = AbstractC4243.m8693(interfaceC4251);
        C5175 c5175 = C5175.f14739;
        if (iM8693 > 0) {
            AbstractC6854.m12050(interfaceC4251.mo8653(), interfaceC6557);
        }
        return c5175;
    }
}
