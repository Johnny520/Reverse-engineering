package io.ktor.utils.io;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import p094.C7204;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", l = {107}, m = "skipDelimiter")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ByteReadChannelOperations_jvmKt$skipDelimiter$2 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperations_jvmKt$skipDelimiter$2(InterfaceC4356<? super ByteReadChannelOperations_jvmKt$skipDelimiter$2> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i2 = this.I$1;
        int i3 = this.I$0;
        C7204 c7204 = (C7204) this.L$1;
        InterfaceC4251 interfaceC4251 = (InterfaceC4251) this.L$0;
        AbstractC5184.m10206(obj);
        while (((Number) obj).byteValue() == c7204.m12413(i3)) {
            i3++;
            if (i3 >= i2) {
                return C5175.f14739;
            }
            this.L$0 = interfaceC4251;
            this.L$1 = c7204;
            this.I$0 = i3;
            this.I$1 = i2;
            this.label = 1;
            obj = AbstractC4243.m8690(interfaceC4251, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        C5919.m11250("Delimiter is not found");
        return null;
    }
}
